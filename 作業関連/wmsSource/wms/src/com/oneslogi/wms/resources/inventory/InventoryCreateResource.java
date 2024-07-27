package com.oneslogi.wms.resources.inventory;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.inventory.InventoryCreateDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.inventory.InventoryCreateLogic;
import com.oneslogi.wms.logic.inventory.StockAdjustFlagCheckLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 棚卸データ作成画面のリソースクラス。
 */
@Path("/inventory/inventoryCreate")
public class InventoryCreateResource extends AbstractWmsResource {

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
		 * 在庫調整フラグチェック異常
		 */
		protected static final int STOCK_ADJUST_FLAG_CHECK_FAILED = 2;
		/**
		 * 棚卸データ作成異常
		 */
		protected static final int INVENTORY_CREATE_FAILED = 3;
		/**
		 * 移動／積送中、又は未確定数の在庫が存在したため、作成されていない棚卸データがあります。詳細は運用管理情報で確認して下さい。
		 */
		protected static final int STOCK_INTRANSIT_CHECK_FAILED = 4;
	}

	// ===== 使用ロジッククラス =====// ===== 使用ロジッククラス =====
	@Inject
	private InventoryCreateLogic createLogic;
	@Inject
	private StockAdjustFlagCheckLogic checkLogic;

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
	private MZoneBhv mZoneBhv;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・棚卸データ作成画面用DTOの作成
	 * </pre>
	 * @return InventoryCreateDto 棚卸データ作成画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryCreateDto init() {

		// 画面用DTO作成
		InventoryCreateDto inventoryCreateDto = new InventoryCreateDto();

		return inventoryCreateDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 在庫調整フラグのチェックを行う
	 * </pre>
	 * @param inventoryCreateDto 棚卸データ作成画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(InventoryCreateDto inventoryCreateDto) {

		//棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH header = headerMapper.mappingToEntity(inventoryCreateDto.data.head);

		//棚卸ヘッダ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryCreateDto.data.body);

		TInventoryInstDtoMapper instMapper = new TInventoryInstDtoMapper();
		TInventoryInst inst = instMapper.mappingToEntity(inventoryCreateDto.data.Inst);

		//棚卸ヘッダ
		TInventoryH inventoryH = new TInventoryH();

		//棚卸ボディ
		TInventoryB inventoryB = new TInventoryB();

		//棚卸指示
		TInventoryInst tInventoryInst = new TInventoryInst();

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
			inventoryB.setWarehouseId(mWarehouse.getWarehouseId());
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

		//ゾーンID取得
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
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
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		//棚卸ヘッダ
		inventoryH.setClientId(mClient.getClientId());
		inventoryH.setCenterId(mCenter.getCenterId());
		inventoryH.setInventoryDt(header.getInventoryDt());

		//棚卸指示
		// [検査-137] 1件在庫区分IDセットを削除 2014.11.28 SJA-ZHENG
		tInventoryInst.setFromLocationCd(inst.getFromLocationCd());
		tInventoryInst.setToLocationCd(inst.getToLocationCd());
		tInventoryInst.setFromStockInoutDt(inst.getFromStockInoutDt());
		tInventoryInst.setToStockInoutDt(inst.getToStockInoutDt());
		tInventoryInst.setStockExistOnlyFlg(inst.getStockExistOnlyFlg());

		// [検査-137] 2件checkLogic.checkを削除 2014.11.28 SJA-ZHENG

		// [検査-137] メッセージは出力チェックを追加 2014.11.28 SJA-ZHENG Start
		//棚卸入力が行われたデータがある場合
		checkLogic.checkTInventory(inventoryH, inventoryB, tInventoryInst,zoneIdList, errRetSts(StatusCode.STOCK_ADJUST_FLAG_CHECK_FAILED));

		checkLogic.checkTStock(inventoryH, inventoryB, tInventoryInst,zoneIdList, errRetSts(StatusCode.STOCK_INTRANSIT_CHECK_FAILED));
		// [検査-137] メッセージは出力チェックを追加 2014.11.28 SJA-ZHENG Start

		// 結果判定
		if (0 < getErrorManager().size()) {

			// 処理中止
			return null;
		}

		return null;
	}

	/**
	 * <h2>棚卸データ作成。</h2>
	 * <pre>
	 * 棚卸データ作成を行う
	 * エラーがない場合は、データベースに棚卸データを登録または更新し、完了メッセージを設定する
	 * </pre>
	 * @param inventoryCreateDto 棚卸データ作成画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(InventoryCreateDto inventoryCreateDto) {

		//棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH header = headerMapper.mappingToEntity(inventoryCreateDto.data.head);

		//棚卸ヘッダ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryCreateDto.data.body);

		TInventoryInstDtoMapper instMapper = new TInventoryInstDtoMapper();
		TInventoryInst inst = instMapper.mappingToEntity(inventoryCreateDto.data.Inst);

		//棚卸ヘッダ
		TInventoryH inventoryH = new TInventoryH();

		//棚卸ボディ
		TInventoryB inventoryB = new TInventoryB();

		//棚卸指示
		TInventoryInst tInventoryInst = new TInventoryInst();

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
			inventoryB.setWarehouseId(mWarehouse.getWarehouseId());
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

		//ゾーンID取得
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
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
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		//棚卸ヘッダ
		inventoryH.setClientId(mClient.getClientId());
		inventoryH.setCenterId(mCenter.getCenterId());
		inventoryH.setInventoryDt(header.getInventoryDt());

		//棚卸指示
//		tInventoryInst.setStockTypeId(inst.getStockTypeId());
		tInventoryInst.setFromLocationCd(inst.getFromLocationCd());
		tInventoryInst.setToLocationCd(inst.getToLocationCd());
		tInventoryInst.setFromStockInoutDt(inst.getFromStockInoutDt());
		tInventoryInst.setToStockInoutDt(inst.getToStockInoutDt());
		tInventoryInst.setStockExistOnlyFlg(inst.getStockExistOnlyFlg());

		//棚卸データ登録
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		createLogic.insert(inventoryH, inventoryB, tInventoryInst, zoneIdList, errRetSts(StatusCode.INVENTORY_CREATE_FAILED));
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End


		// 結果判定
		if (0 < getErrorManager().size()) {

			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.STOCK_COUNT_CREATE_COMPLETE_INFORMATION);

		return null;
	}

	// 棚卸データ削除ボータン追加 2017.07.18 aungtun Start
	/**
	 * <h2>棚卸データ削除。</h2>
	 * <pre>
	 * 棚卸データ削除を行う
	 * エラーがない場合は、データベースに棚卸データを削除し、完了メッセージを設定する
	 * </pre>
	 * @param inventoryCreateDto 棚卸データ作成画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/deletedata")
	public StatusDto deletedata(InventoryCreateDto inventoryCreateDto) {
		//棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH header = headerMapper.mappingToEntity(inventoryCreateDto.data.head);

		//棚卸ヘッダ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryCreateDto.data.body);

		TInventoryInstDtoMapper instMapper = new TInventoryInstDtoMapper();
		TInventoryInst inst = instMapper.mappingToEntity(inventoryCreateDto.data.Inst);

		//棚卸ヘッダ
		TInventoryH inventoryH = new TInventoryH();

		//棚卸ボディ
		TInventoryB inventoryB = new TInventoryB();

		//棚卸指示
		TInventoryInst tInventoryInst = new TInventoryInst();

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
			inventoryB.setWarehouseId(mWarehouse.getWarehouseId());
		}

		// 預託ID取得
		if (!CU.isNullOrEmpty(body.getMCustomerByDepositId().getCustomerCd())) {
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(mClient.getClientId());
			mCustomer.setCustomerCd(body.getMCustomerByDepositId().getCustomerCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			// [#71] BugFix 2017.08.23 ase start
//			tInventoryInst.setDepositId(mCustomer.getCustomerId());
			inventoryB.setDepositId(mCustomer.getCustomerId());
			// [#71] BugFix 2017.08.23 ase end
		}

		// 在庫区分ID
		if (!CU.isNullOrEmpty(body.getMStockType().getStockTypeCd())) {
			MStockType mStockType = new MStockType();
			mStockType.setStockTypeCd(body.getMStockType().getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			// [#71] BugFix 2017.08.23 ase start
//			tInventoryInst.setStockTypeId(mStockType.getStockTypeId());
			inventoryB.setStockTypeId(mStockType.getStockTypeId());
			// [#71] BugFix 2017.08.23 ase end
		}

		//ゾーンID取得
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

		//棚卸ヘッダ
		inventoryH.setClientId(mClient.getClientId());
		inventoryH.setCenterId(mCenter.getCenterId());
		inventoryH.setInventoryDt(header.getInventoryDt());

		//棚卸指示
		tInventoryInst.setFromLocationCd(inst.getFromLocationCd());
		tInventoryInst.setToLocationCd(inst.getToLocationCd());
		tInventoryInst.setFromStockInoutDt(inst.getFromStockInoutDt());
		tInventoryInst.setToStockInoutDt(inst.getToStockInoutDt());
		tInventoryInst.setStockExistOnlyFlg(inst.getStockExistOnlyFlg());

		//棚卸データ削除
		createLogic.delete(inventoryH, inventoryB, tInventoryInst, zoneIdList, errRetSts(StatusCode.INVENTORY_CREATE_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.STOCK_COUNT_DELETE_COMPLETE_INFORMATION);

		return null;

	}
	// 棚卸データ削除ボータン追加 2017.07.18 aungtun End

	// [#71] 2削除データチェック 2017.08.23 ase start
	/**
	 * <h2>削除データチェック。</h2>
	 * <pre>
	 * 削除データのチェックを行う
	 * </pre>
	 * @param inventoryCreateDto 棚卸データ作成画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/deleteDataCheck")
	public StatusDto deleteDataCheck(InventoryCreateDto inventoryCreateDto) {

		//棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH header = headerMapper.mappingToEntity(inventoryCreateDto.data.head);

		//棚卸ヘッダ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryCreateDto.data.body);

		TInventoryInstDtoMapper instMapper = new TInventoryInstDtoMapper();
		TInventoryInst inst = instMapper.mappingToEntity(inventoryCreateDto.data.Inst);

		//棚卸ヘッダ
		TInventoryH inventoryH = new TInventoryH();

		//棚卸ボディ
		TInventoryB inventoryB = new TInventoryB();

		//棚卸指示
		TInventoryInst tInventoryInst = new TInventoryInst();

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
			inventoryB.setWarehouseId(mWarehouse.getWarehouseId());
		}

		// 預託ID取得
		if (!CU.isNullOrEmpty(body.getMCustomerByDepositId().getCustomerCd())) {
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(mClient.getClientId());
			mCustomer.setCustomerCd(body.getMCustomerByDepositId().getCustomerCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			// [Ver3.0][#4270] セットするオブジェクトの不備修正 2018.04.12 shimizu Start
			inventoryB.setDepositId(mCustomer.getCustomerId());
			// [Ver3.0][#4270] セットするオブジェクトの不備修正 2018.04.12 shimizu End
		}

		// 在庫区分ID
		if (!CU.isNullOrEmpty(body.getMStockType().getStockTypeCd())) {
			MStockType mStockType = new MStockType();
			mStockType.setStockTypeCd(body.getMStockType().getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			// [Ver3.0][#4270] セットするオブジェクトの不備修正 2018.04.12 shimizu Start
			inventoryB.setStockTypeId(mStockType.getStockTypeId());
			// [Ver3.0][#4270] セットするオブジェクトの不備修正 2018.04.12 shimizu End
		}

		//ゾーンID取得
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

		//棚卸ヘッダ
		inventoryH.setClientId(mClient.getClientId());
		inventoryH.setCenterId(mCenter.getCenterId());
		inventoryH.setInventoryDt(header.getInventoryDt());

		//棚卸指示
		tInventoryInst.setFromLocationCd(inst.getFromLocationCd());
		tInventoryInst.setToLocationCd(inst.getToLocationCd());
		tInventoryInst.setFromStockInoutDt(inst.getFromStockInoutDt());
		tInventoryInst.setToStockInoutDt(inst.getToStockInoutDt());
		tInventoryInst.setStockExistOnlyFlg(inst.getStockExistOnlyFlg());

		createLogic.deleteCheck(inventoryH, inventoryB, tInventoryInst, zoneIdList, errRetSts(StatusCode.INVENTORY_CREATE_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {

			// 処理中止
			return null;
		}

		return null;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 在庫調整フラグのチェックを行う
	 * </pre>
	 * @param inventoryCreateDto 棚卸データ作成画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/deleteInputCheck")
	public StatusDto deleteInputCheck(InventoryCreateDto inventoryCreateDto) {

		//棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH header = headerMapper.mappingToEntity(inventoryCreateDto.data.head);

		//棚卸ヘッダ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryCreateDto.data.body);

		TInventoryInstDtoMapper instMapper = new TInventoryInstDtoMapper();
		TInventoryInst inst = instMapper.mappingToEntity(inventoryCreateDto.data.Inst);

		//棚卸ヘッダ
		TInventoryH inventoryH = new TInventoryH();

		//棚卸ボディ
		TInventoryB inventoryB = new TInventoryB();

		//棚卸指示
		TInventoryInst tInventoryInst = new TInventoryInst();

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
			inventoryB.setWarehouseId(mWarehouse.getWarehouseId());
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
			mStockType.setStockTypeCd(body.getMStockType().getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			tInventoryInst.setStockTypeId(mStockType.getStockTypeId());
		}

		//ゾーンID取得
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

		//棚卸ヘッダ
		inventoryH.setClientId(mClient.getClientId());
		inventoryH.setCenterId(mCenter.getCenterId());
		inventoryH.setInventoryDt(header.getInventoryDt());

		//棚卸指示
		tInventoryInst.setFromLocationCd(inst.getFromLocationCd());
		tInventoryInst.setToLocationCd(inst.getToLocationCd());
		tInventoryInst.setFromStockInoutDt(inst.getFromStockInoutDt());
		tInventoryInst.setToStockInoutDt(inst.getToStockInoutDt());
		tInventoryInst.setStockExistOnlyFlg(inst.getStockExistOnlyFlg());

		//棚卸入力が行われたデータがある場合
		checkLogic.checkDeleteTInventory(inventoryH, inventoryB, tInventoryInst, zoneIdList, errRetSts(StatusCode.STOCK_ADJUST_FLAG_CHECK_FAILED));

		checkLogic.checkDeleteTStock(inventoryH, inventoryB, tInventoryInst, zoneIdList, errRetSts(StatusCode.STOCK_INTRANSIT_CHECK_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {

			// 処理中止
			return null;
		}

		return null;
	}
	// [#71] 2削除データチェック 2017.08.23 ase end

}
