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
 * The entity of er_inventory_record_dtl as TABLE. <br>
 * 棚卸実績(明細)受信テーブル
 * <pre>
 * [primary-key]
 *     INVENTORY_RECORD_DTL_ID
 *
 * [column]
 *     INVENTORY_RECORD_DTL_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INVENTORY_SLIP_NO, FISCAL_YEAR, INVENTORY_SLIP_ROW_NO, PLANT_CD, STORAGE_SPACE_CD, REFERENCE_DT, HINMOKU_CD, STOCK_NUM, PRODUCT_NM_KANJI, BARCODE, DEPOSIT_JAN_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, ALLOC_TYPE_CD, S4_SEND_FLG, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * Long inventoryRecordDtlId = entity.getInventoryRecordDtlId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String inventorySlipNo = entity.getInventorySlipNo();
 * String fiscalYear = entity.getFiscalYear();
 * String inventorySlipRowNo = entity.getInventorySlipRowNo();
 * String plantCd = entity.getPlantCd();
 * String storageSpaceCd = entity.getStorageSpaceCd();
 * String referenceDt = entity.getReferenceDt();
 * String hinmokuCd = entity.getHinmokuCd();
 * java.math.BigDecimal stockNum = entity.getStockNum();
 * String productNmKanji = entity.getProductNmKanji();
 * String barcode = entity.getBarcode();
 * String depositJanCd = entity.getDepositJanCd();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String tenhanshaNm1 = entity.getTenhanshaNm1();
 * String tenhanshaNm2 = entity.getTenhanshaNm2();
 * String sapUserCd = entity.getSapUserCd();
 * String sapUserNm = entity.getSapUserNm();
 * String allocTypeCd = entity.getAllocTypeCd();
 * String s4SendFlg = entity.getS4SendFlg();
 * String wmsAddYyyy = entity.getWmsAddYyyy();
 * String wmsAddMm = entity.getWmsAddMm();
 * String wmsAddDd = entity.getWmsAddDd();
 * String wmsAddHh = entity.getWmsAddHh();
 * String wmsAddMi = entity.getWmsAddMi();
 * String wmsAddSs = entity.getWmsAddSs();
 * String wmsAddUserCd = entity.getWmsAddUserCd();
 * String wmsUpdYyyy = entity.getWmsUpdYyyy();
 * String wmsUpdMm = entity.getWmsUpdMm();
 * String wmsUpdDd = entity.getWmsUpdDd();
 * String wmsUpdHh = entity.getWmsUpdHh();
 * String wmsUpdMi = entity.getWmsUpdMi();
 * String wmsUpdSs = entity.getWmsUpdSs();
 * String wmsUpdUserCd = entity.getWmsUpdUserCd();
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
 * entity.setInventoryRecordDtlId(inventoryRecordDtlId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setInventorySlipNo(inventorySlipNo);
 * entity.setFiscalYear(fiscalYear);
 * entity.setInventorySlipRowNo(inventorySlipRowNo);
 * entity.setPlantCd(plantCd);
 * entity.setStorageSpaceCd(storageSpaceCd);
 * entity.setReferenceDt(referenceDt);
 * entity.setHinmokuCd(hinmokuCd);
 * entity.setStockNum(stockNum);
 * entity.setProductNmKanji(productNmKanji);
 * entity.setBarcode(barcode);
 * entity.setDepositJanCd(depositJanCd);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setTenhanshaNm1(tenhanshaNm1);
 * entity.setTenhanshaNm2(tenhanshaNm2);
 * entity.setSapUserCd(sapUserCd);
 * entity.setSapUserNm(sapUserNm);
 * entity.setAllocTypeCd(allocTypeCd);
 * entity.setS4SendFlg(s4SendFlg);
 * entity.setWmsAddYyyy(wmsAddYyyy);
 * entity.setWmsAddMm(wmsAddMm);
 * entity.setWmsAddDd(wmsAddDd);
 * entity.setWmsAddHh(wmsAddHh);
 * entity.setWmsAddMi(wmsAddMi);
 * entity.setWmsAddSs(wmsAddSs);
 * entity.setWmsAddUserCd(wmsAddUserCd);
 * entity.setWmsUpdYyyy(wmsUpdYyyy);
 * entity.setWmsUpdMm(wmsUpdMm);
 * entity.setWmsUpdDd(wmsUpdDd);
 * entity.setWmsUpdHh(wmsUpdHh);
 * entity.setWmsUpdMi(wmsUpdMi);
 * entity.setWmsUpdSs(wmsUpdSs);
 * entity.setWmsUpdUserCd(wmsUpdUserCd);
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
public abstract class BsErInventoryRecordDtl extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_RECORD_DTL_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _inventoryRecordDtlId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(30)} */
    protected String _errorMessageCd;

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

    /** REFERENCE_DT: {VARCHAR(8)} */
    protected String _referenceDt;

    /** HINMOKU_CD: {VARCHAR(100)} */
    protected String _hinmokuCd;

    /** STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _stockNum;

    /** PRODUCT_NM_KANJI: {VARCHAR(60)} */
    protected String _productNmKanji;

    /** BARCODE: {VARCHAR(30)} */
    protected String _barcode;

    /** DEPOSIT_JAN_CD: {VARCHAR(30)} */
    protected String _depositJanCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** TENHANSHA_NM1: {VARCHAR(60)} */
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60)} */
    protected String _tenhanshaNm2;

    /** SAP_USER_CD: {VARCHAR(30)} */
    protected String _sapUserCd;

    /** SAP_USER_NM: {VARCHAR(60)} */
    protected String _sapUserNm;

    /** ALLOC_TYPE_CD: {VARCHAR(30)} */
    protected String _allocTypeCd;

    /** S4_SEND_FLG: {CHAR(1)} */
    protected String _s4SendFlg;

    /** WMS_ADD_YYYY: {VARCHAR(30)} */
    protected String _wmsAddYyyy;

    /** WMS_ADD_MM: {VARCHAR(30)} */
    protected String _wmsAddMm;

    /** WMS_ADD_DD: {VARCHAR(30)} */
    protected String _wmsAddDd;

    /** WMS_ADD_HH: {VARCHAR(30)} */
    protected String _wmsAddHh;

    /** WMS_ADD_MI: {VARCHAR(30)} */
    protected String _wmsAddMi;

    /** WMS_ADD_SS: {VARCHAR(30)} */
    protected String _wmsAddSs;

    /** WMS_ADD_USER_CD: {VARCHAR(30)} */
    protected String _wmsAddUserCd;

    /** WMS_UPD_YYYY: {VARCHAR(30)} */
    protected String _wmsUpdYyyy;

    /** WMS_UPD_MM: {VARCHAR(30)} */
    protected String _wmsUpdMm;

    /** WMS_UPD_DD: {VARCHAR(30)} */
    protected String _wmsUpdDd;

    /** WMS_UPD_HH: {VARCHAR(30)} */
    protected String _wmsUpdHh;

    /** WMS_UPD_MI: {VARCHAR(30)} */
    protected String _wmsUpdMi;

    /** WMS_UPD_SS: {VARCHAR(30)} */
    protected String _wmsUpdSs;

    /** WMS_UPD_USER_CD: {VARCHAR(30)} */
    protected String _wmsUpdUserCd;

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
        return "er_inventory_record_dtl";
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
        if (_inventoryRecordDtlId == null) { return false; }
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
        if (obj instanceof BsErInventoryRecordDtl) {
            BsErInventoryRecordDtl other = (BsErInventoryRecordDtl)obj;
            if (!xSV(_inventoryRecordDtlId, other._inventoryRecordDtlId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryRecordDtlId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryRecordDtlId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_inventorySlipNo));
        sb.append(dm).append(xfND(_fiscalYear));
        sb.append(dm).append(xfND(_inventorySlipRowNo));
        sb.append(dm).append(xfND(_plantCd));
        sb.append(dm).append(xfND(_storageSpaceCd));
        sb.append(dm).append(xfND(_referenceDt));
        sb.append(dm).append(xfND(_hinmokuCd));
        sb.append(dm).append(xfND(_stockNum));
        sb.append(dm).append(xfND(_productNmKanji));
        sb.append(dm).append(xfND(_barcode));
        sb.append(dm).append(xfND(_depositJanCd));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_tenhanshaNm1));
        sb.append(dm).append(xfND(_tenhanshaNm2));
        sb.append(dm).append(xfND(_sapUserCd));
        sb.append(dm).append(xfND(_sapUserNm));
        sb.append(dm).append(xfND(_allocTypeCd));
        sb.append(dm).append(xfND(_s4SendFlg));
        sb.append(dm).append(xfND(_wmsAddYyyy));
        sb.append(dm).append(xfND(_wmsAddMm));
        sb.append(dm).append(xfND(_wmsAddDd));
        sb.append(dm).append(xfND(_wmsAddHh));
        sb.append(dm).append(xfND(_wmsAddMi));
        sb.append(dm).append(xfND(_wmsAddSs));
        sb.append(dm).append(xfND(_wmsAddUserCd));
        sb.append(dm).append(xfND(_wmsUpdYyyy));
        sb.append(dm).append(xfND(_wmsUpdMm));
        sb.append(dm).append(xfND(_wmsUpdDd));
        sb.append(dm).append(xfND(_wmsUpdHh));
        sb.append(dm).append(xfND(_wmsUpdMi));
        sb.append(dm).append(xfND(_wmsUpdSs));
        sb.append(dm).append(xfND(_wmsUpdUserCd));
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
    public ErInventoryRecordDtl clone() {
        return (ErInventoryRecordDtl)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_RECORD_DTL_ID: {PK, NotNull, BIGINT(19)} <br>
     * 棚卸実績_明細受信ID
     * @return The value of the column 'INVENTORY_RECORD_DTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryRecordDtlId() {
        checkSpecifiedProperty("inventoryRecordDtlId");
        return _inventoryRecordDtlId;
    }

    /**
     * [set] INVENTORY_RECORD_DTL_ID: {PK, NotNull, BIGINT(19)} <br>
     * 棚卸実績_明細受信ID
     * @param inventoryRecordDtlId The value of the column 'INVENTORY_RECORD_DTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryRecordDtlId(Long inventoryRecordDtlId) {
        registerModifiedProperty("inventoryRecordDtlId");
        _inventoryRecordDtlId = inventoryRecordDtlId;
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
     * [get] ERROR_MESSAGE_CD: {VARCHAR(30)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(30)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
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
     * [get] REFERENCE_DT: {VARCHAR(8)} <br>
     * 基準日
     * @return The value of the column 'REFERENCE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReferenceDt() {
        checkSpecifiedProperty("referenceDt");
        return convertEmptyToNull(_referenceDt);
    }

    /**
     * [set] REFERENCE_DT: {VARCHAR(8)} <br>
     * 基準日
     * @param referenceDt The value of the column 'REFERENCE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReferenceDt(String referenceDt) {
        registerModifiedProperty("referenceDt");
        _referenceDt = referenceDt;
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
     * [get] STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 在庫数量
     * @return The value of the column 'STOCK_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStockNum() {
        checkSpecifiedProperty("stockNum");
        return _stockNum;
    }

    /**
     * [set] STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 在庫数量
     * @param stockNum The value of the column 'STOCK_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockNum(java.math.BigDecimal stockNum) {
        registerModifiedProperty("stockNum");
        _stockNum = stockNum;
    }

    /**
     * [get] PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * 品名漢字
     * @return The value of the column 'PRODUCT_NM_KANJI'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNmKanji() {
        checkSpecifiedProperty("productNmKanji");
        return convertEmptyToNull(_productNmKanji);
    }

    /**
     * [set] PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * 品名漢字
     * @param productNmKanji The value of the column 'PRODUCT_NM_KANJI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNmKanji(String productNmKanji) {
        registerModifiedProperty("productNmKanji");
        _productNmKanji = productNmKanji;
    }

    /**
     * [get] BARCODE: {VARCHAR(30)} <br>
     * バーコード
     * @return The value of the column 'BARCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBarcode() {
        checkSpecifiedProperty("barcode");
        return convertEmptyToNull(_barcode);
    }

    /**
     * [set] BARCODE: {VARCHAR(30)} <br>
     * バーコード
     * @param barcode The value of the column 'BARCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarcode(String barcode) {
        registerModifiedProperty("barcode");
        _barcode = barcode;
    }

    /**
     * [get] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預かりJANCD
     * @return The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositJanCd() {
        checkSpecifiedProperty("depositJanCd");
        return convertEmptyToNull(_depositJanCd);
    }

    /**
     * [set] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預かりJANCD
     * @param depositJanCd The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositJanCd(String depositJanCd) {
        registerModifiedProperty("depositJanCd");
        _depositJanCd = depositJanCd;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaCd() {
        checkSpecifiedProperty("tenhanshaCd");
        return convertEmptyToNull(_tenhanshaCd);
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        registerModifiedProperty("tenhanshaCd");
        _tenhanshaCd = tenhanshaCd;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名1
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm1() {
        checkSpecifiedProperty("tenhanshaNm1");
        return convertEmptyToNull(_tenhanshaNm1);
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名1
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        registerModifiedProperty("tenhanshaNm1");
        _tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名2
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm2() {
        checkSpecifiedProperty("tenhanshaNm2");
        return convertEmptyToNull(_tenhanshaNm2);
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名2
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        registerModifiedProperty("tenhanshaNm2");
        _tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
     * @return The value of the column 'SAP_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUserCd() {
        checkSpecifiedProperty("sapUserCd");
        return convertEmptyToNull(_sapUserCd);
    }

    /**
     * [set] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
     * @param sapUserCd The value of the column 'SAP_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUserCd(String sapUserCd) {
        registerModifiedProperty("sapUserCd");
        _sapUserCd = sapUserCd;
    }

    /**
     * [get] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @return The value of the column 'SAP_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUserNm() {
        checkSpecifiedProperty("sapUserNm");
        return convertEmptyToNull(_sapUserNm);
    }

    /**
     * [set] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @param sapUserNm The value of the column 'SAP_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUserNm(String sapUserNm) {
        registerModifiedProperty("sapUserNm");
        _sapUserNm = sapUserNm;
    }

    /**
     * [get] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @return The value of the column 'ALLOC_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocTypeCd() {
        checkSpecifiedProperty("allocTypeCd");
        return convertEmptyToNull(_allocTypeCd);
    }

    /**
     * [set] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @param allocTypeCd The value of the column 'ALLOC_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocTypeCd(String allocTypeCd) {
        registerModifiedProperty("allocTypeCd");
        _allocTypeCd = allocTypeCd;
    }

    /**
     * [get] S4_SEND_FLG: {CHAR(1)} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getS4SendFlg() {
        checkSpecifiedProperty("s4SendFlg");
        return convertEmptyToNull(_s4SendFlg);
    }

    /**
     * [set] S4_SEND_FLG: {CHAR(1)} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setS4SendFlg(String s4SendFlg) {
        registerModifiedProperty("s4SendFlg");
        _s4SendFlg = s4SendFlg;
    }

    /**
     * [get] WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * WMS作成日_年
     * @return The value of the column 'WMS_ADD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddYyyy() {
        checkSpecifiedProperty("wmsAddYyyy");
        return convertEmptyToNull(_wmsAddYyyy);
    }

    /**
     * [set] WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * WMS作成日_年
     * @param wmsAddYyyy The value of the column 'WMS_ADD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddYyyy(String wmsAddYyyy) {
        registerModifiedProperty("wmsAddYyyy");
        _wmsAddYyyy = wmsAddYyyy;
    }

    /**
     * [get] WMS_ADD_MM: {VARCHAR(30)} <br>
     * WMS作成日_月
     * @return The value of the column 'WMS_ADD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddMm() {
        checkSpecifiedProperty("wmsAddMm");
        return convertEmptyToNull(_wmsAddMm);
    }

    /**
     * [set] WMS_ADD_MM: {VARCHAR(30)} <br>
     * WMS作成日_月
     * @param wmsAddMm The value of the column 'WMS_ADD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddMm(String wmsAddMm) {
        registerModifiedProperty("wmsAddMm");
        _wmsAddMm = wmsAddMm;
    }

    /**
     * [get] WMS_ADD_DD: {VARCHAR(30)} <br>
     * WMS作成日_日
     * @return The value of the column 'WMS_ADD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddDd() {
        checkSpecifiedProperty("wmsAddDd");
        return convertEmptyToNull(_wmsAddDd);
    }

    /**
     * [set] WMS_ADD_DD: {VARCHAR(30)} <br>
     * WMS作成日_日
     * @param wmsAddDd The value of the column 'WMS_ADD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddDd(String wmsAddDd) {
        registerModifiedProperty("wmsAddDd");
        _wmsAddDd = wmsAddDd;
    }

    /**
     * [get] WMS_ADD_HH: {VARCHAR(30)} <br>
     * WMS作成時間_時
     * @return The value of the column 'WMS_ADD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddHh() {
        checkSpecifiedProperty("wmsAddHh");
        return convertEmptyToNull(_wmsAddHh);
    }

    /**
     * [set] WMS_ADD_HH: {VARCHAR(30)} <br>
     * WMS作成時間_時
     * @param wmsAddHh The value of the column 'WMS_ADD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddHh(String wmsAddHh) {
        registerModifiedProperty("wmsAddHh");
        _wmsAddHh = wmsAddHh;
    }

    /**
     * [get] WMS_ADD_MI: {VARCHAR(30)} <br>
     * WMS作成時間_分
     * @return The value of the column 'WMS_ADD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddMi() {
        checkSpecifiedProperty("wmsAddMi");
        return convertEmptyToNull(_wmsAddMi);
    }

    /**
     * [set] WMS_ADD_MI: {VARCHAR(30)} <br>
     * WMS作成時間_分
     * @param wmsAddMi The value of the column 'WMS_ADD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddMi(String wmsAddMi) {
        registerModifiedProperty("wmsAddMi");
        _wmsAddMi = wmsAddMi;
    }

    /**
     * [get] WMS_ADD_SS: {VARCHAR(30)} <br>
     * WMS作成時間_秒
     * @return The value of the column 'WMS_ADD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddSs() {
        checkSpecifiedProperty("wmsAddSs");
        return convertEmptyToNull(_wmsAddSs);
    }

    /**
     * [set] WMS_ADD_SS: {VARCHAR(30)} <br>
     * WMS作成時間_秒
     * @param wmsAddSs The value of the column 'WMS_ADD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddSs(String wmsAddSs) {
        registerModifiedProperty("wmsAddSs");
        _wmsAddSs = wmsAddSs;
    }

    /**
     * [get] WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * WMS作成者
     * @return The value of the column 'WMS_ADD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddUserCd() {
        checkSpecifiedProperty("wmsAddUserCd");
        return convertEmptyToNull(_wmsAddUserCd);
    }

    /**
     * [set] WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * WMS作成者
     * @param wmsAddUserCd The value of the column 'WMS_ADD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddUserCd(String wmsAddUserCd) {
        registerModifiedProperty("wmsAddUserCd");
        _wmsAddUserCd = wmsAddUserCd;
    }

    /**
     * [get] WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * WMS更新日_年
     * @return The value of the column 'WMS_UPD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdYyyy() {
        checkSpecifiedProperty("wmsUpdYyyy");
        return convertEmptyToNull(_wmsUpdYyyy);
    }

    /**
     * [set] WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * WMS更新日_年
     * @param wmsUpdYyyy The value of the column 'WMS_UPD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdYyyy(String wmsUpdYyyy) {
        registerModifiedProperty("wmsUpdYyyy");
        _wmsUpdYyyy = wmsUpdYyyy;
    }

    /**
     * [get] WMS_UPD_MM: {VARCHAR(30)} <br>
     * WMS更新日_月
     * @return The value of the column 'WMS_UPD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdMm() {
        checkSpecifiedProperty("wmsUpdMm");
        return convertEmptyToNull(_wmsUpdMm);
    }

    /**
     * [set] WMS_UPD_MM: {VARCHAR(30)} <br>
     * WMS更新日_月
     * @param wmsUpdMm The value of the column 'WMS_UPD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdMm(String wmsUpdMm) {
        registerModifiedProperty("wmsUpdMm");
        _wmsUpdMm = wmsUpdMm;
    }

    /**
     * [get] WMS_UPD_DD: {VARCHAR(30)} <br>
     * WMS更新日_日
     * @return The value of the column 'WMS_UPD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdDd() {
        checkSpecifiedProperty("wmsUpdDd");
        return convertEmptyToNull(_wmsUpdDd);
    }

    /**
     * [set] WMS_UPD_DD: {VARCHAR(30)} <br>
     * WMS更新日_日
     * @param wmsUpdDd The value of the column 'WMS_UPD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdDd(String wmsUpdDd) {
        registerModifiedProperty("wmsUpdDd");
        _wmsUpdDd = wmsUpdDd;
    }

    /**
     * [get] WMS_UPD_HH: {VARCHAR(30)} <br>
     * WMS更新時間_時
     * @return The value of the column 'WMS_UPD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdHh() {
        checkSpecifiedProperty("wmsUpdHh");
        return convertEmptyToNull(_wmsUpdHh);
    }

    /**
     * [set] WMS_UPD_HH: {VARCHAR(30)} <br>
     * WMS更新時間_時
     * @param wmsUpdHh The value of the column 'WMS_UPD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdHh(String wmsUpdHh) {
        registerModifiedProperty("wmsUpdHh");
        _wmsUpdHh = wmsUpdHh;
    }

    /**
     * [get] WMS_UPD_MI: {VARCHAR(30)} <br>
     * WMS更新時間_分
     * @return The value of the column 'WMS_UPD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdMi() {
        checkSpecifiedProperty("wmsUpdMi");
        return convertEmptyToNull(_wmsUpdMi);
    }

    /**
     * [set] WMS_UPD_MI: {VARCHAR(30)} <br>
     * WMS更新時間_分
     * @param wmsUpdMi The value of the column 'WMS_UPD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdMi(String wmsUpdMi) {
        registerModifiedProperty("wmsUpdMi");
        _wmsUpdMi = wmsUpdMi;
    }

    /**
     * [get] WMS_UPD_SS: {VARCHAR(30)} <br>
     * WMS更新時間_秒
     * @return The value of the column 'WMS_UPD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdSs() {
        checkSpecifiedProperty("wmsUpdSs");
        return convertEmptyToNull(_wmsUpdSs);
    }

    /**
     * [set] WMS_UPD_SS: {VARCHAR(30)} <br>
     * WMS更新時間_秒
     * @param wmsUpdSs The value of the column 'WMS_UPD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdSs(String wmsUpdSs) {
        registerModifiedProperty("wmsUpdSs");
        _wmsUpdSs = wmsUpdSs;
    }

    /**
     * [get] WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * WMS更新者
     * @return The value of the column 'WMS_UPD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdUserCd() {
        checkSpecifiedProperty("wmsUpdUserCd");
        return convertEmptyToNull(_wmsUpdUserCd);
    }

    /**
     * [set] WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * WMS更新者
     * @param wmsUpdUserCd The value of the column 'WMS_UPD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdUserCd(String wmsUpdUserCd) {
        registerModifiedProperty("wmsUpdUserCd");
        _wmsUpdUserCd = wmsUpdUserCd;
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
