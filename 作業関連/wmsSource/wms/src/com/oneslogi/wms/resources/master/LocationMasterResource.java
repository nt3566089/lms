package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MZoneDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.LocationMasterDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.TStockHandCheckLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.master.LocationMasterInsertLogic;
import com.oneslogi.wms.logic.master.LocationMasterSelectLogic;
import com.oneslogi.wms.logic.master.LocationMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ロケーションマスタメンテナンス画面のリソースクラス。
 */
@Path("/master/locationMasterList")
public class LocationMasterResource extends AbstractWmsResource {

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

		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
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
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private LocationMasterSelectLogic selectLogic;
	@Inject
	private LocationMasterInsertLogic insertLogic;
	@Inject
	private LocationMasterUpdateLogic updateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private MLocationBhv mLocationBhv;
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

	// [Ver3.0] unit of measure対応 2017.12.27 NING Del

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR,
		STOCK_NOT_FOUND
	}

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return LocationMasterDto ロケーションマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public LocationMasterDto initNew() {

		// 画面用DTO作成
		LocationMasterDto locationMasterDto = new LocationMasterDto();

		return locationMasterDto;
	}

	/**
	 * <h2>ロケーションマスタ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return LocationMasterDto ロケーションマスタ一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public LocationMasterDto fileUpload(MultipartFormDataInput input) throws Exception {

		// 画面用DTO作成
		LocationMasterDto LocationMasterDto = new LocationMasterDto();

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(LocationMasterDto, param);
			rows += conv.getUploadRows();
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return LocationMasterDto;
	}

	/**
	 * <h2>ロケーションマスタデータ取得</h2>
	 * <pre>
	 * ロケーションマスタデータの一括取得処理
	 * </pre>
	 * @param locationMasterDto ロケーションマスタ一括取込画面用DTO
	 * @return LocationMasterDto ロケーションマスタ一括取込画面用DTO
	 */
	@GET
	@Path("/getMasterData")
	public LocationMasterDto getMasterData(LocationMasterDto locationMasterDto) {

		// データが存在しない場合
		if (locationMasterDto.data.body.size() == 0) {
			return locationMasterDto;
		}

		// エンティティに変換
		// ヘッダ項目
		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
		MLocation searchCondition = mLocationDtoMapper.mappingToEntity(locationMasterDto.data.head);

		// 一覧項目
		List<MLocation> mLocationList = mLocationDtoMapper.mappingToEntityList(locationMasterDto.data.body);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 存在チェック用配列
		Map<String, MLocation> locationCdMap = new HashMap<String, MLocation>();

		// 一覧件数分ループ(Map作成)
		for (MLocation location : mLocationList) {
			// チェック用配列に格納
			if (!CU.isNullOrEmpty(location.getLocationCd()) && !locationCdMap.containsKey(location.getLocationCd())) {
				locationCdMap.put(location.getLocationCd(), null);
			}
		}

		// 初期値設定
		List<MLocation> mLocationDbList = null;

		// ロケーションマスタ一括取得
		if (locationCdMap.size() > 0) {
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			// 検索条件設定
			MLocationCB cbMLocation = mLocationBhv.newConditionBean();
			cbMLocation.setupSelect_MZone().withMWarehouse();
			cbMLocation.query().setLocationCd_InScope(locationCdMap.keySet()); // ロケーションCDが一緒
			cbMLocation.query().queryMCenter().setCenterCd_Equal(searchCondition.getMCenter().getCenterCd()); // センタIDが一緒

			// ロケーションマスタ取得
			mLocationDbList = mLocationBhv.selectList(cbMLocation);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		// 取得したロケーションデータをMap化
		locationCdMap.clear();
		if (mLocationDbList != null) {
			for (MLocation mLocation : mLocationDbList) {
				locationCdMap.put(mLocation.getLocationCd(), mLocation);
			}
		}

		for (MLocation mLocation : mLocationList) {
			// LocationCd一致確認
			if (locationCdMap.containsKey(mLocation.getLocationCd())) {
				// 一致するデータがある場合
				mLocation.setLocationId(locationCdMap.get(mLocation.getLocationCd()).getLocationId());
				mLocation.getMZone().getMWarehouse().setWarehouseCd(locationCdMap.get(mLocation.getLocationCd()).getMZone().getMWarehouse().getWarehouseCd()); // WarehouseCD セット
				// [EC-CT1-153] 更新処理の場合共通項目をセットする 2015.03.30 koyama Start
				mLocation.setVersionNo(locationCdMap.get(mLocation.getLocationCd()).getVersionNo());
				mLocation.setControlNo(locationCdMap.get(mLocation.getLocationCd()).getControlNo());
				mLocation.setAddDt(locationCdMap.get(mLocation.getLocationCd()).getAddDt());
				mLocation.setAddUser(locationCdMap.get(mLocation.getLocationCd()).getAddUser());
				mLocation.setAddProcess(locationCdMap.get(mLocation.getLocationCd()).getAddProcess());
				mLocation.setUpdDt(locationCdMap.get(mLocation.getLocationCd()).getUpdDt());
				mLocation.setUpdUser(locationCdMap.get(mLocation.getLocationCd()).getUpdUser());
				mLocation.setUpdProcess(locationCdMap.get(mLocation.getLocationCd()).getUpdProcess());
				// [EC-CT1-153] 更新処理の場合共通項目をセットする 2015.03.30 koyama End
			} else {
				// 一致するデータがない場合
				mLocation.setLocationId(null);
				mLocation.setDelFlg("0");
			}
		}

		locationMasterDto.data.body = mLocationDtoMapper.mappingToDtoList(mLocationList);
		return locationMasterDto;
	}

	/**
	 * <h2>ロケーションマスタメンテナンスデータ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・一覧データ取得
	 * ・ロケーションマスタメンテナンス画面用DTOデータ設定
	 * </pre>
	 * @param locationMasterDto ロケーションマスタメンテナンス画面用DTO
	 * @return LocationMasterDto ロケーションマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public LocationMasterDto search(LocationMasterDto locationMasterDto) {

		// Entity変換
		MLocationDtoMapper mLocationMapper = new MLocationDtoMapper();
		MLocation mLocation = mLocationMapper.mappingToEntity(locationMasterDto.data.head);

		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mLocation.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		mLocation.setCenterId(mCenter.getCenterId());

		MWarehouseDtoMapper mWarehouseMapper = new MWarehouseDtoMapper();
		MWarehouse mWarehouse = mWarehouseMapper.mappingToEntity(locationMasterDto.data.head.getMZone().getMWarehouse());
		mWarehouse.setCenterId(mCenter.getCenterId());
		mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
		// [SK2-051] ゾーン項目を指定して発行すると「致命的エラー～」のメッセージが表示される。2014.12.13 KI Start
		MZoneDtoMapper mZoneMapper = new MZoneDtoMapper();
		MZone mZone = mZoneMapper.mappingToEntity(locationMasterDto.data.head.getMZone());
		if (mWarehouse == null) {
			mWarehouse = new MWarehouse();
		}else{
			mZone.setWarehouseId(mWarehouse.getWarehouseId());
			mZone = zoneLogic.getUkEntity(mZone);
		}
		// [SK2-051] ゾーン項目を指定して発行すると「致命的エラー～」のメッセージが表示される。2014.12.13 KI End
		if (mZone == null) {
			mZone = new MZone();
		}

		// ロケーションマスタ取得用
		List<MLocation> selectEntity = selectLogic.select(mLocation, mWarehouse, mZone, locationMasterDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		for (MLocation mLoc : selectEntity) {
			if(mLoc.getMProduct() == null){
				mLoc.setMProduct(new MProduct());
			}
		}
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

		// Entity-Dto変換処理
		List<MLocationDto> list = mLocationMapper.mappingToDtoList(selectEntity);

		//検索結果詰込処理
		locationMasterDto.data.body = list;

		return locationMasterDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param locationMasterDto ロケーションマスタ画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(LocationMasterDto locationMasterDto, ErrorStatus errSts) {

		// Entity変換
		MLocationDtoMapper mLocationMapper = new MLocationDtoMapper();
		List<MLocation> locationList = mLocationMapper.mappingToEntityList(locationMasterDto.data.body);

		MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		MCenter mCenter = mCenterDtoMapper.mappingToEntity(locationMasterDto.data.head.getMCenter());
		for (MLocation mLocation : locationList) {
			mLocation.setMCenter(mCenter);
		}

		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
//		ResultSetupData resultStatus = check(locationList, errRetSts(StatusCode.INPUT_CHECK));
		ResultSetupData resultStatus = check(locationList, locationMasterDto.data.head.getClientId(),errRetSts(StatusCode.INPUT_CHECK));
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
		switch (resultStatus) {
		case ERROR:
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
	 * <h2>ロケーションマスタ登録 。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param locationMasterDto ロケーションマスタ画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(LocationMasterDto locationMasterDto, ErrorStatus errSts) {
		// Entity変換
		MLocationDtoMapper mLocationMapper = new MLocationDtoMapper();
		List<MLocation> locationList = mLocationMapper.mappingToEntityList(locationMasterDto.data.body);
		// ゾーンCD取得
		MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		MCenter mcenter = mCenterDtoMapper.mappingToEntity(locationMasterDto.data.head.getMCenter());
		// ピックロケフラグ取得
		for (MLocation mLocation : locationList) {
			mLocation.setMCenter(mcenter);
		}

		ResultSetupData resultStatus = check(locationList,locationMasterDto.data.head.getClientId(), errRetSts(StatusCode.INPUT_CHECK));

		// 結果判定
		if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}

		List<MLocation> insertList = new ArrayList<>();

		List<MLocation> updateList = new ArrayList<>();

		for (MLocation mLocation : locationList) {
			// センタID取得
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(mLocation.getMCenter().getCenterCd());
			mCenter = centerLogic.getUkEntity(mCenter);
			// センタID設定
			mLocation.setCenterId(mCenter.getCenterId());
			// ゾーンID取得
			MZone mZone = new MZone();
			mZone.setZoneCd(mLocation.getMZone().getZoneCd());

			// 倉庫ID設定
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(mLocation.getMZone().getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse, null);
			mLocation.getMZone().setWarehouseId(mWarehouse.getWarehouseId());

			mZone = zoneLogic.getUkEntity(mLocation.getMZone());

			// ゾーンID設定
			mLocation.setZoneId(mZone.getZoneId());

			//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
			if(mLocation.getMProduct().getProductCd() != null){
				MProduct mProduct = new MProduct();
				mProduct.setProductCd(mLocation.getMProduct().getProductCd());
				mProduct.setClientId(locationMasterDto.data.head.getClientId());
				mProduct=productLogic.getUkEntity(mProduct);
				mLocation.setReplenishProductId(mProduct.getProductId());

				if(mLocation.getMProductShapeByMaxStoreProductShapeId() != null){
					// [Ver3.0] unit of measure対応 2017.12.27 NING Del
				}else{
					mLocation.setMaxStoreProductShapeId(null);
				}
				if(mLocation.getMProductShapeByReplenishPProductShapeId()!= null){
					// [Ver3.0] unit of measure対応 2017.12.27 NING Del
				}else{
					mLocation.setReplenishPProductShapeId(null);
				}
			}else{
				mLocation.setReplenishProductId(null);
				mLocation.setMaxStoreProductShapeId(null);
				mLocation.setReplenishPProductShapeId(null);
			}

			//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
			if (mLocation.getLocationId() == null) {
				// 登録
				insertList.add(mLocation);
//				insertLogic.insert(mLocation, errRetSts(StatusCode.LOCATION_MASTER_INSERT_FAILED));
			} else {
				// 修正
				updateList.add(mLocation);
//				updateLogic.update(mLocation, errRetSts(StatusCode.LOCATION_MASTER_UPDATE_FAILED));
			}
		}
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
		if (!insertList.isEmpty()){
			insertLogic.batchInsert(insertList, errRetSts(StatusCode.LOCATION_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()){
			updateLogic.batchUpdate(updateList, errRetSts(StatusCode.LOCATION_MASTER_INSERT_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		//[ON推-品向-146]「正常に更新されました。」に修正 2014.11.26 衛 Start
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		//[ON推-品向-146]「正常に更新されました。」に修正 2014.11.26 衛 End
		return null;
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・ロケーションＣＤ重複チェック
	 * ・ロケーション名称重複チェック
	 * ・在庫チェック存在チェック
	 * </pre>
	 * @param mLocationList ロケーションマスタ画面List
	 * @param errSts ErrorStatus
	 * @return ResultSetupData 結果
	 */
	protected ResultSetupData check(List<MLocation> mLocationList, ErrorStatus errSts) {
		// 登録されていないセンタがあるか
		boolean isNullStock = false;
		int rowIndex = -1;

		// チェック処理
		for (MLocation mLocation : mLocationList) {
			rowIndex++;
			// センタID取得
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(mLocation.getMCenter().getCenterCd());
			mCenter = centerLogic.getUkEntity(mCenter);
			MZone zone = mLocation.getMZone();
			MWarehouse warehouse = new MWarehouse();
			warehouse.setWarehouseCd(mLocation.getMZone().getMWarehouse().getWarehouseCd());
			warehouse.setCenterId(mCenter.getCenterId());
			warehouse = warehouseLogic.getUkEntityWithCheck(warehouse, null);
			if (warehouse == null) {
				getErrorManager().add(new ErrorStatus(errSts, StatusCode.NOT_FOUND_ZONE, rowIndex), WmsMessageConst.ZONE_CODE_NOT_FOUND_IN_ZONE_MASTER_ERROR);
			} else {
				zone.setWarehouseId(warehouse.getWarehouseId());
				zone = zoneLogic.getUkEntity(zone, null);
				if (zone == null) {
					getErrorManager().add(new ErrorStatus(errSts, StatusCode.NOT_FOUND_ZONE, rowIndex), WmsMessageConst.ZONE_CODE_NOT_FOUND_IN_ZONE_MASTER_ERROR);
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
				// 在庫存在チェック
				if (mLocation.getLocationCd() != null && mLocation.getDelFlg().equals("1")) {
					TStock tStock = new TStock();
					tStock.setLocationId(mLocation.getLocationId());

					MWarehouse mWarehouse = new MWarehouse();
					mWarehouse.setCenterId(mLocation.getCenterId());
					mWarehouse.setWarehouseId(mLocation.getMZone().getWarehouseId());

					// [ON推-品向-827] 複数行の場合に在庫存在チェックされない問題を修正 2015.06.19 kawana Start
					boolean isNullStockRow = tStockHandCheckLogic.checkData(tStock, mWarehouse, errRetSts(StatusCode.STOCK_DATA_FOUND_FAILED, rowIndex));
					if (isNullStockRow) {

						isNullStock = true;
					}
					// [ON推-品向-827] 複数行の場合に在庫存在チェックされない問題を修正 2015.06.19 kawana End
				}
			}
		}
		// 結果の設定
		ResultSetupData resultStatus;
		if (isNullStock) {
			resultStatus = ResultSetupData.STOCK_NOT_FOUND;
		} else if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		switch (resultStatus) {
		case ERROR:
			break;
		case STOCK_NOT_FOUND:
			// 在庫データで存在異常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.STOCK_DATA_FOUND_FAILED), WmsMessageConst.STOCK_DATA_FOUND_ERROR);
			break;
		default:
			break;
		}
		return resultStatus;
	}

	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・ロケーションＣＤ重複チェック
	 * ・ロケーション名称重複チェック
	 * ・在庫チェック存在チェック
	 * </pre>
	 * @param mLocationList ロケーションマスタ画面List
	 * @param clientId 荷主Id
	 * @param errSts ErrorStatus
	 * @return ResultSetupData 結果
	 */
	protected ResultSetupData check(List<MLocation> mLocationList, Long clientId, ErrorStatus errSts) {
		// 登録されていないセンタがあるか
		boolean isNullStock = false;
		int rowIndex = -1;

		// チェック処理
		for (MLocation mLocation : mLocationList) {
			rowIndex++;
			// センタID取得
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(mLocation.getMCenter().getCenterCd());
			mCenter = centerLogic.getUkEntity(mCenter);
			MZone zone = mLocation.getMZone();
			MWarehouse warehouse = new MWarehouse();
			warehouse.setWarehouseCd(mLocation.getMZone().getMWarehouse().getWarehouseCd());
			warehouse.setCenterId(mCenter.getCenterId());
			warehouse = warehouseLogic.getUkEntityWithCheck(warehouse, null);
			if (warehouse == null) {
				getErrorManager().add(new ErrorStatus(errSts, StatusCode.NOT_FOUND_ZONE, rowIndex), WmsMessageConst.ZONE_CODE_NOT_FOUND_IN_ZONE_MASTER_ERROR);
			} else {
				zone.setWarehouseId(warehouse.getWarehouseId());
				zone = zoneLogic.getUkEntity(zone, null);
				if (zone == null) {
					getErrorManager().add(new ErrorStatus(errSts, StatusCode.NOT_FOUND_ZONE, rowIndex), WmsMessageConst.ZONE_CODE_NOT_FOUND_IN_ZONE_MASTER_ERROR);
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
				// 在庫存在チェック
				if (mLocation.getLocationCd() != null && mLocation.getDelFlg().equals("1")) {
					TStock tStock = new TStock();
					tStock.setLocationId(mLocation.getLocationId());

					MWarehouse mWarehouse = new MWarehouse();
					mWarehouse.setCenterId(mLocation.getCenterId());
					mWarehouse.setWarehouseId(mLocation.getMZone().getWarehouseId());

					boolean isNullStockRow = tStockHandCheckLogic.checkData(tStock, mWarehouse, errRetSts(StatusCode.STOCK_DATA_FOUND_FAILED, rowIndex));
					if (isNullStockRow) {

						isNullStock = true;
					}
				}
			}

			// 商品IDを設定
			if(mLocation.getMProduct().getProductCd() != null){
				MProduct mProduct = new MProduct();
				mProduct.setProductCd(mLocation.getMProduct().getProductCd());
				mProduct.setClientId(clientId);
				mProduct=productLogic.getUkEntity(mProduct);
				if(mProduct == null){
					// 商品IDを設定
					getErrorManager().add(new ErrorStatus(errSts, StatusCode.PRODUCT_CODE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.PRODUCT_CODE_NOT_FOUND_ERROR);
			    }else{
				if(mLocation.getMProductShapeByMaxStoreProductShapeId() != null){
					// [Ver3.0] unit of measure対応 2017.12.27 NING Del
				}
				if(mLocation.getMProductShapeByReplenishPProductShapeId() != null){
					// [Ver3.0] unit of measure対応 2017.12.27 NING Del
				 }
			  }
	       }
		}
		// 結果の設定
		ResultSetupData resultStatus;
		if (isNullStock) {
			resultStatus = ResultSetupData.STOCK_NOT_FOUND;
		} else if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		switch (resultStatus) {
		case ERROR:
			break;
		case STOCK_NOT_FOUND:
			// 在庫データで存在異常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.STOCK_DATA_FOUND_FAILED), WmsMessageConst.STOCK_DATA_FOUND_ERROR);
			break;
		default:
			break;
		}
		return resultStatus;
	}
	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
}
