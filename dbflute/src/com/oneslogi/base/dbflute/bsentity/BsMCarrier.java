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
 * The entity of m_carrier as TABLE. <br>
 * センタ運送業者マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_ID
 *
 * [column]
 *     CARRIER_ID, CENTER_ID, COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, LARGE_ITEM_HADLING_FLG, HEAVY_ITEM_HADLING_FLG, HOLIDAY_CARRIER_FLG, OKINAWA_FLIGHT_FLG, BASE_DEFAULT_CARRIER_FLG, INSURANCE_CARRIER_CD, SLIP_TYPE_CD, BASE_CD, PROPER_FLG, LANE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, m_common_carrier, b_class_dtl(ByDelFlg)
 *
 * [referrer table]
 *     m_base_sales_org, m_carrier_box, m_carrier_decision, m_delivery_course, m_koguchi_delivery
 *
 * [foreign property]
 *     mCenter, mCommonCarrier, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBaseSalesOrgList, mCarrierBoxList, mCarrierDecisionByCarrierId2List, mCarrierDecisionByCarrierId1List, mCarrierDecisionByCarrierId3List, mCarrierDecisionByCarrierIdList, mDeliveryCourseList, mKoguchiDeliveryList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long carrierId = entity.getCarrierId();
 * Long centerId = entity.getCenterId();
 * Long commonCarrierId = entity.getCommonCarrierId();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String carrierAbbr = entity.getCarrierAbbr();
 * String largeItemHadlingFlg = entity.getLargeItemHadlingFlg();
 * String heavyItemHadlingFlg = entity.getHeavyItemHadlingFlg();
 * String holidayCarrierFlg = entity.getHolidayCarrierFlg();
 * String okinawaFlightFlg = entity.getOkinawaFlightFlg();
 * String baseDefaultCarrierFlg = entity.getBaseDefaultCarrierFlg();
 * String insuranceCarrierCd = entity.getInsuranceCarrierCd();
 * String slipTypeCd = entity.getSlipTypeCd();
 * String baseCd = entity.getBaseCd();
 * String properFlg = entity.getProperFlg();
 * String laneCd = entity.getLaneCd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCarrierId(carrierId);
 * entity.setCenterId(centerId);
 * entity.setCommonCarrierId(commonCarrierId);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setCarrierAbbr(carrierAbbr);
 * entity.setLargeItemHadlingFlg(largeItemHadlingFlg);
 * entity.setHeavyItemHadlingFlg(heavyItemHadlingFlg);
 * entity.setHolidayCarrierFlg(holidayCarrierFlg);
 * entity.setOkinawaFlightFlg(okinawaFlightFlg);
 * entity.setBaseDefaultCarrierFlg(baseDefaultCarrierFlg);
 * entity.setInsuranceCarrierCd(insuranceCarrierCd);
 * entity.setSlipTypeCd(slipTypeCd);
 * entity.setBaseCd(baseCd);
 * entity.setProperFlg(properFlg);
 * entity.setLaneCd(laneCd);
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
public abstract class BsMCarrier extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CARRIER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _carrierId;

    /** CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier} */
    protected Long _commonCarrierId;

    /** CARRIER_CD: {+UQ, IX, VARCHAR(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    protected String _carrierNm;

    /** CARRIER_ABBR: {VARCHAR(60)} */
    protected String _carrierAbbr;

    /** LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _largeItemHadlingFlg;

    /** HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _heavyItemHadlingFlg;

    /** HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _holidayCarrierFlg;

    /** OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _okinawaFlightFlg;

    /** BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _baseDefaultCarrierFlg;

    /** INSURANCE_CARRIER_CD: {VARCHAR(30)} */
    protected String _insuranceCarrierCd;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    protected String _slipTypeCd;

    /** BASE_CD: {VARCHAR(30)} */
    protected String _baseCd;

    /** PROPER_FLG: {CHAR(1)} */
    protected String _properFlg;

    /** LANE_CD: {VARCHAR(30)} */
    protected String _laneCd;

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
        return "m_carrier";
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
        if (_carrierId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerId : UQ+, NotNull, BIGINT(19), FK to m_center. (NotNull)
     * @param carrierCd : +UQ, IX, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(Long centerId, String carrierCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("carrierCd");
        setCenterId(centerId);setCarrierCd(carrierCd);
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
    /** m_center by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] m_center by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] m_center by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** m_common_carrier by my COMMON_CARRIER_ID, named 'MCommonCarrier'. */
    protected MCommonCarrier _mCommonCarrier;

    /**
     * [get] m_common_carrier by my COMMON_CARRIER_ID, named 'MCommonCarrier'. <br>
     * @return The entity of foreign property 'MCommonCarrier'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCommonCarrier getMCommonCarrier() {
        return _mCommonCarrier;
    }

    /**
     * [set] m_common_carrier by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @param mCommonCarrier The entity of foreign property 'MCommonCarrier'. (NullAllowed)
     */
    public void setMCommonCarrier(MCommonCarrier mCommonCarrier) {
        _mCommonCarrier = mCommonCarrier;
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
    /** m_base_sales_org by CARRIER_ID, named 'MBaseSalesOrgList'. */
    protected List<MBaseSalesOrg> _mBaseSalesOrgList;

    /**
     * [get] m_base_sales_org by CARRIER_ID, named 'MBaseSalesOrgList'.
     * @return The entity list of referrer property 'MBaseSalesOrgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBaseSalesOrg> getMBaseSalesOrgList() {
        if (_mBaseSalesOrgList == null) { _mBaseSalesOrgList = newReferrerList(); }
        return _mBaseSalesOrgList;
    }

    /**
     * [set] m_base_sales_org by CARRIER_ID, named 'MBaseSalesOrgList'.
     * @param mBaseSalesOrgList The entity list of referrer property 'MBaseSalesOrgList'. (NullAllowed)
     */
    public void setMBaseSalesOrgList(List<MBaseSalesOrg> mBaseSalesOrgList) {
        _mBaseSalesOrgList = mBaseSalesOrgList;
    }

    /** m_carrier_box by CARRIER_ID, named 'MCarrierBoxList'. */
    protected List<MCarrierBox> _mCarrierBoxList;

    /**
     * [get] m_carrier_box by CARRIER_ID, named 'MCarrierBoxList'.
     * @return The entity list of referrer property 'MCarrierBoxList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierBox> getMCarrierBoxList() {
        if (_mCarrierBoxList == null) { _mCarrierBoxList = newReferrerList(); }
        return _mCarrierBoxList;
    }

    /**
     * [set] m_carrier_box by CARRIER_ID, named 'MCarrierBoxList'.
     * @param mCarrierBoxList The entity list of referrer property 'MCarrierBoxList'. (NullAllowed)
     */
    public void setMCarrierBoxList(List<MCarrierBox> mCarrierBoxList) {
        _mCarrierBoxList = mCarrierBoxList;
    }

    /** m_carrier_decision by CARRIER_ID2, named 'MCarrierDecisionByCarrierId2List'. */
    protected List<MCarrierDecision> _mCarrierDecisionByCarrierId2List;

    /**
     * [get] m_carrier_decision by CARRIER_ID2, named 'MCarrierDecisionByCarrierId2List'.
     * @return The entity list of referrer property 'MCarrierDecisionByCarrierId2List'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierDecision> getMCarrierDecisionByCarrierId2List() {
        if (_mCarrierDecisionByCarrierId2List == null) { _mCarrierDecisionByCarrierId2List = newReferrerList(); }
        return _mCarrierDecisionByCarrierId2List;
    }

    /**
     * [set] m_carrier_decision by CARRIER_ID2, named 'MCarrierDecisionByCarrierId2List'.
     * @param mCarrierDecisionByCarrierId2List The entity list of referrer property 'MCarrierDecisionByCarrierId2List'. (NullAllowed)
     */
    public void setMCarrierDecisionByCarrierId2List(List<MCarrierDecision> mCarrierDecisionByCarrierId2List) {
        _mCarrierDecisionByCarrierId2List = mCarrierDecisionByCarrierId2List;
    }

    /** m_carrier_decision by CARRIER_ID1, named 'MCarrierDecisionByCarrierId1List'. */
    protected List<MCarrierDecision> _mCarrierDecisionByCarrierId1List;

    /**
     * [get] m_carrier_decision by CARRIER_ID1, named 'MCarrierDecisionByCarrierId1List'.
     * @return The entity list of referrer property 'MCarrierDecisionByCarrierId1List'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierDecision> getMCarrierDecisionByCarrierId1List() {
        if (_mCarrierDecisionByCarrierId1List == null) { _mCarrierDecisionByCarrierId1List = newReferrerList(); }
        return _mCarrierDecisionByCarrierId1List;
    }

    /**
     * [set] m_carrier_decision by CARRIER_ID1, named 'MCarrierDecisionByCarrierId1List'.
     * @param mCarrierDecisionByCarrierId1List The entity list of referrer property 'MCarrierDecisionByCarrierId1List'. (NullAllowed)
     */
    public void setMCarrierDecisionByCarrierId1List(List<MCarrierDecision> mCarrierDecisionByCarrierId1List) {
        _mCarrierDecisionByCarrierId1List = mCarrierDecisionByCarrierId1List;
    }

    /** m_carrier_decision by CARRIER_ID3, named 'MCarrierDecisionByCarrierId3List'. */
    protected List<MCarrierDecision> _mCarrierDecisionByCarrierId3List;

    /**
     * [get] m_carrier_decision by CARRIER_ID3, named 'MCarrierDecisionByCarrierId3List'.
     * @return The entity list of referrer property 'MCarrierDecisionByCarrierId3List'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierDecision> getMCarrierDecisionByCarrierId3List() {
        if (_mCarrierDecisionByCarrierId3List == null) { _mCarrierDecisionByCarrierId3List = newReferrerList(); }
        return _mCarrierDecisionByCarrierId3List;
    }

    /**
     * [set] m_carrier_decision by CARRIER_ID3, named 'MCarrierDecisionByCarrierId3List'.
     * @param mCarrierDecisionByCarrierId3List The entity list of referrer property 'MCarrierDecisionByCarrierId3List'. (NullAllowed)
     */
    public void setMCarrierDecisionByCarrierId3List(List<MCarrierDecision> mCarrierDecisionByCarrierId3List) {
        _mCarrierDecisionByCarrierId3List = mCarrierDecisionByCarrierId3List;
    }

    /** m_carrier_decision by CARRIER_ID, named 'MCarrierDecisionByCarrierIdList'. */
    protected List<MCarrierDecision> _mCarrierDecisionByCarrierIdList;

    /**
     * [get] m_carrier_decision by CARRIER_ID, named 'MCarrierDecisionByCarrierIdList'.
     * @return The entity list of referrer property 'MCarrierDecisionByCarrierIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierDecision> getMCarrierDecisionByCarrierIdList() {
        if (_mCarrierDecisionByCarrierIdList == null) { _mCarrierDecisionByCarrierIdList = newReferrerList(); }
        return _mCarrierDecisionByCarrierIdList;
    }

    /**
     * [set] m_carrier_decision by CARRIER_ID, named 'MCarrierDecisionByCarrierIdList'.
     * @param mCarrierDecisionByCarrierIdList The entity list of referrer property 'MCarrierDecisionByCarrierIdList'. (NullAllowed)
     */
    public void setMCarrierDecisionByCarrierIdList(List<MCarrierDecision> mCarrierDecisionByCarrierIdList) {
        _mCarrierDecisionByCarrierIdList = mCarrierDecisionByCarrierIdList;
    }

    /** m_delivery_course by CARRIER_ID, named 'MDeliveryCourseList'. */
    protected List<MDeliveryCourse> _mDeliveryCourseList;

    /**
     * [get] m_delivery_course by CARRIER_ID, named 'MDeliveryCourseList'.
     * @return The entity list of referrer property 'MDeliveryCourseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDeliveryCourse> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = newReferrerList(); }
        return _mDeliveryCourseList;
    }

    /**
     * [set] m_delivery_course by CARRIER_ID, named 'MDeliveryCourseList'.
     * @param mDeliveryCourseList The entity list of referrer property 'MDeliveryCourseList'. (NullAllowed)
     */
    public void setMDeliveryCourseList(List<MDeliveryCourse> mDeliveryCourseList) {
        _mDeliveryCourseList = mDeliveryCourseList;
    }

    /** m_koguchi_delivery by CARRIER_ID, named 'MKoguchiDeliveryList'. */
    protected List<MKoguchiDelivery> _mKoguchiDeliveryList;

    /**
     * [get] m_koguchi_delivery by CARRIER_ID, named 'MKoguchiDeliveryList'.
     * @return The entity list of referrer property 'MKoguchiDeliveryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MKoguchiDelivery> getMKoguchiDeliveryList() {
        if (_mKoguchiDeliveryList == null) { _mKoguchiDeliveryList = newReferrerList(); }
        return _mKoguchiDeliveryList;
    }

    /**
     * [set] m_koguchi_delivery by CARRIER_ID, named 'MKoguchiDeliveryList'.
     * @param mKoguchiDeliveryList The entity list of referrer property 'MKoguchiDeliveryList'. (NullAllowed)
     */
    public void setMKoguchiDeliveryList(List<MKoguchiDelivery> mKoguchiDeliveryList) {
        _mKoguchiDeliveryList = mKoguchiDeliveryList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCarrier) {
            BsMCarrier other = (BsMCarrier)obj;
            if (!xSV(_carrierId, other._carrierId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _carrierId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mCommonCarrier != null)
        { sb.append(li).append(xbRDS(_mCommonCarrier, "mCommonCarrier")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mBaseSalesOrgList != null) { for (MBaseSalesOrg et : _mBaseSalesOrgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBaseSalesOrgList")); } } }
        if (_mCarrierBoxList != null) { for (MCarrierBox et : _mCarrierBoxList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierBoxList")); } } }
        if (_mCarrierDecisionByCarrierId2List != null) { for (MCarrierDecision et : _mCarrierDecisionByCarrierId2List)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierDecisionByCarrierId2List")); } } }
        if (_mCarrierDecisionByCarrierId1List != null) { for (MCarrierDecision et : _mCarrierDecisionByCarrierId1List)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierDecisionByCarrierId1List")); } } }
        if (_mCarrierDecisionByCarrierId3List != null) { for (MCarrierDecision et : _mCarrierDecisionByCarrierId3List)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierDecisionByCarrierId3List")); } } }
        if (_mCarrierDecisionByCarrierIdList != null) { for (MCarrierDecision et : _mCarrierDecisionByCarrierIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierDecisionByCarrierIdList")); } } }
        if (_mDeliveryCourseList != null) { for (MDeliveryCourse et : _mDeliveryCourseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDeliveryCourseList")); } } }
        if (_mKoguchiDeliveryList != null) { for (MKoguchiDelivery et : _mKoguchiDeliveryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mKoguchiDeliveryList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_carrierId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_commonCarrierId));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_carrierAbbr));
        sb.append(dm).append(xfND(_largeItemHadlingFlg));
        sb.append(dm).append(xfND(_heavyItemHadlingFlg));
        sb.append(dm).append(xfND(_holidayCarrierFlg));
        sb.append(dm).append(xfND(_okinawaFlightFlg));
        sb.append(dm).append(xfND(_baseDefaultCarrierFlg));
        sb.append(dm).append(xfND(_insuranceCarrierCd));
        sb.append(dm).append(xfND(_slipTypeCd));
        sb.append(dm).append(xfND(_baseCd));
        sb.append(dm).append(xfND(_properFlg));
        sb.append(dm).append(xfND(_laneCd));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mCommonCarrier != null)
        { sb.append(dm).append("mCommonCarrier"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mBaseSalesOrgList != null && !_mBaseSalesOrgList.isEmpty())
        { sb.append(dm).append("mBaseSalesOrgList"); }
        if (_mCarrierBoxList != null && !_mCarrierBoxList.isEmpty())
        { sb.append(dm).append("mCarrierBoxList"); }
        if (_mCarrierDecisionByCarrierId2List != null && !_mCarrierDecisionByCarrierId2List.isEmpty())
        { sb.append(dm).append("mCarrierDecisionByCarrierId2List"); }
        if (_mCarrierDecisionByCarrierId1List != null && !_mCarrierDecisionByCarrierId1List.isEmpty())
        { sb.append(dm).append("mCarrierDecisionByCarrierId1List"); }
        if (_mCarrierDecisionByCarrierId3List != null && !_mCarrierDecisionByCarrierId3List.isEmpty())
        { sb.append(dm).append("mCarrierDecisionByCarrierId3List"); }
        if (_mCarrierDecisionByCarrierIdList != null && !_mCarrierDecisionByCarrierIdList.isEmpty())
        { sb.append(dm).append("mCarrierDecisionByCarrierIdList"); }
        if (_mDeliveryCourseList != null && !_mDeliveryCourseList.isEmpty())
        { sb.append(dm).append("mDeliveryCourseList"); }
        if (_mKoguchiDeliveryList != null && !_mKoguchiDeliveryList.isEmpty())
        { sb.append(dm).append("mKoguchiDeliveryList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCarrier clone() {
        return (MCarrier)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CARRIER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 運送業者ID
     * @return The value of the column 'CARRIER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCarrierId() {
        checkSpecifiedProperty("carrierId");
        return _carrierId;
    }

    /**
     * [set] CARRIER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 運送業者ID
     * @param carrierId The value of the column 'CARRIER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierId(Long carrierId) {
        registerModifiedProperty("carrierId");
        _carrierId = carrierId;
    }

    /**
     * [get] CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier} <br>
     * 共通運送業者ID
     * @return The value of the column 'COMMON_CARRIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCommonCarrierId() {
        checkSpecifiedProperty("commonCarrierId");
        return _commonCarrierId;
    }

    /**
     * [set] COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier} <br>
     * 共通運送業者ID
     * @param commonCarrierId The value of the column 'COMMON_CARRIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCommonCarrierId(Long commonCarrierId) {
        registerModifiedProperty("commonCarrierId");
        _commonCarrierId = commonCarrierId;
    }

    /**
     * [get] CARRIER_CD: {+UQ, IX, VARCHAR(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {+UQ, IX, VARCHAR(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {VARCHAR(60)} <br>
     * 運送業者名称
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(60)} <br>
     * 運送業者名称
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] CARRIER_ABBR: {VARCHAR(60)} <br>
     * 運送業者略称
     * @return The value of the column 'CARRIER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierAbbr() {
        checkSpecifiedProperty("carrierAbbr");
        return convertEmptyToNull(_carrierAbbr);
    }

    /**
     * [set] CARRIER_ABBR: {VARCHAR(60)} <br>
     * 運送業者略称
     * @param carrierAbbr The value of the column 'CARRIER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierAbbr(String carrierAbbr) {
        registerModifiedProperty("carrierAbbr");
        _carrierAbbr = carrierAbbr;
    }

    /**
     * [get] LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 大物取扱フラグ
     * @return The value of the column 'LARGE_ITEM_HADLING_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getLargeItemHadlingFlg() {
        checkSpecifiedProperty("largeItemHadlingFlg");
        return convertEmptyToNull(_largeItemHadlingFlg);
    }

    /**
     * [set] LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 大物取扱フラグ
     * @param largeItemHadlingFlg The value of the column 'LARGE_ITEM_HADLING_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLargeItemHadlingFlg(String largeItemHadlingFlg) {
        registerModifiedProperty("largeItemHadlingFlg");
        _largeItemHadlingFlg = largeItemHadlingFlg;
    }

    /**
     * [get] HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 重量取扱フラグ
     * @return The value of the column 'HEAVY_ITEM_HADLING_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getHeavyItemHadlingFlg() {
        checkSpecifiedProperty("heavyItemHadlingFlg");
        return convertEmptyToNull(_heavyItemHadlingFlg);
    }

    /**
     * [set] HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 重量取扱フラグ
     * @param heavyItemHadlingFlg The value of the column 'HEAVY_ITEM_HADLING_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setHeavyItemHadlingFlg(String heavyItemHadlingFlg) {
        registerModifiedProperty("heavyItemHadlingFlg");
        _heavyItemHadlingFlg = heavyItemHadlingFlg;
    }

    /**
     * [get] HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 休日振替運送業者フラグ
     * @return The value of the column 'HOLIDAY_CARRIER_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getHolidayCarrierFlg() {
        checkSpecifiedProperty("holidayCarrierFlg");
        return convertEmptyToNull(_holidayCarrierFlg);
    }

    /**
     * [set] HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 休日振替運送業者フラグ
     * @param holidayCarrierFlg The value of the column 'HOLIDAY_CARRIER_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setHolidayCarrierFlg(String holidayCarrierFlg) {
        registerModifiedProperty("holidayCarrierFlg");
        _holidayCarrierFlg = holidayCarrierFlg;
    }

    /**
     * [get] OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 沖縄航空便振替フラグ
     * @return The value of the column 'OKINAWA_FLIGHT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getOkinawaFlightFlg() {
        checkSpecifiedProperty("okinawaFlightFlg");
        return convertEmptyToNull(_okinawaFlightFlg);
    }

    /**
     * [set] OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 沖縄航空便振替フラグ
     * @param okinawaFlightFlg The value of the column 'OKINAWA_FLIGHT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setOkinawaFlightFlg(String okinawaFlightFlg) {
        registerModifiedProperty("okinawaFlightFlg");
        _okinawaFlightFlg = okinawaFlightFlg;
    }

    /**
     * [get] BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 拠点デフォルト運送業者フラグ
     * @return The value of the column 'BASE_DEFAULT_CARRIER_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getBaseDefaultCarrierFlg() {
        checkSpecifiedProperty("baseDefaultCarrierFlg");
        return convertEmptyToNull(_baseDefaultCarrierFlg);
    }

    /**
     * [set] BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 拠点デフォルト運送業者フラグ
     * @param baseDefaultCarrierFlg The value of the column 'BASE_DEFAULT_CARRIER_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setBaseDefaultCarrierFlg(String baseDefaultCarrierFlg) {
        registerModifiedProperty("baseDefaultCarrierFlg");
        _baseDefaultCarrierFlg = baseDefaultCarrierFlg;
    }

    /**
     * [get] INSURANCE_CARRIER_CD: {VARCHAR(30)} <br>
     * 保険品振替業者CD
     * @return The value of the column 'INSURANCE_CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsuranceCarrierCd() {
        checkSpecifiedProperty("insuranceCarrierCd");
        return convertEmptyToNull(_insuranceCarrierCd);
    }

    /**
     * [set] INSURANCE_CARRIER_CD: {VARCHAR(30)} <br>
     * 保険品振替業者CD
     * @param insuranceCarrierCd The value of the column 'INSURANCE_CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsuranceCarrierCd(String insuranceCarrierCd) {
        registerModifiedProperty("insuranceCarrierCd");
        _insuranceCarrierCd = insuranceCarrierCd;
    }

    /**
     * [get] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受渡表区分
     * @return The value of the column 'SLIP_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipTypeCd() {
        checkSpecifiedProperty("slipTypeCd");
        return convertEmptyToNull(_slipTypeCd);
    }

    /**
     * [set] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受渡表区分
     * @param slipTypeCd The value of the column 'SLIP_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipTypeCd(String slipTypeCd) {
        registerModifiedProperty("slipTypeCd");
        _slipTypeCd = slipTypeCd;
    }

    /**
     * [get] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'BASE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseCd() {
        checkSpecifiedProperty("baseCd");
        return convertEmptyToNull(_baseCd);
    }

    /**
     * [set] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param baseCd The value of the column 'BASE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseCd(String baseCd) {
        registerModifiedProperty("baseCd");
        _baseCd = baseCd;
    }

    /**
     * [get] PROPER_FLG: {CHAR(1)} <br>
     * 正規フラグ
     * @return The value of the column 'PROPER_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getProperFlg() {
        checkSpecifiedProperty("properFlg");
        return convertEmptyToNull(_properFlg);
    }

    /**
     * [set] PROPER_FLG: {CHAR(1)} <br>
     * 正規フラグ
     * @param properFlg The value of the column 'PROPER_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProperFlg(String properFlg) {
        registerModifiedProperty("properFlg");
        _properFlg = properFlg;
    }

    /**
     * [get] LANE_CD: {VARCHAR(30)} <br>
     * レーンCD
     * @return The value of the column 'LANE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLaneCd() {
        checkSpecifiedProperty("laneCd");
        return convertEmptyToNull(_laneCd);
    }

    /**
     * [set] LANE_CD: {VARCHAR(30)} <br>
     * レーンCD
     * @param laneCd The value of the column 'LANE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLaneCd(String laneCd) {
        registerModifiedProperty("laneCd");
        _laneCd = laneCd;
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
