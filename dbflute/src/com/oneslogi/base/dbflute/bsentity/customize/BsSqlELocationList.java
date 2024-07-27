package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlELocationList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LOCATION_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_CD, LOCATION_CD, LOCATION_NM, WAREHOUSE_CD, ZONE_CD, LOCATION_TYPE, PICKING_LOCATION_FLG, ALLOC_NG_FLG, PICKING_ORDER, ALLOC_ORDER, CLIENT_CD, REPLENISH_PRODUCT_CD, REPLENISH_STOCK_TYPE_CD, REPLENISH_DEPOSIT_CD, REPLENISH_DEPOSIT_NM, REPLENISH_P_NUM, REPLENISH_P_PRODUCT_SHAPE_CD, MAX_STORE_NUM, MAX_STORE_PRODUCT_SHAPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS, ZONE_ID, ZONE_NM, WAREHOUSE_NM, WAREHOUSE_ID, PRODUCT_ID, REPLENISH_PRODUCT_SHAPE_ID, REPLENISH_PRODUCT_SHAPE_NM, MAX_STORE_PRODUCT_SHAPE_ID, MAX_STORE_PRODUCT_SHAPE_NM, MESSAGE_NM, MLOCATION_ID, MVERSION_NO
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
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long locationId = entity.getLocationId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String centerCd = entity.getCenterCd();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * String warehouseCd = entity.getWarehouseCd();
 * String zoneCd = entity.getZoneCd();
 * String locationType = entity.getLocationType();
 * String pickingLocationFlg = entity.getPickingLocationFlg();
 * String allocNgFlg = entity.getAllocNgFlg();
 * String pickingOrder = entity.getPickingOrder();
 * String allocOrder = entity.getAllocOrder();
 * String clientCd = entity.getClientCd();
 * String replenishProductCd = entity.getReplenishProductCd();
 * String replenishStockTypeCd = entity.getReplenishStockTypeCd();
 * String replenishDepositCd = entity.getReplenishDepositCd();
 * String replenishDepositNm = entity.getReplenishDepositNm();
 * String replenishPNum = entity.getReplenishPNum();
 * String replenishPProductShapeCd = entity.getReplenishPProductShapeCd();
 * String maxStoreNum = entity.getMaxStoreNum();
 * String maxStoreProductShapeCd = entity.getMaxStoreProductShapeCd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * Long zoneId = entity.getZoneId();
 * String zoneNm = entity.getZoneNm();
 * String warehouseNm = entity.getWarehouseNm();
 * Long warehouseId = entity.getWarehouseId();
 * Long productId = entity.getProductId();
 * Long replenishProductShapeId = entity.getReplenishProductShapeId();
 * String replenishProductShapeNm = entity.getReplenishProductShapeNm();
 * Long maxStoreProductShapeId = entity.getMaxStoreProductShapeId();
 * String maxStoreProductShapeNm = entity.getMaxStoreProductShapeNm();
 * String messageNm = entity.getMessageNm();
 * Long mlocationId = entity.getMlocationId();
 * Long mversionNo = entity.getMversionNo();
 * entity.setLocationId(locationId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setCenterCd(centerCd);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setZoneCd(zoneCd);
 * entity.setLocationType(locationType);
 * entity.setPickingLocationFlg(pickingLocationFlg);
 * entity.setAllocNgFlg(allocNgFlg);
 * entity.setPickingOrder(pickingOrder);
 * entity.setAllocOrder(allocOrder);
 * entity.setClientCd(clientCd);
 * entity.setReplenishProductCd(replenishProductCd);
 * entity.setReplenishStockTypeCd(replenishStockTypeCd);
 * entity.setReplenishDepositCd(replenishDepositCd);
 * entity.setReplenishDepositNm(replenishDepositNm);
 * entity.setReplenishPNum(replenishPNum);
 * entity.setReplenishPProductShapeCd(replenishPProductShapeCd);
 * entity.setMaxStoreNum(maxStoreNum);
 * entity.setMaxStoreProductShapeCd(maxStoreProductShapeCd);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * entity.setZoneId(zoneId);
 * entity.setZoneNm(zoneNm);
 * entity.setWarehouseNm(warehouseNm);
 * entity.setWarehouseId(warehouseId);
 * entity.setProductId(productId);
 * entity.setReplenishProductShapeId(replenishProductShapeId);
 * entity.setReplenishProductShapeNm(replenishProductShapeNm);
 * entity.setMaxStoreProductShapeId(maxStoreProductShapeId);
 * entity.setMaxStoreProductShapeNm(maxStoreProductShapeNm);
 * entity.setMessageNm(messageNm);
 * entity.setMlocationId(mlocationId);
 * entity.setMversionNo(mversionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlELocationList extends AbstractEntity implements CustomizeEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOCATION_ID: {BIGINT(20), refers to e_location.LOCATION_ID} */
    protected Long _locationId;

    /** RECEIVE_CD: {VARCHAR(30), refers to e_location.RECEIVE_CD} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {BIGINT(20), refers to e_location.RECEIVE_ROW_ID} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {CHAR(1), refers to e_location.IMPORT_FLG} */
    protected String _importFlg;

    /** ERROR_FLG: {CHAR(1), refers to e_location.ERROR_FLG} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_location.ERROR_MESSAGE_CD} */
    protected String _errorMessageCd;

    /** CENTER_CD: {VARCHAR(255), refers to e_location.CENTER_CD} */
    protected String _centerCd;

    /** LOCATION_CD: {VARCHAR(255), refers to e_location.LOCATION_CD} */
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(255), refers to e_location.LOCATION_NM} */
    protected String _locationNm;

    /** WAREHOUSE_CD: {VARCHAR(255), refers to e_location.WAREHOUSE_CD} */
    protected String _warehouseCd;

    /** ZONE_CD: {VARCHAR(255), refers to e_location.ZONE_CD} */
    protected String _zoneCd;

    /** LOCATION_TYPE: {VARCHAR(255), refers to e_location.LOCATION_TYPE} */
    protected String _locationType;

    /** PICKING_LOCATION_FLG: {VARCHAR(255), refers to e_location.PICKING_LOCATION_FLG} */
    protected String _pickingLocationFlg;

    /** ALLOC_NG_FLG: {VARCHAR(255), refers to e_location.ALLOC_NG_FLG} */
    protected String _allocNgFlg;

    /** PICKING_ORDER: {VARCHAR(255), refers to e_location.PICKING_ORDER} */
    protected String _pickingOrder;

    /** ALLOC_ORDER: {VARCHAR(255), refers to e_location.ALLOC_ORDER} */
    protected String _allocOrder;

    /** CLIENT_CD: {VARCHAR(255), refers to e_location.CLIENT_CD} */
    protected String _clientCd;

    /** REPLENISH_PRODUCT_CD: {VARCHAR(255), refers to e_location.REPLENISH_PRODUCT_CD} */
    protected String _replenishProductCd;

    /** REPLENISH_STOCK_TYPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_STOCK_TYPE_CD} */
    protected String _replenishStockTypeCd;

    /** REPLENISH_DEPOSIT_CD: {VARCHAR(255), refers to e_location.REPLENISH_DEPOSIT_CD} */
    protected String _replenishDepositCd;

    /** REPLENISH_DEPOSIT_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} */
    protected String _replenishDepositNm;

    /** REPLENISH_P_NUM: {VARCHAR(255), refers to e_location.REPLENISH_P_NUM} */
    protected String _replenishPNum;

    /** REPLENISH_P_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_P_PRODUCT_SHAPE_CD} */
    protected String _replenishPProductShapeCd;

    /** MAX_STORE_NUM: {VARCHAR(255), refers to e_location.MAX_STORE_NUM} */
    protected String _maxStoreNum;

    /** MAX_STORE_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.MAX_STORE_PRODUCT_SHAPE_CD} */
    protected String _maxStoreProductShapeCd;

    /** DEL_FLG: {CHAR(1), refers to e_location.DEL_FLG, classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {BIGINT(20), refers to e_location.VERSION_NO} */
    protected Long _versionNo;

    /** CONTROL_NO: {BIGINT(20), refers to e_location.CONTROL_NO} */
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(23), refers to e_location.ADD_DT} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60), refers to e_location.ADD_USER} */
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255), refers to e_location.ADD_PROCESS} */
    protected String _addProcess;

    /** UPD_DT: {DATETIME(23), refers to e_location.UPD_DT} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60), refers to e_location.UPD_USER} */
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255), refers to e_location.UPD_PROCESS} */
    protected String _updProcess;

    /** ZONE_ID: {BIGINT(20)} */
    protected Long _zoneId;

    /** ZONE_NM: {VARCHAR(60)} */
    protected String _zoneNm;

    /** WAREHOUSE_NM: {VARCHAR(60), refers to m_warehouse.WAREHOUSE_NM} */
    protected String _warehouseNm;

    /** WAREHOUSE_ID: {BIGINT(20), refers to m_warehouse.WAREHOUSE_ID} */
    protected Long _warehouseId;

    /** PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} */
    protected Long _productId;

    /** REPLENISH_PRODUCT_SHAPE_ID: {BIGINT(20)} */
    protected Long _replenishProductShapeId;

    /** REPLENISH_PRODUCT_SHAPE_NM: {VARCHAR(100)} */
    protected String _replenishProductShapeNm;

    /** MAX_STORE_PRODUCT_SHAPE_ID: {BIGINT(20)} */
    protected Long _maxStoreProductShapeId;

    /** MAX_STORE_PRODUCT_SHAPE_NM: {VARCHAR(100)} */
    protected String _maxStoreProductShapeNm;

    /** MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} */
    protected String _messageNm;

    /** MLOCATION_ID: {BIGINT(20), refers to m_location.LOCATION_ID} */
    protected Long _mlocationId;

    /** MVERSION_NO: {BIGINT(20), refers to m_location.VERSION_NO} */
    protected Long _mversionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlELocationListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlELocationList";
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
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {CHAR(1), refers to e_location.DEL_FLG, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {CHAR(1), refers to e_location.DEL_FLG, classification=DelFlg} <br>
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
        if (obj instanceof BsSqlELocationList) {
            BsSqlELocationList other = (BsSqlELocationList)obj;
            if (!xSV(_locationId, other._locationId)) { return false; }
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_locationNm, other._locationNm)) { return false; }
            if (!xSV(_warehouseCd, other._warehouseCd)) { return false; }
            if (!xSV(_zoneCd, other._zoneCd)) { return false; }
            if (!xSV(_locationType, other._locationType)) { return false; }
            if (!xSV(_pickingLocationFlg, other._pickingLocationFlg)) { return false; }
            if (!xSV(_allocNgFlg, other._allocNgFlg)) { return false; }
            if (!xSV(_pickingOrder, other._pickingOrder)) { return false; }
            if (!xSV(_allocOrder, other._allocOrder)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_replenishProductCd, other._replenishProductCd)) { return false; }
            if (!xSV(_replenishStockTypeCd, other._replenishStockTypeCd)) { return false; }
            if (!xSV(_replenishDepositCd, other._replenishDepositCd)) { return false; }
            if (!xSV(_replenishDepositNm, other._replenishDepositNm)) { return false; }
            if (!xSV(_replenishPNum, other._replenishPNum)) { return false; }
            if (!xSV(_replenishPProductShapeCd, other._replenishPProductShapeCd)) { return false; }
            if (!xSV(_maxStoreNum, other._maxStoreNum)) { return false; }
            if (!xSV(_maxStoreProductShapeCd, other._maxStoreProductShapeCd)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_addUser, other._addUser)) { return false; }
            if (!xSV(_addProcess, other._addProcess)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_updProcess, other._updProcess)) { return false; }
            if (!xSV(_zoneId, other._zoneId)) { return false; }
            if (!xSV(_zoneNm, other._zoneNm)) { return false; }
            if (!xSV(_warehouseNm, other._warehouseNm)) { return false; }
            if (!xSV(_warehouseId, other._warehouseId)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_replenishProductShapeId, other._replenishProductShapeId)) { return false; }
            if (!xSV(_replenishProductShapeNm, other._replenishProductShapeNm)) { return false; }
            if (!xSV(_maxStoreProductShapeId, other._maxStoreProductShapeId)) { return false; }
            if (!xSV(_maxStoreProductShapeNm, other._maxStoreProductShapeNm)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_mlocationId, other._mlocationId)) { return false; }
            if (!xSV(_mversionNo, other._mversionNo)) { return false; }
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
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _locationNm);
        hs = xCH(hs, _warehouseCd);
        hs = xCH(hs, _zoneCd);
        hs = xCH(hs, _locationType);
        hs = xCH(hs, _pickingLocationFlg);
        hs = xCH(hs, _allocNgFlg);
        hs = xCH(hs, _pickingOrder);
        hs = xCH(hs, _allocOrder);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _replenishProductCd);
        hs = xCH(hs, _replenishStockTypeCd);
        hs = xCH(hs, _replenishDepositCd);
        hs = xCH(hs, _replenishDepositNm);
        hs = xCH(hs, _replenishPNum);
        hs = xCH(hs, _replenishPProductShapeCd);
        hs = xCH(hs, _maxStoreNum);
        hs = xCH(hs, _maxStoreProductShapeCd);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _addUser);
        hs = xCH(hs, _addProcess);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _updProcess);
        hs = xCH(hs, _zoneId);
        hs = xCH(hs, _zoneNm);
        hs = xCH(hs, _warehouseNm);
        hs = xCH(hs, _warehouseId);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _replenishProductShapeId);
        hs = xCH(hs, _replenishProductShapeNm);
        hs = xCH(hs, _maxStoreProductShapeId);
        hs = xCH(hs, _maxStoreProductShapeNm);
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _mlocationId);
        hs = xCH(hs, _mversionNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_zoneCd));
        sb.append(dm).append(xfND(_locationType));
        sb.append(dm).append(xfND(_pickingLocationFlg));
        sb.append(dm).append(xfND(_allocNgFlg));
        sb.append(dm).append(xfND(_pickingOrder));
        sb.append(dm).append(xfND(_allocOrder));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_replenishProductCd));
        sb.append(dm).append(xfND(_replenishStockTypeCd));
        sb.append(dm).append(xfND(_replenishDepositCd));
        sb.append(dm).append(xfND(_replenishDepositNm));
        sb.append(dm).append(xfND(_replenishPNum));
        sb.append(dm).append(xfND(_replenishPProductShapeCd));
        sb.append(dm).append(xfND(_maxStoreNum));
        sb.append(dm).append(xfND(_maxStoreProductShapeCd));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        sb.append(dm).append(xfND(_zoneId));
        sb.append(dm).append(xfND(_zoneNm));
        sb.append(dm).append(xfND(_warehouseNm));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_replenishProductShapeId));
        sb.append(dm).append(xfND(_replenishProductShapeNm));
        sb.append(dm).append(xfND(_maxStoreProductShapeId));
        sb.append(dm).append(xfND(_maxStoreProductShapeNm));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_mlocationId));
        sb.append(dm).append(xfND(_mversionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlELocationList clone() {
        return (SqlELocationList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOCATION_ID: {BIGINT(20), refers to e_location.LOCATION_ID} <br>
     * ロケーションマスタ受信ID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {BIGINT(20), refers to e_location.LOCATION_ID} <br>
     * ロケーションマスタ受信ID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] RECEIVE_CD: {VARCHAR(30), refers to e_location.RECEIVE_CD} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {VARCHAR(30), refers to e_location.RECEIVE_CD} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {BIGINT(20), refers to e_location.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {BIGINT(20), refers to e_location.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {CHAR(1), refers to e_location.IMPORT_FLG} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {CHAR(1), refers to e_location.IMPORT_FLG} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), refers to e_location.ERROR_FLG} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), refers to e_location.ERROR_FLG} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_location.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_location.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(255), refers to e_location.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {VARCHAR(255), refers to e_location.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(255), refers to e_location.LOCATION_CD} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(255), refers to e_location.LOCATION_CD} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {VARCHAR(255), refers to e_location.LOCATION_NM} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNm() {
        checkSpecifiedProperty("locationNm");
        return convertEmptyToNull(_locationNm);
    }

    /**
     * [set] LOCATION_NM: {VARCHAR(255), refers to e_location.LOCATION_NM} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNm(String locationNm) {
        registerModifiedProperty("locationNm");
        _locationNm = locationNm;
    }

    /**
     * [get] WAREHOUSE_CD: {VARCHAR(255), refers to e_location.WAREHOUSE_CD} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {VARCHAR(255), refers to e_location.WAREHOUSE_CD} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] ZONE_CD: {VARCHAR(255), refers to e_location.ZONE_CD} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneCd() {
        checkSpecifiedProperty("zoneCd");
        return convertEmptyToNull(_zoneCd);
    }

    /**
     * [set] ZONE_CD: {VARCHAR(255), refers to e_location.ZONE_CD} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneCd(String zoneCd) {
        registerModifiedProperty("zoneCd");
        _zoneCd = zoneCd;
    }

    /**
     * [get] LOCATION_TYPE: {VARCHAR(255), refers to e_location.LOCATION_TYPE} <br>
     * ロケーション種別
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationType() {
        checkSpecifiedProperty("locationType");
        return convertEmptyToNull(_locationType);
    }

    /**
     * [set] LOCATION_TYPE: {VARCHAR(255), refers to e_location.LOCATION_TYPE} <br>
     * ロケーション種別
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationType(String locationType) {
        registerModifiedProperty("locationType");
        _locationType = locationType;
    }

    /**
     * [get] PICKING_LOCATION_FLG: {VARCHAR(255), refers to e_location.PICKING_LOCATION_FLG} <br>
     * ピックロケフラグ
     * @return The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingLocationFlg() {
        checkSpecifiedProperty("pickingLocationFlg");
        return convertEmptyToNull(_pickingLocationFlg);
    }

    /**
     * [set] PICKING_LOCATION_FLG: {VARCHAR(255), refers to e_location.PICKING_LOCATION_FLG} <br>
     * ピックロケフラグ
     * @param pickingLocationFlg The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingLocationFlg(String pickingLocationFlg) {
        registerModifiedProperty("pickingLocationFlg");
        _pickingLocationFlg = pickingLocationFlg;
    }

    /**
     * [get] ALLOC_NG_FLG: {VARCHAR(255), refers to e_location.ALLOC_NG_FLG} <br>
     * 引当禁止フラグ
     * @return The value of the column 'ALLOC_NG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocNgFlg() {
        checkSpecifiedProperty("allocNgFlg");
        return convertEmptyToNull(_allocNgFlg);
    }

    /**
     * [set] ALLOC_NG_FLG: {VARCHAR(255), refers to e_location.ALLOC_NG_FLG} <br>
     * 引当禁止フラグ
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        registerModifiedProperty("allocNgFlg");
        _allocNgFlg = allocNgFlg;
    }

    /**
     * [get] PICKING_ORDER: {VARCHAR(255), refers to e_location.PICKING_ORDER} <br>
     * ピッキング順序
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingOrder() {
        checkSpecifiedProperty("pickingOrder");
        return convertEmptyToNull(_pickingOrder);
    }

    /**
     * [set] PICKING_ORDER: {VARCHAR(255), refers to e_location.PICKING_ORDER} <br>
     * ピッキング順序
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingOrder(String pickingOrder) {
        registerModifiedProperty("pickingOrder");
        _pickingOrder = pickingOrder;
    }

    /**
     * [get] ALLOC_ORDER: {VARCHAR(255), refers to e_location.ALLOC_ORDER} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocOrder() {
        checkSpecifiedProperty("allocOrder");
        return convertEmptyToNull(_allocOrder);
    }

    /**
     * [set] ALLOC_ORDER: {VARCHAR(255), refers to e_location.ALLOC_ORDER} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocOrder(String allocOrder) {
        registerModifiedProperty("allocOrder");
        _allocOrder = allocOrder;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(255), refers to e_location.CLIENT_CD} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(255), refers to e_location.CLIENT_CD} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] REPLENISH_PRODUCT_CD: {VARCHAR(255), refers to e_location.REPLENISH_PRODUCT_CD} <br>
     * 補充商品CD
     * @return The value of the column 'REPLENISH_PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReplenishProductCd() {
        checkSpecifiedProperty("replenishProductCd");
        return convertEmptyToNull(_replenishProductCd);
    }

    /**
     * [set] REPLENISH_PRODUCT_CD: {VARCHAR(255), refers to e_location.REPLENISH_PRODUCT_CD} <br>
     * 補充商品CD
     * @param replenishProductCd The value of the column 'REPLENISH_PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishProductCd(String replenishProductCd) {
        registerModifiedProperty("replenishProductCd");
        _replenishProductCd = replenishProductCd;
    }

    /**
     * [get] REPLENISH_STOCK_TYPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_STOCK_TYPE_CD} <br>
     * 補充在庫区分CD
     * @return The value of the column 'REPLENISH_STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReplenishStockTypeCd() {
        checkSpecifiedProperty("replenishStockTypeCd");
        return convertEmptyToNull(_replenishStockTypeCd);
    }

    /**
     * [set] REPLENISH_STOCK_TYPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_STOCK_TYPE_CD} <br>
     * 補充在庫区分CD
     * @param replenishStockTypeCd The value of the column 'REPLENISH_STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishStockTypeCd(String replenishStockTypeCd) {
        registerModifiedProperty("replenishStockTypeCd");
        _replenishStockTypeCd = replenishStockTypeCd;
    }

    /**
     * [get] REPLENISH_DEPOSIT_CD: {VARCHAR(255), refers to e_location.REPLENISH_DEPOSIT_CD} <br>
     * 補充預託CD
     * @return The value of the column 'REPLENISH_DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReplenishDepositCd() {
        checkSpecifiedProperty("replenishDepositCd");
        return convertEmptyToNull(_replenishDepositCd);
    }

    /**
     * [set] REPLENISH_DEPOSIT_CD: {VARCHAR(255), refers to e_location.REPLENISH_DEPOSIT_CD} <br>
     * 補充預託CD
     * @param replenishDepositCd The value of the column 'REPLENISH_DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishDepositCd(String replenishDepositCd) {
        registerModifiedProperty("replenishDepositCd");
        _replenishDepositCd = replenishDepositCd;
    }

    /**
     * [get] REPLENISH_DEPOSIT_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @return The value of the column 'REPLENISH_DEPOSIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReplenishDepositNm() {
        checkSpecifiedProperty("replenishDepositNm");
        return convertEmptyToNull(_replenishDepositNm);
    }

    /**
     * [set] REPLENISH_DEPOSIT_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @param replenishDepositNm The value of the column 'REPLENISH_DEPOSIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishDepositNm(String replenishDepositNm) {
        registerModifiedProperty("replenishDepositNm");
        _replenishDepositNm = replenishDepositNm;
    }

    /**
     * [get] REPLENISH_P_NUM: {VARCHAR(255), refers to e_location.REPLENISH_P_NUM} <br>
     * 補充点
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReplenishPNum() {
        checkSpecifiedProperty("replenishPNum");
        return convertEmptyToNull(_replenishPNum);
    }

    /**
     * [set] REPLENISH_P_NUM: {VARCHAR(255), refers to e_location.REPLENISH_P_NUM} <br>
     * 補充点
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishPNum(String replenishPNum) {
        registerModifiedProperty("replenishPNum");
        _replenishPNum = replenishPNum;
    }

    /**
     * [get] REPLENISH_P_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_P_PRODUCT_SHAPE_CD} <br>
     * 補充点商品荷姿CD
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReplenishPProductShapeCd() {
        checkSpecifiedProperty("replenishPProductShapeCd");
        return convertEmptyToNull(_replenishPProductShapeCd);
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_P_PRODUCT_SHAPE_CD} <br>
     * 補充点商品荷姿CD
     * @param replenishPProductShapeCd The value of the column 'REPLENISH_P_PRODUCT_SHAPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishPProductShapeCd(String replenishPProductShapeCd) {
        registerModifiedProperty("replenishPProductShapeCd");
        _replenishPProductShapeCd = replenishPProductShapeCd;
    }

    /**
     * [get] MAX_STORE_NUM: {VARCHAR(255), refers to e_location.MAX_STORE_NUM} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMaxStoreNum() {
        checkSpecifiedProperty("maxStoreNum");
        return convertEmptyToNull(_maxStoreNum);
    }

    /**
     * [set] MAX_STORE_NUM: {VARCHAR(255), refers to e_location.MAX_STORE_NUM} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreNum(String maxStoreNum) {
        registerModifiedProperty("maxStoreNum");
        _maxStoreNum = maxStoreNum;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.MAX_STORE_PRODUCT_SHAPE_CD} <br>
     * 最大格納数商品荷姿CD
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMaxStoreProductShapeCd() {
        checkSpecifiedProperty("maxStoreProductShapeCd");
        return convertEmptyToNull(_maxStoreProductShapeCd);
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.MAX_STORE_PRODUCT_SHAPE_CD} <br>
     * 最大格納数商品荷姿CD
     * @param maxStoreProductShapeCd The value of the column 'MAX_STORE_PRODUCT_SHAPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreProductShapeCd(String maxStoreProductShapeCd) {
        registerModifiedProperty("maxStoreProductShapeCd");
        _maxStoreProductShapeCd = maxStoreProductShapeCd;
    }

    /**
     * [get] DEL_FLG: {CHAR(1), refers to e_location.DEL_FLG, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {CHAR(1), refers to e_location.DEL_FLG, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {BIGINT(20), refers to e_location.VERSION_NO} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {BIGINT(20), refers to e_location.VERSION_NO} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {BIGINT(20), refers to e_location.CONTROL_NO} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {BIGINT(20), refers to e_location.CONTROL_NO} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(23), refers to e_location.ADD_DT} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(23), refers to e_location.ADD_DT} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60), refers to e_location.ADD_USER} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {VARCHAR(60), refers to e_location.ADD_USER} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255), refers to e_location.ADD_PROCESS} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255), refers to e_location.ADD_PROCESS} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(23), refers to e_location.UPD_DT} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(23), refers to e_location.UPD_DT} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60), refers to e_location.UPD_USER} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {VARCHAR(60), refers to e_location.UPD_USER} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255), refers to e_location.UPD_PROCESS} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255), refers to e_location.UPD_PROCESS} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }

    /**
     * [get] ZONE_ID: {BIGINT(20)} <br>
     * @return The value of the column 'ZONE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZoneId() {
        checkSpecifiedProperty("zoneId");
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {BIGINT(20)} <br>
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneId(Long zoneId) {
        registerModifiedProperty("zoneId");
        _zoneId = zoneId;
    }

    /**
     * [get] ZONE_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'ZONE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneNm() {
        checkSpecifiedProperty("zoneNm");
        return convertEmptyToNull(_zoneNm);
    }

    /**
     * [set] ZONE_NM: {VARCHAR(60)} <br>
     * @param zoneNm The value of the column 'ZONE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneNm(String zoneNm) {
        registerModifiedProperty("zoneNm");
        _zoneNm = zoneNm;
    }

    /**
     * [get] WAREHOUSE_NM: {VARCHAR(60), refers to m_warehouse.WAREHOUSE_NM} <br>
     * 倉庫名称
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseNm() {
        checkSpecifiedProperty("warehouseNm");
        return convertEmptyToNull(_warehouseNm);
    }

    /**
     * [set] WAREHOUSE_NM: {VARCHAR(60), refers to m_warehouse.WAREHOUSE_NM} <br>
     * 倉庫名称
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseNm(String warehouseNm) {
        registerModifiedProperty("warehouseNm");
        _warehouseNm = warehouseNm;
    }

    /**
     * [get] WAREHOUSE_ID: {BIGINT(20), refers to m_warehouse.WAREHOUSE_ID} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {BIGINT(20), refers to m_warehouse.WAREHOUSE_ID} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(Long warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] REPLENISH_PRODUCT_SHAPE_ID: {BIGINT(20)} <br>
     * @return The value of the column 'REPLENISH_PRODUCT_SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishProductShapeId() {
        checkSpecifiedProperty("replenishProductShapeId");
        return _replenishProductShapeId;
    }

    /**
     * [set] REPLENISH_PRODUCT_SHAPE_ID: {BIGINT(20)} <br>
     * @param replenishProductShapeId The value of the column 'REPLENISH_PRODUCT_SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishProductShapeId(Long replenishProductShapeId) {
        registerModifiedProperty("replenishProductShapeId");
        _replenishProductShapeId = replenishProductShapeId;
    }

    /**
     * [get] REPLENISH_PRODUCT_SHAPE_NM: {VARCHAR(100)} <br>
     * @return The value of the column 'REPLENISH_PRODUCT_SHAPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReplenishProductShapeNm() {
        checkSpecifiedProperty("replenishProductShapeNm");
        return convertEmptyToNull(_replenishProductShapeNm);
    }

    /**
     * [set] REPLENISH_PRODUCT_SHAPE_NM: {VARCHAR(100)} <br>
     * @param replenishProductShapeNm The value of the column 'REPLENISH_PRODUCT_SHAPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishProductShapeNm(String replenishProductShapeNm) {
        registerModifiedProperty("replenishProductShapeNm");
        _replenishProductShapeNm = replenishProductShapeNm;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_ID: {BIGINT(20)} <br>
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMaxStoreProductShapeId() {
        checkSpecifiedProperty("maxStoreProductShapeId");
        return _maxStoreProductShapeId;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_ID: {BIGINT(20)} <br>
     * @param maxStoreProductShapeId The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        registerModifiedProperty("maxStoreProductShapeId");
        _maxStoreProductShapeId = maxStoreProductShapeId;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_NM: {VARCHAR(100)} <br>
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMaxStoreProductShapeNm() {
        checkSpecifiedProperty("maxStoreProductShapeNm");
        return convertEmptyToNull(_maxStoreProductShapeNm);
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_NM: {VARCHAR(100)} <br>
     * @param maxStoreProductShapeNm The value of the column 'MAX_STORE_PRODUCT_SHAPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreProductShapeNm(String maxStoreProductShapeNm) {
        registerModifiedProperty("maxStoreProductShapeNm");
        _maxStoreProductShapeNm = maxStoreProductShapeNm;
    }

    /**
     * [get] MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} <br>
     * メッセージ
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageNm() {
        checkSpecifiedProperty("messageNm");
        return convertEmptyToNull(_messageNm);
    }

    /**
     * [set] MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} <br>
     * メッセージ
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageNm(String messageNm) {
        registerModifiedProperty("messageNm");
        _messageNm = messageNm;
    }

    /**
     * [get] MLOCATION_ID: {BIGINT(20), refers to m_location.LOCATION_ID} <br>
     * ロケーションID
     * @return The value of the column 'MLOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMlocationId() {
        checkSpecifiedProperty("mlocationId");
        return _mlocationId;
    }

    /**
     * [set] MLOCATION_ID: {BIGINT(20), refers to m_location.LOCATION_ID} <br>
     * ロケーションID
     * @param mlocationId The value of the column 'MLOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMlocationId(Long mlocationId) {
        registerModifiedProperty("mlocationId");
        _mlocationId = mlocationId;
    }

    /**
     * [get] MVERSION_NO: {BIGINT(20), refers to m_location.VERSION_NO} <br>
     * バージョンNo.
     * @return The value of the column 'MVERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMversionNo() {
        checkSpecifiedProperty("mversionNo");
        return _mversionNo;
    }

    /**
     * [set] MVERSION_NO: {BIGINT(20), refers to m_location.VERSION_NO} <br>
     * バージョンNo.
     * @param mversionNo The value of the column 'MVERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMversionNo(Long mversionNo) {
        registerModifiedProperty("mversionNo");
        _mversionNo = mversionNo;
    }
}
