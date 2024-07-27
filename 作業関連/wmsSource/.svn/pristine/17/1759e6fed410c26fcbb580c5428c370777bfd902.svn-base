package com.oneslogi.wms.core.logic.stockupdate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.CenterTransitFlg;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStockReportCB;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStockReportBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TReceiveLabel;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStockReport;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.common.ProductShapeCalcLogic;

/**
 * 在庫更新クラス
 */
public class StockUpdateLogic extends AbstractWmsLogic {

	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start

	// ===== 戻り値定義 =====

	/**
	 * 入庫[黒]戻り値クラス
	 */
	public static class ResultReceive {
		public StockUpdateStatus status;
		public String storeLabelNo;
	}

	/**
	 * 在庫更新ステータス
	 */
	public enum StockUpdateStatus {
		/** 通常 */
		NOMAL,
		/** マージ */
		MERGE,
		/** 上書き(入庫ラベル) */
		ORVER_WHITE,
		/** 新規在庫(入庫ラベル使用済のため) */
		NEW_CAUSE_USED
	}

	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End

	// ===== 使用テーブル =====
	// [セット品対応] ロットの検索、登録をクラス化(ロットテーブルを削除) 2015.11.19 kawana
	// [セット品対応] 入庫Noの検索、登録をクラス化(入庫Noテーブルを削除) 2015.11.19 kawana
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TStockReportBhv tStockReportBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	// [セット品対応] 入庫Noの検索、登録をクラス化(入庫No帳票テーブルを削除) 2015.11.19 kawana
	@Inject
	private TStoreNoBhv tStoreNoBhv;

	// ===== 使用ロジッククラス =====

	// [#1074] 在庫調整で入庫ラベルNo.指定されていてもマージ設定を優先するように変更 2017.02.27 kawana Start
	@Inject
	private StockUpdateSubStore subLogicStore;
	// [#1074] 在庫調整で入庫ラベルNo.指定されていてもマージ設定を優先するように変更 2017.02.27 kawana End
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	@Inject
	private StockSelectLogic stockLogic;
	// [セット品対応] ロットの検索、登録をクラス化 2015.11.19 kawana Start
	@Inject
	private LotManageLogic lotManageLogic;
	// [セット品対応] ロットの検索、登録をクラス化 2015.11.19 kawana End
	// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.19 kawana Start
	@Inject
	private StoreNoManageLogic storeNoManageLogic;
	// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.19 kawana End
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [C-CWMS-0049] 荷姿をピース荷姿に設定(不要な処理を削除) 2015.12.28 kawana
	@Inject
	private ProcessTypeLogic processTypeLogic;
	// [#2961] 複数荷姿対応 2017.11.09 kawana Start
	@Inject
	private ProductShapeCalcLogic productShapeLogic;

	// [#2961] 複数荷姿対応 2017.11.09 kawana End
	// [セット品対応] 入庫Noの検索、登録をクラス化(採番ロジックを削除) 2015.11.19 kawana

	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
	@Inject
	private ReceiveLabelManageLogic receiveLabelManageLogic;
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

	// ===== 内部使用 列挙型 =====
	private enum ProcessType {
		STORE_NO_DIVIDED_SRC,
		STORE_NO_DIVIDED_DST,
		FORCED_MOVE_SRC,
		FORCED_MOVE_DST
	}

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(ここから削除してStockUpdateCheckLogicに移動) enum ResStockMatchCheckを削除 2018.04.11 kawana Delete

	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start

	private enum MergeFlg {
		TRUE,
		FALSE
	}

	private enum ManageStoreDtFlg {
		TRUE,
		FALSE
	}

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(ここから削除してStockUpdateCheckLogicに移動) enum CallMethodを削除 2018.04.11 kawana Delete

	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End

	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消(戻り値を変更) 2016.10.18 kawana Start

	/**
	 * <h2>入庫［黒］。</h2>
	 * <pre>
	 * 入庫の在庫更新処理
	 * パラメータの入庫数で在庫を追加する
	 * パラメータのロット、期限日が登録されていない場合はロットを新規に登録する
	 * 入庫No.マージの設定に従って在庫を更新または新規に登録する
	 * 在庫を新規に登録する場合は入庫No.を新規に登録する
	 * 入荷ラベルを登録する（入荷ラベルNoで存在する場合は更新）
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・採番マスタ
	 *   ・在庫区分マスタ
	 *   ・倉庫マスタ
	 *   ・荷姿マスタ
	 *   ・商品荷姿マスタ
	 *   ・荷主センタマスタ
	 * 【更新または登録テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・入荷ラベル
	 * 【登録テーブル】
	 *   ・ロット
	 *   ・入庫No.
	 *   ・在庫受払
	 *
	 * 入庫No.マージ設定の確認は{@link StockUpdateCheckLogic#onsNumMergeCheck(TMoveInstH, TMoveInstB, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新チェック.入庫ＮＯマージチェックメソッド}で行う
	 *
	 * 【パラメータの使用項目】
	 *  (入荷予定ボディ)
	 *  ・商品ID
	 *  ・予定入庫ラベルNo.
	 *  ・予定数 (センタ間移動の場合に使用)
	 *  ・積送在庫受払ID (センタ間移動の場合に使用)
	 *  (入庫実績ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  ・在庫区分ID
	 *  ・仕入先ID
	 *  ・預託ID
	 *  (入庫実績ボディ)
	 *  ・入庫実績ボディID
	 *  ・処理No.
	 *  ・ロット
	 *  ・期限日
	 *  ・入庫日
	 *  ・入庫数
	 *  ・入庫格納ロケーションID
	 *  (入荷ラベル)
	 *  ・入荷ラベルID,在庫ID以外の項目
	 * </pre>
	 * @param planHeader 入荷予定ヘッダ
	 * @param planBody 入荷予定ボディ
	 * @param recordHeader 入庫実績ヘッダ
	 * @param recordBody 入庫実績ボディ
	 * @param receiveLabelList 入荷ラベルリスト
	 * @param errSts エラーステータス
	 *
	 * @return List<ResultReceive> 登録在庫の種別と入庫ラベルNoのリスト
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	public List<ResultReceive> receive(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts) {
	public List<ResultReceive> receive(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// ===== 初期処理 =====

		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		MClientCenter clientCenter = selectClientCenterWithParam(recordHeader.getClientId(), recordHeader.getCenterId());
		// システム日付取得
		String systemDt = clientCenter.getSystemDt();
		// パラメータマスタ
		MParam param = clientCenter.getMParamAsOne();
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//		// ===== パラメータチェック =====
//		if (recordBodyList.size() == 0) {
//			getErrorManager().throwException(new IllegalArgumentException());
//		}
		// ===== パラメータチェック =====
		if (recordBody == null) {
			getErrorManager().throwException(new IllegalArgumentException());
		}
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana Start
		// センタ間移動の入庫か
		boolean isCenterTransit = false;
		if (planHeader.isCenterTransitFlg$1()) {
			isCenterTransit = true;
		}

		List<TransitStockDto> transitStockList = null;
		if (isCenterTransit) {
			// センタ間移動の場合は移動元の在庫を検索する

			Long transitPickingHId = planHeader.getPickingHId();
			if (transitPickingHId == null) {
				getErrorManager().add(errSts, WmsCoreMessageConst.STORE_RESULT_CANNNOT_REGISTER_NOT_FOUND_TRANSIT_PICKING_DATA_ERROR);
				return null;
			}
			// 検索
			transitStockList = receive_selectTransitStock(transitPickingHId);
			if (transitStockList.size() == 0) {
				getErrorManager().add(errSts, WmsCoreMessageConst.STORE_RESULT_CANNNOT_REGISTER_NOT_FOUND_TRANSIT_PICKING_DATA_ERROR);
				return null;
			}
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana End

		List<ResultReceive> resultList = new ArrayList<ResultReceive>();

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Del [S]
//		// ===== recordBodyListのデータ件数分繰返 =====
//		for (TStoreRecordB recordBody : recordBodyList) {
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Del [E]

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana Start

			if (isCenterTransit) {
				// ===== センタ間移動の入庫 =====

				// 入庫の在庫キーを取得
				long clientId = recordHeader.getClientId();
				long stockTypeId = recordHeader.getStockTypeId();
				long depositId = recordHeader.getDepositId();
				long productId = planBody.getProductId();
				String lot = recordBody.getLot();
				String limitDt = recordBody.getLimitDt();
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
				String prodDt = recordBody.getProdDt();
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

				// 入庫実績の内容から移動元の在庫を探す
				List<TransitStockDto> srcTransitStockList = new ArrayList<TransitStockDto>();

				for (TransitStockDto transitStock : transitStockList) {
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//					if (transitStock.equalsStock(clientId, stockTypeId, depositId, productId, lot, limitDt)) {
					if (transitStock.equalsStock(clientId, stockTypeId, depositId, productId, lot, limitDt, prodDt)) {
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]
						srcTransitStockList.add(transitStock);
					}
				}

				// 総入庫数
				BigDecimal allStoreNum = recordBody.getStoreNum();

				// 移動元在庫の積送中数を減算しながら入庫処理を行う
				for (TransitStockDto transitStock : srcTransitStockList) {
					BigDecimal transitNum = transitStock.getLimitMinusNum();
					if (WCC.isZeroOrLess(transitNum)) {
						// 積送中の在庫なし
						continue;
					}

					// 入庫数
					BigDecimal storeNum;
					if (WCC.isLessThan(transitNum, allStoreNum)) {
						// 積送中数を入庫
						storeNum = transitNum;
					} else {
						// 総入庫数を入庫
						storeNum = allStoreNum;
					}

					// 入庫情報を移動元在庫の情報に変更
					TStoreRecordH tmpRecordHeader = recordHeader.clone();
					TStoreRecordB tmpRecordBody = recordBody.clone();
					TReceivePlanB tmpPlanBody = planBody.clone();

					tmpRecordHeader.setSupplierId(transitStock.getSupplierId());
					tmpRecordBody.setStoreDt(transitStock.getStoreDt());
					tmpRecordBody.setStoreNum(storeNum);

					// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
					// 入庫処理を実行
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//					ResultReceive resultInfo = receive(tmpRecordHeader, tmpRecordBody, tmpPlanBody, systemDt, param, errSts);
					ResultReceive resultInfo = receive(tmpRecordHeader, tmpRecordBody, tmpPlanBody, systemDt, param, receiveLabelList, errSts);
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
					// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
					if (0 < getErrorManager().size()) {
						return null;
					}
					resultList.add(resultInfo);

					// 総入庫数を減らす
					allStoreNum = WCC.subtract(allStoreNum, storeNum);
					// 処理した移動元在庫の積送中数を減算
					transitStock.minusTransitNum(storeNum);

					if (WCC.isZeroOrLess(allStoreNum)) {
						// 全て入庫したため入庫処理終了
						break;
					}
				}

				// 入庫数チェック
				if (WCC.isPositive(allStoreNum)) {
					// システム異常
					getErrorManager().throwException(new IllegalStateException("transit stock not found"));
				}

			} else {
				// ===== 通常の入庫 =====

				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//				ResultReceive resultInfo = receive(recordHeader, recordBody, planBody, systemDt, param, errSts);
				ResultReceive resultInfo = receive(recordHeader, recordBody, planBody, systemDt, param, receiveLabelList, errSts);
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
				if (0 < getErrorManager().size()) {
					return null;
				}
				resultList.add(resultInfo);
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana End
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Del [S]
//		}
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Del [E]

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana Start
		if (isCenterTransit) {
			// センタ間移動の場合は積送中在庫の変更をDB登録

			// 全て計算後に変更リストを取得する(同じ在庫を更新することがあるため)
			List<TPickingB> updatePickingBList = new ArrayList<TPickingB>();
			List<TStock> updateTransitStockList = new ArrayList<TStock>();
			for (TransitStockDto transitStock : transitStockList) {
				updatePickingBList.addAll(transitStock.getModifyPickingBList());
				updateTransitStockList.addAll(transitStock.getModifyStockList());
			}
			// DB更新実行
			tPickingBBhv.batchUpdate(updatePickingBList);
			tStockBhv.batchUpdate(updateTransitStockList);
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana End

		return resultList;
	}

//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
	/**
	 * @deprecated 旧呼び出しパラメータを使用しています。入荷ラベルが追加されたパラメータを使用してください。
	 */
	public List<ResultReceive> receive(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts) {
		getErrorManager().throwException(new IllegalArgumentException("旧呼び出しパラメータを使用しています。入荷ラベルが追加されたパラメータを使用してください。receive(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts)"));
		return null;
	}
//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]


	// [C-CWMS-0039] センタ間移動機能を追加 2015.10.02 kawana Start

