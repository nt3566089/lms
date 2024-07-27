/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryCreate
 *
 * @description
 * 棚卸データ作成
 */
angular.module('oneslogiWms.InventoryCreate',[])
/**
 * @ngdoc service
 * @name oneslogiWms.InventoryCreate.service:InventoryCreateApi
 *
 * @description
 * 棚卸データ作成操作用WebApi<br>
 * ・resources/inventory/inventoryCreate/init   画面用初期データ取得<br>
 * ・resources/inventory/inventoryCreate/inputCheck   入力チェック<br>
 * ・resources/inventory/inventoryCreate/register   棚卸データ作成<br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/wmsCommon/depositCustomerList  預託データ取得<br>
 * ・resources/common/stockType/keyValueList  在庫区分データ取得<br>
 * ・resources/common/location/record  ロケーションデータ取得<br>
 *
 */
.factory('InventoryCreateApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		stockTarget: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		),
		zone: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		inventoryCreate: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/inventory/inventoryCreate/init'],
				 ['inputCheck',  'POST', 'resources/inventory/inventoryCreate/inputCheck'],
				 ['register', 'POST', 'resources/inventory/inventoryCreate/register'],
				 // 棚卸データ削除ボータン追加 2017.07.18 aungtun Start
				 ['deletedata', 'POST', 'resources/inventory/inventoryCreate/deletedata'],
				 // 棚卸データ削除ボータン追加 2017.07.18 aungtun Start
				 // [#71] 削除データチェック 2017.08.23 ase start
				 ['deleteDataCheck', 'POST', 'resources/inventory/inventoryCreate/deleteDataCheck'],
				 ['deleteInputCheck', 'POST', 'resources/inventory/inventoryCreate/deleteInputCheck']
				 // [#71] 削除データチェック 2017.08.23 ase end
				]
		),
		//荷主センタ変更対応 201７.02.10 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		)
		//荷主センタ変更対応 201７.02.10 sja End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryCreate.object:InventoryCreate
 *
 * @description
 * 棚卸データ作成画面コントローラ
 */
