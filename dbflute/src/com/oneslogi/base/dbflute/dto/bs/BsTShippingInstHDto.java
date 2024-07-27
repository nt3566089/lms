package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_shipping_inst_h as TABLE. <br>
 * 出荷指示ヘッダ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM1, DELIV_CUSTOMER_NM2, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, NIZOROE_NO, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SHIPPING_TYPE_ID, SHIPPING_TYPE_CD, CARRIER_ID, CARRIER_CD, SALES_ORG_CD, SALES_ORDER_NO, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, ORDER_DT, KOKYAKU_CD, SHIPPING_FEE, SEPARATE_SHIPPING_FEE, COD_FEE, ORDER_NO_DELIVERY_NOTE, POINT, KOGUCHI_DELIVERY_FLG, RECORD_SEND_FLG, CARRIER_DATA_OUT_FLG, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, NIZOROE_ID, NIZOROE_PROC_UNIT, ACCOUNT_ID, ACCOUNT_CD, SHIPPING_REASON_CD, TRANSFER_FLG, TENHANSHA_SALES_ORDER_NO, DELIV_CD, SALES_ORDER_NUM, DIRECT_DELIVERY_TYPE_CD, SPLIT_DELIVERY_TYPE_CD, CARRIER_TYPE_CD, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_CD, DESTINATION_NM_KANA, DESTINATION_FAX, KANJI_MESSAGE1, KANJI_MESSAGE2, KANJI_MESSAGE3, KANJI_MESSAGE4, KANJI_MESSAGE5, KANJI_MESSAGE6, KANJI_MESSAGE7, KANJI_MESSAGE8, KANJI_MESSAGE9, KANJI_MESSAGE10, KANA_MESSAGE1, KANA_MESSAGE2, KANA_MESSAGE3, KANA_MESSAGE4, KANA_MESSAGE5, KANA_MESSAGE6, KANA_MESSAGE7, KANA_MESSAGE8, KANA_MESSAGE9, KANA_MESSAGE10, DELIVERY_NOTE_SUMMARY, INVOICE_SUMMARY, EC_ORDER_NO, PAYMENT_TYPE_CD, PRICE_HIDDEN_FLG, PAYMENT_HIDDEN_FLG, DIRECT_UPD_FLG, IF_ID, CUSTOMER_CD, CUSTOMER_NM, PSAM, FLOOR_COMP_FLG, DELIVERY_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_delivery_course, m_process_type, m_customer, m_client, t_alloc_inst_h, m_center, m_zip(ForDeliv), m_sales_org(BySalesOrg), b_class_dtl(ByDelivTz)
 *
 * [referrer-table]
 *     t_ec_order_h, t_shipping_inst_b, t_shipping_inst_h_print
 *
 * [foreign-property]
 *     mDeliveryCourse, mProcessType, mCustomerByDelivCustomerId, mClient, mCustomerBySupplyCustomerId, tAllocInstH, mCenter, mZipForDeliv, mSalesOrgBySalesOrg, mCustomerByAccoutId, bClassDtlByDelivTz, bClassDtlByEmergencyFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByShippingStatus, bClassDtlByStockOutFlg
 *
 * [referrer-property]
 *     tEcOrderHList, tShippingInstBList, tShippingInstHPrintList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingInstHDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingInstHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} */
    @JsonKey
    protected Long _processTypeId;

    /** INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} */
    @JsonKey
    protected String _inputType;

    /** SHIPPING_DT: {IX, NotNull, VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** WORK_DT: {IX, VARCHAR(8)} */
    @JsonKey
    protected String _workDt;

    /** DELIV_PLAN_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _delivPlanDt;

    /** DELIV_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} */
    @JsonKey
    protected String _delivTz;

    /** CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** SHIPPING_SLIP_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipNo;

    /** SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} */
    @JsonKey
    protected String _shippingStatus;

    /** SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _delivCustomerId;

    /** DELIV_CUSTOMER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _delivCustomerCd;

    /** DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP} */
    @JsonKey
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {VARCHAR(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {VARCHAR(255)} */
    @JsonKey
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {VARCHAR(255)} */
    @JsonKey
    protected String _delivAddress3;

    /** DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} */
    @JsonKey
    protected String _delivAddressSupply;

    /** DELIV_CUSTOMER_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** DELIV_CUSTOMER_NM1: {VARCHAR(255)} */
    @JsonKey
    protected String _delivCustomerNm1;

    /** DELIV_CUSTOMER_NM2: {VARCHAR(255)} */
    @JsonKey
    protected String _delivCustomerNm2;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** DELIVERY_COURSE_CD: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} */
    @JsonKey
    protected String _emergencyFlg;

    /** PICKING_WORK_MESSAGE: {VARCHAR(255)} */
    @JsonKey
    protected String _pickingWorkMessage;

    /** ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** PICKING_BATCH_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _pickingBatchNo;

    /** STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} */
    @JsonKey
    protected String _stockOutFlg;

    /** ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h} */
    @JsonKey
    protected Long _allocInstHId;

    /** COD: {BIGINT(19)} */
    @JsonKey
    protected Long _cod;

    /** COD_TAX: {BIGINT(19)} */
    @JsonKey
    protected Long _codTax;

    /** TOTAL_PRICE: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _totalPrice;

    /** TOTAL_TAX: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _totalTax;

    /** NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo2;

    /** SHIPPING_TYPE_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _shippingTypeId;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingTypeCd;

    /** CARRIER_ID: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierId;

    /** CARRIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd;

    /** SALES_ORG_CD: {VARCHAR(30), FK to M_SALES_ORG} */
    @JsonKey
    protected String _salesOrgCd;

    /** SALES_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderNo;

    /** SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderSlipTypeCd;

    /** SALES_ORDER_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderSlipNo;

    /** ORDER_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _orderDt;

    /** KOKYAKU_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _kokyakuCd;

    /** SHIPPING_FEE: {BIGINT(19)} */
    @JsonKey
    protected Long _shippingFee;

    /** SEPARATE_SHIPPING_FEE: {BIGINT(19)} */
    @JsonKey
    protected Long _separateShippingFee;

    /** COD_FEE: {BIGINT(19)} */
    @JsonKey
    protected Long _codFee;

    /** ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} */
    @JsonKey
    protected String _orderNoDeliveryNote;

    /** POINT: {BIGINT(19)} */
    @JsonKey
    protected Long _point;

    /** KOGUCHI_DELIVERY_FLG: {CHAR(1)} */
    @JsonKey
    protected String _koguchiDeliveryFlg;

    /** RECORD_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _recordSendFlg;

    /** CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _carrierDataOutFlg;

    /** KOHAI_CONTRACTOR_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _kohaiContractorCd;

    /** KOHAI_CONTRACTOR_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _kohaiContractorNm;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingStorageSpaceCd;

    /** NIZOROE_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _nizoroeId;

    /** NIZOROE_PROC_UNIT: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeProcUnit;

    /** ACCOUNT_ID: {BIGINT(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _accountId;

    /** ACCOUNT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _accountCd;

    /** SHIPPING_REASON_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingReasonCd;

    /** TRANSFER_FLG: {CHAR(1)} */
    @JsonKey
    protected String _transferFlg;

    /** TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaSalesOrderNo;

    /** DELIV_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _delivCd;

    /** SALES_ORDER_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _salesOrderNum;

    /** DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _directDeliveryTypeCd;

    /** SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _splitDeliveryTypeCd;

    /** CARRIER_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierTypeCd;

    /** SPECIFY_DELIVERY_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _specifyDeliveryDt;

    /** SPECIFY_DELIVERY_TIME: {VARCHAR(30)} */
    @JsonKey
    protected String _specifyDeliveryTime;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaCd;

    /** DESTINATION_NM_KANA: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNmKana;

    /** DESTINATION_FAX: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationFax;

    /** KANJI_MESSAGE1: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage1;

    /** KANJI_MESSAGE2: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage2;

    /** KANJI_MESSAGE3: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage3;

    /** KANJI_MESSAGE4: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage4;

    /** KANJI_MESSAGE5: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage5;

    /** KANJI_MESSAGE6: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage6;

    /** KANJI_MESSAGE7: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage7;

    /** KANJI_MESSAGE8: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage8;

    /** KANJI_MESSAGE9: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage9;

    /** KANJI_MESSAGE10: {VARCHAR(60)} */
    @JsonKey
    protected String _kanjiMessage10;

    /** KANA_MESSAGE1: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage1;

    /** KANA_MESSAGE2: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage2;

    /** KANA_MESSAGE3: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage3;

    /** KANA_MESSAGE4: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage4;

    /** KANA_MESSAGE5: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage5;

    /** KANA_MESSAGE6: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage6;

    /** KANA_MESSAGE7: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage7;

    /** KANA_MESSAGE8: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage8;

    /** KANA_MESSAGE9: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage9;

    /** KANA_MESSAGE10: {VARCHAR(60)} */
    @JsonKey
    protected String _kanaMessage10;

    /** DELIVERY_NOTE_SUMMARY: {VARCHAR(255)} */
    @JsonKey
    protected String _deliveryNoteSummary;

    /** INVOICE_SUMMARY: {VARCHAR(60)} */
    @JsonKey
    protected String _invoiceSummary;

    /** EC_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _ecOrderNo;

    /** PAYMENT_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _paymentTypeCd;

    /** PRICE_HIDDEN_FLG: {CHAR(1)} */
    @JsonKey
    protected String _priceHiddenFlg;

    /** PAYMENT_HIDDEN_FLG: {CHAR(1)} */
    @JsonKey
    protected String _paymentHiddenFlg;

    /** DIRECT_UPD_FLG: {CHAR(1)} */
    @JsonKey
    protected String _directUpdFlg;

    /** IF_ID: {VARCHAR(30)} */
    @JsonKey
    protected String _ifId;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _customerNm;

    /** PSAM: {VARCHAR(30)} */
    @JsonKey
    protected String _psam;

    /** FLOOR_COMP_FLG: {CHAR(1)} */
    @JsonKey
    protected String _floorCompFlg;

    /** DELIVERY_TYPE: {VARCHAR(30)} */
    @JsonKey
    protected String _deliveryType;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstHDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected MDeliveryCourseDto _mDeliveryCourse;

    public MDeliveryCourseDto getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    public void setMDeliveryCourse(MDeliveryCourseDto mDeliveryCourse) {
        this._mDeliveryCourse = mDeliveryCourse;
    }

    protected MProcessTypeDto _mProcessType;

    public MProcessTypeDto getMProcessType() {
        return _mProcessType;
    }

    public void setMProcessType(MProcessTypeDto mProcessType) {
        this._mProcessType = mProcessType;
    }

    protected MCustomerDto _mCustomerByDelivCustomerId;

    public MCustomerDto getMCustomerByDelivCustomerId() {
        return _mCustomerByDelivCustomerId;
    }

    public void setMCustomerByDelivCustomerId(MCustomerDto mCustomerByDelivCustomerId) {
        this._mCustomerByDelivCustomerId = mCustomerByDelivCustomerId;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCustomerDto _mCustomerBySupplyCustomerId;

    public MCustomerDto getMCustomerBySupplyCustomerId() {
        return _mCustomerBySupplyCustomerId;
    }

    public void setMCustomerBySupplyCustomerId(MCustomerDto mCustomerBySupplyCustomerId) {
        this._mCustomerBySupplyCustomerId = mCustomerBySupplyCustomerId;
    }

    protected TAllocInstHDto _tAllocInstH;

    public TAllocInstHDto getTAllocInstH() {
        return _tAllocInstH;
    }

    public void setTAllocInstH(TAllocInstHDto tAllocInstH) {
        this._tAllocInstH = tAllocInstH;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MZipDto _mZipForDeliv;

    public MZipDto getMZipForDeliv() {
        return _mZipForDeliv;
    }

    public void setMZipForDeliv(MZipDto mZipForDeliv) {
        this._mZipForDeliv = mZipForDeliv;
    }

    protected MSalesOrgDto _mSalesOrgBySalesOrg;

    public MSalesOrgDto getMSalesOrgBySalesOrg() {
        return _mSalesOrgBySalesOrg;
    }

    public void setMSalesOrgBySalesOrg(MSalesOrgDto mSalesOrgBySalesOrg) {
        this._mSalesOrgBySalesOrg = mSalesOrgBySalesOrg;
    }

    protected MCustomerDto _mCustomerByAccoutId;

    public MCustomerDto getMCustomerByAccoutId() {
        return _mCustomerByAccoutId;
    }

    public void setMCustomerByAccoutId(MCustomerDto mCustomerByAccoutId) {
        this._mCustomerByAccoutId = mCustomerByAccoutId;
    }

    protected BClassDtlDto _bClassDtlByDelivTz;

    public BClassDtlDto getBClassDtlByDelivTz() {
        return _bClassDtlByDelivTz;
    }

    public void setBClassDtlByDelivTz(BClassDtlDto bClassDtlByDelivTz) {
        this._bClassDtlByDelivTz = bClassDtlByDelivTz;
    }

    protected BClassDtlDto _bClassDtlByEmergencyFlg;

    public BClassDtlDto getBClassDtlByEmergencyFlg() {
        return _bClassDtlByEmergencyFlg;
    }

    public void setBClassDtlByEmergencyFlg(BClassDtlDto bClassDtlByEmergencyFlg) {
        this._bClassDtlByEmergencyFlg = bClassDtlByEmergencyFlg;
    }

    protected BClassDtlDto _bClassDtlByErrorFlg;

    public BClassDtlDto getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    public void setBClassDtlByErrorFlg(BClassDtlDto bClassDtlByErrorFlg) {
        this._bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    protected BClassDtlDto _bClassDtlByInputType;

    public BClassDtlDto getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    public void setBClassDtlByInputType(BClassDtlDto bClassDtlByInputType) {
        this._bClassDtlByInputType = bClassDtlByInputType;
    }

    protected BClassDtlDto _bClassDtlByShippingStatus;

    public BClassDtlDto getBClassDtlByShippingStatus() {
        return _bClassDtlByShippingStatus;
    }

    public void setBClassDtlByShippingStatus(BClassDtlDto bClassDtlByShippingStatus) {
        this._bClassDtlByShippingStatus = bClassDtlByShippingStatus;
    }

    protected BClassDtlDto _bClassDtlByStockOutFlg;

    public BClassDtlDto getBClassDtlByStockOutFlg() {
        return _bClassDtlByStockOutFlg;
    }

    public void setBClassDtlByStockOutFlg(BClassDtlDto bClassDtlByStockOutFlg) {
        this._bClassDtlByStockOutFlg = bClassDtlByStockOutFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TEcOrderHDto> _tEcOrderHList;

    public List<TEcOrderHDto> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = new ArrayList<TEcOrderHDto>(); }
        return _tEcOrderHList;
    }

    public void setTEcOrderHList(List<TEcOrderHDto> tEcOrderHList) {
        this._tEcOrderHList = tEcOrderHList;
    }

    protected List<TShippingInstBDto> _tShippingInstBList;

    public List<TShippingInstBDto> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = new ArrayList<TShippingInstBDto>(); }
        return _tShippingInstBList;
    }

    public void setTShippingInstBList(List<TShippingInstBDto> tShippingInstBList) {
        this._tShippingInstBList = tShippingInstBList;
    }

    protected List<TShippingInstHPrintDto> _tShippingInstHPrintList;

    public List<TShippingInstHPrintDto> getTShippingInstHPrintList() {
        if (_tShippingInstHPrintList == null) { _tShippingInstHPrintList = new ArrayList<TShippingInstHPrintDto>(); }
        return _tShippingInstHPrintList;
    }

    public void setTShippingInstHPrintList(List<TShippingInstHPrintDto> tShippingInstHPrintList) {
        this._tShippingInstHPrintList = tShippingInstHPrintList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingInstHDto)) { return false; }
        final BsTShippingInstHDto otherEntity = (BsTShippingInstHDto)other;
        if (!helpComparingValue(getShippingInstHId(), otherEntity.getShippingInstHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_shipping_inst_h");
        result = xCH(result, getShippingInstHId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getShippingInstHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getInputType());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getDelivPlanDt());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getShippingStatus());
        sb.append(c).append(getSupplyCustomerId());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getDelivCustomerId());
        sb.append(c).append(getDelivCustomerCd());
        sb.append(c).append(getDelivZipCd());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getDelivAddressSupply());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getDelivCustomerNm1());
        sb.append(c).append(getDelivCustomerNm2());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getPickingWorkMessage());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getStockOutFlg());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getCod());
        sb.append(c).append(getCodTax());
        sb.append(c).append(getTotalPrice());
        sb.append(c).append(getTotalTax());
        sb.append(c).append(getNizoroeNo());
        sb.append(c).append(getDaihyoNizoroeNo());
        sb.append(c).append(getNizoroeNo2());
        sb.append(c).append(getDaihyoNizoroeNo2());
        sb.append(c).append(getShippingTypeId());
        sb.append(c).append(getShippingTypeCd());
        sb.append(c).append(getCarrierId());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getSalesOrderNo());
        sb.append(c).append(getSalesOrderSlipTypeCd());
        sb.append(c).append(getSalesOrderSlipNo());
        sb.append(c).append(getOrderDt());
        sb.append(c).append(getKokyakuCd());
        sb.append(c).append(getShippingFee());
        sb.append(c).append(getSeparateShippingFee());
        sb.append(c).append(getCodFee());
        sb.append(c).append(getOrderNoDeliveryNote());
        sb.append(c).append(getPoint());
        sb.append(c).append(getKoguchiDeliveryFlg());
        sb.append(c).append(getRecordSendFlg());
        sb.append(c).append(getCarrierDataOutFlg());
        sb.append(c).append(getKohaiContractorCd());
        sb.append(c).append(getKohaiContractorNm());
        sb.append(c).append(getShippingPlantCd());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getNizoroeId());
        sb.append(c).append(getNizoroeProcUnit());
        sb.append(c).append(getAccountId());
        sb.append(c).append(getAccountCd());
        sb.append(c).append(getShippingReasonCd());
        sb.append(c).append(getTransferFlg());
        sb.append(c).append(getTenhanshaSalesOrderNo());
        sb.append(c).append(getDelivCd());
        sb.append(c).append(getSalesOrderNum());
        sb.append(c).append(getDirectDeliveryTypeCd());
        sb.append(c).append(getSplitDeliveryTypeCd());
        sb.append(c).append(getCarrierTypeCd());
        sb.append(c).append(getSpecifyDeliveryDt());
        sb.append(c).append(getSpecifyDeliveryTime());
        sb.append(c).append(getTenhanshaCd());
        sb.append(c).append(getDestinationNmKana());
        sb.append(c).append(getDestinationFax());
        sb.append(c).append(getKanjiMessage1());
        sb.append(c).append(getKanjiMessage2());
        sb.append(c).append(getKanjiMessage3());
        sb.append(c).append(getKanjiMessage4());
        sb.append(c).append(getKanjiMessage5());
        sb.append(c).append(getKanjiMessage6());
        sb.append(c).append(getKanjiMessage7());
        sb.append(c).append(getKanjiMessage8());
        sb.append(c).append(getKanjiMessage9());
        sb.append(c).append(getKanjiMessage10());
        sb.append(c).append(getKanaMessage1());
        sb.append(c).append(getKanaMessage2());
        sb.append(c).append(getKanaMessage3());
        sb.append(c).append(getKanaMessage4());
        sb.append(c).append(getKanaMessage5());
        sb.append(c).append(getKanaMessage6());
        sb.append(c).append(getKanaMessage7());
        sb.append(c).append(getKanaMessage8());
        sb.append(c).append(getKanaMessage9());
        sb.append(c).append(getKanaMessage10());
        sb.append(c).append(getDeliveryNoteSummary());
        sb.append(c).append(getInvoiceSummary());
        sb.append(c).append(getEcOrderNo());
        sb.append(c).append(getPaymentTypeCd());
        sb.append(c).append(getPriceHiddenFlg());
        sb.append(c).append(getPaymentHiddenFlg());
        sb.append(c).append(getDirectUpdFlg());
        sb.append(c).append(getIfId());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getPsam());
        sb.append(c).append(getFloorCompFlg());
        sb.append(c).append(getDeliveryType());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public Long getShippingInstHId() {
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        __modifiedProperties.add("shippingInstHId");
        this._shippingInstHId = shippingInstHId;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * [set] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public void setInputType(String inputType) {
        __modifiedProperties.add("inputType");
        this._inputType = inputType;
    }

    /**
     * [get] SHIPPING_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] WORK_DT: {IX, VARCHAR(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {IX, VARCHAR(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * 納品予定日
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed)
     */
    public String getDelivPlanDt() {
        return _delivPlanDt;
    }

    /**
     * [set] DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * 納品予定日
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        __modifiedProperties.add("delivPlanDt");
        this._delivPlanDt = delivPlanDt;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8)} <br>
     * 納品指定日
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8)} <br>
     * 納品指定日
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public String getDelivTz() {
        return _delivTz;
    }

    /**
     * [set] DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public void setDelivTz(String delivTz) {
        __modifiedProperties.add("delivTz");
        this._delivTz = delivTz;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} <br>
     * 顧客出荷指示No.
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} <br>
     * 顧客出荷指示No.
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {IX, VARCHAR(30)} <br>
     * WMS出荷伝票No.
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public String getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {IX, VARCHAR(30)} <br>
     * WMS出荷伝票No.
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @return The value of the column 'SHIPPING_STATUS'. (NullAllowed)
     */
    public String getShippingStatus() {
        return _shippingStatus;
    }

    /**
     * [set] SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param shippingStatus The value of the column 'SHIPPING_STATUS'. (NullAllowed)
     */
    public void setShippingStatus(String shippingStatus) {
        __modifiedProperties.add("shippingStatus");
        this._shippingStatus = shippingStatus;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 納品先ID
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getSupplyCustomerId() {
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 納品先ID
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        __modifiedProperties.add("supplyCustomerId");
        this._supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 納品先名称
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 納品先名称
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getDelivCustomerId() {
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        __modifiedProperties.add("delivCustomerId");
        this._delivCustomerId = delivCustomerId;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 届先CD
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDelivCustomerCd() {
        return _delivCustomerCd;
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 届先CD
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        __modifiedProperties.add("delivCustomerCd");
        this._delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP} <br>
     * 届先郵便番号
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public String getDelivZipCd() {
        return _delivZipCd;
    }

    /**
     * [set] DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP} <br>
     * 届先郵便番号
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public void setDelivZipCd(String delivZipCd) {
        __modifiedProperties.add("delivZipCd");
        this._delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * 届先住所1
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public String getDelivAddress1() {
        return _delivAddress1;
    }

    /**
     * [set] DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * 届先住所1
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public void setDelivAddress1(String delivAddress1) {
        __modifiedProperties.add("delivAddress1");
        this._delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * 届先住所2
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public String getDelivAddress2() {
        return _delivAddress2;
    }

    /**
     * [set] DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * 届先住所2
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public void setDelivAddress2(String delivAddress2) {
        __modifiedProperties.add("delivAddress2");
        this._delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * 届先住所3
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public String getDelivAddress3() {
        return _delivAddress3;
    }

    /**
     * [set] DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * 届先住所3
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public void setDelivAddress3(String delivAddress3) {
        __modifiedProperties.add("delivAddress3");
        this._delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * 届先住所補足
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed)
     */
    public String getDelivAddressSupply() {
        return _delivAddressSupply;
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * 届先住所補足
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        __modifiedProperties.add("delivAddressSupply");
        this._delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 届先名称
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 届先名称
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * 届先名称1
     * @return The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed)
     */
    public String getDelivCustomerNm1() {
        return _delivCustomerNm1;
    }

    /**
     * [set] DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * 届先名称1
     * @param delivCustomerNm1 The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed)
     */
    public void setDelivCustomerNm1(String delivCustomerNm1) {
        __modifiedProperties.add("delivCustomerNm1");
        this._delivCustomerNm1 = delivCustomerNm1;
    }

    /**
     * [get] DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * 届先名称2
     * @return The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed)
     */
    public String getDelivCustomerNm2() {
        return _delivCustomerNm2;
    }

    /**
     * [set] DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * 届先名称2
     * @param delivCustomerNm2 The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed)
     */
    public void setDelivCustomerNm2(String delivCustomerNm2) {
        __modifiedProperties.add("delivCustomerNm2");
        this._delivCustomerNm2 = delivCustomerNm2;
    }

    /**
     * [get] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * 届先電話番号
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public String getDelivTelNo() {
        return _delivTelNo;
    }

    /**
     * [set] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * 届先電話番号
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public void setDelivTelNo(String delivTelNo) {
        __modifiedProperties.add("delivTelNo");
        this._delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {IX, VARCHAR(30)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {IX, VARCHAR(30)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * 出庫作業メッセージ
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public String getPickingWorkMessage() {
        return _pickingWorkMessage;
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * 出庫作業メッセージ
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        __modifiedProperties.add("pickingWorkMessage");
        this._pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] PICKING_BATCH_NO: {IX, VARCHAR(30)} <br>
     * 出庫指示バッチNo.
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public String getPickingBatchNo() {
        return _pickingBatchNo;
    }

    /**
     * [set] PICKING_BATCH_NO: {IX, VARCHAR(30)} <br>
     * 出庫指示バッチNo.
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        __modifiedProperties.add("pickingBatchNo");
        this._pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public String getStockOutFlg() {
        return _stockOutFlg;
    }

    /**
     * [set] STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public void setStockOutFlg(String stockOutFlg) {
        __modifiedProperties.add("stockOutFlg");
        this._stockOutFlg = stockOutFlg;
    }

    /**
     * [get] ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] COD: {BIGINT(19)} <br>
     * 代引請求額
     * @return The value of the column 'COD'. (NullAllowed)
     */
    public Long getCod() {
        return _cod;
    }

    /**
     * [set] COD: {BIGINT(19)} <br>
     * 代引請求額
     * @param cod The value of the column 'COD'. (NullAllowed)
     */
    public void setCod(Long cod) {
        __modifiedProperties.add("cod");
        this._cod = cod;
    }

    /**
     * [get] COD_TAX: {BIGINT(19)} <br>
     * 代引消費税
     * @return The value of the column 'COD_TAX'. (NullAllowed)
     */
    public Long getCodTax() {
        return _codTax;
    }

    /**
     * [set] COD_TAX: {BIGINT(19)} <br>
     * 代引消費税
     * @param codTax The value of the column 'COD_TAX'. (NullAllowed)
     */
    public void setCodTax(Long codTax) {
        __modifiedProperties.add("codTax");
        this._codTax = codTax;
    }

    /**
     * [get] TOTAL_PRICE: {DECIMAL(14, 4)} <br>
     * 合計金額
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalPrice() {
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {DECIMAL(14, 4)} <br>
     * 合計金額
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        __modifiedProperties.add("totalPrice");
        this._totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {DECIMAL(14, 4)} <br>
     * 合計消費税
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalTax() {
        return _totalTax;
    }

    /**
     * [set] TOTAL_TAX: {DECIMAL(14, 4)} <br>
     * 合計消費税
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed)
     */
    public void setTotalTax(java.math.BigDecimal totalTax) {
        __modifiedProperties.add("totalTax");
        this._totalTax = totalTax;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public String getNizoroeNo() {
        return _nizoroeNo;
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public void setNizoroeNo(String nizoroeNo) {
        __modifiedProperties.add("nizoroeNo");
        this._nizoroeNo = nizoroeNo;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @return The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo() {
        return _daihyoNizoroeNo;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @param daihyoNizoroeNo The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
        __modifiedProperties.add("daihyoNizoroeNo");
        this._daihyoNizoroeNo = daihyoNizoroeNo;
    }

    /**
     * [get] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public String getNizoroeNo2() {
        return _nizoroeNo2;
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        __modifiedProperties.add("nizoroeNo2");
        this._nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフンあり
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo2() {
        return _daihyoNizoroeNo2;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフンあり
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        __modifiedProperties.add("daihyoNizoroeNo2");
        this._daihyoNizoroeNo2 = daihyoNizoroeNo2;
    }

    /**
     * [get] SHIPPING_TYPE_ID: {BIGINT(19)} <br>
     * 出荷区分ID
     * @return The value of the column 'SHIPPING_TYPE_ID'. (NullAllowed)
     */
    public Long getShippingTypeId() {
        return _shippingTypeId;
    }

    /**
     * [set] SHIPPING_TYPE_ID: {BIGINT(19)} <br>
     * 出荷区分ID
     * @param shippingTypeId The value of the column 'SHIPPING_TYPE_ID'. (NullAllowed)
     */
    public void setShippingTypeId(Long shippingTypeId) {
        __modifiedProperties.add("shippingTypeId");
        this._shippingTypeId = shippingTypeId;
    }

    /**
     * [get] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分CD
     * @return The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public String getShippingTypeCd() {
        return _shippingTypeCd;
    }

    /**
     * [set] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分CD
     * @param shippingTypeCd The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public void setShippingTypeCd(String shippingTypeCd) {
        __modifiedProperties.add("shippingTypeCd");
        this._shippingTypeCd = shippingTypeCd;
    }

    /**
     * [get] CARRIER_ID: {VARCHAR(30)} <br>
     * 運送業者ID
     * @return The value of the column 'CARRIER_ID'. (NullAllowed)
     */
    public String getCarrierId() {
        return _carrierId;
    }

    /**
     * [set] CARRIER_ID: {VARCHAR(30)} <br>
     * 運送業者ID
     * @param carrierId The value of the column 'CARRIER_ID'. (NullAllowed)
     */
    public void setCarrierId(String carrierId) {
        __modifiedProperties.add("carrierId");
        this._carrierId = carrierId;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30), FK to M_SALES_ORG} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public String getSalesOrgCd() {
        return _salesOrgCd;
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30), FK to M_SALES_ORG} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        __modifiedProperties.add("salesOrgCd");
        this._salesOrgCd = salesOrgCd;
    }

    /**
     * [get] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @return The value of the column 'SALES_ORDER_NO'. (NullAllowed)
     */
    public String getSalesOrderNo() {
        return _salesOrderNo;
    }

    /**
     * [set] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @param salesOrderNo The value of the column 'SALES_ORDER_NO'. (NullAllowed)
     */
    public void setSalesOrderNo(String salesOrderNo) {
        __modifiedProperties.add("salesOrderNo");
        this._salesOrderNo = salesOrderNo;
    }

    /**
     * [get] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @return The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed)
     */
    public String getSalesOrderSlipTypeCd() {
        return _salesOrderSlipTypeCd;
    }

    /**
     * [set] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @param salesOrderSlipTypeCd The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed)
     */
    public void setSalesOrderSlipTypeCd(String salesOrderSlipTypeCd) {
        __modifiedProperties.add("salesOrderSlipTypeCd");
        this._salesOrderSlipTypeCd = salesOrderSlipTypeCd;
    }

    /**
     * [get] SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * 受注伝票番号
     * @return The value of the column 'SALES_ORDER_SLIP_NO'. (NullAllowed)
     */
    public String getSalesOrderSlipNo() {
        return _salesOrderSlipNo;
    }

    /**
     * [set] SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * 受注伝票番号
     * @param salesOrderSlipNo The value of the column 'SALES_ORDER_SLIP_NO'. (NullAllowed)
     */
    public void setSalesOrderSlipNo(String salesOrderSlipNo) {
        __modifiedProperties.add("salesOrderSlipNo");
        this._salesOrderSlipNo = salesOrderSlipNo;
    }

    /**
     * [get] ORDER_DT: {VARCHAR(8)} <br>
     * 注文日
     * @return The value of the column 'ORDER_DT'. (NullAllowed)
     */
    public String getOrderDt() {
        return _orderDt;
    }

    /**
     * [set] ORDER_DT: {VARCHAR(8)} <br>
     * 注文日
     * @param orderDt The value of the column 'ORDER_DT'. (NullAllowed)
     */
    public void setOrderDt(String orderDt) {
        __modifiedProperties.add("orderDt");
        this._orderDt = orderDt;
    }

    /**
     * [get] KOKYAKU_CD: {VARCHAR(30)} <br>
     * 顧客CD
     * @return The value of the column 'KOKYAKU_CD'. (NullAllowed)
     */
    public String getKokyakuCd() {
        return _kokyakuCd;
    }

    /**
     * [set] KOKYAKU_CD: {VARCHAR(30)} <br>
     * 顧客CD
     * @param kokyakuCd The value of the column 'KOKYAKU_CD'. (NullAllowed)
     */
    public void setKokyakuCd(String kokyakuCd) {
        __modifiedProperties.add("kokyakuCd");
        this._kokyakuCd = kokyakuCd;
    }

    /**
     * [get] SHIPPING_FEE: {BIGINT(19)} <br>
     * 送料
     * @return The value of the column 'SHIPPING_FEE'. (NullAllowed)
     */
    public Long getShippingFee() {
        return _shippingFee;
    }

    /**
     * [set] SHIPPING_FEE: {BIGINT(19)} <br>
     * 送料
     * @param shippingFee The value of the column 'SHIPPING_FEE'. (NullAllowed)
     */
    public void setShippingFee(Long shippingFee) {
        __modifiedProperties.add("shippingFee");
        this._shippingFee = shippingFee;
    }

    /**
     * [get] SEPARATE_SHIPPING_FEE: {BIGINT(19)} <br>
     * 別途送料
     * @return The value of the column 'SEPARATE_SHIPPING_FEE'. (NullAllowed)
     */
    public Long getSeparateShippingFee() {
        return _separateShippingFee;
    }

    /**
     * [set] SEPARATE_SHIPPING_FEE: {BIGINT(19)} <br>
     * 別途送料
     * @param separateShippingFee The value of the column 'SEPARATE_SHIPPING_FEE'. (NullAllowed)
     */
    public void setSeparateShippingFee(Long separateShippingFee) {
        __modifiedProperties.add("separateShippingFee");
        this._separateShippingFee = separateShippingFee;
    }

    /**
     * [get] COD_FEE: {BIGINT(19)} <br>
     * 代引手数料
     * @return The value of the column 'COD_FEE'. (NullAllowed)
     */
    public Long getCodFee() {
        return _codFee;
    }

    /**
     * [set] COD_FEE: {BIGINT(19)} <br>
     * 代引手数料
     * @param codFee The value of the column 'COD_FEE'. (NullAllowed)
     */
    public void setCodFee(Long codFee) {
        __modifiedProperties.add("codFee");
        this._codFee = codFee;
    }

    /**
     * [get] ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} <br>
     * 注文番号_納品書
     * @return The value of the column 'ORDER_NO_DELIVERY_NOTE'. (NullAllowed)
     */
    public String getOrderNoDeliveryNote() {
        return _orderNoDeliveryNote;
    }

    /**
     * [set] ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} <br>
     * 注文番号_納品書
     * @param orderNoDeliveryNote The value of the column 'ORDER_NO_DELIVERY_NOTE'. (NullAllowed)
     */
    public void setOrderNoDeliveryNote(String orderNoDeliveryNote) {
        __modifiedProperties.add("orderNoDeliveryNote");
        this._orderNoDeliveryNote = orderNoDeliveryNote;
    }

    /**
     * [get] POINT: {BIGINT(19)} <br>
     * ポイント
     * @return The value of the column 'POINT'. (NullAllowed)
     */
    public Long getPoint() {
        return _point;
    }

    /**
     * [set] POINT: {BIGINT(19)} <br>
     * ポイント
     * @param point The value of the column 'POINT'. (NullAllowed)
     */
    public void setPoint(Long point) {
        __modifiedProperties.add("point");
        this._point = point;
    }

    /**
     * [get] KOGUCHI_DELIVERY_FLG: {CHAR(1)} <br>
     * 戸口配送フラグ
     * @return The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed)
     */
    public String getKoguchiDeliveryFlg() {
        return _koguchiDeliveryFlg;
    }

    /**
     * [set] KOGUCHI_DELIVERY_FLG: {CHAR(1)} <br>
     * 戸口配送フラグ
     * @param koguchiDeliveryFlg The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed)
     */
    public void setKoguchiDeliveryFlg(String koguchiDeliveryFlg) {
        __modifiedProperties.add("koguchiDeliveryFlg");
        this._koguchiDeliveryFlg = koguchiDeliveryFlg;
    }

    /**
     * [get] RECORD_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 実績送信フラグ
     * @return The value of the column 'RECORD_SEND_FLG'. (NullAllowed)
     */
    public String getRecordSendFlg() {
        return _recordSendFlg;
    }

    /**
     * [set] RECORD_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 実績送信フラグ
     * @param recordSendFlg The value of the column 'RECORD_SEND_FLG'. (NullAllowed)
     */
    public void setRecordSendFlg(String recordSendFlg) {
        __modifiedProperties.add("recordSendFlg");
        this._recordSendFlg = recordSendFlg;
    }

    /**
     * [get] CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]} <br>
     * 運送業者データ出力フラグ
     * @return The value of the column 'CARRIER_DATA_OUT_FLG'. (NullAllowed)
     */
    public String getCarrierDataOutFlg() {
        return _carrierDataOutFlg;
    }

    /**
     * [set] CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]} <br>
     * 運送業者データ出力フラグ
     * @param carrierDataOutFlg The value of the column 'CARRIER_DATA_OUT_FLG'. (NullAllowed)
     */
    public void setCarrierDataOutFlg(String carrierDataOutFlg) {
        __modifiedProperties.add("carrierDataOutFlg");
        this._carrierDataOutFlg = carrierDataOutFlg;
    }

    /**
     * [get] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * 戸配契約先CD
     * @return The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed)
     */
    public String getKohaiContractorCd() {
        return _kohaiContractorCd;
    }

    /**
     * [set] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * 戸配契約先CD
     * @param kohaiContractorCd The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed)
     */
    public void setKohaiContractorCd(String kohaiContractorCd) {
        __modifiedProperties.add("kohaiContractorCd");
        this._kohaiContractorCd = kohaiContractorCd;
    }

    /**
     * [get] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @return The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed)
     */
    public String getKohaiContractorNm() {
        return _kohaiContractorNm;
    }

    /**
     * [set] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @param kohaiContractorNm The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed)
     */
    public void setKohaiContractorNm(String kohaiContractorNm) {
        __modifiedProperties.add("kohaiContractorNm");
        this._kohaiContractorNm = kohaiContractorNm;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed)
     */
    public String getShippingPlantCd() {
        return _shippingPlantCd;
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        __modifiedProperties.add("shippingPlantCd");
        this._shippingPlantCd = shippingPlantCd;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getShippingStorageSpaceCd() {
        return _shippingStorageSpaceCd;
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        __modifiedProperties.add("shippingStorageSpaceCd");
        this._shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] NIZOROE_ID: {BIGINT(19)} <br>
     * 荷揃処理ID
     * @return The value of the column 'NIZOROE_ID'. (NullAllowed)
     */
    public Long getNizoroeId() {
        return _nizoroeId;
    }

    /**
     * [set] NIZOROE_ID: {BIGINT(19)} <br>
     * 荷揃処理ID
     * @param nizoroeId The value of the column 'NIZOROE_ID'. (NullAllowed)
     */
    public void setNizoroeId(Long nizoroeId) {
        __modifiedProperties.add("nizoroeId");
        this._nizoroeId = nizoroeId;
    }

    /**
     * [get] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @return The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed)
     */
    public String getNizoroeProcUnit() {
        return _nizoroeProcUnit;
    }

    /**
     * [set] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @param nizoroeProcUnit The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed)
     */
    public void setNizoroeProcUnit(String nizoroeProcUnit) {
        __modifiedProperties.add("nizoroeProcUnit");
        this._nizoroeProcUnit = nizoroeProcUnit;
    }

    /**
     * [get] ACCOUNT_ID: {BIGINT(19), FK to M_CUSTOMER} <br>
     * 得意先ID
     * @return The value of the column 'ACCOUNT_ID'. (NullAllowed)
     */
    public Long getAccountId() {
        return _accountId;
    }

    /**
     * [set] ACCOUNT_ID: {BIGINT(19), FK to M_CUSTOMER} <br>
     * 得意先ID
     * @param accountId The value of the column 'ACCOUNT_ID'. (NullAllowed)
     */
    public void setAccountId(Long accountId) {
        __modifiedProperties.add("accountId");
        this._accountId = accountId;
    }

    /**
     * [get] ACCOUNT_CD: {VARCHAR(30)} <br>
     * 得意先CD
     * @return The value of the column 'ACCOUNT_CD'. (NullAllowed)
     */
    public String getAccountCd() {
        return _accountCd;
    }

    /**
     * [set] ACCOUNT_CD: {VARCHAR(30)} <br>
     * 得意先CD
     * @param accountCd The value of the column 'ACCOUNT_CD'. (NullAllowed)
     */
    public void setAccountCd(String accountCd) {
        __modifiedProperties.add("accountCd");
        this._accountCd = accountCd;
    }

    /**
     * [get] SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * 出荷発生事由
     * @return The value of the column 'SHIPPING_REASON_CD'. (NullAllowed)
     */
    public String getShippingReasonCd() {
        return _shippingReasonCd;
    }

    /**
     * [set] SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * 出荷発生事由
     * @param shippingReasonCd The value of the column 'SHIPPING_REASON_CD'. (NullAllowed)
     */
    public void setShippingReasonCd(String shippingReasonCd) {
        __modifiedProperties.add("shippingReasonCd");
        this._shippingReasonCd = shippingReasonCd;
    }

    /**
     * [get] TRANSFER_FLG: {CHAR(1)} <br>
     * 通常振替フラグ
     * @return The value of the column 'TRANSFER_FLG'. (NullAllowed)
     */
    public String getTransferFlg() {
        return _transferFlg;
    }

    /**
     * [set] TRANSFER_FLG: {CHAR(1)} <br>
     * 通常振替フラグ
     * @param transferFlg The value of the column 'TRANSFER_FLG'. (NullAllowed)
     */
    public void setTransferFlg(String transferFlg) {
        __modifiedProperties.add("transferFlg");
        this._transferFlg = transferFlg;
    }

    /**
     * [get] TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @return The value of the column 'TENHANSHA_SALES_ORDER_NO'. (NullAllowed)
     */
    public String getTenhanshaSalesOrderNo() {
        return _tenhanshaSalesOrderNo;
    }

    /**
     * [set] TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @param tenhanshaSalesOrderNo The value of the column 'TENHANSHA_SALES_ORDER_NO'. (NullAllowed)
     */
    public void setTenhanshaSalesOrderNo(String tenhanshaSalesOrderNo) {
        __modifiedProperties.add("tenhanshaSalesOrderNo");
        this._tenhanshaSalesOrderNo = tenhanshaSalesOrderNo;
    }

    /**
     * [get] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @return The value of the column 'DELIV_CD'. (NullAllowed)
     */
    public String getDelivCd() {
        return _delivCd;
    }

    /**
     * [set] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @param delivCd The value of the column 'DELIV_CD'. (NullAllowed)
     */
    public void setDelivCd(String delivCd) {
        __modifiedProperties.add("delivCd");
        this._delivCd = delivCd;
    }

    /**
     * [get] SALES_ORDER_NUM: {BIGINT(19)} <br>
     * 受注数量
     * @return The value of the column 'SALES_ORDER_NUM'. (NullAllowed)
     */
    public Long getSalesOrderNum() {
        return _salesOrderNum;
    }

    /**
     * [set] SALES_ORDER_NUM: {BIGINT(19)} <br>
     * 受注数量
     * @param salesOrderNum The value of the column 'SALES_ORDER_NUM'. (NullAllowed)
     */
    public void setSalesOrderNum(Long salesOrderNum) {
        __modifiedProperties.add("salesOrderNum");
        this._salesOrderNum = salesOrderNum;
    }

    /**
     * [get] DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 直送区分
     * @return The value of the column 'DIRECT_DELIVERY_TYPE_CD'. (NullAllowed)
     */
    public String getDirectDeliveryTypeCd() {
        return _directDeliveryTypeCd;
    }

    /**
     * [set] DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 直送区分
     * @param directDeliveryTypeCd The value of the column 'DIRECT_DELIVERY_TYPE_CD'. (NullAllowed)
     */
    public void setDirectDeliveryTypeCd(String directDeliveryTypeCd) {
        __modifiedProperties.add("directDeliveryTypeCd");
        this._directDeliveryTypeCd = directDeliveryTypeCd;
    }

    /**
     * [get] SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 分納区分
     * @return The value of the column 'SPLIT_DELIVERY_TYPE_CD'. (NullAllowed)
     */
    public String getSplitDeliveryTypeCd() {
        return _splitDeliveryTypeCd;
    }

    /**
     * [set] SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 分納区分
     * @param splitDeliveryTypeCd The value of the column 'SPLIT_DELIVERY_TYPE_CD'. (NullAllowed)
     */
    public void setSplitDeliveryTypeCd(String splitDeliveryTypeCd) {
        __modifiedProperties.add("splitDeliveryTypeCd");
        this._splitDeliveryTypeCd = splitDeliveryTypeCd;
    }

    /**
     * [get] CARRIER_TYPE_CD: {VARCHAR(30)} <br>
     * 運送会社区分
     * @return The value of the column 'CARRIER_TYPE_CD'. (NullAllowed)
     */
    public String getCarrierTypeCd() {
        return _carrierTypeCd;
    }

    /**
     * [set] CARRIER_TYPE_CD: {VARCHAR(30)} <br>
     * 運送会社区分
     * @param carrierTypeCd The value of the column 'CARRIER_TYPE_CD'. (NullAllowed)
     */
    public void setCarrierTypeCd(String carrierTypeCd) {
        __modifiedProperties.add("carrierTypeCd");
        this._carrierTypeCd = carrierTypeCd;
    }

    /**
     * [get] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @return The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed)
     */
    public String getSpecifyDeliveryDt() {
        return _specifyDeliveryDt;
    }

    /**
     * [set] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @param specifyDeliveryDt The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed)
     */
    public void setSpecifyDeliveryDt(String specifyDeliveryDt) {
        __modifiedProperties.add("specifyDeliveryDt");
        this._specifyDeliveryDt = specifyDeliveryDt;
    }

    /**
     * [get] SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * 配達指定時間
     * @return The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed)
     */
    public String getSpecifyDeliveryTime() {
        return _specifyDeliveryTime;
    }

    /**
     * [set] SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * 配達指定時間
     * @param specifyDeliveryTime The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed)
     */
    public void setSpecifyDeliveryTime(String specifyDeliveryTime) {
        __modifiedProperties.add("specifyDeliveryTime");
        this._specifyDeliveryTime = specifyDeliveryTime;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed)
     */
    public String getTenhanshaCd() {
        return _tenhanshaCd;
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        __modifiedProperties.add("tenhanshaCd");
        this._tenhanshaCd = tenhanshaCd;
    }

    /**
     * [get] DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * 送り先名称_カナ
     * @return The value of the column 'DESTINATION_NM_KANA'. (NullAllowed)
     */
    public String getDestinationNmKana() {
        return _destinationNmKana;
    }

    /**
     * [set] DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * 送り先名称_カナ
     * @param destinationNmKana The value of the column 'DESTINATION_NM_KANA'. (NullAllowed)
     */
    public void setDestinationNmKana(String destinationNmKana) {
        __modifiedProperties.add("destinationNmKana");
        this._destinationNmKana = destinationNmKana;
    }

    /**
     * [get] DESTINATION_FAX: {VARCHAR(30)} <br>
     * 送り先ＦＡＸ番号
     * @return The value of the column 'DESTINATION_FAX'. (NullAllowed)
     */
    public String getDestinationFax() {
        return _destinationFax;
    }

    /**
     * [set] DESTINATION_FAX: {VARCHAR(30)} <br>
     * 送り先ＦＡＸ番号
     * @param destinationFax The value of the column 'DESTINATION_FAX'. (NullAllowed)
     */
    public void setDestinationFax(String destinationFax) {
        __modifiedProperties.add("destinationFax");
        this._destinationFax = destinationFax;
    }

    /**
     * [get] KANJI_MESSAGE1: {VARCHAR(60)} <br>
     * 漢字メッセージ_1
     * @return The value of the column 'KANJI_MESSAGE1'. (NullAllowed)
     */
    public String getKanjiMessage1() {
        return _kanjiMessage1;
    }

    /**
     * [set] KANJI_MESSAGE1: {VARCHAR(60)} <br>
     * 漢字メッセージ_1
     * @param kanjiMessage1 The value of the column 'KANJI_MESSAGE1'. (NullAllowed)
     */
    public void setKanjiMessage1(String kanjiMessage1) {
        __modifiedProperties.add("kanjiMessage1");
        this._kanjiMessage1 = kanjiMessage1;
    }

    /**
     * [get] KANJI_MESSAGE2: {VARCHAR(60)} <br>
     * 漢字メッセージ_2
     * @return The value of the column 'KANJI_MESSAGE2'. (NullAllowed)
     */
    public String getKanjiMessage2() {
        return _kanjiMessage2;
    }

    /**
     * [set] KANJI_MESSAGE2: {VARCHAR(60)} <br>
     * 漢字メッセージ_2
     * @param kanjiMessage2 The value of the column 'KANJI_MESSAGE2'. (NullAllowed)
     */
    public void setKanjiMessage2(String kanjiMessage2) {
        __modifiedProperties.add("kanjiMessage2");
        this._kanjiMessage2 = kanjiMessage2;
    }

    /**
     * [get] KANJI_MESSAGE3: {VARCHAR(60)} <br>
     * 漢字メッセージ_3
     * @return The value of the column 'KANJI_MESSAGE3'. (NullAllowed)
     */
    public String getKanjiMessage3() {
        return _kanjiMessage3;
    }

    /**
     * [set] KANJI_MESSAGE3: {VARCHAR(60)} <br>
     * 漢字メッセージ_3
     * @param kanjiMessage3 The value of the column 'KANJI_MESSAGE3'. (NullAllowed)
     */
    public void setKanjiMessage3(String kanjiMessage3) {
        __modifiedProperties.add("kanjiMessage3");
        this._kanjiMessage3 = kanjiMessage3;
    }

    /**
     * [get] KANJI_MESSAGE4: {VARCHAR(60)} <br>
     * 漢字メッセージ_4
     * @return The value of the column 'KANJI_MESSAGE4'. (NullAllowed)
     */
    public String getKanjiMessage4() {
        return _kanjiMessage4;
    }

    /**
     * [set] KANJI_MESSAGE4: {VARCHAR(60)} <br>
     * 漢字メッセージ_4
     * @param kanjiMessage4 The value of the column 'KANJI_MESSAGE4'. (NullAllowed)
     */
    public void setKanjiMessage4(String kanjiMessage4) {
        __modifiedProperties.add("kanjiMessage4");
        this._kanjiMessage4 = kanjiMessage4;
    }

    /**
     * [get] KANJI_MESSAGE5: {VARCHAR(60)} <br>
     * 漢字メッセージ_5
     * @return The value of the column 'KANJI_MESSAGE5'. (NullAllowed)
     */
    public String getKanjiMessage5() {
        return _kanjiMessage5;
    }

    /**
     * [set] KANJI_MESSAGE5: {VARCHAR(60)} <br>
     * 漢字メッセージ_5
     * @param kanjiMessage5 The value of the column 'KANJI_MESSAGE5'. (NullAllowed)
     */
    public void setKanjiMessage5(String kanjiMessage5) {
        __modifiedProperties.add("kanjiMessage5");
        this._kanjiMessage5 = kanjiMessage5;
    }

    /**
     * [get] KANJI_MESSAGE6: {VARCHAR(60)} <br>
     * 漢字メッセージ_6
     * @return The value of the column 'KANJI_MESSAGE6'. (NullAllowed)
     */
    public String getKanjiMessage6() {
        return _kanjiMessage6;
    }

    /**
     * [set] KANJI_MESSAGE6: {VARCHAR(60)} <br>
     * 漢字メッセージ_6
     * @param kanjiMessage6 The value of the column 'KANJI_MESSAGE6'. (NullAllowed)
     */
    public void setKanjiMessage6(String kanjiMessage6) {
        __modifiedProperties.add("kanjiMessage6");
        this._kanjiMessage6 = kanjiMessage6;
    }

    /**
     * [get] KANJI_MESSAGE7: {VARCHAR(60)} <br>
     * 漢字メッセージ_7
     * @return The value of the column 'KANJI_MESSAGE7'. (NullAllowed)
     */
    public String getKanjiMessage7() {
        return _kanjiMessage7;
    }

    /**
     * [set] KANJI_MESSAGE7: {VARCHAR(60)} <br>
     * 漢字メッセージ_7
     * @param kanjiMessage7 The value of the column 'KANJI_MESSAGE7'. (NullAllowed)
     */
    public void setKanjiMessage7(String kanjiMessage7) {
        __modifiedProperties.add("kanjiMessage7");
        this._kanjiMessage7 = kanjiMessage7;
    }

    /**
     * [get] KANJI_MESSAGE8: {VARCHAR(60)} <br>
     * 漢字メッセージ_8
     * @return The value of the column 'KANJI_MESSAGE8'. (NullAllowed)
     */
    public String getKanjiMessage8() {
        return _kanjiMessage8;
    }

    /**
     * [set] KANJI_MESSAGE8: {VARCHAR(60)} <br>
     * 漢字メッセージ_8
     * @param kanjiMessage8 The value of the column 'KANJI_MESSAGE8'. (NullAllowed)
     */
    public void setKanjiMessage8(String kanjiMessage8) {
        __modifiedProperties.add("kanjiMessage8");
        this._kanjiMessage8 = kanjiMessage8;
    }

    /**
     * [get] KANJI_MESSAGE9: {VARCHAR(60)} <br>
     * 漢字メッセージ_9
     * @return The value of the column 'KANJI_MESSAGE9'. (NullAllowed)
     */
    public String getKanjiMessage9() {
        return _kanjiMessage9;
    }

    /**
     * [set] KANJI_MESSAGE9: {VARCHAR(60)} <br>
     * 漢字メッセージ_9
     * @param kanjiMessage9 The value of the column 'KANJI_MESSAGE9'. (NullAllowed)
     */
    public void setKanjiMessage9(String kanjiMessage9) {
        __modifiedProperties.add("kanjiMessage9");
        this._kanjiMessage9 = kanjiMessage9;
    }

    /**
     * [get] KANJI_MESSAGE10: {VARCHAR(60)} <br>
     * 漢字メッセージ_10
     * @return The value of the column 'KANJI_MESSAGE10'. (NullAllowed)
     */
    public String getKanjiMessage10() {
        return _kanjiMessage10;
    }

    /**
     * [set] KANJI_MESSAGE10: {VARCHAR(60)} <br>
     * 漢字メッセージ_10
     * @param kanjiMessage10 The value of the column 'KANJI_MESSAGE10'. (NullAllowed)
     */
    public void setKanjiMessage10(String kanjiMessage10) {
        __modifiedProperties.add("kanjiMessage10");
        this._kanjiMessage10 = kanjiMessage10;
    }

    /**
     * [get] KANA_MESSAGE1: {VARCHAR(60)} <br>
     * カナメッセージ_1
     * @return The value of the column 'KANA_MESSAGE1'. (NullAllowed)
     */
    public String getKanaMessage1() {
        return _kanaMessage1;
    }

    /**
     * [set] KANA_MESSAGE1: {VARCHAR(60)} <br>
     * カナメッセージ_1
     * @param kanaMessage1 The value of the column 'KANA_MESSAGE1'. (NullAllowed)
     */
    public void setKanaMessage1(String kanaMessage1) {
        __modifiedProperties.add("kanaMessage1");
        this._kanaMessage1 = kanaMessage1;
    }

    /**
     * [get] KANA_MESSAGE2: {VARCHAR(60)} <br>
     * カナメッセージ_2
     * @return The value of the column 'KANA_MESSAGE2'. (NullAllowed)
     */
    public String getKanaMessage2() {
        return _kanaMessage2;
    }

    /**
     * [set] KANA_MESSAGE2: {VARCHAR(60)} <br>
     * カナメッセージ_2
     * @param kanaMessage2 The value of the column 'KANA_MESSAGE2'. (NullAllowed)
     */
    public void setKanaMessage2(String kanaMessage2) {
        __modifiedProperties.add("kanaMessage2");
        this._kanaMessage2 = kanaMessage2;
    }

    /**
     * [get] KANA_MESSAGE3: {VARCHAR(60)} <br>
     * カナメッセージ_3
     * @return The value of the column 'KANA_MESSAGE3'. (NullAllowed)
     */
    public String getKanaMessage3() {
        return _kanaMessage3;
    }

    /**
     * [set] KANA_MESSAGE3: {VARCHAR(60)} <br>
     * カナメッセージ_3
     * @param kanaMessage3 The value of the column 'KANA_MESSAGE3'. (NullAllowed)
     */
    public void setKanaMessage3(String kanaMessage3) {
        __modifiedProperties.add("kanaMessage3");
        this._kanaMessage3 = kanaMessage3;
    }

    /**
     * [get] KANA_MESSAGE4: {VARCHAR(60)} <br>
     * カナメッセージ_4
     * @return The value of the column 'KANA_MESSAGE4'. (NullAllowed)
     */
    public String getKanaMessage4() {
        return _kanaMessage4;
    }

    /**
     * [set] KANA_MESSAGE4: {VARCHAR(60)} <br>
     * カナメッセージ_4
     * @param kanaMessage4 The value of the column 'KANA_MESSAGE4'. (NullAllowed)
     */
    public void setKanaMessage4(String kanaMessage4) {
        __modifiedProperties.add("kanaMessage4");
        this._kanaMessage4 = kanaMessage4;
    }

    /**
     * [get] KANA_MESSAGE5: {VARCHAR(60)} <br>
     * カナメッセージ_5
     * @return The value of the column 'KANA_MESSAGE5'. (NullAllowed)
     */
    public String getKanaMessage5() {
        return _kanaMessage5;
    }

    /**
     * [set] KANA_MESSAGE5: {VARCHAR(60)} <br>
     * カナメッセージ_5
     * @param kanaMessage5 The value of the column 'KANA_MESSAGE5'. (NullAllowed)
     */
    public void setKanaMessage5(String kanaMessage5) {
        __modifiedProperties.add("kanaMessage5");
        this._kanaMessage5 = kanaMessage5;
    }

    /**
     * [get] KANA_MESSAGE6: {VARCHAR(60)} <br>
     * カナメッセージ_6
     * @return The value of the column 'KANA_MESSAGE6'. (NullAllowed)
     */
    public String getKanaMessage6() {
        return _kanaMessage6;
    }

    /**
     * [set] KANA_MESSAGE6: {VARCHAR(60)} <br>
     * カナメッセージ_6
     * @param kanaMessage6 The value of the column 'KANA_MESSAGE6'. (NullAllowed)
     */
    public void setKanaMessage6(String kanaMessage6) {
        __modifiedProperties.add("kanaMessage6");
        this._kanaMessage6 = kanaMessage6;
    }

    /**
     * [get] KANA_MESSAGE7: {VARCHAR(60)} <br>
     * カナメッセージ_7
     * @return The value of the column 'KANA_MESSAGE7'. (NullAllowed)
     */
    public String getKanaMessage7() {
        return _kanaMessage7;
    }

    /**
     * [set] KANA_MESSAGE7: {VARCHAR(60)} <br>
     * カナメッセージ_7
     * @param kanaMessage7 The value of the column 'KANA_MESSAGE7'. (NullAllowed)
     */
    public void setKanaMessage7(String kanaMessage7) {
        __modifiedProperties.add("kanaMessage7");
        this._kanaMessage7 = kanaMessage7;
    }

    /**
     * [get] KANA_MESSAGE8: {VARCHAR(60)} <br>
     * カナメッセージ_8
     * @return The value of the column 'KANA_MESSAGE8'. (NullAllowed)
     */
    public String getKanaMessage8() {
        return _kanaMessage8;
    }

    /**
     * [set] KANA_MESSAGE8: {VARCHAR(60)} <br>
     * カナメッセージ_8
     * @param kanaMessage8 The value of the column 'KANA_MESSAGE8'. (NullAllowed)
     */
    public void setKanaMessage8(String kanaMessage8) {
        __modifiedProperties.add("kanaMessage8");
        this._kanaMessage8 = kanaMessage8;
    }

    /**
     * [get] KANA_MESSAGE9: {VARCHAR(60)} <br>
     * カナメッセージ_9
     * @return The value of the column 'KANA_MESSAGE9'. (NullAllowed)
     */
    public String getKanaMessage9() {
        return _kanaMessage9;
    }

    /**
     * [set] KANA_MESSAGE9: {VARCHAR(60)} <br>
     * カナメッセージ_9
     * @param kanaMessage9 The value of the column 'KANA_MESSAGE9'. (NullAllowed)
     */
    public void setKanaMessage9(String kanaMessage9) {
        __modifiedProperties.add("kanaMessage9");
        this._kanaMessage9 = kanaMessage9;
    }

    /**
     * [get] KANA_MESSAGE10: {VARCHAR(60)} <br>
     * カナメッセージ_10
     * @return The value of the column 'KANA_MESSAGE10'. (NullAllowed)
     */
    public String getKanaMessage10() {
        return _kanaMessage10;
    }

    /**
     * [set] KANA_MESSAGE10: {VARCHAR(60)} <br>
     * カナメッセージ_10
     * @param kanaMessage10 The value of the column 'KANA_MESSAGE10'. (NullAllowed)
     */
    public void setKanaMessage10(String kanaMessage10) {
        __modifiedProperties.add("kanaMessage10");
        this._kanaMessage10 = kanaMessage10;
    }

    /**
     * [get] DELIVERY_NOTE_SUMMARY: {VARCHAR(255)} <br>
     * 納品書摘要
     * @return The value of the column 'DELIVERY_NOTE_SUMMARY'. (NullAllowed)
     */
    public String getDeliveryNoteSummary() {
        return _deliveryNoteSummary;
    }

    /**
     * [set] DELIVERY_NOTE_SUMMARY: {VARCHAR(255)} <br>
     * 納品書摘要
     * @param deliveryNoteSummary The value of the column 'DELIVERY_NOTE_SUMMARY'. (NullAllowed)
     */
    public void setDeliveryNoteSummary(String deliveryNoteSummary) {
        __modifiedProperties.add("deliveryNoteSummary");
        this._deliveryNoteSummary = deliveryNoteSummary;
    }

    /**
     * [get] INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * 送り状摘要
     * @return The value of the column 'INVOICE_SUMMARY'. (NullAllowed)
     */
    public String getInvoiceSummary() {
        return _invoiceSummary;
    }

    /**
     * [set] INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * 送り状摘要
     * @param invoiceSummary The value of the column 'INVOICE_SUMMARY'. (NullAllowed)
     */
    public void setInvoiceSummary(String invoiceSummary) {
        __modifiedProperties.add("invoiceSummary");
        this._invoiceSummary = invoiceSummary;
    }

    /**
     * [get] EC_ORDER_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号
     * @return The value of the column 'EC_ORDER_NO'. (NullAllowed)
     */
    public String getEcOrderNo() {
        return _ecOrderNo;
    }

    /**
     * [set] EC_ORDER_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号
     * @param ecOrderNo The value of the column 'EC_ORDER_NO'. (NullAllowed)
     */
    public void setEcOrderNo(String ecOrderNo) {
        __modifiedProperties.add("ecOrderNo");
        this._ecOrderNo = ecOrderNo;
    }

    /**
     * [get] PAYMENT_TYPE_CD: {VARCHAR(30)} <br>
     * 決済区分
     * @return The value of the column 'PAYMENT_TYPE_CD'. (NullAllowed)
     */
    public String getPaymentTypeCd() {
        return _paymentTypeCd;
    }

    /**
     * [set] PAYMENT_TYPE_CD: {VARCHAR(30)} <br>
     * 決済区分
     * @param paymentTypeCd The value of the column 'PAYMENT_TYPE_CD'. (NullAllowed)
     */
    public void setPaymentTypeCd(String paymentTypeCd) {
        __modifiedProperties.add("paymentTypeCd");
        this._paymentTypeCd = paymentTypeCd;
    }

    /**
     * [get] PRICE_HIDDEN_FLG: {CHAR(1)} <br>
     * 金額非表示フラグ
     * @return The value of the column 'PRICE_HIDDEN_FLG'. (NullAllowed)
     */
    public String getPriceHiddenFlg() {
        return _priceHiddenFlg;
    }

    /**
     * [set] PRICE_HIDDEN_FLG: {CHAR(1)} <br>
     * 金額非表示フラグ
     * @param priceHiddenFlg The value of the column 'PRICE_HIDDEN_FLG'. (NullAllowed)
     */
    public void setPriceHiddenFlg(String priceHiddenFlg) {
        __modifiedProperties.add("priceHiddenFlg");
        this._priceHiddenFlg = priceHiddenFlg;
    }

    /**
     * [get] PAYMENT_HIDDEN_FLG: {CHAR(1)} <br>
     * 決済非表示フラグ
     * @return The value of the column 'PAYMENT_HIDDEN_FLG'. (NullAllowed)
     */
    public String getPaymentHiddenFlg() {
        return _paymentHiddenFlg;
    }

    /**
     * [set] PAYMENT_HIDDEN_FLG: {CHAR(1)} <br>
     * 決済非表示フラグ
     * @param paymentHiddenFlg The value of the column 'PAYMENT_HIDDEN_FLG'. (NullAllowed)
     */
    public void setPaymentHiddenFlg(String paymentHiddenFlg) {
        __modifiedProperties.add("paymentHiddenFlg");
        this._paymentHiddenFlg = paymentHiddenFlg;
    }

    /**
     * [get] DIRECT_UPD_FLG: {CHAR(1)} <br>
     * 直送扱い更新フラグ
     * @return The value of the column 'DIRECT_UPD_FLG'. (NullAllowed)
     */
    public String getDirectUpdFlg() {
        return _directUpdFlg;
    }

    /**
     * [set] DIRECT_UPD_FLG: {CHAR(1)} <br>
     * 直送扱い更新フラグ
     * @param directUpdFlg The value of the column 'DIRECT_UPD_FLG'. (NullAllowed)
     */
    public void setDirectUpdFlg(String directUpdFlg) {
        __modifiedProperties.add("directUpdFlg");
        this._directUpdFlg = directUpdFlg;
    }

    /**
     * [get] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @return The value of the column 'IF_ID'. (NullAllowed)
     */
    public String getIfId() {
        return _ifId;
    }

    /**
     * [set] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @param ifId The value of the column 'IF_ID'. (NullAllowed)
     */
    public void setIfId(String ifId) {
        __modifiedProperties.add("ifId");
        this._ifId = ifId;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
    }

    /**
     * [get] PSAM: {VARCHAR(30)} <br>
     * PSAM
     * @return The value of the column 'PSAM'. (NullAllowed)
     */
    public String getPsam() {
        return _psam;
    }

    /**
     * [set] PSAM: {VARCHAR(30)} <br>
     * PSAM
     * @param psam The value of the column 'PSAM'. (NullAllowed)
     */
    public void setPsam(String psam) {
        __modifiedProperties.add("psam");
        this._psam = psam;
    }

    /**
     * [get] FLOOR_COMP_FLG: {CHAR(1)} <br>
     * フロア完結フラグ
     * @return The value of the column 'FLOOR_COMP_FLG'. (NullAllowed)
     */
    public String getFloorCompFlg() {
        return _floorCompFlg;
    }

    /**
     * [set] FLOOR_COMP_FLG: {CHAR(1)} <br>
     * フロア完結フラグ
     * @param floorCompFlg The value of the column 'FLOOR_COMP_FLG'. (NullAllowed)
     */
    public void setFloorCompFlg(String floorCompFlg) {
        __modifiedProperties.add("floorCompFlg");
        this._floorCompFlg = floorCompFlg;
    }

    /**
     * [get] DELIVERY_TYPE: {VARCHAR(30)} <br>
     * 配送種別
     * @return The value of the column 'DELIVERY_TYPE'. (NullAllowed)
     */
    public String getDeliveryType() {
        return _deliveryType;
    }

    /**
     * [set] DELIVERY_TYPE: {VARCHAR(30)} <br>
     * 配送種別
     * @param deliveryType The value of the column 'DELIVERY_TYPE'. (NullAllowed)
     */
    public void setDeliveryType(String deliveryType) {
        __modifiedProperties.add("deliveryType");
        this._deliveryType = deliveryType;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
