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
 * The entity of t_inventory_inst as TABLE. <br>
 * 棚卸指示
 * <pre>
 * [primary-key]
 *     INVENTORY_INST_ID
 *
 * [column]
 *     INVENTORY_INST_ID, INVENTORY_H_ID, DEPOSIT_ID, STOCK_TYPE_ID, FROM_LOCATION_CD, TO_LOCATION_CD, ZONE_ID, FROM_STOCK_INOUT_DT, TO_STOCK_INOUT_DT, STOCK_EXIST_ONLY_FLG, FISCAL_YEAR, LP_SEND_FLG, WM_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_INST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_stock_type, m_zone, m_customer, t_inventory_h, b_class_dtl(ByStockExistOnlyFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mStockType, mZone, mCustomer, tInventoryH, bClassDtlByStockExistOnlyFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long inventoryInstId = entity.getInventoryInstId();
 * Long inventoryHId = entity.getInventoryHId();
 * Long depositId = entity.getDepositId();
 * Long stockTypeId = entity.getStockTypeId();
 * String fromLocationCd = entity.getFromLocationCd();
 * String toLocationCd = entity.getToLocationCd();
 * Long zoneId = entity.getZoneId();
 * String fromStockInoutDt = entity.getFromStockInoutDt();
 * String toStockInoutDt = entity.getToStockInoutDt();
 * String stockExistOnlyFlg = entity.getStockExistOnlyFlg();
 * String fiscalYear = entity.getFiscalYear();
 * String lpSendFlg = entity.getLpSendFlg();
 * String wmSendFlg = entity.getWmSendFlg();
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
 * entity.setInventoryHId(inventoryHId);
 * entity.setDepositId(depositId);
 * entity.setStockTypeId(stockTypeId);
 * entity.setFromLocationCd(fromLocationCd);
 * entity.setToLocationCd(toLocationCd);
 * entity.setZoneId(zoneId);
 * entity.setFromStockInoutDt(fromStockInoutDt);
 * entity.setToStockInoutDt(toStockInoutDt);
 * entity.setStockExistOnlyFlg(stockExistOnlyFlg);
 * entity.setFiscalYear(fiscalYear);
 * entity.setLpSendFlg(lpSendFlg);
 * entity.setWmSendFlg(wmSendFlg);
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
public abstract class BsTInventoryInst extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _inventoryInstId;

    /** INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h} */
    protected Long _inventoryHId;

    /** DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _depositId;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    protected Long _stockTypeId;

    /** FROM_LOCATION_CD: {VARCHAR(30)} */
    protected String _fromLocationCd;

    /** TO_LOCATION_CD: {VARCHAR(30)} */
    protected String _toLocationCd;

    /** ZONE_ID: {IX, BIGINT(19), FK to m_zone} */
    protected Long _zoneId;

    /** FROM_STOCK_INOUT_DT: {VARCHAR(8)} */
    protected String _fromStockInoutDt;

    /** TO_STOCK_INOUT_DT: {VARCHAR(8)} */
    protected String _toStockInoutDt;

    /** STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} */
    protected String _stockExistOnlyFlg;

    /** FISCAL_YEAR: {VARCHAR(30)} */
    protected String _fiscalYear;

    /** LP_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _lpSendFlg;

    /** WM_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _wmSendFlg;

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
        return "t_inventory_inst";
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
     * Get the value of stockExistOnlyFlg as the classification of StockExistOnlyFlg. <br>
     * STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockExistOnlyFlg getStockExistOnlyFlgAsStockExistOnlyFlg() {
        return CDef.StockExistOnlyFlg.codeOf(getStockExistOnlyFlg());
    }

    /**
     * Set the value of stockExistOnlyFlg as the classification of StockExistOnlyFlg. <br>
     * STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockExistOnlyFlgAsStockExistOnlyFlg(CDef.StockExistOnlyFlg cdef) {
        setStockExistOnlyFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of stockExistOnlyFlg as $0 (0). <br>
     * $0: 全て
     */
    public void setStockExistOnlyFlg_$0() {
        setStockExistOnlyFlgAsStockExistOnlyFlg(CDef.StockExistOnlyFlg.$0);
    }

    /**
     * Set the value of stockExistOnlyFlg as $1 (1). <br>
     * $1: 在庫有のみ
     */
    public void setStockExistOnlyFlg_$1() {
        setStockExistOnlyFlgAsStockExistOnlyFlg(CDef.StockExistOnlyFlg.$1);
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
     * Is the value of stockExistOnlyFlg $0? <br>
     * $0: 全て
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockExistOnlyFlg$0() {
        CDef.StockExistOnlyFlg cdef = getStockExistOnlyFlgAsStockExistOnlyFlg();
        return cdef != null ? cdef.equals(CDef.StockExistOnlyFlg.$0) : false;
    }

    /**
     * Is the value of stockExistOnlyFlg $1? <br>
     * $1: 在庫有のみ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockExistOnlyFlg$1() {
        CDef.StockExistOnlyFlg cdef = getStockExistOnlyFlgAsStockExistOnlyFlg();
        return cdef != null ? cdef.equals(CDef.StockExistOnlyFlg.$1) : false;
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
     * Get the value of the column 'stockExistOnlyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockExistOnlyFlgName() {
        CDef.StockExistOnlyFlg cdef = getStockExistOnlyFlgAsStockExistOnlyFlg();
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

    /** m_zone by my ZONE_ID, named 'MZone'. */
    protected MZone _mZone;

    /**
     * [get] m_zone by my ZONE_ID, named 'MZone'. <br>
     * @return The entity of foreign property 'MZone'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MZone getMZone() {
        return _mZone;
    }

    /**
     * [set] m_zone by my ZONE_ID, named 'MZone'.
     * @param mZone The entity of foreign property 'MZone'. (NullAllowed)
     */
    public void setMZone(MZone mZone) {
        _mZone = mZone;
    }

    /** m_customer by my DEPOSIT_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] m_customer by my DEPOSIT_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] m_customer by my DEPOSIT_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** t_inventory_h by my INVENTORY_H_ID, named 'TInventoryH'. */
    protected TInventoryH _tInventoryH;

    /**
     * [get] t_inventory_h by my INVENTORY_H_ID, named 'TInventoryH'. <br>
     * @return The entity of foreign property 'TInventoryH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TInventoryH getTInventoryH() {
        return _tInventoryH;
    }

    /**
     * [set] t_inventory_h by my INVENTORY_H_ID, named 'TInventoryH'.
     * @param tInventoryH The entity of foreign property 'TInventoryH'. (NullAllowed)
     */
    public void setTInventoryH(TInventoryH tInventoryH) {
        _tInventoryH = tInventoryH;
    }

    /** b_class_dtl by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'. */
    protected BClassDtl _bClassDtlByStockExistOnlyFlg;

    /**
     * [get] b_class_dtl by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockExistOnlyFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockExistOnlyFlg() {
        return _bClassDtlByStockExistOnlyFlg;
    }

    /**
     * [set] b_class_dtl by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'.
     * @param bClassDtlByStockExistOnlyFlg The entity of foreign property 'BClassDtlByStockExistOnlyFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockExistOnlyFlg(BClassDtl bClassDtlByStockExistOnlyFlg) {
        _bClassDtlByStockExistOnlyFlg = bClassDtlByStockExistOnlyFlg;
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
        if (obj instanceof BsTInventoryInst) {
            BsTInventoryInst other = (BsTInventoryInst)obj;
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
        StringBuilder sb = new StringBuilder();
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_mZone != null)
        { sb.append(li).append(xbRDS(_mZone, "mZone")); }
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_tInventoryH != null)
        { sb.append(li).append(xbRDS(_tInventoryH, "tInventoryH")); }
        if (_bClassDtlByStockExistOnlyFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockExistOnlyFlg, "bClassDtlByStockExistOnlyFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryInstId));
        sb.append(dm).append(xfND(_inventoryHId));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_fromLocationCd));
        sb.append(dm).append(xfND(_toLocationCd));
        sb.append(dm).append(xfND(_zoneId));
        sb.append(dm).append(xfND(_fromStockInoutDt));
        sb.append(dm).append(xfND(_toStockInoutDt));
        sb.append(dm).append(xfND(_stockExistOnlyFlg));
        sb.append(dm).append(xfND(_fiscalYear));
        sb.append(dm).append(xfND(_lpSendFlg));
        sb.append(dm).append(xfND(_wmSendFlg));
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
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_mZone != null)
        { sb.append(dm).append("mZone"); }
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_tInventoryH != null)
        { sb.append(dm).append("tInventoryH"); }
        if (_bClassDtlByStockExistOnlyFlg != null)
        { sb.append(dm).append("bClassDtlByStockExistOnlyFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TInventoryInst clone() {
        return (TInventoryInst)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸指示ID
     * @return The value of the column 'INVENTORY_INST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryInstId() {
        checkSpecifiedProperty("inventoryInstId");
        return _inventoryInstId;
    }

    /**
     * [set] INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸指示ID
     * @param inventoryInstId The value of the column 'INVENTORY_INST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryInstId(Long inventoryInstId) {
        registerModifiedProperty("inventoryInstId");
        _inventoryInstId = inventoryInstId;
    }

    /**
     * [get] INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryHId() {
        checkSpecifiedProperty("inventoryHId");
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryHId(Long inventoryHId) {
        registerModifiedProperty("inventoryHId");
        _inventoryHId = inventoryHId;
    }

    /**
     * [get] DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositId() {
        checkSpecifiedProperty("depositId");
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositId(Long depositId) {
        registerModifiedProperty("depositId");
        _depositId = depositId;
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
     * [get] FROM_LOCATION_CD: {VARCHAR(30)} <br>
     * FROMロケーションCD
     * @return The value of the column 'FROM_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromLocationCd() {
        checkSpecifiedProperty("fromLocationCd");
        return convertEmptyToNull(_fromLocationCd);
    }

    /**
     * [set] FROM_LOCATION_CD: {VARCHAR(30)} <br>
     * FROMロケーションCD
     * @param fromLocationCd The value of the column 'FROM_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromLocationCd(String fromLocationCd) {
        registerModifiedProperty("fromLocationCd");
        _fromLocationCd = fromLocationCd;
    }

    /**
     * [get] TO_LOCATION_CD: {VARCHAR(30)} <br>
     * TOロケーションCD
     * @return The value of the column 'TO_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getToLocationCd() {
        checkSpecifiedProperty("toLocationCd");
        return convertEmptyToNull(_toLocationCd);
    }

    /**
     * [set] TO_LOCATION_CD: {VARCHAR(30)} <br>
     * TOロケーションCD
     * @param toLocationCd The value of the column 'TO_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToLocationCd(String toLocationCd) {
        registerModifiedProperty("toLocationCd");
        _toLocationCd = toLocationCd;
    }

    /**
     * [get] ZONE_ID: {IX, BIGINT(19), FK to m_zone} <br>
     * ゾーンID
     * @return The value of the column 'ZONE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZoneId() {
        checkSpecifiedProperty("zoneId");
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {IX, BIGINT(19), FK to m_zone} <br>
     * ゾーンID
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneId(Long zoneId) {
        registerModifiedProperty("zoneId");
        _zoneId = zoneId;
    }

    /**
     * [get] FROM_STOCK_INOUT_DT: {VARCHAR(8)} <br>
     * FROM受払日
     * @return The value of the column 'FROM_STOCK_INOUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromStockInoutDt() {
        checkSpecifiedProperty("fromStockInoutDt");
        return convertEmptyToNull(_fromStockInoutDt);
    }

    /**
     * [set] FROM_STOCK_INOUT_DT: {VARCHAR(8)} <br>
     * FROM受払日
     * @param fromStockInoutDt The value of the column 'FROM_STOCK_INOUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromStockInoutDt(String fromStockInoutDt) {
        registerModifiedProperty("fromStockInoutDt");
        _fromStockInoutDt = fromStockInoutDt;
    }

    /**
     * [get] TO_STOCK_INOUT_DT: {VARCHAR(8)} <br>
     * TO受払日
     * @return The value of the column 'TO_STOCK_INOUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getToStockInoutDt() {
        checkSpecifiedProperty("toStockInoutDt");
        return convertEmptyToNull(_toStockInoutDt);
    }

    /**
     * [set] TO_STOCK_INOUT_DT: {VARCHAR(8)} <br>
     * TO受払日
     * @param toStockInoutDt The value of the column 'TO_STOCK_INOUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToStockInoutDt(String toStockInoutDt) {
        registerModifiedProperty("toStockInoutDt");
        _toStockInoutDt = toStockInoutDt;
    }

    /**
     * [get] STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @return The value of the column 'STOCK_EXIST_ONLY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockExistOnlyFlg() {
        checkSpecifiedProperty("stockExistOnlyFlg");
        return convertEmptyToNull(_stockExistOnlyFlg);
    }

    /**
     * [set] STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param stockExistOnlyFlg The value of the column 'STOCK_EXIST_ONLY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockExistOnlyFlg(String stockExistOnlyFlg) {
        registerModifiedProperty("stockExistOnlyFlg");
        _stockExistOnlyFlg = stockExistOnlyFlg;
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
     * [get] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLpSendFlg() {
        checkSpecifiedProperty("lpSendFlg");
        return convertEmptyToNull(_lpSendFlg);
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLpSendFlg(String lpSendFlg) {
        registerModifiedProperty("lpSendFlg");
        _lpSendFlg = lpSendFlg;
    }

    /**
     * [get] WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @return The value of the column 'WM_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmSendFlg() {
        checkSpecifiedProperty("wmSendFlg");
        return convertEmptyToNull(_wmSendFlg);
    }

    /**
     * [set] WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @param wmSendFlg The value of the column 'WM_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmSendFlg(String wmSendFlg) {
        registerModifiedProperty("wmSendFlg");
        _wmSendFlg = wmSendFlg;
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
