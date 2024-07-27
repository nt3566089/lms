/*
 [df:title]
 ピッキングリスト発行画面　出庫作業№単位で1行です。

 [df:description]
  SQL Description here.

*/

-- #df:entity#

-- !df:pmb extends Paging!
-- !!AutoDetect!!
/*IF pmb.isPaging() == false*/
/*SELECT COUNT(*) FROM (*/
/*END*/
SELECT
  AIH.NIZOROE_NO2                                 -- 荷揃番号_ハイフンあり
  , AIH.DAIHYO_NIZOROE_NO2                        -- 代表荷揃番号_ハイフンあり
  , MAX(MCS.CUSTOMER_NM) AS SUPPLY_CUSTOMER_NM    -- 送り先名称
  , MDC.DELIVERY_COURSE_CD                        -- 運送便CD
  , MAX(MDC.DELIVERY_COURSE_NM) AS DELIVERY_COURSE_NM -- 運送便名称
  , MCR.CARRIER_CD                                -- 運送業者CD
  , MAX(MCR.CARRIER_NM) AS CARRIER_NM             -- 運送業者名称
  , MAX(SIH.KOHAI_CONTRACTOR_CD) AS KOHAI_CONTRACTOR_CD -- 戸配契約先CD
  , MAX(SIH.KOHAI_CONTRACTOR_NM) AS KOHAI_CONTRACTOR_NM -- 戸配契約先名称
  , MAX(SIH.SHIPPING_DT) AS SHIPPING_DT           -- 出荷日
  , SIH.WORK_DT                                   -- 作業日
  , PIH.SHIPPING_FIXED_DT                         -- 出荷確定日
  , MAX(SIH.CLIENT_SHIPPING_NO) AS CLIENT_SHIPPING_NO -- 顧客出荷指示No.
  , MAX(MPT.PROCESS_TYPE_CD) AS PROCESS_TYPE_CD   -- 出荷処理区分CD
  , MAX(BD.DICT_NM) AS PROCESS_TYPE_NM            -- 出荷処理区分名称
  , MAX(SIH.SHIPPING_TYPE_CD) AS SHIPPING_TYPE_CD -- 出荷区分CD
  , NULL AS SHIPPING_TYPE_NM                      -- 出荷区分名称
  , MAX(SUB1.SLIP_CNT) AS SLIP_CNT                -- 伝票枚数
  , MAX(SUB1.LINE_CNT) AS LINE_CNT                -- 行数
  , MAX(SUB2.ITEM_CNT) AS ITEM_CNT                -- アイテム数
  , MAX(SUB2.INST_NUM) AS INST_NUM                -- 総バラ数
  , MAX(SUB3.PACKING_NUM) AS PACKING_NUM          -- 梱包数
  , MIN(COALESCE(PIR.NIZOROE_OUT_FLG, '0')) AS NIZOROE_OUT_FLG -- 荷揃表出力フラグ
  , NULL AS NIZOROE_OUT_NM                        -- 荷揃表出力名称
  , MAX(PIR.NIZOROE_OUT_DT) AS NIZOROE_OUT_DT     -- 荷揃表出力日時
  , MIN(COALESCE(PIR.TAG_OUT_FLG, '0')) AS TAG_OUT_FLG -- 荷札出力フラグ
  , NULL AS TAG_OUT_NM                            -- 荷札出力名称
  , MAX(PIR.TAG_OUT_DT) AS TAG_OUT_DT             -- 荷札出力日時
  , MIN(COALESCE(PIR.DELIV_OUT_FLG, '0')) AS DELIV_OUT_FLG -- 納品書出力フラグ
  , NULL AS DELIV_OUT_NM                          -- 納品書出力名称
  , MAX(PIR.DELIV_OUT_DT) AS DELIV_OUT_DT         -- 納品書出力日時
  , MIN(COALESCE(PIR.PLL_OUT_FLG, '0')) AS PLL_OUT_FLG -- 梱包明細出力フラグ
  , NULL AS PLL_OUT_NM                            -- 梱包明細出力名称
  , MAX(PIR.PLL_OUT_DT) AS PLL_OUT_DT             -- 梱包明細出力日時
  , MIN(COALESCE(PIR.INDV_SUPPLY_OUT_FLG, '0')) AS INDV_SUPPLY_OUT_FLG -- 個人別支給明細出力フラグ
  , NULL AS INDV_SUPPLY_OUT_NM                    -- 個人別支給明細出力名称
  , MAX(PIR.INDV_SUPPLY_OUT_DT) AS INDV_SUPPLY_OUT_DT -- 個人別支給明細出力日時
  , MIN(COALESCE(PIR.INDV_LABEL_OUT_FLG, '0')) AS INDV_LABEL_OUT_FLG -- 個別貼り付けラベル出力フラグ
  , NULL AS INDV_LABEL_OUT_NM                     -- 個別貼り付けラベル出力名称
  , MAX(PIR.INDV_LABEL_OUT_DT) AS INDV_LABEL_OUT_DT -- 個別貼り付けラベル出力日時
  , MCT.CENTER_CD                                 -- センタCD
  , MAX(MCT.CENTER_NM) AS CENTER_NM               -- センタ名称
  , MAX(SIH.EMERGENCY_FLG) AS EMERGENCY_FLG       -- 緊急フラグ
  , MAX(PIH.PICKING_STATUS) AS PICKING_STATUS_CD  -- 出荷ステータス
  , MAX(PIH.ID_MANAG_PRINT_TYPE_CD) AS ID_MANAG_PRINT_TYPE_CD -- 個体管理印刷区分
