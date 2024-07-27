-- 荷主・センタ制御の最小化
-- b_item(荷主, センタ)の編集可能項目をデフォルトで編集不可に更新する
-- b_item(荷主, センタ)の編集可能項目を編集可で固定したい場合はNOT句にOR条件を追加する(SCREEN_CD AND ITEM_CD)
-- b_item荷主・センタ制御の最小化を実行しない場合はb_item用sqlを全てコメントアウト、もしくは、ファイル内b_item用記述を全て削除する
UPDATE B_ITEM BI
   SET BI.EDITABLE = 0
 WHERE BI.EDITABLE = 1
   AND EXISTS (
         SELECT *
           FROM B_SCREEN BS
          WHERE BS.SCREEN_ID = BI.SCREEN_ID
            AND (BI.ITEM_CD LIKE '%centerCd%' OR BI.ITEM_CD LIKE '%clientCd%')
            AND NOT (   (BS.SCREEN_CD = 'LogList' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'LogList' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'BoxGroupMasterEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'CarrierMasterEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'CenterClassEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'CenterClassGrpDtlEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'CenterClassGrpEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'CenterClassList' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'CenterMasterEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'CenterMasterList' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'ClientMaster' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'CustomerMasterEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'CustomerMasterEdit' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'DeliveryCourseMasterEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'InventoryInputAddRow' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'InventoryInputAddRow' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'ParameterMasterEdit' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'ParameterMasterEdit' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'PieceShippingInspect' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'PieceShippingInspect' AND BI.ITEM_CD = 'clientCd')
-- [#5115][v3.1] 単行出荷検品 作成 2018.08.13 kawana Start
                     OR (BS.SCREEN_CD = 'SingleRowShippingInspect' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'SingleRowShippingInspect' AND BI.ITEM_CD = 'clientCd')
-- [#5115][v3.1] 単行出荷検品 作成 2018.08.13 kawana End
                     OR (BS.SCREEN_CD = 'ProductMasterEdit' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'ReceiveInput' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'ReceiveInput' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'SetStructureEdit' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'ShippingInstDetail' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'ShippingInstDetail' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'ShippingUpdate' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'ShippingUpdate' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'StockMoveInstList' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'StockMoveInstList' AND BI.ITEM_CD = 'clientCd')
                     OR (BS.SCREEN_CD = 'TotalStockList' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'TotalStockList' AND BI.ITEM_CD = 'clientCd')
-- [#4481][Ver3.0] センタ・荷主の変更可に対応 2018.04.19 miyabe Add Start
                     OR (BS.SCREEN_CD = 'ReferenceTotalStockList' AND BI.ITEM_CD = 'centerCd')
-- [#4481][Ver3.0] センタ・荷主の変更可に対応 2018.04.19 miyabe Add End
                     OR (BS.SCREEN_CD = 'CenterRelatedCopy' AND BI.ITEM_CD = 'centerCdFrom')
                     OR (BS.SCREEN_CD = 'CenterRelatedCopy' AND BI.ITEM_CD = 'clientCdFrom')
                     OR (BS.SCREEN_CD = 'CenterRelatedCopy' AND BI.ITEM_CD = 'centerCdTo')
                     OR (BS.SCREEN_CD = 'CenterRelatedCopy' AND BI.ITEM_CD = 'clientCdTo')
-- [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 2017.12.05 honma Add Start
                     OR (BS.SCREEN_CD = 'UserMasterList' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'UserMasterList' AND BI.ITEM_CD = 'clientCd')
-- [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 2017.12.05 honma Add End
-- [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.02.27 kawana Start
                     OR (BS.SCREEN_CD = 'LocationMasterEdit' AND BI.ITEM_CD = 'clientCd')
-- [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.02.27 kawana End
                     OR (BS.SCREEN_CD = 'WebHTinfoMaster' AND BI.ITEM_CD = 'centerCd')
                     OR (BS.SCREEN_CD = 'WebHTinfoMaster' AND BI.ITEM_CD = 'clientCd')
                )
       )
;

-- 荷主・センタ制御の最小化
-- b_col(荷主, センタ)の編集可能項目をデフォルトで編集不可に更新する
-- b_col荷主・センタ制御の最小化を実行しない場合はb_col用sqlを全てコメントアウト、もしくは、ファイル内b_col用記述を全て削除する
