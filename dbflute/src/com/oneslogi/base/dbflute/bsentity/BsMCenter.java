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
 * The entity of m_center as TABLE. <br>
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
 * [foreign table]
 *     b_time_zone, b_culture, b_class_dtl(ByDelFlg)
 *
 * [referrer table]
 *     h_location_attribute, m_box, m_box_grp, m_carrier, m_carrier_slip_sgw, m_carrier_slip_ymt, m_carrier_slip_yupk, m_center_class, m_center_col, m_center_customer, m_center_item, m_center_screen, m_client_center, m_customer_picking, m_delivery_course, m_general, m_location, m_nizoroe, m_numbering_center, m_user_center, m_user_login, m_warehouse, m_web_ht_info, t_alloc_inst_h, t_ec_order_h, t_inventory_h, t_move_inst_h, t_packing_h, t_pic_mthd_rcmd, t_picking_h, t_receive_plan_h, t_serial_no, t_shipping_inst_h, t_store_record_h, w_ht_inventory_input_prod, w_ht_loading, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt
 *
 * [foreign property]
 *     bTimeZone, bCulture, bClassDtlByDelFlg
 *
 * [referrer property]
 *     hLocationAttributeList, mBoxList, mBoxGrpList, mCarrierList, mCarrierSlipSgwList, mCarrierSlipYmtList, mCarrierSlipYupkList, mCenterClassList, mCenterColList, mCenterCustomerList, mCenterItemList, mCenterScreenList, mClientCenterList, mCustomerPickingList, mDeliveryCourseList, mGeneralList, mLocationList, mNizoroeList, mNumberingCenterList, mUserCenterList, mUserLoginList, mWarehouseList, mWebHtInfoList, tAllocInstHList, tEcOrderHList, tInventoryHList, tMoveInstHList, tPackingHList, tPicMthdRcmdList, tPickingHList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tStoreRecordHList, wHtInventoryInputProdList, wHtLoadingList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String centerAbbr = entity.getCenterAbbr();
 * Long cultureId = entity.getCultureId();
 * Long timeZoneId = entity.getTimeZoneId();
 * String address = entity.getAddress();
 * String telNo = entity.getTelNo();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setCultureId(cultureId);
 * entity.setTimeZoneId(timeZoneId);
 * entity.setAddress(address);
 * entity.setTelNo(telNo);
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
public abstract class BsMCenter extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _centerId;

    /** CENTER_CD: {UQ, NotNull, VARCHAR(30)} */
    protected String _centerCd;

    /** CENTER_NM: {NotNull, VARCHAR(60)} */
    protected String _centerNm;

    /** CENTER_ABBR: {VARCHAR(60)} */
    protected String _centerAbbr;

    /** CULTURE_ID: {IX, BIGINT(19), FK to b_culture} */
    protected Long _cultureId;

    /** TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone} */
    protected Long _timeZoneId;

    /** ADDRESS: {VARCHAR(255)} */
    protected String _address;

    /** TEL_NO: {VARCHAR(30)} */
    protected String _telNo;

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
        return "m_center";
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
        if (_centerId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerCd : UQ, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(String centerCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerCd");
        setCenterCd(centerCd);
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
    /** b_time_zone by my TIME_ZONE_ID, named 'BTimeZone'. */
    protected BTimeZone _bTimeZone;

    /**
     * [get] b_time_zone by my TIME_ZONE_ID, named 'BTimeZone'. <br>
     * @return The entity of foreign property 'BTimeZone'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BTimeZone getBTimeZone() {
        return _bTimeZone;
    }

    /**
     * [set] b_time_zone by my TIME_ZONE_ID, named 'BTimeZone'.
     * @param bTimeZone The entity of foreign property 'BTimeZone'. (NullAllowed)
     */
    public void setBTimeZone(BTimeZone bTimeZone) {
        _bTimeZone = bTimeZone;
    }

    /** b_culture by my CULTURE_ID, named 'BCulture'. */
    protected BCulture _bCulture;

    /**
     * [get] b_culture by my CULTURE_ID, named 'BCulture'. <br>
     * @return The entity of foreign property 'BCulture'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BCulture getBCulture() {
        return _bCulture;
    }

    /**
     * [set] b_culture by my CULTURE_ID, named 'BCulture'.
     * @param bCulture The entity of foreign property 'BCulture'. (NullAllowed)
     */
    public void setBCulture(BCulture bCulture) {
        _bCulture = bCulture;
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
    /** h_location_attribute by CENTER_ID, named 'HLocationAttributeList'. */
    protected List<HLocationAttribute> _hLocationAttributeList;

    /**
     * [get] h_location_attribute by CENTER_ID, named 'HLocationAttributeList'.
     * @return The entity list of referrer property 'HLocationAttributeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HLocationAttribute> getHLocationAttributeList() {
        if (_hLocationAttributeList == null) { _hLocationAttributeList = newReferrerList(); }
        return _hLocationAttributeList;
    }

    /**
     * [set] h_location_attribute by CENTER_ID, named 'HLocationAttributeList'.
     * @param hLocationAttributeList The entity list of referrer property 'HLocationAttributeList'. (NullAllowed)
     */
    public void setHLocationAttributeList(List<HLocationAttribute> hLocationAttributeList) {
        _hLocationAttributeList = hLocationAttributeList;
    }

    /** m_box by CENTER_ID, named 'MBoxList'. */
    protected List<MBox> _mBoxList;

    /**
     * [get] m_box by CENTER_ID, named 'MBoxList'.
     * @return The entity list of referrer property 'MBoxList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBox> getMBoxList() {
        if (_mBoxList == null) { _mBoxList = newReferrerList(); }
        return _mBoxList;
    }

    /**
     * [set] m_box by CENTER_ID, named 'MBoxList'.
     * @param mBoxList The entity list of referrer property 'MBoxList'. (NullAllowed)
     */
    public void setMBoxList(List<MBox> mBoxList) {
        _mBoxList = mBoxList;
    }

    /** m_box_grp by CENTER_ID, named 'MBoxGrpList'. */
    protected List<MBoxGrp> _mBoxGrpList;

    /**
     * [get] m_box_grp by CENTER_ID, named 'MBoxGrpList'.
     * @return The entity list of referrer property 'MBoxGrpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBoxGrp> getMBoxGrpList() {
        if (_mBoxGrpList == null) { _mBoxGrpList = newReferrerList(); }
        return _mBoxGrpList;
    }

    /**
     * [set] m_box_grp by CENTER_ID, named 'MBoxGrpList'.
     * @param mBoxGrpList The entity list of referrer property 'MBoxGrpList'. (NullAllowed)
     */
    public void setMBoxGrpList(List<MBoxGrp> mBoxGrpList) {
        _mBoxGrpList = mBoxGrpList;
    }

    /** m_carrier by CENTER_ID, named 'MCarrierList'. */
    protected List<MCarrier> _mCarrierList;

    /**
     * [get] m_carrier by CENTER_ID, named 'MCarrierList'.
     * @return The entity list of referrer property 'MCarrierList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrier> getMCarrierList() {
        if (_mCarrierList == null) { _mCarrierList = newReferrerList(); }
        return _mCarrierList;
    }

    /**
     * [set] m_carrier by CENTER_ID, named 'MCarrierList'.
     * @param mCarrierList The entity list of referrer property 'MCarrierList'. (NullAllowed)
     */
    public void setMCarrierList(List<MCarrier> mCarrierList) {
        _mCarrierList = mCarrierList;
    }

    /** m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwList'. */
    protected List<MCarrierSlipSgw> _mCarrierSlipSgwList;

    /**
     * [get] m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwList'.
     * @return The entity list of referrer property 'MCarrierSlipSgwList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierSlipSgw> getMCarrierSlipSgwList() {
        if (_mCarrierSlipSgwList == null) { _mCarrierSlipSgwList = newReferrerList(); }
        return _mCarrierSlipSgwList;
    }

    /**
     * [set] m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwList'.
     * @param mCarrierSlipSgwList The entity list of referrer property 'MCarrierSlipSgwList'. (NullAllowed)
     */
    public void setMCarrierSlipSgwList(List<MCarrierSlipSgw> mCarrierSlipSgwList) {
        _mCarrierSlipSgwList = mCarrierSlipSgwList;
    }

    /** m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtList'. */
    protected List<MCarrierSlipYmt> _mCarrierSlipYmtList;

    /**
     * [get] m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtList'.
     * @return The entity list of referrer property 'MCarrierSlipYmtList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierSlipYmt> getMCarrierSlipYmtList() {
        if (_mCarrierSlipYmtList == null) { _mCarrierSlipYmtList = newReferrerList(); }
        return _mCarrierSlipYmtList;
    }

    /**
     * [set] m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtList'.
     * @param mCarrierSlipYmtList The entity list of referrer property 'MCarrierSlipYmtList'. (NullAllowed)
     */
    public void setMCarrierSlipYmtList(List<MCarrierSlipYmt> mCarrierSlipYmtList) {
        _mCarrierSlipYmtList = mCarrierSlipYmtList;
    }

    /** m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkList'. */
    protected List<MCarrierSlipYupk> _mCarrierSlipYupkList;

    /**
     * [get] m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkList'.
     * @return The entity list of referrer property 'MCarrierSlipYupkList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierSlipYupk> getMCarrierSlipYupkList() {
        if (_mCarrierSlipYupkList == null) { _mCarrierSlipYupkList = newReferrerList(); }
        return _mCarrierSlipYupkList;
    }

    /**
     * [set] m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkList'.
     * @param mCarrierSlipYupkList The entity list of referrer property 'MCarrierSlipYupkList'. (NullAllowed)
     */
    public void setMCarrierSlipYupkList(List<MCarrierSlipYupk> mCarrierSlipYupkList) {
        _mCarrierSlipYupkList = mCarrierSlipYupkList;
    }

    /** m_center_class by CENTER_ID, named 'MCenterClassList'. */
    protected List<MCenterClass> _mCenterClassList;

    /**
     * [get] m_center_class by CENTER_ID, named 'MCenterClassList'.
     * @return The entity list of referrer property 'MCenterClassList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterClass> getMCenterClassList() {
        if (_mCenterClassList == null) { _mCenterClassList = newReferrerList(); }
        return _mCenterClassList;
    }

    /**
     * [set] m_center_class by CENTER_ID, named 'MCenterClassList'.
     * @param mCenterClassList The entity list of referrer property 'MCenterClassList'. (NullAllowed)
     */
    public void setMCenterClassList(List<MCenterClass> mCenterClassList) {
        _mCenterClassList = mCenterClassList;
    }

    /** m_center_col by CENTER_ID, named 'MCenterColList'. */
    protected List<MCenterCol> _mCenterColList;

    /**
     * [get] m_center_col by CENTER_ID, named 'MCenterColList'.
     * @return The entity list of referrer property 'MCenterColList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterCol> getMCenterColList() {
        if (_mCenterColList == null) { _mCenterColList = newReferrerList(); }
        return _mCenterColList;
    }

    /**
     * [set] m_center_col by CENTER_ID, named 'MCenterColList'.
     * @param mCenterColList The entity list of referrer property 'MCenterColList'. (NullAllowed)
     */
    public void setMCenterColList(List<MCenterCol> mCenterColList) {
        _mCenterColList = mCenterColList;
    }

    /** m_center_customer by CENTER_ID, named 'MCenterCustomerList'. */
    protected List<MCenterCustomer> _mCenterCustomerList;

    /**
     * [get] m_center_customer by CENTER_ID, named 'MCenterCustomerList'.
     * @return The entity list of referrer property 'MCenterCustomerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterCustomer> getMCenterCustomerList() {
        if (_mCenterCustomerList == null) { _mCenterCustomerList = newReferrerList(); }
        return _mCenterCustomerList;
    }

    /**
     * [set] m_center_customer by CENTER_ID, named 'MCenterCustomerList'.
     * @param mCenterCustomerList The entity list of referrer property 'MCenterCustomerList'. (NullAllowed)
     */
    public void setMCenterCustomerList(List<MCenterCustomer> mCenterCustomerList) {
        _mCenterCustomerList = mCenterCustomerList;
    }

    /** m_center_item by CENTER_ID, named 'MCenterItemList'. */
    protected List<MCenterItem> _mCenterItemList;

    /**
     * [get] m_center_item by CENTER_ID, named 'MCenterItemList'.
     * @return The entity list of referrer property 'MCenterItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterItem> getMCenterItemList() {
        if (_mCenterItemList == null) { _mCenterItemList = newReferrerList(); }
        return _mCenterItemList;
    }

    /**
     * [set] m_center_item by CENTER_ID, named 'MCenterItemList'.
     * @param mCenterItemList The entity list of referrer property 'MCenterItemList'. (NullAllowed)
     */
    public void setMCenterItemList(List<MCenterItem> mCenterItemList) {
        _mCenterItemList = mCenterItemList;
    }

    /** m_center_screen by CENTER_ID, named 'MCenterScreenList'. */
    protected List<MCenterScreen> _mCenterScreenList;

    /**
     * [get] m_center_screen by CENTER_ID, named 'MCenterScreenList'.
     * @return The entity list of referrer property 'MCenterScreenList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterScreen> getMCenterScreenList() {
        if (_mCenterScreenList == null) { _mCenterScreenList = newReferrerList(); }
        return _mCenterScreenList;
    }

    /**
     * [set] m_center_screen by CENTER_ID, named 'MCenterScreenList'.
     * @param mCenterScreenList The entity list of referrer property 'MCenterScreenList'. (NullAllowed)
     */
    public void setMCenterScreenList(List<MCenterScreen> mCenterScreenList) {
        _mCenterScreenList = mCenterScreenList;
    }

    /** m_client_center by CENTER_ID, named 'MClientCenterList'. */
    protected List<MClientCenter> _mClientCenterList;

    /**
     * [get] m_client_center by CENTER_ID, named 'MClientCenterList'.
     * @return The entity list of referrer property 'MClientCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCenter> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = newReferrerList(); }
        return _mClientCenterList;
    }

    /**
     * [set] m_client_center by CENTER_ID, named 'MClientCenterList'.
     * @param mClientCenterList The entity list of referrer property 'MClientCenterList'. (NullAllowed)
     */
    public void setMClientCenterList(List<MClientCenter> mClientCenterList) {
        _mClientCenterList = mClientCenterList;
    }

    /** m_customer_picking by CENTER_ID, named 'MCustomerPickingList'. */
    protected List<MCustomerPicking> _mCustomerPickingList;

    /**
     * [get] m_customer_picking by CENTER_ID, named 'MCustomerPickingList'.
     * @return The entity list of referrer property 'MCustomerPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCustomerPicking> getMCustomerPickingList() {
        if (_mCustomerPickingList == null) { _mCustomerPickingList = newReferrerList(); }
        return _mCustomerPickingList;
    }

    /**
     * [set] m_customer_picking by CENTER_ID, named 'MCustomerPickingList'.
     * @param mCustomerPickingList The entity list of referrer property 'MCustomerPickingList'. (NullAllowed)
     */
    public void setMCustomerPickingList(List<MCustomerPicking> mCustomerPickingList) {
        _mCustomerPickingList = mCustomerPickingList;
    }

    /** m_delivery_course by CENTER_ID, named 'MDeliveryCourseList'. */
    protected List<MDeliveryCourse> _mDeliveryCourseList;

    /**
     * [get] m_delivery_course by CENTER_ID, named 'MDeliveryCourseList'.
     * @return The entity list of referrer property 'MDeliveryCourseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDeliveryCourse> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = newReferrerList(); }
        return _mDeliveryCourseList;
    }

    /**
     * [set] m_delivery_course by CENTER_ID, named 'MDeliveryCourseList'.
     * @param mDeliveryCourseList The entity list of referrer property 'MDeliveryCourseList'. (NullAllowed)
     */
    public void setMDeliveryCourseList(List<MDeliveryCourse> mDeliveryCourseList) {
        _mDeliveryCourseList = mDeliveryCourseList;
    }

    /** m_general by CENTER_ID, named 'MGeneralList'. */
    protected List<MGeneral> _mGeneralList;

    /**
     * [get] m_general by CENTER_ID, named 'MGeneralList'.
     * @return The entity list of referrer property 'MGeneralList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MGeneral> getMGeneralList() {
        if (_mGeneralList == null) { _mGeneralList = newReferrerList(); }
        return _mGeneralList;
    }

    /**
     * [set] m_general by CENTER_ID, named 'MGeneralList'.
     * @param mGeneralList The entity list of referrer property 'MGeneralList'. (NullAllowed)
     */
    public void setMGeneralList(List<MGeneral> mGeneralList) {
        _mGeneralList = mGeneralList;
    }

    /** m_location by CENTER_ID, named 'MLocationList'. */
    protected List<MLocation> _mLocationList;

    /**
     * [get] m_location by CENTER_ID, named 'MLocationList'.
     * @return The entity list of referrer property 'MLocationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocation> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = newReferrerList(); }
        return _mLocationList;
    }

    /**
     * [set] m_location by CENTER_ID, named 'MLocationList'.
     * @param mLocationList The entity list of referrer property 'MLocationList'. (NullAllowed)
     */
    public void setMLocationList(List<MLocation> mLocationList) {
        _mLocationList = mLocationList;
    }

    /** m_nizoroe by CENTER_ID, named 'MNizoroeList'. */
    protected List<MNizoroe> _mNizoroeList;

    /**
     * [get] m_nizoroe by CENTER_ID, named 'MNizoroeList'.
     * @return The entity list of referrer property 'MNizoroeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MNizoroe> getMNizoroeList() {
        if (_mNizoroeList == null) { _mNizoroeList = newReferrerList(); }
        return _mNizoroeList;
    }

    /**
     * [set] m_nizoroe by CENTER_ID, named 'MNizoroeList'.
     * @param mNizoroeList The entity list of referrer property 'MNizoroeList'. (NullAllowed)
     */
    public void setMNizoroeList(List<MNizoroe> mNizoroeList) {
        _mNizoroeList = mNizoroeList;
    }

    /** m_numbering_center by CENTER_ID, named 'MNumberingCenterList'. */
    protected List<MNumberingCenter> _mNumberingCenterList;

    /**
     * [get] m_numbering_center by CENTER_ID, named 'MNumberingCenterList'.
     * @return The entity list of referrer property 'MNumberingCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MNumberingCenter> getMNumberingCenterList() {
        if (_mNumberingCenterList == null) { _mNumberingCenterList = newReferrerList(); }
        return _mNumberingCenterList;
    }

    /**
     * [set] m_numbering_center by CENTER_ID, named 'MNumberingCenterList'.
     * @param mNumberingCenterList The entity list of referrer property 'MNumberingCenterList'. (NullAllowed)
     */
    public void setMNumberingCenterList(List<MNumberingCenter> mNumberingCenterList) {
        _mNumberingCenterList = mNumberingCenterList;
    }

    /** m_user_center by CENTER_ID, named 'MUserCenterList'. */
    protected List<MUserCenter> _mUserCenterList;

    /**
     * [get] m_user_center by CENTER_ID, named 'MUserCenterList'.
     * @return The entity list of referrer property 'MUserCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserCenter> getMUserCenterList() {
        if (_mUserCenterList == null) { _mUserCenterList = newReferrerList(); }
        return _mUserCenterList;
    }

    /**
     * [set] m_user_center by CENTER_ID, named 'MUserCenterList'.
     * @param mUserCenterList The entity list of referrer property 'MUserCenterList'. (NullAllowed)
     */
    public void setMUserCenterList(List<MUserCenter> mUserCenterList) {
        _mUserCenterList = mUserCenterList;
    }

    /** m_user_login by CENTER_ID, named 'MUserLoginList'. */
    protected List<MUserLogin> _mUserLoginList;

    /**
     * [get] m_user_login by CENTER_ID, named 'MUserLoginList'.
     * @return The entity list of referrer property 'MUserLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserLogin> getMUserLoginList() {
        if (_mUserLoginList == null) { _mUserLoginList = newReferrerList(); }
        return _mUserLoginList;
    }

    /**
     * [set] m_user_login by CENTER_ID, named 'MUserLoginList'.
     * @param mUserLoginList The entity list of referrer property 'MUserLoginList'. (NullAllowed)
     */
    public void setMUserLoginList(List<MUserLogin> mUserLoginList) {
        _mUserLoginList = mUserLoginList;
    }

    /** m_warehouse by CENTER_ID, named 'MWarehouseList'. */
    protected List<MWarehouse> _mWarehouseList;

    /**
     * [get] m_warehouse by CENTER_ID, named 'MWarehouseList'.
     * @return The entity list of referrer property 'MWarehouseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWarehouse> getMWarehouseList() {
        if (_mWarehouseList == null) { _mWarehouseList = newReferrerList(); }
        return _mWarehouseList;
    }

    /**
     * [set] m_warehouse by CENTER_ID, named 'MWarehouseList'.
     * @param mWarehouseList The entity list of referrer property 'MWarehouseList'. (NullAllowed)
     */
    public void setMWarehouseList(List<MWarehouse> mWarehouseList) {
        _mWarehouseList = mWarehouseList;
    }

    /** m_web_ht_info by CENTER_ID, named 'MWebHtInfoList'. */
    protected List<MWebHtInfo> _mWebHtInfoList;

    /**
     * [get] m_web_ht_info by CENTER_ID, named 'MWebHtInfoList'.
     * @return The entity list of referrer property 'MWebHtInfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWebHtInfo> getMWebHtInfoList() {
        if (_mWebHtInfoList == null) { _mWebHtInfoList = newReferrerList(); }
        return _mWebHtInfoList;
    }

    /**
     * [set] m_web_ht_info by CENTER_ID, named 'MWebHtInfoList'.
     * @param mWebHtInfoList The entity list of referrer property 'MWebHtInfoList'. (NullAllowed)
     */
    public void setMWebHtInfoList(List<MWebHtInfo> mWebHtInfoList) {
        _mWebHtInfoList = mWebHtInfoList;
    }

    /** t_alloc_inst_h by CENTER_ID, named 'TAllocInstHList'. */
    protected List<TAllocInstH> _tAllocInstHList;

    /**
     * [get] t_alloc_inst_h by CENTER_ID, named 'TAllocInstHList'.
     * @return The entity list of referrer property 'TAllocInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = newReferrerList(); }
        return _tAllocInstHList;
    }

    /**
     * [set] t_alloc_inst_h by CENTER_ID, named 'TAllocInstHList'.
     * @param tAllocInstHList The entity list of referrer property 'TAllocInstHList'. (NullAllowed)
     */
    public void setTAllocInstHList(List<TAllocInstH> tAllocInstHList) {
        _tAllocInstHList = tAllocInstHList;
    }

    /** t_ec_order_h by CENTER_ID, named 'TEcOrderHList'. */
    protected List<TEcOrderH> _tEcOrderHList;

    /**
     * [get] t_ec_order_h by CENTER_ID, named 'TEcOrderHList'.
     * @return The entity list of referrer property 'TEcOrderHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderH> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = newReferrerList(); }
        return _tEcOrderHList;
    }

    /**
     * [set] t_ec_order_h by CENTER_ID, named 'TEcOrderHList'.
     * @param tEcOrderHList The entity list of referrer property 'TEcOrderHList'. (NullAllowed)
     */
    public void setTEcOrderHList(List<TEcOrderH> tEcOrderHList) {
        _tEcOrderHList = tEcOrderHList;
    }

    /** t_inventory_h by CENTER_ID, named 'TInventoryHList'. */
    protected List<TInventoryH> _tInventoryHList;

    /**
     * [get] t_inventory_h by CENTER_ID, named 'TInventoryHList'.
     * @return The entity list of referrer property 'TInventoryHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryH> getTInventoryHList() {
        if (_tInventoryHList == null) { _tInventoryHList = newReferrerList(); }
        return _tInventoryHList;
    }

    /**
     * [set] t_inventory_h by CENTER_ID, named 'TInventoryHList'.
     * @param tInventoryHList The entity list of referrer property 'TInventoryHList'. (NullAllowed)
     */
    public void setTInventoryHList(List<TInventoryH> tInventoryHList) {
        _tInventoryHList = tInventoryHList;
    }

    /** t_move_inst_h by CENTER_ID, named 'TMoveInstHList'. */
    protected List<TMoveInstH> _tMoveInstHList;

    /**
     * [get] t_move_inst_h by CENTER_ID, named 'TMoveInstHList'.
     * @return The entity list of referrer property 'TMoveInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstH> getTMoveInstHList() {
        if (_tMoveInstHList == null) { _tMoveInstHList = newReferrerList(); }
        return _tMoveInstHList;
    }

    /**
     * [set] t_move_inst_h by CENTER_ID, named 'TMoveInstHList'.
     * @param tMoveInstHList The entity list of referrer property 'TMoveInstHList'. (NullAllowed)
     */
    public void setTMoveInstHList(List<TMoveInstH> tMoveInstHList) {
        _tMoveInstHList = tMoveInstHList;
    }

    /** t_packing_h by CENTER_ID, named 'TPackingHList'. */
    protected List<TPackingH> _tPackingHList;

    /**
     * [get] t_packing_h by CENTER_ID, named 'TPackingHList'.
     * @return The entity list of referrer property 'TPackingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = newReferrerList(); }
        return _tPackingHList;
    }

    /**
     * [set] t_packing_h by CENTER_ID, named 'TPackingHList'.
     * @param tPackingHList The entity list of referrer property 'TPackingHList'. (NullAllowed)
     */
    public void setTPackingHList(List<TPackingH> tPackingHList) {
        _tPackingHList = tPackingHList;
    }

    /** t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdList'. */
    protected List<TPicMthdRcmd> _tPicMthdRcmdList;

    /**
     * [get] t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdList'.
     * @return The entity list of referrer property 'TPicMthdRcmdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPicMthdRcmd> getTPicMthdRcmdList() {
        if (_tPicMthdRcmdList == null) { _tPicMthdRcmdList = newReferrerList(); }
        return _tPicMthdRcmdList;
    }

    /**
     * [set] t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdList'.
     * @param tPicMthdRcmdList The entity list of referrer property 'TPicMthdRcmdList'. (NullAllowed)
     */
    public void setTPicMthdRcmdList(List<TPicMthdRcmd> tPicMthdRcmdList) {
        _tPicMthdRcmdList = tPicMthdRcmdList;
    }

    /** t_picking_h by CENTER_ID, named 'TPickingHList'. */
    protected List<TPickingH> _tPickingHList;

    /**
     * [get] t_picking_h by CENTER_ID, named 'TPickingHList'.
     * @return The entity list of referrer property 'TPickingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingH> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = newReferrerList(); }
        return _tPickingHList;
    }

    /**
     * [set] t_picking_h by CENTER_ID, named 'TPickingHList'.
     * @param tPickingHList The entity list of referrer property 'TPickingHList'. (NullAllowed)
     */
    public void setTPickingHList(List<TPickingH> tPickingHList) {
        _tPickingHList = tPickingHList;
    }

    /** t_receive_plan_h by CENTER_ID, named 'TReceivePlanHList'. */
    protected List<TReceivePlanH> _tReceivePlanHList;

    /**
     * [get] t_receive_plan_h by CENTER_ID, named 'TReceivePlanHList'.
     * @return The entity list of referrer property 'TReceivePlanHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = newReferrerList(); }
        return _tReceivePlanHList;
    }

    /**
     * [set] t_receive_plan_h by CENTER_ID, named 'TReceivePlanHList'.
     * @param tReceivePlanHList The entity list of referrer property 'TReceivePlanHList'. (NullAllowed)
     */
    public void setTReceivePlanHList(List<TReceivePlanH> tReceivePlanHList) {
        _tReceivePlanHList = tReceivePlanHList;
    }

    /** t_serial_no by CENTER_ID, named 'TSerialNoList'. */
    protected List<TSerialNo> _tSerialNoList;

    /**
     * [get] t_serial_no by CENTER_ID, named 'TSerialNoList'.
     * @return The entity list of referrer property 'TSerialNoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TSerialNo> getTSerialNoList() {
        if (_tSerialNoList == null) { _tSerialNoList = newReferrerList(); }
        return _tSerialNoList;
    }

    /**
     * [set] t_serial_no by CENTER_ID, named 'TSerialNoList'.
     * @param tSerialNoList The entity list of referrer property 'TSerialNoList'. (NullAllowed)
     */
    public void setTSerialNoList(List<TSerialNo> tSerialNoList) {
        _tSerialNoList = tSerialNoList;
    }

    /** t_shipping_inst_h by CENTER_ID, named 'TShippingInstHList'. */
    protected List<TShippingInstH> _tShippingInstHList;

    /**
     * [get] t_shipping_inst_h by CENTER_ID, named 'TShippingInstHList'.
     * @return The entity list of referrer property 'TShippingInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = newReferrerList(); }
        return _tShippingInstHList;
    }

    /**
     * [set] t_shipping_inst_h by CENTER_ID, named 'TShippingInstHList'.
     * @param tShippingInstHList The entity list of referrer property 'TShippingInstHList'. (NullAllowed)
     */
    public void setTShippingInstHList(List<TShippingInstH> tShippingInstHList) {
        _tShippingInstHList = tShippingInstHList;
    }

    /** t_store_record_h by CENTER_ID, named 'TStoreRecordHList'. */
    protected List<TStoreRecordH> _tStoreRecordHList;

    /**
     * [get] t_store_record_h by CENTER_ID, named 'TStoreRecordHList'.
     * @return The entity list of referrer property 'TStoreRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = newReferrerList(); }
        return _tStoreRecordHList;
    }

    /**
     * [set] t_store_record_h by CENTER_ID, named 'TStoreRecordHList'.
     * @param tStoreRecordHList The entity list of referrer property 'TStoreRecordHList'. (NullAllowed)
     */
    public void setTStoreRecordHList(List<TStoreRecordH> tStoreRecordHList) {
        _tStoreRecordHList = tStoreRecordHList;
    }

    /** w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** w_ht_loading by CENTER_ID, named 'WHtLoadingList'. */
    protected List<WHtLoading> _wHtLoadingList;

    /**
     * [get] w_ht_loading by CENTER_ID, named 'WHtLoadingList'.
     * @return The entity list of referrer property 'WHtLoadingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtLoading> getWHtLoadingList() {
        if (_wHtLoadingList == null) { _wHtLoadingList = newReferrerList(); }
        return _wHtLoadingList;
    }

    /**
     * [set] w_ht_loading by CENTER_ID, named 'WHtLoadingList'.
     * @param wHtLoadingList The entity list of referrer property 'WHtLoadingList'. (NullAllowed)
     */
    public void setWHtLoadingList(List<WHtLoading> wHtLoadingList) {
        _wHtLoadingList = wHtLoadingList;
    }

    /** w_ht_picking by CENTER_ID, named 'WHtPickingList'. */
    protected List<WHtPicking> _wHtPickingList;

    /**
     * [get] w_ht_picking by CENTER_ID, named 'WHtPickingList'.
     * @return The entity list of referrer property 'WHtPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtPicking> getWHtPickingList() {
        if (_wHtPickingList == null) { _wHtPickingList = newReferrerList(); }
        return _wHtPickingList;
    }

    /**
     * [set] w_ht_picking by CENTER_ID, named 'WHtPickingList'.
     * @param wHtPickingList The entity list of referrer property 'WHtPickingList'. (NullAllowed)
     */
    public void setWHtPickingList(List<WHtPicking> wHtPickingList) {
        _wHtPickingList = wHtPickingList;
    }

    /** w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreList'.
     * @param wHtReceiveStoreList The entity list of referrer property 'WHtReceiveStoreList'. (NullAllowed)
     */
    public void setWHtReceiveStoreList(List<WHtReceiveStore> wHtReceiveStoreList) {
        _wHtReceiveStoreList = wHtReceiveStoreList;
    }

    /** w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspList'. */
    protected List<WHtSerialReceiveInsp> _wHtSerialReceiveInspList;

    /**
     * [get] w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * @return The entity list of referrer property 'WHtSerialReceiveInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialReceiveInsp> getWHtSerialReceiveInspList() {
        if (_wHtSerialReceiveInspList == null) { _wHtSerialReceiveInspList = newReferrerList(); }
        return _wHtSerialReceiveInspList;
    }

    /**
     * [set] w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * @param wHtSerialReceiveInspList The entity list of referrer property 'WHtSerialReceiveInspList'. (NullAllowed)
     */
    public void setWHtSerialReceiveInspList(List<WHtSerialReceiveInsp> wHtSerialReceiveInspList) {
        _wHtSerialReceiveInspList = wHtSerialReceiveInspList;
    }

    /** w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspList'. */
    protected List<WHtSerialShippingInsp> _wHtSerialShippingInspList;

    /**
     * [get] w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspList'.
     * @return The entity list of referrer property 'WHtSerialShippingInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialShippingInsp> getWHtSerialShippingInspList() {
        if (_wHtSerialShippingInspList == null) { _wHtSerialShippingInspList = newReferrerList(); }
        return _wHtSerialShippingInspList;
    }

    /**
     * [set] w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspList'.
     * @param wHtSerialShippingInspList The entity list of referrer property 'WHtSerialShippingInspList'. (NullAllowed)
     */
    public void setWHtSerialShippingInspList(List<WHtSerialShippingInsp> wHtSerialShippingInspList) {
        _wHtSerialShippingInspList = wHtSerialShippingInspList;
    }

    /** w_ht_shipping by CENTER_ID, named 'WHtShippingList'. */
    protected List<WHtShipping> _wHtShippingList;

    /**
     * [get] w_ht_shipping by CENTER_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShipping> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = newReferrerList(); }
        return _wHtShippingList;
    }

    /**
     * [set] w_ht_shipping by CENTER_ID, named 'WHtShippingList'.
     * @param wHtShippingList The entity list of referrer property 'WHtShippingList'. (NullAllowed)
     */
    public void setWHtShippingList(List<WHtShipping> wHtShippingList) {
        _wHtShippingList = wHtShippingList;
    }

    /** w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingList'. */
    protected List<WHtShippingPicking> _wHtShippingPickingList;

    /**
     * [get] w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = newReferrerList(); }
        return _wHtShippingPickingList;
    }

    /**
     * [set] w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingList'.
     * @param wHtShippingPickingList The entity list of referrer property 'WHtShippingPickingList'. (NullAllowed)
     */
    public void setWHtShippingPickingList(List<WHtShippingPicking> wHtShippingPickingList) {
        _wHtShippingPickingList = wHtShippingPickingList;
    }

    /** w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingList'. */
    protected List<WHtTotalPicking> _wHtTotalPickingList;

    /**
     * [get] w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingList'.
     * @return The entity list of referrer property 'WHtTotalPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtTotalPicking> getWHtTotalPickingList() {
        if (_wHtTotalPickingList == null) { _wHtTotalPickingList = newReferrerList(); }
        return _wHtTotalPickingList;
    }

    /**
     * [set] w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingList'.
     * @param wHtTotalPickingList The entity list of referrer property 'WHtTotalPickingList'. (NullAllowed)
     */
    public void setWHtTotalPickingList(List<WHtTotalPicking> wHtTotalPickingList) {
        _wHtTotalPickingList = wHtTotalPickingList;
    }

    /** w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHList'. */
    protected List<WSglRowShipInspH> _wSglRowShipInspHList;

    /**
     * [get] w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = newReferrerList(); }
        return _wSglRowShipInspHList;
    }

    /**
     * [set] w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHList'.
     * @param wSglRowShipInspHList The entity list of referrer property 'WSglRowShipInspHList'. (NullAllowed)
     */
    public void setWSglRowShipInspHList(List<WSglRowShipInspH> wSglRowShipInspHList) {
        _wSglRowShipInspHList = wSglRowShipInspHList;
    }

    /** w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptList'. */
    protected List<WShippingInterrupt> _wShippingInterruptList;

    /**
     * [get] w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = newReferrerList(); }
        return _wShippingInterruptList;
    }

    /**
     * [set] w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptList'.
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
        if (obj instanceof BsMCenter) {
            BsMCenter other = (BsMCenter)obj;
            if (!xSV(_centerId, other._centerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bTimeZone != null)
        { sb.append(li).append(xbRDS(_bTimeZone, "bTimeZone")); }
        if (_bCulture != null)
        { sb.append(li).append(xbRDS(_bCulture, "bCulture")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_hLocationAttributeList != null) { for (HLocationAttribute et : _hLocationAttributeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hLocationAttributeList")); } } }
        if (_mBoxList != null) { for (MBox et : _mBoxList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBoxList")); } } }
        if (_mBoxGrpList != null) { for (MBoxGrp et : _mBoxGrpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBoxGrpList")); } } }
        if (_mCarrierList != null) { for (MCarrier et : _mCarrierList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierList")); } } }
        if (_mCarrierSlipSgwList != null) { for (MCarrierSlipSgw et : _mCarrierSlipSgwList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierSlipSgwList")); } } }
        if (_mCarrierSlipYmtList != null) { for (MCarrierSlipYmt et : _mCarrierSlipYmtList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierSlipYmtList")); } } }
        if (_mCarrierSlipYupkList != null) { for (MCarrierSlipYupk et : _mCarrierSlipYupkList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierSlipYupkList")); } } }
        if (_mCenterClassList != null) { for (MCenterClass et : _mCenterClassList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterClassList")); } } }
        if (_mCenterColList != null) { for (MCenterCol et : _mCenterColList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterColList")); } } }
        if (_mCenterCustomerList != null) { for (MCenterCustomer et : _mCenterCustomerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterCustomerList")); } } }
        if (_mCenterItemList != null) { for (MCenterItem et : _mCenterItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterItemList")); } } }
        if (_mCenterScreenList != null) { for (MCenterScreen et : _mCenterScreenList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterScreenList")); } } }
        if (_mClientCenterList != null) { for (MClientCenter et : _mClientCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientCenterList")); } } }
        if (_mCustomerPickingList != null) { for (MCustomerPicking et : _mCustomerPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCustomerPickingList")); } } }
        if (_mDeliveryCourseList != null) { for (MDeliveryCourse et : _mDeliveryCourseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDeliveryCourseList")); } } }
        if (_mGeneralList != null) { for (MGeneral et : _mGeneralList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mGeneralList")); } } }
        if (_mLocationList != null) { for (MLocation et : _mLocationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationList")); } } }
        if (_mNizoroeList != null) { for (MNizoroe et : _mNizoroeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mNizoroeList")); } } }
        if (_mNumberingCenterList != null) { for (MNumberingCenter et : _mNumberingCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mNumberingCenterList")); } } }
        if (_mUserCenterList != null) { for (MUserCenter et : _mUserCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserCenterList")); } } }
        if (_mUserLoginList != null) { for (MUserLogin et : _mUserLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserLoginList")); } } }
        if (_mWarehouseList != null) { for (MWarehouse et : _mWarehouseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mWarehouseList")); } } }
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
        if (_tStoreRecordHList != null) { for (TStoreRecordH et : _tStoreRecordHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHList")); } } }
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
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_cultureId));
        sb.append(dm).append(xfND(_timeZoneId));
        sb.append(dm).append(xfND(_address));
        sb.append(dm).append(xfND(_telNo));
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
        if (_bTimeZone != null)
        { sb.append(dm).append("bTimeZone"); }
        if (_bCulture != null)
        { sb.append(dm).append("bCulture"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_hLocationAttributeList != null && !_hLocationAttributeList.isEmpty())
        { sb.append(dm).append("hLocationAttributeList"); }
        if (_mBoxList != null && !_mBoxList.isEmpty())
        { sb.append(dm).append("mBoxList"); }
        if (_mBoxGrpList != null && !_mBoxGrpList.isEmpty())
        { sb.append(dm).append("mBoxGrpList"); }
        if (_mCarrierList != null && !_mCarrierList.isEmpty())
        { sb.append(dm).append("mCarrierList"); }
        if (_mCarrierSlipSgwList != null && !_mCarrierSlipSgwList.isEmpty())
        { sb.append(dm).append("mCarrierSlipSgwList"); }
        if (_mCarrierSlipYmtList != null && !_mCarrierSlipYmtList.isEmpty())
        { sb.append(dm).append("mCarrierSlipYmtList"); }
        if (_mCarrierSlipYupkList != null && !_mCarrierSlipYupkList.isEmpty())
        { sb.append(dm).append("mCarrierSlipYupkList"); }
        if (_mCenterClassList != null && !_mCenterClassList.isEmpty())
        { sb.append(dm).append("mCenterClassList"); }
        if (_mCenterColList != null && !_mCenterColList.isEmpty())
        { sb.append(dm).append("mCenterColList"); }
        if (_mCenterCustomerList != null && !_mCenterCustomerList.isEmpty())
        { sb.append(dm).append("mCenterCustomerList"); }
        if (_mCenterItemList != null && !_mCenterItemList.isEmpty())
        { sb.append(dm).append("mCenterItemList"); }
        if (_mCenterScreenList != null && !_mCenterScreenList.isEmpty())
        { sb.append(dm).append("mCenterScreenList"); }
        if (_mClientCenterList != null && !_mClientCenterList.isEmpty())
        { sb.append(dm).append("mClientCenterList"); }
        if (_mCustomerPickingList != null && !_mCustomerPickingList.isEmpty())
        { sb.append(dm).append("mCustomerPickingList"); }
        if (_mDeliveryCourseList != null && !_mDeliveryCourseList.isEmpty())
        { sb.append(dm).append("mDeliveryCourseList"); }
        if (_mGeneralList != null && !_mGeneralList.isEmpty())
        { sb.append(dm).append("mGeneralList"); }
        if (_mLocationList != null && !_mLocationList.isEmpty())
        { sb.append(dm).append("mLocationList"); }
        if (_mNizoroeList != null && !_mNizoroeList.isEmpty())
        { sb.append(dm).append("mNizoroeList"); }
        if (_mNumberingCenterList != null && !_mNumberingCenterList.isEmpty())
        { sb.append(dm).append("mNumberingCenterList"); }
        if (_mUserCenterList != null && !_mUserCenterList.isEmpty())
        { sb.append(dm).append("mUserCenterList"); }
        if (_mUserLoginList != null && !_mUserLoginList.isEmpty())
        { sb.append(dm).append("mUserLoginList"); }
        if (_mWarehouseList != null && !_mWarehouseList.isEmpty())
        { sb.append(dm).append("mWarehouseList"); }
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
        if (_tStoreRecordHList != null && !_tStoreRecordHList.isEmpty())
        { sb.append(dm).append("tStoreRecordHList"); }
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
    public MCenter clone() {
        return (MCenter)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {NotNull, VARCHAR(60)} <br>
     * センタ名称
     * @return The value of the column 'CENTER_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {NotNull, VARCHAR(60)} <br>
     * センタ名称
     * @param centerNm The value of the column 'CENTER_NM'. (basically NotNull if update: for the constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] CENTER_ABBR: {VARCHAR(60)} <br>
     * センタ略称
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterAbbr() {
        checkSpecifiedProperty("centerAbbr");
        return convertEmptyToNull(_centerAbbr);
    }

    /**
     * [set] CENTER_ABBR: {VARCHAR(60)} <br>
     * センタ略称
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterAbbr(String centerAbbr) {
        registerModifiedProperty("centerAbbr");
        _centerAbbr = centerAbbr;
    }

    /**
     * [get] CULTURE_ID: {IX, BIGINT(19), FK to b_culture} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCultureId() {
        checkSpecifiedProperty("cultureId");
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {IX, BIGINT(19), FK to b_culture} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCultureId(Long cultureId) {
        registerModifiedProperty("cultureId");
        _cultureId = cultureId;
    }

    /**
     * [get] TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone} <br>
     * タイムゾーンID
     * @return The value of the column 'TIME_ZONE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTimeZoneId() {
        checkSpecifiedProperty("timeZoneId");
        return _timeZoneId;
    }

    /**
     * [set] TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone} <br>
     * タイムゾーンID
     * @param timeZoneId The value of the column 'TIME_ZONE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimeZoneId(Long timeZoneId) {
        registerModifiedProperty("timeZoneId");
        _timeZoneId = timeZoneId;
    }

    /**
     * [get] ADDRESS: {VARCHAR(255)} <br>
     * 住所
     * @return The value of the column 'ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress() {
        checkSpecifiedProperty("address");
        return convertEmptyToNull(_address);
    }

    /**
     * [set] ADDRESS: {VARCHAR(255)} <br>
     * 住所
     * @param address The value of the column 'ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress(String address) {
        registerModifiedProperty("address");
        _address = address;
    }

    /**
     * [get] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @return The value of the column 'TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTelNo() {
        checkSpecifiedProperty("telNo");
        return convertEmptyToNull(_telNo);
    }

    /**
     * [set] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo(String telNo) {
        registerModifiedProperty("telNo");
        _telNo = telNo;
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
