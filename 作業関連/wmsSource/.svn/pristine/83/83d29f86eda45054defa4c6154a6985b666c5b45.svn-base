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
 * The entity of m_stock_type as TABLE. <br>
 * 在庫区分マスタ
 * <pre>
 * [primary-key]
 *     STOCK_TYPE_ID
 *
 * [column]
 *     STOCK_TYPE_ID, STOCK_TYPE_CD, DICT_ID, REVERSE_VALID_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_dict, v_dict, b_class_dtl(ByReverseValidFlg)
 *
 * [referrer table]
 *     h_inventory_b, h_shipping_b, h_stock, m_location, m_location_replenish_product, m_process_type, t_alloc_inst_b, t_inventory_b, t_inventory_inst, t_move_inst_b, t_receive_plan_h, t_shipping_inst_b, t_stock, t_store_record_h, w_ht_inventory_input_prod, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store
 *
 * [foreign property]
 *     bDict, vDict, bClassDtlByReverseValidFlg
 *
 * [referrer property]
 *     hInventoryBList, hShippingBList, hStockList, mLocationList, mLocationReplenishProductList, mProcessTypeList, tAllocInstBList, tInventoryBList, tInventoryInstList, tMoveInstBList, tReceivePlanHList, tShippingInstBList, tStockList, tStoreRecordHList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stockTypeId = entity.getStockTypeId();
 * String stockTypeCd = entity.getStockTypeCd();
 * Long dictId = entity.getDictId();
 * String reverseValidFlg = entity.getReverseValidFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStockTypeId(stockTypeId);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setDictId(dictId);
 * entity.setReverseValidFlg(reverseValidFlg);
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
public abstract class BsMStockType extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STOCK_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _stockTypeId;

    /** STOCK_TYPE_CD: {UQ, NotNull, VARCHAR(30)} */
    protected String _stockTypeCd;

    /** DICT_ID: {IX, NotNull, BIGINT(19), FK to b_dict} */
    protected Long _dictId;

    /** REVERSE_VALID_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ReverseValidFlg} */
    protected String _reverseValidFlg;

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
        return "m_stock_type";
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
        if (_stockTypeId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param stockTypeCd : UQ, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(String stockTypeCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("stockTypeCd");
        setStockTypeCd(stockTypeCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of reverseValidFlg as the classification of ReverseValidFlg. <br>
     * REVERSE_VALID_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ReverseValidFlg} <br>
     * 期限日出荷制限フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReverseValidFlg getReverseValidFlgAsReverseValidFlg() {
        return CDef.ReverseValidFlg.codeOf(getReverseValidFlg());
    }

    /**
     * Set the value of reverseValidFlg as the classification of ReverseValidFlg. <br>
     * REVERSE_VALID_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ReverseValidFlg} <br>
     * 期限日出荷制限フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReverseValidFlgAsReverseValidFlg(CDef.ReverseValidFlg cdef) {
        setReverseValidFlg(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of reverseValidFlg as $0 (0). <br>
     * $0: 無効
     */
    public void setReverseValidFlg_$0() {
        setReverseValidFlgAsReverseValidFlg(CDef.ReverseValidFlg.$0);
    }

    /**
     * Set the value of reverseValidFlg as $1 (1). <br>
     * $1: 有効
     */
    public void setReverseValidFlg_$1() {
        setReverseValidFlgAsReverseValidFlg(CDef.ReverseValidFlg.$1);
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
     * Is the value of reverseValidFlg $0? <br>
     * $0: 無効
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReverseValidFlg$0() {
        CDef.ReverseValidFlg cdef = getReverseValidFlgAsReverseValidFlg();
        return cdef != null ? cdef.equals(CDef.ReverseValidFlg.$0) : false;
    }

    /**
     * Is the value of reverseValidFlg $1? <br>
     * $1: 有効
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReverseValidFlg$1() {
        CDef.ReverseValidFlg cdef = getReverseValidFlgAsReverseValidFlg();
        return cdef != null ? cdef.equals(CDef.ReverseValidFlg.$1) : false;
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
     * Get the value of the column 'reverseValidFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReverseValidFlgName() {
        CDef.ReverseValidFlg cdef = getReverseValidFlgAsReverseValidFlg();
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
    /** b_dict by my DICT_ID, named 'BDict'. */
    protected BDict _bDict;

    /**
     * [get] b_dict by my DICT_ID, named 'BDict'. <br>
     * @return The entity of foreign property 'BDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BDict getBDict() {
        return _bDict;
    }

    /**
     * [set] b_dict by my DICT_ID, named 'BDict'.
     * @param bDict The entity of foreign property 'BDict'. (NullAllowed)
     */
    public void setBDict(BDict bDict) {
        _bDict = bDict;
    }

    /** v_dict by my DICT_ID, named 'VDict'. */
    protected VDict _vDict;

    /**
     * [get] v_dict by my DICT_ID, named 'VDict'. <br>
     * @return The entity of foreign property 'VDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VDict getVDict() {
        return _vDict;
    }

    /**
     * [set] v_dict by my DICT_ID, named 'VDict'.
     * @param vDict The entity of foreign property 'VDict'. (NullAllowed)
     */
    public void setVDict(VDict vDict) {
        _vDict = vDict;
    }

    /** b_class_dtl by my REVERSE_VALID_FLG, named 'BClassDtlByReverseValidFlg'. */
    protected BClassDtl _bClassDtlByReverseValidFlg;

    /**
     * [get] b_class_dtl by my REVERSE_VALID_FLG, named 'BClassDtlByReverseValidFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByReverseValidFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReverseValidFlg() {
        return _bClassDtlByReverseValidFlg;
    }

    /**
     * [set] b_class_dtl by my REVERSE_VALID_FLG, named 'BClassDtlByReverseValidFlg'.
     * @param bClassDtlByReverseValidFlg The entity of foreign property 'BClassDtlByReverseValidFlg'. (NullAllowed)
     */
    public void setBClassDtlByReverseValidFlg(BClassDtl bClassDtlByReverseValidFlg) {
        _bClassDtlByReverseValidFlg = bClassDtlByReverseValidFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** h_inventory_b by STOCK_TYPE_ID, named 'HInventoryBList'. */
    protected List<HInventoryB> _hInventoryBList;

    /**
     * [get] h_inventory_b by STOCK_TYPE_ID, named 'HInventoryBList'.
     * @return The entity list of referrer property 'HInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HInventoryB> getHInventoryBList() {
        if (_hInventoryBList == null) { _hInventoryBList = newReferrerList(); }
        return _hInventoryBList;
    }

    /**
     * [set] h_inventory_b by STOCK_TYPE_ID, named 'HInventoryBList'.
     * @param hInventoryBList The entity list of referrer property 'HInventoryBList'. (NullAllowed)
     */
    public void setHInventoryBList(List<HInventoryB> hInventoryBList) {
        _hInventoryBList = hInventoryBList;
    }

    /** h_shipping_b by STOCK_TYPE_ID, named 'HShippingBList'. */
    protected List<HShippingB> _hShippingBList;

    /**
     * [get] h_shipping_b by STOCK_TYPE_ID, named 'HShippingBList'.
     * @return The entity list of referrer property 'HShippingBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HShippingB> getHShippingBList() {
        if (_hShippingBList == null) { _hShippingBList = newReferrerList(); }
        return _hShippingBList;
    }

    /**
     * [set] h_shipping_b by STOCK_TYPE_ID, named 'HShippingBList'.
     * @param hShippingBList The entity list of referrer property 'HShippingBList'. (NullAllowed)
     */
    public void setHShippingBList(List<HShippingB> hShippingBList) {
        _hShippingBList = hShippingBList;
    }

    /** h_stock by STOCK_TYPE_ID, named 'HStockList'. */
    protected List<HStock> _hStockList;

    /**
     * [get] h_stock by STOCK_TYPE_ID, named 'HStockList'.
     * @return The entity list of referrer property 'HStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HStock> getHStockList() {
        if (_hStockList == null) { _hStockList = newReferrerList(); }
        return _hStockList;
    }

    /**
     * [set] h_stock by STOCK_TYPE_ID, named 'HStockList'.
     * @param hStockList The entity list of referrer property 'HStockList'. (NullAllowed)
     */
    public void setHStockList(List<HStock> hStockList) {
        _hStockList = hStockList;
    }

    /** m_location by REPLENISH_STOCK_TYPE_ID, named 'MLocationList'. */
    protected List<MLocation> _mLocationList;

    /**
     * [get] m_location by REPLENISH_STOCK_TYPE_ID, named 'MLocationList'.
     * @return The entity list of referrer property 'MLocationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocation> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = newReferrerList(); }
        return _mLocationList;
    }

    /**
     * [set] m_location by REPLENISH_STOCK_TYPE_ID, named 'MLocationList'.
     * @param mLocationList The entity list of referrer property 'MLocationList'. (NullAllowed)
     */
    public void setMLocationList(List<MLocation> mLocationList) {
        _mLocationList = mLocationList;
    }

    /** m_location_replenish_product by REPLENISH_STOCK_TYPE_ID, named 'MLocationReplenishProductList'. */
    protected List<MLocationReplenishProduct> _mLocationReplenishProductList;

    /**
     * [get] m_location_replenish_product by REPLENISH_STOCK_TYPE_ID, named 'MLocationReplenishProductList'.
     * @return The entity list of referrer property 'MLocationReplenishProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocationReplenishProduct> getMLocationReplenishProductList() {
        if (_mLocationReplenishProductList == null) { _mLocationReplenishProductList = newReferrerList(); }
        return _mLocationReplenishProductList;
    }

    /**
     * [set] m_location_replenish_product by REPLENISH_STOCK_TYPE_ID, named 'MLocationReplenishProductList'.
     * @param mLocationReplenishProductList The entity list of referrer property 'MLocationReplenishProductList'. (NullAllowed)
     */
    public void setMLocationReplenishProductList(List<MLocationReplenishProduct> mLocationReplenishProductList) {
        _mLocationReplenishProductList = mLocationReplenishProductList;
    }

    /** m_process_type by STOCK_TYPE_ID, named 'MProcessTypeList'. */
    protected List<MProcessType> _mProcessTypeList;

    /**
     * [get] m_process_type by STOCK_TYPE_ID, named 'MProcessTypeList'.
     * @return The entity list of referrer property 'MProcessTypeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MProcessType> getMProcessTypeList() {
        if (_mProcessTypeList == null) { _mProcessTypeList = newReferrerList(); }
        return _mProcessTypeList;
    }

    /**
     * [set] m_process_type by STOCK_TYPE_ID, named 'MProcessTypeList'.
     * @param mProcessTypeList The entity list of referrer property 'MProcessTypeList'. (NullAllowed)
     */
    public void setMProcessTypeList(List<MProcessType> mProcessTypeList) {
        _mProcessTypeList = mProcessTypeList;
    }

    /** t_alloc_inst_b by STOCK_TYPE_ID, named 'TAllocInstBList'. */
    protected List<TAllocInstB> _tAllocInstBList;

    /**
     * [get] t_alloc_inst_b by STOCK_TYPE_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = newReferrerList(); }
        return _tAllocInstBList;
    }

    /**
     * [set] t_alloc_inst_b by STOCK_TYPE_ID, named 'TAllocInstBList'.
     * @param tAllocInstBList The entity list of referrer property 'TAllocInstBList'. (NullAllowed)
     */
    public void setTAllocInstBList(List<TAllocInstB> tAllocInstBList) {
        _tAllocInstBList = tAllocInstBList;
    }

    /** t_inventory_b by STOCK_TYPE_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] t_inventory_b by STOCK_TYPE_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] t_inventory_b by STOCK_TYPE_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** t_inventory_inst by STOCK_TYPE_ID, named 'TInventoryInstList'. */
    protected List<TInventoryInst> _tInventoryInstList;

    /**
     * [get] t_inventory_inst by STOCK_TYPE_ID, named 'TInventoryInstList'.
     * @return The entity list of referrer property 'TInventoryInstList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryInst> getTInventoryInstList() {
        if (_tInventoryInstList == null) { _tInventoryInstList = newReferrerList(); }
        return _tInventoryInstList;
    }

    /**
     * [set] t_inventory_inst by STOCK_TYPE_ID, named 'TInventoryInstList'.
     * @param tInventoryInstList The entity list of referrer property 'TInventoryInstList'. (NullAllowed)
     */
    public void setTInventoryInstList(List<TInventoryInst> tInventoryInstList) {
        _tInventoryInstList = tInventoryInstList;
    }

    /** t_move_inst_b by STOCK_TYPE_ID, named 'TMoveInstBList'. */
    protected List<TMoveInstB> _tMoveInstBList;

    /**
     * [get] t_move_inst_b by STOCK_TYPE_ID, named 'TMoveInstBList'.
     * @return The entity list of referrer property 'TMoveInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = newReferrerList(); }
        return _tMoveInstBList;
    }

    /**
     * [set] t_move_inst_b by STOCK_TYPE_ID, named 'TMoveInstBList'.
     * @param tMoveInstBList The entity list of referrer property 'TMoveInstBList'. (NullAllowed)
     */
    public void setTMoveInstBList(List<TMoveInstB> tMoveInstBList) {
        _tMoveInstBList = tMoveInstBList;
    }

    /** t_receive_plan_h by STOCK_TYPE_ID, named 'TReceivePlanHList'. */
    protected List<TReceivePlanH> _tReceivePlanHList;

    /**
     * [get] t_receive_plan_h by STOCK_TYPE_ID, named 'TReceivePlanHList'.
     * @return The entity list of referrer property 'TReceivePlanHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = newReferrerList(); }
        return _tReceivePlanHList;
    }

    /**
     * [set] t_receive_plan_h by STOCK_TYPE_ID, named 'TReceivePlanHList'.
     * @param tReceivePlanHList The entity list of referrer property 'TReceivePlanHList'. (NullAllowed)
     */
    public void setTReceivePlanHList(List<TReceivePlanH> tReceivePlanHList) {
        _tReceivePlanHList = tReceivePlanHList;
    }

    /** t_shipping_inst_b by STOCK_TYPE_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] t_shipping_inst_b by STOCK_TYPE_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] t_shipping_inst_b by STOCK_TYPE_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    /** t_stock by STOCK_TYPE_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] t_stock by STOCK_TYPE_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] t_stock by STOCK_TYPE_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    /** t_store_record_h by STOCK_TYPE_ID, named 'TStoreRecordHList'. */
    protected List<TStoreRecordH> _tStoreRecordHList;

    /**
     * [get] t_store_record_h by STOCK_TYPE_ID, named 'TStoreRecordHList'.
     * @return The entity list of referrer property 'TStoreRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = newReferrerList(); }
        return _tStoreRecordHList;
    }

    /**
     * [set] t_store_record_h by STOCK_TYPE_ID, named 'TStoreRecordHList'.
     * @param tStoreRecordHList The entity list of referrer property 'TStoreRecordHList'. (NullAllowed)
     */
    public void setTStoreRecordHList(List<TStoreRecordH> tStoreRecordHList) {
        _tStoreRecordHList = tStoreRecordHList;
    }

    /** w_ht_inventory_input_prod by STOCK_TYPE_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] w_ht_inventory_input_prod by STOCK_TYPE_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] w_ht_inventory_input_prod by STOCK_TYPE_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** w_ht_receive_inspection by STOCK_TYPE_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] w_ht_receive_inspection by STOCK_TYPE_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] w_ht_receive_inspection by STOCK_TYPE_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** w_ht_receive_no_plan_insp by STOCK_TYPE_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] w_ht_receive_no_plan_insp by STOCK_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by STOCK_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** w_ht_receive_store by STOCK_TYPE_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] w_ht_receive_store by STOCK_TYPE_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] w_ht_receive_store by STOCK_TYPE_ID, named 'WHtReceiveStoreList'.
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
        if (obj instanceof BsMStockType) {
            BsMStockType other = (BsMStockType)obj;
            if (!xSV(_stockTypeId, other._stockTypeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stockTypeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_bClassDtlByReverseValidFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReverseValidFlg, "bClassDtlByReverseValidFlg")); }
        if (_hInventoryBList != null) { for (HInventoryB et : _hInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hInventoryBList")); } } }
        if (_hShippingBList != null) { for (HShippingB et : _hShippingBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hShippingBList")); } } }
        if (_hStockList != null) { for (HStock et : _hStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hStockList")); } } }
        if (_mLocationList != null) { for (MLocation et : _mLocationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationList")); } } }
        if (_mLocationReplenishProductList != null) { for (MLocationReplenishProduct et : _mLocationReplenishProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationReplenishProductList")); } } }
        if (_mProcessTypeList != null) { for (MProcessType et : _mProcessTypeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mProcessTypeList")); } } }
        if (_tAllocInstBList != null) { for (TAllocInstB et : _tAllocInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstBList")); } } }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tInventoryInstList != null) { for (TInventoryInst et : _tInventoryInstList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryInstList")); } } }
        if (_tMoveInstBList != null) { for (TMoveInstB et : _tMoveInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBList")); } } }
        if (_tReceivePlanHList != null) { for (TReceivePlanH et : _tReceivePlanHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
        if (_tStoreRecordHList != null) { for (TStoreRecordH et : _tStoreRecordHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHList")); } } }
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
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_reverseValidFlg));
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
        if (_bDict != null)
        { sb.append(dm).append("bDict"); }
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_bClassDtlByReverseValidFlg != null)
        { sb.append(dm).append("bClassDtlByReverseValidFlg"); }
        if (_hInventoryBList != null && !_hInventoryBList.isEmpty())
        { sb.append(dm).append("hInventoryBList"); }
        if (_hShippingBList != null && !_hShippingBList.isEmpty())
        { sb.append(dm).append("hShippingBList"); }
        if (_hStockList != null && !_hStockList.isEmpty())
        { sb.append(dm).append("hStockList"); }
        if (_mLocationList != null && !_mLocationList.isEmpty())
        { sb.append(dm).append("mLocationList"); }
        if (_mLocationReplenishProductList != null && !_mLocationReplenishProductList.isEmpty())
        { sb.append(dm).append("mLocationReplenishProductList"); }
        if (_mProcessTypeList != null && !_mProcessTypeList.isEmpty())
        { sb.append(dm).append("mProcessTypeList"); }
        if (_tAllocInstBList != null && !_tAllocInstBList.isEmpty())
        { sb.append(dm).append("tAllocInstBList"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tInventoryInstList != null && !_tInventoryInstList.isEmpty())
        { sb.append(dm).append("tInventoryInstList"); }
        if (_tMoveInstBList != null && !_tMoveInstBList.isEmpty())
        { sb.append(dm).append("tMoveInstBList"); }
        if (_tReceivePlanHList != null && !_tReceivePlanHList.isEmpty())
        { sb.append(dm).append("tReceivePlanHList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
        if (_tStoreRecordHList != null && !_tStoreRecordHList.isEmpty())
        { sb.append(dm).append("tStoreRecordHList"); }
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
    public MStockType clone() {
        return (MStockType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STOCK_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] STOCK_TYPE_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] DICT_ID: {IX, NotNull, BIGINT(19), FK to b_dict} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, NotNull, BIGINT(19), FK to b_dict} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
    }

    /**
     * [get] REVERSE_VALID_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ReverseValidFlg} <br>
     * 逆転防止有効フラグ
     * @return The value of the column 'REVERSE_VALID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getReverseValidFlg() {
        checkSpecifiedProperty("reverseValidFlg");
        return convertEmptyToNull(_reverseValidFlg);
    }

    /**
     * [set] REVERSE_VALID_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ReverseValidFlg} <br>
     * 逆転防止有効フラグ
     * @param reverseValidFlg The value of the column 'REVERSE_VALID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReverseValidFlg(String reverseValidFlg) {
        registerModifiedProperty("reverseValidFlg");
        _reverseValidFlg = reverseValidFlg;
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
