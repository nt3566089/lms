/**
 * @ngdoc overview
 * @name oneslogiWms.ProductList
 *
 * @description
 * 商品マスタメンテナンス(一覧)画面
 */
angular.module('oneslogiWms.ProductMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductList.service:productListApi
 *
 * @description
 * 商品マスタメンテナンス(一覧)WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/productMasterList/init 初期化用WebApi<br>
 * ・resources/master/productMasterList/search 検索用WebApi<br>
 // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/03 Start
 * ・resources/master/productMasterList/print 商品ラベル発行WebAPI<br>
 //[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/03 End
 *
 */
.factory('productMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		productList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/productMasterList/init'],
				 ['search', 'GET', 'resources/master/productMasterList/search'],
				 // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/03 Start
                 ['print',  'GET', 'resources/master/productMasterList/print'],
                 //[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/03 End
				 ['excel',  'GET', 'resources/master/productMasterList/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ProductList.object:ProductList
 *
 * @description
 * 商品マスタメンテナンス(一覧)画面コントローラ
 */
// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
//.controller('ProductMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'productMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {
.controller('ProductMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'productMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {
// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End

	//グリッドの列情報（デザイン用）
	$scope.productListCols =
		[
		// ミドリ安全 商品マスタ修正 2024.05.17 Jeongmin [S]
		 {field:"productCd", displayName:"商品CD"},
		 {field:"productNm", displayName:"商品名称"},
		 {field:"productAbbr", displayName:"商品略称"},
		 {field:"janCd", displayName:"JANCD"},
		 {field:"unitNum", displayName:"入数内訳"},
		 {field:"lotManagFlg", displayName:"ロット管理区分"},
		 {field:"bclassDtlByLotManagFlg.vdict.dictNm", displayName:"ロット管理区分名称"},
		 {field:"limitDtManagFlg", displayName:"期限日管理フラグ"},
		 {field:"bclassDtlByLimitDtManagFlg.vdict.dictNm", displayName:"期限日管理フラグ名称"},
		 {field:"receiveLimitNum", displayName:"入荷期限日限界日数"},
		 {field:"shippingLimitNum", displayName:"出荷期限日限界日数"},
		 {field:"prodDtManagFlg", displayName:"製造日管理フラグ"},
		 {field:"bclassDtlByProdDtManagFlg.vdict.dictNm", displayName:"製造日管理フラグ名称"},
		 {field:"prodDtLimitDaysRcv", displayName:"入荷製造日限界日数"},
		 {field:"prodDtLimitDaysShp", displayName:"出荷製造日限界日数"},
//		 {field:"nizoroe10Num", displayName:"荷揃処理10足用足数"},
		 {field:"logiSpecialTypeCd", displayName:"物流特殊区分"},
		 {field:"bclassDtlByLogiSpecialTypeCd.vdict.dictNm", displayName:"物流特殊区分名称"},
		 {field:"ocrDateFormat", displayName:"OCR日付形式"},
		 {field:"bclassDtlByOcrDateFormat.vdict.dictNm", displayName:"OCR日付形式名称"},
		 {field:"unitNum", displayName:"単位名称"},
//		 {field:"mproductShapeList[0].mshapeGrpDtl.mshape.shapeCd", displayName:"荷姿区分CD"},
//		 {field:"mproductShapeList[0].mshapeGrpDtl.mshape.vdictByShapeDictId.dictNm", displayName:"荷姿区分名称"},
		 {field:"noOkinawaFlightFlg", displayName:"沖縄航空便不可フラグ"},
		 {field:"classDtlByNoOkinawaFlightFlg.vdict.dictNm", displayName:"沖縄航空便不可フラグ名称"},
		 {field:"logiAttentionTypeCd", displayName:"物流注意区分"},
		 {field:"classDtlByLogiAttentionTypeCd.vdict.dictNm", displayName:"物流注意区分名称"},
		 {field:"heavyItemFlg", displayName:"重量フラグ"},
		 {field:"classDtlByHeavyItemFlg.vdict.dictNm", displayName:"重量フラグ名称"},
		 {field:"insuranceFlg", displayName:"保険品フラグ"},
		 {field:"classDtlByInsuranceFlg.vdict.dictNm", displayName:"保険品フラグ名称"},
		 {field:"largeItemFlg", displayName:"大物フラグ"},
		 {field:"classDtlByLargeItemFlg.vdict.dictNm", displayName:"大物フラグ名称"},
//		 {field:"logiWeightFlg", displayName:"物流重量フラグ"},
//		 {field:"classDtlByLogiWeightFlg.vdict.dictNm", displayName:"物流重量フラグ名称"},
		 {field:"sizeNm", displayName:"サイズ名称"},
		 {field:"evaluationUnitPrice", displayName:"評価単価"},
		 {field:"oldJanCd", displayName:"旧JANCD"},
		 {field:"innerJanCd", displayName:"インナーJANCD"},
		 {field:"recommendLocationCd", displayName:"推奨ロケーションCD"},
		 {field:"recomendLocationTypeCd", displayName:"推奨ロケーション区分"},
		 {field:"mlocationReplenishProductList[0].mlocation.bclassDtlByLocationType.vdict.dictNm", displayName:"推奨ロケーション区分名称"},
		 {field:"createDate", displayName:"作成日"},
		 {field:"createTime", displayName:"作成時間"},
		 {field:"floorRefStockNum", displayName:"フロア基準在庫"},
		 {field:"addDt", displayName:"登録日時"},
		 {field:"updDt", displayName:"更新日時"},
		 {field:"delFlg", displayName:"削除フラグCD"},
		 {field:"bclassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"}
		// ミドリ安全 商品マスタ修正 2024.05.17 Jeongmin [E]
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#initScreen
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End




		// グリッドの設定
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
		//$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
			data: 'productList',
			columnDefs: 'productListCols',
			pagingOptions : $scope.pagingOptions
		});

		$scope.gridSelectOptions = {
				// ミドリ安全 商品マスタ修正 2024.05.17 Jeongmin [S]
				"lotManagFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "lotManagFlgList"
				},
				"limitDtManagFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "limitDtManagFlgList"
				},
				"prodDtManagFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "prodDtManagFlgList"
				},
				"logiSpecialTypeCd" : {
					key : "classCd",
					value : "classNm",
					listModel : "logiSpecialTypeCd"
				},
				"logiSpecialTypeCd" : {
					key : "classCd",
					value : "classNm",
					listModel : "logiSpecialTypeCd"
				},
				"ocrDateFormat" : {
					key : "classCd",
					value : "classNm",
					listModel : "ocrDateFormat"
				},
//				"caseTypeCD" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "caseTypeCD"
//				},
				"noOkinawaFlightFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "noOkinawaFlightFlg"
				},
				"logiAttentionTypeCd" : {
					key : "classCd",
					value : "classNm",
					listModel : "logiAttentionTypeCd"
				},
				"heavyItemFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "heavyItemFlg"
				},
				"insuranceFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "insuranceFlg"
				},
				"largeItemFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "largeItemFlg"
				},
