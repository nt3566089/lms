package com.oneslogi.wms.logic.inventory;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 棚卸データ作成チェックロジッククラス
 */
public class StockAdjustFlagCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/*棚卸ボディ*/
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	@Inject
	private TStockBhv tStockBhv;

	// ===== 使用ロジッククラス =====


	// [検査-137] 1件checkを削除 2014.11.28 SJA-ZHENG

	// [検査-137] メッセージは出力チェックを追加 2014.11.28 SJA-ZHENG Start
	/**
	 * <h2>棚卸データの存在チェックを行う。</h2>
	 * <pre>
	 * 受取った条件で棚卸データを取得し、
	 * データが存在した場合、データを上書きするかの確認をエラーステータス情報に設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日・荷主ID・センタID
	 * @param tInventoryB 棚卸ボディ：倉庫ID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)・在庫有フラグ（引当可能数＋引当済数＞０）
	 * @param zoneIdList ゾーンIDリスト：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkTInventory(TInventoryH tInventoryH, TInventoryB tInventoryB
						,TInventoryInst tInventoryInst,List<Long> zoneIdList, ErrorStatus errSts) {
		List<TInventoryB> result = null;

		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocationExentity.setLocationCdTo(tInventoryInst.getToLocationCd());
		LocationLogic LocationLogic = new LocationLogic();
		// 最小、最大ロケーションを取得する
		MLocation maxLocationCd = LocationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = LocationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}

		// ===== 棚卸入力データ取得 =====

		// 検索条件の設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();

		cb.setupSelect_TInventoryH();
		cb.setupSelect_MLocation();
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation().withMZone();

		 //棚卸日
		cb.query().queryTInventoryH().setInventoryDt_Equal(tInventoryH.getInventoryDt());
		//荷主ID
		cb.query().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());
		//センタID
		cb.query().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());
		//倉庫ID
		cb.query().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		//預託ID
		cb.query().setDepositId_Equal(tInventoryInst.getDepositId());
		//在庫区分ID
		cb.query().setStockTypeId_Equal(tInventoryInst.getStockTypeId());

		MLocation mLocation = new MLocation();
		mLocation.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocation.setLocationCdTo(tInventoryInst.getToLocationCd());
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		//ゾーンID
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);

		//在庫調整フラグ
		cb.query().existsTInventoryInpHistList(new SubQuery<TInventoryInpHistCB>() {
		    public void query(TInventoryInpHistCB subCB) {
		    	subCB.query().setInventoryInpHistId_IsNotNull();
		    }
		});

		//在庫有のみフラグが１場合
		if (tInventoryInst.isStockExistOnlyFlg$1()) {
			cb.orScopeQuery(new OrQuery<TInventoryBCB>() {
			    public void query(TInventoryBCB orCB) {
			    	orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
			    	orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
			    	orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
			    }
			});
		}

		// ===== 棚卸入力データ取得実行 =====
		result = tInventoryBBhv.selectList(cb);

		// ===== 取得したデータが存在した場合 =====
		if (result.size() > 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.STOCK_COUNT_CREATE_EXECUTE_OVERWRITE_CONFIRMATION);
			return ;
		}
	}

	/**
	 * <h2>引当済数、移動中数の在庫存在チェックを行う。</h2>
	 * <pre>
	 * 受取った条件で在庫データを取得し、
	 * 引当済数或いは積送中数が0より大きい場合、棚卸データを作成するかの確認をエラーステータス情報に設定する。
	 *
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：荷主ID・センタID
	 * @param tInventoryB 棚卸ボディ：倉庫ID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)・受払日(From)・受払日(To)・在庫有フラグ（引当可能数＋引当済数＞０）
	 * @param zoneIdList ゾーンIDリスト：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkTStock(TInventoryH tInventoryH, TInventoryB tInventoryB
							,TInventoryInst tInventoryInst,List<Long> zoneIdList, ErrorStatus errSts) {
		List<TStock> result = null;

		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocationExentity.setLocationCdTo(tInventoryInst.getToLocationCd());
		LocationLogic LocationLogic = new LocationLogic();
		// 最小、最大ロケーションを取得する
		MLocation maxLocationCd = LocationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = LocationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}

		// 検索条件の設定
		TStockCB cb = tStockBhv.newMyConditionBean();
		//ロケーションマスタ
		cb.setupSelect_MLocation();
		//ゾーンマスタ
		cb.setupSelect_MLocation().withMZone();
		//ロット
		cb.setupSelect_TLot();
		//入庫No．
		cb.setupSelect_TStoreNo();
		//商品マスタ
		cb.setupSelect_MProduct();
		//荷主ID
		cb.query().setClientId_Equal(tInventoryH.getClientId());
		//センタID
		cb.query().queryMLocation().setCenterId_Equal(tInventoryH.getCenterId());
		//倉庫ID
		cb.query().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		//預託ID
		cb.query().setDepositId_Equal(tInventoryInst.getDepositId());
		//在庫区分ID
		cb.query().setStockTypeId_Equal(tInventoryInst.getStockTypeId());
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		//ゾーンコード
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);

		//Existsクエリ
		final String FromDt = tInventoryInst.getFromStockInoutDt();
		final String ToDt = tInventoryInst.getToStockInoutDt();
		cb.query().existsTStockInoutList(new SubQuery<TStockInoutCB>(){
			public void query(TStockInoutCB subCB) {
				subCB.query().setProcessDt_GreaterEqual(FromDt);
		    	subCB.query().setProcessDt_LessEqual(ToDt);
			 }
		});

		//在庫有のみフラグが１場合
		if (tInventoryInst.isStockExistOnlyFlg$1()) {
			cb.orScopeQuery(new OrQuery<TStockCB>() {
			    public void query(TStockCB orCB) {
			    	orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
			    	orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
			    	orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
			    }
			});
		}

		// ===== 在庫データ取得実行 =====
		result = tStockBhv.selectList(cb);

		// ===== 取得したデータが存在した場合 =====
		if (result.size() > 0) {
			for (int i = 0; i < result.size() ; i++) {
				BigDecimal allocNum = result.get(i).getAllocNum();
				BigDecimal moveNum = result.get(i).getMoveNum();
				if (WCC.isPositive(moveNum) || WCC.isPositive(allocNum)){
					this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.STOCK_COUNT_CREATE_COMPLETE_CONTAINED_INTRANSIT_INFORMATION);
					break;
				}
			}
			return ;
		}
	}
	// [検査-137] メッセージは出力チェックを追加 2014.11.28 SJA-ZHENG Start

	// [#71] 棚卸データチェック処理(削除用) 2017.08.23 ase start
	/**
	 * <h2>棚卸データの存在チェックを行う。</h2>
	 * <pre>
	 * 受取った条件で棚卸データを取得し、
	 * データが存在した場合、データを上書きするかの確認をエラーステータス情報に設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日・荷主ID・センタID
	 * @param tInventoryB 棚卸ボディ：倉庫ID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)・在庫有フラグ（引当可能数＋引当済数＞０）
	 * @param zoneIdList ゾーンIDリスト：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkDeleteTInventory(TInventoryH tInventoryH, TInventoryB tInventoryB, TInventoryInst tInventoryInst, List<Long> zoneIdList, ErrorStatus errSts) {
		List<TInventoryB> result = null;

		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocationExentity.setLocationCdTo(tInventoryInst.getToLocationCd());
		LocationLogic LocationLogic = new LocationLogic();
		// 最小、最大ロケーションを取得する
		MLocation maxLocationCd = LocationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = LocationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}

		// ===== 棚卸入力データ取得 =====

		// 検索条件の設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();

		cb.setupSelect_TInventoryH();
		cb.setupSelect_MLocation();
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation().withMZone();

		//棚卸日
		cb.query().queryTInventoryH().setInventoryDt_Equal(tInventoryH.getInventoryDt());
		//荷主ID
		cb.query().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());
		//センタID
		cb.query().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());
		//倉庫ID
		cb.query().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		//預託ID
		cb.query().setDepositId_Equal(tInventoryInst.getDepositId());
		//在庫区分ID
		cb.query().setStockTypeId_Equal(tInventoryInst.getStockTypeId());

		MLocation mLocation = new MLocation();
		mLocation.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocation.setLocationCdTo(tInventoryInst.getToLocationCd());
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		//ゾーンID
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);

		//在庫調整フラグ
		cb.query().existsTInventoryInpHistList(new SubQuery<TInventoryInpHistCB>() {
			public void query(TInventoryInpHistCB subCB) {
				subCB.query().setInventoryInpHistId_IsNotNull();
			}
		});

		//在庫有のみフラグが１場合
		if (tInventoryInst.isStockExistOnlyFlg$1()) {
			cb.orScopeQuery(new OrQuery<TInventoryBCB>() {
				public void query(TInventoryBCB orCB) {
					orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
					orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
					orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
				}
			});
		}

		// ===== 棚卸入力データ取得実行 =====
		result = tInventoryBBhv.selectList(cb);

		// ===== 取得したデータが存在した場合 =====
		if (result.size() > 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.STOCK_COUNT_DELETE_EXECUTE_DELETE_CONFIRMATION);
			return;
		}
	}

	/**
	 * <h2>引当済数、移動中数の在庫存在チェックを行う。</h2>
	 * <pre>
	 * 受取った条件で在庫データを取得し、
	 * 引当済数或いは積送中数が0より大きい場合、棚卸データを作成するかの確認をエラーステータス情報に設定する。
	 *
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：荷主ID・センタID
	 * @param tInventoryB 棚卸ボディ：倉庫ID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)・受払日(From)・受払日(To)・在庫有フラグ（引当可能数＋引当済数＞０）
	 * @param zoneIdList ゾーンIDリスト：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkDeleteTStock(TInventoryH tInventoryH, TInventoryB tInventoryB, TInventoryInst tInventoryInst, List<Long> zoneIdList, ErrorStatus errSts) {
		List<TStock> result = null;

		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocationExentity.setLocationCdTo(tInventoryInst.getToLocationCd());
		LocationLogic LocationLogic = new LocationLogic();
		// 最小、最大ロケーションを取得する
		MLocation maxLocationCd = LocationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = LocationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}

		// 検索条件の設定
		TStockCB cb = tStockBhv.newMyConditionBean();
		//ロケーションマスタ
		cb.setupSelect_MLocation();
		//ゾーンマスタ
		cb.setupSelect_MLocation().withMZone();
		//ロット
		cb.setupSelect_TLot();
		//入庫No．
		cb.setupSelect_TStoreNo();
		//商品マスタ
		cb.setupSelect_MProduct();
		//荷主ID
		cb.query().setClientId_Equal(tInventoryH.getClientId());
		//センタID
		cb.query().queryMLocation().setCenterId_Equal(tInventoryH.getCenterId());
		//倉庫ID
		cb.query().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		//預託ID
		cb.query().setDepositId_Equal(tInventoryInst.getDepositId());
		//在庫区分ID
		cb.query().setStockTypeId_Equal(tInventoryInst.getStockTypeId());
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		//ゾーンコード
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);

		//Existsクエリ
		final String FromDt = tInventoryInst.getFromStockInoutDt();
		final String ToDt = tInventoryInst.getToStockInoutDt();
		cb.query().existsTStockInoutList(new SubQuery<TStockInoutCB>() {
			public void query(TStockInoutCB subCB) {
				subCB.query().setProcessDt_GreaterEqual(FromDt);
				subCB.query().setProcessDt_LessEqual(ToDt);
			}
		});

		//在庫有のみフラグが１場合
		if (tInventoryInst.isStockExistOnlyFlg$1()) {
			cb.orScopeQuery(new OrQuery<TStockCB>() {
				public void query(TStockCB orCB) {
					orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
					orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
					orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
				}
			});
		}

		// ===== 在庫データ取得実行 =====
		result = tStockBhv.selectList(cb);

		// ===== 取得したデータが存在した場合 =====
		if (result.size() > 0) {
			for (int i = 0; i < result.size(); i++) {
				BigDecimal allocNum = result.get(i).getAllocNum();
				BigDecimal moveNum = result.get(i).getMoveNum();
				if (WCC.isPositive(moveNum) || WCC.isPositive(allocNum)) {
					this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.STOCK_COUNT_DELETE_COMPLETE_CONTAINED_INTRANSIT_INFORMATION);
					break;
				}
			}
			return;
		}
	}
	// [#71] 棚卸データチェック処理(削除用) 2017.08.23 ase end

}