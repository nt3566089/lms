/*
 [df:title]
  SQL title here.

 [df:description]
  SQL Description here.

*/

-- #df:entity#
-- ##Long VERSION_NO##
-- ##Long COUNT##
-- [Ver3.0] unit of measure対応 2017.11.22 ライ Start --
-- *M_PRODUCT.PRODUCT_ID*
-- [Ver3.0] unit of measure対応 2017.11.22 ライ End --
-- !df:pmb extends Paging!
-- !!AutoDetect!!
SELECT
--   ミドリ安全様向けカスタマイズ対応  検索対象項目を追加した 2024.07.15 張 Add [S]
   SUM(TB.PICKED_NUM) AS PICKING_NUM_SUM
  ,SUM(TPB.PACKING_NUM) AS PACKING_NUM_SUM
  ,TPH.PACKING_H_ID
  ,TPH.CENTER_ID
  ,TPH.CLIENT_ID
  ,TPH.PROCESS_TYPE_ID
  ,MAX(MC.CENTER_CD) AS CENTER_CD
  ,MAX(MC.CENTER_NM) AS CENTER_NM
  ,MAX(MB.BOX_CD) AS BOX_CD
  ,MAX(MB.BOX_NM) AS BOX_NM
  ,MP.PRODUCT_CD
  ,MAX(MP.JAN_CD) AS JAN_CD
  ,MAX(MP.UNIT_NM) AS UNIT_NM
  ,MAX(MP.PRODUCT_NM) AS PRODUCT_NM
  ,MP.PRODUCT_ID
  ,MAX(TAH.VERSION_NO) AS VERSION_NO
  ,TPH.ALLOC_INST_H_ID
  ,TPH.PICKING_H_ID
  ,TPB.PACKING_B_ID AS OLD_BID
  ,MAX(TPH.PACKING_STATUS) AS PACKING_STATUS
  ,MAX(TPB.CASE_PICKING_NO) AS CASE_PICKING_NO
  ,MAX(TPB.RECEIVE_LABEL_NO) AS RECEIVE_LABEL_NO
  ,MAX(TPH.NIZOROE_NO) AS NIZOROE_NO
  ,MAX(TPH.NIZOROE_NO2) AS NIZOROE_NO2
  ,MAX(TPH.DAIHYO_NIZOROE_NO) AS DAIHYO_NIZOROE_NO
  ,MAX(TPH.DAIHYO_NIZOROE_NO2) AS DAIHYO_NIZOROE_NO2
  ,MAX(TPH.SHIPPING_PACKING_NO) AS SHIPPING_PACKING_NO
  ,MAX(TPH.CARRIER_TRACE_NUM) AS CARRIER_TRACE_NUM
  ,MAX(LT.LOT) AS LOT
  ,MAX(TAB.LIMIT_DT) AS LIMIT_DT
  ,MAX(TAB.PROD_DT) AS PROD_DT
  ,MAX(CS.CUSTOMER_CD) AS DEPOSIT_CD
  ,MAX(CS.CUSTOMER_NM) AS CUSTOMER_NM
--   ミドリ安全様向けカスタマイズ対応  検索対象項目を追加した 2024.07.15 張 Add [E]
  FROM T_PACKING_H TPH
    INNER JOIN T_PACKING_B TPB
            ON TPH.PACKING_H_ID = TPB.PACKING_H_ID
	       AND TPB.DEL_FLG = '0'
     INNER JOIN T_PICKING_H TH
            ON TPH.PICKING_H_ID = TH.PICKING_H_ID
	       AND TH.DEL_FLG  = '0'
     LEFT JOIN T_PICKING_B TB
            ON TPH.PICKING_H_ID = TB.PICKING_H_ID
           AND TB.PICKING_B_ID = TPB.PICKING_B_ID
	       AND TB.DEL_FLG  = '0'
     LEFT JOIN T_ALLOC_INST_H TAH
            ON TPH.ALLOC_INST_H_ID = TAH.ALLOC_INST_H_ID
	       AND TAH.DEL_FLG = '0'
     LEFT JOIN T_ALLOC_INST_B TAB
           --  ミドリ安全様向けカスタマイズ対応  結合条件修正対応 2024.07.15 張 Mod [S]
            ON TAH.ALLOC_INST_H_ID = TAB.ALLOC_INST_H_ID
            AND TAB.ALLOC_INST_B_ID = TPB.ALLOC_INST_B_ID
            AND TAB.ALLOC_INST_B_ID = TB.ALLOC_INST_B_ID
	       --  ミドリ安全様向けカスタマイズ対応  結合条件修正対応 2024.07.15 張 Mod [E]
	       AND TAB.DEL_FLG = '0'
     LEFT JOIN M_PRODUCT MP
	        ON TAB.PRODUCT_ID = MP.PRODUCT_ID
    --  ミドリ安全様向けカスタマイズ対応  結合テーブル追加 2024.07.15 張 Add [S]
     LEFT JOIN T_LOT LT
            ON LT.PRODUCT_ID = MP.PRODUCT_ID
           AND LT.DEL_FLG = '0'
    --  ミドリ安全様向けカスタマイズ対応  結合テーブル追加 2024.07.15 張 Add [E]
     LEFT JOIN M_BOX MB
	        ON TPH.BOX_ID = MB.BOX_ID
