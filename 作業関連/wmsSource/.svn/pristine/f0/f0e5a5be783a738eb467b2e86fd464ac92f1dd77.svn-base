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
 * The entity of t_picking_b as TABLE. <br>
 * 出庫ボディ
 * <pre>
 * [primary-key]
 *     PICKING_B_ID
 *
 * [column]
 *     PICKING_B_ID, PICKING_H_ID, SHIPPING_INST_B_ID, ALLOC_INST_B_ID, STOCK_ID, PICKING_NUM, TEMP_NO, TRANSIT_NUM, SHAPE_ID, PICKED_NUM, PICKING_PATERN_CD, INDV_LABEL_NO, OLD_PICKING_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_shape, t_picking_h, t_stock, t_shipping_inst_b, t_alloc_inst_b
 *
 * [referrer table]
 *     t_packing_b, t_picking_record_stock
 *
 * [foreign property]
 *     mShape, tPickingH, tStock, tShippingInstB, tAllocInstB
 *
 * [referrer property]
 *     tPackingBList, tPickingRecordStockList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long pickingBId = entity.getPickingBId();
 * Long pickingHId = entity.getPickingHId();
 * Long shippingInstBId = entity.getShippingInstBId();
 * Long allocInstBId = entity.getAllocInstBId();
 * Long stockId = entity.getStockId();
 * java.math.BigDecimal pickingNum = entity.getPickingNum();
 * String tempNo = entity.getTempNo();
 * java.math.BigDecimal transitNum = entity.getTransitNum();
 * Long shapeId = entity.getShapeId();
 * Long pickedNum = entity.getPickedNum();
 * String pickingPaternCd = entity.getPickingPaternCd();
 * String indvLabelNo = entity.getIndvLabelNo();
 * Long oldPickingBId = entity.getOldPickingBId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPickingBId(pickingBId);
 * entity.setPickingHId(pickingHId);
 * entity.setShippingInstBId(shippingInstBId);
 * entity.setAllocInstBId(allocInstBId);
 * entity.setStockId(stockId);
 * entity.setPickingNum(pickingNum);
 * entity.setTempNo(tempNo);
 * entity.setTransitNum(transitNum);
 * entity.setShapeId(shapeId);
 * entity.setPickedNum(pickedNum);
 * entity.setPickingPaternCd(pickingPaternCd);
 * entity.setIndvLabelNo(indvLabelNo);
 * entity.setOldPickingBId(oldPickingBId);
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
public abstract class BsTPickingB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _pickingBId;

    /** PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h} */
    protected Long _pickingHId;

    /** SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b} */
    protected Long _shippingInstBId;

    /** ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} */
    protected Long _allocInstBId;

    /** STOCK_ID: {IX, BIGINT(19), FK to t_stock} */
    protected Long _stockId;

    /** PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _pickingNum;

    /** TEMP_NO: {VARCHAR(30)} */
    protected String _tempNo;

    /** TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _transitNum;

    /** SHAPE_ID: {IX, BIGINT(19), FK to m_shape} */
    protected Long _shapeId;

    /** PICKED_NUM: {BIGINT(19)} */
    protected Long _pickedNum;

    /** PICKING_PATERN_CD: {VARCHAR(30)} */
    protected String _pickingPaternCd;

    /** INDV_LABEL_NO: {VARCHAR(30)} */
    protected String _indvLabelNo;

    /** OLD_PICKING_B_ID: {BIGINT(19)} */
    protected Long _oldPickingBId;

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
        return "t_picking_b";
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
        if (_pickingBId == null) { return false; }
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
    /** m_shape by my SHAPE_ID, named 'MShape'. */
    protected MShape _mShape;

    /**
     * [get] m_shape by my SHAPE_ID, named 'MShape'. <br>
     * @return The entity of foreign property 'MShape'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShape getMShape() {
        return _mShape;
    }

    /**
     * [set] m_shape by my SHAPE_ID, named 'MShape'.
     * @param mShape The entity of foreign property 'MShape'. (NullAllowed)
     */
    public void setMShape(MShape mShape) {
        _mShape = mShape;
    }

    /** t_picking_h by my PICKING_H_ID, named 'TPickingH'. */
    protected TPickingH _tPickingH;

    /**
     * [get] t_picking_h by my PICKING_H_ID, named 'TPickingH'. <br>
     * @return The entity of foreign property 'TPickingH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPickingH getTPickingH() {
        return _tPickingH;
    }

    /**
     * [set] t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @param tPickingH The entity of foreign property 'TPickingH'. (NullAllowed)
     */
    public void setTPickingH(TPickingH tPickingH) {
        _tPickingH = tPickingH;
    }

    /** t_stock by my STOCK_ID, named 'TStock'. */
    protected TStock _tStock;

    /**
     * [get] t_stock by my STOCK_ID, named 'TStock'. <br>
     * @return The entity of foreign property 'TStock'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStock getTStock() {
        return _tStock;
    }

    /**
     * [set] t_stock by my STOCK_ID, named 'TStock'.
     * @param tStock The entity of foreign property 'TStock'. (NullAllowed)
     */
    public void setTStock(TStock tStock) {
        _tStock = tStock;
    }

    /** t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'. */
    protected TShippingInstB _tShippingInstB;

    /**
     * [get] t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'. <br>
     * @return The entity of foreign property 'TShippingInstB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TShippingInstB getTShippingInstB() {
        return _tShippingInstB;
    }

    /**
     * [set] t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @param tShippingInstB The entity of foreign property 'TShippingInstB'. (NullAllowed)
     */
    public void setTShippingInstB(TShippingInstB tShippingInstB) {
        _tShippingInstB = tShippingInstB;
    }

    /** t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'. */
    protected TAllocInstB _tAllocInstB;

    /**
     * [get] t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'. <br>
     * @return The entity of foreign property 'TAllocInstB'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TAllocInstB getTAllocInstB() {
        return _tAllocInstB;
    }

    /**
     * [set] t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param tAllocInstB The entity of foreign property 'TAllocInstB'. (NullAllowed)
     */
    public void setTAllocInstB(TAllocInstB tAllocInstB) {
        _tAllocInstB = tAllocInstB;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_packing_b by PICKING_B_ID, named 'TPackingBList'. */
    protected List<TPackingB> _tPackingBList;

    /**
     * [get] t_packing_b by PICKING_B_ID, named 'TPackingBList'.
     * @return The entity list of referrer property 'TPackingBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingB> getTPackingBList() {
        if (_tPackingBList == null) { _tPackingBList = newReferrerList(); }
        return _tPackingBList;
    }

    /**
     * [set] t_packing_b by PICKING_B_ID, named 'TPackingBList'.
     * @param tPackingBList The entity list of referrer property 'TPackingBList'. (NullAllowed)
     */
    public void setTPackingBList(List<TPackingB> tPackingBList) {
        _tPackingBList = tPackingBList;
    }

    /** t_picking_record_stock by PICKING_B_ID, named 'TPickingRecordStockList'. */
    protected List<TPickingRecordStock> _tPickingRecordStockList;

    /**
     * [get] t_picking_record_stock by PICKING_B_ID, named 'TPickingRecordStockList'.
     * @return The entity list of referrer property 'TPickingRecordStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingRecordStock> getTPickingRecordStockList() {
        if (_tPickingRecordStockList == null) { _tPickingRecordStockList = newReferrerList(); }
        return _tPickingRecordStockList;
    }

    /**
     * [set] t_picking_record_stock by PICKING_B_ID, named 'TPickingRecordStockList'.
     * @param tPickingRecordStockList The entity list of referrer property 'TPickingRecordStockList'. (NullAllowed)
     */
    public void setTPickingRecordStockList(List<TPickingRecordStock> tPickingRecordStockList) {
        _tPickingRecordStockList = tPickingRecordStockList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTPickingB) {
            BsTPickingB other = (BsTPickingB)obj;
            if (!xSV(_pickingBId, other._pickingBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pickingBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_tPickingH != null)
        { sb.append(li).append(xbRDS(_tPickingH, "tPickingH")); }
        if (_tStock != null)
        { sb.append(li).append(xbRDS(_tStock, "tStock")); }
        if (_tShippingInstB != null)
        { sb.append(li).append(xbRDS(_tShippingInstB, "tShippingInstB")); }
        if (_tAllocInstB != null)
        { sb.append(li).append(xbRDS(_tAllocInstB, "tAllocInstB")); }
        if (_tPackingBList != null) { for (TPackingB et : _tPackingBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingBList")); } } }
        if (_tPickingRecordStockList != null) { for (TPickingRecordStock et : _tPickingRecordStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingRecordStockList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pickingBId));
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_shippingInstBId));
        sb.append(dm).append(xfND(_allocInstBId));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_pickingNum));
        sb.append(dm).append(xfND(_tempNo));
        sb.append(dm).append(xfND(_transitNum));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_pickedNum));
        sb.append(dm).append(xfND(_pickingPaternCd));
        sb.append(dm).append(xfND(_indvLabelNo));
        sb.append(dm).append(xfND(_oldPickingBId));
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
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_tPickingH != null)
        { sb.append(dm).append("tPickingH"); }
        if (_tStock != null)
        { sb.append(dm).append("tStock"); }
        if (_tShippingInstB != null)
        { sb.append(dm).append("tShippingInstB"); }
        if (_tAllocInstB != null)
        { sb.append(dm).append("tAllocInstB"); }
        if (_tPackingBList != null && !_tPackingBList.isEmpty())
        { sb.append(dm).append("tPackingBList"); }
        if (_tPickingRecordStockList != null && !_tPickingRecordStockList.isEmpty())
        { sb.append(dm).append("tPickingRecordStockList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TPickingB clone() {
        return (TPickingB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出庫ボディID
     * @return The value of the column 'PICKING_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingBId() {
        checkSpecifiedProperty("pickingBId");
        return _pickingBId;
    }

    /**
     * [set] PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出庫ボディID
     * @param pickingBId The value of the column 'PICKING_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingBId(Long pickingBId) {
        registerModifiedProperty("pickingBId");
        _pickingBId = pickingBId;
    }

    /**
     * [get] PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingInstBId() {
        checkSpecifiedProperty("shippingInstBId");
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        registerModifiedProperty("shippingInstBId");
        _shippingInstBId = shippingInstBId;
    }

    /**
     * [get] ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstBId() {
        checkSpecifiedProperty("allocInstBId");
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} <br>
     * 引当指示ボディID
     * @param allocInstBId The value of the column 'ALLOC_INST_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstBId(Long allocInstBId) {
        registerModifiedProperty("allocInstBId");
        _allocInstBId = allocInstBId;
    }

    /**
     * [get] STOCK_ID: {IX, BIGINT(19), FK to t_stock} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, BIGINT(19), FK to t_stock} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 出庫数
     * @return The value of the column 'PICKING_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPickingNum() {
        checkSpecifiedProperty("pickingNum");
        return _pickingNum;
    }

    /**
     * [set] PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 出庫数
     * @param pickingNum The value of the column 'PICKING_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        registerModifiedProperty("pickingNum");
        _pickingNum = pickingNum;
    }

    /**
     * [get] TEMP_NO: {VARCHAR(30)} <br>
     * 仮置きNo.
     * @return The value of the column 'TEMP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTempNo() {
        checkSpecifiedProperty("tempNo");
        return convertEmptyToNull(_tempNo);
    }

    /**
     * [set] TEMP_NO: {VARCHAR(30)} <br>
     * 仮置きNo.
     * @param tempNo The value of the column 'TEMP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTempNo(String tempNo) {
        registerModifiedProperty("tempNo");
        _tempNo = tempNo;
    }

    /**
     * [get] TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 積送中数
     * @return The value of the column 'TRANSIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransitNum() {
        checkSpecifiedProperty("transitNum");
        return _transitNum;
    }

    /**
     * [set] TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 積送中数
     * @param transitNum The value of the column 'TRANSIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransitNum(java.math.BigDecimal transitNum) {
        registerModifiedProperty("transitNum");
        _transitNum = transitNum;
    }

    /**
     * [get] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeId() {
        checkSpecifiedProperty("shapeId");
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeId(Long shapeId) {
        registerModifiedProperty("shapeId");
        _shapeId = shapeId;
    }

    /**
     * [get] PICKED_NUM: {BIGINT(19)} <br>
     * ピッキング済数
     * @return The value of the column 'PICKED_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickedNum() {
        checkSpecifiedProperty("pickedNum");
        return _pickedNum;
    }

    /**
     * [set] PICKED_NUM: {BIGINT(19)} <br>
     * ピッキング済数
     * @param pickedNum The value of the column 'PICKED_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickedNum(Long pickedNum) {
        registerModifiedProperty("pickedNum");
        _pickedNum = pickedNum;
    }

    /**
     * [get] PICKING_PATERN_CD: {VARCHAR(30)} <br>
     * ピッキングパターンCD
     * @return The value of the column 'PICKING_PATERN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingPaternCd() {
        checkSpecifiedProperty("pickingPaternCd");
        return convertEmptyToNull(_pickingPaternCd);
    }

    /**
     * [set] PICKING_PATERN_CD: {VARCHAR(30)} <br>
     * ピッキングパターンCD
     * @param pickingPaternCd The value of the column 'PICKING_PATERN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingPaternCd(String pickingPaternCd) {
        registerModifiedProperty("pickingPaternCd");
        _pickingPaternCd = pickingPaternCd;
    }

    /**
     * [get] INDV_LABEL_NO: {VARCHAR(30)} <br>
     * 個別貼付ラベルNO
     * @return The value of the column 'INDV_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getIndvLabelNo() {
        checkSpecifiedProperty("indvLabelNo");
        return convertEmptyToNull(_indvLabelNo);
    }

    /**
     * [set] INDV_LABEL_NO: {VARCHAR(30)} <br>
     * 個別貼付ラベルNO
     * @param indvLabelNo The value of the column 'INDV_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIndvLabelNo(String indvLabelNo) {
        registerModifiedProperty("indvLabelNo");
        _indvLabelNo = indvLabelNo;
    }

    /**
     * [get] OLD_PICKING_B_ID: {BIGINT(19)} <br>
     * 元出庫ボディID
     * @return The value of the column 'OLD_PICKING_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOldPickingBId() {
        checkSpecifiedProperty("oldPickingBId");
        return _oldPickingBId;
    }

    /**
     * [set] OLD_PICKING_B_ID: {BIGINT(19)} <br>
     * 元出庫ボディID
     * @param oldPickingBId The value of the column 'OLD_PICKING_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOldPickingBId(Long oldPickingBId) {
        registerModifiedProperty("oldPickingBId");
        _oldPickingBId = oldPickingBId;
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
