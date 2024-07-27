package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of SqlPackingListUpdate. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PACKING_H_ID, CENTER_ID, CENTER_CD, CENTER_NM, CLIENT_ID, CLIENT_CD, CLIENT_NM, BOX_CD, BOX_NM, PRODUCT_CD, JAN_CD, PRODUCT_NM, PRODUCT_ID, PRODUCT_ABBR, PACKING_NUM_SUM, DELIV_DT, DELIV_TZ, DELIV_ZIP_CD, DELIV_TEL_NO, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_CUSTOMER_NM, VERSION_NO, PROCESS_TYPE_ID, ALLOC_INST_H_ID, PICKING_H_ID, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, PICKING_NUM_SUM, UPD_DT, COUNT
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
 * Long packingHId = entity.getPackingHId();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String boxCd = entity.getBoxCd();
 * String boxNm = entity.getBoxNm();
 * String productCd = entity.getProductCd();
 * String janCd = entity.getJanCd();
 * String productNm = entity.getProductNm();
 * Long productId = entity.getProductId();
 * String productAbbr = entity.getProductAbbr();
 * java.math.BigDecimal packingNumSum = entity.getPackingNumSum();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * String delivZipCd = entity.getDelivZipCd();
 * String delivTelNo = entity.getDelivTelNo();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * Long versionNo = entity.getVersionNo();
 * Long processTypeId = entity.getProcessTypeId();
 * Long allocInstHId = entity.getAllocInstHId();
 * Long pickingHId = entity.getPickingHId();
 * String shippingPackingNo = entity.getShippingPackingNo();
 * String carrierTraceNum = entity.getCarrierTraceNum();
 * java.math.BigDecimal pickingNumSum = entity.getPickingNumSum();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * Long count = entity.getCount();
 * entity.setPackingHId(packingHId);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setBoxCd(boxCd);
 * entity.setBoxNm(boxNm);
 * entity.setProductCd(productCd);
 * entity.setJanCd(janCd);
 * entity.setProductNm(productNm);
 * entity.setProductId(productId);
 * entity.setProductAbbr(productAbbr);
 * entity.setPackingNumSum(packingNumSum);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setDelivZipCd(delivZipCd);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setVersionNo(versionNo);
 * entity.setProcessTypeId(processTypeId);
 * entity.setAllocInstHId(allocInstHId);
 * entity.setPickingHId(pickingHId);
 * entity.setShippingPackingNo(shippingPackingNo);
 * entity.setCarrierTraceNum(carrierTraceNum);
 * entity.setPickingNumSum(pickingNumSum);
 * entity.setUpdDt(updDt);
 * entity.setCount(count);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlPackingListUpdate extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PACKING_H_ID: {BIGINT(20), refers to t_packing_h.PACKING_H_ID} */
    protected Long _packingHId;

    /** CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} */
    protected Long _centerId;

    /** CENTER_CD: {VARCHAR(30)} */
    protected String _centerCd;

    /** CENTER_NM: {VARCHAR(60)} */
    protected String _centerNm;

    /** CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} */
    protected Long _clientId;

    /** CLIENT_CD: {VARCHAR(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {VARCHAR(60)} */
    protected String _clientNm;

    /** BOX_CD: {VARCHAR(30)} */
    protected String _boxCd;

    /** BOX_NM: {VARCHAR(60)} */
    protected String _boxNm;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    protected String _productCd;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    protected String _productNm;

    /** PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} */
    protected Long _productId;

    /** PRODUCT_ABBR: {VARCHAR(60)} */
    protected String _productAbbr;

    /** PACKING_NUM_SUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _packingNumSum;

    /** DELIV_DT: {VARCHAR(8)} */
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30)} */
    protected String _delivTz;

    /** DELIV_ZIP_CD: {VARCHAR(30)} */
    protected String _delivZipCd;

    /** DELIV_TEL_NO: {VARCHAR(1020)} */
    protected String _delivTelNo;

    /** DELIV_ADDRESS1: {VARCHAR(1020)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {VARCHAR(1020)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {VARCHAR(1020)} */
    protected String _delivAddress3;

    /** DELIV_CUSTOMER_NM: {VARCHAR(1020)} */
    protected String _delivCustomerNm;

    /** VERSION_NO: {BIGINT(20)} */
    protected Long _versionNo;

    /** PROCESS_TYPE_ID: {BIGINT(20), refers to t_packing_h.PROCESS_TYPE_ID} */
    protected Long _processTypeId;

    /** ALLOC_INST_H_ID: {BIGINT(20), refers to t_packing_h.ALLOC_INST_H_ID} */
    protected Long _allocInstHId;

    /** PICKING_H_ID: {BIGINT(20), refers to t_packing_h.PICKING_H_ID} */
    protected Long _pickingHId;

    /** SHIPPING_PACKING_NO: {VARCHAR(30)} */
    protected String _shippingPackingNo;

    /** CARRIER_TRACE_NUM: {VARCHAR(30)} */
    protected String _carrierTraceNum;

    /** PICKING_NUM_SUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _pickingNumSum;

    /** UPD_DT: {DATETIME(23)} */
    protected java.sql.Timestamp _updDt;

    /** COUNT: {BIGINT(21)} */
    protected Long _count;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlPackingListUpdateDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlPackingListUpdate";
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
        if (obj instanceof BsSqlPackingListUpdate) {
            BsSqlPackingListUpdate other = (BsSqlPackingListUpdate)obj;
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
        sb.append(dm).append(xfND(_packingHId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_boxCd));
        sb.append(dm).append(xfND(_boxNm));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_packingNumSum));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_delivZipCd));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_shippingPackingNo));
        sb.append(dm).append(xfND(_carrierTraceNum));
        sb.append(dm).append(xfND(_pickingNumSum));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_count));
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
    public SqlPackingListUpdate clone() {
        return (SqlPackingListUpdate)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PACKING_H_ID: {BIGINT(20), refers to t_packing_h.PACKING_H_ID} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPackingHId() {
        checkSpecifiedProperty("packingHId");
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {BIGINT(20), refers to t_packing_h.PACKING_H_ID} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingHId(Long packingHId) {
        registerModifiedProperty("packingHId");
        _packingHId = packingHId;
    }

    /**
     * [get] CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
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
     * [get] CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
     * [get] BOX_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxCd() {
        checkSpecifiedProperty("boxCd");
        return convertEmptyToNull(_boxCd);
    }

    /**
     * [set] BOX_CD: {VARCHAR(30)} <br>
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxCd(String boxCd) {
        registerModifiedProperty("boxCd");
        _boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'BOX_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNm() {
        checkSpecifiedProperty("boxNm");
        return convertEmptyToNull(_boxNm);
    }

    /**
     * [set] BOX_NM: {VARCHAR(60)} <br>
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNm(String boxNm) {
        registerModifiedProperty("boxNm");
        _boxNm = boxNm;
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
     * [get] PACKING_NUM_SUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'PACKING_NUM_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNumSum() {
        checkSpecifiedProperty("packingNumSum");
        return _packingNumSum;
    }

    /**
     * [set] PACKING_NUM_SUM: {DECIMAL(36, 4)} <br>
     * @param packingNumSum The value of the column 'PACKING_NUM_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNumSum(java.math.BigDecimal packingNumSum) {
        registerModifiedProperty("packingNumSum");
        _packingNumSum = packingNumSum;
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
     * [get] DELIV_TZ: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {VARCHAR(30)} <br>
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_TEL_NO: {VARCHAR(1020)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {VARCHAR(1020)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIV_ADDRESS1: {VARCHAR(1020)} <br>
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {VARCHAR(1020)} <br>
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {VARCHAR(1020)} <br>
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {VARCHAR(1020)} <br>
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {VARCHAR(1020)} <br>
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {VARCHAR(1020)} <br>
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {VARCHAR(1020)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {VARCHAR(1020)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] VERSION_NO: {BIGINT(20)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {BIGINT(20)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] PROCESS_TYPE_ID: {BIGINT(20), refers to t_packing_h.PROCESS_TYPE_ID} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProcessTypeId() {
        checkSpecifiedProperty("processTypeId");
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {BIGINT(20), refers to t_packing_h.PROCESS_TYPE_ID} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeId(Long processTypeId) {
        registerModifiedProperty("processTypeId");
        _processTypeId = processTypeId;
    }

    /**
     * [get] ALLOC_INST_H_ID: {BIGINT(20), refers to t_packing_h.ALLOC_INST_H_ID} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstHId() {
        checkSpecifiedProperty("allocInstHId");
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {BIGINT(20), refers to t_packing_h.ALLOC_INST_H_ID} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstHId(Long allocInstHId) {
        registerModifiedProperty("allocInstHId");
        _allocInstHId = allocInstHId;
    }

    /**
     * [get] PICKING_H_ID: {BIGINT(20), refers to t_packing_h.PICKING_H_ID} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {BIGINT(20), refers to t_packing_h.PICKING_H_ID} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPackingNo() {
        checkSpecifiedProperty("shippingPackingNo");
        return convertEmptyToNull(_shippingPackingNo);
    }

    /**
     * [set] SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        registerModifiedProperty("shippingPackingNo");
        _shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {VARCHAR(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierTraceNum() {
        checkSpecifiedProperty("carrierTraceNum");
        return convertEmptyToNull(_carrierTraceNum);
    }

    /**
     * [set] CARRIER_TRACE_NUM: {VARCHAR(30)} <br>
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        registerModifiedProperty("carrierTraceNum");
        _carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] PICKING_NUM_SUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'PICKING_NUM_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickingNumSum() {
        checkSpecifiedProperty("pickingNumSum");
        return _pickingNumSum;
    }

    /**
     * [set] PICKING_NUM_SUM: {DECIMAL(36, 4)} <br>
     * @param pickingNumSum The value of the column 'PICKING_NUM_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingNumSum(java.math.BigDecimal pickingNumSum) {
        registerModifiedProperty("pickingNumSum");
        _pickingNumSum = pickingNumSum;
    }

    /**
     * [get] UPD_DT: {DATETIME(23)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(23)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] COUNT: {BIGINT(21)} <br>
     * @return The value of the column 'COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCount() {
        checkSpecifiedProperty("count");
        return _count;
    }

    /**
     * [set] COUNT: {BIGINT(21)} <br>
     * @param count The value of the column 'COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCount(Long count) {
        registerModifiedProperty("count");
        _count = count;
    }
}
