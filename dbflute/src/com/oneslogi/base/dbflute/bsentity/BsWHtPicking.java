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
 * The entity of w_ht_picking as TABLE. <br>
 * ピッキングワーク
 * <pre>
 * [primary-key]
 *     HT_PICKING_ID
 *
 * [column]
 *     HT_PICKING_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, PICKING_B_ID, NIZOROE_NO, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, INST_NUM, SPG_QTY_ONS, LOCATION_ID, LOCATION_CD, LOCATION_NM, LOT, LIMIT_DT, WORK_START_DT, WORK_END_DT, STORE_LABEL_NO, LOT_ID, PICKING_FLG, SKIP_NUM, PROD_DT, FORCE_COPLETE_FLG, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SUSPEND_FLG, WORK_GROUP_KEY, ANOTHER_PICKING_FLG, LAP_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_PICKING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_lot, m_location, m_client, m_product, m_center
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tLot, mLocation, mClient, mProduct, mCenter
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long htPickingId = entity.getHtPickingId();
 * String macAddress = entity.getMacAddress();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long pickingBId = entity.getPickingBId();
 * String nizoroeNo = entity.getNizoroeNo();
 * Long productId = entity.getProductId();
 * String janCd = entity.getJanCd();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * java.math.BigDecimal spgQtyOns = entity.getSpgQtyOns();
 * Long locationId = entity.getLocationId();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * java.sql.Timestamp workStartDt = entity.getWorkStartDt();
 * java.sql.Timestamp workEndDt = entity.getWorkEndDt();
 * String storeLabelNo = entity.getStoreLabelNo();
 * Long lotId = entity.getLotId();
 * String pickingFlg = entity.getPickingFlg();
 * Long skipNum = entity.getSkipNum();
 * String prodDt = entity.getProdDt();
 * String forceCopleteFlg = entity.getForceCopleteFlg();
 * String daihyoNizoroeNo = entity.getDaihyoNizoroeNo();
 * String nizoroeNo2 = entity.getNizoroeNo2();
 * String daihyoNizoroeNo2 = entity.getDaihyoNizoroeNo2();
 * String suspendFlg = entity.getSuspendFlg();
 * String workGroupKey = entity.getWorkGroupKey();
 * String anotherPickingFlg = entity.getAnotherPickingFlg();
 * Long lapNum = entity.getLapNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setHtPickingId(htPickingId);
 * entity.setMacAddress(macAddress);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setPickingBId(pickingBId);
 * entity.setNizoroeNo(nizoroeNo);
 * entity.setProductId(productId);
 * entity.setJanCd(janCd);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setInstNum(instNum);
 * entity.setSpgQtyOns(spgQtyOns);
 * entity.setLocationId(locationId);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setWorkStartDt(workStartDt);
 * entity.setWorkEndDt(workEndDt);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setLotId(lotId);
 * entity.setPickingFlg(pickingFlg);
 * entity.setSkipNum(skipNum);
 * entity.setProdDt(prodDt);
 * entity.setForceCopleteFlg(forceCopleteFlg);
 * entity.setDaihyoNizoroeNo(daihyoNizoroeNo);
 * entity.setNizoroeNo2(nizoroeNo2);
 * entity.setDaihyoNizoroeNo2(daihyoNizoroeNo2);
 * entity.setSuspendFlg(suspendFlg);
 * entity.setWorkGroupKey(workGroupKey);
 * entity.setAnotherPickingFlg(anotherPickingFlg);
 * entity.setLapNum(lapNum);
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
public abstract class BsWHtPicking extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** HT_PICKING_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _htPickingId;

    /** MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} */
    protected String _macAddress;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** PICKING_B_ID: {IX, NotNull, BIGINT(19)} */
    protected Long _pickingBId;

    /** NIZOROE_NO: {NotNull, VARCHAR(30)} */
    protected String _nizoroeNo;

    /** PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} */
    protected Long _productId;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** PRODUCT_CD: {VARCHAR(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    protected String _productNm;

    /** INST_NUM: {NotNull, DECIMAL(14, 4)} */
    protected java.math.BigDecimal _instNum;

    /** SPG_QTY_ONS: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _spgQtyOns;

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    protected Long _locationId;

    /** LOCATION_CD: {VARCHAR(30)} */
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(60)} */
    protected String _locationNm;

    /** LOT: {VARCHAR(30)} */
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    protected String _limitDt;

    /** WORK_START_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _workStartDt;

    /** WORK_END_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _workEndDt;

    /** STORE_LABEL_NO: {VARCHAR(30)} */
    protected String _storeLabelNo;

    /** LOT_ID: {IX, BIGINT(19), FK to t_lot} */
    protected Long _lotId;

    /** PICKING_FLG: {CHAR(1)} */
    protected String _pickingFlg;

    /** SKIP_NUM: {BIGINT(19)} */
    protected Long _skipNum;

    /** PROD_DT: {VARCHAR(8)} */
    protected String _prodDt;

    /** FORCE_COPLETE_FLG: {CHAR(1)} */
    protected String _forceCopleteFlg;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo2;

    /** SUSPEND_FLG: {CHAR(1)} */
    protected String _suspendFlg;

    /** WORK_GROUP_KEY: {VARCHAR(30)} */
    protected String _workGroupKey;

    /** ANOTHER_PICKING_FLG: {CHAR(1)} */
    protected String _anotherPickingFlg;

    /** LAP_NUM: {BIGINT(19)} */
    protected Long _lapNum;

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
        return "w_ht_picking";
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
        if (_htPickingId == null) { return false; }
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
    /** t_lot by my LOT_ID, named 'TLot'. */
    protected TLot _tLot;

    /**
     * [get] t_lot by my LOT_ID, named 'TLot'. <br>
     * @return The entity of foreign property 'TLot'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TLot getTLot() {
        return _tLot;
    }

    /**
     * [set] t_lot by my LOT_ID, named 'TLot'.
     * @param tLot The entity of foreign property 'TLot'. (NullAllowed)
     */
    public void setTLot(TLot tLot) {
        _tLot = tLot;
    }

    /** m_location by my LOCATION_ID, named 'MLocation'. */
    protected MLocation _mLocation;

    /**
     * [get] m_location by my LOCATION_ID, named 'MLocation'. <br>
     * @return The entity of foreign property 'MLocation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MLocation getMLocation() {
        return _mLocation;
    }

    /**
     * [set] m_location by my LOCATION_ID, named 'MLocation'.
     * @param mLocation The entity of foreign property 'MLocation'. (NullAllowed)
     */
    public void setMLocation(MLocation mLocation) {
        _mLocation = mLocation;
    }

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

    /** m_product by my PRODUCT_ID, named 'MProduct'. */
    protected MProduct _mProduct;

    /**
     * [get] m_product by my PRODUCT_ID, named 'MProduct'. <br>
     * @return The entity of foreign property 'MProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProduct getMProduct() {
        return _mProduct;
    }

    /**
     * [set] m_product by my PRODUCT_ID, named 'MProduct'.
     * @param mProduct The entity of foreign property 'MProduct'. (NullAllowed)
     */
    public void setMProduct(MProduct mProduct) {
        _mProduct = mProduct;
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWHtPicking) {
            BsWHtPicking other = (BsWHtPicking)obj;
            if (!xSV(_htPickingId, other._htPickingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _htPickingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tLot != null)
        { sb.append(li).append(xbRDS(_tLot, "tLot")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_htPickingId));
        sb.append(dm).append(xfND(_macAddress));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_pickingBId));
        sb.append(dm).append(xfND(_nizoroeNo));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_spgQtyOns));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_workStartDt));
        sb.append(dm).append(xfND(_workEndDt));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_pickingFlg));
        sb.append(dm).append(xfND(_skipNum));
        sb.append(dm).append(xfND(_prodDt));
        sb.append(dm).append(xfND(_forceCopleteFlg));
        sb.append(dm).append(xfND(_daihyoNizoroeNo));
        sb.append(dm).append(xfND(_nizoroeNo2));
        sb.append(dm).append(xfND(_daihyoNizoroeNo2));
        sb.append(dm).append(xfND(_suspendFlg));
        sb.append(dm).append(xfND(_workGroupKey));
        sb.append(dm).append(xfND(_anotherPickingFlg));
        sb.append(dm).append(xfND(_lapNum));
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
        if (_tLot != null)
        { sb.append(dm).append("tLot"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WHtPicking clone() {
        return (WHtPicking)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HT_PICKING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ピッキングワークID
     * @return The value of the column 'HT_PICKING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getHtPickingId() {
        checkSpecifiedProperty("htPickingId");
        return _htPickingId;
    }

    /**
     * [set] HT_PICKING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ピッキングワークID
     * @param htPickingId The value of the column 'HT_PICKING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setHtPickingId(Long htPickingId) {
        registerModifiedProperty("htPickingId");
        _htPickingId = htPickingId;
    }

    /**
     * [get] MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMacAddress() {
        checkSpecifiedProperty("macAddress");
        return convertEmptyToNull(_macAddress);
    }

    /**
     * [set] MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setMacAddress(String macAddress) {
        registerModifiedProperty("macAddress");
        _macAddress = macAddress;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] PICKING_B_ID: {IX, NotNull, BIGINT(19)} <br>
     * 出庫ボディID
     * @return The value of the column 'PICKING_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingBId() {
        checkSpecifiedProperty("pickingBId");
        return _pickingBId;
    }

    /**
     * [set] PICKING_B_ID: {IX, NotNull, BIGINT(19)} <br>
     * 出庫ボディID
     * @param pickingBId The value of the column 'PICKING_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingBId(Long pickingBId) {
        registerModifiedProperty("pickingBId");
        _pickingBId = pickingBId;
    }

    /**
     * [get] NIZOROE_NO: {NotNull, VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getNizoroeNo() {
        checkSpecifiedProperty("nizoroeNo");
        return convertEmptyToNull(_nizoroeNo);
    }

    /**
     * [set] NIZOROE_NO: {NotNull, VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setNizoroeNo(String nizoroeNo) {
        registerModifiedProperty("nizoroeNo");
        _nizoroeNo = nizoroeNo;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] INST_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInstNum() {
        checkSpecifiedProperty("instNum");
        return _instNum;
    }

    /**
     * [set] INST_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] SPG_QTY_ONS: {DECIMAL(14, 4)} <br>
     * ピッキング済数
     * @return The value of the column 'SPG_QTY_ONS'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSpgQtyOns() {
        checkSpecifiedProperty("spgQtyOns");
        return _spgQtyOns;
    }

    /**
     * [set] SPG_QTY_ONS: {DECIMAL(14, 4)} <br>
     * ピッキング済数
     * @param spgQtyOns The value of the column 'SPG_QTY_ONS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpgQtyOns(java.math.BigDecimal spgQtyOns) {
        registerModifiedProperty("spgQtyOns");
        _spgQtyOns = spgQtyOns;
    }

    /**
     * [get] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {VARCHAR(60)} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNm() {
        checkSpecifiedProperty("locationNm");
        return convertEmptyToNull(_locationNm);
    }

    /**
     * [set] LOCATION_NM: {VARCHAR(60)} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNm(String locationNm) {
        registerModifiedProperty("locationNm");
        _locationNm = locationNm;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] WORK_START_DT: {DATETIME(19)} <br>
     * 開始時間
     * @return The value of the column 'WORK_START_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getWorkStartDt() {
        checkSpecifiedProperty("workStartDt");
        return _workStartDt;
    }

    /**
     * [set] WORK_START_DT: {DATETIME(19)} <br>
     * 開始時間
     * @param workStartDt The value of the column 'WORK_START_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkStartDt(java.sql.Timestamp workStartDt) {
        registerModifiedProperty("workStartDt");
        _workStartDt = workStartDt;
    }

    /**
     * [get] WORK_END_DT: {DATETIME(19)} <br>
     * 終了時間
     * @return The value of the column 'WORK_END_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getWorkEndDt() {
        checkSpecifiedProperty("workEndDt");
        return _workEndDt;
    }

    /**
     * [set] WORK_END_DT: {DATETIME(19)} <br>
     * 終了時間
     * @param workEndDt The value of the column 'WORK_END_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkEndDt(java.sql.Timestamp workEndDt) {
        registerModifiedProperty("workEndDt");
        _workEndDt = workEndDt;
    }

    /**
     * [get] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        registerModifiedProperty("storeLabelNo");
        _storeLabelNo = storeLabelNo;
    }

    /**
     * [get] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] PICKING_FLG: {CHAR(1)} <br>
     * 出庫フラグ
     * @return The value of the column 'PICKING_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingFlg() {
        checkSpecifiedProperty("pickingFlg");
        return convertEmptyToNull(_pickingFlg);
    }

    /**
     * [set] PICKING_FLG: {CHAR(1)} <br>
     * 出庫フラグ
     * @param pickingFlg The value of the column 'PICKING_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingFlg(String pickingFlg) {
        registerModifiedProperty("pickingFlg");
        _pickingFlg = pickingFlg;
    }

    /**
     * [get] SKIP_NUM: {BIGINT(19)} <br>
     * スキップ回数
     * @return The value of the column 'SKIP_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSkipNum() {
        checkSpecifiedProperty("skipNum");
        return _skipNum;
    }

    /**
     * [set] SKIP_NUM: {BIGINT(19)} <br>
     * スキップ回数
     * @param skipNum The value of the column 'SKIP_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkipNum(Long skipNum) {
        registerModifiedProperty("skipNum");
        _skipNum = skipNum;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDt() {
        checkSpecifiedProperty("prodDt");
        return convertEmptyToNull(_prodDt);
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDt(String prodDt) {
        registerModifiedProperty("prodDt");
        _prodDt = prodDt;
    }

    /**
     * [get] FORCE_COPLETE_FLG: {CHAR(1)} <br>
     * 強制完了フラグ
     * @return The value of the column 'FORCE_COPLETE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForceCopleteFlg() {
        checkSpecifiedProperty("forceCopleteFlg");
        return convertEmptyToNull(_forceCopleteFlg);
    }

    /**
     * [set] FORCE_COPLETE_FLG: {CHAR(1)} <br>
     * 強制完了フラグ
     * @param forceCopleteFlg The value of the column 'FORCE_COPLETE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForceCopleteFlg(String forceCopleteFlg) {
        registerModifiedProperty("forceCopleteFlg");
        _forceCopleteFlg = forceCopleteFlg;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @return The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDaihyoNizoroeNo() {
        checkSpecifiedProperty("daihyoNizoroeNo");
        return convertEmptyToNull(_daihyoNizoroeNo);
    }

    /**
     * [set] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @param daihyoNizoroeNo The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
        registerModifiedProperty("daihyoNizoroeNo");
        _daihyoNizoroeNo = daihyoNizoroeNo;
    }

    /**
     * [get] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeNo2() {
        checkSpecifiedProperty("nizoroeNo2");
        return convertEmptyToNull(_nizoroeNo2);
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        registerModifiedProperty("nizoroeNo2");
        _nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフン有り
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDaihyoNizoroeNo2() {
        checkSpecifiedProperty("daihyoNizoroeNo2");
        return convertEmptyToNull(_daihyoNizoroeNo2);
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフン有り
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        registerModifiedProperty("daihyoNizoroeNo2");
        _daihyoNizoroeNo2 = daihyoNizoroeNo2;
    }

    /**
     * [get] SUSPEND_FLG: {CHAR(1)} <br>
     * 中断フラグ
     * @return The value of the column 'SUSPEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuspendFlg() {
        checkSpecifiedProperty("suspendFlg");
        return convertEmptyToNull(_suspendFlg);
    }

    /**
     * [set] SUSPEND_FLG: {CHAR(1)} <br>
     * 中断フラグ
     * @param suspendFlg The value of the column 'SUSPEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuspendFlg(String suspendFlg) {
        registerModifiedProperty("suspendFlg");
        _suspendFlg = suspendFlg;
    }

    /**
     * [get] WORK_GROUP_KEY: {VARCHAR(30)} <br>
     * 作業グループキー
     * @return The value of the column 'WORK_GROUP_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkGroupKey() {
        checkSpecifiedProperty("workGroupKey");
        return convertEmptyToNull(_workGroupKey);
    }

    /**
     * [set] WORK_GROUP_KEY: {VARCHAR(30)} <br>
     * 作業グループキー
     * @param workGroupKey The value of the column 'WORK_GROUP_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkGroupKey(String workGroupKey) {
        registerModifiedProperty("workGroupKey");
        _workGroupKey = workGroupKey;
    }

    /**
     * [get] ANOTHER_PICKING_FLG: {CHAR(1)} <br>
     * 別在庫ピッキングフラグ
     * @return The value of the column 'ANOTHER_PICKING_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAnotherPickingFlg() {
        checkSpecifiedProperty("anotherPickingFlg");
        return convertEmptyToNull(_anotherPickingFlg);
    }

    /**
     * [set] ANOTHER_PICKING_FLG: {CHAR(1)} <br>
     * 別在庫ピッキングフラグ
     * @param anotherPickingFlg The value of the column 'ANOTHER_PICKING_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAnotherPickingFlg(String anotherPickingFlg) {
        registerModifiedProperty("anotherPickingFlg");
        _anotherPickingFlg = anotherPickingFlg;
    }

    /**
     * [get] LAP_NUM: {BIGINT(19)} <br>
     * 周回数
     * @return The value of the column 'LAP_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLapNum() {
        checkSpecifiedProperty("lapNum");
        return _lapNum;
    }

    /**
     * [set] LAP_NUM: {BIGINT(19)} <br>
     * 周回数
     * @param lapNum The value of the column 'LAP_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLapNum(Long lapNum) {
        registerModifiedProperty("lapNum");
        _lapNum = lapNum;
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