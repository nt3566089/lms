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
 * The entity of m_location_replenish_product as TABLE. <br>
 * ロケーション補充商品マスタ
 * <pre>
 * [primary-key]
 *     LOCATION_REPLENISH_PRODUCT_ID
 *
 * [column]
 *     LOCATION_REPLENISH_PRODUCT_ID, LOCATION_ID, REPLENISH_PRODUCT_ID, REPLENISH_DEPOSIT_ID, REPLENISH_P_NUM, MAX_STORE_PRODUCT_SHAPE_ID, MAX_STORE_NUM, REPLENISH_STOCK_TYPE_ID, REPLENISH_P_PRODUCT_SHAPE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_REPLENISH_PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_customer, m_product_shape, m_shape, m_product, m_location, m_stock_type
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, mProductShape, mShape, mProduct, mLocation, mStockType
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long locationReplenishProductId = entity.getLocationReplenishProductId();
 * Long locationId = entity.getLocationId();
 * Long replenishProductId = entity.getReplenishProductId();
 * Long replenishDepositId = entity.getReplenishDepositId();
 * Long replenishPNum = entity.getReplenishPNum();
 * Long maxStoreProductShapeId = entity.getMaxStoreProductShapeId();
 * Long maxStoreNum = entity.getMaxStoreNum();
 * Long replenishStockTypeId = entity.getReplenishStockTypeId();
 * Long replenishPProductShapeId = entity.getReplenishPProductShapeId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setLocationReplenishProductId(locationReplenishProductId);
 * entity.setLocationId(locationId);
 * entity.setReplenishProductId(replenishProductId);
 * entity.setReplenishDepositId(replenishDepositId);
 * entity.setReplenishPNum(replenishPNum);
 * entity.setMaxStoreProductShapeId(maxStoreProductShapeId);
 * entity.setMaxStoreNum(maxStoreNum);
 * entity.setReplenishStockTypeId(replenishStockTypeId);
 * entity.setReplenishPProductShapeId(replenishPProductShapeId);
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
public abstract class BsMLocationReplenishProduct extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _locationReplenishProductId;

    /** LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location} */
    protected Long _locationId;

    /** REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} */
    protected Long _replenishProductId;

    /** REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _replenishDepositId;

    /** REPLENISH_P_NUM: {BIGINT(19)} */
    protected Long _replenishPNum;

    /** MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape} */
    protected Long _maxStoreProductShapeId;

    /** MAX_STORE_NUM: {BIGINT(19)} */
    protected Long _maxStoreNum;

    /** REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    protected Long _replenishStockTypeId;

    /** REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape} */
    protected Long _replenishPProductShapeId;

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
        return "m_location_replenish_product";
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
        if (_locationReplenishProductId == null) { return false; }
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

    /** m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'. */
    protected MProductShape _mProductShape;

    /**
     * [get] m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'. <br>
     * @return The entity of foreign property 'MProductShape'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProductShape getMProductShape() {
        return _mProductShape;
    }

    /**
     * [set] m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'.
     * @param mProductShape The entity of foreign property 'MProductShape'. (NullAllowed)
     */
    public void setMProductShape(MProductShape mProductShape) {
        _mProductShape = mProductShape;
    }

    /** m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'. */
    protected MShape _mShape;

    /**
     * [get] m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'. <br>
     * @return The entity of foreign property 'MShape'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShape getMShape() {
        return _mShape;
    }

    /**
     * [set] m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'.
     * @param mShape The entity of foreign property 'MShape'. (NullAllowed)
     */
    public void setMShape(MShape mShape) {
        _mShape = mShape;
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
        if (obj instanceof BsMLocationReplenishProduct) {
            BsMLocationReplenishProduct other = (BsMLocationReplenishProduct)obj;
            if (!xSV(_locationReplenishProductId, other._locationReplenishProductId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _locationReplenishProductId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_mProductShape != null)
        { sb.append(li).append(xbRDS(_mProductShape, "mProductShape")); }
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_locationReplenishProductId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_replenishProductId));
        sb.append(dm).append(xfND(_replenishDepositId));
        sb.append(dm).append(xfND(_replenishPNum));
        sb.append(dm).append(xfND(_maxStoreProductShapeId));
        sb.append(dm).append(xfND(_maxStoreNum));
        sb.append(dm).append(xfND(_replenishStockTypeId));
        sb.append(dm).append(xfND(_replenishPProductShapeId));
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
        if (_mProductShape != null)
        { sb.append(dm).append("mProductShape"); }
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MLocationReplenishProduct clone() {
        return (MLocationReplenishProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ロケーション補充商品ID
     * @return The value of the column 'LOCATION_REPLENISH_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationReplenishProductId() {
        checkSpecifiedProperty("locationReplenishProductId");
        return _locationReplenishProductId;
    }

    /**
     * [set] LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ロケーション補充商品ID
     * @param locationReplenishProductId The value of the column 'LOCATION_REPLENISH_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationReplenishProductId(Long locationReplenishProductId) {
        registerModifiedProperty("locationReplenishProductId");
        _locationReplenishProductId = locationReplenishProductId;
    }

    /**
     * [get] LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 補充商品ID
     * @return The value of the column 'REPLENISH_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReplenishProductId() {
        checkSpecifiedProperty("replenishProductId");
        return _replenishProductId;
    }

    /**
     * [set] REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 補充商品ID
     * @param replenishProductId The value of the column 'REPLENISH_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReplenishProductId(Long replenishProductId) {
        registerModifiedProperty("replenishProductId");
        _replenishProductId = replenishProductId;
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
     * [get] REPLENISH_P_NUM: {BIGINT(19)} <br>
     * 補充点
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishPNum() {
        checkSpecifiedProperty("replenishPNum");
        return _replenishPNum;
    }

    /**
     * [set] REPLENISH_P_NUM: {BIGINT(19)} <br>
     * 補充点
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishPNum(Long replenishPNum) {
        registerModifiedProperty("replenishPNum");
        _replenishPNum = replenishPNum;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape} <br>
     * 最大格納数商品荷姿ID
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMaxStoreProductShapeId() {
        checkSpecifiedProperty("maxStoreProductShapeId");
        return _maxStoreProductShapeId;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape} <br>
     * 最大格納数商品荷姿ID
     * @param maxStoreProductShapeId The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        registerModifiedProperty("maxStoreProductShapeId");
        _maxStoreProductShapeId = maxStoreProductShapeId;
    }

    /**
     * [get] MAX_STORE_NUM: {BIGINT(19)} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMaxStoreNum() {
        checkSpecifiedProperty("maxStoreNum");
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {BIGINT(19)} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreNum(Long maxStoreNum) {
        registerModifiedProperty("maxStoreNum");
        _maxStoreNum = maxStoreNum;
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
     * [get] REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 補充点商品荷姿ID
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishPProductShapeId() {
        checkSpecifiedProperty("replenishPProductShapeId");
        return _replenishPProductShapeId;
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 補充点商品荷姿ID
     * @param replenishPProductShapeId The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishPProductShapeId(Long replenishPProductShapeId) {
        registerModifiedProperty("replenishPProductShapeId");
        _replenishPProductShapeId = replenishPProductShapeId;
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
