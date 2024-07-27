/*
 [df:title]
 出荷指示一括取込一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!Long cultureId!!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT ESI_0.SHIPPING_INST_ID
	  ,ESI_0.RECEIVE_CD
	  ,ESI_0.RECEIVE_ROW_ID
	  ,ESI_0.IMPORT_FLG
	  ,ESI_0.ERROR_FLG
	  ,ESI_0.ERROR_MESSAGE_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.CLIENT_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.CENTER_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.EMERGENCY_FLG
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.CLIENT_SHIPPING_NO
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.SUPPLY_CUSTOMER_CD
-- 20240508 初回コンパイルを通す為削除	-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.PROCESS_TYPE_CD
-- 20240508 初回コンパイルを通す為削除	-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_PLAN_DT
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.WORK_DT
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.SHIPPING_DT
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIVERY_COURSE_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_DT
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_TZ
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_CUSTOMER_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_CUSTOMER_NM
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_ZIP_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_ADDRESS1
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_ADDRESS2
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_ADDRESS3
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_TEL_NO
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DELIV_ADDRESS_SUPPLY
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.PICKING_WORK_MESSAGE
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.PRODUCT_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.PRODUCT_NM
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DEPOSIT_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.STOCK_TYPE_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.INST_NUM
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.LOT
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.LIMIT_DT
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.WAREHOUSE_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.LOCATION_CD
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.DEL_FLG
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.VERSION_NO
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.CONTROL_NO
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.ADD_DT
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.ADD_USER
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.ADD_PROCESS
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.UPD_DT
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.UPD_USER
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.UPD_PROCESS
-- 20240508 初回コンパイルを通す為削除	  ,MC_0.CLIENT_ID
-- 20240508 初回コンパイルを通す為削除	  ,MC_0.CLIENT_CD
-- 20240508 初回コンパイルを通す為削除	  ,MCT_0.CENTER_ID
-- 20240508 初回コンパイルを通す為削除	  ,MCT_0.CENTER_CD
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_0.CUSTOMER_ID AS SUPPLY_CUSTOMER_ID
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_0.CUSTOMER_NM AS SUPPLY_CUSTOMER_NM
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_0.CUSTOMER_ABBR AS SUPPLY_CUSTOMER_ABBR
-- 20240508 初回コンパイルを通す為削除	  ,MDC_0.DELIVERY_COURSE_NM,MP_0.PRODUCT_ID
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.PRODUCT_NM AS MP_PRODUCT_NM
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.PRODUCT_ABBR
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.JAN_CD
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.LOT_MANAG_FLG  -- // cls(LotManagFlg)
-- 20240508 初回コンパイルを通す為削除	  ,MP_0.LIMIT_DT_MANAG_FLG  -- // cls(LimitDtManagFlg)
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_1.CUSTOMER_ID AS DELIV_CUSTOMER_ID
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_1.CUSTOMER_NM AS ONE_CUSTOMER_NM
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_1.ZIP_CD
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_1.ADDRESS1
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_1.ADDRESS2
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_1.ADDRESS3
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_1.TEL_NO
-- 20240508 初回コンパイルを通す為削除	  ,DFLOC_1.ONETIME_FLG  -- // cls(OnetimeFlg)
-- 20240508 初回コンパイルを通す為削除	  ,MPT.PROCESS_TYPE_ID AS MPT_PROCESS_TYPE_ID
-- 20240508 初回コンパイルを通す為削除	-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
-- 20240508 初回コンパイルを通す為削除	  ,VD_0.DICT_NM AS PROCESS_TYPE_NM
-- 20240508 初回コンパイルを通す為削除	  ,VD_1.DICT_NM AS STOCK_TYPE_NM
-- 20240508 初回コンパイルを通す為削除	-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
-- 20240508 初回コンパイルを通す為削除	  ,MST.STOCK_TYPE_ID AS MST_STOCK_TYPE_ID
-- 20240508 初回コンパイルを通す為削除	  ,MC_1.CUSTOMER_NM AS DEPOSIT_NM
-- 20240508 初回コンパイルを通す為削除	  ,MC_1.CUSTOMER_ID AS DEPOSIT_ID
-- 20240508 初回コンパイルを通す為削除	  ,MW_0.WAREHOUSE_ID
-- 20240508 初回コンパイルを通す為削除	  ,MW_0.WAREHOUSE_NM
-- 20240508 初回コンパイルを通す為削除	  ,LCT_0.LOCATION_ID AS CCL_LOCATION_ID
-- 20240508 初回コンパイルを通す為削除	  ,LCT_0.LOCATION_NM AS CCL_LOCATION_NM
-- 20240508 初回コンパイルを通す為削除	  ,LCT_0.WAREHOUSE_CD AS LCT_WAREHOUSE_CD
-- 20240508 初回コンパイルを通す為削除	  ,BM_0.MESSAGE_NM
-- 20240508 初回コンパイルを通す為削除	  ,MCC_0.DELIVERY_COURSE_CD_0
-- 20240508 初回コンパイルを通す為削除	  ,MCC_0.DELIVERY_COURSE_NM_0
-- 20240508 初回コンパイルを通す為削除-- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.TOTAL_PRICE
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.TOTAL_TAX
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.UNIT_PRICE
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.PRICE
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.TAX
-- 20240508 初回コンパイルを通す為削除-- [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End
-- 20240508 初回コンパイルを通す為削除-- [#2253]予備項目対応 2017.08.18 sampei Start
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.SPARE_STR_1
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.SPARE_STR_2
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.SPARE_STR_3
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.SPARE_NUM_1
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.SPARE_NUM_2
-- 20240508 初回コンパイルを通す為削除	  ,ESI_0.SPARE_NUM_3
-- [#2253]予備項目対応 2017.08.18 sampei End

-- ELSE SELECT COUNT(*)
/*END*/
	FROM E_SHIPPING_INST ESI_0
