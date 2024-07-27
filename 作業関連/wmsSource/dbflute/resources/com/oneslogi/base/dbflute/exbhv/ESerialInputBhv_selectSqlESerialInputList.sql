/*
 [df:title]
 シリアルNo.メンテナンス一覧を取得します。

 [df:description]
  SQL Description here.

*/
-- #df:entity#
-- !df:pmb extends Paging!
-- !!Long cultureId!!
-- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT ESI.RECEIVE_CD
	  ,ESI.SERIAL_INPUT_ID
	  ,ESI.RECEIVE_ROW_ID
	  ,ESI.IMPORT_FLG
	  ,ESI.ERROR_FLG
	  ,ESI.ERROR_MESSAGE_CD
	  ,ESI.CLIENT_CD
	  ,ESI.CENTER_CD
	  ,ESI.PROCESS_TYPE
	  ,VD.DICT_NM AS PROCESS_TYPE_NM
	  ,ESI.PRODUCT_CD
	  ,MP.PRODUCT_ID
	  ,MP.PRODUCT_NM
	  ,ESI.SERIAL_NO
	  ,ESI.SUPPLIER_CD
	  ,ESI.SUPPLIER_NM
	  ,MC_1.CUSTOMER_ID AS SUPPLIER_ID
	  ,MC_1.CUSTOMER_NM AS SUPPLIER_NM2
	  ,ESI.RECEIVE_SLIP_NO
	  ,ESI.SUPPLY_CUSTOMER_CD
	  ,ESI.SUPPLY_CUSTOMER_NM
	  ,MC_2.CUSTOMER_ID AS SUPPLY_CUSTOMER_ID
	  ,MC_2.CUSTOMER_NM AS SUPPLY_CUSTOMER_NM2
	  ,ESI.PICKING_WORK_NO
	  ,ESI.WORK_DT
	  ,BM.MESSAGE_NM
	  ,ESI.VERSION_NO
	  ,ESI.CONTROL_NO
-- ELSE SELECT COUNT(*)
/*END*/
	FROM E_SERIAL_INPUT ESI
		INNER JOIN M_CLIENT MCL
			 ON MCL.CLIENT_CD = ESI.CLIENT_CD
		LEFT JOIN B_CLASS BC
			ON BC.CLASS_CD = 'SERIAL_OPERATION_TYPE'
		   AND BC.DEL_FLG = '0'
		LEFT JOIN B_CLASS_DTL BCD
			ON BCD.CLASS_ID = BC.CLASS_ID
		   AND BCD.CLASS_DTL_CD = ESI.PROCESS_TYPE
		   AND BCD.DEL_FLG = '0'
		LEFT JOIN V_DICT VD
			ON VD.DICT_ID = BCD.DICT_ID
			AND (VD.CULTURE_ID = /*pmb.cultureId*/11111111111 OR VD.CULTURE_ID IS NULL)
		LEFT JOIN M_PRODUCT MP
			 ON MP.PRODUCT_CD = ESI.PRODUCT_CD
			AND MP.CLIENT_ID = MCL.CLIENT_ID
			AND MP.DEL_FLG = '0'
		LEFT JOIN M_CUSTOMER MC_1
			 ON ESI.SUPPLIER_CD = MC_1.CUSTOMER_CD
			AND MC_1.CLIENT_ID = MCL.CLIENT_ID
			AND MC_1.VENDOR_FLG = '1'
			AND MC_1.DEL_FLG = '0'
		LEFT JOIN M_CUSTOMER MC_2
			 ON ESI.SUPPLY_CUSTOMER_CD = MC_2.CUSTOMER_CD
			AND MC_2.CLIENT_ID = MCL.CLIENT_ID
			AND MC_2.DELIVERY_FLG = '1'
			AND MC_2.DEL_FLG = '0'
		LEFT JOIN B_MESSAGE BM
			 ON BM.MESSAGE_CD = ESI.ERROR_MESSAGE_CD
			/*IF pmb.cultureId != null*/
			AND BM.CULTURE_ID = /*pmb.cultureId*/1
			/*END*/
	WHERE 1 = 1
		AND ESI.RECEIVE_CD = /*pmb.receiveCd*/'E12345678901'
		AND ESI.CLIENT_CD = /*pmb.clientCd*/'MK001'
		AND ESI.CENTER_CD = /*pmb.centerCd*/'TOKYO'
		/*IF pmb.errorFlg != null*/
		AND ESI.ERROR_FLG = /*pmb.errorFlg*/'1'
		/*END*/
		/*IF pmb.importFlg != null*/
		AND ESI.IMPORT_FLG = /*pmb.importFlg*/'0'
		/*END*/
/*IF pmb.isPaging()*/
	ORDER BY ESI.SERIAL_INPUT_ID ASC
			,ESI.RECEIVE_CD ASC
			,ESI.RECEIVE_ROW_ID ASC
/*END*/