package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_customer as TABLE. <br>
 * 取引先マスタ
 * <pre>
 * [primary-key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, CLIENT_ID, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, ZIP_CD, TEL_NO, ADDRESS1, ADDRESS2, ADDRESS3, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ALLOC_ORDER, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, DELIV_CUSTOMER_ID, ACCOUNT_FLG, CENTER_ID, SALES_ORG_ID, LOT_SPLIT_TYPE_CD, LIMIT_DT_SPLIT_TYPE_CD, PROD_DT_SPLIT_TYPE_CD, LOT_UNMATCH_TYPE_CD, LIMIT_DT_UNMATCH_TYPE_CD, PROD_DT_UNMATCH_TYPE_CD, UNI_CUSTOMER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_client, m_customer, m_client_center(ByClientId), b_class_dtl(ByDelFlg), m_carrier_slip_ces(AsOne)
 *
 * [referrer-table]
 *     m_carrier_decision, m_center_customer, m_client, m_client_center, m_customer, m_customer_picking, m_deposit_product, m_location, m_location_replenish_product, m_user_deposit, t_alloc_inst_b, t_alloc_inst_h, t_alloc_lot, t_inventory_b, t_inventory_inst, t_keeping_lot, t_last_lot, t_move_inst_b, t_receive_plan_h, t_shipping_inst_b, t_shipping_inst_h, t_stock, t_store_no, t_store_record_h, w_ht_inventory_input_prod, w_ht_receive_no_plan_insp, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, m_carrier_slip_ces
 *
 * [foreign-property]
 *     mClient, mCustomerSelf, mClientCenterByClientId, bClassDtlByDelFlg, bClassDtlByDeliveryFlg, bClassDtlByDepositFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotReverseFlg, bClassDtlByOnetimeFlg, bClassDtlByShippingStopFlg, bClassDtlByVendorFlg, mCarrierSlipCesAsOne
 *
 * [referrer-property]
 *     mCarrierDecisionList, mCenterCustomerList, mClientList, mClientCenterList, mCustomerSelfList, mCustomerPickingList, mDepositProductList, mLocationList, mLocationReplenishProductList, mUserDepositList, tAllocInstBList, tAllocInstHBySupplyCustomerIdList, tAllocInstHByDelivCustomerIdList, tAllocLotList, tInventoryBByAccountIdList, tInventoryBByDepositIdList, tInventoryBBySupplierIdList, tInventoryInstList, tKeepingLotList, tLastLotList, tMoveInstBByDepositIdList, tMoveInstBBySupplierIdList, tMoveInstBByAccountIdList, tReceivePlanHByPlanSupplierIdList, tReceivePlanHByPlanDepositIdList, tShippingInstBList, tShippingInstHByDelivCustomerIdList, tShippingInstHBySupplyCustomerIdList, tStockList, tStoreNoList, tStoreRecordHBySupplierIdList, tStoreRecordHByDepositIdList, wHtInventoryInputProdList, wHtReceiveNoPlanInspBySupplierIdList, wHtReceiveNoPlanInspByDepositIdList, wHtSerialReceiveInspList, wHtSerialShippingInspList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCustomerDto implements Serializable {

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
    /** CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER} */
    @JsonKey
    protected Long _customerId;

    /** CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _customerCd;

    /** CUSTOMER_NM: {NotNull, VARCHAR(60)} */
    @JsonKey
    protected String _customerNm;

    /** CUSTOMER_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _customerAbbr;

    /** ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _zipCd;

    /** TEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _telNo;

    /** ADDRESS1: {VARCHAR(60)} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {VARCHAR(60)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {VARCHAR(60)} */
    @JsonKey
    protected String _address3;

    /** VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} */
    @JsonKey
    protected String _vendorFlg;

    /** DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} */
    @JsonKey
    protected String _deliveryFlg;

    /** ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} */
    @JsonKey
    protected String _onetimeFlg;

    /** DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} */
    @JsonKey
    protected String _depositFlg;

    /** ALLOC_ORDER: {BIGINT(19)} */
    @JsonKey
    protected Long _allocOrder;

    /** LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} */
    @JsonKey
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} */
    @JsonKey
    protected String _limitDtReverseFlg;

    /** SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} */
    @JsonKey
    protected String _shippingStopFlg;

    /** DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _delivCustomerId;

    /** ACCOUNT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _accountFlg;

    /** CENTER_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _centerId;

    /** SALES_ORG_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _salesOrgId;

    /** LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _lotSplitTypeCd;

    /** LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _limitDtSplitTypeCd;

    /** PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _prodDtSplitTypeCd;

    /** LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _lotUnmatchTypeCd;

    /** LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _limitDtUnmatchTypeCd;

    /** PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _prodDtUnmatchTypeCd;

    /** UNI_CUSTOMER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _uniCustomerCd;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
    public BsMCustomerDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCustomerDto _mCustomerSelf;

    public MCustomerDto getMCustomerSelf() {
        return _mCustomerSelf;
    }

    public void setMCustomerSelf(MCustomerDto mCustomerSelf) {
        this._mCustomerSelf = mCustomerSelf;
    }

    protected MClientCenterDto _mClientCenterByClientId;

    public MClientCenterDto getMClientCenterByClientId() {
        return _mClientCenterByClientId;
    }

    public void setMClientCenterByClientId(MClientCenterDto mClientCenterByClientId) {
        this._mClientCenterByClientId = mClientCenterByClientId;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected BClassDtlDto _bClassDtlByDeliveryFlg;

    public BClassDtlDto getBClassDtlByDeliveryFlg() {
        return _bClassDtlByDeliveryFlg;
    }

    public void setBClassDtlByDeliveryFlg(BClassDtlDto bClassDtlByDeliveryFlg) {
        this._bClassDtlByDeliveryFlg = bClassDtlByDeliveryFlg;
    }

    protected BClassDtlDto _bClassDtlByDepositFlg;

    public BClassDtlDto getBClassDtlByDepositFlg() {
        return _bClassDtlByDepositFlg;
    }

    public void setBClassDtlByDepositFlg(BClassDtlDto bClassDtlByDepositFlg) {
        this._bClassDtlByDepositFlg = bClassDtlByDepositFlg;
    }

    protected BClassDtlDto _bClassDtlByLimitDtReverseFlg;

    public BClassDtlDto getBClassDtlByLimitDtReverseFlg() {
        return _bClassDtlByLimitDtReverseFlg;
    }

    public void setBClassDtlByLimitDtReverseFlg(BClassDtlDto bClassDtlByLimitDtReverseFlg) {
        this._bClassDtlByLimitDtReverseFlg = bClassDtlByLimitDtReverseFlg;
    }

    protected BClassDtlDto _bClassDtlByLotReverseFlg;

    public BClassDtlDto getBClassDtlByLotReverseFlg() {
        return _bClassDtlByLotReverseFlg;
    }

    public void setBClassDtlByLotReverseFlg(BClassDtlDto bClassDtlByLotReverseFlg) {
        this._bClassDtlByLotReverseFlg = bClassDtlByLotReverseFlg;
    }

    protected BClassDtlDto _bClassDtlByOnetimeFlg;

    public BClassDtlDto getBClassDtlByOnetimeFlg() {
        return _bClassDtlByOnetimeFlg;
    }

    public void setBClassDtlByOnetimeFlg(BClassDtlDto bClassDtlByOnetimeFlg) {
        this._bClassDtlByOnetimeFlg = bClassDtlByOnetimeFlg;
    }

    protected BClassDtlDto _bClassDtlByShippingStopFlg;

    public BClassDtlDto getBClassDtlByShippingStopFlg() {
        return _bClassDtlByShippingStopFlg;
    }

    public void setBClassDtlByShippingStopFlg(BClassDtlDto bClassDtlByShippingStopFlg) {
        this._bClassDtlByShippingStopFlg = bClassDtlByShippingStopFlg;
    }

    protected BClassDtlDto _bClassDtlByVendorFlg;

    public BClassDtlDto getBClassDtlByVendorFlg() {
        return _bClassDtlByVendorFlg;
    }

    public void setBClassDtlByVendorFlg(BClassDtlDto bClassDtlByVendorFlg) {
        this._bClassDtlByVendorFlg = bClassDtlByVendorFlg;
    }

    protected MCarrierSlipCesDto _mCarrierSlipCesAsOne;

    public MCarrierSlipCesDto getMCarrierSlipCesAsOne() {
        return _mCarrierSlipCesAsOne;
    }

    public void setMCarrierSlipCesAsOne(MCarrierSlipCesDto MCarrierSlipCesAsOne) {
        this._mCarrierSlipCesAsOne = MCarrierSlipCesAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MCarrierDecisionDto> _mCarrierDecisionList;

    public List<MCarrierDecisionDto> getMCarrierDecisionList() {
        if (_mCarrierDecisionList == null) { _mCarrierDecisionList = new ArrayList<MCarrierDecisionDto>(); }
        return _mCarrierDecisionList;
    }

    public void setMCarrierDecisionList(List<MCarrierDecisionDto> mCarrierDecisionList) {
        this._mCarrierDecisionList = mCarrierDecisionList;
    }

    protected List<MCenterCustomerDto> _mCenterCustomerList;

    public List<MCenterCustomerDto> getMCenterCustomerList() {
        if (_mCenterCustomerList == null) { _mCenterCustomerList = new ArrayList<MCenterCustomerDto>(); }
        return _mCenterCustomerList;
    }

    public void setMCenterCustomerList(List<MCenterCustomerDto> mCenterCustomerList) {
        this._mCenterCustomerList = mCenterCustomerList;
    }

    protected List<MClientDto> _mClientList;

    public List<MClientDto> getMClientList() {
        if (_mClientList == null) { _mClientList = new ArrayList<MClientDto>(); }
        return _mClientList;
    }

    public void setMClientList(List<MClientDto> mClientList) {
        this._mClientList = mClientList;
    }

    protected List<MClientCenterDto> _mClientCenterList;

    public List<MClientCenterDto> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = new ArrayList<MClientCenterDto>(); }
        return _mClientCenterList;
    }

    public void setMClientCenterList(List<MClientCenterDto> mClientCenterList) {
        this._mClientCenterList = mClientCenterList;
    }

    protected List<MCustomerDto> _mCustomerSelfList;

    public List<MCustomerDto> getMCustomerSelfList() {
        if (_mCustomerSelfList == null) { _mCustomerSelfList = new ArrayList<MCustomerDto>(); }
        return _mCustomerSelfList;
    }

    public void setMCustomerSelfList(List<MCustomerDto> mCustomerSelfList) {
        this._mCustomerSelfList = mCustomerSelfList;
    }

    protected List<MCustomerPickingDto> _mCustomerPickingList;

    public List<MCustomerPickingDto> getMCustomerPickingList() {
        if (_mCustomerPickingList == null) { _mCustomerPickingList = new ArrayList<MCustomerPickingDto>(); }
        return _mCustomerPickingList;
    }

    public void setMCustomerPickingList(List<MCustomerPickingDto> mCustomerPickingList) {
        this._mCustomerPickingList = mCustomerPickingList;
    }

    protected List<MDepositProductDto> _mDepositProductList;

    public List<MDepositProductDto> getMDepositProductList() {
        if (_mDepositProductList == null) { _mDepositProductList = new ArrayList<MDepositProductDto>(); }
        return _mDepositProductList;
    }

    public void setMDepositProductList(List<MDepositProductDto> mDepositProductList) {
        this._mDepositProductList = mDepositProductList;
    }

    protected List<MLocationDto> _mLocationList;

    public List<MLocationDto> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = new ArrayList<MLocationDto>(); }
        return _mLocationList;
    }

    public void setMLocationList(List<MLocationDto> mLocationList) {
        this._mLocationList = mLocationList;
    }

    protected List<MLocationReplenishProductDto> _mLocationReplenishProductList;

    public List<MLocationReplenishProductDto> getMLocationReplenishProductList() {
        if (_mLocationReplenishProductList == null) { _mLocationReplenishProductList = new ArrayList<MLocationReplenishProductDto>(); }
        return _mLocationReplenishProductList;
    }

    public void setMLocationReplenishProductList(List<MLocationReplenishProductDto> mLocationReplenishProductList) {
        this._mLocationReplenishProductList = mLocationReplenishProductList;
    }

    protected List<MUserDepositDto> _mUserDepositList;

    public List<MUserDepositDto> getMUserDepositList() {
        if (_mUserDepositList == null) { _mUserDepositList = new ArrayList<MUserDepositDto>(); }
        return _mUserDepositList;
    }

    public void setMUserDepositList(List<MUserDepositDto> mUserDepositList) {
        this._mUserDepositList = mUserDepositList;
    }

    protected List<TAllocInstBDto> _tAllocInstBList;

    public List<TAllocInstBDto> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = new ArrayList<TAllocInstBDto>(); }
        return _tAllocInstBList;
    }

    public void setTAllocInstBList(List<TAllocInstBDto> tAllocInstBList) {
        this._tAllocInstBList = tAllocInstBList;
    }

    protected List<TAllocInstHDto> _tAllocInstHBySupplyCustomerIdList;

    public List<TAllocInstHDto> getTAllocInstHBySupplyCustomerIdList() {
        if (_tAllocInstHBySupplyCustomerIdList == null) { _tAllocInstHBySupplyCustomerIdList = new ArrayList<TAllocInstHDto>(); }
        return _tAllocInstHBySupplyCustomerIdList;
    }

    public void setTAllocInstHBySupplyCustomerIdList(List<TAllocInstHDto> tAllocInstHBySupplyCustomerIdList) {
        this._tAllocInstHBySupplyCustomerIdList = tAllocInstHBySupplyCustomerIdList;
    }

    protected List<TAllocInstHDto> _tAllocInstHByDelivCustomerIdList;

    public List<TAllocInstHDto> getTAllocInstHByDelivCustomerIdList() {
        if (_tAllocInstHByDelivCustomerIdList == null) { _tAllocInstHByDelivCustomerIdList = new ArrayList<TAllocInstHDto>(); }
        return _tAllocInstHByDelivCustomerIdList;
    }

    public void setTAllocInstHByDelivCustomerIdList(List<TAllocInstHDto> tAllocInstHByDelivCustomerIdList) {
        this._tAllocInstHByDelivCustomerIdList = tAllocInstHByDelivCustomerIdList;
    }

    protected List<TAllocLotDto> _tAllocLotList;

    public List<TAllocLotDto> getTAllocLotList() {
        if (_tAllocLotList == null) { _tAllocLotList = new ArrayList<TAllocLotDto>(); }
        return _tAllocLotList;
    }

    public void setTAllocLotList(List<TAllocLotDto> tAllocLotList) {
        this._tAllocLotList = tAllocLotList;
    }

    protected List<TInventoryBDto> _tInventoryBByAccountIdList;

    public List<TInventoryBDto> getTInventoryBByAccountIdList() {
        if (_tInventoryBByAccountIdList == null) { _tInventoryBByAccountIdList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBByAccountIdList;
    }

    public void setTInventoryBByAccountIdList(List<TInventoryBDto> tInventoryBByAccountIdList) {
        this._tInventoryBByAccountIdList = tInventoryBByAccountIdList;
    }

    protected List<TInventoryBDto> _tInventoryBByDepositIdList;

    public List<TInventoryBDto> getTInventoryBByDepositIdList() {
        if (_tInventoryBByDepositIdList == null) { _tInventoryBByDepositIdList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBByDepositIdList;
    }

    public void setTInventoryBByDepositIdList(List<TInventoryBDto> tInventoryBByDepositIdList) {
        this._tInventoryBByDepositIdList = tInventoryBByDepositIdList;
    }

    protected List<TInventoryBDto> _tInventoryBBySupplierIdList;

    public List<TInventoryBDto> getTInventoryBBySupplierIdList() {
        if (_tInventoryBBySupplierIdList == null) { _tInventoryBBySupplierIdList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBBySupplierIdList;
    }

    public void setTInventoryBBySupplierIdList(List<TInventoryBDto> tInventoryBBySupplierIdList) {
        this._tInventoryBBySupplierIdList = tInventoryBBySupplierIdList;
    }

    protected List<TInventoryInstDto> _tInventoryInstList;

    public List<TInventoryInstDto> getTInventoryInstList() {
        if (_tInventoryInstList == null) { _tInventoryInstList = new ArrayList<TInventoryInstDto>(); }
        return _tInventoryInstList;
    }

    public void setTInventoryInstList(List<TInventoryInstDto> tInventoryInstList) {
        this._tInventoryInstList = tInventoryInstList;
    }

    protected List<TKeepingLotDto> _tKeepingLotList;

    public List<TKeepingLotDto> getTKeepingLotList() {
        if (_tKeepingLotList == null) { _tKeepingLotList = new ArrayList<TKeepingLotDto>(); }
        return _tKeepingLotList;
    }

    public void setTKeepingLotList(List<TKeepingLotDto> tKeepingLotList) {
        this._tKeepingLotList = tKeepingLotList;
    }

    protected List<TLastLotDto> _tLastLotList;

    public List<TLastLotDto> getTLastLotList() {
        if (_tLastLotList == null) { _tLastLotList = new ArrayList<TLastLotDto>(); }
        return _tLastLotList;
    }

    public void setTLastLotList(List<TLastLotDto> tLastLotList) {
        this._tLastLotList = tLastLotList;
    }

    protected List<TMoveInstBDto> _tMoveInstBByDepositIdList;

    public List<TMoveInstBDto> getTMoveInstBByDepositIdList() {
        if (_tMoveInstBByDepositIdList == null) { _tMoveInstBByDepositIdList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBByDepositIdList;
    }

    public void setTMoveInstBByDepositIdList(List<TMoveInstBDto> tMoveInstBByDepositIdList) {
        this._tMoveInstBByDepositIdList = tMoveInstBByDepositIdList;
    }

    protected List<TMoveInstBDto> _tMoveInstBBySupplierIdList;

    public List<TMoveInstBDto> getTMoveInstBBySupplierIdList() {
        if (_tMoveInstBBySupplierIdList == null) { _tMoveInstBBySupplierIdList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBBySupplierIdList;
    }

    public void setTMoveInstBBySupplierIdList(List<TMoveInstBDto> tMoveInstBBySupplierIdList) {
        this._tMoveInstBBySupplierIdList = tMoveInstBBySupplierIdList;
    }

    protected List<TMoveInstBDto> _tMoveInstBByAccountIdList;

    public List<TMoveInstBDto> getTMoveInstBByAccountIdList() {
        if (_tMoveInstBByAccountIdList == null) { _tMoveInstBByAccountIdList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBByAccountIdList;
    }

    public void setTMoveInstBByAccountIdList(List<TMoveInstBDto> tMoveInstBByAccountIdList) {
        this._tMoveInstBByAccountIdList = tMoveInstBByAccountIdList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHByPlanSupplierIdList;

    public List<TReceivePlanHDto> getTReceivePlanHByPlanSupplierIdList() {
        if (_tReceivePlanHByPlanSupplierIdList == null) { _tReceivePlanHByPlanSupplierIdList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHByPlanSupplierIdList;
    }

    public void setTReceivePlanHByPlanSupplierIdList(List<TReceivePlanHDto> tReceivePlanHByPlanSupplierIdList) {
        this._tReceivePlanHByPlanSupplierIdList = tReceivePlanHByPlanSupplierIdList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHByPlanDepositIdList;

    public List<TReceivePlanHDto> getTReceivePlanHByPlanDepositIdList() {
        if (_tReceivePlanHByPlanDepositIdList == null) { _tReceivePlanHByPlanDepositIdList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHByPlanDepositIdList;
    }

    public void setTReceivePlanHByPlanDepositIdList(List<TReceivePlanHDto> tReceivePlanHByPlanDepositIdList) {
        this._tReceivePlanHByPlanDepositIdList = tReceivePlanHByPlanDepositIdList;
    }

    protected List<TShippingInstBDto> _tShippingInstBList;

    public List<TShippingInstBDto> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = new ArrayList<TShippingInstBDto>(); }
        return _tShippingInstBList;
    }

    public void setTShippingInstBList(List<TShippingInstBDto> tShippingInstBList) {
        this._tShippingInstBList = tShippingInstBList;
    }

    protected List<TShippingInstHDto> _tShippingInstHByDelivCustomerIdList;

    public List<TShippingInstHDto> getTShippingInstHByDelivCustomerIdList() {
        if (_tShippingInstHByDelivCustomerIdList == null) { _tShippingInstHByDelivCustomerIdList = new ArrayList<TShippingInstHDto>(); }
        return _tShippingInstHByDelivCustomerIdList;
    }

    public void setTShippingInstHByDelivCustomerIdList(List<TShippingInstHDto> tShippingInstHByDelivCustomerIdList) {
        this._tShippingInstHByDelivCustomerIdList = tShippingInstHByDelivCustomerIdList;
    }

    protected List<TShippingInstHDto> _tShippingInstHBySupplyCustomerIdList;

    public List<TShippingInstHDto> getTShippingInstHBySupplyCustomerIdList() {
        if (_tShippingInstHBySupplyCustomerIdList == null) { _tShippingInstHBySupplyCustomerIdList = new ArrayList<TShippingInstHDto>(); }
        return _tShippingInstHBySupplyCustomerIdList;
    }

    public void setTShippingInstHBySupplyCustomerIdList(List<TShippingInstHDto> tShippingInstHBySupplyCustomerIdList) {
        this._tShippingInstHBySupplyCustomerIdList = tShippingInstHBySupplyCustomerIdList;
    }

    protected List<TStockDto> _tStockList;

    public List<TStockDto> getTStockList() {
        if (_tStockList == null) { _tStockList = new ArrayList<TStockDto>(); }
        return _tStockList;
    }

    public void setTStockList(List<TStockDto> tStockList) {
        this._tStockList = tStockList;
    }

    protected List<TStoreNoDto> _tStoreNoList;

    public List<TStoreNoDto> getTStoreNoList() {
        if (_tStoreNoList == null) { _tStoreNoList = new ArrayList<TStoreNoDto>(); }
        return _tStoreNoList;
    }

    public void setTStoreNoList(List<TStoreNoDto> tStoreNoList) {
        this._tStoreNoList = tStoreNoList;
    }

    protected List<TStoreRecordHDto> _tStoreRecordHBySupplierIdList;

    public List<TStoreRecordHDto> getTStoreRecordHBySupplierIdList() {
        if (_tStoreRecordHBySupplierIdList == null) { _tStoreRecordHBySupplierIdList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHBySupplierIdList;
    }

    public void setTStoreRecordHBySupplierIdList(List<TStoreRecordHDto> tStoreRecordHBySupplierIdList) {
        this._tStoreRecordHBySupplierIdList = tStoreRecordHBySupplierIdList;
    }

    protected List<TStoreRecordHDto> _tStoreRecordHByDepositIdList;

    public List<TStoreRecordHDto> getTStoreRecordHByDepositIdList() {
        if (_tStoreRecordHByDepositIdList == null) { _tStoreRecordHByDepositIdList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHByDepositIdList;
    }

    public void setTStoreRecordHByDepositIdList(List<TStoreRecordHDto> tStoreRecordHByDepositIdList) {
        this._tStoreRecordHByDepositIdList = tStoreRecordHByDepositIdList;
    }

    protected List<WHtInventoryInputProdDto> _wHtInventoryInputProdList;

    public List<WHtInventoryInputProdDto> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = new ArrayList<WHtInventoryInputProdDto>(); }
        return _wHtInventoryInputProdList;
    }

    public void setWHtInventoryInputProdList(List<WHtInventoryInputProdDto> wHtInventoryInputProdList) {
        this._wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    protected List<WHtReceiveNoPlanInspDto> _wHtReceiveNoPlanInspBySupplierIdList;

    public List<WHtReceiveNoPlanInspDto> getWHtReceiveNoPlanInspBySupplierIdList() {
        if (_wHtReceiveNoPlanInspBySupplierIdList == null) { _wHtReceiveNoPlanInspBySupplierIdList = new ArrayList<WHtReceiveNoPlanInspDto>(); }
        return _wHtReceiveNoPlanInspBySupplierIdList;
    }

    public void setWHtReceiveNoPlanInspBySupplierIdList(List<WHtReceiveNoPlanInspDto> wHtReceiveNoPlanInspBySupplierIdList) {
        this._wHtReceiveNoPlanInspBySupplierIdList = wHtReceiveNoPlanInspBySupplierIdList;
    }

    protected List<WHtReceiveNoPlanInspDto> _wHtReceiveNoPlanInspByDepositIdList;

    public List<WHtReceiveNoPlanInspDto> getWHtReceiveNoPlanInspByDepositIdList() {
        if (_wHtReceiveNoPlanInspByDepositIdList == null) { _wHtReceiveNoPlanInspByDepositIdList = new ArrayList<WHtReceiveNoPlanInspDto>(); }
        return _wHtReceiveNoPlanInspByDepositIdList;
    }

    public void setWHtReceiveNoPlanInspByDepositIdList(List<WHtReceiveNoPlanInspDto> wHtReceiveNoPlanInspByDepositIdList) {
        this._wHtReceiveNoPlanInspByDepositIdList = wHtReceiveNoPlanInspByDepositIdList;
    }

    protected List<WHtSerialReceiveInspDto> _wHtSerialReceiveInspList;

    public List<WHtSerialReceiveInspDto> getWHtSerialReceiveInspList() {
        if (_wHtSerialReceiveInspList == null) { _wHtSerialReceiveInspList = new ArrayList<WHtSerialReceiveInspDto>(); }
        return _wHtSerialReceiveInspList;
    }

    public void setWHtSerialReceiveInspList(List<WHtSerialReceiveInspDto> wHtSerialReceiveInspList) {
        this._wHtSerialReceiveInspList = wHtSerialReceiveInspList;
    }

    protected List<WHtSerialShippingInspDto> _wHtSerialShippingInspList;

    public List<WHtSerialShippingInspDto> getWHtSerialShippingInspList() {
        if (_wHtSerialShippingInspList == null) { _wHtSerialShippingInspList = new ArrayList<WHtSerialShippingInspDto>(); }
        return _wHtSerialShippingInspList;
    }

    public void setWHtSerialShippingInspList(List<WHtSerialShippingInspDto> wHtSerialShippingInspList) {
        this._wHtSerialShippingInspList = wHtSerialShippingInspList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCustomerDto)) { return false; }
        final BsMCustomerDto otherEntity = (BsMCustomerDto)other;
        if (!helpComparingValue(getCustomerId(), otherEntity.getCustomerId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_customer");
        result = xCH(result, getCustomerId());
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
        sb.append(c).append(getCustomerId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getCustomerAbbr());
        sb.append(c).append(getZipCd());
        sb.append(c).append(getTelNo());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getVendorFlg());
        sb.append(c).append(getDeliveryFlg());
        sb.append(c).append(getOnetimeFlg());
        sb.append(c).append(getDepositFlg());
        sb.append(c).append(getAllocOrder());
        sb.append(c).append(getLotReverseFlg());
        sb.append(c).append(getLimitDtReverseFlg());
        sb.append(c).append(getShippingStopFlg());
        sb.append(c).append(getDelivCustomerId());
        sb.append(c).append(getAccountFlg());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getSalesOrgId());
        sb.append(c).append(getLotSplitTypeCd());
        sb.append(c).append(getLimitDtSplitTypeCd());
        sb.append(c).append(getProdDtSplitTypeCd());
        sb.append(c).append(getLotUnmatchTypeCd());
        sb.append(c).append(getLimitDtUnmatchTypeCd());
        sb.append(c).append(getProdDtUnmatchTypeCd());
        sb.append(c).append(getUniCustomerCd());
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
     * [get] CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER} <br>
     * 取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER} <br>
     * 取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(Long customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {NotNull, VARCHAR(60)} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {NotNull, VARCHAR(60)} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
    }

    /**
     * [get] CUSTOMER_ABBR: {VARCHAR(60)} <br>
     * 取引先略称
     * @return The value of the column 'CUSTOMER_ABBR'. (NullAllowed)
     */
    public String getCustomerAbbr() {
        return _customerAbbr;
    }

    /**
     * [set] CUSTOMER_ABBR: {VARCHAR(60)} <br>
     * 取引先略称
     * @param customerAbbr The value of the column 'CUSTOMER_ABBR'. (NullAllowed)
     */
    public void setCustomerAbbr(String customerAbbr) {
        __modifiedProperties.add("customerAbbr");
        this._customerAbbr = customerAbbr;
    }

    /**
     * [get] ZIP_CD: {VARCHAR(30)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public String getZipCd() {
        return _zipCd;
    }

    /**
     * [set] ZIP_CD: {VARCHAR(30)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public void setZipCd(String zipCd) {
        __modifiedProperties.add("zipCd");
        this._zipCd = zipCd;
    }

    /**
     * [get] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @return The value of the column 'TEL_NO'. (NullAllowed)
     */
    public String getTelNo() {
        return _telNo;
    }

    /**
     * [set] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed)
     */
    public void setTelNo(String telNo) {
        __modifiedProperties.add("telNo");
        this._telNo = telNo;
    }

    /**
     * [get] ADDRESS1: {VARCHAR(60)} <br>
     * 住所1
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {VARCHAR(60)} <br>
     * 住所1
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ADDRESS2: {VARCHAR(60)} <br>
     * 住所2
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {VARCHAR(60)} <br>
     * 住所2
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {VARCHAR(60)} <br>
     * 住所3
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {VARCHAR(60)} <br>
     * 住所3
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @return The value of the column 'VENDOR_FLG'. (NullAllowed)
     */
    public String getVendorFlg() {
        return _vendorFlg;
    }

    /**
     * [set] VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param vendorFlg The value of the column 'VENDOR_FLG'. (NullAllowed)
     */
    public void setVendorFlg(String vendorFlg) {
        __modifiedProperties.add("vendorFlg");
        this._vendorFlg = vendorFlg;
    }

    /**
     * [get] DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @return The value of the column 'DELIVERY_FLG'. (NullAllowed)
     */
    public String getDeliveryFlg() {
        return _deliveryFlg;
    }

    /**
     * [set] DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param deliveryFlg The value of the column 'DELIVERY_FLG'. (NullAllowed)
     */
    public void setDeliveryFlg(String deliveryFlg) {
        __modifiedProperties.add("deliveryFlg");
        this._deliveryFlg = deliveryFlg;
    }

    /**
     * [get] ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @return The value of the column 'ONETIME_FLG'. (NullAllowed)
     */
    public String getOnetimeFlg() {
        return _onetimeFlg;
    }

    /**
     * [set] ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param onetimeFlg The value of the column 'ONETIME_FLG'. (NullAllowed)
     */
    public void setOnetimeFlg(String onetimeFlg) {
        __modifiedProperties.add("onetimeFlg");
        this._onetimeFlg = onetimeFlg;
    }

    /**
     * [get] DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @return The value of the column 'DEPOSIT_FLG'. (NullAllowed)
     */
    public String getDepositFlg() {
        return _depositFlg;
    }

    /**
     * [set] DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param depositFlg The value of the column 'DEPOSIT_FLG'. (NullAllowed)
     */
    public void setDepositFlg(String depositFlg) {
        __modifiedProperties.add("depositFlg");
        this._depositFlg = depositFlg;
    }

    /**
     * [get] ALLOC_ORDER: {BIGINT(19)} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public Long getAllocOrder() {
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {BIGINT(19)} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public void setAllocOrder(Long allocOrder) {
        __modifiedProperties.add("allocOrder");
        this._allocOrder = allocOrder;
    }

    /**
     * [get] LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLotReverseFlg() {
        return _lotReverseFlg;
    }

    /**
     * [set] LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        __modifiedProperties.add("lotReverseFlg");
        this._lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLimitDtReverseFlg() {
        return _limitDtReverseFlg;
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        __modifiedProperties.add("limitDtReverseFlg");
        this._limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public String getShippingStopFlg() {
        return _shippingStopFlg;
    }

    /**
     * [set] SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        __modifiedProperties.add("shippingStopFlg");
        this._shippingStopFlg = shippingStopFlg;
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
     * [get] ACCOUNT_FLG: {CHAR(1)} <br>
     * 得意先フラグ
     * @return The value of the column 'ACCOUNT_FLG'. (NullAllowed)
     */
    public String getAccountFlg() {
        return _accountFlg;
    }

    /**
     * [set] ACCOUNT_FLG: {CHAR(1)} <br>
     * 得意先フラグ
     * @param accountFlg The value of the column 'ACCOUNT_FLG'. (NullAllowed)
     */
    public void setAccountFlg(String accountFlg) {
        __modifiedProperties.add("accountFlg");
        this._accountFlg = accountFlg;
    }

    /**
     * [get] CENTER_ID: {BIGINT(19)} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {BIGINT(19)} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public Long getSalesOrgId() {
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public void setSalesOrgId(Long salesOrgId) {
        __modifiedProperties.add("salesOrgId");
        this._salesOrgId = salesOrgId;
    }

    /**
     * [get] LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * ロット割れ区分
     * @return The value of the column 'LOT_SPLIT_TYPE_CD'. (NullAllowed)
     */
    public String getLotSplitTypeCd() {
        return _lotSplitTypeCd;
    }

    /**
     * [set] LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * ロット割れ区分
     * @param lotSplitTypeCd The value of the column 'LOT_SPLIT_TYPE_CD'. (NullAllowed)
     */
    public void setLotSplitTypeCd(String lotSplitTypeCd) {
        __modifiedProperties.add("lotSplitTypeCd");
        this._lotSplitTypeCd = lotSplitTypeCd;
    }

    /**
     * [get] LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 期限日割れ区分
     * @return The value of the column 'LIMIT_DT_SPLIT_TYPE_CD'. (NullAllowed)
     */
    public String getLimitDtSplitTypeCd() {
        return _limitDtSplitTypeCd;
    }

    /**
     * [set] LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 期限日割れ区分
     * @param limitDtSplitTypeCd The value of the column 'LIMIT_DT_SPLIT_TYPE_CD'. (NullAllowed)
     */
    public void setLimitDtSplitTypeCd(String limitDtSplitTypeCd) {
        __modifiedProperties.add("limitDtSplitTypeCd");
        this._limitDtSplitTypeCd = limitDtSplitTypeCd;
    }

    /**
     * [get] PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 製造日割れ区分
     * @return The value of the column 'PROD_DT_SPLIT_TYPE_CD'. (NullAllowed)
     */
    public String getProdDtSplitTypeCd() {
        return _prodDtSplitTypeCd;
    }

    /**
     * [set] PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 製造日割れ区分
     * @param prodDtSplitTypeCd The value of the column 'PROD_DT_SPLIT_TYPE_CD'. (NullAllowed)
     */
    public void setProdDtSplitTypeCd(String prodDtSplitTypeCd) {
        __modifiedProperties.add("prodDtSplitTypeCd");
        this._prodDtSplitTypeCd = prodDtSplitTypeCd;
    }

    /**
     * [get] LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * ロット不一致区分
     * @return The value of the column 'LOT_UNMATCH_TYPE_CD'. (NullAllowed)
     */
    public String getLotUnmatchTypeCd() {
        return _lotUnmatchTypeCd;
    }

    /**
     * [set] LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * ロット不一致区分
     * @param lotUnmatchTypeCd The value of the column 'LOT_UNMATCH_TYPE_CD'. (NullAllowed)
     */
    public void setLotUnmatchTypeCd(String lotUnmatchTypeCd) {
        __modifiedProperties.add("lotUnmatchTypeCd");
        this._lotUnmatchTypeCd = lotUnmatchTypeCd;
    }

    /**
     * [get] LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 期限日不一致区分
     * @return The value of the column 'LIMIT_DT_UNMATCH_TYPE_CD'. (NullAllowed)
     */
    public String getLimitDtUnmatchTypeCd() {
        return _limitDtUnmatchTypeCd;
    }

    /**
     * [set] LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 期限日不一致区分
     * @param limitDtUnmatchTypeCd The value of the column 'LIMIT_DT_UNMATCH_TYPE_CD'. (NullAllowed)
     */
    public void setLimitDtUnmatchTypeCd(String limitDtUnmatchTypeCd) {
        __modifiedProperties.add("limitDtUnmatchTypeCd");
        this._limitDtUnmatchTypeCd = limitDtUnmatchTypeCd;
    }

    /**
     * [get] PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 製造日不一致区分
     * @return The value of the column 'PROD_DT_UNMATCH_TYPE_CD'. (NullAllowed)
     */
    public String getProdDtUnmatchTypeCd() {
        return _prodDtUnmatchTypeCd;
    }

    /**
     * [set] PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 製造日不一致区分
     * @param prodDtUnmatchTypeCd The value of the column 'PROD_DT_UNMATCH_TYPE_CD'. (NullAllowed)
     */
    public void setProdDtUnmatchTypeCd(String prodDtUnmatchTypeCd) {
        __modifiedProperties.add("prodDtUnmatchTypeCd");
        this._prodDtUnmatchTypeCd = prodDtUnmatchTypeCd;
    }

    /**
     * [get] UNI_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 統合取引先CD
     * @return The value of the column 'UNI_CUSTOMER_CD'. (NullAllowed)
     */
    public String getUniCustomerCd() {
        return _uniCustomerCd;
    }

    /**
     * [set] UNI_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 統合取引先CD
     * @param uniCustomerCd The value of the column 'UNI_CUSTOMER_CD'. (NullAllowed)
     */
    public void setUniCustomerCd(String uniCustomerCd) {
        __modifiedProperties.add("uniCustomerCd");
        this._uniCustomerCd = uniCustomerCd;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