-- 20240508 初回コンパイルを通す為削除		INNER JOIN M_CLIENT MC_0 ON MC_0.CLIENT_CD = ESI_0.CLIENT_CD
-- 20240508 初回コンパイルを通す為削除		INNER JOIN M_CENTER MCT_0 ON MCT_0.CENTER_CD = ESI_0.CENTER_CD
-- 20240508 初回コンパイルを通す為削除		-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_PROCESS_TYPE MPT ON MPT.PROCESS_TYPE_CD = ESI_0.PROCESS_TYPE_CD
-- 20240508 初回コンパイルを通す為削除		-- [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
-- 20240508 初回コンパイルを通す為削除			AND MPT.SHIPPING_FLG = '1'
-- 20240508 初回コンパイルを通す為削除			AND MPT.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_WAREHOUSE MW_0 ON MW_0.CENTER_ID = MCT_0.CENTER_ID
-- 20240508 初回コンパイルを通す為削除			AND MW_0.WAREHOUSE_CD = ESI_0.WAREHOUSE_CD
-- 20240508 初回コンパイルを通す為削除			AND MW_0.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN V_DICT VD_0
-- 20240508 初回コンパイルを通す為削除			ON VD_0.DICT_ID = MPT.DICT_ID
-- 20240508 初回コンパイルを通す為削除			AND (VD_0.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD_0.CULTURE_ID IS NULL)
-- 20240508 初回コンパイルを通す為削除		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_STOCK_TYPE MST ON MST.STOCK_TYPE_CD = ESI_0.STOCK_TYPE_CD
-- 20240508 初回コンパイルを通す為削除			AND MST.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana Start
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN V_DICT VD_1
-- 20240508 初回コンパイルを通す為削除			ON VD_1.DICT_ID = MST.DICT_ID
-- 20240508 初回コンパイルを通す為削除			AND (VD_1.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD_1.CULTURE_ID IS NULL)
-- 20240508 初回コンパイルを通す為削除		-- [#49] 辞書マスタを辞書ビューに変更 2016.10.24 kawana End
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_CUSTOMER DFLOC_0 ON DFLOC_0.CLIENT_ID = MC_0.CLIENT_ID
-- 20240508 初回コンパイルを通す為削除			AND DFLOC_0.CUSTOMER_CD = ESI_0.SUPPLY_CUSTOMER_CD
-- 20240508 初回コンパイルを通す為削除			AND DFLOC_0.DELIVERY_FLG = '1'
-- 20240508 初回コンパイルを通す為削除			AND DFLOC_0.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_CUSTOMER DFLOC_1 ON DFLOC_1.CLIENT_ID = MC_0.CLIENT_ID
-- 20240508 初回コンパイルを通す為削除			AND DFLOC_1.CUSTOMER_CD = ESI_0.DELIV_CUSTOMER_CD
-- 20240508 初回コンパイルを通す為削除			AND DFLOC_1.DELIVERY_FLG = '1'
-- 20240508 初回コンパイルを通す為削除			AND DFLOC_1.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_CUSTOMER MC_1 ON ESI_0.DEPOSIT_CD = MC_1.CUSTOMER_CD
-- 20240508 初回コンパイルを通す為削除			AND MC_1.CLIENT_ID = MC_0.CLIENT_ID
-- 20240508 初回コンパイルを通す為削除			AND MC_1.DEPOSIT_FLG = '1'
-- 20240508 初回コンパイルを通す為削除			AND MC_1.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_DELIVERY_COURSE MDC_0 ON MDC_0.CENTER_ID = MCT_0.CENTER_ID
-- 20240508 初回コンパイルを通す為削除			AND MDC_0.DELIVERY_COURSE_CD = ESI_0.DELIVERY_COURSE_CD
-- 20240508 初回コンパイルを通す為削除			AND MDC_0.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN M_PRODUCT MP_0 ON MP_0.CLIENT_ID = MC_0.CLIENT_ID
-- 20240508 初回コンパイルを通す為削除			AND MP_0.PRODUCT_CD = ESI_0.PRODUCT_CD
-- 20240508 初回コンパイルを通す為削除			AND MP_0.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN B_MESSAGE BM_0
-- 20240508 初回コンパイルを通す為削除			ON BM_0.MESSAGE_CD = ESI_0.ERROR_MESSAGE_CD
-- 20240508 初回コンパイルを通す為削除			/*IF pmb.cultureId != null*/
-- 20240508 初回コンパイルを通す為削除			AND BM_0.CULTURE_ID = /*pmb.cultureId*/1
-- 20240508 初回コンパイルを通す為削除			/*END*/
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN
-- 20240508 初回コンパイルを通す為削除			(SELECT	DFLOC.CENTER_CUSTOMER_ID AS CENTER_CUSTOMER_ID
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.CENTER_ID AS CENTER_ID
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.CUSTOMER_ID AS CUSTOMER_ID
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.DELIVERY_COURSE_ID AS DELIVERY_COURSE_ID
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.DELIVERY_ORDER AS DELIVERY_ORDER
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.DELIVERY_READ_TIME AS DELIVERY_READ_TIME
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.DEL_FLG AS DEL_FLG
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.VERSION_NO AS VERSION_NO
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.CONTROL_NO AS CONTROL_NO
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.ADD_DT AS ADD_DT
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.ADD_USER AS ADD_USER
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.ADD_PROCESS AS ADD_PROCESS
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.UPD_DT AS UPD_DT
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.UPD_USER AS UPD_USER
-- 20240508 初回コンパイルを通す為削除				   ,DFLOC.UPD_PROCESS AS UPD_PROCESS
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.DELIVERY_COURSE_ID AS DELIVERY_COURSE_ID_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.CENTER_ID AS CENTER_ID_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.DELIVERY_COURSE_CD AS DELIVERY_COURSE_CD_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.DELIVERY_COURSE_NM AS DELIVERY_COURSE_NM_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.CARRIER_ID AS CARRIER_ID_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.PICKING_TIME AS PICKING_TIME_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.STOWAGE_TIME AS STOWAGE_TIME_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.SHIPPING_TIME AS SHIPPING_TIME_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.CARRIER_SLIP_YMT_ID AS CARRIER_SLIP_YMT_ID_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.CARRIER_SLIP_SGW_ID AS CARRIER_SLIP_SGW_ID_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.CARRIER_SLIP_YUPK_ID AS CARRIER_SLIP_YUPK_ID_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.DEL_FLG AS DEL_FLG_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.VERSION_NO AS VERSION_NO_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.CONTROL_NO AS CONTROL_NO_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.ADD_DT AS ADD_DT_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.ADD_USER AS ADD_USER_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.ADD_PROCESS AS ADD_PROCESS_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.UPD_DT AS UPD_DT_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.UPD_USER AS UPD_USER_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_0.UPD_PROCESS AS UPD_PROCESS_0
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.CENTER_ID AS CENTER_ID_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.CENTER_CD AS CENTER_CD_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.CENTER_NM AS CENTER_NM_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.CENTER_ABBR AS CENTER_ABBR_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.CULTURE_ID AS CULTURE_ID_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.DEL_FLG AS DEL_FLG_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.VERSION_NO AS VERSION_NO_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.CONTROL_NO AS CONTROL_NO_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.ADD_DT AS ADD_DT_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.ADD_USER AS ADD_USER_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.ADD_PROCESS AS ADD_PROCESS_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.UPD_DT AS UPD_DT_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.UPD_USER AS UPD_USER_1
-- 20240508 初回コンパイルを通す為削除				   ,DFREL_1.UPD_PROCESS AS UPD_PROCESS_1
-- 20240508 初回コンパイルを通す為削除			FROM M_CENTER_CUSTOMER DFLOC
-- 20240508 初回コンパイルを通す為削除				INNER JOIN M_DELIVERY_COURSE DFREL_0
-- 20240508 初回コンパイルを通す為削除					ON DFLOC.DELIVERY_COURSE_ID = DFREL_0.DELIVERY_COURSE_ID
-- 20240508 初回コンパイルを通す為削除				INNER JOIN M_CENTER DFREL_1
-- 20240508 初回コンパイルを通す為削除					ON DFLOC.CENTER_ID = DFREL_1.CENTER_ID
-- 20240508 初回コンパイルを通す為削除			WHERE DFLOC.CENTER_ID = /*pmb.centerId*/444444444444444) MCC_0
-- 20240508 初回コンパイルを通す為削除				ON MCC_0.CUSTOMER_ID = DFLOC_0.CUSTOMER_ID
-- 20240508 初回コンパイルを通す為削除				AND MCC_0.CENTER_ID = MCT_0.CENTER_ID
-- 20240508 初回コンパイルを通す為削除		LEFT JOIN (
-- 20240508 初回コンパイルを通す為削除			SELECT DFREL_6_0.WAREHOUSE_CD
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.LOCATION_ID AS LOCATION_ID
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.CENTER_ID AS CENTER_ID
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.ZONE_ID AS ZONE_ID
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.LOCATION_CD AS LOCATION_CD
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.LOCATION_NM AS LOCATION_NM
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.PICKING_LOCATION_FLG AS PICKING_LOCATION_FLG
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.PICKING_ORDER AS PICKING_ORDER
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.LOCATION_TYPE AS LOCATION_TYPE
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.ALLOC_ORDER AS ALLOC_ORDER
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.ALLOC_NG_FLG AS ALLOC_NG_FLG
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.REPLENISH_PRODUCT_ID AS REPLENISH_PRODUCT_ID
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.REPLENISH_STOCK_TYPE_ID AS REPLENISH_STOCK_TYPE_ID
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.REPLENISH_DEPOSIT_ID AS REPLENISH_DEPOSIT_ID
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.REPLENISH_P_NUM AS REPLENISH_P_NUM
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.REPLENISH_P_PRODUCT_SHAPE_ID AS REPLENISH_P_PRODUCT_SHAPE_ID
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.MAX_STORE_NUM AS MAX_STORE_NUM
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.MAX_STORE_PRODUCT_SHAPE_ID AS MAX_STORE_PRODUCT_SHAPE_ID
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.DEL_FLG AS DEL_FLG
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.VERSION_NO AS VERSION_NO
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.CONTROL_NO AS CONTROL_NO
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.ADD_DT AS ADD_DT
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.ADD_USER AS ADD_USER
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.ADD_PROCESS AS ADD_PROCESS
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.UPD_DT AS UPD_DT
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.UPD_USER AS UPD_USER
-- 20240508 初回コンパイルを通す為削除				  ,DFLOC.UPD_PROCESS AS UPD_PROCESS
-- 20240508 初回コンパイルを通す為削除			FROM M_LOCATION DFLOC
-- 20240508 初回コンパイルを通す為削除				INNER JOIN M_ZONE DFREL_6
-- 20240508 初回コンパイルを通す為削除					ON DFLOC.ZONE_ID = DFREL_6.ZONE_ID
-- 20240508 初回コンパイルを通す為削除					AND DFREL_6.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除				INNER JOIN M_WAREHOUSE DFREL_6_0
-- 20240508 初回コンパイルを通す為削除					ON DFREL_6.WAREHOUSE_ID = DFREL_6_0.WAREHOUSE_ID
-- 20240508 初回コンパイルを通す為削除					AND DFREL_6_0.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除			WHERE DFLOC.CENTER_ID = /*pmb.centerId*/44444444444444
-- 20240508 初回コンパイルを通す為削除				AND DFLOC.DEL_FLG = '0'
-- 20240508 初回コンパイルを通す為削除			ORDER BY DFLOC.LOCATION_CD ASC) LCT_0
-- 20240508 初回コンパイルを通す為削除				ON LCT_0.CENTER_ID = MCT_0.CENTER_ID
-- 20240508 初回コンパイルを通す為削除				AND LCT_0.LOCATION_CD = ESI_0.LOCATION_CD
	WHERE 1 = 1
		AND ESI_0.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
-- 20240508 初回コンパイルを通す為削除		AND ESI_0.CENTER_CD = /*pmb.centerCd*/'TOKYO'
-- 20240508 初回コンパイルを通す為削除		AND ESI_0.CLIENT_CD = /*pmb.clientCd*/'MK001'
		/*IF pmb.errorFlg != null*/
		AND ESI_0.ERROR_FLG = /*pmb.errorFlg*/'0'
		/*END*/
		/*IF pmb.importFlg != null*/
		AND ESI_0.IMPORT_FLG = /*pmb.importFlg*/'0'
		/*END*/
/*IF pmb.isPaging()*/
-- 20240508 初回コンパイルを通す為削除	ORDER BY ESI_0.SHIPPING_INST_ID ASC
-- 20240508 初回コンパイルを通す為削除			,ESI_0.RECEIVE_CD ASC
-- 20240508 初回コンパイルを通す為削除			,ESI_0.RECEIVE_ROW_ID ASC
/*END*/