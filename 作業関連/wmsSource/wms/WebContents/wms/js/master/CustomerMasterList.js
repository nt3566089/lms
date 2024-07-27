/**
 * @ngdoc overview
 * @name oneslogiWms.CustomerMaster
 *
 * @description
 * 取引先マスタ(一覧)画面
 */
angular.module('oneslogiWms.CustomerMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CustomerMaster.service:CustomerMasterApi
 *
 * @description
 * 取引先マスタ(一覧)WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/customerMasterList/init 初期化用WebApi<br>
 * ・resources/master/customerMasterList/selectByConditions 検索用WebApi<br>
 */
.factory('customerMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
		    [
		        ['query', 'GET', 'resources/common/centerClass/keyValueList']
		    ]
		),
		getCenterCd: AngularAPIClient.make(
			    [
			        ['query', 'GET', 'resources/common/centerCd/keyValueList']
			    ]
			),
		customerList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/customerMasterList/init'],
			    ['search', 'GET', 'resources/master/customerMasterList/selectByConditions'],
			    ['excel',  'GET', 'resources/master/customerMasterList/selectByConditions', 'excel']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CustomerMaster.object:CustomerMaster
 *
 * @description
 *  取引先マスタ(一覧)画面コントローラ
 */
.controller('CustomerMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'customerMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {
	//荷主センタ変更対応 201７.02.06 sja Start
	var oldCenter;
	var newDelFlgList;
	//荷主センタ変更対応 201７.02.06 sja End
	//グリッドの列情報（デザイン用）
	$scope.customerListCols =
		[
		    {field:"customerCd", displayName:"取引先CD"},
		    {field:"customerNm", displayName:"取引先名称"},
		    {field:"customerAbbr", displayName:"取引先略称"},
		    {field:"deliveryFlg", displayName:"納品先フラグCD"},
		    {field:"bclassDtlByDeliveryFlg.vdict.dictNm", displayName:"納品先フラグ名称"},
		    {field:"vendorFlg", displayName:"仕入先フラグCD"},
		    {field:"bclassDtlByVendorFlg.vdict.dictNm", displayName:"仕入先フラグ名称"},
		    {field:"onetimeFlg", displayName:"ワンタイムフラグCD"},
		    {field:"bclassDtlByOnetimeFlg.vdict.dictNm", displayName:"ワンタイムフラグ名称"},
		    {field:"depositFlg", displayName:"預託先フラグCD"},
		    {field:"bclassDtlByDepositFlg.vdict.dictNm", displayName:"預託先フラグ名称"},
		    {field:"address1", displayName:"住所1"},
		    {field:"address2", displayName:"住所2"},
		    {field:"address3", displayName:"住所3"},
		    {field:"zipCd", displayName:"郵便番号"},
		    {field:"telNo", displayName:"電話番号"},
		    {field:"centerCd", displayName:"社内入荷センタCD"},
		    {field:"clientCd", displayName:"荷主取引先CD"},
		    {field:"allocOrder", displayName:"引当順序"},
		    {field:"shippingStopFlg", displayName:"出荷停止フラグCD"},
		    {field:"bclassDtlByShippingStopFlg.vdict.dictNm", displayName:"出荷停止フラグ名称"},
		    {field:"limitDtReverseFlg", displayName:"期限日逆転防止フラグCD"},
		    {field:"bclassDtlByLimitDtReverseFlg.vdict.dictNm", displayName:"期限日逆転防止フラグ名称"},
		    {field:"lotReverseFlg", displayName:"ロット逆転防止フラグCD"},
		    // [横並-006] 削除フラグを追加 2014.11.26 taoys Start
		    {field:"bclassDtlByLotReverseFlg.vdict.dictNm", displayName:"ロット逆転防止フラグ名称"},
		    {field:"delFlg", displayName:"削除フラグCD"},
		    {field:"bclassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"},
		    // 荷主を追加 2017.02.04 Start
		    {field:"mclient.clientCd", displayName:"荷主CD"},
		    {field:"mclient.clientNm", displayName:"荷主名称"}
		    // 荷主を追加 2017.02.04 End
		    // [横並-006] 削除フラグを追加 2014.11.26 taoys End
		];


	/**
     * @ngdoc method
     * @name oneslogiWms.CustomerMaster.object:CustomerMaster#initScreen
     * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
     *
     * @description
     * 画面初期化処理<br>
     * ・検索条件枠を開いた状態に設定<br>
     * ・グリッド設定<br>
     * ・画面初期化用通信制御処理を呼び出し
     */
	$scope.initScreen = function() {


		// モード設定
		$scope.screenMode = $route.current.params.mode;

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタ取得
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'customerList',
			columnDefs: 'customerListCols',
			pagingOptions : $scope.pagingOptions
		});

		 //グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
//
//				"mcenter.centerCd" : {
//					key : "centerCd",
//					value : "centerNm",
//					listModel : "centerList"
//				},
//				"mclient.clientCd" : {
//					key : "clientCd",
//					value : "clientNm",
//					listModel : "clientList"
//				},
//				"deliveryFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "deliveryFlgList"
//				},
//				"vendorFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "vendorFlgList"
//				},
//				"onetimeFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "onetimeFlgList"
//				},
//				"depositFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "depositFlgList"
//				},
//				"shippingStopFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "shippingStopFlgList"
//				},
//				"limitDtReverseFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "limitDtReverseFlgList"
//				},
//				"lotReverseFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "lotReverseFlgList"
//				}
					"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList"
				}
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.CustomerMaster.object:CustomerMaster#initScreenHttp
     * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDeliveryFlg(),
				 $scope.deferredGetVendorFlg(),
				 $scope.deferredGetOnetimeFlg(),
				 $scope.deferredGetDepositFlg(),
				 $scope.deferredGetShippingStopFlg(),
				 $scope.deferredGetLimitDtReverseFlg(),
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetLotReverseFlg()

				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#excelOutput
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
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

		api.customerList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetDeliveryFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 納品先フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDeliveryFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DELIVERY_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.deliveryFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetVendorFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 仕入先フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetVendorFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "VENDOR_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.vendorFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetOnetimeFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * ワンタイムフラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetOnetimeFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ONETIME_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.onetimeFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetDepositFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 預託先フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEPOSIT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.depositFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetShippingStopFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 出荷停止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShippingStopFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SHIPPING_STOP_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.shippingStopFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetLimitDtReverseFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 期限日逆転防止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLimitDtReverseFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIMIT_DT_REVERSE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.limitDtReverseFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetLotReverseFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * ロット逆転防止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLotReverseFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOT_REVERSE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.lotReverseFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetLotReverseFlg
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 社内入荷センタCDドロップダウンリスト用データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCenterCd = function () {
		var deferred = $q.defer();
		var request = {};
		request.clientId = userInfo.clientId;

		owsCommon.getDataCacheable(api.getCenterCd, request).then(function(response){
			$scope.centerList = response.data.body;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetInitData
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 取引先マスタ(一覧)初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.customerList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.customerList = response.data.body;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.mclient.clientCd = userInfo.clientCd;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.CustomerMaster.object:CustomerMaster#search
     * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#getPagedDataAsync
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.customerList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster##setPagingData
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-349] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-349] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.customerList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#gridDblClick
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
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

	// コピー機能追加 取引先マスタ画面修正 2016.06.23 Soe Thiha Tun Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#copy
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されたデータの情報を新規編集画面に設定し、表示する。
	 */
	$scope.copy = function() {
		//修正画面へ遷移
		$location.path("wms/master/CustomerMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("customerId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].customerId);
	};
	// コピー機能追加 取引先マスタ画面修正 2016.06.23 Soe Thiha Tun Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#showCustomerEdit
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * 取引先マスタメンテナンス(編集)画面を表示する。
	 */
	$scope.initNew = function(){
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		// 取引先マスタメンテナンス(編集)画面へ遷移
		$location.path("wms/master/CustomerMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#showCustomerEdit
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 取引先マスタメンテナンス(編集)画面を表示する。
	 */
	$scope.update = function(){
		//修正画面へ遷移
		//荷主センタ変更対応 201７.02.06 sja Start
//		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
//		// 取引先マスタメンテナンス(編集)画面へ遷移
//		$location.path("wms/master/CustomerMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
//			.search("customerId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].customerId);
//		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
		$location.path("wms/master/CustomerMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
			.search("customerId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].customerId)
			.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mclient.clientCd);
		//荷主センタ変更対応 201７.02.06 sja End

	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);