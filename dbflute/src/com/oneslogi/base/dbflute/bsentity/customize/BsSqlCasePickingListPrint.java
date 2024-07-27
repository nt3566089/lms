package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of SqlCasePickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WAREHOUSE_CD, WAREHOUSE_NM, WORK_DT, PICKING_WORK_NO, CASE_PICKING_NO, STOCK_TYPE_CD, STOCK_TYPE_NM, PICKING_ORDER, ZONE_CD, ZONE_NM, PRODUCT_CD, PRODUCT_NM, JANCD, SUM_PICKING_NUM, STORE_LABEL_NO, STORE_DT, LOT, LIMT_DT, LOCATION_CD, LOCATION_NM, PRODUCT_ID, SHAPE_SORT, SHAPE_ID, CASE_OUT_FLG, FROM_SHIPPING_PACKING_NO, TO_SHIPPING_PACKING_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseNm = entity.getWarehouseNm();
 * String workDt = entity.getWorkDt();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String casePickingNo = entity.getCasePickingNo();
 * String stockTypeCd = entity.getStockTypeCd();
 * String stockTypeNm = entity.getStockTypeNm();
 * Long pickingOrder = entity.getPickingOrder();
 * String zoneCd = entity.getZoneCd();
 * String zoneNm = entity.getZoneNm();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String jancd = entity.getJancd();
 * java.math.BigDecimal sumPickingNum = entity.getSumPickingNum();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * String lot = entity.getLot();
 * String limtDt = entity.getLimtDt();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * Long productId = entity.getProductId();
 * Long shapeSort = entity.getShapeSort();
 * Long shapeId = entity.getShapeId();
 * String caseOutFlg = entity.getCaseOutFlg();
 * String fromShippingPackingNo = entity.getFromShippingPackingNo();
 * String toShippingPackingNo = entity.getToShippingPackingNo();
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseNm(warehouseNm);
 * entity.setWorkDt(workDt);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setCasePickingNo(casePickingNo);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setStockTypeNm(stockTypeNm);
 * entity.setPickingOrder(pickingOrder);
 * entity.setZoneCd(zoneCd);
 * entity.setZoneNm(zoneNm);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setJancd(jancd);
 * entity.setSumPickingNum(sumPickingNum);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setLot(lot);
 * entity.setLimtDt(limtDt);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setProductId(productId);
 * entity.setShapeSort(shapeSort);
 * entity.setShapeId(shapeId);
 * entity.setCaseOutFlg(caseOutFlg);
 * entity.setFromShippingPackingNo(fromShippingPackingNo);
 * entity.setToShippingPackingNo(toShippingPackingNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlCasePickingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_CD: {VARCHAR(30), refers to m_client.CLIENT_CD} */
    protected String _clientCd;

    /** CLIENT_NM: {VARCHAR(60)} */
    protected String _clientNm;

    /** CENTER_ID: {BIGINT(20), refers to m_center.CENTER_ID} */
    protected Long _centerId;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    protected String _centerCd;

    /** CENTER_NM: {VARCHAR(60)} */
    protected String _centerNm;

    /** WAREHOUSE_CD: {VARCHAR(30), refers to m_warehouse.WAREHOUSE_CD} */
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {VARCHAR(60)} */
    protected String _warehouseNm;

    /** WORK_DT: {VARCHAR(8), refers to t_alloc_inst_h.WORK_DT} */
    protected String _workDt;

    /** PICKING_WORK_NO: {VARCHAR(30), refers to t_picking_h.PICKING_WORK_NO} */
    protected String _pickingWorkNo;

    /** CASE_PICKING_NO: {VARCHAR(30), refers to t_packing_b.CASE_PICKING_NO} */
    protected String _casePickingNo;

    /** STOCK_TYPE_CD: {VARCHAR(30), refers to m_stock_type.STOCK_TYPE_CD} */
    protected String _stockTypeCd;

    /** STOCK_TYPE_NM: {VARCHAR(100)} */
    protected String _stockTypeNm;

    /** PICKING_ORDER: {BIGINT(20)} */
    protected Long _pickingOrder;

    /** ZONE_CD: {VARCHAR(30), refers to m_zone.ZONE_CD} */
    protected String _zoneCd;

    /** ZONE_NM: {VARCHAR(60)} */
    protected String _zoneNm;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    protected String _productNm;

    /** JANCD: {VARCHAR(30)} */
    protected String _jancd;

    /** SUM_PICKING_NUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _sumPickingNum;

    /** STORE_LABEL_NO: {VARCHAR(30), refers to t_store_no.STORE_LABEL_NO} */
    protected String _storeLabelNo;

    /** STORE_DT: {VARCHAR(8), refers to t_store_no.STORE_DT} */
    protected String _storeDt;

    /** LOT: {VARCHAR(30)} */
    protected String _lot;

    /** LIMT_DT: {VARCHAR(8)} */
    protected String _limtDt;

    /** LOCATION_CD: {VARCHAR(30)} */
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(60)} */
    protected String _locationNm;

    /** PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} */
    protected Long _productId;

    /** SHAPE_SORT: {BIGINT(20)} */
    protected Long _shapeSort;

    /** SHAPE_ID: {BIGINT(20)} */
    protected Long _shapeId;

    /** CASE_OUT_FLG: {CHAR(1)} */
    protected String _caseOutFlg;

    /** FROM_SHIPPING_PACKING_NO: {VARCHAR(30)} */
    protected String _fromShippingPackingNo;

    /** TO_SHIPPING_PACKING_NO: {VARCHAR(30)} */
    protected String _toShippingPackingNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlCasePickingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlCasePickingListPrint";
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
        if (_productId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected MProduct __innerDomain;

    protected MProduct innerDomain() {
        if (__innerDomain == null) {
            __innerDomain = new MProduct();
        }
        return __innerDomain;
    }

    /**
     * Prepare the inner instance of domain entity (basically for LoadReferrer).
     * <pre>
     * List&lt;UnpaidSummaryMember&gt; memberList = memberBhv.outsideSql()...;
     * List&lt;Member&gt; domainList = new ArrayList&lt;Member&gt;();
     * for (UnpaidSummaryMember member : memberList) {
     *     domainList.add(member.<span style="color: #CC4747">prepareDomain()</span>);
     * }
     * memberBhv.<span style="color: #CC4747">loadPurchaseList</span>(domainList, new ConditionBeanSetupper...);
     * for (UnpaidSummaryMember member : memberList) {
     *     Purchase purchase = member.<span style="color: #CC4747">getPurchaseList()</span>; <span style="color: #3F7E5E">// you can get it</span>
     *     ...
     * }
     * </pre>
     * @return The domain entity for this customize entity. (NotNull)
     */
    public MProduct prepareDomain() {
        innerDomain().setProductId(getProductId());
        return innerDomain();
    }

    /**
     * h_stock_book by PRODUCT_ID, named 'HStockBookList'.
     * @return The entity list of referrer property 'HStockBookList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<HStockBook> getHStockBookList() {
        return innerDomain().getHStockBookList();
    }

    /**
     * m_deposit_product by PRODUCT_ID, named 'MDepositProductList'.
     * @return The entity list of referrer property 'MDepositProductList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MDepositProduct> getMDepositProductList() {
        return innerDomain().getMDepositProductList();
    }

    /**
     * m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * @return The entity list of referrer property 'MLocationList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MLocation> getMLocationList() {
        return innerDomain().getMLocationList();
    }

    /**
     * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'.
     * @return The entity list of referrer property 'MLocationReplenishProductList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MLocationReplenishProduct> getMLocationReplenishProductList() {
        return innerDomain().getMLocationReplenishProductList();
    }

    /**
     * m_product_shape by PRODUCT_ID, named 'MProductShapeList'.
     * @return The entity list of referrer property 'MProductShapeList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MProductShape> getMProductShapeList() {
        return innerDomain().getMProductShapeList();
    }

    /**
     * m_set_structure by PRODUCT_ID, named 'MSetStructureList'.
     * @return The entity list of referrer property 'MSetStructureList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MSetStructure> getMSetStructureList() {
        return innerDomain().getMSetStructureList();
    }

    /**
     * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        return innerDomain().getTAllocInstBList();
    }

    /**
     * t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'.
     * @return The entity list of referrer property 'TAllocLotList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TAllocLot> getTAllocLotList() {
        return innerDomain().getTAllocLotList();
    }

    /**
     * t_inventory_b by PRODUCT_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TInventoryB> getTInventoryBList() {
        return innerDomain().getTInventoryBList();
    }

    /**
     * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'.
     * @return The entity list of referrer property 'TKeepingLotList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TKeepingLot> getTKeepingLotList() {
        return innerDomain().getTKeepingLotList();
    }

    /**
     * t_last_lot by PRODUCT_ID, named 'TLastLotList'.
     * @return The entity list of referrer property 'TLastLotList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TLastLot> getTLastLotList() {
        return innerDomain().getTLastLotList();
    }

    /**
     * t_lot by PRODUCT_ID, named 'TLotList'.
     * @return The entity list of referrer property 'TLotList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TLot> getTLotList() {
        return innerDomain().getTLotList();
    }

    /**
     * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'.
     * @return The entity list of referrer property 'TMoveInstBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TMoveInstB> getTMoveInstBList() {
        return innerDomain().getTMoveInstBList();
    }

    /**
     * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'.
     * @return The entity list of referrer property 'TNizoroeAlarmLogList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TNizoroeAlarmLog> getTNizoroeAlarmLogList() {
        return innerDomain().getTNizoroeAlarmLogList();
    }

    /**
     * t_operation_log by PRODUCT_ID, named 'TOperationLogList'.
     * @return The entity list of referrer property 'TOperationLogList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TOperationLog> getTOperationLogList() {
        return innerDomain().getTOperationLogList();
    }

    /**
     * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'.
     * @return The entity list of referrer property 'TReceivePlanBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TReceivePlanB> getTReceivePlanBList() {
        return innerDomain().getTReceivePlanBList();
    }

    /**
     * t_serial_no by PRODUCT_ID, named 'TSerialNoList'.
     * @return The entity list of referrer property 'TSerialNoList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TSerialNo> getTSerialNoList() {
        return innerDomain().getTSerialNoList();
    }

    /**
     * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        return innerDomain().getTShippingInstBList();
    }

    /**
     * t_stock by PRODUCT_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TStock> getTStockList() {
        return innerDomain().getTStockList();
    }

    /**
     * t_stock_book by PRODUCT_ID, named 'TStockBookList'.
     * @return The entity list of referrer property 'TStockBookList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TStockBook> getTStockBookList() {
        return innerDomain().getTStockBookList();
    }

    /**
     * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        return innerDomain().getWHtInventoryInputProdList();
    }

    /**
     * w_ht_picking by PRODUCT_ID, named 'WHtPickingList'.
     * @return The entity list of referrer property 'WHtPickingList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtPicking> getWHtPickingList() {
        return innerDomain().getWHtPickingList();
    }

    /**
     * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        return innerDomain().getWHtReceiveInspectionList();
    }

    /**
     * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        return innerDomain().getWHtReceiveNoPlanInspList();
    }

    /**
     * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        return innerDomain().getWHtReceiveStoreList();
    }

    /**
     * w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtShipping> getWHtShippingList() {
        return innerDomain().getWHtShippingList();
    }

    /**
     * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        return innerDomain().getWHtShippingPickingList();
    }

    /**
     * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'.
     * @return The entity list of referrer property 'WHtTotalPickingList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtTotalPicking> getWHtTotalPickingList() {
        return innerDomain().getWHtTotalPickingList();
    }

    /**
     * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        return innerDomain().getWSglRowShipInspHList();
    }

    /**
     * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        return innerDomain().getWShippingInterruptList();
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlCasePickingListPrint) {
            BsSqlCasePickingListPrint other = (BsSqlCasePickingListPrint)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseNm));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_casePickingNo));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_stockTypeNm));
        sb.append(dm).append(xfND(_pickingOrder));
        sb.append(dm).append(xfND(_zoneCd));
        sb.append(dm).append(xfND(_zoneNm));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_jancd));
        sb.append(dm).append(xfND(_sumPickingNum));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limtDt));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_shapeSort));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_caseOutFlg));
        sb.append(dm).append(xfND(_fromShippingPackingNo));
        sb.append(dm).append(xfND(_toShippingPackingNo));
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
    public SqlCasePickingListPrint clone() {
        return (SqlCasePickingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CD: {VARCHAR(30), refers to m_client.CLIENT_CD} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(30), refers to m_client.CLIENT_CD} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {VARCHAR(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] CENTER_ID: {BIGINT(20), refers to m_center.CENTER_ID} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {BIGINT(20), refers to m_center.CENTER_ID} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {VARCHAR(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] WAREHOUSE_CD: {VARCHAR(30), refers to m_warehouse.WAREHOUSE_CD} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {VARCHAR(30), refers to m_warehouse.WAREHOUSE_CD} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseNm() {
        checkSpecifiedProperty("warehouseNm");
        return convertEmptyToNull(_warehouseNm);
    }

    /**
     * [set] WAREHOUSE_NM: {VARCHAR(60)} <br>
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseNm(String warehouseNm) {
        registerModifiedProperty("warehouseNm");
        _warehouseNm = warehouseNm;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8), refers to t_alloc_inst_h.WORK_DT} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {VARCHAR(8), refers to t_alloc_inst_h.WORK_DT} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] PICKING_WORK_NO: {VARCHAR(30), refers to t_picking_h.PICKING_WORK_NO} <br>
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {VARCHAR(30), refers to t_picking_h.PICKING_WORK_NO} <br>
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] CASE_PICKING_NO: {VARCHAR(30), refers to t_packing_b.CASE_PICKING_NO} <br>
     * ケースピッキングNo.
     * @return The value of the column 'CASE_PICKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePickingNo() {
        checkSpecifiedProperty("casePickingNo");
        return convertEmptyToNull(_casePickingNo);
    }

    /**
     * [set] CASE_PICKING_NO: {VARCHAR(30), refers to t_packing_b.CASE_PICKING_NO} <br>
     * ケースピッキングNo.
     * @param casePickingNo The value of the column 'CASE_PICKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePickingNo(String casePickingNo) {
        registerModifiedProperty("casePickingNo");
        _casePickingNo = casePickingNo;
    }

    /**
     * [get] STOCK_TYPE_CD: {VARCHAR(30), refers to m_stock_type.STOCK_TYPE_CD} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {VARCHAR(30), refers to m_stock_type.STOCK_TYPE_CD} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] STOCK_TYPE_NM: {VARCHAR(100)} <br>
     * @return The value of the column 'STOCK_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeNm() {
        checkSpecifiedProperty("stockTypeNm");
        return convertEmptyToNull(_stockTypeNm);
    }

    /**
     * [set] STOCK_TYPE_NM: {VARCHAR(100)} <br>
     * @param stockTypeNm The value of the column 'STOCK_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeNm(String stockTypeNm) {
        registerModifiedProperty("stockTypeNm");
        _stockTypeNm = stockTypeNm;
    }

    /**
     * [get] PICKING_ORDER: {BIGINT(20)} <br>
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingOrder() {
        checkSpecifiedProperty("pickingOrder");
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {BIGINT(20)} <br>
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingOrder(Long pickingOrder) {
        registerModifiedProperty("pickingOrder");
        _pickingOrder = pickingOrder;
    }

    /**
     * [get] ZONE_CD: {VARCHAR(30), refers to m_zone.ZONE_CD} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneCd() {
        checkSpecifiedProperty("zoneCd");
        return convertEmptyToNull(_zoneCd);
    }

    /**
     * [set] ZONE_CD: {VARCHAR(30), refers to m_zone.ZONE_CD} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneCd(String zoneCd) {
        registerModifiedProperty("zoneCd");
        _zoneCd = zoneCd;
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
     * [get] PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(60)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] JANCD: {VARCHAR(30)} <br>
     * @return The value of the column 'JANCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJancd() {
        checkSpecifiedProperty("jancd");
        return convertEmptyToNull(_jancd);
    }

    /**
     * [set] JANCD: {VARCHAR(30)} <br>
     * @param jancd The value of the column 'JANCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJancd(String jancd) {
        registerModifiedProperty("jancd");
        _jancd = jancd;
    }

    /**
     * [get] SUM_PICKING_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'SUM_PICKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumPickingNum() {
        checkSpecifiedProperty("sumPickingNum");
        return _sumPickingNum;
    }

    /**
     * [set] SUM_PICKING_NUM: {DECIMAL(36, 4)} <br>
     * @param sumPickingNum The value of the column 'SUM_PICKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumPickingNum(java.math.BigDecimal sumPickingNum) {
        registerModifiedProperty("sumPickingNum");
        _sumPickingNum = sumPickingNum;
    }

    /**
     * [get] STORE_LABEL_NO: {VARCHAR(30), refers to t_store_no.STORE_LABEL_NO} <br>
     * 入庫ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] STORE_LABEL_NO: {VARCHAR(30), refers to t_store_no.STORE_LABEL_NO} <br>
     * 入庫ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        registerModifiedProperty("storeLabelNo");
        _storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {VARCHAR(8), refers to t_store_no.STORE_DT} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {VARCHAR(8), refers to t_store_no.STORE_DT} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMT_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'LIMT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimtDt() {
        checkSpecifiedProperty("limtDt");
        return convertEmptyToNull(_limtDt);
    }

    /**
     * [set] LIMT_DT: {VARCHAR(8)} <br>
     * @param limtDt The value of the column 'LIMT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimtDt(String limtDt) {
        registerModifiedProperty("limtDt");
        _limtDt = limtDt;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNm() {
        checkSpecifiedProperty("locationNm");
        return convertEmptyToNull(_locationNm);
    }

    /**
     * [set] LOCATION_NM: {VARCHAR(60)} <br>
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNm(String locationNm) {
        registerModifiedProperty("locationNm");
        _locationNm = locationNm;
    }

    /**
     * [get] PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] SHAPE_SORT: {BIGINT(20)} <br>
     * @return The value of the column 'SHAPE_SORT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeSort() {
        checkSpecifiedProperty("shapeSort");
        return _shapeSort;
    }

    /**
     * [set] SHAPE_SORT: {BIGINT(20)} <br>
     * @param shapeSort The value of the column 'SHAPE_SORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeSort(Long shapeSort) {
        registerModifiedProperty("shapeSort");
        _shapeSort = shapeSort;
    }

    /**
     * [get] SHAPE_ID: {BIGINT(20)} <br>
     * @return The value of the column 'SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeId() {
        checkSpecifiedProperty("shapeId");
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {BIGINT(20)} <br>
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeId(Long shapeId) {
        registerModifiedProperty("shapeId");
        _shapeId = shapeId;
    }

    /**
     * [get] CASE_OUT_FLG: {CHAR(1)} <br>
     * @return The value of the column 'CASE_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseOutFlg() {
        checkSpecifiedProperty("caseOutFlg");
        return convertEmptyToNull(_caseOutFlg);
    }

    /**
     * [set] CASE_OUT_FLG: {CHAR(1)} <br>
     * @param caseOutFlg The value of the column 'CASE_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutFlg(String caseOutFlg) {
        registerModifiedProperty("caseOutFlg");
        _caseOutFlg = caseOutFlg;
    }

    /**
     * [get] FROM_SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'FROM_SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromShippingPackingNo() {
        checkSpecifiedProperty("fromShippingPackingNo");
        return convertEmptyToNull(_fromShippingPackingNo);
    }

    /**
     * [set] FROM_SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @param fromShippingPackingNo The value of the column 'FROM_SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromShippingPackingNo(String fromShippingPackingNo) {
        registerModifiedProperty("fromShippingPackingNo");
        _fromShippingPackingNo = fromShippingPackingNo;
    }

    /**
     * [get] TO_SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TO_SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getToShippingPackingNo() {
        checkSpecifiedProperty("toShippingPackingNo");
        return convertEmptyToNull(_toShippingPackingNo);
    }

    /**
     * [set] TO_SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @param toShippingPackingNo The value of the column 'TO_SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToShippingPackingNo(String toShippingPackingNo) {
        registerModifiedProperty("toShippingPackingNo");
        _toShippingPackingNo = toShippingPackingNo;
    }
}
