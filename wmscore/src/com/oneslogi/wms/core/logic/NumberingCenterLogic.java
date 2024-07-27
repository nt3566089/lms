package com.oneslogi.wms.core.logic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.inject.Inject;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.cbean.MNumberingCenterCB;
import com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.logic.NumberingLogic;
import com.oneslogi.base.util.CU;

/**
 * 採番ロジック(センタ単位の採番を含む).
 */
@Transaction(Mode.BEGIN_TRANSACTION)
public class NumberingCenterLogic extends NumberingLogic {

	@Inject
	private MNumberingCenterBhv mNumberingCenterBhv;

	// [ON推-品向-965] 採番のレスポンス向上のためキャッシュ機能を追加 2015.10.13 kawana Start

	// 採番のキャッシュ
	private static Map<CashKey, MNumberingCenter> cashMap = new HashMap<CashKey, MNumberingCenter>();
	// ロック用マップ
	private static Map<CashKey, Lock> lockMap = new HashMap<CashKey, Lock>();
	// ロックマップ用ロック
	private static Lock lockForLockMap = new ReentrantLock();

	// [ON推-品向-965] 採番のレスポンス向上のためキャッシュ機能を追加 2015.10.13 kawana End

	// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana Start

	// システム採番された業務CD
	private static Set<String> systemBizCdSet = new HashSet<String>();

	/**
	 * <h2>採番(システム単位).</h2>
	 * <pre>
	 * 採番マスタの設定に従い次の値を採番し返却する
	 * </pre>
	 * @param bizCd 業務コード(採番コード)
	 * @return 採番した値
	 */
	public String getNumberingSystem(String bizCd) {
		return super.getNumbering(bizCd);
	}

	/**
	 * <h2>採番(センタ単位).</h2>
	 * <pre>
	 * センタ採番マスタの設定に従い次の値を採番し返却する
	 * </pre>
	 * @param centerId センタID
	 * @param bizCd 業務コード(採番コード)
	 * @return 採番した値
	 */
	public String getNumberingCenter(Long centerId, String bizCd) {

		// [ON推-品向-965] 採番のレスポンス向上のためキャッシュ機能を追加 2015.10.13 kawana Start

		MNumberingCenter entity = getNumberingWithSetNextPresentNumber(centerId, bizCd);

		if (entity == null) {
			return null;
		}

		// 現在値
		long value = entity.getPresentNumber();

		// [ON推-品向-965] 採番のレスポンス向上のためキャッシュ機能を追加 2015.10.13 kawana End

		//チェックデジット
		value = getCheckDigit(value, entity.getCheckDigit());

		String formatValue = String.valueOf(value);

		//パディング
		formatValue = paddingStr(formatValue, entity.getLength());

		//日付フォーマット
		formatValue = getDateString(formatValue, entity.getFixedDtFormat());

		//固定値付加
		formatValue = addFixStr(formatValue, entity.getFixedValue());

		return formatValue;
	}

	/**
	 * <h2>採番(センタ単位 or システム単位).</h2>
	 * <pre>
	 * センタ採番マスタの設定に従い次の値を採番し返却する。
	 * センタ採番マスタに定義がない場合は採番マスタを使用する。
	 * </pre>
	 * @param centerId センタID
	 * @param bizCd 業務コード(採番コード)
	 * @return 採番した値
	 */
	public String getNumbering(Long centerId, String bizCd) {

		if (systemBizCdSet.contains(bizCd)) {
			// システム採番

			return getNumberingSystem(bizCd);
		}

		// センタ採番
		String number = getNumberingCenter(centerId, bizCd);
		if (number == null) {
			// センタ採番不可

			// [#6769][OSS] センタ採番の取得に失敗した後、システム採番で失敗しても以降、システム採番しかされない問題を修正 2019.11.05 kawana Start
			// システム採番
			number = getNumberingSystem(bizCd);
			if (!CU.isNullOrEmpty(number)) {
				// システム採番で取得成功
				systemBizCdSet.add(bizCd);
			}
			return number;
			// [#6769][OSS] センタ採番の取得に失敗した後、システム採番で失敗しても以降、システム採番しかされない問題を修正 2019.11.05 kawana End
		}

		return number;
	}

	// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana End

	// [ON推-品向-979] 出庫指示の速度改善を採番キャッシュ機能で行うため速度改善前に戻す 2015.10.14(不要な処理を削除) kawana

	// [ON推-品向-965] 採番のレスポンス向上のためキャッシュ機能を追加 2015.10.13 kawana Start

