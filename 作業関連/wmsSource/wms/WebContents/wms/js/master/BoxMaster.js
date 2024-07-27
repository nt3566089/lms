/**
 * @ngdoc overview
 * @name oneslogiWms.BoxMaster
 *
 * @description
 * 荷材マスタ画面
 */
angular.module('oneslogiWms.BoxMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.BoxMaster.service:boxMasterApi
 *
 * @description
 * 荷材マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/boxMaster/init 初期化用WebApi<br>
 * ・resources/master/boxMaster/search 検索用WebApi<br>
 * ・resources/master/boxMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/boxMaster/register 登録用WebApi<br>
 *
 */
.factory('boxMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		boxList: AngularAPIClient.make(
				[
				 ['init',   	'GET', 'resources/master/boxMasterList/init'],
				 ['search', 	'GET', 'resources/master/boxMasterList/search'],
				 ['excel',      'GET', 'resources/master/boxMasterList/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/master/boxMasterList/inputCheck'],
				 ['register', 	'POST', 'resources/master/boxMasterList/register']
				 ]
		)
	};
}])

.controller('BoxMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'boxMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.boxListCols =
		[
			//荷主センタ変更対応 201７.01.18 sja Start
		 {field:"centerCd", displayName:"センタ"},
			//荷主センタ変更対応 201７.01.18 sja End
		 {field:"boxCd", displayName:"荷材CD"},
		 {field:"boxNm", displayName:"荷材名称"},
		 {field:"delFlg", displayName:"削除フラグ"},
		//[エンハンス PH2.0]  荷材マスタの補充情報を追加 2015.11.20 sja Start
		 {field:"length", displayName:"縦(mm)"},
		 {field:"width", displayName:"横(mm)"},
		 {field:"height", displayName:"高さ(mm)"},
		 {field:"volume", displayName:"容積(mm3)"},
		 {field:"volumeRate", displayName:"容積率(%)"},
		 {field:"permitVolume", displayName:"許容容積(mm3)"},
		 {field:"permitWeight", displayName:"許容重量(g)"}
		//[エンハンス PH2.0]  荷材マスタの補充情報を追加 2015.11.20 sja End
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#initScreen
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'list',
			columnDefs: 'boxListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		//[ON推-品向-296]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
		$scope.gridSelectOptions = {
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};
		//[ON推-品向-296]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 End

		// グリッドの荷材にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"boxCd":{
					"ng-change":{
						eventFunction:"boxCdChange(row.rowIndex)"
					}
				},
				"boxNm":{
					"ng-change":{
						eventFunction:"boxNmChange(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				},
				//[エンハンス PH2.0]  荷材マスタの補充情報を追加 2015.11.20 sja Start
				"length":{
					"ng-blur":{
						eventFunction:"lengthBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"lengthChange(row.rowIndex)"
					}
				},
				"width":{
					"ng-blur":{
						eventFunction:"widthBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"widthChange(row.rowIndex)"
					}
				},
				"height":{
					"ng-blur":{
						eventFunction:"heightBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"heightChange(row.rowIndex)"
					}
				},
				"volume":{
					"ng-blur":{
						eventFunction:"volumeBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"volumeChange(row.rowIndex)"
					}
				},
				"volumeRate":{
					"ng-blur":{
						eventFunction:"volumeRateBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"volumeRateChange(row.rowIndex)"
					}
				},
				"permitVolume":{
					"ng-change":{
						eventFunction:"permitVolumeChange(row.rowIndex)"
					}
				},
				"permitWeight":{
					"ng-change":{
						eventFunction:"permitWeightChange(row.rowIndex)"
					}
				}
				//[エンハンス PH2.0]  荷材マスタの補充情報を追加 2015.11.20 sja End
		};


		statusInfo.mappingGridErrorMessage($scope.gridOptions, "boxCd",6, 5);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#initScreenHttp
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all([$scope.deferredGetDelFlg()])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#BoxBlur
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * 荷材のロストフォーカス処理<br>
	 * 荷材CDと荷材名称と削除フラグロストフォーカス時の処理。
	 */
	$scope.boxCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.boxNmChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	//[エンハンス PH2.0]  荷材マスタの補充情報を追加 2015.11.20 sja Start
	$scope.lengthChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.widthChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.heightChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.volumeChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.volumeRateChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.permitVolumeChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.permitWeightChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	//[エンハンス PH2.0]  荷材マスタの補充情報を追加 2015.11.20 sja End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
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
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#deferredGetInitData
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * 荷材マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.boxList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.list = response.data.list;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.head.mcenter.centerCd = userInfo.centerCd;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

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
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#search
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		$scope.getSearchData();
	};

	// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana Start
	var centerId;
	// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#getSearchData
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		api.boxList.search(request).then(function(response) {

			// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana Start
			centerId = userInfo.centerIdByCd($scope.head.mcenter.centerCd);
			// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana End
			statusInfo.isSuccessAndShowMessage(response,'searchinputform')
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#setSearchData
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
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

		// [ON推-品向-343] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-343] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.list = response.data.list;
		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.list.length; row++) {
			if ($scope.list[row].boxId != null){
				gridDirectiveControl.editable($scope.gridOptions, 'boxCd', false, row);
				gridDirectiveControl.editable($scope.gridOptions, 'mcenter.centerCd', false, row);
			}
		}
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	//[エンハンス PH2.0]  荷材マスタの補充情報を追加 2015.11.20 sja Start
	$scope.lengthBlur = function(rowIndex) {

		// 縦(mm)
		var length = $scope.list[rowIndex].length;

		// 横(mm)
		var width = $scope.list[rowIndex].width;

		// 高さ(mm)
		var height = $scope.list[rowIndex].height;
		// [#7216][OSS] 容積の自動計算を修正 2020.03.10 tsuboi Start
		if(length == null || width == null || height == null){
			$scope.list[rowIndex].volume = null;
		}else if(checkErrorNum(length) || checkErrorNum(width) || checkErrorNum(height)){
			$scope.list[rowIndex].volume = null;
		}else{
			$scope.list[rowIndex].volume = owsCommon.multiply(length, width, height);
		}
		// [#7216][OSS] 容積の自動計算を修正 2020.03.10 tsuboi End
		// [1.1.4-CT-102] 縦の値変更場合、許容容積を再度計算する 2016.06.10 nayzaw Start
		$scope.volumeBlur(rowIndex);
		// [1.1.4-CT-102] 縦の値変更場合、許容容積を再度計算する 2016.06.10 nayzaw End
	};

	$scope.widthBlur = function(rowIndex) {

		// 縦(mm)
		var length = $scope.list[rowIndex].length;

		// 横(mm)
		var width = $scope.list[rowIndex].width;

		// 高さ(mm)
		var height = $scope.list[rowIndex].height;

		// [#7216][OSS] 容積の自動計算を修正 2020.03.10 tsuboi Start
		if(length == null || width == null || height == null){
			$scope.list[rowIndex].volume = null;
		}else if(checkErrorNum(length) || checkErrorNum(width) || checkErrorNum(height)){
			$scope.list[rowIndex].volume = null;
		}else{
			$scope.list[rowIndex].volume = owsCommon.multiply(length, width, height);
		}
		// [#7216][OSS] 容積の自動計算を修正 2020.03.10 tsuboi End
		// [1.1.4-CT-102] 横の値変更場合、許容容積を再度計算する 2016.06.10 nayzaw Start
		$scope.volumeBlur(rowIndex);
		// [1.1.4-CT-102] 横の値変更場合、許容容積を再度計算する 2016.06.10 nayzaw End
	};

	$scope.heightBlur = function(rowIndex) {

		// 縦(mm)
		var length = $scope.list[rowIndex].length;

		// 横(mm)
		var width = $scope.list[rowIndex].width;

		// 高さ(mm)
		var height = $scope.list[rowIndex].height;

		// [#7216][OSS] 容積の自動計算を修正 2020.03.10 tsuboi Start
		if(length == null || width == null || height == null){
			$scope.list[rowIndex].volume = null;
		}else if(checkErrorNum(length) || checkErrorNum(width) || checkErrorNum(height)){
			$scope.list[rowIndex].volume = null;
		}else{
			$scope.list[rowIndex].volume = owsCommon.multiply(length, width, height);
		}
		// [#7216][OSS] 容積の自動計算を修正 2020.03.10 tsuboi End
		// [1.1.4-CT-102] 高さの値変更場合、許容容積を再度計算する 2016.06.10 nayzaw Start
		$scope.volumeBlur(rowIndex);
		// [1.1.4-CT-102] 高さの値変更場合、許容容積を再度計算する 2016.06.10 nayzaw End
	};

	$scope.volumeBlur = function(rowIndex) {

		// 容積(mm3)
		var volume = $scope.list[rowIndex].volume;
		// 容積率(%)
		var volumeRate = $scope.list[rowIndex].volumeRate;

		// [#7216][OSS] 許容容積の自動計算を修正 2020.03.10 tsuboi Start
		if(volume == null || volumeRate == null ){
			$scope.list[rowIndex].permitVolume = null;
		}else if(checkErrorNum(volume) || checkErrorNum(volumeRate)){
			$scope.list[rowIndex].permitVolume = null;
		}else{
			$scope.list[rowIndex].permitVolume = owsCommon.divide(owsCommon.multiply(volume, volumeRate), 100);
		}
		// [#7216][OSS] 許容容積の自動計算を修正 2020.03.10 tsuboi End
	};

	$scope.volumeRateBlur = function(rowIndex) {

		// 容積(mm3)
		var volume = $scope.list[rowIndex].volume;
		// 容積率(%)
		var volumeRate = $scope.list[rowIndex].volumeRate;

		// [#7216][OSS] 許容容積の自動計算を修正 2020.03.10 tsuboi Start
		if(volume == null || volumeRate == null ){
			$scope.list[rowIndex].permitVolume = null;
		}else if(checkErrorNum(volume) || checkErrorNum(volumeRate)){
			$scope.list[rowIndex].permitVolume = null;
		}else{
			$scope.list[rowIndex].permitVolume = owsCommon.divide(owsCommon.multiply(volume, volumeRate), 100);
		}
		// [#7216][OSS] 許容容積の自動計算を修正 2020.03.10 tsuboi End
	};
	//[エンハンス PH2.0]  荷材マスタの補充情報を追加 2015.11.20 sja End

	// [#7216][OSS] 自動計算前の入力値チェックを行うメソッドを追加 2020.03.10 tsuboi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#checkErrorNum
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 */
	var checkErrorNum = function(size){
		// 文字以外でtrue
		if(isNaN(size)) return true;
		// 0未満でtrue
		if(size < 0) return true;
		// 指数でtrue
		if(size.toString().indexOf("e") > -1) return true;
		// 先頭文字0判定
		var isSizeFirstNumZero = size.toString().substring(0,1) == 0 ? true : false;
		// 小数以外判定
		var isNotSizeDecimal = size.toString().indexOf(".") == -1 ? true : false;
		// 先頭文字0且つ小数以外でtrue
		return isSizeFirstNumZero && isNotSizeDecimal;
	};
	// [#7216][OSS] 自動計算前の入力値チェックを行うメソッドを追加 2020.03.10 tsuboi End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#getClassForRow
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#excelOutput
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
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
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.boxList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#addRow
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function() {

		// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana Start
		var addRow = angular.copy($scope.blankRow);
		addRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		// [#1798] 行追加のセンタCDを検索結果に合わせて変更 2017.05.31 kawana Start
		if (0 < $scope.list.length) {
			addRow.mcenter.centerCd = $scope.list[0].mcenter.centerCd;
		} else {
			addRow.mcenter.centerCd = userInfo.centerCd;
		}
		addRow.centerId = userInfo.centerIdByCd(addRow.mcenter.centerCd);
		// [#1798] 行追加のセンタCDを検索条件のセンタCDに変更 2017.05.31 kawana End
		$scope.list.push(addRow);
		// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana End

		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.list.length-1);
		gridDirectiveControl.editable($scope.gridOptions, 'mcenter.centerCd', false, $scope.list.length-1);

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#removeRow
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
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
			if ($scope.list.indexOf(row) > -1) {
				if (row.boxId != null) {
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
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].boxCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].boxCd != null)||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].boxNm !=""&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].boxNm != null)
				||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
				item++;
			}
		}
		if(item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			// 複数行の場合に警告
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
	    // [横並-053] チェック順変更 2014.11.21 taoys End

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.list.indexOf(row) > -1) {
				$scope.list.splice($scope.list.indexOf(row), 1);
			}
		});

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#register
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
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
//		del  by  qiuy 2014/08/19 start
		// 空行判定
