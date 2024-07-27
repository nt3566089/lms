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
 * The entity of e_product as TABLE. <br>
 * 商品マスタ受信テーブル
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HINMOKU_CD, HINMOKU_GROUP_CD, HINMOKU_TEXT, JAN_CD, SIZE_NM, CASE_TYPE_CD, UNIT_NUM, LOGI_WEIGHT_FLG, LOGI_SPECIAL_TYPE_CD, LOGI_ATTENTION_TYPE_CD, UNIT_NM, OLD_JAN_CD, SAP_ADD_DT, SAP_ADD_TIME, STORAGE_LOCATION_TYPE_CD, MEDICAL_MANAG_FLG, PROD_DT_MANAG_FLG, PROD_DT_LIMIT_DAYS_RCV, PROD_DT_LIMIT_DAYS_SHP, NIZOROE_10_NUM, SERIAL_MANAG_FLG, OCR_DATE_FORMAT, LP_SEND_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_NM, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_NM, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
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
 * Long productId = entity.getProductId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String hinmokuCd = entity.getHinmokuCd();
 * String hinmokuGroupCd = entity.getHinmokuGroupCd();
 * String hinmokuText = entity.getHinmokuText();
 * String janCd = entity.getJanCd();
 * String sizeNm = entity.getSizeNm();
 * String caseTypeCd = entity.getCaseTypeCd();
 * String unitNum = entity.getUnitNum();
 * String logiWeightFlg = entity.getLogiWeightFlg();
 * String logiSpecialTypeCd = entity.getLogiSpecialTypeCd();
 * String logiAttentionTypeCd = entity.getLogiAttentionTypeCd();
 * String unitNm = entity.getUnitNm();
 * String oldJanCd = entity.getOldJanCd();
 * String sapAddDt = entity.getSapAddDt();
 * String sapAddTime = entity.getSapAddTime();
 * String storageLocationTypeCd = entity.getStorageLocationTypeCd();
 * String medicalManagFlg = entity.getMedicalManagFlg();
 * String prodDtManagFlg = entity.getProdDtManagFlg();
 * String prodDtLimitDaysRcv = entity.getProdDtLimitDaysRcv();
 * String prodDtLimitDaysShp = entity.getProdDtLimitDaysShp();
 * String nizoroe10Num = entity.getNizoroe10Num();
 * String serialManagFlg = entity.getSerialManagFlg();
 * String ocrDateFormat = entity.getOcrDateFormat();
 * String lpSendFlg = entity.getLpSendFlg();
 * String sapAddYyyy = entity.getSapAddYyyy();
 * String sapAddMm = entity.getSapAddMm();
 * String sapAddDd = entity.getSapAddDd();
 * String sapAddHh = entity.getSapAddHh();
 * String sapAddMi = entity.getSapAddMi();
 * String sapAddSs = entity.getSapAddSs();
 * String sapAddUserNm = entity.getSapAddUserNm();
 * String sapUpdYyyy = entity.getSapUpdYyyy();
 * String sapUpdMm = entity.getSapUpdMm();
 * String sapUpdDd = entity.getSapUpdDd();
 * String sapUpdHh = entity.getSapUpdHh();
 * String sapUpdMi = entity.getSapUpdMi();
 * String sapUpdSs = entity.getSapUpdSs();
 * String sapUpdUserNm = entity.getSapUpdUserNm();
 * String spareStr = entity.getSpareStr();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setProductId(productId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setHinmokuCd(hinmokuCd);
 * entity.setHinmokuGroupCd(hinmokuGroupCd);
 * entity.setHinmokuText(hinmokuText);
 * entity.setJanCd(janCd);
 * entity.setSizeNm(sizeNm);
 * entity.setCaseTypeCd(caseTypeCd);
 * entity.setUnitNum(unitNum);
 * entity.setLogiWeightFlg(logiWeightFlg);
 * entity.setLogiSpecialTypeCd(logiSpecialTypeCd);
 * entity.setLogiAttentionTypeCd(logiAttentionTypeCd);
 * entity.setUnitNm(unitNm);
 * entity.setOldJanCd(oldJanCd);
 * entity.setSapAddDt(sapAddDt);
 * entity.setSapAddTime(sapAddTime);
 * entity.setStorageLocationTypeCd(storageLocationTypeCd);
 * entity.setMedicalManagFlg(medicalManagFlg);
 * entity.setProdDtManagFlg(prodDtManagFlg);
 * entity.setProdDtLimitDaysRcv(prodDtLimitDaysRcv);
 * entity.setProdDtLimitDaysShp(prodDtLimitDaysShp);
 * entity.setNizoroe10Num(nizoroe10Num);
 * entity.setSerialManagFlg(serialManagFlg);
 * entity.setOcrDateFormat(ocrDateFormat);
 * entity.setLpSendFlg(lpSendFlg);
 * entity.setSapAddYyyy(sapAddYyyy);
 * entity.setSapAddMm(sapAddMm);
 * entity.setSapAddDd(sapAddDd);
 * entity.setSapAddHh(sapAddHh);
 * entity.setSapAddMi(sapAddMi);
 * entity.setSapAddSs(sapAddSs);
 * entity.setSapAddUserNm(sapAddUserNm);
 * entity.setSapUpdYyyy(sapUpdYyyy);
 * entity.setSapUpdMm(sapUpdMm);
 * entity.setSapUpdDd(sapUpdDd);
 * entity.setSapUpdHh(sapUpdHh);
 * entity.setSapUpdMi(sapUpdMi);
 * entity.setSapUpdSs(sapUpdSs);
 * entity.setSapUpdUserNm(sapUpdUserNm);
 * entity.setSpareStr(spareStr);
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
public abstract class BsEProduct extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _productId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    protected String _errorMessageCd;

    /** HINMOKU_CD: {VARCHAR(100)} */
    protected String _hinmokuCd;

    /** HINMOKU_GROUP_CD: {VARCHAR(30)} */
    protected String _hinmokuGroupCd;

    /** HINMOKU_TEXT: {VARCHAR(100)} */
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** SIZE_NM: {VARCHAR(60)} */
    protected String _sizeNm;

    /** CASE_TYPE_CD: {VARCHAR(30)} */
    protected String _caseTypeCd;

    /** UNIT_NUM: {VARCHAR(30)} */
    protected String _unitNum;

    /** LOGI_WEIGHT_FLG: {VARCHAR(30)} */
    protected String _logiWeightFlg;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} */
    protected String _logiSpecialTypeCd;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} */
    protected String _logiAttentionTypeCd;

    /** UNIT_NM: {VARCHAR(30)} */
    protected String _unitNm;

    /** OLD_JAN_CD: {VARCHAR(30)} */
    protected String _oldJanCd;

    /** SAP_ADD_DT: {VARCHAR(30)} */
    protected String _sapAddDt;

    /** SAP_ADD_TIME: {VARCHAR(30)} */
    protected String _sapAddTime;

    /** STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)} */
    protected String _storageLocationTypeCd;

    /** MEDICAL_MANAG_FLG: {CHAR(1)} */
    protected String _medicalManagFlg;

    /** PROD_DT_MANAG_FLG: {CHAR(1)} */
    protected String _prodDtManagFlg;

    /** PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)} */
    protected String _prodDtLimitDaysRcv;

    /** PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)} */
    protected String _prodDtLimitDaysShp;

    /** NIZOROE_10_NUM: {VARCHAR(30)} */
    protected String _nizoroe10Num;

    /** SERIAL_MANAG_FLG: {CHAR(1)} */
    protected String _serialManagFlg;

    /** OCR_DATE_FORMAT: {VARCHAR(30)} */
    protected String _ocrDateFormat;

    /** LP_SEND_FLG: {CHAR(1)} */
    protected String _lpSendFlg;

    /** SAP_ADD_YYYY: {VARCHAR(30)} */
    protected String _sapAddYyyy;

    /** SAP_ADD_MM: {VARCHAR(30)} */
    protected String _sapAddMm;

    /** SAP_ADD_DD: {VARCHAR(30)} */
    protected String _sapAddDd;

    /** SAP_ADD_HH: {VARCHAR(30)} */
    protected String _sapAddHh;

    /** SAP_ADD_MI: {VARCHAR(30)} */
    protected String _sapAddMi;

    /** SAP_ADD_SS: {VARCHAR(30)} */
    protected String _sapAddSs;

    /** SAP_ADD_USER_NM: {VARCHAR(30)} */
    protected String _sapAddUserNm;

    /** SAP_UPD_YYYY: {VARCHAR(30)} */
    protected String _sapUpdYyyy;

    /** SAP_UPD_MM: {VARCHAR(30)} */
    protected String _sapUpdMm;

    /** SAP_UPD_DD: {VARCHAR(30)} */
    protected String _sapUpdDd;

    /** SAP_UPD_HH: {VARCHAR(30)} */
    protected String _sapUpdHh;

    /** SAP_UPD_MI: {VARCHAR(30)} */
    protected String _sapUpdMi;

    /** SAP_UPD_SS: {VARCHAR(30)} */
    protected String _sapUpdSs;

    /** SAP_UPD_USER_NM: {VARCHAR(30)} */
    protected String _sapUpdUserNm;

    /** SPARE_STR: {VARCHAR(255)} */
    protected String _spareStr;

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
        return "e_product";
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
        if (_productId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param receiveCd : UQ+, IX, NotNull, VARCHAR(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, BIGINT(19). (NotNull)
     */
    public void uniqueBy(String receiveCd, Long receiveRowId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("receiveCd");
        __uniqueDrivenProperties.addPropertyName("receiveRowId");
        setReceiveCd(receiveCd);setReceiveRowId(receiveRowId);
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
        if (obj instanceof BsEProduct) {
            BsEProduct other = (BsEProduct)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_hinmokuCd));
        sb.append(dm).append(xfND(_hinmokuGroupCd));
        sb.append(dm).append(xfND(_hinmokuText));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_sizeNm));
        sb.append(dm).append(xfND(_caseTypeCd));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_logiWeightFlg));
        sb.append(dm).append(xfND(_logiSpecialTypeCd));
        sb.append(dm).append(xfND(_logiAttentionTypeCd));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_oldJanCd));
        sb.append(dm).append(xfND(_sapAddDt));
        sb.append(dm).append(xfND(_sapAddTime));
        sb.append(dm).append(xfND(_storageLocationTypeCd));
        sb.append(dm).append(xfND(_medicalManagFlg));
        sb.append(dm).append(xfND(_prodDtManagFlg));
        sb.append(dm).append(xfND(_prodDtLimitDaysRcv));
        sb.append(dm).append(xfND(_prodDtLimitDaysShp));
        sb.append(dm).append(xfND(_nizoroe10Num));
        sb.append(dm).append(xfND(_serialManagFlg));
        sb.append(dm).append(xfND(_ocrDateFormat));
        sb.append(dm).append(xfND(_lpSendFlg));
        sb.append(dm).append(xfND(_sapAddYyyy));
        sb.append(dm).append(xfND(_sapAddMm));
        sb.append(dm).append(xfND(_sapAddDd));
        sb.append(dm).append(xfND(_sapAddHh));
        sb.append(dm).append(xfND(_sapAddMi));
        sb.append(dm).append(xfND(_sapAddSs));
        sb.append(dm).append(xfND(_sapAddUserNm));
        sb.append(dm).append(xfND(_sapUpdYyyy));
        sb.append(dm).append(xfND(_sapUpdMm));
        sb.append(dm).append(xfND(_sapUpdDd));
        sb.append(dm).append(xfND(_sapUpdHh));
        sb.append(dm).append(xfND(_sapUpdMi));
        sb.append(dm).append(xfND(_sapUpdSs));
        sb.append(dm).append(xfND(_sapUpdUserNm));
        sb.append(dm).append(xfND(_spareStr));
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
    public EProduct clone() {
        return (EProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品マスタ連携受信ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品マスタ連携受信ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuCd() {
        checkSpecifiedProperty("hinmokuCd");
        return convertEmptyToNull(_hinmokuCd);
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuCd(String hinmokuCd) {
        registerModifiedProperty("hinmokuCd");
        _hinmokuCd = hinmokuCd;
    }

    /**
     * [get] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuGroupCd() {
        checkSpecifiedProperty("hinmokuGroupCd");
        return convertEmptyToNull(_hinmokuGroupCd);
    }

    /**
     * [set] HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroupCd The value of the column 'HINMOKU_GROUP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuGroupCd(String hinmokuGroupCd) {
        registerModifiedProperty("hinmokuGroupCd");
        _hinmokuGroupCd = hinmokuGroupCd;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(100)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuText() {
        checkSpecifiedProperty("hinmokuText");
        return convertEmptyToNull(_hinmokuText);
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(100)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuText(String hinmokuText) {
        registerModifiedProperty("hinmokuText");
        _hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] SIZE_NM: {VARCHAR(60)} <br>
     * サイズ名称
     * @return The value of the column 'SIZE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSizeNm() {
        checkSpecifiedProperty("sizeNm");
        return convertEmptyToNull(_sizeNm);
    }

    /**
     * [set] SIZE_NM: {VARCHAR(60)} <br>
     * サイズ名称
     * @param sizeNm The value of the column 'SIZE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSizeNm(String sizeNm) {
        registerModifiedProperty("sizeNm");
        _sizeNm = sizeNm;
    }

    /**
     * [get] CASE_TYPE_CD: {VARCHAR(30)} <br>
     * ケース区分
     * @return The value of the column 'CASE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseTypeCd() {
        checkSpecifiedProperty("caseTypeCd");
        return convertEmptyToNull(_caseTypeCd);
    }

    /**
     * [set] CASE_TYPE_CD: {VARCHAR(30)} <br>
     * ケース区分
     * @param caseTypeCd The value of the column 'CASE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseTypeCd(String caseTypeCd) {
        registerModifiedProperty("caseTypeCd");
        _caseTypeCd = caseTypeCd;
    }

    /**
     * [get] UNIT_NUM: {VARCHAR(30)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNum() {
        checkSpecifiedProperty("unitNum");
        return convertEmptyToNull(_unitNum);
    }

    /**
     * [set] UNIT_NUM: {VARCHAR(30)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNum(String unitNum) {
        registerModifiedProperty("unitNum");
        _unitNum = unitNum;
    }

    /**
     * [get] LOGI_WEIGHT_FLG: {VARCHAR(30)} <br>
     * 物流重量物フラグ
     * @return The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiWeightFlg() {
        checkSpecifiedProperty("logiWeightFlg");
        return convertEmptyToNull(_logiWeightFlg);
    }

    /**
     * [set] LOGI_WEIGHT_FLG: {VARCHAR(30)} <br>
     * 物流重量物フラグ
     * @param logiWeightFlg The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiWeightFlg(String logiWeightFlg) {
        registerModifiedProperty("logiWeightFlg");
        _logiWeightFlg = logiWeightFlg;
    }

    /**
     * [get] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @return The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiSpecialTypeCd() {
        checkSpecifiedProperty("logiSpecialTypeCd");
        return convertEmptyToNull(_logiSpecialTypeCd);
    }

    /**
     * [set] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @param logiSpecialTypeCd The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiSpecialTypeCd(String logiSpecialTypeCd) {
        registerModifiedProperty("logiSpecialTypeCd");
        _logiSpecialTypeCd = logiSpecialTypeCd;
    }

    /**
     * [get] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @return The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiAttentionTypeCd() {
        checkSpecifiedProperty("logiAttentionTypeCd");
        return convertEmptyToNull(_logiAttentionTypeCd);
    }

    /**
     * [set] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @param logiAttentionTypeCd The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiAttentionTypeCd(String logiAttentionTypeCd) {
        registerModifiedProperty("logiAttentionTypeCd");
        _logiAttentionTypeCd = logiAttentionTypeCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNm() {
        checkSpecifiedProperty("unitNm");
        return convertEmptyToNull(_unitNm);
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNm(String unitNm) {
        registerModifiedProperty("unitNm");
        _unitNm = unitNm;
    }

    /**
     * [get] OLD_JAN_CD: {VARCHAR(30)} <br>
     * 旧JANコード
     * @return The value of the column 'OLD_JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOldJanCd() {
        checkSpecifiedProperty("oldJanCd");
        return convertEmptyToNull(_oldJanCd);
    }

    /**
     * [set] OLD_JAN_CD: {VARCHAR(30)} <br>
     * 旧JANコード
     * @param oldJanCd The value of the column 'OLD_JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOldJanCd(String oldJanCd) {
        registerModifiedProperty("oldJanCd");
        _oldJanCd = oldJanCd;
    }

    /**
     * [get] SAP_ADD_DT: {VARCHAR(30)} <br>
     * SAP作成日
     * @return The value of the column 'SAP_ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddDt() {
        checkSpecifiedProperty("sapAddDt");
        return convertEmptyToNull(_sapAddDt);
    }

    /**
     * [set] SAP_ADD_DT: {VARCHAR(30)} <br>
     * SAP作成日
     * @param sapAddDt The value of the column 'SAP_ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddDt(String sapAddDt) {
        registerModifiedProperty("sapAddDt");
        _sapAddDt = sapAddDt;
    }

    /**
     * [get] SAP_ADD_TIME: {VARCHAR(30)} <br>
     * SAP作成時間
     * @return The value of the column 'SAP_ADD_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddTime() {
        checkSpecifiedProperty("sapAddTime");
        return convertEmptyToNull(_sapAddTime);
    }

    /**
     * [set] SAP_ADD_TIME: {VARCHAR(30)} <br>
     * SAP作成時間
     * @param sapAddTime The value of the column 'SAP_ADD_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddTime(String sapAddTime) {
        registerModifiedProperty("sapAddTime");
        _sapAddTime = sapAddTime;
    }

    /**
     * [get] STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)} <br>
     * フロア区分_保管場所区分
     * @return The value of the column 'STORAGE_LOCATION_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorageLocationTypeCd() {
        checkSpecifiedProperty("storageLocationTypeCd");
        return convertEmptyToNull(_storageLocationTypeCd);
    }

    /**
     * [set] STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)} <br>
     * フロア区分_保管場所区分
     * @param storageLocationTypeCd The value of the column 'STORAGE_LOCATION_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorageLocationTypeCd(String storageLocationTypeCd) {
        registerModifiedProperty("storageLocationTypeCd");
        _storageLocationTypeCd = storageLocationTypeCd;
    }

    /**
     * [get] MEDICAL_MANAG_FLG: {CHAR(1)} <br>
     * 医療用管理フラグ
     * @return The value of the column 'MEDICAL_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMedicalManagFlg() {
        checkSpecifiedProperty("medicalManagFlg");
        return convertEmptyToNull(_medicalManagFlg);
    }

    /**
     * [set] MEDICAL_MANAG_FLG: {CHAR(1)} <br>
     * 医療用管理フラグ
     * @param medicalManagFlg The value of the column 'MEDICAL_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMedicalManagFlg(String medicalManagFlg) {
        registerModifiedProperty("medicalManagFlg");
        _medicalManagFlg = medicalManagFlg;
    }

    /**
     * [get] PROD_DT_MANAG_FLG: {CHAR(1)} <br>
     * 製造日管理フラグ
     * @return The value of the column 'PROD_DT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDtManagFlg() {
        checkSpecifiedProperty("prodDtManagFlg");
        return convertEmptyToNull(_prodDtManagFlg);
    }

    /**
     * [set] PROD_DT_MANAG_FLG: {CHAR(1)} <br>
     * 製造日管理フラグ
     * @param prodDtManagFlg The value of the column 'PROD_DT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDtManagFlg(String prodDtManagFlg) {
        registerModifiedProperty("prodDtManagFlg");
        _prodDtManagFlg = prodDtManagFlg;
    }

    /**
     * [get] PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)} <br>
     * 入荷製造日限界日数
     * @return The value of the column 'PROD_DT_LIMIT_DAYS_RCV'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDtLimitDaysRcv() {
        checkSpecifiedProperty("prodDtLimitDaysRcv");
        return convertEmptyToNull(_prodDtLimitDaysRcv);
    }

    /**
     * [set] PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)} <br>
     * 入荷製造日限界日数
     * @param prodDtLimitDaysRcv The value of the column 'PROD_DT_LIMIT_DAYS_RCV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDtLimitDaysRcv(String prodDtLimitDaysRcv) {
        registerModifiedProperty("prodDtLimitDaysRcv");
        _prodDtLimitDaysRcv = prodDtLimitDaysRcv;
    }

    /**
     * [get] PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)} <br>
     * 出荷製造日限界日数
     * @return The value of the column 'PROD_DT_LIMIT_DAYS_SHP'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDtLimitDaysShp() {
        checkSpecifiedProperty("prodDtLimitDaysShp");
        return convertEmptyToNull(_prodDtLimitDaysShp);
    }

    /**
     * [set] PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)} <br>
     * 出荷製造日限界日数
     * @param prodDtLimitDaysShp The value of the column 'PROD_DT_LIMIT_DAYS_SHP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDtLimitDaysShp(String prodDtLimitDaysShp) {
        registerModifiedProperty("prodDtLimitDaysShp");
        _prodDtLimitDaysShp = prodDtLimitDaysShp;
    }

    /**
     * [get] NIZOROE_10_NUM: {VARCHAR(30)} <br>
     * 荷揃処理10足用足数
     * @return The value of the column 'NIZOROE_10_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroe10Num() {
        checkSpecifiedProperty("nizoroe10Num");
        return convertEmptyToNull(_nizoroe10Num);
    }

    /**
     * [set] NIZOROE_10_NUM: {VARCHAR(30)} <br>
     * 荷揃処理10足用足数
     * @param nizoroe10Num The value of the column 'NIZOROE_10_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroe10Num(String nizoroe10Num) {
        registerModifiedProperty("nizoroe10Num");
        _nizoroe10Num = nizoroe10Num;
    }

    /**
     * [get] SERIAL_MANAG_FLG: {CHAR(1)} <br>
     * シリアル管理フラグ
     * @return The value of the column 'SERIAL_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSerialManagFlg() {
        checkSpecifiedProperty("serialManagFlg");
        return convertEmptyToNull(_serialManagFlg);
    }

    /**
     * [set] SERIAL_MANAG_FLG: {CHAR(1)} <br>
     * シリアル管理フラグ
     * @param serialManagFlg The value of the column 'SERIAL_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSerialManagFlg(String serialManagFlg) {
        registerModifiedProperty("serialManagFlg");
        _serialManagFlg = serialManagFlg;
    }

    /**
     * [get] OCR_DATE_FORMAT: {VARCHAR(30)} <br>
     * OCR日付形式
     * @return The value of the column 'OCR_DATE_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOcrDateFormat() {
        checkSpecifiedProperty("ocrDateFormat");
        return convertEmptyToNull(_ocrDateFormat);
    }

    /**
     * [set] OCR_DATE_FORMAT: {VARCHAR(30)} <br>
     * OCR日付形式
     * @param ocrDateFormat The value of the column 'OCR_DATE_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOcrDateFormat(String ocrDateFormat) {
        registerModifiedProperty("ocrDateFormat");
        _ocrDateFormat = ocrDateFormat;
    }

    /**
     * [get] LP_SEND_FLG: {CHAR(1)} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLpSendFlg() {
        checkSpecifiedProperty("lpSendFlg");
        return convertEmptyToNull(_lpSendFlg);
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1)} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLpSendFlg(String lpSendFlg) {
        registerModifiedProperty("lpSendFlg");
        _lpSendFlg = lpSendFlg;
    }

    /**
     * [get] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @return The value of the column 'SAP_ADD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddYyyy() {
        checkSpecifiedProperty("sapAddYyyy");
        return convertEmptyToNull(_sapAddYyyy);
    }

    /**
     * [set] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @param sapAddYyyy The value of the column 'SAP_ADD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddYyyy(String sapAddYyyy) {
        registerModifiedProperty("sapAddYyyy");
        _sapAddYyyy = sapAddYyyy;
    }

    /**
     * [get] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @return The value of the column 'SAP_ADD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddMm() {
        checkSpecifiedProperty("sapAddMm");
        return convertEmptyToNull(_sapAddMm);
    }

    /**
     * [set] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @param sapAddMm The value of the column 'SAP_ADD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddMm(String sapAddMm) {
        registerModifiedProperty("sapAddMm");
        _sapAddMm = sapAddMm;
    }

    /**
     * [get] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @return The value of the column 'SAP_ADD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddDd() {
        checkSpecifiedProperty("sapAddDd");
        return convertEmptyToNull(_sapAddDd);
    }

    /**
     * [set] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @param sapAddDd The value of the column 'SAP_ADD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddDd(String sapAddDd) {
        registerModifiedProperty("sapAddDd");
        _sapAddDd = sapAddDd;
    }

    /**
     * [get] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @return The value of the column 'SAP_ADD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddHh() {
        checkSpecifiedProperty("sapAddHh");
        return convertEmptyToNull(_sapAddHh);
    }

    /**
     * [set] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @param sapAddHh The value of the column 'SAP_ADD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddHh(String sapAddHh) {
        registerModifiedProperty("sapAddHh");
        _sapAddHh = sapAddHh;
    }

    /**
     * [get] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @return The value of the column 'SAP_ADD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddMi() {
        checkSpecifiedProperty("sapAddMi");
        return convertEmptyToNull(_sapAddMi);
    }

    /**
     * [set] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @param sapAddMi The value of the column 'SAP_ADD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddMi(String sapAddMi) {
        registerModifiedProperty("sapAddMi");
        _sapAddMi = sapAddMi;
    }

    /**
     * [get] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @return The value of the column 'SAP_ADD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddSs() {
        checkSpecifiedProperty("sapAddSs");
        return convertEmptyToNull(_sapAddSs);
    }

    /**
     * [set] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @param sapAddSs The value of the column 'SAP_ADD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddSs(String sapAddSs) {
        registerModifiedProperty("sapAddSs");
        _sapAddSs = sapAddSs;
    }

    /**
     * [get] SAP_ADD_USER_NM: {VARCHAR(30)} <br>
     * SAP作成者
     * @return The value of the column 'SAP_ADD_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddUserNm() {
        checkSpecifiedProperty("sapAddUserNm");
        return convertEmptyToNull(_sapAddUserNm);
    }

    /**
     * [set] SAP_ADD_USER_NM: {VARCHAR(30)} <br>
     * SAP作成者
     * @param sapAddUserNm The value of the column 'SAP_ADD_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddUserNm(String sapAddUserNm) {
        registerModifiedProperty("sapAddUserNm");
        _sapAddUserNm = sapAddUserNm;
    }

    /**
     * [get] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @return The value of the column 'SAP_UPD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdYyyy() {
        checkSpecifiedProperty("sapUpdYyyy");
        return convertEmptyToNull(_sapUpdYyyy);
    }

    /**
     * [set] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @param sapUpdYyyy The value of the column 'SAP_UPD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdYyyy(String sapUpdYyyy) {
        registerModifiedProperty("sapUpdYyyy");
        _sapUpdYyyy = sapUpdYyyy;
    }

    /**
     * [get] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @return The value of the column 'SAP_UPD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdMm() {
        checkSpecifiedProperty("sapUpdMm");
        return convertEmptyToNull(_sapUpdMm);
    }

    /**
     * [set] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @param sapUpdMm The value of the column 'SAP_UPD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdMm(String sapUpdMm) {
        registerModifiedProperty("sapUpdMm");
        _sapUpdMm = sapUpdMm;
    }

    /**
     * [get] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @return The value of the column 'SAP_UPD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdDd() {
        checkSpecifiedProperty("sapUpdDd");
        return convertEmptyToNull(_sapUpdDd);
    }

    /**
     * [set] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @param sapUpdDd The value of the column 'SAP_UPD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdDd(String sapUpdDd) {
        registerModifiedProperty("sapUpdDd");
        _sapUpdDd = sapUpdDd;
    }

    /**
     * [get] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @return The value of the column 'SAP_UPD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdHh() {
        checkSpecifiedProperty("sapUpdHh");
        return convertEmptyToNull(_sapUpdHh);
    }

    /**
     * [set] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @param sapUpdHh The value of the column 'SAP_UPD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdHh(String sapUpdHh) {
        registerModifiedProperty("sapUpdHh");
        _sapUpdHh = sapUpdHh;
    }

    /**
     * [get] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @return The value of the column 'SAP_UPD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdMi() {
        checkSpecifiedProperty("sapUpdMi");
        return convertEmptyToNull(_sapUpdMi);
    }

    /**
     * [set] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @param sapUpdMi The value of the column 'SAP_UPD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdMi(String sapUpdMi) {
        registerModifiedProperty("sapUpdMi");
        _sapUpdMi = sapUpdMi;
    }

    /**
     * [get] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @return The value of the column 'SAP_UPD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdSs() {
        checkSpecifiedProperty("sapUpdSs");
        return convertEmptyToNull(_sapUpdSs);
    }

    /**
     * [set] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @param sapUpdSs The value of the column 'SAP_UPD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdSs(String sapUpdSs) {
        registerModifiedProperty("sapUpdSs");
        _sapUpdSs = sapUpdSs;
    }

    /**
     * [get] SAP_UPD_USER_NM: {VARCHAR(30)} <br>
     * SAP更新者
     * @return The value of the column 'SAP_UPD_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdUserNm() {
        checkSpecifiedProperty("sapUpdUserNm");
        return convertEmptyToNull(_sapUpdUserNm);
    }

    /**
     * [set] SAP_UPD_USER_NM: {VARCHAR(30)} <br>
     * SAP更新者
     * @param sapUpdUserNm The value of the column 'SAP_UPD_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdUserNm(String sapUpdUserNm) {
        registerModifiedProperty("sapUpdUserNm");
        _sapUpdUserNm = sapUpdUserNm;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr() {
        checkSpecifiedProperty("spareStr");
        return convertEmptyToNull(_spareStr);
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr(String spareStr) {
        registerModifiedProperty("spareStr");
        _spareStr = spareStr;
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