-- 荷主センタ変更対応 2017.03.28 hdis Start
     LEFT JOIN M_CENTER MC
            ON TPH.CENTER_ID = MC.CENTER_ID
           AND MC.DEL_FLG = '0'
      --  ミドリ安全様向けカスタマイズ対応  結合テーブル追加 2024.07.15 張 Add [S]
 --    LEFT JOIN M_SHAPE_GRP MSG
 --           ON MP.SHAPE_GRP_ID = MSG.SHAPE_GRP_ID
 --          AND MSG.DEL_FLG = '0'
     LEFT JOIN M_CUSTOMER CS
            ON CS.CUSTOMER_ID = TAB.DEPOSIT_ID
           AND CS.DEL_FLG = '0'
      --  ミドリ安全様向けカスタマイズ対応  結合テーブル追加 2024.07.15 張 Add [E]
     --  ミドリ安全様向けカスタマイズ対応  結合テーブル削除 2024.07.15 張 Del [S]
    -- LEFT JOIN M_CLIENT MCL
    --       ON TPH.CLIENT_ID = MCL.CLIENT_ID
    --      AND MCL.DEL_FLG = '0'
     --  ミドリ安全様向けカスタマイズ対応  結合テーブル削除 2024.07.15 張 Del [S]
-- 荷主センタ変更対応 2017.03.28 hdis End
 WHERE TPH.DEL_FLG = '0'
 -- [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe Start
 	AND(
 	--  ミドリ安全様向けカスタマイズ対応  検索条件の修正 2024.07.15 張 Mod [S]
 	-- TH.PICKING_STATUS = '25' OR
 	--  ミドリ安全様向けカスタマイズ対応  検索条件の修正 2024.07.15 張 Mod [E]
 		TH.PICKING_STATUS = '35'
 		OR TH.PICKING_STATUS = '50'
 	)
 -- [ver2.2.1][#1980] 梱包明細修正可能な梱包ステータスに、出庫指示済、ピッキング済を追加 2017.08.08 miyabe End
   /*IF pmb.centerCd != null*/
   --  ミドリ安全様向けカスタマイズ対応  検索テーブル出庫ヘッダから梱包ヘッダに変更 2024.07.15 張 Mod [S]
   AND TPH.CENTER_ID = /*pmb.centerCd*/'1'
   --  ミドリ安全様向けカスタマイズ対応  検索テーブル出庫ヘッダから梱包ヘッダに変更 2024.07.15 張 Mod [E]
   /*END*/
   /*IF pmb.clientCd != null*/
   --  ミドリ安全様向けカスタマイズ対応  検索条件の削除 2024.07.15 張 Del [S]
   -- AND TH.CLIENT_ID = /*pmb.clientCd*/'TEST1'
   --  ミドリ安全様向けカスタマイズ対応  検索条件の削除 2024.07.15 張 Del [E]
   /*END*/
   /*IF pmb.pickingWorkNo != null*/
   --  ミドリ安全様向けカスタマイズ対応  検索条件の削除 2024.07.15 張 Del [S]
  -- AND TH.PICKING_WORK_NO = /*pmb.pickingWorkNo*/'TEST1'
   --  ミドリ安全様向けカスタマイズ対応  検索条件の削除 2024.07.15 張 Del [E]
   /*END*/
  --  ミドリ安全様向けカスタマイズ対応  検索条件に梱包ヘッダ.荷揃番号_ハイフンあり=検索.荷揃番号を追加した 2024.07.15 張 Add [S]
   /*IF pmb.nizoroeNo2 != null*/
  AND TPH.NIZOROE_NO2 = /*pmb.nizoroeNo2*/'N-1'
   /*END*/
  --  ミドリ安全様向けカスタマイズ対応  検索条件に梱包ヘッダ.荷揃番号_ハイフンあり=検索.荷揃番号を追加した 2024.07.15 張 Add [E]
 GROUP BY TPH.PACKING_H_ID
         ,MP.PRODUCT_CD
         ,MP.PRODUCT_ID
         ,TPH.CENTER_ID
         ,TPH.CLIENT_ID
         --  ミドリ安全様向けカスタマイズ対応  groupBy条件の削除 2024.07.15 張 Del [S]
        -- ,TPH.CLIENT_ID
        -- ,TPH.PROCESS_TYPE_ID
         --  ミドリ安全様向けカスタマイズ対応  groupBy条件の削除 2024.07.15 張 Del [E]
         -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
         ,TPH.PICKING_H_ID
         ,TPH.ALLOC_INST_H_ID
         ,TPB.PACKING_B_ID
         ,TPH.PROCESS_TYPE_ID
         -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
 ORDER BY
 --  ミドリ安全様向けカスタマイズ対応  出力順.梱包ヘッダIDを削除した 2024.07.15 張 Del [S]
        -- TPH.PACKING_H_ID
 --  ミドリ安全様向けカスタマイズ対応  出力順.梱包ヘッダIDを削除した 2024.07.15 張 Del [E]
 --  ミドリ安全様向けカスタマイズ対応  出力順に梱包ヘッダ.出荷梱包No.を追加した 2024.07.15 張 Add [S]
          TPH.SHIPPING_PACKING_NO
 --  ミドリ安全様向けカスタマイズ対応  出力順に梱包ヘッダ.出荷梱包No.を追加した 2024.07.15 張 Add [E]
         ,MP.PRODUCT_CD
--  ミドリ安全様向けカスタマイズ対応  出力順.商品IDを削除した 2024.07.15 張 Del [S]
        -- ,MP.PRODUCT_ID
--  ミドリ安全様向けカスタマイズ対応  出力順.商品IDを削除した 2024.07.15 張 Del [E]