FROM
  T_ALLOC_INST_H AIH                              -- 引当指示ヘッダ
  LEFT JOIN T_SHIPPING_INST_H SIH                 -- 出荷指示ヘッダ
    ON AIH.ALLOC_INST_H_ID = SIH.ALLOC_INST_H_ID
    AND SIH.DEL_FLG = '0'
  LEFT JOIN T_PICKING_H PIH                       -- 出庫ヘッダ
    ON AIH.ALLOC_INST_H_ID = PIH.ALLOC_INST_H_ID
    AND PIH.DEL_FLG = '0'
  LEFT JOIN T_PICKING_R PIR                       -- 出庫帳票
    ON PIH.PICKING_H_ID = PIR.PICKING_H_ID
    AND PIR.DEL_FLG = '0'
  INNER JOIN M_CENTER MCT                         -- センタマスタ
    ON AIH.CENTER_ID = MCT.CENTER_ID
    AND MCT.DEL_FLG = '0'
  LEFT JOIN M_CUSTOMER MCS                        -- 取引先マスタ(納品先)
    ON AIH.SUPPLY_CUSTOMER_ID = MCS.CUSTOMER_ID
    AND MCS.DEL_FLG = '0'
  LEFT JOIN M_DELIVERY_COURSE MDC                 -- 配送コースマスタ
    ON SIH.DELIVERY_COURSE_ID = MDC.DELIVERY_COURSE_ID
    AND MDC.DEL_FLG = '0'
  LEFT JOIN M_CARRIER MCR                         -- 運送業者マスタ
    ON SIH.CARRIER_ID = MCR.CARRIER_ID
    AND MCR.DEL_FLG = '0'
  INNER JOIN M_PROCESS_TYPE MPT                   -- 処理区分マスタ
    ON AIH.PROCESS_TYPE_ID = MPT.PROCESS_TYPE_ID
    AND MPT.DEL_FLG = '0'
  LEFT JOIN V_DICT BD                             -- 辞書ビュー
    ON MPT.DICT_ID = BD.DICT_ID
    AND (
      BD.CULTURE_ID = /*pmb.cultureId*/11111111111
      OR BD.CULTURE_ID IS NULL
    )
  LEFT JOIN (
    SELECT
      AIH.ALLOC_INST_H_ID
      , COUNT(DISTINCT SIH.SHIPPING_INST_H_ID) AS SLIP_CNT -- 伝票数
      , COUNT(DISTINCT SIB.SHIPPING_INST_B_ID) AS LINE_CNT -- 行数
    FROM
      T_ALLOC_INST_H AIH                          -- 引当指示ヘッダ
      INNER JOIN T_SHIPPING_INST_H SIH            -- 出荷指示ヘッダ
        ON AIH.ALLOC_INST_H_ID = SIH.ALLOC_INST_H_ID
        AND SIH.DEL_FLG = '0'
      INNER JOIN T_SHIPPING_INST_B SIB            -- 出荷指示ボディ
        ON SIH.SHIPPING_INST_H_ID = SIB.SHIPPING_INST_H_ID
        AND SIB.DEL_FLG = '0'
      INNER JOIN T_PICKING_H PIH                  -- 出庫ヘッダ
        ON AIH.ALLOC_INST_H_ID = PIH.ALLOC_INST_H_ID
        AND PIH.DEL_FLG = '0'
      INNER JOIN T_PICKING_R PIR                  -- 出庫帳票
        ON PIH.PICKING_H_ID = PIR.PICKING_H_ID
        AND PIR.DEL_FLG = '0'
      INNER JOIN M_CENTER MCT                     -- センタマスタ
        ON AIH.CENTER_ID = MCT.CENTER_ID
        AND MCT.DEL_FLG = '0'
    WHERE
      AIH.DEL_FLG = '0'
    /*IF pmb.centerCd != null*/
      AND MCT.CENTER_CD = /*pmb.centerCd*/'C001'
    /*END*/
    /*IF pmb.shippingSlipType == '01' || pmb.shippingSlipType == '02' || pmb.shippingSlipType == '03' || pmb.shippingSlipType == '04' || pmb.shippingSlipType == '05'*/
      AND PIR.NIZOROE_OUT_FLG = '1'
    /*END*/
    /*IF pmb.shippingSlipType == '06'*/
      AND PIR.PL_OUT_FLG = '1'
    /*END*/
    /*IF pmb.shippingSlipType == '07'*/
      AND PIR.DELIV_OUT_FLG = '1'
    /*END*/
    /*IF pmb.shippingSlipType == '08'*/
      AND PIR.TAG_OUT_FLG = '1'
    /*END*/
    /*IF pmb.shippingSlipType == '09'*/
      AND PIR.TAG_OUT_FLG = '1'
      AND PIR.DELIV_OUT_FLG = '1'
    /*END*/
    /*IF pmb.shippingSlipType == '10'*/
      AND PIR.PLL_OUT_FLG = '1'
    /*END*/
    /*IF pmb.shippingSlipType == '11'*/
      AND PIR.INDV_LABEL_OUT_FLG = '1'
    /*END*/
    /*IF pmb.shippingSlipType == '12'*/
      AND PIR.INDV_SUPPLY_OUT_FLG = '1'
    /*END*/
    /*IF pmb.printStatus != null*/
      AND PIH.PRINT_STATUS = /*pmb.printStatus*/'1'
    /*END*/
    /*IF pmb.deliveryCourseCd != null*/
      AND SIH.DELIVERY_COURSE_CD = /*pmb.deliveryCourseCd*/'a123'
    /*END*/
    /*IF pmb.carrierCd != null*/
      AND SIH.CARRIER_CD = /*pmb.carrierCd*/'a123'
    /*END*/
    /*IF pmb.clientShippingNo != null*/
      AND SIH.CLIENT_SHIPPING_NO LIKE /*pmb.clientShippingNo*/'0125%'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '0'*/
      AND SIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '0'*/
      AND SIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '1'*/
      AND SIH.WORK_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '1'*/
      AND SIH.WORK_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '2'*/
      AND PIH.SHIPPING_FIXED_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '2'*/
      AND PIH.SHIPPING_FIXED_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.nizoroeNo2From != null*/
      AND AIH.NIZOROE_NO2 >= /*pmb.nizoroeNo2From*/'0125'
    /*END*/
    /*IF pmb.nizoroeNo2To != null*/
      AND AIH.NIZOROE_NO2 <= /*pmb.nizoroeNo2To*/'0125'
    /*END*/
    /*IF pmb.daihyoNizoroeNo2From != null*/
      AND AIH.DAIHYO_NIZOROE_NO2 >= /*pmb.daihyoNizoroeNo2From*/'0125'
    /*END*/
    /*IF pmb.daihyoNizoroeNo2To != null*/
      AND AIH.DAIHYO_NIZOROE_NO2 <= /*pmb.daihyoNizoroeNo2To*/'0125'
    /*END*/
    GROUP BY
      AIH.ALLOC_INST_H_ID
  ) SUB1
    ON AIH.ALLOC_INST_H_ID = SUB1.ALLOC_INST_H_ID
  LEFT JOIN (
    SELECT
      AIH.ALLOC_INST_H_ID
      , COUNT(DISTINCT SIB.PRODUCT_ID) AS ITEM_CNT -- アイテム数
      , SUM(SIB.INST_NUM) AS INST_NUM             -- 総バラ数
    FROM
      T_ALLOC_INST_H AIH                          -- 引当指示ヘッダ
      INNER JOIN T_SHIPPING_INST_H SIH            -- 出荷指示ヘッダ
        ON AIH.ALLOC_INST_H_ID = SIH.ALLOC_INST_H_ID
        AND SIH.DEL_FLG = '0'
      INNER JOIN T_SHIPPING_INST_B SIB            -- 出荷指示ボディ
        ON SIH.SHIPPING_INST_H_ID = SIB.SHIPPING_INST_H_ID
        AND SIB.DEL_FLG = '0'
      INNER JOIN T_PICKING_H PIH                  -- 出庫ヘッダ
        ON AIH.ALLOC_INST_H_ID = PIH.ALLOC_INST_H_ID
        AND PIH.DEL_FLG = '0'
      INNER JOIN M_CENTER MCT                     -- センタマスタ
        ON AIH.CENTER_ID = MCT.CENTER_ID
        AND MCT.DEL_FLG = '0'
    WHERE
      AIH.DEL_FLG = '0'
    /*IF pmb.centerCd != null*/
      AND MCT.CENTER_CD = /*pmb.centerCd*/'C001'
    /*END*/
    /*IF pmb.deliveryCourseCd != null*/
      AND SIH.DELIVERY_COURSE_CD = /*pmb.deliveryCourseCd*/'a123'
    /*END*/
    /*IF pmb.carrierCd != null*/
      AND SIH.CARRIER_CD = /*pmb.carrierCd*/'a123'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '0'*/
      AND SIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '0'*/
      AND SIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '1'*/
      AND SIH.WORK_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '1'*/
      AND SIH.WORK_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '2'*/
      AND PIH.SHIPPING_FIXED_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '2'*/
      AND PIH.SHIPPING_FIXED_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.nizoroeNo2From != null*/
      AND AIH.NIZOROE_NO2 >= /*pmb.nizoroeNo2From*/'0125'
    /*END*/
    /*IF pmb.nizoroeNo2To != null*/
      AND AIH.NIZOROE_NO2 <= /*pmb.nizoroeNo2To*/'0125'
    /*END*/
    /*IF pmb.daihyoNizoroeNo2From != null*/
      AND AIH.DAIHYO_NIZOROE_NO2 >= /*pmb.daihyoNizoroeNo2From*/'0125'
    /*END*/
    /*IF pmb.daihyoNizoroeNo2To != null*/
      AND AIH.DAIHYO_NIZOROE_NO2 <= /*pmb.daihyoNizoroeNo2To*/'0125'
    /*END*/
    GROUP BY
      AIH.ALLOC_INST_H_ID
  ) SUB2
    ON AIH.ALLOC_INST_H_ID = SUB2.ALLOC_INST_H_ID
  LEFT JOIN (
    SELECT
      PAH.ALLOC_INST_H_ID
      , SUM(PAB.PACKING_NUM) AS PACKING_NUM       -- 梱包数
    FROM
      T_ALLOC_INST_H AIH                          -- 引当指示ヘッダ
      INNER JOIN T_PICKING_H PIH                  -- 出庫ヘッダ
        ON AIH.ALLOC_INST_H_ID = PIH.ALLOC_INST_H_ID
        AND PIH.DEL_FLG = '0'
      INNER JOIN T_PACKING_H PAH                  -- 梱包ヘッダ
        ON AIH.ALLOC_INST_H_ID = PAH.ALLOC_INST_H_ID
        AND PAH.DEL_FLG = '0'
      INNER JOIN T_PACKING_B PAB                  -- 梱包ボディ
        ON PAH.PACKING_H_ID = PAB.PACKING_H_ID
        AND PAB.DEL_FLG = '0'
      INNER JOIN M_CENTER MCT                     -- センタマスタ
        ON AIH.CENTER_ID = MCT.CENTER_ID
        AND MCT.DEL_FLG = '0'
    WHERE
      AIH.DEL_FLG = '0'
    /*IF pmb.centerCd != null*/
      AND MCT.CENTER_CD = /*pmb.centerCd*/'C001'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '0'*/
      AND AIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '0'*/
      AND AIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '1'*/
      AND AIH.WORK_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '1'*/
      AND AIH.WORK_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.dtFrom != null && pmb.searchReferenceDt == '2'*/
      AND PIH.SHIPPING_FIXED_DT >= /*pmb.dtFrom*/'20140805'
    /*END*/
    /*IF pmb.dtTo != null && pmb.searchReferenceDt == '2'*/
      AND PIH.SHIPPING_FIXED_DT <= /*pmb.dtTo*/'20141105'
    /*END*/
    /*IF pmb.nizoroeNo2From != null*/
      AND AIH.NIZOROE_NO2 >= /*pmb.nizoroeNo2From*/'0125'
    /*END*/
    /*IF pmb.nizoroeNo2To != null*/
      AND AIH.NIZOROE_NO2 <= /*pmb.nizoroeNo2To*/'0125'
    /*END*/
    /*IF pmb.daihyoNizoroeNo2From != null*/
      AND AIH.DAIHYO_NIZOROE_NO2 >= /*pmb.daihyoNizoroeNo2From*/'0125'
    /*END*/
    /*IF pmb.daihyoNizoroeNo2To != null*/
      AND AIH.DAIHYO_NIZOROE_NO2 <= /*pmb.daihyoNizoroeNo2To*/'0125'
    /*END*/
    GROUP BY
      PAH.ALLOC_INST_H_ID
  ) SUB3
    ON AIH.ALLOC_INST_H_ID = SUB3.ALLOC_INST_H_ID
