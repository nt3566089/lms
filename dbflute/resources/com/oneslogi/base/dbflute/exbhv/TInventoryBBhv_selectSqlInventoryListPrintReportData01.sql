/*
 [df:title]
棚卸関連リスト発行 棚卸在庫差異表

 [df:description]
  SQL Description here.
*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!
SELECT BODY.INVENTORY_B_ID       AS INVENTORY_B_ID,
        BODY.LOT                  AS LOT,
        BODY.LIMIT_DT             AS LIMIT_DT,
        BODY.CHARGE_NUM           AS CHARGE_NUM,
        BODY.INVENTORY_NUM        AS INVENTORY_NUM,
        BODY.PROD_DT              AS PROD_DT,
        BODY.AREA_CD              AS AREA_CD,
        CUSTOMER.CUSTOMER_CD      AS DEPOSIT_CD,
        CUSTOMER_A.CUSTOMER_CD    AS CUSTOMER_CD,
        CUSTOMER_A.CUSTOMER_NM    AS CUSTOMER_NM,
        CENTER.CENTER_CD          AS CENTER_CD,
        CENTER.CENTER_ABBR        AS CENTER_ABBR,
        LOCATION.LOCATION_CD      AS LOCATION_CD,
        PRODUCT.JAN_CD            AS JAN_CD,
        DEPPRODUCT.DEPOSIT_JAN_CD AS DJAN_CD,
        PRODUCT.PRODUCT_NM        AS PRODUCT_NM,
        SALESORG.SALES_ORG_CD     AS SALES_ORG_CD,
        SALESORG.TENHANSHA_NM1    AS TENHANSHA_NM1,
        SALESORG.TENHANSHA_NM2    AS TENHANSHA_NM2,
        BUSER.USER_NM             AS USER_NM,
        (SELECT COUNT(LABEL.RECEIVE_LABEL_NO)
         FROM T_INVENTORY_RECEIVE_LABEL LABEL
         WHERE LABEL.INVENTORY_B_ID = BODY.INVENTORY_B_ID
           AND LABEL.SCAN_FLG = '1'
           AND LABEL.DEL_FLG = '0'
        )                         AS SCANCOUNT -- ケース数
 FROM T_INVENTORY_B BODY
          INNER JOIN T_INVENTORY_H HEAD
                     ON BODY.INVENTORY_H_ID = HEAD.INVENTORY_H_ID
                         AND HEAD.DEL_FLG = '0'
          INNER JOIN M_CENTER CENTER
                     ON HEAD.CENTER_ID = CENTER.CENTER_ID
                         AND CENTER.DEL_FLG = '0'
          LEFT OUTER JOIN M_CLIENT CLIENT
                          ON HEAD.CLIENT_ID = CLIENT.CLIENT_ID
                              AND CLIENT.DEL_FLG = '0'
          LEFT OUTER JOIN T_INVENTORY_R REPORT
                          ON BODY.INVENTORY_B_ID = REPORT.INVENTORY_B_ID
                              AND REPORT.DEL_FLG = '0'
          LEFT OUTER JOIN M_CUSTOMER CUSTOMER
                          ON BODY.DEPOSIT_ID = CUSTOMER.CUSTOMER_ID
                              AND CUSTOMER.DEL_FLG = '0'
          LEFT OUTER JOIN M_CUSTOMER CUSTOMER_A
                          ON CUSTOMER_A.CUSTOMER_ID = BODY.ACCOUNT_ID
                              AND CUSTOMER_A.DEL_FLG = '0'
          LEFT OUTER JOIN M_LOCATION LOCATION
                          ON BODY.LOCATION_ID = LOCATION.LOCATION_ID
                              AND LOCATION.DEL_FLG = '0'
          LEFT OUTER JOIN M_PRODUCT PRODUCT
                          ON BODY.PRODUCT_ID = PRODUCT.PRODUCT_ID
                              AND PRODUCT.DEL_FLG = '0'
          LEFT OUTER JOIN M_SALES_ORG SALESORG
                          ON BODY.SALES_ORG_ID = SALESORG.SALES_ORG_ID
                              AND SALESORG.DEL_FLG = '0'
          LEFT OUTER JOIN T_STOCK STOCK
                          ON BODY.STOCK_ID = STOCK.STOCK_ID
                              AND STOCK.DEL_FLG = '0'
          LEFT OUTER JOIN M_WAREHOUSE WAREHOUSE
                          ON BODY.WAREHOUSE_ID = WAREHOUSE.WAREHOUSE_ID
                              AND WAREHOUSE.DEL_FLG = '0'
          LEFT OUTER JOIN B_USER BUSER
                          ON BODY.INVENTORY_USER_ID = BUSER.USER_ID
                              AND BUSER.DEL_FLG = '0'
          LEFT OUTER JOIN M_DEPOSIT_PRODUCT DEPPRODUCT
                              ON BODY.PRODUCT_ID = DEPPRODUCT.PRODUCT_ID
                              AND BODY.SALES_ORG_ID = DEPPRODUCT.SALES_ORG_ID
                               AND BODY.DEL_FLG = '0'
                              AND
                               CASE  WHEN BODY.ACCOUNT_ID IS NULL  -- 店販社預り品の場合
                                THEN
                                	1 = 1
                                ELSE  -- ユーザ預り品の場合
                                BODY.ACCOUNT_ID  =	DEPPRODUCT.ACCOUNT_ID
                                END
 WHERE CENTER.CENTER_CD = /*pmb.centerCd*/'C001'
   /*IF pmb.depCustomerCd != null*/
    AND CUSTOMER.CUSTOMER_CD = /*pmb.depCustomerCd*/'U01'
  /*END*/

  /*IF pmb.inventoryDt != null*/
   AND HEAD.INVENTORY_DT = /*pmb.inventoryDt*/'20170412'
 /*END*/
  /*IF pmb.locationFrom != null*/
    AND LOCATION.LOCATION_CD >= /*pmb.locationFrom*/'U01'
  /*END*/
    /*IF pmb.locationTo != null*/
    AND LOCATION.LOCATION_CD <= /*pmb.locationTo*/'U01'
  /*END*/
  /*IF pmb.areaCd != null*/
    AND BODY.AREA_CD = /*pmb.areaCd*/'U01'
  /*END*/
    /*IF pmb.inventoryUserCd != null*/
    AND BUSER.USER_CD like /*pmb.inventoryUserCd*/'PD%'
  /*END*/
     /*IF pmb.isPrintType*/     -- 検索.棚卸リスト発行区分が「 01：未出力のロケのみ出力」の場合、以下を設定
   AND REPORT.INVENTORY_DIFF_OUT_FLG = '0'     -- 棚卸在庫差異表出力フラグ
     /*END*/
     /*IF pmb.isInventoryDiff*/          -- 検索.棚卸差異が「 01：差異ありのみ出力」の場合、以下を設定
   AND BODY.CHARGE_NUM <> BODY.INVENTORY_NUM
     /*END*/
   AND BODY.DEL_FLG = '0'
 ORDER BY
          CENTER.CENTER_CD ASC,
          LOCATION.PICKING_ORDER ASC,
          LOCATION.LOCATION_CD ASC,
          PRODUCT.PRODUCT_CD ASC,
          SALESORG.SALES_ORG_CD ASC,
          CUSTOMER.CUSTOMER_CD ASC,
          BODY.LIMIT_DT ASC,
          BODY.PROD_DT ASC,
          BODY.LOT ASC