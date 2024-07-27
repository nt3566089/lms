
  /*
   [df:title]
    マルチピッキングリスト発行。出庫ヘッダ1レコード毎です。

   [df:description]
    SQL Description here.

  */

 -- #df:entity#

  -- !df:pmb extends Paging!
  -- !!AutoDetect!!
/*IF pmb.isPaging()*/
SELECT MC.CLIENT_CD,
       MAX(MC.CLIENT_ABBR) AS CLIENT_NM,
       MW.WAREHOUSE_CD,
       -- [ON推-1.1.4-CT-054]CT指摘の修正対応 2016.05.24 chou Mod Start
       MAX(MW.WAREHOUSE_ABBR) AS WAREHOUSE_NM,
       -- [ON推-1.1.4-CT-054]CT指摘の修正対応 2016.05.24 chou Mod End
       MAX(COALESCE(TSIH.EMERGENCY_FLG,'0')) AS EMERGENCY_FLG,
       -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
       TPH.PICKING_GROUP_NO AS PICKING_GROUP_NO,
       -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
       TAIH.WORK_DT,
       TPAH.CART_NO,
       ML.LOCATION_CD AS LOCATION_CD,
       MAX(ML.LOCATION_NM) AS LOCATION_NM,
       MP.PRODUCT_CD,
       MAX(MP.PRODUCT_ABBR) AS PRODUCT_NM,
       -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara Start
       MAX(MP.JAN_CD) AS JANCD,
       -- [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara End
       MAX(TL.LOT) AS LOT,
       MAX(TL.LIMIT_DT) AS LIMT_DT,
       TSN.STORE_LABEL_NO,
       -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
       TSN.STORE_DT,
       -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
       MPA.BACKET_COL_NUM,
       MPA.BACKET_ROW_NUM,
       SUM(TPAB.PACKING_NUM) AS SUM_PICKING_NUM,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 1 AND TPAH.BUCKET_ROW_NO = 1 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_1_1,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 1 AND TPAH.BUCKET_ROW_NO = 2 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_1_2,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 1 AND TPAH.BUCKET_ROW_NO = 3 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_1_3,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 1 AND TPAH.BUCKET_ROW_NO = 4 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_1_4,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 1 AND TPAH.BUCKET_ROW_NO = 5 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_1_5,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 1 AND TPAH.BUCKET_ROW_NO = 6 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_1_6,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 2 AND TPAH.BUCKET_ROW_NO = 1 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_2_1,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 2 AND TPAH.BUCKET_ROW_NO = 2 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_2_2,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 2 AND TPAH.BUCKET_ROW_NO = 3 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_2_3,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 2 AND TPAH.BUCKET_ROW_NO = 4 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_2_4,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 2 AND TPAH.BUCKET_ROW_NO = 5 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_2_5,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 2 AND TPAH.BUCKET_ROW_NO = 6 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_2_6,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 3 AND TPAH.BUCKET_ROW_NO = 1 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_3_1,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 3 AND TPAH.BUCKET_ROW_NO = 2 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_3_2,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 3 AND TPAH.BUCKET_ROW_NO = 3 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_3_3,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 3 AND TPAH.BUCKET_ROW_NO = 4 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_3_4,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 3 AND TPAH.BUCKET_ROW_NO = 5 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_3_5,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 3 AND TPAH.BUCKET_ROW_NO = 6 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_3_6,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 4 AND TPAH.BUCKET_ROW_NO = 1 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_4_1,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 4 AND TPAH.BUCKET_ROW_NO = 2 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_4_2,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 4 AND TPAH.BUCKET_ROW_NO = 3 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_4_3,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 4 AND TPAH.BUCKET_ROW_NO = 4 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_4_4,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 4 AND TPAH.BUCKET_ROW_NO = 5 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_4_5,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 4 AND TPAH.BUCKET_ROW_NO = 6 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_4_6,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 5 AND TPAH.BUCKET_ROW_NO = 1 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_5_1,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 5 AND TPAH.BUCKET_ROW_NO = 2 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_5_2,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 5 AND TPAH.BUCKET_ROW_NO = 3 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_5_3,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 5 AND TPAH.BUCKET_ROW_NO = 4 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_5_4,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 5 AND TPAH.BUCKET_ROW_NO = 5 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_5_5,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 5 AND TPAH.BUCKET_ROW_NO = 6 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_5_6,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 6 AND TPAH.BUCKET_ROW_NO = 1 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_6_1,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 6 AND TPAH.BUCKET_ROW_NO = 2 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_6_2,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 6 AND TPAH.BUCKET_ROW_NO = 3 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_6_3,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 6 AND TPAH.BUCKET_ROW_NO = 4 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_6_4,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 6 AND TPAH.BUCKET_ROW_NO = 5 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_6_5,
       SUM(CASE
         WHEN TPAH.BUCKET_COL_NO = 6 AND TPAH.BUCKET_ROW_NO = 6 THEN
          TPAB.PACKING_NUM
         ELSE
          0
       END) AS PACKING_NUM_6_6,
       TPR.MLT_OUT_FLG  -- // cls(ListOutFlg)
FROM T_PICKING_H TPH
  LEFT OUTER JOIN M_CLIENT MC
    ON TPH.CLIENT_ID = MC.CLIENT_ID
   AND MC.DEL_FLG = '0'
 INNER JOIN T_PICKING_B TPB
    ON TPB.PICKING_H_ID = TPH.PICKING_H_ID
   AND TPB.DEL_FLG = '0'
 INNER JOIN T_PACKING_B TPAB
    ON TPAB.PICKING_B_ID = TPB.PICKING_B_ID
   AND TPAB.DEL_FLG = '0'
 INNER JOIN T_PACKING_H  TPAH
    ON TPAH.PACKING_H_ID = TPAB.PACKING_H_ID
   AND TPAH.MIXED_FLG = '1'
   AND TPAH.DEL_FLG = '0'
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
 INNER JOIN T_STOCK TS
    ON TPB.STOCK_ID = TS.STOCK_ID
-- レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
   AND TS.DEL_FLG = '0'
 INNER JOIN T_LOT TL
    ON TS.LOT_ID = TL.LOT_ID
   AND TL.DEL_FLG = '0'
 INNER JOIN T_STORE_NO TSN
    ON TS.STORE_NO_ID = TSN.STORE_NO_ID
   AND TSN.DEL_FLG = '0'
  LEFT JOIN M_WAREHOUSE MW
    ON TS.WAREHOUSE_ID = MW.WAREHOUSE_ID
   AND MW.DEL_FLG = '0'
  LEFT JOIN M_STOCK_TYPE MST
    ON TS.STOCK_TYPE_ID = MST.STOCK_TYPE_ID
   AND MST.DEL_FLG = '0'
  LEFT JOIN V_DICT BD
    ON MST.DICT_ID = BD.DICT_ID
    AND (BD.CULTURE_ID = /*pmb.cultureId*/11111111111 OR BD.CULTURE_ID IS NULL)
  LEFT JOIN M_LOCATION ML
    ON TS.LOCATION_ID = ML.LOCATION_ID
   AND ML.DEL_FLG = '0'
  LEFT JOIN M_ZONE MZ
    ON ML.ZONE_ID = MZ.ZONE_ID
   AND MZ.DEL_FLG = '0'
 INNER JOIN T_ALLOC_INST_B TAIB
    ON TPB.ALLOC_INST_B_ID = TAIB.ALLOC_INST_B_ID
   AND TAIB.DEL_FLG = '0'
 INNER JOIN T_ALLOC_INST_H TAIH
    ON TAIB.ALLOC_INST_H_ID = TAIH.ALLOC_INST_H_ID
   AND TAIH.DEL_FLG = '0'
  LEFT JOIN M_PRODUCT MP
    ON TAIB.PRODUCT_ID = MP.PRODUCT_ID
   AND MP.DEL_FLG = '0'
 INNER JOIN M_CLIENT_CENTER MCC
    ON MCC.CLIENT_ID = TPH.CLIENT_ID
   AND MCC.CENTER_ID = TPH.CENTER_ID
   AND MCC.DEL_FLG = '0'
 INNER JOIN M_PARAM MPA
    ON MPA.CLIENT_CENTER_ID = MCC.CLIENT_CENTER_ID
   AND MPA.DEL_FLG = '0'
-- TODO [#2799]UoM対応 ここから
--  LEFT OUTER JOIN M_PRODUCT_SHAPE MPS -- 商品荷姿マスタ
--    ON MPS.PRODUCT_ID = MP.PRODUCT_ID
--   AND MPS.SHAPE_ID = MPA.CASE_SHAPE_ID
--   AND MPS.DEL_FLG = '0'
-- TODO [#2799]UoM対応 ここまで
 INNER JOIN T_SHIPPING_INST_B TSIB
    ON TPB.SHIPPING_INST_B_ID = TSIB.SHIPPING_INST_B_ID
   AND TSIB.DEL_FLG = '0'
 INNER JOIN T_SHIPPING_INST_H TSIH
    ON TSIB.SHIPPING_INST_H_ID = TSIH.SHIPPING_INST_H_ID
   AND TPB.DEL_FLG = '0'
  LEFT JOIN M_CENTER MCR
    ON TPH.CENTER_ID = MCR.CENTER_ID
   AND MCR.DEL_FLG = '0'
 INNER JOIN T_PICKING_R TPR
    ON TPH.PICKING_H_ID = TPR.PICKING_H_ID
   AND TPR.DEL_FLG = '0'
 WHERE TPR.CONTROL_NO = /*pmb.controlNo*/11111111111
 -- [ON推-品向-1094] マルチピック対象外の指示データを選択してマルチピッキングリスト出力すると致命的エラー 2016.04.12 kawana Start
   AND TPAH.CART_NO IS NOT NULL
   AND TPAH.BUCKET_COL_NO IS NOT NULL
   AND TPAH.BUCKET_ROW_NO IS NOT NULL
 -- [ON推-品向-1094] マルチピック対象外の指示データを選択してマルチピッキングリスト出力すると致命的エラー 2016.04.12 kawana End
GROUP BY
     MC.CLIENT_CD
   , MCR.CENTER_CD
   , MW.WAREHOUSE_CD
   , TAIH.WORK_DT
   -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
   , TPH.PICKING_GROUP_NO
   -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
   , TPAH.CART_NO
   , TPR.MLT_OUT_FLG
   , ML.LOCATION_CD
   , MP.PRODUCT_CD
   , TSN.STORE_LABEL_NO
   -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
   , TSN.STORE_DT
   -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
   , MPA.BACKET_COL_NUM
   , MPA.BACKET_ROW_NUM

ORDER BY
    TPR.MLT_OUT_FLG
  , MC.CLIENT_CD
  , MCR.CENTER_CD
  -- [#220][2.1.0-CT-040] 同じ台車Noが別ページになる問題を修正 2016.11.10 kawana Start
  , TAIH.WORK_DT
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana Start
  , TPH.PICKING_GROUP_NO
  -- [#5128][v3.1] 出庫指示バッチNo.を削除しピッキンググループNo.を表示 2018.08.23 kawana End
  , TPAH.CART_NO
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , MIN(MZ.PICKING_ORDER)
  , MIN(ML.PICKING_ORDER)
  , MIN(MZ.ZONE_CD)
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  -- [#220][2.1.0-CT-040] 同じ台車Noが別ページになる問題を修正 2016.11.10 kawana End
  , ML.LOCATION_CD
  , MP.PRODUCT_CD
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana Start
  , LIMT_DT
  , LOT
  -- [#2255] MySQLのSQL_MODE変更対応 2018.03.14 kawana End
  , TSN.STORE_LABEL_NO
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
  , TSN.STORE_DT
  -- [ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
/*END*/
