/**
 * @ngdoc overview
 * @name oneslogiWms.LocationMaster
 *
 * @description ロケーションマスタメンテナンス画面
 */
angular.module('oneslogiWms.LocationMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.LocationMaster.service:locationMasterApi
 *
 * @description ロケーションマスタメンテナンスWebApi定義<br>
 *              ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 *              ・resources/master/locationMasterList/init 初期化用WebApi<br>
 *              ・resources/master/locationMasterList/search 検索用WebApi<br>
 *              ・resources/master/locationMasterList/inputCheck 入力チェック用WebApi<br>
 *              ・resources/master/locationMasterList/register 登録用WebApi<br>
 *
 */
.factory('locationMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		zoneList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		wareHouseList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		locationList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/locationMasterList/init'],
				 ['fileUpload',  'POST',  'resources/master/locationMasterList/fileUpload'],
				 ['search', 'GET', 'resources/master/locationMasterList/search'],
				 ['excel',  'GET', 'resources/master/locationMasterList/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/master/locationMasterList/inputCheck'],
				 ['register', 'POST', 'resources/master/locationMasterList/register'],
				 ['getMasterData', 'GET', 'resources/master/locationMasterList/getMasterData']
				 ]
		),
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		shapeCdList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/shapeCD/query'],
				 ]
		),
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

		// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa Start
		ProductBlur: AngularAPIClient.make(//商品CDのロストフォーカス処理
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		)
		// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.LocationMaster.object:LocationMaster
 *
 * @description ロケーションマスタメンテナンス画面コントローラ
 */
.controller('LocationMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'locationMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.locationListCols =
		[
		 {field:"locationCd", displayName:"ロケーションCD"},
		 {field:"locationNm", displayName:"ロケーション名称"},
		 {field:"mzone.mwarehouse.warehouseCd", displayName:"倉庫"},
		 {field:"mzone.zoneCd", displayName:"ゾーン"},
		 {field:"locationType", displayName:"ロケーション種別"},
		 {field:"pickingLocationFlg", displayName:"ピックロケフラグ"},
		 {field:"allocNgFlg", displayName:"引当禁止フラグ"},
		 {field:"pickingOrder", displayName:"ピッキング順序"},
		 {field:"allocOrder", displayName:"引当順序"},
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		 {field:"mproduct.productCd", displayName:"補充商品"},
		 {field:"mproduct.productNm", displayName:"補充点名称"},
		 {field:"mproductShapeByReplenishPProductShapeId.mshape.shapeCd", displayName:"補充点荷姿"},
		 {field:"replenishPNum", displayName:"補充点"},
		 {field:"mproductShapeByMaxStoreProductShapeId.mshape.shapeCd", displayName:"最大格納数商品荷姿"},
		 {field:"maxStoreNum", displayName:"最大格納数"},
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
		 {field:"delFlg", displayName:"削除フラグ"}
		 ];
	var oldwarehouse;
	 // [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示(不要な処理の削除) 2015.06.24 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#initScreen
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 画面初期化処理<br>
	 *              ・検索条件枠を開いた状態に設定<br>
	 *              ・グリッド設定<br>
	 *              ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {



		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		$scope.deferredGetWarehouseCd();
		// 倉庫変更の監視設定（フォーカス時）
		$scope.warehouseFocus = function() {
			oldwarehouse = $scope.mLocationSearch.mzone.mwarehouse.warehouseCd;
		};

		// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana Start
		// センタ変更の監視設定（選択内容変更時）
		$scope.centerChange = function() {

			$scope.mLocationSearch.mzone.mwarehouse.warehouseCd = null;
			$scope.mLocationSearch.mzone.zoneCd = null;

			$scope.warehouseList = null;
			$scope.zoneCdList = null;

			// 倉庫リストとゾーンリストの作成
			//荷主センタ変更対応 2017.03.08 sja Start

			$scope.deferredGetWarehouseCd().then(function(response){
				setZoneListMap().then(function(){
					$scope.warehouseChange();
				});
				//setZoneListMap();
			});
			//荷主センタ変更対応 2017.03.08 sja Start

		};

		// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana End

		// 倉庫変更の監視設定（選択内容変更時）
		$scope.warehouseChange = function() {

			// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana Start
			$scope.mLocationSearch.mzone.zoneCd = null;
			// ゾーンリスト変更
			$scope.setZoneList();
			// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana End
		};

		// 倉庫変更の監視設定（ロストフォーカス時）
		$scope.warehouseBlur = function() {
			if (oldwarehouse != $scope.mLocationSearch.mzone.mwarehouse.warehouseCd) {

				// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana Start
				$scope.mLocationSearch.mzone.zoneCd = null;
				// ゾーンリスト変更
				$scope.setZoneList();
				// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana End
			}
		};
//		2016.02.18 Pan ページング ※3 Start
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
//		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'locationList',
			columnDefs: 'locationListCols',
			pagingOptions : $scope.pagingOptions
		});
//		2016.02.18 Pan ページング ※3 End

		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		// グリッドの商品コード、ロケーション列にボタンを設定
