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
import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
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
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.inventory.InventoryCreateDto;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.inventory.InventoryInputSelectLogic;
import com.oneslogi.wms.logic.inventory.InventoryInsUpdLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/inventory/inventoryInputSD")
public class InventoryInputSDResource extends AbstractWmsResource {

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
	@Path("/search")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("InventoryInputSD")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public InventoryCreateDto search(InventoryCreateDto inventoryCreateDto) {

		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM Start
		return searchCommon(inventoryCreateDto);
		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM End
	}

	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
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
	@Path("/research")
	public InventoryCreateDto research(InventoryCreateDto inventoryCreateDto) {

		return searchCommon(inventoryCreateDto);
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
	public InventoryCreateDto searchCommon(InventoryCreateDto inventoryCreateDto) {

		InventoryCreateDto resultInventoryCreateDto = new InventoryCreateDto();

		// 棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH header = headerMapper.mappingToEntity(inventoryCreateDto.data.head);

		// 棚卸ボディ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryCreateDto.data.body);

		TInventoryInstDtoMapper instMapper = new TInventoryInstDtoMapper();
		TInventoryInst inst = instMapper.mappingToEntity(inventoryCreateDto.data.Inst);

		final long centerId = header.getCenterId();
		final long clientId = header.getClientId();

		// 棚卸ヘッダ
		TInventoryH inventoryH = new TInventoryH();

		// 棚卸指示
		TInventoryInst tInventoryInst = new TInventoryInst();

		// 商品マスタ
		MProduct mProduct = new MProduct();

		// 倉庫ID
		if (!CU.isNullOrEmpty(body.getMWarehouse().getWarehouseCd())) {
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(body.getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(centerId);
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			body.setWarehouseId(mWarehouse.getWarehouseId());
		}

		// 預託ID取得
		if (!CU.isNullOrEmpty(body.getMCustomerByDepositId().getCustomerCd())) {
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(clientId);
			mCustomer.setCustomerCd(body.getMCustomerByDepositId().getCustomerCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			tInventoryInst.setDepositId(mCustomer.getCustomerId());
		}

		// 在庫区分ID
		if (!CU.isNullOrEmpty(body.getMStockType().getStockTypeCd())) {
			MStockType mStockType = new MStockType();
			mStockType.setStockTypeCd(body.getMStockType().getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			tInventoryInst.setStockTypeId(mStockType.getStockTypeId());
		}

		// 商品ID
		if (!CU.isNullOrEmpty(body.getMProduct().getProductCd())) {
			mProduct.setProductCd(body.getMProduct().getProductCd());
		}

		// ゾーンID取得
		List<Long> zoneIdList = new ArrayList<Long>();
		if (!CU.isNullOrEmpty(inst.getMZone().getZoneCd())) {

			MZoneCB mZoneCB = mZoneBhv.newConditionBean();
			mZoneCB.query().setZoneCd_Equal(inst.getMZone().getZoneCd());
			List<MZone> mzoneList = mZoneBhv.selectList(mZoneCB);
			// ゾーンIDリストをセット
			for (MZone mZone : mzoneList) {
				zoneIdList.add(mZone.getZoneId());
			}
		}

		// ロケーションID取得
		if (!CU.isNullOrEmpty(body.getMLocation().getLocationCd())) {
			MLocation mLocation = new MLocation();
			mLocation.setCenterId(centerId);
			mLocation.setLocationCd(body.getMLocation().getLocationCd());
			mLocation = locationLogic.getUkEntity(mLocation);
			body.setLocationId(mLocation.getLocationId());
		}

		// 棚卸ヘッダ
		inventoryH.setClientId(clientId);
		inventoryH.setCenterId(centerId);
		inventoryH.setInventoryDt(header.getInventoryDt());

		// 棚卸指示
		tInventoryInst.setFromLocationCd(inst.getFromLocationCd());
		tInventoryInst.setToLocationCd(inst.getToLocationCd());
		tInventoryInst.setStockTakingInput(inst.getStockTakingInput());
		tInventoryInst.setUnmatch(inst.getUnmatch());

		// 下記パラメータを設定して棚卸入力データ取得メソッドを呼出し
		List<TInventoryB> invenList = selectLogic.selectByConditions(inventoryH, tInventoryInst, body, zoneIdList, mProduct, inventoryCreateDto.paging,
				errRetSts(StatusCode.INVENTORY_INPUT_SELECT_FAILED));

		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#1149] 明細画面に棚卸前総数、ピース数、ケース数を表示 2017.03.09 kawana Start

		for (TInventoryB inventoryB : invenList) {

			setDtoData(inventoryB);
		}

		// [#1149] 明細画面に棚卸前総数、ピース数、ケース数を表示 2017.03.09 kawana End

		// 棚卸入力画面用DTOデータセット
		List<TInventoryBDto> listB = bodyMapper.mappingToDtoList(invenList);
		resultInventoryCreateDto.data.bodyList = listB;
		resultInventoryCreateDto.paging = inventoryCreateDto.paging;

		return resultInventoryCreateDto;

	}
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

	/**
	 * <h2>棚卸入力データ取得(明細)。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 棚卸入力データを取得する
	 * </pre>
	 * @param inventoryCreateDto 棚卸データ作成画面用DTO
	 * @return InventoryCreateDto 棚卸データ作成画面用DTO
	 */
	@GET
	@Path("/searchDetail")
	public InventoryCreateDto searchDetail(InventoryCreateDto inventoryCreateDto) {

		// ===== Entity変換 =====
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH header = headerMapper.mappingToEntity(inventoryCreateDto.data.head);

		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryCreateDto.data.body);

		// ===== 明細データ検索 =====
		TInventoryB inventoryB = selectLogic.selectDetail(header, body, errRetSts(StatusCode.INVENTORY_INPUT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 返信用DTO作成 =====

		setDtoData(inventoryB);

		ArrayList<TInventoryBDto> bodyList = new ArrayList<TInventoryBDto>();
		bodyList.add(bodyMapper.mappingToDto(inventoryB));

		InventoryCreateDto resultDto = new InventoryCreateDto();
		resultDto.data.bodyList = bodyList;

		return resultDto;
	}

	private void setDtoData(TInventoryB inventoryB) {

		// [#3116] SD棚卸 UoM対応 - ケース数、ピース数の設定を削除 2017.12.19 kawana Start

		// 棚卸数量備考
		inventoryB.setOldInventoryNum(inventoryB.getInventoryNum());

		if (inventoryB.getInventoryInpHistId() == null && WCC.isZero(inventoryB.getInventoryNum())) {

			inventoryB.setInventoryNum(null);
			inventoryB.setOldInventoryNum(null);
		}

		// [#3116] SD棚卸 UoM対応 - ケース数、ピース数の設定を削除 2017.12.19 kawana End

		// 棚卸入力ユーザ
		BUser buser = new BUser();
		buser.setUserCd(inventoryB.getHistAddUser());
		buser = userLogic.getUkEntity(buser);

		if (buser != null) {
			inventoryB.setHistAddUser(buser.getUserNm());
		}
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
	@WorkLogMergeEnd("InventoryInputSD")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public StatusDto register(InventoryCreateDto inventoryCreateDto) {

		// 棚卸List
		TInventoryBDtoMapper mapper = new TInventoryBDtoMapper();
		List<TInventoryB> tInventoryBList = mapper.mappingToEntityList(inventoryCreateDto.data.bodyList);

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// 総数量
		BigDecimal inventoryNumSumUsedByLog = WCC.ZERO;
		// 画面に入庫数の合計
		for (TInventoryB body : tInventoryBList) {
			inventoryNumSumUsedByLog = WCC.add(inventoryNumSumUsedByLog, CU.nullToZero(body.getInventoryNum()));
		}
		setWorkLogQty(inventoryNumSumUsedByLog);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// 棚卸データ追加・更新登録
		updLogic.InsertUpdate(tInventoryBList, errRetSts(StatusCode.INVENTORY_INS_UPD_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
