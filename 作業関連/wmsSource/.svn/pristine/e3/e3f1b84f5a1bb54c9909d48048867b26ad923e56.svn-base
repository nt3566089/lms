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
 * The entity of m_warehouse as TABLE. <br>
 * 倉庫マスタ
 * <pre>
 * [primary-key]
 *     WAREHOUSE_ID
 *
 * [column]
 *     WAREHOUSE_ID, CENTER_ID, WAREHOUSE_CD, WAREHOUSE_NM, WAREHOUSE_ABBR, FOREIGN_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WAREHOUSE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, b_class_dtl(ByDelFlg)
 *
 * [referrer table]
 *     m_web_ht_info, m_zone, t_alloc_inst_b, t_inventory_b, t_move_inst_b, t_receive_plan_b, t_shipping_inst_b, t_stock, w_ht_inventory_input_prod, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store
 *
 * [foreign property]
 *     mCenter, bClassDtlByDelFlg, bClassDtlByForeignFlg
 *
 * [referrer property]
 *     mWebHtInfoList, mZoneList, tAllocInstBList, tInventoryBList, tMoveInstBList, tReceivePlanBList, tShippingInstBList, tStockList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long warehouseId = entity.getWarehouseId();
 * Long centerId = entity.getCenterId();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseNm = entity.getWarehouseNm();
 * String warehouseAbbr = entity.getWarehouseAbbr();
 * String foreignFlg = entity.getForeignFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWarehouseId(warehouseId);
 * entity.setCenterId(centerId);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseNm(warehouseNm);
 * entity.setWarehouseAbbr(warehouseAbbr);
 * entity.setForeignFlg(foreignFlg);
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
public abstract class BsMWarehouse extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WAREHOUSE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _warehouseId;

    /** CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** WAREHOUSE_CD: {+UQ, IX, NotNull, VARCHAR(30)} */
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {VARCHAR(60)} */
    protected String _warehouseNm;

    /** WAREHOUSE_ABBR: {VARCHAR(60)} */
    protected String _warehouseAbbr;

    /** FOREIGN_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForeignFlg} */
    protected String _foreignFlg;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
        return "m_warehouse";
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
        if (_warehouseId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerId : UQ+, NotNull, BIGINT(19), FK to m_center. (NotNull)
     * @param warehouseCd : +UQ, IX, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(Long centerId, String warehouseCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("warehouseCd");
        setCenterId(centerId);setWarehouseCd(warehouseCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of foreignFlg as the classification of ForeignFlg. <br>
     * FOREIGN_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForeignFlg} <br>
     * 外貨フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ForeignFlg getForeignFlgAsForeignFlg() {
        return CDef.ForeignFlg.codeOf(getForeignFlg());
    }

    /**
     * Set the value of foreignFlg as the classification of ForeignFlg. <br>
     * FOREIGN_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForeignFlg} <br>
     * 外貨フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setForeignFlgAsForeignFlg(CDef.ForeignFlg cdef) {
        setForeignFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
     * Set the value of foreignFlg as $0 (0). <br>
     * $0: 内貨
     */
    public void setForeignFlg_$0() {
        setForeignFlgAsForeignFlg(CDef.ForeignFlg.$0);
    }

    /**
     * Set the value of foreignFlg as $1 (1). <br>
     * $1: 外貨
     */
    public void setForeignFlg_$1() {
        setForeignFlgAsForeignFlg(CDef.ForeignFlg.$1);
    }

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
     * Is the value of foreignFlg $0? <br>
     * $0: 内貨
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isForeignFlg$0() {
        CDef.ForeignFlg cdef = getForeignFlgAsForeignFlg();
        return cdef != null ? cdef.equals(CDef.ForeignFlg.$0) : false;
    }

    /**
     * Is the value of foreignFlg $1? <br>
     * $1: 外貨
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isForeignFlg$1() {
        CDef.ForeignFlg cdef = getForeignFlgAsForeignFlg();
        return cdef != null ? cdef.equals(CDef.ForeignFlg.$1) : false;
    }

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
     * Get the value of the column 'foreignFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getForeignFlgName() {
        CDef.ForeignFlg cdef = getForeignFlgAsForeignFlg();
        return cdef != null ? cdef.name() : null;
    }

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

    /** b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    /** b_class_dtl by my FOREIGN_FLG, named 'BClassDtlByForeignFlg'. */
    protected BClassDtl _bClassDtlByForeignFlg;

    /**
     * [get] b_class_dtl by my FOREIGN_FLG, named 'BClassDtlByForeignFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByForeignFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByForeignFlg() {
        return _bClassDtlByForeignFlg;
    }

    /**
     * [set] b_class_dtl by my FOREIGN_FLG, named 'BClassDtlByForeignFlg'.
     * @param bClassDtlByForeignFlg The entity of foreign property 'BClassDtlByForeignFlg'. (NullAllowed)
     */
    public void setBClassDtlByForeignFlg(BClassDtl bClassDtlByForeignFlg) {
        _bClassDtlByForeignFlg = bClassDtlByForeignFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** m_web_ht_info by WAREHOUSE_ID, named 'MWebHtInfoList'. */
    protected List<MWebHtInfo> _mWebHtInfoList;

    /**
     * [get] m_web_ht_info by WAREHOUSE_ID, named 'MWebHtInfoList'.
     * @return The entity list of referrer property 'MWebHtInfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MWebHtInfo> getMWebHtInfoList() {
        if (_mWebHtInfoList == null) { _mWebHtInfoList = newReferrerList(); }
        return _mWebHtInfoList;
    }

    /**
     * [set] m_web_ht_info by WAREHOUSE_ID, named 'MWebHtInfoList'.
     * @param mWebHtInfoList The entity list of referrer property 'MWebHtInfoList'. (NullAllowed)
     */
    public void setMWebHtInfoList(List<MWebHtInfo> mWebHtInfoList) {
        _mWebHtInfoList = mWebHtInfoList;
    }

    /** m_zone by WAREHOUSE_ID, named 'MZoneList'. */
    protected List<MZone> _mZoneList;

    /**
     * [get] m_zone by WAREHOUSE_ID, named 'MZoneList'.
     * @return The entity list of referrer property 'MZoneList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MZone> getMZoneList() {
        if (_mZoneList == null) { _mZoneList = newReferrerList(); }
        return _mZoneList;
    }

    /**
     * [set] m_zone by WAREHOUSE_ID, named 'MZoneList'.
     * @param mZoneList The entity list of referrer property 'MZoneList'. (NullAllowed)
     */
    public void setMZoneList(List<MZone> mZoneList) {
        _mZoneList = mZoneList;
    }

    /** t_alloc_inst_b by WAREHOUSE_ID, named 'TAllocInstBList'. */
    protected List<TAllocInstB> _tAllocInstBList;

    /**
     * [get] t_alloc_inst_b by WAREHOUSE_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = newReferrerList(); }
        return _tAllocInstBList;
    }

    /**
     * [set] t_alloc_inst_b by WAREHOUSE_ID, named 'TAllocInstBList'.
     * @param tAllocInstBList The entity list of referrer property 'TAllocInstBList'. (NullAllowed)
     */
    public void setTAllocInstBList(List<TAllocInstB> tAllocInstBList) {
        _tAllocInstBList = tAllocInstBList;
    }

    /** t_inventory_b by WAREHOUSE_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] t_inventory_b by WAREHOUSE_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] t_inventory_b by WAREHOUSE_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** t_move_inst_b by WAREHOUSE_ID, named 'TMoveInstBList'. */
    protected List<TMoveInstB> _tMoveInstBList;

    /**
     * [get] t_move_inst_b by WAREHOUSE_ID, named 'TMoveInstBList'.
     * @return The entity list of referrer property 'TMoveInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = newReferrerList(); }
        return _tMoveInstBList;
    }

    /**
     * [set] t_move_inst_b by WAREHOUSE_ID, named 'TMoveInstBList'.
     * @param tMoveInstBList The entity list of referrer property 'TMoveInstBList'. (NullAllowed)
     */
    public void setTMoveInstBList(List<TMoveInstB> tMoveInstBList) {
        _tMoveInstBList = tMoveInstBList;
    }

    /** t_receive_plan_b by PLAN_WAREHOUSE_ID, named 'TReceivePlanBList'. */
    protected List<TReceivePlanB> _tReceivePlanBList;

    /**
     * [get] t_receive_plan_b by PLAN_WAREHOUSE_ID, named 'TReceivePlanBList'.
     * @return The entity list of referrer property 'TReceivePlanBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanB> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = newReferrerList(); }
        return _tReceivePlanBList;
    }

    /**
     * [set] t_receive_plan_b by PLAN_WAREHOUSE_ID, named 'TReceivePlanBList'.
     * @param tReceivePlanBList The entity list of referrer property 'TReceivePlanBList'. (NullAllowed)
     */
    public void setTReceivePlanBList(List<TReceivePlanB> tReceivePlanBList) {
        _tReceivePlanBList = tReceivePlanBList;
    }

    /** t_shipping_inst_b by WAREHOUSE_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] t_shipping_inst_b by WAREHOUSE_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] t_shipping_inst_b by WAREHOUSE_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    /** t_stock by WAREHOUSE_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] t_stock by WAREHOUSE_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] t_stock by WAREHOUSE_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    /** w_ht_inventory_input_prod by WAREHOUSE_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] w_ht_inventory_input_prod by WAREHOUSE_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] w_ht_inventory_input_prod by WAREHOUSE_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** w_ht_receive_inspection by WAREHOUSE_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] w_ht_receive_inspection by WAREHOUSE_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] w_ht_receive_inspection by WAREHOUSE_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** w_ht_receive_no_plan_insp by WAREHOUSE_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] w_ht_receive_no_plan_insp by WAREHOUSE_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by WAREHOUSE_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** w_ht_receive_store by WAREHOUSE_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] w_ht_receive_store by WAREHOUSE_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] w_ht_receive_store by WAREHOUSE_ID, named 'WHtReceiveStoreList'.
     * @param wHtReceiveStoreList The entity list of referrer property 'WHtReceiveStoreList'. (NullAllowed)
     */
    public void setWHtReceiveStoreList(List<WHtReceiveStore> wHtReceiveStoreList) {
        _wHtReceiveStoreList = wHtReceiveStoreList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMWarehouse) {
            BsMWarehouse other = (BsMWarehouse)obj;
            if (!xSV(_warehouseId, other._warehouseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _warehouseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByForeignFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByForeignFlg, "bClassDtlByForeignFlg")); }
        if (_mWebHtInfoList != null) { for (MWebHtInfo et : _mWebHtInfoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mWebHtInfoList")); } } }
        if (_mZoneList != null) { for (MZone et : _mZoneList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mZoneList")); } } }
        if (_tAllocInstBList != null) { for (TAllocInstB et : _tAllocInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstBList")); } } }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tMoveInstBList != null) { for (TMoveInstB et : _tMoveInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBList")); } } }
        if (_tReceivePlanBList != null) { for (TReceivePlanB et : _tReceivePlanBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanBList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
        if (_wHtInventoryInputProdList != null) { for (WHtInventoryInputProd et : _wHtInventoryInputProdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtInventoryInputProdList")); } } }
        if (_wHtReceiveInspectionList != null) { for (WHtReceiveInspection et : _wHtReceiveInspectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveInspectionList")); } } }
        if (_wHtReceiveNoPlanInspList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspList")); } } }
        if (_wHtReceiveStoreList != null) { for (WHtReceiveStore et : _wHtReceiveStoreList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveStoreList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseNm));
        sb.append(dm).append(xfND(_warehouseAbbr));
        sb.append(dm).append(xfND(_foreignFlg));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByForeignFlg != null)
        { sb.append(dm).append("bClassDtlByForeignFlg"); }
        if (_mWebHtInfoList != null && !_mWebHtInfoList.isEmpty())
        { sb.append(dm).append("mWebHtInfoList"); }
        if (_mZoneList != null && !_mZoneList.isEmpty())
        { sb.append(dm).append("mZoneList"); }
        if (_tAllocInstBList != null && !_tAllocInstBList.isEmpty())
        { sb.append(dm).append("tAllocInstBList"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tMoveInstBList != null && !_tMoveInstBList.isEmpty())
        { sb.append(dm).append("tMoveInstBList"); }
        if (_tReceivePlanBList != null && !_tReceivePlanBList.isEmpty())
        { sb.append(dm).append("tReceivePlanBList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
        if (_wHtInventoryInputProdList != null && !_wHtInventoryInputProdList.isEmpty())
        { sb.append(dm).append("wHtInventoryInputProdList"); }
        if (_wHtReceiveInspectionList != null && !_wHtReceiveInspectionList.isEmpty())
        { sb.append(dm).append("wHtReceiveInspectionList"); }
        if (_wHtReceiveNoPlanInspList != null && !_wHtReceiveNoPlanInspList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspList"); }
        if (_wHtReceiveStoreList != null && !_wHtReceiveStoreList.isEmpty())
        { sb.append(dm).append("wHtReceiveStoreList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MWarehouse clone() {
        return (MWarehouse)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WAREHOUSE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseId(Long warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] WAREHOUSE_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NM: {VARCHAR(60)} <br>
     * 倉庫名称
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseNm() {
        checkSpecifiedProperty("warehouseNm");
        return convertEmptyToNull(_warehouseNm);
    }

    /**
     * [set] WAREHOUSE_NM: {VARCHAR(60)} <br>
     * 倉庫名称
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseNm(String warehouseNm) {
        registerModifiedProperty("warehouseNm");
        _warehouseNm = warehouseNm;
    }

    /**
     * [get] WAREHOUSE_ABBR: {VARCHAR(60)} <br>
     * 倉庫略称
     * @return The value of the column 'WAREHOUSE_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseAbbr() {
        checkSpecifiedProperty("warehouseAbbr");
        return convertEmptyToNull(_warehouseAbbr);
    }

    /**
     * [set] WAREHOUSE_ABBR: {VARCHAR(60)} <br>
     * 倉庫略称
     * @param warehouseAbbr The value of the column 'WAREHOUSE_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseAbbr(String warehouseAbbr) {
        registerModifiedProperty("warehouseAbbr");
        _warehouseAbbr = warehouseAbbr;
    }

    /**
     * [get] FOREIGN_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForeignFlg} <br>
     * 外貨フラグ
     * @return The value of the column 'FOREIGN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForeignFlg() {
        checkSpecifiedProperty("foreignFlg");
        return convertEmptyToNull(_foreignFlg);
    }

    /**
     * [set] FOREIGN_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForeignFlg} <br>
     * 外貨フラグ
     * @param foreignFlg The value of the column 'FOREIGN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeignFlg(String foreignFlg) {
        registerModifiedProperty("foreignFlg");
        _foreignFlg = foreignFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
