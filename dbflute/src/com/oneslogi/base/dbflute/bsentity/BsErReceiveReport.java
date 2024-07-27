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
 * The entity of er_receive_report as TABLE. <br>
 * 入庫実績受信テーブル
 * <pre>
 * [primary-key]
 *     RECEIVE_REPORT_ID
 *
 * [column]
 *     RECEIVE_REPORT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, STORE_SLIP_NO, STORE_SLIP_ROW_NO, SLIP_TYPE_CD, SN, IF_ID, IF_NO, HINMOKU_CD, JAN_CD, STORE_REASON_CD, STORE_DT, NUM, LOT_MANAG_TYPE_CD, LOT, RECEIVE_NO, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, TENHANSHA_CD, SALES_ORG_CD, SANSHA_DELIVERY_SLIP_NO1, DATA_TYPE_CD, PROCESS_TYPE_CD, SLIP_NO, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_NM, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_NM, DATA_TRANSFER_ONLY_STR01, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * Long receiveReportId = entity.getReceiveReportId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String storeSlipNo = entity.getStoreSlipNo();
 * String storeSlipRowNo = entity.getStoreSlipRowNo();
 * String slipTypeCd = entity.getSlipTypeCd();
 * Long sn = entity.getSn();
 * String ifId = entity.getIfId();
 * String ifNo = entity.getIfNo();
 * String hinmokuCd = entity.getHinmokuCd();
 * String janCd = entity.getJanCd();
 * String storeReasonCd = entity.getStoreReasonCd();
 * String storeDt = entity.getStoreDt();
 * java.math.BigDecimal num = entity.getNum();
 * String lotManagTypeCd = entity.getLotManagTypeCd();
 * String lot = entity.getLot();
 * String receiveNo = entity.getReceiveNo();
 * String shippingPlantCd = entity.getShippingPlantCd();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * String storePlantCd = entity.getStorePlantCd();
 * String storeStorageSpaceCd = entity.getStoreStorageSpaceCd();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String sanshaDeliverySlipNo1 = entity.getSanshaDeliverySlipNo1();
 * String dataTypeCd = entity.getDataTypeCd();
 * String processTypeCd = entity.getProcessTypeCd();
 * String slipNo = entity.getSlipNo();
 * String wmsAddYyyy = entity.getWmsAddYyyy();
 * String wmsAddMm = entity.getWmsAddMm();
 * String wmsAddDd = entity.getWmsAddDd();
 * String wmsAddHh = entity.getWmsAddHh();
 * String wmsAddMi = entity.getWmsAddMi();
 * String wmsAddSs = entity.getWmsAddSs();
 * String wmsAddUserNm = entity.getWmsAddUserNm();
 * String wmsUpdYyyy = entity.getWmsUpdYyyy();
 * String wmsUpdMm = entity.getWmsUpdMm();
 * String wmsUpdDd = entity.getWmsUpdDd();
 * String wmsUpdHh = entity.getWmsUpdHh();
 * String wmsUpdMi = entity.getWmsUpdMi();
 * String wmsUpdSs = entity.getWmsUpdSs();
 * String wmsUpdUserNm = entity.getWmsUpdUserNm();
 * String dataTransferOnlyStr01 = entity.getDataTransferOnlyStr01();
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
 * entity.setReceiveReportId(receiveReportId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setStoreSlipNo(storeSlipNo);
 * entity.setStoreSlipRowNo(storeSlipRowNo);
 * entity.setSlipTypeCd(slipTypeCd);
 * entity.setSn(sn);
 * entity.setIfId(ifId);
 * entity.setIfNo(ifNo);
 * entity.setHinmokuCd(hinmokuCd);
 * entity.setJanCd(janCd);
 * entity.setStoreReasonCd(storeReasonCd);
 * entity.setStoreDt(storeDt);
 * entity.setNum(num);
 * entity.setLotManagTypeCd(lotManagTypeCd);
 * entity.setLot(lot);
 * entity.setReceiveNo(receiveNo);
 * entity.setShippingPlantCd(shippingPlantCd);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setStorePlantCd(storePlantCd);
 * entity.setStoreStorageSpaceCd(storeStorageSpaceCd);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setSanshaDeliverySlipNo1(sanshaDeliverySlipNo1);
 * entity.setDataTypeCd(dataTypeCd);
 * entity.setProcessTypeCd(processTypeCd);
 * entity.setSlipNo(slipNo);
 * entity.setWmsAddYyyy(wmsAddYyyy);
 * entity.setWmsAddMm(wmsAddMm);
 * entity.setWmsAddDd(wmsAddDd);
 * entity.setWmsAddHh(wmsAddHh);
 * entity.setWmsAddMi(wmsAddMi);
 * entity.setWmsAddSs(wmsAddSs);
 * entity.setWmsAddUserNm(wmsAddUserNm);
 * entity.setWmsUpdYyyy(wmsUpdYyyy);
 * entity.setWmsUpdMm(wmsUpdMm);
 * entity.setWmsUpdDd(wmsUpdDd);
 * entity.setWmsUpdHh(wmsUpdHh);
 * entity.setWmsUpdMi(wmsUpdMi);
 * entity.setWmsUpdSs(wmsUpdSs);
 * entity.setWmsUpdUserNm(wmsUpdUserNm);
 * entity.setDataTransferOnlyStr01(dataTransferOnlyStr01);
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
public abstract class BsErReceiveReport extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _receiveReportId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, CHAR(1)} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(30)} */
    protected String _errorMessageCd;

    /** STORE_SLIP_NO: {VARCHAR(30)} */
    protected String _storeSlipNo;

    /** STORE_SLIP_ROW_NO: {VARCHAR(30)} */
    protected String _storeSlipRowNo;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    protected String _slipTypeCd;

    /** SN: {BIGINT(19), default=[0]} */
    protected Long _sn;

    /** IF_ID: {VARCHAR(30)} */
    protected String _ifId;

    /** IF_NO: {VARCHAR(30)} */
    protected String _ifNo;

    /** HINMOKU_CD: {VARCHAR(100)} */
    protected String _hinmokuCd;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** STORE_REASON_CD: {VARCHAR(30)} */
    protected String _storeReasonCd;

    /** STORE_DT: {VARCHAR(8)} */
    protected String _storeDt;

    /** NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _num;

    /** LOT_MANAG_TYPE_CD: {VARCHAR(30)} */
    protected String _lotManagTypeCd;

    /** LOT: {VARCHAR(100)} */
    protected String _lot;

    /** RECEIVE_NO: {VARCHAR(30)} */
    protected String _receiveNo;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _shippingStorageSpaceCd;

    /** STORE_PLANT_CD: {NotNull, VARCHAR(30)} */
    protected String _storePlantCd;

    /** STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)} */
    protected String _storeStorageSpaceCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} */
    protected String _sanshaDeliverySlipNo1;

    /** DATA_TYPE_CD: {VARCHAR(30)} */
    protected String _dataTypeCd;

    /** PROCESS_TYPE_CD: {VARCHAR(30)} */
    protected String _processTypeCd;

    /** SLIP_NO: {VARCHAR(30)} */
    protected String _slipNo;

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

    /** WMS_ADD_USER_NM: {VARCHAR(60)} */
    protected String _wmsAddUserNm;

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

    /** WMS_UPD_USER_NM: {VARCHAR(60)} */
    protected String _wmsUpdUserNm;

    /** DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr01;

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
        return "er_receive_report";
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
        if (_receiveReportId == null) { return false; }
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
        if (obj instanceof BsErReceiveReport) {
            BsErReceiveReport other = (BsErReceiveReport)obj;
            if (!xSV(_receiveReportId, other._receiveReportId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receiveReportId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receiveReportId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_storeSlipNo));
        sb.append(dm).append(xfND(_storeSlipRowNo));
        sb.append(dm).append(xfND(_slipTypeCd));
        sb.append(dm).append(xfND(_sn));
        sb.append(dm).append(xfND(_ifId));
        sb.append(dm).append(xfND(_ifNo));
        sb.append(dm).append(xfND(_hinmokuCd));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_storeReasonCd));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_num));
        sb.append(dm).append(xfND(_lotManagTypeCd));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_receiveNo));
        sb.append(dm).append(xfND(_shippingPlantCd));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_storePlantCd));
        sb.append(dm).append(xfND(_storeStorageSpaceCd));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_sanshaDeliverySlipNo1));
        sb.append(dm).append(xfND(_dataTypeCd));
        sb.append(dm).append(xfND(_processTypeCd));
        sb.append(dm).append(xfND(_slipNo));
        sb.append(dm).append(xfND(_wmsAddYyyy));
        sb.append(dm).append(xfND(_wmsAddMm));
        sb.append(dm).append(xfND(_wmsAddDd));
        sb.append(dm).append(xfND(_wmsAddHh));
        sb.append(dm).append(xfND(_wmsAddMi));
        sb.append(dm).append(xfND(_wmsAddSs));
        sb.append(dm).append(xfND(_wmsAddUserNm));
        sb.append(dm).append(xfND(_wmsUpdYyyy));
        sb.append(dm).append(xfND(_wmsUpdMm));
        sb.append(dm).append(xfND(_wmsUpdDd));
        sb.append(dm).append(xfND(_wmsUpdHh));
        sb.append(dm).append(xfND(_wmsUpdMi));
        sb.append(dm).append(xfND(_wmsUpdSs));
        sb.append(dm).append(xfND(_wmsUpdUserNm));
        sb.append(dm).append(xfND(_dataTransferOnlyStr01));
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
    public ErReceiveReport clone() {
        return (ErReceiveReport)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)} <br>
     * 入庫実績受信ID
     * @return The value of the column 'RECEIVE_REPORT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveReportId() {
        checkSpecifiedProperty("receiveReportId");
        return _receiveReportId;
    }

    /**
     * [set] RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)} <br>
     * 入庫実績受信ID
     * @param receiveReportId The value of the column 'RECEIVE_REPORT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveReportId(Long receiveReportId) {
        registerModifiedProperty("receiveReportId");
        _receiveReportId = receiveReportId;
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
     * [get] ERROR_FLG: {NotNull, CHAR(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, CHAR(1)} <br>
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
     * [get] STORE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @return The value of the column 'STORE_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreSlipNo() {
        checkSpecifiedProperty("storeSlipNo");
        return convertEmptyToNull(_storeSlipNo);
    }

    /**
     * [set] STORE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @param storeSlipNo The value of the column 'STORE_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreSlipNo(String storeSlipNo) {
        registerModifiedProperty("storeSlipNo");
        _storeSlipNo = storeSlipNo;
    }

    /**
     * [get] STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @return The value of the column 'STORE_SLIP_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreSlipRowNo() {
        checkSpecifiedProperty("storeSlipRowNo");
        return convertEmptyToNull(_storeSlipRowNo);
    }

    /**
     * [set] STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @param storeSlipRowNo The value of the column 'STORE_SLIP_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreSlipRowNo(String storeSlipRowNo) {
        registerModifiedProperty("storeSlipRowNo");
        _storeSlipRowNo = storeSlipRowNo;
    }

    /**
     * [get] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別
     * @return The value of the column 'SLIP_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipTypeCd() {
        checkSpecifiedProperty("slipTypeCd");
        return convertEmptyToNull(_slipTypeCd);
    }

    /**
     * [set] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別
     * @param slipTypeCd The value of the column 'SLIP_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipTypeCd(String slipTypeCd) {
        registerModifiedProperty("slipTypeCd");
        _slipTypeCd = slipTypeCd;
    }

    /**
     * [get] SN: {BIGINT(19), default=[0]} <br>
     * 連番
     * @return The value of the column 'SN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSn() {
        checkSpecifiedProperty("sn");
        return _sn;
    }

    /**
     * [set] SN: {BIGINT(19), default=[0]} <br>
     * 連番
     * @param sn The value of the column 'SN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSn(Long sn) {
        registerModifiedProperty("sn");
        _sn = sn;
    }

    /**
     * [get] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @return The value of the column 'IF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfId() {
        checkSpecifiedProperty("ifId");
        return convertEmptyToNull(_ifId);
    }

    /**
     * [set] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @param ifId The value of the column 'IF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfId(String ifId) {
        registerModifiedProperty("ifId");
        _ifId = ifId;
    }

    /**
     * [get] IF_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @return The value of the column 'IF_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfNo() {
        checkSpecifiedProperty("ifNo");
        return convertEmptyToNull(_ifNo);
    }

    /**
     * [set] IF_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @param ifNo The value of the column 'IF_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfNo(String ifNo) {
        registerModifiedProperty("ifNo");
        _ifNo = ifNo;
    }

    /**
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目コード
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuCd() {
        checkSpecifiedProperty("hinmokuCd");
        return convertEmptyToNull(_hinmokuCd);
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目コード
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuCd(String hinmokuCd) {
        registerModifiedProperty("hinmokuCd");
        _hinmokuCd = hinmokuCd;
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
     * [get] STORE_REASON_CD: {VARCHAR(30)} <br>
     * 入庫発生事由
     * @return The value of the column 'STORE_REASON_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreReasonCd() {
        checkSpecifiedProperty("storeReasonCd");
        return convertEmptyToNull(_storeReasonCd);
    }

    /**
     * [set] STORE_REASON_CD: {VARCHAR(30)} <br>
     * 入庫発生事由
     * @param storeReasonCd The value of the column 'STORE_REASON_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreReasonCd(String storeReasonCd) {
        registerModifiedProperty("storeReasonCd");
        _storeReasonCd = storeReasonCd;
    }

    /**
     * [get] STORE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @return The value of the column 'STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] NUM: {DECIMAL(14, 4)} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum() {
        checkSpecifiedProperty("num");
        return _num;
    }

    /**
     * [set] NUM: {DECIMAL(14, 4)} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum(java.math.BigDecimal num) {
        registerModifiedProperty("num");
        _num = num;
    }

    /**
     * [get] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @return The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotManagTypeCd() {
        checkSpecifiedProperty("lotManagTypeCd");
        return convertEmptyToNull(_lotManagTypeCd);
    }

    /**
     * [set] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @param lotManagTypeCd The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagTypeCd(String lotManagTypeCd) {
        registerModifiedProperty("lotManagTypeCd");
        _lotManagTypeCd = lotManagTypeCd;
    }

    /**
     * [get] LOT: {VARCHAR(100)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {VARCHAR(100)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] RECEIVE_NO: {VARCHAR(30)} <br>
     * 入荷番号
     * @return The value of the column 'RECEIVE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveNo() {
        checkSpecifiedProperty("receiveNo");
        return convertEmptyToNull(_receiveNo);
    }

    /**
     * [set] RECEIVE_NO: {VARCHAR(30)} <br>
     * 入荷番号
     * @param receiveNo The value of the column 'RECEIVE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveNo(String receiveNo) {
        registerModifiedProperty("receiveNo");
        _receiveNo = receiveNo;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPlantCd() {
        checkSpecifiedProperty("shippingPlantCd");
        return convertEmptyToNull(_shippingPlantCd);
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        registerModifiedProperty("shippingPlantCd");
        _shippingPlantCd = shippingPlantCd;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStorageSpaceCd() {
        checkSpecifiedProperty("shippingStorageSpaceCd");
        return convertEmptyToNull(_shippingStorageSpaceCd);
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        registerModifiedProperty("shippingStorageSpaceCd");
        _shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] STORE_PLANT_CD: {NotNull, VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'STORE_PLANT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getStorePlantCd() {
        checkSpecifiedProperty("storePlantCd");
        return convertEmptyToNull(_storePlantCd);
    }

    /**
     * [set] STORE_PLANT_CD: {NotNull, VARCHAR(30)} <br>
     * 入庫プラント
     * @param storePlantCd The value of the column 'STORE_PLANT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setStorePlantCd(String storePlantCd) {
        registerModifiedProperty("storePlantCd");
        _storePlantCd = storePlantCd;
    }

    /**
     * [get] STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'STORE_STORAGE_SPACE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getStoreStorageSpaceCd() {
        checkSpecifiedProperty("storeStorageSpaceCd");
        return convertEmptyToNull(_storeStorageSpaceCd);
    }

    /**
     * [set] STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)} <br>
     * 入庫保管場所
     * @param storeStorageSpaceCd The value of the column 'STORE_STORAGE_SPACE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setStoreStorageSpaceCd(String storeStorageSpaceCd) {
        registerModifiedProperty("storeStorageSpaceCd");
        _storeStorageSpaceCd = storeStorageSpaceCd;
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
     * [get] SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * 3社納品書番号1
     * @return The value of the column 'SANSHA_DELIVERY_SLIP_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSanshaDeliverySlipNo1() {
        checkSpecifiedProperty("sanshaDeliverySlipNo1");
        return convertEmptyToNull(_sanshaDeliverySlipNo1);
    }

    /**
     * [set] SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * 3社納品書番号1
     * @param sanshaDeliverySlipNo1 The value of the column 'SANSHA_DELIVERY_SLIP_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaDeliverySlipNo1(String sanshaDeliverySlipNo1) {
        registerModifiedProperty("sanshaDeliverySlipNo1");
        _sanshaDeliverySlipNo1 = sanshaDeliverySlipNo1;
    }

    /**
     * [get] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分
     * @return The value of the column 'DATA_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTypeCd() {
        checkSpecifiedProperty("dataTypeCd");
        return convertEmptyToNull(_dataTypeCd);
    }

    /**
     * [set] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分
     * @param dataTypeCd The value of the column 'DATA_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTypeCd(String dataTypeCd) {
        registerModifiedProperty("dataTypeCd");
        _dataTypeCd = dataTypeCd;
    }

    /**
     * [get] PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * 処理区分
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeCd() {
        checkSpecifiedProperty("processTypeCd");
        return convertEmptyToNull(_processTypeCd);
    }

    /**
     * [set] PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * 処理区分
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeCd(String processTypeCd) {
        registerModifiedProperty("processTypeCd");
        _processTypeCd = processTypeCd;
    }

    /**
     * [get] SLIP_NO: {VARCHAR(30)} <br>
     * 伝票番号
     * @return The value of the column 'SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipNo() {
        checkSpecifiedProperty("slipNo");
        return convertEmptyToNull(_slipNo);
    }

    /**
     * [set] SLIP_NO: {VARCHAR(30)} <br>
     * 伝票番号
     * @param slipNo The value of the column 'SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipNo(String slipNo) {
        registerModifiedProperty("slipNo");
        _slipNo = slipNo;
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
     * [get] WMS_ADD_USER_NM: {VARCHAR(60)} <br>
     * WMS作成者
     * @return The value of the column 'WMS_ADD_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddUserNm() {
        checkSpecifiedProperty("wmsAddUserNm");
        return convertEmptyToNull(_wmsAddUserNm);
    }

    /**
     * [set] WMS_ADD_USER_NM: {VARCHAR(60)} <br>
     * WMS作成者
     * @param wmsAddUserNm The value of the column 'WMS_ADD_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddUserNm(String wmsAddUserNm) {
        registerModifiedProperty("wmsAddUserNm");
        _wmsAddUserNm = wmsAddUserNm;
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
     * [get] WMS_UPD_USER_NM: {VARCHAR(60)} <br>
     * WMS更新者
     * @return The value of the column 'WMS_UPD_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdUserNm() {
        checkSpecifiedProperty("wmsUpdUserNm");
        return convertEmptyToNull(_wmsUpdUserNm);
    }

    /**
     * [set] WMS_UPD_USER_NM: {VARCHAR(60)} <br>
     * WMS更新者
     * @param wmsUpdUserNm The value of the column 'WMS_UPD_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdUserNm(String wmsUpdUserNm) {
        registerModifiedProperty("wmsUpdUserNm");
        _wmsUpdUserNm = wmsUpdUserNm;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 会社コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr01() {
        checkSpecifiedProperty("dataTransferOnlyStr01");
        return convertEmptyToNull(_dataTransferOnlyStr01);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 会社コード
     * @param dataTransferOnlyStr01 The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr01(String dataTransferOnlyStr01) {
        registerModifiedProperty("dataTransferOnlyStr01");
        _dataTransferOnlyStr01 = dataTransferOnlyStr01;
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
