/**
 * @ngdoc overview
 * @name oneslogiWms.DepositProductMasterEdit
 *
 * @description
 * 預り商品マスタメンテナンス(編集)画面<br>
 *
 */
angular.module('oneslogiWms.DepositProductMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.DepositProductMasterEdit.service:DepositProductMasterEditApi
 *
 * @description
 * 預り商品マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>

 * 預り商品マスタデータ操作用WebApi
 * ・resources/class/keyValueList
 * <br>
 *   depositProductMasterEditApi 預り商品マスタデータ操作用WebApi<br>
 * ・resources/master/depositProductMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/depositProductMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/depositProductMasterEdit/inputCheck 登録前入力チェックWebAPI<br>
 * ・resources/master/depositProductMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/depositProductMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('depositProductMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		depositProductMasterEdit: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/depositProductMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/depositProductMasterEdit/initUpdate'],
				 ['updateCheck',         'POST', 'resources/master/depositProductMasterEdit/updateCheck'],
				 ['createCheck',         'POST', 'resources/master/depositProductMasterEdit/createCheck'],
				 ['register',           'POST', 'resources/master/depositProductMasterEdit/register'],
				 ['update',             'POST', 'resources/master/depositProductMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
 *
 * @description
 * 預り商品マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('DepositProductMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'depositProductMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster#initScreen
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}


	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster#initScreenHttp
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
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
				 $scope.deferredGetAccountList(),
				 $scope.deferredIdManagTypeCdList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster#deferredIdManagTypeCdList
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
	 *
	 * @description
	 * 個体管理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredIdManagTypeCdList = function () {

		var deferred = $q.defer();

		var request = {};
		request.classCd = "ID_MANAG_TYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.idManagTypeCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
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
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster#deferredGetAccountList
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
	 *
	 * @description
	 * 得意先取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAccountList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.accountList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster#deferredGetInitData
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
	 *
	 * @description
	 * 預り商品マスタメンテナンスデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {

			// 訂正
			var request = {};
			request.depositProductId = $route.current.params.depositProductId;

			api.depositProductMasterEdit.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				$scope.head = response.data.head; // 預り商品マスタメンテナンスヘッダ関連
				$scope.head.centerCd = userInfo.centerCd;
				$scope.head.clientId = userInfo.clientId;
				$scope.head.depositProductId = $route.current.params.depositProductId;

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});

		} else {
			
			// 新規
			api.depositProductMasterEdit.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				$scope.head = response.data.head; // センタマスタメンテナンスヘッダ関連
				$scope.head.clientId = userInfo.clientId;
				$scope.head.centerCd = userInfo.centerCd;
				// 削除の初期値設定
				directiveControl.editable($scope,"delFlg",false);
				$scope.head.delFlg = "0";
				//個体管理区分初期値設定
				$scope.head.idManagTypeCd = "0";

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});

		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMasterEdit#register
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		var isError = $scope.inputform.$invalid;

		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('inputform');
			return;
		}
		var checkFunc;   // 入力チェック関数
		var execFunc;    // データ登録関数
		var successFunc; // 正常終了後関数

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.centerId = userInfo.centerId;
		
		if ($scope.screenMode == SCREEN_MODE.Update) {
			// 更新処理関数を設定
			checkFunc = api.depositProductMasterEdit.updateCheck;
			execFunc = api.depositProductMasterEdit.update;
			successFunc = function(response){
				// 前画面へ戻る
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
			}

		} else {
			// 新規登録関数を設定
			checkFunc = api.depositProductMasterEdit.createCheck;
			execFunc = api.depositProductMasterEdit.register;

			successFunc = function(){
				// 初期化
				$scope.initScreenHttp();
			}
		}

		// 入力チェック
		checkFunc(request).then(function(checkResponse){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
				return;
			}

			// センタマスタメンテナンスデータ登録または更新
			execFunc(request).then(function(execResponse){

				// 処理結果確認
				if(execFunc == api.depositProductMasterEdit.register){
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
						return;
					}

				}else if(execFunc == api.depositProductMasterEdit.update){
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
						return;
					}

				}
				// 完了後の処理
				successFunc(execResponse);
			});

		});
	}
	// 画面初期化処理を実行
	$scope.initScreen();
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster#showLocation
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
	 *
	 * @description
	 * 商品マスタ検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(index){
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
	 * @name oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster#productCdBlur
	 * @methodOf oneslogiWms.DepositProductMasterEdit.object:DepositProductMaster
	 *
	 * @description
	 * 商品Cdのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(index){
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