WHERE
  AIH.DEL_FLG = '0'
/*IF pmb.centerCd != null*/
  AND MCT.CENTER_CD = /*pmb.centerCd*/'C001'
/*END*/
/*IF pmb.shippingSlipType == '01' || pmb.shippingSlipType == '02' || pmb.shippingSlipType == '03' || pmb.shippingSlipType == '04' || pmb.shippingSlipType == '05'*/
  AND PIR.NIZOROE_OUT_FLG = '1'
/*END*/
/*IF pmb.shippingSlipType == '06'*/
  AND PIR.PL_OUT_FLG = '1'
/*END*/
/*IF pmb.shippingSlipType == '07'*/
  AND PIR.DELIV_OUT_FLG = '1'
/*END*/
/*IF pmb.shippingSlipType == '08'*/
  AND PIR.TAG_OUT_FLG = '1'
/*END*/
/*IF pmb.shippingSlipType == '09'*/
  AND PIR.TAG_OUT_FLG = '1'
  AND PIR.DELIV_OUT_FLG = '1'
/*END*/
/*IF pmb.shippingSlipType == '10'*/
  AND PIR.PLL_OUT_FLG = '1'
/*END*/
/*IF pmb.shippingSlipType == '11'*/
  AND PIR.INDV_LABEL_OUT_FLG = '1'
