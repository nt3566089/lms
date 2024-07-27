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
 * The entity of m_location as TABLE. <br>
 * ロケーションマスタ
 * <pre>
 * [primary-key]
 *     LOCATION_ID
 *
 * [column]
 *     LOCATION_ID, CENTER_ID, ZONE_ID, LOCATION_CD, LOCATION_NM, PICKING_LOCATION_FLG, PICKING_ORDER, LOCATION_TYPE, ALLOC_ORDER, ALLOC_NG_FLG, REPLENISH_PRODUCT_ID, REPLENISH_STOCK_TYPE_ID, REPLENISH_DEPOSIT_ID, REPLENISH_P_NUM, REPLENISH_P_PRODUCT_SHAPE_ID, MAX_STORE_NUM, MAX_STORE_PRODUCT_SHAPE_ID, EXTERNAL_WH_FLG, LOCATION_ATTRIBUTE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_customer, m_product_shape, m_zone, m_center, m_product, m_stock_type, b_class_dtl(ByAllocNgFlg)
 *
 * [referrer table]
 *     h_location_attribute, m_location_replenish_product, t_alloc_inst_b, t_inventory_b, t_move_inst_b, t_move_record_b, t_receive_plan_b, t_shipping_inst_b, t_stock, t_store_record_b, w_ht_inventory_input_prod, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_shipping_picking, w_ht_total_picking
 *
 * [foreign property]
 *     mCustomer, mProductShapeByMaxStoreProductShapeId, mProductShapeByReplenishPProductShapeId, mZone, mCenter, mProduct, mStockType, bClassDtlByAllocNgFlg, bClassDtlByDelFlg, bClassDtlByLocationType, bClassDtlByPickingLocationFlg
 *
 * [referrer property]
 *     hLocationAttributeList, mLocationReplenishProductList, tAllocInstBList, tInventoryBList, tMoveInstBList, tMoveRecordBList, tReceivePlanBList, tShippingInstBList, tStockList, tStoreRecordBList, wHtInventoryInputProdList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingPickingList, wHtTotalPickingList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long locationId = entity.getLocationId();
 * Long centerId = entity.getCenterId();
 * Long zoneId = entity.getZoneId();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * String pickingLocationFlg = entity.getPickingLocationFlg();
 * Long pickingOrder = entity.getPickingOrder();
 * String locationType = entity.getLocationType();
 * Long allocOrder = entity.getAllocOrder();
 * String allocNgFlg = entity.getAllocNgFlg();
 * Long replenishProductId = entity.getReplenishProductId();
 * Long replenishStockTypeId = entity.getReplenishStockTypeId();
 * Long replenishDepositId = entity.getReplenishDepositId();
 * java.math.BigDecimal replenishPNum = entity.getReplenishPNum();
 * Long replenishPProductShapeId = entity.getReplenishPProductShapeId();
 * java.math.BigDecimal maxStoreNum = entity.getMaxStoreNum();
 * Long maxStoreProductShapeId = entity.getMaxStoreProductShapeId();
 * String externalWhFlg = entity.getExternalWhFlg();
 * String locationAttribute = entity.getLocationAttribute();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setLocationId(locationId);
 * entity.setCenterId(centerId);
 * entity.setZoneId(zoneId);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setPickingLocationFlg(pickingLocationFlg);
 * entity.setPickingOrder(pickingOrder);
 * entity.setLocationType(locationType);
 * entity.setAllocOrder(allocOrder);
 * entity.setAllocNgFlg(allocNgFlg);
 * entity.setReplenishProductId(replenishProductId);
 * entity.setReplenishStockTypeId(replenishStockTypeId);
 * entity.setReplenishDepositId(replenishDepositId);
 * entity.setReplenishPNum(replenishPNum);
 * entity.setReplenishPProductShapeId(replenishPProductShapeId);
 * entity.setMaxStoreNum(maxStoreNum);
 * entity.setMaxStoreProductShapeId(maxStoreProductShapeId);
 * entity.setExternalWhFlg(externalWhFlg);
 * entity.setLocationAttribute(locationAttribute);
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
public abstract class BsMLocation extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOCATION_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _locationId;

    /** CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone} */
    protected Long _zoneId;

    /** LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)} */
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(60)} */
    protected String _locationNm;

    /** PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} */
    protected String _pickingLocationFlg;

    /** PICKING_ORDER: {BIGINT(19)} */
    protected Long _pickingOrder;

    /** LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} */
    protected String _locationType;

    /** ALLOC_ORDER: {BIGINT(19)} */
    protected Long _allocOrder;

    /** ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} */
    protected String _allocNgFlg;

    /** REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product} */
    protected Long _replenishProductId;

    /** REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    protected Long _replenishStockTypeId;

    /** REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _replenishDepositId;

    /** REPLENISH_P_NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _replenishPNum;

    /** REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape} */
    protected Long _replenishPProductShapeId;

    /** MAX_STORE_NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _maxStoreNum;

    /** MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape} */
    protected Long _maxStoreProductShapeId;

    /** EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _externalWhFlg;

    /** LOCATION_ATTRIBUTE: {VARCHAR(30)} */
    protected String _locationAttribute;

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
        return "m_location";
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
        if (_locationId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerId : UQ+, NotNull, BIGINT(19), FK to m_center. (NotNull)
     * @param locationCd : +UQ, IX, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(Long centerId, String locationCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("locationCd");
        setCenterId(centerId);setLocationCd(locationCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of pickingLocationFlg as the classification of PickingLocationFlg. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PickingLocationFlg getPickingLocationFlgAsPickingLocationFlg() {
        return CDef.PickingLocationFlg.codeOf(getPickingLocationFlg());
    }

    /**
     * Set the value of pickingLocationFlg as the classification of PickingLocationFlg. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPickingLocationFlgAsPickingLocationFlg(CDef.PickingLocationFlg cdef) {
        setPickingLocationFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of locationType as the classification of LocationType. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LocationType getLocationTypeAsLocationType() {
        return CDef.LocationType.codeOf(getLocationType());
    }

    /**
     * Set the value of locationType as the classification of LocationType. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLocationTypeAsLocationType(CDef.LocationType cdef) {
        setLocationType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of allocNgFlg as the classification of AllcNgFlg. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AllcNgFlg getAllocNgFlgAsAllcNgFlg() {
        return CDef.AllcNgFlg.codeOf(getAllocNgFlg());
    }

    /**
     * Set the value of allocNgFlg as the classification of AllcNgFlg. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAllocNgFlgAsAllcNgFlg(CDef.AllcNgFlg cdef) {
        setAllocNgFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of pickingLocationFlg as $1 (1). <br>
     * $1: ピックロケーション
     */
    public void setPickingLocationFlg_$1() {
        setPickingLocationFlgAsPickingLocationFlg(CDef.PickingLocationFlg.$1);
    }

    /**
     * Set the value of pickingLocationFlg as $0 (0). <br>
     * $0: ピックロケーション以外
     */
    public void setPickingLocationFlg_$0() {
        setPickingLocationFlgAsPickingLocationFlg(CDef.PickingLocationFlg.$0);
    }

    /**
     * Set the value of locationType as $00 (00). <br>
     * $00: 通常ロケーション
     */
    public void setLocationType_$00() {
        setLocationTypeAsLocationType(CDef.LocationType.$00);
    }

    /**
     * Set the value of locationType as $01 (01). <br>
     * $01: 入庫仮ロケーション
     */
    public void setLocationType_$01() {
        setLocationTypeAsLocationType(CDef.LocationType.$01);
    }

    /**
     * Set the value of allocNgFlg as $0 (0). <br>
     * $0: 引当可能
     */
    public void setAllocNgFlg_$0() {
        setAllocNgFlgAsAllcNgFlg(CDef.AllcNgFlg.$0);
    }

    /**
     * Set the value of allocNgFlg as $1 (1). <br>
     * $1: 引当禁止
     */
    public void setAllocNgFlg_$1() {
        setAllocNgFlgAsAllcNgFlg(CDef.AllcNgFlg.$1);
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
     * Is the value of pickingLocationFlg $1? <br>
     * $1: ピックロケーション
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingLocationFlg$1() {
        CDef.PickingLocationFlg cdef = getPickingLocationFlgAsPickingLocationFlg();
        return cdef != null ? cdef.equals(CDef.PickingLocationFlg.$1) : false;
    }

    /**
     * Is the value of pickingLocationFlg $0? <br>
     * $0: ピックロケーション以外
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPickingLocationFlg$0() {
        CDef.PickingLocationFlg cdef = getPickingLocationFlgAsPickingLocationFlg();
        return cdef != null ? cdef.equals(CDef.PickingLocationFlg.$0) : false;
    }

    /**
     * Is the value of locationType $00? <br>
     * $00: 通常ロケーション
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLocationType$00() {
        CDef.LocationType cdef = getLocationTypeAsLocationType();
        return cdef != null ? cdef.equals(CDef.LocationType.$00) : false;
    }

    /**
     * Is the value of locationType $01? <br>
     * $01: 入庫仮ロケーション
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLocationType$01() {
        CDef.LocationType cdef = getLocationTypeAsLocationType();
        return cdef != null ? cdef.equals(CDef.LocationType.$01) : false;
    }

    /**
     * Is the value of allocNgFlg $0? <br>
     * $0: 引当可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAllocNgFlg$0() {
        CDef.AllcNgFlg cdef = getAllocNgFlgAsAllcNgFlg();
        return cdef != null ? cdef.equals(CDef.AllcNgFlg.$0) : false;
    }

    /**
     * Is the value of allocNgFlg $1? <br>
     * $1: 引当禁止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAllocNgFlg$1() {
        CDef.AllcNgFlg cdef = getAllocNgFlgAsAllcNgFlg();
        return cdef != null ? cdef.equals(CDef.AllcNgFlg.$1) : false;
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
     * Get the value of the column 'pickingLocationFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPickingLocationFlgName() {
        CDef.PickingLocationFlg cdef = getPickingLocationFlgAsPickingLocationFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'locationType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLocationTypeName() {
        CDef.LocationType cdef = getLocationTypeAsLocationType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'allocNgFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAllocNgFlgName() {
        CDef.AllcNgFlg cdef = getAllocNgFlgAsAllcNgFlg();
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
    /** m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShapeByMaxStoreProductShapeId'. */
    protected MProductShape _mProductShapeByMaxStoreProductShapeId;

    /**
     * [get] m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShapeByMaxStoreProductShapeId'. <br>
     * @return The entity of foreign property 'MProductShapeByMaxStoreProductShapeId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProductShape getMProductShapeByMaxStoreProductShapeId() {
        return _mProductShapeByMaxStoreProductShapeId;
    }

    /**
     * [set] m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShapeByMaxStoreProductShapeId'.
     * @param mProductShapeByMaxStoreProductShapeId The entity of foreign property 'MProductShapeByMaxStoreProductShapeId'. (NullAllowed)
     */
    public void setMProductShapeByMaxStoreProductShapeId(MProductShape mProductShapeByMaxStoreProductShapeId) {
        _mProductShapeByMaxStoreProductShapeId = mProductShapeByMaxStoreProductShapeId;
    }

    /** m_product_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MProductShapeByReplenishPProductShapeId'. */
    protected MProductShape _mProductShapeByReplenishPProductShapeId;

    /**
     * [get] m_product_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MProductShapeByReplenishPProductShapeId'. <br>
     * @return The entity of foreign property 'MProductShapeByReplenishPProductShapeId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProductShape getMProductShapeByReplenishPProductShapeId() {
        return _mProductShapeByReplenishPProductShapeId;
    }

    /**
     * [set] m_product_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MProductShapeByReplenishPProductShapeId'.
     * @param mProductShapeByReplenishPProductShapeId The entity of foreign property 'MProductShapeByReplenishPProductShapeId'. (NullAllowed)
     */
    public void setMProductShapeByReplenishPProductShapeId(MProductShape mProductShapeByReplenishPProductShapeId) {
        _mProductShapeByReplenishPProductShapeId = mProductShapeByReplenishPProductShapeId;
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

    /** m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'. */
    protected MProduct _mProduct;

    /**
     * [get] m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'. <br>
     * @return The entity of foreign property 'MProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProduct getMProduct() {
        return _mProduct;
    }

    /**
     * [set] m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @param mProduct The entity of foreign property 'MProduct'. (NullAllowed)
     */
    public void setMProduct(MProduct mProduct) {
        _mProduct = mProduct;
    }

    /** m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'. */
    protected MStockType _mStockType;

    /**
     * [get] m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'. <br>
     * @return The entity of foreign property 'MStockType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MStockType getMStockType() {
        return _mStockType;
    }

    /**
     * [set] m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @param mStockType The entity of foreign property 'MStockType'. (NullAllowed)
     */
    public void setMStockType(MStockType mStockType) {
        _mStockType = mStockType;
    }

    /** b_class_dtl by my ALLOC_NG_FLG, named 'BClassDtlByAllocNgFlg'. */
    protected BClassDtl _bClassDtlByAllocNgFlg;

    /**
     * [get] b_class_dtl by my ALLOC_NG_FLG, named 'BClassDtlByAllocNgFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByAllocNgFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAllocNgFlg() {
        return _bClassDtlByAllocNgFlg;
    }

    /**
     * [set] b_class_dtl by my ALLOC_NG_FLG, named 'BClassDtlByAllocNgFlg'.
     * @param bClassDtlByAllocNgFlg The entity of foreign property 'BClassDtlByAllocNgFlg'. (NullAllowed)
     */
    public void setBClassDtlByAllocNgFlg(BClassDtl bClassDtlByAllocNgFlg) {
        _bClassDtlByAllocNgFlg = bClassDtlByAllocNgFlg;
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

    /** b_class_dtl by my LOCATION_TYPE, named 'BClassDtlByLocationType'. */
    protected BClassDtl _bClassDtlByLocationType;

    /**
     * [get] b_class_dtl by my LOCATION_TYPE, named 'BClassDtlByLocationType'. <br>
     * @return The entity of foreign property 'BClassDtlByLocationType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLocationType() {
        return _bClassDtlByLocationType;
    }

    /**
     * [set] b_class_dtl by my LOCATION_TYPE, named 'BClassDtlByLocationType'.
     * @param bClassDtlByLocationType The entity of foreign property 'BClassDtlByLocationType'. (NullAllowed)
     */
    public void setBClassDtlByLocationType(BClassDtl bClassDtlByLocationType) {
        _bClassDtlByLocationType = bClassDtlByLocationType;
    }

    /** b_class_dtl by my PICKING_LOCATION_FLG, named 'BClassDtlByPickingLocationFlg'. */
    protected BClassDtl _bClassDtlByPickingLocationFlg;

    /**
     * [get] b_class_dtl by my PICKING_LOCATION_FLG, named 'BClassDtlByPickingLocationFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPickingLocationFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPickingLocationFlg() {
        return _bClassDtlByPickingLocationFlg;
    }

    /**
     * [set] b_class_dtl by my PICKING_LOCATION_FLG, named 'BClassDtlByPickingLocationFlg'.
     * @param bClassDtlByPickingLocationFlg The entity of foreign property 'BClassDtlByPickingLocationFlg'. (NullAllowed)
     */
    public void setBClassDtlByPickingLocationFlg(BClassDtl bClassDtlByPickingLocationFlg) {
        _bClassDtlByPickingLocationFlg = bClassDtlByPickingLocationFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** h_location_attribute by LOCATION_ID, named 'HLocationAttributeList'. */
    protected List<HLocationAttribute> _hLocationAttributeList;

    /**
     * [get] h_location_attribute by LOCATION_ID, named 'HLocationAttributeList'.
     * @return The entity list of referrer property 'HLocationAttributeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HLocationAttribute> getHLocationAttributeList() {
        if (_hLocationAttributeList == null) { _hLocationAttributeList = newReferrerList(); }
        return _hLocationAttributeList;
    }

    /**
     * [set] h_location_attribute by LOCATION_ID, named 'HLocationAttributeList'.
     * @param hLocationAttributeList The entity list of referrer property 'HLocationAttributeList'. (NullAllowed)
     */
    public void setHLocationAttributeList(List<HLocationAttribute> hLocationAttributeList) {
        _hLocationAttributeList = hLocationAttributeList;
    }

    /** m_location_replenish_product by LOCATION_ID, named 'MLocationReplenishProductList'. */
    protected List<MLocationReplenishProduct> _mLocationReplenishProductList;

    /**
     * [get] m_location_replenish_product by LOCATION_ID, named 'MLocationReplenishProductList'.
     * @return The entity list of referrer property 'MLocationReplenishProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocationReplenishProduct> getMLocationReplenishProductList() {
        if (_mLocationReplenishProductList == null) { _mLocationReplenishProductList = newReferrerList(); }
        return _mLocationReplenishProductList;
    }

    /**
     * [set] m_location_replenish_product by LOCATION_ID, named 'MLocationReplenishProductList'.
     * @param mLocationReplenishProductList The entity list of referrer property 'MLocationReplenishProductList'. (NullAllowed)
     */
    public void setMLocationReplenishProductList(List<MLocationReplenishProduct> mLocationReplenishProductList) {
        _mLocationReplenishProductList = mLocationReplenishProductList;
    }

    /** t_alloc_inst_b by LOCATION_ID, named 'TAllocInstBList'. */
    protected List<TAllocInstB> _tAllocInstBList;

    /**
     * [get] t_alloc_inst_b by LOCATION_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = newReferrerList(); }
        return _tAllocInstBList;
    }

    /**
     * [set] t_alloc_inst_b by LOCATION_ID, named 'TAllocInstBList'.
     * @param tAllocInstBList The entity list of referrer property 'TAllocInstBList'. (NullAllowed)
     */
    public void setTAllocInstBList(List<TAllocInstB> tAllocInstBList) {
        _tAllocInstBList = tAllocInstBList;
    }

    /** t_inventory_b by LOCATION_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] t_inventory_b by LOCATION_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] t_inventory_b by LOCATION_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** t_move_inst_b by LOCATION_ID, named 'TMoveInstBList'. */
    protected List<TMoveInstB> _tMoveInstBList;

    /**
     * [get] t_move_inst_b by LOCATION_ID, named 'TMoveInstBList'.
     * @return The entity list of referrer property 'TMoveInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = newReferrerList(); }
        return _tMoveInstBList;
    }

    /**
     * [set] t_move_inst_b by LOCATION_ID, named 'TMoveInstBList'.
     * @param tMoveInstBList The entity list of referrer property 'TMoveInstBList'. (NullAllowed)
     */
    public void setTMoveInstBList(List<TMoveInstB> tMoveInstBList) {
        _tMoveInstBList = tMoveInstBList;
    }

    /** t_move_record_b by LOCATION_ID, named 'TMoveRecordBList'. */
    protected List<TMoveRecordB> _tMoveRecordBList;

    /**
     * [get] t_move_record_b by LOCATION_ID, named 'TMoveRecordBList'.
     * @return The entity list of referrer property 'TMoveRecordBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveRecordB> getTMoveRecordBList() {
        if (_tMoveRecordBList == null) { _tMoveRecordBList = newReferrerList(); }
        return _tMoveRecordBList;
    }

    /**
     * [set] t_move_record_b by LOCATION_ID, named 'TMoveRecordBList'.
     * @param tMoveRecordBList The entity list of referrer property 'TMoveRecordBList'. (NullAllowed)
     */
    public void setTMoveRecordBList(List<TMoveRecordB> tMoveRecordBList) {
        _tMoveRecordBList = tMoveRecordBList;
    }

    /** t_receive_plan_b by PLAN_LOCATION_ID, named 'TReceivePlanBList'. */
    protected List<TReceivePlanB> _tReceivePlanBList;

    /**
     * [get] t_receive_plan_b by PLAN_LOCATION_ID, named 'TReceivePlanBList'.
     * @return The entity list of referrer property 'TReceivePlanBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanB> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = newReferrerList(); }
        return _tReceivePlanBList;
    }

    /**
     * [set] t_receive_plan_b by PLAN_LOCATION_ID, named 'TReceivePlanBList'.
     * @param tReceivePlanBList The entity list of referrer property 'TReceivePlanBList'. (NullAllowed)
     */
    public void setTReceivePlanBList(List<TReceivePlanB> tReceivePlanBList) {
        _tReceivePlanBList = tReceivePlanBList;
    }

    /** t_shipping_inst_b by LOCATION_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] t_shipping_inst_b by LOCATION_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] t_shipping_inst_b by LOCATION_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    /** t_stock by LOCATION_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] t_stock by LOCATION_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] t_stock by LOCATION_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    /** t_store_record_b by STORE_LOCATION_ID, named 'TStoreRecordBList'. */
    protected List<TStoreRecordB> _tStoreRecordBList;

    /**
     * [get] t_store_record_b by STORE_LOCATION_ID, named 'TStoreRecordBList'.
     * @return The entity list of referrer property 'TStoreRecordBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordB> getTStoreRecordBList() {
        if (_tStoreRecordBList == null) { _tStoreRecordBList = newReferrerList(); }
        return _tStoreRecordBList;
    }

    /**
     * [set] t_store_record_b by STORE_LOCATION_ID, named 'TStoreRecordBList'.
     * @param tStoreRecordBList The entity list of referrer property 'TStoreRecordBList'. (NullAllowed)
     */
    public void setTStoreRecordBList(List<TStoreRecordB> tStoreRecordBList) {
        _tStoreRecordBList = tStoreRecordBList;
    }

    /** w_ht_inventory_input_prod by LOC_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] w_ht_inventory_input_prod by LOC_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] w_ht_inventory_input_prod by LOC_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** w_ht_picking by LOCATION_ID, named 'WHtPickingList'. */
    protected List<WHtPicking> _wHtPickingList;

    /**
     * [get] w_ht_picking by LOCATION_ID, named 'WHtPickingList'.
     * @return The entity list of referrer property 'WHtPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtPicking> getWHtPickingList() {
        if (_wHtPickingList == null) { _wHtPickingList = newReferrerList(); }
        return _wHtPickingList;
    }

    /**
     * [set] w_ht_picking by LOCATION_ID, named 'WHtPickingList'.
     * @param wHtPickingList The entity list of referrer property 'WHtPickingList'. (NullAllowed)
     */
    public void setWHtPickingList(List<WHtPicking> wHtPickingList) {
        _wHtPickingList = wHtPickingList;
    }

    /** w_ht_receive_inspection by RCV_LOC_ID, named 'WHtReceiveInspectionList'. */
    protected List<WHtReceiveInspection> _wHtReceiveInspectionList;

    /**
     * [get] w_ht_receive_inspection by RCV_LOC_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = newReferrerList(); }
        return _wHtReceiveInspectionList;
    }

    /**
     * [set] w_ht_receive_inspection by RCV_LOC_ID, named 'WHtReceiveInspectionList'.
     * @param wHtReceiveInspectionList The entity list of referrer property 'WHtReceiveInspectionList'. (NullAllowed)
     */
    public void setWHtReceiveInspectionList(List<WHtReceiveInspection> wHtReceiveInspectionList) {
        _wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    /** w_ht_receive_no_plan_insp by RCV_LOC_ID, named 'WHtReceiveNoPlanInspList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspList;

    /**
     * [get] w_ht_receive_no_plan_insp by RCV_LOC_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = newReferrerList(); }
        return _wHtReceiveNoPlanInspList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by RCV_LOC_ID, named 'WHtReceiveNoPlanInspList'.
     * @param wHtReceiveNoPlanInspList The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspList) {
        _wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    /** w_ht_receive_store by LOC_ID, named 'WHtReceiveStoreList'. */
    protected List<WHtReceiveStore> _wHtReceiveStoreList;

    /**
     * [get] w_ht_receive_store by LOC_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = newReferrerList(); }
        return _wHtReceiveStoreList;
    }

    /**
     * [set] w_ht_receive_store by LOC_ID, named 'WHtReceiveStoreList'.
     * @param wHtReceiveStoreList The entity list of referrer property 'WHtReceiveStoreList'. (NullAllowed)
     */
    public void setWHtReceiveStoreList(List<WHtReceiveStore> wHtReceiveStoreList) {
        _wHtReceiveStoreList = wHtReceiveStoreList;
    }

    /** w_ht_shipping_picking by LOCATION_ID, named 'WHtShippingPickingList'. */
    protected List<WHtShippingPicking> _wHtShippingPickingList;

    /**
     * [get] w_ht_shipping_picking by LOCATION_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = newReferrerList(); }
        return _wHtShippingPickingList;
    }

    /**
     * [set] w_ht_shipping_picking by LOCATION_ID, named 'WHtShippingPickingList'.
     * @param wHtShippingPickingList The entity list of referrer property 'WHtShippingPickingList'. (NullAllowed)
     */
    public void setWHtShippingPickingList(List<WHtShippingPicking> wHtShippingPickingList) {
        _wHtShippingPickingList = wHtShippingPickingList;
    }

    /** w_ht_total_picking by LOCATION_ID, named 'WHtTotalPickingList'. */
    protected List<WHtTotalPicking> _wHtTotalPickingList;

    /**
     * [get] w_ht_total_picking by LOCATION_ID, named 'WHtTotalPickingList'.
     * @return The entity list of referrer property 'WHtTotalPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtTotalPicking> getWHtTotalPickingList() {
        if (_wHtTotalPickingList == null) { _wHtTotalPickingList = newReferrerList(); }
        return _wHtTotalPickingList;
    }

    /**
     * [set] w_ht_total_picking by LOCATION_ID, named 'WHtTotalPickingList'.
     * @param wHtTotalPickingList The entity list of referrer property 'WHtTotalPickingList'. (NullAllowed)
     */
    public void setWHtTotalPickingList(List<WHtTotalPicking> wHtTotalPickingList) {
        _wHtTotalPickingList = wHtTotalPickingList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMLocation) {
            BsMLocation other = (BsMLocation)obj;
            if (!xSV(_locationId, other._locationId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _locationId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_mProductShapeByMaxStoreProductShapeId != null)
        { sb.append(li).append(xbRDS(_mProductShapeByMaxStoreProductShapeId, "mProductShapeByMaxStoreProductShapeId")); }
        if (_mProductShapeByReplenishPProductShapeId != null)
        { sb.append(li).append(xbRDS(_mProductShapeByReplenishPProductShapeId, "mProductShapeByReplenishPProductShapeId")); }
        if (_mZone != null)
        { sb.append(li).append(xbRDS(_mZone, "mZone")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_bClassDtlByAllocNgFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAllocNgFlg, "bClassDtlByAllocNgFlg")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByLocationType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLocationType, "bClassDtlByLocationType")); }
        if (_bClassDtlByPickingLocationFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPickingLocationFlg, "bClassDtlByPickingLocationFlg")); }
        if (_hLocationAttributeList != null) { for (HLocationAttribute et : _hLocationAttributeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hLocationAttributeList")); } } }
        if (_mLocationReplenishProductList != null) { for (MLocationReplenishProduct et : _mLocationReplenishProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationReplenishProductList")); } } }
        if (_tAllocInstBList != null) { for (TAllocInstB et : _tAllocInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstBList")); } } }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tMoveInstBList != null) { for (TMoveInstB et : _tMoveInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBList")); } } }
        if (_tMoveRecordBList != null) { for (TMoveRecordB et : _tMoveRecordBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveRecordBList")); } } }
        if (_tReceivePlanBList != null) { for (TReceivePlanB et : _tReceivePlanBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanBList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
        if (_tStoreRecordBList != null) { for (TStoreRecordB et : _tStoreRecordBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordBList")); } } }
        if (_wHtInventoryInputProdList != null) { for (WHtInventoryInputProd et : _wHtInventoryInputProdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtInventoryInputProdList")); } } }
        if (_wHtPickingList != null) { for (WHtPicking et : _wHtPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtPickingList")); } } }
        if (_wHtReceiveInspectionList != null) { for (WHtReceiveInspection et : _wHtReceiveInspectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveInspectionList")); } } }
        if (_wHtReceiveNoPlanInspList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspList")); } } }
        if (_wHtReceiveStoreList != null) { for (WHtReceiveStore et : _wHtReceiveStoreList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveStoreList")); } } }
        if (_wHtShippingPickingList != null) { for (WHtShippingPicking et : _wHtShippingPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtShippingPickingList")); } } }
        if (_wHtTotalPickingList != null) { for (WHtTotalPicking et : _wHtTotalPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtTotalPickingList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_zoneId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_pickingLocationFlg));
        sb.append(dm).append(xfND(_pickingOrder));
        sb.append(dm).append(xfND(_locationType));
        sb.append(dm).append(xfND(_allocOrder));
        sb.append(dm).append(xfND(_allocNgFlg));
        sb.append(dm).append(xfND(_replenishProductId));
        sb.append(dm).append(xfND(_replenishStockTypeId));
        sb.append(dm).append(xfND(_replenishDepositId));
        sb.append(dm).append(xfND(_replenishPNum));
        sb.append(dm).append(xfND(_replenishPProductShapeId));
        sb.append(dm).append(xfND(_maxStoreNum));
        sb.append(dm).append(xfND(_maxStoreProductShapeId));
        sb.append(dm).append(xfND(_externalWhFlg));
        sb.append(dm).append(xfND(_locationAttribute));
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
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_mProductShapeByMaxStoreProductShapeId != null)
        { sb.append(dm).append("mProductShapeByMaxStoreProductShapeId"); }
        if (_mProductShapeByReplenishPProductShapeId != null)
        { sb.append(dm).append("mProductShapeByReplenishPProductShapeId"); }
        if (_mZone != null)
        { sb.append(dm).append("mZone"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_bClassDtlByAllocNgFlg != null)
        { sb.append(dm).append("bClassDtlByAllocNgFlg"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByLocationType != null)
        { sb.append(dm).append("bClassDtlByLocationType"); }
        if (_bClassDtlByPickingLocationFlg != null)
        { sb.append(dm).append("bClassDtlByPickingLocationFlg"); }
        if (_hLocationAttributeList != null && !_hLocationAttributeList.isEmpty())
        { sb.append(dm).append("hLocationAttributeList"); }
        if (_mLocationReplenishProductList != null && !_mLocationReplenishProductList.isEmpty())
        { sb.append(dm).append("mLocationReplenishProductList"); }
        if (_tAllocInstBList != null && !_tAllocInstBList.isEmpty())
        { sb.append(dm).append("tAllocInstBList"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tMoveInstBList != null && !_tMoveInstBList.isEmpty())
        { sb.append(dm).append("tMoveInstBList"); }
        if (_tMoveRecordBList != null && !_tMoveRecordBList.isEmpty())
        { sb.append(dm).append("tMoveRecordBList"); }
        if (_tReceivePlanBList != null && !_tReceivePlanBList.isEmpty())
        { sb.append(dm).append("tReceivePlanBList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
        if (_tStoreRecordBList != null && !_tStoreRecordBList.isEmpty())
        { sb.append(dm).append("tStoreRecordBList"); }
        if (_wHtInventoryInputProdList != null && !_wHtInventoryInputProdList.isEmpty())
        { sb.append(dm).append("wHtInventoryInputProdList"); }
        if (_wHtPickingList != null && !_wHtPickingList.isEmpty())
        { sb.append(dm).append("wHtPickingList"); }
        if (_wHtReceiveInspectionList != null && !_wHtReceiveInspectionList.isEmpty())
        { sb.append(dm).append("wHtReceiveInspectionList"); }
        if (_wHtReceiveNoPlanInspList != null && !_wHtReceiveNoPlanInspList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspList"); }
        if (_wHtReceiveStoreList != null && !_wHtReceiveStoreList.isEmpty())
        { sb.append(dm).append("wHtReceiveStoreList"); }
        if (_wHtShippingPickingList != null && !_wHtShippingPickingList.isEmpty())
        { sb.append(dm).append("wHtShippingPickingList"); }
        if (_wHtTotalPickingList != null && !_wHtTotalPickingList.isEmpty())
        { sb.append(dm).append("wHtTotalPickingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MLocation clone() {
        return (MLocation)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOCATION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
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
     * [get] ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone} <br>
     * ゾーンID
     * @return The value of the column 'ZONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getZoneId() {
        checkSpecifiedProperty("zoneId");
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone} <br>
     * ゾーンID
     * @param zoneId The value of the column 'ZONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setZoneId(Long zoneId) {
        registerModifiedProperty("zoneId");
        _zoneId = zoneId;
    }

    /**
     * [get] LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (basically NotNull if update: for the constraint)
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
     * [get] PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @return The value of the column 'PICKING_LOCATION_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPickingLocationFlg() {
        checkSpecifiedProperty("pickingLocationFlg");
        return convertEmptyToNull(_pickingLocationFlg);
    }

    /**
     * [set] PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @param pickingLocationFlg The value of the column 'PICKING_LOCATION_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setPickingLocationFlg(String pickingLocationFlg) {
        registerModifiedProperty("pickingLocationFlg");
        _pickingLocationFlg = pickingLocationFlg;
    }

    /**
     * [get] PICKING_ORDER: {BIGINT(19)} <br>
     * ピッキング順序
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingOrder() {
        checkSpecifiedProperty("pickingOrder");
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {BIGINT(19)} <br>
     * ピッキング順序
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingOrder(Long pickingOrder) {
        registerModifiedProperty("pickingOrder");
        _pickingOrder = pickingOrder;
    }

    /**
     * [get] LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationType() {
        checkSpecifiedProperty("locationType");
        return convertEmptyToNull(_locationType);
    }

    /**
     * [set] LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationType(String locationType) {
        registerModifiedProperty("locationType");
        _locationType = locationType;
    }

    /**
     * [get] ALLOC_ORDER: {BIGINT(19)} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocOrder() {
        checkSpecifiedProperty("allocOrder");
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {BIGINT(19)} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocOrder(Long allocOrder) {
        registerModifiedProperty("allocOrder");
        _allocOrder = allocOrder;
    }

    /**
     * [get] ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @return The value of the column 'ALLOC_NG_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getAllocNgFlg() {
        checkSpecifiedProperty("allocNgFlg");
        return convertEmptyToNull(_allocNgFlg);
    }

    /**
     * [set] ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        registerModifiedProperty("allocNgFlg");
        _allocNgFlg = allocNgFlg;
    }

    /**
     * [get] REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 補充商品(不使用)
     * @return The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishProductId() {
        checkSpecifiedProperty("replenishProductId");
        return _replenishProductId;
    }

    /**
     * [set] REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 補充商品(不使用)
     * @param replenishProductId The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishProductId(Long replenishProductId) {
        registerModifiedProperty("replenishProductId");
        _replenishProductId = replenishProductId;
    }

    /**
     * [get] REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 補充在庫区分ID
     * @return The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishStockTypeId() {
        checkSpecifiedProperty("replenishStockTypeId");
        return _replenishStockTypeId;
    }

    /**
     * [set] REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 補充在庫区分ID
     * @param replenishStockTypeId The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishStockTypeId(Long replenishStockTypeId) {
        registerModifiedProperty("replenishStockTypeId");
        _replenishStockTypeId = replenishStockTypeId;
    }

    /**
     * [get] REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 補充預託ID
     * @return The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishDepositId() {
        checkSpecifiedProperty("replenishDepositId");
        return _replenishDepositId;
    }

    /**
     * [set] REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 補充預託ID
     * @param replenishDepositId The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishDepositId(Long replenishDepositId) {
        registerModifiedProperty("replenishDepositId");
        _replenishDepositId = replenishDepositId;
    }

    /**
     * [get] REPLENISH_P_NUM: {DECIMAL(14, 4)} <br>
     * 補充点
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReplenishPNum() {
        checkSpecifiedProperty("replenishPNum");
        return _replenishPNum;
    }

    /**
     * [set] REPLENISH_P_NUM: {DECIMAL(14, 4)} <br>
     * 補充点
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishPNum(java.math.BigDecimal replenishPNum) {
        registerModifiedProperty("replenishPNum");
        _replenishPNum = replenishPNum;
    }

    /**
     * [get] REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape} <br>
     * 補充点商品荷姿ID
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishPProductShapeId() {
        checkSpecifiedProperty("replenishPProductShapeId");
        return _replenishPProductShapeId;
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape} <br>
     * 補充点商品荷姿ID
     * @param replenishPProductShapeId The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishPProductShapeId(Long replenishPProductShapeId) {
        registerModifiedProperty("replenishPProductShapeId");
        _replenishPProductShapeId = replenishPProductShapeId;
    }

    /**
     * [get] MAX_STORE_NUM: {DECIMAL(14, 4)} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMaxStoreNum() {
        checkSpecifiedProperty("maxStoreNum");
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {DECIMAL(14, 4)} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreNum(java.math.BigDecimal maxStoreNum) {
        registerModifiedProperty("maxStoreNum");
        _maxStoreNum = maxStoreNum;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape} <br>
     * 最大格納数商品荷姿ID
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMaxStoreProductShapeId() {
        checkSpecifiedProperty("maxStoreProductShapeId");
        return _maxStoreProductShapeId;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape} <br>
     * 最大格納数商品荷姿ID
     * @param maxStoreProductShapeId The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        registerModifiedProperty("maxStoreProductShapeId");
        _maxStoreProductShapeId = maxStoreProductShapeId;
    }

    /**
     * [get] EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 外部倉庫フラグ
     * @return The value of the column 'EXTERNAL_WH_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getExternalWhFlg() {
        checkSpecifiedProperty("externalWhFlg");
        return convertEmptyToNull(_externalWhFlg);
    }

    /**
     * [set] EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 外部倉庫フラグ
     * @param externalWhFlg The value of the column 'EXTERNAL_WH_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setExternalWhFlg(String externalWhFlg) {
        registerModifiedProperty("externalWhFlg");
        _externalWhFlg = externalWhFlg;
    }

    /**
     * [get] LOCATION_ATTRIBUTE: {VARCHAR(30)} <br>
     * ロケーション属性
     * @return The value of the column 'LOCATION_ATTRIBUTE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationAttribute() {
        checkSpecifiedProperty("locationAttribute");
        return convertEmptyToNull(_locationAttribute);
    }

    /**
     * [set] LOCATION_ATTRIBUTE: {VARCHAR(30)} <br>
     * ロケーション属性
     * @param locationAttribute The value of the column 'LOCATION_ATTRIBUTE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationAttribute(String locationAttribute) {
        registerModifiedProperty("locationAttribute");
        _locationAttribute = locationAttribute;
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
