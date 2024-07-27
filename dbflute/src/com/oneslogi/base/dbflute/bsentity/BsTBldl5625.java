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
 * The entity of t_bldl5625 as TABLE. <br>
 * BLDL5625
 * <pre>
 * [primary-key]
 *     BLDL5625_ID
 *
 * [column]
 *     BLDL5625_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_SHIPPING_CNT, FW_SHIPPING_NUM, UN_SHIPPING_CNT, UN_SHIPPING_NUM, SH_SHIPPING_CNT, SH_SHIPPING_NUM, TOTAL_SHIPPING_CNT, TOTAL_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5625_ID
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
 * Long bldl5625Id = entity.getBldl5625Id();
 * String yearmonth = entity.getYearmonth();
 * String baseNm = entity.getBaseNm();
 * String month = entity.getMonth();
 * String rowNo = entity.getRowNo();
 * String shippingDt = entity.getShippingDt();
 * Long fwShippingCnt = entity.getFwShippingCnt();
 * Long fwShippingNum = entity.getFwShippingNum();
 * Long unShippingCnt = entity.getUnShippingCnt();
 * Long unShippingNum = entity.getUnShippingNum();
 * Long shShippingCnt = entity.getShShippingCnt();
 * Long shShippingNum = entity.getShShippingNum();
 * Long totalShippingCnt = entity.getTotalShippingCnt();
 * Long totalShippingNum = entity.getTotalShippingNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBldl5625Id(bldl5625Id);
 * entity.setYearmonth(yearmonth);
 * entity.setBaseNm(baseNm);
 * entity.setMonth(month);
 * entity.setRowNo(rowNo);
 * entity.setShippingDt(shippingDt);
 * entity.setFwShippingCnt(fwShippingCnt);
 * entity.setFwShippingNum(fwShippingNum);
 * entity.setUnShippingCnt(unShippingCnt);
 * entity.setUnShippingNum(unShippingNum);
 * entity.setShShippingCnt(shShippingCnt);
 * entity.setShShippingNum(shShippingNum);
 * entity.setTotalShippingCnt(totalShippingCnt);
 * entity.setTotalShippingNum(totalShippingNum);
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
public abstract class BsTBldl5625 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _bldl5625Id;

    /** YEARMONTH: {VARCHAR(30)} */
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    protected String _month;

    /** ROW_NO: {VARCHAR(30)} */
    protected String _rowNo;

    /** SHIPPING_DT: {VARCHAR(8)} */
    protected String _shippingDt;

    /** FW_SHIPPING_CNT: {BIGINT(19)} */
    protected Long _fwShippingCnt;

    /** FW_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _fwShippingNum;

    /** UN_SHIPPING_CNT: {BIGINT(19)} */
    protected Long _unShippingCnt;

    /** UN_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _unShippingNum;

    /** SH_SHIPPING_CNT: {BIGINT(19)} */
    protected Long _shShippingCnt;

    /** SH_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _shShippingNum;

    /** TOTAL_SHIPPING_CNT: {BIGINT(19)} */
    protected Long _totalShippingCnt;

    /** TOTAL_SHIPPING_NUM: {BIGINT(19)} */
    protected Long _totalShippingNum;

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
        return "t_bldl5625";
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
        if (_bldl5625Id == null) { return false; }
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
        if (obj instanceof BsTBldl5625) {
            BsTBldl5625 other = (BsTBldl5625)obj;
            if (!xSV(_bldl5625Id, other._bldl5625Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bldl5625Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bldl5625Id));
        sb.append(dm).append(xfND(_yearmonth));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_month));
        sb.append(dm).append(xfND(_rowNo));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_fwShippingCnt));
        sb.append(dm).append(xfND(_fwShippingNum));
        sb.append(dm).append(xfND(_unShippingCnt));
        sb.append(dm).append(xfND(_unShippingNum));
        sb.append(dm).append(xfND(_shShippingCnt));
        sb.append(dm).append(xfND(_shShippingNum));
        sb.append(dm).append(xfND(_totalShippingCnt));
        sb.append(dm).append(xfND(_totalShippingNum));
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
    public TBldl5625 clone() {
        return (TBldl5625)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5625ID
     * @return The value of the column 'BLDL5625_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBldl5625Id() {
        checkSpecifiedProperty("bldl5625Id");
        return _bldl5625Id;
    }

    /**
     * [set] BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5625ID
     * @param bldl5625Id The value of the column 'BLDL5625_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBldl5625Id(Long bldl5625Id) {
        registerModifiedProperty("bldl5625Id");
        _bldl5625Id = bldl5625Id;
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
     * [get] FW_SHIPPING_CNT: {BIGINT(19)} <br>
     * FW関連_出荷件数
     * @return The value of the column 'FW_SHIPPING_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwShippingCnt() {
        checkSpecifiedProperty("fwShippingCnt");
        return _fwShippingCnt;
    }

    /**
     * [set] FW_SHIPPING_CNT: {BIGINT(19)} <br>
     * FW関連_出荷件数
     * @param fwShippingCnt The value of the column 'FW_SHIPPING_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwShippingCnt(Long fwShippingCnt) {
        registerModifiedProperty("fwShippingCnt");
        _fwShippingCnt = fwShippingCnt;
    }

    /**
     * [get] FW_SHIPPING_NUM: {BIGINT(19)} <br>
     * FW関連_出荷数量
     * @return The value of the column 'FW_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwShippingNum() {
        checkSpecifiedProperty("fwShippingNum");
        return _fwShippingNum;
    }

    /**
     * [set] FW_SHIPPING_NUM: {BIGINT(19)} <br>
     * FW関連_出荷数量
     * @param fwShippingNum The value of the column 'FW_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwShippingNum(Long fwShippingNum) {
        registerModifiedProperty("fwShippingNum");
        _fwShippingNum = fwShippingNum;
    }

    /**
     * [get] UN_SHIPPING_CNT: {BIGINT(19)} <br>
     * UN関連_出荷件数
     * @return The value of the column 'UN_SHIPPING_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnShippingCnt() {
        checkSpecifiedProperty("unShippingCnt");
        return _unShippingCnt;
    }

    /**
     * [set] UN_SHIPPING_CNT: {BIGINT(19)} <br>
     * UN関連_出荷件数
     * @param unShippingCnt The value of the column 'UN_SHIPPING_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnShippingCnt(Long unShippingCnt) {
        registerModifiedProperty("unShippingCnt");
        _unShippingCnt = unShippingCnt;
    }

    /**
     * [get] UN_SHIPPING_NUM: {BIGINT(19)} <br>
     * UN関連_出荷数量
     * @return The value of the column 'UN_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnShippingNum() {
        checkSpecifiedProperty("unShippingNum");
        return _unShippingNum;
    }

    /**
     * [set] UN_SHIPPING_NUM: {BIGINT(19)} <br>
     * UN関連_出荷数量
     * @param unShippingNum The value of the column 'UN_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnShippingNum(Long unShippingNum) {
        registerModifiedProperty("unShippingNum");
        _unShippingNum = unShippingNum;
    }

    /**
     * [get] SH_SHIPPING_CNT: {BIGINT(19)} <br>
     * SH関連_出荷件数
     * @return The value of the column 'SH_SHIPPING_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShShippingCnt() {
        checkSpecifiedProperty("shShippingCnt");
        return _shShippingCnt;
    }

    /**
     * [set] SH_SHIPPING_CNT: {BIGINT(19)} <br>
     * SH関連_出荷件数
     * @param shShippingCnt The value of the column 'SH_SHIPPING_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShShippingCnt(Long shShippingCnt) {
        registerModifiedProperty("shShippingCnt");
        _shShippingCnt = shShippingCnt;
    }

    /**
     * [get] SH_SHIPPING_NUM: {BIGINT(19)} <br>
     * SH関連_出荷数量
     * @return The value of the column 'SH_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShShippingNum() {
        checkSpecifiedProperty("shShippingNum");
        return _shShippingNum;
    }

    /**
     * [set] SH_SHIPPING_NUM: {BIGINT(19)} <br>
     * SH関連_出荷数量
     * @param shShippingNum The value of the column 'SH_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShShippingNum(Long shShippingNum) {
        registerModifiedProperty("shShippingNum");
        _shShippingNum = shShippingNum;
    }

    /**
     * [get] TOTAL_SHIPPING_CNT: {BIGINT(19)} <br>
     * 当日合計_出荷件数
     * @return The value of the column 'TOTAL_SHIPPING_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalShippingCnt() {
        checkSpecifiedProperty("totalShippingCnt");
        return _totalShippingCnt;
    }

    /**
     * [set] TOTAL_SHIPPING_CNT: {BIGINT(19)} <br>
     * 当日合計_出荷件数
     * @param totalShippingCnt The value of the column 'TOTAL_SHIPPING_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalShippingCnt(Long totalShippingCnt) {
        registerModifiedProperty("totalShippingCnt");
        _totalShippingCnt = totalShippingCnt;
    }

    /**
     * [get] TOTAL_SHIPPING_NUM: {BIGINT(19)} <br>
     * 当日合計_出荷数量
     * @return The value of the column 'TOTAL_SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalShippingNum() {
        checkSpecifiedProperty("totalShippingNum");
        return _totalShippingNum;
    }

    /**
     * [set] TOTAL_SHIPPING_NUM: {BIGINT(19)} <br>
     * 当日合計_出荷数量
     * @param totalShippingNum The value of the column 'TOTAL_SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalShippingNum(Long totalShippingNum) {
        registerModifiedProperty("totalShippingNum");
        _totalShippingNum = totalShippingNum;
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
