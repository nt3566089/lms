angular.module('oneslogiWms.Stock',
		[
		 'oneslogiWms.StockList',
		// [ver3.0] [#3138] 在庫問合せ(参照)画面新規作成 2017.12.26 matsumoto Start
		 'oneslogiWms.ReferenceStockList',
		 // [ver3.0] [#3138] 在庫問合せ(参照)画面新規作成 2017.12.26 matsumoto End
	     'oneslogiWms.StockInOutList',
		 'oneslogiWms.StockAdj',
		 'oneslogiWms.StockMove',
		 'oneslogiWms.TotalStockList',
		 // [Ver3.0][#3137] トータル在庫問合せ（参照）追加 2017.12.25 Shimizu Add Start
		 'oneslogiWms.ReferenceTotalStockList',
		 // [Ver3.0][#3137] トータル在庫問合せ（参照）追加 2017.12.25 Shimizu Add End
		 'oneslogiWms.MoveLabelPrint',
		 'oneslogiWms.StockSetInst',
		 'oneslogiWms.StockSetRelease',
		 'oneslogiWms.StockMoveList',
		 'oneslogiWms.StockMoveInstList',
		 'oneslogiWms.StockSetInstListPrint',
		 'oneslogiWms.StockSetReleaseListPrint',
		 'oneslogiWms.ReplenishInstList',
		 // [C-CWMS-0057] 在庫移動明細一覧画面一覧 2016.8.15 ATK Start
		 'oneslogiWms.StockMoveBodyList',
		 // [C-CWMS-0057] 在庫移動明細一覧画面一覧 2016.8.15 ATK End

		 //シリアル管理機能追加 2017.02.20 sja Start
		 'oneslogiWms.SerialNoList',
		 'oneslogiWms.SerialNoBulkInput',
		 //シリアル管理機能追加 2017.02.20 sja End
		 // 履歴検索 在庫移動履歴画面新規作成 2016.6.21 Kudo Add Start
		 'oneslogiWms.StockMoveHistory',
		 // 履歴検索 在庫移動履歴画面新規作成 2016.6.21 Kudo Add End
		 // [#2233] 在庫一括移動指示機能追加 2017.08.16 Ase Add Start
		 'oneslogiWms.StockBulkMove'
		 // [#2233] 在庫一括移動指示機能追加 2017.08.16 Ase Add End

		 ]
);