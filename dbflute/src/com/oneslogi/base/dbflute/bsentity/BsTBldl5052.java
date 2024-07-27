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
 * The entity of t_bldl5052 as TABLE. <br>
 * BLDL5052
 * <pre>
 * [primary-key]
 *     BLDL5052_ID
 *
 * [column]
 *     BLDL5052_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_CASE_NUM, FW_PICK_NUM, FW_RATE, UN_CASE_NUM, UN_PICK_NUM, UN_RATE, SH_CASE_NUM, SH_PICK_NUM, SH_RATE, HM_CASE_NUM, HM_PICK_NUM, HM_RATE, TOTAL_CASE_NUM, TOTAL_PICK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5052_ID
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
 * Long bldl5052Id = entity.getBldl5052Id();
 * String yearmonth = entity.getYearmonth();
 * String baseNm = entity.getBaseNm();
 * String month = entity.getMonth();
 * String rowNo = entity.getRowNo();
 * String shippingDt = entity.getShippingDt();
 * Long fwCaseNum = entity.getFwCaseNum();
 * Long fwPickNum = entity.getFwPickNum();
 * Long fwRate = entity.getFwRate();
 * Long unCaseNum = entity.getUnCaseNum();
 * Long unPickNum = entity.getUnPickNum();
 * Long unRate = entity.getUnRate();
 * Long shCaseNum = entity.getShCaseNum();
 * Long shPickNum = entity.getShPickNum();
 * Long shRate = entity.getShRate();
 * Long hmCaseNum = entity.getHmCaseNum();
 * Long hmPickNum = entity.getHmPickNum();
 * Long hmRate = entity.getHmRate();
 * Long totalCaseNum = entity.getTotalCaseNum();
 * Long totalPickNum = entity.getTotalPickNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBldl5052Id(bldl5052Id);
 * entity.setYearmonth(yearmonth);
 * entity.setBaseNm(baseNm);
 * entity.setMonth(month);
 * entity.setRowNo(rowNo);
 * entity.setShippingDt(shippingDt);
 * entity.setFwCaseNum(fwCaseNum);
 * entity.setFwPickNum(fwPickNum);
 * entity.setFwRate(fwRate);
 * entity.setUnCaseNum(unCaseNum);
 * entity.setUnPickNum(unPickNum);
 * entity.setUnRate(unRate);
 * entity.setShCaseNum(shCaseNum);
 * entity.setShPickNum(shPickNum);
 * entity.setShRate(shRate);
 * entity.setHmCaseNum(hmCaseNum);
 * entity.setHmPickNum(hmPickNum);
 * entity.setHmRate(hmRate);
 * entity.setTotalCaseNum(totalCaseNum);
 * entity.setTotalPickNum(totalPickNum);
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
public abstract class BsTBldl5052 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BLDL5052_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _bldl5052Id;

    /** YEARMONTH: {VARCHAR(30)} */
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    protected String _month;

    /** ROW_NO: {VARCHAR(30)} */
    protected String _rowNo;

    /** SHIPPING_DT: {VARCHAR(30)} */
    protected String _shippingDt;

    /** FW_CASE_NUM: {BIGINT(19)} */
    protected Long _fwCaseNum;

    /** FW_PICK_NUM: {BIGINT(19)} */
    protected Long _fwPickNum;

    /** FW_RATE: {BIGINT(19)} */
    protected Long _fwRate;

    /** UN_CASE_NUM: {BIGINT(19)} */
    protected Long _unCaseNum;

    /** UN_PICK_NUM: {BIGINT(19)} */
    protected Long _unPickNum;

    /** UN_RATE: {BIGINT(19)} */
    protected Long _unRate;

    /** SH_CASE_NUM: {BIGINT(19)} */
    protected Long _shCaseNum;

    /** SH_PICK_NUM: {BIGINT(19)} */
    protected Long _shPickNum;

    /** SH_RATE: {BIGINT(19)} */
    protected Long _shRate;

    /** HM_CASE_NUM: {BIGINT(19)} */
    protected Long _hmCaseNum;

    /** HM_PICK_NUM: {BIGINT(19)} */
    protected Long _hmPickNum;

    /** HM_RATE: {BIGINT(19)} */
    protected Long _hmRate;

    /** TOTAL_CASE_NUM: {BIGINT(19)} */
    protected Long _totalCaseNum;

    /** TOTAL_PICK_NUM: {BIGINT(19)} */
    protected Long _totalPickNum;

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
        return "t_bldl5052";
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
        if (_bldl5052Id == null) { return false; }
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
        if (obj instanceof BsTBldl5052) {
            BsTBldl5052 other = (BsTBldl5052)obj;
            if (!xSV(_bldl5052Id, other._bldl5052Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bldl5052Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bldl5052Id));
        sb.append(dm).append(xfND(_yearmonth));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_month));
        sb.append(dm).append(xfND(_rowNo));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_fwCaseNum));
        sb.append(dm).append(xfND(_fwPickNum));
        sb.append(dm).append(xfND(_fwRate));
        sb.append(dm).append(xfND(_unCaseNum));
        sb.append(dm).append(xfND(_unPickNum));
        sb.append(dm).append(xfND(_unRate));
        sb.append(dm).append(xfND(_shCaseNum));
        sb.append(dm).append(xfND(_shPickNum));
        sb.append(dm).append(xfND(_shRate));
        sb.append(dm).append(xfND(_hmCaseNum));
        sb.append(dm).append(xfND(_hmPickNum));
        sb.append(dm).append(xfND(_hmRate));
        sb.append(dm).append(xfND(_totalCaseNum));
        sb.append(dm).append(xfND(_totalPickNum));
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
    public TBldl5052 clone() {
        return (TBldl5052)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLDL5052_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5052ID
     * @return The value of the column 'BLDL5052_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBldl5052Id() {
        checkSpecifiedProperty("bldl5052Id");
        return _bldl5052Id;
    }

    /**
     * [set] BLDL5052_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5052ID
     * @param bldl5052Id The value of the column 'BLDL5052_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBldl5052Id(Long bldl5052Id) {
        registerModifiedProperty("bldl5052Id");
        _bldl5052Id = bldl5052Id;
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
     * [get] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @return The value of the column 'ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRowNo() {
        checkSpecifiedProperty("rowNo");
        return convertEmptyToNull(_rowNo);
    }

    /**
     * [set] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @param rowNo The value of the column 'ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRowNo(String rowNo) {
        registerModifiedProperty("rowNo");
        _rowNo = rowNo;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] FW_CASE_NUM: {BIGINT(19)} <br>
     * FW関連_ケース数
     * @return The value of the column 'FW_CASE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwCaseNum() {
        checkSpecifiedProperty("fwCaseNum");
        return _fwCaseNum;
    }

    /**
     * [set] FW_CASE_NUM: {BIGINT(19)} <br>
     * FW関連_ケース数
     * @param fwCaseNum The value of the column 'FW_CASE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwCaseNum(Long fwCaseNum) {
        registerModifiedProperty("fwCaseNum");
        _fwCaseNum = fwCaseNum;
    }

    /**
     * [get] FW_PICK_NUM: {BIGINT(19)} <br>
     * FW関連_ピッキング数
     * @return The value of the column 'FW_PICK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwPickNum() {
        checkSpecifiedProperty("fwPickNum");
        return _fwPickNum;
    }

    /**
     * [set] FW_PICK_NUM: {BIGINT(19)} <br>
     * FW関連_ピッキング数
     * @param fwPickNum The value of the column 'FW_PICK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwPickNum(Long fwPickNum) {
        registerModifiedProperty("fwPickNum");
        _fwPickNum = fwPickNum;
    }

    /**
     * [get] FW_RATE: {BIGINT(19)} <br>
     * FW関連_率
     * @return The value of the column 'FW_RATE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwRate() {
        checkSpecifiedProperty("fwRate");
        return _fwRate;
    }

    /**
     * [set] FW_RATE: {BIGINT(19)} <br>
     * FW関連_率
     * @param fwRate The value of the column 'FW_RATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwRate(Long fwRate) {
        registerModifiedProperty("fwRate");
        _fwRate = fwRate;
    }

    /**
     * [get] UN_CASE_NUM: {BIGINT(19)} <br>
     * UN関連_ケース数
     * @return The value of the column 'UN_CASE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnCaseNum() {
        checkSpecifiedProperty("unCaseNum");
        return _unCaseNum;
    }

    /**
     * [set] UN_CASE_NUM: {BIGINT(19)} <br>
     * UN関連_ケース数
     * @param unCaseNum The value of the column 'UN_CASE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnCaseNum(Long unCaseNum) {
        registerModifiedProperty("unCaseNum");
        _unCaseNum = unCaseNum;
    }

    /**
     * [get] UN_PICK_NUM: {BIGINT(19)} <br>
     * UN関連_ピッキング数
     * @return The value of the column 'UN_PICK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnPickNum() {
        checkSpecifiedProperty("unPickNum");
        return _unPickNum;
    }

    /**
     * [set] UN_PICK_NUM: {BIGINT(19)} <br>
     * UN関連_ピッキング数
     * @param unPickNum The value of the column 'UN_PICK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnPickNum(Long unPickNum) {
        registerModifiedProperty("unPickNum");
        _unPickNum = unPickNum;
    }

    /**
     * [get] UN_RATE: {BIGINT(19)} <br>
     * UN関連_率
     * @return The value of the column 'UN_RATE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnRate() {
        checkSpecifiedProperty("unRate");
        return _unRate;
    }

    /**
     * [set] UN_RATE: {BIGINT(19)} <br>
     * UN関連_率
     * @param unRate The value of the column 'UN_RATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnRate(Long unRate) {
        registerModifiedProperty("unRate");
        _unRate = unRate;
    }

    /**
     * [get] SH_CASE_NUM: {BIGINT(19)} <br>
     * SH関連_ケース数
     * @return The value of the column 'SH_CASE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShCaseNum() {
        checkSpecifiedProperty("shCaseNum");
        return _shCaseNum;
    }

    /**
     * [set] SH_CASE_NUM: {BIGINT(19)} <br>
     * SH関連_ケース数
     * @param shCaseNum The value of the column 'SH_CASE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShCaseNum(Long shCaseNum) {
        registerModifiedProperty("shCaseNum");
        _shCaseNum = shCaseNum;
    }

    /**
     * [get] SH_PICK_NUM: {BIGINT(19)} <br>
     * SH関連_ピッキング数
     * @return The value of the column 'SH_PICK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShPickNum() {
        checkSpecifiedProperty("shPickNum");
        return _shPickNum;
    }

    /**
     * [set] SH_PICK_NUM: {BIGINT(19)} <br>
     * SH関連_ピッキング数
     * @param shPickNum The value of the column 'SH_PICK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShPickNum(Long shPickNum) {
        registerModifiedProperty("shPickNum");
        _shPickNum = shPickNum;
    }

    /**
     * [get] SH_RATE: {BIGINT(19)} <br>
     * SH関連_率
     * @return The value of the column 'SH_RATE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShRate() {
        checkSpecifiedProperty("shRate");
        return _shRate;
    }

    /**
     * [set] SH_RATE: {BIGINT(19)} <br>
     * SH関連_率
     * @param shRate The value of the column 'SH_RATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShRate(Long shRate) {
        registerModifiedProperty("shRate");
        _shRate = shRate;
    }

    /**
     * [get] HM_CASE_NUM: {BIGINT(19)} <br>
     * HM関連_ケース数
     * @return The value of the column 'HM_CASE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getHmCaseNum() {
        checkSpecifiedProperty("hmCaseNum");
        return _hmCaseNum;
    }

    /**
     * [set] HM_CASE_NUM: {BIGINT(19)} <br>
     * HM関連_ケース数
     * @param hmCaseNum The value of the column 'HM_CASE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHmCaseNum(Long hmCaseNum) {
        registerModifiedProperty("hmCaseNum");
        _hmCaseNum = hmCaseNum;
    }

    /**
     * [get] HM_PICK_NUM: {BIGINT(19)} <br>
     * HM関連_ピッキング数
     * @return The value of the column 'HM_PICK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getHmPickNum() {
        checkSpecifiedProperty("hmPickNum");
        return _hmPickNum;
    }

    /**
     * [set] HM_PICK_NUM: {BIGINT(19)} <br>
     * HM関連_ピッキング数
     * @param hmPickNum The value of the column 'HM_PICK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHmPickNum(Long hmPickNum) {
        registerModifiedProperty("hmPickNum");
        _hmPickNum = hmPickNum;
    }

    /**
     * [get] HM_RATE: {BIGINT(19)} <br>
     * HM関連_率
     * @return The value of the column 'HM_RATE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getHmRate() {
        checkSpecifiedProperty("hmRate");
        return _hmRate;
    }

    /**
     * [set] HM_RATE: {BIGINT(19)} <br>
     * HM関連_率
     * @param hmRate The value of the column 'HM_RATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHmRate(Long hmRate) {
        registerModifiedProperty("hmRate");
        _hmRate = hmRate;
    }

    /**
     * [get] TOTAL_CASE_NUM: {BIGINT(19)} <br>
     * 当日合計_ケース数
     * @return The value of the column 'TOTAL_CASE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalCaseNum() {
        checkSpecifiedProperty("totalCaseNum");
        return _totalCaseNum;
    }

    /**
     * [set] TOTAL_CASE_NUM: {BIGINT(19)} <br>
     * 当日合計_ケース数
     * @param totalCaseNum The value of the column 'TOTAL_CASE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalCaseNum(Long totalCaseNum) {
        registerModifiedProperty("totalCaseNum");
        _totalCaseNum = totalCaseNum;
    }

    /**
     * [get] TOTAL_PICK_NUM: {BIGINT(19)} <br>
     * 当日合計_ピッキング数
     * @return The value of the column 'TOTAL_PICK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalPickNum() {
        checkSpecifiedProperty("totalPickNum");
        return _totalPickNum;
    }

    /**
     * [set] TOTAL_PICK_NUM: {BIGINT(19)} <br>
     * 当日合計_ピッキング数
     * @param totalPickNum The value of the column 'TOTAL_PICK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPickNum(Long totalPickNum) {
        registerModifiedProperty("totalPickNum");
        _totalPickNum = totalPickNum;
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