	/**
	 * <h2>採番後の値を格納した採番マスタを取得.</h2>
	 * <pre>
	 * キャッシュ数が設定されている採番はクラス変数のキャッシュを使用
	 * </pre>
	 * @param centerId センタID
	 * @param bizCd 業務CD
	 * @return MNumberingCenter 採番マスタ
	 */
	private MNumberingCenter getNumberingWithSetNextPresentNumber(long centerId, String bizCd) {

		// センタID、業務CDからキャッシュするキーを生成
		CashKey key = new CashKey(centerId, bizCd);

		// センタID、業務CD毎にロック (キャッシュ有無を問わず)
		Lock lock = getLock(key);
		lock.lock();

		try {

			boolean useCash = false;

			MNumberingCenter numbering;

			// ===== 採番マスタの取得 =====

			// キャッシュ判定
			if (cashMap.containsKey(key)) {
				// キャッシュあり

				// キャッシュから取得
				numbering = cashMap.get(key);

				if (numbering.getCashCount().longValue() <= numbering.getCashUseCount().longValue()) {
					// キャッシュ使用数がキャッシュ数に達していたらDBから再取得

					numbering = selectNumbering(centerId, bizCd);
				} else {
					// キャッシュを使用

					useCash = true;
				}
			} else {
				// キャッシュなし

				// DBから取得
				numbering = selectNumbering(centerId, bizCd);
			}

			// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana Start
			if (numbering == null) {
				return null;
			}
			// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana End

			// ===== 値の計算 =====

			//最大値判定して値を計算
			long value = chkCycle(numbering.getPresentNumber() + numbering.getIncNumber(), numbering.getMinNumber(), numbering.getMaxNumber());

			// ===== 採番マスタの更新(またはキャッシュ更新) =====

			// 計算値を設定
			numbering.setPresentNumber(value);

			// キャッシュ使用判定
			if (useCash) {
				// キャッシュの場合は使用数を増やす

				numbering.setCashUseCount(numbering.getCashUseCount().longValue() + 1L);
			} else {

				long cashCount = CU.nullToZero(numbering.getCashCount());

				if (cashCount > 0) {
					// キャッシュする

					MNumberingCenter updateNumbering = numbering.clone();
					// キャッシュ使用後の値を計算
					for (long i = 0; i < cashCount; i++) {
						//最大値判定して値を計算
						long updateValue = chkCycle(updateNumbering.getPresentNumber() + updateNumbering.getIncNumber(), updateNumbering.getMinNumber(), updateNumbering.getMaxNumber());
						updateNumbering.setPresentNumber(updateValue);
					}

					// DB更新実行
					mNumberingCenterBhv.updateNonstrict(updateNumbering);

					// キャッシュマップに保存
					numbering.setCashUseCount(0L);
					cashMap.put(key, numbering);
				} else {
					// キャッシュしない

					// DB更新実行
					mNumberingCenterBhv.updateNonstrict(numbering);

					if (cashMap.containsKey(key)) {
						// キャッシュマップから削除
						cashMap.remove(key);
					}
				}
			}

			return numbering.clone();

		} finally {

			// 業務CD毎のロックを解除
			lock.unlock();
		}
	}

	/**
	 * 採番マスタの取得
	 *
	 * @param centerId センタID
	 * @param bizCd 業務CD
	 * @return MNumberingCenter DBから取得したセンタ採番マスタ
	 */
	private MNumberingCenter selectNumbering(long centerId, String bizCd) {

		// 採番値を行ロックし取得
		MNumberingCenterCB cb = mNumberingCenterBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setBizCd_Equal(bizCd);
		cb.lockForUpdate();

		// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana Start
		return mNumberingCenterBhv.selectEntity(cb);
		// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana End
	}

	/**
	 * 業務CD毎のロックを取得
	 * @param key センタID , 業務CDから生成したキー
	 * @return Lock ロック
	 */
	private Lock getLock(CashKey key) {

		lockForLockMap.lock();
		try {

			Lock resultLock;
			if (lockMap.containsKey(key)) {

				resultLock = lockMap.get(key);
			} else {

				resultLock = new ReentrantLock();
				lockMap.put(key, resultLock);
			}

			return resultLock;
		} finally {

			lockForLockMap.unlock();
		}
	}

	// キャッシュマップキー
	private static class CashKey {

		long centerId;
		String bizCd;

		public CashKey(long centerId, String bizCd) {
			this.centerId = centerId;
			this.bizCd = bizCd;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((bizCd == null) ? 0 : bizCd.hashCode());
			result = prime * result + (int) (centerId ^ (centerId >>> 32));
			return result;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CashKey other = (CashKey) obj;
			if (bizCd == null) {
				if (other.bizCd != null)
					return false;
			} else if (!bizCd.equals(other.bizCd))
				return false;
			if (centerId != other.centerId)
				return false;
			return true;
		}
	}

	// [ON推-品向-965] 採番のレスポンス向上のためキャッシュ機能を追加 2015.10.13 kawana End
}