//		$scope.gridButtonOptions = {
//				"mproduct.productCd":{
//					clickFunction:"showProduct(row.rowIndex)"
//				}
//		};
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End


		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		//[ON推-品向-293]明細の(削除、ゾーン、ロケーション種別、ピックロケフラグ、引当禁止フラグ)ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
//		$scope.gridSelectOptions = {
//				"mzone.mwarehouse.warehouseCd" : {
//					key : "warehouseCd",
//					value : "warehouseNm",
//					listModel : "warehouseList"
//				},
//				"locationType" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "locationTypeList",
//					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
//				},
//				"allocNgFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocNgFlgList",
//					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
//				},
//				"delFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "delFlgList",
//					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
//					// [新WMS-110-004] 削除フラグの空の選択肢を削除 2015.07.14 kawana Start
//					removeBlank: "null"
//					// [新WMS-110-004] 削除フラグの空の選択肢を削除 2015.07.14 kawana End
//				},
//				"pickingLocationFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "dictNmList",
//					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
//				},
//				"mzone.zoneCd" : {
//					key : "zoneCd",
//					value : "zoneNm",
//					// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana Start
//					listModel : "setGridZoneList(row.rowIndex)",
//					// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana End
//					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
//				},
//				//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
//				"mproductShapeByReplenishPProductShapeId.mshape.shapeCd" : {
//					key : "shapeCd",
//					value : "shapeNm",
//					listModel : "shapeList",
//				},
//				"mproductShapeByMaxStoreProductShapeId.mshape.shapeCd" : {
//					key : "shapeCd",
//					value : "shapeNm",
//					listModel : "shapeList",
//				}
//				//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
//		};
		//[ON推-品向-293]明細の(削除、ゾーン、ロケーション種別、ピックロケフラグ、引当禁止フラグ)ドロップダウンリストにスペースは不要 2014.11.28 衛 End

		// グリッドの倉庫名称列にロストフォーカスイベントを設定
//		$scope.gridEventOptions = {
//				"locationCd":{
//					"ng-blur":{
//						eventFunction:"locationCdBlur(row.rowIndex)"},
//						"ng-change":{
//							eventFunction:"locationCdBlu(row.rowIndex)"
//						}
//				},
//				"mzone.zoneCd":{
//					"ng-change":{
//						eventFunction:"zoneCdChange(row.rowIndex)"
//					}
//				},
//				"locationNm":{
//					"ng-change":{
//						eventFunction:"locationNmBlur(row.rowIndex)"
//					}
//				},
//				"mzone.mwarehouse.warehouseCd":{
//					"ng-change":{
//						eventFunction:"warehouseCdChange(row.rowIndex)"
//					}
//				},
//				"locationType":{
//					"ng-change":{
//						eventFunction:"locationTypeBlur(row.rowIndex)"
//					}
//				},
//				"pickingLocationFlg":{
//					"ng-change":{
//						eventFunction:"dictNmBlur(row.rowIndex)"
//					}
//				},
//				"allocNgFlg":{
//					"ng-change":{
//						eventFunction:"allocNgFlgBlur(row.rowIndex)"
//					}
//				},
//				"pickingOrder":{
//					"ng-change":{
//						eventFunction:"pickingOrderBlur(row.rowIndex)"
//					}
//				},
//				"allocOrder":{
//					"ng-change":{
//						eventFunction:"allocOrderBlur(row.rowIndex)"
//					}
//				},
//				"delFlg":{
//					"ng-change":{
//						eventFunction:"delFlgBlur(row.rowIndex)"
//					}
//				},
//				//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
//				"mproduct.productCd":{
//					"ng-blur":{
//						eventFunction:"productCdBlur(row.rowIndex)"
//					},
//					"ng-change":{
//						eventFunction:"productCdChange(row.rowIndex)"
//					   }
//					},
//				"mproductShapeByReplenishPProductShapeId.mshape.shapeCd":{
//					"ng-change":{
//						eventFunction:"productShapeBlur(row.rowIndex)"
//					}
//				},
//				"replenishPNum":{
//					"ng-change":{
//						eventFunction:"productreplenishPNumBlur(row.rowIndex)"
//					}
//				},
//				"mproductShapeByMaxStoreProductShapeId.mshape.shapeCd":{
//					"ng-change":{
//						eventFunction:"productmaxstoreShapeBlur(row.rowIndex)"
//					}
//				},
//				"maxStoreNum":{
//					"ng-change":{
//						eventFunction:"productmaxStoreNumBlur(row.rowIndex)"
//					}
//				}
//				//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
//		};
		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "body");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(xls|xlsx)$/i,
				formData : uploadParam
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "locationCd",7,3 );
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "locationNm",7,8 );
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mzone.zoneCd",7,9 );

		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mproduct.productCd",7,10 );
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mproductShapeByReplenishPProductShapeId.mshape.shapeCd",7,11 );
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mproductShapeByMaxStoreProductShapeId.mshape.shapeCd",7,12 );
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#initScreenHttp
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *              ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		// 各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetPickingLocationFlg(),
				 $scope.deferredGetLocationType(),
				 $scope.deferredGetAllocNgFlg(),
				 // [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示(不要な処理の削除) 2015.06.24 kawana
				 $scope.deferredGetWarehouseCd(),
				 $scope.deferredGetDictNm(),
				 //[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
				 $scope.deferredGetMaxShapeCd(),
				//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
				 // [1.1.4-CT-061] 検索条件に補充商品未設定を追加 2016.06.03 ichikawa Start
				 $scope.deferredGetReplenishProductCdUnset()
				 // [1.1.4-CT-061] 検索条件に補充商品未設定を追加 2016.06.03 ichikawa End
				 ])
				 // 全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
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
//	$scope.locationCdBlur = function(rowIndex) {
//		// 入力されたロケーションCDを取得
//		var locationCd = $scope.locationList[rowIndex].locationCd;
//		// ロケーション名称を取得
//		var locationNm = $scope.locationList[rowIndex].locationNm;
//
//		if (locationCd && 0 < locationCd.length) {
//			if (locationNm && 0 < locationNm.length) {
//				return;
//			}else{
//				$scope.locationList[rowIndex].locationNm = locationCd;
//			}
//		}
//	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#warehouseNmBlur
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description ゾーンCDロストフォーカス処理<br>
	 *
	 * ゾーン選択時にゾーンに紐付く倉庫をコンボに設定。
	 */
