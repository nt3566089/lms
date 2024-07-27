/**
 * @ngdoc overview
 * @name oneslogiWms.PickingListPrint
 *
 * @description ピッキングリスト発行画面<br>
 *
 * ピッキングリスト発行表示する画面。
 *
 */
angular.module('oneslogiWms.PickingListPrint', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PickingListPrint.service:PickingListPrintApi
 *
 * @description ピッキングリスト発行画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/shipping/PickingListPrint/initNormal 初期データ取得(通常)WebAPI<br>
 * ・resources/shipping/PickingListPrint/search 検索結果取得WebAPI<br>
 * ・resources/shipping/PickingListPrint/print発行ボタンを押下された時に処理WebAPI<br>
 * ・resources/shipping/PickingListPrint/getReportId レポトIDの取得WebAPI<br>
 */
.factory('PickingListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		keyValueList: AngularAPIClient.make(
				[
					['query',	'GET',	'resources/common/centerClass/keyValueList']
					]
		),
		deliveryCourse: AngularAPIClient.make(
				[
					['record',	'GET',	'resources/common/deliveryCourse/record']
					]
		),
		pickingListPrint: AngularAPIClient.make(
				[
					['initNormal',		'GET',	'resources/shipping/pickingListPrint/initNormal'],
					['search',			'GET',	'resources/shipping/pickingListPrint/search'],
					['excel',			'GET',	'resources/shipping/pickingListPrint/search', 'excel'],
					['print',			'GET',	'resources/shipping/pickingListPrint/print'],
					['getReportId',		'GET',	'resources/shipping/pickingListPrint/getReportId'],
				]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PickingListPrint.object:PickingListPrint
 *
 * @description ピッキングリスト発行画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PickingListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'PickingListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.pickingListPrintCols = [
		{field:"nizoroeNo2", displayName:"荷揃番号"},
		{field:"daihyoNizoroeNo2", displayName:"代表荷揃番号"},
		{field:"supplyCustomerNm", displayName:"送り先名称"},
		{field:"deliveryCourseCd", displayName:"運送便CD"},
		{field:"deliveryCourseNm", displayName:"運送便名称"},
		{field:"carrierCd", displayName:"運送業者CD"},
		{field:"carrierNm", displayName:"運送業者名称"},
		{field:"kohaiContractorCd", displayName:"ユーザCD"},
		{field:"kohaiContractorNm", displayName:"ユーザ名称"},
		{field:"shippingDt", displayName:"出荷指示日"},
		{field:"workDt", displayName:"作業日"},
		{field:"shippingFixedDt", displayName:"出荷日"},
		{field:"clientShippingNo", displayName:"発注伝票番号"},
		{field:"processTypeCd", displayName:"出荷処理区分CD"},
		{field:"processTypeNm", displayName:"出荷処理区分名称"},
		{field:"shippingTypeCd", displayName:"出荷区分CD"},
		{field:"shippingTypeNm", displayName:"出荷区分名称"},
		{field:"slipCnt", displayName:"伝票枚数"},
		{field:"lineCnt", displayName:"行数"},
		{field:"itemCnt", displayName:"アイテム数"},
		{field:"instNum", displayName:"総バラ数"},
		{field:"packingNum", displayName:"梱包数"},
		{field:"nizoroeOutNm", displayName:"荷揃表発行"},
		{field:"nizoroeOutDt", displayName:"荷揃表発行日時"},
		{field:"tagOutNm", displayName:"荷札発行"},
		{field:"tagOutDt", displayName:"荷札発行日時"},
		{field:"delivOutNm", displayName:"納品書発行"},
		{field:"delivOutDt", displayName:"納品書発行日時"},
		{field:"pllOutNm", displayName:"梱包明細発行"},
		{field:"pllOutDt", displayName:"梱包明細発行日時"},
		{field:"indvSupplyOutNm", displayName:"個人別支給明細発行"},
		{field:"indvSupplyOutDt", displayName:"個人別支給明細発行日時"},
		{field:"indvLabelOutNm", displayName:"個別貼り付けラベル発行"},
		{field:"indvLabelOutDt", displayName:"個別貼り付けラベル発行日時"},
		{field:"centerCd", displayName:"センタCD"},
		{field:"centerNm", displayName:"センタ名称"},
	];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#initScreen
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 検索条件を表示状態に変更
		$scope.isopen = true;

		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);
			if (fromValueString > toValueString) {
				return false;
			}
			return true;
		};
		// 日付大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// ページングの設定(ページングなし)
		$scope.pagingOptions = {
			pageSizes: [0],
			pageSize: 0,
			currentPage: 1
		};

		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
			data: 'pickingListPrintB',
			columnDefs: 'pickingListPrintCols'
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#initScreenHttp
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetSearchReferenceDt(),
				 $scope.deferredGetShippingSlipType(),
				 $scope.deferredGetPrintStatus(),
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetSearchReferenceDt
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 検索基準日取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSearchReferenceDt = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SEARCH_REFERENCE_DT";

		owsCommon.getDataCacheable(api.keyValueList, request).then(function(response){
			$scope.searchReferenceDtList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetShippingSlipType
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 出荷帳票発行区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShippingSlipType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SHIPPING_SLIP_TYPE";

		owsCommon.getDataCacheable(api.keyValueList, request).then(function(response){
			$scope.shippingSlipTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetPrintStatus
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 発行状況取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPrintStatus = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRINT_FLG";

		owsCommon.getDataCacheable(api.keyValueList, request).then(function(response){
			$scope.printStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#showCustomer
	 * @methodOf oneslogiWms.ReceivePlanInput.object:deliveryCourse
	 *
	 * @description 運送業者CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された取引先情報を画面項目に反映する。
	 */
	$scope.showCarrier = function(){

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#customerCdBlur
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 運送業者CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.carrierCdBlur = function() {

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deliveryCourse
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 運送便CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.deliveryCourse = function(){
		var items = {
				// 配送コードマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.deliveryCourseCd

		};

		// 運送便CD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.searchCondition.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 運送便CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function() {
		// 入力された運送便CDを取得
		var deliveryCourseCd = $scope.searchCondition.deliveryCourseCd

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};

			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#daihyoNizoroeNo2FromChange
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 代表荷揃番号(From)のロストフォーカス処理<br>
	 *
	 * 代表荷揃番号(From)に値が入力された際に同じ値を設定する。
	 */
	$scope.daihyoNizoroeNo2FromChange = function() {
		// 代表荷揃番号(To)
		$scope.searchCondition.daihyoNizoroeNo2To = $scope.searchCondition.daihyoNizoroeNo2From
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#nizoroeNo2FromChange
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 荷揃番号(From)のロストフォーカス処理<br>
	 *
	 * 荷揃番号(From)に値が入力された際に同じ値を設定する。
	 */
	$scope.nizoroeNo2FromChange = function() {
		// 荷揃番号(To)
		$scope.searchCondition.nizoroeNo2To = $scope.searchCondition.nizoroeNo2From
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetInitData
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description ピッキングリスト発行データを取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.pickingListPrint.initNormal().then(function(response){
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head;
			$scope.pickingListPrintB = response.data.list;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.dtFrom = userInfo.systemDt;
			$scope.searchCondition.dtTo = userInfo.systemDt;
			$scope.searchCondition.printStatus =  "1";

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
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
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#search
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#getPagingData
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.pickingListPrint.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#setPagingData
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに表示
		$scope.pickingListPrintB = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#getClassForRow
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		var color;
		if (row.entity.emergencyFlg == "1") {//緊急
			color = "wmslegendcolorred";
		}
		return color;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:ReceiveInputNo#register
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 発行ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに発行・更新データを送信する。
	 */
	$scope.issue = function() {

		//明細が表示されていない場合
		if($scope.pickingListPrintB.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		//明細が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("reportNotSelectError");
			return;
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);

		// 発行
		var printNum;
		var reportId;
		var requestReport = {};
		requestReport.data = {};
		requestReport.data.head = $scope.searchCondition;
		requestReport.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		// チェック処理
		for (var row = 0; row < requestReport.data.list.length; row++) {
			switch ($scope.searchCondition.shippingSlipType) {
			case "07":// 発行区分で[07：納品書]が選択された場合
				// 出荷ステータスが「出荷検品済」以外のデータがある
				if (requestReport.data.list[row].pickingStatusCd != "50") {
					alertMessage.setErrorMessageByCode("printDataTypeNotAllowedRePrintError", "出荷検品済以外の納品書");
					return;
				}
				break;
			case "08":// 発行区分で[08：荷札]が選択された場合
			case "09":// 発行区分で[09：一体型伝票(荷札、納品書)]が選択された場合
				// 出荷ステータスが「出荷検品済」以外のデータがある
				if (requestReport.data.list[row].pickingStatusCd != "50") {
					alertMessage.setErrorMessageByCode("printDataTypeNotAllowedRePrintError", "出荷検品済以外のラベル(荷札)");
					return;
				}
				break;
			case "10":// 発行区分で[10：梱包明細]が選択された場合
				// 出荷ステータスが「出荷検品済」以外のデータがある
				if (requestReport.data.list[row].pickingStatusCd != "50") {
					alertMessage.setErrorMessageByCode("printDataTypeNotAllowedRePrintError", "出荷検品済以外の梱包明細");
					return;
				}
				// 出荷区分が「店送り」以外のデータがある
				if (requestReport.data.list[row].shippingTypeCd != "03") {
					alertMessage.setErrorMessageByCode("printDataTypeNotAllowedRePrintError", "出荷区分「店送り」以外");
					return;
				}
				break;
			case "11":// 発行区分で[11：個別貼り付けラベル]が選択された場合
				// 個体管理印刷区分が「02:個体管理品」以外のデータがある
				if (requestReport.data.list[row].idManagPrintTypeCd != "02") {
					alertMessage.setErrorMessageByCode("printDataTypeNotAllowedRePrintError", "個体管理印刷区分が個体管理品以外の出庫データ");
					return;
				}
				break;
			}
		}

		api.pickingListPrint.getReportId(requestReport).then(function(response){
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				return
			}

			$scope.listReportId = response.data.listReportId;
			successPrintFunc = function(){
				if ($scope.listReportId.length > 0) {
					reportId = $scope.listReportId.shift();
				}

			// プリンタ選択画面を表示
			var request = {};
			request.reportId = reportId;
			request.userId = null;
			request.reportLayoutData = null;
			request.subrepLayoutData = null;
			request.groupCd = null;
			request.printerNm = null;
			request.trayInfo = null;
			request.trayNm = null;
			request.caltureId = null;
			request.printType = null;
			request.outputType = null;
			request.reportLayoutId = null;
			request.reportLayoutVersion = null;
			request.subrepLayoutId = null;
			request.printerAttributeId = null;
			request.printNum = null;
			request.confirmPrintDia = null;
			request.sheetCollate = null;
			request.printerId = null;
			request.outputData = null;

			var modalInstance = printFactory.modalPrint(request);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.head = $scope.searchCondition;
				request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
				request.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				successFunc = function(){
					// 再検索処理
					$scope.search();
				}

				// 発行
				api.pickingListPrint.print(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー表示
							if (0 < response.output.listDownloadUrl.length) {
								// 複数帳票用にダウンロードURL格納

								var listDownloadUrl = response.output.listDownloadUrl;
								subWindow = owsCommon.viewPdf(subWindow, listDownloadUrl.shift());
								while (0 < listDownloadUrl.length) {
									owsCommon.viewPdf(null, listDownloadUrl.shift());
								}
							} else {
								// 通常

								subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
							}
						}
					} else {
						// 異常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
						return;
					}

					if ($scope.listReportId.length > 0) {
						successPrintFunc();
					} else {
						// 完了後の処理
						successFunc(response);

					}
				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
			});
			}

			successPrintFunc();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#excelOutput
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.pickingListPrint.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};
	// 画面初期化処理を実行
	$scope.initScreen();

}]);
