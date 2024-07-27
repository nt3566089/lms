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
 * The entity of t_bldl3330 as TABLE. <br>
 * BLDL3330
 * <pre>
 * [primary-key]
 *     BLDL3310_ID
 *
 * [column]
 *     BLDL3310_ID, YEARMONTH, BASE_NM, MONTH, CONTRACTOR_NM, EC_USER_TYPE_CD, FW_NUM, SANSHA_FW_NUM, SANSHA_UN_NUM, SANSHA_SH_NUM, SANSHA_HM_NUM, SANSHA_TOTAL_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * Long bldl3310Id = entity.getBldl3310Id();
 * String yearmonth = entity.getYearmonth();
 * String baseNm = entity.getBaseNm();
 * String month = entity.getMonth();
 * String contractorNm = entity.getContractorNm();
 * String ecUserTypeCd = entity.getEcUserTypeCd();
 * Long fwNum = entity.getFwNum();
 * Long sanshaFwNum = entity.getSanshaFwNum();
 * Long sanshaUnNum = entity.getSanshaUnNum();
 * Long sanshaShNum = entity.getSanshaShNum();
 * Long sanshaHmNum = entity.getSanshaHmNum();
 * Long sanshaTotalNum = entity.getSanshaTotalNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBldl3310Id(bldl3310Id);
 * entity.setYearmonth(yearmonth);
 * entity.setBaseNm(baseNm);
 * entity.setMonth(month);
 * entity.setContractorNm(contractorNm);
 * entity.setEcUserTypeCd(ecUserTypeCd);
 * entity.setFwNum(fwNum);
 * entity.setSanshaFwNum(sanshaFwNum);
 * entity.setSanshaUnNum(sanshaUnNum);
 * entity.setSanshaShNum(sanshaShNum);
 * entity.setSanshaHmNum(sanshaHmNum);
 * entity.setSanshaTotalNum(sanshaTotalNum);
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
public abstract class BsTBldl3330 extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BLDL3310_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _bldl3310Id;

    /** YEARMONTH: {VARCHAR(30)} */
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    protected String _month;

    /** CONTRACTOR_NM: {VARCHAR(60)} */
    protected String _contractorNm;

    /** EC_USER_TYPE_CD: {VARCHAR(30)} */
    protected String _ecUserTypeCd;

    /** FW_NUM: {BIGINT(19)} */
    protected Long _fwNum;

    /** SANSHA_FW_NUM: {BIGINT(19)} */
    protected Long _sanshaFwNum;

    /** SANSHA_UN_NUM: {BIGINT(19)} */
    protected Long _sanshaUnNum;

    /** SANSHA_SH_NUM: {BIGINT(19)} */
    protected Long _sanshaShNum;

    /** SANSHA_HM_NUM: {BIGINT(19)} */
    protected Long _sanshaHmNum;

    /** SANSHA_TOTAL_NUM: {BIGINT(19)} */
    protected Long _sanshaTotalNum;

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
        return "t_bldl3330";
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
        if (_bldl3310Id == null) { return false; }
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
        if (obj instanceof BsTBldl3330) {
            BsTBldl3330 other = (BsTBldl3330)obj;
            if (!xSV(_bldl3310Id, other._bldl3310Id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bldl3310Id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bldl3310Id));
        sb.append(dm).append(xfND(_yearmonth));
        sb.append(dm).append(xfND(_baseNm));
        sb.append(dm).append(xfND(_month));
        sb.append(dm).append(xfND(_contractorNm));
        sb.append(dm).append(xfND(_ecUserTypeCd));
        sb.append(dm).append(xfND(_fwNum));
        sb.append(dm).append(xfND(_sanshaFwNum));
        sb.append(dm).append(xfND(_sanshaUnNum));
        sb.append(dm).append(xfND(_sanshaShNum));
        sb.append(dm).append(xfND(_sanshaHmNum));
        sb.append(dm).append(xfND(_sanshaTotalNum));
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
    public TBldl3330 clone() {
        return (TBldl3330)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLDL3310_ID: {PK, NotNull, BIGINT(19)} <br>
     * BLDL3330ID
     * @return The value of the column 'BLDL3310_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBldl3310Id() {
        checkSpecifiedProperty("bldl3310Id");
        return _bldl3310Id;
    }

    /**
     * [set] BLDL3310_ID: {PK, NotNull, BIGINT(19)} <br>
     * BLDL3330ID
     * @param bldl3310Id The value of the column 'BLDL3310_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBldl3310Id(Long bldl3310Id) {
        registerModifiedProperty("bldl3310Id");
        _bldl3310Id = bldl3310Id;
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
     * [get] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸口契約先
     * @return The value of the column 'CONTRACTOR_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getContractorNm() {
        checkSpecifiedProperty("contractorNm");
        return convertEmptyToNull(_contractorNm);
    }

    /**
     * [set] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸口契約先
     * @param contractorNm The value of the column 'CONTRACTOR_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setContractorNm(String contractorNm) {
        registerModifiedProperty("contractorNm");
        _contractorNm = contractorNm;
    }

    /**
     * [get] EC_USER_TYPE_CD: {VARCHAR(30)} <br>
     * ECユーザ区分
     * @return The value of the column 'EC_USER_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcUserTypeCd() {
        checkSpecifiedProperty("ecUserTypeCd");
        return convertEmptyToNull(_ecUserTypeCd);
    }

    /**
     * [set] EC_USER_TYPE_CD: {VARCHAR(30)} <br>
     * ECユーザ区分
     * @param ecUserTypeCd The value of the column 'EC_USER_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcUserTypeCd(String ecUserTypeCd) {
        registerModifiedProperty("ecUserTypeCd");
        _ecUserTypeCd = ecUserTypeCd;
    }

    /**
     * [get] FW_NUM: {BIGINT(19)} <br>
     * FW単体数量
     * @return The value of the column 'FW_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFwNum() {
        checkSpecifiedProperty("fwNum");
        return _fwNum;
    }

    /**
     * [set] FW_NUM: {BIGINT(19)} <br>
     * FW単体数量
     * @param fwNum The value of the column 'FW_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwNum(Long fwNum) {
        registerModifiedProperty("fwNum");
        _fwNum = fwNum;
    }

    /**
     * [get] SANSHA_FW_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_FW数量
     * @return The value of the column 'SANSHA_FW_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSanshaFwNum() {
        checkSpecifiedProperty("sanshaFwNum");
        return _sanshaFwNum;
    }

    /**
     * [set] SANSHA_FW_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_FW数量
     * @param sanshaFwNum The value of the column 'SANSHA_FW_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaFwNum(Long sanshaFwNum) {
        registerModifiedProperty("sanshaFwNum");
        _sanshaFwNum = sanshaFwNum;
    }

    /**
     * [get] SANSHA_UN_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_UN数量
     * @return The value of the column 'SANSHA_UN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSanshaUnNum() {
        checkSpecifiedProperty("sanshaUnNum");
        return _sanshaUnNum;
    }

    /**
     * [set] SANSHA_UN_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_UN数量
     * @param sanshaUnNum The value of the column 'SANSHA_UN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaUnNum(Long sanshaUnNum) {
        registerModifiedProperty("sanshaUnNum");
        _sanshaUnNum = sanshaUnNum;
    }

    /**
     * [get] SANSHA_SH_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_SH数量
     * @return The value of the column 'SANSHA_SH_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSanshaShNum() {
        checkSpecifiedProperty("sanshaShNum");
        return _sanshaShNum;
    }

    /**
     * [set] SANSHA_SH_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_SH数量
     * @param sanshaShNum The value of the column 'SANSHA_SH_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaShNum(Long sanshaShNum) {
        registerModifiedProperty("sanshaShNum");
        _sanshaShNum = sanshaShNum;
    }

    /**
     * [get] SANSHA_HM_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_HM数量
     * @return The value of the column 'SANSHA_HM_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSanshaHmNum() {
        checkSpecifiedProperty("sanshaHmNum");
        return _sanshaHmNum;
    }

    /**
     * [set] SANSHA_HM_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_HM数量
     * @param sanshaHmNum The value of the column 'SANSHA_HM_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaHmNum(Long sanshaHmNum) {
        registerModifiedProperty("sanshaHmNum");
        _sanshaHmNum = sanshaHmNum;
    }

    /**
     * [get] SANSHA_TOTAL_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_3社合計
     * @return The value of the column 'SANSHA_TOTAL_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSanshaTotalNum() {
        checkSpecifiedProperty("sanshaTotalNum");
        return _sanshaTotalNum;
    }

    /**
     * [set] SANSHA_TOTAL_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_3社合計
     * @param sanshaTotalNum The value of the column 'SANSHA_TOTAL_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaTotalNum(Long sanshaTotalNum) {
        registerModifiedProperty("sanshaTotalNum");
        _sanshaTotalNum = sanshaTotalNum;
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