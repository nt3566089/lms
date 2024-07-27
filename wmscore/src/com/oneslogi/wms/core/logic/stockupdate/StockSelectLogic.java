package com.oneslogi.wms.core.logic.stockupdate;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫検索ロジック
 */
public class StockSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;

	/**
	 * <h2>在庫検索（在庫ID）。</h2>
	 * <pre>
	 * パラメータの在庫IDで在庫を検索する
	 * </pre>
	 * @param stockId 在庫ID
	 * @return TStock 在庫
	 */
	public TStock selectByPk(Long stockId) {

		TStock result = null;

		TStockCB stockCb = tStockBhv.newMyConditionBean();
		stockCb.setupSelect_TStockReportAsOne();
		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start
		stockCb.setupSelect_MProduct();
		stockCb.setupSelect_TLot();
		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana End
		// レスポンス対策 - 処理全体を見直し修正 2016.02.24 kawana Start
		stockCb.setupSelect_MStockType();
		stockCb.setupSelect_MLocation().withMZone();
		stockCb.setupSelect_TStoreNo();
		// レスポンス対策 - 処理全体を見直し修正 2016.02.24 kawana End

		stockCb.checkInvalidQuery();
		stockCb.query().setStockId_Equal(stockId);

		// 検索実行
		result = tStockBhv.selectEntityWithDeletedCheck(stockCb);

		return result;
	}

	// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
	/**
	 * <h2>在庫検索（ロット）。</h2>
	 * <pre>
	 * パラメータを条件に引当可能数が1以上の在庫を検索する
	 * 0件の場合はnullを返す
	 * 2件以上の場合は、エラーを登録する
	 * </pre>
	 *
	 * @param condition ロット検索の条件クラス
	 * @param errSts エラー時に設定するエラーステータス
	 * @return TStock 在庫
	 */
	public TStock selectByLot(StockSelectLotCondition condition, ErrorStatus errSts) {

		TStock result = null;

		// 検索実行
		List<TStock> stockList = selectListByLot(condition);
		int size = stockList.size();

		// 結果確認
		if (size == 1) {

			result = stockList.get(0);
		} else if (1 < size) {
			// 2件以上の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.STOCK_CANNOT_SPECIFY_ERROR);
		}

		return result;
	}

	/**
	 * <h2>在庫検索（ロット）。</h2>
	 * <pre>
	 * パラメータを条件に引当可能数が1以上の在庫を検索する
	 * </pre>
	 *
	 * @param condition ロット検索の条件クラス
	 * @return 在庫リスト
	 */
	public List<TStock> selectListByLot(StockSelectLotCondition condition) {

		TStockCB stockCb = tStockBhv.newMyConditionBean();
		stockCb.setupSelect_TStockReportAsOne();
		if (condition.isJoinStoreNo()) {
			stockCb.setupSelect_TStoreNo();
		}

		stockCb.checkInvalidQuery();
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start
		stockCb.query().setClientId_Equal(condition.getClientId());
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End
		stockCb.query().setProductId_Equal(condition.getProductId());
		stockCb.query().setStockTypeId_Equal(condition.getStockTypeId());
		stockCb.query().setLocationId_Equal(condition.getLocationId());
		stockCb.query().setDepositId_Equal(condition.getDepositId());
		stockCb.query().setLotId_Equal(condition.getLotId());
		stockCb.query().setShapeId_Equal(condition.getShapeId());
		// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana Start
		if (condition.isSelectMerge()) {
			stockCb.orScopeQuery(new OrQuery<TStockCB>() {
				public void query(TStockCB orCB) {
					orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
					orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
					orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
				}
			});

			// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana Start
			if (condition.isForcedMerge()) {
				// 複数件あっても強制的にマージ先を特定

				stockCb.query().addOrderBy_ChargeNum_Desc();
				stockCb.query().addOrderBy_AllocNum_Desc();
				stockCb.query().addOrderBy_MoveNum_Desc();
				stockCb.query().addOrderBy_StockId_Desc();
				stockCb.fetchFirst(1);
			}
			// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana End
		} else {
			stockCb.query().setChargeNum_GreaterThan(WCC.ZERO);
		}
		// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana End
		if (condition.isSetStoreDt()) {
			if (CU.isNullOrEmpty(condition.getStoreDt())) {
				stockCb.query().queryTStoreNo().setStoreDt_IsNull();
			} else {
				stockCb.query().queryTStoreNo().setStoreDt_Equal(condition.getStoreDt());
			}
		}

		// 検索実行
		List<TStock> stockList = tStockBhv.selectList(stockCb);

		return stockList;
	}

	// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

	/**
	 * <h2>在庫検索（入庫No.）。</h2>
	 * <pre>
	 * パラメータを条件に引当可能数が1以上の在庫を検索する
	 * 0件の場合はnullを返す
	 * 2件以上の場合は、エラーを登録する
	 * </pre>
	 * @param storeNoId 入庫No.ID
	 * @param errSts エラーステータス
	 * @return TStock 在庫
	 */
	public TStock selectByStoreNo(Long storeNoId, ErrorStatus errSts) {

		TStock result = null;

		TStockCB stockCb = tStockBhv.newMyConditionBean();
		stockCb.setupSelect_TStockReportAsOne();
		// [ON推-品向-438] 全数出庫のチェックに仕入先の一致チェックを追加 2014.12.15 kawana Start
		stockCb.setupSelect_TStoreNo();
		// [ON推-品向-438] 全数出庫のチェックに仕入先の一致チェックを追加 2014.12.15 kawana End
		stockCb.checkInvalidQuery();
		stockCb.query().setStoreNoId_Equal(storeNoId);
		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana
		stockCb.query().setChargeNum_GreaterThan(WCC.ZERO);

		// 検索実行
		List<TStock> stockList = tStockBhv.selectList(stockCb);

		int size = stockList.size();

		// 結果確認
		if (size == 1) {

			result = stockList.get(0);
		} else if (1 < size) {
			// 2件以上の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
		}

		return result;
	}

	/**
	 * <h2>在庫検索（入庫No、ロケーションID）。</h2>
	 * <pre>
	 * 入庫No.IDとロケーションIDを条件に在庫を検索する
	 * 0件の場合はnullを返す
	 * 2件以上の場合は、エラーを登録する
	 * </pre>
	 * @param storeNoId 入庫No.ID
	 * @param locationId ロケーションID
	 * @param errSts エラーステータス
	 * @return TStock 在庫
	 */
	public TStock selectByStoreNoAndLocation(Long storeNoId, Long locationId, ErrorStatus errSts) {

		return selectByStoreNoAndLocation(storeNoId, locationId, false, errSts);
	}

	// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End

	/**
	 * <h2>在庫検索（入庫No、ロケーションID）。</h2>
	 * <pre>
	 * 入庫No.IDとロケーションIDを条件に在庫を検索する
	 * 0件の場合はnullを返す
	 * 2件以上の場合は、エラーを登録する
	 * </pre>
	 * @param storeNoId 入庫No.ID
	 * @param locationId ロケーションID
	 * @param joinStoreNo 入庫Noテーブルの結合有無
	 * @param errSts エラーステータス
	 * @return TStock 在庫
	 */
	public TStock selectByStoreNoAndLocation(Long storeNoId, Long locationId, boolean joinStoreNo, ErrorStatus errSts) {

		TStock result = null;

		TStockCB stockCb = tStockBhv.newMyConditionBean();
		stockCb.setupSelect_TStockReportAsOne();

		if (joinStoreNo) {
			stockCb.setupSelect_TStoreNo();
		}

		stockCb.checkInvalidQuery();
		stockCb.query().setStoreNoId_Equal(storeNoId);
		stockCb.query().setLocationId_Equal(locationId);
		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana

		// 検索実行
		List<TStock> stockList = tStockBhv.selectList(stockCb);

		int size = stockList.size();

		// 結果確認
		if (size == 1) {

			result = stockList.get(0);
		} else if (1 < size) {
			// 2件以上の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
		}

		return result;
	}

	/**
	 * <h2>別ロケーシュンの在庫検索（入庫No.）。</h2>
	 * <pre>
	 * パラメータのロケーションID以外の在庫を検索する
	 * 0件の場合はnullを返す
	 * 2件以上の場合は例外をスローする
	 * </pre>
	 * @param storeNoId 入庫No.ID
	 * @param locationId ロケーションID
	 * @return TStock 在庫
	 */
	public TStock selectOtherLocationByStoreNo(Long storeNoId, Long locationId) {

		TStock result = null;

		TStockCB stockCb = tStockBhv.newMyConditionBean();
		stockCb.setupSelect_TStockReportAsOne();

		stockCb.checkInvalidQuery();
		stockCb.query().setStoreNoId_Equal(storeNoId);
		stockCb.query().setLocationId_NotEqual(locationId);
		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana
		stockCb.query().setChargeNum_GreaterThan(WCC.ZERO);

		// 検索実行
		result = tStockBhv.selectEntity(stockCb);

		return result;
	}

}
