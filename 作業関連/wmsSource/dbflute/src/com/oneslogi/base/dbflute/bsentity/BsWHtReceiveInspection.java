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
 * The entity of w_ht_receive_inspection as TABLE. <br>
 * 入荷検品ワーク
 * <pre>
 * [primary-key]
 *     HT_RECEIVE_INSPECTION_ID
 *
 * [column]
 *     HT_RECEIVE_INSPECTION_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, WAREHOUSE_ID, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, STOCK_TYPE_ID, STK_CLS_NM, PIECE_QTY_RCV_ORD, PIECE_QTY_RCV, RCV_LOC_ID, RCV_LOC_CD, RCV_LOC_NM, HT_WORK_NO, ONS_NUM, LOT_ID, LOT, LIMIT_DT, LABEL_SELECT, WORK_START_DT, WORK_END_DT, PRODUCTION_DT, INPUT_ASSISTANCE_UNIT_NUM, INPUT_ASSISTANCE_CASE_NUM, INPUT_ASSISTANCE_PIECE_NUM, CASE_RECEIVE_LABEL_NUM, PIECE_RECEIVE_LABEL_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_RECEIVE_INSPECTION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client, m_product, m_center, m_location, m_warehouse, t_lot, m_stock_type
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mProduct, mCenter, mLocation, mWarehouse, tLot, mStockType
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long htReceiveInspectionId = entity.getHtReceiveInspectionId();
 * String macAddress = entity.getMacAddress();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long warehouseId = entity.getWarehouseId();
 * Long productId = entity.getProductId();
 * String janCd = entity.getJanCd();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * Long stockTypeId = entity.getStockTypeId();
 * String stkClsNm = entity.getStkClsNm();
 * java.math.BigDecimal pieceQtyRcvOrd = entity.getPieceQtyRcvOrd();
 * java.math.BigDecimal pieceQtyRcv = entity.getPieceQtyRcv();
 * Long rcvLocId = entity.getRcvLocId();
 * String rcvLocCd = entity.getRcvLocCd();
 * String rcvLocNm = entity.getRcvLocNm();
 * String htWorkNo = entity.getHtWorkNo();
 * String onsNum = entity.getOnsNum();
 * Long lotId = entity.getLotId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * String labelSelect = entity.getLabelSelect();
 * java.sql.Timestamp workStartDt = entity.getWorkStartDt();
 * java.sql.Timestamp workEndDt = entity.getWorkEndDt();
 * String productionDt = entity.getProductionDt();
 * Long inputAssistanceUnitNum = entity.getInputAssistanceUnitNum();
 * java.math.BigDecimal inputAssistanceCaseNum = entity.getInputAssistanceCaseNum();
 * java.math.BigDecimal inputAssistancePieceNum = entity.getInputAssistancePieceNum();
 * Long caseReceiveLabelNum = entity.getCaseReceiveLabelNum();
 * Long pieceReceiveLabelNum = entity.getPieceReceiveLabelNum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setHtReceiveInspectionId(htReceiveInspectionId);
 * entity.setMacAddress(macAddress);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setWarehouseId(warehouseId);
 * entity.setProductId(productId);
 * entity.setJanCd(janCd);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setStockTypeId(stockTypeId);
 * entity.setStkClsNm(stkClsNm);
 * entity.setPieceQtyRcvOrd(pieceQtyRcvOrd);
 * entity.setPieceQtyRcv(pieceQtyRcv);
 * entity.setRcvLocId(rcvLocId);
 * entity.setRcvLocCd(rcvLocCd);
 * entity.setRcvLocNm(rcvLocNm);
 * entity.setHtWorkNo(htWorkNo);
 * entity.setOnsNum(onsNum);
 * entity.setLotId(lotId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setLabelSelect(labelSelect);
 * entity.setWorkStartDt(workStartDt);
 * entity.setWorkEndDt(workEndDt);
 * entity.setProductionDt(productionDt);
 * entity.setInputAssistanceUnitNum(inputAssistanceUnitNum);
 * entity.setInputAssistanceCaseNum(inputAssistanceCaseNum);
 * entity.setInputAssistancePieceNum(inputAssistancePieceNum);
 * entity.setCaseReceiveLabelNum(caseReceiveLabelNum);
 * entity.setPieceReceiveLabelNum(pieceReceiveLabelNum);
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
public abstract class BsWHtReceiveInspection extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** HT_RECEIVE_INSPECTION_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _htReceiveInspectionId;

    /** MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} */
    protected String _macAddress;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} */
    protected Long _warehouseId;

    /** PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} */
    protected Long _productId;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** PRODUCT_CD: {VARCHAR(30)} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    protected String _productNm;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    protected Long _stockTypeId;

    /** STK_CLS_NM: {VARCHAR(60)} */
    protected String _stkClsNm;

    /** PIECE_QTY_RCV_ORD: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _pieceQtyRcvOrd;

    /** PIECE_QTY_RCV: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _pieceQtyRcv;

    /** RCV_LOC_ID: {IX, BIGINT(19), FK to m_location} */
    protected Long _rcvLocId;

    /** RCV_LOC_CD: {VARCHAR(30)} */
    protected String _rcvLocCd;

    /** RCV_LOC_NM: {VARCHAR(60)} */
    protected String _rcvLocNm;

    /** HT_WORK_NO: {VARCHAR(30)} */
    protected String _htWorkNo;

    /** ONS_NUM: {VARCHAR(30)} */
    protected String _onsNum;

    /** LOT_ID: {IX, BIGINT(19), FK to t_lot} */
    protected Long _lotId;

    /** LOT: {VARCHAR(30)} */
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    protected String _limitDt;

    /** LABEL_SELECT: {VARCHAR(30)} */
    protected String _labelSelect;

    /** WORK_START_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _workStartDt;

    /** WORK_END_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _workEndDt;

    /** PRODUCTION_DT: {VARCHAR(8)} */
    protected String _productionDt;

    /** INPUT_ASSISTANCE_UNIT_NUM: {BIGINT(19)} */
    protected Long _inputAssistanceUnitNum;

    /** INPUT_ASSISTANCE_CASE_NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _inputAssistanceCaseNum;

    /** INPUT_ASSISTANCE_PIECE_NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _inputAssistancePieceNum;

    /** CASE_RECEIVE_LABEL_NUM: {BIGINT(19)} */
    protected Long _caseReceiveLabelNum;

    /** PIECE_RECEIVE_LABEL_NUM: {BIGINT(19)} */
    protected Long _pieceReceiveLabelNum;

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
        return "w_ht_receive_inspection";
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
        if (_htReceiveInspectionId == null) { return false; }
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

    /** m_location by my RCV_LOC_ID, named 'MLocation'. */
    protected MLocation _mLocation;

    /**
     * [get] m_location by my RCV_LOC_ID, named 'MLocation'. <br>
     * @return The entity of foreign property 'MLocation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MLocation getMLocation() {
        return _mLocation;
    }

    /**
     * [set] m_location by my RCV_LOC_ID, named 'MLocation'.
     * @param mLocation The entity of foreign property 'MLocation'. (NullAllowed)
     */
    public void setMLocation(MLocation mLocation) {
        _mLocation = mLocation;
    }

    /** m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'. */
    protected MWarehouse _mWarehouse;

    /**
     * [get] m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'. <br>
     * @return The entity of foreign property 'MWarehouse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MWarehouse getMWarehouse() {
        return _mWarehouse;
    }

    /**
     * [set] m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param mWarehouse The entity of foreign property 'MWarehouse'. (NullAllowed)
     */
    public void setMWarehouse(MWarehouse mWarehouse) {
        _mWarehouse = mWarehouse;
    }

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

    /** m_stock_type by my STOCK_TYPE_ID, named 'MStockType'. */
    protected MStockType _mStockType;

    /**
     * [get] m_stock_type by my STOCK_TYPE_ID, named 'MStockType'. <br>
     * @return The entity of foreign property 'MStockType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MStockType getMStockType() {
        return _mStockType;
    }

    /**
     * [set] m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @param mStockType The entity of foreign property 'MStockType'. (NullAllowed)
     */
    public void setMStockType(MStockType mStockType) {
        _mStockType = mStockType;
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
        if (obj instanceof BsWHtReceiveInspection) {
            BsWHtReceiveInspection other = (BsWHtReceiveInspection)obj;
            if (!xSV(_htReceiveInspectionId, other._htReceiveInspectionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _htReceiveInspectionId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_mWarehouse != null)
        { sb.append(li).append(xbRDS(_mWarehouse, "mWarehouse")); }
        if (_tLot != null)
        { sb.append(li).append(xbRDS(_tLot, "tLot")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_htReceiveInspectionId));
        sb.append(dm).append(xfND(_macAddress));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_stkClsNm));
        sb.append(dm).append(xfND(_pieceQtyRcvOrd));
        sb.append(dm).append(xfND(_pieceQtyRcv));
        sb.append(dm).append(xfND(_rcvLocId));
        sb.append(dm).append(xfND(_rcvLocCd));
        sb.append(dm).append(xfND(_rcvLocNm));
        sb.append(dm).append(xfND(_htWorkNo));
        sb.append(dm).append(xfND(_onsNum));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_labelSelect));
        sb.append(dm).append(xfND(_workStartDt));
        sb.append(dm).append(xfND(_workEndDt));
        sb.append(dm).append(xfND(_productionDt));
        sb.append(dm).append(xfND(_inputAssistanceUnitNum));
        sb.append(dm).append(xfND(_inputAssistanceCaseNum));
        sb.append(dm).append(xfND(_inputAssistancePieceNum));
        sb.append(dm).append(xfND(_caseReceiveLabelNum));
        sb.append(dm).append(xfND(_pieceReceiveLabelNum));
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
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_mWarehouse != null)
        { sb.append(dm).append("mWarehouse"); }
        if (_tLot != null)
        { sb.append(dm).append("tLot"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WHtReceiveInspection clone() {
        return (WHtReceiveInspection)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HT_RECEIVE_INSPECTION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷検品ワークID
     * @return The value of the column 'HT_RECEIVE_INSPECTION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getHtReceiveInspectionId() {
        checkSpecifiedProperty("htReceiveInspectionId");
        return _htReceiveInspectionId;
    }

    /**
     * [set] HT_RECEIVE_INSPECTION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷検品ワークID
     * @param htReceiveInspectionId The value of the column 'HT_RECEIVE_INSPECTION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setHtReceiveInspectionId(Long htReceiveInspectionId) {
        registerModifiedProperty("htReceiveInspectionId");
        _htReceiveInspectionId = htReceiveInspectionId;
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
     * [get] WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(Long warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
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
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
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
     * [get] STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] STK_CLS_NM: {VARCHAR(60)} <br>
     * 在庫区分名称
     * @return The value of the column 'STK_CLS_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStkClsNm() {
        checkSpecifiedProperty("stkClsNm");
        return convertEmptyToNull(_stkClsNm);
    }

    /**
     * [set] STK_CLS_NM: {VARCHAR(60)} <br>
     * 在庫区分名称
     * @param stkClsNm The value of the column 'STK_CLS_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStkClsNm(String stkClsNm) {
        registerModifiedProperty("stkClsNm");
        _stkClsNm = stkClsNm;
    }

    /**
     * [get] PIECE_QTY_RCV_ORD: {DECIMAL(14, 4)} <br>
     * 入荷予定数量
     * @return The value of the column 'PIECE_QTY_RCV_ORD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPieceQtyRcvOrd() {
        checkSpecifiedProperty("pieceQtyRcvOrd");
        return _pieceQtyRcvOrd;
    }

    /**
     * [set] PIECE_QTY_RCV_ORD: {DECIMAL(14, 4)} <br>
     * 入荷予定数量
     * @param pieceQtyRcvOrd The value of the column 'PIECE_QTY_RCV_ORD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPieceQtyRcvOrd(java.math.BigDecimal pieceQtyRcvOrd) {
        registerModifiedProperty("pieceQtyRcvOrd");
        _pieceQtyRcvOrd = pieceQtyRcvOrd;
    }

    /**
     * [get] PIECE_QTY_RCV: {DECIMAL(14, 4)} <br>
     * 入荷検収数量
     * @return The value of the column 'PIECE_QTY_RCV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPieceQtyRcv() {
        checkSpecifiedProperty("pieceQtyRcv");
        return _pieceQtyRcv;
    }

    /**
     * [set] PIECE_QTY_RCV: {DECIMAL(14, 4)} <br>
     * 入荷検収数量
     * @param pieceQtyRcv The value of the column 'PIECE_QTY_RCV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPieceQtyRcv(java.math.BigDecimal pieceQtyRcv) {
        registerModifiedProperty("pieceQtyRcv");
        _pieceQtyRcv = pieceQtyRcv;
    }

    /**
     * [get] RCV_LOC_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 仮入庫ロケーションID
     * @return The value of the column 'RCV_LOC_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvLocId() {
        checkSpecifiedProperty("rcvLocId");
        return _rcvLocId;
    }

    /**
     * [set] RCV_LOC_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 仮入庫ロケーションID
     * @param rcvLocId The value of the column 'RCV_LOC_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvLocId(Long rcvLocId) {
        registerModifiedProperty("rcvLocId");
        _rcvLocId = rcvLocId;
    }

    /**
     * [get] RCV_LOC_CD: {VARCHAR(30)} <br>
     * 仮入庫ロケーションCD
     * @return The value of the column 'RCV_LOC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvLocCd() {
        checkSpecifiedProperty("rcvLocCd");
        return convertEmptyToNull(_rcvLocCd);
    }

    /**
     * [set] RCV_LOC_CD: {VARCHAR(30)} <br>
     * 仮入庫ロケーションCD
     * @param rcvLocCd The value of the column 'RCV_LOC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvLocCd(String rcvLocCd) {
        registerModifiedProperty("rcvLocCd");
        _rcvLocCd = rcvLocCd;
    }

    /**
     * [get] RCV_LOC_NM: {VARCHAR(60)} <br>
     * 仮入庫ロケーション名称
     * @return The value of the column 'RCV_LOC_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvLocNm() {
        checkSpecifiedProperty("rcvLocNm");
        return convertEmptyToNull(_rcvLocNm);
    }

    /**
     * [set] RCV_LOC_NM: {VARCHAR(60)} <br>
     * 仮入庫ロケーション名称
     * @param rcvLocNm The value of the column 'RCV_LOC_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvLocNm(String rcvLocNm) {
        registerModifiedProperty("rcvLocNm");
        _rcvLocNm = rcvLocNm;
    }

    /**
     * [get] HT_WORK_NO: {VARCHAR(30)} <br>
     * ＨＴ作業ＮＯ
     * @return The value of the column 'HT_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtWorkNo() {
        checkSpecifiedProperty("htWorkNo");
        return convertEmptyToNull(_htWorkNo);
    }

    /**
     * [set] HT_WORK_NO: {VARCHAR(30)} <br>
     * ＨＴ作業ＮＯ
     * @param htWorkNo The value of the column 'HT_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtWorkNo(String htWorkNo) {
        registerModifiedProperty("htWorkNo");
        _htWorkNo = htWorkNo;
    }

    /**
     * [get] ONS_NUM: {VARCHAR(30)} <br>
     * 入庫ＮＯ
     * @return The value of the column 'ONS_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOnsNum() {
        checkSpecifiedProperty("onsNum");
        return convertEmptyToNull(_onsNum);
    }

    /**
     * [set] ONS_NUM: {VARCHAR(30)} <br>
     * 入庫ＮＯ
     * @param onsNum The value of the column 'ONS_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOnsNum(String onsNum) {
        registerModifiedProperty("onsNum");
        _onsNum = onsNum;
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
     * [get] LABEL_SELECT: {VARCHAR(30)} <br>
     * ラベル選択
     * @return The value of the column 'LABEL_SELECT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLabelSelect() {
        checkSpecifiedProperty("labelSelect");
        return convertEmptyToNull(_labelSelect);
    }

    /**
     * [set] LABEL_SELECT: {VARCHAR(30)} <br>
     * ラベル選択
     * @param labelSelect The value of the column 'LABEL_SELECT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLabelSelect(String labelSelect) {
        registerModifiedProperty("labelSelect");
        _labelSelect = labelSelect;
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
     * [get] PRODUCTION_DT: {VARCHAR(8)} <br>
     * 製造日
     * @return The value of the column 'PRODUCTION_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductionDt() {
        checkSpecifiedProperty("productionDt");
        return convertEmptyToNull(_productionDt);
    }

    /**
     * [set] PRODUCTION_DT: {VARCHAR(8)} <br>
     * 製造日
     * @param productionDt The value of the column 'PRODUCTION_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductionDt(String productionDt) {
        registerModifiedProperty("productionDt");
        _productionDt = productionDt;
    }

    /**
     * [get] INPUT_ASSISTANCE_UNIT_NUM: {BIGINT(19)} <br>
     * 入力補助入数
     * @return The value of the column 'INPUT_ASSISTANCE_UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInputAssistanceUnitNum() {
        checkSpecifiedProperty("inputAssistanceUnitNum");
        return _inputAssistanceUnitNum;
    }

    /**
     * [set] INPUT_ASSISTANCE_UNIT_NUM: {BIGINT(19)} <br>
     * 入力補助入数
     * @param inputAssistanceUnitNum The value of the column 'INPUT_ASSISTANCE_UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInputAssistanceUnitNum(Long inputAssistanceUnitNum) {
        registerModifiedProperty("inputAssistanceUnitNum");
        _inputAssistanceUnitNum = inputAssistanceUnitNum;
    }

    /**
     * [get] INPUT_ASSISTANCE_CASE_NUM: {DECIMAL(14, 4)} <br>
     * 入力補助ケース数
     * @return The value of the column 'INPUT_ASSISTANCE_CASE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInputAssistanceCaseNum() {
        checkSpecifiedProperty("inputAssistanceCaseNum");
        return _inputAssistanceCaseNum;
    }

    /**
     * [set] INPUT_ASSISTANCE_CASE_NUM: {DECIMAL(14, 4)} <br>
     * 入力補助ケース数
     * @param inputAssistanceCaseNum The value of the column 'INPUT_ASSISTANCE_CASE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInputAssistanceCaseNum(java.math.BigDecimal inputAssistanceCaseNum) {
        registerModifiedProperty("inputAssistanceCaseNum");
        _inputAssistanceCaseNum = inputAssistanceCaseNum;
    }

    /**
     * [get] INPUT_ASSISTANCE_PIECE_NUM: {DECIMAL(14, 4)} <br>
     * 入力補助ピース数
     * @return The value of the column 'INPUT_ASSISTANCE_PIECE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInputAssistancePieceNum() {
        checkSpecifiedProperty("inputAssistancePieceNum");
        return _inputAssistancePieceNum;
    }

    /**
     * [set] INPUT_ASSISTANCE_PIECE_NUM: {DECIMAL(14, 4)} <br>
     * 入力補助ピース数
     * @param inputAssistancePieceNum The value of the column 'INPUT_ASSISTANCE_PIECE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInputAssistancePieceNum(java.math.BigDecimal inputAssistancePieceNum) {
        registerModifiedProperty("inputAssistancePieceNum");
        _inputAssistancePieceNum = inputAssistancePieceNum;
    }

    /**
     * [get] CASE_RECEIVE_LABEL_NUM: {BIGINT(19)} <br>
     * 入荷ラベルケース枚数
     * @return The value of the column 'CASE_RECEIVE_LABEL_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseReceiveLabelNum() {
        checkSpecifiedProperty("caseReceiveLabelNum");
        return _caseReceiveLabelNum;
    }

    /**
     * [set] CASE_RECEIVE_LABEL_NUM: {BIGINT(19)} <br>
     * 入荷ラベルケース枚数
     * @param caseReceiveLabelNum The value of the column 'CASE_RECEIVE_LABEL_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseReceiveLabelNum(Long caseReceiveLabelNum) {
        registerModifiedProperty("caseReceiveLabelNum");
        _caseReceiveLabelNum = caseReceiveLabelNum;
    }

    /**
     * [get] PIECE_RECEIVE_LABEL_NUM: {BIGINT(19)} <br>
     * 入荷ラベルピース枚数
     * @return The value of the column 'PIECE_RECEIVE_LABEL_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPieceReceiveLabelNum() {
        checkSpecifiedProperty("pieceReceiveLabelNum");
        return _pieceReceiveLabelNum;
    }

    /**
     * [set] PIECE_RECEIVE_LABEL_NUM: {BIGINT(19)} <br>
     * 入荷ラベルピース枚数
     * @param pieceReceiveLabelNum The value of the column 'PIECE_RECEIVE_LABEL_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPieceReceiveLabelNum(Long pieceReceiveLabelNum) {
        registerModifiedProperty("pieceReceiveLabelNum");
        _pieceReceiveLabelNum = pieceReceiveLabelNum;
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
