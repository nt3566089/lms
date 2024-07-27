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
 * The entity of m_customer as TABLE. <br>
 * 取引先マスタ
 * <pre>
 * [primary-key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, CLIENT_ID, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, ZIP_CD, TEL_NO, ADDRESS1, ADDRESS2, ADDRESS3, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ALLOC_ORDER, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, DELIV_CUSTOMER_ID, ACCOUNT_FLG, CENTER_ID, SALES_ORG_ID, LOT_SPLIT_TYPE_CD, LIMIT_DT_SPLIT_TYPE_CD, PROD_DT_SPLIT_TYPE_CD, LOT_UNMATCH_TYPE_CD, LIMIT_DT_UNMATCH_TYPE_CD, PROD_DT_UNMATCH_TYPE_CD, UNI_CUSTOMER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client, m_customer, m_client_center(ByClientId), b_class_dtl(ByDelFlg), m_carrier_slip_ces(AsOne)
 *
 * [referrer table]
 *     m_carrier_decision, m_center_customer, m_client, m_client_center, m_customer, m_customer_picking, m_deposit_product, m_location, m_location_replenish_product, m_user_deposit, t_alloc_inst_b, t_alloc_inst_h, t_alloc_lot, t_inventory_b, t_inventory_inst, t_keeping_lot, t_last_lot, t_move_inst_b, t_receive_plan_h, t_shipping_inst_b, t_shipping_inst_h, t_stock, t_store_no, t_store_record_h, w_ht_inventory_input_prod, w_ht_receive_no_plan_insp, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, m_carrier_slip_ces
 *
 * [foreign property]
 *     mClient, mCustomerSelf, mClientCenterByClientId, bClassDtlByDelFlg, bClassDtlByDeliveryFlg, bClassDtlByDepositFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotReverseFlg, bClassDtlByOnetimeFlg, bClassDtlByShippingStopFlg, bClassDtlByVendorFlg, mCarrierSlipCesAsOne
 *
 * [referrer property]
 *     mCarrierDecisionList, mCenterCustomerList, mClientList, mClientCenterList, mCustomerSelfList, mCustomerPickingList, mDepositProductList, mLocationList, mLocationReplenishProductList, mUserDepositList, tAllocInstBList, tAllocInstHBySupplyCustomerIdList, tAllocInstHByDelivCustomerIdList, tAllocLotList, tInventoryBByAccountIdList, tInventoryBByDepositIdList, tInventoryBBySupplierIdList, tInventoryInstList, tKeepingLotList, tLastLotList, tMoveInstBByDepositIdList, tMoveInstBBySupplierIdList, tMoveInstBByAccountIdList, tReceivePlanHByPlanSupplierIdList, tReceivePlanHByPlanDepositIdList, tShippingInstBList, tShippingInstHByDelivCustomerIdList, tShippingInstHBySupplyCustomerIdList, tStockList, tStoreNoList, tStoreRecordHBySupplierIdList, tStoreRecordHByDepositIdList, wHtInventoryInputProdList, wHtReceiveNoPlanInspBySupplierIdList, wHtReceiveNoPlanInspByDepositIdList, wHtSerialReceiveInspList, wHtSerialShippingInspList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long customerId = entity.getCustomerId();
 * Long clientId = entity.getClientId();
 * String customerCd = entity.getCustomerCd();
 * String customerNm = entity.getCustomerNm();
 * String customerAbbr = entity.getCustomerAbbr();
 * String zipCd = entity.getZipCd();
 * String telNo = entity.getTelNo();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String vendorFlg = entity.getVendorFlg();
 * String deliveryFlg = entity.getDeliveryFlg();
 * String onetimeFlg = entity.getOnetimeFlg();
 * String depositFlg = entity.getDepositFlg();
 * Long allocOrder = entity.getAllocOrder();
 * String lotReverseFlg = entity.getLotReverseFlg();
 * String limitDtReverseFlg = entity.getLimitDtReverseFlg();
 * String shippingStopFlg = entity.getShippingStopFlg();
 * Long delivCustomerId = entity.getDelivCustomerId();
 * String accountFlg = entity.getAccountFlg();
 * Long centerId = entity.getCenterId();
 * Long salesOrgId = entity.getSalesOrgId();
 * String lotSplitTypeCd = entity.getLotSplitTypeCd();
 * String limitDtSplitTypeCd = entity.getLimitDtSplitTypeCd();
 * String prodDtSplitTypeCd = entity.getProdDtSplitTypeCd();
 * String lotUnmatchTypeCd = entity.getLotUnmatchTypeCd();
 * String limitDtUnmatchTypeCd = entity.getLimitDtUnmatchTypeCd();
 * String prodDtUnmatchTypeCd = entity.getProdDtUnmatchTypeCd();
 * String uniCustomerCd = entity.getUniCustomerCd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCustomerId(customerId);
 * entity.setClientId(clientId);
 * entity.setCustomerCd(customerCd);
 * entity.setCustomerNm(customerNm);
 * entity.setCustomerAbbr(customerAbbr);
 * entity.setZipCd(zipCd);
 * entity.setTelNo(telNo);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setVendorFlg(vendorFlg);
 * entity.setDeliveryFlg(deliveryFlg);
 * entity.setOnetimeFlg(onetimeFlg);
 * entity.setDepositFlg(depositFlg);
 * entity.setAllocOrder(allocOrder);
 * entity.setLotReverseFlg(lotReverseFlg);
 * entity.setLimitDtReverseFlg(limitDtReverseFlg);
 * entity.setShippingStopFlg(shippingStopFlg);
 * entity.setDelivCustomerId(delivCustomerId);
 * entity.setAccountFlg(accountFlg);
 * entity.setCenterId(centerId);
 * entity.setSalesOrgId(salesOrgId);
 * entity.setLotSplitTypeCd(lotSplitTypeCd);
 * entity.setLimitDtSplitTypeCd(limitDtSplitTypeCd);
 * entity.setProdDtSplitTypeCd(prodDtSplitTypeCd);
 * entity.setLotUnmatchTypeCd(lotUnmatchTypeCd);
 * entity.setLimitDtUnmatchTypeCd(limitDtUnmatchTypeCd);
 * entity.setProdDtUnmatchTypeCd(prodDtUnmatchTypeCd);
 * entity.setUniCustomerCd(uniCustomerCd);
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
public abstract class BsMCustomer extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER} */
    protected Long _customerId;

    /** CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)} */
    protected String _customerCd;

    /** CUSTOMER_NM: {NotNull, VARCHAR(60)} */
    protected String _customerNm;

    /** CUSTOMER_ABBR: {VARCHAR(60)} */
    protected String _customerAbbr;

    /** ZIP_CD: {VARCHAR(30)} */
    protected String _zipCd;

    /** TEL_NO: {VARCHAR(30)} */
    protected String _telNo;

    /** ADDRESS1: {VARCHAR(60)} */
    protected String _address1;

    /** ADDRESS2: {VARCHAR(60)} */
    protected String _address2;

    /** ADDRESS3: {VARCHAR(60)} */
    protected String _address3;

    /** VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} */
    protected String _vendorFlg;

    /** DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} */
    protected String _deliveryFlg;

    /** ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} */
    protected String _onetimeFlg;

    /** DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} */
    protected String _depositFlg;

    /** ALLOC_ORDER: {BIGINT(19)} */
    protected Long _allocOrder;

    /** LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} */
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} */
    protected String _limitDtReverseFlg;

    /** SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} */
    protected String _shippingStopFlg;

    /** DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _delivCustomerId;

    /** ACCOUNT_FLG: {CHAR(1)} */
    protected String _accountFlg;

    /** CENTER_ID: {BIGINT(19)} */
    protected Long _centerId;

    /** SALES_ORG_ID: {BIGINT(19)} */
    protected Long _salesOrgId;

    /** LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} */
    protected String _lotSplitTypeCd;

    /** LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} */
    protected String _limitDtSplitTypeCd;

    /** PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} */
    protected String _prodDtSplitTypeCd;

    /** LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} */
    protected String _lotUnmatchTypeCd;

    /** LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} */
    protected String _limitDtUnmatchTypeCd;

    /** PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} */
    protected String _prodDtUnmatchTypeCd;

    /** UNI_CUSTOMER_CD: {VARCHAR(30)} */
    protected String _uniCustomerCd;

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
        return "m_customer";
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
        if (_customerId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientId : UQ+, NotNull, BIGINT(19), FK to m_client. (NotNull)
     * @param customerCd : +UQ, IX, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(Long clientId, String customerCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientId");
        __uniqueDrivenProperties.addPropertyName("customerCd");
        setClientId(clientId);setCustomerCd(customerCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of vendorFlg as the classification of VendorFlg. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.VendorFlg getVendorFlgAsVendorFlg() {
        return CDef.VendorFlg.codeOf(getVendorFlg());
    }

    /**
     * Set the value of vendorFlg as the classification of VendorFlg. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setVendorFlgAsVendorFlg(CDef.VendorFlg cdef) {
        setVendorFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of deliveryFlg as the classification of DeliveryFlg. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DeliveryFlg getDeliveryFlgAsDeliveryFlg() {
        return CDef.DeliveryFlg.codeOf(getDeliveryFlg());
    }

    /**
     * Set the value of deliveryFlg as the classification of DeliveryFlg. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDeliveryFlgAsDeliveryFlg(CDef.DeliveryFlg cdef) {
        setDeliveryFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of onetimeFlg as the classification of OnetimeFlg. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.OnetimeFlg getOnetimeFlgAsOnetimeFlg() {
        return CDef.OnetimeFlg.codeOf(getOnetimeFlg());
    }

    /**
     * Set the value of onetimeFlg as the classification of OnetimeFlg. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setOnetimeFlgAsOnetimeFlg(CDef.OnetimeFlg cdef) {
        setOnetimeFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of depositFlg as the classification of DepositFlg. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DepositFlg getDepositFlgAsDepositFlg() {
        return CDef.DepositFlg.codeOf(getDepositFlg());
    }

    /**
     * Set the value of depositFlg as the classification of DepositFlg. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDepositFlgAsDepositFlg(CDef.DepositFlg cdef) {
        setDepositFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of lotReverseFlg as the classification of LotReverseFlg. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LotReverseFlg getLotReverseFlgAsLotReverseFlg() {
        return CDef.LotReverseFlg.codeOf(getLotReverseFlg());
    }

    /**
     * Set the value of lotReverseFlg as the classification of LotReverseFlg. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg cdef) {
        setLotReverseFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitDtReverseFlg as the classification of LimitDtReverseFlg. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitDtReverseFlg getLimitDtReverseFlgAsLimitDtReverseFlg() {
        return CDef.LimitDtReverseFlg.codeOf(getLimitDtReverseFlg());
    }

    /**
     * Set the value of limitDtReverseFlg as the classification of LimitDtReverseFlg. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        setLimitDtReverseFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of shippingStopFlg as the classification of ShippingStopFlg. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingStopFlg getShippingStopFlgAsShippingStopFlg() {
        return CDef.ShippingStopFlg.codeOf(getShippingStopFlg());
    }

    /**
     * Set the value of shippingStopFlg as the classification of ShippingStopFlg. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        setShippingStopFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of vendorFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setVendorFlg_$1() {
        setVendorFlgAsVendorFlg(CDef.VendorFlg.$1);
    }

    /**
     * Set the value of vendorFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setVendorFlg_$0() {
        setVendorFlgAsVendorFlg(CDef.VendorFlg.$0);
    }

    /**
     * Set the value of deliveryFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setDeliveryFlg_$1() {
        setDeliveryFlgAsDeliveryFlg(CDef.DeliveryFlg.$1);
    }

    /**
     * Set the value of deliveryFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setDeliveryFlg_$0() {
        setDeliveryFlgAsDeliveryFlg(CDef.DeliveryFlg.$0);
    }

    /**
     * Set the value of onetimeFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setOnetimeFlg_$1() {
        setOnetimeFlgAsOnetimeFlg(CDef.OnetimeFlg.$1);
    }

    /**
     * Set the value of onetimeFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setOnetimeFlg_$0() {
        setOnetimeFlgAsOnetimeFlg(CDef.OnetimeFlg.$0);
    }

    /**
     * Set the value of depositFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setDepositFlg_$1() {
        setDepositFlgAsDepositFlg(CDef.DepositFlg.$1);
    }

    /**
     * Set the value of depositFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setDepositFlg_$0() {
        setDepositFlgAsDepositFlg(CDef.DepositFlg.$0);
    }

    /**
     * Set the value of lotReverseFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_$1() {
        setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    /**
     * Set the value of lotReverseFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_$0() {
        setLotReverseFlgAsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    /**
     * Set the value of limitDtReverseFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_$1() {
        setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    /**
     * Set the value of limitDtReverseFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_$0() {
        setLimitDtReverseFlgAsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    /**
     * Set the value of shippingStopFlg as $1 (1). <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_$1() {
        setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    /**
     * Set the value of shippingStopFlg as $0 (0). <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_$0() {
        setShippingStopFlgAsShippingStopFlg(CDef.ShippingStopFlg.$0);
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
     * Is the value of vendorFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isVendorFlg$1() {
        CDef.VendorFlg cdef = getVendorFlgAsVendorFlg();
        return cdef != null ? cdef.equals(CDef.VendorFlg.$1) : false;
    }

    /**
     * Is the value of vendorFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isVendorFlg$0() {
        CDef.VendorFlg cdef = getVendorFlgAsVendorFlg();
        return cdef != null ? cdef.equals(CDef.VendorFlg.$0) : false;
    }

    /**
     * Is the value of deliveryFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDeliveryFlg$1() {
        CDef.DeliveryFlg cdef = getDeliveryFlgAsDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.DeliveryFlg.$1) : false;
    }

    /**
     * Is the value of deliveryFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDeliveryFlg$0() {
        CDef.DeliveryFlg cdef = getDeliveryFlgAsDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.DeliveryFlg.$0) : false;
    }

    /**
     * Is the value of onetimeFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOnetimeFlg$1() {
        CDef.OnetimeFlg cdef = getOnetimeFlgAsOnetimeFlg();
        return cdef != null ? cdef.equals(CDef.OnetimeFlg.$1) : false;
    }

    /**
     * Is the value of onetimeFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOnetimeFlg$0() {
        CDef.OnetimeFlg cdef = getOnetimeFlgAsOnetimeFlg();
        return cdef != null ? cdef.equals(CDef.OnetimeFlg.$0) : false;
    }

    /**
     * Is the value of depositFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDepositFlg$1() {
        CDef.DepositFlg cdef = getDepositFlgAsDepositFlg();
        return cdef != null ? cdef.equals(CDef.DepositFlg.$1) : false;
    }

    /**
     * Is the value of depositFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDepositFlg$0() {
        CDef.DepositFlg cdef = getDepositFlgAsDepositFlg();
        return cdef != null ? cdef.equals(CDef.DepositFlg.$0) : false;
    }

    /**
     * Is the value of lotReverseFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotReverseFlg$1() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.equals(CDef.LotReverseFlg.$1) : false;
    }

    /**
     * Is the value of lotReverseFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotReverseFlg$0() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.equals(CDef.LotReverseFlg.$0) : false;
    }

    /**
     * Is the value of limitDtReverseFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtReverseFlg$1() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtReverseFlg.$1) : false;
    }

    /**
     * Is the value of limitDtReverseFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtReverseFlg$0() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtReverseFlg.$0) : false;
    }

    /**
     * Is the value of shippingStopFlg $1? <br>
     * $1: 出荷停止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStopFlg$1() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
        return cdef != null ? cdef.equals(CDef.ShippingStopFlg.$1) : false;
    }

    /**
     * Is the value of shippingStopFlg $0? <br>
     * $0: 出荷可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStopFlg$0() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
        return cdef != null ? cdef.equals(CDef.ShippingStopFlg.$0) : false;
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
     * Get the value of the column 'vendorFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getVendorFlgName() {
        CDef.VendorFlg cdef = getVendorFlgAsVendorFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'deliveryFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDeliveryFlgName() {
        CDef.DeliveryFlg cdef = getDeliveryFlgAsDeliveryFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'onetimeFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getOnetimeFlgName() {
        CDef.OnetimeFlg cdef = getOnetimeFlgAsOnetimeFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'depositFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDepositFlgName() {
        CDef.DepositFlg cdef = getDepositFlgAsDepositFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'lotReverseFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLotReverseFlgName() {
        CDef.LotReverseFlg cdef = getLotReverseFlgAsLotReverseFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitDtReverseFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitDtReverseFlgName() {
        CDef.LimitDtReverseFlg cdef = getLimitDtReverseFlgAsLimitDtReverseFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'shippingStopFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingStopFlgName() {
        CDef.ShippingStopFlg cdef = getShippingStopFlgAsShippingStopFlg();
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
    /** m_client by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] m_client by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] m_client by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'. */
    protected MCustomer _mCustomerSelf;

    /**
     * [get] m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'. <br>
     * @return The entity of foreign property 'MCustomerSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerSelf() {
        return _mCustomerSelf;
    }

    /**
     * [set] m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * @param mCustomerSelf The entity of foreign property 'MCustomerSelf'. (NullAllowed)
     */
    public void setMCustomerSelf(MCustomer mCustomerSelf) {
        _mCustomerSelf = mCustomerSelf;
    }

    /** m_client_center by my CUSTOMER_ID, CLIENT_ID, named 'MClientCenterByClientId'. */
    protected MClientCenter _mClientCenterByClientId;

    /**
     * [get] m_client_center by my CUSTOMER_ID, CLIENT_ID, named 'MClientCenterByClientId'. <br>
     * @return The entity of foreign property 'MClientCenterByClientId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClientCenter getMClientCenterByClientId() {
        return _mClientCenterByClientId;
    }

    /**
     * [set] m_client_center by my CUSTOMER_ID, CLIENT_ID, named 'MClientCenterByClientId'.
     * @param mClientCenterByClientId The entity of foreign property 'MClientCenterByClientId'. (NullAllowed)
     */
    public void setMClientCenterByClientId(MClientCenter mClientCenterByClientId) {
        _mClientCenterByClientId = mClientCenterByClientId;
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

    /** b_class_dtl by my DELIVERY_FLG, named 'BClassDtlByDeliveryFlg'. */
    protected BClassDtl _bClassDtlByDeliveryFlg;

    /**
     * [get] b_class_dtl by my DELIVERY_FLG, named 'BClassDtlByDeliveryFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDeliveryFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDeliveryFlg() {
        return _bClassDtlByDeliveryFlg;
    }

    /**
     * [set] b_class_dtl by my DELIVERY_FLG, named 'BClassDtlByDeliveryFlg'.
     * @param bClassDtlByDeliveryFlg The entity of foreign property 'BClassDtlByDeliveryFlg'. (NullAllowed)
     */
    public void setBClassDtlByDeliveryFlg(BClassDtl bClassDtlByDeliveryFlg) {
        _bClassDtlByDeliveryFlg = bClassDtlByDeliveryFlg;
    }

    /** b_class_dtl by my DEPOSIT_FLG, named 'BClassDtlByDepositFlg'. */
    protected BClassDtl _bClassDtlByDepositFlg;

    /**
     * [get] b_class_dtl by my DEPOSIT_FLG, named 'BClassDtlByDepositFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDepositFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDepositFlg() {
        return _bClassDtlByDepositFlg;
    }

    /**
     * [set] b_class_dtl by my DEPOSIT_FLG, named 'BClassDtlByDepositFlg'.
     * @param bClassDtlByDepositFlg The entity of foreign property 'BClassDtlByDepositFlg'. (NullAllowed)
     */
    public void setBClassDtlByDepositFlg(BClassDtl bClassDtlByDepositFlg) {
        _bClassDtlByDepositFlg = bClassDtlByDepositFlg;
    }

    /** b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'. */
    protected BClassDtl _bClassDtlByLimitDtReverseFlg;

    /**
     * [get] b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLimitDtReverseFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLimitDtReverseFlg() {
        return _bClassDtlByLimitDtReverseFlg;
    }

    /**
     * [set] b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @param bClassDtlByLimitDtReverseFlg The entity of foreign property 'BClassDtlByLimitDtReverseFlg'. (NullAllowed)
     */
    public void setBClassDtlByLimitDtReverseFlg(BClassDtl bClassDtlByLimitDtReverseFlg) {
        _bClassDtlByLimitDtReverseFlg = bClassDtlByLimitDtReverseFlg;
    }

    /** b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'. */
    protected BClassDtl _bClassDtlByLotReverseFlg;

    /**
     * [get] b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLotReverseFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLotReverseFlg() {
        return _bClassDtlByLotReverseFlg;
    }

    /**
     * [set] b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @param bClassDtlByLotReverseFlg The entity of foreign property 'BClassDtlByLotReverseFlg'. (NullAllowed)
     */
    public void setBClassDtlByLotReverseFlg(BClassDtl bClassDtlByLotReverseFlg) {
        _bClassDtlByLotReverseFlg = bClassDtlByLotReverseFlg;
    }

    /** b_class_dtl by my ONETIME_FLG, named 'BClassDtlByOnetimeFlg'. */
    protected BClassDtl _bClassDtlByOnetimeFlg;

    /**
     * [get] b_class_dtl by my ONETIME_FLG, named 'BClassDtlByOnetimeFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByOnetimeFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByOnetimeFlg() {
        return _bClassDtlByOnetimeFlg;
    }

    /**
     * [set] b_class_dtl by my ONETIME_FLG, named 'BClassDtlByOnetimeFlg'.
     * @param bClassDtlByOnetimeFlg The entity of foreign property 'BClassDtlByOnetimeFlg'. (NullAllowed)
     */
    public void setBClassDtlByOnetimeFlg(BClassDtl bClassDtlByOnetimeFlg) {
        _bClassDtlByOnetimeFlg = bClassDtlByOnetimeFlg;
    }

    /** b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'. */
    protected BClassDtl _bClassDtlByShippingStopFlg;

    /**
     * [get] b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByShippingStopFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByShippingStopFlg() {
        return _bClassDtlByShippingStopFlg;
    }

    /**
     * [set] b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @param bClassDtlByShippingStopFlg The entity of foreign property 'BClassDtlByShippingStopFlg'. (NullAllowed)
     */
    public void setBClassDtlByShippingStopFlg(BClassDtl bClassDtlByShippingStopFlg) {
        _bClassDtlByShippingStopFlg = bClassDtlByShippingStopFlg;
    }

    /** b_class_dtl by my VENDOR_FLG, named 'BClassDtlByVendorFlg'. */
    protected BClassDtl _bClassDtlByVendorFlg;

    /**
     * [get] b_class_dtl by my VENDOR_FLG, named 'BClassDtlByVendorFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByVendorFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByVendorFlg() {
        return _bClassDtlByVendorFlg;
    }

    /**
     * [set] b_class_dtl by my VENDOR_FLG, named 'BClassDtlByVendorFlg'.
     * @param bClassDtlByVendorFlg The entity of foreign property 'BClassDtlByVendorFlg'. (NullAllowed)
     */
    public void setBClassDtlByVendorFlg(BClassDtl bClassDtlByVendorFlg) {
        _bClassDtlByVendorFlg = bClassDtlByVendorFlg;
    }

    /** m_carrier_slip_ces by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'. */
    protected MCarrierSlipCes _mCarrierSlipCesAsOne;

    /**
     * [get] m_carrier_slip_ces by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MCarrierSlipCesAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MCarrierSlipCes getMCarrierSlipCesAsOne() {
        return _mCarrierSlipCesAsOne;
    }

    /**
     * [set] m_carrier_slip_ces by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * @param MCarrierSlipCesAsOne The entity of foreign property(referrer-as-one) 'MCarrierSlipCesAsOne'. (NullAllowed)
     */
    public void setMCarrierSlipCesAsOne(MCarrierSlipCes MCarrierSlipCesAsOne) {
        _mCarrierSlipCesAsOne = MCarrierSlipCesAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** m_carrier_decision by CUSTOMER_ID, named 'MCarrierDecisionList'. */
    protected List<MCarrierDecision> _mCarrierDecisionList;

    /**
     * [get] m_carrier_decision by CUSTOMER_ID, named 'MCarrierDecisionList'.
     * @return The entity list of referrer property 'MCarrierDecisionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierDecision> getMCarrierDecisionList() {
        if (_mCarrierDecisionList == null) { _mCarrierDecisionList = newReferrerList(); }
        return _mCarrierDecisionList;
    }

    /**
     * [set] m_carrier_decision by CUSTOMER_ID, named 'MCarrierDecisionList'.
     * @param mCarrierDecisionList The entity list of referrer property 'MCarrierDecisionList'. (NullAllowed)
     */
    public void setMCarrierDecisionList(List<MCarrierDecision> mCarrierDecisionList) {
        _mCarrierDecisionList = mCarrierDecisionList;
    }

    /** m_center_customer by CUSTOMER_ID, named 'MCenterCustomerList'. */
    protected List<MCenterCustomer> _mCenterCustomerList;

    /**
     * [get] m_center_customer by CUSTOMER_ID, named 'MCenterCustomerList'.
     * @return The entity list of referrer property 'MCenterCustomerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCenterCustomer> getMCenterCustomerList() {
        if (_mCenterCustomerList == null) { _mCenterCustomerList = newReferrerList(); }
        return _mCenterCustomerList;
    }

    /**
     * [set] m_center_customer by CUSTOMER_ID, named 'MCenterCustomerList'.
     * @param mCenterCustomerList The entity list of referrer property 'MCenterCustomerList'. (NullAllowed)
     */
    public void setMCenterCustomerList(List<MCenterCustomer> mCenterCustomerList) {
        _mCenterCustomerList = mCenterCustomerList;
    }

    /** m_client by CUSTOMER_ID, named 'MClientList'. */
    protected List<MClient> _mClientList;

    /**
     * [get] m_client by CUSTOMER_ID, named 'MClientList'.
     * @return The entity list of referrer property 'MClientList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClient> getMClientList() {
        if (_mClientList == null) { _mClientList = newReferrerList(); }
        return _mClientList;
    }

    /**
     * [set] m_client by CUSTOMER_ID, named 'MClientList'.
     * @param mClientList The entity list of referrer property 'MClientList'. (NullAllowed)
     */
    public void setMClientList(List<MClient> mClientList) {
        _mClientList = mClientList;
    }

    /** m_client_center by CUSTOMER_ID, named 'MClientCenterList'. */
    protected List<MClientCenter> _mClientCenterList;

    /**
     * [get] m_client_center by CUSTOMER_ID, named 'MClientCenterList'.
     * @return The entity list of referrer property 'MClientCenterList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MClientCenter> getMClientCenterList() {
        if (_mClientCenterList == null) { _mClientCenterList = newReferrerList(); }
        return _mClientCenterList;
    }

    /**
     * [set] m_client_center by CUSTOMER_ID, named 'MClientCenterList'.
     * @param mClientCenterList The entity list of referrer property 'MClientCenterList'. (NullAllowed)
     */
    public void setMClientCenterList(List<MClientCenter> mClientCenterList) {
        _mClientCenterList = mClientCenterList;
    }

    /** m_customer by DELIV_CUSTOMER_ID, named 'MCustomerSelfList'. */
    protected List<MCustomer> _mCustomerSelfList;

    /**
     * [get] m_customer by DELIV_CUSTOMER_ID, named 'MCustomerSelfList'.
     * @return The entity list of referrer property 'MCustomerSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCustomer> getMCustomerSelfList() {
        if (_mCustomerSelfList == null) { _mCustomerSelfList = newReferrerList(); }
        return _mCustomerSelfList;
    }

    /**
     * [set] m_customer by DELIV_CUSTOMER_ID, named 'MCustomerSelfList'.
     * @param mCustomerSelfList The entity list of referrer property 'MCustomerSelfList'. (NullAllowed)
     */
    public void setMCustomerSelfList(List<MCustomer> mCustomerSelfList) {
        _mCustomerSelfList = mCustomerSelfList;
    }

    /** m_customer_picking by CUSTOMER_ID, named 'MCustomerPickingList'. */
    protected List<MCustomerPicking> _mCustomerPickingList;

    /**
     * [get] m_customer_picking by CUSTOMER_ID, named 'MCustomerPickingList'.
     * @return The entity list of referrer property 'MCustomerPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCustomerPicking> getMCustomerPickingList() {
        if (_mCustomerPickingList == null) { _mCustomerPickingList = newReferrerList(); }
        return _mCustomerPickingList;
    }

    /**
     * [set] m_customer_picking by CUSTOMER_ID, named 'MCustomerPickingList'.
     * @param mCustomerPickingList The entity list of referrer property 'MCustomerPickingList'. (NullAllowed)
     */
    public void setMCustomerPickingList(List<MCustomerPicking> mCustomerPickingList) {
        _mCustomerPickingList = mCustomerPickingList;
    }

    /** m_deposit_product by ACCOUNT_ID, named 'MDepositProductList'. */
    protected List<MDepositProduct> _mDepositProductList;

    /**
     * [get] m_deposit_product by ACCOUNT_ID, named 'MDepositProductList'.
     * @return The entity list of referrer property 'MDepositProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDepositProduct> getMDepositProductList() {
        if (_mDepositProductList == null) { _mDepositProductList = newReferrerList(); }
        return _mDepositProductList;
    }

    /**
     * [set] m_deposit_product by ACCOUNT_ID, named 'MDepositProductList'.
     * @param mDepositProductList The entity list of referrer property 'MDepositProductList'. (NullAllowed)
     */
    public void setMDepositProductList(List<MDepositProduct> mDepositProductList) {
        _mDepositProductList = mDepositProductList;
    }

    /** m_location by REPLENISH_DEPOSIT_ID, named 'MLocationList'. */
    protected List<MLocation> _mLocationList;

    /**
     * [get] m_location by REPLENISH_DEPOSIT_ID, named 'MLocationList'.
     * @return The entity list of referrer property 'MLocationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocation> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = newReferrerList(); }
        return _mLocationList;
    }

    /**
     * [set] m_location by REPLENISH_DEPOSIT_ID, named 'MLocationList'.
     * @param mLocationList The entity list of referrer property 'MLocationList'. (NullAllowed)
     */
    public void setMLocationList(List<MLocation> mLocationList) {
        _mLocationList = mLocationList;
    }

    /** m_location_replenish_product by REPLENISH_DEPOSIT_ID, named 'MLocationReplenishProductList'. */
    protected List<MLocationReplenishProduct> _mLocationReplenishProductList;

    /**
     * [get] m_location_replenish_product by REPLENISH_DEPOSIT_ID, named 'MLocationReplenishProductList'.
     * @return The entity list of referrer property 'MLocationReplenishProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocationReplenishProduct> getMLocationReplenishProductList() {
        if (_mLocationReplenishProductList == null) { _mLocationReplenishProductList = newReferrerList(); }
        return _mLocationReplenishProductList;
    }

    /**
     * [set] m_location_replenish_product by REPLENISH_DEPOSIT_ID, named 'MLocationReplenishProductList'.
     * @param mLocationReplenishProductList The entity list of referrer property 'MLocationReplenishProductList'. (NullAllowed)
     */
    public void setMLocationReplenishProductList(List<MLocationReplenishProduct> mLocationReplenishProductList) {
        _mLocationReplenishProductList = mLocationReplenishProductList;
    }

    /** m_user_deposit by CUSTOMER_ID, named 'MUserDepositList'. */
    protected List<MUserDeposit> _mUserDepositList;

    /**
     * [get] m_user_deposit by CUSTOMER_ID, named 'MUserDepositList'.
     * @return The entity list of referrer property 'MUserDepositList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MUserDeposit> getMUserDepositList() {
        if (_mUserDepositList == null) { _mUserDepositList = newReferrerList(); }
        return _mUserDepositList;
    }

    /**
     * [set] m_user_deposit by CUSTOMER_ID, named 'MUserDepositList'.
     * @param mUserDepositList The entity list of referrer property 'MUserDepositList'. (NullAllowed)
     */
    public void setMUserDepositList(List<MUserDeposit> mUserDepositList) {
        _mUserDepositList = mUserDepositList;
    }

    /** t_alloc_inst_b by DEPOSIT_ID, named 'TAllocInstBList'. */
    protected List<TAllocInstB> _tAllocInstBList;

    /**
     * [get] t_alloc_inst_b by DEPOSIT_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = newReferrerList(); }
        return _tAllocInstBList;
    }

    /**
     * [set] t_alloc_inst_b by DEPOSIT_ID, named 'TAllocInstBList'.
     * @param tAllocInstBList The entity list of referrer property 'TAllocInstBList'. (NullAllowed)
     */
    public void setTAllocInstBList(List<TAllocInstB> tAllocInstBList) {
        _tAllocInstBList = tAllocInstBList;
    }

    /** t_alloc_inst_h by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdList'. */
    protected List<TAllocInstH> _tAllocInstHBySupplyCustomerIdList;

    /**
     * [get] t_alloc_inst_h by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * @return The entity list of referrer property 'TAllocInstHBySupplyCustomerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHBySupplyCustomerIdList() {
        if (_tAllocInstHBySupplyCustomerIdList == null) { _tAllocInstHBySupplyCustomerIdList = newReferrerList(); }
        return _tAllocInstHBySupplyCustomerIdList;
    }

    /**
     * [set] t_alloc_inst_h by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * @param tAllocInstHBySupplyCustomerIdList The entity list of referrer property 'TAllocInstHBySupplyCustomerIdList'. (NullAllowed)
     */
    public void setTAllocInstHBySupplyCustomerIdList(List<TAllocInstH> tAllocInstHBySupplyCustomerIdList) {
        _tAllocInstHBySupplyCustomerIdList = tAllocInstHBySupplyCustomerIdList;
    }

    /** t_alloc_inst_h by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdList'. */
    protected List<TAllocInstH> _tAllocInstHByDelivCustomerIdList;

    /**
     * [get] t_alloc_inst_h by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * @return The entity list of referrer property 'TAllocInstHByDelivCustomerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHByDelivCustomerIdList() {
        if (_tAllocInstHByDelivCustomerIdList == null) { _tAllocInstHByDelivCustomerIdList = newReferrerList(); }
        return _tAllocInstHByDelivCustomerIdList;
    }

    /**
     * [set] t_alloc_inst_h by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * @param tAllocInstHByDelivCustomerIdList The entity list of referrer property 'TAllocInstHByDelivCustomerIdList'. (NullAllowed)
     */
    public void setTAllocInstHByDelivCustomerIdList(List<TAllocInstH> tAllocInstHByDelivCustomerIdList) {
        _tAllocInstHByDelivCustomerIdList = tAllocInstHByDelivCustomerIdList;
    }

    /** t_alloc_lot by CUSTOMER_ID, named 'TAllocLotList'. */
    protected List<TAllocLot> _tAllocLotList;

    /**
     * [get] t_alloc_lot by CUSTOMER_ID, named 'TAllocLotList'.
     * @return The entity list of referrer property 'TAllocLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocLot> getTAllocLotList() {
        if (_tAllocLotList == null) { _tAllocLotList = newReferrerList(); }
        return _tAllocLotList;
    }

    /**
     * [set] t_alloc_lot by CUSTOMER_ID, named 'TAllocLotList'.
     * @param tAllocLotList The entity list of referrer property 'TAllocLotList'. (NullAllowed)
     */
    public void setTAllocLotList(List<TAllocLot> tAllocLotList) {
        _tAllocLotList = tAllocLotList;
    }

    /** t_inventory_b by ACCOUNT_ID, named 'TInventoryBByAccountIdList'. */
    protected List<TInventoryB> _tInventoryBByAccountIdList;

    /**
     * [get] t_inventory_b by ACCOUNT_ID, named 'TInventoryBByAccountIdList'.
     * @return The entity list of referrer property 'TInventoryBByAccountIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBByAccountIdList() {
        if (_tInventoryBByAccountIdList == null) { _tInventoryBByAccountIdList = newReferrerList(); }
        return _tInventoryBByAccountIdList;
    }

    /**
     * [set] t_inventory_b by ACCOUNT_ID, named 'TInventoryBByAccountIdList'.
     * @param tInventoryBByAccountIdList The entity list of referrer property 'TInventoryBByAccountIdList'. (NullAllowed)
     */
    public void setTInventoryBByAccountIdList(List<TInventoryB> tInventoryBByAccountIdList) {
        _tInventoryBByAccountIdList = tInventoryBByAccountIdList;
    }

    /** t_inventory_b by DEPOSIT_ID, named 'TInventoryBByDepositIdList'. */
    protected List<TInventoryB> _tInventoryBByDepositIdList;

    /**
     * [get] t_inventory_b by DEPOSIT_ID, named 'TInventoryBByDepositIdList'.
     * @return The entity list of referrer property 'TInventoryBByDepositIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBByDepositIdList() {
        if (_tInventoryBByDepositIdList == null) { _tInventoryBByDepositIdList = newReferrerList(); }
        return _tInventoryBByDepositIdList;
    }

    /**
     * [set] t_inventory_b by DEPOSIT_ID, named 'TInventoryBByDepositIdList'.
     * @param tInventoryBByDepositIdList The entity list of referrer property 'TInventoryBByDepositIdList'. (NullAllowed)
     */
    public void setTInventoryBByDepositIdList(List<TInventoryB> tInventoryBByDepositIdList) {
        _tInventoryBByDepositIdList = tInventoryBByDepositIdList;
    }

    /** t_inventory_b by SUPPLIER_ID, named 'TInventoryBBySupplierIdList'. */
    protected List<TInventoryB> _tInventoryBBySupplierIdList;

    /**
     * [get] t_inventory_b by SUPPLIER_ID, named 'TInventoryBBySupplierIdList'.
     * @return The entity list of referrer property 'TInventoryBBySupplierIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBBySupplierIdList() {
        if (_tInventoryBBySupplierIdList == null) { _tInventoryBBySupplierIdList = newReferrerList(); }
        return _tInventoryBBySupplierIdList;
    }

    /**
     * [set] t_inventory_b by SUPPLIER_ID, named 'TInventoryBBySupplierIdList'.
     * @param tInventoryBBySupplierIdList The entity list of referrer property 'TInventoryBBySupplierIdList'. (NullAllowed)
     */
    public void setTInventoryBBySupplierIdList(List<TInventoryB> tInventoryBBySupplierIdList) {
        _tInventoryBBySupplierIdList = tInventoryBBySupplierIdList;
    }

    /** t_inventory_inst by DEPOSIT_ID, named 'TInventoryInstList'. */
    protected List<TInventoryInst> _tInventoryInstList;

    /**
     * [get] t_inventory_inst by DEPOSIT_ID, named 'TInventoryInstList'.
     * @return The entity list of referrer property 'TInventoryInstList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryInst> getTInventoryInstList() {
        if (_tInventoryInstList == null) { _tInventoryInstList = newReferrerList(); }
        return _tInventoryInstList;
    }

    /**
     * [set] t_inventory_inst by DEPOSIT_ID, named 'TInventoryInstList'.
     * @param tInventoryInstList The entity list of referrer property 'TInventoryInstList'. (NullAllowed)
     */
    public void setTInventoryInstList(List<TInventoryInst> tInventoryInstList) {
        _tInventoryInstList = tInventoryInstList;
    }

    /** t_keeping_lot by CUSTOMER_ID, named 'TKeepingLotList'. */
    protected List<TKeepingLot> _tKeepingLotList;

    /**
     * [get] t_keeping_lot by CUSTOMER_ID, named 'TKeepingLotList'.
     * @return The entity list of referrer property 'TKeepingLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TKeepingLot> getTKeepingLotList() {
        if (_tKeepingLotList == null) { _tKeepingLotList = newReferrerList(); }
        return _tKeepingLotList;
    }

    /**
     * [set] t_keeping_lot by CUSTOMER_ID, named 'TKeepingLotList'.
     * @param tKeepingLotList The entity list of referrer property 'TKeepingLotList'. (NullAllowed)
     */
    public void setTKeepingLotList(List<TKeepingLot> tKeepingLotList) {
        _tKeepingLotList = tKeepingLotList;
    }

    /** t_last_lot by CUSTOMER_ID, named 'TLastLotList'. */
    protected List<TLastLot> _tLastLotList;

    /**
     * [get] t_last_lot by CUSTOMER_ID, named 'TLastLotList'.
     * @return The entity list of referrer property 'TLastLotList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TLastLot> getTLastLotList() {
        if (_tLastLotList == null) { _tLastLotList = newReferrerList(); }
        return _tLastLotList;
    }

    /**
     * [set] t_last_lot by CUSTOMER_ID, named 'TLastLotList'.
     * @param tLastLotList The entity list of referrer property 'TLastLotList'. (NullAllowed)
     */
    public void setTLastLotList(List<TLastLot> tLastLotList) {
        _tLastLotList = tLastLotList;
    }

    /** t_move_inst_b by DEPOSIT_ID, named 'TMoveInstBByDepositIdList'. */
    protected List<TMoveInstB> _tMoveInstBByDepositIdList;

    /**
     * [get] t_move_inst_b by DEPOSIT_ID, named 'TMoveInstBByDepositIdList'.
     * @return The entity list of referrer property 'TMoveInstBByDepositIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBByDepositIdList() {
        if (_tMoveInstBByDepositIdList == null) { _tMoveInstBByDepositIdList = newReferrerList(); }
        return _tMoveInstBByDepositIdList;
    }

    /**
     * [set] t_move_inst_b by DEPOSIT_ID, named 'TMoveInstBByDepositIdList'.
     * @param tMoveInstBByDepositIdList The entity list of referrer property 'TMoveInstBByDepositIdList'. (NullAllowed)
     */
    public void setTMoveInstBByDepositIdList(List<TMoveInstB> tMoveInstBByDepositIdList) {
        _tMoveInstBByDepositIdList = tMoveInstBByDepositIdList;
    }

    /** t_move_inst_b by SUPPLIER_ID, named 'TMoveInstBBySupplierIdList'. */
    protected List<TMoveInstB> _tMoveInstBBySupplierIdList;

    /**
     * [get] t_move_inst_b by SUPPLIER_ID, named 'TMoveInstBBySupplierIdList'.
     * @return The entity list of referrer property 'TMoveInstBBySupplierIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBBySupplierIdList() {
        if (_tMoveInstBBySupplierIdList == null) { _tMoveInstBBySupplierIdList = newReferrerList(); }
        return _tMoveInstBBySupplierIdList;
    }

    /**
     * [set] t_move_inst_b by SUPPLIER_ID, named 'TMoveInstBBySupplierIdList'.
     * @param tMoveInstBBySupplierIdList The entity list of referrer property 'TMoveInstBBySupplierIdList'. (NullAllowed)
     */
    public void setTMoveInstBBySupplierIdList(List<TMoveInstB> tMoveInstBBySupplierIdList) {
        _tMoveInstBBySupplierIdList = tMoveInstBBySupplierIdList;
    }

    /** t_move_inst_b by ACCOUNT_ID, named 'TMoveInstBByAccountIdList'. */
    protected List<TMoveInstB> _tMoveInstBByAccountIdList;

    /**
     * [get] t_move_inst_b by ACCOUNT_ID, named 'TMoveInstBByAccountIdList'.
     * @return The entity list of referrer property 'TMoveInstBByAccountIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBByAccountIdList() {
        if (_tMoveInstBByAccountIdList == null) { _tMoveInstBByAccountIdList = newReferrerList(); }
        return _tMoveInstBByAccountIdList;
    }

    /**
     * [set] t_move_inst_b by ACCOUNT_ID, named 'TMoveInstBByAccountIdList'.
     * @param tMoveInstBByAccountIdList The entity list of referrer property 'TMoveInstBByAccountIdList'. (NullAllowed)
     */
    public void setTMoveInstBByAccountIdList(List<TMoveInstB> tMoveInstBByAccountIdList) {
        _tMoveInstBByAccountIdList = tMoveInstBByAccountIdList;
    }

    /** t_receive_plan_h by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdList'. */
    protected List<TReceivePlanH> _tReceivePlanHByPlanSupplierIdList;

    /**
     * [get] t_receive_plan_h by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdList'.
     * @return The entity list of referrer property 'TReceivePlanHByPlanSupplierIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHByPlanSupplierIdList() {
        if (_tReceivePlanHByPlanSupplierIdList == null) { _tReceivePlanHByPlanSupplierIdList = newReferrerList(); }
        return _tReceivePlanHByPlanSupplierIdList;
    }

    /**
     * [set] t_receive_plan_h by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdList'.
     * @param tReceivePlanHByPlanSupplierIdList The entity list of referrer property 'TReceivePlanHByPlanSupplierIdList'. (NullAllowed)
     */
    public void setTReceivePlanHByPlanSupplierIdList(List<TReceivePlanH> tReceivePlanHByPlanSupplierIdList) {
        _tReceivePlanHByPlanSupplierIdList = tReceivePlanHByPlanSupplierIdList;
    }

    /** t_receive_plan_h by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdList'. */
    protected List<TReceivePlanH> _tReceivePlanHByPlanDepositIdList;

    /**
     * [get] t_receive_plan_h by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdList'.
     * @return The entity list of referrer property 'TReceivePlanHByPlanDepositIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHByPlanDepositIdList() {
        if (_tReceivePlanHByPlanDepositIdList == null) { _tReceivePlanHByPlanDepositIdList = newReferrerList(); }
        return _tReceivePlanHByPlanDepositIdList;
    }

    /**
     * [set] t_receive_plan_h by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdList'.
     * @param tReceivePlanHByPlanDepositIdList The entity list of referrer property 'TReceivePlanHByPlanDepositIdList'. (NullAllowed)
     */
    public void setTReceivePlanHByPlanDepositIdList(List<TReceivePlanH> tReceivePlanHByPlanDepositIdList) {
        _tReceivePlanHByPlanDepositIdList = tReceivePlanHByPlanDepositIdList;
    }

    /** t_shipping_inst_b by DEPOSIT_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] t_shipping_inst_b by DEPOSIT_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] t_shipping_inst_b by DEPOSIT_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    /** t_shipping_inst_h by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdList'. */
    protected List<TShippingInstH> _tShippingInstHByDelivCustomerIdList;

    /**
     * [get] t_shipping_inst_h by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdList'.
     * @return The entity list of referrer property 'TShippingInstHByDelivCustomerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHByDelivCustomerIdList() {
        if (_tShippingInstHByDelivCustomerIdList == null) { _tShippingInstHByDelivCustomerIdList = newReferrerList(); }
        return _tShippingInstHByDelivCustomerIdList;
    }

    /**
     * [set] t_shipping_inst_h by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdList'.
     * @param tShippingInstHByDelivCustomerIdList The entity list of referrer property 'TShippingInstHByDelivCustomerIdList'. (NullAllowed)
     */
    public void setTShippingInstHByDelivCustomerIdList(List<TShippingInstH> tShippingInstHByDelivCustomerIdList) {
        _tShippingInstHByDelivCustomerIdList = tShippingInstHByDelivCustomerIdList;
    }

    /** t_shipping_inst_h by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdList'. */
    protected List<TShippingInstH> _tShippingInstHBySupplyCustomerIdList;

    /**
     * [get] t_shipping_inst_h by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdList'.
     * @return The entity list of referrer property 'TShippingInstHBySupplyCustomerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHBySupplyCustomerIdList() {
        if (_tShippingInstHBySupplyCustomerIdList == null) { _tShippingInstHBySupplyCustomerIdList = newReferrerList(); }
        return _tShippingInstHBySupplyCustomerIdList;
    }

    /**
     * [set] t_shipping_inst_h by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdList'.
     * @param tShippingInstHBySupplyCustomerIdList The entity list of referrer property 'TShippingInstHBySupplyCustomerIdList'. (NullAllowed)
     */
    public void setTShippingInstHBySupplyCustomerIdList(List<TShippingInstH> tShippingInstHBySupplyCustomerIdList) {
        _tShippingInstHBySupplyCustomerIdList = tShippingInstHBySupplyCustomerIdList;
    }

    /** t_stock by DEPOSIT_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] t_stock by DEPOSIT_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] t_stock by DEPOSIT_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    /** t_store_no by SUPPLIER_ID, named 'TStoreNoList'. */
    protected List<TStoreNo> _tStoreNoList;

    /**
     * [get] t_store_no by SUPPLIER_ID, named 'TStoreNoList'.
     * @return The entity list of referrer property 'TStoreNoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreNo> getTStoreNoList() {
        if (_tStoreNoList == null) { _tStoreNoList = newReferrerList(); }
        return _tStoreNoList;
    }

    /**
     * [set] t_store_no by SUPPLIER_ID, named 'TStoreNoList'.
     * @param tStoreNoList The entity list of referrer property 'TStoreNoList'. (NullAllowed)
     */
    public void setTStoreNoList(List<TStoreNo> tStoreNoList) {
        _tStoreNoList = tStoreNoList;
    }

    /** t_store_record_h by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdList'. */
    protected List<TStoreRecordH> _tStoreRecordHBySupplierIdList;

    /**
     * [get] t_store_record_h by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdList'.
     * @return The entity list of referrer property 'TStoreRecordHBySupplierIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHBySupplierIdList() {
        if (_tStoreRecordHBySupplierIdList == null) { _tStoreRecordHBySupplierIdList = newReferrerList(); }
        return _tStoreRecordHBySupplierIdList;
    }

    /**
     * [set] t_store_record_h by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdList'.
     * @param tStoreRecordHBySupplierIdList The entity list of referrer property 'TStoreRecordHBySupplierIdList'. (NullAllowed)
     */
    public void setTStoreRecordHBySupplierIdList(List<TStoreRecordH> tStoreRecordHBySupplierIdList) {
        _tStoreRecordHBySupplierIdList = tStoreRecordHBySupplierIdList;
    }

    /** t_store_record_h by DEPOSIT_ID, named 'TStoreRecordHByDepositIdList'. */
    protected List<TStoreRecordH> _tStoreRecordHByDepositIdList;

    /**
     * [get] t_store_record_h by DEPOSIT_ID, named 'TStoreRecordHByDepositIdList'.
     * @return The entity list of referrer property 'TStoreRecordHByDepositIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHByDepositIdList() {
        if (_tStoreRecordHByDepositIdList == null) { _tStoreRecordHByDepositIdList = newReferrerList(); }
        return _tStoreRecordHByDepositIdList;
    }

    /**
     * [set] t_store_record_h by DEPOSIT_ID, named 'TStoreRecordHByDepositIdList'.
     * @param tStoreRecordHByDepositIdList The entity list of referrer property 'TStoreRecordHByDepositIdList'. (NullAllowed)
     */
    public void setTStoreRecordHByDepositIdList(List<TStoreRecordH> tStoreRecordHByDepositIdList) {
        _tStoreRecordHByDepositIdList = tStoreRecordHByDepositIdList;
    }

    /** w_ht_inventory_input_prod by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdList'. */
    protected List<WHtInventoryInputProd> _wHtInventoryInputProdList;

    /**
     * [get] w_ht_inventory_input_prod by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = newReferrerList(); }
        return _wHtInventoryInputProdList;
    }

    /**
     * [set] w_ht_inventory_input_prod by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdList'.
     * @param wHtInventoryInputProdList The entity list of referrer property 'WHtInventoryInputProdList'. (NullAllowed)
     */
    public void setWHtInventoryInputProdList(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        _wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    /** w_ht_receive_no_plan_insp by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspBySupplierIdList;

    /**
     * [get] w_ht_receive_no_plan_insp by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspBySupplierIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspBySupplierIdList() {
        if (_wHtReceiveNoPlanInspBySupplierIdList == null) { _wHtReceiveNoPlanInspBySupplierIdList = newReferrerList(); }
        return _wHtReceiveNoPlanInspBySupplierIdList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdList'.
     * @param wHtReceiveNoPlanInspBySupplierIdList The entity list of referrer property 'WHtReceiveNoPlanInspBySupplierIdList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspBySupplierIdList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspBySupplierIdList) {
        _wHtReceiveNoPlanInspBySupplierIdList = wHtReceiveNoPlanInspBySupplierIdList;
    }

    /** w_ht_receive_no_plan_insp by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdList'. */
    protected List<WHtReceiveNoPlanInsp> _wHtReceiveNoPlanInspByDepositIdList;

    /**
     * [get] w_ht_receive_no_plan_insp by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspByDepositIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspByDepositIdList() {
        if (_wHtReceiveNoPlanInspByDepositIdList == null) { _wHtReceiveNoPlanInspByDepositIdList = newReferrerList(); }
        return _wHtReceiveNoPlanInspByDepositIdList;
    }

    /**
     * [set] w_ht_receive_no_plan_insp by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdList'.
     * @param wHtReceiveNoPlanInspByDepositIdList The entity list of referrer property 'WHtReceiveNoPlanInspByDepositIdList'. (NullAllowed)
     */
    public void setWHtReceiveNoPlanInspByDepositIdList(List<WHtReceiveNoPlanInsp> wHtReceiveNoPlanInspByDepositIdList) {
        _wHtReceiveNoPlanInspByDepositIdList = wHtReceiveNoPlanInspByDepositIdList;
    }

    /** w_ht_serial_receive_insp by CUSTOMER_ID, named 'WHtSerialReceiveInspList'. */
    protected List<WHtSerialReceiveInsp> _wHtSerialReceiveInspList;

    /**
     * [get] w_ht_serial_receive_insp by CUSTOMER_ID, named 'WHtSerialReceiveInspList'.
     * @return The entity list of referrer property 'WHtSerialReceiveInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialReceiveInsp> getWHtSerialReceiveInspList() {
        if (_wHtSerialReceiveInspList == null) { _wHtSerialReceiveInspList = newReferrerList(); }
        return _wHtSerialReceiveInspList;
    }

    /**
     * [set] w_ht_serial_receive_insp by CUSTOMER_ID, named 'WHtSerialReceiveInspList'.
     * @param wHtSerialReceiveInspList The entity list of referrer property 'WHtSerialReceiveInspList'. (NullAllowed)
     */
    public void setWHtSerialReceiveInspList(List<WHtSerialReceiveInsp> wHtSerialReceiveInspList) {
        _wHtSerialReceiveInspList = wHtSerialReceiveInspList;
    }

    /** w_ht_serial_shipping_insp by CUSTOMER_ID, named 'WHtSerialShippingInspList'. */
    protected List<WHtSerialShippingInsp> _wHtSerialShippingInspList;

    /**
     * [get] w_ht_serial_shipping_insp by CUSTOMER_ID, named 'WHtSerialShippingInspList'.
     * @return The entity list of referrer property 'WHtSerialShippingInspList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtSerialShippingInsp> getWHtSerialShippingInspList() {
        if (_wHtSerialShippingInspList == null) { _wHtSerialShippingInspList = newReferrerList(); }
        return _wHtSerialShippingInspList;
    }

    /**
     * [set] w_ht_serial_shipping_insp by CUSTOMER_ID, named 'WHtSerialShippingInspList'.
     * @param wHtSerialShippingInspList The entity list of referrer property 'WHtSerialShippingInspList'. (NullAllowed)
     */
    public void setWHtSerialShippingInspList(List<WHtSerialShippingInsp> wHtSerialShippingInspList) {
        _wHtSerialShippingInspList = wHtSerialShippingInspList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCustomer) {
            BsMCustomer other = (BsMCustomer)obj;
            if (!xSV(_customerId, other._customerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _customerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCustomerSelf != null)
        { sb.append(li).append(xbRDS(_mCustomerSelf, "mCustomerSelf")); }
        if (_mClientCenterByClientId != null)
        { sb.append(li).append(xbRDS(_mClientCenterByClientId, "mClientCenterByClientId")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByDeliveryFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDeliveryFlg, "bClassDtlByDeliveryFlg")); }
        if (_bClassDtlByDepositFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDepositFlg, "bClassDtlByDepositFlg")); }
        if (_bClassDtlByLimitDtReverseFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLimitDtReverseFlg, "bClassDtlByLimitDtReverseFlg")); }
        if (_bClassDtlByLotReverseFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLotReverseFlg, "bClassDtlByLotReverseFlg")); }
        if (_bClassDtlByOnetimeFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByOnetimeFlg, "bClassDtlByOnetimeFlg")); }
        if (_bClassDtlByShippingStopFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByShippingStopFlg, "bClassDtlByShippingStopFlg")); }
        if (_bClassDtlByVendorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByVendorFlg, "bClassDtlByVendorFlg")); }
        if (_mCarrierSlipCesAsOne != null)
        { sb.append(li).append(xbRDS(_mCarrierSlipCesAsOne, "mCarrierSlipCesAsOne")); }
        if (_mCarrierDecisionList != null) { for (MCarrierDecision et : _mCarrierDecisionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierDecisionList")); } } }
        if (_mCenterCustomerList != null) { for (MCenterCustomer et : _mCenterCustomerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCenterCustomerList")); } } }
        if (_mClientList != null) { for (MClient et : _mClientList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientList")); } } }
        if (_mClientCenterList != null) { for (MClientCenter et : _mClientCenterList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mClientCenterList")); } } }
        if (_mCustomerSelfList != null) { for (MCustomer et : _mCustomerSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCustomerSelfList")); } } }
        if (_mCustomerPickingList != null) { for (MCustomerPicking et : _mCustomerPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCustomerPickingList")); } } }
        if (_mDepositProductList != null) { for (MDepositProduct et : _mDepositProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDepositProductList")); } } }
        if (_mLocationList != null) { for (MLocation et : _mLocationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationList")); } } }
        if (_mLocationReplenishProductList != null) { for (MLocationReplenishProduct et : _mLocationReplenishProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationReplenishProductList")); } } }
        if (_mUserDepositList != null) { for (MUserDeposit et : _mUserDepositList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mUserDepositList")); } } }
        if (_tAllocInstBList != null) { for (TAllocInstB et : _tAllocInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstBList")); } } }
        if (_tAllocInstHBySupplyCustomerIdList != null) { for (TAllocInstH et : _tAllocInstHBySupplyCustomerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstHBySupplyCustomerIdList")); } } }
        if (_tAllocInstHByDelivCustomerIdList != null) { for (TAllocInstH et : _tAllocInstHByDelivCustomerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstHByDelivCustomerIdList")); } } }
        if (_tAllocLotList != null) { for (TAllocLot et : _tAllocLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocLotList")); } } }
        if (_tInventoryBByAccountIdList != null) { for (TInventoryB et : _tInventoryBByAccountIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBByAccountIdList")); } } }
        if (_tInventoryBByDepositIdList != null) { for (TInventoryB et : _tInventoryBByDepositIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBByDepositIdList")); } } }
        if (_tInventoryBBySupplierIdList != null) { for (TInventoryB et : _tInventoryBBySupplierIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBBySupplierIdList")); } } }
        if (_tInventoryInstList != null) { for (TInventoryInst et : _tInventoryInstList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryInstList")); } } }
        if (_tKeepingLotList != null) { for (TKeepingLot et : _tKeepingLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tKeepingLotList")); } } }
        if (_tLastLotList != null) { for (TLastLot et : _tLastLotList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tLastLotList")); } } }
        if (_tMoveInstBByDepositIdList != null) { for (TMoveInstB et : _tMoveInstBByDepositIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBByDepositIdList")); } } }
        if (_tMoveInstBBySupplierIdList != null) { for (TMoveInstB et : _tMoveInstBBySupplierIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBBySupplierIdList")); } } }
        if (_tMoveInstBByAccountIdList != null) { for (TMoveInstB et : _tMoveInstBByAccountIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBByAccountIdList")); } } }
        if (_tReceivePlanHByPlanSupplierIdList != null) { for (TReceivePlanH et : _tReceivePlanHByPlanSupplierIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHByPlanSupplierIdList")); } } }
        if (_tReceivePlanHByPlanDepositIdList != null) { for (TReceivePlanH et : _tReceivePlanHByPlanDepositIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHByPlanDepositIdList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        if (_tShippingInstHByDelivCustomerIdList != null) { for (TShippingInstH et : _tShippingInstHByDelivCustomerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHByDelivCustomerIdList")); } } }
        if (_tShippingInstHBySupplyCustomerIdList != null) { for (TShippingInstH et : _tShippingInstHBySupplyCustomerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHBySupplyCustomerIdList")); } } }
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
        if (_tStoreNoList != null) { for (TStoreNo et : _tStoreNoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreNoList")); } } }
        if (_tStoreRecordHBySupplierIdList != null) { for (TStoreRecordH et : _tStoreRecordHBySupplierIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHBySupplierIdList")); } } }
        if (_tStoreRecordHByDepositIdList != null) { for (TStoreRecordH et : _tStoreRecordHByDepositIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHByDepositIdList")); } } }
        if (_wHtInventoryInputProdList != null) { for (WHtInventoryInputProd et : _wHtInventoryInputProdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtInventoryInputProdList")); } } }
        if (_wHtReceiveNoPlanInspBySupplierIdList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspBySupplierIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspBySupplierIdList")); } } }
        if (_wHtReceiveNoPlanInspByDepositIdList != null) { for (WHtReceiveNoPlanInsp et : _wHtReceiveNoPlanInspByDepositIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtReceiveNoPlanInspByDepositIdList")); } } }
        if (_wHtSerialReceiveInspList != null) { for (WHtSerialReceiveInsp et : _wHtSerialReceiveInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtSerialReceiveInspList")); } } }
        if (_wHtSerialShippingInspList != null) { for (WHtSerialShippingInsp et : _wHtSerialShippingInspList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtSerialShippingInspList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_customerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_customerAbbr));
        sb.append(dm).append(xfND(_zipCd));
        sb.append(dm).append(xfND(_telNo));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_vendorFlg));
        sb.append(dm).append(xfND(_deliveryFlg));
        sb.append(dm).append(xfND(_onetimeFlg));
        sb.append(dm).append(xfND(_depositFlg));
        sb.append(dm).append(xfND(_allocOrder));
        sb.append(dm).append(xfND(_lotReverseFlg));
        sb.append(dm).append(xfND(_limitDtReverseFlg));
        sb.append(dm).append(xfND(_shippingStopFlg));
        sb.append(dm).append(xfND(_delivCustomerId));
        sb.append(dm).append(xfND(_accountFlg));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_salesOrgId));
        sb.append(dm).append(xfND(_lotSplitTypeCd));
        sb.append(dm).append(xfND(_limitDtSplitTypeCd));
        sb.append(dm).append(xfND(_prodDtSplitTypeCd));
        sb.append(dm).append(xfND(_lotUnmatchTypeCd));
        sb.append(dm).append(xfND(_limitDtUnmatchTypeCd));
        sb.append(dm).append(xfND(_prodDtUnmatchTypeCd));
        sb.append(dm).append(xfND(_uniCustomerCd));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mCustomerSelf != null)
        { sb.append(dm).append("mCustomerSelf"); }
        if (_mClientCenterByClientId != null)
        { sb.append(dm).append("mClientCenterByClientId"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByDeliveryFlg != null)
        { sb.append(dm).append("bClassDtlByDeliveryFlg"); }
        if (_bClassDtlByDepositFlg != null)
        { sb.append(dm).append("bClassDtlByDepositFlg"); }
        if (_bClassDtlByLimitDtReverseFlg != null)
        { sb.append(dm).append("bClassDtlByLimitDtReverseFlg"); }
        if (_bClassDtlByLotReverseFlg != null)
        { sb.append(dm).append("bClassDtlByLotReverseFlg"); }
        if (_bClassDtlByOnetimeFlg != null)
        { sb.append(dm).append("bClassDtlByOnetimeFlg"); }
        if (_bClassDtlByShippingStopFlg != null)
        { sb.append(dm).append("bClassDtlByShippingStopFlg"); }
        if (_bClassDtlByVendorFlg != null)
        { sb.append(dm).append("bClassDtlByVendorFlg"); }
        if (_mCarrierSlipCesAsOne != null)
        { sb.append(dm).append("mCarrierSlipCesAsOne"); }
        if (_mCarrierDecisionList != null && !_mCarrierDecisionList.isEmpty())
        { sb.append(dm).append("mCarrierDecisionList"); }
        if (_mCenterCustomerList != null && !_mCenterCustomerList.isEmpty())
        { sb.append(dm).append("mCenterCustomerList"); }
        if (_mClientList != null && !_mClientList.isEmpty())
        { sb.append(dm).append("mClientList"); }
        if (_mClientCenterList != null && !_mClientCenterList.isEmpty())
        { sb.append(dm).append("mClientCenterList"); }
        if (_mCustomerSelfList != null && !_mCustomerSelfList.isEmpty())
        { sb.append(dm).append("mCustomerSelfList"); }
        if (_mCustomerPickingList != null && !_mCustomerPickingList.isEmpty())
        { sb.append(dm).append("mCustomerPickingList"); }
        if (_mDepositProductList != null && !_mDepositProductList.isEmpty())
        { sb.append(dm).append("mDepositProductList"); }
        if (_mLocationList != null && !_mLocationList.isEmpty())
        { sb.append(dm).append("mLocationList"); }
        if (_mLocationReplenishProductList != null && !_mLocationReplenishProductList.isEmpty())
        { sb.append(dm).append("mLocationReplenishProductList"); }
        if (_mUserDepositList != null && !_mUserDepositList.isEmpty())
        { sb.append(dm).append("mUserDepositList"); }
        if (_tAllocInstBList != null && !_tAllocInstBList.isEmpty())
        { sb.append(dm).append("tAllocInstBList"); }
        if (_tAllocInstHBySupplyCustomerIdList != null && !_tAllocInstHBySupplyCustomerIdList.isEmpty())
        { sb.append(dm).append("tAllocInstHBySupplyCustomerIdList"); }
        if (_tAllocInstHByDelivCustomerIdList != null && !_tAllocInstHByDelivCustomerIdList.isEmpty())
        { sb.append(dm).append("tAllocInstHByDelivCustomerIdList"); }
        if (_tAllocLotList != null && !_tAllocLotList.isEmpty())
        { sb.append(dm).append("tAllocLotList"); }
        if (_tInventoryBByAccountIdList != null && !_tInventoryBByAccountIdList.isEmpty())
        { sb.append(dm).append("tInventoryBByAccountIdList"); }
        if (_tInventoryBByDepositIdList != null && !_tInventoryBByDepositIdList.isEmpty())
        { sb.append(dm).append("tInventoryBByDepositIdList"); }
        if (_tInventoryBBySupplierIdList != null && !_tInventoryBBySupplierIdList.isEmpty())
        { sb.append(dm).append("tInventoryBBySupplierIdList"); }
        if (_tInventoryInstList != null && !_tInventoryInstList.isEmpty())
        { sb.append(dm).append("tInventoryInstList"); }
        if (_tKeepingLotList != null && !_tKeepingLotList.isEmpty())
        { sb.append(dm).append("tKeepingLotList"); }
        if (_tLastLotList != null && !_tLastLotList.isEmpty())
        { sb.append(dm).append("tLastLotList"); }
        if (_tMoveInstBByDepositIdList != null && !_tMoveInstBByDepositIdList.isEmpty())
        { sb.append(dm).append("tMoveInstBByDepositIdList"); }
        if (_tMoveInstBBySupplierIdList != null && !_tMoveInstBBySupplierIdList.isEmpty())
        { sb.append(dm).append("tMoveInstBBySupplierIdList"); }
        if (_tMoveInstBByAccountIdList != null && !_tMoveInstBByAccountIdList.isEmpty())
        { sb.append(dm).append("tMoveInstBByAccountIdList"); }
        if (_tReceivePlanHByPlanSupplierIdList != null && !_tReceivePlanHByPlanSupplierIdList.isEmpty())
        { sb.append(dm).append("tReceivePlanHByPlanSupplierIdList"); }
        if (_tReceivePlanHByPlanDepositIdList != null && !_tReceivePlanHByPlanDepositIdList.isEmpty())
        { sb.append(dm).append("tReceivePlanHByPlanDepositIdList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (_tShippingInstHByDelivCustomerIdList != null && !_tShippingInstHByDelivCustomerIdList.isEmpty())
        { sb.append(dm).append("tShippingInstHByDelivCustomerIdList"); }
        if (_tShippingInstHBySupplyCustomerIdList != null && !_tShippingInstHBySupplyCustomerIdList.isEmpty())
        { sb.append(dm).append("tShippingInstHBySupplyCustomerIdList"); }
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
        if (_tStoreNoList != null && !_tStoreNoList.isEmpty())
        { sb.append(dm).append("tStoreNoList"); }
        if (_tStoreRecordHBySupplierIdList != null && !_tStoreRecordHBySupplierIdList.isEmpty())
        { sb.append(dm).append("tStoreRecordHBySupplierIdList"); }
        if (_tStoreRecordHByDepositIdList != null && !_tStoreRecordHByDepositIdList.isEmpty())
        { sb.append(dm).append("tStoreRecordHByDepositIdList"); }
        if (_wHtInventoryInputProdList != null && !_wHtInventoryInputProdList.isEmpty())
        { sb.append(dm).append("wHtInventoryInputProdList"); }
        if (_wHtReceiveNoPlanInspBySupplierIdList != null && !_wHtReceiveNoPlanInspBySupplierIdList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspBySupplierIdList"); }
        if (_wHtReceiveNoPlanInspByDepositIdList != null && !_wHtReceiveNoPlanInspByDepositIdList.isEmpty())
        { sb.append(dm).append("wHtReceiveNoPlanInspByDepositIdList"); }
        if (_wHtSerialReceiveInspList != null && !_wHtSerialReceiveInspList.isEmpty())
        { sb.append(dm).append("wHtSerialReceiveInspList"); }
        if (_wHtSerialShippingInspList != null && !_wHtSerialShippingInspList.isEmpty())
        { sb.append(dm).append("wHtSerialShippingInspList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCustomer clone() {
        return (MCustomer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER} <br>
     * 取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCustomerId() {
        checkSpecifiedProperty("customerId");
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER} <br>
     * 取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCustomerId(Long customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {NotNull, VARCHAR(60)} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getCustomerNm() {
        checkSpecifiedProperty("customerNm");
        return convertEmptyToNull(_customerNm);
    }

    /**
     * [set] CUSTOMER_NM: {NotNull, VARCHAR(60)} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (basically NotNull if update: for the constraint)
     */
    public void setCustomerNm(String customerNm) {
        registerModifiedProperty("customerNm");
        _customerNm = customerNm;
    }

    /**
     * [get] CUSTOMER_ABBR: {VARCHAR(60)} <br>
     * 取引先略称
     * @return The value of the column 'CUSTOMER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerAbbr() {
        checkSpecifiedProperty("customerAbbr");
        return convertEmptyToNull(_customerAbbr);
    }

    /**
     * [set] CUSTOMER_ABBR: {VARCHAR(60)} <br>
     * 取引先略称
     * @param customerAbbr The value of the column 'CUSTOMER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerAbbr(String customerAbbr) {
        registerModifiedProperty("customerAbbr");
        _customerAbbr = customerAbbr;
    }

    /**
     * [get] ZIP_CD: {VARCHAR(30)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd() {
        checkSpecifiedProperty("zipCd");
        return convertEmptyToNull(_zipCd);
    }

    /**
     * [set] ZIP_CD: {VARCHAR(30)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd(String zipCd) {
        registerModifiedProperty("zipCd");
        _zipCd = zipCd;
    }

    /**
     * [get] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @return The value of the column 'TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTelNo() {
        checkSpecifiedProperty("telNo");
        return convertEmptyToNull(_telNo);
    }

    /**
     * [set] TEL_NO: {VARCHAR(30)} <br>
     * 電話番号
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo(String telNo) {
        registerModifiedProperty("telNo");
        _telNo = telNo;
    }

    /**
     * [get] ADDRESS1: {VARCHAR(60)} <br>
     * 住所1
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {VARCHAR(60)} <br>
     * 住所1
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ADDRESS2: {VARCHAR(60)} <br>
     * 住所2
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {VARCHAR(60)} <br>
     * 住所2
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {VARCHAR(60)} <br>
     * 住所3
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {VARCHAR(60)} <br>
     * 住所3
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @return The value of the column 'VENDOR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getVendorFlg() {
        checkSpecifiedProperty("vendorFlg");
        return convertEmptyToNull(_vendorFlg);
    }

    /**
     * [set] VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param vendorFlg The value of the column 'VENDOR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorFlg(String vendorFlg) {
        registerModifiedProperty("vendorFlg");
        _vendorFlg = vendorFlg;
    }

    /**
     * [get] DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @return The value of the column 'DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryFlg() {
        checkSpecifiedProperty("deliveryFlg");
        return convertEmptyToNull(_deliveryFlg);
    }

    /**
     * [set] DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param deliveryFlg The value of the column 'DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryFlg(String deliveryFlg) {
        registerModifiedProperty("deliveryFlg");
        _deliveryFlg = deliveryFlg;
    }

    /**
     * [get] ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @return The value of the column 'ONETIME_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOnetimeFlg() {
        checkSpecifiedProperty("onetimeFlg");
        return convertEmptyToNull(_onetimeFlg);
    }

    /**
     * [set] ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param onetimeFlg The value of the column 'ONETIME_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOnetimeFlg(String onetimeFlg) {
        registerModifiedProperty("onetimeFlg");
        _onetimeFlg = onetimeFlg;
    }

    /**
     * [get] DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @return The value of the column 'DEPOSIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositFlg() {
        checkSpecifiedProperty("depositFlg");
        return convertEmptyToNull(_depositFlg);
    }

    /**
     * [set] DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param depositFlg The value of the column 'DEPOSIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositFlg(String depositFlg) {
        registerModifiedProperty("depositFlg");
        _depositFlg = depositFlg;
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
     * [get] LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotReverseFlg() {
        checkSpecifiedProperty("lotReverseFlg");
        return convertEmptyToNull(_lotReverseFlg);
    }

    /**
     * [set] LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        registerModifiedProperty("lotReverseFlg");
        _lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtReverseFlg() {
        checkSpecifiedProperty("limitDtReverseFlg");
        return convertEmptyToNull(_limitDtReverseFlg);
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        registerModifiedProperty("limitDtReverseFlg");
        _limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopFlg() {
        checkSpecifiedProperty("shippingStopFlg");
        return convertEmptyToNull(_shippingStopFlg);
    }

    /**
     * [set] SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        registerModifiedProperty("shippingStopFlg");
        _shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivCustomerId() {
        checkSpecifiedProperty("delivCustomerId");
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        registerModifiedProperty("delivCustomerId");
        _delivCustomerId = delivCustomerId;
    }

    /**
     * [get] ACCOUNT_FLG: {CHAR(1)} <br>
     * 得意先フラグ
     * @return The value of the column 'ACCOUNT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAccountFlg() {
        checkSpecifiedProperty("accountFlg");
        return convertEmptyToNull(_accountFlg);
    }

    /**
     * [set] ACCOUNT_FLG: {CHAR(1)} <br>
     * 得意先フラグ
     * @param accountFlg The value of the column 'ACCOUNT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAccountFlg(String accountFlg) {
        registerModifiedProperty("accountFlg");
        _accountFlg = accountFlg;
    }

    /**
     * [get] CENTER_ID: {BIGINT(19)} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {BIGINT(19)} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSalesOrgId() {
        checkSpecifiedProperty("salesOrgId");
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgId(Long salesOrgId) {
        registerModifiedProperty("salesOrgId");
        _salesOrgId = salesOrgId;
    }

    /**
     * [get] LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * ロット割れ区分
     * @return The value of the column 'LOT_SPLIT_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotSplitTypeCd() {
        checkSpecifiedProperty("lotSplitTypeCd");
        return convertEmptyToNull(_lotSplitTypeCd);
    }

    /**
     * [set] LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * ロット割れ区分
     * @param lotSplitTypeCd The value of the column 'LOT_SPLIT_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotSplitTypeCd(String lotSplitTypeCd) {
        registerModifiedProperty("lotSplitTypeCd");
        _lotSplitTypeCd = lotSplitTypeCd;
    }

    /**
     * [get] LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 期限日割れ区分
     * @return The value of the column 'LIMIT_DT_SPLIT_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtSplitTypeCd() {
        checkSpecifiedProperty("limitDtSplitTypeCd");
        return convertEmptyToNull(_limitDtSplitTypeCd);
    }

    /**
     * [set] LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 期限日割れ区分
     * @param limitDtSplitTypeCd The value of the column 'LIMIT_DT_SPLIT_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtSplitTypeCd(String limitDtSplitTypeCd) {
        registerModifiedProperty("limitDtSplitTypeCd");
        _limitDtSplitTypeCd = limitDtSplitTypeCd;
    }

    /**
     * [get] PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 製造日割れ区分
     * @return The value of the column 'PROD_DT_SPLIT_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDtSplitTypeCd() {
        checkSpecifiedProperty("prodDtSplitTypeCd");
        return convertEmptyToNull(_prodDtSplitTypeCd);
    }

    /**
     * [set] PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 製造日割れ区分
     * @param prodDtSplitTypeCd The value of the column 'PROD_DT_SPLIT_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDtSplitTypeCd(String prodDtSplitTypeCd) {
        registerModifiedProperty("prodDtSplitTypeCd");
        _prodDtSplitTypeCd = prodDtSplitTypeCd;
    }

    /**
     * [get] LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * ロット不一致区分
     * @return The value of the column 'LOT_UNMATCH_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotUnmatchTypeCd() {
        checkSpecifiedProperty("lotUnmatchTypeCd");
        return convertEmptyToNull(_lotUnmatchTypeCd);
    }

    /**
     * [set] LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * ロット不一致区分
     * @param lotUnmatchTypeCd The value of the column 'LOT_UNMATCH_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotUnmatchTypeCd(String lotUnmatchTypeCd) {
        registerModifiedProperty("lotUnmatchTypeCd");
        _lotUnmatchTypeCd = lotUnmatchTypeCd;
    }

    /**
     * [get] LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 期限日不一致区分
     * @return The value of the column 'LIMIT_DT_UNMATCH_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtUnmatchTypeCd() {
        checkSpecifiedProperty("limitDtUnmatchTypeCd");
        return convertEmptyToNull(_limitDtUnmatchTypeCd);
    }

    /**
     * [set] LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 期限日不一致区分
     * @param limitDtUnmatchTypeCd The value of the column 'LIMIT_DT_UNMATCH_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtUnmatchTypeCd(String limitDtUnmatchTypeCd) {
        registerModifiedProperty("limitDtUnmatchTypeCd");
        _limitDtUnmatchTypeCd = limitDtUnmatchTypeCd;
    }

    /**
     * [get] PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 製造日不一致区分
     * @return The value of the column 'PROD_DT_UNMATCH_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDtUnmatchTypeCd() {
        checkSpecifiedProperty("prodDtUnmatchTypeCd");
        return convertEmptyToNull(_prodDtUnmatchTypeCd);
    }

    /**
     * [set] PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * 製造日不一致区分
     * @param prodDtUnmatchTypeCd The value of the column 'PROD_DT_UNMATCH_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDtUnmatchTypeCd(String prodDtUnmatchTypeCd) {
        registerModifiedProperty("prodDtUnmatchTypeCd");
        _prodDtUnmatchTypeCd = prodDtUnmatchTypeCd;
    }

    /**
     * [get] UNI_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 統合取引先CD
     * @return The value of the column 'UNI_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUniCustomerCd() {
        checkSpecifiedProperty("uniCustomerCd");
        return convertEmptyToNull(_uniCustomerCd);
    }

    /**
     * [set] UNI_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 統合取引先CD
     * @param uniCustomerCd The value of the column 'UNI_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUniCustomerCd(String uniCustomerCd) {
        registerModifiedProperty("uniCustomerCd");
        _uniCustomerCd = uniCustomerCd;
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
