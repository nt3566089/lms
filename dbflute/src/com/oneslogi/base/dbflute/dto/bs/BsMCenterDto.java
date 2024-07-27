package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_center as TABLE. <br>
 * センタマスタ
 * <pre>
 * [primary-key]
 *     CENTER_ID
 *
 * [column]
 *     CENTER_ID, CENTER_CD, CENTER_NM, CENTER_ABBR, CULTURE_ID, TIME_ZONE_ID, ADDRESS, TEL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_time_zone, b_culture, b_class_dtl(ByDelFlg)
 *
 * [referrer-table]
 *     h_location_attribute, m_box, m_box_grp, m_carrier, m_carrier_slip_sgw, m_carrier_slip_ymt, m_carrier_slip_yupk, m_center_class, m_center_col, m_center_customer, m_center_item, m_center_screen, m_client_center, m_customer_picking, m_delivery_course, m_general, m_location, m_nizoroe, m_numbering_center, m_user_center, m_user_login, m_warehouse, m_web_ht_info, t_alloc_inst_h, t_ec_order_h, t_inventory_h, t_move_inst_h, t_packing_h, t_pic_mthd_rcmd, t_picking_h, t_receive_plan_h, t_serial_no, t_shipping_inst_h, t_store_record_h, w_ht_inventory_input_prod, w_ht_loading, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt
 *
 * [foreign-property]
 *     bTimeZone, bCulture, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     hLocationAttributeList, mBoxList, mBoxGrpList, mCarrierList, mCarrierSlipSgwList, mCarrierSlipYmtList, mCarrierSlipYupkList, mCenterClassList, mCenterColList, mCenterCustomerList, mCenterItemList, mCenterScreenList, mClientCenterList, mCustomerPickingList, mDeliveryCourseList, mGeneralList, mLocationList, mNizoroeList, mNumberingCenterList, mUserCenterList, mUserLoginList, mWarehouseList, mWebHtInfoList, tAllocInstHList, tEcOrderHList, tInventoryHList, tMoveInstHList, tPackingHList, tPicMthdRcmdList, tPickingHList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tStoreRecordHList, wHtInventoryInputProdList, wHtLoadingList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCenterDto implements Serializable {

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
    /** CENTER_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {UQ, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {NotNull, VARCHAR(60)} */
    @JsonKey
    protected String _centerNm;

    /** CENTER_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _centerAbbr;

    /** CULTURE_ID: {IX, BIGINT(19), FK to b_culture} */
    @JsonKey
    protected Long _cultureId;

    /** TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone} */
    @JsonKey
    protected Long _timeZoneId;

    /** ADDRESS: {VARCHAR(255)} */
    @JsonKey
    protected String _address;

    /** TEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _telNo;

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
    public BsMCenterDto() {
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
    protected BTimeZoneDto _bTimeZone;

    public BTimeZoneDto getBTimeZone() {
        return _bTimeZone;
    }

    public void setBTimeZone(BTimeZoneDto bTimeZone) {
        this._bTimeZone = bTimeZone;
    }

    protected BCultureDto _bCulture;

    public BCultureDto getBCulture() {
        return _bCulture;
    }

    public void setBCulture(BCultureDto bCulture) {
        this._bCulture = bCulture;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<HLocationAttributeDto> _hLocationAttributeList;

    public List<HLocationAttributeDto> getHLocationAttributeList() {
        if (_hLocationAttributeList == null) { _hLocationAttributeList = new ArrayList<HLocationAttributeDto>(); }
        return _hLocationAttributeList;
    }

    public void setHLocationAttributeList(List<HLocationAttributeDto> hLocationAttributeList) {
        this._hLocationAttributeList = hLocationAttributeList;
    }

    protected List<MBoxDto> _mBoxList;

    public List<MBoxDto> getMBoxList() {
        if (_mBoxList == null) { _mBoxList = new ArrayList<MBoxDto>(); }
        return _mBoxList;
    }

    public void setMBoxList(List<MBoxDto> mBoxList) {
        this._mBoxList = mBoxList;
    }

    protected List<MBoxGrpDto> _mBoxGrpList;

    public List<MBoxGrpDto> getMBoxGrpList() {
        if (_mBoxGrpList == null) { _mBoxGrpList = new ArrayList<MBoxGrpDto>(); }
        return _mBoxGrpList;
    }

    public void setMBoxGrpList(List<MBoxGrpDto> mBoxGrpList) {
        this._mBoxGrpList = mBoxGrpList;
    }

    protected List<MCarrierDto> _mCarrierList;

    public List<MCarrierDto> getMCarrierList() {
        if (_mCarrierList == null) { _mCarrierList = new ArrayList<MCarrierDto>(); }
        return _mCarrierList;
    }

    public void setMCarrierList(List<MCarrierDto> mCarrierList) {
        this._mCarrierList = mCarrierList;
    }

    protected List<MCarrierSlipSgwDto> _mCarrierSlipSgwList;

    public List<MCarrierSlipSgwDto> getMCarrierSlipSgwList() {
        if (_mCarrierSlipSgwList == null) { _mCarrierSlipSgwList = new ArrayList<MCarrierSlipSgwDto>(); }
        return _mCarrierSlipSgwList;
    }

    public void setMCarrierSlipSgwList(List<MCarrierSlipSgwDto> mCarrierSlipSgwList) {
        this._mCarrierSlipSgwList = mCarrierSlipSgwList;
    }

    protected List<MCarrierSlipYmtDto> _mCarrierSlipYmtList;

    public List<MCarrierSlipYmtDto> getMCarrierSlipYmtList() {
        if (_mCarrierSlipYmtList == null) { _mCarrierSlipYmtList = new ArrayList<MCarrierSlipYmtDto>(); }
        return _mCarrierSlipYmtList;
    }

    public void setMCarrierSlipYmtList(List<MCarrierSlipYmtDto> mCarrierSlipYmtList) {
        this._mCarrierSlipYmtList = mCarrierSlipYmtList;
    }

    protected List<MCarrierSlipYupkDto> _mCarrierSlipYupkList;

    public List<MCarrierSlipYupkDto> getMCarrierSlipYupkList() {
        if (_mCarrierSlipYupkList == null) { _mCarrierSlipYupkList = new ArrayList<MCarrierSlipYupkDto>(); }
        return _mCarrierSlipYupkList;
    }

    public void setMCarrierSlipYupkList(List<MCarrierSlipYupkDto> mCarrierSlipYupkList) {
        this._mCarrierSlipYupkList = mCarrierSlipYupkList;
    }

    protected List<MCenterClassDto> _mCenterClassList;

    public List<MCenterClassDto> getMCenterClassList() {
        if (_mCenterClassList == null) { _mCenterClassList = new ArrayList<MCenterClassDto>(); }
        return _mCenterClassList;
    }

    public void setMCenterClassList(List<MCenterClassDto> mCenterClassList) {
        this._mCenterClassList = mCenterClassList;
    }

    protected List<MCenterColDto> _mCenterColList;

    public List<MCenterColDto> getMCenterColList() {
        if (_mCenterColList == null) { _mCenterColList = new ArrayList<MCenterColDto>(); }
        return _mCenterColList;
    }

    public void setMCenterColList(List<MCenterColDto> mCenterColList) {
        this._mCenterColList = mCenterColList;
    }

    protected List<MCenterCustomerDto> _mCenterCustomerList;

    public List<MCenterCustomerDto> getMCenterCustomerList() {
        if (_mCenterCustomerList == null) { _mCenterCustomerList = new ArrayList<MCenterCustomerDto>(); }
        return _mCenterCustomerList;
    }

    public void setMCenterCustomerList(List<MCenterCustomerDto> mCenterCustomerList) {
        this._mCenterCustomerList = mCenterCustomerList;
    }

    protected List<MCenterItemDto> _mCenterItemList;

    public List<MCenterItemDto> getMCenterItemList() {
        if (_mCenterItemList == null) { _mCenterItemList = new ArrayList<MCenterItemDto>(); }
        return _mCenterItemList;
    }

    public void setMCenterItemList(List<MCenterItemDto> mCenterItemList) {
        this._mCenterItemList = mCenterItemList;
    }

    protected List<MCenterScreenDto> _mCenterScreenList;

    public List<MCenterScreenDto> getMCenterScreenList() {
        if (_mCenterScreenList == null) { _mCenterScreenList = new ArrayList<MCenterScreenDto>(); }
        return _mCenterScreenList;
    }

    public void setMCenterScreenList(List<MCenterScreenDto> mCenterScreenList) {
        this._mCenterScreenList = mCenterScreenList;
    }

    protected List<MClientCenterDto> _mClientCenterList;

    public List<MClientCenterDto> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = new ArrayList<MClientCenterDto>(); }
        return _mClientCenterList;
    }

    public void setMClientCenterList(List<MClientCenterDto> mClientCenterList) {
        this._mClientCenterList = mClientCenterList;
    }

    protected List<MCustomerPickingDto> _mCustomerPickingList;

    public List<MCustomerPickingDto> getMCustomerPickingList() {
        if (_mCustomerPickingList == null) { _mCustomerPickingList = new ArrayList<MCustomerPickingDto>(); }
        return _mCustomerPickingList;
    }

    public void setMCustomerPickingList(List<MCustomerPickingDto> mCustomerPickingList) {
        this._mCustomerPickingList = mCustomerPickingList;
    }

    protected List<MDeliveryCourseDto> _mDeliveryCourseList;

    public List<MDeliveryCourseDto> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = new ArrayList<MDeliveryCourseDto>(); }
        return _mDeliveryCourseList;
    }

    public void setMDeliveryCourseList(List<MDeliveryCourseDto> mDeliveryCourseList) {
        this._mDeliveryCourseList = mDeliveryCourseList;
    }

    protected List<MGeneralDto> _mGeneralList;

    public List<MGeneralDto> getMGeneralList() {
        if (_mGeneralList == null) { _mGeneralList = new ArrayList<MGeneralDto>(); }
        return _mGeneralList;
    }

    public void setMGeneralList(List<MGeneralDto> mGeneralList) {
        this._mGeneralList = mGeneralList;
    }

    protected List<MLocationDto> _mLocationList;

    public List<MLocationDto> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = new ArrayList<MLocationDto>(); }
        return _mLocationList;
    }

    public void setMLocationList(List<MLocationDto> mLocationList) {
        this._mLocationList = mLocationList;
    }

    protected List<MNizoroeDto> _mNizoroeList;

    public List<MNizoroeDto> getMNizoroeList() {
        if (_mNizoroeList == null) { _mNizoroeList = new ArrayList<MNizoroeDto>(); }
        return _mNizoroeList;
    }

    public void setMNizoroeList(List<MNizoroeDto> mNizoroeList) {
        this._mNizoroeList = mNizoroeList;
    }

    protected List<MNumberingCenterDto> _mNumberingCenterList;

    public List<MNumberingCenterDto> getMNumberingCenterList() {
        if (_mNumberingCenterList == null) { _mNumberingCenterList = new ArrayList<MNumberingCenterDto>(); }
        return _mNumberingCenterList;
    }

    public void setMNumberingCenterList(List<MNumberingCenterDto> mNumberingCenterList) {
        this._mNumberingCenterList = mNumberingCenterList;
    }

    protected List<MUserCenterDto> _mUserCenterList;

    public List<MUserCenterDto> getMUserCenterList() {
        if (_mUserCenterList == null) { _mUserCenterList = new ArrayList<MUserCenterDto>(); }
        return _mUserCenterList;
    }

    public void setMUserCenterList(List<MUserCenterDto> mUserCenterList) {
        this._mUserCenterList = mUserCenterList;
    }

    protected List<MUserLoginDto> _mUserLoginList;

    public List<MUserLoginDto> getMUserLoginList() {
        if (_mUserLoginList == null) { _mUserLoginList = new ArrayList<MUserLoginDto>(); }
        return _mUserLoginList;
    }

    public void setMUserLoginList(List<MUserLoginDto> mUserLoginList) {
        this._mUserLoginList = mUserLoginList;
    }

    protected List<MWarehouseDto> _mWarehouseList;

    public List<MWarehouseDto> getMWarehouseList() {
        if (_mWarehouseList == null) { _mWarehouseList = new ArrayList<MWarehouseDto>(); }
        return _mWarehouseList;
    }

    public void setMWarehouseList(List<MWarehouseDto> mWarehouseList) {
        this._mWarehouseList = mWarehouseList;
    }

    protected List<MWebHtInfoDto> _mWebHtInfoList;

    public List<MWebHtInfoDto> getMWebHtInfoList() {
        if (_mWebHtInfoList == null) { _mWebHtInfoList = new ArrayList<MWebHtInfoDto>(); }
        return _mWebHtInfoList;
    }

    public void setMWebHtInfoList(List<MWebHtInfoDto> mWebHtInfoList) {
        this._mWebHtInfoList = mWebHtInfoList;
    }

    protected List<TAllocInstHDto> _tAllocInstHList;

    public List<TAllocInstHDto> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = new ArrayList<TAllocInstHDto>(); }
        return _tAllocInstHList;
    }

    public void setTAllocInstHList(List<TAllocInstHDto> tAllocInstHList) {
        this._tAllocInstHList = tAllocInstHList;
    }

    protected List<TEcOrderHDto> _tEcOrderHList;

    public List<TEcOrderHDto> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = new ArrayList<TEcOrderHDto>(); }
        return _tEcOrderHList;
    }

    public void setTEcOrderHList(List<TEcOrderHDto> tEcOrderHList) {
        this._tEcOrderHList = tEcOrderHList;
    }

    protected List<TInventoryHDto> _tInventoryHList;

    public List<TInventoryHDto> getTInventoryHList() {
        if (_tInventoryHList == null) { _tInventoryHList = new ArrayList<TInventoryHDto>(); }
        return _tInventoryHList;
    }

    public void setTInventoryHList(List<TInventoryHDto> tInventoryHList) {
        this._tInventoryHList = tInventoryHList;
    }

    protected List<TMoveInstHDto> _tMoveInstHList;

    public List<TMoveInstHDto> getTMoveInstHList() {
        if (_tMoveInstHList == null) { _tMoveInstHList = new ArrayList<TMoveInstHDto>(); }
        return _tMoveInstHList;
    }

    public void setTMoveInstHList(List<TMoveInstHDto> tMoveInstHList) {
        this._tMoveInstHList = tMoveInstHList;
    }

    protected List<TPackingHDto> _tPackingHList;

    public List<TPackingHDto> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = new ArrayList<TPackingHDto>(); }
        return _tPackingHList;
    }

    public void setTPackingHList(List<TPackingHDto> tPackingHList) {
        this._tPackingHList = tPackingHList;
    }

    protected List<TPicMthdRcmdDto> _tPicMthdRcmdList;

    public List<TPicMthdRcmdDto> getTPicMthdRcmdList() {
        if (_tPicMthdRcmdList == null) { _tPicMthdRcmdList = new ArrayList<TPicMthdRcmdDto>(); }
        return _tPicMthdRcmdList;
    }

    public void setTPicMthdRcmdList(List<TPicMthdRcmdDto> tPicMthdRcmdList) {
        this._tPicMthdRcmdList = tPicMthdRcmdList;
    }

    protected List<TPickingHDto> _tPickingHList;

    public List<TPickingHDto> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = new ArrayList<TPickingHDto>(); }
        return _tPickingHList;
    }

    public void setTPickingHList(List<TPickingHDto> tPickingHList) {
        this._tPickingHList = tPickingHList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHList;

    public List<TReceivePlanHDto> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHList;
    }

    public void setTReceivePlanHList(List<TReceivePlanHDto> tReceivePlanHList) {
        this._tReceivePlanHList = tReceivePlanHList;
    }

    protected List<TSerialNoDto> _tSerialNoList;

    public List<TSerialNoDto> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = new ArrayList<TSerialNoDto>(); }
        return _tSerialNoList;
    }

    public void setTSerialNoList(List<TSerialNoDto> tSerialNoList) {
        this._tSerialNoList = tSerialNoList;
    }

    protected List<TShippingInstHDto> _tShippingInstHList;

    public List<TShippingInstHDto> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = new ArrayList<TShippingInstHDto>(); }
        return _tShippingInstHList;
    }

    public void setTShippingInstHList(List<TShippingInstHDto> tShippingInstHList) {
        this._tShippingInstHList = tShippingInstHList;
    }

    protected List<TStoreRecordHDto> _tStoreRecordHList;

    public List<TStoreRecordHDto> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHList;
    }

    public void setTStoreRecordHList(List<TStoreRecordHDto> tStoreRecordHList) {
        this._tStoreRecordHList = tStoreRecordHList;
    }

    protected List<WHtInventoryInputProdDto> _wHtInventoryInputProdList;

    public List<WHtInventoryInputProdDto> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = new ArrayList<WHtInventoryInputProdDto>(); }
        return _wHtInventoryInputProdList;
    }

    public void setWHtInventoryInputProdList(List<WHtInventoryInputProdDto> wHtInventoryInputProdList) {
        this._wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    protected List<WHtLoadingDto> _wHtLoadingList;

    public List<WHtLoadingDto> getWHtLoadingList() {
        if (_wHtLoadingList == null) { _wHtLoadingList = new ArrayList<WHtLoadingDto>(); }
        return _wHtLoadingList;
    }

    public void setWHtLoadingList(List<WHtLoadingDto> wHtLoadingList) {
        this._wHtLoadingList = wHtLoadingList;
    }

    protected List<WHtPickingDto> _wHtPickingList;

    public List<WHtPickingDto> getWHtPickingList() {
        if (_wHtPickingList == null) { _wHtPickingList = new ArrayList<WHtPickingDto>(); }
        return _wHtPickingList;
    }

    public void setWHtPickingList(List<WHtPickingDto> wHtPickingList) {
        this._wHtPickingList = wHtPickingList;
    }

    protected List<WHtReceiveInspectionDto> _wHtReceiveInspectionList;

    public List<WHtReceiveInspectionDto> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = new ArrayList<WHtReceiveInspectionDto>(); }
        return _wHtReceiveInspectionList;
    }

    public void setWHtReceiveInspectionList(List<WHtReceiveInspectionDto> wHtReceiveInspectionList) {
        this._wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    protected List<WHtReceiveNoPlanInspDto> _wHtReceiveNoPlanInspList;

    public List<WHtReceiveNoPlanInspDto> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = new ArrayList<WHtReceiveNoPlanInspDto>(); }
        return _wHtReceiveNoPlanInspList;
    }

    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInspDto> wHtReceiveNoPlanInspList) {
        this._wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    protected List<WHtReceiveStoreDto> _wHtReceiveStoreList;

    public List<WHtReceiveStoreDto> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = new ArrayList<WHtReceiveStoreDto>(); }
        return _wHtReceiveStoreList;
    }

    public void setWHtReceiveStoreList(List<WHtReceiveStoreDto> wHtReceiveStoreList) {
        this._wHtReceiveStoreList = wHtReceiveStoreList;
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

    protected List<WHtShippingDto> _wHtShippingList;

    public List<WHtShippingDto> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = new ArrayList<WHtShippingDto>(); }
        return _wHtShippingList;
    }

    public void setWHtShippingList(List<WHtShippingDto> wHtShippingList) {
        this._wHtShippingList = wHtShippingList;
    }

    protected List<WHtShippingPickingDto> _wHtShippingPickingList;

    public List<WHtShippingPickingDto> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = new ArrayList<WHtShippingPickingDto>(); }
        return _wHtShippingPickingList;
    }

    public void setWHtShippingPickingList(List<WHtShippingPickingDto> wHtShippingPickingList) {
        this._wHtShippingPickingList = wHtShippingPickingList;
    }

    protected List<WHtTotalPickingDto> _wHtTotalPickingList;

    public List<WHtTotalPickingDto> getWHtTotalPickingList() {
        if (_wHtTotalPickingList == null) { _wHtTotalPickingList = new ArrayList<WHtTotalPickingDto>(); }
        return _wHtTotalPickingList;
    }

    public void setWHtTotalPickingList(List<WHtTotalPickingDto> wHtTotalPickingList) {
        this._wHtTotalPickingList = wHtTotalPickingList;
    }

    protected List<WSglRowShipInspHDto> _wSglRowShipInspHList;

    public List<WSglRowShipInspHDto> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = new ArrayList<WSglRowShipInspHDto>(); }
        return _wSglRowShipInspHList;
    }

    public void setWSglRowShipInspHList(List<WSglRowShipInspHDto> wSglRowShipInspHList) {
        this._wSglRowShipInspHList = wSglRowShipInspHList;
    }

    protected List<WShippingInterruptDto> _wShippingInterruptList;

    public List<WShippingInterruptDto> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = new ArrayList<WShippingInterruptDto>(); }
        return _wShippingInterruptList;
    }

    public void setWShippingInterruptList(List<WShippingInterruptDto> wShippingInterruptList) {
        this._wShippingInterruptList = wShippingInterruptList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCenterDto)) { return false; }
        final BsMCenterDto otherEntity = (BsMCenterDto)other;
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_center");
        result = xCH(result, getCenterId());
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
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getCultureId());
        sb.append(c).append(getTimeZoneId());
        sb.append(c).append(getAddress());
        sb.append(c).append(getTelNo());
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
     * [get] CENTER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {NotNull, VARCHAR(60)} <br>
     * センタ名称
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {NotNull, VARCHAR(60)} <br>
     * センタ名称
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] CENTER_ABBR: {VARCHAR(60)} <br>
     * センタ略称
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public String getCenterAbbr() {
        return _centerAbbr;
    }

    /**
     * [set] CENTER_ABBR: {VARCHAR(60)} <br>
     * センタ略称
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public void setCenterAbbr(String centerAbbr) {
        __modifiedProperties.add("centerAbbr");
        this._centerAbbr = centerAbbr;
    }

    /**
     * [get] CULTURE_ID: {IX, BIGINT(19), FK to b_culture} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {IX, BIGINT(19), FK to b_culture} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        __modifiedProperties.add("cultureId");
        this._cultureId = cultureId;
    }

    /**
     * [get] TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone} <br>
     * タイムゾーンID
     * @return The value of the column 'TIME_ZONE_ID'. (NullAllowed)
     */
    public Long getTimeZoneId() {
        return _timeZoneId;
    }

    /**
     * [set] TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone} <br>
     * タイムゾーンID
     * @param timeZoneId The value of the column 'TIME_ZONE_ID'. (NullAllowed)
     */
    public void setTimeZoneId(Long timeZoneId) {
        __modifiedProperties.add("timeZoneId");
        this._timeZoneId = timeZoneId;
    }

    /**
     * [get] ADDRESS: {VARCHAR(255)} <br>
     * 住所
     * @return The value of the column 'ADDRESS'. (NullAllowed)
     */
    public String getAddress() {
        return _address;
    }

    /**
     * [set] ADDRESS: {VARCHAR(255)} <br>
     * 住所
     * @param address The value of the column 'ADDRESS'. (NullAllowed)
     */
    public void setAddress(String address) {
        __modifiedProperties.add("address");
        this._address = address;
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