//	$scope.zoneCdChange = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//
//	$scope.locationCdBlu = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.locationNmBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.warehouseCdChange = function(rowIndex) {
//
//	// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana Start
//	// ゾーン選択状態をクリア
//	$scope.locationList[rowIndex].mzone.zoneCd = null;
//	// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana End
//
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.locationTypeBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.dictNmBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
//		// 入力されたロケーションCDを取得
//		var pickingLocationFlg = $scope.locationList[rowIndex].pickingLocationFlg;
//
//		if (pickingLocationFlg == "1") {
//			gridDirectiveControl.editable($scope.gridOptions, 'mproduct.productCd', true, rowIndex);
//		}else{
//			gridOptionMessageControl.hide($scope.gridOptions,"mproduct.productCd",rowIndex);
//			gridOptionMessageControl.hide($scope.gridOptions,"mproductShapeByReplenishPProductShapeId.mshape.shapeCd",rowIndex);
//			gridOptionMessageControl.hide($scope.gridOptions,"mproductShapeByMaxStoreProductShapeId.mshape.shapeCd",rowIndex);
//			if($scope.locationList[rowIndex].mproduct != null){
//				$scope.locationList[rowIndex].mproduct.productCd = null;
//				$scope.locationList[rowIndex].mproduct.productNm = null;
//			}
//			if($scope.locationList[rowIndex].mproductShapeByReplenishPProductShapeId != null){
//				$scope.locationList[rowIndex].mproductShapeByReplenishPProductShapeId.mshape.shapeCd = null;
//			}
//			$scope.locationList[rowIndex].replenishPNum = null;
//			if($scope.locationList[rowIndex].mproductShapeByMaxStoreProductShapeId != null){
//				$scope.locationList[rowIndex].mproductShapeByMaxStoreProductShapeId.mshape.shapeCd = null;
//			}
//			$scope.locationList[rowIndex].maxStoreNum = null;
//			gridDirectiveControl.editable($scope.gridOptions, 'mproduct.productCd', false, rowIndex);
//			gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', false, rowIndex);
//			gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', false, rowIndex);
//			gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', false, rowIndex);
//			gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', false, rowIndex);
//
//		}
//		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
//	};
//	$scope.allocNgFlgBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.pickingOrderBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.allocOrderBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.delFlgBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
//	$scope.productCdChange = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.productShapeBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.productreplenishPNumBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.productmaxstoreShapeBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//	$scope.productmaxStoreNumBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 削除フラグ取得・設定処理（同期可能）<br>
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

	$scope.deferredGetDictNm = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PICKING_LOCATION_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.dictNmList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetForeignFlg
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.pickingLocationFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetForeignFlg
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description ピックロケフラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseCd = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerId =userInfo.centerId;

		// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana Start
		if($scope.mLocationSearch) {
			request.centerId = userInfo.centerIdByCd($scope.mLocationSearch.mcenter.centerCd);
		}
		// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana End

		owsCommon.getDataCacheable(api.wareHouseList, request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetForeignFlg
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.locationTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetForeignFlg
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.allocNgFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetReplenishProductCdUnset
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 補充商品CD未設定取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReplenishProductCdUnset = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REPLENISH_PRODUCT_CD_UNSET";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.replenishProductCdUnsetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa End

	// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示(不要な処理の削除) 2015.06.24 kawana

	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetMaxShapeCd
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 補充点商品荷姿IDと最大格納数商品荷姿ID取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMaxShapeCd = function () {
		var deferred = $q.defer();
		var request = {};
		request.clientCd =userInfo.clientCd;

		owsCommon.getDataCacheable(api.shapeCdList, request).then(function(response){
			$scope.shapeList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};
	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#excelOutput
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.mLocationSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.locationList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#deferredGetInitData
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 倉庫マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.locationList.init().then(function(response){
			$scope.mLocationSearch = response.data.head;

			$scope.locationList = response.data.body;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.mLocationSearch.mcenter.centerCd = userInfo.centerCd;
			$scope.mLocationSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

//			2016.02.18 Pan ページング ※3 Start
			$scope.paging = response.paging;
			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

//			2016.02.18 Pan ページング ※3 End

			// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana Start
			// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana Start
			// ゾーンリスト作成
			setZoneListMap().then(function(){
				$scope.setZoneList();
			});
			// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana End
			// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.29 kawana End

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.mLocationSearch = owsHistory.popState();
				//荷主センタ変更対応 2017.03.09 sja Start
				$scope.centerChange();
				//荷主センタ変更対応 2017.03.09 sja End
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};


	// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana Start

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
		var centerCd = $scope.mLocationSearch.mcenter.centerCd;
		if (!centerCd) {
			return;
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

		var centerCd = $scope.mLocationSearch.mcenter.centerCd;
		if (!centerCd) {
			$scope.zoneCdList = null;
			return;
		}

		var warehouseCd = $scope.mLocationSearch.mzone.mwarehouse.warehouseCd;
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

		var centerCd = $scope.mLocationSearch.mcenter.centerCd;

		// 検索したロケーションの場合は登録されているセンタCDを使用
		if ($scope.locationList[rowIndex].centerId) {
			centerCd = userInfo.centerCdById($scope.locationList[rowIndex].centerId);
		}

		if (!centerCd) {
			return null;
		}

		var warehouseCd = $scope.locationList[rowIndex].mzone.mwarehouse.warehouseCd;
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

	// [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示 2015.06.24 kawana End



	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#search
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 検索ボタン押下処理<br>
	 *              ・検索処理呼び出し
	 */
	$scope.search = function(){
//		2016.02.18 Pan ページング ※3 Start
//		$scope.getSearchData();
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
//		2016.02.18 Pan ページング ※3 End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#getSearchData
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.mLocationSearch;

		api.locationList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchinputform');
			$scope.setSearchData(response);
		});
	};

	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMaster#productBlur
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 商品コードのロストフォーカス処理<br>
//	 *
//	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
//	 */
//	$scope.productCdBlur = function(rowIndex) {
//		// 入力された商品コードを取得
//		var productCd = $scope.locationList[rowIndex].mproduct.productCd;
//
//		if (productCd && 0 < productCd.length) {
//			var request = {};
//			request.clientId = userInfo.clientId;
//			request.productCd = productCd;
//
//			api.product.record(request).then(function(response){
//
//				if (response.data.mProduct.productId == null){
//					gridOptionMessageControl.show($scope.gridOptions, "mproduct.productCd", $filter('owfMessage')("productNotFoundError"), rowIndex);
//					gridOptionMessageControl.hide($scope.gridOptions,"mproductShapeByReplenishPProductShapeId.mshape.shapeCd",rowIndex);
//					gridOptionMessageControl.hide($scope.gridOptions,"mproductShapeByMaxStoreProductShapeId.mshape.shapeCd",rowIndex);
//					// 商品の在庫関連情報の入力可否制御
//					$scope.locationList[rowIndex].mproduct.productNm = null;
//					if($scope.locationList[rowIndex].mproductShapeByReplenishPProductShapeId != null){
//						$scope.locationList[rowIndex].mproductShapeByReplenishPProductShapeId.mshape.shapeCd = null;
//					}
//					$scope.locationList[rowIndex].replenishPNum = null;
//					if($scope.locationList[rowIndex].mproductShapeByMaxStoreProductShapeId != null ){
//						$scope.locationList[rowIndex].mproductShapeByMaxStoreProductShapeId.mshape.shapeCd = null;
//					}
//					$scope.locationList[rowIndex].maxStoreNum = null;
//					gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', false, rowIndex);
//					gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', false, rowIndex);
//					gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', false, rowIndex);
//					gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', false, rowIndex);
//					return;
//				}
//				gridOptionMessageControl.hide($scope.gridOptions,"mproduct.productCd",rowIndex);
//
//				// 商品の在庫関連情報の入力可否制御
//				$scope.locationList[rowIndex].mproduct.productNm = response.data.mProduct.productNm;
//				gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', true, rowIndex);
//				gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', true, rowIndex);
//				gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', true, rowIndex);
//				gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', true, rowIndex);
//			});
//		} else {
//			gridOptionMessageControl.hide($scope.gridOptions,"mproductShapeByReplenishPProductShapeId.mshape.shapeCd",rowIndex);
//			gridOptionMessageControl.hide($scope.gridOptions,"mproductShapeByMaxStoreProductShapeId.mshape.shapeCd",rowIndex);
//			$scope.locationList[rowIndex].mproduct.productNm = null;
//			if($scope.locationList[rowIndex].mproductShapeByReplenishPProductShapeId != null){
//				$scope.locationList[rowIndex].mproductShapeByReplenishPProductShapeId.mshape.shapeCd = null;
//			}
//			$scope.locationList[rowIndex].replenishPNum = null;
//			if($scope.locationList[rowIndex].mproductShapeByMaxStoreProductShapeId != null){
//				$scope.locationList[rowIndex].mproductShapeByMaxStoreProductShapeId.mshape.shapeCd = null;
//			}
//			$scope.locationList[rowIndex].maxStoreNum = null;
//			gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', false, rowIndex);
//			gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', false, rowIndex);
//			gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', false, rowIndex);
//			gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', false, rowIndex);
//		}
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.LocationMaster.object:LocationMaster#showProduct
//	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
//	 *
//	 * @description
//	 * 商品コード検索ボタン押下処理<br>
//	 *
//	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
//	 */
//	$scope.showProduct = function(rowIndex){
//		var items = {
//				clientCd: userInfo.clientCd,
//				productCd: $scope.locationList[rowIndex].mproduct.productCd
//		};
//
//		// 商品マスタのモーダル画面を表示
//		var modalInstance = modalFactory.modalProduct(items);
//
//		// モーダル画面が閉じられたら呼ばれるファンクションの登録
//		modalInstance.result.then(function(selectedItem){
//			$scope.locationList[rowIndex].mproduct.productCd =  selectedItem.productCd;
//			$scope.locationList[rowIndex].mproduct.productNm =  selectedItem.productNm;
//		});
//	};
	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#setSearchData
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		// 選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-345] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-345] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		// [ON推-品向-925] 前回の検索結果と異なる倉庫が検索された行のゾーンが表示されない問題を修正 2015.07.29 kawana Start
		// グリッドを一度空にしてから表示
		// ※IEにて前回の検索と異なる倉庫で同じゾーンCDが存在する行でゾーンCDが表示されない問題があるため
		// 例：最初の検索で10行目に「倉庫２」「ゾーン１」のロケーションが検索された。
		//     検索条件を変更し検索すると10行目に「倉庫１」「ゾーン１」のロケーションが検索されたが「ゾーン１」が未選択状態となる場合がある。

		// [#6891][OSS] 一瞬Showing Itemsが表示されるのを修正 2019.11.26 tsuboi Strat
//		$scope.locationList = {};
		// [#6891][OSS] 一瞬Showing Itemsが表示されるのを修正 2019.11.26 tsuboi End

		owsCommon.syncExec(function() {
			// 取得したデータをグリッドに表示
			$scope.locationList = response.data.body;

			//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
//			for (var row = 0; row < $scope.locationList.length; row++) {
//				//補充項目が変更不可
//				if ($scope.locationList[row].pickingLocationFlg != "1"){
//					gridDirectiveControl.editable($scope.gridOptions, 'mproduct.productCd', false, row);
//				}else{
//					gridDirectiveControl.editable($scope.gridOptions, 'mproduct.productCd', true, row);
//				}
//				if ($scope.locationList[row].mproduct.productCd == null){
//					gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', false, row);
//					gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', false, row);
//					gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', false, row);
//					gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', false, row);
//				}else{
//					gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', true, row);
//					gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', true, row);
//					gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', true, row);
//					gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', true, row);
//				}
//			}
			//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
		});
		// [ON推-品向-925] 前回の検索結果と異なる倉庫が検索された行のゾーンが表示されない問題を修正 2015.07.29 kawana End

//		gridDirectiveControl.editable($scope.gridOptions, 'mzone.mwarehouse.warehouseCd', false);

//		for (var row = 0; row < $scope.locationList.length; row++) {
//
//			//既存行のキー項目が変更不可
//			if ($scope.locationList[row].locationId != null){
//				gridDirectiveControl.editable($scope.gridOptions, 'locationCd', false, row);
//			}
//		}

//		2016.02.18 Pan ページング ※3 Start
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
//		2016.02.18 Pan ページング ※3 End

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.mLocationSearch);
//		owsHistory.replaceState($scope.mWarehouseSearch);
//		owsHistory.replaceState($scope.mMZoneSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#getClassForRow
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * ロケーションマスタステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#addRow
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		$scope.locationList.push(angular.copy($scope.blankRow));
		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.locationList.length-1);
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		gridDirectiveControl.editable($scope.gridOptions, 'mproduct.productCd', false, $scope.locationList.length-1);
		gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', false, $scope.locationList.length-1);
		gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', false, $scope.locationList.length-1);
		gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', false, $scope.locationList.length-1);
		gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', false, $scope.locationList.length-1);
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

		// 行番号振り直し
		updateRowNumber($scope.locationList);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#removeRow
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		// 選択行削除チェック
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.locationList.indexOf(row) > -1) {
				if (row.locationId != null) {
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
	    // [横並-053] チェック順変更 2014.11.21 taoys Start
		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationNm != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationNm != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mzone.zoneCd != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mzone.zoneCd != null)
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationType !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationType!= null)
							||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].pickingLocationFlg !=""
								&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].pickingLocationFlg!= null)
								||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].allocNgFlg !=""
									&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].allocNgFlg!= null)
									||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].pickingOrder !=""
										&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].pickingOrder!= null)
										||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].allocOrder !=""
											&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].allocOrder!= null)
											||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
				item++;
			}
		}
		// 複数行の場合に警告
		if(item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
	    // [横並-053] チェック順変更 2014.11.21 taoys End


		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.locationList.indexOf(row) > -1) {
				$scope.locationList.splice($scope.locationList.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.locationList);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	// Excelアップロード前処理
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.url = "resources/master/locationMasterList/fileUpload";
	}

	// Excelアップロード
	$scope.excelUploadSuccess = function(e, data) {

		// 処理前にグリッドをクリアする。
		$scope.locationList = [];

		owsCommon.syncExec(function() {

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.mLocationSearch;
			request.data.body = data.result.data.body;

			// マスタ取得
			api.locationList.getMasterData(request).then(function(response){
				// 取得データセット
				$scope.locationList = response.data.body;

				// セット行ループ
				for (var row = 0; row < $scope.locationList.length; row++) {

					// 既存行のキー項目が変更不可
					if ($scope.locationList[row].locationId != null){
						gridDirectiveControl.editable($scope.gridOptions, 'locationCd', false, row); // locationCd編集不可
						gridDirectiveControl.editable($scope.gridOptions, 'mzone.mwarehouse.warehouseCd', false, row); // warehouseCd編集不可
					}else{
						gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row); // delFlg編集不可
					}

					//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
					//補充項目が変更不可
					if ($scope.locationList[row].pickingLocationFlg != "1"){
						gridDirectiveControl.editable($scope.gridOptions, 'mproduct.productCd', false, row);
						$scope.locationList[row].mproduct.productCd = null;
					}else{
						gridDirectiveControl.editable($scope.gridOptions, 'mproduct.productCd', true, row);
					}
					if ($scope.locationList[row].mproduct.productCd == null){
						gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', false, row);
						gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', false, row);
						gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', false, row);
						gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', false, row);
						$scope.locationList[row].mproduct.productNm = null;
						if($scope.locationList[row].mproductShapeByReplenishPProductShapeId != null){
							$scope.locationList[row].mproductShapeByReplenishPProductShapeId.mshape.shapeCd = null;
						}
						$scope.locationList[row].replenishPNum = null;
						if($scope.locationList[row].mproductShapeByMaxStoreProductShapeId != null ){
							$scope.locationList[row].mproductShapeByMaxStoreProductShapeId.mshape.shapeCd = null;
						}
						$scope.locationList[row].replenishPNum = null;
						$scope.locationList[row].maxStoreNum = null;

					}else{
						gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByReplenishPProductShapeId.mshape.shapeCd', true, row);
						gridDirectiveControl.editable($scope.gridOptions, 'replenishPNum', true, row);
						gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeByMaxStoreProductShapeId.mshape.shapeCd', true, row);
						gridDirectiveControl.editable($scope.gridOptions, 'maxStoreNum', true, row);
					}
					//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End



				}

				// 行番号振り直し
				updateRowNumber($scope.locationMaster);

				owsCommon.syncExec(function() {
					// 選択状態にする
					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
					if ($scope.locationList.length > 0){
					    //$scope.gridOptions.ngGrid.rowFactory.selectionProvider.toggleSelectAll(true, true);
					    owsCommon.toggleSelectAll($scope.gridOptions, true);
				    }else{
				    	owsCommon.toggleSelectAll($scope.gridOptions, false);
				    }
					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
				});

			});

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(data.result, 'inputform')) {
				return;
			}

		},3)
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#register
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var listBody = [];
		var emptyBody = [];