	/**
	 * <h2>入庫ボディごとの入庫［黒］。</h2>
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	private ResultReceive receive(TStoreRecordH recordHeader, TStoreRecordB recordBody, TReceivePlanB planBody, String systemDt, MParam param, ErrorStatus errSts) {
	private ResultReceive receive(TStoreRecordH recordHeader, TStoreRecordB recordBody, TReceivePlanB planBody, String systemDt, MParam param,List<TReceiveLabel> receiveLabelList, ErrorStatus errSts) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// [セット品対応] ロットの検索、登録をクラス化 2015.11.19 kawana Start
		// ===== ロットの検索または登録 =====
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//		TLot lot = lotManageLogic.selectOrInsertLot(planBody.getProductId(), recordBody.getLot(), recordBody.getLimitDt());
		TLot lot = lotManageLogic.selectOrInsertLot(planBody.getProductId(), recordBody.getLot(), recordBody.getLimitDt(), recordBody.getProdDt(), recordBody.getStoreDt());
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]
		// [セット品対応] ロットの検索、登録をクラス化 2015.11.19 kawana End

		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		// ===== 入庫日設定 =====
		if (CU.isNullOrEmpty(recordBody.getStoreDt())) {
			recordBody.setStoreDt(systemDt);
		}
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

		// ===== 入庫Noマージフラグの設定 =====

		// パラメータ作成
		TMoveInstH mergeCheckH = new TMoveInstH();
		TMoveInstB mergeCheckB = new TMoveInstB();
		TMoveRecordB mergeCheckRB = new TMoveRecordB();

		mergeCheckH.setClientId(recordHeader.getClientId());
		mergeCheckH.setCenterId(recordHeader.getCenterId());
		mergeCheckB.setProductId(planBody.getProductId());
		mergeCheckRB.setLocationId(recordBody.getStoreLocationId());

		stockUpdateCheckLogic.onsNumMergeCheck(mergeCheckH, mergeCheckB, mergeCheckRB, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		MergeFlg mergeFlg = MergeFlg.FALSE;
		if (mergeCheckRB.isStoreNoMergeFlg$1()) {
			mergeFlg = MergeFlg.TRUE;
		}

		ManageStoreDtFlg manageStoreDtFlg = ManageStoreDtFlg.FALSE;
		if (param.isStoreDtFlg$1()) {
			manageStoreDtFlg = ManageStoreDtFlg.TRUE;
		}
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi Start
		// 在庫区分ID
		long stockTypeId = recordHeader.getStockTypeId();
		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi End
		// ロットID
		long lotId = lot.getLotId();

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start
		// [C-CWMS-0049] 荷姿をピース荷姿に設定 2015.12.28 kawana Start
		// 荷姿ID (ピース荷姿を設定)
		long shapeId = productShapeLogic.getPieceShapeId(planBody.getProductId());
		// [C-CWMS-0049] 荷姿をピース荷姿に設定 2015.12.28 kawana End
		// [#2961] 複数荷姿対応 2017.11.09 kawana End

		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		if (mergeFlg == MergeFlg.TRUE) {
			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
			// 入庫Noマージフラグが「マージする」の場合

			// ===== マージ先の在庫検索 =====

			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
			// ロット検索の条件
			StockSelectLotCondition.Builder lotConditionBuilder = StockSelectLotCondition.builder()
					.clientId(recordHeader.getClientId())
					.productId(planBody.getProductId())
					.stockTypeId(stockTypeId)
					.locationId(recordBody.getStoreLocationId())
					.depositId(recordHeader.getDepositId())
					.lotId(lotId)
					.shapeId(shapeId)
					.selectMerge(true)
					// [#301] 戻り値に入庫ラベルNo.が設定されない問題を修正 2016.11.22 kawana Start
					.joinStoreNo(true);
			// [#301] 戻り値に入庫ラベルNo.が設定されない問題を修正 2016.11.22 kawana End

			if (manageStoreDtFlg == ManageStoreDtFlg.TRUE) {
				// 入庫日管理有り

				lotConditionBuilder.storeDt(recordBody.getStoreDt());
			}

			TStock stock = stockLogic.selectByLot(lotConditionBuilder.build(), errSts);
			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
			if (0 < getErrorManager().size()) {
				return null;
			}

			if (stock != null) {
				// マージ先在庫が存在

				// [#3149] 入数の変更チェックを削除 2017.12.04 kawana

				// 在庫更新
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//				ResultReceive resultInfo = receive_update(stock, recordHeader, recordBody, systemDt);
				ResultReceive resultInfo = receive_update(stock, recordHeader, recordBody, systemDt, receiveLabelList);
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]



				// 処理終了
				return resultInfo;
			}
		}

		if (!CU.isNullOrEmpty(planBody.getPlanStoreLabelNo())) {
			// 入庫ラベルNo指定あり

			// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana Start

			// ===== 入庫ラベルNo使用チェック =====
			StockUpdateCheckLogic.ResStockMatchCheck matchStock = receive_checkMatchStock(planBody, recordHeader, recordBody, stockTypeId, lotId, shapeId, param.getStoreDtFlgAsStoreDtFlg());

			// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana End

			switch (matchStock) {
			case OK: // 一致
			case STOCK_NONE: // 登録なし
				break;
			case NG: // 別の在庫が使用済み
				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
				// [ON推-品向-458] 入庫ラベルNo指定の場合は在庫情報を上書き更新 2014.12.24 kawana Start

				// 新規在庫登録
				planBody.setPlanStoreLabelNo(null);
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//				ResultReceive resultInfo = receive_insert(planBody, recordHeader, recordBody, stockTypeId, lotId, shapeId, systemDt);
				ResultReceive resultInfo = receive_insert(planBody, recordHeader, recordBody, stockTypeId, lotId, shapeId, systemDt, receiveLabelList);
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
				resultInfo.status = StockUpdateStatus.NEW_CAUSE_USED;
				return resultInfo;

				// [ON推-品向-458] 入庫ラベルNo指定の場合は在庫情報を上書き更新 2014.12.24 kawana End
				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End

				// [#3149] 入数の変更チェックを削除 2017.12.04 kawana
			}

			// ===== 入庫ラベルNoで在庫を検索 =====

			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
			// [ON推-品向-437] 引当済数、移動中数のチェック追加 2014.12.16 kawana Start
			// 入庫ラベルNoで在庫検索
			TStock stock = receive_selectByStoreNo(planBody, recordHeader, recordBody, errSts, mergeFlg);
			// [ON推-品向-437] 引当済数、移動中数のチェック追加 2014.12.16 kawana End
			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
			if (0 < getErrorManager().size()) {
				return null;
			}

			if (stock != null) {
				// 同じ入庫ラベルNoの在庫が存在

				// [C-CWMS-0048] ロットが2回検索されるのを修正 2016.01.04 kawana Start
				// [ON推-品向-458] 入庫ラベルNo指定の場合は在庫情報を上書き更新 2014.12.24 kawana Start
				// 在庫更新(在庫情報上書)
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//				ResultReceive resultInfo = receive_updateOverWrite(stock, planBody, recordHeader, recordBody, stockTypeId, lotId, shapeId, systemDt);
				ResultReceive resultInfo = receive_updateOverWrite(stock, planBody, recordHeader, recordBody, stockTypeId, lotId, shapeId, systemDt, receiveLabelList);
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
				// [ON推-品向-458] 入庫ラベルNo指定の場合は在庫情報を上書き更新 2014.12.24 kawana End
				// [C-CWMS-0048] ロットが2回検索されるのを修正 2016.01.04 kawana End

				// 処理終了
				return resultInfo;
			}
		}

		// マージ先在庫、同入庫ラベルNoの在庫が未存在

		// ===== 在庫の新規登録 =====
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//		ResultReceive resultInfo = receive_insert(planBody, recordHeader, recordBody, stockTypeId, lotId, shapeId, systemDt);
		ResultReceive resultInfo = receive_insert(planBody, recordHeader, recordBody, stockTypeId, lotId, shapeId, systemDt, receiveLabelList);
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
		return resultInfo;
	}

	/**
	 * センタ間移動の移動元在庫を取得
	 */
	private List<TransitStockDto> receive_selectTransitStock(long pickingHId) {

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withTStoreNo();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		cb.query().setPickingHId_Equal(pickingHId);

		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		// 入庫日の古い在庫順に積送中を減らす
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		cb.query().queryTStock().queryTStoreNo().addOrderBy_StoreDt_Asc();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

		// 出庫ボディを検索
		List<TPickingB> pickingBodyList = tPickingBBhv.selectList(cb);

		// 同じ在庫をグループ化
		Map<TransitStockDto.StockKey, TransitStockDto> stockMap = new HashMap<TransitStockDto.StockKey, TransitStockDto>();
		for (TPickingB body : pickingBodyList) {

			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			TStock stock = body.getTStock();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			// 在庫キー作成
			long clientId = stock.getClientId();
			Long supplierId = stock.getTStoreNo().getSupplierId();
			long stockTypeId = stock.getStockTypeId();
			long depositId = stock.getDepositId();
			long productId = stock.getProductId();
			String lot = stock.getTLot().getLot();
			String limitDt = stock.getTLot().getLimitDt();
			String storeDt = stock.getTStoreNo().getStoreDt();
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
			String prodDt = stock.getTLot().getProdDt();
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//			TransitStockDto.StockKey key = TransitStockDto.createStockKey(clientId, supplierId, stockTypeId, depositId, productId, lot, limitDt, storeDt);
			TransitStockDto.StockKey key = TransitStockDto.createStockKey(clientId, supplierId, stockTypeId, depositId, productId, lot, limitDt, storeDt, prodDt);
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]

			if (stockMap.containsKey(key)) {
				// 既に在庫があるため積送中在庫に追加
				stockMap.get(key).addTransitStock(body);
			} else {
				// 新規に作成しマップに保存

				TransitStockDto transitStock = new TransitStockDto(key);
				transitStock.addTransitStock(body);
				stockMap.put(key, transitStock);
			}
		}

		// 返却リスト作成
		List<TransitStockDto> resList = new ArrayList<TransitStockDto>();
		resList.addAll(stockMap.values());

		return resList;
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.10.02 kawana End

	private StockUpdateCheckLogic.ResStockMatchCheck receive_checkMatchStock(TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody, long stockTypeId, long lotId, long shapeId,
			CDef.StoreDtFlg manageStoreDtFlg) {

		String storeLabelNo = planBody.getPlanStoreLabelNo();

		// [ON推-品向-437] 既存の入庫ラベルNo.チェックを追加 2014.12.15 kawana Start

		// 在庫情報の変更チェック
		TStock checkStock = new TStock();
		checkStock.setClientId(recordHeader.getClientId());
		checkStock.setProductId(planBody.getProductId());
		checkStock.setStockTypeId(stockTypeId);
		checkStock.setDepositId(recordHeader.getDepositId());
		checkStock.setLotId(lotId);
		checkStock.setShapeId(shapeId);
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		TStoreNo checkStoreNo = new TStoreNo();
		checkStoreNo.setSupplierId(recordHeader.getSupplierId());
		checkStoreNo.setStoreDt(recordBody.getStoreDt());
		checkStock.setTStoreNo(checkStoreNo);

		// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana Start
		// [ON推-品向-1155] 入荷実績訂正するとマージ先在庫の在庫区分などが変わってしまう問題を修正 2016.05.12 kawana Start
		// 結果判定
		return stockUpdateCheckLogic.checkMatchStock(storeLabelNo, checkStock, manageStoreDtFlg, StockUpdateCheckLogic.ExcludeZeroNumStock.TRUE);
		// [ON推-品向-1155] 入荷実績訂正するとマージ先在庫の在庫区分などが変わってしまう問題を修正 2016.05.12 kawana End
		// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana End
	}

	/**
	 * <h2>入庫[黒] 入庫ラベルNoでの在庫検索。</h2>
	 */
	private TStock receive_selectByStoreNo(TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody, ErrorStatus errSts, MergeFlg mergeFlg) {

		String storeLabelNo = planBody.getPlanStoreLabelNo();

		// 入庫ラベルNoの重複チェック
		TStockCB stockOtherLocationCb = tStockBhv.newMyConditionBean();

		stockOtherLocationCb.checkInvalidQuery();

		stockOtherLocationCb.query().queryTStoreNo().setStoreLabelNo_Equal(storeLabelNo);
		// [ON推-品向-437] 引当済数、移動中数のチェック追加 2014.12.16 kawana Start
		stockOtherLocationCb.query().setLocationId_NotEqual(recordBody.getStoreLocationId());
		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana
		stockOtherLocationCb.orScopeQuery(new OrQuery<TStockCB>() {
			public void query(TStockCB orCb) {
				//引当可能数
				orCb.query().setChargeNum_GreaterThan(WCC.ZERO);
				//引当済数
				orCb.query().setAllocNum_GreaterThan(WCC.ZERO);
				//移動中数
				orCb.query().setMoveNum_GreaterThan(WCC.ZERO);
			}
		});
		// [ON推-品向-437] 在庫数のチェック追加 2014.12.16 kawana End

		List<TStock> stockCheckList = tStockBhv.selectList(stockOtherLocationCb);

		// ===== 結果の判定 =====
		int otherStockSize = stockCheckList.size();

		// 結果確認
		if (1 <= otherStockSize) {
			// 1件以上の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
			return null;
		}

		// 登録先の在庫の取得
		TStockCB stockCb = tStockBhv.newMyConditionBean();
		stockCb.setupSelect_TStockReportAsOne();
		// [ON推-品向-458] 入庫ラベルNo指定の場合は在庫情報を上書き更新 2014.12.24 kawana Start
		stockCb.setupSelect_TStoreNo();
		// [ON推-品向-458] 入庫ラベルNo指定の場合は在庫情報を上書き更新 2014.12.24 kawana End
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		stockCb.setupSelect_MLocation();
		stockCb.specify().specifyMLocation().columnLocationCd();
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

		stockCb.checkInvalidQuery();
		stockCb.query().queryTStoreNo().setStoreLabelNo_Equal(storeLabelNo);
		stockCb.query().setLocationId_Equal(recordBody.getStoreLocationId());
		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana

		List<TStock> stockList = tStockBhv.selectList(stockCb);

		TStock stock = null;
		// ===== 結果の判定 =====
		int stockSize = stockList.size();

		// 結果確認;
		if (2 <= stockSize) {
			// 件数が2件以上の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
			return null;
		} else if (stockSize == 1) {
			// 件数が1件

			stock = stockList.get(0);

			// 在庫移動の入庫No分割を削除(在庫の移動中チェックを削除) 2016.03.11 kawana Start

			// [ON推-品向-437] 在庫数のチェック追加 2014.12.16 kawana Start
			// [ON推-品向-790] HT入庫での重複エラーを改修 2015.05.13 kawana Start
			// 引当可能数のチェック
			if (mergeFlg == MergeFlg.FALSE &&
					!recordBody.isInputType$30() &&
					// [ON推-品向-1154] マージしない商品の入庫数追加が出来ない問題を修正 2016.05.12 kawana Start
					!recordBody.isUpdateOnlyStoreNum()) {
				// [ON推-品向-1154] マージしない商品の入庫数追加が出来ない問題を修正 2016.05.12 kawana End

				// マージする場合は「全数が引当済」の場合にロット検索にHITせずにこの処理に到達する場合があるのでチェックしない
				// HTの場合は1つの入庫ラベルNo.で複数回の入庫があるためチェックしない

				// [ON推-品向-790] HT入庫での重複エラーを改修 2015.05.13 kawana End

				if ((WCC.isPositive(stock.getChargeNum())) || (WCC.isPositive(stock.getAllocNum()))) {
					// 引当可能数、引当済数が1以上の場合

					// エラー管理クラスにエラーを登録
					getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
					return null;
				}
			}
			// [ON推-品向-437] 在庫数のチェック追加 2014.12.16 kawana End

			// [ON推-品向-437] 入力内容のチェックをメソッドの先頭に移動（ここの処理は削除） 2014.12.15 kawana
		}

		return stock;
	}