//		for (var row = 0; row < $scope.list.length; row++) {
//		if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//		// 空行への検証機能を解除
//		gridDirectiveControl.validity($scope.gridOptions, false, row);
//		// 空行を退避
//		emptyBody.push($scope.list[row]);
//		} else {
//		// 空行以外を退避
//		listBody.push($scope.list[row]);
//		}
//		}
//		del  by  qiuy 2014/08/19 end

		//add  by  qiuy 2015/08/19 start
		if($scope.list.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		for (var row = 0; row < $scope.list.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
				// 空行を退避
				emptyBody.push($scope.list[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.list[row]);
			}else {

				// 空行以外を退避
				listBody.push($scope.list[row]);
			}
		}
		//add  by  qiuy 2015/08/19 end


		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行への検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				//[Ver3.0][#2078] 空行削除の処理順を変更 2017.10.17 miyabe delete

				// 荷材CD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.list.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var boxCd = $scope.list[row].boxCd;
						for (var i = row+1; i < $scope.list.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.list[i].boxCd == boxCd){
									rowIndex[j] =i;
									// [ON推-品向-783] 入力系グリッドのチェックを修正(不要なコード削除) 2015.05.27 SJA
									j++;
								}
							}
						}
					}
				}
	//			mod  by  qiuy 2014/08/19 end
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
					// エラーメッセージCD
					var messageCd = "boxCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "boxCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正(不要なコード削除) 2015.05.27 SJA

				//[Ver3.0][#2078] 空行削除の処理順を変更 2017.10.17 miyabe Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.list.splice($scope.list.indexOf(row), 1);
				});
				//[Ver3.0][#2078] 空行削除の処理順を変更 2017.10.17 miyabe End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.list = listBody;

				// 入力チェック
				api.boxList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 荷材マスタデータ登録または更新
					api.boxList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.initScreenHttp();

						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
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

	//画面初期化処理を実行
	$scope.initScreen();

}]);
