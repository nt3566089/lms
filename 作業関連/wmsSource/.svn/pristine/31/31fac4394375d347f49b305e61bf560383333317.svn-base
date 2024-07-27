package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_client as TABLE. <br>
 * 荷主マスタ
 * <pre>
 * [primary-key]
 *     CLIENT_ID
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CLIENT_ABBR, CUSTOMER_ID, SHAPE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_shape_grp, m_customer, b_class_dtl(ByDelFlg)
 *
 * [referrer-table]
 *     m_client_center, m_client_col, m_client_item, m_client_screen, m_customer, m_import_type, m_product, m_shape_grp, m_user_client, m_user_login, m_web_ht_info, t_alloc_inst_h, t_ec_order_h, t_inventory_h, t_move_inst_h, t_packing_h, t_packing_list, t_pic_mthd_rcmd, t_picking_h, t_receive_plan_h, t_serial_no, t_shipping_inst_h, t_shipping_record_h, t_stock, t_stock_record, t_store_record_h, t_transfer, w_ht_inventory_input_prod, w_ht_loading, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt
 *
 * [foreign-property]
 *     mShapeGrp, mCustomer, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mClientCenterList, mClientColList, mClientItemList, mClientScreenList, mCustomerList, mImportTypeList, mProductList, mShapeGrpList, mUserClientList, mUserLoginList, mWebHtInfoList, tAllocInstHList, tEcOrderHList, tInventoryHList, tMoveInstHList, tPackingHList, tPackingListList, tPicMthdRcmdList, tPickingHList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tShippingRecordHList, tStockList, tStockRecordList, tStoreRecordHList, tTransferList, wHtInventoryInputProdList, wHtLoadingList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMClientDto implements Serializable {

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
    /** CLIENT_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_CD: {UQ, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {NotNull, VARCHAR(60)} */
    @JsonKey
    protected String _clientNm;

    /** CLIENT_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _clientAbbr;

    /** CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _customerId;

    /** SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} */
    @JsonKey
    protected Long _shapeGrpId;

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
    public BsMClientDto() {
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
    protected MShapeGrpDto _mShapeGrp;

    public MShapeGrpDto getMShapeGrp() {
        return _mShapeGrp;
    }

    public void setMShapeGrp(MShapeGrpDto mShapeGrp) {
        this._mShapeGrp = mShapeGrp;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
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
    protected List<MClientCenterDto> _mClientCenterList;

    public List<MClientCenterDto> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = new ArrayList<MClientCenterDto>(); }
        return _mClientCenterList;
    }

    public void setMClientCenterList(List<MClientCenterDto> mClientCenterList) {
        this._mClientCenterList = mClientCenterList;
    }

    protected List<MClientColDto> _mClientColList;

    public List<MClientColDto> getMClientColList() {
        if (_mClientColList == null) { _mClientColList = new ArrayList<MClientColDto>(); }
        return _mClientColList;
    }

    public void setMClientColList(List<MClientColDto> mClientColList) {
        this._mClientColList = mClientColList;
    }

    protected List<MClientItemDto> _mClientItemList;

    public List<MClientItemDto> getMClientItemList() {
        if (_mClientItemList == null) { _mClientItemList = new ArrayList<MClientItemDto>(); }
        return _mClientItemList;
    }

    public void setMClientItemList(List<MClientItemDto> mClientItemList) {
        this._mClientItemList = mClientItemList;
    }

    protected List<MClientScreenDto> _mClientScreenList;

    public List<MClientScreenDto> getMClientScreenList() {
        if (_mClientScreenList == null) { _mClientScreenList = new ArrayList<MClientScreenDto>(); }
        return _mClientScreenList;
    }

    public void setMClientScreenList(List<MClientScreenDto> mClientScreenList) {
        this._mClientScreenList = mClientScreenList;
    }

    protected List<MCustomerDto> _mCustomerList;

    public List<MCustomerDto> getMCustomerList() {
        if (_mCustomerList == null) { _mCustomerList = new ArrayList<MCustomerDto>(); }
        return _mCustomerList;
    }

    public void setMCustomerList(List<MCustomerDto> mCustomerList) {
        this._mCustomerList = mCustomerList;
    }

    protected List<MImportTypeDto> _mImportTypeList;

    public List<MImportTypeDto> getMImportTypeList() {
        if (_mImportTypeList == null) { _mImportTypeList = new ArrayList<MImportTypeDto>(); }
        return _mImportTypeList;
    }

    public void setMImportTypeList(List<MImportTypeDto> mImportTypeList) {
        this._mImportTypeList = mImportTypeList;
    }

    protected List<MProductDto> _mProductList;

    public List<MProductDto> getMProductList() {
        if (_mProductList == null) { _mProductList = new ArrayList<MProductDto>(); }
        return _mProductList;
    }

    public void setMProductList(List<MProductDto> mProductList) {
        this._mProductList = mProductList;
    }

    protected List<MShapeGrpDto> _mShapeGrpList;

    public List<MShapeGrpDto> getMShapeGrpList() {
        if (_mShapeGrpList == null) { _mShapeGrpList = new ArrayList<MShapeGrpDto>(); }
        return _mShapeGrpList;
    }

    public void setMShapeGrpList(List<MShapeGrpDto> mShapeGrpList) {
        this._mShapeGrpList = mShapeGrpList;
    }

    protected List<MUserClientDto> _mUserClientList;

    public List<MUserClientDto> getMUserClientList() {
        if (_mUserClientList == null) { _mUserClientList = new ArrayList<MUserClientDto>(); }
        return _mUserClientList;
    }

    public void setMUserClientList(List<MUserClientDto> mUserClientList) {
        this._mUserClientList = mUserClientList;
    }

    protected List<MUserLoginDto> _mUserLoginList;

    public List<MUserLoginDto> getMUserLoginList() {
        if (_mUserLoginList == null) { _mUserLoginList = new ArrayList<MUserLoginDto>(); }
        return _mUserLoginList;
    }

    public void setMUserLoginList(List<MUserLoginDto> mUserLoginList) {
        this._mUserLoginList = mUserLoginList;
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

    protected List<TPackingListDto> _tPackingListList;

    public List<TPackingListDto> getTPackingListList() {
        if (_tPackingListList == null) { _tPackingListList = new ArrayList<TPackingListDto>(); }
        return _tPackingListList;
    }

    public void setTPackingListList(List<TPackingListDto> tPackingListList) {
        this._tPackingListList = tPackingListList;
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

    protected List<TShippingRecordHDto> _tShippingRecordHList;

    public List<TShippingRecordHDto> getTShippingRecordHList() {
        if (_tShippingRecordHList == null) { _tShippingRecordHList = new ArrayList<TShippingRecordHDto>(); }
        return _tShippingRecordHList;
    }

    public void setTShippingRecordHList(List<TShippingRecordHDto> tShippingRecordHList) {
        this._tShippingRecordHList = tShippingRecordHList;
    }

    protected List<TStockDto> _tStockList;

    public List<TStockDto> getTStockList() {
        if (_tStockList == null) { _tStockList = new ArrayList<TStockDto>(); }
        return _tStockList;
    }

    public void setTStockList(List<TStockDto> tStockList) {
        this._tStockList = tStockList;
    }

    protected List<TStockRecordDto> _tStockRecordList;

    public List<TStockRecordDto> getTStockRecordList() {
        if (_tStockRecordList == null) { _tStockRecordList = new ArrayList<TStockRecordDto>(); }
        return _tStockRecordList;
    }

    public void setTStockRecordList(List<TStockRecordDto> tStockRecordList) {
        this._tStockRecordList = tStockRecordList;
    }

    protected List<TStoreRecordHDto> _tStoreRecordHList;

    public List<TStoreRecordHDto> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHList;
    }

    public void setTStoreRecordHList(List<TStoreRecordHDto> tStoreRecordHList) {
        this._tStoreRecordHList = tStoreRecordHList;
    }

    protected List<TTransferDto> _tTransferList;

    public List<TTransferDto> getTTransferList() {
        if (_tTransferList == null) { _tTransferList = new ArrayList<TTransferDto>(); }
        return _tTransferList;
    }

    public void setTTransferList(List<TTransferDto> tTransferList) {
        this._tTransferList = tTransferList;
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
        if (other == null || !(other instanceof BsMClientDto)) { return false; }
        final BsMClientDto otherEntity = (BsMClientDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_client");
        result = xCH(result, getClientId());
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
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getClientAbbr());
        sb.append(c).append(getCustomerId());
        sb.append(c).append(getShapeGrpId());
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
     * [get] CLIENT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {NotNull, VARCHAR(60)} <br>
     * 荷主名称
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {NotNull, VARCHAR(60)} <br>
     * 荷主名称
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] CLIENT_ABBR: {VARCHAR(60)} <br>
     * 荷主略称
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed)
     */
    public String getClientAbbr() {
        return _clientAbbr;
    }

    /**
     * [set] CLIENT_ABBR: {VARCHAR(60)} <br>
     * 荷主略称
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed)
     */
    public void setClientAbbr(String clientAbbr) {
        __modifiedProperties.add("clientAbbr");
        this._clientAbbr = clientAbbr;
    }

    /**
     * [get] CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 荷主取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 荷主取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(Long customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public Long getShapeGrpId() {
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        __modifiedProperties.add("shapeGrpId");
        this._shapeGrpId = shapeGrpId;
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
