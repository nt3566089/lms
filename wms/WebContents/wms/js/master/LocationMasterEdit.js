/**
 * @ngdoc overview
 * @name oneslogiWms.LocationMasterEdit
 *
 * @description
 * ロケーションマスタメンテナンス(編集)画面<br>
 *
 * ロケーションマスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.LocationMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.LocationMasterEdit.service:locationMasterEditApi
 *
 * @description
 * ロケーションマスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ロケーションマスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/locationMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/locationMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/locationMasterEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/master/locationMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/locationMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('LocationMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		supplierLocation: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/zip/record']
				 ]
		),
		wareHouseList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		zoneList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		shapeCdList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/shapeCD/query'],
				 ]
		),
		shapeCdListByProductCd: AngularAPIClient.make(
				[
				 ['queryByProductCd', 'GET', 'resources/common/productShape/queryByProductCd'],
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		clientList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/clientCenter/clientListNotUseUserClient']
				 ]
		),
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		locationList: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/locationMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/locationMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/locationMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/locationMasterEdit/register'],
				 ['update',             'POST', 'resources/master/locationMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.LocationMasterEdit.object:LocationMasterEdit
 *
 * @description
 * ロケーションマスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('LocationMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'LocationMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterEdit.object:LocationMasterEdit#initScreen
	 * @methodOf oneslogiWms.LocationMasterEdit.object:LocationMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// [#1866][Ver2.2.0] ロケーションマスタメンテナンス（編集）- 項目「センタ追加」 2017.06.01 honma Add Start
		// センタリストの設定
		$scope.centerList = userInfo.centerList;
		// [#1866][Ver2.2.0] ロケーションマスタメンテナンス（編集）- 項目「センタ追加」 2017.06.01 honma Add End

		// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.25 kawana Start
		// エラーコードと表示箇所の対応
		statusInfo.mappingErrorMessage($scope, "locationNm", 7, 8);
		statusInfo.mappingErrorMessage($scope, "locationCd", 7, 3);
		statusInfo.mappingErrorMessage($scope, "productCd", 7, 10);
		statusInfo.mappingErrorMessage($scope, "replenishPProductShapeId", 7, 11);
		statusInfo.mappingErrorMessage($scope, "maxStoreProductShapeId", 7, 12);
		// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.25 kawana End
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		statusInfo.mappingErrorMessage($scope, "warehouseCd", 7, 13);
		statusInfo.mappingErrorMessage($scope, "clientCd", 7, 14);
		statusInfo.mappingErrorMessage($scope, "replenishStockTypeId", 7, 15);
		statusInfo.mappingErrorMessage($scope, "replenishDepositId", 7, 16);
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterEdit.object:LocationMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.LocationMasterEdit.object:LocationMasterEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetPickingLocationFlg(),
				 $scope.deferredGetLocationType(),
				 $scope.deferredGetAllocNgFlg(),
				 $scope.deferredGetWarehouseCd(),
				 $scope.deferredGetDictNm(),
				// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
				 $scope.deferredGetClientList(),
				// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
				 $scope.deferredGetMaxShapeCd(),
				 $scope.deferredGetStockTypeList(),
				 $scope.deferredGetReplenishDepositList()
//				 $scope.deferredGetFlg(),
//				 $scope.deferredGetUpdType(),
//				 $scope.deferredGetReasonType(),
//				 $scope.deferredGetCodeType(),
//				 $scope.deferredGetCodeFlg(),
//				 $scope.deferredGetUpdCd(),
//				 $scope.deferredGetCompanyFlg()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetForeignFlg
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description ピックロケフラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPickingLocationFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PICKING_LOCATION_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.pickingLocationFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetForeignFlg
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description ロケーション種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLocationType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOCATION_TYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.locationTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetForeignFlg
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 引当禁止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAllocNgFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ALLC_NG_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.allocNgFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetForeignFlg
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description ピックロケフラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseCd = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerId = userInfo.centerId;

		//荷主センタ変更対応 201７.03.03 sja Start
//		if($scope.mLocationSearch) {
		if($route.current.params.centerCd) {
		//荷主センタ変更対応 201７.03.01 sja End
//			request.centerId = userInfo.centerIdByCd($scope.mLocationSearch.mcenter.centerCd);
			//荷主センタ変更対応 201７.03.01 sja Start
//			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
			//if ($route.current.params.mode == SCREEN_MODE.Register) {
			if ($route.current.params.mode == SCREEN_MODE.Create) {
				request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
			} else {
				request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
			}
			//荷主センタ変更対応 201７.03.03 sja End

		}

		api.wareHouseList.query(request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	$scope.deferredGetDictNm = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PICKING_LOCATION_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.dictNmList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetClientList
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description
	 *  荷主取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetClientList = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerId = userInfo.centerId;

		api.clientList.query(request).then(function(response){
			$scope.clientList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetMaxShapeCd
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 補充点ロケーション荷姿IDと最大格納数ロケーション荷姿ID取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMaxShapeCd = function () {
		var deferred = $q.defer();
		var request = {};
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		request.clientCd = $scope.getClientCd();
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

		api.shapeCdList.query(request).then(function(response){
			$scope.shapeList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetShapeCdByProductCd
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 補充商品IDの商品に紐付く商品荷姿マスタの荷姿IDを取得して、その一覧を荷姿マスタの名称と紐付けし、補充点荷姿と最大格納数商品荷姿のコンボボックスに設定する
	 */
	$scope.deferredGetShapeCdByProductCd = function () {
		var deferred = $q.defer();
		var request = {};
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		request.clientCd = $scope.getClientCd();
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
		request.productCd = $scope.head.mproduct.productCd;
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		// [Ver3.0] unit of measure対応 2017.11.28 NING Start
		request.clientId = $scope.getClientId();
		// [Ver3.0] unit of measure対応 2017.11.28 NING End
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
		api.shapeCdListByProductCd.queryByProductCd(request).then(function(response){
			$scope.shapeList = response.data;
			//[ON推-1.1.4-CT-038]CT指摘の修正対応 2016.06.21 chou Add Start
			if($scope.head != null){
				var index = 0;
				angular.forEach($scope.shapeList, function(row) {
					// [Ver3.0] unit of measure対応 2017.11.28 NING Start
					if(row.shapeCd == $scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape.shapeCd){
						// [Ver3.0] unit of measure対応 2017.11.28 NING End
						document.getElementsByName("replenishPProductShapeId")[0].selectedIndex = index + 1;
					}
					// [Ver3.0] unit of measure対応 2017.11.28 NING Start
					if(row.shapeCd == $scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape.shapeCd){
						// [Ver3.0] unit of measure対応 2017.11.28 NING End
						document.getElementsByName("maxStoreProductShapeId")[0].selectedIndex = index + 1;
					}

					index ++;
				});
			}
			//[ON推-1.1.4-CT-038]CT指摘の修正対応 2016.06.21 chou Add End
			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#deferredGetStockTypeList
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 補充在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {
		var deferred = $q.defer();

		api.stockType.keyValueList().then(function(response){
			$scope.stockTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * 補充預託取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReplenishDepositList = function() {

		var deferred = $q.defer();

		var request = {};
		request.data = {};
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		request.clientCd = $scope.getClientCd();
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

		api.depositCustomer.keyValueList(request).then(function(response){
			$scope.replenishDepositList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetFlg
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "ZIP_FLG";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.flgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetUpdType
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetUpdType = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "UPD_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.updTypeList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetReasonType
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetReasonType = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "REASON_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.reasonTypeList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetCodeType
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetCodeType = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "CODE_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.flg5List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetCodeFlg
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetCodeFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "CODE_FLG";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.flg6List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetUpdCd
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetUpdCd = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "UPD_CD";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.updCdList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#deferredGetCompanyFlg
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetCompanyFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "COMPANY_FLG";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.companyFlgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterEdit.object:LocationMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.LocationMasterEdit.object:LocationMasterEdit
	 *
	 * @description
	 * ロケーションマスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End
			// 訂正
			var request = {};
			request.data = {};
			request.data.head = {};
			request.data.head.locationId = $route.current.params.locationId;
			request.data.head.warehouseCd = $route.current.params.warehouseCd;
			api.locationList.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;

				var pickingLocationFlg = $scope.head.pickingLocationFlg;

				if (pickingLocationFlg == "0") {
//					optionMessageControl.hide($scope,"productCd");
//					optionMessageControl.hide($scope,"replenishStockTypeId");
//					optionMessageControl.hide($scope,"replenishDepositId");
//					optionMessageControl.hide($scope,"replenishPProductShapeId");
//					optionMessageControl.hide($scope,"maxStoreProductShapeId");
					if($scope.head.mproduct != null){
						$scope.head.mproduct.productCd = null;
						$scope.head.mproduct.productNm = null;
					}
					if($scope.head.mproductShapeByReplenishPProductShapeId != null){
						// [Ver3.0] unit of measure対応 2017.11.28 NING Start
						if ($scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl != null) {
							if ($scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape != null) {
								$scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape.shapeCd = null;
							}
						}
						// [Ver3.0] unit of measure対応 2017.11.28 NING End
					}
					$scope.head.replenishPNum = null;
					if($scope.head.mproductShapeByMaxStoreProductShapeId != null){
						// [Ver3.0] unit of measure対応 2017.11.28 NING Start
						if ($scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl != null) {
							if ($scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape != null) {
								$scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape.shapeCd = null;
							}
						}
						// [Ver3.0] unit of measure対応 2017.11.28 NING End
					}
					$scope.head.maxStoreNum = null;

					// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
					if ($scope.screenMode == SCREEN_MODE.Update) {
					// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End
						// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
						directiveControl.editable($scope, 'clientCd', false);
						// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
						directiveControl.editable($scope, 'productNm', false);
						directiveControl.editable($scope, 'replenishStockTypeId', false);
						directiveControl.editable($scope, 'replenishDepositId', false);
						directiveControl.editable($scope, 'productCd', false);
						directiveControl.editable($scope, 'replenishPProductShapeId', false);
						directiveControl.editable($scope, 'replenishPNum', false);
						directiveControl.editable($scope, 'maxStoreProductShapeId', false);
						directiveControl.editable($scope, 'maxStoreNum', false);
					// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
					}
					// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End

					//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang Start
				} else if (pickingLocationFlg == "1") {
					if($scope.head.mproduct.productCd == null){

						// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
						if ($scope.screenMode == SCREEN_MODE.Update) {
						// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End
							directiveControl.editable($scope, 'productNm', false);
							directiveControl.editable($scope, 'replenishStockTypeId', false);
							directiveControl.editable($scope, 'replenishDepositId', false);
							directiveControl.editable($scope, 'replenishPProductShapeId', false);
							directiveControl.editable($scope, 'replenishPNum', false);
							directiveControl.editable($scope, 'maxStoreProductShapeId', false);
							directiveControl.editable($scope, 'maxStoreNum', false);
						// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
						}
						// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End

					}
				}

				// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana Start
				if ($scope.head.mproduct.mclient.clientCd == null) {
					// 荷主CD未設定

					$scope.head.mproduct.mclient.clientCd = userInfo.clientCd;
					$scope.head.mproduct.mclient.clientId = userInfo.clientId;
				} else {
					// 荷主CD設定済

					var isEnableClient = false;
					for (var i = 0; i < $scope.clientList.length; i++) {
						if ($scope.head.mproduct.mclient.clientCd == $scope.clientList[i].clientCd) {
							isEnableClient = true;
							break;
						}
					}

					if (isEnableClient) {
						// 有効な荷主

						$scope.clientBlur();
					} else {
						// 無効な荷主(荷主センタマスタが削除されている等)

						$scope.head.mproduct.mclient.clientCd = userInfo.clientCd;
						$scope.head.mproduct.productCd = null;
					}
				}
				// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana End

					//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang End
				setZoneListMap().then(function(){
					$scope.setZoneList();
				});

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchinputform');

				// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End
					directiveControl.editable($scope, 'warehouseCd', false);
					directiveControl.editable($scope, 'locationCd', false);
				// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
				} else {
					$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope, 'delFlg', false);
				}
				// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End

				if ($scope.head.mproduct && $scope.head.mproduct.productCd) {
//					setShapeCdList().then(function(){
//					});
					$scope.deferredGetShapeCdByProductCd();
				}

				// [ON推-品向-1138] 補充商品を空にしても補充在庫区分、補充預託が空にならない問題を修正 2016.04.22 kawana Start
				$scope.productCdBlur();
				// [ON推-品向-1138] 補充商品を空にしても補充在庫区分、補充預託が空にならない問題を修正 2016.04.22 kawana End

				deferred.resolve();
			});

		} else {

			// 新規
			api.locationList.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;

				// [#1866][Ver2.2.0] ロケーションマスタメンテナンス（編集）- 項目「センタ追加」 2017.06.01 honma Add Start
				// ログイン情報より初期値を設定
				$scope.head.mcenter.centerCd = userInfo.centerCd;
				// [#1866][Ver2.2.0] ロケーションマスタメンテナンス（編集）- 項目「センタ追加」 2017.06.01 honma Add End
				// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
				$scope.head.mproduct.mclient.clientCd = userInfo.clientCd;
				$scope.head.mproduct.mclient.clientId =userInfo.clientId;
				// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
				// 削除の初期値設定
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);
//
//				directiveControl.editable($scope, 'addRow', false);
//				directiveControl.editable($scope, 'removeRow', false);

				setZoneListMap().then(function(){
					$scope.setZoneList();
				});

				// [ON推-品向-1138] 補充商品を空にしても補充在庫区分、補充預託が空にならない問題を修正 2016.04.22 kawana Start
				$scope.productCdBlur();
				// [ON推-品向-1138] 補充商品を空にしても補充在庫区分、補充預託が空にならない問題を修正 2016.04.22 kawana End

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterEdit.object:LocationMasterEdit#register
	 * @methodOf oneslogiWms.LocationMasterEdit.object:LocationMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		var isError = $scope.searchinputform.$invalid;

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.head.mcenter = {};
		//荷主センタ変更対応 2017.03.03 sja Start
		//request.data.head.mcenter.centerCd = $route.current.params.centerCd;
		//if ($route.current.params.mode == SCREEN_MODE.Register) {
		if ($route.current.params.mode == SCREEN_MODE.Create) {
			request.data.head.mcenter.centerCd = userInfo.centerCd;
		} else {
			request.data.head.mcenter.centerCd = $route.current.params.centerCd;
		}
		//荷主センタ変更対応 2017.03.03 sja End

		// [#3484] 荷主IDの設定を削除(選択された荷主を使用するため) 2018.02.27 kawana

		// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
		if ($scope.screenMode == SCREEN_MODE.Copy) {
			request.data.head.locationId = null;
		}
		// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End

		if ($scope.head.mstockType && $scope.head.mstockType.stockTypeCd) {
			for (var i = 0; i < $scope.stockTypeList.length; i++) {
				if ($scope.head.mstockType.stockTypeCd == $scope.stockTypeList[i].stockTypeCd) {
					$scope.head.replenishStockTypeId = $scope.stockTypeList[i].stockTypeId;
					break;
				}
			}
		}

		if ($scope.head.mcustomer && $scope.head.mcustomer.customerCd) {
			for (var i = 0; i < $scope.replenishDepositList.length; i++) {
				if ( $scope.head.mcustomer.customerCd == $scope.replenishDepositList[i].mCustomer.customerCd) {
					$scope.head.replenishDepositId = $scope.replenishDepositList[i].mCustomer.customerId;
					break;
				}
			}
		}
		// 入力チェック
		api.locationList.inputCheck(request).then(function(response){

			// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.25 kawana Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}
			// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.25 kawana End

			// ロケーションマスタデータ登録または更新
			api.locationList.register(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}
				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
				} else if ($scope.screenMode == SCREEN_MODE.Create) {
				// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End
				// 初期化
					$scope.initScreenHttp();
				}
				// [ON推-品向-1136] エラーメッセージが画面に表示されない不具合を修正 2016.04.25 kawana End

			});
		});
	};

	/**
	 * センタ,倉庫毎のゾーンリスト
	 */
	var zoneListMap = {};
	// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana Start
	/**
	 * センタ毎のゾーンリスト
	 */
	var zoneListMapCenter = {};
	// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana End

	/**
	 * 検索エリアに設定されたセンタCD、倉庫リストから
	 * ゾーンリストを取得し内部変数に保存する
	 */
	var setZoneListMap = function(){

		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana Start
		var deferred = $q.defer();
		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana End

		// センタCD
//		var centerCd = $scope.mLocationSearch.mcenter.centerCd;
		var centerCd = $route.current.params.centerCd;
		//荷主センタ変更対応 2017.03.03 sja Start
		//if ($route.current.params.mode == SCREEN_MODE.Register) {
		if ($route.current.params.mode == SCREEN_MODE.Create) {
			centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.03.03 sja End
		if (!centerCd) {
			//荷主センタ変更対応 2017.03.01 sja Start
			//return;
			centerCd = userInfo.centerCd;
			//荷主センタ変更対応 2017.03.01 sja End
		}

		if (!$scope.warehouseList) {
			return;
		}

		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana Start
		var countGetZone = $scope.warehouseList.length + 1;

		// センタ毎のゾーンリストの取得(非同期)
		$scope.deferredGetZoneList(centerCd, null).then(function(response){

			// 取得したゾーンリストを保存
			zoneListMapCenter[response.centerCd] = response.zoneList;

			countGetZone = countGetZone - 1;
			if(countGetZone <= 0) {
				// 全ゾーンの取得完了
				deferred.resolve();
			}
		});
		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana End

		// 倉庫リストの繰返
		for (var i = 0 ; i < $scope.warehouseList.length ; i++) {
			var warehouseCd = $scope.warehouseList[i].warehouseCd;
			if (!warehouseCd) {
				continue;
			}

			// ゾーンリストの取得(非同期)
			$scope.deferredGetZoneList(centerCd, warehouseCd).then(function(response){

				// 取得したゾーンリストを保存
				if(!zoneListMap[response.centerCd]){
					zoneListMap[response.centerCd] = {};
				}

				zoneListMap[response.centerCd][response.warehouseCd] = response.zoneList;

				// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana Start
				countGetZone = countGetZone - 1;
				if(countGetZone <= 0) {
					// 全ゾーンの取得完了
					deferred.resolve();
				}
				// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana End
			});
		}

		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana Start
		return deferred.promise;
		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana End
	}

	/**
	 * 引数のセンタCD,倉庫CDを条件にゾーンリストを作成し返却する
	 */
	$scope.deferredGetZoneList = function(centerCd, warehouseCd) {

		var deferred = $q.defer();

		// 戻り値
		var result = {};
		result.centerCd = centerCd;
		result.warehouseCd = warehouseCd;

		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana Start
		if (!centerCd) {
			// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana End

			deferred.reject(result);
			return deferred.promise;
		}

		var request = {};
		request.data = {};
		request.centerCd = centerCd;
		request.warehouseCd = warehouseCd;
		api.zoneList.keyValueList(request).then(function(response){

			result.zoneList = response.data;
			deferred.resolve(result);
		});

		return deferred.promise;
	}

	/**
	 * 検索条件のゾーンリストの設定
	 * 選択されたセンタ、倉庫に従ってゾーンリストを設定する
	 */
	$scope.setZoneList = function() {

//		var centerCd = $scope.mLocationSearch.mcenter.centerCd;
		var centerCd = $route.current.params.centerCd;
		//荷主センタ変更対応 2017.03.03 sja Start
		//if ($route.current.params.mode == SCREEN_MODE.Register) {
		if ($route.current.params.mode == SCREEN_MODE.Create) {
			centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.03.03 sja End
		if (!centerCd) {
//			$scope.zoneCdList = null;
			//荷主センタ変更対応 2017.03.01 sja Start
//			return;
			centerCd = userInfo.centerCd;
			//荷主センタ変更対応 2017.03.01 sja End
		}

		var head = $scope.head;
		if (!head) {
			return;
		}
//		var warehouseCd = $scope.mLocationSearch.mzone.mwarehouse.warehouseCd;
		var warehouseCd = $scope.head.mzone.mwarehouse.warehouseCd;
		if (!warehouseCd) {
			// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana Start
			$scope.zoneCdList = zoneListMapCenter[centerCd];
			// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana End
			return;
		}

		if (zoneListMap[centerCd]) {
			if (zoneListMap[centerCd][warehouseCd]) {

				$scope.zoneCdList =  zoneListMap[centerCd][warehouseCd];
			} else {

				$scope.zoneCdList = null;
			}
		} else {
			$scope.zoneCdList = null;
		}
	}

	/**
	 * グリッドのゾーンリストの設定
	 * 選択されたセンタ、倉庫に従ってゾーンリストを設定する
	 */
	$scope.setGridZoneList = function(rowIndex) {

//		var centerCd = $scope.mLocationSearch.mcenter.centerCd;
		var centerCd = $route.current.params.centerCd;
		//荷主センタ変更対応 2017.03.03 sja Start
		//if ($route.current.params.mode == SCREEN_MODE.Register) {
		if ($route.current.params.mode == SCREEN_MODE.Create) {
			centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.03.03 sja End
		// 検索したロケーションの場合は登録されているセンタCDを使用
//		if ($scope.head.centerId) {
//			centerCd = userInfo.centerCdById($scope.locationList[rowIndex].centerId);
//		}

		if (!centerCd) {
			//荷主センタ変更対応 2017.03.01 sja Start
			//return null;
			centerCd = userInfo.centerCd;
			//荷主センタ変更対応 2017.03.01 sja End
		}

		var head = $scope.head;
		if (!head) {
			return null;
		}

//		var warehouseCd = $scope.locationList[rowIndex].mzone.mwarehouse.warehouseCd;
		var warehouseCd = $scope.head.mzone.mwarehouse.warehouseCd;
		if (!warehouseCd) {
			return null;
		}

		if (zoneListMap[centerCd]) {
			if (zoneListMap[centerCd][warehouseCd]) {

				return zoneListMap[centerCd][warehouseCd];
			} else {

				return null;
			}
		} else {
			return null;
		}
	}

	// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start

	/**
	 * 荷主CD変更時の処理
	 */
	$scope.clientBlur = function() {

		// ※※ blurにしてしまうと本処理前に登録ボタンが押せてしまう。(荷主を変えてblurせずに登録ボタン押下)
		//      その場合、不正なデータ (預託CDと荷主CDが不正の状態で登録されてしまうなど) が送信されてしまう。
		//      本問題はjava側の入力チェック処理で吸収するものとする。

		// 荷主ID設定
		for (var i = 0; i < $scope.clientList.length; i++) {
			if ($scope.clientList[i].clientCd == $scope.head.mproduct.mclient.clientCd) {
				$scope.head.mproduct.mclient.clientId = $scope.clientList[i].clientId;
			}
		}

		// 補充預託変更
		$scope.deferredGetReplenishDepositList();
		// 商品CD変更処理
		$scope.productCdBlur();
	};

	// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#showProduct
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description
	 * ロケーションコード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(rowIndex){
		var items;

		if ($scope.head.mproduct && $scope.head.mproduct.productCd) {
			items = {
					// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
					clientCd: $scope.head.mproduct.mclient.clientCd,
					// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
					productCd: $scope.head.mproduct.productCd
			};
		} else {
			items = {
					// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
					clientCd: $scope.head.mproduct.mclient.clientCd
					// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
			};
		}

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.mproduct.productCd =  selectedItem.productCd;
			$scope.head.mproduct.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#productBlur
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description
	 * ロケーションコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力されたロケーションコードを取得
		var productCd = $scope.head.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
			request.clientId = $scope.head.mproduct.mclient.clientId;
			// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
			request.productCd = productCd;

			api.product.record(request).then(function(response) {

				// [#3470] 補充商品に小数有り商品を指定した場合はエラーとする 2018.02.28 kawana Start
				var isErr = false;
				var errMessageCd;
				if (response.data.mProduct.productId == null){
					// 商品未存在
					isErr = true;
					errMessageCd = "productNotFoundError";
				} else if (response.data.mProduct.mshapeGrp.decimalExistFlg == "1") {
					// 小数有りの商品
					isErr = true;
					errMessageCd = "inputProductDecimalExistFlgError";
				}

				if (isErr) {
					// 商品エラー

					optionMessageControl.show($scope, "productCd", $filter('owfMessage')(errMessageCd));
					// [#3470] 補充商品に小数有り商品を指定した場合はエラーとする 2018.02.28 kawana End
					optionMessageControl.hide($scope,"replenishStockTypeId");
					optionMessageControl.hide($scope,"replenishDepositId");
					optionMessageControl.hide($scope,"replenishPProductShapeId");
					optionMessageControl.hide($scope,"maxStoreProductShapeId");
					// ロケーションの在庫関連情報の入力可否制御
					$scope.head.mproduct.productNm = null;
					//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang Start
					if ($scope.head.mstockType != null) {
						$scope.head.mstockType.stockTypeCd = null;
					}
					if ($scope.head.mcustomer != null) {
						$scope.head.mcustomer.customerCd = null;
					}
					//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang End
					if($scope.head.mproductShapeByReplenishPProductShapeId != null){
						// [Ver3.0] unit of measure対応 2017.11.28 NING Start
						if ($scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl != null) {
							if ($scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape != null) {
								$scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape.shapeCd = null;
							}
						}
						// [Ver3.0] unit of measure対応 2017.11.28 NING End
					}
					$scope.head.replenishPNum = null;
					if($scope.head.mproductShapeByMaxStoreProductShapeId != null ){
						// [Ver3.0] unit of measure対応 2017.11.28 NING Start
						if ($scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl != null) {
							if ($scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape != null) {
								$scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape.shapeCd = null;
							}
						}
						// [Ver3.0] unit of measure対応 2017.11.28 NING End
					}
					$scope.head.maxStoreNum = null;
					directiveControl.editable($scope, 'productNm', false);
					directiveControl.editable($scope, 'replenishStockTypeId', false);
					directiveControl.editable($scope, 'replenishDepositId', false);
					directiveControl.editable($scope, 'replenishPProductShapeId', false);
					directiveControl.editable($scope, 'replenishPNum', false);
					directiveControl.editable($scope, 'maxStoreProductShapeId', false);
					directiveControl.editable($scope, 'maxStoreNum', false);
					return;
				}
				optionMessageControl.hide($scope,"productCd");

				// ロケーションの在庫関連情報の入力可否制御
				$scope.head.mproduct.productNm = response.data.mProduct.productNm;
				// [Ver3.0] unit of measure対応 2017.11.28 NING Start
				$scope.head.mproduct.mshapeGrp = {};
				$scope.head.mproduct.mshapeGrp.decimalExistFlg = response.data.mProduct.mshapeGrp.decimalExistFlg;
				// [Ver3.0] unit of measure対応 2017.11.28 NING End
				directiveControl.editable($scope, 'productNm', true);
				directiveControl.editable($scope, 'replenishStockTypeId', true);
				directiveControl.editable($scope, 'replenishDepositId', true);
				directiveControl.editable($scope, 'replenishPProductShapeId', true);
				directiveControl.editable($scope, 'replenishPNum', true);
				directiveControl.editable($scope, 'maxStoreProductShapeId', true);
				directiveControl.editable($scope, 'maxStoreNum', true);

				// 補充ロケーション設定した場合は、「補充在庫区分」、「補充預託」、「補充点荷姿」、「最大格納数ロケーション荷姿」入力必須になる。
				//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang Start
				if($scope.head.mstockType == null || $scope.head.mstockType.stockTypeCd == null) {
					optionMessageControl.show($scope, 'replenishStockTypeId', owsCommon.convertMessage('requiredError'));
				}
				if($scope.head.mcustomer == null || $scope.head.mcustomer.customerCd == null) {
					optionMessageControl.show($scope, 'replenishDepositId', owsCommon.convertMessage('requiredError'));
				}
				//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang End
				if($scope.head.mproductShapeByReplenishPProductShapeId == null
						// [Ver3.0] unit of measure対応 2017.11.28 NING Start
						|| $scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl == null
						|| $scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape == null
						|| $scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape.shapeCd == null) {
						// [Ver3.0] unit of measure対応 2017.11.28 NING End
					optionMessageControl.show($scope, 'replenishPProductShapeId', owsCommon.convertMessage('requiredError'));
				}
				if($scope.head.mproductShapeByMaxStoreProductShapeId == null
						// [Ver3.0] unit of measure対応 2017.11.28 NING Start
						|| $scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl == null
						|| $scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape == null
						|| $scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape.shapeCd == null) {
						// [Ver3.0] unit of measure対応 2017.11.28 NING End
					optionMessageControl.show($scope, 'maxStoreProductShapeId', owsCommon.convertMessage('requiredError'));
				}
				//[ON推-品質問題点指摘（新ｿﾘV2-032）]修正対応 2016.07.28 chou Add Start
				if($scope.head.replenishPNum == null) {
					optionMessageControl.show($scope, 'replenishPNum', owsCommon.convertMessage('requiredError'));
				}
				if($scope.head.maxStoreNum == null) {
					optionMessageControl.show($scope, 'maxStoreNum', owsCommon.convertMessage('requiredError'));
				}
				//[ON推-品質問題点指摘（新ｿﾘV2-032）]修正対応 2016.07.28 chou Add End
				// [Ver3.0][#3981] 小数チェックを基盤側で行うため小数チェックメソッドを削除 2018.04.11 matsumoto Del
			});
			// 補充商品IDの商品に紐付く商品荷姿マスタの荷姿IDを取得して、その一覧を荷姿マスタの名称と紐付けし、補充点荷姿と最大格納数商品荷姿のコンボボックスに設定する
			$scope.deferredGetShapeCdByProductCd();
		} else {

			// [ON推-品向-1138] 補充商品を空にしても補充在庫区分、補充預託が空にならない問題を修正 2016.04.22 kawana Start
			optionMessageControl.hide($scope,"productNm");
			optionMessageControl.hide($scope,"replenishStockTypeId");
			optionMessageControl.hide($scope,"replenishDepositId");
			optionMessageControl.hide($scope,"replenishPProductShapeId");
			optionMessageControl.hide($scope,"replenishPNum");
			optionMessageControl.hide($scope,"maxStoreProductShapeId");
			optionMessageControl.hide($scope,"maxStoreNum");

			directiveControl.editable($scope, 'productNm', false);
			directiveControl.editable($scope, 'replenishStockTypeId', false);
			directiveControl.editable($scope, 'replenishDepositId', false);
			directiveControl.editable($scope, 'replenishPProductShapeId', false);
			directiveControl.editable($scope, 'replenishPNum', false);
			directiveControl.editable($scope, 'maxStoreProductShapeId', false);
			directiveControl.editable($scope, 'maxStoreNum', false);

			$scope.head.mproduct.productNm = null;
			$scope.head.mstockType.stockTypeCd = null;
			$scope.head.mcustomer.customerCd = null;
			// [Ver3.0] unit of measure対応 2017.11.28 NING Start
			$scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape.shapeCd = null;
			// [Ver3.0] unit of measure対応 2017.11.28 NING End
			$scope.head.replenishPNum = null;
			// [Ver3.0] unit of measure対応 2017.11.28 NING Start
			$scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape.shapeCd = null;
			// [Ver3.0] unit of measure対応 2017.11.28 NING End
			$scope.head.maxStoreNum = null;
			// [ON推-品向-1138] 補充商品を空にしても補充在庫区分、補充預託が空にならない問題を修正 2016.04.22 kawana End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMasterEdit#pickingLocationFlgBlur()
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description
	 * ピックロケフラグのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.pickingLocationFlgBlur = function() {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		// 入力されたロケーションCDを取得
		var pickingLocationFlg = $scope.head.pickingLocationFlg;

		if (pickingLocationFlg == "1") {
			// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
			directiveControl.editable($scope, 'clientCd', true);
			// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
			directiveControl.editable($scope, 'productCd', true);
		} else {
			optionMessageControl.hide($scope,"productCd");
			optionMessageControl.hide($scope,"replenishStockTypeId");
			optionMessageControl.hide($scope,"replenishDepositId");
			optionMessageControl.hide($scope,"replenishPProductShapeId");
			optionMessageControl.hide($scope,"maxStoreProductShapeId");

			if($scope.head.mproduct != null){
				$scope.head.mproduct.productCd = null;
				$scope.head.mproduct.productNm = null;
			}
			//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang Start
			if($scope.head.mstockType != null && $scope.head.mstockType.stockTypeCd != null){
				$scope.head.mstockType.stockTypeCd = null;
			}
			if($scope.head.mcustomer != null && $scope.head.mcustomer.customerCd != null){
				$scope.head.mcustomer.customerCd = null;
			}
			//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang End
			if($scope.head.mproductShapeByReplenishPProductShapeId != null){
				// [Ver3.0] unit of measure対応 2017.11.28 NING Start
				if($scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl != null){
					if($scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape != null){
						$scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape.shapeCd = null;
					}
				}
				// [Ver3.0] unit of measure対応 2017.11.28 NING End

			}
			$scope.head.replenishPNum = null;
			if($scope.head.mproductShapeByMaxStoreProductShapeId != null){
				// [Ver3.0] unit of measure対応 2017.11.28 NING Start
				if($scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl != null){
					if($scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape != null){
						$scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape.shapeCd = null;
					}
				}
				// [Ver3.0] unit of measure対応 2017.11.28 NING End
			}
			$scope.head.maxStoreNum = null;
			// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
			directiveControl.editable($scope, 'clientCd', false);
			// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
			directiveControl.editable($scope, 'productNm', false);
			directiveControl.editable($scope, 'replenishStockTypeId', false);
			directiveControl.editable($scope, 'replenishDepositId', false);
			directiveControl.editable($scope, 'productCd', false);
			directiveControl.editable($scope, 'replenishPProductShapeId', false);
			directiveControl.editable($scope, 'replenishPNum', false);
			directiveControl.editable($scope, 'maxStoreProductShapeId', false);
			directiveControl.editable($scope, 'maxStoreNum', false);
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#warehouseNmBlur
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description ロケーションCDロストフォーカス処理<br>
	 *
	 * ロケーション名称未入力の場合、ロケーションCDをロケーション名称に設定する。
	 */
	$scope.locationCdBlur = function() {
		// 入力されたロケーションCDを取得
		var locationCd = $scope.head.locationCd;
		// ロケーション名称を取得
		var locationNm = $scope.head.locationNm;

		if (locationCd && 0 < locationCd.length) {
			if (locationNm && 0 < locationNm.length) {
				return;
			} else {
				$scope.head.locationNm = locationCd;
			}
		}
	};

	$scope.checkInput = function() {
		if ($scope.head.mproduct.productCd != null) {

			// 補充ロケーション設定した場合は、「補充在庫区分」、「補充預託」、「補充点荷姿」、「最大格納数ロケーション荷姿」入力必須になる。
			//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang Start
			if($scope.head.mstockType == null || $scope.head.mstockType.stockTypeCd == null) {
				optionMessageControl.show($scope, 'replenishStockTypeId', owsCommon.convertMessage('requiredError'));
			}
			if($scope.head.mcustomer == null || $scope.head.mcustomer.customerCd == null) {
				optionMessageControl.show($scope, 'replenishDepositId', owsCommon.convertMessage('requiredError'));
			}
			//[ＯＮ推_品向_1073] ピックロケフラグを変更した際、補充情報の処理 2016.04.22 Zhang End
			if($scope.head.mproductShapeByReplenishPProductShapeId == null ||
					// [Ver3.0] unit of measure対応 2017.11.28 NING Start
					$scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl == null ||
					$scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape == null ||
					$scope.head.mproductShapeByReplenishPProductShapeId.mshapeGrpDtl.mshape.shapeCd == null) {
					// // [Ver3.0] unit of measure対応 2017.11.28 NING End
				optionMessageControl.show($scope, 'replenishPProductShapeId', owsCommon.convertMessage('requiredError'));
			}
			if($scope.head.mproductShapeByMaxStoreProductShapeId == null ||
					// [Ver3.0] unit of measure対応 2017.11.28 NING Start
					$scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl == null ||
					$scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape == null ||
					$scope.head.mproductShapeByMaxStoreProductShapeId.mshapeGrpDtl.mshape.shapeCd == null) {
					// [Ver3.0] unit of measure対応 2017.11.28 NING End
				optionMessageControl.show($scope, 'maxStoreProductShapeId', owsCommon.convertMessage('requiredError'));
			}
			//[ON推-品質問題点指摘（新ｿﾘV2-032）]修正対応 2016.07.28 chou Add Start
			if($scope.head.replenishPNum == null) {
				optionMessageControl.show($scope, 'replenishPNum', owsCommon.convertMessage('requiredError'));
			}
			if($scope.head.maxStoreNum == null) {
				optionMessageControl.show($scope, 'maxStoreNum', owsCommon.convertMessage('requiredError'));
			}
			//[ON推-品質問題点指摘（新ｿﾘV2-032）]修正対応 2016.07.28 chou Add End
		}
	};

	// [Ver3.0] unit of measure対応 2017.11.28 NING Start
	// [Ver3.0][#3981] 小数チェックを基盤側で行うため小数チェックメソッドを削除 2018.04.11 matsumoto Del

	// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start

	/**
	 * 入力された荷主CDの取得
	 */
	$scope.getClientCd = function() {

		if ($scope.head) {
			if ($scope.head.mproduct.mclient.clientCd) {
				return $scope.head.mproduct.mclient.clientCd;
			}
		}

		return userInfo.clientCd;
	};

	/**
	 * 入力された荷主IDの取得
	 */
	$scope.getClientId = function() {

		if ($scope.head) {
			if ($scope.head.mproduct.mclient.clientId) {
				return $scope.head.mproduct.mclient.clientId;
			}
		}

		return userInfo.clientId;
	};

	// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
