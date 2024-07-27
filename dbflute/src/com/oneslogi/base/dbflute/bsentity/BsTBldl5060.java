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
 * The entity of t_bldl5060 as TABLE. <br>
 * BLDL5060
 * <pre>
 * [primary-key]
 *     BLDL5060_ID
 *
 * [column]
 *     BLDL5060_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, RETURN_DT, FW_RETURN_CNT, FW_RETURN_NUM, UN_RETURN_CNT, UN_RETURN_NUM, SH_RETURN_CNT, SH_RETURN_NUM, HM_RETURN_CNT, HM_RETURN_NUM, TOTAL_RETURN_CNT, TOTAL_RETURN_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5060_ID
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
 * Long bldl5060Id = entity.getBldl5060Id();
 * String yearmonth = entity.getYearmonth();
 * String baseNm = entity.getBaseNm();
 * String month = entity.getMonth();
 * String rowNo = entity.getRowNo();
 * String returnDt = entity.getReturnDt();
 * Long fwReturnCnt = entity.getFwReturnCnt();
 * Long fwReturnNum = entity.getFwReturnNum();
 * Long unReturnCnt = entity.getUnReturnCnt();
 * Long unReturnNum = entity.getUnReturnNum();
 * Long shReturnCnt = entity.getShReturnCnt();
 * Long shReturnNum = entity.getShReturnNum();
 * Long hmReturnCnt = entity.getHmReturnCnt();
 * Long hmReturnNum = entity.getHmReturnNum();
 * Long totalReturnCnt = entity.getTotalReturnCnt();
 * Long totalReturnNum = entity.getTotalReturnNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBldl5060Id(bldl5060Id);
 * entity.setYearmonth(yearmonth);
 * entity.setBaseNm(baseNm);
 * entity.setMonth(month);
 * entity.setRowNo(rowNo);
 * entity.setReturnDt(returnDt);
 * entity.setFwReturnCnt(fwReturnCnt);
 * entity.setFwReturnNum(fwReturnNum);
 * entity.setUnReturnCnt(unReturnCnt);
 * entity.setUnReturnNum(unReturnNum);
 * entity.setShReturnCnt(shReturnCnt);
 * entity.setShReturnNum(shReturnNum);
 * entity.setHmReturnCnt(hmReturnCnt);
 * entity.setHmReturnNum(hmReturnNum);
 * entity.setTotalReturnCnt(totalReturnCnt);
 * entity.setTotalReturnNum(totalReturnNum);
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
public abstract class BsTBldl5060 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _bldl5060Id;

    /** YEARMONTH: {VARCHAR(30)} */
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    protected String _month;

    /** ROW_NO: {VARCHAR(30)} */
    protected String _rowNo;

    /** RETURN_DT: {VARCHAR(30)} */
    protected String _returnDt;

    /** FW_RETURN_CNT: {BIGINT(19)} */
    protected Long _fwReturnCnt;

    /** FW_RETURN_NUM: {BIGINT(19)} */
    protected Long _fwReturnNum;

    /** UN_RETURN_CNT: {BIGINT(19)} */
    protected Long _unReturnCnt;

    /** UN_RETURN_NUM: {BIGINT(19)} */
    protected Long _unReturnNum;

    /** SH_RETURN_CNT: {BIGINT(19)} */
    protected Long _shReturnCnt;

    /** SH_RETURN_NUM: {BIGINT(19)} */
    protected Long _shReturnNum;

    /** HM_RETURN_CNT: {BIGINT(19)} */
    protected Long _hmReturnCnt;

    /** HM_RETURN_NUM: {BIGINT(19)} */
    protected Long _hmReturnNum;

    /** TOTAL_RETURN_CNT: {BIGINT(19)} */
    protected Long _totalReturnCnt;

    /** TOTAL_RETURN_NUM: {BIGINT(19)} */
    protected Long _totalReturnNum;

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
        return "t_bldl5060";
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
        if (_bldl5060Id == null) { return false; }
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
        if (obj instanceof BsTBldl5060) {
            BsTBldl5060 other = (BsTBldl5060)obj;
            if (!xSV(_bldl5060Id, other._bldl5060Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bldl5060Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bldl5060Id));
        sb.append(dm).append(xfND(_yearmonth));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_month));
        sb.append(dm).append(xfND(_rowNo));
        sb.append(dm).append(xfND(_returnDt));
        sb.append(dm).append(xfND(_fwReturnCnt));
        sb.append(dm).append(xfND(_fwReturnNum));
        sb.append(dm).append(xfND(_unReturnCnt));
        sb.append(dm).append(xfND(_unReturnNum));
        sb.append(dm).append(xfND(_shReturnCnt));
        sb.append(dm).append(xfND(_shReturnNum));
        sb.append(dm).append(xfND(_hmReturnCnt));
        sb.append(dm).append(xfND(_hmReturnNum));
        sb.append(dm).append(xfND(_totalReturnCnt));
        sb.append(dm).append(xfND(_totalReturnNum));
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
    public TBldl5060 clone() {
        return (TBldl5060)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5060ID
     * @return The value of the column 'BLDL5060_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBldl5060Id() {
        checkSpecifiedProperty("bldl5060Id");
        return _bldl5060Id;
    }

    /**
     * [set] BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5060ID
     * @param bldl5060Id The value of the column 'BLDL5060_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBldl5060Id(Long bldl5060Id) {
        registerModifiedProperty("bldl5060Id");
        _bldl5060Id = bldl5060Id;
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
     * [get] RETURN_DT: {VARCHAR(30)} <br>
     * 返品受入日
     * @return The value of the column 'RETURN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReturnDt() {
        checkSpecifiedProperty("returnDt");
        return convertEmptyToNull(_returnDt);
    }

    /**
     * [set] RETURN_DT: {VARCHAR(30)} <br>
     * 返品受入日
     * @param returnDt The value of the column 'RETURN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReturnDt(String returnDt) {
        registerModifiedProperty("returnDt");
        _returnDt = returnDt;
    }

    /**
     * [get] FW_RETURN_CNT: {BIGINT(19)} <br>
     * FW_返品件数
     * @return The value of the column 'FW_RETURN_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwReturnCnt() {
        checkSpecifiedProperty("fwReturnCnt");
        return _fwReturnCnt;
    }

    /**
     * [set] FW_RETURN_CNT: {BIGINT(19)} <br>
     * FW_返品件数
     * @param fwReturnCnt The value of the column 'FW_RETURN_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwReturnCnt(Long fwReturnCnt) {
        registerModifiedProperty("fwReturnCnt");
        _fwReturnCnt = fwReturnCnt;
    }

    /**
     * [get] FW_RETURN_NUM: {BIGINT(19)} <br>
     * FW_返品数量
     * @return The value of the column 'FW_RETURN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwReturnNum() {
        checkSpecifiedProperty("fwReturnNum");
        return _fwReturnNum;
    }

    /**
     * [set] FW_RETURN_NUM: {BIGINT(19)} <br>
     * FW_返品数量
     * @param fwReturnNum The value of the column 'FW_RETURN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwReturnNum(Long fwReturnNum) {
        registerModifiedProperty("fwReturnNum");
        _fwReturnNum = fwReturnNum;
    }

    /**
     * [get] UN_RETURN_CNT: {BIGINT(19)} <br>
     * UN_返品件数
     * @return The value of the column 'UN_RETURN_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnReturnCnt() {
        checkSpecifiedProperty("unReturnCnt");
        return _unReturnCnt;
    }

    /**
     * [set] UN_RETURN_CNT: {BIGINT(19)} <br>
     * UN_返品件数
     * @param unReturnCnt The value of the column 'UN_RETURN_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnReturnCnt(Long unReturnCnt) {
        registerModifiedProperty("unReturnCnt");
        _unReturnCnt = unReturnCnt;
    }

    /**
     * [get] UN_RETURN_NUM: {BIGINT(19)} <br>
     * UN_返品数量
     * @return The value of the column 'UN_RETURN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnReturnNum() {
        checkSpecifiedProperty("unReturnNum");
        return _unReturnNum;
    }

    /**
     * [set] UN_RETURN_NUM: {BIGINT(19)} <br>
     * UN_返品数量
     * @param unReturnNum The value of the column 'UN_RETURN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnReturnNum(Long unReturnNum) {
        registerModifiedProperty("unReturnNum");
        _unReturnNum = unReturnNum;
    }

    /**
     * [get] SH_RETURN_CNT: {BIGINT(19)} <br>
     * SH_返品件数
     * @return The value of the column 'SH_RETURN_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShReturnCnt() {
        checkSpecifiedProperty("shReturnCnt");
        return _shReturnCnt;
    }

    /**
     * [set] SH_RETURN_CNT: {BIGINT(19)} <br>
     * SH_返品件数
     * @param shReturnCnt The value of the column 'SH_RETURN_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShReturnCnt(Long shReturnCnt) {
        registerModifiedProperty("shReturnCnt");
        _shReturnCnt = shReturnCnt;
    }

    /**
     * [get] SH_RETURN_NUM: {BIGINT(19)} <br>
     * SH_返品数量
     * @return The value of the column 'SH_RETURN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShReturnNum() {
        checkSpecifiedProperty("shReturnNum");
        return _shReturnNum;
    }

    /**
     * [set] SH_RETURN_NUM: {BIGINT(19)} <br>
     * SH_返品数量
     * @param shReturnNum The value of the column 'SH_RETURN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShReturnNum(Long shReturnNum) {
        registerModifiedProperty("shReturnNum");
        _shReturnNum = shReturnNum;
    }

    /**
     * [get] HM_RETURN_CNT: {BIGINT(19)} <br>
     * HM関連_返品件数
     * @return The value of the column 'HM_RETURN_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getHmReturnCnt() {
        checkSpecifiedProperty("hmReturnCnt");
        return _hmReturnCnt;
    }

    /**
     * [set] HM_RETURN_CNT: {BIGINT(19)} <br>
     * HM関連_返品件数
     * @param hmReturnCnt The value of the column 'HM_RETURN_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHmReturnCnt(Long hmReturnCnt) {
        registerModifiedProperty("hmReturnCnt");
        _hmReturnCnt = hmReturnCnt;
    }

    /**
     * [get] HM_RETURN_NUM: {BIGINT(19)} <br>
     * HM関連_返品数量
     * @return The value of the column 'HM_RETURN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getHmReturnNum() {
        checkSpecifiedProperty("hmReturnNum");
        return _hmReturnNum;
    }

    /**
     * [set] HM_RETURN_NUM: {BIGINT(19)} <br>
     * HM関連_返品数量
     * @param hmReturnNum The value of the column 'HM_RETURN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHmReturnNum(Long hmReturnNum) {
        registerModifiedProperty("hmReturnNum");
        _hmReturnNum = hmReturnNum;
    }

    /**
     * [get] TOTAL_RETURN_CNT: {BIGINT(19)} <br>
     * 合計返品件数
     * @return The value of the column 'TOTAL_RETURN_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalReturnCnt() {
        checkSpecifiedProperty("totalReturnCnt");
        return _totalReturnCnt;
    }

    /**
     * [set] TOTAL_RETURN_CNT: {BIGINT(19)} <br>
     * 合計返品件数
     * @param totalReturnCnt The value of the column 'TOTAL_RETURN_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalReturnCnt(Long totalReturnCnt) {
        registerModifiedProperty("totalReturnCnt");
        _totalReturnCnt = totalReturnCnt;
    }

    /**
     * [get] TOTAL_RETURN_NUM: {BIGINT(19)} <br>
     * 合計返品数量
     * @return The value of the column 'TOTAL_RETURN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalReturnNum() {
        checkSpecifiedProperty("totalReturnNum");
        return _totalReturnNum;
    }

    /**
     * [set] TOTAL_RETURN_NUM: {BIGINT(19)} <br>
     * 合計返品数量
     * @param totalReturnNum The value of the column 'TOTAL_RETURN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalReturnNum(Long totalReturnNum) {
        registerModifiedProperty("totalReturnNum");
        _totalReturnNum = totalReturnNum;
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