//				"logiWeightFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "logiWeightFlg"
//				},
				"recommendLocationTypeCd" : {
					key : "classCd",
					value : "classNm",
					listModel : "recommendLocationTypeCd"
				}
				// ミドリ安全 商品マスタ修正 2024.05.17 Jeongmin [E]
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#initScreenHttp
	 * @methodOf oneslogiWms.ProductList.object:ProductList
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
				// ミドリ安全 商品マスタ修正 2024.05.17 Jeongmin [S]
				 $scope.deferredGetLotManagFlg(),
				 $scope.deferredGetLimitDtManagFlg(),
				 $scope.deferredGetProdManagFlg(),
				 $scope.deferredGetLogiSpecialTypeCd(),
				 $scope.deferredGetOcrDateFormat(),
				 //$scope.deferredGetCaseTypeCD(),
				 $scope.deferredGetNoOkinawaFlightFlg(),
				 $scope.deferredGetLogiAttentionTypeCd(),
				 $scope.deferredGetHeavyItemFlg(),
				 $scope.deferredGetInsuranceFlg(),
				 $scope.deferredGetLargeItemFlg(),
				 //$scope.deferredGetLogiWeightFlg(),
				 $scope.deferredGetRecommendLocationTypeCd(),
				// ミドリ安全 商品マスタ修正 2024.05.17 Jeongmin [E]
				 $scope.deferredGetDelFlg()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetDelFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// ミドリ安全 商品マスタ修正 2024.05.17 Jeongmin [S]
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLotManagFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * ロット管理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLotManagFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LOT_MANAG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.lotManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLimitDtManagFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 期限日管理フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLimitDtManagFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LIMIT_DT_MANAG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.limitDtManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetProdManagFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 製造日管理フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProdManagFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "PROD_MANAG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.prodDtManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLogiSpecialTypeCd
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 物流特殊区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLogiSpecialTypeCd = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LOGI_SPECIAL_TYPE_CD";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.logiSpecialTypeCdFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetOcrDateFormat
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * OCR日付形式取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetOcrDateFormat = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "OCR_DATE_FORMAT";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.ocrDateFormatList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetCaseTypeCD
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 荷姿区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
//	$scope.deferredGetCaseTypeCD = function () {
//		var deferred  = $q.defer();
//
//		var request = {};
//		request.classCd = "CASE_TYPE_CD";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.caseTypeCDList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetNoOkinawaFlightFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 沖縄航空便不可フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetNoOkinawaFlightFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "NO_OKINAWA_FLIGHT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.noOkinawaFlightFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLogiAttentionTypeCd
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 物流注意区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLogiAttentionTypeCd = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LOGI_ATENTION_TYPE_CD";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.logiAttentionTypeCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetHeavyItemFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 重量フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetHeavyItemFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "HEAVY_ITEM_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.heavyItemFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetInsuranceFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 保険品フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInsuranceFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "INSURANCE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.insuranceFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLargeItemFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 大物フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLargeItemFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LARGE_ITEM_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.largeItemFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLogiWeightFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 物流重量フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
//	$scope.deferredGetLogiWeightFlg = function () {
//		var deferred  = $q.defer();
//
//		var request = {};
//		request.classCd = "LOGI_WEIGHT_FLG";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.logiWeightFlgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetRecommendLocationTypeCd
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 推奨ロケーション区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetRecommendLocationTypeCd = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "RECOMMEND_LOCATION_TYPE_CD";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.recommendLocationTypeCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}
	// ミドリ安全 商品マスタ修正 2024.05.17 Jeongmin [E]

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetInitData
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 商品マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.productList.init().then(function(response){
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
			$scope.printParam = response.data.reportData.printBasicData;
			$scope.productMasterLabelPrintDto = response.data.reportData;
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End
			$scope.head = response.data.head;
			$scope.productList = response.data.body;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.mclient.clientCd = userInfo.clientCd;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete


			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}

		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#excelOutput
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.productList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterList.object:ProductMasterList#gridDblClick
	 * @methodOf oneslogiWms.ProductMasterList.object:ProductMasterList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#search
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#getPagedDataAsync
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索処理<br>
	 * ・商品マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.productList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#setPagingData
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {

		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-347] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-347] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.productList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#getClassForRow
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#update
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の商品データを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
		// 複数行の場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
				return;
		}
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		//荷主センタ変更対応 2017.01.27 sja Start
//		$location.path("wms/master/ProductMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("productId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].productId);
		$location.path("wms/master/ProductMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
		.search("productId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].productId)
		.search("clientId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientId);
		//荷主センタ変更対応 2017.01.27 sja End
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#janSeal
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * JANシール押下処理<br>
	 *
	 * JANシールを押下された時に処理、商品ラベル発行データをチェックを行う
	 */
	$scope.print = function() {
		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg == "1") {
				alertMessage.setErrorMessageByCode("deletedCannotExecuteError");
				return;
			}
		}
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
	   // 画面初期化
		var items = {
			labelOutputCnt: 1
		};
		var modalInstance = modalFactory.modalInstListNumInput(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
		    // プリンタ選択画面を表示
			modalInstance = printFactory.modalPrint($scope.printParam);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request = angular.copy($scope.productMasterLabelPrintDto);
				request.data.search.productId = $scope.gridOptions.gridApi.selection.getSelectedRows()[0].productId;
				request.data.search.clientId = $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientId;
				// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
				request.data.searchList = $scope.gridOptions.gridApi.selection.getSelectedRows();
				// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
				request.data.center.centerId = userInfo.centerId;
				request.data.labelOutputCnt = selectedItem.labelOutputCnt;
				request.printBasicData = printParam.printBasicData;

				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.productList.print(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
						}
					} else {
						// 異常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					}

					//帳票発行後に再検索する
					$scope.search();
				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
			});
		});
	};
	//[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
