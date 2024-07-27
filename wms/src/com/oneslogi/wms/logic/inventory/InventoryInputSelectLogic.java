package com.oneslogi.wms.logic.inventory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTInventoryB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 棚卸入力データ取得ロジッククラス
 */
public class InventoryInputSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	/*棚卸ボディ*/
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	// ===== 使用ロジック =====

	// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana Start
	@Inject
	private ParamLogic paramLogic;
	// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana End

	// [#4685][v3.0] ページングの削除 2018.06.06 kawana Start

	/**
	 * <h2>棚卸入力データを取得する。</h2>
	 * <pre>
	 * 受取った条件より、棚卸入力データを取得する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日・荷主ID・センタID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)・棚卸入力有無区分、アンマッチ有無区分
	 * @param tInventoryB 棚卸ボディ：倉庫ID・入庫ラベルNo・ロケーションID・ロットID・期限日・仕入先ID・入庫日
	 * @param mProduct 商品マスタ：商品CD
	 * @param zoneIdList ゾーンIDリスト：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TInventoryB> 棚卸ボディリスト
	 */
	public List<TInventoryB> selectByConditions(TInventoryH tInventoryH, TInventoryInst tInventoryInst, TInventoryB tInventoryB, List<Long> zoneIdList, MProduct mProduct, ErrorStatus errSts) {

		return selectByConditions(tInventoryH, tInventoryInst, tInventoryB, zoneIdList, mProduct, null, errSts);
	}

	// [#4685][v3.0] ページングの削除 2018.06.06 kawana End

	/**
	 * <h2>棚卸データを取得する。</h2>
	 * <pre>
	 * 受取った条件より、棚卸入力データを取得する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日・荷主ID・センタID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)・棚卸入力有無区分、アンマッチ有無区分
	 * @param tInventoryB 棚卸ボディ：倉庫ID・入庫ラベルNo・ロケーションID・ロットID・期限日・仕入先ID・入庫日
	 * @param mProduct 商品マスタ：商品CD
	 * @param zoneIdList ゾーンIDリスト：ゾーンID
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TInventoryB> 棚卸ボディリスト
	 */
	// [横並-177] 複数倉庫の同じゾーンCDデータが表示されるよう修正 2014.11.19 SJA-ZHENG Start
	public List<TInventoryB> selectByConditions(TInventoryH tInventoryH, TInventoryInst tInventoryInst,TInventoryB tInventoryB,
			List<Long> zoneIdList, MProduct mProduct, PagingData paging, ErrorStatus errSts) {
		// [横並-177] 複数倉庫の同じゾーンCDデータが表示されるよう修正 2014.11.19 SJA-ZHENG End
		List<TInventoryB> result = null;

		// ===== 棚卸入力データ取得 =====
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
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();

		// [#1750] 処理共通化 2017.05.09 kawana Start

		// ===== テーブル結合 =====
		// [#3116] SD棚卸 UoM対応(引数のセンタID削除) 2018.01.10 kawana Start
		setupSelectTable(cb);
		// [#3116] SD棚卸 UoM対応(引数のセンタID削除) 2018.01.10 kawana End

		// [#1750] 処理共通化 2017.05.09 kawana End

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
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		//ゾーンID
		// [横並-177] 複数倉庫の同じゾーンCDデータが表示されるよう修正 2014.11.19 SJA-ZHENG Start
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);
		// [横並-177] 複数倉庫の同じゾーンCDデータが表示されるよう修正 2014.11.19 SJA-ZHENG End
		// [#1076] 行追加で既登録エラー発生(商品CDが前方一致で検索されるため) 2017.03.07 kawana Start
		//商品ID
		cb.query().queryMProduct().setProductId_Equal(mProduct.getProductId());
		if (mProduct.getProductId() == null) {
			//商品CD
			cb.query().queryMProduct().setProductCd_PrefixSearch(mProduct.getProductCd());
		}
		// [#1076] 行追加で既登録エラー発生(商品CDが前方一致で検索されるため) 2017.03.07 kawana End
		//入庫ラベルNo
		cb.query().setStoreLabelNo_Equal(tInventoryB.getStoreLabelNo());
		//ロケーションID
		cb.query().queryMLocation().setLocationId_Equal(tInventoryB.getLocationId());
		//ロットID
		cb.query().setLot_Equal(tInventoryB.getLot());
		//期限日
		// [横並-147] 期限日を修正 2014.11.25 SJA-ZHENG Start
		cb.query().setLimitDt_Equal(tInventoryB.getLimitDt());
		// [横並-147] 期限日を修正 2014.11.25 SJA-ZHENG End

		cb.query().queryMCustomerBySupplierId().setCustomerId_Equal(tInventoryB.getMCustomerBySupplierId().getCustomerId());

		// [#1750] 処理共通化(specify処理をsetupSelectTableメソッド内に移動)(ここから削除) 2017.05.09 kawana


		//[ON推-品向-247]「棚卸入力画面の「棚卸入力有」の検索条件を以下に変更。」に修正 2014.12.05 衛 Start
		//棚卸入力有の場合
		if (tInventoryInst.isStockTakingInput$1()) {
			cb.query().existsTInventoryInpHistList(new SubQuery<TInventoryInpHistCB>() {
			    public void query(TInventoryInpHistCB subCB) {
			    	//subCB.query().setInventoryInpHistId_IsNotNull();
			    }
			});
		}else if (tInventoryInst.isStockTakingInput$0()) {
			///cb.query().existsTInventoryInpHistList(new SubQuery<TInventoryInpHistCB>() {
			cb.query().notExistsTInventoryInpHistList(new SubQuery<TInventoryInpHistCB>() {
			    public void query(TInventoryInpHistCB subCB) {
			    	//subCB.query().setInventoryInpHistId_IsNull();

			    }
			});
		}
		//[ON推-品向-247]「棚卸入力画面の「棚卸入力有」の検索条件を以下に変更。」に修正 2014.12.05 衛 End
		//アンマッチ有選択した場合
		if (tInventoryInst.isUnmatch$1()) {
			cb.columnQuery(new SpecifyQuery<TInventoryBCB>() {
			    public void specify(TInventoryBCB cb) {
			        cb.specify().columnChargeNum();
			    }
			}).notEqual(new SpecifyQuery<TInventoryBCB>() {
			    public void specify(TInventoryBCB cb) {
			        cb.specify().columnInventoryNum();
			    }
			});
		}

		// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana Start

		MParam param = getMParam(tInventoryH.getClientId(), tInventoryH.getCenterId());
		if (param.isStoreDtFlg$1()) {

			// [エンハンス PH2.0] 入庫日を追加する 2015.12.24 sja Start
			cb.query().setStoreDt_Equal(tInventoryB.getStoreDt());
			// [エンハンス PH2.0] 入庫日を追加する 2015.12.24 sja End
		}

		// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana End

		//ソート条件
		// [検査-144] センタCDをソート条件の先頭に変更 2014.12.03 kawana Start
		//センタCD
		cb.query().queryTInventoryH().queryMCenter().addOrderBy_CenterCd_Asc();
		//荷主CD
		cb.query().queryTInventoryH().queryMClient().addOrderBy_ClientCd_Asc();
		// [検査-144] センタCDをソート条件の先頭に変更 2014.12.03 kawana End
		//倉庫CD
		cb.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		//ゾーンマスタピッキング順序
		cb.query().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		//ロケーションマスタピッキング順序
		cb.query().queryMLocation().addOrderBy_PickingOrder_Asc();
		//ゾーンCD
		cb.query().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		//ロケーションCD
		cb.query().queryMLocation().addOrderBy_LocationCd_Asc();
		//商品CD
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
		//在庫区分CD
		cb.query().queryMStockType().addOrderBy_StockTypeCd_Asc();
		//取引先CD
		cb.query().queryMCustomerByDepositId().addOrderBy_CustomerCd_Asc();
		//ロット
		cb.query().queryTLot().addOrderBy_Lot_Asc();
		// [ON推-品向-526] 棚卸作業リストにソート順準拠 2015.01.13 kawana Start
		//期限日
		cb.query().queryTLot().addOrderBy_LimitDt_Asc();
		//入庫ラベルNo.
		cb.query().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
		// [ON推-品向-526] 棚卸作業リストにソート順準拠 2015.01.13 kawana End

		// [#4685][v3.0] ページングの削除 2018.06.06 kawana Start

		// ===== 棚卸入力データ取得実行 =====

		if (paging == null) {

			result = selectListToEntryGrid(tInventoryBBhv, cb);
		} else {

			// 2016.02.18 Zhang ページング ※3 Start
			result = selectPage(tInventoryBBhv, cb, paging);
			// 2016.02.18 Zhang ページング ※3 End
		}

		// [#4685][v3.0] ページングの削除 2018.06.06 kawana End

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tInventoryBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTInventoryB>() {
			@Override
			public void handle(LoaderOfTInventoryB loader) {
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
					@Override
					public void setup(MProductShapeCB subCB) {
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					}
				});
			}
		});
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		for (TInventoryB inventB : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, inventB.getMProduct());
			// 予定最小荷姿単位名称
			inventB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, inventB.getMProduct()));
			// 入数内訳
			inventB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, inventB.getMProduct()));
			// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
			//棚卸前内訳
			inventB.setInventoryBeforeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, inventB.getChargeNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, inventB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			// [Ver3.0] unit of measure対応 2017.11.29 潘 End
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End

		return result;

	}

	// [#1750] SD明細を表示前にデータを再検索して設定する 2017.05.09 kawana Start

	/**
	 * <h2>棚卸データ取得(1件)。</h2>
	 * <pre>
	 * 棚卸ボディIDを条件に棚卸データを検索する。
	 * 検索対象が見つからない場合、エラーを登録する。
	 *
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：荷主ID・センタID
	 * @param tInventoryB 棚卸ボディ：棚卸ボディID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return TInventoryB 棚卸データ
	 */
	public TInventoryB selectDetail(TInventoryH tInventoryH, TInventoryB tInventoryB, ErrorStatus errSts) {

		// [#3116] SD棚卸 UoM対応(センタID削除) 2018.01.10 kawana

		final long bodyId = tInventoryB.getInventoryBId();

		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();

		// ===== テーブル結合 =====
		// [#3116] SD棚卸 UoM対応(引数のセンタID削除) 2018.01.10 kawana Start
		setupSelectTable(cb);
		// [#3116] SD棚卸 UoM対応(引数のセンタID削除) 2018.01.10 kawana End

		// ===== 検索条件 =====
		cb.query().setInventoryBId_Equal(bodyId);

		// ===== 検索実行 =====
		TInventoryB selectBody = tInventoryBBhv.selectEntity(cb);

		if (selectBody == null) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// [#3116] SD棚卸 UoM対応 2017.12.19 kawana Start

		// 商品荷姿のリストを取得
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tInventoryBBhv.load(selectBody, new ReferrerLoaderHandler<LoaderOfTInventoryB>() {
			@Override
			public void handle(LoaderOfTInventoryB loader) {
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
					@Override
					public void setup(MProductShapeCB subCB) {
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					}
				});
			}
		});
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		Map<Long, String> decimalExistFlgMap = new HashMap<Long, String>();
		Map<Long, String> minimumUnitMap = new HashMap<Long, String>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<Long, List<Long>>();
		Map<Long, List<String>> parentUnitMap = new HashMap<Long, List<String>>();

		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, selectBody.getMProduct());

		BigDecimal chargeNum = CU.nullToZero(selectBody.getChargeNum());

		// 商品単位
		selectBody.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, selectBody.getMProduct()));
		// 入数内訳
		selectBody.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, selectBody.getMProduct()));
		// 棚卸前引当可能数の内訳
		selectBody.setChargeNumBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, chargeNum, minimumUnitMap, parentUnitNumMap
				, parentUnitMap, selectBody.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		// [#3116] SD棚卸 UoM対応 2017.12.19 kawana End

		return selectBody;
	}

	/**
	 * テーブル結合と計算項目の設定
	 */
	private void setupSelectTable(TInventoryBCB cb) {

		// ===== テーブル結合 =====

		cb.setupSelect_TInventoryH();
		cb.setupSelect_MLocation();
		// [#3116] SD棚卸 UoM対応(ケース入数の取得を削除) 2017.12.19 kawana Start
		// [#1149] 明細画面に棚卸前総数、ピース数、ケース数を表示 2017.03.09 kawana Start
		cb.setupSelect_MProduct();
		// [#1149] 明細画面に棚卸前総数、ピース数、ケース数を表示 2017.03.09 kawana End
		// [#3116] SD棚卸 UoM対応(ケース入数の取得を削除) 2017.12.19 kawana End
		cb.setupSelect_MLocation().withMZone();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByStockAdjustFlg();
		cb.setupSelect_BClassDtlByStockAdjustFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		cb.setupSelect_MCustomerBySupplierId();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MCustomerByDepositId();
		cb.setupSelect_TLot();
		cb.setupSelect_MStockType();
		cb.setupSelect_TInventoryH().withMClient();

		cb.setupSelect_MStockType().withVDict(getCultureId());
		// [エンハンス PH2.0] 入数と入庫日用、センタマスタ、入庫No.テーブルを追加する 2015.12.08 sja Start
		cb.setupSelect_TInventoryH().withMCenter();
		cb.setupSelect_TStoreNo();
		// [エンハンス PH2.0] 入数と入庫日用、センタマスタ、入庫No.テーブルを追加する 2015.12.08 sja End

		// ===== 計算項目 =====

		// 棚卸入力履歴ID
		cb.specify().derivedTInventoryInpHistList().max(new SubQuery<TInventoryInpHistCB>() {
			@Override
			public void query(TInventoryInpHistCB SubCB) {
				SubCB.specify().columnInventoryInpHistId();
				setDelFlg(SubCB);
			}
		}, TInventoryB.ALIAS_InventoryInpHistId);
		// 入力日時
		cb.specify().derivedTInventoryInpHistList().max(new SubQuery<TInventoryInpHistCB>() {
			@Override
			public void query(TInventoryInpHistCB SubCB) {
				SubCB.specify().columnInputDt();
				// [Ver3.0][#4727] 最新の入力日時を取得するよう修正 2018.06.15 matsumoto Start
				SubCB.query().setLastFlg_Equal_$1();
				// [Ver3.0][#4727] 最新の入力日時を取得するよう修正 2018.06.15 matsumoto End
				setDelFlg(SubCB);
			}
		}, TInventoryB.ALIAS_InputDt);
		// 登録ユーザ
		cb.specify().derivedTInventoryInpHistList().max(new SubQuery<TInventoryInpHistCB>() {
			@Override
			public void query(TInventoryInpHistCB SubCB) {
				SubCB.specify().columnAddUser();
				// [Ver3.0][#4727] 最新の入力者情報を取得するよう修正 2018.06.15 matsumoto Start
				SubCB.query().setLastFlg_Equal_$1();
				// [Ver3.0][#4727] 最新の入力者情報を取得するよう修正 2018.06.15 matsumoto End
				setDelFlg(SubCB);

			}
		}, TInventoryB.ALIAS_AddUser);
	}

	// [#1750] SD明細を表示前にデータを再検索して設定する 2017.05.09 kawana End

	// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana Start

	/**
	 * パラメータマスタを取得
	 */
	private MParam getMParam(Long clientId, Long centerId) {

		MClientCenter condition = new MClientCenter();
		condition.setCenterId(centerId);
		condition.setClientId(clientId);
		return paramLogic.getUkEntityWithDeletedCheck(condition);
	}

	// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana End

	// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start

	/**
	 * <h2>追加データ存在チェック.</h2>
	 * <pre>
	 * 追加データが既に登録済で「ない」ことを確認する。
	 * 追加データと同じデータがDBに存在した場合は、エラーを管理クラスに登録する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ (棚卸日、荷主ID、センタID)
	 * @param tInventoryB 棚卸ボディ (ロケーションID、商品ID、預託ID、在庫区分ID、ロット、期限日、仕入先ID、入庫日※入庫日管理ありの場合のみ※)
	 * @param errSts エラー時に設定するステータス
	 */
	public void checkAlreadyExistData(TInventoryH tInventoryH, TInventoryB tInventoryB, ErrorStatus errSts) {

		// 検索条件の設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();

		//棚卸日
		cb.query().queryTInventoryH().setInventoryDt_Equal(tInventoryH.getInventoryDt());
		//荷主ID
		cb.query().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());
		//センタID
		cb.query().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());
		//預託ID
		cb.query().setDepositId_Equal(tInventoryB.getDepositId());
		//在庫区分ID
		cb.query().setStockTypeId_Equal(tInventoryB.getStockTypeId());
		//商品ID
		cb.query().queryMProduct().setProductId_Equal(tInventoryB.getProductId());
		//入庫ラベルNo
		cb.query().setStoreLabelNo_Equal(tInventoryB.getStoreLabelNo());
		//ロケーションID
		cb.query().setLocationId_Equal(tInventoryB.getLocationId());
		//ロット
		cb.query().setLot_Equal(tInventoryB.getLot());
		//期限日
		cb.query().setLimitDt_Equal(tInventoryB.getLimitDt());
		// 仕入先ID
		cb.query().setSupplierId_Equal(tInventoryB.getSupplierId());

		MParam param = getMParam(tInventoryH.getClientId(), tInventoryH.getCenterId());
		if (param.isStoreDtFlg$1()) {
			// 入庫日管理する

			// 入庫日
			cb.query().setStoreDt_Equal(tInventoryB.getStoreDt());
		}

		int count = tInventoryBBhv.selectCount(cb);

		if (0 < count) {
			// 存在する ==> 異常

			getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}
	}

	// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End

}