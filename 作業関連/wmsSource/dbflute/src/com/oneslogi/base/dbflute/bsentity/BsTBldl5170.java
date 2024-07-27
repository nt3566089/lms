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
 * The entity of t_bldl5170 as TABLE. <br>
 * BLDL5170
 * <pre>
 * [primary-key]
 *     BLDL5170_ID
 *
 * [column]
 *     BLDL5170_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, RECEIVE_DT, FW_RECEIVE_CNT, FW_RECEIVE_NUM, FW_CASE_NUM, UN_RECEIVE_CNT, UN_RECEIVE_NUM, UN_CASE_NUM, SH_RECEIVE_CNT, SH_RECEIVE_NUM, SH_CASE_NUM, TOTAL_RECEIVE_NUM, TOTAL_CASE_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5170_ID
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
 * Long bldl5170Id = entity.getBldl5170Id();
 * String yearmonth = entity.getYearmonth();
 * String baseNm = entity.getBaseNm();
 * String month = entity.getMonth();
 * String rowNo = entity.getRowNo();
 * String receiveDt = entity.getReceiveDt();
 * Long fwReceiveCnt = entity.getFwReceiveCnt();
 * Long fwReceiveNum = entity.getFwReceiveNum();
 * Long fwCaseNum = entity.getFwCaseNum();
 * Long unReceiveCnt = entity.getUnReceiveCnt();
 * Long unReceiveNum = entity.getUnReceiveNum();
 * Long unCaseNum = entity.getUnCaseNum();
 * Long shReceiveCnt = entity.getShReceiveCnt();
 * Long shReceiveNum = entity.getShReceiveNum();
 * Long shCaseNum = entity.getShCaseNum();
 * Long totalReceiveNum = entity.getTotalReceiveNum();
 * Long totalCaseNum = entity.getTotalCaseNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBldl5170Id(bldl5170Id);
 * entity.setYearmonth(yearmonth);
 * entity.setBaseNm(baseNm);
 * entity.setMonth(month);
 * entity.setRowNo(rowNo);
 * entity.setReceiveDt(receiveDt);
 * entity.setFwReceiveCnt(fwReceiveCnt);
 * entity.setFwReceiveNum(fwReceiveNum);
 * entity.setFwCaseNum(fwCaseNum);
 * entity.setUnReceiveCnt(unReceiveCnt);
 * entity.setUnReceiveNum(unReceiveNum);
 * entity.setUnCaseNum(unCaseNum);
 * entity.setShReceiveCnt(shReceiveCnt);
 * entity.setShReceiveNum(shReceiveNum);
 * entity.setShCaseNum(shCaseNum);
 * entity.setTotalReceiveNum(totalReceiveNum);
 * entity.setTotalCaseNum(totalCaseNum);
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
public abstract class BsTBldl5170 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BLDL5170_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _bldl5170Id;

    /** YEARMONTH: {VARCHAR(30)} */
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    protected String _month;

    /** ROW_NO: {VARCHAR(30)} */
    protected String _rowNo;

    /** RECEIVE_DT: {VARCHAR(8)} */
    protected String _receiveDt;

    /** FW_RECEIVE_CNT: {BIGINT(19)} */
    protected Long _fwReceiveCnt;

    /** FW_RECEIVE_NUM: {BIGINT(19)} */
    protected Long _fwReceiveNum;

    /** FW_CASE_NUM: {BIGINT(19)} */
    protected Long _fwCaseNum;

    /** UN_RECEIVE_CNT: {BIGINT(19)} */
    protected Long _unReceiveCnt;

    /** UN_RECEIVE_NUM: {BIGINT(19)} */
    protected Long _unReceiveNum;

    /** UN_CASE_NUM: {BIGINT(19)} */
    protected Long _unCaseNum;

    /** SH_RECEIVE_CNT: {BIGINT(19)} */
    protected Long _shReceiveCnt;

    /** SH_RECEIVE_NUM: {BIGINT(19)} */
    protected Long _shReceiveNum;

    /** SH_CASE_NUM: {BIGINT(19)} */
    protected Long _shCaseNum;

    /** TOTAL_RECEIVE_NUM: {BIGINT(19)} */
    protected Long _totalReceiveNum;

    /** TOTAL_CASE_NUM: {BIGINT(19)} */
    protected Long _totalCaseNum;

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
        return "t_bldl5170";
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
        if (_bldl5170Id == null) { return false; }
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
        if (obj instanceof BsTBldl5170) {
            BsTBldl5170 other = (BsTBldl5170)obj;
            if (!xSV(_bldl5170Id, other._bldl5170Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bldl5170Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bldl5170Id));
        sb.append(dm).append(xfND(_yearmonth));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_month));
        sb.append(dm).append(xfND(_rowNo));
        sb.append(dm).append(xfND(_receiveDt));
        sb.append(dm).append(xfND(_fwReceiveCnt));
        sb.append(dm).append(xfND(_fwReceiveNum));
        sb.append(dm).append(xfND(_fwCaseNum));
        sb.append(dm).append(xfND(_unReceiveCnt));
        sb.append(dm).append(xfND(_unReceiveNum));
        sb.append(dm).append(xfND(_unCaseNum));
        sb.append(dm).append(xfND(_shReceiveCnt));
        sb.append(dm).append(xfND(_shReceiveNum));
        sb.append(dm).append(xfND(_shCaseNum));
        sb.append(dm).append(xfND(_totalReceiveNum));
        sb.append(dm).append(xfND(_totalCaseNum));
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
    public TBldl5170 clone() {
        return (TBldl5170)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLDL5170_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5170ID
     * @return The value of the column 'BLDL5170_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBldl5170Id() {
        checkSpecifiedProperty("bldl5170Id");
        return _bldl5170Id;
    }

    /**
     * [set] BLDL5170_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5170ID
     * @param bldl5170Id The value of the column 'BLDL5170_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBldl5170Id(Long bldl5170Id) {
        registerModifiedProperty("bldl5170Id");
        _bldl5170Id = bldl5170Id;
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
     * [get] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @return The value of the column 'RECEIVE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDt() {
        checkSpecifiedProperty("receiveDt");
        return convertEmptyToNull(_receiveDt);
    }

    /**
     * [set] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @param receiveDt The value of the column 'RECEIVE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDt(String receiveDt) {
        registerModifiedProperty("receiveDt");
        _receiveDt = receiveDt;
    }

    /**
     * [get] FW_RECEIVE_CNT: {BIGINT(19)} <br>
     * FW関連_入荷件数
     * @return The value of the column 'FW_RECEIVE_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwReceiveCnt() {
        checkSpecifiedProperty("fwReceiveCnt");
        return _fwReceiveCnt;
    }

    /**
     * [set] FW_RECEIVE_CNT: {BIGINT(19)} <br>
     * FW関連_入荷件数
     * @param fwReceiveCnt The value of the column 'FW_RECEIVE_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwReceiveCnt(Long fwReceiveCnt) {
        registerModifiedProperty("fwReceiveCnt");
        _fwReceiveCnt = fwReceiveCnt;
    }

    /**
     * [get] FW_RECEIVE_NUM: {BIGINT(19)} <br>
     * FW関連_入荷数量
     * @return The value of the column 'FW_RECEIVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwReceiveNum() {
        checkSpecifiedProperty("fwReceiveNum");
        return _fwReceiveNum;
    }

    /**
     * [set] FW_RECEIVE_NUM: {BIGINT(19)} <br>
     * FW関連_入荷数量
     * @param fwReceiveNum The value of the column 'FW_RECEIVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwReceiveNum(Long fwReceiveNum) {
        registerModifiedProperty("fwReceiveNum");
        _fwReceiveNum = fwReceiveNum;
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
     * [get] UN_RECEIVE_CNT: {BIGINT(19)} <br>
     * UN関連_入荷件数
     * @return The value of the column 'UN_RECEIVE_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnReceiveCnt() {
        checkSpecifiedProperty("unReceiveCnt");
        return _unReceiveCnt;
    }

    /**
     * [set] UN_RECEIVE_CNT: {BIGINT(19)} <br>
     * UN関連_入荷件数
     * @param unReceiveCnt The value of the column 'UN_RECEIVE_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnReceiveCnt(Long unReceiveCnt) {
        registerModifiedProperty("unReceiveCnt");
        _unReceiveCnt = unReceiveCnt;
    }

    /**
     * [get] UN_RECEIVE_NUM: {BIGINT(19)} <br>
     * UN関連_入荷数量
     * @return The value of the column 'UN_RECEIVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnReceiveNum() {
        checkSpecifiedProperty("unReceiveNum");
        return _unReceiveNum;
    }

    /**
     * [set] UN_RECEIVE_NUM: {BIGINT(19)} <br>
     * UN関連_入荷数量
     * @param unReceiveNum The value of the column 'UN_RECEIVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnReceiveNum(Long unReceiveNum) {
        registerModifiedProperty("unReceiveNum");
        _unReceiveNum = unReceiveNum;
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
     * [get] SH_RECEIVE_CNT: {BIGINT(19)} <br>
     * SH関連_入荷件数
     * @return The value of the column 'SH_RECEIVE_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShReceiveCnt() {
        checkSpecifiedProperty("shReceiveCnt");
        return _shReceiveCnt;
    }

    /**
     * [set] SH_RECEIVE_CNT: {BIGINT(19)} <br>
     * SH関連_入荷件数
     * @param shReceiveCnt The value of the column 'SH_RECEIVE_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShReceiveCnt(Long shReceiveCnt) {
        registerModifiedProperty("shReceiveCnt");
        _shReceiveCnt = shReceiveCnt;
    }

    /**
     * [get] SH_RECEIVE_NUM: {BIGINT(19)} <br>
     * SH関連_入荷数量
     * @return The value of the column 'SH_RECEIVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShReceiveNum() {
        checkSpecifiedProperty("shReceiveNum");
        return _shReceiveNum;
    }

    /**
     * [set] SH_RECEIVE_NUM: {BIGINT(19)} <br>
     * SH関連_入荷数量
     * @param shReceiveNum The value of the column 'SH_RECEIVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShReceiveNum(Long shReceiveNum) {
        registerModifiedProperty("shReceiveNum");
        _shReceiveNum = shReceiveNum;
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
     * [get] TOTAL_RECEIVE_NUM: {BIGINT(19)} <br>
     * 当日合計入荷数
     * @return The value of the column 'TOTAL_RECEIVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalReceiveNum() {
        checkSpecifiedProperty("totalReceiveNum");
        return _totalReceiveNum;
    }

    /**
     * [set] TOTAL_RECEIVE_NUM: {BIGINT(19)} <br>
     * 当日合計入荷数
     * @param totalReceiveNum The value of the column 'TOTAL_RECEIVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalReceiveNum(Long totalReceiveNum) {
        registerModifiedProperty("totalReceiveNum");
        _totalReceiveNum = totalReceiveNum;
    }

    /**
     * [get] TOTAL_CASE_NUM: {BIGINT(19)} <br>
     * 当日合計ケース数
     * @return The value of the column 'TOTAL_CASE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalCaseNum() {
        checkSpecifiedProperty("totalCaseNum");
        return _totalCaseNum;
    }

    /**
     * [set] TOTAL_CASE_NUM: {BIGINT(19)} <br>
     * 当日合計ケース数
     * @param totalCaseNum The value of the column 'TOTAL_CASE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalCaseNum(Long totalCaseNum) {
        registerModifiedProperty("totalCaseNum");
        _totalCaseNum = totalCaseNum;
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
