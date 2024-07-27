package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of es_shipping_inst as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_ID
 *
 * [column]
 *     SHIPPING_INST_ID, SEND_FLG, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, SALES_ORDER_NO, HINMOKU_CD, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, NIZOROE_NO, SHIPPING_TYPE_CD, SHIPPING_REASON_CD, HINMOKU_GROUP, SHIPPING_NUM, SALES_ORDER_NUM, HINMOKU_TEXT, JAN_CD, UNIT_NM, EC_UNIT_NM, SAMPLE_TYPE_CD, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, DIRECT_DELIVERY_TYPE_CD, KOGUCHI_DELIVERY_FLG, SPLIT_DELIVERY_TYPE_CD, CARRIER_TYPE_CD, CARRIER_CD, EXPRESS_CD, SHIPPING_DT, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_ORDER_NO, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, DESTINATION_FAX, KANJI_MESSAGE1, KANJI_MESSAGE2, KANJI_MESSAGE3, KANJI_MESSAGE4, KANJI_MESSAGE5, KANJI_MESSAGE6, KANJI_MESSAGE7, KANJI_MESSAGE8, KANJI_MESSAGE9, KANJI_MESSAGE10, KANA_MESSAGE1, KANA_MESSAGE2, KANA_MESSAGE3, KANA_MESSAGE4, KANA_MESSAGE5, KANA_MESSAGE6, KANA_MESSAGE7, KANA_MESSAGE8, KANA_MESSAGE9, KANA_MESSAGE10, DELIVERY_NOTE_SUMMARY, INVOICE_SUMMARY, UNIT_PRICE, EC_ORDER_NO, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, ORDER_DT, KOKYAKU_CD, PAYMENT_TYPE_CD, TOTAL_PRICE, SHIPPING_FEE, SEPARATE_SHIPPING_FEE, COD_FEE, SALES_TAX_RATE, PRICE_HIDDEN_FLG, PAYMENT_HIDDEN_FLG, ORDER_NO_DELIVERY_NOTE, POINT, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, DEAL_TYPE_CD, CUSTOMER_CD, CUSTOMER_NM, DELIV_CD, EMP_ID_CD, EMP_NM, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfEsShippingInst {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EsShippingInst> _selectedList;
    protected BehaviorSelector _selector;
    protected EsShippingInstBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEsShippingInst ready(List<EsShippingInst> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EsShippingInstBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EsShippingInstBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EsShippingInst> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
