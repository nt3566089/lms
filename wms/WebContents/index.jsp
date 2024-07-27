<!-- ※※※※※※※※※※※※※※※※※※※※※※※※※※ -->
<!-- このソースは基盤ソースです。変更は行わないで下さい。 -->
<!-- ※※※※※※※※※※※※※※※※※※※※※※※※※※ -->


<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="static com.oneslogi.base.jsp.JspControl.*"%>

<%
	// 認証状態チェック処理
	if (!isAuth(request, response)) {
		return;
	}
%>

<!DOCTYPE html>


<html ng-app="oneslogiWeb.Main" xmlns:ng="http://angularjs.org" id="ng-app">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<title>ONEsLOGIWeb Template</title>

<link rel="icon" href="base/image/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="base/image/apple-touch-icon.png" sizes="180x180">

<link rel="stylesheet" href="base/css/bootstrap-3.1.1/bootstrap.min.css">

<link rel="stylesheet" href="base/css/ui-grid-4.8.1/ui-grid.min.css">

<link rel="stylesheet" href="base/css/common.min.css">

<link rel="stylesheet" href="base/css/AngularOverlay/styles.min.css">

<jsp:include page="includeCSS.jsp" />
</head>


<body ng-controller="OneslogiWebMainCtrl" owd-body>

	<div id="wrap">

		
		<nav id="navbar" class="navbar navbar-default navbar-fixed-top" role="navigation" ng-cloak>
			<div class="container">
				<div ng-controller="NavCtrl" ng-show="userInfo.init">
					<div class="navbar-header">
						<label class="navbar-brand">
							<span ng-bind-html="screenTitle"></span>
						</label>
						
						<button class="navbar-toggle" type="button" ng-click="navbar.isCollapsed = !navbar.isCollapsed">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					</div>
					<div class="navbar-collapse" collapse="navbar.isCollapsed">
						
						<ul class="nav navbar-nav navbar-right">
							<jsp:include page="includeMenu.jsp" />
							<li>
								<a ng-href="#" ng-click="navbar.isCollapsed = true">
									<span ng-bind-html="'mainMenuTitle' | owfMessage"></span>
								</a>
							</li>
							
							<li class="dropdown" ng-repeat="menuHead in bMenuGroup">
								
								<a class="dropdown-toggle" data-toggle="dropdown" href="#">
									<span ng-bind-html="menuHead.vdict.dictNm"></span>
									<span class="caret"></span>
								</a>
								
								<ul class="dropdown-menu dropdown-nav-menu">
									<li ng-repeat="menu in menuHead.bmenuList">
										<a ng-href="{{menu.urlPath}}" target="{{targetWindow(menu.targetWindow,menu.bscreen.screenCd)}}" ng-click="navbar.isCollapsed = true">
											<span ng-bind-html="menu.vdict.dictNm"></span>
										</a>
									</li>
								</ul>
							</li>
							
							<li>
								
								<a class="dropdown-toggle" data-toggle="dropdown" href="#">
									<span ng-bind-html="userInfo.userNm"></span>
									<span class="caret"></span>
								</a>
								
								<ul class="dropdown-menu">
									
									<li ng-show="userCanChangePassword">

										<a ng-show="authMode=='2'" ng-click="showPasswordChangeDialog()" tabindex="0" style="cursor:pointer" ng-keyup="$event.keyCode == 13 ? showPasswordChangeDialog() : null">
											<span ng-bind-html="'passwordTitle' | owfMessage"></span>
										</a>
									</li>


									
									
									<li ng-show="userHasSelectableAutoPrintLayouts && visibleUserAutoPrintSetting">
									
										<a ng-click="showUserAutoPrintSettingListDialog()" tabindex="0" style="cursor:pointer" ng-keyup="$event.keyCode == 13 ? showUserAutoPrintSettingListDialog() : null">
											
											<span ng-bind-html="'userAutoPrintSettingList' | owfMessage"></span>
											
										</a>
									</li>


									
									<li ng-show="hasTerminalMaster && visibleTerminalSetting">
										<a ng-click="showTerminalSettingDialog()" tabindex="0" style="cursor:pointer" ng-keyup="$event.keyCode == 13 ? showTerminalSettingDialog() : null">
											<span ng-bind-html="'terminalSetting' | owfMessage"></span>
										</a>
									</li>


									
									<li ng-show="userHasSelectableAutoPrintLayouts && visibleUserAutoPrintSetting && terminal && terminal.terminalCd">
										<a ng-click="showTerminalAutoPrintSettingListDialog()" tabindex="0" style="cursor:pointer" ng-keyup="$event.keyCode == 13 ? showTerminalAutoPrintSettingListDialog() : null">
											
											<span ng-bind-html="'terminalAutoPrintSettingList' | owfMessage"></span>
											
										</a>
									</li>




									
									<li>
										<a ng-href="resources/logout">
											<span ng-bind-html="'logoutTitle' | owfMessage"></span>
										</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</nav>

		
		<div id="alert" class="container" ng-controller="AlertCtrl" ng-cloak>
			<div class="row" ng-show="!modalView">
				<div class="col-xs-12">
					<alert ng-repeat="alert in alerts | orderBy:'addDt':true" ng-show="$first" type="alert.type" close="closeAlert(alert.id, $first)" class="alertblink">
						<span ng-bind-html="alert.msg"></span>
						<a href="" class="alert-link" ng-click="viewAlertToggle()">
							<span class="badge btn-info pull-right common-margin" ng-show="alerts.length > 1">{{alerts.length}}</span>
						</a>
						<span class="pull-right common-margin" ng-bind-html="alert.addDt | date:'medium'"></span>
					</alert>
					<alert ng-repeat="alert in alerts | orderBy:'addDt':true" ng-show="isViewAlert && !$first" type="alert.type" close="closeAlert(alert.id)" class="alert-sub">
						<span ng-bind-html="alert.msg"></span>
						<span class="pull-right common-margin" ng-bind-html="alert.addDt | date:'medium'"></span>
					</alert>
				</div>
			</div>
		</div>

		
		<div id="contents" class="container" ng-cloak ng-show="!networkError" ng-view></div>

		
		<div id="errorcontents" class="container" ng-cloak ng-show="networkError">
			<h2 class="text-danger">
				<span ng-bind-html="'httpConnectionErrorTitle' | owfMessage"></span>
			</h2>
			<div ng-repeat="status in connectionStatus">
				<div ng-show="!status.httpError" class="panel panel-danger">
					<div class="panel-heading">
						<span ng-bind-html="status.name | owfMessage"></span>
					</div>
					<div class="panel-body">
						<dl class="dl-horizontal">
							<dt>
								<span ng-bind-html="'userMessage' | owfMessage"></span>
							</dt>
							<dd>
								<span ng-bind-html="status.messageCode | owfMessage:status.messageReplaceValue"></span>
							</dd>
							<dt>
								<span ng-bind-html="'statusCode' | owfMessage"></span>
							</dt>
							<dd>
								<span ng-bind-html="status.statusCode"></span>
							</dd>
							<dt>
								<span ng-bind-html="'developerMessage' | owfMessage"></span>
							</dt>
							<dd>
								<span ng-bind-html="status.developerMessage"></span>
							</dd>
							<dt ng-show="!!status.moreInfo">
								<span ng-bind-html="'moreInfo' | owfMessage"></span>
							</dt>
							<dd ng-show="!!status.moreInfo">
								<a ng-href="{{status.moreInfo}}" target="_blank">
									<span ng-bind-html="status.moreInfo"></span>
								</a>
							</dd>
						</dl>
					</div>
				</div>
				<div ng-show="status.httpError" class="panel panel-danger">
					<div class="panel-heading">
						<span ng-bind-html="status.name | owfMessage"></span>
					</div>
					<div class="panel-body">
						<dl class="dl-horizontal">
							<dt>
								<span ng-bind-html="'statusCode' | owfMessage"></span>
							</dt>
							<dd>{{status.statusCode}}</dd>
						</dl>
					</div>
				</div>
			</div>
		</div>

		
		<div id="push"></div>
	</div>
	<jsp:include page="includeCopyright.jsp" />

	<div data-wc-overlay="" data-wc-overlay-delay="500">
		<br>
		<img src="<%=appendFileUpdateDt("base/image/AngularOverlay/spinner.gif", request)%>">&nbsp;&nbsp;Loading
	</div>

	
	<script src="base/js/jquery-1.11.0/jquery-1.11.0.min.js"></script>

	<script src="base/js/jquery.base64-0.0.1/jquery.base64.min.js"></script>

	<script src="base/js/zlib-0.2.0/zlib.min.js"></script>

	<script src="base/js/decimal.js-7.3.0/decimal.min.js"></script>

	<script src="base/js/angular-1.2.16/angular.min.js"></script>

	<script src="base/js/angular-dynamic-locale-0.1.32/tmhDynamicLocale.min.js"></script>

	<script src="base/js/ui-bootstrap-0.10.0/ui-bootstrap-tpls-0.10.0.min.js"></script>

	<script src="base/js/ui-utils-0.1.1/ui-utils.min.js"></script>

	<script src="base/js/ui-grid-4.8.1/ui-grid.min.js"></script>

	<script src="base/js/angular-bootstrap-multiselect-1.1.11/angular-bootstrap-multiselect.min.js"></script>

	<script src="base/js/jquery-file-upload-9.5.7/jquery.fileupload.min.js"></script>

	<script src="base/js/AngularOverlay/wcAngularOverlay.min.js"></script>

	<script src="base/js/Chart.js-2.3.0/Chart.min.js"></script>

	<script src="base/js/angular-chart-1.0.3/angular-chart.min.js"></script>

	<script src="base/js/angular-api-client/angular-api-client.min.js"></script>

	<script src="<%= appendFileUpdateDt("base/js/designMode.js", request) %>"></script>
	<script src="<%= appendFileUpdateDt("base/js/parameter.js", request) %>"></script>

	<script src="base/js/oneslogi.base.min.js"></script>

	<script src="base/js/oneslogi.base.liteLogin.min.js"></script>

	
	<script src="base/js/oneslogi.base.master.min.js"></script>

	
	<script src="base/js/oneslogi.base.operation.min.js"></script>

	<jsp:include page="includeDepends.jsp" />

	<script src="base/js/oneslogi.web.main.min.js"></script>

	<jsp:include page="includeJS.jsp" />
</body>
</html>