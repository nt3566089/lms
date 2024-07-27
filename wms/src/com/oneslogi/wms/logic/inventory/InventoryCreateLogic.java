package com.oneslogi.wms.logic.inventory;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.AndQuery;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryHCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInstCB;
import com.oneslogi.base.dbflute.cbean.TInventoryRCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryHBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInpHistBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryRBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInpHist;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TInventoryR;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 棚卸データ登録ロジッククラス
 */
public class InventoryCreateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TInventoryHBhv tInventoryHBhv;
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	@Inject
	private TInventoryRBhv tInventoryRBhv;
	@Inject
	private TInventoryInstBhv tInventoryInstBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private CustomerLogic customerLogic;
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.09 sja Start
	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Delete
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.09 sja End
	// 棚卸データ削除ボタン追加 2017.07.19 ATK Start
	// 棚卸入力履歴
	@Inject
	private TInventoryInpHistBhv tInventoryInpHistBhv;
	// 棚卸データ削除ボタン追加 2017.07.19 ATK End
	/**
	 * <h2>棚卸データを登録する。</h2>
	 * <pre>
	 * 在庫データを検索し、対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * 在庫の棚卸対象が棚卸データに存在しない場合、
	 * WMS棚卸バッチNo.を採番して、棚卸ヘッダ、棚卸ボディ、棚卸帳票と棚卸指示を登録する。
	 * 既に存在する場合、棚卸ボディを更新して、棚卸指示を登録する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：荷主ID・センタID・棚卸日・在庫有フラグ・受払日(From)・受払日(To)
	 * @param tInventoryB 棚卸ボディ：倉庫ID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)
	 * @param zoneIdList ゾーンマスタ：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
	public void insert(TInventoryH tInventoryH, TInventoryB tInventoryB, TInventoryInst tInventoryInst,List<Long> zoneIdList, ErrorStatus errSts) {
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		List<TStock> result = null;
		long inventoryId;

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

		// ===== 棚卸データ取得 =====

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
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		//在庫有のみフラグ１場合
		if (tInventoryInst.isStockExistOnlyFlg$1()) {
			cb.orScopeQuery(new OrQuery<TStockCB>() {
			    public void query(TStockCB orCB) {
			    //引当可能数
		        orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
		        //引当済数
		        orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
		        //移動中数
		        orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
			    }
			});
		} else {
			//在庫有のみフラグ１以外場合
			cb.orScopeQuery(new OrQuery<TStockCB>() {
				public void query(TStockCB orCB) {
			        orCB.query().queryMLocation().setLocationType_Equal_$00();
			        orCB.orScopeQueryAndPart(new AndQuery<TStockCB>() {
					    public void query(TStockCB andCB) {
					    	andCB.query().queryMLocation().setLocationType_NotEqual_$00();
					    	//引当可能数
					    	andCB.query().setChargeNum_GreaterThan(WCC.ZERO);
					    }
			        });
			        orCB.orScopeQueryAndPart(new AndQuery<TStockCB>() {
					    public void query(TStockCB andCB) {
					    	andCB.query().queryMLocation().setLocationType_NotEqual_$00();
					    	//引当済数
					    	andCB.query().setAllocNum_GreaterThan(WCC.ZERO);
					    }
			        });
                }
			});
		}

		final String FromDt = tInventoryInst.getFromStockInoutDt();
		final String ToDt = tInventoryInst.getToStockInoutDt();
		if ((FromDt != null && FromDt.length() > 0) || (ToDt != null && ToDt.length() > 0)) {
			cb.query().existsTStockInoutList(new SubQuery<TStockInoutCB>() {
			    public void query(TStockInoutCB subCB) {
			    	//処理日
			    	subCB.query().setProcessDt_GreaterEqual(FromDt);
			    	//処理日
			    	subCB.query().setProcessDt_LessEqual(ToDt);
			    }
			});
		}
		// 商品荷姿．入数
		cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
			@Override
			public void query(MProductShapeCB SubCB) {
				SubCB.specify().columnUnitNum();
				setDelFlg(SubCB);
			}
		}, TStock.SHAPE_UnitNum);

		// ===== 棚卸データ検索実行 =====
		result = tStockBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return ;
		}

		// ===== 棚卸ヘッダ登録 =====
		// ===== 棚卸ヘッダの存在チェック =====
		TInventoryHCB cb1 = tInventoryHBhv.newMyConditionBean();
		cb1.checkInvalidQuery();
		cb1.query().setClientId_Equal(tInventoryH.getClientId());
		cb1.query().setCenterId_Equal(tInventoryH.getCenterId());
		cb1.query().setInventoryDt_Equal(tInventoryH.getInventoryDt());

		int cnt = tInventoryHBhv.selectCount(cb1);
		if (cnt == 0) {
			// WMS棚卸バッチNo.を登録する直前に採番
			String batchNum = numberingLogic.getNumbering(tInventoryH.getCenterId(), WmsNumberingConst.INVENTORY_BATCH_NUM);
			tInventoryH.setBatchNum(Long.valueOf(batchNum));

			// ===== 棚卸ヘッダ登録実行 =====
			tInventoryHBhv.insert(tInventoryH);

			//登録後棚卸ヘッダの棚卸ヘッダIDを取得する
			inventoryId = tInventoryH.getInventoryHId();

		}else{
			//データの棚卸ヘッダIDを取得する
			TInventoryH inventory = tInventoryHBhv.selectEntity(cb1);
			inventoryId = inventory.getInventoryHId();
		}

		// ===== 棚卸ボディ登録 =====
		for (TStock tStock: result) {
			TInventoryB tInventory = new TInventoryB();
			// ===== 棚卸ボディの存在チェック =====
			TInventoryBCB cb2 = tInventoryBBhv.newMyConditionBean();
			cb2.checkInvalidQuery();
			cb2.query().setInventoryHId_Equal(inventoryId);
			cb2.query().setStockId_Equal(tStock.getStockId());

			int cnt1 = tInventoryBBhv.selectCount(cb2);
			if (cnt1 == 0) {
				if (CU.nullToZero(tStock.chaseTStoreNo().getSupplierId()) != 0) {
					MCustomer mCustomer = new MCustomer();
					mCustomer.setCustomerId(tStock.chaseTStoreNo().getSupplierId());
					mCustomer = customerLogic.getPkEntity(mCustomer);
					if (mCustomer == null){
						tInventory.setSupplierId(null);
						tInventory.setSupplierCd(null);
					}else{
						tInventory.setSupplierId(tStock.chaseTStoreNo().getSupplierId());
						tInventory.setSupplierCd(mCustomer.getCustomerCd());
					}
				}

                //存在しない場合、棚卸ボディの登録実行
				tInventory.setInventoryHId(inventoryId);
				tInventory.setStockId(tStock.getStockId());
				tInventory.setWarehouseId(tStock.getWarehouseId());
				tInventory.setProductId(tStock.getProductId());
				tInventory.setStockTypeId(tStock.getStockTypeId());
				tInventory.setLocationId(tStock.getLocationId());
				tInventory.setDepositId(tStock.getDepositId());
				tInventory.setLotId(tStock.getLotId());
				tInventory.setLot(tStock.chaseTLot().getLot());
				tInventory.setLimitDt(tStock.chaseTLot().getLimitDt());
				tInventory.setShapeId(tStock.getShapeId());
				tInventory.setStoreNoId(tStock.getStoreNoId());
				tInventory.setStoreLabelNo(tStock.chaseTStoreNo().getStoreLabelNo());
				// [エンハンス PH2.0] 入数の設定値を変更する、入庫日を追加する 2015.12.08 sja Start
				// [#3347][Ver3.0] TODO残対応(UoM) -  WMSコア部在庫更新処理と合わせるため入数の設定を削除 2018.01.15 honma Delete
				tInventory.setStoreDt(tStock.getTStoreNo().getStoreDt());
				// [エンハンス PH2.0] 入数の設定値を変更する、入庫日を追加する 2015.12.08 sja End

				tInventory.setChargeNum(tStock.getChargeNum());
				tInventory.setAllocNum(tStock.getAllocNum());
				tInventory.setMoveNum(tStock.getMoveNum());
				tInventory.setInventoryNum(WCC.ZERO);
				tInventory.setInputType_$00();
				tInventory.setStockAdjustFlg_$0();
    			// ===== 棚卸ボディ登録実行 =====
    			tInventoryBBhv.insert(tInventory);

    			//棚卸帳票登録用のエンティティ編集
    			TInventoryR tInventoryR = new TInventoryR();
    			tInventoryR.setInventoryBId(tInventory.getInventoryBId());
    			tInventoryR.setTwlOutFlg_$0();

    			// ===== 棚卸帳票の登録実行 =====
    			tInventoryRBhv.insert(tInventoryR);

			} else {
				//存在した場合、棚卸ボディの更新実行
                List<TInventoryB> lst = tInventoryBBhv.selectList(cb2);
        		for (TInventoryB tInvB: lst) {
        			//tInvB.setInventoryNum(0l);
        			tInvB.setInputType_$00();
        			// [検査-153] 全数移動した時に在庫IDは変わらないので更新対象を増やす 2014.12.02 koseki Start
        			tInvB.setStockTypeId(tStock.getStockTypeId());
        			tInvB.setDepositId(tStock.getDepositId());
        			tInvB.setLocationId(tStock.getLocationId());
        			// [検査-153] 全数移動した時に在庫IDは変わらないので更新対象を増やす 2014.12.02 koseki End
        			tInvB.setChargeNum(tStock.getChargeNum());
        			tInvB.setAllocNum(tStock.getAllocNum());
        			tInvB.setMoveNum(tStock.getMoveNum());
    				// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja Start
    				// [#3347][Ver3.0] TODO残対応(UoM) -  WMSコア部在庫更新処理と合わせるため入数の設定を削除 2018.01.15 honma Delete
    				// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja End

        			// ===== 棚卸ボディ更新実行 =====
        			tInventoryBBhv.update(tInvB);
        		}
			}
		}

		// ===== 棚卸指示登録 =====
		tInventoryInst.setInventoryHId(inventoryId);
		tInventoryInstBhv.insert(tInventoryInst);

	}
	// 棚卸データ削除ボタン追加 2017.07.19 ATK Start
	/**
	 * <h2>棚卸データを削除する。</h2>
	 * 	  棚卸データ削除を行う
	 */
	public void delete(TInventoryH tInventoryH, TInventoryB tInventoryB, TInventoryInst tInventoryInst,List<Long> zoneIdList, ErrorStatus errSts) {

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

		// 引当指示ボディデータ取得
		List<TInventoryB> result = null;

		// 検索条件の設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		cb.setupSelect_TInventoryH();
		cb.setupSelect_TInventoryRAsOne();
		cb.setupSelect_TInventoryH().withMClient();
		cb.setupSelect_TInventoryH().withMCenter();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MLocation();
		cb.setupSelect_MLocation().withMZone();
		cb.setupSelect_MProduct();
		cb.setupSelect_TStoreNo();
		cb.setupSelect_TLot();
		cb.setupSelect_MStockType();
		cb.setupSelect_MStockType().withVDict(getCultureId());
		cb.setupSelect_MCustomerByDepositId();
		// 商品荷姿．入数
		cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
			@Override
			public void query(MProductShapeCB SubCB) {
				SubCB.specify().columnUnitNum();
				setDelFlg(SubCB);
			}
		}, TInventoryB.SHAPE_UnitNum );
		// 棚卸日
		cb.query().queryTInventoryH().setInventoryDt_Equal(tInventoryH.getInventoryDt());
		// 荷主ID
		cb.query().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());
		// センタID
		cb.query().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());
		// 倉庫ID
		cb.query().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		// 預託ID
		cb.query().setDepositId_Equal(tInventoryB.getDepositId());
		// 在庫区分ID
		cb.query().setStockTypeId_Equal(tInventoryB.getStockTypeId());
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// ゾーンID
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);
	// [#71] 不要のため削除 2017.08.23 ase start
