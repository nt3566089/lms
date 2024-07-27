/*
 [df:title]
棚卸関連リスト発行 商品別棚卸実績表(LOC表示あり）

 [df:description]
  SQL Description here.
*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
SELECT
       SUM(BODY.INVENTORY_NUM) AS SUMINVNUM,
       PRODUCT.PRODUCT_CD AS PRODUCT_CD,
       LOCATION.LOCATION_CD AS LOCATION_CD,
       HEAD.INVENTORY_DT AS INVENTORY_DT,
       CENTER.CENTER_CD AS CENTER_CD,
       CENTER.CENTER_ABBR AS CENTER_ABBR,
       PRODUCT.PRODUCT_NM AS PRODUCT_NM,
       PRODUCT.JAN_CD AS JAN_CD,
       PRODUCT.PRODUCT_CATEGORY_CLS AS PRODUCT_CATEGORY_CLS
  FROM T_INVENTORY_B BODY
    INNER JOIN T_INVENTORY_H HEAD
      ON BODY.INVENTORY_H_ID = HEAD.INVENTORY_H_ID
     AND HEAD.DEL_FLG = '0'
    INNER JOIN M_CENTER CENTER
      ON HEAD.CENTER_ID = CENTER.CENTER_ID
     AND CENTER.DEL_FLG = '0'
    LEFT OUTER JOIN M_CUSTOMER CUSTOMER
      ON BODY.DEPOSIT_ID = CUSTOMER.CUSTOMER_ID
     AND CUSTOMER.DEL_FLG = '0'
    LEFT OUTER JOIN M_PRODUCT PRODUCT
      ON BODY.PRODUCT_ID = PRODUCT.PRODUCT_ID
     AND PRODUCT.DEL_FLG = '0'
    LEFT OUTER JOIN M_LOCATION LOCATION
      ON BODY.LOCATION_ID = LOCATION.LOCATION_ID
     AND LOCATION.DEL_FLG = '0'
 WHERE CENTER.CENTER_CD = /*pmb.centerCd*/'C001'
    /*IF pmb.depCustomerCd != null*/
    AND CUSTOMER.CUSTOMER_CD = /*pmb.depCustomerCd*/'U01'
  /*END*/
     /*IF pmb.inventoryDt != null*/
   AND HEAD.INVENTORY_DT = /*pmb.inventoryDt*/'20170412'
 /*END*/
      /*IF pmb.isInventoryDiff*/          -- 検索.棚卸差異が「 01：差異ありのみ出力」の場合、以下を設定
   AND BODY.CHARGE_NUM <> BODY.INVENTORY_NUM
     /*END*/
   AND BODY.DEL_FLG = '0'
GROUP BY INVENTORY_DT,
CENTER_CD,
CENTER_ABBR,
PRODUCT_CD,
PRODUCT_NM,
JAN_CD,
PRODUCT_CATEGORY_CLS,
LOCATION_CD
 ORDER BY CENTER.CENTER_CD ASC,
          HEAD.INVENTORY_DT ASC,
          PRODUCT.PRODUCT_CATEGORY_CLS ASC,
          PRODUCT.PRODUCT_CD ASC,
          PRODUCT.JAN_CD ASC,
          LOCATION.LOCATION_CD ASC