//		del  by  qiuy 2014/08/19 start
		// 空行判定
//		for (var row = 0; row < $scope.locationList.length; row++) {
//		if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//		// 空行への検証機能を解除
//		gridDirectiveControl.validity($scope.gridOptions, false, row);
//		// 空行を退避
//		emptyBody.push($scope.locationList[row]);
//		} else {
//		// 空行以外を退避
//		listBody.push($scope.locationList[row]);
//		}
//		}
//		del  by  qiuy 2014/08/19 end

		//add  by  qiuy 2015/08/19 start
		if($scope.locationList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
		for (var row = 0; row < $scope.locationList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
				// 空行を退避
				emptyBody.push($scope.locationList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.locationList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.locationList[row]);
			}
		}
		//add  by  qiuy 2015/08/19 end

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
				// 空行への検証機能解除を解除
				gridDirectiveControl.validity($scope.gridOptions, true);
//				for (var row = 0; row < $scope.locationList.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return;
//				}
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.locationList.splice($scope.locationList.indexOf(row), 1);
				});

				// 行番号振り直し
				updateRowNumber($scope.locationList);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// ロケーションCD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
	//			mod  by  qiuy 2014/08/19 start
	//			for (var row = 0; row < $scope.locationList.length; row++) {
	//			var locationCd = $scope.locationList[row].locationCd;
	//			for (var i = row+1; i < $scope.locationList.length; i++) {
	//			if ($scope.locationList[i].locationCd == locationCd){
	//			rowIndex[j] =i;
	//			errAry[j] = "locationCodeDuplicateError";
	//			j++;
	//			}
	//			}
	//			}
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.locationList.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var locationCd = $scope.locationList[row].locationCd;
						for (var i = row+1; i < $scope.locationList.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.locationList[i].locationCd == locationCd){
									rowIndex[j] =i;
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
//									errAry[j] = "locationCodeDuplicateError";
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
									j++;
								}
							}
						}
					}
				}
	//			mod  by  qiuy 2014/08/19 end
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "locationCd", rowIndex[row])) {
//							gridOptionMessageControl.show($scope.gridOptions, "locationCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//						}
//					}
					// エラーメッセージCD
					var messageCd = "locationCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "locationCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
					return;
				}

				// ロケーションNM重複チェック
				var n = 0;
				var rowIndex1 = new Array();
				var errAry1 = new Array();
	//			mod  by  qiuy 2014/08/19 start
	//			for (var row = 0; row < $scope.locationList.length; row++) {
	//			var locationCd = $scope.locationList[row].locationCd;
	//			for (var i = row+1; i < $scope.locationList.length; i++) {
	//			if ($scope.locationList[i].locationCd == locationCd){
	//			rowIndex[j] =i;
	//			errAry[j] = "locationCodeDuplicateError";
	//			j++;
	//			}
	//			}
	//			}
				var allBodyNo1 = $scope.gridOptions.gridApi.grid.rows;
				for (var row1 = 0; row1 < $scope.locationList.length; row1++) {
					if (row1 <= allBodyNo1.length && ($scope.gridOptions.getSelection(allBodyNo1[row1]) == true)){
						var locationNm = $scope.locationList[row1].locationNm;
						for (var m = row1+1; m < $scope.locationList.length; m++) {
							if (i <= allBodyNo1.length && ($scope.gridOptions.getSelection(allBodyNo1[m]) == true)){
								if ($scope.locationList[m].locationNm == locationNm){
									rowIndex1[n] =m;
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
//									errAry1[n] = "locationNameDuplicateError";
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
									n++;
								}
							}
						}
					}
				}
	//			mod  by  qiuy 2014/08/19 end
				if (n > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
//					for(row1 = 0; row1 < rowIndex1.length; row1++){
//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "locationNm", rowIndex1[row1])) {
//							gridOptionMessageControl.show($scope.gridOptions, "locationNm", $filter('owfMessage')((2, errAry1)[0]), rowIndex1[row1]);
//						}
//					}
					// エラーメッセージCD
					var messageCd = "locationNameDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "locationNm", $filter('owfMessage')(messageCd), rowIndex1);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex1[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.locationList.splice($scope.locationList.indexOf(row), 1);
//				});
//
//				// 行番号振り直し
//				updateRowNumber($scope.locationList);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
				// 補充商品が入力したの場合、補充情報が必須入力
				var rowReplenishPShapeCd = new Array();
				var rowReplenishPNum = new Array();
				var rowMaxStoreShapeCd = new Array();
				var rowMaxStoreNum = new Array();

				for (var row = 0; row < $scope.locationList.length; row++) {
					if (($scope.locationList[row].mproduct.productNm) &&
							0 < $scope.locationList[row].mproduct.productNm.length){
						// 補充点荷姿
						if($scope.locationList[row].mproductShapeByReplenishPProductShapeId == null) {
							rowReplenishPShapeCd[rowReplenishPShapeCd.length] = row;
						}else{
							if(!($scope.locationList[row].mproductShapeByReplenishPProductShapeId.mshape.shapeCd)
									|| 0 == $scope.locationList[row].mproductShapeByReplenishPProductShapeId.mshape.shapeCd) {
								rowReplenishPShapeCd[rowReplenishPShapeCd.length] = row;
							}
						}
						// 補充点
						if($scope.locationList[row].replenishPNum == null
								|| 0 == $scope.locationList[row].replenishPNum.length) {
							rowReplenishPNum[rowReplenishPNum.length] = row;
						}
						// 最大格納数商品荷姿
						if($scope.locationList[row].mproductShapeByMaxStoreProductShapeId == null) {
							rowMaxStoreShapeCd[rowMaxStoreShapeCd.length] = row;
						}else{
							if(!($scope.locationList[row].mproductShapeByMaxStoreProductShapeId.mshape.shapeCd)
									|| 0 == $scope.locationList[row].mproductShapeByMaxStoreProductShapeId.mshape.shapeCd) {
								rowMaxStoreShapeCd[rowMaxStoreShapeCd.length] = row;
							}
						}
						// 最大格納数
						if($scope.locationList[row].maxStoreNum == null
								|| 0 == $scope.locationList[row].maxStoreNum.length) {
							rowMaxStoreNum[rowMaxStoreNum.length] = row;
						}
					}
				}
				if (rowReplenishPShapeCd.length > 0　|| rowReplenishPNum.length > 0
						|| rowMaxStoreShapeCd.length > 0　|| rowMaxStoreNum.length > 0  ){

					// 補充点荷姿
					if (rowReplenishPShapeCd.length > 0　){
						// エラーメッセージCD
						var messageCd = "necessaryItemNotInputError";
						// 対象の項目にエラーを表示
						gridOptionMessageControl.show($scope.gridOptions, "mproductShapeByReplenishPProductShapeId.mshape.shapeCd", $filter('owfMessage')(messageCd), rowReplenishPShapeCd);
						// 最初のエラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
						// 最初のエラーにフォーカス
						directiveControl.firstErrorOnFocus('searchinputform');
					}
					// 補充点
					if (rowReplenishPNum.length > 0　){
						// エラーメッセージCD
						var messageCd = "necessaryItemNotInputError";
						// 対象の項目にエラーを表示
						gridOptionMessageControl.show($scope.gridOptions, "replenishPNum", $filter('owfMessage')(messageCd), rowReplenishPNum);
						// 最初のエラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
						// 最初のエラーにフォーカス
						directiveControl.firstErrorOnFocus('searchinputform');
					}
					// 最大格納数商品荷姿
					if (rowMaxStoreShapeCd.length > 0　){
						// エラーメッセージCD
						var messageCd = "necessaryItemNotInputError";
						// 対象の項目にエラーを表示
						gridOptionMessageControl.show($scope.gridOptions, "mproductShapeByMaxStoreProductShapeId.mshape.shapeCd", $filter('owfMessage')(messageCd), rowMaxStoreShapeCd);
						// 最初のエラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
						// 最初のエラーにフォーカス
						directiveControl.firstErrorOnFocus('searchinputform');
					}
					// 最大格納数
					if (rowMaxStoreNum.length > 0　){
						// エラーメッセージCD
						var messageCd = "necessaryItemNotInputError";
						// 対象の項目にエラーを表示
						gridOptionMessageControl.show($scope.gridOptions, "maxStoreNum", $filter('owfMessage')(messageCd), rowMaxStoreNum);
						// 最初のエラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
						// 最初のエラーにフォーカス
						directiveControl.firstErrorOnFocus('searchinputform');
					}
					return;
				}
				//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = listBody;
				request.data.head = $scope.mLocationSearch;
				request.data.head.clientId =  userInfo.clientId;
				// 入力チェック
				api.locationList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// ロケーションマスタデータ登録または更新
					api.locationList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.initScreenHttp();
					});

					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
					owsCommon.toggleSelectAll($scope.gridOptions, false);
					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
	};
	   // [ON推-品向-829] ゾーンは倉庫に紐づいたゾーンのみを表示(不要な処理の削除) 2015.06.24 kawana

