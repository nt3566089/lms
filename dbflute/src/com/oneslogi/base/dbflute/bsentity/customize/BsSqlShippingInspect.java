package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of SqlShippingInspect. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     CLIENT_ID, CENTER_ID, ADD_DT, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SUM_INST_NUM, JAN_CD, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, UNIT_NUM, SUM_NET_WEIGHT, SUM_GROSS_WEIGHT, ALLOC_INST_H_ID
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
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * java.math.BigDecimal sumInstNum = entity.getSumInstNum();
 * String janCd = entity.getJanCd();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * Long unitNum = entity.getUnitNum();
 * java.math.BigDecimal sumNetWeight = entity.getSumNetWeight();
 * java.math.BigDecimal sumGrossWeight = entity.getSumGrossWeight();
 * Long allocInstHId = entity.getAllocInstHId();
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setAddDt(addDt);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setSumInstNum(sumInstNum);
 * entity.setJanCd(janCd);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setUnitNum(unitNum);
 * entity.setSumNetWeight(sumNetWeight);
 * entity.setSumGrossWeight(sumGrossWeight);
 * entity.setAllocInstHId(allocInstHId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShippingInspect extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_ID: {BIGINT(20), refers to t_alloc_inst_h.CLIENT_ID} */
    protected Long _clientId;

    /** CENTER_ID: {BIGINT(20), refers to t_alloc_inst_h.CENTER_ID} */
    protected Long _centerId;

    /** ADD_DT: {DATETIME(23), refers to t_picking_h.ADD_DT} */
    protected java.sql.Timestamp _addDt;

    /** SUPPLY_CUSTOMER_CD: {VARCHAR(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(255)} */
    protected String _supplyCustomerNm;

    /** DELIVERY_COURSE_CD: {VARCHAR(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {VARCHAR(60)} */
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {VARCHAR(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    protected String _carrierNm;

    /** SUM_INST_NUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _sumInstNum;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} */
    protected Long _productId;

    /** PRODUCT_CD: {VARCHAR(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    protected String _productNm;

    /** PRODUCT_ABBR: {VARCHAR(60)} */
    protected String _productAbbr;

    /** UNIT_NUM: {BIGINT(20)} */
    protected Long _unitNum;

    /** SUM_NET_WEIGHT: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _sumNetWeight;

    /** SUM_GROSS_WEIGHT: {DECIMAL(50, 8)} */
    protected java.math.BigDecimal _sumGrossWeight;

    /** ALLOC_INST_H_ID: {BIGINT(20)} */
    protected Long _allocInstHId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShippingInspectDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShippingInspect";
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
        if (obj instanceof BsSqlShippingInspect) {
            BsSqlShippingInspect other = (BsSqlShippingInspect)obj;
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
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_sumInstNum));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_sumNetWeight));
        sb.append(dm).append(xfND(_sumGrossWeight));
        sb.append(dm).append(xfND(_allocInstHId));
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
    public SqlShippingInspect clone() {
        return (SqlShippingInspect)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {BIGINT(20), refers to t_alloc_inst_h.CLIENT_ID} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {BIGINT(20), refers to t_alloc_inst_h.CLIENT_ID} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {BIGINT(20), refers to t_alloc_inst_h.CENTER_ID} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {BIGINT(20), refers to t_alloc_inst_h.CENTER_ID} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] ADD_DT: {DATETIME(23), refers to t_picking_h.ADD_DT} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(23), refers to t_picking_h.ADD_DT} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {VARCHAR(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {VARCHAR(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {VARCHAR(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] SUM_INST_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'SUM_INST_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumInstNum() {
        checkSpecifiedProperty("sumInstNum");
        return _sumInstNum;
    }

    /**
     * [set] SUM_INST_NUM: {DECIMAL(36, 4)} <br>
     * @param sumInstNum The value of the column 'SUM_INST_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumInstNum(java.math.BigDecimal sumInstNum) {
        registerModifiedProperty("sumInstNum");
        _sumInstNum = sumInstNum;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
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
     * [get] PRODUCT_CD: {VARCHAR(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {VARCHAR(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {VARCHAR(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] UNIT_NUM: {BIGINT(20)} <br>
     * @return The value of the column 'UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitNum() {
        checkSpecifiedProperty("unitNum");
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {BIGINT(20)} <br>
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNum(Long unitNum) {
        registerModifiedProperty("unitNum");
        _unitNum = unitNum;
    }

    /**
     * [get] SUM_NET_WEIGHT: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'SUM_NET_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumNetWeight() {
        checkSpecifiedProperty("sumNetWeight");
        return _sumNetWeight;
    }

    /**
     * [set] SUM_NET_WEIGHT: {DECIMAL(14, 4)} <br>
     * @param sumNetWeight The value of the column 'SUM_NET_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumNetWeight(java.math.BigDecimal sumNetWeight) {
        registerModifiedProperty("sumNetWeight");
        _sumNetWeight = sumNetWeight;
    }

    /**
     * [get] SUM_GROSS_WEIGHT: {DECIMAL(50, 8)} <br>
     * @return The value of the column 'SUM_GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumGrossWeight() {
        checkSpecifiedProperty("sumGrossWeight");
        return _sumGrossWeight;
    }

    /**
     * [set] SUM_GROSS_WEIGHT: {DECIMAL(50, 8)} <br>
     * @param sumGrossWeight The value of the column 'SUM_GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumGrossWeight(java.math.BigDecimal sumGrossWeight) {
        registerModifiedProperty("sumGrossWeight");
        _sumGrossWeight = sumGrossWeight;
    }

    /**
     * [get] ALLOC_INST_H_ID: {BIGINT(20)} <br>
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstHId() {
        checkSpecifiedProperty("allocInstHId");
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {BIGINT(20)} <br>
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstHId(Long allocInstHId) {
        registerModifiedProperty("allocInstHId");
        _allocInstHId = allocInstHId;
    }
}
