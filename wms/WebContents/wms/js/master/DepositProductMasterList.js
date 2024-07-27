/**
 * @ngdoc overview
 * @name oneslogiWms.DepositProductMasterList
 *
 * @description
 * 預り商品マスタメンテナンス(一覧)画面
 */
angular.module('oneslogiWms.DepositProductMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.DepositProductMasterList.service:depositProductMasterListApi
 *
 * @description
 * 預り商品マスタメンテナンス(一覧)WebApi定義<br>
 * ・resources/master/depositProductMasterList/init 初期化用WebApi<br>
 * ・resources/master/depositProductMasterList/selectByConditions 検索用WebApi<br>
 *
 */
.factory('depositProductMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		depositProductMasterList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/depositProductMasterList/init'],
			    ['search', 'GET', 'resources/master/depositProductMasterList/selectByConditions'],
			    ['excel',  'GET', 'resources/master/depositProductMasterList/selectByConditions', 'excel']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster
 *
 * @description
 * 預り商品マスタメンテナンス(一覧)画面コントローラ
 */
.controller('DepositProductMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo','modalFactory', 'depositProductMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.depositProductMasterListCols =
		[
         {field:"msalesOrg.salesOrgCd", displayName:"販売組織CD"},
         {field:"msalesOrg.tenhanshaNm1", displayName:"販売組織名称"},
         {field:"accountCd", displayName:"得意先CD"},
         {field:"mcustomer.customerNm", displayName:"得意先名称"},
         {field:"mproduct.productCd", displayName:"商品CD"},
         {field:"mproduct.productNm", displayName:"商品名称"},
         {field:"depositJanCd", displayName:"預りJANCD"},
         {field:"idManagTypeCd", displayName:"個体管理区分CD"},
         {field:"idManagTypeNm", displayName:"個体管理区分名称"},
         {field:"delFlg", displayName:"削除フラグCD"},
         {field:"delFlgNm", displayName:"削除フラグ名称"},
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#initScreen
     * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
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
		
		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();
		
		//$scope.pagingOptions.paginationPageSizes = [2,10,20];
		
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'depositProductMasterList',
			columnDefs: 'depositProductMasterListCols',
			pagingOptions : $scope.pagingOptions
		});
		
		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}
	
    /**
     * @ngdoc method
     * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#initScreenHttp
     * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     *
     * サーバとの通信を制御し、取得結果を画面項目に反映する。
     */
	$scope.initScreenHttp = function(response) {
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.accountGetList()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });

	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
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
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#accountGetList
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 得意先取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.accountGetList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.accountList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#deferredGetInitData
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 預り商品マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.depositProductMasterList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.depositProductMasterList = response.data.body;
			$scope.head.centerCd = userInfo.centerCd;
			$scope.paging = response.paging;
			$scope.head.delFlg = "0";
			//$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#search
     * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
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
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#getPagedDataAsync
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 検索処理<br>
	 * ・ユーザマスタ一覧検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		
		api.depositProductMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setPagingData(response, page, pageSize);
		});
	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#setSearchData
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * Excelデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		//取得したデータをグリッドに表示
		$scope.depositProductMasterList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#excelOutput
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
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

		api.depositProductMasterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#gridDblClick
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
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
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#getClassForRow
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 行別背景色取得処理<br> 
	 *
	 * センタステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#register
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * センタ新規する為の画面を表示する。
	 */
	$scope.register = function() {

		//新規画面へ遷移
		$location.path("wms/master/DepositProductMasterEdit").search({"mode": SCREEN_MODE.Register});

	};

	// 画面初期化処理を実行
	$scope.initScreen();


	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#update
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の商品データを修正する為の画面を表示する。
	 */
	$scope.update = function() {
		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}
		var request = {};
		request.depositProductId = $scope.gridOptions.gridApi.selection.getSelectedRows()[0].depositProductId;
		request.mode = SCREEN_MODE.Update;
		
		//修正画面へ遷移
		$location.path("wms/master/DepositProductMasterEdit").search(request);

	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#showLocation
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 商品マスタ検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){
		var items = {
				clientCd: userInfo.clientCd,
				productCd: $scope.head.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.mproduct.productCd =  selectedItem.productCd;
			$scope.head.mproduct.productNm =  selectedItem.productNm;
		});
	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#productCdBlur
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 商品Cdのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(){
		// 入力された商品コードを取得
		var productCd = $scope.head.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd(userInfo.clientCd);
			request.productCd = productCd;

			//$scope.searchCondition.body.mproduct.productNm = null;

			api.product.record(request).then(function(response){
				$scope.head.mproduct.productNm = response.data.mProduct.productNm;
			});
		} else {
			$scope.head.mproduct.productNm = null;
		}
	}
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#showSalesOrg
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 販売組織検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された販売組織情報を取得し画面項目に反映する。
	 */
	$scope.showSalesOrg = function(){
		//.....
	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#salesOrgCdBlur
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 販売組織Cdのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、選択された販売組織情報を取得し画面項目に反映する。
	 */
	$scope.salesOrgCdBlur = function(){
		//......
	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#showAccount
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 得意先検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された取引先情報を取得し画面項目に反映する。
	 */
	$scope.showAccount = function(){
		//.....
	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterList.object:DepositProductMaster#accountCdBlur
	 * @methodOf oneslogiWms.DepositProductMasterList.object:DepositProductMaster
	 *
	 * @description
	 * 得意先Cdのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、選択された取引先情報を取得し画面項目に反映する。
	 */
	$scope.accountCdBlur = function(){
		//......
	}
}]);