.controller('InventoryCreate', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'InventoryCreateApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	// 画面初期化処理
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.conditionH.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response){
				newDepositStockTypeList = response.data;
			});
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				newStockTypeList = response.data;
			});
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.conditionH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
			}
		};
		// 倉庫変更の監視設定（フォーカス時）
		$scope.warehouseFocus = function() {
			oldWarehouse = $scope.conditionB.mwarehouse.warehouseCd;
		};

		// 倉庫変更の監視設定（選択内容変更時）
		$scope.warehouseChange = function() {
			// ゾーンリスト変更（同期処理）
			$scope.deferredGetZoneList()
			.then(function(response){
				newZoneList = response.data;
			});
		};

		// 倉庫変更の監視設定（ロストフォーカス時）
		$scope.warehouseBlur = function() {
			if (oldWarehouse != $scope.conditionB.mwarehouse.warehouseCd) {
				// 選択した倉庫で取得済みのゾーンリストを設定
				setZoneList(newZoneList, true);
			}
		};

		// ロケーション大小チェック
        $scope.fromToCheck = function(fromValue, toValue) {
        	var fromValueString = fromValue;
        	var toValueString = toValue;
        	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
            	return true;
        	}
           	if (fromValueString > toValueString) {
            	return false;
            }
        	return true;
        };

		// ロケーション大小チェック用メッセージ
        $scope.fromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// 日付大小チェック
        $scope.fromToDtCheck = function(fromValue, toValue) {
        	var fromValueString = owsCommon.dateToString(fromValue);
        	var toValueString = owsCommon.dateToString(toValue);
        	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
            	return true;
        	}
        	if (fromValueString > toValueString) {
        		return false;
        	}
        	return true;
        };

		// 日付大小チェック用メッセージ
        $scope.fromToDtMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		// 棚卸日のチェック用メッセージ
        $scope.inventoryDtCheck = function(inventoryDtValueString) {
        	var inventoryDtValueString = owsCommon.dateToString(inventoryDtValueString);
        	var systemDtValueString = owsCommon.dateToString(userInfo.systemDt);
        	if (systemDtValueString > inventoryDtValueString) {
        		return false;
        	}
        	return true;
        };

       // 棚卸日にログイン情報.業務日付より過去の日付が入力されていた場合
        $scope.inventoryDtMessage = $filter('owfMessage')("dateInputError");

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetConditionList(),
				 //荷主センタ変更対応 201７.02.10 sja Start
				 $scope.deferredGetWarehouseCdList()
				//荷主センタ変更対応 201７.02.10 sja End
				]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	// 在庫数＞０のみデータ取得
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_TARGET";

		api.stockTarget.keyValueList(request).then(function(response){
			$scope.stockTargetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.inventoryCreate.init().then(function(response){
			$scope.conditionH = response.data.head;
			$scope.conditionB = response.data.body;
			$scope.conditionI = response.data.Inst;
			$scope.conditionH.mclient.clientCd = userInfo.clientCd;
			$scope.conditionH.mcenter.centerCd = userInfo.centerCd;
			$scope.conditionH.inventoryDt = userInfo.systemDt;

			// 荷主変更後処理
			$scope.changeClient(true);

			// 倉庫変更後処理
			$scope.changeWarehouse(true);

			//在庫数＞０のみを設定
			if ($scope.stockTargetList.length > 0) {
				$scope.conditionI.stockExistOnlyFlg = owsCommon.getDefaultValue($scope.stockTargetList);
			}
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.10 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.MoveLabelPrint.object:MoveLabelPrint#changeCenter
	 * @methodOf oneslogiWms.MoveLabelPrint.object:MoveLabelPrint
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
		//荷主センタ変更対応 2017.03.07 sja Start
//		$scope.deferredGetWarehouseCdList();
		$scope.deferredGetWarehouseCdList()
		.then(function(response){
			$scope.deferredGetZoneList()
			.then(function(response){
				setZoneList(response.data, false);
			});
		});
		//荷主センタ変更対応 2017.03.07 sja End
	};
	//荷主センタ変更対応 201７.02.10 sja End

	//荷主センタ変更対応 201７.02.10 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.conditionH) {
			request.centerId = userInfo.centerIdByCd($scope.conditionH.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.10 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 預託在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.conditionH.mclient.clientCd;

		api.depositCustomer.keyValueList(request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#changeClient
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託と在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);
		});
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});
	};
	//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.08 衛 Start
	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;
		if (clearSelected) {
		// 選択肢が一つの場合は一つ目を設定
		if ($scope.depositStockTypeList.length == 1) {
		$scope.conditionB.mcustomerByDepositId.customerCd  = $scope.depositStockTypeList[0].mCustomer.customerCd;
		} else {
			$scope.conditionB.mcustomerByDepositId.customerCd  = null;
		}
	} else {
		$scope.conditionB.mcustomerByDepositId.customerCd  = null;
	}
	};
	//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.08 衛 End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#deferredGetStockTypeList
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.conditionH.mclient.clientCd;

		api.stockType.keyValueList(request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

		// 在庫区分は一つ目を設定
		if (clearSelected) {
			$scope.conditionB.mstockType.stockTypeCd = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#deferredGetZoneList
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * ゾーン取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetZoneList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.centerCd = $scope.conditionH.mcenter.centerCd;
		request.warehouseCd = $scope.conditionB.mwarehouse.warehouseCd;

		api.zone.keyValueList(request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#changeWarehouse
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 倉庫変更後処理<br>
	 *
	 * 倉庫が変更された場合、ゾーンリストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeWarehouse = function(clearSelected) {
		// ゾーンリスト変更（同期処理）
		$scope.deferredGetZoneList()
		.then(function(response){
			setZoneList(response.data, clearSelected);
		});
	};

	// ゾーンリスト再設定処理
	var setZoneList = function(list, clearSelected) {
		$scope.zoneList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			$scope.conditionI.mzone.zoneCd = null;
		}
	};

    // [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#locationCdBlur
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * ロケーションコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {
		// 入力されたロケーションCD
        var locationCd;
		if (index == 1) {
			locationCd = $scope.conditionI.fromLocationCd;
		} else {
			locationCd = $scope.conditionI.toLocationCd;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.conditionH.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if (index == 1) {
					$scope.conditionI.fromLocationNm = response.data.mLocation.locationNm;
				} else {
					$scope.conditionI.toLocationNm = response.data.mLocation.locationNm;
				}

			});
		} else {
			if (index == 1) {
				$scope.conditionI.fromLocationNm = null;
			} else {
				$scope.conditionI.toLocationNm = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#showLocation
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
        var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.conditionI.fromLocationCd;
		} else {
			inLocationCd = $scope.conditionI.toLocationCd;
		}

		var items = {
				centerCd: $scope.conditionH.mcenter.centerCd,
				locationCd: inLocationCd,
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
				warehouseCd: $scope.conditionB.mwarehouse.warehouseCd,
				zoneCd: $scope.conditionI.mzone.zoneCd
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.conditionI.fromLocationCd = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.conditionI.fromLocationNm = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			} else {
				$scope.conditionI.toLocationCd = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.conditionI.toLocationNm = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	// 棚卸データ作成ボタン
	$scope.register = function() {
		//業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;
		request.data.Inst = $scope.conditionI;

		// 入力チェック
		api.inventoryCreate.inputCheck(request).then(function(response){

			// [Ver2.2.1][#71]メッセージ表示修正 2017.09.27 miyabe Start

			// 処理結果確認
			// [横並-195] メッセージを表示修正 2014.11.24 SJA-ZHENG Start
			if (response.status.listStatus != null){
				for (var i = 0 ;i <response.status.listStatus.length;i++){
					if (response.status.listStatus[i].status.statusCode == 4){
						if (!owsCommon.viewConfirm(response.status.listStatus[i].status.messageCode)) {
							return;
						}
						break;
					}else if (response.status.listStatus[i].status.statusCode == 2){
						if (!owsCommon.viewConfirm(response.status.listStatus[i].status.messageCode)) {
							return;
						}
						break;
					}
				}
			}else if (!statusInfo.isSuccessAndShowMessage(response, 'createform')) {
				return;
			}else if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
				return;
			}

			// [横並-195] メッセージを表示修正 2014.11.24 SJA-ZHENG End

			// [Ver2.2.1][#71]メッセージ表示修正 2017.09.27 miyabe End

			// 棚卸データ作成を行う。
			api.inventoryCreate.register(request).then(function(execResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(execResponse, 'createform')) {
					return;
				}

				// 完了後の処理
				//successFunc(execResponse);
			});

		});

	};
	// 棚卸データ削除ボータン追加 2017.07.18 aungtun Start
	// 棚卸データ削除ボタン
	$scope.deletedata = function() {

		//業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;
		request.data.Inst = $scope.conditionI;


		// [#71] 削除データチェック 2017.08.23 ase start
		// データチェック
		api.inventoryCreate.deleteDataCheck(request).then(function(response){

			if (!statusInfo.isSuccessAndShowMessage(response, 'createform')) {
				return;
			}

			// 入力チェック
//			api.inventoryCreate.inputCheck(request).then(function(response){
			api.inventoryCreate.deleteInputCheck(request).then(function(response){
		// [#71] 削除データチェック 2017.08.23 ase end

				// [Ver2.2.1][#71]メッセージ表示修正 2017.09.27 miyabe Start

				// 処理結果確認
				if (response.status.listStatus != null){
					for (var i = 0 ;i <response.status.listStatus.length;i++){
						if (response.status.listStatus[i].status.statusCode == 4){
							if (!owsCommon.viewConfirm(response.status.listStatus[i].status.messageCode)) {
								return;
							}
						break;
						} else if (response.status.listStatus[i].status.statusCode == 2){
							if (!owsCommon.viewConfirm(response.status.listStatus[i].status.messageCode)) {
								return;
							}
						break;
						}
					}
				}else if (!statusInfo.isSuccessAndShowMessage(response, 'createform')) {
					return;
				}else if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
					return;
				}

//				// 処理結果確認
//				if (response.status.listStatus != null){
//					for (var i = 0 ;i <response.status.listStatus.length;i++){
//						if (response.status.listStatus[i].status.statusCode == 2){
//							if (!owsCommon.viewConfirm(response.status.listStatus[i].status.messageCode)) {
//								return;
//							}
//						}
//						if (response.status.listStatus[i].status.statusCode == 4){
//							if (!owsCommon.viewConfirm(response.status.listStatus[i].status.messageCode)) {
//								return;
//							}
//						}
//					}
//				}else if (!statusInfo.isSuccessAndShowMessage(response, 'createform')) {
//					return;
//				}

				// [Ver2.2.1][#71]メッセージ表示修正 2017.09.27 miyabe End

				// 棚卸データ削除を行う。
				api.inventoryCreate.deletedata(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'createform')) {
						return;
					}

				});

			});


		// [#71] 削除データチェック 2017.08.23 ase start
		});
		// [#71] 削除データチェック 2017.08.23 ase end

	}
	// 棚卸データ削除ボータン追加 2017.07.18 aungtun End

	// 画面初期化処理を実行
	$scope.initScreen();
}]);