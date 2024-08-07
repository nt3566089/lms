/**
 * @ngdoc overview
 * @name oneslogiWms.CasePickingSD
 *
 * @description
 * ケースピッキング画面 （スマートデバイス用）<br>
 *
 * ケースピッキングデータを元にピッキング作業を行い、ステータス更新を行う為の画面。
 */
angular.module('oneslogiWms.CasePickingSD', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CasePickingSD.service:CasePickingSDApi
 *
 * @description
 * ケースピッキング画面 （スマートデバイス用）用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * takingShippingFlg 作業日/出荷日データ操作用WebApi<br>
 * emergencyFlg 緊急フラグデータ操作用WebApi<br>
 * noStockOutFlg 欠品フラグデータ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * deliveryCustomer ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/deliveryCustomer/record 納品先データ取得WebAPI<br>
 * <br>
 * deliveryCourse ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/deliveryCourse/record 配送コースデータ取得WebAPI<br>
 * <br>
 * casePickingSD ケースピッキングデータ操作用WebApi<br>
 * ・resources/shipping/casePickingSD/init 初期データ取得(通常)WebAPI<br>
 * ・resources/shipping/casePickingSD/search 指示一覧検索結果取得WebAPI<br>
 * ・resources/shipping/casePickingSD/searchDetail 指示明細一覧検索結果取得WebAPI<br>
 * ・resources/shipping/casePickingSD/startCasePicking 明細画面遷移時に行うケースピッキングNo.関連チェックWebAPI<br>
 * ・resources/shipping/casePickingSD/checkPickingClear ピッキング解除ボタンを押下された時に行うピッキング解除チェック処理WebAPI<br>
 * ・resources/shipping/casePickingSD/pickingClear ピッキング解除ボタンを押下された時に行うピッキング解除処理WebAPI<br>
 * ・resources/shipping/casePickingSD/checkExistCasePickingNo ケースピッキングNo.の存在チェックWebAPI<br>
 * ・resources/shipping/casePickingSD/autoSortPicking ピッキング画面から遷移した時の自動振り分けWebAPI<br>
 * ・resources/shipping/casePickingSD/register 登録ボタンを押下された時に行うステータス更新処理WebAPI<br>
 */
.factory('CasePickingSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		takingShippingFlg: AngularAPIClient.make([
													['query', 'GET', 'resources/common/centerClass/keyValueList']
													]
		),
		emergencyFlg: AngularAPIClient.make([
												['query', 'GET', 'resources/common/centerClass/keyValueList']
												]
		),
		noStockOutFlg: AngularAPIClient.make([
												['query', 'GET', 'resources/common/centerClass/keyValueList']
												]
		),
		casePickingSD: AngularAPIClient.make([
												['init', 'GET', 'resources/shipping/casePickingSD/init'],
												['search', 'GET', 'resources/shipping/casePickingSD/search'],
												['searchDetail', 'GET', 'resources/shipping/casePickingSD/searchDetail'],
												// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
												['reSearchDetail', 'GET', 'resources/shipping/casePickingSD/reSearchDetail'],
												// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
												['startCasePicking', 'POST', 'resources/shipping/casePickingSD/startCasePicking'],
												['checkPickingClear', 'POST', 'resources/shipping/casePickingSD/checkPickingClear'],
												['pickingClear', 'POST', 'resources/shipping/casePickingSD/pickingClear'],
												['checkExistCasePickingNo', 'POST', 'resources/shipping/casePickingSD/checkExistCasePickingNo'],
												['autoSortPicking', 'POST', 'resources/shipping/casePickingSD/autoSortPicking'],
												['register', 'POST', 'resources/shipping/casePickingSD/register']
												]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CasePickingSD.object:CasePickingSD
 *
 * @description
 * ケースピッキング画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CasePickingSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicHistory', '$ionicScrollDelegate', 'ionicDatePicker', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'detailDirectiveControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'CasePickingSDApi',
                      function($scope,   $state,   $filter,   $location,   $q,   $ionicHistory,   $ionicScrollDelegate,   ionicDatePicker,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   detailDirectiveControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   printFactory,   api) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#initScreen
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	var running = false;
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	var detailCount;
	var detailNum;
	var pickingNumSumUsedByLog;
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	$scope.initScreen = function() {
		$scope.form = {};
		$scope.searchResult = {};
		$scope.searchCondition = {};

		// モード設定
		var searchObject = $location.search();
		$scope.screenMode = searchObject.mode;
		// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Add Start
		// ピッキング種別設定(自動ピッキング用)
		$scope.pickingType = searchObject.pickingType;
		// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Add End

		//センタコードの設定
		$scope.centerCd = userInfo.centerCd;

		//荷主コードの設定
		$scope.clientCd = userInfo.clientCd;

		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);

			if (fromValueString != null &&fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
				return false;
			}

			return true;
		};

		// 日付大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

		//指示一覧ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();
		//指示明細一覧ページングの設定
		$scope.detailPagingOptions = owsCommonSd.getDefaultPagingOptions();

		// 指示一覧グリッドの設定
		$scope.listGridOptions = {
			data: 'casePickingSDList',
			columnDefs: 'casePickingSDListCols',
		};

		// [#2201][Ver2.2.1] SD基盤(js) - 一覧画面のボタン定義を単数→複数対応 2017.08.01 honma Add Start
		// 指示一覧グリッドのピッキング解除列にボタンを設定
		$scope.listButtonOptions = {
				"pickingClear":{
					buttonType:"button",
					buttonColor:"button-assertive",
					clickFunction:"pickingClear($index)",
					text:"ピッキング解除",
				}
		};
		// [#2201][Ver2.2.1] SD基盤(js) - 一覧画面のボタン定義を単数→複数対応 2017.08.01 honma Add End

		// 指示明細一覧グリッドの設定
		$scope.detailListGridOptions = {
			data: 'casePickingSDDetailList',
			columnDefs: 'casePickingSDDetailListCols',
		};

		// 明細詳細グリッドの設定
		$scope.gridOptions = {
			data: 'casePickingSDDetail',
			columnDefs: 'casePickingSDDetailCols',
			pagingOptions : $scope.detailPagingOptions,
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#initScreenHttp
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
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
				 $scope.deferredGetTakingShippingFlg(), //作業日/出荷日
				 $scope.deferredGetEmergency(), //緊急のみ
				 $scope.deferredGetNoStockOutFlg() //欠品フラグ
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#deferredGetTakingShippingFlg
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description 作業日/出荷日取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTakingShippingFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAKING_SHIPPING_FLG";

		owsCommon.getDataCacheable(api.takingShippingFlg, request).then(function(response){
			$scope.takingShippingFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#deferredGetEmergency
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description 緊急のみ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmergency = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "EMERGENCY_DISPLAY";

		owsCommon.getDataCacheable(api.emergencyFlg, request).then(function(response){
			$scope.emergencyFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSDt#deferredGetNoStockOutFlg
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description 欠品無のみ表示/欠品有のみ表示 取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetNoStockOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NO_STOCK_OUT_FLG";

		owsCommon.getDataCacheable(api.noStockOutFlg, request).then(function(response){
			$scope.noStockOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#deferredGetInitData
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * ケースピッキング初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.casePickingSD.init().then(function(response){

			// 指示一覧用ページング
			$scope.paging = response.paging;
			// 指示明細一覧用ページング
			$scope.detailPaging = response.paging;
			$scope.searchCondition = response.data.head;
			$scope.casePickingListB = response.data.list;

			// ログイン情報より初期値を設定
			$scope.searchCondition.centerId = userInfo.centerId;
			$scope.searchCondition.clientId = userInfo.clientId;
			$scope.searchCondition.takingShippingFlg =  owsCommon.getDefaultValue($scope.takingShippingFlgList);
			$scope.searchCondition.dtFrom = userInfo.systemDt;
			$scope.searchCondition.dtTo = userInfo.systemDt;
			$scope.searchCondition.emergencyFlg =  owsCommon.getDefaultValue($scope.emergencyFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			} else if ($scope.screenMode == SCREEN_MODE.Update) {
				// ピッキング画面から遷移の場合
				// [#1443][Ver2.2.0] 発行状況の条件は常に全件検索に修正 2017.03.23 honma Delete
				$scope.getAutoSortPicking();
			} else {
				// [#1443][Ver2.2.0] 発行状況の条件は常に全件検索に修正 2017.03.23 honma Delete
				$scope.searchCondition.noStockOutFlg =  owsCommon.getDefaultValue($scope.noStockOutFlgList);
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	$scope.moreDataCanBeLoaded = function() {
		if ($state.current.name == 'all.abstract.list') {
			// 指示一覧
			return $scope.paging.isExistNextPage;
		} else {
			// 指示明細一覧
			return $scope.detailPaging.isExistNextPage;
		}
	}
	$scope.loadMoreData = function() {
		if ($state.current.name == 'all.abstract.list') {
			// 指示一覧
			if (!$scope.searchResult.preventDoubleLoad) {
				$scope.pagingOptions.lastCurrentPage = $scope.pagingOptions.currentPage;
				$scope.pagingOptions.currentPage = $scope.pagingOptions.currentPage + 1;
				// 指示一覧でのスクロール検索処理
				$scope.getPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);

				$scope.searchResult.preventDoubleLoad = true;
			}
		} else {
			if (!$scope.searchResult.detailPreventDoubleLoad) {
				$scope.detailPagingOptions.lastCurrentPage = $scope.detailPagingOptions.currentPage;
				$scope.detailPagingOptions.currentPage = $scope.detailPagingOptions.currentPage + 1;
				// 指示明細一覧でのスクロール検索処理
				// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
				$scope.reGetDetailPagingData($scope.detailPagingOptions.pageSize, $scope.detailPagingOptions.currentPage);
				// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start

				$scope.searchResult.detailPreventDoubleLoad = true;
			}
		}
		$scope.$broadcast('scroll.infiniteScrollComplete');
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#getAutoSortPicking
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * ピッキング画面からの遷移で、ケースピッキング初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getAutoSortPicking = function () {

		owsCommon.clearPagingOptions($scope.detailPagingOptions);
		$scope.casePickingList = [];
		$scope.casePickingDetailList = [];
		$scope.detailLastLoaded = 0;

		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.detailPaging, $scope.detailPagingOptions.pageSize, $scope.detailPagingOptions.currentPage);

		if($scope.detailPagingOptions.currentPage == $scope.detailLastLoaded) {
			return;
		}
		$scope.detailLastLoaded = $scope.detailPagingOptions.currentPage;

		api.casePickingSD.autoSortPicking(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response, 'form.searchform')) {
				// エラー有り

				// エラーの場合は前画面に戻る
				owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);
				$ionicHistory.goBack(-1);
				return;
			}

			$scope.searchCondition.casePickingNo = response.data.list[0].casePickingNo;

			// 検索条件のセンタCD、荷主CD、選択行のケースピッキングNo.を検索条件に設定
			var request = {};
			request.data = {};
			request.data.head = {};
			request.data.head.centerId = $scope.searchCondition.centerId;
			request.data.head.clientId = $scope.searchCondition.clientId;
			request.data.head.casePickingNo = response.data.list[0].casePickingNo;
			// 指示明細一覧用検索条件
			$scope.searchDetailCondition = request.data.head;

			$scope.setDetailPagingData(response, $scope.detailPagingOptions.currentPage, $scope.detailPagingOptions.pageSize);

			// 詳細画面へ遷移
			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add START */
			$scope.searchResult.index = 0;
			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add END */
			setButtons(0);
			$scope.searchResult.detailedItem = $scope.casePickingDetailList[0];

			// [#6956][OSS] 検索条件の日付を検索結果の作業日に変更 2019.12.12 tsuboi Start
			$scope.searchCondition.dtFrom = $scope.searchResult.detailedItem.workDt;
			$scope.searchCondition.dtTo = $scope.searchResult.detailedItem.workDt;
			// [#6956][OSS] 検索条件の日付を検索結果の作業日に変更 2019.12.12 tsuboi End

			$state.go('all.abstract.detail', {id: 0});
		});

		return;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#detail
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 一覧画面での明細押下処理<br>
	 *
	 * 選択した明細データに対してピッキング開始処理を行い、再取得した明細データを設定する。
	 */
	$scope.detail = function(index) {

		// 明細データ取得・設定
		$scope.deferredStartPicking(index, false).then(function(response) {

			//エラー無しなら検索結果詳細画面へ移行
			$scope.searchResult.index = index;
			setButtons(index);

			$state.go('all.abstract.detail', {id: index});
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#deferredStartPicking
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * ピッキング開始処理<br>
	 *
	 * 指定indexの明細データに対してピッキング開始処理を行い、再取得した明細データを設定する。
	 */
	$scope.deferredStartPicking = function (index, showErrorDialog) {

		var deferred = $q.defer();

		var body = {};
		body.centerId = $scope.casePickingDetailList[index].centerId;
		body.clientId = $scope.casePickingDetailList[index].clientId;
		body.stockId = $scope.casePickingDetailList[index].stockId;
		body.casePickingNo = $scope.casePickingDetailList[index].casePickingNo;

		var request = {};
		request.data = {};
		request.data.list = [];
		request.data.list.push(body);

		api.casePickingSD.startCasePicking(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response, 'form.searchform')) {

				if (showErrorDialog) {
					owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);
				}

				deferred.reject();
				return;
			}

			// 明細データ設定
			var body = response.data.list[0];
			$scope.casePickingDetailList[index] = body;
			$scope.searchResult.detailedItem = body;

			deferred.resolve();
			return;
		});

		return deferred.promise;

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#detailPrevious
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 明細画面での「前」押下処理<br>
	 *
	 * 1件前の明細データに対してピッキング開始処理を行い、再取得した明細データを設定する。
	 */
	$scope.detailPrevious = function() {

		if (!$scope.searchResult.hasPrevious) {
			return;
		}

		// 画面遷移しないのでエラーを消す
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		// 現在のindex - 1
		var index =  $scope.casePickingDetailList.indexOf($scope.searchResult.detailedItem) - 1;

		// 明細データ取得・設定
		$scope.deferredStartPicking(index, true).then(function(response) {

			// 前/次ボタン、明細番号設定
			setButtons(index);
			$scope.searchResult.index = index;
			// 上までスクロールしてあげる
			$ionicScrollDelegate.scrollTop();
		},
		function(response) {

			// エラーなら前画面に移動
			$ionicHistory.goBack(-1);
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#detailPrevious
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 明細画面での「次」押下処理<br>
	 *
	 * 1件後の明細データに対してピッキング開始処理を行い、再取得した明細データを設定する。
	 */
	$scope.detailNext = function() {

		if (!$scope.searchResult.hasNext) {
			return;
		}

		// 画面遷移しないのでエラーを消す
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		// 現在のindex + 1
		var index =  $scope.casePickingDetailList.indexOf($scope.searchResult.detailedItem) + 1;

		// 明細データ取得・設定
		$scope.deferredStartPicking(index, true).then(function(response) {

			// 前/次ボタン、明細番号設定
			setButtons(index);
			$scope.searchResult.index = index;
			// 上までスクロールしてあげる
			$ionicScrollDelegate.scrollTop();
		},
		function(response) {

			// エラーなら前画面に移動
			$ionicHistory.goBack(-1);
		});
	}

	setButtons = function (index) {
		if(index > 0) {
			$scope.searchResult.hasPrevious = true;
		}
		else {
			$scope.searchResult.hasPrevious = false;
		}
		if(index < ($scope.casePickingDetailList.length-1)) {
			$scope.searchResult.hasNext = true;
		}
		else {
			//まだ読み込んでいない検索結果があるなら次のページを読み込む
			if($scope.detailPaging.isExistNextPage) {
				$scope.loadMoreData();
				$scope.searchResult.hasNext = true;
			}
			else {
				$scope.searchResult.hasNext = false;
			}
		}
	}


	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#search
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、指示一覧取得結果を画面項目に反映する。
	 */
	$scope.search = function() {
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.casePickingList = [];
		$scope.lastLoaded = 0;
		$scope.getPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#getPagingData
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 指示一覧指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指示一覧指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		// 指示一覧用検索条件
		$scope.searchListCondition = request.data.head;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		if(page == $scope.lastLoaded) {
			return
		}
		$scope.lastLoaded = page;

		api.casePickingSD.search(request).then(function(response) {
			var noError = statusInfo.isSuccessAndShowMessage(response, 'form.searchform');
			$scope.setPagingData(response, page, pageSize);

			if ($state.current.name == 'all.abstract.list') {
				// 指示一覧画面からの検索 (画面スクロール)の場合

				if (page == 1) {
					// 初期検索のためスクロールを上まで移動してあげる
					$ionicScrollDelegate.scrollTop();
				}

				// 指示一覧画面からの検索 (画面スクロール)の場合、何もしない
			} else if ($state.current.name == 'all.abstract.detailList') {
				// 指示明細一覧画面からの検索 (指示明細一覧検索結果が無い)の場合

				if (noError) {
					// エラーなし

					// 指示一覧リスト画面へ遷移
					$state.go('all.abstract.list', $state.params);
				} else {
					// 検索画面へ遷移
					$state.go('all.abstract.main', $state.params);
				}
			} else if ($state.current.name == 'all.abstract.detail') {
				// 明細詳細画面からの検索 (指示明細一覧検索結果が無い)の場合

				if (noError) {
					// エラーなし

					// 指示一覧リスト画面へ遷移
					$state.go('all.abstract.list', $state.params);
				} else {
					// 検索画面へ遷移
					$state.go('all.abstract.main', $state.params);
				}
			} else {
				// 検索画面からの検索
				if (noError) {
					// エラーなし

					// 指示一覧リスト画面へ遷移
					$state.go('all.abstract.list', $state.params);
				}
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#setPagingData
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 指示一覧指定ページデータ設定処理<br>
	 *
	 * 指示一覧取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 共通指定ページデータ設定処理
		$scope.commonSetPagingData(response, page, pageSize);
		// 取得したデータを次の画面で表示するリストに保存
		$scope.casePickingList = $scope.casePickingList.concat(response.data.headList);
		// まだ表示していない検索結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		// トータル件数を設定(全明細数)
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;

		$scope.searchResult.preventDoubleLoad = false;
		$scope.$broadcast('ngListEventData');
	};



	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#searchDetail
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 指示明細一覧検索処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.searchDetail = function(index) {
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		detailCount = 0;
		detailNum = 0;
		pickingNumSumUsedByLog = 0;
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
		owsCommon.clearPagingOptions($scope.detailPagingOptions);
		$scope.detailPaging = {};
		$scope.casePickingDetailList = [];
		$scope.detailLastLoaded = 0;
		// 検索条件のセンタCD、荷主CD、選択行のケースピッキングNo.を検索条件に設定
		var request = {};
		request.data = {};
		request.data.head = {};
		request.data.head.centerId = $scope.searchCondition.centerId;
		request.data.head.clientId = $scope.searchCondition.clientId;
		request.data.head.casePickingNo = $scope.casePickingList[index].casePickingNo;
		// 指示明細一覧用検索条件
		$scope.searchDetailCondition = request.data.head;
		$scope.getDetailPagingData($scope.detailPagingOptions.pageSize, $scope.detailPagingOptions.currentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#researchDetail
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 登録後の指示明細一覧再検索処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.researchDetail = function() {
		owsCommon.clearPagingOptions($scope.detailPagingOptions);
		$scope.detailPaging = {};
		$scope.casePickingDetailList = [];
		$scope.detailLastLoaded = 0;
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		$scope.reGetDetailPagingData($scope.detailPagingOptions.pageSize, $scope.detailPagingOptions.currentPage);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#getDetailPagingData
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 指示明細一覧指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getDetailPagingData = function(pageSize, page) {
		// 指示明細一覧用検索条件を設定
		var request = {};
		request.data = {};
		request.data.head = $scope.searchDetailCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.detailPaging, pageSize, page);

		if(page == $scope.detailLastLoaded) {
			return
		}
		$scope.detailLastLoaded = page;

		api.casePickingSD.searchDetail(request).then(function(response) {
			var noError = statusInfo.isSuccessAndShowMessage(response, 'form.searchform');
			$scope.setDetailPagingData(response, page, pageSize);

			if ($state.current.name == 'all.abstract.detail') {
				// 明細画面からの検索 (登録ボタン押下後)

				if (noError) {
					// エラーなし (データあり)

					if ($scope.screenMode == SCREEN_MODE.Update) {
						// 自動ピッキングの場合

						// 明細詳細画面に次のデータを表示
						setButtons(0);
						// [#1938][Ver2.2.0] ＳＤオーダーピッキング - 明細番号の表示不正対応 2017.06.21 honma Add Start
						$scope.searchResult.index = 0;
						// [#1938][Ver2.2.0] ＳＤオーダーピッキング - 明細番号の表示不正対応 2017.06.21 honma Add End
						$scope.searchResult.detailedItem = $scope.casePickingDetailList[0];
						$state.go('all.abstract.detail', {id: 0});

						// 同じ画面のためスクロールを上まで移動してあげる
						$ionicScrollDelegate.scrollTop();
					} else {
						// 通常のピッキング

						// 指示明細一覧画面へ遷移
						$state.go('all.abstract.detailList', $state.params);
					}
				} else {
					// エラーあり (全て登録済で該当データなし)

					if ($scope.screenMode == SCREEN_MODE.Update) {
						// 自動ピッキングの場合

						// ピッキング検索画面に遷移
						// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Add Start
						var locationPath = "wms/shipping/PickingSD/";
						$location.path(locationPath).search({})
							.search("mode", SCREEN_MODE.Read)
							.search("pickingType", $scope.pickingType);
						// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Add End
					} else {
						// 通常のピッキング

						// 指示一覧の検索処理を実行
						$scope.search();
					}
				}
			} else if ($state.current.name == 'all.abstract.detailList') {
				// 指示明細一覧画面からの検索 (画面スクロール)

				if (page == 1) {
					// 初期検索のためスクロールを上まで移動してあげる
					$ionicScrollDelegate.scrollTop();
				}
				// 指示明細一覧画面からの検索 (画面スクロール)の場合、何もしない
			} else if ($state.current.name == 'all.abstract.list') {
				// 指示一覧画面からの検索の場合

				// [#1833][Ver2.2.0] 画面制御不正対応 2017.05.25 honma Mod Start
				// エラーなし
				if (noError) {

					if (page == 1) {
						// 初期検索のためスクロールを上まで移動してあげる
						$ionicScrollDelegate.scrollTop();
						// 指示明細一覧画面へ遷移
						$state.go('all.abstract.detailList', $state.params);
					}
				}
				// [#1833][Ver2.2.0] 画面制御不正対応 2017.05.25 honma Mod End
			} else {
				// 検索画面からの検索

				// エラーなし
				if (noError) {

					if (page == 1) {
						// 初期検索のためスクロールを上まで移動してあげる
						$ionicScrollDelegate.scrollTop();
						// 指示明細一覧画面へ遷移
						$state.go('all.abstract.detailList', $state.params);
					}
				}
			}
		});
	};

	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#reGetDetailPagingData
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 指示明細一覧指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.reGetDetailPagingData = function(pageSize, page) {
		// 指示明細一覧用検索条件を設定
		var request = {};
		request.data = {};
		request.data.head = $scope.searchDetailCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.detailPaging, pageSize, page);

		if(page == $scope.detailLastLoaded) {
			return
		}
		$scope.detailLastLoaded = page;

		api.casePickingSD.reSearchDetail(request).then(function(response) {
			var noError = statusInfo.isSuccessAndShowMessage(response, 'form.searchform');
			$scope.setDetailPagingData(response, page, pageSize);

			if ($state.current.name == 'all.abstract.detail') {
				// 明細画面からの検索 (登録ボタン押下後)

				if (noError) {
					// エラーなし (データあり)

					if ($scope.screenMode == SCREEN_MODE.Update) {
						// 自動ピッキングの場合

						// 明細詳細画面に次のデータを表示
						setButtons(0);
						// [#1938][Ver2.2.0] ＳＤオーダーピッキング - 明細番号の表示不正対応 2017.06.21 honma Add Start
						$scope.searchResult.index = 0;
						// [#1938][Ver2.2.0] ＳＤオーダーピッキング - 明細番号の表示不正対応 2017.06.21 honma Add End
						$scope.searchResult.detailedItem = $scope.casePickingDetailList[0];
						$state.go('all.abstract.detail', {id: 0});

						// 同じ画面のためスクロールを上まで移動してあげる
						$ionicScrollDelegate.scrollTop();
					} else {
						// 通常のピッキング

						// 指示明細一覧画面へ遷移
						$state.go('all.abstract.detailList', $state.params);
					}
				} else {
					// エラーあり (全て登録済で該当データなし)

					if ($scope.screenMode == SCREEN_MODE.Update) {
						// 自動ピッキングの場合

						// ピッキング検索画面に遷移
						// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Add Start
						var locationPath = "wms/shipping/PickingSD/";
						$location.path(locationPath).search({})
							.search("mode", SCREEN_MODE.Read)
							.search("pickingType", $scope.pickingType);
						// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Add End
					} else {
						// 通常のピッキング

						// 指示一覧の検索処理を実行
						$scope.search();
					}
				}
			} else if ($state.current.name == 'all.abstract.detailList') {
				// 指示明細一覧画面からの検索 (画面スクロール)

				if (page == 1) {
					// 初期検索のためスクロールを上まで移動してあげる
					$ionicScrollDelegate.scrollTop();
				}
				// 指示明細一覧画面からの検索 (画面スクロール)の場合、何もしない
			} else if ($state.current.name == 'all.abstract.list') {
				// 指示一覧画面からの検索の場合

				// [#1833][Ver2.2.0] 画面制御不正対応 2017.05.25 honma Mod Start
				// エラーなし
				if (noError) {

					if (page == 1) {
						// 初期検索のためスクロールを上まで移動してあげる
						$ionicScrollDelegate.scrollTop();
						// 指示明細一覧画面へ遷移
						$state.go('all.abstract.detailList', $state.params);
					}
				}
				// [#1833][Ver2.2.0] 画面制御不正対応 2017.05.25 honma Mod End
			} else {
				// 検索画面からの検索

				// エラーなし
				if (noError) {

					if (page == 1) {
						// 初期検索のためスクロールを上まで移動してあげる
						$ionicScrollDelegate.scrollTop();
						// 指示明細一覧画面へ遷移
						$state.go('all.abstract.detailList', $state.params);
					}
				}
			}
		});
	};
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#setDetailPagingData
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 指示明細一覧指定ページデータ設定処理<br>
	 *
	 * 指示明細一覧取得結果を画面項目に反映する。
	 */
	$scope.setDetailPagingData = function(response, page, pageSize) {
		// 共通指定ページデータ設定処理
		$scope.commonSetPagingData(response, page, pageSize);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		detailCount = response.data.detailCount;
		detailNum = response.data.detailNum;
		pickingNumSumUsedByLog = pickingNumSumUsedByLog;
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// 取得したデータを次の画面で表示するリストに保存
		$scope.casePickingDetailList = $scope.casePickingDetailList.concat(response.data.list);
		// まだ表示していない検索結果が残っているかを保存
		$scope.detailPaging.isExistNextPage = response.paging.isExistNextPage;
		//トータル件数を設定(全明細数)
		$scope.searchResult.detailTotalServerItems = response.paging.allRecordCount;

		$scope.searchResult.detailPreventDoubleLoad = false;

		/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add START */
		$scope.detailEventDataList = [];// 明細画面用Control設定リスト
		$scope.detailEventDataList = angular.copy($scope.casePickingDetailList);
		$scope.$broadcast('ngDetailEventData');
		/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add END */
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#commonSetPagingData
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 共通指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.commonSetPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};
	// [#1713] 各ピッキング画面遷移変更による画面追加 2017.04.24 honma Mod End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#showCustomer
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showDelivery = function(){

		var items = {
				clientCd: userInfo.clientCd,
				deliveryCd: $scope.searchCondition.tallocInstH.supplyCustomerCd
		};

		// 取引先マスタのモーダル画面を表示
		modalFactory.modalDelivery($scope, items)
		.then(function(modal) {
			$scope.openModal();
		});
	};
	$scope.$on('modalDeliveryReturn', function(ev, selectedItem) {
		$scope.searchCondition.tallocInstH.supplyCustomerCd = selectedItem.customerCd;
	});

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#showDeliveryCourse
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された配送コース情報を画面項目に反映する。
	 */
	$scope.showDeliveryCourse = function(){

		var items = {
				centerCd: userInfo.centerCd,
				deliveryCourseCd: $scope.searchCondition.deliveryCourseCd
		};

		// 配送コースマスタのモーダル画面を表示
		modalFactory.modalDeliveryCourse($scope, items)
		.then(function(modal) {
			$scope.openModal();
		});
	};
	$scope.$on('modalDeliveryCourseReturn', function(ev, selectedItem) {
		$scope.searchCondition.deliveryCourseCd = selectedItem.deliveryCourseCd;
	});

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#inputValueAllSelectOnFocus
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 入力可能項目のフォーカス処理<br>
	 *
	 * 値を全選択状態にする。
	 */
	$scope.inputValueAllSelectOnFocus = function($event) {
		owsCommon.valueAllSelectOnFocus($event);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#pickingClear
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * ピッキング解除ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、下記テーブルにデータを更新する。
	 * ・出荷指示ヘッダ
	 * ・出庫ヘッダ
	 * ・出庫ボディ
	 */
	$scope.pickingClear = function(index) {

		// 検索条件のセンタCD、荷主CD、選択行のケースピッキングNo.を検索条件に設定
		var request = {};
		request.data = {};
		request.data.head = {};
		request.data.head.centerId = $scope.searchCondition.centerId;
		request.data.head.clientId = $scope.searchCondition.clientId;
		request.data.head.casePickingNo = $scope.casePickingList[index].casePickingNo;

		// ピッキング解除チェック関数
		var checkFunc = api.casePickingSD.checkPickingClear;
		// ピッキング解除関数
		var execFunc = api.casePickingSD.pickingClear;

		// [#1812][Ver2.2.0] iOSブラウザのフリーズ対応の為、timeout1000ミリ秒設定 2017.05.23 honma Mod Start
		owsCommon.syncExec(function() {

			// ピッキング解除チェック
			checkFunc(request).then(function(checkResponse) {

				// 処理結果確認(確認ダイアログ表示)
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'form.listform')) {
					return;
				}

				// ケースピッキングデータピッキング解除
				execFunc(request).then(function(execResponse) {

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'form.listform')) {
						return;
					}

					// 登録メッセージ表示(ダイアログ表示)
					owsCommon.viewAlert(execResponse.status.messageCode, execResponse.status.messageReplaceValue);

					// 指示一覧再検索
					$scope.search();
				});
			});
		}, 1000);
		// [#1812][Ver2.2.0] iOSブラウザのフリーズ対応の為、timeout1000ミリ秒設定 2017.05.23 honma Mod End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CasePickingSD.object:CasePickingSD#register
	 * @methodOf oneslogiWms.CasePickingSD.object:CasePickingSD
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		request.data.list = [];
		request.data.list.push($scope.searchResult.detailedItem);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		request.data.detailCount = detailCount;
		request.data.detailNum = detailNum;
		request.data.pickingNumSumUsedByLog = pickingNumSumUsedByLog;
		detailNum = detailNum + 1;
		pickingNumSumUsedByLog = pickingNumSumUsedByLog + $scope.searchResult.detailedItem.sumPickingNum;
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		var checkFunc;   // 入力チェック関数
		var execFunc;    // データ登録関数

		// 新規登録関数を設定
		checkFunc = api.casePickingSD.checkExistCasePickingNo;
		execFunc = api.casePickingSD.register;

		// [#1812][Ver2.2.0] iOSブラウザのフリーズ対応の為、timeout1000ミリ秒設定 2017.05.23 honma Mod Start
		owsCommon.syncExec(function() {

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認(確認ダイアログ表示)
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'form.detailform')) {
					return;
				}

				// 登録確認
				if (owsCommon.viewConfirm("dataRegisterConfirmation")) {

					// ケースピッキングデータ更新
					execFunc(request).then(function(execResponse){

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'form.detailform')) {
							return;
						}

						// 登録メッセージ表示
						owsCommon.viewAlert(execResponse.status.messageCode, execResponse.status.messageReplaceValue);

						// 登録後の指示明細一覧データの再検索
						$scope.researchDetail();
					});
				}
			});
		}, 1000);
		// [#1812][Ver2.2.0] iOSブラウザのフリーズ対応の為、timeout1000ミリ秒設定 2017.05.23 honma Mod End
	};

	/* [#1057] SD版でもDirectiveControlを使用可能にする 2017/04/13 Dario Update START */
	$scope.$on('ngListEventDataReturn', function(ev, index, entity, gridOptions) {
//		// フラグ有無による入力可否などの設定処理
//		if (gridOptions == "listGridOptions") {
//			// 指示一覧グリッドデータ
//		} else {
//			// 指示明細一覧グリッドデータ
//		}
	});
	$scope.$on('ngDetailEventDataReturn', function(ev, index, entity) {});
	/* [#1057] SD版でもDirectiveControlを使用可能にする 2017/04/13 Dario Update END */

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
