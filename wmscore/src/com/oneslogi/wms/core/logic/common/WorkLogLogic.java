package com.oneslogi.wms.core.logic.common;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.TWorkDataCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.TWorkDataBhv;
import com.oneslogi.base.dbflute.exbhv.TWorkLogBhv;
import com.oneslogi.base.dbflute.exentity.TWorkData;
import com.oneslogi.base.dbflute.exentity.TWorkLog;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 作業実績関連ロジック
 */
public class WorkLogLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TWorkDataBhv tWorkDataBhv;
	@Inject
	private TWorkLogBhv tWorkLogBhv;
	@Inject
	private MClientCenterBhv mClientCenterBhv;

	// ===== 内部変数 =====

	/** 作業実績登録種別 */
	private enum InsertType {
		/** 作業開始 */
		START,
		/** 作業開始と終了同時 */
		START_END
	}

	/** 作業実績更新種別 */
	private enum UpdateType {
		/** 作業完了 */
		END,
		/** 作業完了(結果をマージ) */
		MERGE_END
	}

	/**
	 * <h2>作業の開始.</h2>
	 * <pre>
	 * 作業開始処理を行う。
	 * 作業実績を新規登録する。
	 * 既に作業中データがある場合は強制終了し、
	 * 作業中データを削除する。
	 * </pre>
	 * @param work 作業実績データ
	 */
	public void start(TWorkLog work) {

		// 作業中の実績を強制終了
		currentLogForcedEnd(work);

		// 作業実績を新規登録
		insertNewLog(work, InsertType.START);
	}

	/**
	 * <h2>作業の完了.</h2>
	 * <pre>
	 * 作業完了処理を行う。
	 * 作業中データに紐づく作業実績を
	 * 正常終了し、数量を登録する。
	 * </pre>
	 * @param work 作業実績データ
	 */
	public void end(TWorkLog work) {

		// 作業中データを検索
		TWorkData data = selectWorkData(work);
		if (data == null) {
			// 作業中ではない
			return;
		}

		// 作業実績
		TWorkLog log = data.getTWorkLog();

		if (log.getWorkEndDt() == null) {
			// 未終了

			// 作業実績を更新(終了)
			updateEnd(log, work, UpdateType.END);
		}

		// 作業中データ削除
		tWorkDataBhv.delete(data);
	}

	/**
	 * <h2>作業の完了(結果をマージ).</h2>
	 * <pre>
	 * 作業完了処理を行う(結果をマージ)。
	 * 作業中データに紐づく作業実績を
	 * 正常終了し、数量を登録する。
	 *
	 * 作業実績が実績抽出前の場合、
	 *   既に登録された実績の数量に加算する
	 *
	 * 作業実績が実績抽出済の場合、
	 *   新規に作業実績を登録する
	 *   その際、作業実績の開始日時は前回の終了日時とする
	 *
	 * </pre>
	 * @param work 作業実績データ
	 */
	public void mergeEnd(TWorkLog work) {

		// 作業中データを検索
		TWorkData data = selectWorkData(work);
		if (data == null) {
			// 作業中ではない
			return;
		}

		// 作業実績
		TWorkLog log = data.getTWorkLog();

		if (!log.isWorkLogOutFlg$1()) {
			// 作業実績が未送信 ⇒ 結果をマージ

			// 作業実績を更新(マージ終了)
			updateEnd(log, work, UpdateType.MERGE_END);
			// 作業中数をリセット
			data.setWorkQty(null);
			tWorkDataBhv.update(data);
		} else {
			// 作業実績は送信済 ⇒ 新規ログを作成

			// 作業中データを削除
			tWorkDataBhv.delete(data);

			// 新規作業実績を登録
			insertMergeLog(log, work);
		}

		// 作業中データは消さない (作業は続けている可能性がある為)
	}

	/**
	 * <h2>作業実績の登録.</h2>
	 * <pre>
	 * 作業実績を新規登録する。
	 * 登録するデータは正常終了とし数量も登録される。
	 *
	 * 既に作業中データがある場合は強制終了し、
	 * 作業中データを削除する。
	 *
	 * </pre>
	 * @param work 作業実績データ
	 */
	public void startEnd(TWorkLog work) {

		// 作業中の実績を強制終了
		currentLogForcedEnd(work);

		// 作業実績を新規登録 (正常終了状態で登録)
		insertNewLog(work, InsertType.START_END);
	}

	/**
	 * <h2>作業中数の検索.</h2>
	 * <pre>
	 * 作業中データに紐づく作業実績を
	 * 正常終了し、数量を登録する。
	 * </pre>
	 * @param work
	 * @return
	 */
	public BigDecimal selectQty(TWorkLog work) {

		// 作業中データを検索
		TWorkData data = selectWorkData(work);
		if (data == null) {
			// 作業中ではない
			return null;
		}

		// 作業中数を返却
		return data.getWorkQty();
	}

	/**
	 * 作業中数の更新
	 * @param work 作業実績データ
	 */
	public void updateWorkData(TWorkLog work) {

		// 作業中データを検索
		TWorkData data = selectWorkData(work);
		if (data == null) {
			// 作業中ではない
			return;
		}

		// 作業中数を更新
		data.setWorkQty(work.getWorkQty());
		tWorkDataBhv.update(data);
	}

	/**
	 * 現在時刻のTimestampを取得
	 */
	private Timestamp nowTime() {
		return new Timestamp(System.currentTimeMillis());
	}

	/**
	 * 作業中のログを強制終了
	 */
	private void currentLogForcedEnd(TWorkLog work) {

		// 作業中データを検索
		TWorkData data = selectWorkData(work);
		if (data == null) {
			// 作業中ではない
			return;
		}

		// 作業実績
		TWorkLog log = data.getTWorkLog();

		if (log.getWorkEndDt() == null) {
			// 未終了

			// 作業実績を強制終了
			log.setWorkStatus_$03();
			tWorkLogBhv.update(log);
		}

		// 作業中データ削除
		tWorkDataBhv.delete(data);
	}

	/**
	 * 作業実績を新規登録
	 */
	private void insertNewLog(TWorkLog work, InsertType type) {

		final Timestamp nowTime = nowTime();

		// 作業実績を新規登録
		TWorkLog log = new TWorkLog();
		log.setClientCd(work.getClientCd());
		log.setCenterCd(work.getCenterCd());
		log.setUserCd(work.getUserCd());
		log.setWorkCd(work.getWorkCd());
		log.setWorkDt(selectWorkDt(work));
		log.setWorkStartDt(nowTime);
		log.setTraceItem(work.getTraceItem());
		log.setMacAddress(work.getMacAddress());
		log.setWorkLogOutFlg_$0();
		switch (type) {
		case START:
			log.setWorkStatus_$01();
			break;
		case START_END:
			log.setWorkStatus_$02();
			log.setWorkEndDt(nowTime);
			log.setWorkQty(work.getWorkQty());
			break;
		}

		tWorkLogBhv.insert(log);

		switch (type) {
		case START:

			// 作業中データを新規登録
			TWorkData data = new TWorkData();
			data.setUserCd(log.getUserCd());
			data.setWorkCd(log.getWorkCd());
			data.setMacAddress(log.getMacAddress());
			data.setClientCd(log.getClientCd());
			data.setCenterCd(log.getCenterCd());
			data.setWorkLogId(log.getWorkLogId());
			data.setWorkQty(work.getWorkQty()); // ※開始logには設定されていないので注意

			tWorkDataBhv.insert(data);
			break;
		case START_END:
			break;
		}
	}

	/**
	 * マージ終了用の作業実績を新規登録
	 */
	private void insertMergeLog(TWorkLog oldLog, TWorkLog work) {

		// 作業実績を新規登録
		TWorkLog log = new TWorkLog();
		// 旧実績から引継
		log.setClientCd(oldLog.getClientCd());
		log.setCenterCd(oldLog.getCenterCd());
		log.setUserCd(oldLog.getUserCd());
		log.setWorkCd(oldLog.getWorkCd());
		log.setWorkDt(oldLog.getWorkDt());
		// 旧実績の終了日時を開始日時とする
		log.setWorkStartDt(oldLog.getWorkEndDt());
		log.setWorkLogOutFlg_$0();
		log.setWorkStatus_$02();
		log.setWorkEndDt(nowTime());
		log.setTraceItem(CU.coalesce(work.getTraceItem(), oldLog.getTraceItem()));
		log.setMacAddress(work.getMacAddress());
		log.setWorkQty(work.getWorkQty());

		tWorkLogBhv.insert(log);

		// 作業中データを新規登録
		TWorkData data = new TWorkData();
		data.setUserCd(log.getUserCd());
		data.setWorkCd(log.getWorkCd());
		data.setMacAddress(log.getMacAddress());
		data.setClientCd(log.getClientCd());
		data.setCenterCd(log.getCenterCd());
		data.setWorkLogId(log.getWorkLogId());

		tWorkDataBhv.insert(data);
	}

	/**
	 * 作業実績を終了に更新する
	 */
	private void updateEnd(TWorkLog log, TWorkLog work, UpdateType type) {

		// 作業実績を正常終了
		log.setWorkStatus_$02();
		log.setWorkEndDt(nowTime());
		if (!CU.isNullOrEmpty(work.getTraceItem())) {
			log.setTraceItem(work.getTraceItem());
		}

		switch (type) {
		case END:
			log.setWorkQty(work.getWorkQty());
			break;
		case MERGE_END:
			// 数量を加算
			log.setWorkQty(WCC.add(CU.nullToZero(log.getWorkQty()), work.getWorkQty()));
			break;
		}

		tWorkLogBhv.update(log);
	}

	/**
	 * 登録されている作業実績を検索する。
	 * 登録がない場合はnullを返却。
	 */
	private TWorkData selectWorkData(TWorkLog work) {

		TWorkDataCB cb = tWorkDataBhv.newMyConditionBean();

		cb.setupSelect_TWorkLog();

		cb.checkInvalidQuery();
		if (work.getMacAddress() != null) {
			cb.query().setMacAddress_Equal(work.getMacAddress());
		}
		cb.query().setUserCd_Equal(work.getUserCd());
		cb.query().setWorkCd_Equal(work.getWorkCd());
		cb.query().setClientCd_Equal(work.getClientCd());
		cb.query().setCenterCd_Equal(work.getCenterCd());

		// 念のため(致命的エラーにはしない)
		cb.addOrderBy_PK_Desc();
		cb.fetchFirst(1);

		TWorkData workData = tWorkDataBhv.selectEntity(cb);

		return workData;
	}

	/**
	 * 作業日の取得
	 */
	private String selectWorkDt(TWorkLog work) {

		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryMClient().setClientCd_Equal(work.getClientCd());
		cb.query().queryMCenter().setCenterCd_Equal(work.getCenterCd());

		return mClientCenterBhv.selectEntityWithDeletedCheck(cb).getSystemDt();
	}
}
