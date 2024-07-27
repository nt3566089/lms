angular.module('oneslogiWms.Assist',
		[
		 'oneslogiWms.ProductMasterSearch'
 		// ミドリ安全様向けカスタマイズ対応 JANCD検索画面作成 20240529 Jeongmin ADD [S]
		,'oneslogiWms.ProductMasterJanSearch'
		// ミドリ安全様向けカスタマイズ対応 JANCD検索画面作成 20240529 Jeongmin ADD [E]
		,'oneslogiWms.VendorMasterSearch'
		,'oneslogiWms.DeliveryCourseSearch'
		,'oneslogiWms.DeliveryMasterSearch'
		,'oneslogiWms.LocationMasterSearch'
		,'oneslogiWms.ZipMasterSearch'
		 ]
);