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
 * The entity of t_inventory_r as TABLE. <br>
 * 棚卸帳票
 * <pre>
 * [primary-key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, TWL_OUT_FLG, TWL_OUT_USER_ID, TWL_OUT_DT, INVENTORY_DIFF_OUT_FLG, INVENTORY_DIFF_OUT_USER_ID, INVENTORY_DIFF_OUT_DT, INVENTORY_RECORD_OUT_FLG, INVENTORY_RECORD_OUT_USER_ID, INVENTORY_RECORD_OUT_DT, INVENTORY_RECORD_LOC_OUT_FLG, INVENTORY_RECORD_LOC_OUT_USER_ID, INVENTORY_RECORD_LOC_OUT_DT, STOCK_DIFF_OUT_FLG, STOCK_DIFF_OUT_USER_ID, STOCK_DIFF_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     b_user, t_inventory_b, b_class_dtl(ByTwlOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUserByInventoryRecordLocOutUserId, bUserByStockDiffOutUserId, bUserByTwlOutUserId, bUserByInventoryRecordOutUserId, tInventoryB, bUserByInventoryDiffOutUserId, bClassDtlByTwlOutFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long inventoryBId = entity.getInventoryBId();
 * String twlOutFlg = entity.getTwlOutFlg();
 * Long twlOutUserId = entity.getTwlOutUserId();
 * java.sql.Timestamp twlOutDt = entity.getTwlOutDt();
 * String inventoryDiffOutFlg = entity.getInventoryDiffOutFlg();
 * Long inventoryDiffOutUserId = entity.getInventoryDiffOutUserId();
 * java.sql.Timestamp inventoryDiffOutDt = entity.getInventoryDiffOutDt();
 * String inventoryRecordOutFlg = entity.getInventoryRecordOutFlg();
 * Long inventoryRecordOutUserId = entity.getInventoryRecordOutUserId();
 * java.sql.Timestamp inventoryRecordOutDt = entity.getInventoryRecordOutDt();
 * String inventoryRecordLocOutFlg = entity.getInventoryRecordLocOutFlg();
 * Long inventoryRecordLocOutUserId = entity.getInventoryRecordLocOutUserId();
 * java.sql.Timestamp inventoryRecordLocOutDt = entity.getInventoryRecordLocOutDt();
 * String stockDiffOutFlg = entity.getStockDiffOutFlg();
 * Long stockDiffOutUserId = entity.getStockDiffOutUserId();
 * java.sql.Timestamp stockDiffOutDt = entity.getStockDiffOutDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setInventoryBId(inventoryBId);
 * entity.setTwlOutFlg(twlOutFlg);
 * entity.setTwlOutUserId(twlOutUserId);
 * entity.setTwlOutDt(twlOutDt);
 * entity.setInventoryDiffOutFlg(inventoryDiffOutFlg);
 * entity.setInventoryDiffOutUserId(inventoryDiffOutUserId);
 * entity.setInventoryDiffOutDt(inventoryDiffOutDt);
 * entity.setInventoryRecordOutFlg(inventoryRecordOutFlg);
 * entity.setInventoryRecordOutUserId(inventoryRecordOutUserId);
 * entity.setInventoryRecordOutDt(inventoryRecordOutDt);
 * entity.setInventoryRecordLocOutFlg(inventoryRecordLocOutFlg);
 * entity.setInventoryRecordLocOutUserId(inventoryRecordLocOutUserId);
 * entity.setInventoryRecordLocOutDt(inventoryRecordLocOutDt);
 * entity.setStockDiffOutFlg(stockDiffOutFlg);
 * entity.setStockDiffOutUserId(stockDiffOutUserId);
 * entity.setStockDiffOutDt(stockDiffOutDt);
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
public abstract class BsTInventoryR extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b} */
    protected Long _inventoryBId;

    /** TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _twlOutFlg;

    /** TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _twlOutUserId;

    /** TWL_OUT_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _twlOutDt;

    /** INVENTORY_DIFF_OUT_FLG: {CHAR(1)} */
    protected String _inventoryDiffOutFlg;

    /** INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _inventoryDiffOutUserId;

    /** INVENTORY_DIFF_OUT_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _inventoryDiffOutDt;

    /** INVENTORY_RECORD_OUT_FLG: {CHAR(1)} */
    protected String _inventoryRecordOutFlg;

    /** INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _inventoryRecordOutUserId;

    /** INVENTORY_RECORD_OUT_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _inventoryRecordOutDt;

    /** INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)} */
    protected String _inventoryRecordLocOutFlg;

    /** INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _inventoryRecordLocOutUserId;

    /** INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _inventoryRecordLocOutDt;

    /** STOCK_DIFF_OUT_FLG: {CHAR(1)} */
    protected String _stockDiffOutFlg;

    /** STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _stockDiffOutUserId;

    /** STOCK_DIFF_OUT_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _stockDiffOutDt;

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
        return "t_inventory_r";
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
        if (_inventoryBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of twlOutFlg as the classification of ListOutFlg. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getTwlOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getTwlOutFlg());
    }

    /**
     * Set the value of twlOutFlg as the classification of ListOutFlg. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTwlOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setTwlOutFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of twlOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setTwlOutFlg_$0() {
        setTwlOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of twlOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setTwlOutFlg_$1() {
        setTwlOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
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
     * Is the value of twlOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTwlOutFlg$0() {
        CDef.ListOutFlg cdef = getTwlOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of twlOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTwlOutFlg$1() {
        CDef.ListOutFlg cdef = getTwlOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
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
     * Get the value of the column 'twlOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTwlOutFlgName() {
        CDef.ListOutFlg cdef = getTwlOutFlgAsListOutFlg();
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
    /** b_user by my INVENTORY_RECORD_LOC_OUT_USER_ID, named 'BUserByInventoryRecordLocOutUserId'. */
    protected BUser _bUserByInventoryRecordLocOutUserId;

    /**
     * [get] b_user by my INVENTORY_RECORD_LOC_OUT_USER_ID, named 'BUserByInventoryRecordLocOutUserId'. <br>
     * @return The entity of foreign property 'BUserByInventoryRecordLocOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByInventoryRecordLocOutUserId() {
        return _bUserByInventoryRecordLocOutUserId;
    }

    /**
     * [set] b_user by my INVENTORY_RECORD_LOC_OUT_USER_ID, named 'BUserByInventoryRecordLocOutUserId'.
     * @param bUserByInventoryRecordLocOutUserId The entity of foreign property 'BUserByInventoryRecordLocOutUserId'. (NullAllowed)
     */
    public void setBUserByInventoryRecordLocOutUserId(BUser bUserByInventoryRecordLocOutUserId) {
        _bUserByInventoryRecordLocOutUserId = bUserByInventoryRecordLocOutUserId;
    }

    /** b_user by my STOCK_DIFF_OUT_USER_ID, named 'BUserByStockDiffOutUserId'. */
    protected BUser _bUserByStockDiffOutUserId;

    /**
     * [get] b_user by my STOCK_DIFF_OUT_USER_ID, named 'BUserByStockDiffOutUserId'. <br>
     * @return The entity of foreign property 'BUserByStockDiffOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByStockDiffOutUserId() {
        return _bUserByStockDiffOutUserId;
    }

    /**
     * [set] b_user by my STOCK_DIFF_OUT_USER_ID, named 'BUserByStockDiffOutUserId'.
     * @param bUserByStockDiffOutUserId The entity of foreign property 'BUserByStockDiffOutUserId'. (NullAllowed)
     */
    public void setBUserByStockDiffOutUserId(BUser bUserByStockDiffOutUserId) {
        _bUserByStockDiffOutUserId = bUserByStockDiffOutUserId;
    }

    /** b_user by my TWL_OUT_USER_ID, named 'BUserByTwlOutUserId'. */
    protected BUser _bUserByTwlOutUserId;

    /**
     * [get] b_user by my TWL_OUT_USER_ID, named 'BUserByTwlOutUserId'. <br>
     * @return The entity of foreign property 'BUserByTwlOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByTwlOutUserId() {
        return _bUserByTwlOutUserId;
    }

    /**
     * [set] b_user by my TWL_OUT_USER_ID, named 'BUserByTwlOutUserId'.
     * @param bUserByTwlOutUserId The entity of foreign property 'BUserByTwlOutUserId'. (NullAllowed)
     */
    public void setBUserByTwlOutUserId(BUser bUserByTwlOutUserId) {
        _bUserByTwlOutUserId = bUserByTwlOutUserId;
    }

    /** b_user by my INVENTORY_RECORD_OUT_USER_ID, named 'BUserByInventoryRecordOutUserId'. */
    protected BUser _bUserByInventoryRecordOutUserId;

    /**
     * [get] b_user by my INVENTORY_RECORD_OUT_USER_ID, named 'BUserByInventoryRecordOutUserId'. <br>
     * @return The entity of foreign property 'BUserByInventoryRecordOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByInventoryRecordOutUserId() {
        return _bUserByInventoryRecordOutUserId;
    }

    /**
     * [set] b_user by my INVENTORY_RECORD_OUT_USER_ID, named 'BUserByInventoryRecordOutUserId'.
     * @param bUserByInventoryRecordOutUserId The entity of foreign property 'BUserByInventoryRecordOutUserId'. (NullAllowed)
     */
    public void setBUserByInventoryRecordOutUserId(BUser bUserByInventoryRecordOutUserId) {
        _bUserByInventoryRecordOutUserId = bUserByInventoryRecordOutUserId;
    }

    /** t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'. */
    protected TInventoryB _tInventoryB;

    /**
     * [get] t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'. <br>
     * @return The entity of foreign property 'TInventoryB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TInventoryB getTInventoryB() {
        return _tInventoryB;
    }

    /**
     * [set] t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'.
     * @param tInventoryB The entity of foreign property 'TInventoryB'. (NullAllowed)
     */
    public void setTInventoryB(TInventoryB tInventoryB) {
        _tInventoryB = tInventoryB;
    }

    /** b_user by my INVENTORY_DIFF_OUT_USER_ID, named 'BUserByInventoryDiffOutUserId'. */
    protected BUser _bUserByInventoryDiffOutUserId;

    /**
     * [get] b_user by my INVENTORY_DIFF_OUT_USER_ID, named 'BUserByInventoryDiffOutUserId'. <br>
     * @return The entity of foreign property 'BUserByInventoryDiffOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByInventoryDiffOutUserId() {
        return _bUserByInventoryDiffOutUserId;
    }

    /**
     * [set] b_user by my INVENTORY_DIFF_OUT_USER_ID, named 'BUserByInventoryDiffOutUserId'.
     * @param bUserByInventoryDiffOutUserId The entity of foreign property 'BUserByInventoryDiffOutUserId'. (NullAllowed)
     */
    public void setBUserByInventoryDiffOutUserId(BUser bUserByInventoryDiffOutUserId) {
        _bUserByInventoryDiffOutUserId = bUserByInventoryDiffOutUserId;
    }

    /** b_class_dtl by my TWL_OUT_FLG, named 'BClassDtlByTwlOutFlg'. */
    protected BClassDtl _bClassDtlByTwlOutFlg;

    /**
     * [get] b_class_dtl by my TWL_OUT_FLG, named 'BClassDtlByTwlOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByTwlOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByTwlOutFlg() {
        return _bClassDtlByTwlOutFlg;
    }

    /**
     * [set] b_class_dtl by my TWL_OUT_FLG, named 'BClassDtlByTwlOutFlg'.
     * @param bClassDtlByTwlOutFlg The entity of foreign property 'BClassDtlByTwlOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByTwlOutFlg(BClassDtl bClassDtlByTwlOutFlg) {
        _bClassDtlByTwlOutFlg = bClassDtlByTwlOutFlg;
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
        if (obj instanceof BsTInventoryR) {
            BsTInventoryR other = (BsTInventoryR)obj;
            if (!xSV(_inventoryBId, other._inventoryBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bUserByInventoryRecordLocOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByInventoryRecordLocOutUserId, "bUserByInventoryRecordLocOutUserId")); }
        if (_bUserByStockDiffOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByStockDiffOutUserId, "bUserByStockDiffOutUserId")); }
        if (_bUserByTwlOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByTwlOutUserId, "bUserByTwlOutUserId")); }
        if (_bUserByInventoryRecordOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByInventoryRecordOutUserId, "bUserByInventoryRecordOutUserId")); }
        if (_tInventoryB != null)
        { sb.append(li).append(xbRDS(_tInventoryB, "tInventoryB")); }
        if (_bUserByInventoryDiffOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByInventoryDiffOutUserId, "bUserByInventoryDiffOutUserId")); }
        if (_bClassDtlByTwlOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTwlOutFlg, "bClassDtlByTwlOutFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_twlOutFlg));
        sb.append(dm).append(xfND(_twlOutUserId));
        sb.append(dm).append(xfND(_twlOutDt));
        sb.append(dm).append(xfND(_inventoryDiffOutFlg));
        sb.append(dm).append(xfND(_inventoryDiffOutUserId));
        sb.append(dm).append(xfND(_inventoryDiffOutDt));
        sb.append(dm).append(xfND(_inventoryRecordOutFlg));
        sb.append(dm).append(xfND(_inventoryRecordOutUserId));
        sb.append(dm).append(xfND(_inventoryRecordOutDt));
        sb.append(dm).append(xfND(_inventoryRecordLocOutFlg));
        sb.append(dm).append(xfND(_inventoryRecordLocOutUserId));
        sb.append(dm).append(xfND(_inventoryRecordLocOutDt));
        sb.append(dm).append(xfND(_stockDiffOutFlg));
        sb.append(dm).append(xfND(_stockDiffOutUserId));
        sb.append(dm).append(xfND(_stockDiffOutDt));
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
        if (_bUserByInventoryRecordLocOutUserId != null)
        { sb.append(dm).append("bUserByInventoryRecordLocOutUserId"); }
        if (_bUserByStockDiffOutUserId != null)
        { sb.append(dm).append("bUserByStockDiffOutUserId"); }
        if (_bUserByTwlOutUserId != null)
        { sb.append(dm).append("bUserByTwlOutUserId"); }
        if (_bUserByInventoryRecordOutUserId != null)
        { sb.append(dm).append("bUserByInventoryRecordOutUserId"); }
        if (_tInventoryB != null)
        { sb.append(dm).append("tInventoryB"); }
        if (_bUserByInventoryDiffOutUserId != null)
        { sb.append(dm).append("bUserByInventoryDiffOutUserId"); }
        if (_bClassDtlByTwlOutFlg != null)
        { sb.append(dm).append("bClassDtlByTwlOutFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TInventoryR clone() {
        return (TInventoryR)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 棚卸作業リスト出力フラグ
     * @return The value of the column 'TWL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTwlOutFlg() {
        checkSpecifiedProperty("twlOutFlg");
        return convertEmptyToNull(_twlOutFlg);
    }

    /**
     * [set] TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 棚卸作業リスト出力フラグ
     * @param twlOutFlg The value of the column 'TWL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTwlOutFlg(String twlOutFlg) {
        registerModifiedProperty("twlOutFlg");
        _twlOutFlg = twlOutFlg;
    }

    /**
     * [get] TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸作業リスト出力者ID
     * @return The value of the column 'TWL_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTwlOutUserId() {
        checkSpecifiedProperty("twlOutUserId");
        return _twlOutUserId;
    }

    /**
     * [set] TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸作業リスト出力者ID
     * @param twlOutUserId The value of the column 'TWL_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTwlOutUserId(Long twlOutUserId) {
        registerModifiedProperty("twlOutUserId");
        _twlOutUserId = twlOutUserId;
    }

    /**
     * [get] TWL_OUT_DT: {DATETIME(19)} <br>
     * 棚卸作業リスト出力日時
     * @return The value of the column 'TWL_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTwlOutDt() {
        checkSpecifiedProperty("twlOutDt");
        return _twlOutDt;
    }

    /**
     * [set] TWL_OUT_DT: {DATETIME(19)} <br>
     * 棚卸作業リスト出力日時
     * @param twlOutDt The value of the column 'TWL_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTwlOutDt(java.sql.Timestamp twlOutDt) {
        registerModifiedProperty("twlOutDt");
        _twlOutDt = twlOutDt;
    }

    /**
     * [get] INVENTORY_DIFF_OUT_FLG: {CHAR(1)} <br>
     * 棚卸在庫差異表出力フラグ
     * @return The value of the column 'INVENTORY_DIFF_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryDiffOutFlg() {
        checkSpecifiedProperty("inventoryDiffOutFlg");
        return convertEmptyToNull(_inventoryDiffOutFlg);
    }

    /**
     * [set] INVENTORY_DIFF_OUT_FLG: {CHAR(1)} <br>
     * 棚卸在庫差異表出力フラグ
     * @param inventoryDiffOutFlg The value of the column 'INVENTORY_DIFF_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDiffOutFlg(String inventoryDiffOutFlg) {
        registerModifiedProperty("inventoryDiffOutFlg");
        _inventoryDiffOutFlg = inventoryDiffOutFlg;
    }

    /**
     * [get] INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸在庫差異表出力者ID
     * @return The value of the column 'INVENTORY_DIFF_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryDiffOutUserId() {
        checkSpecifiedProperty("inventoryDiffOutUserId");
        return _inventoryDiffOutUserId;
    }

    /**
     * [set] INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸在庫差異表出力者ID
     * @param inventoryDiffOutUserId The value of the column 'INVENTORY_DIFF_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDiffOutUserId(Long inventoryDiffOutUserId) {
        registerModifiedProperty("inventoryDiffOutUserId");
        _inventoryDiffOutUserId = inventoryDiffOutUserId;
    }

    /**
     * [get] INVENTORY_DIFF_OUT_DT: {DATETIME(19)} <br>
     * 棚卸在庫差異表出力日時
     * @return The value of the column 'INVENTORY_DIFF_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getInventoryDiffOutDt() {
        checkSpecifiedProperty("inventoryDiffOutDt");
        return _inventoryDiffOutDt;
    }

    /**
     * [set] INVENTORY_DIFF_OUT_DT: {DATETIME(19)} <br>
     * 棚卸在庫差異表出力日時
     * @param inventoryDiffOutDt The value of the column 'INVENTORY_DIFF_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDiffOutDt(java.sql.Timestamp inventoryDiffOutDt) {
        registerModifiedProperty("inventoryDiffOutDt");
        _inventoryDiffOutDt = inventoryDiffOutDt;
    }

    /**
     * [get] INVENTORY_RECORD_OUT_FLG: {CHAR(1)} <br>
     * 商品別棚卸実績表兼差異表出力フラグ
     * @return The value of the column 'INVENTORY_RECORD_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryRecordOutFlg() {
        checkSpecifiedProperty("inventoryRecordOutFlg");
        return convertEmptyToNull(_inventoryRecordOutFlg);
    }

    /**
     * [set] INVENTORY_RECORD_OUT_FLG: {CHAR(1)} <br>
     * 商品別棚卸実績表兼差異表出力フラグ
     * @param inventoryRecordOutFlg The value of the column 'INVENTORY_RECORD_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryRecordOutFlg(String inventoryRecordOutFlg) {
        registerModifiedProperty("inventoryRecordOutFlg");
        _inventoryRecordOutFlg = inventoryRecordOutFlg;
    }

    /**
     * [get] INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 商品別棚卸実績表兼差異表出力者ID
     * @return The value of the column 'INVENTORY_RECORD_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryRecordOutUserId() {
        checkSpecifiedProperty("inventoryRecordOutUserId");
        return _inventoryRecordOutUserId;
    }

    /**
     * [set] INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 商品別棚卸実績表兼差異表出力者ID
     * @param inventoryRecordOutUserId The value of the column 'INVENTORY_RECORD_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryRecordOutUserId(Long inventoryRecordOutUserId) {
        registerModifiedProperty("inventoryRecordOutUserId");
        _inventoryRecordOutUserId = inventoryRecordOutUserId;
    }

    /**
     * [get] INVENTORY_RECORD_OUT_DT: {DATETIME(19)} <br>
     * 商品別棚卸実績表兼差異表出力日時
     * @return The value of the column 'INVENTORY_RECORD_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getInventoryRecordOutDt() {
        checkSpecifiedProperty("inventoryRecordOutDt");
        return _inventoryRecordOutDt;
    }

    /**
     * [set] INVENTORY_RECORD_OUT_DT: {DATETIME(19)} <br>
     * 商品別棚卸実績表兼差異表出力日時
     * @param inventoryRecordOutDt The value of the column 'INVENTORY_RECORD_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryRecordOutDt(java.sql.Timestamp inventoryRecordOutDt) {
        registerModifiedProperty("inventoryRecordOutDt");
        _inventoryRecordOutDt = inventoryRecordOutDt;
    }

    /**
     * [get] INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)} <br>
     * 商品別棚卸実績表(LOC表示あり)出力フラグ
     * @return The value of the column 'INVENTORY_RECORD_LOC_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryRecordLocOutFlg() {
        checkSpecifiedProperty("inventoryRecordLocOutFlg");
        return convertEmptyToNull(_inventoryRecordLocOutFlg);
    }

    /**
     * [set] INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)} <br>
     * 商品別棚卸実績表(LOC表示あり)出力フラグ
     * @param inventoryRecordLocOutFlg The value of the column 'INVENTORY_RECORD_LOC_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryRecordLocOutFlg(String inventoryRecordLocOutFlg) {
        registerModifiedProperty("inventoryRecordLocOutFlg");
        _inventoryRecordLocOutFlg = inventoryRecordLocOutFlg;
    }

    /**
     * [get] INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 商品別棚卸実績表(LOC表示あり)出力者ID
     * @return The value of the column 'INVENTORY_RECORD_LOC_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryRecordLocOutUserId() {
        checkSpecifiedProperty("inventoryRecordLocOutUserId");
        return _inventoryRecordLocOutUserId;
    }

    /**
     * [set] INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 商品別棚卸実績表(LOC表示あり)出力者ID
     * @param inventoryRecordLocOutUserId The value of the column 'INVENTORY_RECORD_LOC_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryRecordLocOutUserId(Long inventoryRecordLocOutUserId) {
        registerModifiedProperty("inventoryRecordLocOutUserId");
        _inventoryRecordLocOutUserId = inventoryRecordLocOutUserId;
    }

    /**
     * [get] INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)} <br>
     * 商品別棚卸実績表(LOC表示あり)出力日時
     * @return The value of the column 'INVENTORY_RECORD_LOC_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getInventoryRecordLocOutDt() {
        checkSpecifiedProperty("inventoryRecordLocOutDt");
        return _inventoryRecordLocOutDt;
    }

    /**
     * [set] INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)} <br>
     * 商品別棚卸実績表(LOC表示あり)出力日時
     * @param inventoryRecordLocOutDt The value of the column 'INVENTORY_RECORD_LOC_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryRecordLocOutDt(java.sql.Timestamp inventoryRecordLocOutDt) {
        registerModifiedProperty("inventoryRecordLocOutDt");
        _inventoryRecordLocOutDt = inventoryRecordLocOutDt;
    }

    /**
     * [get] STOCK_DIFF_OUT_FLG: {CHAR(1)} <br>
     * 在庫差異確認表出力フラグ
     * @return The value of the column 'STOCK_DIFF_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockDiffOutFlg() {
        checkSpecifiedProperty("stockDiffOutFlg");
        return convertEmptyToNull(_stockDiffOutFlg);
    }

    /**
     * [set] STOCK_DIFF_OUT_FLG: {CHAR(1)} <br>
     * 在庫差異確認表出力フラグ
     * @param stockDiffOutFlg The value of the column 'STOCK_DIFF_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockDiffOutFlg(String stockDiffOutFlg) {
        registerModifiedProperty("stockDiffOutFlg");
        _stockDiffOutFlg = stockDiffOutFlg;
    }

    /**
     * [get] STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 在庫差異確認表出力者ID
     * @return The value of the column 'STOCK_DIFF_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockDiffOutUserId() {
        checkSpecifiedProperty("stockDiffOutUserId");
        return _stockDiffOutUserId;
    }

    /**
     * [set] STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 在庫差異確認表出力者ID
     * @param stockDiffOutUserId The value of the column 'STOCK_DIFF_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockDiffOutUserId(Long stockDiffOutUserId) {
        registerModifiedProperty("stockDiffOutUserId");
        _stockDiffOutUserId = stockDiffOutUserId;
    }

    /**
     * [get] STOCK_DIFF_OUT_DT: {DATETIME(19)} <br>
     * 在庫差異確認表出力日時
     * @return The value of the column 'STOCK_DIFF_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getStockDiffOutDt() {
        checkSpecifiedProperty("stockDiffOutDt");
        return _stockDiffOutDt;
    }

    /**
     * [set] STOCK_DIFF_OUT_DT: {DATETIME(19)} <br>
     * 在庫差異確認表出力日時
     * @param stockDiffOutDt The value of the column 'STOCK_DIFF_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockDiffOutDt(java.sql.Timestamp stockDiffOutDt) {
        registerModifiedProperty("stockDiffOutDt");
        _stockDiffOutDt = stockDiffOutDt;
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