//	2016.02.18 Pan ページング ※3 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#getSearchData
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.mLocationSearch;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.locationList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};
//	2016.02.18 Pan ページング ※3 End

	// 2016.03.18 Zhang 一覧編集 ※4 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#gridDblClick
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMaster.object:LocationMaster#copy
	 * @methodOf oneslogiWms.LocationMaster.object:LocationMaster
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されたデータの情報を新規編集画面に設定し、表示する。
	 */
	$scope.copy = function() {
		//修正画面へ遷移
		//荷主センタ変更対応 2017.03.01 sja Start
//		$location.path("wms/master/LocationMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("centerCd", $scope.mLocationSearch.mcenter.centerCd).search("locationId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].locationId);
		$location.path("wms/master/LocationMasterEdit").search({}).search("mode", SCREEN_MODE.Copy)
		//荷主センタ変更対応 2017.03.01 sja End
		.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd)
		.search("locationId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].locationId);
	};
	// コピー機能追加 ロケーションマスタ画面修正 2016.6.20 Kudo Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#showZipEdit
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * 編集画面を表示する。
	 */
	$scope.initNew = function(){
		// 編集画面へ遷移

		//荷主センタ変更対応 201７.03.01 sja Start
		//$location.path("wms/master/LocationMasterEdit").search({}).search("mode", SCREEN_MODE.Register).search("centerCd", $scope.mLocationSearch.mcenter.centerCd);
		//$location.path("wms/master/LocationMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
		$location.path("wms/master/LocationMasterEdit").search({}).search("mode", SCREEN_MODE.Create).search("centerCd", $scope.mLocationSearch.mcenter.centerCd);
		//荷主センタ変更対応 201７.03.01 sja End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#showZipEdit
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 編集画面を表示する。
	 */
	$scope.update = function(){
		// 編集画面へ遷移
		$location.path("wms/master/LocationMasterEdit").search({})
		//荷主センタ変更対応 2017.03.01 sja Start
//		.search("mode", SCREEN_MODE.Update).search("centerCd", $scope.mLocationSearch.mcenter.centerCd)
		//荷主センタ変更対応 2017.03.01 sja End
		.search("mode", SCREEN_MODE.Update).search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd)
		.search("locationId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].locationId);
	};
	// 2016.03.18  Zhang 一覧編集 ※4 End

	// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#modalProduct
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 商品CD検索ボタンを押下された時に処理<br>
	 *
	 * 商品マスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.modalProduct = function(){
		var items = {
				// 商品マスタ
				clientCd: userInfo.clientCd,
				productCd: $scope.mLocationSearch.mproduct.productCd
		};

		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.mLocationSearch.mproduct.productCd = selectedItem.productCd;
			$scope.mLocationSearch.mproduct.productNm = selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#ProductBlur
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 商品CDをロストフォーカス時の処理<br>
	 *
	 * 商品マスタから商品情報を取得し、設定する。
	 */
	$scope.ProductBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.mLocationSearch.mproduct.productCd;

		if(productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientId,
			request.productCd = productCd;

			$scope.mLocationSearch.mproduct.productNm = null;

			// 商品情報の取得
			api.ProductBlur.record(request).then(function(response){
				$scope.mLocationSearch.mproduct.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.mLocationSearch.mproduct.productNm = null;
		}
	};
	// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);


