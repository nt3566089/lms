/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryListPrint
 *
 * @description
 * 棚卸関連リスト発行画面
 */

angular.module('oneslogiWms.InventoryListPrint',[])
/**
 * @ngdoc service
 * @name oneslogiWms.InventoryListPrint.service:inventoryDiffListPrintApi
 *
 * @description
 * 棚卸関連リスト発行WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/depositCustomer/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/location/record ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/inventory/inventoryListPrint/init 初期化用WebApi<br>
 * ・resources/inventory/inventoryListPrint/print 発行用WebApi<br>
 */
.factory('inventoryListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropDownList: AngularAPIClient.make(
			[
			 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
			 ]
		),
		depositCustomer: AngularAPIClient.make(
			[
			 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
			 ]
		),
		location: AngularAPIClient.make(
			[
			 ['record', 'GET', 'resources/common/location/record']
			 ]
		),
		userInfo: AngularAPIClient.make(
			[
			 ['record', 'GET', 'resources/common/user/record']
			 ]
		),
		inventoryListPrint: AngularAPIClient.make(
			[
			 ['init',  'GET', 'resources/inventory/inventoryListPrint/init'],
			 ['print', 'GET', 'resources/inventory/inventoryListPrint/print']
			 ]
		)
	};
}])
/**
 * @ngdoc object
 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint
 *
 * @description
 * 棚卸作業リスト発行画面<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('InventoryListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'inventoryListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#initScreen
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		
		// ロケーション大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#fromToCheck
	 * @methodOf oneslogiWms.MoveLabelPrint.object:MoveLabelPrint
	 *
	 * @description
	 *ロケーション大小チェック処理<br>
	 *ロケーション(To)設定処理<br>
	 * 
	 * ロケーション(From)　＞　ロケーション(To)の場合、チェックエラーにする。
	 * ロケーション(To)が入力されない状態で、ロケーション(From)の入力値を設定する。
	 */
	 $scope.fromToCheck = function(fromValue, toValue) {
		var fromValueString = fromValue;
		var toValueString = toValue;
		if(!toValueString && fromValueString){
			toValueString = fromValueString;
		}
    	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
        	return true;
    	}
		if (fromValueString > toValueString) {
			return false;
		}
		return true;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#initScreenHttp
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
			[
			 $scope.deferredGetDepositList(),
			 $scope.deferredGetInventoryPrintTypeList(),
			 $scope.deferredGetAreaCdList(),
			 $scope.deferredGetInventoryListPrintTypeList(),
			 $scope.deferredGetInventoryDiffList(),
			 $scope.deferredGetDiffPriceHiddenFlg()
			 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 * 所有者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEPOSITOR_CLS";

		owsCommon.getDataCacheable(api.dropDownList, "keyValueList", request).then(function(response){
			$scope.depositStockTypeList =  response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#deferredGetInventoryPrintTypeList
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 *棚卸帳票発行区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInventoryPrintTypeList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVENTORY_LIST_TYPE";

		owsCommon.getDataCacheable(api.dropDownList, "keyValueList", request).then(function(response){
			$scope.inventoryPrintTypeList =  response.data;
			$scope.inventoryPrintTypeListR =  response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#deferredGetAreaCdList
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 *エリア取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAreaCdList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "AREA_CLS";

		owsCommon.getDataCacheable(api.dropDownList, "keyValueList", request).then(function(response){
			$scope.areaCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#deferredGetInventoryListPrintTypeList
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 *棚卸リスト発行区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInventoryListPrintTypeList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVENTORY_LIST_OUT_CLS";

		owsCommon.getDataCacheable(api.dropDownList, "keyValueList", request).then(function(response){
			$scope.inventoryListPrintTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#deferredGetInventoryDiffList
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 *棚卸差異取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInventoryDiffList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVENTORY_DIFF_CLS";

		owsCommon.getDataCacheable(api.dropDownList, "keyValueList", request).then(function(response){
			$scope.inventoryDiffList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#deferredGetDiffPriceHiddenFlg
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 *差異金額非表示取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDiffPriceHiddenFlg = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRICE_DIFF_HIDDEN";

		owsCommon.getDataCacheable(api.dropDownList, "keyValueList", request).then(function(response){
			$scope.diffPriceHiddenList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.inventoryListPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.head = response.data.head;
			$scope.headR = response.data.headR;
			$scope.body = response.data.body;
			$scope.bodyR = response.data.bodyR;
			
			$scope.head.mcenter.centerCd = userInfo.centerCd;
			$scope.head.mclient.clientCd = userInfo.clientCd;
			$scope.headR.mcenter.centerCd = userInfo.centerCd;
			$scope.headR.mclient.clientCd = userInfo.clientCd;
			//棚卸指示日をシステム管理日付として、初期設定
			$scope.head.inventoryInstDt = userInfo.systemDt;
			$scope.headR.inventoryInstDt = userInfo.systemDt;
			
			var inventoryPrintTypeArr = ["01", "02"];
			var inventoryPrintTypeArrR = ["03", "04"];
			
			//棚卸帳票発行区分
			$scope.inventoryPrintTypeList = $scope.inventoryPrintTypeList.filter(function(value, index) {
			  return inventoryPrintTypeArrR.indexOf(value.classCd)  < 0;
			});
			$scope.head.inventoryPrintType = "01";
			//棚卸帳票発行区分R
			$scope.inventoryPrintTypeListR = $scope.inventoryPrintTypeListR.filter(function(value, index) {
			  return inventoryPrintTypeArr.indexOf(value.classCd)  < 0;
			});
			$scope.headR.inventoryPrintType = "03";
			
			//棚卸差異初期設定
			$scope.head.inventoryDiff = "01";
			
			//所有者初期設定
			if($scope.depositStockTypeList.length == 1){
				var code = $scope.depositStockTypeList[0].classCd;
				$scope.body.mcustomerByDepositId.customerCd = code;
				$scope.bodyR.mcustomerByDepositId.customerCd = code;
			}
			
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#showLocation
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
		var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.body.fromLocationCd;
		} else {
			inLocationCd = $scope.body.toLocationCd;
		}

		var items = {
			centerCd: $scope.head.mcenter.centerCd,
			locationCd: inLocationCd
			//warehouseCd: $scope.head.mwarehouse.warehouseCd,
			//zoneCd: $scope.head.zoneCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.body.fromLocationCd = selectedItem.locationCd;
				$scope.body.fromLocationNm = selectedItem.locationNm;
			} else {
				$scope.body.toLocationCd = selectedItem.locationCd;
				$scope.body.toLocationNm = selectedItem.locationNm;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#locationCdBlur
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {

		// 入力されたロケーションCD
		var locationCd = "";
		if (index == 1) {
			locationCd = $scope.body.fromLocationCd;
			if(locationCd && 0 < locationCd.length){
				$scope.body.toLocationCd = locationCd;
				var request = {};
				request.centerId = userInfo.centerIdByCd($scope.head.mcenter.centerCd);
				request.locationCd = locationCd;
				// ロケーション情報の取得
				api.location.record(request).then(function(response){
					// ロケーション名称を表示
					$scope.body.toLocationNm = response.data.mLocation.locationNm;
				});
			}
		} else {
			locationCd = $scope.body.toLocationCd;
		}

		if (locationCd && 0 < locationCd.length) {
			
			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.head.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.body.fromLocationNm = response.data.mLocation.locationNm;
				}else{
					$scope.body.toLocationNm = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.body.fromLocationNm = null;
			}else{
				$scope.body.toLocationNm = null;
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#showUser
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 * 棚卸担当者検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたユーザーマスタ情報を取得し画面項目に反映する。
	 */
	$scope.showUser = function(index){
//		var	userCd = $scope.head.inventoryUserCd;
//
//		var items = {
//			centerCd: $scope.head.mcenter.centerCd,
//			locationCd: inLocationCd
//			//warehouseCd: $scope.head.mwarehouse.warehouseCd,
//			//zoneCd: $scope.head.zoneCd
//		};
//
//		// ロケーションマスタのモーダル画面を表示
//		var modalInstance = modalFactory.modalLocation(items);
//
//		// モーダル画面が閉じられたら呼ばれるファンクションの登録
//		modalInstance.result.then(function(selectedItem){
//			if (index == 1) {
//				$scope.body.fromLocationCd = selectedItem.locationCd;
//				$scope.body.fromLocationNm = selectedItem.locationNm;
//			} else {
//				$scope.body.toLocationCd = selectedItem.locationCd;
//				$scope.body.toLocationNm = selectedItem.locationNm;
//			}
//		});
	};

/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryListPrint.object:InventoryListPrint#userCdBlur
	 * @methodOf oneslogiWms.InventoryListPrint.object:InventoryListPrint
	 *
	 * @description
	 * ユーザーCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ユーザーマスタ情報を取得し画面項目に反映する。
	 */
	$scope.userCdBlur = function(index) {

		// 入力されたユーザーCD
		var userCd = $scope.head.inventoryUserCd;

		if (userCd && 0 < userCd.length) {

			var request = {};
			request.userCd = userCd;

			// ユーザーマスタ情報の取得
			api.userInfo.record(request).then(function(response){
				// ユーザー名称を表示
				$scope.head.userNm = response.data.bUser.userNm;
			});
		} else {
			// ユーザー名称をクリア
			$scope.head.userNm = null;
		}
	};


	//差異リスト出力レポートIDを取得する
	$scope.deferredGetReportId1 = function(){
		var deferred = $q.defer();
		var request = {};
		request.inventoryPrintType = $scope.head.inventoryPrintType;
		api.inventoryListPrint.init(request).then(function(response){
			$scope.printParam = response.printBasicData;
			deferred.resolve();
		});
		return deferred.promise;
	}
	
	//差異リスト出力レポートプリント
	$scope.defferedPrint1 = function(){
		var deferred = $q.defer();

		// プリンタ選択画面を表示
		var modalInstance = printFactory.modalPrint($scope.printParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam){
			var request = {};
			request.data = {};
			request.data.head = $scope.head;
			request.data.body = $scope.body;
			request.printBasicData = printParam.printBasicData;

			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.inventoryListPrint.print(request).then(function(response){
				if (statusInfo.isSuccessAndShowMessage(response, 'diffform')) {
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
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
			});
		});
		return deferred.promise;
	}
	
	//実績表出力レポートIDを取得する
	$scope.deferredGetReportId2 = function(){
		var deferred = $q.defer();
		var request = {};
		request.inventoryPrintType = $scope.headR.inventoryPrintType;
		api.inventoryListPrint.init(request).then(function(response){
			$scope.printParam = response.printBasicData;
			deferred.resolve();
		});
		return deferred.promise;
	}
	
	
	$scope.defferedPrint2 = function(){
		var deferred = $q.defer();

		// プリンタ選択画面を表示
		var modalInstance = printFactory.modalPrint($scope.printParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam){
			var request = {};
			request.data = {};
			request.data.headR = $scope.headR;
			request.data.bodyR = $scope.bodyR;
			request.printBasicData = printParam.printBasicData;

			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.inventoryListPrint.print(request).then(function(response){
				if (statusInfo.isSuccessAndShowMessage(response, 'outlistform')) {
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
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
			});
		});
		return deferred.promise;
	}
	
	// 差異リスト発行
	$scope.issue1 = function() {
		$scope.deferredGetReportId1().then(
			function(response){
				return $scope.defferedPrint1();
			}
		);
	};

	// 実績表発行
	$scope.issue2 = function() {
		$scope.deferredGetReportId2().then(
			function(response){
				return $scope.defferedPrint2();
			}
		);
	};
	// 画面初期化処理を実行
	$scope.initScreen();
}]);

