/**
 * @ngdoc overview
 * @name oneslogiWms.CustomerMasterEdit
 *
 * @description
 * 商品マスタメンテナンス(編集)画面<br>
 *
 * 商品マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.CustomerMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CustomerMasterEdit.service:customerMasterEditApi
 *
 * @description
 * 商品マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * 商品マスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/customerMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/customerMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/customerMasterEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/master/customerMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/customerMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('CustomerMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		supplierZip: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/zip/record']
				 ]
		),
		customerList: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/customerMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/customerMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/customerMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/customerMasterEdit/register'],
				 ['update',             'POST', 'resources/master/customerMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
 *
 * @description
 * 商品マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CustomerMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'CustomerMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.customerListEditCols =
		[
		 {field:"mcenter.centerCd", displayName:"センタ"},
		 {field:"mdeliveryCourse.deliveryCourseCd", displayName:"配送コースCD"},
		 {field:"deliveryOrder", displayName:"配送順"},
		 {field:"deliveryReadTime", displayName:"配送リードタイム"},
		 {field:"delFlg", displayName:"削除"}
		 ];

	var bodyList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#initScreen
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;
		// 荷主リストの設定
		$scope.clientCustomerList = userInfo.clientList;
		// センタ取得
		$scope.centerList = userInfo.centerList;

		// [#979] 選択なしのグリッドに変更 2017.02.15 kawana Start
		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
			// [#979] 選択なしのグリッドに変更 2017.02.15 kawana End

			data: 'customerList',
			columnDefs: 'customerListEditCols',
		});
		//[ON推-品向-294]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
		$scope.gridSelectOptions = {
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				"mclient.clientCd" : {
					key : "clientId",
					value : "clientCd",
					listModel : "clientList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				},
				"deliveryFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "deliveryFlgList"
				},
				"vendorFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "vendorFlgList"
				},
				"onetimeFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "onetimeFlgList"
				},
				"depositFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "depositFlgList"
				},
				"shippingStopFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "shippingStopFlgList"
				},
				"limitDtReverseFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "limitDtReverseFlgList"
				},
				"lotReverseFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "lotReverseFlgList"
				}
		};
		//[ON推-品向-294]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 End
		// グリッドの配送コードにボタンを設定
		$scope.gridButtonOptions = {
				"mdeliveryCourse.deliveryCourseCd":{
					clickFunction:"showDeliveryCourse(row.rowIndex)"
				}
		};

		// [#979] 選択なしのグリッドに変更(選択処理の削除) 2017.02.15 kawana

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
		// 項目のエラーマッピング
		statusInfo.mappingErrorMessage($scope, "centerCd", 6, 9);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
		// 明細項目のエラーマッピング
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mdeliveryCourse.deliveryCourseCd",6, 3);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
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
				 $scope.deferredGetDeliveryFlg(),
				 $scope.deferredGetVendorFlg(),
				 $scope.deferredGetOnetimeFlg(),
				 $scope.deferredGetDepositFlg(),
				 $scope.deferredGetShippingStopFlg(),
				 $scope.deferredGetLimitDtReverseFlg(),
				 $scope.deferredGetLotReverseFlg()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#productBlur
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * 取引先略称未入力の場合、取引先名称をコピーする
	 */
	$scope.customerNmBlur = function(rowIndex) {
		// 入力された取引先名称を取得
		var customerNm = $scope.head.customerNm;
		// 取引先略称を取得
		var customerAbbr = $scope.head.customerAbbr;

		if (customerNm && 0 < customerNm.length) {
			if (customerAbbr && 0 < customerAbbr.length) {
				return;
			}else{
				$scope.head.customerAbbr = customerNm;
			}
		}
	};

	// [#979] 選択なしのグリッドに変更(選択処理の削除) 2017.02.15 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#showProduct
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
	 *
	 * @description
	 * 郵便コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された郵便情報を取得し画面項目に反映する。
	 */
	$scope.showZip = function(rowIndex){
		var items = {
				zipCd: $scope.head.zipCd
		};
		//マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalZip(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.zipCd =  selectedItem.zipCd;
			if((($scope.head.address1 == null)||($scope.head.address1 == ""))&&(($scope.head.address2 == null)||($scope.head.address2 == ""))&&(($scope.head.address3 == null)||($scope.head.address3 == ""))){
			$scope.head.address1 =  selectedItem.address1;
			$scope.head.address2 =  selectedItem.address2;
			$scope.head.address3 =  selectedItem.address3;
			};
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#customerCdBlur
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 郵便コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、郵便コード情報を取得し画面項目に反映する。
	 */
	$scope.zipCdBlur = function(rowIndex) {
		// 入力された郵便コードを取得
		var zipCd = $scope.head.zipCd;
		if((($scope.head.address1 == null)||($scope.head.address1 == ""))&&(($scope.head.address2 == null)||($scope.head.address2 == ""))&&(($scope.head.address3 == null)||($scope.head.address3 == ""))){
//		if(($scope.head.address1 && 0 < $scope.head.address1.length)&&($scope.head.address2 && 0 < $scope.head.address2.length)&&($scope.head.address3 && 0 < $scope.head.address3.length)){
			if (zipCd && 0 < zipCd.length) {
				var request = {};
				request.zipCd = zipCd;

				api.supplierZip.record(request).then(function(response){
					$scope.head.address1 = response.data.mZip.address1;
					$scope.head.address2 = response.data.mZip.address2;
					$scope.head.address3 = response.data.mZip.address3;
				});

			} else {
				$scope.head.address1 = null;
				$scope.head.address2 = null;
				$scope.head.address3 = null;
			}
		};
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#showProduct
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
	 *
	 * @description
	 * 配送コース検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された配送情報を取得し画面項目に反映する。
	 */
	$scope.showDeliveryCourse = function(rowIndex){

		if ($scope.customerList[rowIndex].mcenter.centerCd == null) {
			return;
		}

		var items = {
				centerCd: $scope.customerList[rowIndex].mcenter.centerCd,
				deliveryCourseCd: $scope.customerList[rowIndex].mdeliveryCourse.deliveryCourseCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.customerList[rowIndex].mdeliveryCourse.deliveryCourseCd =  selectedItem.deliveryCourseCd;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
	 *
	 * @description
	 * 削除取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		//荷主センタ変更対応 2017.02.27 sja Start
		if ($route.current.params.clientCd) {
			request.clientId = userInfo.clientIdByCd($route.current.params.clientCd);
		} else {
			request.clientId = userInfo.clientIdByCd(userInfo.clientCd);
		}
		//荷主センタ変更対応 2017.02.27 sja End
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			//荷主センタ変更対応 201７.02.06 sja Start
//			deferred.resolve();
			deferred.resolve(response);
			//荷主センタ変更対応 201７.02.06 sja End
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
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#deferredGetOneTimeFlg
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
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
	 *
	 * @description
	 * 商品マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 取引先マスタ画面修正 2016.06.23 Soe Thiha Tun Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 取引先マスタ画面修正 2016.06.23 Soe Thiha Tun Add End
			// 訂正
			var request = {};
			request.customerId = $route.current.params.customerId;

			api.customerList.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;
				// 明細関連
				$scope.customerList = response.data.body[0].mcenterCustomerList;

				bodyList = response.data.body;

				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;
				// [検査-218] ブランク行追加処理があったため、以下の処理が流れなくなっていた。 2014.12.03 koseki
				// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI Start
				if ($scope.customerList == null || $scope.customerList.length == 0) {
					$scope.customerList = [$scope.blankRow];
					$scope.customerList[0].mcenter.centerCd = userInfo.centerCd;
					$scope.customerList[0].delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					}
				gridDirectiveControl.editable($scope.gridOptions, 'mcenter.centerCd', false, 0);
				// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI End

				// コピー機能追加 取引先マスタ画面修正 2016.06.23 Soe Thiha Tun Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 取引先マスタ画面修正 2016.06.23 Soe Thiha Tun Add End
					directiveControl.editable($scope, 'customerCd', false);
				// コピー機能追加 取引先マスタ画面修正 2016.06.23 Soe Thiha Tun Add Start
				}
				else {
					$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope, 'delFlg', false);
				}
				// コピー機能追加 取引先マスタ画面修正 2016.06.23 Soe Thiha Tun Add End

				owsCommon.syncExec(function() {

				});

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});

		} else {

			// 新規
			api.customerList.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;
				// 明細関連
				$scope.customerList = response.data.body[0].mcenterCustomerList;

				bodyList = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;
				//空行を生成
				$scope.addRow();
				// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI Start
				$scope.customerList = [$scope.blankRow];
				$scope.customerList[0].mcenter.centerCd = userInfo.centerCd;
				gridDirectiveControl.editable($scope.gridOptions, 'mcenter.centerCd', false, 0);
				// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI End
				// 荷主の初期値設定
				$scope.head.mclient.clientCd = userInfo.clientCd;

				// 削除の初期値設定
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);

				directiveControl.editable($scope, 'addRow', false);
				directiveControl.editable($scope, 'removeRow', false);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#addRow
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		$scope.customerList.push(angular.copy($scope.blankRow));
		// [EC-CT1-130] 不要な項目削除 2015.3.19 Sakata Start
		// [EC-CT1-130] 不要な項目削除 2015.3.19 Sakata End

		// 行番号振り直し
		updateRowNumber($scope.customerList);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#removeRow
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){
		// 選択行削除チェック
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.customerList.indexOf(row) > -1) {
				if (row.centerCustomerId != null) {
					i += 1;
					return;
				}
			}
		});
		if (i > 0){
			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
			return;
		}
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}
	    // [横並-053] チェック順変更 2014.11.20 taoys Start
		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mcenter.centerCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mcenter.centerCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mdeliveryCourse.deliveryCourseCd != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mdeliveryCourse.deliveryCourseCd != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].deliveryOrder != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].deliveryOrder != null)
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].deliveryReadTime !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].deliveryReadTime!= null)
							||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){

				item = 1;
				if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
					return;
				}
			}
		}
		// 複数行の場合に警告
		if(item != 1){
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
	    // [横並-053] チェック順変更 2014.11.20 taoys End


		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.customerList.indexOf(row) > -1) {
				$scope.customerList.splice($scope.customerList.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.warehouseList);

		owsCommon.toggleSelectAll($scope.gridOptions, false);
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit#register
	 * @methodOf oneslogiWms.CustomerMasterEdit.object:CustomerMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var listBody = [];
		var emptyBody = [];

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

		// 空行判定
		for (var row = 0; row < $scope.customerList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
				// 空行を退避
				emptyBody.push($scope.customerList[row]);
			} else {
				// 空行以外を退避
				listBody.push($scope.customerList[row]);
			}
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {

				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.customerList.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

	//			// センタCD重複チェック
	//			var j = 0;
	//			var rowIndex = new Array();
	//			var errAry = new Array();
	//			for (var row = 0; row < $scope.customerList.length; row++) {
	//				var centerCd = $scope.customerList[row].mcenter.centerCd;
	//				for (var i = row+1; i < $scope.customerList.length; i++) {
	//					if ($scope.customerList[i].mcenter.centerCd == centerCd){
	//						rowIndex[j] =i;
	//						errAry[j] = "centerCodeDuplicateError";
	//						j++;
	//					}
	//				}
	//			}
	//			if (j > 0){
	//				for(row = 0; row < rowIndex.length; row++){
	//					if (!gridOptionMessageControl.isShow($scope.gridOptions, "mcenter.centerCd", rowIndex[row])) {
	//						gridOptionMessageControl.show($scope.gridOptions, "mcenter.centerCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
	//						directiveControl.firstErrorOnFocus('searchinputform');
	//					}
	//				}
	//				return;
	//			}
	//
	//			// センタCDと配送コースCDを重複チェック
	//			var j = 0;
	//			var rowIndex = new Array();
	//			var errAry = new Array();
	//			for (var row = 0; row < $scope.customerList.length; row++) {
	//				var centerCd = $scope.customerList[row].mcenter.centerCd;
	//				var deliveryCourseCd = $scope.customerList[row].mdeliveryCourse.deliveryCourseCd;
	//				for (var i = row+1; i < $scope.customerList.length; i++) {
	//					if (($scope.customerList[i].mcenter.centerCd == centerCd)&&($scope.customerList[i].mdeliveryCourse.deliveryCourseCd == deliveryCourseCd)){
	//						rowIndex[j] =i;
	//						errAry[j] = "centerCodeDuplicateError";
	//						j++;
	//					}
	//				}
	//			}
	//			if (j > 0){
	//				for(row = 0; row < rowIndex.length; row++){
	//					if (!gridOptionMessageControl.isShow($scope.gridOptions, "mcenter.centerCd", rowIndex[row])) {
	//						gridOptionMessageControl.show($scope.gridOptions, "mcenter.centerCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
	//						directiveControl.firstErrorOnFocus('searchinputform');
	//					}
	//				}
	//				return;
	//			}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.customerList.splice($scope.customerList.indexOf(row), 1);
				});
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// センタCDと配送コースCDを重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				for (var row = 0; row < $scope.customerList.length; row++) {
					var centerCd = $scope.customerList[row].mcenter.centerCd;
					var deliveryCourseCd = $scope.customerList[row].mdeliveryCourse.deliveryCourseCd;
					for (var i = row+1; i < $scope.customerList.length; i++) {
						if (($scope.customerList[i].mcenter.centerCd == centerCd)&&($scope.customerList[i].mdeliveryCourse.deliveryCourseCd == deliveryCourseCd)){
							rowIndex[j] =i;
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//							errAry[j] = "deliveryCourseCodeDuplicateError";
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
							j++;
						}
					}
				}
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "mdeliveryCourse.deliveryCourseCd", rowIndex[row])) {
//							gridOptionMessageControl.show($scope.gridOptions, "mdeliveryCourse.deliveryCourseCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//							directiveControl.firstErrorOnFocus('searchinputform');
//						}
//					}
					// エラーメッセージCD
					var messageCd = "deliveryCourseCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "mdeliveryCourse.deliveryCourseCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.customerList.splice($scope.customerList.indexOf(row), 1);
//				});
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新処理関数を設定
					checkFunc = api.customerList.inputCheck;
					execFunc = api.customerList.update;

					successFunc = function(response){
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					}

				} else {
					// 新規登録関数を設定
					checkFunc = api.customerList.inputCheck;
					execFunc = api.customerList.register;

					successFunc = function(response){
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

						// コピー機能追加 取引先マスタ画面修正 2016.07.05 Soe Thiha Tun Add Start
						if ($scope.screenMode == SCREEN_MODE.Register) {
						// コピー機能追加 取引先マスタ画面修正 2016.07.05 Soe Thiha Tun Add End
							// 初期化
							$scope.initScreenHttp();
						// コピー機能追加 取引先マスタ画面修正 2016.07.05 Soe Thiha Tun Add Start
						}
						// コピー機能追加 取引先マスタ画面修正 2016.07.05 Soe Thiha Tun Add End
					}
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				bodyList[0].mcenterCustomerList = listBody
				request.data.body = bodyList;
				request.data.head = $scope.head;

				// コピー機能追加 取引先マスタ画面修正 2016.07.06 Soe Thiha Tun Add Start
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					request.data.head.customerId = null;
				}
				// コピー機能追加 取引先マスタ画面修正 2016.07.06 Soe Thiha Tun Add End

				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					if (checkResponse.status.listStatus != null){
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//取引先CD存在チェック
							if (checkResponse.status.listStatus[i].status.statusCode == 2){
								optionMessageControl.show($scope, "customerCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								return;
							}
						}
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//郵便番号CD存在チェック
							if (checkResponse.status.listStatus[i].status.statusCode == 7){
								optionMessageControl.show($scope, "zipCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								return;
							}
						}
					}
					// [横並-031] チェックの確認 2014.11.28 taoys Start
					if(checkResponse.status.messageCode =="Both"){
						if (!owsCommon.viewConfirm("customerRegisterUsingOwnedCenterAnotherConfirmation")) {
							return;
						};
						if (!owsCommon.viewConfirm("customerRegisterUsingClientCustomerAnotherConfirmation")) {
							return;
						}
					}else{
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchinputform')) {
							return;
						}
					}
					// [横並-031] チェックの確認 2014.11.28 taoys End
					// 商品マスタデータ登録または更新
					execFunc(request).then(function(execResponse){

						// 処理結果確認
						if(execFunc == api.customerList.register){
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchinputform')) {
								return;
							}
						}

						// 完了後の処理
						successFunc(execResponse);
					});
				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
