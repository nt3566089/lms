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
 * The entity of t_bldl3350 as TABLE. <br>
 * BLDL3350
 * <pre>
 * [primary-key]
 *     BLDL3350_ID
 *
 * [column]
 *     BLDL3350_ID, YEARMONTH, BASE_NM, MONTH, SALES_ORG_NM, SHIPPING_DT, YAMATO_SHIPPING_NUM, YAMATO_EC_SHIPPING_NUM, SAGAWA_SHIPPING_NUM, SAGAWA_EC_SHIPPING_NUM, SAGAWA2_SHIPPING_NUM, SAGAWA2_EC_SHIPPING_NUM, OTHER_SHIPPING_NUM, OTHER_EC_SHIPPING_NUM, CANCEL_SHIPPING_NUM, CANCEL_EC_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL3350_ID
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long bldl3350Id = entity.getBldl3350Id();
 * String yearmonth = entity.getYearmonth();
 * String baseNm = entity.getBaseNm();
 * String month = entity.getMonth();
 * String salesOrgNm = entity.getSalesOrgNm();
 * String shippingDt = entity.getShippingDt();
 * Long yamatoShippingNum = entity.getYamatoShippingNum();
 * Long yamatoEcShippingNum = entity.getYamatoEcShippingNum();
 * Long sagawaShippingNum = entity.getSagawaShippingNum();
 * Long sagawaEcShippingNum = entity.getSagawaEcShippingNum();
 * Long sagawa2ShippingNum = entity.getSagawa2ShippingNum();
 * Long sagawa2EcShippingNum = entity.getSagawa2EcShippingNum();
 * Long otherShippingNum = entity.getOtherShippingNum();
 * Long otherEcShippingNum = entity.getOtherEcShippingNum();
 * Long cancelShippingNum = entity.getCancelShippingNum();
 * Long cancelEcShippingNum = entity.getCancelEcShippingNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBldl3350Id(bldl3350Id);
 * entity.setYearmonth(yearmonth);
 * entity.setBaseNm(baseNm);
 * entity.setMonth(month);
 * entity.setSalesOrgNm(salesOrgNm);
 * entity.setShippingDt(shippingDt);
 * entity.setYamatoShippingNum(yamatoShippingNum);
 * entity.setYamatoEcShippingNum(yamatoEcShippingNum);
 * entity.setSagawaShippingNum(sagawaShippingNum);
 * entity.setSagawaEcShippingNum(sagawaEcShippingNum);
 * entity.setSagawa2ShippingNum(sagawa2ShippingNum);
 * entity.setSagawa2EcShippingNum(sagawa2EcShippingNum);
 * entity.setOtherShippingNum(otherShippingNum);
 * entity.setOtherEcShippingNum(otherEcShippingNum);
 * entity.setCancelShippingNum(cancelShippingNum);
 * entity.setCancelEcShippingNum(cancelEcShippingNum);
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
public abstract class BsTBldl3350 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _bldl3350Id;

    /** YEARMONTH: {VARCHAR(30)} */
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    protected String _month;

    /** SALES_ORG_NM: {VARCHAR(60)} */
    protected String _salesOrgNm;

    /** SHIPPING_DT: {VARCHAR(8)} */
    protected String _shippingDt;

    /** YAMATO_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _yamatoShippingNum;

    /** YAMATO_EC_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _yamatoEcShippingNum;

    /** SAGAWA_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _sagawaShippingNum;

    /** SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _sagawaEcShippingNum;

    /** SAGAWA2_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _sagawa2ShippingNum;

    /** SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _sagawa2EcShippingNum;

    /** OTHER_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _otherShippingNum;

    /** OTHER_EC_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _otherEcShippingNum;

    /** CANCEL_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _cancelShippingNum;

    /** CANCEL_EC_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _cancelEcShippingNum;

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
        return "t_bldl3350";
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
        if (_bldl3350Id == null) { return false; }
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
        if (obj instanceof BsTBldl3350) {
            BsTBldl3350 other = (BsTBldl3350)obj;
            if (!xSV(_bldl3350Id, other._bldl3350Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bldl3350Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bldl3350Id));
        sb.append(dm).append(xfND(_yearmonth));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_month));
        sb.append(dm).append(xfND(_salesOrgNm));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_yamatoShippingNum));
        sb.append(dm).append(xfND(_yamatoEcShippingNum));
        sb.append(dm).append(xfND(_sagawaShippingNum));
        sb.append(dm).append(xfND(_sagawaEcShippingNum));
        sb.append(dm).append(xfND(_sagawa2ShippingNum));
        sb.append(dm).append(xfND(_sagawa2EcShippingNum));
        sb.append(dm).append(xfND(_otherShippingNum));
        sb.append(dm).append(xfND(_otherEcShippingNum));
        sb.append(dm).append(xfND(_cancelShippingNum));
        sb.append(dm).append(xfND(_cancelEcShippingNum));
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
        return "";
    }

    @Override
    public TBldl3350 clone() {
        return (TBldl3350)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL3350ID
     * @return The value of the column 'BLDL3350_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBldl3350Id() {
        checkSpecifiedProperty("bldl3350Id");
        return _bldl3350Id;
    }

    /**
     * [set] BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL3350ID
     * @param bldl3350Id The value of the column 'BLDL3350_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBldl3350Id(Long bldl3350Id) {
        registerModifiedProperty("bldl3350Id");
        _bldl3350Id = bldl3350Id;
    }

    /**
     * [get] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @return The value of the column 'YEARMONTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getYearmonth() {
        checkSpecifiedProperty("yearmonth");
        return convertEmptyToNull(_yearmonth);
    }

    /**
     * [set] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @param yearmonth The value of the column 'YEARMONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYearmonth(String yearmonth) {
        registerModifiedProperty("yearmonth");
        _yearmonth = yearmonth;
    }

    /**
     * [get] BASE_NM: {VARCHAR(60)} <br>
     * 拠点
     * @return The value of the column 'BASE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseNm() {
        checkSpecifiedProperty("baseNm");
        return convertEmptyToNull(_baseNm);
    }

    /**
     * [set] BASE_NM: {VARCHAR(60)} <br>
     * 拠点
     * @param baseNm The value of the column 'BASE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseNm(String baseNm) {
        registerModifiedProperty("baseNm");
        _baseNm = baseNm;
    }

    /**
     * [get] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @return The value of the column 'MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getMonth() {
        checkSpecifiedProperty("month");
        return convertEmptyToNull(_month);
    }

    /**
     * [set] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @param month The value of the column 'MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMonth(String month) {
        registerModifiedProperty("month");
        _month = month;
    }

    /**
     * [get] SALES_ORG_NM: {VARCHAR(60)} <br>
     * 販売組織名称
     * @return The value of the column 'SALES_ORG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgNm() {
        checkSpecifiedProperty("salesOrgNm");
        return convertEmptyToNull(_salesOrgNm);
    }

    /**
     * [set] SALES_ORG_NM: {VARCHAR(60)} <br>
     * 販売組織名称
     * @param salesOrgNm The value of the column 'SALES_ORG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgNm(String salesOrgNm) {
        registerModifiedProperty("salesOrgNm");
        _salesOrgNm = salesOrgNm;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] YAMATO_SHIPPING_NUM: {BIGINT(19)} <br>
     * ヤマト運輸_出荷数
     * @return The value of the column 'YAMATO_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getYamatoShippingNum() {
        checkSpecifiedProperty("yamatoShippingNum");
        return _yamatoShippingNum;
    }

    /**
     * [set] YAMATO_SHIPPING_NUM: {BIGINT(19)} <br>
     * ヤマト運輸_出荷数
     * @param yamatoShippingNum The value of the column 'YAMATO_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYamatoShippingNum(Long yamatoShippingNum) {
        registerModifiedProperty("yamatoShippingNum");
        _yamatoShippingNum = yamatoShippingNum;
    }

    /**
     * [get] YAMATO_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * ヤマト運輸_EC出荷手数料
     * @return The value of the column 'YAMATO_EC_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getYamatoEcShippingNum() {
        checkSpecifiedProperty("yamatoEcShippingNum");
        return _yamatoEcShippingNum;
    }

    /**
     * [set] YAMATO_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * ヤマト運輸_EC出荷手数料
     * @param yamatoEcShippingNum The value of the column 'YAMATO_EC_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYamatoEcShippingNum(Long yamatoEcShippingNum) {
        registerModifiedProperty("yamatoEcShippingNum");
        _yamatoEcShippingNum = yamatoEcShippingNum;
    }

    /**
     * [get] SAGAWA_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川急便_出荷数
     * @return The value of the column 'SAGAWA_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSagawaShippingNum() {
        checkSpecifiedProperty("sagawaShippingNum");
        return _sagawaShippingNum;
    }

    /**
     * [set] SAGAWA_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川急便_出荷数
     * @param sagawaShippingNum The value of the column 'SAGAWA_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSagawaShippingNum(Long sagawaShippingNum) {
        registerModifiedProperty("sagawaShippingNum");
        _sagawaShippingNum = sagawaShippingNum;
    }

    /**
     * [get] SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川急便_EC出荷手数料
     * @return The value of the column 'SAGAWA_EC_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSagawaEcShippingNum() {
        checkSpecifiedProperty("sagawaEcShippingNum");
        return _sagawaEcShippingNum;
    }

    /**
     * [set] SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川急便_EC出荷手数料
     * @param sagawaEcShippingNum The value of the column 'SAGAWA_EC_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSagawaEcShippingNum(Long sagawaEcShippingNum) {
        registerModifiedProperty("sagawaEcShippingNum");
        _sagawaEcShippingNum = sagawaEcShippingNum;
    }

    /**
     * [get] SAGAWA2_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川代引_出荷数
     * @return The value of the column 'SAGAWA2_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSagawa2ShippingNum() {
        checkSpecifiedProperty("sagawa2ShippingNum");
        return _sagawa2ShippingNum;
    }

    /**
     * [set] SAGAWA2_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川代引_出荷数
     * @param sagawa2ShippingNum The value of the column 'SAGAWA2_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSagawa2ShippingNum(Long sagawa2ShippingNum) {
        registerModifiedProperty("sagawa2ShippingNum");
        _sagawa2ShippingNum = sagawa2ShippingNum;
    }

    /**
     * [get] SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川代引_EC出荷手数料
     * @return The value of the column 'SAGAWA2_EC_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSagawa2EcShippingNum() {
        checkSpecifiedProperty("sagawa2EcShippingNum");
        return _sagawa2EcShippingNum;
    }

    /**
     * [set] SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川代引_EC出荷手数料
     * @param sagawa2EcShippingNum The value of the column 'SAGAWA2_EC_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSagawa2EcShippingNum(Long sagawa2EcShippingNum) {
        registerModifiedProperty("sagawa2EcShippingNum");
        _sagawa2EcShippingNum = sagawa2EcShippingNum;
    }

    /**
     * [get] OTHER_SHIPPING_NUM: {BIGINT(19)} <br>
     * その他_出荷数
     * @return The value of the column 'OTHER_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtherShippingNum() {
        checkSpecifiedProperty("otherShippingNum");
        return _otherShippingNum;
    }

    /**
     * [set] OTHER_SHIPPING_NUM: {BIGINT(19)} <br>
     * その他_出荷数
     * @param otherShippingNum The value of the column 'OTHER_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherShippingNum(Long otherShippingNum) {
        registerModifiedProperty("otherShippingNum");
        _otherShippingNum = otherShippingNum;
    }

    /**
     * [get] OTHER_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * その他_EC出荷手数料
     * @return The value of the column 'OTHER_EC_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtherEcShippingNum() {
        checkSpecifiedProperty("otherEcShippingNum");
        return _otherEcShippingNum;
    }

    /**
     * [set] OTHER_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * その他_EC出荷手数料
     * @param otherEcShippingNum The value of the column 'OTHER_EC_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherEcShippingNum(Long otherEcShippingNum) {
        registerModifiedProperty("otherEcShippingNum");
        _otherEcShippingNum = otherEcShippingNum;
    }

    /**
     * [get] CANCEL_SHIPPING_NUM: {BIGINT(19)} <br>
     * 取り消し_出荷数
     * @return The value of the column 'CANCEL_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCancelShippingNum() {
        checkSpecifiedProperty("cancelShippingNum");
        return _cancelShippingNum;
    }

    /**
     * [set] CANCEL_SHIPPING_NUM: {BIGINT(19)} <br>
     * 取り消し_出荷数
     * @param cancelShippingNum The value of the column 'CANCEL_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCancelShippingNum(Long cancelShippingNum) {
        registerModifiedProperty("cancelShippingNum");
        _cancelShippingNum = cancelShippingNum;
    }

    /**
     * [get] CANCEL_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 取り消し_EC出荷手数料
     * @return The value of the column 'CANCEL_EC_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCancelEcShippingNum() {
        checkSpecifiedProperty("cancelEcShippingNum");
        return _cancelEcShippingNum;
    }

    /**
     * [set] CANCEL_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 取り消し_EC出荷手数料
     * @param cancelEcShippingNum The value of the column 'CANCEL_EC_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCancelEcShippingNum(Long cancelEcShippingNum) {
        registerModifiedProperty("cancelEcShippingNum");
        _cancelEcShippingNum = cancelEcShippingNum;
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
