/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryInput
 *
 * @description
 * 棚卸入力
 */
angular.module('oneslogiWms.InventoryInput',[])
/**
 * @ngdoc service
 * @name oneslogiWms.InventoryInput.service:InventoryInputApi
 *
 * @description
 * 棚卸入力操作用WebApi<br>
 * ・resources/inventory/inventoryInput/init   画面用初期処理<br>
 * ・resources/inventory/inventoryInput/select   棚卸入力データ取得<br>
 * ・resources/inventory/inventoryInput/register  棚卸データ追加・更新処理<br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/depositCustomer/keyValueList  預託在庫リスト用データ取得<br>
 * ・resources/common/stockType/keyValueList  在庫区分リスト用データ取得<br>
 * ・resources/common/supplierCustomer/record  仕入先データ取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 *
 */
.factory('InventoryInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		stockTakingInput: AngularAPIClient.make(
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
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		zone: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.14 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.14 sja End
		inventoryInput: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/inventory/inventoryInput/init'],
				 ['select',  'GET', 'resources/inventory/inventoryInput/select'],
				 ['excel',  'GET', 'resources/inventory/inventoryInput/select', 'excel'],
				 ['register', 'POST', 'resources/inventory/inventoryInput/register']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryInput.object:InventoryInput
 *
 * @description
 * 棚卸データ作成画面コントローラ
 */
// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
//.controller('InventoryInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'InventoryInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){
.controller('InventoryInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'InventoryInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){
// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End

	//グリッドの列情報（デザイン用）
	$scope.inventoryListCols =
		[
		    {field:"mlocation.locationNm", displayName:"ロケーション"},
		    {field:"mproduct.productCd", displayName:"商品CD"},
		    {field:"mproduct.janCd", displayName:"JANCD"},
		    {field:"mproduct.productNm", displayName:"商品名称"},
            {field:"storeNoId", displayName:"入庫No."},
            {field:"storeLabelNo", displayName:"入庫ラベルNo."},
            {field:"tstoreNo.mcustomer.customerCd", displayName:"仕入先名称CD"},
            {field:"tstoreNo.mcustomer.customerNm", displayName:"仕入先名称"},
            {field:"lot", displayName:"ロット"},
            {field:"limitDt", displayName:"期限日"},
            {field:"mcustomerByDepositId.customerCd ", displayName:"預託CD"},
            {field:"mcustomerByDepositId.customerNm", displayName:"預託名称"},
            {field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
            {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
            {field:"unitNum", displayName:"ケース入数"},
            {field:"chargeNum", displayName:"棚卸前引当可能数"},
            {field:"allocNum", displayName:"棚卸前引当済数"},
            {field:"moveNum", displayName:"棚卸前移動中数"},
            {field:"caseQtyB", displayName:"棚卸前ケース数"},
            {field:"pieceQtyB", displayName:"棚卸前ピース数"},
            {field:"inventoryNum", displayName:"棚卸数量"},
            {field:"caseQty", displayName:"棚卸ケース数"},
            {field:"pieceQty", displayName:"棚卸ピース数"},
            {field:"histAddUser", displayName:"入力者"},
            // [Ver3.0][$4727]「入力時間」を「入力日時」に変更 2018.06.15 matsumoto Start
            {field:"inputDt", displayName:"入力日時"},
            // [Ver3.0][$4727]「入力時間」を「入力日時」に変更 2018.06.15 matsumoto End
            {field:"bclassDtlByStockAdjustFlg.vdict.dictNm", displayName:"棚卸調整入力"},
			//荷主センタ変更対応 201７.02.14 sja Start
			{field:"tinventoryH.mclient.clientCd", displayName:"荷主ＣＤ"},
			{field:"tinventoryH.mclient.clientNm", displayName:"荷主名称"},
			{field:"tinventoryH.mcenter.centerCd", displayName:"センタＣＤ"},
			{field:"tinventoryH.mcenter.centerNm", displayName:"センタ名称"}
			//荷主センタ変更対応 201７.02.14 sja End
		];

	// 画面初期化処理
	$scope.initScreen = function() {
		//検索条件を表示状態に変更
		$scope.isopen = true;

		$scope.inventroyParcent = "0%";

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

		// [#4685][v3.0] ページングの削除 2018.06.06 kawana Start
//		2016.02.18 Zhang ページング ※3 Start

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'inventoryList',
			columnDefs: 'inventoryListCols',
			// [#6867][OSS] 行クリックで選択されない問題を修正 2019.11.19 kawana Start
			enableRowSelection: true
			// [#6867][OSS] 行クリックで選択されない問題を修正 2019.11.19 kawana End
		});
//		2016.02.18 Zhang ページング ※3 End
		// [#4685][v3.0] ページングの削除 2018.06.06 kawana End

			// [#6867][OSS] 行クリックで選択されない問題を修正($scope.gridOptions.selectWithCheckboxOnlynを削除) 2019.11.19 kawana Delete

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

		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース数関連処理削除 2018.01.15 honma Delete

		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 総数用colCdを定義
				"inventoryNum" : {
					// 複数荷姿用colCdを定義
					multiTextCd: "inventoryNumMultiText",
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "inventoryList.mproduct.mproductShapeList"
				}
		};
		$scope.gridMultiTextOptions = [];
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End

		//行追加
		directiveControl.editable($scope, 'addRow', false);
		//行削除
		directiveControl.editable($scope, 'removeRow', false);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	//荷主センタ変更対応 2017.03.07 sja Start
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
		$scope.deferredGetWarehouseCdList()
		.then(function(response){
			$scope.deferredGetZoneList()
			.then(function(response){
				setZoneList(response.data, false);
			});
		});
	};
	//荷主センタ変更対応 2017.03.07 sja End

	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetConditionList(),
				 $scope.deferredGetUnmatchList(),
				//荷主センタ変更対応 201７.02.14 sja Start
				 $scope.deferredGetWarehouseCdList()
				//荷主センタ変更対応 201７.02.14 sja End
				]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	//荷主センタ変更対応 201７.02.14 sja Start
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
	//荷主センタ変更対応 201７.02.14 sja End

	// 棚卸入力有データ取得
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_TAKING_INPUT";

		owsCommon.getDataCacheable(api.stockTakingInput, "keyValueList", request).then(function(response){
			$scope.stockTakingInputList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// アンマッチ有データ取得
	$scope.deferredGetUnmatchList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UNMATCH";

		owsCommon.getDataCacheable(api.stockTakingInput, "keyValueList", request).then(function(response){
			$scope.unmatchList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.inventoryInput.init().then(function(response){

			// [#4685][v3.0] ページングの削除 2018.06.06 kawana Delete

			$scope.conditionH = response.data.head;
			$scope.conditionB = response.data.body;
			$scope.conditionI = response.data.Inst;
			$scope.conditionH.mclient.clientCd = userInfo.clientCd;
			$scope.conditionH.mcenter.centerCd = userInfo.centerCd;
			$scope.conditionH.inventoryDt = userInfo.systemDt;
			$scope.inventoryList = response.data.bodyList;

			//空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;
			//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.08 衛 Start
			// 荷主変更後処理
			$scope.changeClient(true);
			//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.08 衛 End
			// 倉庫変更後処理
			$scope.changeWarehouse(false);

			//棚卸入力有を設定
			$scope.conditionI.stockTakingInput =  owsCommon.getDefaultValue($scope.stockTakingInputList);

			//アンマッチ有を設定
			$scope.conditionI.unmatch =  owsCommon.getDefaultValue($scope.unmatchList);


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.conditionB = owsHistory.popState();

				$scope.conditionI.mzone.zoneCd = $scope.conditionB.zoneCd;
				$scope.conditionI.fromLocationCd = $scope.conditionB.fromLocationCd;
				$scope.conditionI.toLocationCd = $scope.conditionB.toLocationCd;
				$scope.conditionI.stockTakingInput = $scope.conditionB.stockTakingInput;
				$scope.conditionI.unmatch = $scope.conditionB.unmatch;
				$scope.conditionH.mclient.clientCd = $scope.conditionB.tinventoryH.mclient.clientCd;
				$scope.conditionH.mcenter.centerCd = $scope.conditionB.tinventoryH.mcenter.centerCd;
				$scope.conditionH.inventoryDt = $scope.conditionB.tinventoryH.inventoryDt;
				//荷主センタ変更対応 2017.03.03 sja Start
				$scope.deferredGetWarehouseCdList();
				$scope.changeClient(true);
				//荷主センタ変更対応 2017.03.03 sja End
				$scope.search();
			}

			// [ON推-品向-1152] ページ設定の位置を変更(履歴検索のときにページ設定が不正になる問題を修正) 2016.04.26 kawana

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInput.object:InventoryInput#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.InventoryInput.object:InventoryInput
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

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#changeClient
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;
		//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.08 衛 Start
//		// 選択肢が一つの場合は一つ目を設定
//		if (clearSelected) {
//			$scope.conditionB.mcustomerByDepositId.customerCd = null;
//		}
		if (clearSelected) {
		// 選択肢が一つの場合は一つ目を設定
		if ($scope.depositStockTypeList.length == 1) {
		$scope.conditionB.mcustomerByDepositId.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
		}
		//[ON推-品向-489]「入力していた検索条件の預託在庫区分がクリアされていない。」に修正 2014.12.24 衛 Start
//		else {
//			$scope.conditionB.mcustomerByDepositId.customerCd = null;
//		}
	}
//		else {
//		$scope.conditionB.mcustomerByDepositId.customerCd = null;
//	}
		//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.08 衛 End
	};


	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.StockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
//		if (clearSelected) {
//			$scope.conditionB.mstockType.stockTypeCd = null;
//		}
		//[ON推-品向-489]「入力していた検索条件の預託在庫区分がクリアされていない。」に修正 2014.12.24 衛 End
	};
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

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
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
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#deferredGetZoneList
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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

		owsCommon.getDataCacheable(api.zone, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#changeWarehouse
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#productBlur
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.conditionB.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.conditionH.mclient.clientCd);
			request.productCd = productCd;

			$scope.conditionB.mproduct.productNm = null;

			api.product.record(request).then(function(response){
				$scope.conditionB.mproduct.productNm = response.data.mProduct.productNm;
				$scope.conditionB.mproduct.janCd = response.data.mProduct.janCd;
				$scope.conditionB.mproduct.productAbbr = response.data.mProduct.productAbbr;
			});

		} else {
			$scope.conditionB.mproduct.productNm = null;
			$scope.conditionB.mproduct.janCd = null;
			$scope.conditionB.mproduct.productAbbr = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#showProduct
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.conditionH.mclient.clientCd,
				productCd: $scope.conditionB.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.conditionB.mproduct.productCd =  selectedItem.productCd;
			$scope.conditionB.mproduct.productNm =  selectedItem.productNm;
			$scope.conditionB.mproduct.productAbbr =  selectedItem.productAbbr;
			$scope.conditionB.mproduct.janCd =  selectedItem.janCd;

		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#locationCdBlur
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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

			api.location.record(request).then(function(response){
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
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#showLocation
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInput.object:InventoryInput#addRow
	 * @methodOf oneslogiWms.InventoryInput.object:InventoryInput
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		var items = {
				//荷主センタ変更対応 2017.02.28 sja Start
				clientCd: $scope.inventoryList[0].tinventoryH.mclient.clientCd,
				centerCd: $scope.inventoryList[0].tinventoryH.mcenter.centerCd,
				// [#4705] 倉庫CDの指定を削除 2018.06.13 kawana Delete
				inventoryDt: $scope.conditionH.inventoryDt,
				//荷主センタ変更対応 2017.02.28 sja End
				// [#4705][v3.0] 入庫日管理をしない場合は行追加画面の入庫日を非活性にする 2018.06.13 kawana Start
				storeDtFlg: $scope.param.storeDtFlg
				// [#4705][v3.0] 入庫日管理をしない場合は行追加画面の入庫日を非活性にする 2018.06.13 kawana End
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalInventoryAddRow(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動(ここから削除) 2018.06.13 kawana Delete

			//棚卸ヘッダID
			$scope.blankRow.inventoryHId =  $scope.conditionH.inventoryHId;
			//荷主
			$scope.blankRow.tinventoryH.mclient.clientCd =  selectedItem.data.head.mclient.clientCd;
			//荷主センタ変更対応 201７.02.24 sja Start
			$scope.blankRow.tinventoryH.mclient.clientNm =  selectedItem.data.head.mclient.clientNm;
			//荷主センタ変更対応 201７.02.24 sja End
			//センタ
			$scope.blankRow.tinventoryH.mcenter.centerCd =  selectedItem.data.head.mcenter.centerCd;
			//荷主センタ変更対応 201７.02.24 sja Start
			$scope.blankRow.tinventoryH.mcenter.centerNm =  selectedItem.data.head.mcenter.centerNm;
			//荷主センタ変更対応 201７.02.24 sja End

			//ロケーションCD
			$scope.blankRow.mlocation.locationCd =  selectedItem.data.body.mlocation.locationCd;
			//ロケーション名称
			$scope.blankRow.mlocation.locationNm =  selectedItem.data.body.mlocation.locationNm;
			//ゾーン
			$scope.blankRow.mlocation.zoneId = selectedItem.data.body.mlocation.zoneId;
			//商品CD
			$scope.blankRow.mproduct.productCd = selectedItem.data.body.mproduct.productCd;
			//ＪＡＮCD
			$scope.blankRow.mproduct.janCd = selectedItem.data.body.mproduct.janCd;
			//商品名称
			$scope.blankRow.mproduct.productNm = selectedItem.data.body.mproduct.productNm;
			//入庫ラベルNo.
			$scope.blankRow.storeLabelNo = selectedItem.data.body.storeLabelNo;
			//入庫ラベルNo.
			$scope.blankRow.storeNoId = selectedItem.data.body.storeNoId;
			//仕入先CD
			//$scope.blankRow.tstoreNo.mcustomer.customerCd = selectedItem.data.body.tstoreNo.mcustomer.customerCd;
			$scope.blankRow.mcustomerBySupplierId.customerId = selectedItem.data.body.mcustomerBySupplierId.customerId;
			$scope.blankRow.mcustomerBySupplierId.customerCd = selectedItem.data.body.mcustomerBySupplierId.customerCd;
			//仕入先名称
			//$scope.blankRow.tstoreNo.mcustomer.customerNm = selectedItem.data.body.tstoreNo.mcustomer.customerNm;
			$scope.blankRow.mcustomerBySupplierId.customerNm = selectedItem.data.body.mcustomerBySupplierId.customerNm;
			//ロット
			$scope.blankRow.lot = selectedItem.data.body.lot;
			//期限日
			$scope.blankRow.limitDt = selectedItem.data.body.limitDt;
			//預託CD
			$scope.blankRow.mcustomerByDepositId.customerCd = selectedItem.data.body.mcustomerByDepositId.customerCd;
			//預託名称
			$scope.blankRow.mcustomerByDepositId.customerNm = selectedItem.data.body.mcustomerByDepositId.customerNm;
			//在庫区分CD
			$scope.blankRow.mstockType.stockTypeCd = selectedItem.data.body.mstockType.stockTypeCd;
			//在庫区分名称
			$scope.blankRow.mstockType.vdict.dictNm = selectedItem.data.body.mstockType.vdict.dictNm;
			// [Ver3.0] unit of measure対応 2017.12.4 潘 Del
			// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
			//入数内訳
			$scope.blankRow.unitNumBreakdown = selectedItem.data.body.unitNumBreakdown;
			// [Ver3.0] unit of measure対応 2017.12.4 潘 End
			//棚卸前在庫数
			$scope.blankRow.chargeNum = 0;
			//棚卸前引当済数
			$scope.blankRow.allocNum = 0;
			//棚卸前移動中数
			$scope.blankRow.moveNum = 0;
			// [Ver3.0] unit of measure対応 2017.12.4 潘 Del
			// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
			//棚卸前内訳
			$scope.blankRow.inventoryBeforeBreakdown = null;
			// [Ver3.0] unit of measure対応 2017.12.4 潘 End
			//棚卸数量
			$scope.blankRow.inventoryNum = selectedItem.data.body.inventoryNum;
			// [Ver3.0] unit of measure対応 2017.12.4 潘 Del
			// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
			$scope.blankRow.productUnit = selectedItem.data.body.mproduct.productUnit;
			// 商品マスト
			$scope.blankRow.mproduct = selectedItem.data.body.mproduct;

			// [Ver3.0] unit of measure対応 2017.12.4 潘 End
			//荷姿ID
			$scope.blankRow.shapeId = selectedItem.data.body.shapeId;
			//荷姿ID
			$scope.blankRow.stockAdjustFlg = 0;
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja Start
			//入庫日
			$scope.blankRow.storeDt = selectedItem.data.body.storeDt;
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.08 sja End
			//行追加
			$scope.addLastRow();

			// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.02.26 honma delete

			// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動(ここから削除) 2018.06.13 kawana Delete
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#addRow
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に行を追加する。
	 */
	$scope.addLastRow = function(){
		$scope.inventoryList.push(angular.copy($scope.blankRow));
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.02.26 honma Add Start
		// grid複数荷姿用各種オプション変数への行追加件数分設定共通処理
		gridMultiTextControl.addMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, 1);
		owsCommon.syncExec(function() {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			var row = $scope.inventoryList.length - 1;
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'inventoryNum',$scope.inventoryList[row].mproduct.productId, $scope.inventoryList[row].mproduct.mproductShapeList, row);
			// 該当行の荷姿補助内訳数取得
			owsCommon.getGridCalcAuxiliaryBreakdown($scope,$scope.inventoryList[row].inventoryNum, 'gridMultiTextOptions', 'inventoryNum', row);
		});
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.02.26 honma Add End
	};



	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#search
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){

		// [#4685][v3.0] ページングの削除 2018.06.06 kawana Start

		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;
		request.data.Inst = $scope.conditionI;

		api.inventoryInput.select(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);
		});

		// [#4685][v3.0] ページングの削除 2018.06.06 kawana End
	};

	// [#4685][v3.0] ページングの削除(getPagedDataAsyncメソッド削除) 2018.06.06 kawana Delete

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#setSearchData
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-339] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-339] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana Start
		$scope.param = response.data.param;
		// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana End

		//取得したデータをグリッドに表示
		$scope.inventoryList = response.data.bodyList;
		if (response.data.bodyList.length > 0 ){
			//行追加
			directiveControl.editable($scope, 'addRow', true);
			//行削除
			directiveControl.editable($scope, 'removeRow', true);
			//棚卸ヘッダID
			$scope.conditionH.inventoryHId = response.data.bodyList[0].inventoryHId;

			$scope.inventroyParcent = response.data.bodyList[0].inventroyParcent + "%";
		}else{
			//行追加
			directiveControl.editable($scope, 'addRow', false);
			//行削除
			directiveControl.editable($scope, 'removeRow', false);

			$scope.inventroyParcent = "0%"
		}

		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
		// grid複数荷姿用各種オプション変数への検索データ件数分設定共通処理
		gridMultiTextControl.setMultiTextOptionsListInit($scope, 'gridMultiTextOptions', $scope.multiTextOptions, response.data.bodyList.length);
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End
		// [#5756][v3.1] 再検索で行が増えると数量の単位が表示されない問題を修正 2018.12.19 kawana Start
		owsCommon.syncExec(function() {
		// [#5756][v3.1] 再検索で行が増えると数量の単位が表示されない問題を修正 2018.12.19 kawana End
			for (var row = 0; row < response.data.bodyList.length; row++) {

				// [#4422] gridMultiTextControl.setMultiTextの処理順序を項目非活性処理より前に変更 2018.04.13 kawana Start

				// [#2799][Ver3.0] unit of measure 対応 2017.11.13 han Start
				// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'inventoryNum', response.data.bodyList[row].mproduct.productId, response.data.bodyList[row].mproduct.mproductShapeList, row);
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope,response.data.bodyList[row].inventoryNum, 'gridMultiTextOptions', 'inventoryNum', row);
				// [#2799][Ver3.0] unit of measure 対応 2017.11.13 han End

				// [#4422] gridMultiTextControl.setMultiTextの処理順序を項目非活性処理より前に変更 2018.04.13 kawana End

				if (response.data.bodyList[row].stockAdjustFlg == "1"){
					gridDirectiveControl.editable($scope.gridOptions, 'inventoryNum', false, row);
					// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース数関連処理削除 2018.01.15 honma Delete
					// [#2799][Ver3.0] unit of measure 対応 2017.12.22 han Start
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
					for (var i = 0; i < 4; i++) {
						// 編集可否処理IDの作成
						var wkMultiTextCd = "inventoryNumMultiText" + (i + 1);
						gridDirectiveControl.editable($scope.gridOptions, wkMultiTextCd, false, row);
					}
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
					// [#2799][Ver3.0] unit of measure 対応 2017.12.22 han End
				}

				// [#4422] gridMultiTextControl.setMultiTextの処理順序を項目非活性処理より前に変更 2018.04.13 kawana Delete
			}
		// [#5756][v3.1] 再検索で行が増えると数量の単位が表示されない問題を修正 2018.12.19 kawana Start
		});
		// [#5756][v3.1] 再検索で行が増えると数量の単位が表示されない問題を修正 2018.12.19 kawana End

		//検索条件を履歴に保存
		$scope.conditionB.zoneCd = $scope.conditionI.mzone.zoneCd;
		$scope.conditionB.fromLocationCd = $scope.conditionI.fromLocationCd;
		$scope.conditionB.toLocationCd = $scope.conditionI.toLocationCd;
		$scope.conditionB.stockTakingInput = $scope.conditionI.stockTakingInput;
		$scope.conditionB.unmatch = $scope.conditionI.unmatch;
		$scope.conditionB.tinventoryH.mclient.clientCd = $scope.conditionH.mclient.clientCd;
		$scope.conditionB.tinventoryH.mcenter.centerCd = $scope.conditionH.mcenter.centerCd;
		$scope.conditionB.tinventoryH.inventoryDt = $scope.conditionH.inventoryDt;

		// [#4685][v3.0] ページングの削除(totalServerItems設定処理を削除) 2018.06.06 kawana Delete

		owsHistory.replaceState($scope.conditionB);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#excelOutput
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;
		request.data.Inst = $scope.conditionI;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "bodyList", document.title);

		api.inventoryInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#gridDblClick
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("stockAdjust", row);
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
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		// 登録済データチェック
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {

			// [#2049] 不要な判定を削除 2017.07.05 kawana Start

			if (row.inventoryBId != null) {
				i += 1;
				return;
			}

			// [#2049] 不要な判定を削除 2017.07.05 kawana End
		});

		if (i > 0){
			// 登録済データありエラー
			alertMessage.setErrorMessageByCode("cannotSelectExceptAddedDataError");
			return;
		}

		// [#2049] 1行のみ選択している場合も確認メッセージを表示 2017.07.05 kawana Start

		// 削除確認
		if (!owsCommon.viewConfirm("confirmDeleteRow")) {
			return;
		}

		// [#2049] 1行のみ選択している場合も確認メッセージを表示 2017.07.05 kawana End

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.inventoryList.indexOf(row) > -1) {
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.02.26 honma Mod Start
				var targetIndex = $scope.inventoryList.indexOf(row);
				$scope.inventoryList.splice(targetIndex, 1);
				// grid複数荷姿用各種オプション変数への行削除件数分設定共通処理
				gridMultiTextControl.removeMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, targetIndex);
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.02.26 honma Mod End
			}
		});

		// [ON推-品向-583] 明細 ヘッダー行の選択 2015.05.20 ki Start
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細 ヘッダー行の選択 2015.05.20 ki End
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
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#tockAdjust
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 在庫調整ボタン押下処理<br>
	 *
	 */
	$scope.stockAdjust = function(row){



//		var inventoryNum = $scope.inventoryList[rowIndex].inventoryNum;
//		var inventoryNum=$scope.gridOptions.gridApi.selection.getSelectedRows()[0].inventoryBNum;
//		if (inventoryNum=109983) {
//			alertMessage.setErrorMessageByCode("lineNotSelectErrors");
//			return
//		}

		// 行が選択されていない場合、エラーメッセージを表示
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}


		// 複数行の場合に警告
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			if (!alertMessage.setErrorMessageByCode("onlyOneSelect")) {
				return;
			}
		}

		// 選択されている行が追加行の場合、エラーメッセージを表示
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.inventoryList.indexOf(row) > -1) {
				if (row.inventoryBId == null) {
					i += 1;
					return;
				}
			}
		});
		if (i > 0){
			owsCommon.viewAlert("stockAdjustmentCannotExecuteNotRegisteredError");
			return;
		}

		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].inputDt == null || $scope.gridOptions.gridApi.selection.getSelectedRows()[0].inputDt == ""){
			owsCommon.viewAlert("stockAdjustmentCannotExecuteResultQtyNotRegisteredError");
			return;
		}

		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].stockAdjustFlg == "1"){
			alertMessage.setErrorMessageByCode("inventoryAllCompleteStockUpdateError");
			return;
		}

		// [#6933][OSS] 数量を空にしてから棚卸調整するとコンソールエラー発生 2020.11.24 kawana Start
		// ※ 2020/11/24 棚卸数＝０で登録したデータが在庫調整できない不具合が発覚したので再修正
		// 棚卸数量の変更あり
		var inventoryNum = $scope.gridOptions.gridApi.selection.getSelectedRows()[0].inventoryNum;
		if (inventoryNum == null  || owsCommon.isNotEqual(inventoryNum, $scope.gridOptions.gridApi.selection.getSelectedRows()[0].oldInventoryNum)) {
			// 棚卸数量の変更あり
			owsCommon.viewAlert("stockAdjustmentCannotExecuteResultQtyNotRegisteredError");
			return;
		}
		// [#6933][OSS] 数量を空にしてから棚卸調整するとコンソールエラー発生 2020.11.24 kawana End

		//[検査-145]「棚卸で差異の無いデータは在庫調整画面に移動できないようチェック処理を追加し、エラーメッセージ表示するよう」に修正 2014.12.02 衛 Start
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			// [ON推-品向-407] 棚卸作成時の在庫数と棚卸数が違ったらの条件に変更 2014.12.04 koseki Start
			if (owsCommon.isNotEqual(row.inventoryNum, row.chargeNum)) {
				$scope.gridOptions.gridApi.selection.getSelectedRows()

				// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
			    //修正画面へ遷移
				$location.path("wms/stock/StockAdj").search({}).search("mode", SCREEN_MODE.Update)
				.search("stockId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].stockId)
				.search("inventoryId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].inventoryBId)
				//荷主センタ変更対応 201７.03.01 sja Start
				.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].tinventoryH.mclient.clientCd);
				//荷主センタ変更対応 201７.03.01 sja End
				// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

				// [#3531][Ver3.0] PC棚卸入力 - 「在庫調整」ボタン押下後の在庫調整画面遷移時に開発者ツールのコンソールエラー発生 画面初期化処理削除 2018.01.22 honma Mod Delete
			}else{
			// [ON推-品向-482] 差異が無い商品は更新できません」が表示される 2014.12.24 衛 Start
				alertMessage.setErrorMessageByCode("inventoryAllNoDiffStockUpdateError");
			}
			// [ON推-品向-407] 棚卸作成時の在庫数と棚卸数が違ったらの条件に変更 2014.12.04 koseki End
			// [ON推-品向-482] 差異が無い商品は更新できません」が表示される 2014.12.24 衛 End
		});
		//[検査-145]「棚卸で差異の無いデータは在庫調整画面に移動できないようチェック処理を追加し、エラーメッセージ表示するよう」に修正 2014.12.02 衛 End
	};

	// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース数関連処理削除 2018.01.15 honma Delete

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#register
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
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

		// 空行判定
		if ( $scope.inventoryList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.inputform.$invalid;

				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				var isCheckDecimalError = false;
				var decimalErrorIndex;
				for (var rowIndex = 0; rowIndex < $scope.inventoryList.length; rowIndex++) {
					// 小数有無チェック共通処理
					isCheckDecimalError = gridMultiTextControl.checkDecimalInput($scope, $scope.inventoryList[rowIndex].inventoryNum, $scope.gridOptions, 'gridMultiTextOptions', 'inventoryNum', rowIndex);
					if (isCheckDecimalError) {
						decimalErrorIndex = rowIndex;
						break;
					}
				}
				if (isCheckDecimalError) {
					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, decimalErrorIndex);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

				// [ON推-品向-859] 不要な処理を削除 2015.07.07 kawana

				// 登録ボタンを押すと、確認メッセージ、登録処理になる。
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.bodyList = $scope.inventoryList;

				// 入力された予定数チェック
				var j = 0;
				var errAry = new Array();
				// [#7216][OSS] 0～9の正規表現チェックのエラーメッセージを数値のみ⇒数字のみに変更 2020.03.18 kawana Start
				// 棚卸数は数値なので「数値のみ」エラーにメッセージCD変更
				var err = "numberError";
				// [#7216][OSS] 0～9の正規表現チェックのエラーメッセージを数値のみ⇒数字のみに変更 2020.03.18 kawana End

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
				var firstErrIndex;
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
				for (var row = 0; row < $scope.inventoryList.length; row++) {
					var inventoryNum = $scope.inventoryList[row].inventoryNum;
					// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース数関連処理削除 2018.01.15 honma Delete
					if (inventoryNum && owsCommon.isNegative(inventoryNum) ){
						errAry.length ++;
						if (!gridOptionMessageControl.isShow($scope.gridOptions, "inventoryNum", row)) {
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "inventoryNum", row)) {
								gridOptionMessageControl.show($scope.gridOptions, "inventoryNum", $filter('owfMessage')((2, err)), row);
								// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
//								directiveControl.firstErrorOnFocus('inputform');
								if (!firstErrIndex) {

									// 現在の行を最初のエラー行に設定
									firstErrIndex = row;
								}
								// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
							}
						}
					}
					// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース数関連処理削除 2018.01.15 honma Delete
				}

				if (0 < errAry.length) {
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstErrIndex);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('inputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
					return;
				}

				// 棚卸データ追加・更新処理を行う。
				api.inventoryInput.register(request).then(function(response){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
						return;
					}

					$scope.search();
				});
			});

			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start

			// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);