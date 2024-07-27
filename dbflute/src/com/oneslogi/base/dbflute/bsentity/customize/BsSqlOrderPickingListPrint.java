package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of SqlOrderPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     WMS_SHIPPING_SLIP_NO, SHIPPING_SLIP_NO, CLIENT_SHIPPING_NO, CLIENT_CD, CLIENT_NM, CLIENT_ABBR, CENTER_CD, CENTER_NM, CENTER_ABBR, WAREHOUSE_CD, WAREHOUSE_NM, WAREHOUSE_ABBR, WORK_DT, DELIV_DT, CARRIER_CD, CARRIER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, PICKING_WORK_NO, DELIV_UNIT_NO, SHIPPING_PACKING_NO, BOX_CD, BOX_NM, PACKING_CAL_CLS, PICKING_WORK_MESSAGE, PICKING_WORK_MESSAGE_COUNT, LOCATION_CD, LOCATION_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, OPL_OUT_FLG, JAN_CD, STORE_LABEL_NO, STORE_DT, LOT, LIMIT_DT, PICKING_NUM, CHARGE_NUM, TEMP_NO
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
 * String wmsShippingSlipNo = entity.getWmsShippingSlipNo();
 * Long shippingSlipNo = entity.getShippingSlipNo();
 * String clientShippingNo = entity.getClientShippingNo();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String clientAbbr = entity.getClientAbbr();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String centerAbbr = entity.getCenterAbbr();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseNm = entity.getWarehouseNm();
 * String warehouseAbbr = entity.getWarehouseAbbr();
 * String workDt = entity.getWorkDt();
 * String delivDt = entity.getDelivDt();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String delivUnitNo = entity.getDelivUnitNo();
 * String shippingPackingNo = entity.getShippingPackingNo();
 * String boxCd = entity.getBoxCd();
 * String boxNm = entity.getBoxNm();
 * String packingCalCls = entity.getPackingCalCls();
 * String pickingWorkMessage = entity.getPickingWorkMessage();
 * Long pickingWorkMessageCount = entity.getPickingWorkMessageCount();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String oplOutFlg = entity.getOplOutFlg();
 * String janCd = entity.getJanCd();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * java.math.BigDecimal pickingNum = entity.getPickingNum();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * String tempNo = entity.getTempNo();
 * entity.setWmsShippingSlipNo(wmsShippingSlipNo);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setClientAbbr(clientAbbr);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseNm(warehouseNm);
 * entity.setWarehouseAbbr(warehouseAbbr);
 * entity.setWorkDt(workDt);
 * entity.setDelivDt(delivDt);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setDelivUnitNo(delivUnitNo);
 * entity.setShippingPackingNo(shippingPackingNo);
 * entity.setBoxCd(boxCd);
 * entity.setBoxNm(boxNm);
 * entity.setPackingCalCls(packingCalCls);
 * entity.setPickingWorkMessage(pickingWorkMessage);
 * entity.setPickingWorkMessageCount(pickingWorkMessageCount);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setOplOutFlg(oplOutFlg);
 * entity.setJanCd(janCd);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setPickingNum(pickingNum);
 * entity.setChargeNum(chargeNum);
 * entity.setTempNo(tempNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlOrderPickingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WMS_SHIPPING_SLIP_NO: {VARCHAR(30)} */
    protected String _wmsShippingSlipNo;

    /** SHIPPING_SLIP_NO: {BIGINT(21)} */
    protected Long _shippingSlipNo;

    /** CLIENT_SHIPPING_NO: {VARCHAR(30)} */
    protected String _clientShippingNo;

    /** CLIENT_CD: {VARCHAR(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {VARCHAR(60)} */
    protected String _clientNm;

    /** CLIENT_ABBR: {VARCHAR(60)} */
    protected String _clientAbbr;

    /** CENTER_CD: {VARCHAR(30)} */
    protected String _centerCd;

    /** CENTER_NM: {VARCHAR(60)} */
    protected String _centerNm;

    /** CENTER_ABBR: {VARCHAR(60)} */
    protected String _centerAbbr;

    /** WAREHOUSE_CD: {VARCHAR(30)} */
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {VARCHAR(60)} */
    protected String _warehouseNm;

    /** WAREHOUSE_ABBR: {VARCHAR(60)} */
    protected String _warehouseAbbr;

    /** WORK_DT: {VARCHAR(8)} */
    protected String _workDt;

    /** DELIV_DT: {VARCHAR(8)} */
    protected String _delivDt;

    /** CARRIER_CD: {VARCHAR(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    protected String _carrierNm;

    /** DELIVERY_COURSE_CD: {VARCHAR(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {VARCHAR(60)} */
    protected String _deliveryCourseNm;

    /** SUPPLY_CUSTOMER_CD: {VARCHAR(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(60)} */
    protected String _supplyCustomerNm;

    /** PICKING_WORK_NO: {VARCHAR(30), refers to t_picking_h.PICKING_WORK_NO} */
    protected String _pickingWorkNo;

    /** DELIV_UNIT_NO: {VARCHAR(30), refers to t_picking_h.DELIV_UNIT_NO} */
    protected String _delivUnitNo;

    /** SHIPPING_PACKING_NO: {VARCHAR(30), refers to t_packing_h.SHIPPING_PACKING_NO} */
    protected String _shippingPackingNo;

    /** BOX_CD: {VARCHAR(30), refers to m_box.BOX_CD} */
    protected String _boxCd;

    /** BOX_NM: {VARCHAR(60), refers to m_box.BOX_NM} */
    protected String _boxNm;

    /** PACKING_CAL_CLS: {VARCHAR(30), refers to m_param.PACKING_CAL_CLS, classification=PackingCalCls} */
    protected String _packingCalCls;

    /** PICKING_WORK_MESSAGE: {VARCHAR(255)} */
    protected String _pickingWorkMessage;

    /** PICKING_WORK_MESSAGE_COUNT: {BIGINT(21)} */
    protected Long _pickingWorkMessageCount;

    /** LOCATION_CD: {VARCHAR(30)} */
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(60)} */
    protected String _locationNm;

    /** PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} */
    protected Long _productId;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(60), refers to m_product.PRODUCT_ABBR} */
    protected String _productNm;

    /** OPL_OUT_FLG: {CHAR(1), refers to t_picking_r.OPL_OUT_FLG, classification=ListOutFlg} */
    protected String _oplOutFlg;

    /** JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} */
    protected String _janCd;

    /** STORE_LABEL_NO: {VARCHAR(30), refers to t_store_no.STORE_LABEL_NO} */
    protected String _storeLabelNo;

    /** STORE_DT: {VARCHAR(8), refers to t_store_no.STORE_DT} */
    protected String _storeDt;

    /** LOT: {VARCHAR(30)} */
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    protected String _limitDt;

    /** PICKING_NUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _pickingNum;

    /** CHARGE_NUM: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _chargeNum;

    /** TEMP_NO: {VARCHAR(30)} */
    protected String _tempNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlOrderPickingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlOrderPickingListPrint";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of packingCalCls as the classification of PackingCalCls. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), refers to m_param.PACKING_CAL_CLS, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PackingCalCls getPackingCalClsAsPackingCalCls() {
        return CDef.PackingCalCls.codeOf(getPackingCalCls());
    }

    /**
     * Set the value of packingCalCls as the classification of PackingCalCls. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), refers to m_param.PACKING_CAL_CLS, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingCalClsAsPackingCalCls(CDef.PackingCalCls cdef) {
        setPackingCalCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of oplOutFlg as the classification of ListOutFlg. <br>
     * OPL_OUT_FLG: {CHAR(1), refers to t_picking_r.OPL_OUT_FLG, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getOplOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getOplOutFlg());
    }

    /**
     * Set the value of oplOutFlg as the classification of ListOutFlg. <br>
     * OPL_OUT_FLG: {CHAR(1), refers to t_picking_r.OPL_OUT_FLG, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setOplOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setOplOutFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of packingCalCls as $0 (0). <br>
     * $0: 梱包計算無
     */
    public void setPackingCalCls_$0() {
        setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.$0);
    }

    /**
     * Set the value of packingCalCls as $1 (1). <br>
     * $1: 容積と重量による梱包計算
     */
    public void setPackingCalCls_$1() {
        setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.$1);
    }

    /**
     * Set the value of oplOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setOplOutFlg_$0() {
        setOplOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of oplOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setOplOutFlg_$1() {
        setOplOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of packingCalCls $0? <br>
     * $0: 梱包計算無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingCalCls$0() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.equals(CDef.PackingCalCls.$0) : false;
    }

    /**
     * Is the value of packingCalCls $1? <br>
     * $1: 容積と重量による梱包計算
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingCalCls$1() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.equals(CDef.PackingCalCls.$1) : false;
    }

    /**
     * Is the value of oplOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOplOutFlg$0() {
        CDef.ListOutFlg cdef = getOplOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of oplOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOplOutFlg$1() {
        CDef.ListOutFlg cdef = getOplOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'packingCalCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingCalClsName() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'oplOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getOplOutFlgName() {
        CDef.ListOutFlg cdef = getOplOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsSqlOrderPickingListPrint) {
            BsSqlOrderPickingListPrint other = (BsSqlOrderPickingListPrint)obj;
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
        sb.append(dm).append(xfND(_wmsShippingSlipNo));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_clientAbbr));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseNm));
        sb.append(dm).append(xfND(_warehouseAbbr));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_delivUnitNo));
        sb.append(dm).append(xfND(_shippingPackingNo));
        sb.append(dm).append(xfND(_boxCd));
        sb.append(dm).append(xfND(_boxNm));
        sb.append(dm).append(xfND(_packingCalCls));
        sb.append(dm).append(xfND(_pickingWorkMessage));
        sb.append(dm).append(xfND(_pickingWorkMessageCount));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_oplOutFlg));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_pickingNum));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_tempNo));
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
    public SqlOrderPickingListPrint clone() {
        return (SqlOrderPickingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WMS_SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'WMS_SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsShippingSlipNo() {
        checkSpecifiedProperty("wmsShippingSlipNo");
        return convertEmptyToNull(_wmsShippingSlipNo);
    }

    /**
     * [set] WMS_SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * @param wmsShippingSlipNo The value of the column 'WMS_SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsShippingSlipNo(String wmsShippingSlipNo) {
        registerModifiedProperty("wmsShippingSlipNo");
        _wmsShippingSlipNo = wmsShippingSlipNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {BIGINT(21)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {BIGINT(21)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(Long shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(30)} <br>
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
     * [get] CLIENT_ABBR: {VARCHAR(60)} <br>
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAbbr() {
        checkSpecifiedProperty("clientAbbr");
        return convertEmptyToNull(_clientAbbr);
    }

    /**
     * [set] CLIENT_ABBR: {VARCHAR(60)} <br>
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAbbr(String clientAbbr) {
        registerModifiedProperty("clientAbbr");
        _clientAbbr = clientAbbr;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30)} <br>
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
     * [get] CENTER_ABBR: {VARCHAR(60)} <br>
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterAbbr() {
        checkSpecifiedProperty("centerAbbr");
        return convertEmptyToNull(_centerAbbr);
    }

    /**
     * [set] CENTER_ABBR: {VARCHAR(60)} <br>
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterAbbr(String centerAbbr) {
        registerModifiedProperty("centerAbbr");
        _centerAbbr = centerAbbr;
    }

    /**
     * [get] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {VARCHAR(30)} <br>
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
     * [get] WAREHOUSE_ABBR: {VARCHAR(60)} <br>
     * @return The value of the column 'WAREHOUSE_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseAbbr() {
        checkSpecifiedProperty("warehouseAbbr");
        return convertEmptyToNull(_warehouseAbbr);
    }

    /**
     * [set] WAREHOUSE_ABBR: {VARCHAR(60)} <br>
     * @param warehouseAbbr The value of the column 'WAREHOUSE_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseAbbr(String warehouseAbbr) {
        registerModifiedProperty("warehouseAbbr");
        _warehouseAbbr = warehouseAbbr;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {VARCHAR(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
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
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
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
     * [get] DELIV_UNIT_NO: {VARCHAR(30), refers to t_picking_h.DELIV_UNIT_NO} <br>
     * 届先単位No.
     * @return The value of the column 'DELIV_UNIT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivUnitNo() {
        checkSpecifiedProperty("delivUnitNo");
        return convertEmptyToNull(_delivUnitNo);
    }

    /**
     * [set] DELIV_UNIT_NO: {VARCHAR(30), refers to t_picking_h.DELIV_UNIT_NO} <br>
     * 届先単位No.
     * @param delivUnitNo The value of the column 'DELIV_UNIT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivUnitNo(String delivUnitNo) {
        registerModifiedProperty("delivUnitNo");
        _delivUnitNo = delivUnitNo;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {VARCHAR(30), refers to t_packing_h.SHIPPING_PACKING_NO} <br>
     * 出荷梱包No.
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPackingNo() {
        checkSpecifiedProperty("shippingPackingNo");
        return convertEmptyToNull(_shippingPackingNo);
    }

    /**
     * [set] SHIPPING_PACKING_NO: {VARCHAR(30), refers to t_packing_h.SHIPPING_PACKING_NO} <br>
     * 出荷梱包No.
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        registerModifiedProperty("shippingPackingNo");
        _shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] BOX_CD: {VARCHAR(30), refers to m_box.BOX_CD} <br>
     * 荷材CD
     * @return The value of the column 'BOX_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxCd() {
        checkSpecifiedProperty("boxCd");
        return convertEmptyToNull(_boxCd);
    }

    /**
     * [set] BOX_CD: {VARCHAR(30), refers to m_box.BOX_CD} <br>
     * 荷材CD
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxCd(String boxCd) {
        registerModifiedProperty("boxCd");
        _boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {VARCHAR(60), refers to m_box.BOX_NM} <br>
     * 荷材名称
     * @return The value of the column 'BOX_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNm() {
        checkSpecifiedProperty("boxNm");
        return convertEmptyToNull(_boxNm);
    }

    /**
     * [set] BOX_NM: {VARCHAR(60), refers to m_box.BOX_NM} <br>
     * 荷材名称
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNm(String boxNm) {
        registerModifiedProperty("boxNm");
        _boxNm = boxNm;
    }

    /**
     * [get] PACKING_CAL_CLS: {VARCHAR(30), refers to m_param.PACKING_CAL_CLS, classification=PackingCalCls} <br>
     * 梱包計算処理区分<br>
     * // cls(PackingCalCls)
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingCalCls() {
        checkSpecifiedProperty("packingCalCls");
        return convertEmptyToNull(_packingCalCls);
    }

    /**
     * [set] PACKING_CAL_CLS: {VARCHAR(30), refers to m_param.PACKING_CAL_CLS, classification=PackingCalCls} <br>
     * 梱包計算処理区分<br>
     * // cls(PackingCalCls)
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingCalCls(String packingCalCls) {
        registerModifiedProperty("packingCalCls");
        _packingCalCls = packingCalCls;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkMessage() {
        checkSpecifiedProperty("pickingWorkMessage");
        return convertEmptyToNull(_pickingWorkMessage);
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        registerModifiedProperty("pickingWorkMessage");
        _pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] PICKING_WORK_MESSAGE_COUNT: {BIGINT(21)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingWorkMessageCount() {
        checkSpecifiedProperty("pickingWorkMessageCount");
        return _pickingWorkMessageCount;
    }

    /**
     * [set] PICKING_WORK_MESSAGE_COUNT: {BIGINT(21)} <br>
     * @param pickingWorkMessageCount The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessageCount(Long pickingWorkMessageCount) {
        registerModifiedProperty("pickingWorkMessageCount");
        _pickingWorkMessageCount = pickingWorkMessageCount;
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
     * [get] PRODUCT_NM: {VARCHAR(60), refers to m_product.PRODUCT_ABBR} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(60), refers to m_product.PRODUCT_ABBR} <br>
     * 商品略称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] OPL_OUT_FLG: {CHAR(1), refers to t_picking_r.OPL_OUT_FLG, classification=ListOutFlg} <br>
     * オーダーピッキングリスト出力フラグ<br>
     * // cls(ListOutFlg)
     * @return The value of the column 'OPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOplOutFlg() {
        checkSpecifiedProperty("oplOutFlg");
        return convertEmptyToNull(_oplOutFlg);
    }

    /**
     * [set] OPL_OUT_FLG: {CHAR(1), refers to t_picking_r.OPL_OUT_FLG, classification=ListOutFlg} <br>
     * オーダーピッキングリスト出力フラグ<br>
     * // cls(ListOutFlg)
     * @param oplOutFlg The value of the column 'OPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOplOutFlg(String oplOutFlg) {
        registerModifiedProperty("oplOutFlg");
        _oplOutFlg = oplOutFlg;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
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
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] PICKING_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'PICKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickingNum() {
        checkSpecifiedProperty("pickingNum");
        return _pickingNum;
    }

    /**
     * [set] PICKING_NUM: {DECIMAL(36, 4)} <br>
     * @param pickingNum The value of the column 'PICKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        registerModifiedProperty("pickingNum");
        _pickingNum = pickingNum;
    }

    /**
     * [get] CHARGE_NUM: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {DECIMAL(14, 4)} <br>
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] TEMP_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TEMP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTempNo() {
        checkSpecifiedProperty("tempNo");
        return convertEmptyToNull(_tempNo);
    }

    /**
     * [set] TEMP_NO: {VARCHAR(30)} <br>
     * @param tempNo The value of the column 'TEMP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTempNo(String tempNo) {
        registerModifiedProperty("tempNo");
        _tempNo = tempNo;
    }
}
