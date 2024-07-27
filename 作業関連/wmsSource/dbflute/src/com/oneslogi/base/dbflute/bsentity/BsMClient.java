package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of m_client as TABLE. <br>
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
 * [foreign table]
 *     m_shape_grp, m_customer, b_class_dtl(ByDelFlg)
 *
 * [referrer table]
 *     m_client_center, m_client_col, m_client_item, m_client_screen, m_customer, m_import_type, m_product, m_shape_grp, m_user_client, m_user_login, m_web_ht_info, t_alloc_inst_h, t_ec_order_h, t_inventory_h, t_move_inst_h, t_packing_h, t_packing_list, t_pic_mthd_rcmd, t_picking_h, t_receive_plan_h, t_serial_no, t_shipping_inst_h, t_shipping_record_h, t_stock, t_stock_record, t_store_record_h, t_transfer, w_ht_inventory_input_prod, w_ht_loading, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt
 *
 * [foreign property]
 *     mShapeGrp, mCustomer, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mClientCenterList, mClientColList, mClientItemList, mClientScreenList, mCustomerList, mImportTypeList, mProductList, mShapeGrpList, mUserClientList, mUserLoginList, mWebHtInfoList, tAllocInstHList, tEcOrderHList, tInventoryHList, tMoveInstHList, tPackingHList, tPackingListList, tPicMthdRcmdList, tPickingHList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tShippingRecordHList, tStockList, tStockRecordList, tStoreRecordHList, tTransferList, wHtInventoryInputProdList, wHtLoadingList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String clientAbbr = entity.getClientAbbr();
 * Long customerId = entity.getCustomerId();
 * Long shapeGrpId = entity.getShapeGrpId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setClientAbbr(clientAbbr);
 * entity.setCustomerId(customerId);
 * entity.setShapeGrpId(shapeGrpId);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMClient extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {UQ, NotNull, VARCHAR(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {NotNull, VARCHAR(60)} */
    protected String _clientNm;

    /** CLIENT_ABBR: {VARCHAR(60)} */
    protected String _clientAbbr;

    /** CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _customerId;

    /** SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} */
    protected Long _shapeGrpId;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "m_client";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_clientId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientCd : UQ, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(String clientCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientCd");
        setClientCd(clientCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'. */
    protected MShapeGrp _mShapeGrp;

    /**
     * [get] m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'. <br>
     * @return The entity of foreign property 'MShapeGrp'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShapeGrp getMShapeGrp() {
        return _mShapeGrp;
    }

    /**
     * [set] m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param mShapeGrp The entity of foreign property 'MShapeGrp'. (NullAllowed)
     */
    public void setMShapeGrp(MShapeGrp mShapeGrp) {
        _mShapeGrp = mShapeGrp;
    }

    /** m_customer by my CUSTOMER_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] m_customer by my CUSTOMER_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** m_client_center by CLIENT_ID, named 'MClientCenterList'. */
    protected List<MClientCenter> _mClientCenterList;

    /**
     * [get] m_client_center by CLIENT_ID, named 'MClientCenterList'.
     * @return The entity list of referrer property 'MClientCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCenter> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = newReferrerList(); }
        return _mClientCenterList;
    }

    /**
     * [set] m_client_center by CLIENT_ID, named 'MClientCenterList'.
     * @param mClientCenterList The entity list of referrer property 'MClientCenterList'. (NullAllowed)
     */
    public void setMClientCenterList(List<MClientCenter> mClientCenterList) {
        _mClientCenterList = mClientCenterList;
    }

    /** m_client_col by CLIENT_ID, named 'MClientColList'. */
    protected List<MClientCol> _mClientColList;

    /**
     * [get] m_client_col by CLIENT_ID, named 'MClientColList'.
     * @return The entity list of referrer property 'MClientColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCol> getMClientColList() {
        if (_mClientColList == null) { _mClientColList = newReferrerList(); }
        return _mClientColList;
    }

    /**
     * [set] m_client_col by CLIENT_ID, named 'MClientColList'.
     * @param mClientColList The entity list of referrer property 'MClientColList'. (NullAllowed)
     */
    public void setMClientColList(List<MClientCol> mClientColList) {
        _mClientColList = mClientColList;
    }

    /** m_client_item by CLIENT_ID, named 'MClientItemList'. */
    protected List<MClientItem> _mClientItemList;

    /**
     * [get] m_client_item by CLIENT_ID, named 'MClientItemList'.
     * @return The entity list of referrer property 'MClientItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientItem> getMClientItemList() {
        if (_mClientItemList == null) { _mClientItemList = newReferrerList(); }
        return _mClientItemList;
    }

    /**
     * [set] m_client_item by CLIENT_ID, named 'MClientItemList'.
     * @param mClientItemList The entity list of referrer property 'MClientItemList'. (NullAllowed)
     */
    public void setMClientItemList(List<MClientItem> mClientItemList) {
        _mClientItemList = mClientItemList;
    }

    /** m_client_screen by CLIENT_ID, named 'MClientScreenList'. */
    protected List<MClientScreen> _mClientScreenList;

    /**
     * [get] m_client_screen by CLIENT_ID, named 'MClientScreenList'.
     * @return The entity list of referrer property 'MClientScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientScreen> getMClientScreenList() {
        if (_mClientScreenList == null) { _mClientScreenList = newReferrerList(); }
        return _mClientScreenList;
    }

    /**
     * [set] m_client_screen by CLIENT_ID, named 'MClientScreenList'.
     * @param mClientScreenList The entity list of referrer property 'MClientScreenList'. (NullAllowed)
     */
    public void setMClientScreenList(List<MClientScreen> mClientScreenList) {
        _mClientScreenList = mClientScreenList;
    }

    /** m_customer by CLIENT_ID, named 'MCustomerList'. */
    protected List<MCustomer> _mCustomerList;

    /**
     * [get] m_customer by CLIENT_ID, named 'MCustomerList'.
     * @return The entity list of referrer property 'MCustomerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCustomer> getMCustomerList() {
        if (_mCustomerList == null) { _mCustomerList = newReferrerList(); }
        return _mCustomerList;
    }

    /**
     * [set] m_customer by CLIENT_ID, named 'MCustomerList'.
     * @param mCustomerList The entity list of referrer property 'MCustomerList'. (NullAllowed)
     */
    public void setMCustomerList(List<MCustomer> mCustomerList) {
        _mCustomerList = mCustomerList;
    }

    /** m_import_type by CLIENT_ID, named 'MImportTypeList'. */
    protected List<MImportType> _mImportTypeList;

    /**
     * [get] m_import_type by CLIENT_ID, named 'MImportTypeList'.
     * @return The entity list of referrer property 'MImportTypeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MImportType> getMImportTypeList() {
        if (_mImportTypeList == null) { _mImportTypeList = newReferrerList(); }
        return _mImportTypeList;
    }

    /**
     * [set] m_import_type by CLIENT_ID, named 'MImportTypeList'.
     * @param mImportTypeList The entity list of referrer property 'MImportTypeList'. (NullAllowed)
     */
    public void setMImportTypeList(List<MImportType> mImportTypeList) {
        _mImportTypeList = mImportTypeList;
    }

    /** m_product by CLIENT_ID, named 'MProductList'. */
    protected List<MProduct> _mProductList;

    /**
     * [get] m_product by CLIENT_ID, named 'MProductList'.
     * @return The entity list of referrer property 'MProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MProduct> getMProductList() {
        if (_mProductList == null) { _mProductList = newReferrerList(); }
        return _mProductList;
    }

    /**
     * [set] m_product by CLIENT_ID, named 'MProductList'.
     * @param mProductList The entity list of referrer property 'MProductList'. (NullAllowed)
     */
    public void setMProductList(List<MProduct> mProductList) {
        _mProductList = mProductList;
    }

    /** m_shape_grp by CLIENT_ID, named 'MShapeGrpList'. */
    protected List<MShapeGrp> _mShapeGrpList;

    /**
     * [get] m_shape_grp by CLIENT_ID, named 'MShapeGrpList'.
     * @return The entity list of referrer property 'MShapeGrpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MShapeGrp> getMShapeGrpList() {
        if (_mShapeGrpList == null) { _mShapeGrpList = newReferrerList(); }
        return _mShapeGrpList;
    }

    /**
     * [set] m_shape_grp by CLIENT_ID, named 'MShapeGrpList'.
     * @param mShapeGrpList The entity list of referrer property 'MShapeGrpList'. (NullAllowed)
     */
    public void setMShapeGrpList(List<MShapeGrp> mShapeGrpList) {
        _mShapeGrpList = mShapeGrpList;
    }

    /** m_user_client by CLIENT_ID, named 'MUserClientList'. */
    protected List<MUserClient> _mUserClientList;

    /**
     * [get] m_user_client by CLIENT_ID, named 'MUserClientList'.
     * @return The entity list of referrer property 'MUserClientList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserClient> getMUserClientList() {
        if (_mUserClientList == null) { _mUserClientList = newReferrerList(); }
        return _mUserClientList;
    }

    /**
     * [set] m_user_client by CLIENT_ID, named 'MUserClientList'.
     * @param mUserClientList The entity list of referrer property 'MUserClientList'. (NullAllowed)
     */
    public void setMUserClientList(List<MUserClient> mUserClientList) {
        _mUserClientList = mUserClientList;
    }

    /** m_user_login by CLIENT_ID, named 'MUserLoginList'. */
    protected List<MUserLogin> _mUserLoginList;

    /**
     * [get] m_user_login by CLIENT_ID, named 'MUserLoginList'.
     * @return The entity list of referrer property 'MUserLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserLogin> getMUserLoginList() {
        if (_mUserLoginList == null) { _mUserLoginList = newReferrerList(); }
        return _mUserLoginList;
    }

    /**
     * [set] m_user_login by CLIENT_ID, named 'MUserLoginList'.
     * @param mUserLoginList The entity list of referrer property 'MUserLoginList'. (NullAllowed)
     */
    public void setMUserLoginList(List<MUserLogin> mUserLoginList) {
        _mUserLoginList = mUserLoginList;
    }

    /** m_web_ht_info by CLIENT_ID, named 'MWebHtInfoList'. */
    protected List<MWebHtInfo> _mWebHtInfoList;

    /**
     * [get] m_web_ht_info by CLIENT_ID, named 'MWebHtInfoList'.
     * @return The entity list of referrer property 'MWebHtInfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWebHtInfo> getMWebHtInfoList() {
        if (_mWebHtInfoList == null) { _mWebHtInfoList = newReferrerList(); }
        return _mWebHtInfoList;
    }

    /**
     * [set] m_web_ht_info by CLIENT_ID, named 'MWebHtInfoList'.
     * @param mWebHtInfoList The entity list of referrer property 'MWebHtInfoList'. (NullAllowed)
     */
    public void setMWebHtInfoList(List<MWebHtInfo> mWebHtInfoList) {
        _mWebHtInfoList = mWebHtInfoList;
    }

    /** t_alloc_inst_h by CLIENT_ID, named 'TAllocInstHList'. */
    protected List<TAllocInstH> _tAllocInstHList;

    /**
     * [get] t_alloc_inst_h by CLIENT_ID, named 'TAllocInstHList'.
     * @return The entity list of referrer property 'TAllocInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = newReferrerList(); }
        return _tAllocInstHList;
    }

    /**
     * [set] t_alloc_inst_h by CLIENT_ID, named 'TAllocInstHList'.
     * @param tAllocInstHList The entity list of referrer property 'TAllocInstHList'. (NullAllowed)
     */
    public void setTAllocInstHList(List<TAllocInstH> tAllocInstHList) {
        _tAllocInstHList = tAllocInstHList;
    }

    /** t_ec_order_h by CLIENT_ID, named 'TEcOrderHList'. */
    protected List<TEcOrderH> _tEcOrderHList;

    /**
     * [get] t_ec_order_h by CLIENT_ID, named 'TEcOrderHList'.
     * @return The entity list of referrer property 'TEcOrderHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderH> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = newReferrerList(); }
        return _tEcOrderHList;
    }

    /**
     * [set] t_ec_order_h by CLIENT_ID, named 'TEcOrderHList'.
     * @param tEcOrderHList The entity list of referrer property 'TEcOrderHList'. (NullAllowed)
     */
    public void setTEcOrderHList(List<TEcOrderH> tEcOrderHList) {
        _tEcOrderHList = tEcOrderHList;
    }

    /** t_inventory_h by CLIENT_ID, named 'TInventoryHList'. */
    protected List<TInventoryH> _tInventoryHList;

    /**
     * [get] t_inventory_h by CLIENT_ID, named 'TInventoryHList'.
     * @return The entity list of referrer property 'TInventoryHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryH> getTInventoryHList() {
        if (_tInventoryHList == null) { _tInventoryHList = newReferrerList(); }
        return _tInventoryHList;
    }

    /**
     * [set] t_inventory_h by CLIENT_ID, named 'TInventoryHList'.
     * @param tInventoryHList The entity list of referrer property 'TInventoryHList'. (NullAllowed)
     */
    public void setTInventoryHList(List<TInventoryH> tInventoryHList) {
        _tInventoryHList = tInventoryHList;
    }

    /** t_move_inst_h by CLIENT_ID, named 'TMoveInstHList'. */
    protected List<TMoveInstH> _tMoveInstHList;

    /**
     * [get] t_move_inst_h by CLIENT_ID, named 'TMoveInstHList'.
     * @return The entity list of referrer property 'TMoveInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstH> getTMoveInstHList() {
        if (_tMoveInstHList == null) { _tMoveInstHList = newReferrerList(); }
        return _tMoveInstHList;
    }

    /**
     * [set] t_move_inst_h by CLIENT_ID, named 'TMoveInstHList'.
     * @param tMoveInstHList The entity list of referrer property 'TMoveInstHList'. (NullAllowed)
     */
    public void setTMoveInstHList(List<TMoveInstH> tMoveInstHList) {
        _tMoveInstHList = tMoveInstHList;
    }

    /** t_packing_h by CLIENT_ID, named 'TPackingHList'. */
    protected List<TPackingH> _tPackingHList;

    /**
     * [get] t_packing_h by CLIENT_ID, named 'TPackingHList'.
     * @return The entity list of referrer property 'TPackingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = newReferrerList(); }
        return _tPackingHList;
    }

    /**
     * [set] t_packing_h by CLIENT_ID, named 'TPackingHList'.
     * @param tPackingHList The entity list of referrer property 'TPackingHList'. (NullAllowed)
     */
    public void setTPackingHList(List<TPackingH> tPackingHList) {
        _tPackingHList = tPackingHList;
    }

    /** t_packing_list by CLIENT_ID, named 'TPackingListList'. */
    protected List<TPackingList> _tPackingListList;

    /**
     * [get] t_packing_list by CLIENT_ID, named 'TPackingListList'.
     * @return The entity list of referrer property 'TPackingListList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingList> getTPackingListList() {
        if (_tPackingListList == null) { _tPackingListList = newReferrerList(); }
        return _tPackingListList;
    }

    /**
     * [set] t_packing_list by CLIENT_ID, named 'TPackingListList'.
     * @param tPackingListList The entity list of referrer property 'TPackingListList'. (NullAllowed)
     */
    public void setTPackingListList(List<TPackingList> tPackingListList) {
        _tPackingListList = tPackingListList;
    }

    /** t_pic_mthd_rcmd by CLIENT_ID, named 'TPicMthdRcmdList'. */
    protected List<TPicMthdRcmd> _tPicMthdRcmdList;

    /**
     * [get] t_pic_mthd_rcmd by CLIENT_ID, named 'TPicMthdRcmdList'.
     * @return The entity list of referrer property 'TPicMthdRcmdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPicMthdRcmd> getTPicMthdRcmdList() {
        if (_tPicMthdRcmdList == null) { _tPicMthdRcmdList = newReferrerList(); }
        return _tPicMthdRcmdList;
    }

    /**
     * [set] t_pic_mthd_rcmd by CLIENT_ID, named 'TPicMthdRcmdList'.
     * @param tPicMthdRcmdList The entity list of referrer property 'TPicMthdRcmdList'. (NullAllowed)
     */
    public void setTPicMthdRcmdList(List<TPicMthdRcmd> tPicMthdRcmdList) {
        _tPicMthdRcmdList = tPicMthdRcmdList;
    }

    /** t_picking_h by CLIENT_ID, named 'TPickingHList'. */
    protected List<TPickingH> _tPickingHList;

    /**
     * [get] t_picking_h by CLIENT_ID, named 'TPickingHList'.
     * @return The entity list of referrer property 'TPickingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingH> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = newReferrerList(); }
        return _tPickingHList;
    }

    /**
     * [set] t_picking_h by CLIENT_ID, named 'TPickingHList'.
     * @param tPickingHList The entity list of referrer property 'TPickingHList'. (NullAllowed)
     */
    public void setTPickingHList(List<TPickingH> tPickingHList) {
        _tPickingHList = tPickingHList;
    }

    /** t_receive_plan_h by CLIENT_ID, named 'TReceivePlanHList'. */
    protected List<TReceivePlanH> _tReceivePlanHList;

    /**
     * [get] t_receive_plan_h by CLIENT_ID, named 'TReceivePlanHList'.
     * @return The entity list of referrer property 'TReceivePlanHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = newReferrerList(); }
        return _tReceivePlanHList;
    }

    /**
     * [set] t_receive_plan_h by CLIENT_ID, named 'TReceivePlanHList'.
     * @param tReceivePlanHList The entity list of referrer property 'TReceivePlanHList'. (NullAllowed)
     */
    public void setTReceivePlanHList(List<TReceivePlanH> tReceivePlanHList) {
        _tReceivePlanHList = tReceivePlanHList;
    }

    /** t_serial_no by CLIENT_ID, named 'TSerialNoList'. */
    protected List<TSerialNo> _tSerialNoList;

    /**
     * [get] t_serial_no by CLIENT_ID, named 'TSerialNoList'.
     * @return The entity list of referrer property 'TSerialNoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TSerialNo> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = newReferrerList(); }
        return _tSerialNoList;
    }

    /**
     * [set] t_serial_no by CLIENT_ID, named 'TSerialNoList'.
     * @param tSerialNoList The entity list of referrer property 'TSerialNoList'. (NullAllowed)
     */
    public void setTSerialNoList(List<TSerialNo> tSerialNoList) {
        _tSerialNoList = tSerialNoList;
    }

    /** t_shipping_inst_h by CLIENT_ID, named 'TShippingInstHList'. */
    protected List<TShippingInstH> _tShippingInstHList;

    /**
     * [get] t_shipping_inst_h by CLIENT_ID, named 'TShippingInstHList'.
     * @return The entity list of referrer property 'TShippingInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = newReferrerList(); }
        return _tShippingInstHList;
    }

    /**
     * [set] t_shipping_inst_h by CLIENT_ID, named 'TShippingInstHList'.
     * @param tShippingInstHList The entity list of referrer property 'TShippingInstHList'. (NullAllowed)
     */
    public void setTShippingInstHList(List<TShippingInstH> tShippingInstHList) {
        _tShippingInstHList = tShippingInstHList;
    }

    /** t_shipping_record_h by CLIENT_ID, named 'TShippingRecordHList'. */
    protected List<TShippingRecordH> _tShippingRecordHList;

    /**
     * [get] t_shipping_record_h by CLIENT_ID, named 'TShippingRecordHList'.
     * @return The entity list of referrer property 'TShippingRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingRecordH> getTShippingRecordHList() {
        if (_tShippingRecordHList == null) { _tShippingRecordHList = newReferrerList(); }
        return _tShippingRecordHList;
    }

    /**
     * [set] t_shipping_record_h by CLIENT_ID, named 'TShippingRecordHList'.
     * @param tShippingRecordHList The entity list of referrer property 'TShippingRecordHList'. (NullAllowed)
     */
    public void setTShippingRecordHList(List<TShippingRecordH> tShippingRecordHList) {
        _tShippingRecordHList = tShippingRecordHList;
    }

    /** t_stock by CLIENT_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] t_stock by CLIENT_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] t_stock by CLIENT_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    /** t_stock_record by CLIENT_ID, named 'TStockRecordList'. */
    protected List<TStockRecord> _tStockRecordList;

    /**
     * [get] t_stock_record by CLIENT_ID, named 'TStockRecordList'.
     * @return The entity list of referrer property 'TStockRecordList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStockRecord> getTStockRecordList() {
        if (_tStockRecordList == null) { _tStockRecordList = newReferrerList(); }
        return _tStockRecordList;
    }

    /**
     * [set] t_stock_record by CLIENT_ID, named 'TStockRecordList'.
     * @param tStockRecordList The entity list of referrer property 'TStockRecordList'. (NullAllowed)
     */
    public void setTStockRecordList(List<TStockRecord> tStockRecordList) {
        _tStockRecordList = tStockRecordList;
    }

    /** t_store_record_h by CLIENT_ID, named 'TStoreRecordHList'. */
    protected List<TStoreRecordH> _tStoreRecordHList;

    /**
     * [get] t_store_record_h by CLIENT_ID, named 'TStoreRecordHList'.
     * @return The entity list of referrer property 'TStoreRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = newReferrerList(); }
        return _tStoreRecordHList;
    }

    /**
     * [set] t_store_record_h by CLIENT_ID, named 'TStoreRecordHList'.
     * @param tStoreRecordHList The entity list of referrer property 'TStoreRecordHList'. (NullAllowed)
     */
    public void setTStoreRecordHList(List<TStoreRecordH> tStoreRecordHList) {
        _tStoreRecordHList = tStoreRecordHList;
    }

    /** t_transfer by CLIENT_ID, named 'TTransferList'. */
    protected List<TTransfer> _tTransferList;

    /**
     * [get] t_transfer by CLIENT_ID, named 'TTransferList'.
     * @return The entity list of referrer property 'TTransferList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTransfer> getTTransferList() {
        if (_tTransferList == null) { _tTransferList = newReferrerList(); }
        return _tTransferList;
    }

    /**
     * [set] t_transfer by CLIENT_ID, named 'TTransferList'.
     * @param tTransferList The entity list of referrer property 'TTransferList'. (NullAllowed)
     */
    public void setTTransferList(List<TTransfer> tTransferList) {
        _tTransferList = tTransferList;
    }

    /** w_ht_inventory_input_prod by CLIENT_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] w_ht_inventory_input_prod by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] w_ht_inventory_input_prod by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** w_ht_loading by CLIENT_ID, named 'WHtLoadingList'. */
    protected List<WHtLoading> _wHtLoadingList;

    /**
     * [get] w_ht_loading by CLIENT_ID, named 'WHtLoadingList'.
     * @return The entity list of referrer property 'WHtLoadingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtLoading> getWHtLoadingList() {
        if (_wHtLoadingList == null) { _wHtLoadingList = newReferrerList(); }
        return _wHtLoadingList;
    }

    /**
     * [set] w_ht_loading by CLIENT_ID, named 'WHtLoadingList'.
     * @param wHtLoadingList The entity list of referrer property 'WHtLoadingList'. (NullAllowed)
     */
    public void setWHtLoadingList(List<WHtLoading> wHtLoadingList) {
        _wHtLoadingList = wHtLoadingList;
    }

    /** w_ht_picking by CLIENT_ID, named 'WHtPickingList'. */
    protected List<WHtPicking> _wHtPickingList;

    /**
     * [get] w_ht_picking by CLIENT_ID, named 'WHtPickingList'.
     * @return The entity list of referrer property 'WHtPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtPicking> getWHtPickingList() {
        if (_wHtPickingList == null) { _wHtPickingList = newReferrerList(); }
        return _wHtPickingList;
    }

    /**
     * [set] w_ht_picking by CLIENT_ID, named 'WHtPickingList'.
     * @param wHtPickingList The entity list of referrer property 'WHtPickingList'. (NullAllowed)
     */
    public void setWHtPickingList(List<WHtPicking> wHtPickingList) {
        _wHtPickingList = wHtPickingList;
    }

    /** w_ht_receive_inspection by CLIENT_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] w_ht_receive_inspection by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] w_ht_receive_inspection by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** w_ht_receive_no_plan_insp by CLIENT_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] w_ht_receive_no_plan_insp by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** w_ht_receive_store by CLIENT_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] w_ht_receive_store by CLIENT_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] w_ht_receive_store by CLIENT_ID, named 'WHtReceiveStoreList'.
     * @param wHtReceiveStoreList The entity list of referrer property 'WHtReceiveStoreList'. (NullAllowed)
     */
    public void setWHtReceiveStoreList(List<WHtReceiveStore> wHtReceiveStoreList) {
        _wHtReceiveStoreList = wHtReceiveStoreList;
    }

    /** w_ht_serial_receive_insp by CLIENT_ID, named 'WHtSerialReceiveInspList'. */
    protected List<WHtSerialReceiveInsp> _wHtSerialReceiveInspList;

    /**
     * [get] w_ht_serial_receive_insp by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * @return The entity list of referrer property 'WHtSerialReceiveInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialReceiveInsp> getWHtSerialReceiveInspList() {
        if (_wHtSerialReceiveInspList == null) { _wHtSerialReceiveInspList = newReferrerList(); }
        return _wHtSerialReceiveInspList;
    }

    /**
     * [set] w_ht_serial_receive_insp by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * @param wHtSerialReceiveInspList The entity list of referrer property 'WHtSerialReceiveInspList'. (NullAllowed)
     */
    public void setWHtSerialReceiveInspList(List<WHtSerialReceiveInsp> wHtSerialReceiveInspList) {
        _wHtSerialReceiveInspList = wHtSerialReceiveInspList;
    }

    /** w_ht_serial_shipping_insp by CLIENT_ID, named 'WHtSerialShippingInspList'. */
    protected List<WHtSerialShippingInsp> _wHtSerialShippingInspList;

    /**
     * [get] w_ht_serial_shipping_insp by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * @return The entity list of referrer property 'WHtSerialShippingInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialShippingInsp> getWHtSerialShippingInspList() {
        if (_wHtSerialShippingInspList == null) { _wHtSerialShippingInspList = newReferrerList(); }
        return _wHtSerialShippingInspList;
    }

    /**
     * [set] w_ht_serial_shipping_insp by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * @param wHtSerialShippingInspList The entity list of referrer property 'WHtSerialShippingInspList'. (NullAllowed)
     */
    public void setWHtSerialShippingInspList(List<WHtSerialShippingInsp> wHtSerialShippingInspList) {
        _wHtSerialShippingInspList = wHtSerialShippingInspList;
    }

    /** w_ht_shipping by CLIENT_ID, named 'WHtShippingList'. */
    protected List<WHtShipping> _wHtShippingList;

    /**
     * [get] w_ht_shipping by CLIENT_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShipping> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = newReferrerList(); }
        return _wHtShippingList;
    }

    /**
     * [set] w_ht_shipping by CLIENT_ID, named 'WHtShippingList'.
     * @param wHtShippingList The entity list of referrer property 'WHtShippingList'. (NullAllowed)
     */
    public void setWHtShippingList(List<WHtShipping> wHtShippingList) {
        _wHtShippingList = wHtShippingList;
    }

    /** w_ht_shipping_picking by CLIENT_ID, named 'WHtShippingPickingList'. */
    protected List<WHtShippingPicking> _wHtShippingPickingList;

    /**
     * [get] w_ht_shipping_picking by CLIENT_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = newReferrerList(); }
        return _wHtShippingPickingList;
    }

    /**
     * [set] w_ht_shipping_picking by CLIENT_ID, named 'WHtShippingPickingList'.
     * @param wHtShippingPickingList The entity list of referrer property 'WHtShippingPickingList'. (NullAllowed)
     */
    public void setWHtShippingPickingList(List<WHtShippingPicking> wHtShippingPickingList) {
        _wHtShippingPickingList = wHtShippingPickingList;
    }

    /** w_ht_total_picking by CLIENT_ID, named 'WHtTotalPickingList'. */
    protected List<WHtTotalPicking> _wHtTotalPickingList;

    /**
     * [get] w_ht_total_picking by CLIENT_ID, named 'WHtTotalPickingList'.
     * @return The entity list of referrer property 'WHtTotalPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtTotalPicking> getWHtTotalPickingList() {
        if (_wHtTotalPickingList == null) { _wHtTotalPickingList = newReferrerList(); }
        return _wHtTotalPickingList;
    }

    /**
     * [set] w_ht_total_picking by CLIENT_ID, named 'WHtTotalPickingList'.
     * @param wHtTotalPickingList The entity list of referrer property 'WHtTotalPickingList'. (NullAllowed)
     */
    public void setWHtTotalPickingList(List<WHtTotalPicking> wHtTotalPickingList) {
        _wHtTotalPickingList = wHtTotalPickingList;
    }

    /** w_sgl_row_ship_insp_h by CLIENT_ID, named 'WSglRowShipInspHList'. */
    protected List<WSglRowShipInspH> _wSglRowShipInspHList;

    /**
     * [get] w_sgl_row_ship_insp_h by CLIENT_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = newReferrerList(); }
        return _wSglRowShipInspHList;
    }

    /**
     * [set] w_sgl_row_ship_insp_h by CLIENT_ID, named 'WSglRowShipInspHList'.
     * @param wSglRowShipInspHList The entity list of referrer property 'WSglRowShipInspHList'. (NullAllowed)
     */
    public void setWSglRowShipInspHList(List<WSglRowShipInspH> wSglRowShipInspHList) {
        _wSglRowShipInspHList = wSglRowShipInspHList;
    }

    /** w_shipping_interrupt by CLIENT_ID, named 'WShippingInterruptList'. */
    protected List<WShippingInterrupt> _wShippingInterruptList;

    /**
     * [get] w_shipping_interrupt by CLIENT_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = newReferrerList(); }
        return _wShippingInterruptList;
    }

    /**
     * [set] w_shipping_interrupt by CLIENT_ID, named 'WShippingInterruptList'.
     * @param wShippingInterruptList The entity list of referrer property 'WShippingInterruptList'. (NullAllowed)
     */
    public void setWShippingInterruptList(List<WShippingInterrupt> wShippingInterruptList) {
        _wShippingInterruptList = wShippingInterruptList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMClient) {
            BsMClient other = (BsMClient)obj;
            if (!xSV(_clientId, other._clientId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShapeGrp != null)
        { sb.append(li).append(xbRDS(_mShapeGrp, "mShapeGrp")); }
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mClientCenterList != null) { for (MClientCenter et : _mClientCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientCenterList")); } } }
        if (_mClientColList != null) { for (MClientCol et : _mClientColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientColList")); } } }
        if (_mClientItemList != null) { for (MClientItem et : _mClientItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientItemList")); } } }
        if (_mClientScreenList != null) { for (MClientScreen et : _mClientScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientScreenList")); } } }
        if (_mCustomerList != null) { for (MCustomer et : _mCustomerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCustomerList")); } } }
        if (_mImportTypeList != null) { for (MImportType et : _mImportTypeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mImportTypeList")); } } }
        if (_mProductList != null) { for (MProduct et : _mProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mProductList")); } } }
        if (_mShapeGrpList != null) { for (MShapeGrp et : _mShapeGrpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mShapeGrpList")); } } }
        if (_mUserClientList != null) { for (MUserClient et : _mUserClientList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserClientList")); } } }
        if (_mUserLoginList != null) { for (MUserLogin et : _mUserLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserLoginList")); } } }
        if (_mWebHtInfoList != null) { for (MWebHtInfo et : _mWebHtInfoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mWebHtInfoList")); } } }
        if (_tAllocInstHList != null) { for (TAllocInstH et : _tAllocInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstHList")); } } }
        if (_tEcOrderHList != null) { for (TEcOrderH et : _tEcOrderHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tEcOrderHList")); } } }
        if (_tInventoryHList != null) { for (TInventoryH et : _tInventoryHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryHList")); } } }
        if (_tMoveInstHList != null) { for (TMoveInstH et : _tMoveInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstHList")); } } }
        if (_tPackingHList != null) { for (TPackingH et : _tPackingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingHList")); } } }
        if (_tPackingListList != null) { for (TPackingList et : _tPackingListList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingListList")); } } }
        if (_tPicMthdRcmdList != null) { for (TPicMthdRcmd et : _tPicMthdRcmdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPicMthdRcmdList")); } } }
        if (_tPickingHList != null) { for (TPickingH et : _tPickingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingHList")); } } }
        if (_tReceivePlanHList != null) { for (TReceivePlanH et : _tReceivePlanHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHList")); } } }
        if (_tSerialNoList != null) { for (TSerialNo et : _tSerialNoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tSerialNoList")); } } }
        if (_tShippingInstHList != null) { for (TShippingInstH et : _tShippingInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHList")); } } }
        if (_tShippingRecordHList != null) { for (TShippingRecordH et : _tShippingRecordHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingRecordHList")); } } }
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
        if (_tStockRecordList != null) { for (TStockRecord et : _tStockRecordList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockRecordList")); } } }
        if (_tStoreRecordHList != null) { for (TStoreRecordH et : _tStoreRecordHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHList")); } } }
        if (_tTransferList != null) { for (TTransfer et : _tTransferList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTransferList")); } } }
        if (_wHtInventoryInputProdList != null) { for (WHtInventoryInputProd et : _wHtInventoryInputProdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtInventoryInputProdList")); } } }
        if (_wHtLoadingList != null) { for (WHtLoading et : _wHtLoadingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtLoadingList")); } } }
        if (_wHtPickingList != null) { for (WHtPicking et : _wHtPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtPickingList")); } } }
        if (_wHtReceiveInspectionList != null) { for (WHtReceiveInspection et : _wHtReceiveInspectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveInspectionList")); } } }
        if (_wHtReceiveNoPlanInspList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspList")); } } }
        if (_wHtReceiveStoreList != null) { for (WHtReceiveStore et : _wHtReceiveStoreList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveStoreList")); } } }
        if (_wHtSerialReceiveInspList != null) { for (WHtSerialReceiveInsp et : _wHtSerialReceiveInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtSerialReceiveInspList")); } } }
        if (_wHtSerialShippingInspList != null) { for (WHtSerialShippingInsp et : _wHtSerialShippingInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtSerialShippingInspList")); } } }
        if (_wHtShippingList != null) { for (WHtShipping et : _wHtShippingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtShippingList")); } } }
        if (_wHtShippingPickingList != null) { for (WHtShippingPicking et : _wHtShippingPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtShippingPickingList")); } } }
        if (_wHtTotalPickingList != null) { for (WHtTotalPicking et : _wHtTotalPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtTotalPickingList")); } } }
        if (_wSglRowShipInspHList != null) { for (WSglRowShipInspH et : _wSglRowShipInspHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wSglRowShipInspHList")); } } }
        if (_wShippingInterruptList != null) { for (WShippingInterrupt et : _wShippingInterruptList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wShippingInterruptList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_clientAbbr));
        sb.append(dm).append(xfND(_customerId));
        sb.append(dm).append(xfND(_shapeGrpId));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mShapeGrp != null)
        { sb.append(dm).append("mShapeGrp"); }
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mClientCenterList != null && !_mClientCenterList.isEmpty())
        { sb.append(dm).append("mClientCenterList"); }
        if (_mClientColList != null && !_mClientColList.isEmpty())
        { sb.append(dm).append("mClientColList"); }
        if (_mClientItemList != null && !_mClientItemList.isEmpty())
        { sb.append(dm).append("mClientItemList"); }
        if (_mClientScreenList != null && !_mClientScreenList.isEmpty())
        { sb.append(dm).append("mClientScreenList"); }
        if (_mCustomerList != null && !_mCustomerList.isEmpty())
        { sb.append(dm).append("mCustomerList"); }
        if (_mImportTypeList != null && !_mImportTypeList.isEmpty())
        { sb.append(dm).append("mImportTypeList"); }
        if (_mProductList != null && !_mProductList.isEmpty())
        { sb.append(dm).append("mProductList"); }
        if (_mShapeGrpList != null && !_mShapeGrpList.isEmpty())
        { sb.append(dm).append("mShapeGrpList"); }
        if (_mUserClientList != null && !_mUserClientList.isEmpty())
        { sb.append(dm).append("mUserClientList"); }
        if (_mUserLoginList != null && !_mUserLoginList.isEmpty())
        { sb.append(dm).append("mUserLoginList"); }
        if (_mWebHtInfoList != null && !_mWebHtInfoList.isEmpty())
        { sb.append(dm).append("mWebHtInfoList"); }
        if (_tAllocInstHList != null && !_tAllocInstHList.isEmpty())
        { sb.append(dm).append("tAllocInstHList"); }
        if (_tEcOrderHList != null && !_tEcOrderHList.isEmpty())
        { sb.append(dm).append("tEcOrderHList"); }
        if (_tInventoryHList != null && !_tInventoryHList.isEmpty())
        { sb.append(dm).append("tInventoryHList"); }
        if (_tMoveInstHList != null && !_tMoveInstHList.isEmpty())
        { sb.append(dm).append("tMoveInstHList"); }
        if (_tPackingHList != null && !_tPackingHList.isEmpty())
        { sb.append(dm).append("tPackingHList"); }
        if (_tPackingListList != null && !_tPackingListList.isEmpty())
        { sb.append(dm).append("tPackingListList"); }
        if (_tPicMthdRcmdList != null && !_tPicMthdRcmdList.isEmpty())
        { sb.append(dm).append("tPicMthdRcmdList"); }
        if (_tPickingHList != null && !_tPickingHList.isEmpty())
        { sb.append(dm).append("tPickingHList"); }
        if (_tReceivePlanHList != null && !_tReceivePlanHList.isEmpty())
        { sb.append(dm).append("tReceivePlanHList"); }
        if (_tSerialNoList != null && !_tSerialNoList.isEmpty())
        { sb.append(dm).append("tSerialNoList"); }
        if (_tShippingInstHList != null && !_tShippingInstHList.isEmpty())
        { sb.append(dm).append("tShippingInstHList"); }
        if (_tShippingRecordHList != null && !_tShippingRecordHList.isEmpty())
        { sb.append(dm).append("tShippingRecordHList"); }
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
        if (_tStockRecordList != null && !_tStockRecordList.isEmpty())
        { sb.append(dm).append("tStockRecordList"); }
        if (_tStoreRecordHList != null && !_tStoreRecordHList.isEmpty())
        { sb.append(dm).append("tStoreRecordHList"); }
        if (_tTransferList != null && !_tTransferList.isEmpty())
        { sb.append(dm).append("tTransferList"); }
        if (_wHtInventoryInputProdList != null && !_wHtInventoryInputProdList.isEmpty())
        { sb.append(dm).append("wHtInventoryInputProdList"); }
        if (_wHtLoadingList != null && !_wHtLoadingList.isEmpty())
        { sb.append(dm).append("wHtLoadingList"); }
        if (_wHtPickingList != null && !_wHtPickingList.isEmpty())
        { sb.append(dm).append("wHtPickingList"); }
        if (_wHtReceiveInspectionList != null && !_wHtReceiveInspectionList.isEmpty())
        { sb.append(dm).append("wHtReceiveInspectionList"); }
        if (_wHtReceiveNoPlanInspList != null && !_wHtReceiveNoPlanInspList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspList"); }
        if (_wHtReceiveStoreList != null && !_wHtReceiveStoreList.isEmpty())
        { sb.append(dm).append("wHtReceiveStoreList"); }
        if (_wHtSerialReceiveInspList != null && !_wHtSerialReceiveInspList.isEmpty())
        { sb.append(dm).append("wHtSerialReceiveInspList"); }
        if (_wHtSerialShippingInspList != null && !_wHtSerialShippingInspList.isEmpty())
        { sb.append(dm).append("wHtSerialShippingInspList"); }
        if (_wHtShippingList != null && !_wHtShippingList.isEmpty())
        { sb.append(dm).append("wHtShippingList"); }
        if (_wHtShippingPickingList != null && !_wHtShippingPickingList.isEmpty())
        { sb.append(dm).append("wHtShippingPickingList"); }
        if (_wHtTotalPickingList != null && !_wHtTotalPickingList.isEmpty())
        { sb.append(dm).append("wHtTotalPickingList"); }
        if (_wSglRowShipInspHList != null && !_wSglRowShipInspHList.isEmpty())
        { sb.append(dm).append("wSglRowShipInspHList"); }
        if (_wShippingInterruptList != null && !_wShippingInterruptList.isEmpty())
        { sb.append(dm).append("wShippingInterruptList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MClient clone() {
        return (MClient)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {NotNull, VARCHAR(60)} <br>
     * 荷主名称
     * @return The value of the column 'CLIENT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {NotNull, VARCHAR(60)} <br>
     * 荷主名称
     * @param clientNm The value of the column 'CLIENT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] CLIENT_ABBR: {VARCHAR(60)} <br>
     * 荷主略称
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAbbr() {
        checkSpecifiedProperty("clientAbbr");
        return convertEmptyToNull(_clientAbbr);
    }

    /**
     * [set] CLIENT_ABBR: {VARCHAR(60)} <br>
     * 荷主略称
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAbbr(String clientAbbr) {
        registerModifiedProperty("clientAbbr");
        _clientAbbr = clientAbbr;
    }

    /**
     * [get] CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 荷主取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCustomerId() {
        checkSpecifiedProperty("customerId");
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 荷主取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerId(Long customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeGrpId() {
        checkSpecifiedProperty("shapeGrpId");
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        registerModifiedProperty("shapeGrpId");
        _shapeGrpId = shapeGrpId;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
