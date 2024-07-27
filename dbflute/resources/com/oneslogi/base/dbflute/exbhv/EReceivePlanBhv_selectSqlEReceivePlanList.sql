/*
 [df:title]
 入荷予定一括取込一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!Long cultureId!!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT ERP.RECEIVE_CD
	  ,ERP.RECEIVE_PLAN_ID
	  ,ERP.RECEIVE_ROW_ID
	  ,ERP.IMPORT_FLG
	  ,ERP.ERROR_FLG
	  ,ERP.ERROR_MESSAGE_CD
-- 20240508 初回コンパイルを通す為削除	  ,ERP.CLIENT_CD
-- 20240508 初回コンパイルを通す為削除	  ,ERP.CENTER_CD
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_CLIENT_RECEIVE_NO
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_SUPPLIER_CD
-- 20240508 初回コンパイルを通す為削除	  ,ERP.VERSION_NO
-- 20240508 初回コンパイルを通す為削除	  ,ERP.CONTROL_NO
-- 20240508 初回コンパイルを通す為削除	  ,MC_0.CUSTOMER_NM
-- 20240508 初回コンパイルを通す為削除	  ,MC_0.CUSTOMER_ABBR
-- 20240508 初回コンパイルを通す為削除	  ,ERP.RECEIVE_PLAN_DT
-- 20240508 初回コンパイルを通す為削除	-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PROCESS_TYPE_CD
-- 20240508 初回コンパイルを通す為削除	-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
-- 20240508 初回コンパイルを通す為削除	-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
-- 20240508 初回コンパイルを通す為削除	  ,VD_0.DICT_NM AS PROCESS_TYPE_NM
-- 20240508 初回コンパイルを通す為削除	-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
-- 20240508 初回コンパイルを通す為削除	-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
-- 20240508 初回コンパイルを通す為削除	  ,ERP.STOCK_TYPE_CD
-- 20240508 初回コンパイルを通す為削除	-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
-- 20240508 初回コンパイルを通す為削除	-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
-- 20240508 初回コンパイルを通す為削除	  ,VD_1.DICT_NM AS STOCK_TYPE_NM
-- 20240508 初回コンパイルを通す為削除	-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
-- 20240508 初回コンパイルを通す為削除	-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_DEPOSIT_CD
-- 20240508 初回コンパイルを通す為削除	-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
-- 20240508 初回コンパイルを通す為削除	  ,MC_1.CUSTOMER_NM AS PLAN_DEPOSIT_NM
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PRODUCT_CD
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.PRODUCT_NM
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.PRODUCT_ABBR
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.JAN_CD
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.LOT_MANAG_FLG  -- // cls(LotManagFlg)
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.LIMIT_DT_MANAG_FLG  -- // cls(LimitDtManagFlg)
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_NUM
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_WAREHOUSE_CD
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_LOCATION_CD
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_LOT
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_LIMIT_DT
-- 20240508 初回コンパイルを通す為削除	  ,ERP.PLAN_CLIENT_ORDER_NO
-- 20240508 初回コンパイルを通す為削除	  ,BM_0.MESSAGE_NM
-- 20240508 初回コンパイルを通す為削除	  ,LCS_0.LOCATION_ID
-- 20240508 初回コンパイルを通す為削除	  ,LCS_0.WAREHOUSE_CD AS LCS_WAREHOUSE_CD
-- 20240508 初回コンパイルを通す為削除-- [#2253]予備項目対応 2017.08.18 sampei Start
-- 20240508 初回コンパイルを通す為削除	  ,ERP.SPARE_STR_1
-- 20240508 初回コンパイルを通す為削除	  ,ERP.SPARE_STR_2
-- 20240508 初回コンパイルを通す為削除	  ,ERP.SPARE_STR_3
-- 20240508 初回コンパイルを通す為削除	  ,ERP.SPARE_NUM_1
-- 20240508 初回コンパイルを通す為削除	  ,ERP.SPARE_NUM_2
-- 20240508 初回コンパイルを通す為削除	  ,ERP.SPARE_NUM_3
-- [#2253]予備項目対応 2017.08.18 sampei End

-- ELSE SELECT COUNT(*)
/*END*/
	FROM E_RECEIVE_PLAN ERP
