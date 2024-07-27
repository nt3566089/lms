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
 * The entity of t_inventory_h as TABLE. <br>
 * 棚卸ヘッダ
 * <pre>
 * [primary-key]
 *     INVENTORY_H_ID
 *
 * [column]
 *     INVENTORY_H_ID, CLIENT_ID, CENTER_ID, BATCH_NUM, INVENTORY_DT, PLANT_CD, STORAGE_SPACE_CD, INVENTORY_INST_NO, INVENTORY_STATUS_TYPE_ID, INVENTORY_STATUS_TYPE_CD, INST_RECV_TIME, REPORT_SEND_TIME, INVENTORY_UPDATE_FLG, INVENTORY_DATA_STATUS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client, m_center
 *
 * [referrer table]
 *     t_inventory_b, t_inventory_inst
 *
 * [foreign property]
 *     mClient, mCenter
 *
 * [referrer property]
 *     tInventoryBList, tInventoryInstList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long inventoryHId = entity.getInventoryHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long batchNum = entity.getBatchNum();
 * String inventoryDt = entity.getInventoryDt();
 * String plantCd = entity.getPlantCd();
 * String storageSpaceCd = entity.getStorageSpaceCd();
 * String inventoryInstNo = entity.getInventoryInstNo();
 * Long inventoryStatusTypeId = entity.getInventoryStatusTypeId();
 * String inventoryStatusTypeCd = entity.getInventoryStatusTypeCd();
 * java.sql.Timestamp instRecvTime = entity.getInstRecvTime();
 * java.sql.Timestamp reportSendTime = entity.getReportSendTime();
 * String inventoryUpdateFlg = entity.getInventoryUpdateFlg();
 * String inventoryDataStatus = entity.getInventoryDataStatus();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setInventoryHId(inventoryHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setBatchNum(batchNum);
 * entity.setInventoryDt(inventoryDt);
 * entity.setPlantCd(plantCd);
 * entity.setStorageSpaceCd(storageSpaceCd);
 * entity.setInventoryInstNo(inventoryInstNo);
 * entity.setInventoryStatusTypeId(inventoryStatusTypeId);
 * entity.setInventoryStatusTypeCd(inventoryStatusTypeCd);
 * entity.setInstRecvTime(instRecvTime);
 * entity.setReportSendTime(reportSendTime);
 * entity.setInventoryUpdateFlg(inventoryUpdateFlg);
 * entity.setInventoryDataStatus(inventoryDataStatus);
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
public abstract class BsTInventoryH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _inventoryHId;

    /** CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** BATCH_NUM: {NotNull, BIGINT(19)} */
    protected Long _batchNum;

    /** INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)} */
    protected String _inventoryDt;

    /** PLANT_CD: {VARCHAR(30)} */
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _storageSpaceCd;

    /** INVENTORY_INST_NO: {VARCHAR(30)} */
    protected String _inventoryInstNo;

    /** INVENTORY_STATUS_TYPE_ID: {BIGINT(19)} */
    protected Long _inventoryStatusTypeId;

    /** INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)} */
    protected String _inventoryStatusTypeCd;

    /** INST_RECV_TIME: {DATETIME(19)} */
    protected java.sql.Timestamp _instRecvTime;

    /** REPORT_SEND_TIME: {DATETIME(19)} */
    protected java.sql.Timestamp _reportSendTime;

    /** INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]} */
    protected String _inventoryUpdateFlg;

    /** INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]} */
    protected String _inventoryDataStatus;

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
        return "t_inventory_h";
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
        if (_inventoryHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientId : UQ+, NotNull, BIGINT(19), FK to m_client. (NotNull)
     * @param centerId : +UQ, IX, NotNull, BIGINT(19), FK to m_center. (NotNull)
     * @param inventoryDt : +UQ, IX, NotNull, VARCHAR(8). (NotNull)
     */
    public void uniqueBy(Long clientId, Long centerId, String inventoryDt) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientId");
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("inventoryDt");
        setClientId(clientId);setCenterId(centerId);setInventoryDt(inventoryDt);
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
    /** m_client by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] m_client by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] m_client by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** m_center by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] m_center by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] m_center by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_inventory_b by INVENTORY_H_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] t_inventory_b by INVENTORY_H_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] t_inventory_b by INVENTORY_H_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** t_inventory_inst by INVENTORY_H_ID, named 'TInventoryInstList'. */
    protected List<TInventoryInst> _tInventoryInstList;

    /**
     * [get] t_inventory_inst by INVENTORY_H_ID, named 'TInventoryInstList'.
     * @return The entity list of referrer property 'TInventoryInstList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryInst> getTInventoryInstList() {
        if (_tInventoryInstList == null) { _tInventoryInstList = newReferrerList(); }
        return _tInventoryInstList;
    }

    /**
     * [set] t_inventory_inst by INVENTORY_H_ID, named 'TInventoryInstList'.
     * @param tInventoryInstList The entity list of referrer property 'TInventoryInstList'. (NullAllowed)
     */
    public void setTInventoryInstList(List<TInventoryInst> tInventoryInstList) {
        _tInventoryInstList = tInventoryInstList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTInventoryH) {
            BsTInventoryH other = (BsTInventoryH)obj;
            if (!xSV(_inventoryHId, other._inventoryHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tInventoryInstList != null) { for (TInventoryInst et : _tInventoryInstList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryInstList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_batchNum));
        sb.append(dm).append(xfND(_inventoryDt));
        sb.append(dm).append(xfND(_plantCd));
        sb.append(dm).append(xfND(_storageSpaceCd));
        sb.append(dm).append(xfND(_inventoryInstNo));
        sb.append(dm).append(xfND(_inventoryStatusTypeId));
        sb.append(dm).append(xfND(_inventoryStatusTypeCd));
        sb.append(dm).append(xfND(_instRecvTime));
        sb.append(dm).append(xfND(_reportSendTime));
        sb.append(dm).append(xfND(_inventoryUpdateFlg));
        sb.append(dm).append(xfND(_inventoryDataStatus));
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
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tInventoryInstList != null && !_tInventoryInstList.isEmpty())
        { sb.append(dm).append("tInventoryInstList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TInventoryH clone() {
        return (TInventoryH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryHId() {
        checkSpecifiedProperty("inventoryHId");
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryHId(Long inventoryHId) {
        registerModifiedProperty("inventoryHId");
        _inventoryHId = inventoryHId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] BATCH_NUM: {NotNull, BIGINT(19)} <br>
     * バッチNo.
     * @return The value of the column 'BATCH_NUM'. (basically NotNull if selected: for the constraint)
     */
    public Long getBatchNum() {
        checkSpecifiedProperty("batchNum");
        return _batchNum;
    }

    /**
     * [set] BATCH_NUM: {NotNull, BIGINT(19)} <br>
     * バッチNo.
     * @param batchNum The value of the column 'BATCH_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setBatchNum(Long batchNum) {
        registerModifiedProperty("batchNum");
        _batchNum = batchNum;
    }

    /**
     * [get] INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)} <br>
     * 棚卸日
     * @return The value of the column 'INVENTORY_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getInventoryDt() {
        checkSpecifiedProperty("inventoryDt");
        return convertEmptyToNull(_inventoryDt);
    }

    /**
     * [set] INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)} <br>
     * 棚卸日
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryDt(String inventoryDt) {
        registerModifiedProperty("inventoryDt");
        _inventoryDt = inventoryDt;
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
     * 保管場所CD
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorageSpaceCd() {
        checkSpecifiedProperty("storageSpaceCd");
        return convertEmptyToNull(_storageSpaceCd);
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        registerModifiedProperty("storageSpaceCd");
        _storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] INVENTORY_INST_NO: {VARCHAR(30)} <br>
     * 棚卸指示No
     * @return The value of the column 'INVENTORY_INST_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryInstNo() {
        checkSpecifiedProperty("inventoryInstNo");
        return convertEmptyToNull(_inventoryInstNo);
    }

    /**
     * [set] INVENTORY_INST_NO: {VARCHAR(30)} <br>
     * 棚卸指示No
     * @param inventoryInstNo The value of the column 'INVENTORY_INST_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryInstNo(String inventoryInstNo) {
        registerModifiedProperty("inventoryInstNo");
        _inventoryInstNo = inventoryInstNo;
    }

    /**
     * [get] INVENTORY_STATUS_TYPE_ID: {BIGINT(19)} <br>
     * 棚卸進捗状況区分ID
     * @return The value of the column 'INVENTORY_STATUS_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryStatusTypeId() {
        checkSpecifiedProperty("inventoryStatusTypeId");
        return _inventoryStatusTypeId;
    }

    /**
     * [set] INVENTORY_STATUS_TYPE_ID: {BIGINT(19)} <br>
     * 棚卸進捗状況区分ID
     * @param inventoryStatusTypeId The value of the column 'INVENTORY_STATUS_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryStatusTypeId(Long inventoryStatusTypeId) {
        registerModifiedProperty("inventoryStatusTypeId");
        _inventoryStatusTypeId = inventoryStatusTypeId;
    }

    /**
     * [get] INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)} <br>
     * 棚卸進捗状況区分
     * @return The value of the column 'INVENTORY_STATUS_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryStatusTypeCd() {
        checkSpecifiedProperty("inventoryStatusTypeCd");
        return convertEmptyToNull(_inventoryStatusTypeCd);
    }

    /**
     * [set] INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)} <br>
     * 棚卸進捗状況区分
     * @param inventoryStatusTypeCd The value of the column 'INVENTORY_STATUS_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryStatusTypeCd(String inventoryStatusTypeCd) {
        registerModifiedProperty("inventoryStatusTypeCd");
        _inventoryStatusTypeCd = inventoryStatusTypeCd;
    }

    /**
     * [get] INST_RECV_TIME: {DATETIME(19)} <br>
     * 指示受信時刻
     * @return The value of the column 'INST_RECV_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getInstRecvTime() {
        checkSpecifiedProperty("instRecvTime");
        return _instRecvTime;
    }

    /**
     * [set] INST_RECV_TIME: {DATETIME(19)} <br>
     * 指示受信時刻
     * @param instRecvTime The value of the column 'INST_RECV_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstRecvTime(java.sql.Timestamp instRecvTime) {
        registerModifiedProperty("instRecvTime");
        _instRecvTime = instRecvTime;
    }

    /**
     * [get] REPORT_SEND_TIME: {DATETIME(19)} <br>
     * 実績送信時刻
     * @return The value of the column 'REPORT_SEND_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getReportSendTime() {
        checkSpecifiedProperty("reportSendTime");
        return _reportSendTime;
    }

    /**
     * [set] REPORT_SEND_TIME: {DATETIME(19)} <br>
     * 実績送信時刻
     * @param reportSendTime The value of the column 'REPORT_SEND_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportSendTime(java.sql.Timestamp reportSendTime) {
        registerModifiedProperty("reportSendTime");
        _reportSendTime = reportSendTime;
    }

    /**
     * [get] INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]} <br>
     * 棚卸一括確定フラグ
     * @return The value of the column 'INVENTORY_UPDATE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryUpdateFlg() {
        checkSpecifiedProperty("inventoryUpdateFlg");
        return convertEmptyToNull(_inventoryUpdateFlg);
    }

    /**
     * [set] INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]} <br>
     * 棚卸一括確定フラグ
     * @param inventoryUpdateFlg The value of the column 'INVENTORY_UPDATE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryUpdateFlg(String inventoryUpdateFlg) {
        registerModifiedProperty("inventoryUpdateFlg");
        _inventoryUpdateFlg = inventoryUpdateFlg;
    }

    /**
     * [get] INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]} <br>
     * 棚卸データ作成状況
     * @return The value of the column 'INVENTORY_DATA_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryDataStatus() {
        checkSpecifiedProperty("inventoryDataStatus");
        return convertEmptyToNull(_inventoryDataStatus);
    }

    /**
     * [set] INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]} <br>
     * 棚卸データ作成状況
     * @param inventoryDataStatus The value of the column 'INVENTORY_DATA_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDataStatus(String inventoryDataStatus) {
        registerModifiedProperty("inventoryDataStatus");
        _inventoryDataStatus = inventoryDataStatus;
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
