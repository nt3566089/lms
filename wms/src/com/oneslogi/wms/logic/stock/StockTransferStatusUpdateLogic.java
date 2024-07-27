package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫移動ステータス更新ロジッククラス
 */
public class StockTransferStatusUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private MLocationBhv mLocationBhv;

	// ===== 使用ロジッククラス =====
	// なし

	/**
	 * <h2>在庫移動指示を更新する（在庫調整［＋］時）。</h2>
	 * <pre>
	 * 在庫移動指示ヘッダ、在庫移動指示ボディの在庫移動指示ステータスを「02：完了」に更新する。
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBody 在庫移動指示ボディ：在庫移動指示ボディID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockAdjustmentPlus(TMoveInstH instHeader, TMoveInstB instBody, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// なし

		// ===== 引数チェック =====
		// instHeaderがNULLの場合
		if (instHeader == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}
		// instBodyがNULLの場合
		if (instBody == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// ===== 在庫移動指示ボディ更新[入庫] =====
		// エンティティ編集(在庫移動指示ボディの更新用データ編集)
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja Start
		//instBody.setMoveInstStatus("02");
		// 在庫移動指示ボディの更新実行
		//tMoveInstBBhv.update(instBody);
		// エンティティ編集
		TMoveInstB moveInstB = new TMoveInstB();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		moveInstB.setMoveInstStatus(CDef.MoveInstStatus.$02.code());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		// ===== 在庫移動指示ボディ更新 =====
		TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();
		// ===== 更新条件 =====
		// 在庫移動指示ヘッダId
		cb.query().setMoveInstBId_Equal(instBody.getMoveInstBId());
		// ===== 更新実行 =====
		tMoveInstBBhv.queryUpdate(moveInstB, cb);
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja End


		// ===== 在庫移動指示ヘッダ更新 =====
		// エンティティ編集(在庫移動指示ヘッダの更新用データ編集)
		instHeader.setMoveInstStatus("02");
		// 在庫移動指示ヘッダの更新実行
		tMoveInstHBhv.update(instHeader);
	}

	/**
	 * <h2>在庫移動指示を更新する（在庫調整［－］時）。</h2>
	 * <pre>
	 * 在庫移動指示ヘッダ、在庫移動指示ボディの在庫移動指示ステータスを「02：完了」に更新する。
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBody 在庫移動指示ボディ：在庫移動指示ボディID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockAdjustmentMinus(TMoveInstH instHeader, TMoveInstB instBody, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// なし

		// ===== 引数チェック =====
		// instHeaderがNULLの場合
		if (instHeader == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}
		// instBodyがNULLの場合
		if (instBody == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// ===== 在庫移動指示ボディ更新[出庫] =====
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja Start
		// エンティティ編集(在庫移動指示ボディの更新用データ編集)
		//instBody.setMoveInstStatus("02");
		// 在庫移動指示ボディの更新実行
		//tMoveInstBBhv.update(instBody);
		// エンティティ編集
		TMoveInstB moveInstB = new TMoveInstB();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		moveInstB.setMoveInstStatus(CDef.MoveInstStatus.$02.code());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		// ===== 在庫移動指示ボディ更新 =====
		TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();
		// ===== 更新条件 =====
		// 在庫移動指示ヘッダId
		cb.query().setMoveInstBId_Equal(instBody.getMoveInstBId());
		// ===== 更新実行 =====
		tMoveInstBBhv.queryUpdate(moveInstB, cb);
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja End

		// ===== 在庫移動指示ヘッダ更新 =====
		// エンティティ編集(在庫移動指示ヘッダの更新用データ編集)
		instHeader.setMoveInstStatus("02");
		// 在庫移動指示ヘッダの更新実行
		tMoveInstHBhv.update(instHeader);
	}

	/**
	 * <h2>在庫移動指示を更新する（出庫時）。</h2>
	 * <pre>
	 * 在庫移動指示ヘッダ、在庫移動指示ボディの在庫移動指示ステータスを「02：完了」に更新する。
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBody 在庫移動指示ボディ：在庫移動指示ボディID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockMoveOut(TMoveInstH instHeader, TMoveInstB instBody, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// なし

		// ===== 引数チェック =====
		// instHeaderがNULLの場合
		if (instHeader == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}
		// instBodyがNULLの場合
		if (instBody == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// ===== 在庫移動指示ボディ更新[出庫] =====
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja Start
		// エンティティ編集(在庫移動指示ボディの更新用データ編集)
		//instBody.setMoveInstStatus("02");
		// 在庫移動指示ボディの更新実行
		//tMoveInstBBhv.update(instBody);
		// エンティティ編集
		TMoveInstB moveInstB = new TMoveInstB();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		moveInstB.setMoveInstStatus(CDef.MoveInstStatus.$02.code());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		// ===== 在庫移動指示ボディ更新 =====
		TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();
		// ===== 更新条件 =====
		// 在庫移動指示ヘッダId
		cb.query().setMoveInstBId_Equal(instBody.getMoveInstBId());
		// ===== 更新実行 =====
		tMoveInstBBhv.queryUpdate(moveInstB, cb);
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja End

		// ===== 在庫移動指示ヘッダ更新 =====
		// エンティティ編集(在庫移動指示ヘッダの更新用データ編集)
		instHeader.setMoveInstStatus("01");
		// 在庫移動指示ヘッダの更新実行
		tMoveInstHBhv.update(instHeader);
	}

	/**
	 * <h2>在庫移動指示を更新する（入庫時）。</h2>
	 * <pre>
	 * 在庫移動指示ヘッダ、在庫移動指示ボディの在庫移動指示ステータスを「02：完了」に更新する。
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBody 在庫移動指示ボディ：在庫移動指示ボディID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockMoveIn(TMoveInstH instHeader, TMoveInstB instBody, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// なし

		// ===== 引数チェック =====
		// instHeaderがNULLの場合
		if (instHeader == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}
		// instBodyがNULLの場合
		if (instBody == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// ===== 在庫移動指示ボディ更新[入庫] =====
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja Start
		// エンティティ編集(在庫移動指示ボディの更新用データ編集)
		//instBody.setMoveInstStatus("02");
		// 在庫移動指示ボディの更新実行
		//tMoveInstBBhv.update(instBody);
		// エンティティ編集
		TMoveInstB moveInstB = new TMoveInstB();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		moveInstB.setMoveInstStatus(CDef.MoveInstStatus.$02.code());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End

		TMoveInstBCB tMoveInstBCBNow = tMoveInstBBhv.newMyConditionBean();
		tMoveInstBCBNow.specify().columnLocationCd();
		tMoveInstBCBNow.specify().columnStoreLabelNo();
		tMoveInstBCBNow.query().setMoveInstBId_Equal(instBody.getMoveInstBId());
		TMoveInstB tMoveInstBNow = tMoveInstBBhv.selectEntity(tMoveInstBCBNow);

		// 移動実績情報を取得
		TMoveRecordBCB tMoveRecordBCB = tMoveRecordBBhv.newMyConditionBean();
		tMoveRecordBCB.checkInvalidQuery();
		tMoveRecordBCB.specify().columnMoveRecordBId();
		tMoveRecordBCB.specify().columnLocationId();
		tMoveRecordBCB.query().setMoveInstBId_Equal(instBody.getMoveInstBId());
		tMoveRecordBCB.query().setMoveNum_GreaterThan(WCC.ZERO);
		tMoveRecordBCB.query().addOrderBy_MoveRecordBId_Asc();
		tMoveRecordBCB.fetchFirst(1);
		TMoveRecordB tMoveRecordB = tMoveRecordBBhv.selectEntity(tMoveRecordBCB);

		if (tMoveRecordB != null) {

			// 指示にロケーションCD未設定、かつ実績にロケーションIDが設定されている場合、指示側に設定
			if (CU.isNullOrEmpty(tMoveInstBNow.getLocationCd()) && tMoveRecordB.getLocationId() != null) {
				MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();
				mLocationCB.specify().columnLocationId();
				mLocationCB.specify().columnLocationCd();
				mLocationCB.query().setLocationId_Equal(tMoveRecordB.getLocationId());
				MLocation mLocation = mLocationBhv.selectEntity(mLocationCB);

				if (mLocation != null) {
					moveInstB.setLocationId(mLocation.getLocationId());
					moveInstB.setLocationCd(mLocation.getLocationCd());
				}
			}

			// 入庫ラベルNo.を在庫情報などから逆引きして設定
			TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
			tStockInoutCB.checkInvalidQuery();
			tStockInoutCB.setupSelect_TStock().withTStoreNo();
			tStockInoutCB.specify().specifyTStock().specifyTStoreNo().columnStoreLabelNo();
			tStockInoutCB.specify().specifyTStock().specifyTStoreNo().columnStoreNoId();
			tStockInoutCB.query().setMoveRecordBId_Equal(tMoveRecordB.getMoveRecordBId());
			tStockInoutCB.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
			tStockInoutCB.query().queryTStock().queryTStoreNo().addOrderBy_StoreNoId_Asc();
			tStockInoutCB.fetchFirst(1);
			TStockInout tStockInout = tStockInoutBhv.selectEntity(tStockInoutCB);

			if (tStockInout != null && tStockInout.getTStock() != null && tStockInout.getTStock().getTStoreNo() != null && !CU.isNullOrEmpty(tStockInout.getTStock().getTStoreNo().getStoreLabelNo())) {
				moveInstB.setStoreLabelNo(tStockInout.getTStock().getTStoreNo().getStoreLabelNo());
				moveInstB.setStoreNoId(tStockInout.getTStock().getTStoreNo().getStoreNoId());
			}
		}

		// ===== 在庫移動指示ボディダ更新 =====
		TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();
		// ===== 更新条件 =====
		// 在庫移動指示ヘッダId
		cb.query().setMoveInstBId_Equal(instBody.getMoveInstBId());
		// ===== 更新実行 =====
		tMoveInstBBhv.queryUpdate(moveInstB, cb);
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja End

		// ===== 在庫移動指示ヘッダ更新 =====
		// エンティティ編集(在庫移動指示ヘッダの更新用データ編集)
		instHeader.setMoveInstStatus("02");
		// 在庫移動指示ヘッダの更新実行
		tMoveInstHBhv.update(instHeader);
	}

}
