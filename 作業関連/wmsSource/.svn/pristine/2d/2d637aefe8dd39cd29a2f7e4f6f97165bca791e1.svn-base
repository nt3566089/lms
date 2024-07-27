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
 * The entity of m_process_type as TABLE. <br>
 * 処理区分マスタ
 * <pre>
 * [primary-key]
 *     PROCESS_TYPE_ID
 *
 * [column]
 *     PROCESS_TYPE_ID, PROCESS_TYPE_CD, DICT_ID, RECEIVE_FLG, SHIPPING_FLG, STOCK_ADJUST_FLG, DEFAULT_FLG, STOCK_TYPE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PROCESS_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_dict, m_stock_type, v_dict, b_class_dtl(ByReceiveFlg)
 *
 * [referrer table]
 *     h_move_h, h_receive_h, h_shipping_h, h_stock_inout, t_alloc_inst_h, t_move_inst_h, t_packing_h, t_picking_h, t_receive_plan_h, t_shipping_inst_h, t_stock_inout, t_store_record_h, w_ht_receive_no_plan_insp
 *
 * [foreign property]
 *     bDict, mStockType, vDict, bClassDtlByReceiveFlg, bClassDtlByShippingFlg, bClassDtlByStockAdjustFlg
 *
 * [referrer property]
 *     hMoveHList, hReceiveHList, hShippingHList, hStockInoutList, tAllocInstHList, tMoveInstHList, tPackingHList, tPickingHList, tReceivePlanHList, tShippingInstHList, tStockInoutList, tStoreRecordHList, wHtReceiveNoPlanInspList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long processTypeId = entity.getProcessTypeId();
 * String processTypeCd = entity.getProcessTypeCd();
 * Long dictId = entity.getDictId();
 * String receiveFlg = entity.getReceiveFlg();
 * String shippingFlg = entity.getShippingFlg();
 * String stockAdjustFlg = entity.getStockAdjustFlg();
 * String defaultFlg = entity.getDefaultFlg();
 * Long stockTypeId = entity.getStockTypeId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setProcessTypeId(processTypeId);
 * entity.setProcessTypeCd(processTypeCd);
 * entity.setDictId(dictId);
 * entity.setReceiveFlg(receiveFlg);
 * entity.setShippingFlg(shippingFlg);
 * entity.setStockAdjustFlg(stockAdjustFlg);
 * entity.setDefaultFlg(defaultFlg);
 * entity.setStockTypeId(stockTypeId);
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
public abstract class BsMProcessType extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PROCESS_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _processTypeId;

    /** PROCESS_TYPE_CD: {UQ, NotNull, VARCHAR(30)} */
    protected String _processTypeCd;

    /** DICT_ID: {IX, NotNull, BIGINT(19), FK to b_dict} */
    protected Long _dictId;

    /** RECEIVE_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ReceiveFlg} */
    protected String _receiveFlg;

    /** SHIPPING_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ShippingFlg} */
    protected String _shippingFlg;

    /** STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} */
    protected String _stockAdjustFlg;

    /** DEFAULT_FLG: {CHAR(1), default=[0]} */
    protected String _defaultFlg;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    protected Long _stockTypeId;

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
        return "m_process_type";
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
        if (_processTypeId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param processTypeCd : UQ, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(String processTypeCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("processTypeCd");
        setProcessTypeCd(processTypeCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of receiveFlg as the classification of ReceiveFlg. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReceiveFlg getReceiveFlgAsReceiveFlg() {
        return CDef.ReceiveFlg.codeOf(getReceiveFlg());
    }

    /**
     * Set the value of receiveFlg as the classification of ReceiveFlg. <br>
     * RECEIVE_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReceiveFlgAsReceiveFlg(CDef.ReceiveFlg cdef) {
        setReceiveFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of shippingFlg as the classification of ShippingFlg. <br>
     * SHIPPING_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingFlg getShippingFlgAsShippingFlg() {
        return CDef.ShippingFlg.codeOf(getShippingFlg());
    }

    /**
     * Set the value of shippingFlg as the classification of ShippingFlg. <br>
     * SHIPPING_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingFlgAsShippingFlg(CDef.ShippingFlg cdef) {
        setShippingFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockAdjustFlg as the classification of StockAdjustFlg. <br>
     * STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockAdjustFlg getStockAdjustFlgAsStockAdjustFlg() {
        return CDef.StockAdjustFlg.codeOf(getStockAdjustFlg());
    }

    /**
     * Set the value of stockAdjustFlg as the classification of StockAdjustFlg. <br>
     * STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockAdjustFlgAsStockAdjustFlg(CDef.StockAdjustFlg cdef) {
        setStockAdjustFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of receiveFlg as $0 (0). <br>
     * $0: 入荷対象外
     */
    public void setReceiveFlg_$0() {
        setReceiveFlgAsReceiveFlg(CDef.ReceiveFlg.$0);
    }

    /**
     * Set the value of receiveFlg as $1 (1). <br>
     * $1: 入荷対象
     */
    public void setReceiveFlg_$1() {
        setReceiveFlgAsReceiveFlg(CDef.ReceiveFlg.$1);
    }

    /**
     * Set the value of shippingFlg as $0 (0). <br>
     * $0: 出荷対象外
     */
    public void setShippingFlg_$0() {
        setShippingFlgAsShippingFlg(CDef.ShippingFlg.$0);
    }

    /**
     * Set the value of shippingFlg as $1 (1). <br>
     * $1: 出荷対象
     */
    public void setShippingFlg_$1() {
        setShippingFlgAsShippingFlg(CDef.ShippingFlg.$1);
    }

    /**
     * Set the value of stockAdjustFlg as $0 (0). <br>
     * $0: 在庫調整対象外
     */
    public void setStockAdjustFlg_$0() {
        setStockAdjustFlgAsStockAdjustFlg(CDef.StockAdjustFlg.$0);
    }

    /**
     * Set the value of stockAdjustFlg as $1 (1). <br>
     * $1: 在庫調整対象
     */
    public void setStockAdjustFlg_$1() {
        setStockAdjustFlgAsStockAdjustFlg(CDef.StockAdjustFlg.$1);
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
     * Is the value of receiveFlg $0? <br>
     * $0: 入荷対象外
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveFlg$0() {
        CDef.ReceiveFlg cdef = getReceiveFlgAsReceiveFlg();
        return cdef != null ? cdef.equals(CDef.ReceiveFlg.$0) : false;
    }

    /**
     * Is the value of receiveFlg $1? <br>
     * $1: 入荷対象
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveFlg$1() {
        CDef.ReceiveFlg cdef = getReceiveFlgAsReceiveFlg();
        return cdef != null ? cdef.equals(CDef.ReceiveFlg.$1) : false;
    }

    /**
     * Is the value of shippingFlg $0? <br>
     * $0: 出荷対象外
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingFlg$0() {
        CDef.ShippingFlg cdef = getShippingFlgAsShippingFlg();
        return cdef != null ? cdef.equals(CDef.ShippingFlg.$0) : false;
    }

    /**
     * Is the value of shippingFlg $1? <br>
     * $1: 出荷対象
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingFlg$1() {
        CDef.ShippingFlg cdef = getShippingFlgAsShippingFlg();
        return cdef != null ? cdef.equals(CDef.ShippingFlg.$1) : false;
    }

    /**
     * Is the value of stockAdjustFlg $0? <br>
     * $0: 在庫調整対象外
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockAdjustFlg$0() {
        CDef.StockAdjustFlg cdef = getStockAdjustFlgAsStockAdjustFlg();
        return cdef != null ? cdef.equals(CDef.StockAdjustFlg.$0) : false;
    }

    /**
     * Is the value of stockAdjustFlg $1? <br>
     * $1: 在庫調整対象
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockAdjustFlg$1() {
        CDef.StockAdjustFlg cdef = getStockAdjustFlgAsStockAdjustFlg();
        return cdef != null ? cdef.equals(CDef.StockAdjustFlg.$1) : false;
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
     * Get the value of the column 'receiveFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReceiveFlgName() {
        CDef.ReceiveFlg cdef = getReceiveFlgAsReceiveFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'shippingFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingFlgName() {
        CDef.ShippingFlg cdef = getShippingFlgAsShippingFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockAdjustFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockAdjustFlgName() {
        CDef.StockAdjustFlg cdef = getStockAdjustFlgAsStockAdjustFlg();
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

    /** b_class_dtl by my RECEIVE_FLG, named 'BClassDtlByReceiveFlg'. */
    protected BClassDtl _bClassDtlByReceiveFlg;

    /**
     * [get] b_class_dtl by my RECEIVE_FLG, named 'BClassDtlByReceiveFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByReceiveFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReceiveFlg() {
        return _bClassDtlByReceiveFlg;
    }

    /**
     * [set] b_class_dtl by my RECEIVE_FLG, named 'BClassDtlByReceiveFlg'.
     * @param bClassDtlByReceiveFlg The entity of foreign property 'BClassDtlByReceiveFlg'. (NullAllowed)
     */
    public void setBClassDtlByReceiveFlg(BClassDtl bClassDtlByReceiveFlg) {
        _bClassDtlByReceiveFlg = bClassDtlByReceiveFlg;
    }

    /** b_class_dtl by my SHIPPING_FLG, named 'BClassDtlByShippingFlg'. */
    protected BClassDtl _bClassDtlByShippingFlg;

    /**
     * [get] b_class_dtl by my SHIPPING_FLG, named 'BClassDtlByShippingFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByShippingFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByShippingFlg() {
        return _bClassDtlByShippingFlg;
    }

    /**
     * [set] b_class_dtl by my SHIPPING_FLG, named 'BClassDtlByShippingFlg'.
     * @param bClassDtlByShippingFlg The entity of foreign property 'BClassDtlByShippingFlg'. (NullAllowed)
     */
    public void setBClassDtlByShippingFlg(BClassDtl bClassDtlByShippingFlg) {
        _bClassDtlByShippingFlg = bClassDtlByShippingFlg;
    }

    /** b_class_dtl by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'. */
    protected BClassDtl _bClassDtlByStockAdjustFlg;

    /**
     * [get] b_class_dtl by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockAdjustFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockAdjustFlg() {
        return _bClassDtlByStockAdjustFlg;
    }

    /**
     * [set] b_class_dtl by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @param bClassDtlByStockAdjustFlg The entity of foreign property 'BClassDtlByStockAdjustFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockAdjustFlg(BClassDtl bClassDtlByStockAdjustFlg) {
        _bClassDtlByStockAdjustFlg = bClassDtlByStockAdjustFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** h_move_h by PROCESS_TYPE_ID, named 'HMoveHList'. */
    protected List<HMoveH> _hMoveHList;

    /**
     * [get] h_move_h by PROCESS_TYPE_ID, named 'HMoveHList'.
     * @return The entity list of referrer property 'HMoveHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HMoveH> getHMoveHList() {
        if (_hMoveHList == null) { _hMoveHList = newReferrerList(); }
        return _hMoveHList;
    }

    /**
     * [set] h_move_h by PROCESS_TYPE_ID, named 'HMoveHList'.
     * @param hMoveHList The entity list of referrer property 'HMoveHList'. (NullAllowed)
     */
    public void setHMoveHList(List<HMoveH> hMoveHList) {
        _hMoveHList = hMoveHList;
    }

    /** h_receive_h by PROCESS_TYPE_ID, named 'HReceiveHList'. */
    protected List<HReceiveH> _hReceiveHList;

    /**
     * [get] h_receive_h by PROCESS_TYPE_ID, named 'HReceiveHList'.
     * @return The entity list of referrer property 'HReceiveHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HReceiveH> getHReceiveHList() {
        if (_hReceiveHList == null) { _hReceiveHList = newReferrerList(); }
        return _hReceiveHList;
    }

    /**
     * [set] h_receive_h by PROCESS_TYPE_ID, named 'HReceiveHList'.
     * @param hReceiveHList The entity list of referrer property 'HReceiveHList'. (NullAllowed)
     */
    public void setHReceiveHList(List<HReceiveH> hReceiveHList) {
        _hReceiveHList = hReceiveHList;
    }

    /** h_shipping_h by PROCESS_TYPE_ID, named 'HShippingHList'. */
    protected List<HShippingH> _hShippingHList;

    /**
     * [get] h_shipping_h by PROCESS_TYPE_ID, named 'HShippingHList'.
     * @return The entity list of referrer property 'HShippingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HShippingH> getHShippingHList() {
        if (_hShippingHList == null) { _hShippingHList = newReferrerList(); }
        return _hShippingHList;
    }

    /**
     * [set] h_shipping_h by PROCESS_TYPE_ID, named 'HShippingHList'.
     * @param hShippingHList The entity list of referrer property 'HShippingHList'. (NullAllowed)
     */
    public void setHShippingHList(List<HShippingH> hShippingHList) {
        _hShippingHList = hShippingHList;
    }

    /** h_stock_inout by PROCESS_TYPE_ID, named 'HStockInoutList'. */
    protected List<HStockInout> _hStockInoutList;

    /**
     * [get] h_stock_inout by PROCESS_TYPE_ID, named 'HStockInoutList'.
     * @return The entity list of referrer property 'HStockInoutList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HStockInout> getHStockInoutList() {
        if (_hStockInoutList == null) { _hStockInoutList = newReferrerList(); }
        return _hStockInoutList;
    }

    /**
     * [set] h_stock_inout by PROCESS_TYPE_ID, named 'HStockInoutList'.
     * @param hStockInoutList The entity list of referrer property 'HStockInoutList'. (NullAllowed)
     */
    public void setHStockInoutList(List<HStockInout> hStockInoutList) {
        _hStockInoutList = hStockInoutList;
    }

    /** t_alloc_inst_h by PROCESS_TYPE_ID, named 'TAllocInstHList'. */
    protected List<TAllocInstH> _tAllocInstHList;

    /**
     * [get] t_alloc_inst_h by PROCESS_TYPE_ID, named 'TAllocInstHList'.
     * @return The entity list of referrer property 'TAllocInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = newReferrerList(); }
        return _tAllocInstHList;
    }

    /**
     * [set] t_alloc_inst_h by PROCESS_TYPE_ID, named 'TAllocInstHList'.
     * @param tAllocInstHList The entity list of referrer property 'TAllocInstHList'. (NullAllowed)
     */
    public void setTAllocInstHList(List<TAllocInstH> tAllocInstHList) {
        _tAllocInstHList = tAllocInstHList;
    }

    /** t_move_inst_h by PROCESS_TYPE_ID, named 'TMoveInstHList'. */
    protected List<TMoveInstH> _tMoveInstHList;

    /**
     * [get] t_move_inst_h by PROCESS_TYPE_ID, named 'TMoveInstHList'.
     * @return The entity list of referrer property 'TMoveInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstH> getTMoveInstHList() {
        if (_tMoveInstHList == null) { _tMoveInstHList = newReferrerList(); }
        return _tMoveInstHList;
    }

    /**
     * [set] t_move_inst_h by PROCESS_TYPE_ID, named 'TMoveInstHList'.
     * @param tMoveInstHList The entity list of referrer property 'TMoveInstHList'. (NullAllowed)
     */
    public void setTMoveInstHList(List<TMoveInstH> tMoveInstHList) {
        _tMoveInstHList = tMoveInstHList;
    }

    /** t_packing_h by PROCESS_TYPE_ID, named 'TPackingHList'. */
    protected List<TPackingH> _tPackingHList;

    /**
     * [get] t_packing_h by PROCESS_TYPE_ID, named 'TPackingHList'.
     * @return The entity list of referrer property 'TPackingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = newReferrerList(); }
        return _tPackingHList;
    }

    /**
     * [set] t_packing_h by PROCESS_TYPE_ID, named 'TPackingHList'.
     * @param tPackingHList The entity list of referrer property 'TPackingHList'. (NullAllowed)
     */
    public void setTPackingHList(List<TPackingH> tPackingHList) {
        _tPackingHList = tPackingHList;
    }

    /** t_picking_h by PROCESS_TYPE_ID, named 'TPickingHList'. */
    protected List<TPickingH> _tPickingHList;

    /**
     * [get] t_picking_h by PROCESS_TYPE_ID, named 'TPickingHList'.
     * @return The entity list of referrer property 'TPickingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingH> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = newReferrerList(); }
        return _tPickingHList;
    }

    /**
     * [set] t_picking_h by PROCESS_TYPE_ID, named 'TPickingHList'.
     * @param tPickingHList The entity list of referrer property 'TPickingHList'. (NullAllowed)
     */
    public void setTPickingHList(List<TPickingH> tPickingHList) {
        _tPickingHList = tPickingHList;
    }

    /** t_receive_plan_h by PROCESS_TYPE_ID, named 'TReceivePlanHList'. */
    protected List<TReceivePlanH> _tReceivePlanHList;

    /**
     * [get] t_receive_plan_h by PROCESS_TYPE_ID, named 'TReceivePlanHList'.
     * @return The entity list of referrer property 'TReceivePlanHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = newReferrerList(); }
        return _tReceivePlanHList;
    }

    /**
     * [set] t_receive_plan_h by PROCESS_TYPE_ID, named 'TReceivePlanHList'.
     * @param tReceivePlanHList The entity list of referrer property 'TReceivePlanHList'. (NullAllowed)
     */
    public void setTReceivePlanHList(List<TReceivePlanH> tReceivePlanHList) {
        _tReceivePlanHList = tReceivePlanHList;
    }

    /** t_shipping_inst_h by PROCESS_TYPE_ID, named 'TShippingInstHList'. */
    protected List<TShippingInstH> _tShippingInstHList;

    /**
     * [get] t_shipping_inst_h by PROCESS_TYPE_ID, named 'TShippingInstHList'.
     * @return The entity list of referrer property 'TShippingInstHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = newReferrerList(); }
        return _tShippingInstHList;
    }

    /**
     * [set] t_shipping_inst_h by PROCESS_TYPE_ID, named 'TShippingInstHList'.
     * @param tShippingInstHList The entity list of referrer property 'TShippingInstHList'. (NullAllowed)
     */
    public void setTShippingInstHList(List<TShippingInstH> tShippingInstHList) {
        _tShippingInstHList = tShippingInstHList;
    }

    /** t_stock_inout by PROCESS_TYPE_ID, named 'TStockInoutList'. */
    protected List<TStockInout> _tStockInoutList;

    /**
     * [get] t_stock_inout by PROCESS_TYPE_ID, named 'TStockInoutList'.
     * @return The entity list of referrer property 'TStockInoutList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStockInout> getTStockInoutList() {
        if (_tStockInoutList == null) { _tStockInoutList = newReferrerList(); }
        return _tStockInoutList;
    }

    /**
     * [set] t_stock_inout by PROCESS_TYPE_ID, named 'TStockInoutList'.
     * @param tStockInoutList The entity list of referrer property 'TStockInoutList'. (NullAllowed)
     */
    public void setTStockInoutList(List<TStockInout> tStockInoutList) {
        _tStockInoutList = tStockInoutList;
    }

    /** t_store_record_h by PROCESS_TYPE_ID, named 'TStoreRecordHList'. */
    protected List<TStoreRecordH> _tStoreRecordHList;

    /**
     * [get] t_store_record_h by PROCESS_TYPE_ID, named 'TStoreRecordHList'.
     * @return The entity list of referrer property 'TStoreRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = newReferrerList(); }
        return _tStoreRecordHList;
    }

    /**
     * [set] t_store_record_h by PROCESS_TYPE_ID, named 'TStoreRecordHList'.
     * @param tStoreRecordHList The entity list of referrer property 'TStoreRecordHList'. (NullAllowed)
     */
    public void setTStoreRecordHList(List<TStoreRecordH> tStoreRecordHList) {
        _tStoreRecordHList = tStoreRecordHList;
    }

    /** w_ht_receive_no_plan_insp by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] w_ht_receive_no_plan_insp by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by PROCESS_TYPE_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMProcessType) {
            BsMProcessType other = (BsMProcessType)obj;
            if (!xSV(_processTypeId, other._processTypeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _processTypeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_bClassDtlByReceiveFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReceiveFlg, "bClassDtlByReceiveFlg")); }
        if (_bClassDtlByShippingFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByShippingFlg, "bClassDtlByShippingFlg")); }
        if (_bClassDtlByStockAdjustFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockAdjustFlg, "bClassDtlByStockAdjustFlg")); }
        if (_hMoveHList != null) { for (HMoveH et : _hMoveHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hMoveHList")); } } }
        if (_hReceiveHList != null) { for (HReceiveH et : _hReceiveHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hReceiveHList")); } } }
        if (_hShippingHList != null) { for (HShippingH et : _hShippingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hShippingHList")); } } }
        if (_hStockInoutList != null) { for (HStockInout et : _hStockInoutList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hStockInoutList")); } } }
        if (_tAllocInstHList != null) { for (TAllocInstH et : _tAllocInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstHList")); } } }
        if (_tMoveInstHList != null) { for (TMoveInstH et : _tMoveInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstHList")); } } }
        if (_tPackingHList != null) { for (TPackingH et : _tPackingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingHList")); } } }
        if (_tPickingHList != null) { for (TPickingH et : _tPickingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingHList")); } } }
        if (_tReceivePlanHList != null) { for (TReceivePlanH et : _tReceivePlanHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHList")); } } }
        if (_tShippingInstHList != null) { for (TShippingInstH et : _tShippingInstHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHList")); } } }
        if (_tStockInoutList != null) { for (TStockInout et : _tStockInoutList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockInoutList")); } } }
        if (_tStoreRecordHList != null) { for (TStoreRecordH et : _tStoreRecordHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHList")); } } }
        if (_wHtReceiveNoPlanInspList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_processTypeCd));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_receiveFlg));
        sb.append(dm).append(xfND(_shippingFlg));
        sb.append(dm).append(xfND(_stockAdjustFlg));
        sb.append(dm).append(xfND(_defaultFlg));
        sb.append(dm).append(xfND(_stockTypeId));
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
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_bClassDtlByReceiveFlg != null)
        { sb.append(dm).append("bClassDtlByReceiveFlg"); }
        if (_bClassDtlByShippingFlg != null)
        { sb.append(dm).append("bClassDtlByShippingFlg"); }
        if (_bClassDtlByStockAdjustFlg != null)
        { sb.append(dm).append("bClassDtlByStockAdjustFlg"); }
        if (_hMoveHList != null && !_hMoveHList.isEmpty())
        { sb.append(dm).append("hMoveHList"); }
        if (_hReceiveHList != null && !_hReceiveHList.isEmpty())
        { sb.append(dm).append("hReceiveHList"); }
        if (_hShippingHList != null && !_hShippingHList.isEmpty())
        { sb.append(dm).append("hShippingHList"); }
        if (_hStockInoutList != null && !_hStockInoutList.isEmpty())
        { sb.append(dm).append("hStockInoutList"); }
        if (_tAllocInstHList != null && !_tAllocInstHList.isEmpty())
        { sb.append(dm).append("tAllocInstHList"); }
        if (_tMoveInstHList != null && !_tMoveInstHList.isEmpty())
        { sb.append(dm).append("tMoveInstHList"); }
        if (_tPackingHList != null && !_tPackingHList.isEmpty())
        { sb.append(dm).append("tPackingHList"); }
        if (_tPickingHList != null && !_tPickingHList.isEmpty())
        { sb.append(dm).append("tPickingHList"); }
        if (_tReceivePlanHList != null && !_tReceivePlanHList.isEmpty())
        { sb.append(dm).append("tReceivePlanHList"); }
        if (_tShippingInstHList != null && !_tShippingInstHList.isEmpty())
        { sb.append(dm).append("tShippingInstHList"); }
        if (_tStockInoutList != null && !_tStockInoutList.isEmpty())
        { sb.append(dm).append("tStockInoutList"); }
        if (_tStoreRecordHList != null && !_tStoreRecordHList.isEmpty())
        { sb.append(dm).append("tStoreRecordHList"); }
        if (_wHtReceiveNoPlanInspList != null && !_wHtReceiveNoPlanInspList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MProcessType clone() {
        return (MProcessType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PROCESS_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProcessTypeId() {
        checkSpecifiedProperty("processTypeId");
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProcessTypeId(Long processTypeId) {
        registerModifiedProperty("processTypeId");
        _processTypeId = processTypeId;
    }

    /**
     * [get] PROCESS_TYPE_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 処理区分CD
     * @return The value of the column 'PROCESS_TYPE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProcessTypeCd() {
        checkSpecifiedProperty("processTypeCd");
        return convertEmptyToNull(_processTypeCd);
    }

    /**
     * [set] PROCESS_TYPE_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 処理区分CD
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProcessTypeCd(String processTypeCd) {
        registerModifiedProperty("processTypeCd");
        _processTypeCd = processTypeCd;
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
     * [get] RECEIVE_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @return The value of the column 'RECEIVE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveFlg() {
        checkSpecifiedProperty("receiveFlg");
        return convertEmptyToNull(_receiveFlg);
    }

    /**
     * [set] RECEIVE_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @param receiveFlg The value of the column 'RECEIVE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveFlg(String receiveFlg) {
        registerModifiedProperty("receiveFlg");
        _receiveFlg = receiveFlg;
    }

    /**
     * [get] SHIPPING_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @return The value of the column 'SHIPPING_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getShippingFlg() {
        checkSpecifiedProperty("shippingFlg");
        return convertEmptyToNull(_shippingFlg);
    }

    /**
     * [set] SHIPPING_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @param shippingFlg The value of the column 'SHIPPING_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setShippingFlg(String shippingFlg) {
        registerModifiedProperty("shippingFlg");
        _shippingFlg = shippingFlg;
    }

    /**
     * [get] STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @return The value of the column 'STOCK_ADJUST_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getStockAdjustFlg() {
        checkSpecifiedProperty("stockAdjustFlg");
        return convertEmptyToNull(_stockAdjustFlg);
    }

    /**
     * [set] STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @param stockAdjustFlg The value of the column 'STOCK_ADJUST_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setStockAdjustFlg(String stockAdjustFlg) {
        registerModifiedProperty("stockAdjustFlg");
        _stockAdjustFlg = stockAdjustFlg;
    }

    /**
     * [get] DEFAULT_FLG: {CHAR(1), default=[0]} <br>
     * デフォルトフラグ
     * @return The value of the column 'DEFAULT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDefaultFlg() {
        checkSpecifiedProperty("defaultFlg");
        return convertEmptyToNull(_defaultFlg);
    }

    /**
     * [set] DEFAULT_FLG: {CHAR(1), default=[0]} <br>
     * デフォルトフラグ
     * @param defaultFlg The value of the column 'DEFAULT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDefaultFlg(String defaultFlg) {
        registerModifiedProperty("defaultFlg");
        _defaultFlg = defaultFlg;
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