//		// 商品ID
//		cb.query().setProductId_Equal(tInventoryB.getProductId());
	// [#71] 不要のため削除 2017.08.23 ase end

		// ===== 検索実行 =====
		result = tInventoryBBhv.selectList(cb);

		// ===== データ存在チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		for (int i = 0 ; i < result.size() ; i++){
			if (result.get(i).getStockAdjustFlg().equals("1")) {
				this.getErrorManager().add(errSts, WmsMessageConst.INVENTORY_ALL_COMPLETE_STOCK_UPDATE_ERROR);
				return;
			}
		}

		for (int i = 0 ; i < result.size() ; i++){

			ListResultBean<TInventoryInst> tInventoryInstResult = null;

			TInventoryInstCB tInventoryInstCB = tInventoryInstBhv.newMyConditionBean();
			tInventoryInstCB.query().setInventoryHId_Equal(result.get(i).getTInventoryH().getInventoryHId());
			tInventoryInstResult = tInventoryInstBhv.selectList(tInventoryInstCB);

			if (tInventoryInstResult.size() > 0) {
				for (TInventoryInst inst : tInventoryInstResult) {
					inst.setDelFlg_$1();
				}
			}
			//一度'0'に更新し
			tInventoryInstBhv.batchUpdate(tInventoryInstResult);

			TInventoryRCB tInventoryRCB = tInventoryRBhv.newMyConditionBean();
			tInventoryRCB.query().setInventoryBId_Equal(result.get(i).getInventoryBId());
			tInventoryRBhv.queryDelete(tInventoryRCB);

			ListResultBean<TInventoryInpHist> resultInpHist = null;
			TInventoryInpHistCB tInventoryInpHistCB = tInventoryInpHistBhv.newMyConditionBean();
			tInventoryInpHistCB.query().setInventoryBId_Equal(result.get(i).getInventoryBId());
			resultInpHist = tInventoryInpHistBhv.selectList(tInventoryInpHistCB);
			if (resultInpHist.size() != 0){
				for (int j = 0 ; j < resultInpHist.size() ; j ++){
					TInventoryInpHistCB tInventoryInpHistCB1 = tInventoryInpHistBhv.newMyConditionBean();
					tInventoryInpHistCB1.query().setInventoryInpHistId_Equal(resultInpHist.get(j).getInventoryInpHistId());
					tInventoryInpHistBhv.queryDelete(tInventoryInpHistCB1);
				}
			}

			TInventoryBCB tInventoryBCb = tInventoryBBhv.newMyConditionBean();
			tInventoryBCb.checkInvalidQuery();
			tInventoryBCb.query().setInventoryBId_Equal(result.get(i).getInventoryBId());
			tInventoryBBhv.queryDelete(tInventoryBCb);
		}
	}
	// 棚卸データ削除ボタン追加 2017.07.19 ATK End

	// [#71] 棚卸データ削除チェック処理 2017.08.23 ase start
	/**
	 * <h2>棚卸データ削除チェック処理</h2>
	 * <pre>
	 * 棚卸データ削除前チェックを行う
	 * <pre>
	 * @param tInventoryH
	 * @param tInventoryB
	 * @param tInventoryInst
	 * @param zoneIdList
	 * @param errSts
	 */
	public void deleteCheck(TInventoryH tInventoryH, TInventoryB tInventoryB, TInventoryInst tInventoryInst, List<Long> zoneIdList, ErrorStatus errSts) {

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

		// 引当指示ボディデータ取得
		List<TInventoryB> result = null;

		// 検索条件の設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		cb.setupSelect_TInventoryH();
		cb.setupSelect_TInventoryRAsOne();
		cb.setupSelect_TInventoryH().withMClient();
		cb.setupSelect_TInventoryH().withMCenter();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MLocation();
		cb.setupSelect_MLocation().withMZone();
		cb.setupSelect_MProduct();
		cb.setupSelect_TStoreNo();
		cb.setupSelect_TLot();
		cb.setupSelect_MStockType();
		cb.setupSelect_MStockType().withVDict(getCultureId());
		cb.setupSelect_MCustomerByDepositId();
		// 商品荷姿．入数
		cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>() {
			@Override
			public void query(MProductShapeCB SubCB) {
				SubCB.specify().columnUnitNum();
				setDelFlg(SubCB);
			}
		}, TInventoryB.SHAPE_UnitNum);
		// 棚卸日
		cb.query().queryTInventoryH().setInventoryDt_Equal(tInventoryH.getInventoryDt());
		// 荷主ID
		cb.query().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());
		// センタID
		cb.query().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());
		// 倉庫ID
		cb.query().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		// 預託ID
		cb.query().setDepositId_Equal(tInventoryB.getDepositId());
		// 在庫区分ID
		cb.query().setStockTypeId_Equal(tInventoryB.getStockTypeId());
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// ゾーンID
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);

		// ===== 検索実行 =====
		result = tInventoryBBhv.selectList(cb);

		// ===== データ存在チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		for (int i = 0; i < result.size(); i++) {
			if (result.get(i).getStockAdjustFlg().equals("1")) {
				this.getErrorManager().add(errSts, WmsMessageConst.INVENTORY_ALL_COMPLETE_STOCK_UPDATE_ERROR);
				return;
			}
		}
	}
	// [#71] 棚卸データ削除チェック処理 2017.08.23 ase end
}