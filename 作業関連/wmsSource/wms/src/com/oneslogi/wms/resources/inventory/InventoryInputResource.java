package com.oneslogi.wms.resources.inventory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.inventory.InventoryCreateDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.inventory.InventoryInputSelectLogic;
import com.oneslogi.wms.logic.inventory.InventoryInsUpdLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 棚卸入力画面のリソースクラス。
 */
@Path("/inventory/inventoryInput")
public class InventoryInputResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 棚卸入力データ取得異常
		 */
		protected static final int INVENTORY_INPUT_SELECT_FAILED = 2;
		/**
		 * 棚卸データ追加・更新異常
		 */
		protected static final int INVENTORY_INS_UPD_FAILED = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private InventoryInputSelectLogic selectLogic;
	@Inject
	private InventoryInsUpdLogic updLogic;

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private MZoneBhv mZoneBhv;
	// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動(不要になった変数productLogicを削除) 2018.06.13 kawana Delete
	// [Ver3.0] unit of measure対応 2017.12.1 潘 Del
	// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana Start
	@Inject
	private ParamLogic paramLogic;
	// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryCreateDto 棚卸入力画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryCreateDto init() {

		// 画面用DTO作成
		InventoryCreateDto inventoryCreateDto = new InventoryCreateDto();

		return inventoryCreateDto;
	}

	/**
	 * <h2>棚卸入力データ取得。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 棚卸入力データを取得する
	 * </pre>
	 * @param inventoryCreateDto 棚卸データ作成画面用DTO
	 * @return InventoryCreateDto 棚卸データ作成画面用DTO
	 */
	@GET
	@Path("/select")
	public InventoryCreateDto select(InventoryCreateDto inventoryCreateDto) {

		InventoryCreateDto  resultInventoryCreateDto = new InventoryCreateDto();

		//棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH header = headerMapper.mappingToEntity(inventoryCreateDto.data.head);

		//棚卸ボディ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryCreateDto.data.body);

		TInventoryInstDtoMapper instMapper = new TInventoryInstDtoMapper();
		TInventoryInst inst = instMapper.mappingToEntity(inventoryCreateDto.data.Inst);

		//棚卸ヘッダ
		TInventoryH inventoryH = new TInventoryH();

		//棚卸ボディ
//		TInventoryB inventoryB = new TInventoryB();

		//棚卸指示
		TInventoryInst tInventoryInst = new TInventoryInst();

		//商品マスタ
		MProduct mProduct = new MProduct();

		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		// 倉庫ID
		if (!CU.isNullOrEmpty(body.getMWarehouse().getWarehouseCd())) {
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(body.getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			body.setWarehouseId(mWarehouse.getWarehouseId());
		}

		// 預託ID取得
		if (!CU.isNullOrEmpty(body.getMCustomerByDepositId().getCustomerCd())) {
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(mClient.getClientId());
			mCustomer.setCustomerCd(body.getMCustomerByDepositId().getCustomerCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			tInventoryInst.setDepositId(mCustomer.getCustomerId());
		}

		// 在庫区分ID
		if (!CU.isNullOrEmpty(body.getMStockType().getStockTypeCd())) {
			MStockType mStockType = new MStockType();
//			mStockType.setClientId(mClient.getClientId());
			mStockType.setStockTypeCd(body.getMStockType().getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			tInventoryInst.setStockTypeId(mStockType.getStockTypeId());
		}

		// 商品ID
		if (!CU.isNullOrEmpty(body.getMProduct().getProductCd())) {
//			mProduct.setClientId(mClient.getClientId());
//			mProduct.setProductCd(body.getMProduct().getProductCd());
			mProduct.setProductCd(body.getMProduct().getProductCd());

			// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動(不要になった処理を削除) 2018.06.13 kawana Delete
		}

		//横並-177 SJA-ZHENG UPD 2014/11/19  S
		//ゾーンID取得
		List<Long> zoneIdList = new ArrayList<Long>();
		if (!CU.isNullOrEmpty(inst.getMZone().getZoneCd())) {
//			MZone mZone = new MZone();
//			mZone.setWarehouseId(body.getWarehouseId());
//			mZone.setZoneCd(inst.getMZone().getZoneCd());
//			mZone = zoneLogic.getUkEntity(mZone);
//			tInventoryInst.setZoneId(mZone.getZoneId());

			MZoneCB mZoneCB = mZoneBhv.newConditionBean();
			mZoneCB.query().setZoneCd_Equal(inst.getMZone().getZoneCd());
			List<MZone> mzoneList = mZoneBhv.selectList(mZoneCB);
			// ゾーンIDリストをセット
			for (MZone mZone : mzoneList) {
				zoneIdList.add(mZone.getZoneId());
			}
		}
		//横並-177 SJA-ZHENG UPD 2014/11/19  E

		//ロケーションID取得
		if (!CU.isNullOrEmpty(body.getMLocation().getLocationCd())) {
			MLocation mLocation = new MLocation();
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation.setLocationCd(body.getMLocation().getLocationCd());
			mLocation = locationLogic.getUkEntity(mLocation);
			body.setLocationId(mLocation.getLocationId());
		}

//		//仕入先ID取得
//		if (!CU.isNullOrEmpty(body.getMCustomerBySupplierId().getCustomerCd())) {
//			MCustomer mCustomer = new MCustomer();
//			mCustomer.setClientId(mClient.getClientId());
//			mCustomer.setCustomerCd(body.getTStoreNo().getMCustomer().getCustomerCd());
//			mCustomer = customerLogic.getUkEntity(mCustomer);
//			body.getTStoreNo().setSupplierId(mCustomer.getCustomerId());
//		}

		//棚卸ヘッダ
		inventoryH.setClientId(mClient.getClientId());
		inventoryH.setCenterId(mCenter.getCenterId());
		inventoryH.setInventoryDt(header.getInventoryDt());

		//棚卸指示
		tInventoryInst.setFromLocationCd(inst.getFromLocationCd());
		tInventoryInst.setToLocationCd(inst.getToLocationCd());
		tInventoryInst.setStockTakingInput(inst.getStockTakingInput());
		tInventoryInst.setUnmatch(inst.getUnmatch());

//		//棚卸ボディ
//		inventoryB.setStoreLabelNo(body.getStoreLabelNo());
//		inventoryB.setLot(body.getLot());

		// [#4685][v3.0] ページングの削除 2018.06.06 kawana Start
		//横並-177 SJA-ZHENG UPD 2014/11/19  S
		//下記パラメータを設定して棚卸入力データ取得メソッドを呼出し
		List<TInventoryB> invenList = selectLogic.selectByConditions(inventoryH, tInventoryInst, body, zoneIdList, mProduct, errRetSts(StatusCode.INVENTORY_INPUT_SELECT_FAILED));
		//横並-177 SJA-ZHENG UPD 2014/11/19  E
		// [#4685][v3.0] ページングの削除 2018.06.06 kawana End

		// 結果判定
		if (0 < getErrorManager().size()) {

			// 処理中止
			return null;
		}

		if(invenList.size() > 0){

			int instNum = 0;
			for (int i = 0; i < invenList.size() ; i++) {
				// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja Start
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース数関連処理削除 2018.01.15 honma Delete
				// [Ver3.0] unit of measure対応 2017.12.1 潘 Del
				// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja End

				//棚卸数量備考
				invenList.get(i).setOldInventoryNum(invenList.get(i).getInventoryNum());

				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース数関連処理削除 2018.01.15 honma Mod Start
				if (invenList.get(i).getInventoryInpHistId() == null && WCC.isZero(invenList.get(i).getInventoryNum())){
					invenList.get(i).setInventoryNum(null);
					invenList.get(i).setOldInventoryNum(null);
				}
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース数関連処理削除 2018.01.15 honma Mod End

//				if(invenList.get(i).isStockAdjustFlg$1()) {
//					invenList.get(i).setstockAdjustFlgShow("調整");
//				}else{
//					invenList.get(i).setstockAdjustFlgShow("未調整");
//				}

				//進捗率
				if (invenList.get(i).getInventoryInpHistId() != null){
					instNum = instNum +1;
				}

				BUser buser = new BUser();
				buser.setUserCd(invenList.get(i).getHistAddUser());
				buser = userLogic.getUkEntity(buser);

				if (buser != null) {
					invenList.get(i).setHistAddUser(buser.getUserNm());
				}


			}
			//進捗率
			if (instNum != 0){
				invenList.get(0).setInventroyParcent(Long.valueOf(instNum*100/invenList.size()));
			}else{
				invenList.get(0).setInventroyParcent(Long.valueOf(0));
			}


		}

		//棚卸入力画面用DTOデータセット
		List<TInventoryBDto> listB = bodyMapper.mappingToDtoList(invenList);

		resultInventoryCreateDto.data.bodyList = listB;
		// [#4685][v3.0] ページングの削除(pagingの設定削除) 2018.06.06 kawana Delete

		// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana Start
		resultInventoryCreateDto.data.param = new MParamDtoMapper().mappingToDto(getMParam(mClient, mCenter));
		// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana End

		return resultInventoryCreateDto;

	}

	/**
	 * <h2>棚卸データ追加・更新</h2>
	 * <pre>
	 * 棚卸データ追加・更新を行う
	 * エラーがない場合は、データベースに棚卸データを登録または更新し、完了メッセージを設定する。
	 * </pre>
	 * @return InventoryCreateDto 棚卸入力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStartEnd("InventoryInput")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public StatusDto register(InventoryCreateDto inventoryCreateDto) {

		//棚卸List
		TInventoryBDtoMapper mapper = new TInventoryBDtoMapper();
		List<TInventoryB> tInventoryBList = mapper.mappingToEntityList(inventoryCreateDto.data.bodyList);

		//棚卸データ追加・更新登録
		updLogic.InsertUpdate(tInventoryBList, errRetSts(StatusCode.INVENTORY_INS_UPD_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {

			// 処理中止
			return null;
		}else{
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
			BigDecimal setInventoryNum = WCC.ZERO;
			// 画面に入庫数の合計
			for (TInventoryB body : tInventoryBList) {
				//棚卸ボディリスト.棚卸ボディIDがNULL場合
				if (body.getInventoryBId() == null) {
					// 新規在庫追加
					if (WCC.isNotZero(CU.nullToZero(body.getInventoryNum()))) {
						//数量
						setInventoryNum = WCC.add(setInventoryNum,CU.nullToZero(body.getInventoryNum()));
						//センタ
						setWorkLogCenterCd(body.getTInventoryH().getMCenter().getCenterCd());
						//荷主
						setWorkLogClientCd(body.getTInventoryH().getMClient().getClientCd());
					}
					//棚卸ボディリスト.棚卸ボディIDがNULLでない場合、
				} else {
					// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
					if (body.getInventoryInpHistId() == null && body.getInventoryNum() != null && !WCC.isEqual(body.getInventoryNum(), body.getOldInventoryNum())) {
					// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
						//数量
						setInventoryNum = WCC.add(setInventoryNum,CU.nullToZero(body.getInventoryNum()));
						//センタ
						setWorkLogCenterCd(body.getTInventoryH().getMCenter().getCenterCd());
						//荷主
						setWorkLogClientCd(body.getTInventoryH().getMClient().getClientCd());
					}
				}
			}
			//数量
			setWorkLogQty(setInventoryNum);
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

			// 完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		}

		return null;
	}

	// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana Start

	/**
	 * パラメータマスタを取得
	 */
	private MParam getMParam(MClient mClient, MCenter mCenter) {

		MClientCenter condition = new MClientCenter();
		condition.setClientId(mClient.getClientId());
		condition.setCenterId(mCenter.getCenterId());
		return paramLogic.getUkEntityWithDeletedCheck(condition);
	}

	// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana End
}
