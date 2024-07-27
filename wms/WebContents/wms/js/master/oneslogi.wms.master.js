angular.module('oneslogiWms.Master',
		[
		 'oneslogiWms.WarehouseMaster',
		 'oneslogiWms.LocationBarcodeListPrint',
		 'oneslogiWms.CenterClassList',
		 'oneslogiWms.CenterClassEdit',
		 'oneslogiWms.CenterClassGrpEdit',
		 'oneslogiWms.CenterClassGrpDtlEdit',
		 'oneslogiWms.ClientMaster',
		 //[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
		 'oneslogiWms.CarrierMasterList',
		 'oneslogiWms.CarrierMasterEdit',
		 //[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
		 'oneslogiWms.LocationMaster',
		 // 2016.02.26 Pan 一覧編集 ※4 Start
		 'oneslogiWms.LocationMasterEdit',
		 // 2016.02.26 Pan 一覧編集 ※4 End
		 'oneslogiWms.DeliveryCourseMasterList',
		 'oneslogiWms.DeliveryCourseMasterEdit',
		 'oneslogiWms.CustomerMasterList',
		 'oneslogiWms.CustomerMasterEdit',
		 'oneslogiWms.ZoneMaster',
		 'oneslogiWms.CarrierSlipYmtMaster',
		 // 2016.03.03 Zhang 一覧編集 ※4 Start
		 'oneslogiWms.CarrierSlipYmtMasterEdit',
		 'oneslogiWms.CarrierSlipSgwMasterEdit',
		 'oneslogiWms.CarrierSlipYupkMasterEdit',
		 // 2016.03.03 Zhang 一覧編集 ※4 Start
		 'oneslogiWms.CarrierSlipYupkMaster',
		 'oneslogiWms.CarrierSlipSgwMaster',
		 'oneslogiWms.ProcessTypeMaster',
		 'oneslogiWms.StockTypeMaster',
		 'oneslogiWms.ProductMasterList',
		 // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start
		 'oneslogiWms.ProductMasterListNum',
		 //[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End
		 'oneslogiWms.ZipMaster',
		 // 2016.02.23 Zhang 一覧編集 ※4 Start
		 'oneslogiWms.ZipMasterEdit',
		 'oneslogiWms.ParameterMasterEdit',
		 // 2016.02.23 Zhang 一覧編集 ※4 End
		 'oneslogiWms.ProductMasterEdit',
		 'oneslogiWms.BoxMaster',
		 'oneslogiWms.CenterMasterEdit',
		 'oneslogiWms.CenterMasterList',
		 // ミドリ安全様向けカスタマイズ対応 預り商品マスタメンテナンス(一覧)画面作成 2024.7.8 張 Add [S]
		 'oneslogiWms.DepositProductMasterList',
		 // ミドリ安全様向けカスタマイズ対応 預り商品マスタメンテナンス(一覧)画面作成 2024.7.8 張 Add [E]
		 // ミドリ安全様向けカスタマイズ対応 預り商品マスタメンテナンス(編集)画面作成 2024.7.8 張 Add [S]
		 'oneslogiWms.DepositProductMasterEdit',
		 // ミドリ安全様向けカスタマイズ対応 預り商品マスタメンテナンス(編集)画面作成 2024.7.8 張 Add [E]
		 'oneslogiWms.UserEdit',
	     'oneslogiWms.CenterClientScreenMaster',
		 'oneslogiWms.CenterClientScreenItemMaster',
		 'oneslogiWms.CenterClientScreenColMaster',
		 'oneslogiWms.EdiEdit',
		 'oneslogiWms.EdiList',
		 'oneslogiWms.MatchingMaster',
		 'oneslogiWms.ProductMasterBulkInput',
		 'oneslogiWms.ImportTypeMasterList',
		 'oneslogiWms.ImportTypeMasterEdit',
		 'oneslogiWms.ImportTypeBCopyColumnInput',
		 'oneslogiWms.CustomerMasterBulkInput',
		 'oneslogiWms.SetStructureEdit',
		 'oneslogiWms.SetStructureSearch',
		 'oneslogiWms.ShapeMaster',
		 'oneslogiWms.ProductShapeMasterBulkInput',
		 'oneslogiWms.LocationMasterBulkInput',
		 'oneslogiWms.BoxGroupMasterList',
		 'oneslogiWms.BoxGroupMasterEdit',
		// [Ver3.0] unit of measure対応 2017.11.21 PYM Start
		 'oneslogiWms.ShapeGroupMasterList',
		 'oneslogiWms.ShapeGroupMasterEdit',
		// [Ver3.0] unit of measure対応 2017.11.21 PYM End
		//キャリアEDIシステム(CES)連携対応 2018.01.15 LSW Start
		 'oneslogiWms.CarrierSlipCESMaster',
		 'oneslogiWms.CarrierSlipCESMasterEdit',
		//キャリアEDIシステム(CES)連携対応 2018.01.15 LSW End
		 'oneslogiWms.NumberingCenterMaster',
		// [#2166] 2017.8.4 ase Start
		 'oneslogiWms.CenterRelatedCopy',
		// [#2166] 2017.8.4 ase End
		// [#2873] [HTマスタ化対応]  HT辞書カルチャマスタメンテナンス画面追加 2017.10.18 fujiwara Start
		 'oneslogiWms.HTDictCultureMaster',
		// [#2873] [HTマスタ化対応]  HT辞書カルチャマスタメンテナンス画面追加 2017.10.18 fujiwara End
		// [#2873] [HTマスタ化対応]  HTメッセージマスタメンテナンス画面追加 2017.10.24 fujiwara Start
		 'oneslogiWms.HTMessageMaster',
		// [#2873] [HTマスタ化対応]  HTメッセージマスタメンテナンス画面追加 2017.10.24 fujiwara End
		// [#2873] [HTマスタ化対応]  HT辞書マスタメンテナンス画面追加 2017.10.26 fujiwara Start
		 'oneslogiWms.HTDictMaster',
		// [#2873] [HTマスタ化対応]  HT辞書マスタメンテナンス画面追加 2017.10.26 fujiwara End
		// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 2017.12.05 honma Add Start
		 'oneslogiWms.UserMasterList',
		// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 2017.12.05 honma Add End
		// [#5145] [Ver3.1]  WEBHT管理マスタメンテナンス画面追加 2018.07.23  takeda Start
		 'oneslogiWms.WebHTinfoMaster',
		// [#5145] [Ver3.1]  WEBHT管理マスタメンテナンス画面追加 2018.07.23  takeda End
		// [#5237] [Ver3.1]  郵便番号マスタ一括取込画面追加 2018.08.21  takeda Start
		'oneslogiWms.ZipMasterBulkInput'
		// [#5237] [Ver3.1]  郵便番号マスタ一括取込画面追加 2018.08.21  takeda End
		 ]
);