/*END*/
/*IF pmb.shippingSlipType == '12'*/
  AND PIR.INDV_SUPPLY_OUT_FLG = '1'
/*END*/
/*IF pmb.printStatus != null*/
  AND PIH.PRINT_STATUS = /*pmb.printStatus*/'1'
/*END*/
/*IF pmb.deliveryCourseCd != null*/
  AND SIH.DELIVERY_COURSE_CD = /*pmb.deliveryCourseCd*/'a123'
/*END*/
/*IF pmb.carrierCd != null*/
  AND SIH.CARRIER_CD = /*pmb.carrierCd*/'a123'
/*END*/
/*IF pmb.clientShippingNo != null*/
  AND SIH.CLIENT_SHIPPING_NO LIKE /*pmb.clientShippingNo*/'0125%'
/*END*/
/*IF pmb.dtFrom != null && pmb.searchReferenceDt == '0'*/
  AND SIH.SHIPPING_DT >= /*pmb.dtFrom*/'20140805'
/*END*/
/*IF pmb.dtTo != null && pmb.searchReferenceDt == '0'*/
  AND SIH.SHIPPING_DT <= /*pmb.dtTo*/'20141105'
/*END*/
/*IF pmb.dtFrom != null && pmb.searchReferenceDt == '1'*/
  AND SIH.WORK_DT >= /*pmb.dtFrom*/'20140805'