	/**
	 * 入庫[黒] 在庫登録
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	private ResultReceive receive_insert(TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody, long stockTypeId, long lotId, long shapeId, String systemDt) {
	private ResultReceive receive_insert(TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody, long stockTypeId, long lotId, long shapeId, String systemDt, List<TReceiveLabel> receiveLabelList) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// ===== 入庫No.登録 =====

		TStoreNo storeNo;
		String storeLabelNo = planBody.getPlanStoreLabelNo();

		if (CU.isNullOrEmpty(storeLabelNo)) {
			// 入庫ラベルの指定がない場合

			// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.19 kawana Start

			// 入庫ラベルを採番して登録した入庫Noを取得
			storeNo = storeNoManageLogic.insertNewNumberingLabel(recordHeader.getSupplierId(), recordBody.getStoreDt(), null);

			// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.19 kawana End
		} else {

			// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.19 kawana Start

			// 検索または登録した入庫Noを取得
			storeNo = storeNoManageLogic.selectOrInsertStoreNo(storeLabelNo, recordHeader.getSupplierId(), recordBody.getStoreDt(), null);

			// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.19 kawana End
		}

		// ===== 在庫登録 =====
		TStock stock = new TStock();

		stock.setClientId(recordHeader.getClientId());
		stock.setWarehouseId(getWarehouseId(recordBody.getStoreLocationId()));
		stock.setProductId(planBody.getProductId());
		stock.setStockTypeId(stockTypeId);
		stock.setLocationId(recordBody.getStoreLocationId());
		stock.setDepositId(recordHeader.getDepositId());
		stock.setLotId(lotId);
		stock.setShapeId(shapeId);
		stock.setStoreNoId(storeNo.getStoreNoId());
		// [#3149] 入数の設定を削除 2017.12.04 kawana
		stock.setChargeNum(recordBody.getStoreNum());

		tStockBhv.insert(stock);

		// ===== 在庫日報登録 =====
		TStockReport stockReport = new TStockReport();

		stockReport.setStockId(stock.getStockId());
		stockReport.setStoreNumDay(recordBody.getStoreNum());
		stockReport.setStoreNumMonth(recordBody.getStoreNum());
		// [1.1.4-CT-032] 入庫日を変更しても最新入庫日が変わらない問題を修正 2016.05.17 kawana Start
		stockReport.setLastStoreDt(getNewDt(stockReport.getLastStoreDt(), recordBody.getStoreDt()));
		// [1.1.4-CT-032] 入庫日を変更しても最新入庫日が変わらない問題を修正 2016.05.17 kawana End

		tStockReportBhv.insert(stockReport);

		// ===== 在庫受払登録 =====
		receive_insertInout(stock.getStockId(), recordHeader, recordBody, systemDt);

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		String locationCd;

		if (recordBody.getMLocation() != null) {
			locationCd = recordBody.getMLocation().getLocationCd();
		} else {
			MLocation mLocation = new MLocation();
			mLocation.setLocationId(recordBody.getStoreLocationId());
			mLocation = locationLogic.getPkEntityWithDeletedCheck(mLocation);
			locationCd = mLocation.getLocationCd();
		}
		// 入荷ラベル情報を登録する。
		receiveLabelManageLogic.InsertOrUpdateLabel(receiveLabelList, stock.getStockId(), locationCd);
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]



		ResultReceive resultInfo = new ResultReceive();
		resultInfo.status = StockUpdateStatus.NOMAL;
		resultInfo.storeLabelNo = storeNo.getStoreLabelNo();
		return resultInfo;
	}

	/**
	 * 入庫[黒] 在庫更新
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	private ResultReceive receive_update(TStock stock, TStoreRecordH recordHeader, TStoreRecordB recordBody, String systemDt) {
	private ResultReceive receive_update(TStock stock, TStoreRecordH recordHeader, TStoreRecordB recordBody, String systemDt, List<TReceiveLabel> receiveLabelList) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
		// ===== 在庫更新 =====
		stock.setChargeNum(WCC.add(stock.getChargeNum(), recordBody.getStoreNum()));

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setStoreNumDay(WCC.add(stockReport.getStoreNumDay(), recordBody.getStoreNum()));
		stockReport.setStoreNumMonth(WCC.add(stockReport.getStoreNumMonth(), recordBody.getStoreNum()));
		// [1.1.4-CT-032] 入庫日を変更しても最新入庫日が変わらない問題を修正 2016.05.17 kawana Start
		stockReport.setLastStoreDt(getNewDt(stockReport.getLastStoreDt(), recordBody.getStoreDt()));
		// [1.1.4-CT-032] 入庫日を変更しても最新入庫日が変わらない問題を修正 2016.05.17 kawana End

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		receive_insertInout(stock.getStockId(), recordHeader, recordBody, systemDt);

		ResultReceive resultInfo = new ResultReceive();
		resultInfo.status = StockUpdateStatus.MERGE;
		resultInfo.storeLabelNo = stock.chaseTStoreNo().getStoreLabelNo();

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		// 入荷ラベル情報を登録する。
		receiveLabelManageLogic.InsertOrUpdateLabel(receiveLabelList, stock.getStockId(), stock.getMLocation().getLocationCd());
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

		return resultInfo;
	}

	// [ON推-品向-458] 入庫ラベルNo指定の場合は在庫情報を上書き更新 2014.12.24 kawana Start
	/**
	 * 入庫[黒] 在庫更新(在庫情報上書き)
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	private ResultReceive receive_updateOverWrite(TStock stock, TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody, long stockTypeId, long lotId, long shapeId,
//			String systemDt) {
	private ResultReceive receive_updateOverWrite(TStock stock, TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody, long stockTypeId, long lotId, long shapeId,
			String systemDt, List<TReceiveLabel> receiveLabelList) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// ===== 入庫ラベルNo.更新 =====
		// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.19 kawana Start
		storeNoManageLogic.updateOverWrite(stock.getTStoreNo(), recordHeader.getSupplierId(), recordBody.getStoreDt());
		// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.19 kawana End

		// [C-CWMS-0048] ロットが2回検索されるのを修正(不要になった処理を削除) 2016.01.04 kawana

		// ===== 在庫更新 =====

		stock.setClientId(recordHeader.getClientId());
		stock.setWarehouseId(getWarehouseId(recordBody.getStoreLocationId()));
		stock.setProductId(planBody.getProductId());
		stock.setStockTypeId(stockTypeId);
		stock.setLocationId(recordBody.getStoreLocationId());
		stock.setDepositId(recordHeader.getDepositId());
		// [C-CWMS-0048] ロットが2回検索されるのを修正 2016.01.04 kawana Start
		stock.setLotId(lotId);
		// [C-CWMS-0048] ロットが2回検索されるのを修正 2016.01.04 kawana End
		stock.setShapeId(shapeId);
		// [#3149] 入数の設定を削除 2017.12.04 kawana
		stock.setChargeNum(WCC.add(stock.getChargeNum(), recordBody.getStoreNum()));

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setStoreNumDay(WCC.add(stockReport.getStoreNumDay(), recordBody.getStoreNum()));
		stockReport.setStoreNumMonth(WCC.add(stockReport.getStoreNumMonth(), recordBody.getStoreNum()));
		// [1.1.4-CT-032] 入庫日を変更しても最新入庫日が変わらない問題を修正 2016.05.17 kawana Start
		stockReport.setLastStoreDt(getNewDt(stockReport.getLastStoreDt(), recordBody.getStoreDt()));
		// [1.1.4-CT-032] 入庫日を変更しても最新入庫日が変わらない問題を修正 2016.05.17 kawana End

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		receive_insertInout(stock.getStockId(), recordHeader, recordBody, systemDt);
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		// 入荷ラベル情報を登録する。
		receiveLabelManageLogic.InsertOrUpdateLabel(receiveLabelList, stock.getStockId(), stock.getMLocation().getLocationCd());
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]
		ResultReceive resultInfo = new ResultReceive();
		resultInfo.status = StockUpdateStatus.ORVER_WHITE;
		resultInfo.storeLabelNo = stock.getTStoreNo().getStoreLabelNo();
		return resultInfo;
	}

	// [ON推-品向-458] 入庫ラベルNo指定の場合は在庫情報を上書き更新 2014.12.24 kawana End

	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消(戻り値を変更) 2016.10.18 kawana End

	/**
	 * 入庫[黒] 在庫受払登録
	 */
	private void receive_insertInout(long stockId, TStoreRecordH recordHeader, TStoreRecordB recordBody, String systemDt) {
		TStockInout stockInout = new TStockInout();

		stockInout.setStoreRecordBId(recordBody.getStoreRecordBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(recordHeader.getProcessTypeId());
		stockInout.setProcessNo(recordBody.getProcessNo());
		stockInout.setCorrectType_$0();
		stockInout.setStockId(stockId);
		stockInout.setInoutType_$0();
		stockInout.setStockInoutNum(recordBody.getStoreNum());

		tStockInoutBhv.insert(stockInout);
	}

	/**
	 * <h2>入庫［赤］。</h2>
	 * <pre>
	 * 入庫キャンセルの在庫更新処理
	 * パラメータの入庫実績ヘッダIDから過去の入庫数（在庫受払）を取得し、在庫を削減する
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 *   ・在庫日報
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (入庫実績ヘッダ)
	 *  ・入庫実績ヘッダID
	 *  ・荷主ID
	 *  ・センタID
	 * </pre>
	 * @param planBody 入荷予定ボディ
	 * @param recordHeader 入庫実績ヘッダ
	 * @param recordBodyList 入庫実績ボディリスト
	 * @param errSts エラーステータス
	 */
	public void receiveCancel(TReceivePlanB planBody, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// システム日付取得
		String systemDt = getSytemDt(recordHeader.getClientId(), recordHeader.getCenterId());

		// ===== 在庫受払の検索 =====
		TStockInoutCB inoutCb = tStockInoutBhv.newMyConditionBean();
		inoutCb.setupSelect_TStock().withTStockReportAsOne();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana Start
		inoutCb.setupSelect_TStock().withTLot();
		inoutCb.setupSelect_TStoreRecordB().withTStoreRecordH().withTReceivePlanH();
		inoutCb.checkInvalidQuery();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana End
		inoutCb.query().queryTStoreRecordB().setStoreRecordHId_Equal(recordHeader.getStoreRecordHId());
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
		inoutCb.addOrderBy_PK_Asc();
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

		List<TStockInout> inoutList = tStockInoutBhv.selectList(inoutCb);
		if (inoutList.size() == 0) {
			// 在庫受払のデータ件数が0件
			return;
		}

		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

		// 入庫ボディID、在庫IDで在庫をまとめる
		List<TStockInout> summaryInoutList = receiveCancel_getSummaryInoutList(inoutList);

		// 入庫[赤]処理
		receiveCancel(summaryInoutList, recordBodyList, systemDt, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

	/**
	 * <h2>入庫［赤］(入庫実績ボディ単位)。</h2>
	 * <pre>
	 * 入庫キャンセルの在庫更新処理
	 * パラメータの入庫実績ボディIDから過去の入庫数（在庫受払）を取得し、在庫を削減する
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 *   ・在庫日報
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (入庫実績ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 * </pre>
	 * @param recordHeader 入庫実績ヘッダ
	 * @param recordBodyList 入庫実績ボディリスト
	 * @param errSts エラーステータス
	 */
	public void receiveCancelBody(TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// システム日付取得
		String systemDt = getSytemDt(recordHeader.getClientId(), recordHeader.getCenterId());

		// ===== 在庫受払の検索 =====

		List<Long> bodyIdList = new ArrayList<Long>();
		for (TStoreRecordB body : recordBodyList) {
			if (body.getStoreRecordBId() != null) {
				bodyIdList.add(body.getStoreRecordBId());
			}
		}

		TStockInoutCB inoutCb = tStockInoutBhv.newMyConditionBean();
		inoutCb.setupSelect_TStock().withTStockReportAsOne();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana Start
		inoutCb.setupSelect_TStock().withTLot();
		inoutCb.setupSelect_TStoreRecordB().withTStoreRecordH().withTReceivePlanH();
		inoutCb.checkInvalidQuery();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana End
		inoutCb.query().setStoreRecordBId_InScope(bodyIdList);
		inoutCb.addOrderBy_PK_Asc();

		List<TStockInout> inoutList = tStockInoutBhv.selectList(inoutCb);
		if (inoutList.size() == 0) {
			// 在庫受払なし
			return;
		}

		// 入庫ボディID、在庫IDで在庫をまとめる
		List<TStockInout> summaryInoutList = receiveCancel_getSummaryInoutList(inoutList);

		// 入庫[赤]処理
		receiveCancel(summaryInoutList, recordBodyList, systemDt, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	// [ON推-品向-1154] 入荷実績訂正にてマージしない商品が追加できない 2016.05.12 kawana Start
	/**
	 * <h2>入庫［黒］(入庫数のプラス)。</h2>
	 * <pre>
	 * 入庫の在庫更新処理
	 * パラメータの入庫ラベルNoの在庫に在庫を追加する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・採番マスタ
	 *   ・在庫区分マスタ
	 *   ・倉庫マスタ
	 *   ・荷姿マスタ
	 *   ・商品荷姿マスタ
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (入荷予定ボディ)
	 *  ・商品ID
	 *  ・予定入庫ラベルNo.
	 *  ・予定数 (センタ間移動の場合に使用)
	 *  ・積送在庫受払ID (センタ間移動の場合に使用)
	 *  (入庫実績ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  ・在庫区分ID
	 *  ・仕入先ID
	 *  ・預託ID
	 *  (入庫実績ボディ)
	 *  ・入庫実績ボディID
	 *  ・処理No.
	 *  ・ロット
	 *  ・期限日
	 *  ・入庫日
	 *  ・入庫数
	 *  ・入庫格納ロケーションID
	 * </pre>
	 * @param planHeader 入荷予定ヘッダ
	 * @param planBody 入荷予定ボディ
	 * @param recordHeader 入庫実績ヘッダ
	 * @param recordBodyList 入庫実績ボディリスト
	 * @param errSts エラーステータス
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	public void receivePlusBody(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts) {
//
//		for (TStoreRecordB recordBody : recordBodyList) {
//			recordBody.setUpdateOnlyStoreNum(true);
//		}
//
//		receive(planHeader, planBody, recordHeader, recordBodyList, errSts);
//	}
	public void receivePlusBody(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody ,List<TReceiveLabel> receiveLabelList, ErrorStatus errSts) {

		recordBody.setUpdateOnlyStoreNum(true);
		receive(planHeader, planBody, recordHeader, recordBody, receiveLabelList, errSts);
	}
	/**
	 * @deprecated 旧呼び出しパラメータを使用しています。入荷ラベルが追加されたパラメータを使用してください。receivePlusBody(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody ,List<TReceiveLabel> receiveLabelList, ErrorStatus errSts)
	 */
	public void receivePlusBody(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts) {
		getErrorManager().throwException(new IllegalArgumentException("旧呼び出しパラメータを使用しています。入荷ラベルが追加されたパラメータを使用してください。receivePlusBody(TReceivePlanH planHeader, TReceivePlanB planBody, TStoreRecordH recordHeader, TStoreRecordB recordBody ,List<TReceiveLabel> receiveLabelList, ErrorStatus errSts)"));
	}
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

	// [ON推-品向-1154] 入荷実績訂正にてマージしない商品が追加できない 2016.05.12 kawana End

	/**
	 * <h2>入庫［赤］(入庫数のマイナス)。</h2>
	 * <pre>
	 * 入庫数のマイナスする在庫更新処理
	 * パラメータの入庫実績ボディIDから過去の入庫数（在庫受払）を取得し、在庫を削減する
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 *   ・在庫日報
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (入庫実績ヘッダ)
	 *  ・入庫実績ヘッダID
	 *  ・荷主ID
	 *  ・センタID
	 * </pre>
	 * @param recordHeader 入庫実績ヘッダ
	 * @param recordBodyList 入庫実績ボディリスト
	 * @param errSts エラーステータス
	 */
	public void receiveMinusBody(TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// システム日付取得
		String systemDt = getSytemDt(recordHeader.getClientId(), recordHeader.getCenterId());

		// ===== 在庫受払の検索 =====

		List<Long> bodyIdList = new ArrayList<Long>();
		for (TStoreRecordB body : recordBodyList) {
			if (body.getStoreRecordBId() != null) {
				bodyIdList.add(body.getStoreRecordBId());
			}
		}

		TStockInoutCB inoutCb = tStockInoutBhv.newMyConditionBean();
		inoutCb.setupSelect_TStock().withTStockReportAsOne();
		inoutCb.setupSelect_TStock().withTLot();
		inoutCb.setupSelect_TStoreRecordB().withTStoreRecordH().withTReceivePlanH();
		inoutCb.checkInvalidQuery();
		inoutCb.query().setStoreRecordBId_InScope(bodyIdList);
		inoutCb.addOrderBy_PK_Asc();

		List<TStockInout> inoutList = tStockInoutBhv.selectList(inoutCb);
		if (inoutList.size() == 0) {
			// 在庫受払のデータ件数が0件

			getErrorManager().throwException(new IllegalStateException());
		}

		// 入庫ボディID、在庫IDで在庫をまとめる
		List<TStockInout> summaryInoutList = receiveCancel_getSummaryInoutList(inoutList);

		// ===== マイナスする入庫数を設定 =====

		// 受払数にパラメータの入庫ボディ.入庫数を設定する
		Map<Long, TStoreRecordB> recordBodyMap = new HashMap<Long, TStoreRecordB>();
		for (TStoreRecordB body : recordBodyList) {
			recordBodyMap.put(body.getStoreRecordBId(), body);
		}

		for (TStockInout inout : summaryInoutList) {
			// [1.1.4-CT-004] 入庫実績ボディ1行に複数の在庫が登録されていた場合(状態不正)の時に動作してしまう問題を修正 2016.05.11 kawana Start
			// 在庫受払に設定した入庫ボディは削除(状態不正で2回処理されるのを防止)
			TStoreRecordB recordBod = recordBodyMap.remove(inout.getStoreRecordBId());
			// [1.1.4-CT-004] 入庫実績ボディ1行に複数の在庫が登録されていた場合(状態不正)の時に動作してしまう問題を修正 2016.05.11 kawana End
			inout.setStockInoutNum(recordBod.getStoreNum());
		}

		// ===== 入庫[赤]処理 =====
		receiveCancel(summaryInoutList, recordBodyList, systemDt, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

	/**
	 * <h2>入庫［赤］。</h2>
	 * <pre>
	 * 入庫キャンセルの在庫更新処理
	 * 在庫受払から過去の入庫数（在庫受払）を取得し、在庫を削減する
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 *   ・在庫日報
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 * </pre>
	 *
	 * @param inoutList 在庫受払リスト
	 * @param systemDt システム日付
	 * @param errSts エラーステータス
	 */
	private void receiveCancel(List<TStockInout> inoutList, List<TStoreRecordB> recordBodyList, String systemDt, ErrorStatus errSts) {

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana Start
		// センタ間移動の入庫か
		boolean isCenterTransit = false;
		TReceivePlanH receivePlanH = inoutList.get(0).getTStoreRecordB().getTStoreRecordH().getTReceivePlanH();
		if (receivePlanH.isCenterTransitFlg$1()) {
			isCenterTransit = true;
		}

		List<TransitStockDto> transitStockList = null;
		if (isCenterTransit) {
			// センタ間移動の場合は移動元の在庫を検索する

			Long transitPickingHId = receivePlanH.getPickingHId();
			if (transitPickingHId == null) {
				getErrorManager().add(errSts, WmsCoreMessageConst.STORE_RESULT_CANNNOT_REGISTER_NOT_FOUND_TRANSIT_PICKING_DATA_ERROR);
				return;
			}
			// 検索
			transitStockList = receive_selectTransitStock(transitPickingHId);
			if (transitStockList.size() == 0) {
				getErrorManager().add(errSts, WmsCoreMessageConst.STORE_RESULT_CANNNOT_REGISTER_NOT_FOUND_TRANSIT_PICKING_DATA_ERROR);
				return;
			}
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana End

		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

		// 入庫実績ボディのマップを作成(キー：入庫実績ボディID)
		Map<Long, TStoreRecordB> recordBodyMap = new HashMap<Long, TStoreRecordB>();
		for (TStoreRecordB body : recordBodyList) {
			recordBodyMap.put(body.getStoreRecordBId(), body);
		}

		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

		// ===== 在庫受払の件数分繰返 =====
		for (TStockInout inout : inoutList) {

			// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

			// ===== 受払数のチェック =====
			BigDecimal inoutNum = inout.getStockInoutNum();
			if (WCC.isNegative(inoutNum)) {
				getErrorManager().throwException(new IllegalStateException("inoutNum is minus."));
			}

			if (WCC.isZero(inoutNum)) {
				// 受払数が0のためスキップ
				continue;
			}

			// ===== 在庫更新 =====
			TStoreRecordB recordBod = recordBodyMap.get(inout.getStoreRecordBId());
			receiveCancel_update(inout, recordBod, systemDt, errSts);
			// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
			if (0 < getErrorManager().size()) {

				return;
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana Start
			if (isCenterTransit) {
				// センタ間移動の場合は、移動元在庫の積送中数を加算する

				TStock stock = inout.getTStock();

				// 入庫の在庫キーを取得
				long clientId = stock.getClientId();
				long stockTypeId = stock.getStockTypeId();
				long depositId = stock.getDepositId();
				long productId = stock.getProductId();
				String lot = stock.getTLot().getLot();
				String limitDt = stock.getTLot().getLimitDt();
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
				String prodDt = stock.getTLot().getProdDt();
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

				// 入庫在庫の内容から移動元の在庫を探す
				List<TransitStockDto> srcTransitStockList = new ArrayList<TransitStockDto>();
				for (TransitStockDto transitStock : transitStockList) {
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//					if (transitStock.equalsStock(clientId, stockTypeId, depositId, productId, lot, limitDt)) {
					if (transitStock.equalsStock(clientId, stockTypeId, depositId, productId, lot, limitDt, prodDt)) {
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]
						srcTransitStockList.add(transitStock);
					}
				}

				// 総入庫キャンセル数
				BigDecimal allStoreCancelNum = inout.getStockInoutNum();

				// 総入庫キャンセル数を減らしながら積送中数を加算していく
				for (TransitStockDto transitStock : srcTransitStockList) {
					BigDecimal limitNum = transitStock.getLimitPlusNum();
					if (WCC.isZeroOrLess(limitNum)) {
						// 上限まで達しているためスキップ
						continue;
					}

					// 入庫キャンセル数
					BigDecimal storeCancelNum;
					if (WCC.isLessThan(limitNum, allStoreCancelNum)) {
						// 上限数を入庫キャンセル
						storeCancelNum = limitNum;
					} else {
						// 総入庫数を入庫キャンセル
						storeCancelNum = allStoreCancelNum;
					}

					// 総入庫キャンセル数を減らす
					allStoreCancelNum = WCC.subtract(allStoreCancelNum, storeCancelNum);
					// 移動元在庫の積送中数を加算
					transitStock.plusTransitNum(storeCancelNum);

					if (WCC.isZeroOrLess(allStoreCancelNum)) {
						// 全て入庫キャンセルしたため入庫処理終了
						break;
					}
				}

				// 入庫キャンセル数チェック
				if (WCC.isPositive(allStoreCancelNum)) {
					// システム異常
					getErrorManager().throwException(new IllegalStateException("transit stock not found"));
				}
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana End
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana Start
		if (isCenterTransit) {
			// センタ間移動の場合は積送中在庫の変更をDB登録

			// 全て計算後に変更リストを取得する(同じ在庫を更新することがあるため)
			List<TPickingB> updatePickingBList = new ArrayList<TPickingB>();
			List<TStock> updateTransitStockList = new ArrayList<TStock>();
			for (TransitStockDto transitStock : transitStockList) {
				updatePickingBList.addAll(transitStock.getModifyPickingBList());
				updateTransitStockList.addAll(transitStock.getModifyStockList());
			}
			// DB更新実行
			tPickingBBhv.batchUpdate(updatePickingBList);
			tStockBhv.batchUpdate(updateTransitStockList);
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.14 kawana End
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

	/**
	 * 在庫受払を入庫実績ボディID、在庫ID単位で合計し受払数に設定する
	 * また、初回在庫受払ID、前回在庫受払IDを設定する
	 *
	 * @param inoutList 在庫受払リスト
	 * @return 合計した在庫受払リスト
	 */
	private List<TStockInout> receiveCancel_getSummaryInoutList(List<TStockInout> inoutList) {

		// ===== 入庫実績ボディIDでまとめる =====

		Map<Long, List<TStockInout>> bodyInoutListMap = new HashMap<Long, List<TStockInout>>();
		for (TStockInout inout : inoutList) {
			long storeBodyId = inout.getStoreRecordBId();

			List<TStockInout> list;
			if (bodyInoutListMap.containsKey(storeBodyId)) {
				list = bodyInoutListMap.get(storeBodyId);
			} else {
				list = new ArrayList<TStockInout>();
				bodyInoutListMap.put(storeBodyId, list);
			}

			list.add(inout);
		}

		List<TStockInout> summaryInoutList = new ArrayList<TStockInout>();

		// ===== 在庫IDでまとめる =====
		for (List<TStockInout> bodyInoutList : bodyInoutListMap.values()) {

			Map<Long, TStockInout> stockInoutMap = new HashMap<Long, TStockInout>();
			for (TStockInout inout : bodyInoutList) {
				long stockId = inout.getStockId();

				TStockInout stockInout;
				BigDecimal inoutNum = WCC.ZERO;
				if (stockInoutMap.containsKey(stockId)) {
					stockInout = stockInoutMap.get(stockId);
					inoutNum = stockInout.getStockInoutNum();
				} else {
					stockInout = inout;
					stockInout.setFsStockInoutId(inout.getStockInoutId());
					stockInoutMap.put(stockId, stockInout);
				}

				if (inout.isCorrectType$0()) {
					// [黒]
					inoutNum = WCC.add(inoutNum, inout.getStockInoutNum());
				} else if (inout.isCorrectType$1()) {
					// [赤]
					inoutNum = WCC.subtract(inoutNum, inout.getStockInoutNum());
				} else {
					getErrorManager().throwException(new IllegalArgumentException("stockInout.correctType is illegal."));
				}

				// 入庫数の更新
				stockInout.setStockInoutNum(inoutNum);
				// 前回在庫受払IDの更新
				stockInout.setBfStockInoutId(inout.getStockInoutId());
			}

			summaryInoutList.addAll(stockInoutMap.values());
		}

		return summaryInoutList;
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

	/**
	 * 入庫[赤] 在庫更新
	 */
	private void receiveCancel_update(TStockInout inout, TStoreRecordB recordBod, String systemDt, ErrorStatus errSts) {

		// ===== 在庫更新 =====
		TStock stock = inout.getTStock();
		BigDecimal chargeNum = WCC.subtract(stock.getChargeNum(), inout.getStockInoutNum());
		if (WCC.isNegative(chargeNum)) {
			// 引当可能数が0未満の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.STOCK_RESULT_CANNOT_CANCEL_STOCK_SHORTAGE_ERROR);
			return;
		}
		stock.setChargeNum(chargeNum);

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setStoreNumDay(WCC.subtract(stockReport.getStoreNumDay(), inout.getStockInoutNum()));
		stockReport.setStoreNumMonth(WCC.subtract(stockReport.getStoreNumMonth(), inout.getStockInoutNum()));

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
		stockInout.setFsStockInoutId(inout.getFsStockInoutId());
		stockInout.setBfStockInoutId(inout.getBfStockInoutId());
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
		stockInout.setStoreRecordBId(inout.getStoreRecordBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(inout.getProcessTypeId());
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
		stockInout.setProcessNo(recordBod.getProcessNo());
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
		stockInout.setCorrectType_$1();
		stockInout.setStockId(inout.getStockId());
		stockInout.setInoutType_$0();
		stockInout.setStockInoutNum(inout.getStockInoutNum());

		tStockInoutBhv.insert(stockInout);
	}

	/**
	 * <h2>出庫［黒］。</h2>
	 * <pre>
	 * 出庫の在庫更新処理
	 * パラメータの受払数で在庫を削減し、引当済に変更する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (引当指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (引当指示ボディ)
	 *  ・引当指示ボディID
	 *  ・処理No.
	 *  (在庫受払)
	 *  ・在庫ID
	 *  ・受払数
	 * </pre>
	 * @param header 引当指示ヘッダ
	 * @param body 引当指示ボディ
	 * @param inoutList 在庫受払リスト
	 * @param errSts エラーステータス
	 * @return 登録した在庫受払のリスト
	 */
	public List<TStockInout> shiped(TAllocInstH header, TAllocInstB body, List<TStockInout> inoutList, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// システム日付取得
		String systemDt = getSytemDt(header.getClientId(), header.getCenterId());

		// ===== パラメータチェック =====
		if (inoutList.size() == 0) {
			getErrorManager().throwException(new IllegalArgumentException());
		}

		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start
		// 登録在庫受払リスト
		List<TStockInout> insertInoutList = new ArrayList<TStockInout>();
		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana End

		// ===== inoutListのデータ件数分繰返 =====
		for (TStockInout inout : inoutList) {

			// ===== 在庫検索 =====
			TStock stock = stockLogic.selectByPk(inout.getStockId());

			// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start

			// ===== 在庫更新 =====
			TStockInout insertInout = shiped_update(stock, inout, header, body, systemDt, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			// 登録在庫受払リストに追加
			insertInout.setTStock(stock);
			insertInoutList.add(insertInout);
			// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana End
		}

		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start
		return insertInoutList;
		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana End
	}

	/**
	 * 出庫［黒］ 在庫更新
	 */
	private TStockInout shiped_update(TStock stock, TStockInout inout, TAllocInstH header, TAllocInstB body, String systemDt, ErrorStatus errSts) {

		// ===== 在庫更新 =====
		BigDecimal chargeNum = WCC.subtract(stock.getChargeNum(), inout.getStockInoutNum());
		BigDecimal allocNum = WCC.add(stock.getAllocNum(), inout.getStockInoutNum());
		if (WCC.isNegative(chargeNum)) {
			// 引当可能数が0以下の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR);
			// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start
			return null;
			// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana End
		}
		stock.setChargeNum(chargeNum);
		stock.setAllocNum(allocNum);

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setPickingNumDay(WCC.add(stockReport.getPickingNumDay(), inout.getStockInoutNum()));
		stockReport.setPickingNumMonth(WCC.add(stockReport.getPickingNumMonth(), inout.getStockInoutNum()));
		stockReport.setLastPickingDt(systemDt);

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====

		// レスポンス対策 2016.02.24 kawana Start
		TStockInout stockInout = newShipedStockInout(inout.getStockId(), inout.getStockInoutNum(), header, body, systemDt);
		// レスポンス対策 2016.02.24 kawana End

		tStockInoutBhv.insert(stockInout);

		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start
		return stockInout;
		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana End
	}

	// レスポンス対策 2016.02.24 kawana Start

	/**
	 * <h2>出庫[黒]の在庫受払作成。</h2>
	 * <pre>
	 * 出庫[黒]用の在庫受払を作成して返却する。
	 *
	 * 【パラメータの使用項目】
	 *  (入荷予定ボディ)
	 *  ・商品ID
	 *  ・予定入庫ラベルNo.
	 *  ・予定数 (センタ間移動の場合に使用)
	 *  ・積送在庫受払ID (センタ間移動の場合に使用)
	 *
	 *  (引当指示ヘッダ)
	 *  ・処理区分ID
	 *
	 *  (引当指示ボディ)
	 *  ・引当指示ボディID
	 *  ・処理No.
	 *
	 * </pre>
	 *
	 * @param stockId 在庫ID
	 * @param inoutNum 受払数
	 * @param allocInstH 引当指示ヘッダ
	 * @param allocInstB 引当指示ボディ
	 * @param inoutDt 受払日
	 *
	 * @return 出庫[黒]の在庫受払
	 */
	public TStockInout newShipedStockInout(long stockId, BigDecimal inoutNum, TAllocInstH allocInstH, TAllocInstB allocInstB, String inoutDt) {

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		stockInout.setAllocInstBId(allocInstB.getAllocInstBId());
		stockInout.setProcessDt(inoutDt);
		stockInout.setProcessTypeId(allocInstH.getProcessTypeId());
		stockInout.setProcessNo(allocInstB.getProcessNo());
		stockInout.setCorrectType_$0();
		stockInout.setStockId(stockId);
		stockInout.setInoutType_$1();
		stockInout.setStockInoutNum(inoutNum);

		return stockInout;
	}

	/**
	 * <h2>出庫［黒］一括処理。</h2>
	 * <pre>
	 * 出庫の在庫更新処理。
	 * パラメータの受払数で在庫を削減し、引当済に加算する。
	 * パラメータの在庫受払を一括登録する。
	 *
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * </pre>
	 * @param stockInoutList 在庫受払リスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipedBatch(List<TStockInout> stockInoutList, ErrorStatus errSts) {

		for (TStockInout inout : stockInoutList) {

			if (!inout.isInoutType$1() || !inout.isCorrectType$0()) {
				getErrorManager().throwException(new IllegalStateException("shipping inoutType is illegal"));
				return;
			}

			long stockId = inout.getStockId();
			BigDecimal inoutNum = inout.getStockInoutNum();

			// ===== 在庫更新 =====

			// 条件
			TStockCB stockCb = tStockBhv.newMyConditionBean();
			stockCb.query().setStockId_Equal(stockId);
			stockCb.query().setChargeNum_GreaterEqual(inoutNum);

			// 更新実行
			int count = tStockBhv.varyingQueryUpdate(tStockBhv.newMyEntity(), stockCb, op -> {
				// 引当可能数を減算
				op.self(sq -> sq.specify().columnChargeNum()).minus(inoutNum);
				// 引当済数を加算
				op.self(sq -> sq.specify().columnAllocNum()).plus(inoutNum);
			});
			if (count < 1) {
				getErrorManager().add(errSts, WmsCoreMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return;
			}

			// ===== 在庫日報更新 =====

			// 条件
			TStockReportCB stockReportCb = tStockReportBhv.newMyConditionBean();
			stockReportCb.query().setStockId_Equal(stockId);

			// 更新値
			TStockReport updateEntity = tStockReportBhv.newMyEntity();
			updateEntity.setLastPickingDt(inout.getProcessDt());

			// 更新実行
			count = tStockReportBhv.varyingQueryUpdate(updateEntity, stockReportCb, op -> {
				// 当日出庫数に加算
				op.self(sq -> sq.specify().columnPickingNumDay()).plus(inoutNum);
				// 当月出庫数に加算
				op.self(sq -> sq.specify().columnPickingNumMonth()).plus(inoutNum);
			});
			if (count < 1) {
				getErrorManager().add(errSts, WmsCoreMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return;
			}
		}

		// ===== 在庫受払登録 =====

		tStockInoutBhv.batchInsert(stockInoutList);
	}

	// レスポンス対策 2016.02.24 kawana End

	/**
	 * <h2>出庫［赤］。</h2>
	 * <pre>
	 * 出庫キャンセルの在庫更新処理
	 * パラメータの受払数の在庫を引当済から削減し、在庫数に変更する
	 * 取消した在庫が全数出庫で移動されている場合には、移動先の在庫に追加する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (引当指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (引当指示ボディ)
	 *  ・引当指示ボディID
	 *  ・処理No.
	 *  (在庫受払)
	 *  ・在庫受払ID
	 *  ・在庫ID
	 *  ・受払数
	 * </pre>
	 * @param header 引当指示ヘッダ
	 * @param body 引当指示ボディ
	 * @param inoutList 在庫受払リスト
	 * @param errSts エラーステータス
	 */
	public void shipedCancel(TAllocInstH header, TAllocInstB body, List<TStockInout> inoutList, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// システム日付取得
		String systemDt = getSytemDt(header.getClientId(), header.getCenterId());

		// ===== パラメータチェック =====
		if (inoutList.size() == 0) {

			getErrorManager().throwException(new IllegalArgumentException());
		}

		// ===== inoutListのデータ件数分繰返 =====
		for (TStockInout inout : inoutList) {

			// ===== 在庫検索 =====
			TStockCB stockCb = tStockBhv.newMyConditionBean();
			stockCb.setupSelect_TStockReportAsOne();

			stockCb.checkInvalidQuery();
			stockCb.query().setStockId_Equal(inout.getStockId());
			stockCb.query().setAllocNum_GreaterEqual(inout.getStockInoutNum());

			TStock stock = tStockBhv.selectEntityWithDeletedCheck(stockCb);

			// ===== 在庫更新 =====
			long updateInoutId = shipedCancel_update(stock, inout, header, body, systemDt);

			// ===== 全数出庫された在庫検索 =====
			// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana Start
			TStock otherStock = stockLogic.selectOtherLocationByStoreNo(stock.getStoreNoId(), stock.getLocationId());
			// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana End

			if (otherStock != null) {
				//  ===== 在庫がある場合、在庫の強制移動 =====

				// 強制移動数
				BigDecimal moveNum = stock.getChargeNum();

				//  ===== 移動元在庫の更新 =====
				long updateInoutIdSrc = shipedCancel_updateSrc(stock, inout, header, body, systemDt, moveNum, updateInoutId);

				//  ===== 移動先在庫の更新 =====
				shipedCancel_updateDst(otherStock, inout, header, body, systemDt, moveNum, updateInoutIdSrc);

				//  ===== 強制移動のメッセージ登録 =====
				getWarnManager().add(warnRetSts(errSts.getStatusCd(), errSts.getRowIndex()), WmsCoreMessageConst.SHIP_INSTRUCTED_CANCEL_FORCED_MOVE_INFORMATION);
			}
		}
	}

	/**
	 * 出庫［赤］ 在庫更新
	 */
	private long shipedCancel_update(TStock stock, TStockInout inout, TAllocInstH header, TAllocInstB body, String systemDt) {

		// ===== 在庫更新 =====
		stock.setChargeNum(WCC.add(stock.getChargeNum(), inout.getStockInoutNum()));
		stock.setAllocNum(WCC.subtract(stock.getAllocNum(), inout.getStockInoutNum()));

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setPickingNumDay(WCC.subtract(stockReport.getPickingNumDay(), inout.getStockInoutNum()));
		stockReport.setPickingNumMonth(WCC.subtract(stockReport.getPickingNumMonth(), inout.getStockInoutNum()));

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		stockInout.setFsStockInoutId(inout.getStockInoutId());
		stockInout.setBfStockInoutId(inout.getStockInoutId());
		stockInout.setAllocInstBId(body.getAllocInstBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(header.getProcessTypeId());
		stockInout.setProcessNo(body.getProcessNo());
		stockInout.setCorrectType_$1();
		stockInout.setStockId(inout.getStockId());
		stockInout.setInoutType_$1();
		stockInout.setStockInoutNum(inout.getStockInoutNum());

		tStockInoutBhv.insert(stockInout);

		return stockInout.getStockInoutId();
	}

	/**
	 * 出庫［赤］ 強制移動 在庫更新 移動元
	 */
	private long shipedCancel_updateSrc(TStock stock, TStockInout inout, TAllocInstH header, TAllocInstB body, String systemDt, BigDecimal moveNum, long inoutId) {

		// ===== 在庫更新 =====
		stock.setChargeNum(WCC.ZERO);

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setMoveMnsNumDay(WCC.add(stockReport.getMoveMnsNumDay(), moveNum));
		stockReport.setMoveMnsNumMonth(WCC.add(stockReport.getMoveMnsNumMonth(), moveNum));

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		stockInout.setFsStockInoutId(inout.getStockInoutId());
		stockInout.setBfStockInoutId(inoutId);
		stockInout.setAllocInstBId(body.getAllocInstBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(getProcessTypeId(ProcessType.FORCED_MOVE_SRC));
		stockInout.setProcessNo(body.getProcessNo());
		stockInout.setCorrectType_$0();
		stockInout.setStockId(inout.getStockId());
		stockInout.setInoutType_$1();
		stockInout.setStockInoutNum(moveNum);

		tStockInoutBhv.insert(stockInout);

		return stockInout.getStockInoutId();
	}

	/**
	 * 出庫［赤］ 強制移動 在庫更新 移動先
	 */
	private long shipedCancel_updateDst(TStock stock, TStockInout inout, TAllocInstH header, TAllocInstB body, String systemDt, BigDecimal moveNum, long inoutId) {

		// ===== 在庫更新 =====
		stock.setChargeNum(WCC.add(stock.getChargeNum(), moveNum));

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setMovePlsNumDay(WCC.add(stockReport.getMovePlsNumDay(), moveNum));
		stockReport.setMovePlsNumMonth(WCC.add(stockReport.getMovePlsNumMonth(), moveNum));

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		stockInout.setFsStockInoutId(inout.getStockInoutId());
		stockInout.setBfStockInoutId(inoutId);
		stockInout.setAllocInstBId(body.getAllocInstBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(getProcessTypeId(ProcessType.FORCED_MOVE_DST));
		stockInout.setProcessNo(body.getProcessNo());
		stockInout.setCorrectType_$0();
		stockInout.setStockId(stock.getStockId());
		stockInout.setInoutType_$0();
		stockInout.setStockInoutNum(moveNum);

		tStockInoutBhv.insert(stockInout);

		return stockInout.getStockInoutId();
	}

	/**
	 * <h2>出庫確定［黒］。</h2>
	 * <pre>
	 * 出庫確定の在庫更新処理
	 * パラメータの引当指示ヘッダIDで在庫受払を検索し、登録されている在庫受払数で、引当済の在庫を削減する
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 * 【更新テーブル】
	 *   ・在庫
	 *
	 * 【パラメータの使用項目】
	 *  (出庫ヘッダ)
	 *  ・出庫ヘッダID
	 * </pre>
	 * @param header 出庫ヘッダ
	 * @param errSts エラーステータス
	 */
	public void shipCompleted(TPickingH header, ErrorStatus errSts) {

		// ===== 出庫ボディの検索 =====
		TPickingBCB bodyCb = tPickingBBhv.newMyConditionBean();
		bodyCb.checkInvalidQuery();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		bodyCb.setupSelect_TStock();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
		bodyCb.setupSelect_TPickingH();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End
		bodyCb.query().setPickingHId_Equal(header.getPickingHId());
		bodyCb.query().setPickingNum_GreaterThan(WCC.ZERO);

		List<TPickingB> bodyLit = tPickingBBhv.selectList(bodyCb);

		// [SK2-032] 使わなくなった変数を削除 2014.12.11 kawana

		// ===== 出庫ボディの件数分繰返 =====
		for (TPickingB body : bodyLit) {

			// [SK2-032] 出荷確定の数を在庫受払数ではなく出庫ボディの出庫数に変更(複数伝票考慮) 2014.12.11 kawana Start

			// 対象在庫
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			TStock stock = body.getTStock();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			// 出庫確定数
			BigDecimal completedNum = body.getPickingNum();
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
			// センタ間移動フラグ
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.CenterTransitFlg centerTransitFlg = body.getTPickingH().getCenterTransitFlgAsCenterTransitFlg();

			// ===== 在庫更新 =====
			shipCompleted_update(stock, completedNum, centerTransitFlg);

			// センタ間移動の場合は出庫ボディを更新
			if (centerTransitFlg == CenterTransitFlg.$1) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// 積送中数を設定
				body.setTransitNum(completedNum);
				tPickingBBhv.update(body);
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

			// [SK2-032] 出荷確定の数を在庫受払数ではなく出庫ボディの出庫数に変更(複数伝票考慮) 2014.12.11 kawana End
		}
	}

	// [SK2-032] 出荷確定の数を在庫受払数ではなく出庫ボディの出庫数に変更(複数伝票考慮) 2014.12.11 kawana Start
	/**
	 *出庫確定［黒］ 在庫更新
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	private void shipCompleted_update(TStock stock, BigDecimal completedNum, CenterTransitFlg centerTransitFlg) {

		// ===== 在庫更新 =====
		BigDecimal allocNum = WCC.subtract(stock.getAllocNum(), completedNum);
		// [SK2-032] 出荷確定の数を在庫受払数ではなく出庫ボディの出庫数に変更(複数伝票考慮) 2014.12.11 kawana End

		if (WCC.isNegative(allocNum)) {
			getErrorManager().throwException(new IllegalStateException());
		}
		stock.setAllocNum(allocNum);

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
		// センタ間移動フラグ
		if (centerTransitFlg == CenterTransitFlg.$1) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			// 積送中数を設定
			stock.setTransitNum(WCC.add(stock.getTransitNum(), completedNum));
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End

		tStockBhv.update(stock);
	}

	/**
	 * <h2>出庫確定［赤］。</h2>
	 * <pre>
	 * 出庫確定キャンセルの在庫更新処理
	 * パラメータの引当指示ヘッダIDで在庫受払を検索し、登録されている在庫受払数で、引当済の在庫を追加する
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 * 【更新テーブル】
	 *   ・在庫
	 *
	 * 【パラメータの使用項目】
	 *  (出庫ヘッダ)
	 *  ・出庫ヘッダID
	 * </pre>
	 * @param header 出庫ヘッダ
	 * @param errSts エラーステータス
	 */
	public void shipCompletedCancel(TPickingH header, ErrorStatus errSts) {

		// ===== 出庫ボディの検索 =====
		TPickingBCB bodyCb = tPickingBBhv.newMyConditionBean();
		bodyCb.checkInvalidQuery();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		bodyCb.setupSelect_TStock();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
		bodyCb.setupSelect_TPickingH();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End
		bodyCb.query().setPickingHId_Equal(header.getPickingHId());
		bodyCb.query().setPickingNum_GreaterThan(WCC.ZERO);

		List<TPickingB> bodyLit = tPickingBBhv.selectList(bodyCb);

		// [SK2-032] 使わなくなった変数を削除 2014.12.11 kawana

		// ===== 出庫ボディの件数分繰返 =====
		for (TPickingB body : bodyLit) {

			// [SK2-032] 出荷確定の数を在庫受払数ではなく出庫ボディの出庫数に変更(複数伝票考慮) 2014.12.11 kawana Start

			// 対象在庫
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			TStock stock = body.getTStock();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			// 出庫確定数
			BigDecimal completedNum = body.getPickingNum();
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
			// センタ間移動フラグ
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.CenterTransitFlg centerTransitFlg = body.getTPickingH().getCenterTransitFlgAsCenterTransitFlg();

			// ===== 在庫更新 =====
			shipCompletedCancel_update(stock, completedNum, centerTransitFlg);

			// センタ間移動の場合は出庫ボディを更新
			if (centerTransitFlg == CenterTransitFlg.$1) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// 積送中数をクリア
				body.setTransitNum(WCC.ZERO);
				tPickingBBhv.update(body);
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

			// [SK2-032] 出荷確定の数を在庫受払数ではなく出庫ボディの出庫数に変更(複数伝票考慮) 2014.12.11 kawana End
		}
	}

	// [SK2-032] 出荷確定の数を在庫受払数ではなく出庫ボディの出庫数に変更(複数伝票考慮) 2014.12.11 kawana Start
	/**
	 *出庫確定［赤］ 在庫更新
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	private void shipCompletedCancel_update(TStock stock, BigDecimal completedNum, CenterTransitFlg centerTransitFlg) {

		// ===== 在庫更新 =====
		stock.setAllocNum(WCC.add(stock.getAllocNum(), completedNum));
		// [SK2-032] 出荷確定の数を在庫受払数ではなく出庫ボディの出庫数に変更(複数伝票考慮) 2014.12.11 kawana End

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
		// センタ間移動フラグ
		if (centerTransitFlg == CenterTransitFlg.$1) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			// 積送中数を設定
			stock.setTransitNum(WCC.subtract(stock.getTransitNum(), completedNum));
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End

		tStockBhv.update(stock);
	}

	// [セット品対応] 在庫移動の出庫指示、入庫指示の「1」対「多」に対応 2015.11.19 kawana Start

	/**
	 * <h2>在庫移動［出庫］。</h2>
	 * <pre>
	 * 在庫移動（出庫）の在庫更新処理
	 * パラメータの在庫移動実績数で在庫を削減する
	 * 在庫を全数移動する場合は、在庫を移動中に変更する
	 * 一部数の移動の場合は、移動中の在庫を新規に登録する
	 * 在庫を新規登録する時に入庫Noを新規に登録する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・入庫No.
	 *   ・採番マスタ
	 *   ・荷姿マスタ
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・入庫No.
	 *   ・在庫
	 *   ・在庫日報
	 *   ・在庫受払
	 *
	 * 全数移動の確認は{@link StockUpdateCheckLogic#allStockMoveIOutCheck(TMoveInstH, TMoveInstB, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新チェック.全数出庫チェックメソッド}で行う
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (在庫移動指示ボディ)[入庫]
	 *  ・入出庫区分
	 *  ・入庫ラベルNo
	 *  (在庫移動指示ボディ)[出庫]
	 *  ・入出庫区分
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・ロットID
	 *  ・入庫NoID
	 *  (在庫移動実績ボディ)[出庫]
	 *  ・在庫移動実績ボディID
	 *  ・処理No.
	 *  ・ロケーションID
	 *  ・在庫移動実績数
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBodyList 在庫移動指示ボディリスト
	 * @param recordBody 在庫移動実績ボディ
	 * @param errSts エラーステータス
	 */
	public void stockMoveOut(TMoveInstH instHeader, List<TMoveInstB> instBodyList, TMoveRecordB recordBody, ErrorStatus errSts) {

		List<TMoveRecordB> recordBodyList = new ArrayList<TMoveRecordB>();
		recordBodyList.add(recordBody);
		stockMoveOut(instHeader, instBodyList, recordBodyList, errSts);
	}

	/**
	 * <h2>在庫移動［出庫］。</h2>
	 * <pre>
	 * 在庫移動（出庫）の在庫更新処理
	 * パラメータの在庫移動実績数で在庫を削減する
	 * 在庫を全数移動する場合は、在庫を移動中に変更する
	 * 一部数の移動の場合は、移動中の在庫を新規に登録する
	 * 在庫を新規登録する時に入庫Noを新規に登録する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・入庫No.
	 *   ・採番マスタ
	 *   ・荷姿マスタ
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・入庫No.
	 *   ・在庫
	 *   ・在庫日報
	 *   ・在庫受払
	 *
	 * 全数移動の確認は{@link StockUpdateCheckLogic#allStockMoveIOutCheck(TMoveInstH, TMoveInstB, TMoveInstB, TMoveRecordB, ErrorStatus) 在庫更新チェック.全数出庫チェックメソッド}で行う
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (在庫移動指示ボディ)[入庫]
	 *  ・入出庫区分
	 *  ・入庫ラベルNo
	 *  (在庫移動指示ボディ)[出庫]
	 *  ・入出庫区分
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・ロットID
	 *  ・入庫NoID
	 *  (在庫移動実績ボディ)[出庫]
	 *  ・在庫移動実績ボディID
	 *  ・処理No.
	 *  ・ロケーションID
	 *  ・在庫移動実績数
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBodyList 在庫移動指示ボディリスト
	 * @param recordBodyList 在庫移動実績ボディリスト
	 * @param errSts エラーステータス
	 */
	public void stockMoveOut(TMoveInstH instHeader, List<TMoveInstB> instBodyList, List<TMoveRecordB> recordBodyList, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		MClientCenter clientCenter = selectClientCenterWithParam(instHeader.getClientId(), instHeader.getCenterId());
		// システム日付取得
		String systemDt = clientCenter.getSystemDt();
		// 入庫日管理フラグ
		boolean isManageStoreDt = clientCenter.getMParamAsOne().isStoreDtFlg$1();
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

		// 移動データの組み立て(ロットID、入庫NoIDの設定込み)
		setupMoveData(instHeader, instBodyList, recordBodyList, true);

		// パラメータの移動指示を出庫指示と入庫指示に振分
		List<TMoveInstB> instBodyListPicking = new ArrayList<TMoveInstB>();
		List<TMoveInstB> instBodyListStore = new ArrayList<TMoveInstB>();
		for (TMoveInstB instBody : instBodyList) {

			// [#2961] 複数荷姿対応 2017.11.09 kawana Start
			// 荷姿IDの設定 (ピース荷姿ID)
			instBody.setShapeId(productShapeLogic.getPieceShapeId(instBody.getProductId()));
			// [#2961] 複数荷姿対応 2017.11.09 kawana End

			switch (instBody.getInoutTypeAsInoutType()) {
			case $0:
				// 入庫
				instBodyListStore.add(instBody);
				break;
			case $1:
				// 出庫
				instBodyListPicking.add(instBody);
				break;
			default:
				// 未知の入出庫区分は 致命的エラー
				getErrorManager().throwException(new IllegalArgumentException());
				return;
			}
		}

		if (instBodyListPicking.size() == 0) {
			// 出庫指示なしは致命的エラー
			getErrorManager().throwException(new IllegalArgumentException());
		}

		// 移動指示ボディ[入庫]と移動指示ボディ[出庫]が対となる
		boolean isPairMove = isPairtMove(instBodyListPicking, instBodyListStore);
		TMoveInstB instBodyStore = null;
		if (isPairMove) {
			instBodyStore = instBodyListStore.get(0);
		}

		// 移動実績の件数分、移動処理を繰返し
		for (TMoveRecordB recordBody : recordBodyList) {

			// 在庫移動指示ボディ[出庫]
			TMoveInstB instBodyPicking = recordBody.getTMoveInstB();
			if (instBodyPicking.isInoutType$0()) {
				// 入庫はスキップ
				continue;
			}

			// ===== 移動在庫を検索 =====

			TStock stock = null;
			if (instBodyPicking.getStoreNoId() != null) {
				// 入庫No.IDの設定あり

				// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana Start
				stock = stockLogic.selectByStoreNoAndLocation(instBodyPicking.getStoreNoId(), recordBody.getLocationId(), true, errSts);
				// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana End
			} else {
				// 入庫No.IDの設定なし

				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
				// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start

				// ロット検索の条件
				StockSelectLotCondition.Builder lotConditionBuilder = StockSelectLotCondition.builder()
						.clientId(instHeader.getClientId())
						.productId(instBodyPicking.getProductId())
						.stockTypeId(instBodyPicking.getStockTypeId())
						.locationId(recordBody.getLocationId())
						.depositId(instBodyPicking.getDepositId())
						.lotId(instBodyPicking.getLotId())
						.shapeId(instBodyPicking.getShapeId())
						.joinStoreNo(true);

				if (isManageStoreDt) {
					// 入庫日管理有り

					lotConditionBuilder.storeDt(instBodyPicking.getStoreDt());
				}

				stock = stockLogic.selectByLot(lotConditionBuilder.build(), errSts);
				// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End
				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
			}
			if (0 < getErrorManager().size()) {
				return;
			}

			if (stock == null) {
				// エラー管理クラスにエラーを登録
				getErrorManager().add(errSts, WmsCoreMessageConst.STOCK_DATA_NOT_FOUND_ERROR);
				return;
			}

			// ===== 引当可能数のチェック =====
			if (WCC.isLessThan(stock.getChargeNum(), recordBody.getMoveNum())) {
				// 在庫移動実績数より在庫.引当可能数が少ない場合

				// エラー管理クラスにエラーを登録
				getErrorManager().add(errSts, WmsCoreMessageConst.STOCK_MOVE_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR);
				return;
			}

			// ===== 全数出庫フラグの設定 =====

			// 移動指示[入庫]のペアがある場合
			if (isPairMove) {

				// 下記パラメータを設定して在庫更新チェック.全数出庫チェックメソッドを呼出し
				// [ON推-品向-398] 全数出庫の判定に預託、在庫区分などを追加 2014.12.04 kawana Start
				stockUpdateCheckLogic.allStockMoveIOutCheck(instHeader, instBodyPicking, instBodyStore, recordBody, stock, errSts);
				// [ON推-品向-398] 全数出庫の判定に預託、在庫区分などを追加 2014.12.04 kawana End
				// エラーが登録されている場合
				if (0 < getErrorManager().size()) {

					return;
				}
			} else {

				// 部分出庫に設定
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe Start
				recordBody.setAllShippingFlg_$0();
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe End
			}

			// ===== 在庫の更新 =====

			// [C-CWMS-0048] 入庫日管理対応 2016.01.20 kawana Start
			// 入庫日の設定
			if (isPairMove && CU.isNullOrEmpty(instBodyStore.getStoreDt())) {
				// 入庫日の指定なし

				// 移動元在庫の入庫日を設定
				instBodyStore.setStoreDt(stock.getTStoreNo().getStoreDt());
			}
			// [C-CWMS-0048] 入庫日管理対応 2016.01.20 kawana End

			// 在庫移動の入庫No分割を削除 2016.03.11 kawana Start
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe Start
			if (recordBody.isAllShippingFlg$1()) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe End
				// 全数出庫フラグ が「全数出庫」の場合

				// [C-CWMS-0048] 入庫日管理対応 2016.01.04 kawana Start
				// 全数出庫の場合は入庫日を上書き
				TStoreNo storeNo = stock.getTStoreNo();
				if (!storeNo.getStoreDt().equals(instBodyStore.getStoreDt())) {
					storeNoManageLogic.updateOverWrite(storeNo, storeNo.getSupplierId(), instBodyStore.getStoreDt());
				}
				// [C-CWMS-0048] 入庫日管理対応 2016.01.04 kawana End

				// 在庫移動指示ボディ[入庫] の 入庫No.ID、入庫ラベルNo.を上書き
				instBodyStore.setStoreNoId(stock.getStoreNoId());
				instBodyStore.setStoreLabelNo(stock.getTStoreNo().getStoreLabelNo());
			}

			// 在庫更新
			stockMoveOut_update(stock, instHeader, recordBody, systemDt);

			// 在庫移動の入庫No分割を削除 2016.03.11 kawana End
		}
	}

	/**
	 * <h2>移動データの組み立て。</h2>
	 * <pre>
	 * 移動実績ボディに対応する指示ボディ、指示ヘッダを設定する。
	 * また、指示ボディのロットIDが設定されていない場合は、
	 * DBから検索(または登録)して指示ボディに設定する。
	 * </pre>
	 * @param instHeader
	 * @param instBodyList
	 * @param recordBodyList
	 */
	private void setupMoveData(TMoveInstH instHeader, List<TMoveInstB> instBodyList, List<TMoveRecordB> recordBodyList, boolean doSetLotId) {

		// 出庫指示ボディIDでマップ化
		Map<Long, TMoveInstB> instBodyMap = new HashMap<Long, TMoveInstB>();
		for (TMoveInstB instBody : instBodyList) {
			instBody.setTMoveInstH(instHeader);
			// ロットIDの設定
			if (doSetLotId && instBody.getLotId() == null) {
				// ロットIDが設定されていない場合は検索または登録
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//				TLot lot = lotManageLogic.selectOrInsertLot(instBody.getProductId(), instBody.getLot(), instBody.getLimitDt());
				TLot lot = lotManageLogic.selectOrInsertLot(instBody.getProductId(), instBody.getLot(), instBody.getLimitDt(), instBody.getProdDt(), instBody.getStoreDt());
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]
				instBody.setLotId(lot.getLotId());
			}

			// 入庫NoIDの設定
			if (instBody.getStoreNoId() == null && !CU.isNullOrEmpty(instBody.getStoreLabelNo())) {
				TStoreNo storeNo = storeNoManageLogic.selectStoreNo(instBody.getStoreLabelNo());
				if (storeNo != null) {
					instBody.setStoreNoId(storeNo.getStoreNoId());
				}
			}

			instBodyMap.put(instBody.getMoveInstBId(), instBody);
		}

		for (TMoveRecordB recordBody : recordBodyList) {
			recordBody.setTMoveInstB(instBodyMap.get(recordBody.getMoveInstBId()));
			recordBody.setTMoveInstH(instHeader);
		}
	}

	// [セット品対応] 在庫移動の出庫指示、入庫指示の「1」対「多」に対応 2015.11.19 kawana End

	// [セット品対応] 在庫移動の出庫指示、入庫指示の「1」対「多」に対応 2015.12.17 kawana Start
	/**
	 * <h2>1対1の在庫移動かを判定.</h2>
	 * 在庫移動指示ボディのサイズ、商品IDから
	 * 1対1の在庫移動かを判定する
	 * @param instBodyListPicking 在庫移動指示ボディ(出庫)リスト
	 * @param instBodyListStore 在庫移動指示ボディ(入庫)リスト
	 * @return true : 1対1の在庫移動
	 */
	private boolean isPairtMove(List<TMoveInstB> instBodyListPicking, List<TMoveInstB> instBodyListStore) {

		boolean isPair = false;

		// 指示数を確認
		if (instBodyListPicking.size() == 1 && instBodyListStore.size() == 1) {
			// 対あり

			// 商品が同じか
			TMoveInstB instBodyPicking = instBodyListPicking.get(0);
			TMoveInstB instBodyStore = instBodyListStore.get(0);
			if (instBodyPicking.getProductId().longValue() == instBodyStore.getProductId().longValue()) {

				// 対になっている
				isPair = true;
			}
		}

		return isPair;
	}

	// [セット品対応] 在庫移動の出庫指示、入庫指示の「1」対「多」に対応 2015.12.17 kawana End

	/**
	 * 在庫移動[出庫] 在庫更新
	 */
	private void stockMoveOut_update(TStock stock, TMoveInstH instHeader, TMoveRecordB recordBody, String systemDt) {

		// ===== 在庫更新 =====
		stock.setChargeNum(WCC.subtract(stock.getChargeNum(), recordBody.getMoveNum()));
		stock.setMoveNum(WCC.add(stock.getMoveNum(), recordBody.getMoveNum()));

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setMoveMnsNumDay(WCC.add(stockReport.getMoveMnsNumDay(), recordBody.getMoveNum()));
		stockReport.setMoveMnsNumMonth(WCC.add(stockReport.getMoveMnsNumMonth(), recordBody.getMoveNum()));

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		stockInout.setMoveRecordBId(recordBody.getMoveRecordBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(instHeader.getProcessTypeId());
		stockInout.setProcessNo(recordBody.getProcessNo());
		stockInout.setCorrectType_$0();
		stockInout.setStockId(stock.getStockId());
		stockInout.setInoutType_$1();
		stockInout.setStockInoutNum(recordBody.getMoveNum());

		tStockInoutBhv.insert(stockInout);
	}

	// 在庫移動の入庫No分割を削除 2016.03.11 kawana

	// [セット品対応] 在庫移動の出庫指示、入庫指示の「1」対「多」に対応 2015.11.19 kawana Start

	/**
	 * <h2>在庫移動[出庫][赤].</h2>
	 * <pre>
	 * 在庫移動（出庫）キャンセルの在庫更新処理
	 * 在庫移動実績(出庫)に紐づいている在庫受払を検索し、
	 * 受払数の在庫数分、在庫の移動中数から減算し引当可能数に加算する
	 * 在庫が全数出庫で移動されている場合には、移動先の在庫に追加する(処理区分:強制移動)
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 *   ・在庫日報
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (在庫移動指示ボディ)[入庫]
	 *   使用項目なし
	 *  (在庫移動指示ボディ)[出庫]
	 *  ・在庫移動指示ボディID
	 *  ・入出庫区分
	 *  (在庫移動実績ボディ)[出庫]
	 *  ・在庫移動実績ボディID
	 *  ・在庫移動指示ボディID
	 *  ・処理No.
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBodyList 在庫移動指示ボディリスト
	 * @param recordBodyList 在庫移動実績ボディリスト
	 * @param errSts エラーステータス
	 */
	public void stockMoveOutCancel(TMoveInstH instHeader, List<TMoveInstB> instBodyList, List<TMoveRecordB> recordBodyList, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// システム日付取得
		String systemDt = getSytemDt(instHeader.getClientId(), instHeader.getCenterId());

		// 移動データの組み立て(ロットID、入庫NoIDの設定込み)
		setupMoveData(instHeader, instBodyList, recordBodyList, false);

		// ===== 出庫の在庫受払検索 =====

		List<Long> recordBodyIdList = new ArrayList<Long>();
		Map<Long, TMoveRecordB> recordBodyMap = new HashMap<Long, TMoveRecordB>();
		for (TMoveRecordB recordBody : recordBodyList) {

			// 入出庫区分チェック
			if (recordBody.getTMoveInstB().isInoutType$0()) {
				// 入庫はスキップ
				continue;
			}

			long recordBodyId = recordBody.getMoveRecordBId();
			recordBodyIdList.add(recordBodyId);
			recordBodyMap.put(recordBodyId, recordBody);
		}

		if (recordBodyIdList.size() == 0) {
			// 致命的エラー
			getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		TStockInoutCB stockInoutCb = tStockInoutBhv.newMyConditionBean();
		stockInoutCb.checkInvalidQuery();
		stockInoutCb.setupSelect_TStock().withTStockReportAsOne();
		stockInoutCb.setupSelect_MProcessType();
		stockInoutCb.query().setMoveRecordBId_InScope(recordBodyIdList);
		stockInoutCb.addOrderBy_PK_Asc();

		List<TStockInout> pickingInoutList = tStockInoutBhv.selectList(stockInoutCb);
		if (pickingInoutList.size() == 0) {
			// 出庫の在庫受払なし
			this.getErrorManager().add(errSts, WmsCoreMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return;
		}

		// 同じ在庫を移動した場合を考慮し、在庫IDをキーに在庫リストを作成
		Map<Long, TStock> stockMap = new HashMap<Long, TStock>();

		// 在庫受払を在庫実績ボディID毎にまとめる
		Map<Long, List<TStockInout>> inoutMap = new HashMap<Long, List<TStockInout>>();

		for (TStockInout inout : pickingInoutList) {

			// 在庫マップ(キー：在庫ID)
			TStock pickingStock = inout.getTStock();
			long stockId = pickingStock.getStockId();
			stockMap.put(stockId, pickingStock);

			// 在庫受払マップ(キー：在庫実績ボディID)
			long recordBodyId = inout.getMoveRecordBId();
			List<TStockInout> inoutList = inoutMap.get(recordBodyId);
			if (inoutList == null) {
				inoutList = new ArrayList<TStockInout>();
				inoutMap.put(recordBodyId, inoutList);
			}
			inoutList.add(inout);
		}

		// 在庫受払マップの件数分繰返(在庫実績ボディIDごと)
		for (List<TStockInout> inoutList : inoutMap.values()) {

			// 在庫移動の入庫No分割を削除 2016.03.11 kawana Start

			// 在庫受払から在庫を更新(キャンセル処理)
			for (TStockInout inout : inoutList) {

				TStock stock = stockMap.get(inout.getStockId());
				TMoveRecordB recordBody = recordBodyMap.get(inout.getMoveRecordBId());

				// ===== 在庫更新 =====
				stockMoveOutCancel_update(stock, inout, instHeader, recordBody, systemDt);
			}

			// 在庫移動の入庫No分割を削除 2016.03.11 kawana End
		}
	}

	// 在庫移動の入庫No分割を削除 2016.03.11 kawana

	/**
	 * 在庫移動[出庫]［赤］ 在庫更新
	 */
	private long stockMoveOutCancel_update(TStock stock, TStockInout inout, TMoveInstH header, TMoveRecordB body, String systemDt) {

		// 出庫の受払か
		if (!inout.isInoutType$1()) {
			getErrorManager().throwException(new IllegalArgumentException());
			return -1;
		}

		// ===== 在庫更新 =====
		stock.setChargeNum(WCC.add(stock.getChargeNum(), inout.getStockInoutNum()));
		stock.setMoveNum(WCC.subtract(stock.getMoveNum(), inout.getStockInoutNum()));

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		// 出庫のキャンセル
		stockReport.setMoveMnsNumDay(WCC.subtract(stockReport.getMoveMnsNumDay(), inout.getStockInoutNum()));
		stockReport.setMoveMnsNumMonth(WCC.subtract(stockReport.getMoveMnsNumMonth(), inout.getStockInoutNum()));

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		stockInout.setFsStockInoutId(inout.getStockInoutId());
		stockInout.setBfStockInoutId(inout.getStockInoutId());
		stockInout.setMoveRecordBId(body.getMoveRecordBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(header.getProcessTypeId());
		stockInout.setProcessNo(body.getProcessNo());
		stockInout.setCorrectType_$1();
		stockInout.setStockId(stock.getStockId());
		stockInout.setInoutType_$1();
		stockInout.setStockInoutNum(inout.getStockInoutNum());

		tStockInoutBhv.insert(stockInout);

		return stockInout.getStockInoutId();
	}

	// 在庫移動の入庫No分割を削除 2016.03.11 kawana


	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	public TStockInout stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, TMoveRecordB recordBody, ErrorStatus errSts) {
//
//		List<TMoveRecordB> recordBodyList = new ArrayList<TMoveRecordB>();
//		recordBodyList.add(recordBody);
//
//		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana Start
//		List<TStockInout> inoutList = stockMoveIn(instHeader, instBodyList, recordBodyList, errSts);
//		if (0 < getErrorManager().size()) {
//			return null;
//		}
//
//		return inoutList.get(0);
//		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana End
//	}
	/**
	 * @deprecated 旧呼び出しパラメータを使用しています。入荷ラベルが追加されたパラメータを使用してください。
	 *  stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, TMoveRecordB recordBody, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts)
	 */
	public TStockInout stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, TMoveRecordB recordBody, ErrorStatus errSts) {
		getErrorManager().throwException(new IllegalArgumentException("旧呼び出しパラメータで実行しています。入荷ラベルが追加されたパラメータを使用してください。stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, TMoveRecordB recordBody, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts)"));
		return null;
	}
	/**
	 * <h2>在庫移動［入庫］。</h2>
	 * <pre>
	 * 在庫移動（入庫）の在庫更新処理
	 * パラメータの在庫移動指示ボディID（出庫）で出庫した在庫を検索し、パラメータの在庫移動実績数で移動中の在庫を削減する
	 * 入庫No.マージの設定に従って入庫した在庫を更新または新規に登録する
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 *   ・在庫日報
	 *   ・倉庫マスタ
	 *   ・荷姿マスタ
	 *   ・商品荷姿マスタ
	 *   ・荷主センタマスタ
	 * 【更新または登録テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 入庫No.マージ設定の確認は{@link StockUpdateCheckLogic#onsNumMergeCheck(TMoveInstH, TMoveInstB, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新チェック.入庫ＮＯマージチェックメソッド}で行う
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (在庫移動指示ボディ)[入庫]
	 *  ・入出庫区分
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・ロットID
	 *  ・入庫NoID
	 *  (在庫移動指示ボディ)[出庫]
	 *  ・入出庫区分
	 *  ・在庫移動実績ボディID
	 *  (在庫移動実績ボディ)[入庫]
	 *  ・在庫移動実績ボディID
	 *  ・処理No.
	 *  ・ロケーションID
	 *  ・在庫移動実績数
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBodyList 在庫移動指示ボディリスト
	 * @param recordBody 在庫移動実績ボディ
	 * @param receiveLabelList 入庫ラベルのリスト
	 * @param errSts エラーステータス
	 */
	public TStockInout stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, TMoveRecordB recordBody, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts) {

		List<TMoveRecordB> recordBodyList = new ArrayList<TMoveRecordB>();
		recordBodyList.add(recordBody);

		List<TStockInout> inoutList = stockMoveIn(instHeader, instBodyList, recordBodyList, receiveLabelList, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		return inoutList.get(0);
	}
	/**
	 * @deprecated 旧呼び出しパラメータを使用しています。入荷ラベルが追加されたパラメータを使用してください。
	 * stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, List<TMoveRecordB> recordBodyList, List<TReceiveLabel> receiveLabelList,  ErrorStatus errSts)
	 */
	public List<TStockInout> stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, List<TMoveRecordB> recordBodyList, ErrorStatus errSts) {
		getErrorManager().throwException(new IllegalArgumentException("旧呼び出しパラメータで実行しています。入荷ラベルが追加されたパラメータを使用してください。stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, List<TMoveRecordB> recordBodyList, List<TReceiveLabel> receiveLabelList,  ErrorStatus errSts)"));
		return null;
	}
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]


	/**
	 * <h2>在庫移動［入庫］。</h2>
	 * <pre>
	 * 在庫移動（入庫）の在庫更新処理
	 * パラメータの在庫移動指示ボディID（出庫）で出庫した在庫を検索し、パラメータの在庫移動実績数で移動中の在庫を削減する
	 * 入庫No.マージの設定に従って入庫した在庫を更新または新規に登録する
	 *
	 * 【検索テーブル】
	 *   ・在庫受払
	 *   ・在庫
	 *   ・在庫日報
	 *   ・倉庫マスタ
	 *   ・荷姿マスタ
	 *   ・商品荷姿マスタ
	 *   ・荷主センタマスタ
	 * 【更新または登録テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 入庫No.マージ設定の確認は{@link StockUpdateCheckLogic#onsNumMergeCheck(TMoveInstH, TMoveInstB, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新チェック.入庫ＮＯマージチェックメソッド}で行う
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (在庫移動指示ボディ)[入庫]
	 *  ・入出庫区分
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・ロットID
	 *  ・入庫NoID
	 *  (在庫移動指示ボディ)[出庫]
	 *  ・入出庫区分
	 *  ・在庫移動実績ボディID
	 *  (在庫移動実績ボディ)[入庫]
	 *  ・在庫移動実績ボディID
	 *  ・処理No.
	 *  ・ロケーションID
	 *  ・在庫移動実績数
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBodyList 在庫移動指示ボディリスト
	 * @param recordBodyList 在庫移動実績ボディリスト
	 * @param receiveLabelList 入庫する入荷ラベルのリスト（ラベル指定での移動は移動する入荷ラベルのリストをセットする。ラベル指定以外は不要）
	 * @param errSts エラーステータス
	 *
	 * @return 入庫在庫の在庫受払リスト
	 */
	public List<TStockInout> stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, List<TMoveRecordB> recordBodyList, List<TReceiveLabel> receiveLabelList,  ErrorStatus errSts) {

		// ===== 初期処理 =====

		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		MClientCenter clientCenter = selectClientCenterWithParam(instHeader.getClientId(), instHeader.getCenterId());
		// システム日付取得
		String systemDt = clientCenter.getSystemDt();
		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
		// 入庫日管理フラグ
		ManageStoreDtFlg manageStoreDtFlg = ManageStoreDtFlg.FALSE;
		if (clientCenter.getMParamAsOne().isStoreDtFlg$1()) {
			manageStoreDtFlg = ManageStoreDtFlg.TRUE;
		}
		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

		// 移動データの組み立て(ロットID、入庫NoIDの設定込み)
		setupMoveData(instHeader, instBodyList, recordBodyList, true);

		// パラメータの移動指示を出庫指示と入庫指示に振分
		List<TMoveInstB> instBodyListPicking = new ArrayList<TMoveInstB>();
		List<TMoveInstB> instBodyListStore = new ArrayList<TMoveInstB>();
		for (TMoveInstB instBody : instBodyList) {

			// [#2961] 複数荷姿対応 2017.11.09 kawana Start
			// 荷姿IDの設定 (ピース荷姿ID)
			instBody.setShapeId(productShapeLogic.getPieceShapeId(instBody.getProductId()));
			// [#2961] 複数荷姿対応 2017.11.09 kawana End

			switch (instBody.getInoutTypeAsInoutType()) {
			case $0:
				// 入庫
				instBodyListStore.add(instBody);
				break;
			case $1:
				// 出庫
				instBodyListPicking.add(instBody);
				break;
			default:
				// 未知の入出庫区分は 致命的エラー
				getErrorManager().throwException(new IllegalArgumentException());
				return null;
			}
		}

		if (instBodyListStore.size() == 0 || instBodyListPicking.size() == 0) {
			// 入庫指示、出庫指示なしは致命的エラー
			getErrorManager().throwException(new IllegalArgumentException());
			return null;
		}

		// 移動指示ボディ[入庫]と移動指示ボディ[出庫]が対となる
		boolean isPairMove = isPairtMove(instBodyListPicking, instBodyListStore);
		TMoveRecordB recordBodyStore = null;
		if (isPairMove) {
			// 対あり

			int recordBodyStoreCount = 0;
			for (TMoveRecordB recordBody : recordBodyList) {

				if (recordBody.getTMoveInstB().isInoutType$0()) {
					recordBodyStore = recordBody;
					recordBodyStoreCount++;
				}
			}

			// 在庫移動の入庫No分割を削除 2016.03.11 kawana Start
			// 移動指示ボディ[入庫] の 元入庫No に 出庫した入庫Noを設定
			instBodyListStore.get(0).setOldStoreNoId(instBodyListPicking.get(0).getStoreNoId());
			// 在庫移動の入庫No分割を削除 2016.03.11 kawana End

			if (recordBodyStoreCount != 1) {
				// 対の場合に入庫の実績が1件以外は致命的エラー
				getErrorManager().throwException(new IllegalArgumentException("MoveRecord count is illegal"));
				return null;
			}
		}

		// ===== 出庫の在庫受払検索 =====

		// 出庫指示のIDリストを作成(在庫受払の検索条件)
		List<Long> instBodyIdListPicking = new ArrayList<Long>();
		for (TMoveInstB instBody : instBodyListPicking) {
			instBodyIdListPicking.add(instBody.getMoveInstBId());
		}

		TStockInoutCB stockInoutCb = tStockInoutBhv.newMyConditionBean();
		// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
		stockInoutCb.setupSelect_TStock().withTStockReportAsOne();
		// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End
		stockInoutCb.query().queryTMoveRecordB().setMoveInstBId_InScope(instBodyIdListPicking);
		stockInoutCb.query().setInoutType_Equal_$1();
		stockInoutCb.query().queryTStock().setMoveNum_GreaterThan(WCC.ZERO);

		stockInoutCb.checkInvalidQuery();

		List<TStockInout> pickingInoutList = tStockInoutBhv.selectList(stockInoutCb);

		if (pickingInoutList.size() == 0) {
			// 出庫の在庫受払なし
			this.getErrorManager().add(errSts, WmsCoreMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// 同じ在庫を移動した場合を考慮し、在庫IDをキーに在庫リストを作成
		Map<Long, TStock> pickingStockMap = new HashMap<Long, TStock>();
		for (TStockInout pickingInout : pickingInoutList) {

			TStock pickingStock = pickingInout.getTStock();
			long stockId = pickingStock.getStockId();
			pickingStockMap.put(stockId, pickingStock);
		}

		// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
		// 移動元の最新入庫日
		String pickingStockLastStoreDt = null;
		// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End
		// 在庫受払の件数分繰返
		for (TStockInout pickingInout : pickingInoutList) {

			// ===== 出庫の在庫更新 =====

			TStock pickingStock = pickingStockMap.get(pickingInout.getStockId());

			BigDecimal moveNum;
			if (isPairMove) {
				moveNum = recordBodyStore.getMoveNum();
				// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
				pickingStockLastStoreDt = getNewDt(pickingStockLastStoreDt, pickingStock.getTStockReportAsOne().getLastStoreDt());
				// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End
			} else {
				moveNum = pickingInout.getStockInoutNum();
			}

			pickingStock.setMoveNum(WCC.subtract(pickingStock.getMoveNum(), moveNum));

			if (WCC.isNegative(pickingStock.getMoveNum())) {
				// 移動中数が0未満の場合
				this.getErrorManager().add(errSts, WmsCoreMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return null;
			}

			tStockBhv.update(pickingStock);
		}

		// ===== 入庫 =====

		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana Start
		List<TStockInout> inoutList = new ArrayList<TStockInout>();
		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana End

		// 移動実績の件数分、移動[入庫]処理を繰返し
		for (TMoveRecordB recordBody : recordBodyList) {

			// 在庫移動指示ボディ[入庫]
			TMoveInstB instBodyStore = recordBody.getTMoveInstB();
			if (instBodyStore.isInoutType$1()) {
				// 出庫はスキップ
				continue;
			}

			// ===== 入庫Noマージフラグの設定 =====

			// 下記パラメータを設定して在庫更新チェック.入庫ＮＯマージチェックメソッドを呼出し
			stockUpdateCheckLogic.onsNumMergeCheck(instHeader, instBodyStore, recordBody, errSts);
			if (0 < getErrorManager().size()) {
				// エラーが登録されている場合、処理終了
				return null;
			}

			// ===== 入庫の在庫更新 =====

			if (recordBody.isStoreNoMergeFlg$1()) {
				// 入庫Noマージフラグ が「マージする」の場合

				// ===== マージ先の在庫検索 =====

				// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana Start
				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
				// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start
				// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana Start

				// ロット検索の条件
				StockSelectLotCondition.Builder lotCondition = StockSelectLotCondition.builder()
						.clientId(instHeader.getClientId())
						.productId(instBodyStore.getProductId())
						.stockTypeId(instBodyStore.getStockTypeId())
						.locationId(recordBody.getLocationId())
						.depositId(instBodyStore.getDepositId())
						.lotId(instBodyStore.getLotId())
						.shapeId(instBodyStore.getShapeId())
						.joinStoreNo(true)
						.selectMerge(true)
						.forcedMerge(true);

				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
				if (manageStoreDtFlg == ManageStoreDtFlg.TRUE) {
					// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
					// 入庫日管理あり

					lotCondition.storeDt(instBodyStore.getStoreDt());
				}

				TStock stock = stockLogic.selectByLot(lotCondition.build(), errSts);

				// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana End
				// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End
				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
				// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana End
				if (0 < getErrorManager().size()) {
					return null;
				}

				// ===== 在庫更新 =====

				// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana Start

				if (stock != null) {
					// マージ先在庫が存在する場合は入庫処理

					// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
					// 在庫更新
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//					TStockInout inout = stockMoveIn_update(stock, instHeader, instBodyStore, recordBody, systemDt, pickingStockLastStoreDt);
					TStockInout inout = stockMoveIn_update(stock, instHeader, instBodyStore, recordBody, systemDt, pickingStockLastStoreDt, receiveLabelList);
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
					// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End

					inoutList.add(inout);
					// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana End

					// ===== 次の入庫へ =====
					continue;
				}
			}

			if (instBodyStore.getStoreNoId() != null) {
				// 入庫Noが指定されている場合

				// ===== 入庫Noで在庫検索 =====

				// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana Start
				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
				// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
				// 入庫No指定で検索
				TStock stock = stockMoveIn_selectByStoreNo(instHeader, instBodyStore, recordBody, clientCenter.getMParamAsOne().getStoreDtFlgAsStoreDtFlg(), errSts);
				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
				// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End
				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
				// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana End
				if (0 < getErrorManager().size()) {
					// エラーが登録されている場合
					return null;
				}

				// ===== 在庫更新 =====

				if (stock != null) {
					// 登録先の在庫が検索できた場合は入庫処理

					// 在庫移動の入庫No分割を削除(在庫の移動中チェックを削除) 2016.03.11 kawana

					// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana Start
					// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
					// 在庫更新
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//					TStockInout inout = stockMoveIn_update(stock, instHeader, instBodyStore, recordBody, systemDt, pickingStockLastStoreDt);
					TStockInout inout = stockMoveIn_update(stock, instHeader, instBodyStore, recordBody, systemDt, pickingStockLastStoreDt, receiveLabelList);
					//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
					// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End

					inoutList.add(inout);
					// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana End

					// ===== 次の入庫へ =====
					continue;
				}
			}

			// ===== 在庫の新規登録 =====

			// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana Start
			// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
			// 在庫登録
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//			TStockInout inout = stockMoveIn_insert(instHeader, instBodyStore, recordBody, systemDt, pickingStockLastStoreDt);
			TStockInout inout = stockMoveIn_insert(instHeader, instBodyStore, recordBody, systemDt, pickingStockLastStoreDt, receiveLabelList);
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
			// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End
			inoutList.add(inout);
			// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana End
		}

		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana Start
		return inoutList;
		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana End
	}

	// [セット品対応] 在庫移動の出庫指示、入庫指示の「1」対「多」に対応 2015.11.19 kawana End

	/**
	 * <h2>在庫移動[入庫] 入庫ラベルNoでの在庫検索。</h2>
	 */
	private TStock stockMoveIn_selectByStoreNo(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, CDef.StoreDtFlg manageStoreDtFlg, ErrorStatus errSts) {

		// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana Start

		// ===== 入庫ラベルNo.不正チェック =====

		String storeLabelNo = tStoreNoBhv.selectByPKValue(instBody.getStoreNoId()).getStoreLabelNo();

		// 在庫情報の変更チェック
		TStock checkStock = new TStock();
		checkStock.setClientId(instHeader.getClientId());
		checkStock.setProductId(instBody.getProductId());
		checkStock.setStockTypeId(instBody.getStockTypeId());
		checkStock.setDepositId(instBody.getDepositId());
		checkStock.setLotId(instBody.getLotId());
		checkStock.setShapeId(instBody.getShapeId());
		checkStock.setLocationId(recordBody.getLocationId());
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		TStoreNo checkStoreNo = new TStoreNo();
		checkStoreNo.setSupplierId(instBody.getSupplierId());
		checkStoreNo.setStoreDt(instBody.getStoreDt());
		checkStock.setTStoreNo(checkStoreNo);

		stockUpdateCheckLogic.checkStoreLabelNo(storeLabelNo, checkStock, manageStoreDtFlg, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana End

		// ===== 登録先の在庫の取得 =====

		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana Start
		TStock stock = stockLogic.selectByStoreNoAndLocation(instBody.getStoreNoId(), recordBody.getLocationId(), true, errSts);
		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana End
		if (0 < getErrorManager().size()) {
			return null;
		}
		return stock;
	}

	/**
	 * 在庫移動［入庫］ 在庫更新
	 * @return 入庫した在庫の在庫受払
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	private TStockInout stockMoveIn_update(TStock stock, TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, String systemDt, String pickingStockLastStoreDt) {
	private TStockInout stockMoveIn_update(TStock stock, TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, String systemDt, String pickingStockLastStoreDt, List<TReceiveLabel> receiveLabelList) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// ===== 在庫更新 =====
		if (WCC.isZero(stock.getChargeNum()) && WCC.isZero(stock.getAllocNum())) {

			stock.setClientId(instHeader.getClientId());
			stock.setWarehouseId(getWarehouseId(recordBody.getLocationId()));
			stock.setProductId(instBody.getProductId());
			stock.setStockTypeId(instBody.getStockTypeId());
			stock.setDepositId(instBody.getDepositId());
			stock.setLotId(instBody.getLotId());
			stock.setShapeId(instBody.getShapeId());
			// [#3149] 入数の設定を削除 2017.12.04 kawana
			stock.setChargeNum(recordBody.getMoveNum());
		} else {

			// 更新在庫があっているかをチェック
			if (((instHeader.getClientId() == null) ? false : (stock.getClientId().longValue() != instHeader.getClientId().longValue())) ||
					((instBody.getProductId() == null) ? false : (stock.getProductId().longValue() != instBody.getProductId().longValue())) ||
					((instBody.getStockTypeId() == null) ? false : (stock.getStockTypeId().longValue() != instBody.getStockTypeId().longValue())) ||
					((instBody.getDepositId() == null) ? false : (stock.getDepositId().longValue() != instBody.getDepositId().longValue())) ||
					((instBody.getLotId() == null) ? false : (stock.getLotId().longValue() != instBody.getLotId().longValue())) ||
					// [#3149] 入数の変更チェックを削除 2017.12.04 kawana Start
					((instBody.getShapeId() == null) ? false : (stock.getShapeId().longValue() != instBody.getShapeId().longValue()))) {
				// [#3149] 入数の変更チェックを削除 2017.12.04 kawana End

				getErrorManager().throwException(new IllegalStateException("update stock does not match."));
			}

			stock.setChargeNum(WCC.add(stock.getChargeNum(), recordBody.getMoveNum()));
		}

		tStockBhv.update(stock);

		// ===== 在庫日報登録 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setMovePlsNumDay(WCC.add(stockReport.getMovePlsNumDay(), recordBody.getMoveNum()));
		stockReport.setMovePlsNumMonth(WCC.add(stockReport.getMovePlsNumMonth(), recordBody.getMoveNum()));
		// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
		stockReport.setLastStoreDt(getNewDt(stockReport.getLastStoreDt(), pickingStockLastStoreDt));
		// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End

		tStockReportBhv.update(stockReport);

		// =====  在庫受払登録  =====
		TStockInout stockInout = new TStockInout();

		stockInout.setMoveRecordBId(recordBody.getMoveRecordBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(instHeader.getProcessTypeId());
		stockInout.setProcessNo(recordBody.getProcessNo());
		stockInout.setCorrectType_$0();
		stockInout.setStockId(stock.getStockId());
		stockInout.setInoutType_$0();
		stockInout.setStockInoutNum(recordBody.getMoveNum());

		tStockInoutBhv.insert(stockInout);

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		// 入荷ラベル情報を登録する。
		receiveLabelManageLogic.updateLabel(receiveLabelList, stock.getStockId(), stock.getMLocation().getLocationCd());
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

		// 移動指示ボディの入庫ラベルを実績値に更新 2016.03.11 kawana Start
		instBody.setStoreNoId(stock.getStoreNoId());
		instBody.setStoreLabelNo(stock.getTStoreNo().getStoreLabelNo());
		// 移動指示ボディの入庫ラベルを実績値に更新 2016.03.11 kawana End

		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana Start
		stockInout.setTStock(stock);
		return stockInout;
		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana End
	}

	/**
	 * 在庫移動［入庫］ 在庫登録
	 * @return 入庫した在庫の在庫受払
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	private TStockInout stockMoveIn_insert(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, String systemDt, String pickingStockLastStoreDt) {
	private TStockInout stockMoveIn_insert(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, String systemDt, String pickingStockLastStoreDt, List<TReceiveLabel> receiveLabelList) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// 荷姿ID
		long shapeId = instBody.getShapeId();

		// [セット品対応] 在庫移動の出庫指示、入庫指示の「1」対「多」に対応 2015.11.19 kawana Start
		if (instBody.getStoreNoId() == null) {

			// ===== 入庫No.登録 =====
			TStoreNo storeNo;
			String storeLabelNo = instBody.getStoreLabelNo();
			String storeDt = instBody.getStoreDt();
			if (CU.isNullOrEmpty(storeDt)) {
				storeDt = systemDt;
			}
			if (CU.isNullOrEmpty(storeLabelNo)) {
				// 入庫ラベルの指定がない場合

				// 入庫ラベルを採番して登録した入庫Noを取得
				storeNo = storeNoManageLogic.insertNewNumberingLabel(instBody.getSupplierId(), storeDt, instBody.getOldStoreNoId());
			} else {

				// 検索または登録した入庫Noを取得
				storeNo = storeNoManageLogic.selectOrInsertStoreNo(storeLabelNo, instBody.getSupplierId(), storeDt, instBody.getOldStoreNoId());
			}

			instBody.setStoreNoId(storeNo.getStoreNoId());
			// 移動指示ボディの入庫ラベルを実績値に更新 2016.03.11 kawana Start
			instBody.setStoreLabelNo(storeNo.getStoreLabelNo());
			// 移動指示ボディの入庫ラベルを実績値に更新 2016.03.11 kawana End
		}
		// [セット品対応] 在庫移動の出庫指示、入庫指示の「1」対「多」に対応 2015.11.19 kawana End

		// ===== 在庫登録 =====
		TStock stock = new TStock();
		stock.setClientId(instHeader.getClientId());
		stock.setWarehouseId(getWarehouseId(recordBody.getLocationId()));
		stock.setProductId(instBody.getProductId());
		stock.setStockTypeId(instBody.getStockTypeId());
		stock.setLocationId(recordBody.getLocationId());
		stock.setDepositId(instBody.getDepositId());
		stock.setLotId(instBody.getLotId());
		stock.setShapeId(shapeId);
		stock.setStoreNoId(instBody.getStoreNoId());
		// [#3149] 入数の設定を削除 2017.12.04 kawana
		stock.setChargeNum(recordBody.getMoveNum());

		tStockBhv.insert(stock);

		// ===== 在庫日報登録 =====
		TStockReport stockReport = new TStockReport();

		stockReport.setStockId(stock.getStockId());
		stockReport.setMovePlsNumDay(recordBody.getMoveNum());
		stockReport.setMovePlsNumMonth(recordBody.getMoveNum());
		// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana Start
		stockReport.setLastStoreDt(pickingStockLastStoreDt);
		// [1.1.4-CT-063] 在庫移動先の最新入庫日に移動元の最新入庫日を引継 2016.05.25 kawana End

		tStockReportBhv.insert(stockReport);

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		stockInout.setMoveRecordBId(recordBody.getMoveRecordBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(instHeader.getProcessTypeId());
		stockInout.setProcessNo(recordBody.getProcessNo());
		stockInout.setCorrectType_$0();
		stockInout.setStockId(stock.getStockId());
		stockInout.setInoutType_$0();
		stockInout.setStockInoutNum(recordBody.getMoveNum());

		tStockInoutBhv.insert(stockInout);

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		String locationCd;

		if (recordBody.getMLocation() != null) {
			locationCd = recordBody.getMLocation().getLocationCd();
		} else {
			MLocation mLocation = new MLocation();
			mLocation.setLocationId(recordBody.getLocationId());
			mLocation = locationLogic.getPkEntityWithDeletedCheck(mLocation);
			locationCd = mLocation.getLocationCd();
		}
		// 入荷ラベル情報を登録する。
		receiveLabelManageLogic.updateLabel(receiveLabelList, stock.getStockId(), locationCd);
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]
		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana Start
		stockInout.setTStock(stock);
		return stockInout;
		// レスポンス対策 - 在庫移動で入庫した在庫受払を返却 2016.02.19 kawana End
	}

	/**
	 * <h2>在庫調整［＋］。</h2>
	 * <pre>
	 * 在庫調整（＋）の在庫更新処理
	 * パラメータの在庫移動実績数で在庫を追加する
	 * 在庫が存在しない場合は、在庫を新規に登録する
	 * 在庫を新規登録する時に入庫Noを新規に登録し、ロットが登録されていない場合はロットを新規に登録する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・採番マスタ
	 *   ・倉庫マスタ
	 *   ・荷姿マスタ
	 *   ・商品荷姿マスタ
	 *   ・荷主センタマスタ
	 * 【更新または登録テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・ロット
	 *   ・入庫No.
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (在庫移動指示ボディ)
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・ロット
	 *  ・期限日
	 *  ・入庫ラベルNo
	 *  (在庫移動実績ボディ)
	 *  ・在庫移動実績ボディID
	 *  ・処理No.
	 *  ・ロケーションID
	 *  ・在庫移動実績数
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBody 在庫移動指示ボディ
	 * @param recordBody 在庫移動実績ボディ
	 * @param receiveLabelList 入庫する入荷ラベルのリスト（ラベル指定での調整は入荷ラベルのリストをセットする。ラベル指定以外は不要）
	 * @param errSts エラーステータス
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	public void stockAdjustmentPlus(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, ErrorStatus errSts) {
	public void stockAdjustmentPlus(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// [#1074] 在庫調整で入庫ラベルNo.指定されていてもマージ設定を優先するように変更(ロジックを別クラスに移動) 2017.02.27 kawana Start

		// 在庫

		TStock stock = new TStock();
		stock.setClientId(instHeader.getClientId());
		stock.setProductId(instBody.getProductId());
		stock.setLocationId(recordBody.getLocationId());
		stock.setStockTypeId(instBody.getStockTypeId());
		stock.setDepositId(instBody.getDepositId());
		stock.setShapeId(instBody.getShapeId());

		// ロット

		stock.setLotId(instBody.getLotId());

		TLot lot = new TLot();
		lot.setLotId(instBody.getLotId());
		lot.setProductId(instBody.getProductId());
		lot.setLot(instBody.getLot());
		lot.setLimitDt(instBody.getLimitDt());

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
		lot.setProdDt(instBody.getProdDt());
		lot.setReceiveDt(instBody.getStoreDt());
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

		stock.setTLot(lot);

		// 入庫No.

		stock.setStoreNoId(instBody.getStoreNoId());

		TStoreNo storeNo = new TStoreNo();
		storeNo.setStoreNoId(instBody.getStoreNoId());
		storeNo.setStoreLabelNo(instBody.getStoreLabelNo());
		storeNo.setSupplierId(instBody.getSupplierId());
		storeNo.setStoreDt(instBody.getStoreDt());

		stock.setTStoreNo(storeNo);

		// 在庫受払

		TStockInout stockInout = new TStockInout();

		stockInout.setMoveRecordBId(recordBody.getMoveRecordBId());
		stockInout.setProcessTypeId(instHeader.getProcessTypeId());
		stockInout.setProcessNo(recordBody.getProcessNo());
		stockInout.setStockInoutNum(recordBody.getMoveNum());

		// 荷主センタマスタ + パラメータマスタ

		MClientCenter clientCenter = selectClientCenterWithParam(instHeader.getClientId(), instHeader.getCenterId());

		// 在庫の入庫処理

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//		subLogicStore.storeStock(stock, stockInout, clientCenter, StockUpdateSubStore.StoreCallMethod.ADJUST, errSts);
		subLogicStore.storeStock(stock, stockInout, clientCenter, StockUpdateSubStore.StoreCallMethod.ADJUST, receiveLabelList, errSts);
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// [#1074] 在庫調整で入庫ラベルNo.指定されていてもマージ設定を優先するように変更(ロジックを別クラスに移動) 2017.02.27 kawana End
	}

//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
	/**
	 * @deprecated 旧呼び出しパラメータを使用しています。入荷ラベルが追加されたパラメータを使用してください。(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts) {
	 */
	public void stockAdjustmentPlus(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, ErrorStatus errSts) {
		getErrorManager().throwException(new IllegalArgumentException("旧呼び出しパラメータを使用しています。入荷ラベルが追加されたパラメータを使用してください。(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts) {"));
	}
//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

	// [#1074] 在庫調整で入庫ラベルNo.指定されていてもマージ設定を優先するように変更(ロジックを別クラスに移動)(移動したメソッドを削除) 2017.02.27 kawana

	/**
	 * <h2>在庫調整［－］。</h2>
	 * <pre>
	 * 在庫調整（－）の在庫更新処理
	 * パラメータの在庫移動実績数で在庫を削減する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・荷姿マスタ
	 *   ・荷主センタマスタ
	 * 【更新テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・在庫受払
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  ・処理区分ID
	 *  (在庫移動指示ボディ)
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・ロットID
	 *  ・入庫No.ID
	 *  (在庫移動実績ボディ)
	 *  ・在庫移動実績ボディID
	 *  ・処理No.
	 *  ・ロケーションID
	 *  ・在庫移動実績数
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBody 在庫移動指示ボディ
	 * @param recordBody 在庫移動実績ボディ
	 * @param errSts エラーステータス
	 */
	public void stockAdjustmentMinus(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, ErrorStatus errSts) {

		// [C-CWMS-0049] 荷姿をピース荷姿に設定 2015.12.28 kawana Start
		MClientCenter clientCenter = selectClientCenterWithParam(instHeader.getClientId(), instHeader.getCenterId());
		// システム日付取得
		String systemDt = clientCenter.getSystemDt();

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start
		// 荷姿ID (ピース荷姿ID)の設定
		instBody.setShapeId(productShapeLogic.getPieceShapeId(instBody.getProductId()));
		// [#2961] 複数荷姿対応 2017.11.09 kawana End
		// [C-CWMS-0049] 荷姿をピース荷姿に設定 2015.12.28 kawana End

		// ===== 在庫検索 =====
		TStockCB stockCb = tStockBhv.newMyConditionBean();
		stockCb.setupSelect_TStockReportAsOne();

		stockCb.checkInvalidQuery();

		Long storeNoId = instBody.getStoreNoId();
		if (storeNoId != null) {
			//  instBody.入庫NoIDが指定されている場合

			stockCb.query().setStoreNoId_Equal(storeNoId);
			stockCb.query().setLocationId_Equal(recordBody.getLocationId());
			// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana
		} else {
			//  instBody.入庫NoIDが指定されていない場合

			stockCb.query().setProductId_Equal(instBody.getProductId());
			stockCb.query().setStockTypeId_Equal(instBody.getStockTypeId());
			stockCb.query().setLocationId_Equal(recordBody.getLocationId());
			stockCb.query().setDepositId_Equal(instBody.getDepositId());
			stockCb.query().setLotId_Equal(instBody.getLotId());
			// [C-CWMS-0049] 荷姿をピース荷姿に設定 2015.12.28 kawana Start
			stockCb.query().setShapeId_Equal(instBody.getShapeId());
			// [C-CWMS-0049] 荷姿をピース荷姿に設定 2015.12.28 kawana End
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start
			stockCb.query().setClientId_Equal(instHeader.getClientId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End

			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
			if (instBody.getSupplierId() != null) {
				stockCb.query().queryTStoreNo().setSupplierId_Equal(instBody.getSupplierId());
			}

			if (!CU.isNullOrEmpty(instBody.getStoreDt())) {
				stockCb.query().queryTStoreNo().setStoreDt_Equal(instBody.getStoreDt());
			}
			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

			stockCb.query().setChargeNum_GreaterThan(WCC.ZERO);
		}
		List<TStock> stockList = tStockBhv.selectList(stockCb);

		// ===== 結果の判定 =====
		int size = stockList.size();

		TStock stock = null;
		// 結果確認
		if (size == 0) {
			// 0件の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.STOCK_DATA_NOT_FOUND_ERROR);
			return;
		} else if (1 < size) {
			// 2件以上の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
			return;
		} else {
			// 1件の場合

			// 在庫を取得
			stock = stockList.get(0);

			// 引当可能数のチェック
			if (WCC.isLessThan(stock.getChargeNum(), recordBody.getMoveNum())) {

				// エラー管理クラスにエラーを登録
				getErrorManager().add(errSts, WmsCoreMessageConst.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR);
				return;
			}
		}

		// ===== 在庫更新 =====
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		stockAdjustmentMinus_update(stock, instHeader, recordBody, systemDt);
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
	}

	/**
	 * 在庫調整［－］ 在庫更新
	 */
	private void stockAdjustmentMinus_update(TStock stock, TMoveInstH instHeader, TMoveRecordB recordBody, String systemDt) {

		// [C-CWMS-0048] 入庫日管理対応(不要になった処理を削除) 2015.12.28 kawana

		// ===== 在庫更新 =====
		stock.setChargeNum(WCC.subtract(stock.getChargeNum(), recordBody.getMoveNum()));

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====
		TStockReport stockReport = stock.getTStockReportAsOne();

		stockReport.setAdjMnsNumDay(WCC.add(stockReport.getAdjMnsNumDay(), recordBody.getMoveNum()));
		stockReport.setAdjMnsNumMonth(WCC.add(stockReport.getAdjMnsNumMonth(), recordBody.getMoveNum()));

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====
		TStockInout stockInout = new TStockInout();

		stockInout.setMoveRecordBId(recordBody.getMoveRecordBId());
		stockInout.setProcessDt(systemDt);
		stockInout.setProcessTypeId(instHeader.getProcessTypeId());
		stockInout.setProcessNo(recordBody.getProcessNo());
		stockInout.setCorrectType_$0();
		stockInout.setStockId(stock.getStockId());
		stockInout.setInoutType_$1();
		stockInout.setStockInoutNum(recordBody.getMoveNum());

		tStockInoutBhv.insert(stockInout);
	}

	/**
	 * 倉庫IDの取得
	 *
	 * @param locationId ロケーションID
	 * @return 倉庫ID
	 */
	private long getWarehouseId(long locationId) {

		MLocation condition = new MLocation();
		condition.setLocationId(locationId);

		return locationLogic.getPkEntityWithWarehouseAndDeletedCheck(condition).getMZone().getWarehouseId();
	}

	//【Ver1.1.1】[C-CWMS-0035] 在庫区分IDの取得メソッドを削除 2015.08.12 hayashi

	/**
	 * システム日付の取得
	 *
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @return システム日付（文字列）
	 */
	private String getSytemDt(long clientId, long centerId) {

		MClientCenter condition = new MClientCenter();
		condition.setClientId(clientId);
		condition.setCenterId(centerId);

		// レスポンス対策 2016.01.22 kawana Start
		return clientCenterLogic.getUkEntityCacheable(condition).getSystemDt();
		// レスポンス対策 2016.01.22 kawana End
	}

	/**
	 * 処理区分IDの取得
	 *
	 * @param ProcessType 処理種別
	 * @return 処理区分ID
	 */
	private long getProcessTypeId(ProcessType type) {
		MProcessType condition = new MProcessType();

		switch (type) {
		// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana Start
		case STORE_NO_DIVIDED_SRC:
		case STORE_NO_DIVIDED_DST:
			condition.setProcessTypeCd(CDef.ProcessTypeCd.$27.code());
			break;
		case FORCED_MOVE_SRC:
		case FORCED_MOVE_DST:
			condition.setProcessTypeCd(CDef.ProcessTypeCd.$29.code());
			break;
		// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana End
		}

		return processTypeLogic.getUkEntityWithDeletedCheck(condition).getProcessTypeId();
	}

	// [#3149] 入数チェックの除去 (未使用になったメソッドの削除) 2017.12.04 kawana

	// [セット品対応] 入庫Noの検索、登録をクラス化(入庫ラベルの採番メソッドを削除) 2015.11.19 kawana

	// [ON推-品向-437] 既存の入庫ラベルNo.チェックを追加 2014.12.16 kawana Start

	// [ON推-品向-1155] 入荷実績訂正するとマージ先在庫の在庫区分などが変わってしまう問題を修正 2016.05.12 kawana Start

	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消(不要になったメソッド削除) 2016.10.18 kawana

	// [ON推-品向-1155] 入荷実績訂正するとマージ先在庫の在庫区分などが変わってしまう問題を修正 2016.05.12 kawana End

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(ここから削除してStockUpdateCheckLogicに移動) 2018.04.11 kawana Delete

	// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start

	/**
	 * <h2>荷主センタマスタを取得する</h2>
	 *
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @return システム日付（文字列）
	 */
	private MClientCenter selectClientCenterWithParam(long clientId, long centerId) {

		MClientCenter condition = new MClientCenter();
		condition.setClientId(clientId);
		condition.setCenterId(centerId);

		// レスポンス対策 2016.01.22 kawana Start
		return clientCenterLogic.getUkEntityCacheable(condition);
		// レスポンス対策 2016.01.22 kawana End
	}

	// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

	// [1.1.4-CT-032] 入庫日を変更しても最新入庫日が変わらない問題を修正 2016.05.17 kawana Start
	/**
	 * 新しい方の日付を取得
	 */
	private String getNewDt(String dt1, String dt2) {
		if (CU.isNullOrEmpty(dt1)) {
			return dt2;
		}

		if (CU.isNullOrEmpty(dt2)) {
			return dt1;
		}

		if (0 < dt1.compareTo(dt2)) {
			return dt1;
		} else {
			return dt2;
		}
	}
	// [1.1.4-CT-032] 入庫日を変更しても最新入庫日が変わらない問題を修正 2016.05.17 kawana End


}
