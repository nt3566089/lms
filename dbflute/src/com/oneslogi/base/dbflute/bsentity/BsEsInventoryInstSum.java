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
 * The entity of es_inventory_inst_sum as TABLE. <br>
 * 棚卸指示(集約)送信テーブル
 * <pre>
 * [primary-key]
 *     INVENTORY_INST_ID
 *
 * [column]
 *     INVENTORY_INST_ID, SEND_FLG, INVENTORY_SLIP_NO, FISCAL_YEAR, INVENTORY_SLIP_ROW_NO, PLANT_CD, STORAGE_SPACE_CD, REFERENCE_DT, UNIT_NM, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * Long inventoryInstId = entity.getInventoryInstId();
 * String sendFlg = entity.getSendFlg();
 * String inventorySlipNo = entity.getInventorySlipNo();
 * String fiscalYear = entity.getFiscalYear();
 * String inventorySlipRowNo = entity.getInventorySlipRowNo();
 * String plantCd = entity.getPlantCd();
 * String storageSpaceCd = entity.getStorageSpaceCd();
 * String referenceDt = entity.getReferenceDt();
 * String unitNm = entity.getUnitNm();
 * String sapAddYyyy = entity.getSapAddYyyy();
 * String sapAddMm = entity.getSapAddMm();
 * String sapAddDd = entity.getSapAddDd();
 * String sapAddHh = entity.getSapAddHh();
 * String sapAddMi = entity.getSapAddMi();
 * String sapAddSs = entity.getSapAddSs();
 * String sapAddUserCd = entity.getSapAddUserCd();
 * String sapUpdYyyy = entity.getSapUpdYyyy();
 * String sapUpdMm = entity.getSapUpdMm();
 * String sapUpdDd = entity.getSapUpdDd();
 * String sapUpdHh = entity.getSapUpdHh();
 * String sapUpdMi = entity.getSapUpdMi();
 * String sapUpdSs = entity.getSapUpdSs();
 * String sapUpdUserCd = entity.getSapUpdUserCd();
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
 * entity.setInventoryInstId(inventoryInstId);
 * entity.setSendFlg(sendFlg);
 * entity.setInventorySlipNo(inventorySlipNo);
 * entity.setFiscalYear(fiscalYear);
 * entity.setInventorySlipRowNo(inventorySlipRowNo);
 * entity.setPlantCd(plantCd);
 * entity.setStorageSpaceCd(storageSpaceCd);
 * entity.setReferenceDt(referenceDt);
 * entity.setUnitNm(unitNm);
 * entity.setSapAddYyyy(sapAddYyyy);
 * entity.setSapAddMm(sapAddMm);
 * entity.setSapAddDd(sapAddDd);
 * entity.setSapAddHh(sapAddHh);
 * entity.setSapAddMi(sapAddMi);
 * entity.setSapAddSs(sapAddSs);
 * entity.setSapAddUserCd(sapAddUserCd);
 * entity.setSapUpdYyyy(sapUpdYyyy);
 * entity.setSapUpdMm(sapUpdMm);
 * entity.setSapUpdDd(sapUpdDd);
 * entity.setSapUpdHh(sapUpdHh);
 * entity.setSapUpdMi(sapUpdMi);
 * entity.setSapUpdSs(sapUpdSs);
 * entity.setSapUpdUserCd(sapUpdUserCd);
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
public abstract class BsEsInventoryInstSum extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_INST_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _inventoryInstId;

    /** SEND_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _sendFlg;

    /** INVENTORY_SLIP_NO: {VARCHAR(30)} */
    protected String _inventorySlipNo;

    /** FISCAL_YEAR: {VARCHAR(30)} */
    protected String _fiscalYear;

    /** INVENTORY_SLIP_ROW_NO: {VARCHAR(30)} */
    protected String _inventorySlipRowNo;

    /** PLANT_CD: {VARCHAR(30)} */
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _storageSpaceCd;

    /** REFERENCE_DT: {VARCHAR(30)} */
    protected String _referenceDt;

    /** UNIT_NM: {VARCHAR(30)} */
    protected String _unitNm;

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

    /** SAP_ADD_USER_CD: {VARCHAR(30)} */
    protected String _sapAddUserCd;

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

    /** SAP_UPD_USER_CD: {VARCHAR(30)} */
    protected String _sapUpdUserCd;

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
        return "es_inventory_inst_sum";
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
        if (_inventoryInstId == null) { return false; }
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
        if (obj instanceof BsEsInventoryInstSum) {
            BsEsInventoryInstSum other = (BsEsInventoryInstSum)obj;
            if (!xSV(_inventoryInstId, other._inventoryInstId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryInstId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryInstId));
        sb.append(dm).append(xfND(_sendFlg));
        sb.append(dm).append(xfND(_inventorySlipNo));
        sb.append(dm).append(xfND(_fiscalYear));
        sb.append(dm).append(xfND(_inventorySlipRowNo));
        sb.append(dm).append(xfND(_plantCd));
        sb.append(dm).append(xfND(_storageSpaceCd));
        sb.append(dm).append(xfND(_referenceDt));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_sapAddYyyy));
        sb.append(dm).append(xfND(_sapAddMm));
        sb.append(dm).append(xfND(_sapAddDd));
        sb.append(dm).append(xfND(_sapAddHh));
        sb.append(dm).append(xfND(_sapAddMi));
        sb.append(dm).append(xfND(_sapAddSs));
        sb.append(dm).append(xfND(_sapAddUserCd));
        sb.append(dm).append(xfND(_sapUpdYyyy));
        sb.append(dm).append(xfND(_sapUpdMm));
        sb.append(dm).append(xfND(_sapUpdDd));
        sb.append(dm).append(xfND(_sapUpdHh));
        sb.append(dm).append(xfND(_sapUpdMi));
        sb.append(dm).append(xfND(_sapUpdSs));
        sb.append(dm).append(xfND(_sapUpdUserCd));
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
    public EsInventoryInstSum clone() {
        return (EsInventoryInstSum)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_INST_ID: {PK, NotNull, BIGINT(19)} <br>
     * 棚卸指示_集約送信ID
     * @return The value of the column 'INVENTORY_INST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryInstId() {
        checkSpecifiedProperty("inventoryInstId");
        return _inventoryInstId;
    }

    /**
     * [set] INVENTORY_INST_ID: {PK, NotNull, BIGINT(19)} <br>
     * 棚卸指示_集約送信ID
     * @param inventoryInstId The value of the column 'INVENTORY_INST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryInstId(Long inventoryInstId) {
        registerModifiedProperty("inventoryInstId");
        _inventoryInstId = inventoryInstId;
    }

    /**
     * [get] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @return The value of the column 'SEND_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getSendFlg() {
        checkSpecifiedProperty("sendFlg");
        return convertEmptyToNull(_sendFlg);
    }

    /**
     * [set] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @param sendFlg The value of the column 'SEND_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setSendFlg(String sendFlg) {
        registerModifiedProperty("sendFlg");
        _sendFlg = sendFlg;
    }

    /**
     * [get] INVENTORY_SLIP_NO: {VARCHAR(30)} <br>
     * 実地棚卸伝票番号
     * @return The value of the column 'INVENTORY_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventorySlipNo() {
        checkSpecifiedProperty("inventorySlipNo");
        return convertEmptyToNull(_inventorySlipNo);
    }

    /**
     * [set] INVENTORY_SLIP_NO: {VARCHAR(30)} <br>
     * 実地棚卸伝票番号
     * @param inventorySlipNo The value of the column 'INVENTORY_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventorySlipNo(String inventorySlipNo) {
        registerModifiedProperty("inventorySlipNo");
        _inventorySlipNo = inventorySlipNo;
    }

    /**
     * [get] FISCAL_YEAR: {VARCHAR(30)} <br>
     * 会計年度
     * @return The value of the column 'FISCAL_YEAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getFiscalYear() {
        checkSpecifiedProperty("fiscalYear");
        return convertEmptyToNull(_fiscalYear);
    }

    /**
     * [set] FISCAL_YEAR: {VARCHAR(30)} <br>
     * 会計年度
     * @param fiscalYear The value of the column 'FISCAL_YEAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFiscalYear(String fiscalYear) {
        registerModifiedProperty("fiscalYear");
        _fiscalYear = fiscalYear;
    }

    /**
     * [get] INVENTORY_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 実地棚卸伝票明細番号
     * @return The value of the column 'INVENTORY_SLIP_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventorySlipRowNo() {
        checkSpecifiedProperty("inventorySlipRowNo");
        return convertEmptyToNull(_inventorySlipRowNo);
    }

    /**
     * [set] INVENTORY_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 実地棚卸伝票明細番号
     * @param inventorySlipRowNo The value of the column 'INVENTORY_SLIP_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventorySlipRowNo(String inventorySlipRowNo) {
        registerModifiedProperty("inventorySlipRowNo");
        _inventorySlipRowNo = inventorySlipRowNo;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlantCd() {
        checkSpecifiedProperty("plantCd");
        return convertEmptyToNull(_plantCd);
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlantCd(String plantCd) {
        registerModifiedProperty("plantCd");
        _plantCd = plantCd;
    }

    /**
     * [get] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorageSpaceCd() {
        checkSpecifiedProperty("storageSpaceCd");
        return convertEmptyToNull(_storageSpaceCd);
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        registerModifiedProperty("storageSpaceCd");
        _storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] REFERENCE_DT: {VARCHAR(30)} <br>
     * 基準日
     * @return The value of the column 'REFERENCE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReferenceDt() {
        checkSpecifiedProperty("referenceDt");
        return convertEmptyToNull(_referenceDt);
    }

    /**
     * [set] REFERENCE_DT: {VARCHAR(30)} <br>
     * 基準日
     * @param referenceDt The value of the column 'REFERENCE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReferenceDt(String referenceDt) {
        registerModifiedProperty("referenceDt");
        _referenceDt = referenceDt;
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
     * [get] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @return The value of the column 'SAP_ADD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddUserCd() {
        checkSpecifiedProperty("sapAddUserCd");
        return convertEmptyToNull(_sapAddUserCd);
    }

    /**
     * [set] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @param sapAddUserCd The value of the column 'SAP_ADD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddUserCd(String sapAddUserCd) {
        registerModifiedProperty("sapAddUserCd");
        _sapAddUserCd = sapAddUserCd;
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
     * [get] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @return The value of the column 'SAP_UPD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdUserCd() {
        checkSpecifiedProperty("sapUpdUserCd");
        return convertEmptyToNull(_sapUpdUserCd);
    }

    /**
     * [set] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @param sapUpdUserCd The value of the column 'SAP_UPD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdUserCd(String sapUpdUserCd) {
        registerModifiedProperty("sapUpdUserCd");
        _sapUpdUserCd = sapUpdUserCd;
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
