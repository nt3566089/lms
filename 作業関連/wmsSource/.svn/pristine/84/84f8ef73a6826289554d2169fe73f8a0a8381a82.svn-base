package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.LocationMasterDto;
import com.oneslogi.wms.dto.master.LocationMasterEditDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.ProductShapeLogic;
import com.oneslogi.wms.logic.common.ShapeGrpDtlLogic;
import com.oneslogi.wms.logic.common.ShapeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.TStockHandCheckLogic;
import com.oneslogi.wms.logic.common.TransactionDataCheckLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.master.LocationMasterInsertLogic;
import com.oneslogi.wms.logic.master.LocationMasterSelectLogic;
import com.oneslogi.wms.logic.master.LocationMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ロケーションマスタメンテナンス編集画面のリソースクラス。
 */
@Path("/master/locationMasterEdit")
public class LocationMasterEditResource extends AbstractWmsResource {

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ZoneLogic zoneLogic;
	@Inject
	private TStockHandCheckLogic tStockHandCheckLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private ShapeLogic shapeLogic;
	@Inject
	private ProductShapeLogic productShapeLogic;
	// [Ver3.0] unit of measure対応 2017.12.01 NING Start
	@Inject
	private ShapeGrpDtlLogic shapeGrpDtlLogic;
	// [Ver3.0] unit of measure対応 2017.12.01 NING Start
	@Inject
	private LocationMasterInsertLogic insertLogic;
	@Inject
	private LocationMasterUpdateLogic updateLogic;
	@Inject
	private LocationMasterSelectLogic selectLogic;
	// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private CustomerLogic cusotmerLogic;
	// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
	// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
	@Inject
	private TransactionDataCheckLogic transactionDataCheckLogic;
	// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK, ERROR,
		STOCK_NOT_FOUND,
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		TRAN_DATA_FOUND_ERROR
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
	}

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
		 * 在庫データで存在異常
		 */
		protected static final int STOCK_DATA_FOUND_FAILED = 2;
		/**
		 * ロケーションCD重複
		 */
		protected static final int LOCATION_CODE_DUPLICATE = 3;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 4;
		/**
		 * ロケーションマスタ登録異常
		 */
		protected static final int LOCATION_MASTER_INSERT_FAILED = 5;
		/**
		 * ロケーションマスタ更新異常
		 */
		protected static final int LOCATION_MASTER_UPDATE_FAILED = 6;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 7;
		/**
		 * ロケーション名称重複
		 */
		protected static final int LOCATION_NAME_DUPLICATE = 8;
		/**
		 * ゾーン取得異常
		 */
		protected static final int NOT_FOUND_ZONE = 9;

		// [エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		/**
		 * 商品コード取得異常
		 */
		protected static final int PRODUCT_CODE_NOT_FOUND_ERROR = 10;
		/**
		 * 補充点荷姿取得異常
		 */
		protected static final int PRODUCT_SHAPE_REP_NOT_FOUND_ERROR = 11;
		/**
		 * 最大格納数商品荷姿取得異常
		 */
		protected static final int PRODUCT_SHAPE_MAX_NOT_FOUND_ERROR = 12;
		// [エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		/**
		 * 倉庫取得エラー
		 */
		protected static final int NOT_FOUND_WAREHOUSE = 13;
		/**
		 * 荷主取得エラー
		 */
		protected static final int NOT_FOUND_CLIENT = 14;
		/**
		 * 在庫区分エラー
		 */
		protected static final int NOT_FOUND_STOCK_TYPE = 15;
		/**
		 * 預託取得エラー
		 */
		protected static final int NOT_FOUND_DEPOSIT = 16;
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		/**
		 * トランザクションデータ存在エラー
		 */
		protected static final int TRAN_DATA_FOUND_ERROR = 17;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 *
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 *
	 * @return LocationMasterEditDto ロケーションマスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public LocationMasterEditDto initNew() {
		return new LocationMasterEditDto();
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 *
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 *
	 * @param locationMasterDto ロケーションマスタメンテナンス(編集)画面用DTO
	 * @return LocationMasterDto ロケーションマスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public LocationMasterDto initUpdate(LocationMasterDto locationMasterDto) {

		// [#3484] 戻り値をlistからentityに変更 2018.03.05 kawana Start
		// ロケーションマスタ取得用
		MLocation selectEntity = selectLogic.selectById(locationMasterDto.data.head.getLocationId(), errRetSts(StatusCode.NOT_FOUND_DATA));
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// [#3484] 不要なコード(空オブジェクトのnew作業)を削除 2018.02.27 kawana

		// Entity-Dto変換処理
		MLocationDtoMapper mLocationMapper = new MLocationDtoMapper();
		MLocationDto dto = mLocationMapper.mappingToDto(selectEntity);

		// [ON推-品向-1138] 画面で使用しているDTOの作成を追加 2016.04.25 kawana Start
		// 検索結果を設定
		locationMasterDto.data.head = LocationMasterEditDto.chaseMLocationDto(dto);
		// [ON推-品向-1138] 画面で使用しているDTOの作成を追加 2016.04.25 kawana End
		// [#3484] 戻り値をlistからentityに変更 2018.03.05 kawana End

		return locationMasterDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 *
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 *
	 * @param locationMasterDto  ロケーションマスタ画面用DTO
	 * @param errSts  ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(LocationMasterDto locationMasterDto, ErrorStatus errSts) {

		// Entity変換
		MLocationDtoMapper mLocationMapper = new MLocationDtoMapper();
		// List<MLocation> locationList =
		// mLocationMapper.mappingToEntityList(locationMasterDto.data.body);
		List<MLocationDto> headLocation = new ArrayList<MLocationDto>();
		headLocation.add(locationMasterDto.data.head);
		List<MLocation> locationList = mLocationMapper.mappingToEntityList(headLocation);

		MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		MCenter mCenter = mCenterDtoMapper.mappingToEntity(locationMasterDto.data.head.getMCenter());
		for (MLocation mLocation : locationList) {
			mLocation.setMCenter(mCenter);
		}

		// [エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		ResultSetupData resultStatus = setupData(locationList, errRetSts(StatusCode.INPUT_CHECK));
		// [エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
		switch (resultStatus) {
		case ERROR:
			// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.22 kawana Start
		case STOCK_NOT_FOUND:
			// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.22 kawana End
			// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		case TRAN_DATA_FOUND_ERROR:
			// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
			break;
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		default:
			break;
		}
		return null;
	}

	/**
	 * <h2>チェック処理。</h2>
	 *
	 * <pre>
	 * 以下のチェックを行う。
	 * ・ロケーションＣＤ重複チェック
	 * ・ロケーション名称重複チェック
	 * ・在庫チェック存在チェック
	 * </pre>
	 *
	 * @param mLocationList
	 *            ロケーションマスタ画面List
	 * @param errSts
	 *            ErrorStatus
	 * @return ResultSetupData 結果
	 */
	protected ResultSetupData setupData(List<MLocation> mLocationList, ErrorStatus errSts) {
		// 登録されていないセンタがあるか
		boolean isNullStock = false;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		boolean existTran = false;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start

		int rowIndex = 0;
		// チェック処理
		for (MLocation mLocation : mLocationList) {

			// センタID取得
			MCenter centerCondition = new MCenter();
			centerCondition.setCenterCd(mLocation.getMCenter().getCenterCd());
			MCenter center = centerLogic.getUkEntity(centerCondition);

			if (center != null) {

				final long centerId = center.getCenterId();
				mLocation.setCenterId(centerId);

				// 倉庫取得
				MWarehouse warehouseCondition = new MWarehouse();
				warehouseCondition.setWarehouseCd(mLocation.getMZone().getMWarehouse().getWarehouseCd());
				warehouseCondition.setCenterId(centerId);
				MWarehouse warehouse = warehouseLogic.getUkEntity(warehouseCondition, new ErrorStatus(errSts, StatusCode.NOT_FOUND_WAREHOUSE, rowIndex));
				if (warehouse != null) {

					// ゾーン取得
					MZone zoneCondition = new MZone();
					zoneCondition.setWarehouseId(warehouse.getWarehouseId());
					zoneCondition.setZoneCd(mLocation.getMZone().getZoneCd());
					MZone zone = zoneLogic.getUkEntity(zoneCondition, new ErrorStatus(errSts, StatusCode.NOT_FOUND_ZONE, rowIndex));
					if (zone != null) {
						mLocation.setZoneId(zone.getZoneId());
					}
				}

				// ロケーションCD、名称重複チェック
				if (mLocation.getLocationId() == null) {
					// 登録の場合
					// ロケーションCD重複チェック
					locationLogic.checkLocationCdInsert(mLocation, errRetSts(errSts, StatusCode.LOCATION_CODE_DUPLICATE, rowIndex));
					// ロケーション名称重複チェック
					locationLogic.checkLocationNmInsert(mLocation, errRetSts(errSts, StatusCode.LOCATION_NAME_DUPLICATE, rowIndex));
				} else {
					// 修正の場合
					// ロケーション名称重複チェック
					locationLogic.checkLocationNmInsert(mLocation, errRetSts(errSts, StatusCode.LOCATION_NAME_DUPLICATE, rowIndex));

					if (mLocation.getLocationCd() != null && mLocation.getDelFlg().equals("1")) {
						// 削除

						// 在庫存在チェック
						TStock tStock = new TStock();
						tStock.setLocationId(mLocation.getLocationId());

						MWarehouse mWarehouse = new MWarehouse();
						mWarehouse.setCenterId(mLocation.getCenterId());
						mWarehouse.setWarehouseId(mLocation.getMZone().getWarehouseId());

						boolean isNullStockRow = tStockHandCheckLogic.checkData(tStock, mWarehouse, errRetSts(StatusCode.STOCK_DATA_FOUND_FAILED, rowIndex));
						if (isNullStockRow) {

							isNullStock = true;
						}

						// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
						// トランザクション存在チェック
						boolean existTranRow = transactionDataCheckLogic.existTran(mLocation);
						if (existTranRow) {
							existTran = true;
						}
						// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
					}
				}
			}

			// 補充関連IDを取得・設定
			setupReplenishData(mLocation, errSts, rowIndex);

			rowIndex++;
		}

		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

		// 結果の設定
		ResultSetupData resultStatus;
		if (isNullStock) {
			resultStatus = ResultSetupData.STOCK_NOT_FOUND;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		} else if (existTran) {
			resultStatus = ResultSetupData.TRAN_DATA_FOUND_ERROR;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		} else if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		switch (resultStatus) {
		case ERROR:
			break;
		case STOCK_NOT_FOUND:
			// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.25 kawana Start
			// 在庫が存在するため削除不可 - エラーメッセージ表示
			getErrorManager().add(errRetSts(errSts, StatusCode.STOCK_DATA_FOUND_FAILED), WmsMessageConst.STOCK_DATA_FOUND_ERROR);
			// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.25 kawana End
			break;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		case TRAN_DATA_FOUND_ERROR:
			getErrorManager().add(errRetSts(StatusCode.TRAN_DATA_FOUND_ERROR), WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
			break;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		default:
			break;
		}
		return resultStatus;
	}

	// [#3484][#3470] 荷主のドロップダウンを追加/小数有り商品指定不可対応 2018.02.28 kawana Start

	/**
	 * <h2>補充情報の設定.</h2>
	 * <pre>
	 * 入力内容から下記の補充関連のIDを取得し設定する。
	 * ・補充商品ID
	 * ・補充在庫区分ID
	 * ・補充預託ID
	 * ・補充点商品荷姿ID
	 * ・最大格納数商品荷姿ID
	 *
	 * </pre>
	 *
	 * @param location 設定先ロケーションマスタ
	 * @param errSts エラー時のエラーステータス
	 * @param rowIndex エラー時のエラーインデックス
	 */
	protected void setupReplenishData(MLocation location, ErrorStatus errSts, int rowIndex) {

		if (location.getMProduct().getProductCd() == null) {
			// 補充商品の設定なし

			location.setReplenishStockTypeId(null);
			location.setReplenishDepositId(null);
			location.setReplenishProductId(null);
			location.setReplenishPProductShapeId(null);
			location.setMaxStoreProductShapeId(null);

			return;
		}

		// ===== 荷主 =====

		String clientCd = location.getMProduct().getMClient().getClientCd();
		if (CU.isNullOrEmpty(clientCd)) {
			getErrorManager().add(new ErrorStatus(errSts, StatusCode.NOT_FOUND_CLIENT, rowIndex), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			// 以降、荷主IDを使うため終了
			return;
		}

		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		MClient client = clientLogic.getUkEntity(clientCondition, new ErrorStatus(errSts, StatusCode.NOT_FOUND_CLIENT, rowIndex));
		if (client == null) {
			// 以降、荷主IDを使うため終了
			return;
		}
		final long clientId = client.getClientId();

		// ===== 在庫区分 =====

		String stockTypeCd = location.getMStockType().getStockTypeCd();

		if (CU.isNullOrEmpty(stockTypeCd)) {

			getErrorManager().add(new ErrorStatus(errSts, StatusCode.NOT_FOUND_STOCK_TYPE, rowIndex), WmsMessageConst.STOCK_TYPE_CD_NOT_INPUT_ERROR);
		} else {

			MStockType stockTypeCondition = new MStockType();
			stockTypeCondition.setStockTypeCd(stockTypeCd);
			MStockType stockType = stockTypeLogic.getUkEntity(stockTypeCondition, new ErrorStatus(errSts, StatusCode.NOT_FOUND_STOCK_TYPE, rowIndex));
			if (stockType != null) {
				location.setReplenishStockTypeId(stockType.getStockTypeId());
			}
		}

		// ===== 預託 =====

		String depositCd = location.getMCustomer().getCustomerCd();

		if (CU.isNullOrEmpty(depositCd)) {

			getErrorManager().add(new ErrorStatus(errSts, StatusCode.NOT_FOUND_DEPOSIT, rowIndex), WmsMessageConst.PLAN_DEPOSIT_CD_NOT_INPUT_ERROR);
		} else {

			MCustomer depositCondition = new MCustomer();
			depositCondition.setClientId(clientId);
			depositCondition.setCustomerCd(depositCd);
			MCustomer deposit = cusotmerLogic.getDepositCustomer(depositCondition, new ErrorStatus(errSts, StatusCode.NOT_FOUND_DEPOSIT, rowIndex));
			if (deposit != null) {
				location.setReplenishDepositId(deposit.getCustomerId());
			}
		}

		// ===== 商品 =====

		MProduct productCondition = new MProduct();
		productCondition.setProductCd(location.getMProduct().getProductCd());
		productCondition.setClientId(clientId);
		MProduct product = productLogic.getUkEntity(productCondition, new ErrorStatus(errSts, StatusCode.PRODUCT_CODE_NOT_FOUND_ERROR, rowIndex));
		if (product == null) {
			// 以降、商品IDを使うため終了
			return;
		}

		if (product.getMShapeGrp().isDecimalExistFlg$1()) {
			// 小数有り商品は指定不可
			getErrorManager().add(new ErrorStatus(errSts, StatusCode.PRODUCT_CODE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.INPUT_PRODUCT_DECIMAL_EXIST_FLG_ERROR);
			return;
		}

		final long productId = product.getProductId();
		final long shapeGrpId = product.getShapeGrpId();
		location.setReplenishProductId(productId);

		// ===== 補充点商品荷姿 =====

		String shapeCd = location.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd();

		MProductShape productShape = selectProductShape(productId, shapeGrpId, shapeCd, new ErrorStatus(errSts, StatusCode.PRODUCT_SHAPE_REP_NOT_FOUND_ERROR, rowIndex));
		if (productShape != null) {
			location.setReplenishPProductShapeId(productShape.getProductShapeId());
		} else {
			location.setReplenishPProductShapeId(null);
		}

		// ===== 最大格納数商品荷姿 =====

		String maxShapeCd = location.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd();

		MProductShape maxProductShape = selectProductShape(productId, shapeGrpId, maxShapeCd, new ErrorStatus(errSts, StatusCode.PRODUCT_SHAPE_MAX_NOT_FOUND_ERROR, rowIndex));
		if (maxProductShape != null) {
			location.setMaxStoreProductShapeId(maxProductShape.getProductShapeId());
		} else {
			location.setMaxStoreProductShapeId(null);
		}
	}

	/**
	 * 商品荷姿マスタの検索
	 */
	private MProductShape selectProductShape(final long productId, final long shapeGrpId, String shapeCd, ErrorStatus errSts) {

		if (CU.isNullOrEmpty(shapeCd)) {
			// 設定なし
			return null;
		}

		// 荷姿マスタ
		MShape shapeCondition = new MShape();
		shapeCondition.setShapeCd(shapeCd);
		MShape shape = shapeLogic.getUkEntity(shapeCondition);

		if (shape == null) {
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_SHAPE_NOT_FOUND_ERROR);
			return null;
		}

		final long shapeId = shape.getShapeId();

		// 荷姿グループ明細マスタ
		MShapeGrpDtl shapeGrpDtlCondition = new MShapeGrpDtl();
		shapeGrpDtlCondition.setShapeId(shapeId);
		shapeGrpDtlCondition.setShapeGrpId(shapeGrpId);
		MShapeGrpDtl shapeGrpDtl = shapeGrpDtlLogic.getUkEntity(shapeGrpDtlCondition);

		if (shapeGrpDtl == null) {
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_SHAPE_NOT_FOUND_ERROR);
			return null;
		}

		final long shapeGrpDtlId = shapeGrpDtl.getShapeGrpDtlId();

		// 商品荷姿マスタ
		MProductShape productShapeCondition = new MProductShape();
		productShapeCondition.setProductId(productId);
		productShapeCondition.setShapeGrpDtlId(shapeGrpDtlId);
		MProductShape productShape = productShapeLogic.getUkEntity(productShapeCondition);
		if (productShape == null) {
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_SHAPE_NOT_FOUND_ERROR);
			return null;
		}

		return productShape;
	}

	// [#3484][#3470] 荷主のドロップダウンを追加/小数有り商品指定不可対応 2018.02.28 kawana End

	/**
	 * <h2>ロケーションマスタ登録 。</h2>
	 *
	 * <pre>
	 * 登録データのチェックを行う。
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 *
	 * @param locationMasterDto
	 *            ロケーションマスタ画面用DTO
	 * @param errSts
	 *            ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(LocationMasterDto locationMasterDto, ErrorStatus errSts) {
		// Entity変換
		MLocationDtoMapper mLocationMapper = new MLocationDtoMapper();
		// List<MLocation> locationList =
		// mLocationMapper.mappingToEntityList(locationMasterDto.data.body);
		List<MLocationDto> headLocation = new ArrayList<MLocationDto>();
		headLocation.add(locationMasterDto.data.head);
		List<MLocation> locationList = mLocationMapper.mappingToEntityList(headLocation);

		// ゾーンCD取得
		MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		MCenter mcenter = mCenterDtoMapper.mappingToEntity(locationMasterDto.data.head.getMCenter());

		// ピックロケフラグ取得
		for (MLocation mLocation : locationList) {
			mLocation.setMCenter(mcenter);
		}

		ResultSetupData resultStatus = setupData(locationList, errRetSts(StatusCode.INPUT_CHECK));

		// 結果判定
		if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}

		List<MLocation> insertList = new ArrayList<>();
		List<MLocation> updateList = new ArrayList<>();

		for (MLocation mLocation : locationList) {

			// [#3484] 荷主のドロップダウンを追加(IDの設定処理をsetupDataメソッドで行うためここから削除) 2018.02.27 kawana

			// [エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
			if (mLocation.getLocationId() == null) {
				// 登録
				insertList.add(mLocation);
			} else {
				// 修正
				updateList.add(mLocation);
			}
		}
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
		if (!insertList.isEmpty()) {
			insertLogic.batchInsert(insertList, errRetSts(StatusCode.LOCATION_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()) {
			updateLogic.batchUpdate(updateList, errRetSts(StatusCode.LOCATION_MASTER_INSERT_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		// [ON推-品向-146]「正常に更新されました。」に修正 2014.11.26 衛 Start
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		// [ON推-品向-146]「正常に更新されました。」に修正 2014.11.26 衛 End
		return null;
	}

}