-- 20240508 初回コンパイルを通す為削除		INNER JOIN M_CLIENT MCL_0
-- 20240508 初回コンパイルを通す為削除			ON MCL_0.CLIENT_CD = ERP.CLIENT_CD
-- 20240508 初回コンパイルを通す為削除		INNER JOIN M_CENTER MCN_0
-- 20240508 初回コンパイルを通す為削除			ON ERP.CENTER_CD = MCN_0.CENTER_CD
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_CUSTOMER MC_0
-- 20240508 初回コンパイルを通す為削除			ON ERP.PLAN_SUPPLIER_CD = MC_0.CUSTOMER_CD
-- 20240508 初回コンパイルを通す為削除			AND MCL_0.CLIENT_ID = MC_0.CLIENT_ID
-- 20240508 初回コンパイルを通す為削除			AND MC_0.VENDOR_FLG = '1'
-- 20240508 初回コンパイルを通す為削除			AND MC_0.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_PROCESS_TYPE MPT
-- 20240508 初回コンパイルを通す為削除			-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
-- 20240508 初回コンパイルを通す為削除			ON MPT.PROCESS_TYPE_CD = ERP.PROCESS_TYPE_CD
-- 20240508 初回コンパイルを通す為削除			-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
-- 20240508 初回コンパイルを通す為削除			AND MPT.RECEIVE_FLG = '1'
-- 20240508 初回コンパイルを通す為削除			AND MPT.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN V_DICT VD_0
-- 20240508 初回コンパイルを通す為削除			ON VD_0.DICT_ID = MPT.DICT_ID
-- 20240508 初回コンパイルを通す為削除			AND (VD_0.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD_0.CULTURE_ID IS NULL)
-- 20240508 初回コンパイルを通す為削除		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_STOCK_TYPE MST
-- 20240508 初回コンパイルを通す為削除			-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
-- 20240508 初回コンパイルを通す為削除			ON MST.STOCK_TYPE_CD = ERP.STOCK_TYPE_CD
-- 20240508 初回コンパイルを通す為削除			-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
-- 20240508 初回コンパイルを通す為削除			AND MST.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN V_DICT VD_1
-- 20240508 初回コンパイルを通す為削除			ON VD_1.DICT_ID = MST.DICT_ID
-- 20240508 初回コンパイルを通す為削除			AND (VD_1.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD_1.CULTURE_ID IS NULL)
-- 20240508 初回コンパイルを通す為削除		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_CUSTOMER MC_1
-- 20240508 初回コンパイルを通す為削除			-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
-- 20240508 初回コンパイルを通す為削除			ON ERP.PLAN_DEPOSIT_CD = MC_1.CUSTOMER_CD
-- 20240508 初回コンパイルを通す為削除			-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
-- 20240508 初回コンパイルを通す為削除			AND MC_1.CLIENT_ID = MCL_0.CLIENT_ID
-- 20240508 初回コンパイルを通す為削除			AND MC_1.DEPOSIT_FLG = '1'
-- 20240508 初回コンパイルを通す為削除			AND MC_1.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_PRODUCT MP_0
-- 20240508 初回コンパイルを通す為削除			ON MP_0.PRODUCT_CD = ERP.PRODUCT_CD
-- 20240508 初回コンパイルを通す為削除			AND MP_0.CLIENT_ID = MCL_0.CLIENT_ID
-- 20240508 初回コンパイルを通す為削除			AND MP_0.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN B_MESSAGE BM_0
-- 20240508 初回コンパイルを通す為削除			ON BM_0.MESSAGE_CD = ERP.ERROR_MESSAGE_CD
-- 20240508 初回コンパイルを通す為削除			/*IF pmb.cultureId != null*/
-- 20240508 初回コンパイルを通す為削除			AND BM_0.CULTURE_ID = /*pmb.cultureId*/1
-- 20240508 初回コンパイルを通す為削除			/*END*/
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN
-- 20240508 初回コンパイルを通す為削除			(SELECT DFREL_6_0.WAREHOUSE_CD
-- 20240508 初回コンパイルを通す為削除					,DFLOC.LOCATION_ID AS LOCATION_ID
-- 20240508 初回コンパイルを通す為削除					,DFLOC.CENTER_ID AS CENTER_ID
-- 20240508 初回コンパイルを通す為削除					,DFLOC.ZONE_ID AS ZONE_ID
-- 20240508 初回コンパイルを通す為削除					,DFLOC.LOCATION_CD AS LOCATION_CD
-- 20240508 初回コンパイルを通す為削除					,DFLOC.LOCATION_NM AS LOCATION_NM
-- 20240508 初回コンパイルを通す為削除					,DFLOC.PICKING_LOCATION_FLG AS PICKING_LOCATION_FLG
-- 20240508 初回コンパイルを通す為削除					,DFLOC.PICKING_ORDER AS PICKING_ORDER
-- 20240508 初回コンパイルを通す為削除					,DFLOC.LOCATION_TYPE AS LOCATION_TYPE
-- 20240508 初回コンパイルを通す為削除					,DFLOC.ALLOC_ORDER AS ALLOC_ORDER
-- 20240508 初回コンパイルを通す為削除					,DFLOC.ALLOC_NG_FLG AS ALLOC_NG_FLG
-- 20240508 初回コンパイルを通す為削除					,DFLOC.REPLENISH_PRODUCT_ID AS REPLENISH_PRODUCT_ID
-- 20240508 初回コンパイルを通す為削除					,DFLOC.REPLENISH_STOCK_TYPE_ID AS REPLENISH_STOCK_TYPE_ID
-- 20240508 初回コンパイルを通す為削除					,DFLOC.REPLENISH_DEPOSIT_ID AS REPLENISH_DEPOSIT_ID
-- 20240508 初回コンパイルを通す為削除					,DFLOC.REPLENISH_P_NUM AS REPLENISH_P_NUM
-- 20240508 初回コンパイルを通す為削除					,DFLOC.REPLENISH_P_PRODUCT_SHAPE_ID AS REPLENISH_P_PRODUCT_SHAPE_ID
-- 20240508 初回コンパイルを通す為削除					,DFLOC.MAX_STORE_NUM AS MAX_STORE_NUM
-- 20240508 初回コンパイルを通す為削除					,DFLOC.MAX_STORE_PRODUCT_SHAPE_ID AS MAX_STORE_PRODUCT_SHAPE_ID
-- 20240508 初回コンパイルを通す為削除					,DFLOC.DEL_FLG AS DEL_FLG
-- 20240508 初回コンパイルを通す為削除					,DFLOC.VERSION_NO AS VERSION_NO
-- 20240508 初回コンパイルを通す為削除					,DFLOC.CONTROL_NO AS CONTROL_NO
-- 20240508 初回コンパイルを通す為削除					,DFLOC.ADD_DT AS ADD_DT
-- 20240508 初回コンパイルを通す為削除					,DFLOC.ADD_USER AS ADD_USER
-- 20240508 初回コンパイルを通す為削除					,DFLOC.ADD_PROCESS AS ADD_PROCESS
-- 20240508 初回コンパイルを通す為削除					,DFLOC.UPD_DT AS UPD_DT
-- 20240508 初回コンパイルを通す為削除					,DFLOC.UPD_USER AS UPD_USER
-- 20240508 初回コンパイルを通す為削除					,DFLOC.UPD_PROCESS AS UPD_PROCESS
-- 20240508 初回コンパイルを通す為削除			FROM M_LOCATION DFLOC
-- 20240508 初回コンパイルを通す為削除				INNER JOIN M_ZONE DFREL_6
-- 20240508 初回コンパイルを通す為削除					ON DFLOC.ZONE_ID = DFREL_6.ZONE_ID
-- 20240508 初回コンパイルを通す為削除					AND DFREL_6.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除				INNER JOIN M_WAREHOUSE DFREL_6_0
-- 20240508 初回コンパイルを通す為削除					ON DFREL_6.WAREHOUSE_ID = DFREL_6_0.WAREHOUSE_ID
-- 20240508 初回コンパイルを通す為削除					AND DFREL_6_0.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除			WHERE DFLOC.CENTER_ID = /*pmb.centerId*/4444444444444444444
-- 20240508 初回コンパイルを通す為削除				AND DFLOC.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除				ORDER BY DFLOC.LOCATION_CD ASC) LCS_0
-- 20240508 初回コンパイルを通す為削除			ON LCS_0.CENTER_ID = MCN_0.CENTER_ID
-- 20240508 初回コンパイルを通す為削除			AND LCS_0.LOCATION_CD = ERP.PLAN_LOCATION_CD
	WHERE 1 = 1
		AND ERP.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
-- 20240508 初回コンパイルを通す為削除		AND ERP.CLIENT_CD = /*pmb.clientCd*/'MK001'
-- 20240508 初回コンパイルを通す為削除		AND ERP.CENTER_CD = /*pmb.centerCd*/'TOKYO'
		/*IF pmb.errorFlg != null*/
		AND ERP.ERROR_FLG = /*pmb.errorFlg*/'1'
		/*END*/
		/*IF pmb.importFlg != null*/
		AND ERP.IMPORT_FLG = /*pmb.importFlg*/'0'
		/*END*/
/*IF pmb.isPaging()*/
-- 20240508 初回コンパイルを通す為削除	ORDER BY ERP.RECEIVE_PLAN_ID ASC
-- 20240508 初回コンパイルを通す為削除			,ERP.RECEIVE_CD ASC
-- 20240508 初回コンパイルを通す為削除			,ERP.RECEIVE_ROW_ID ASC
/*END*/