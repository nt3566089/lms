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
 * The entity of m_carrier_decision as TABLE. <br>
 * 運送業者決定マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_DECISION_ID
 *
 * [column]
 *     CARRIER_DECISION_ID, CENTER_CD, ZIP_CD, SALES_ORG_ID, SALES_ORG_CD, CUSTOMER_ID, CUSTOMER_CD, DIRECT_KOHAI_TYPE_CD, PREFECTURE, CARRIER_ID, CARRIER_CD, CARRIER_ID1, CARRIER_CD1, CARRIER_ID2, CARRIER_CD2, CARRIER_ID3, CARRIER_CD3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_DECISION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_customer, m_carrier, m_sales_org
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, mCarrierByCarrierId2, mCarrierByCarrierId1, mCarrierByCarrierId3, mCarrierByCarrierId, mSalesOrg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long carrierDecisionId = entity.getCarrierDecisionId();
 * String centerCd = entity.getCenterCd();
 * String zipCd = entity.getZipCd();
 * Long salesOrgId = entity.getSalesOrgId();
 * String salesOrgCd = entity.getSalesOrgCd();
 * Long customerId = entity.getCustomerId();
 * String customerCd = entity.getCustomerCd();
 * String directKohaiTypeCd = entity.getDirectKohaiTypeCd();
 * String prefecture = entity.getPrefecture();
 * Long carrierId = entity.getCarrierId();
 * String carrierCd = entity.getCarrierCd();
 * Long carrierId1 = entity.getCarrierId1();
 * String carrierCd1 = entity.getCarrierCd1();
 * Long carrierId2 = entity.getCarrierId2();
 * String carrierCd2 = entity.getCarrierCd2();
 * Long carrierId3 = entity.getCarrierId3();
 * String carrierCd3 = entity.getCarrierCd3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCarrierDecisionId(carrierDecisionId);
 * entity.setCenterCd(centerCd);
 * entity.setZipCd(zipCd);
 * entity.setSalesOrgId(salesOrgId);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setCustomerId(customerId);
 * entity.setCustomerCd(customerCd);
 * entity.setDirectKohaiTypeCd(directKohaiTypeCd);
 * entity.setPrefecture(prefecture);
 * entity.setCarrierId(carrierId);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierId1(carrierId1);
 * entity.setCarrierCd1(carrierCd1);
 * entity.setCarrierId2(carrierId2);
 * entity.setCarrierCd2(carrierCd2);
 * entity.setCarrierId3(carrierId3);
 * entity.setCarrierCd3(carrierCd3);
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
public abstract class BsMCarrierDecision extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _carrierDecisionId;

    /** CENTER_CD: {VARCHAR(30)} */
    protected String _centerCd;

    /** ZIP_CD: {IX, VARCHAR(30)} */
    protected String _zipCd;

    /** SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} */
    protected Long _salesOrgId;

    /** SALES_ORG_CD: {IX+, VARCHAR(30)} */
    protected String _salesOrgCd;

    /** CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _customerId;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    protected String _customerCd;

    /** DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)} */
    protected String _directKohaiTypeCd;

    /** PREFECTURE: {VARCHAR(60)} */
    protected String _prefecture;

    /** CARRIER_ID: {IX, BIGINT(19), FK to m_carrier} */
    protected Long _carrierId;

    /** CARRIER_CD: {VARCHAR(30)} */
    protected String _carrierCd;

    /** CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier} */
    protected Long _carrierId1;

    /** CARRIER_CD1: {VARCHAR(30)} */
    protected String _carrierCd1;

    /** CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier} */
    protected Long _carrierId2;

    /** CARRIER_CD2: {VARCHAR(30)} */
    protected String _carrierCd2;

    /** CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier} */
    protected Long _carrierId3;

    /** CARRIER_CD3: {VARCHAR(30)} */
    protected String _carrierCd3;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
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
        return "m_carrier_decision";
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
        if (_carrierDecisionId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
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

    /** m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'. */
    protected MCarrier _mCarrierByCarrierId2;

    /**
     * [get] m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'. <br>
     * @return The entity of foreign property 'MCarrierByCarrierId2'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCarrier getMCarrierByCarrierId2() {
        return _mCarrierByCarrierId2;
    }

    /**
     * [set] m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'.
     * @param mCarrierByCarrierId2 The entity of foreign property 'MCarrierByCarrierId2'. (NullAllowed)
     */
    public void setMCarrierByCarrierId2(MCarrier mCarrierByCarrierId2) {
        _mCarrierByCarrierId2 = mCarrierByCarrierId2;
    }

    /** m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'. */
    protected MCarrier _mCarrierByCarrierId1;

    /**
     * [get] m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'. <br>
     * @return The entity of foreign property 'MCarrierByCarrierId1'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCarrier getMCarrierByCarrierId1() {
        return _mCarrierByCarrierId1;
    }

    /**
     * [set] m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'.
     * @param mCarrierByCarrierId1 The entity of foreign property 'MCarrierByCarrierId1'. (NullAllowed)
     */
    public void setMCarrierByCarrierId1(MCarrier mCarrierByCarrierId1) {
        _mCarrierByCarrierId1 = mCarrierByCarrierId1;
    }

    /** m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'. */
    protected MCarrier _mCarrierByCarrierId3;

    /**
     * [get] m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'. <br>
     * @return The entity of foreign property 'MCarrierByCarrierId3'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCarrier getMCarrierByCarrierId3() {
        return _mCarrierByCarrierId3;
    }

    /**
     * [set] m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'.
     * @param mCarrierByCarrierId3 The entity of foreign property 'MCarrierByCarrierId3'. (NullAllowed)
     */
    public void setMCarrierByCarrierId3(MCarrier mCarrierByCarrierId3) {
        _mCarrierByCarrierId3 = mCarrierByCarrierId3;
    }

    /** m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'. */
    protected MCarrier _mCarrierByCarrierId;

    /**
     * [get] m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'. <br>
     * @return The entity of foreign property 'MCarrierByCarrierId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCarrier getMCarrierByCarrierId() {
        return _mCarrierByCarrierId;
    }

    /**
     * [set] m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'.
     * @param mCarrierByCarrierId The entity of foreign property 'MCarrierByCarrierId'. (NullAllowed)
     */
    public void setMCarrierByCarrierId(MCarrier mCarrierByCarrierId) {
        _mCarrierByCarrierId = mCarrierByCarrierId;
    }

    /** m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'. */
    protected MSalesOrg _mSalesOrg;

    /**
     * [get] m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'. <br>
     * @return The entity of foreign property 'MSalesOrg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MSalesOrg getMSalesOrg() {
        return _mSalesOrg;
    }

    /**
     * [set] m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * @param mSalesOrg The entity of foreign property 'MSalesOrg'. (NullAllowed)
     */
    public void setMSalesOrg(MSalesOrg mSalesOrg) {
        _mSalesOrg = mSalesOrg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCarrierDecision) {
            BsMCarrierDecision other = (BsMCarrierDecision)obj;
            if (!xSV(_carrierDecisionId, other._carrierDecisionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _carrierDecisionId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_mCarrierByCarrierId2 != null)
        { sb.append(li).append(xbRDS(_mCarrierByCarrierId2, "mCarrierByCarrierId2")); }
        if (_mCarrierByCarrierId1 != null)
        { sb.append(li).append(xbRDS(_mCarrierByCarrierId1, "mCarrierByCarrierId1")); }
        if (_mCarrierByCarrierId3 != null)
        { sb.append(li).append(xbRDS(_mCarrierByCarrierId3, "mCarrierByCarrierId3")); }
        if (_mCarrierByCarrierId != null)
        { sb.append(li).append(xbRDS(_mCarrierByCarrierId, "mCarrierByCarrierId")); }
        if (_mSalesOrg != null)
        { sb.append(li).append(xbRDS(_mSalesOrg, "mSalesOrg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_carrierDecisionId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_zipCd));
        sb.append(dm).append(xfND(_salesOrgId));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_customerId));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_directKohaiTypeCd));
        sb.append(dm).append(xfND(_prefecture));
        sb.append(dm).append(xfND(_carrierId));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierId1));
        sb.append(dm).append(xfND(_carrierCd1));
        sb.append(dm).append(xfND(_carrierId2));
        sb.append(dm).append(xfND(_carrierCd2));
        sb.append(dm).append(xfND(_carrierId3));
        sb.append(dm).append(xfND(_carrierCd3));
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
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_mCarrierByCarrierId2 != null)
        { sb.append(dm).append("mCarrierByCarrierId2"); }
        if (_mCarrierByCarrierId1 != null)
        { sb.append(dm).append("mCarrierByCarrierId1"); }
        if (_mCarrierByCarrierId3 != null)
        { sb.append(dm).append("mCarrierByCarrierId3"); }
        if (_mCarrierByCarrierId != null)
        { sb.append(dm).append("mCarrierByCarrierId"); }
        if (_mSalesOrg != null)
        { sb.append(dm).append("mSalesOrg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCarrierDecision clone() {
        return (MCarrierDecision)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 運送業者決定ID
     * @return The value of the column 'CARRIER_DECISION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCarrierDecisionId() {
        checkSpecifiedProperty("carrierDecisionId");
        return _carrierDecisionId;
    }

    /**
     * [set] CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 運送業者決定ID
     * @param carrierDecisionId The value of the column 'CARRIER_DECISION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierDecisionId(Long carrierDecisionId) {
        registerModifiedProperty("carrierDecisionId");
        _carrierDecisionId = carrierDecisionId;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] ZIP_CD: {IX, VARCHAR(30)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd() {
        checkSpecifiedProperty("zipCd");
        return convertEmptyToNull(_zipCd);
    }

    /**
     * [set] ZIP_CD: {IX, VARCHAR(30)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd(String zipCd) {
        registerModifiedProperty("zipCd");
        _zipCd = zipCd;
    }

    /**
     * [get] SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSalesOrgId() {
        checkSpecifiedProperty("salesOrgId");
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgId(Long salesOrgId) {
        registerModifiedProperty("salesOrgId");
        _salesOrgId = salesOrgId;
    }

    /**
     * [get] SALES_ORG_CD: {IX+, VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {IX+, VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCustomerId() {
        checkSpecifiedProperty("customerId");
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerId(Long customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)} <br>
     * 直送・戸配区分
     * @return The value of the column 'DIRECT_KOHAI_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectKohaiTypeCd() {
        checkSpecifiedProperty("directKohaiTypeCd");
        return convertEmptyToNull(_directKohaiTypeCd);
    }

    /**
     * [set] DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)} <br>
     * 直送・戸配区分
     * @param directKohaiTypeCd The value of the column 'DIRECT_KOHAI_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectKohaiTypeCd(String directKohaiTypeCd) {
        registerModifiedProperty("directKohaiTypeCd");
        _directKohaiTypeCd = directKohaiTypeCd;
    }

    /**
     * [get] PREFECTURE: {VARCHAR(60)} <br>
     * 都道府県
     * @return The value of the column 'PREFECTURE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrefecture() {
        checkSpecifiedProperty("prefecture");
        return convertEmptyToNull(_prefecture);
    }

    /**
     * [set] PREFECTURE: {VARCHAR(60)} <br>
     * 都道府県
     * @param prefecture The value of the column 'PREFECTURE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrefecture(String prefecture) {
        registerModifiedProperty("prefecture");
        _prefecture = prefecture;
    }

    /**
     * [get] CARRIER_ID: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID
     * @return The value of the column 'CARRIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarrierId() {
        checkSpecifiedProperty("carrierId");
        return _carrierId;
    }

    /**
     * [set] CARRIER_ID: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID
     * @param carrierId The value of the column 'CARRIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierId(Long carrierId) {
        registerModifiedProperty("carrierId");
        _carrierId = carrierId;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(UN/HM/用品)
     * @return The value of the column 'CARRIER_ID1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarrierId1() {
        checkSpecifiedProperty("carrierId1");
        return _carrierId1;
    }

    /**
     * [set] CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(UN/HM/用品)
     * @param carrierId1 The value of the column 'CARRIER_ID1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierId1(Long carrierId1) {
        registerModifiedProperty("carrierId1");
        _carrierId1 = carrierId1;
    }

    /**
     * [get] CARRIER_CD1: {VARCHAR(30)} <br>
     * 運送業者CD(UN/HM/用品)
     * @return The value of the column 'CARRIER_CD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd1() {
        checkSpecifiedProperty("carrierCd1");
        return convertEmptyToNull(_carrierCd1);
    }

    /**
     * [set] CARRIER_CD1: {VARCHAR(30)} <br>
     * 運送業者CD(UN/HM/用品)
     * @param carrierCd1 The value of the column 'CARRIER_CD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd1(String carrierCd1) {
        registerModifiedProperty("carrierCd1");
        _carrierCd1 = carrierCd1;
    }

    /**
     * [get] CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(FW足数上限)
     * @return The value of the column 'CARRIER_ID2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarrierId2() {
        checkSpecifiedProperty("carrierId2");
        return _carrierId2;
    }

    /**
     * [set] CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(FW足数上限)
     * @param carrierId2 The value of the column 'CARRIER_ID2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierId2(Long carrierId2) {
        registerModifiedProperty("carrierId2");
        _carrierId2 = carrierId2;
    }

    /**
     * [get] CARRIER_CD2: {VARCHAR(30)} <br>
     * 運送業者CD(FW足数上限)
     * @return The value of the column 'CARRIER_CD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd2() {
        checkSpecifiedProperty("carrierCd2");
        return convertEmptyToNull(_carrierCd2);
    }

    /**
     * [set] CARRIER_CD2: {VARCHAR(30)} <br>
     * 運送業者CD(FW足数上限)
     * @param carrierCd2 The value of the column 'CARRIER_CD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd2(String carrierCd2) {
        registerModifiedProperty("carrierCd2");
        _carrierCd2 = carrierCd2;
    }

    /**
     * [get] CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(FW足数以上業者)
     * @return The value of the column 'CARRIER_ID3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarrierId3() {
        checkSpecifiedProperty("carrierId3");
        return _carrierId3;
    }

    /**
     * [set] CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(FW足数以上業者)
     * @param carrierId3 The value of the column 'CARRIER_ID3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierId3(Long carrierId3) {
        registerModifiedProperty("carrierId3");
        _carrierId3 = carrierId3;
    }

    /**
     * [get] CARRIER_CD3: {VARCHAR(30)} <br>
     * 運送業者CD(FW足数以上業者)
     * @return The value of the column 'CARRIER_CD3'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd3() {
        checkSpecifiedProperty("carrierCd3");
        return convertEmptyToNull(_carrierCd3);
    }

    /**
     * [set] CARRIER_CD3: {VARCHAR(30)} <br>
     * 運送業者CD(FW足数以上業者)
     * @param carrierCd3 The value of the column 'CARRIER_CD3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd3(String carrierCd3) {
        registerModifiedProperty("carrierCd3");
        _carrierCd3 = carrierCd3;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
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
