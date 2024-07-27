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
 * The entity of t_inventory_b as TABLE. <br>
 * 棚卸ボディ
 * <pre>
 * [primary-key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_H_ID, STOCK_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_NUM, INPUT_TYPE, STOCK_ADJUST_FLG, MOVE_INST_H_ID, HT_INPUT_INVENTORY_NUM, WEB_INPUT_INVENTORY_NUM, AJIS_INPUT_INVENTORY_NUM, PROD_DT, AREA_CD, SALES_ORG_ID, ACCOUNT_ID, ALLOC_TYPE_CD, S4_SEND_FLG, CM_SEND_FLG, INVENTORY_USER_ID, INVENTORY_UPD_USER_ID, RECEIVE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_stock_type, t_lot, m_warehouse, m_shape, b_user, t_move_inst_h, m_sales_org, m_customer, m_location, m_product, t_stock, t_inventory_h, t_store_no, b_class_dtl(ByInputType), t_inventory_r(AsOne)
 *
 * [referrer table]
 *     t_inventory_inp_hist, t_inventory_receive_label, t_inventory_r
 *
 * [foreign property]
 *     mStockType, tLot, mWarehouse, mShape, bUserByInventoryUpdUserId, tMoveInstH, mSalesOrg, mCustomerByAccountId, mLocation, mProduct, bUserByInventoryUserId, tStock, tInventoryH, tStoreNo, mCustomerByDepositId, mCustomerBySupplierId, bClassDtlByInputType, bClassDtlByStockAdjustFlg, tInventoryRAsOne
 *
 * [referrer property]
 *     tInventoryInpHistList, tInventoryReceiveLabelList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long inventoryBId = entity.getInventoryBId();
 * Long inventoryHId = entity.getInventoryHId();
 * Long stockId = entity.getStockId();
 * Long warehouseId = entity.getWarehouseId();
 * Long productId = entity.getProductId();
 * Long stockTypeId = entity.getStockTypeId();
 * Long locationId = entity.getLocationId();
 * Long depositId = entity.getDepositId();
 * Long lotId = entity.getLotId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * Long storeNoId = entity.getStoreNoId();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * Long supplierId = entity.getSupplierId();
 * String supplierCd = entity.getSupplierCd();
 * Long shapeId = entity.getShapeId();
 * Long unitNum = entity.getUnitNum();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * java.math.BigDecimal moveNum = entity.getMoveNum();
 * java.math.BigDecimal inventoryNum = entity.getInventoryNum();
 * String inputType = entity.getInputType();
 * String stockAdjustFlg = entity.getStockAdjustFlg();
 * Long moveInstHId = entity.getMoveInstHId();
 * java.math.BigDecimal htInputInventoryNum = entity.getHtInputInventoryNum();
 * java.math.BigDecimal webInputInventoryNum = entity.getWebInputInventoryNum();
 * java.math.BigDecimal ajisInputInventoryNum = entity.getAjisInputInventoryNum();
 * String prodDt = entity.getProdDt();
 * String areaCd = entity.getAreaCd();
 * Long salesOrgId = entity.getSalesOrgId();
 * Long accountId = entity.getAccountId();
 * String allocTypeCd = entity.getAllocTypeCd();
 * String s4SendFlg = entity.getS4SendFlg();
 * String cmSendFlg = entity.getCmSendFlg();
 * Long inventoryUserId = entity.getInventoryUserId();
 * Long inventoryUpdUserId = entity.getInventoryUpdUserId();
 * String receiveDt = entity.getReceiveDt();
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
 * entity.setInventoryHId(inventoryHId);
 * entity.setStockId(stockId);
 * entity.setWarehouseId(warehouseId);
 * entity.setProductId(productId);
 * entity.setStockTypeId(stockTypeId);
 * entity.setLocationId(locationId);
 * entity.setDepositId(depositId);
 * entity.setLotId(lotId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setStoreNoId(storeNoId);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setSupplierId(supplierId);
 * entity.setSupplierCd(supplierCd);
 * entity.setShapeId(shapeId);
 * entity.setUnitNum(unitNum);
 * entity.setChargeNum(chargeNum);
 * entity.setAllocNum(allocNum);
 * entity.setMoveNum(moveNum);
 * entity.setInventoryNum(inventoryNum);
 * entity.setInputType(inputType);
 * entity.setStockAdjustFlg(stockAdjustFlg);
 * entity.setMoveInstHId(moveInstHId);
 * entity.setHtInputInventoryNum(htInputInventoryNum);
 * entity.setWebInputInventoryNum(webInputInventoryNum);
 * entity.setAjisInputInventoryNum(ajisInputInventoryNum);
 * entity.setProdDt(prodDt);
 * entity.setAreaCd(areaCd);
 * entity.setSalesOrgId(salesOrgId);
 * entity.setAccountId(accountId);
 * entity.setAllocTypeCd(allocTypeCd);
 * entity.setS4SendFlg(s4SendFlg);
 * entity.setCmSendFlg(cmSendFlg);
 * entity.setInventoryUserId(inventoryUserId);
 * entity.setInventoryUpdUserId(inventoryUpdUserId);
 * entity.setReceiveDt(receiveDt);
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
public abstract class BsTInventoryB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _inventoryBId;

    /** INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h} */
    protected Long _inventoryHId;

    /** STOCK_ID: {IX, BIGINT(19), FK to t_stock} */
    protected Long _stockId;

    /** WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} */
    protected Long _warehouseId;

    /** PRODUCT_ID: {IX, BIGINT(19), FK to m_product} */
    protected Long _productId;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    protected Long _stockTypeId;

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    protected Long _locationId;

    /** DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _depositId;

    /** LOT_ID: {IX, BIGINT(19), FK to t_lot} */
    protected Long _lotId;

    /** LOT: {VARCHAR(30)} */
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    protected String _limitDt;

    /** STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} */
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {IX, VARCHAR(30)} */
    protected String _storeLabelNo;

    /** STORE_DT: {VARCHAR(8)} */
    protected String _storeDt;

    /** SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _supplierId;

    /** SUPPLIER_CD: {VARCHAR(30)} */
    protected String _supplierCd;

    /** SHAPE_ID: {IX, BIGINT(19), FK to m_shape} */
    protected Long _shapeId;

    /** UNIT_NUM: {BIGINT(19)} */
    protected Long _unitNum;

    /** CHARGE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _chargeNum;

    /** ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _allocNum;

    /** MOVE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _moveNum;

    /** INVENTORY_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _inventoryNum;

    /** INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} */
    protected String _inputType;

    /** STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg} */
    protected String _stockAdjustFlg;

    /** MOVE_INST_H_ID: {IX, BIGINT(19), FK to t_move_inst_h} */
    protected Long _moveInstHId;

    /** HT_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _htInputInventoryNum;

    /** WEB_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _webInputInventoryNum;

    /** AJIS_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _ajisInputInventoryNum;

    /** PROD_DT: {VARCHAR(8)} */
    protected String _prodDt;

    /** AREA_CD: {VARCHAR(30)} */
    protected String _areaCd;

    /** SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} */
    protected Long _salesOrgId;

    /** ACCOUNT_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _accountId;

    /** ALLOC_TYPE_CD: {VARCHAR(30)} */
    protected String _allocTypeCd;

    /** S4_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _s4SendFlg;

    /** CM_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _cmSendFlg;

    /** INVENTORY_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _inventoryUserId;

    /** INVENTORY_UPD_USER_ID: {IX, BIGINT(19), FK to b_user} */
    protected Long _inventoryUpdUserId;

    /** RECEIVE_DT: {VARCHAR(8)} */
    protected String _receiveDt;

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
        return "t_inventory_b";
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
     * Get the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InputType getInputTypeAsInputType() {
        return CDef.InputType.codeOf(getInputType());
    }

    /**
     * Set the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInputTypeAsInputType(CDef.InputType cdef) {
        setInputType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockAdjustFlg as the classification of StockMoveFlg. <br>
     * STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockMoveFlg getStockAdjustFlgAsStockMoveFlg() {
        return CDef.StockMoveFlg.codeOf(getStockAdjustFlg());
    }

    /**
     * Set the value of stockAdjustFlg as the classification of StockMoveFlg. <br>
     * STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockAdjustFlgAsStockMoveFlg(CDef.StockMoveFlg cdef) {
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
     * Set the value of inputType as $00 (00). <br>
     * $00: 画面入力
     */
    public void setInputType_$00() {
        setInputTypeAsInputType(CDef.InputType.$00);
    }

    /**
     * Set the value of inputType as $10 (10). <br>
     * $10: アップロード
     */
    public void setInputType_$10() {
        setInputTypeAsInputType(CDef.InputType.$10);
    }

    /**
     * Set the value of inputType as $20 (20). <br>
     * $20: EDI
     */
    public void setInputType_$20() {
        setInputTypeAsInputType(CDef.InputType.$20);
    }

    /**
     * Set the value of inputType as $30 (30). <br>
     * $30: HT
     */
    public void setInputType_$30() {
        setInputTypeAsInputType(CDef.InputType.$30);
    }

    /**
     * Set the value of stockAdjustFlg as $0 (0). <br>
     * $0: 未調整
     */
    public void setStockAdjustFlg_$0() {
        setStockAdjustFlgAsStockMoveFlg(CDef.StockMoveFlg.$0);
    }

    /**
     * Set the value of stockAdjustFlg as $1 (1). <br>
     * $1: 調整済
     */
    public void setStockAdjustFlg_$1() {
        setStockAdjustFlgAsStockMoveFlg(CDef.StockMoveFlg.$1);
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
     * Is the value of inputType $00? <br>
     * $00: 画面入力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$00() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$00) : false;
    }

    /**
     * Is the value of inputType $10? <br>
     * $10: アップロード
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$10() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$10) : false;
    }

    /**
     * Is the value of inputType $20? <br>
     * $20: EDI
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$20() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$20) : false;
    }

    /**
     * Is the value of inputType $30? <br>
     * $30: HT
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$30() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$30) : false;
    }

    /**
     * Is the value of stockAdjustFlg $0? <br>
     * $0: 未調整
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockAdjustFlg$0() {
        CDef.StockMoveFlg cdef = getStockAdjustFlgAsStockMoveFlg();
        return cdef != null ? cdef.equals(CDef.StockMoveFlg.$0) : false;
    }

    /**
     * Is the value of stockAdjustFlg $1? <br>
     * $1: 調整済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockAdjustFlg$1() {
        CDef.StockMoveFlg cdef = getStockAdjustFlgAsStockMoveFlg();
        return cdef != null ? cdef.equals(CDef.StockMoveFlg.$1) : false;
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
     * Get the value of the column 'inputType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInputTypeName() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockAdjustFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockAdjustFlgName() {
        CDef.StockMoveFlg cdef = getStockAdjustFlgAsStockMoveFlg();
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

    /** b_user by my INVENTORY_UPD_USER_ID, named 'BUserByInventoryUpdUserId'. */
    protected BUser _bUserByInventoryUpdUserId;

    /**
     * [get] b_user by my INVENTORY_UPD_USER_ID, named 'BUserByInventoryUpdUserId'. <br>
     * @return The entity of foreign property 'BUserByInventoryUpdUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByInventoryUpdUserId() {
        return _bUserByInventoryUpdUserId;
    }

    /**
     * [set] b_user by my INVENTORY_UPD_USER_ID, named 'BUserByInventoryUpdUserId'.
     * @param bUserByInventoryUpdUserId The entity of foreign property 'BUserByInventoryUpdUserId'. (NullAllowed)
     */
    public void setBUserByInventoryUpdUserId(BUser bUserByInventoryUpdUserId) {
        _bUserByInventoryUpdUserId = bUserByInventoryUpdUserId;
    }

    /** t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'. */
    protected TMoveInstH _tMoveInstH;

    /**
     * [get] t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'. <br>
     * @return The entity of foreign property 'TMoveInstH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TMoveInstH getTMoveInstH() {
        return _tMoveInstH;
    }

    /**
     * [set] t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @param tMoveInstH The entity of foreign property 'TMoveInstH'. (NullAllowed)
     */
    public void setTMoveInstH(TMoveInstH tMoveInstH) {
        _tMoveInstH = tMoveInstH;
    }

    /** m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'. */
    protected MSalesOrg _mSalesOrg;

    /**
     * [get] m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'. <br>
     * @return The entity of foreign property 'MSalesOrg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MSalesOrg getMSalesOrg() {
        return _mSalesOrg;
    }

    /**
     * [set] m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * @param mSalesOrg The entity of foreign property 'MSalesOrg'. (NullAllowed)
     */
    public void setMSalesOrg(MSalesOrg mSalesOrg) {
        _mSalesOrg = mSalesOrg;
    }

    /** m_customer by my ACCOUNT_ID, named 'MCustomerByAccountId'. */
    protected MCustomer _mCustomerByAccountId;

    /**
     * [get] m_customer by my ACCOUNT_ID, named 'MCustomerByAccountId'. <br>
     * @return The entity of foreign property 'MCustomerByAccountId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByAccountId() {
        return _mCustomerByAccountId;
    }

    /**
     * [set] m_customer by my ACCOUNT_ID, named 'MCustomerByAccountId'.
     * @param mCustomerByAccountId The entity of foreign property 'MCustomerByAccountId'. (NullAllowed)
     */
    public void setMCustomerByAccountId(MCustomer mCustomerByAccountId) {
        _mCustomerByAccountId = mCustomerByAccountId;
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

    /** b_user by my INVENTORY_USER_ID, named 'BUserByInventoryUserId'. */
    protected BUser _bUserByInventoryUserId;

    /**
     * [get] b_user by my INVENTORY_USER_ID, named 'BUserByInventoryUserId'. <br>
     * @return The entity of foreign property 'BUserByInventoryUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByInventoryUserId() {
        return _bUserByInventoryUserId;
    }

    /**
     * [set] b_user by my INVENTORY_USER_ID, named 'BUserByInventoryUserId'.
     * @param bUserByInventoryUserId The entity of foreign property 'BUserByInventoryUserId'. (NullAllowed)
     */
    public void setBUserByInventoryUserId(BUser bUserByInventoryUserId) {
        _bUserByInventoryUserId = bUserByInventoryUserId;
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

    /** t_store_no by my STORE_NO_ID, named 'TStoreNo'. */
    protected TStoreNo _tStoreNo;

    /**
     * [get] t_store_no by my STORE_NO_ID, named 'TStoreNo'. <br>
     * @return The entity of foreign property 'TStoreNo'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStoreNo getTStoreNo() {
        return _tStoreNo;
    }

    /**
     * [set] t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @param tStoreNo The entity of foreign property 'TStoreNo'. (NullAllowed)
     */
    public void setTStoreNo(TStoreNo tStoreNo) {
        _tStoreNo = tStoreNo;
    }

    /** m_customer by my DEPOSIT_ID, named 'MCustomerByDepositId'. */
    protected MCustomer _mCustomerByDepositId;

    /**
     * [get] m_customer by my DEPOSIT_ID, named 'MCustomerByDepositId'. <br>
     * @return The entity of foreign property 'MCustomerByDepositId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByDepositId() {
        return _mCustomerByDepositId;
    }

    /**
     * [set] m_customer by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @param mCustomerByDepositId The entity of foreign property 'MCustomerByDepositId'. (NullAllowed)
     */
    public void setMCustomerByDepositId(MCustomer mCustomerByDepositId) {
        _mCustomerByDepositId = mCustomerByDepositId;
    }

    /** m_customer by my SUPPLIER_ID, named 'MCustomerBySupplierId'. */
    protected MCustomer _mCustomerBySupplierId;

    /**
     * [get] m_customer by my SUPPLIER_ID, named 'MCustomerBySupplierId'. <br>
     * @return The entity of foreign property 'MCustomerBySupplierId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerBySupplierId() {
        return _mCustomerBySupplierId;
    }

    /**
     * [set] m_customer by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @param mCustomerBySupplierId The entity of foreign property 'MCustomerBySupplierId'. (NullAllowed)
     */
    public void setMCustomerBySupplierId(MCustomer mCustomerBySupplierId) {
        _mCustomerBySupplierId = mCustomerBySupplierId;
    }

    /** b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'. */
    protected BClassDtl _bClassDtlByInputType;

    /**
     * [get] b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'. <br>
     * @return The entity of foreign property 'BClassDtlByInputType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    /**
     * [set] b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @param bClassDtlByInputType The entity of foreign property 'BClassDtlByInputType'. (NullAllowed)
     */
    public void setBClassDtlByInputType(BClassDtl bClassDtlByInputType) {
        _bClassDtlByInputType = bClassDtlByInputType;
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

    /** t_inventory_r by INVENTORY_B_ID, named 'TInventoryRAsOne'. */
    protected TInventoryR _tInventoryRAsOne;

    /**
     * [get] t_inventory_r by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TInventoryRAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TInventoryR getTInventoryRAsOne() {
        return _tInventoryRAsOne;
    }

    /**
     * [set] t_inventory_r by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * @param TInventoryRAsOne The entity of foreign property(referrer-as-one) 'TInventoryRAsOne'. (NullAllowed)
     */
    public void setTInventoryRAsOne(TInventoryR TInventoryRAsOne) {
        _tInventoryRAsOne = TInventoryRAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_inventory_inp_hist by INVENTORY_B_ID, named 'TInventoryInpHistList'. */
    protected List<TInventoryInpHist> _tInventoryInpHistList;

    /**
     * [get] t_inventory_inp_hist by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * @return The entity list of referrer property 'TInventoryInpHistList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryInpHist> getTInventoryInpHistList() {
        if (_tInventoryInpHistList == null) { _tInventoryInpHistList = newReferrerList(); }
        return _tInventoryInpHistList;
    }

    /**
     * [set] t_inventory_inp_hist by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * @param tInventoryInpHistList The entity list of referrer property 'TInventoryInpHistList'. (NullAllowed)
     */
    public void setTInventoryInpHistList(List<TInventoryInpHist> tInventoryInpHistList) {
        _tInventoryInpHistList = tInventoryInpHistList;
    }

    /** t_inventory_receive_label by INVENTORY_B_ID, named 'TInventoryReceiveLabelList'. */
    protected List<TInventoryReceiveLabel> _tInventoryReceiveLabelList;

    /**
     * [get] t_inventory_receive_label by INVENTORY_B_ID, named 'TInventoryReceiveLabelList'.
     * @return The entity list of referrer property 'TInventoryReceiveLabelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryReceiveLabel> getTInventoryReceiveLabelList() {
        if (_tInventoryReceiveLabelList == null) { _tInventoryReceiveLabelList = newReferrerList(); }
        return _tInventoryReceiveLabelList;
    }

    /**
     * [set] t_inventory_receive_label by INVENTORY_B_ID, named 'TInventoryReceiveLabelList'.
     * @param tInventoryReceiveLabelList The entity list of referrer property 'TInventoryReceiveLabelList'. (NullAllowed)
     */
    public void setTInventoryReceiveLabelList(List<TInventoryReceiveLabel> tInventoryReceiveLabelList) {
        _tInventoryReceiveLabelList = tInventoryReceiveLabelList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTInventoryB) {
            BsTInventoryB other = (BsTInventoryB)obj;
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
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_tLot != null)
        { sb.append(li).append(xbRDS(_tLot, "tLot")); }
        if (_mWarehouse != null)
        { sb.append(li).append(xbRDS(_mWarehouse, "mWarehouse")); }
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_bUserByInventoryUpdUserId != null)
        { sb.append(li).append(xbRDS(_bUserByInventoryUpdUserId, "bUserByInventoryUpdUserId")); }
        if (_tMoveInstH != null)
        { sb.append(li).append(xbRDS(_tMoveInstH, "tMoveInstH")); }
        if (_mSalesOrg != null)
        { sb.append(li).append(xbRDS(_mSalesOrg, "mSalesOrg")); }
        if (_mCustomerByAccountId != null)
        { sb.append(li).append(xbRDS(_mCustomerByAccountId, "mCustomerByAccountId")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_bUserByInventoryUserId != null)
        { sb.append(li).append(xbRDS(_bUserByInventoryUserId, "bUserByInventoryUserId")); }
        if (_tStock != null)
        { sb.append(li).append(xbRDS(_tStock, "tStock")); }
        if (_tInventoryH != null)
        { sb.append(li).append(xbRDS(_tInventoryH, "tInventoryH")); }
        if (_tStoreNo != null)
        { sb.append(li).append(xbRDS(_tStoreNo, "tStoreNo")); }
        if (_mCustomerByDepositId != null)
        { sb.append(li).append(xbRDS(_mCustomerByDepositId, "mCustomerByDepositId")); }
        if (_mCustomerBySupplierId != null)
        { sb.append(li).append(xbRDS(_mCustomerBySupplierId, "mCustomerBySupplierId")); }
        if (_bClassDtlByInputType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInputType, "bClassDtlByInputType")); }
        if (_bClassDtlByStockAdjustFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockAdjustFlg, "bClassDtlByStockAdjustFlg")); }
        if (_tInventoryRAsOne != null)
        { sb.append(li).append(xbRDS(_tInventoryRAsOne, "tInventoryRAsOne")); }
        if (_tInventoryInpHistList != null) { for (TInventoryInpHist et : _tInventoryInpHistList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryInpHistList")); } } }
        if (_tInventoryReceiveLabelList != null) { for (TInventoryReceiveLabel et : _tInventoryReceiveLabelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryReceiveLabelList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_inventoryHId));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_storeNoId));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_supplierId));
        sb.append(dm).append(xfND(_supplierCd));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_moveNum));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_inputType));
        sb.append(dm).append(xfND(_stockAdjustFlg));
        sb.append(dm).append(xfND(_moveInstHId));
        sb.append(dm).append(xfND(_htInputInventoryNum));
        sb.append(dm).append(xfND(_webInputInventoryNum));
        sb.append(dm).append(xfND(_ajisInputInventoryNum));
        sb.append(dm).append(xfND(_prodDt));
        sb.append(dm).append(xfND(_areaCd));
        sb.append(dm).append(xfND(_salesOrgId));
        sb.append(dm).append(xfND(_accountId));
        sb.append(dm).append(xfND(_allocTypeCd));
        sb.append(dm).append(xfND(_s4SendFlg));
        sb.append(dm).append(xfND(_cmSendFlg));
        sb.append(dm).append(xfND(_inventoryUserId));
        sb.append(dm).append(xfND(_inventoryUpdUserId));
        sb.append(dm).append(xfND(_receiveDt));
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
        if (_tLot != null)
        { sb.append(dm).append("tLot"); }
        if (_mWarehouse != null)
        { sb.append(dm).append("mWarehouse"); }
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_bUserByInventoryUpdUserId != null)
        { sb.append(dm).append("bUserByInventoryUpdUserId"); }
        if (_tMoveInstH != null)
        { sb.append(dm).append("tMoveInstH"); }
        if (_mSalesOrg != null)
        { sb.append(dm).append("mSalesOrg"); }
        if (_mCustomerByAccountId != null)
        { sb.append(dm).append("mCustomerByAccountId"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_bUserByInventoryUserId != null)
        { sb.append(dm).append("bUserByInventoryUserId"); }
        if (_tStock != null)
        { sb.append(dm).append("tStock"); }
        if (_tInventoryH != null)
        { sb.append(dm).append("tInventoryH"); }
        if (_tStoreNo != null)
        { sb.append(dm).append("tStoreNo"); }
        if (_mCustomerByDepositId != null)
        { sb.append(dm).append("mCustomerByDepositId"); }
        if (_mCustomerBySupplierId != null)
        { sb.append(dm).append("mCustomerBySupplierId"); }
        if (_bClassDtlByInputType != null)
        { sb.append(dm).append("bClassDtlByInputType"); }
        if (_bClassDtlByStockAdjustFlg != null)
        { sb.append(dm).append("bClassDtlByStockAdjustFlg"); }
        if (_tInventoryRAsOne != null)
        { sb.append(dm).append("tInventoryRAsOne"); }
        if (_tInventoryInpHistList != null && !_tInventoryInpHistList.isEmpty())
        { sb.append(dm).append("tInventoryInpHistList"); }
        if (_tInventoryReceiveLabelList != null && !_tInventoryReceiveLabelList.isEmpty())
        { sb.append(dm).append("tInventoryReceiveLabelList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TInventoryB clone() {
        return (TInventoryB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
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
     * [get] PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
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
     * [get] STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} <br>
     * 入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreNoId() {
        checkSpecifiedProperty("storeNoId");
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} <br>
     * 入庫No.ID
     * @param storeNoId The value of the column 'STORE_NO_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreNoId(Long storeNoId) {
        registerModifiedProperty("storeNoId");
        _storeNoId = storeNoId;
    }

    /**
     * [get] STORE_LABEL_NO: {IX, VARCHAR(30)} <br>
     * 入庫ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] STORE_LABEL_NO: {IX, VARCHAR(30)} <br>
     * 入庫ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        registerModifiedProperty("storeLabelNo");
        _storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {VARCHAR(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {VARCHAR(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 仕入先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplierId() {
        checkSpecifiedProperty("supplierId");
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 仕入先ID
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierId(Long supplierId) {
        registerModifiedProperty("supplierId");
        _supplierId = supplierId;
    }

    /**
     * [get] SUPPLIER_CD: {VARCHAR(30)} <br>
     * 仕入先CD
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierCd() {
        checkSpecifiedProperty("supplierCd");
        return convertEmptyToNull(_supplierCd);
    }

    /**
     * [set] SUPPLIER_CD: {VARCHAR(30)} <br>
     * 仕入先CD
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierCd(String supplierCd) {
        registerModifiedProperty("supplierCd");
        _supplierCd = supplierCd;
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
     * [get] UNIT_NUM: {BIGINT(19)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitNum() {
        checkSpecifiedProperty("unitNum");
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {BIGINT(19)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNum(Long unitNum) {
        registerModifiedProperty("unitNum");
        _unitNum = unitNum;
    }

    /**
     * [get] CHARGE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 引当可能数
     * @return The value of the column 'CHARGE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 引当可能数
     * @param chargeNum The value of the column 'CHARGE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 引当済数
     * @return The value of the column 'ALLOC_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getAllocNum() {
        checkSpecifiedProperty("allocNum");
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 引当済数
     * @param allocNum The value of the column 'ALLOC_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        registerModifiedProperty("allocNum");
        _allocNum = allocNum;
    }

    /**
     * [get] MOVE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 移動中数
     * @return The value of the column 'MOVE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getMoveNum() {
        checkSpecifiedProperty("moveNum");
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 移動中数
     * @param moveNum The value of the column 'MOVE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        registerModifiedProperty("moveNum");
        _moveNum = moveNum;
    }

    /**
     * [get] INVENTORY_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 棚卸数
     * @return The value of the column 'INVENTORY_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 棚卸数
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInputType() {
        checkSpecifiedProperty("inputType");
        return convertEmptyToNull(_inputType);
    }

    /**
     * [set] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInputType(String inputType) {
        registerModifiedProperty("inputType");
        _inputType = inputType;
    }

    /**
     * [get] STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @return The value of the column 'STOCK_ADJUST_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getStockAdjustFlg() {
        checkSpecifiedProperty("stockAdjustFlg");
        return convertEmptyToNull(_stockAdjustFlg);
    }

    /**
     * [set] STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param stockAdjustFlg The value of the column 'STOCK_ADJUST_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setStockAdjustFlg(String stockAdjustFlg) {
        registerModifiedProperty("stockAdjustFlg");
        _stockAdjustFlg = stockAdjustFlg;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, BIGINT(19), FK to t_move_inst_h} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMoveInstHId() {
        checkSpecifiedProperty("moveInstHId");
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, BIGINT(19), FK to t_move_inst_h} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveInstHId(Long moveInstHId) {
        registerModifiedProperty("moveInstHId");
        _moveInstHId = moveInstHId;
    }

    /**
     * [get] HT_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * HT入力棚卸数量
     * @return The value of the column 'HT_INPUT_INVENTORY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getHtInputInventoryNum() {
        checkSpecifiedProperty("htInputInventoryNum");
        return _htInputInventoryNum;
    }

    /**
     * [set] HT_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * HT入力棚卸数量
     * @param htInputInventoryNum The value of the column 'HT_INPUT_INVENTORY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtInputInventoryNum(java.math.BigDecimal htInputInventoryNum) {
        registerModifiedProperty("htInputInventoryNum");
        _htInputInventoryNum = htInputInventoryNum;
    }

    /**
     * [get] WEB_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 画面入力棚卸数量
     * @return The value of the column 'WEB_INPUT_INVENTORY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWebInputInventoryNum() {
        checkSpecifiedProperty("webInputInventoryNum");
        return _webInputInventoryNum;
    }

    /**
     * [set] WEB_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 画面入力棚卸数量
     * @param webInputInventoryNum The value of the column 'WEB_INPUT_INVENTORY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWebInputInventoryNum(java.math.BigDecimal webInputInventoryNum) {
        registerModifiedProperty("webInputInventoryNum");
        _webInputInventoryNum = webInputInventoryNum;
    }

    /**
     * [get] AJIS_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * エイジス取込棚卸数量
     * @return The value of the column 'AJIS_INPUT_INVENTORY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAjisInputInventoryNum() {
        checkSpecifiedProperty("ajisInputInventoryNum");
        return _ajisInputInventoryNum;
    }

    /**
     * [set] AJIS_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * エイジス取込棚卸数量
     * @param ajisInputInventoryNum The value of the column 'AJIS_INPUT_INVENTORY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAjisInputInventoryNum(java.math.BigDecimal ajisInputInventoryNum) {
        registerModifiedProperty("ajisInputInventoryNum");
        _ajisInputInventoryNum = ajisInputInventoryNum;
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
     * [get] AREA_CD: {VARCHAR(30)} <br>
     * エリア
     * @return The value of the column 'AREA_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAreaCd() {
        checkSpecifiedProperty("areaCd");
        return convertEmptyToNull(_areaCd);
    }

    /**
     * [set] AREA_CD: {VARCHAR(30)} <br>
     * エリア
     * @param areaCd The value of the column 'AREA_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAreaCd(String areaCd) {
        registerModifiedProperty("areaCd");
        _areaCd = areaCd;
    }

    /**
     * [get] SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSalesOrgId() {
        checkSpecifiedProperty("salesOrgId");
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgId(Long salesOrgId) {
        registerModifiedProperty("salesOrgId");
        _salesOrgId = salesOrgId;
    }

    /**
     * [get] ACCOUNT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 得意先ID
     * @return The value of the column 'ACCOUNT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAccountId() {
        checkSpecifiedProperty("accountId");
        return _accountId;
    }

    /**
     * [set] ACCOUNT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 得意先ID
     * @param accountId The value of the column 'ACCOUNT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAccountId(Long accountId) {
        registerModifiedProperty("accountId");
        _accountId = accountId;
    }

    /**
     * [get] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @return The value of the column 'ALLOC_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocTypeCd() {
        checkSpecifiedProperty("allocTypeCd");
        return convertEmptyToNull(_allocTypeCd);
    }

    /**
     * [set] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @param allocTypeCd The value of the column 'ALLOC_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocTypeCd(String allocTypeCd) {
        registerModifiedProperty("allocTypeCd");
        _allocTypeCd = allocTypeCd;
    }

    /**
     * [get] S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getS4SendFlg() {
        checkSpecifiedProperty("s4SendFlg");
        return convertEmptyToNull(_s4SendFlg);
    }

    /**
     * [set] S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setS4SendFlg(String s4SendFlg) {
        registerModifiedProperty("s4SendFlg");
        _s4SendFlg = s4SendFlg;
    }

    /**
     * [get] CM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ
     * @return The value of the column 'CM_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCmSendFlg() {
        checkSpecifiedProperty("cmSendFlg");
        return convertEmptyToNull(_cmSendFlg);
    }

    /**
     * [set] CM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ
     * @param cmSendFlg The value of the column 'CM_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCmSendFlg(String cmSendFlg) {
        registerModifiedProperty("cmSendFlg");
        _cmSendFlg = cmSendFlg;
    }

    /**
     * [get] INVENTORY_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸担当者ID
     * @return The value of the column 'INVENTORY_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryUserId() {
        checkSpecifiedProperty("inventoryUserId");
        return _inventoryUserId;
    }

    /**
     * [set] INVENTORY_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸担当者ID
     * @param inventoryUserId The value of the column 'INVENTORY_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryUserId(Long inventoryUserId) {
        registerModifiedProperty("inventoryUserId");
        _inventoryUserId = inventoryUserId;
    }

    /**
     * [get] INVENTORY_UPD_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸変更担当者ID
     * @return The value of the column 'INVENTORY_UPD_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryUpdUserId() {
        checkSpecifiedProperty("inventoryUpdUserId");
        return _inventoryUpdUserId;
    }

    /**
     * [set] INVENTORY_UPD_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸変更担当者ID
     * @param inventoryUpdUserId The value of the column 'INVENTORY_UPD_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryUpdUserId(Long inventoryUpdUserId) {
        registerModifiedProperty("inventoryUpdUserId");
        _inventoryUpdUserId = inventoryUpdUserId;
    }

    /**
     * [get] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @return The value of the column 'RECEIVE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDt() {
        checkSpecifiedProperty("receiveDt");
        return convertEmptyToNull(_receiveDt);
    }

    /**
     * [set] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @param receiveDt The value of the column 'RECEIVE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDt(String receiveDt) {
        registerModifiedProperty("receiveDt");
        _receiveDt = receiveDt;
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