/*END*/
/*IF pmb.dtTo != null && pmb.searchReferenceDt == '1'*/
  AND SIH.WORK_DT <= /*pmb.dtTo*/'20141105'
/*END*/
/*IF pmb.dtFrom != null && pmb.searchReferenceDt == '2'*/
  AND PIH.SHIPPING_FIXED_DT >= /*pmb.dtFrom*/'20140805'
/*END*/
/*IF pmb.dtTo != null && pmb.searchReferenceDt == '2'*/
  AND PIH.SHIPPING_FIXED_DT <= /*pmb.dtTo*/'20141105'
/*END*/
/*IF pmb.nizoroeNo2From != null*/
  AND AIH.NIZOROE_NO2 >= /*pmb.nizoroeNo2From*/'0125'
/*END*/
/*IF pmb.nizoroeNo2To != null*/
  AND AIH.NIZOROE_NO2 <= /*pmb.nizoroeNo2To*/'0125'
/*END*/
/*IF pmb.daihyoNizoroeNo2From != null*/
  AND AIH.DAIHYO_NIZOROE_NO2 >= /*pmb.daihyoNizoroeNo2From*/'0125'
/*END*/
/*IF pmb.daihyoNizoroeNo2To != null*/
  AND AIH.DAIHYO_NIZOROE_NO2 <= /*pmb.daihyoNizoroeNo2To*/'0125'
/*END*/
GROUP BY
  MCT.CENTER_CD
  , SIH.WORK_DT
  , PIH.SHIPPING_FIXED_DT
  , AIH.DAIHYO_NIZOROE_NO2
  , AIH.NIZOROE_NO2
  , MDC.DELIVERY_COURSE_CD
  , SIH.CARRIER_ID
/*IF pmb.isPaging()*/
ORDER BY
  MCT.CENTER_CD
  , SIH.WORK_DT
  , PIH.SHIPPING_FIXED_DT
  , AIH.DAIHYO_NIZOROE_NO2
  , AIH.NIZOROE_NO2
  , MDC.DELIVERY_COURSE_CD
  , AIH.SUPPLY_CUSTOMER_NM
-- ELSE ) CNT
/*END*/
