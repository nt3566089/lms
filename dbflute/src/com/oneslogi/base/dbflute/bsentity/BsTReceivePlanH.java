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
 * The entity of t_receive_plan_h as TABLE. <br>
 * 入荷予定ヘッダ
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, RECEIVE_PLAN_DT, PLAN_CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, PLAN_SUPPLIER_ID, PLAN_SUPPLIER_CD, PLAN_DEPOSIT_ID, PLAN_DEPOSIT_CD, RECEIVE_STATUS, INPUT_TYPE, RECEIVE_DELIVERY_STATUS, OLD_RECEIVE_PLAN_H_ID, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_TRANSIT_FLG, PICKING_H_ID, SAP_RECEIVE_SLIP_NO, SLIP_TYPE_ID, SLIP_TYPE_CD, PURCHASE_ORDER_NO, RECEIVE_REASON_CD, ORDER_DATE, ORDER_TIME, CONFIRMED_DELIVERY_DT, PLANT_CD, STORAGE_SPACE_CD, TENHANSHA_CD, SALES_ORG_ID, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, CUSTOMER_ORDER_NO, SAP_VENDER_CD, SAP_SUPPLIER_CD, TODAY_FLG, SANSHA_DELIVERY_SLIP_NO1, DATA_TYPE_CD, SANSHA_TYPE_CD, RECEIVE_REASON_NM, MOD_TYPE_CD, IF_ID, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, m_customer, m_client, m_process_type, t_picking_h, t_receive_plan_h, m_stock_type, b_class_dtl(ByCenterTransitFlg), t_receive_plan_r(AsOne)
 *
 * [referrer table]
 *     t_receive_plan_b, t_receive_plan_h, t_store_record_h, t_receive_plan_r
 *
 * [foreign property]
 *     mCenter, mCustomerByPlanSupplierId, mClient, mProcessType, tPickingH, tReceivePlanHSelf, mStockType, mCustomerByPlanDepositId, bClassDtlByCenterTransitFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByReceiveDeliveryStatus, bClassDtlByReceiveStatus, tReceivePlanRAsOne
 *
 * [referrer property]
 *     tReceivePlanBList, tReceivePlanHSelfList, tStoreRecordHList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long receivePlanHId = entity.getReceivePlanHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long processTypeId = entity.getProcessTypeId();
 * Long stockTypeId = entity.getStockTypeId();
 * String receivePlanDt = entity.getReceivePlanDt();
 * String planClientReceiveNo = entity.getPlanClientReceiveNo();
 * String receiveSlipNo = entity.getReceiveSlipNo();
 * Long planSupplierId = entity.getPlanSupplierId();
 * String planSupplierCd = entity.getPlanSupplierCd();
 * Long planDepositId = entity.getPlanDepositId();
 * String planDepositCd = entity.getPlanDepositCd();
 * String receiveStatus = entity.getReceiveStatus();
 * String inputType = entity.getInputType();
 * String receiveDeliveryStatus = entity.getReceiveDeliveryStatus();
 * Long oldReceivePlanHId = entity.getOldReceivePlanHId();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String centerTransitFlg = entity.getCenterTransitFlg();
 * Long pickingHId = entity.getPickingHId();
 * String sapReceiveSlipNo = entity.getSapReceiveSlipNo();
 * Long slipTypeId = entity.getSlipTypeId();
 * String slipTypeCd = entity.getSlipTypeCd();
 * String purchaseOrderNo = entity.getPurchaseOrderNo();
 * String receiveReasonCd = entity.getReceiveReasonCd();
 * String orderDate = entity.getOrderDate();
 * String orderTime = entity.getOrderTime();
 * String confirmedDeliveryDt = entity.getConfirmedDeliveryDt();
 * String plantCd = entity.getPlantCd();
 * String storageSpaceCd = entity.getStorageSpaceCd();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * Long salesOrgId = entity.getSalesOrgId();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String tenhanshaNm1 = entity.getTenhanshaNm1();
 * String tenhanshaNm2 = entity.getTenhanshaNm2();
 * String sapUserCd = entity.getSapUserCd();
 * String sapUserNm = entity.getSapUserNm();
 * String customerOrderNo = entity.getCustomerOrderNo();
 * String sapVenderCd = entity.getSapVenderCd();
 * String sapSupplierCd = entity.getSapSupplierCd();
 * String todayFlg = entity.getTodayFlg();
 * String sanshaDeliverySlipNo1 = entity.getSanshaDeliverySlipNo1();
 * String dataTypeCd = entity.getDataTypeCd();
 * String sanshaTypeCd = entity.getSanshaTypeCd();
 * String receiveReasonNm = entity.getReceiveReasonNm();
 * String modTypeCd = entity.getModTypeCd();
 * String ifId = entity.getIfId();
 * String spareStr = entity.getSpareStr();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setProcessTypeId(processTypeId);
 * entity.setStockTypeId(stockTypeId);
 * entity.setReceivePlanDt(receivePlanDt);
 * entity.setPlanClientReceiveNo(planClientReceiveNo);
 * entity.setReceiveSlipNo(receiveSlipNo);
 * entity.setPlanSupplierId(planSupplierId);
 * entity.setPlanSupplierCd(planSupplierCd);
 * entity.setPlanDepositId(planDepositId);
 * entity.setPlanDepositCd(planDepositCd);
 * entity.setReceiveStatus(receiveStatus);
 * entity.setInputType(inputType);
 * entity.setReceiveDeliveryStatus(receiveDeliveryStatus);
 * entity.setOldReceivePlanHId(oldReceivePlanHId);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setCenterTransitFlg(centerTransitFlg);
 * entity.setPickingHId(pickingHId);
 * entity.setSapReceiveSlipNo(sapReceiveSlipNo);
 * entity.setSlipTypeId(slipTypeId);
 * entity.setSlipTypeCd(slipTypeCd);
 * entity.setPurchaseOrderNo(purchaseOrderNo);
 * entity.setReceiveReasonCd(receiveReasonCd);
 * entity.setOrderDate(orderDate);
 * entity.setOrderTime(orderTime);
 * entity.setConfirmedDeliveryDt(confirmedDeliveryDt);
 * entity.setPlantCd(plantCd);
 * entity.setStorageSpaceCd(storageSpaceCd);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setSalesOrgId(salesOrgId);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setTenhanshaNm1(tenhanshaNm1);
 * entity.setTenhanshaNm2(tenhanshaNm2);
 * entity.setSapUserCd(sapUserCd);
 * entity.setSapUserNm(sapUserNm);
 * entity.setCustomerOrderNo(customerOrderNo);
 * entity.setSapVenderCd(sapVenderCd);
 * entity.setSapSupplierCd(sapSupplierCd);
 * entity.setTodayFlg(todayFlg);
 * entity.setSanshaDeliverySlipNo1(sanshaDeliverySlipNo1);
 * entity.setDataTypeCd(dataTypeCd);
 * entity.setSanshaTypeCd(sanshaTypeCd);
 * entity.setReceiveReasonNm(receiveReasonNm);
 * entity.setModTypeCd(modTypeCd);
 * entity.setIfId(ifId);
 * entity.setSpareStr(spareStr);
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
public abstract class BsTReceivePlanH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _receivePlanHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type} */
    protected Long _processTypeId;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    protected Long _stockTypeId;

    /** RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)} */
    protected String _receivePlanDt;

    /** PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} */
    protected String _planClientReceiveNo;

    /** RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)} */
    protected String _receiveSlipNo;

    /** PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _planSupplierId;

    /** PLAN_SUPPLIER_CD: {IX, VARCHAR(30)} */
    protected String _planSupplierCd;

    /** PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _planDepositId;

    /** PLAN_DEPOSIT_CD: {VARCHAR(30)} */
    protected String _planDepositCd;

    /** RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} */
    protected String _receiveStatus;

    /** INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} */
    protected String _inputType;

    /** RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} */
    protected String _receiveDeliveryStatus;

    /** OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h} */
    protected Long _oldReceivePlanHId;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    protected String _errorMessageCd;

    /** CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} */
    protected String _centerTransitFlg;

    /** PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h} */
    protected Long _pickingHId;

    /** SAP_RECEIVE_SLIP_NO: {VARCHAR(30)} */
    protected String _sapReceiveSlipNo;

    /** SLIP_TYPE_ID: {BIGINT(19)} */
    protected Long _slipTypeId;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    protected String _slipTypeCd;

    /** PURCHASE_ORDER_NO: {VARCHAR(30)} */
    protected String _purchaseOrderNo;

    /** RECEIVE_REASON_CD: {VARCHAR(255)} */
    protected String _receiveReasonCd;

    /** ORDER_DATE: {VARCHAR(8)} */
    protected String _orderDate;

    /** ORDER_TIME: {VARCHAR(6)} */
    protected String _orderTime;

    /** CONFIRMED_DELIVERY_DT: {VARCHAR(8)} */
    protected String _confirmedDeliveryDt;

    /** PLANT_CD: {VARCHAR(30)} */
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _storageSpaceCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** SALES_ORG_ID: {BIGINT(19)} */
    protected Long _salesOrgId;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** TENHANSHA_NM1: {VARCHAR(60)} */
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60)} */
    protected String _tenhanshaNm2;

    /** SAP_USER_CD: {VARCHAR(30)} */
    protected String _sapUserCd;

    /** SAP_USER_NM: {VARCHAR(60)} */
    protected String _sapUserNm;

    /** CUSTOMER_ORDER_NO: {VARCHAR(100)} */
    protected String _customerOrderNo;

    /** SAP_VENDER_CD: {VARCHAR(30)} */
    protected String _sapVenderCd;

    /** SAP_SUPPLIER_CD: {VARCHAR(30)} */
    protected String _sapSupplierCd;

    /** TODAY_FLG: {CHAR(1)} */
    protected String _todayFlg;

    /** SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} */
    protected String _sanshaDeliverySlipNo1;

    /** DATA_TYPE_CD: {VARCHAR(30)} */
    protected String _dataTypeCd;

    /** SANSHA_TYPE_CD: {VARCHAR(30)} */
    protected String _sanshaTypeCd;

    /** RECEIVE_REASON_NM: {VARCHAR(60)} */
    protected String _receiveReasonNm;

    /** MOD_TYPE_CD: {VARCHAR(30)} */
    protected String _modTypeCd;

    /** IF_ID: {VARCHAR(30)} */
    protected String _ifId;

    /** SPARE_STR: {VARCHAR(255)} */
    protected String _spareStr;

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
        return "t_receive_plan_h";
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
        if (_receivePlanHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of receiveStatus as the classification of ReceiveStatus. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReceiveStatus getReceiveStatusAsReceiveStatus() {
        return CDef.ReceiveStatus.codeOf(getReceiveStatus());
    }

    /**
     * Set the value of receiveStatus as the classification of ReceiveStatus. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus cdef) {
        setReceiveStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InputType getInputTypeAsInputType() {
        return CDef.InputType.codeOf(getInputType());
    }

    /**
     * Set the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInputTypeAsInputType(CDef.InputType cdef) {
        setInputType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of receiveDeliveryStatus as the classification of ReceiveDeliveryStatus. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReceiveDeliveryStatus getReceiveDeliveryStatusAsReceiveDeliveryStatus() {
        return CDef.ReceiveDeliveryStatus.codeOf(getReceiveDeliveryStatus());
    }

    /**
     * Set the value of receiveDeliveryStatus as the classification of ReceiveDeliveryStatus. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus cdef) {
        setReceiveDeliveryStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ErrorFlg getErrorFlgAsErrorFlg() {
        return CDef.ErrorFlg.codeOf(getErrorFlg());
    }

    /**
     * Set the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setErrorFlgAsErrorFlg(CDef.ErrorFlg cdef) {
        setErrorFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of centerTransitFlg as the classification of CenterTransitFlg. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CenterTransitFlg getCenterTransitFlgAsCenterTransitFlg() {
        return CDef.CenterTransitFlg.codeOf(getCenterTransitFlg());
    }

    /**
     * Set the value of centerTransitFlg as the classification of CenterTransitFlg. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg cdef) {
        setCenterTransitFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of receiveStatus as $01 (01). <br>
     * $01: 未入荷
     */
    public void setReceiveStatus_$01() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$01);
    }

    /**
     * Set the value of receiveStatus as $02 (02). <br>
     * $02: 入荷中
     */
    public void setReceiveStatus_$02() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$02);
    }

    /**
     * Set the value of receiveStatus as $03 (03). <br>
     * $03: 入荷済
     */
    public void setReceiveStatus_$03() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$03);
    }

    /**
     * Set the value of receiveStatus as $90 (90). <br>
     * $90: 入荷削除
     */
    public void setReceiveStatus_$90() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$90);
    }

    /**
     * Set the value of receiveStatus as $99 (99). <br>
     * $99: エラー有
     */
    public void setReceiveStatus_$99() {
        setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.$99);
    }

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
     * Set the value of receiveDeliveryStatus as $00 (00). <br>
     * $00: 未完
     */
    public void setReceiveDeliveryStatus_$00() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$00);
    }

    /**
     * Set the value of receiveDeliveryStatus as $01 (01). <br>
     * $01: 完納
     */
    public void setReceiveDeliveryStatus_$01() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$01);
    }

    /**
     * Set the value of receiveDeliveryStatus as $02 (02). <br>
     * $02: 分納
     */
    public void setReceiveDeliveryStatus_$02() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$02);
    }

    /**
     * Set the value of receiveDeliveryStatus as $09 (09). <br>
     * $09: 打切り
     */
    public void setReceiveDeliveryStatus_$09() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$09);
    }

    /**
     * Set the value of errorFlg as $0 (0). <br>
     * $0: エラー無
     */
    public void setErrorFlg_$0() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Set the value of errorFlg as $1 (1). <br>
     * $1: エラー有
     */
    public void setErrorFlg_$1() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$1);
    }

    /**
     * Set the value of centerTransitFlg as $0 (0). <br>
     * $0: 通常
     */
    public void setCenterTransitFlg_$0() {
        setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg.$0);
    }

    /**
     * Set the value of centerTransitFlg as $1 (1). <br>
     * $1: センタ間移動
     */
    public void setCenterTransitFlg_$1() {
        setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg.$1);
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
     * Is the value of receiveStatus $01? <br>
     * $01: 未入荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$01() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$01) : false;
    }

    /**
     * Is the value of receiveStatus $02? <br>
     * $02: 入荷中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$02() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$02) : false;
    }

    /**
     * Is the value of receiveStatus $03? <br>
     * $03: 入荷済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$03() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$03) : false;
    }

    /**
     * Is the value of receiveStatus $90? <br>
     * $90: 入荷削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$90() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$90) : false;
    }

    /**
     * Is the value of receiveStatus $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveStatus$99() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveStatus.$99) : false;
    }

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
     * Is the value of receiveDeliveryStatus $00? <br>
     * $00: 未完
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$00() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$00) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $01? <br>
     * $01: 完納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$01() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$01) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $02? <br>
     * $02: 分納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$02() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$02) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $09? <br>
     * $09: 打切り
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$09() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$09) : false;
    }

    /**
     * Is the value of errorFlg $0? <br>
     * $0: エラー無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$0() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$0) : false;
    }

    /**
     * Is the value of errorFlg $1? <br>
     * $1: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$1() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$1) : false;
    }

    /**
     * Is the value of centerTransitFlg $0? <br>
     * $0: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCenterTransitFlg$0() {
        CDef.CenterTransitFlg cdef = getCenterTransitFlgAsCenterTransitFlg();
        return cdef != null ? cdef.equals(CDef.CenterTransitFlg.$0) : false;
    }

    /**
     * Is the value of centerTransitFlg $1? <br>
     * $1: センタ間移動
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCenterTransitFlg$1() {
        CDef.CenterTransitFlg cdef = getCenterTransitFlgAsCenterTransitFlg();
        return cdef != null ? cdef.equals(CDef.CenterTransitFlg.$1) : false;
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
     * Get the value of the column 'receiveStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReceiveStatusName() {
        CDef.ReceiveStatus cdef = getReceiveStatusAsReceiveStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'inputType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInputTypeName() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'receiveDeliveryStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReceiveDeliveryStatusName() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'errorFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getErrorFlgName() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'centerTransitFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCenterTransitFlgName() {
        CDef.CenterTransitFlg cdef = getCenterTransitFlgAsCenterTransitFlg();
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

    /** m_customer by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'. */
    protected MCustomer _mCustomerByPlanSupplierId;

    /**
     * [get] m_customer by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'. <br>
     * @return The entity of foreign property 'MCustomerByPlanSupplierId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByPlanSupplierId() {
        return _mCustomerByPlanSupplierId;
    }

    /**
     * [set] m_customer by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
     * @param mCustomerByPlanSupplierId The entity of foreign property 'MCustomerByPlanSupplierId'. (NullAllowed)
     */
    public void setMCustomerByPlanSupplierId(MCustomer mCustomerByPlanSupplierId) {
        _mCustomerByPlanSupplierId = mCustomerByPlanSupplierId;
    }

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

    /** m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'. */
    protected MProcessType _mProcessType;

    /**
     * [get] m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'. <br>
     * @return The entity of foreign property 'MProcessType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProcessType getMProcessType() {
        return _mProcessType;
    }

    /**
     * [set] m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param mProcessType The entity of foreign property 'MProcessType'. (NullAllowed)
     */
    public void setMProcessType(MProcessType mProcessType) {
        _mProcessType = mProcessType;
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

    /** t_receive_plan_h by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'. */
    protected TReceivePlanH _tReceivePlanHSelf;

    /**
     * [get] t_receive_plan_h by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'. <br>
     * @return The entity of foreign property 'TReceivePlanHSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TReceivePlanH getTReceivePlanHSelf() {
        return _tReceivePlanHSelf;
    }

    /**
     * [set] t_receive_plan_h by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
     * @param tReceivePlanHSelf The entity of foreign property 'TReceivePlanHSelf'. (NullAllowed)
     */
    public void setTReceivePlanHSelf(TReceivePlanH tReceivePlanHSelf) {
        _tReceivePlanHSelf = tReceivePlanHSelf;
    }

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

    /** m_customer by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'. */
    protected MCustomer _mCustomerByPlanDepositId;

    /**
     * [get] m_customer by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'. <br>
     * @return The entity of foreign property 'MCustomerByPlanDepositId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByPlanDepositId() {
        return _mCustomerByPlanDepositId;
    }

    /**
     * [set] m_customer by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
     * @param mCustomerByPlanDepositId The entity of foreign property 'MCustomerByPlanDepositId'. (NullAllowed)
     */
    public void setMCustomerByPlanDepositId(MCustomer mCustomerByPlanDepositId) {
        _mCustomerByPlanDepositId = mCustomerByPlanDepositId;
    }

    /** b_class_dtl by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'. */
    protected BClassDtl _bClassDtlByCenterTransitFlg;

    /**
     * [get] b_class_dtl by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCenterTransitFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCenterTransitFlg() {
        return _bClassDtlByCenterTransitFlg;
    }

    /**
     * [set] b_class_dtl by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * @param bClassDtlByCenterTransitFlg The entity of foreign property 'BClassDtlByCenterTransitFlg'. (NullAllowed)
     */
    public void setBClassDtlByCenterTransitFlg(BClassDtl bClassDtlByCenterTransitFlg) {
        _bClassDtlByCenterTransitFlg = bClassDtlByCenterTransitFlg;
    }

    /** b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'. */
    protected BClassDtl _bClassDtlByErrorFlg;

    /**
     * [get] b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    /**
     * [set] b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @param bClassDtlByErrorFlg The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed)
     */
    public void setBClassDtlByErrorFlg(BClassDtl bClassDtlByErrorFlg) {
        _bClassDtlByErrorFlg = bClassDtlByErrorFlg;
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

    /** b_class_dtl by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'. */
    protected BClassDtl _bClassDtlByReceiveDeliveryStatus;

    /**
     * [get] b_class_dtl by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByReceiveDeliveryStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReceiveDeliveryStatus() {
        return _bClassDtlByReceiveDeliveryStatus;
    }

    /**
     * [set] b_class_dtl by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @param bClassDtlByReceiveDeliveryStatus The entity of foreign property 'BClassDtlByReceiveDeliveryStatus'. (NullAllowed)
     */
    public void setBClassDtlByReceiveDeliveryStatus(BClassDtl bClassDtlByReceiveDeliveryStatus) {
        _bClassDtlByReceiveDeliveryStatus = bClassDtlByReceiveDeliveryStatus;
    }

    /** b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'. */
    protected BClassDtl _bClassDtlByReceiveStatus;

    /**
     * [get] b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByReceiveStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReceiveStatus() {
        return _bClassDtlByReceiveStatus;
    }

    /**
     * [set] b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @param bClassDtlByReceiveStatus The entity of foreign property 'BClassDtlByReceiveStatus'. (NullAllowed)
     */
    public void setBClassDtlByReceiveStatus(BClassDtl bClassDtlByReceiveStatus) {
        _bClassDtlByReceiveStatus = bClassDtlByReceiveStatus;
    }

    /** t_receive_plan_r by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'. */
    protected TReceivePlanR _tReceivePlanRAsOne;

    /**
     * [get] t_receive_plan_r by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TReceivePlanRAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TReceivePlanR getTReceivePlanRAsOne() {
        return _tReceivePlanRAsOne;
    }

    /**
     * [set] t_receive_plan_r by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * @param TReceivePlanRAsOne The entity of foreign property(referrer-as-one) 'TReceivePlanRAsOne'. (NullAllowed)
     */
    public void setTReceivePlanRAsOne(TReceivePlanR TReceivePlanRAsOne) {
        _tReceivePlanRAsOne = TReceivePlanRAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_receive_plan_b by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'. */
    protected List<TReceivePlanB> _tReceivePlanBList;

    /**
     * [get] t_receive_plan_b by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * @return The entity list of referrer property 'TReceivePlanBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanB> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = newReferrerList(); }
        return _tReceivePlanBList;
    }

    /**
     * [set] t_receive_plan_b by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * @param tReceivePlanBList The entity list of referrer property 'TReceivePlanBList'. (NullAllowed)
     */
    public void setTReceivePlanBList(List<TReceivePlanB> tReceivePlanBList) {
        _tReceivePlanBList = tReceivePlanBList;
    }

    /** t_receive_plan_h by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'. */
    protected List<TReceivePlanH> _tReceivePlanHSelfList;

    /**
     * [get] t_receive_plan_h by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * @return The entity list of referrer property 'TReceivePlanHSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReceivePlanH> getTReceivePlanHSelfList() {
        if (_tReceivePlanHSelfList == null) { _tReceivePlanHSelfList = newReferrerList(); }
        return _tReceivePlanHSelfList;
    }

    /**
     * [set] t_receive_plan_h by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * @param tReceivePlanHSelfList The entity list of referrer property 'TReceivePlanHSelfList'. (NullAllowed)
     */
    public void setTReceivePlanHSelfList(List<TReceivePlanH> tReceivePlanHSelfList) {
        _tReceivePlanHSelfList = tReceivePlanHSelfList;
    }

    /** t_store_record_h by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'. */
    protected List<TStoreRecordH> _tStoreRecordHList;

    /**
     * [get] t_store_record_h by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * @return The entity list of referrer property 'TStoreRecordHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStoreRecordH> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = newReferrerList(); }
        return _tStoreRecordHList;
    }

    /**
     * [set] t_store_record_h by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * @param tStoreRecordHList The entity list of referrer property 'TStoreRecordHList'. (NullAllowed)
     */
    public void setTStoreRecordHList(List<TStoreRecordH> tStoreRecordHList) {
        _tStoreRecordHList = tStoreRecordHList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTReceivePlanH) {
            BsTReceivePlanH other = (BsTReceivePlanH)obj;
            if (!xSV(_receivePlanHId, other._receivePlanHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mCustomerByPlanSupplierId != null)
        { sb.append(li).append(xbRDS(_mCustomerByPlanSupplierId, "mCustomerByPlanSupplierId")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_tPickingH != null)
        { sb.append(li).append(xbRDS(_tPickingH, "tPickingH")); }
        if (_tReceivePlanHSelf != null)
        { sb.append(li).append(xbRDS(_tReceivePlanHSelf, "tReceivePlanHSelf")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_mCustomerByPlanDepositId != null)
        { sb.append(li).append(xbRDS(_mCustomerByPlanDepositId, "mCustomerByPlanDepositId")); }
        if (_bClassDtlByCenterTransitFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCenterTransitFlg, "bClassDtlByCenterTransitFlg")); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorFlg, "bClassDtlByErrorFlg")); }
        if (_bClassDtlByInputType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInputType, "bClassDtlByInputType")); }
        if (_bClassDtlByReceiveDeliveryStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReceiveDeliveryStatus, "bClassDtlByReceiveDeliveryStatus")); }
        if (_bClassDtlByReceiveStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReceiveStatus, "bClassDtlByReceiveStatus")); }
        if (_tReceivePlanRAsOne != null)
        { sb.append(li).append(xbRDS(_tReceivePlanRAsOne, "tReceivePlanRAsOne")); }
        if (_tReceivePlanBList != null) { for (TReceivePlanB et : _tReceivePlanBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanBList")); } } }
        if (_tReceivePlanHSelfList != null) { for (TReceivePlanH et : _tReceivePlanHSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReceivePlanHSelfList")); } } }
        if (_tStoreRecordHList != null) { for (TStoreRecordH et : _tStoreRecordHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStoreRecordHList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_receivePlanDt));
        sb.append(dm).append(xfND(_planClientReceiveNo));
        sb.append(dm).append(xfND(_receiveSlipNo));
        sb.append(dm).append(xfND(_planSupplierId));
        sb.append(dm).append(xfND(_planSupplierCd));
        sb.append(dm).append(xfND(_planDepositId));
        sb.append(dm).append(xfND(_planDepositCd));
        sb.append(dm).append(xfND(_receiveStatus));
        sb.append(dm).append(xfND(_inputType));
        sb.append(dm).append(xfND(_receiveDeliveryStatus));
        sb.append(dm).append(xfND(_oldReceivePlanHId));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_centerTransitFlg));
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_sapReceiveSlipNo));
        sb.append(dm).append(xfND(_slipTypeId));
        sb.append(dm).append(xfND(_slipTypeCd));
        sb.append(dm).append(xfND(_purchaseOrderNo));
        sb.append(dm).append(xfND(_receiveReasonCd));
        sb.append(dm).append(xfND(_orderDate));
        sb.append(dm).append(xfND(_orderTime));
        sb.append(dm).append(xfND(_confirmedDeliveryDt));
        sb.append(dm).append(xfND(_plantCd));
        sb.append(dm).append(xfND(_storageSpaceCd));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_salesOrgId));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_tenhanshaNm1));
        sb.append(dm).append(xfND(_tenhanshaNm2));
        sb.append(dm).append(xfND(_sapUserCd));
        sb.append(dm).append(xfND(_sapUserNm));
        sb.append(dm).append(xfND(_customerOrderNo));
        sb.append(dm).append(xfND(_sapVenderCd));
        sb.append(dm).append(xfND(_sapSupplierCd));
        sb.append(dm).append(xfND(_todayFlg));
        sb.append(dm).append(xfND(_sanshaDeliverySlipNo1));
        sb.append(dm).append(xfND(_dataTypeCd));
        sb.append(dm).append(xfND(_sanshaTypeCd));
        sb.append(dm).append(xfND(_receiveReasonNm));
        sb.append(dm).append(xfND(_modTypeCd));
        sb.append(dm).append(xfND(_ifId));
        sb.append(dm).append(xfND(_spareStr));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mCustomerByPlanSupplierId != null)
        { sb.append(dm).append("mCustomerByPlanSupplierId"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_tPickingH != null)
        { sb.append(dm).append("tPickingH"); }
        if (_tReceivePlanHSelf != null)
        { sb.append(dm).append("tReceivePlanHSelf"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_mCustomerByPlanDepositId != null)
        { sb.append(dm).append("mCustomerByPlanDepositId"); }
        if (_bClassDtlByCenterTransitFlg != null)
        { sb.append(dm).append("bClassDtlByCenterTransitFlg"); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(dm).append("bClassDtlByErrorFlg"); }
        if (_bClassDtlByInputType != null)
        { sb.append(dm).append("bClassDtlByInputType"); }
        if (_bClassDtlByReceiveDeliveryStatus != null)
        { sb.append(dm).append("bClassDtlByReceiveDeliveryStatus"); }
        if (_bClassDtlByReceiveStatus != null)
        { sb.append(dm).append("bClassDtlByReceiveStatus"); }
        if (_tReceivePlanRAsOne != null)
        { sb.append(dm).append("tReceivePlanRAsOne"); }
        if (_tReceivePlanBList != null && !_tReceivePlanBList.isEmpty())
        { sb.append(dm).append("tReceivePlanBList"); }
        if (_tReceivePlanHSelfList != null && !_tReceivePlanHSelfList.isEmpty())
        { sb.append(dm).append("tReceivePlanHSelfList"); }
        if (_tStoreRecordHList != null && !_tStoreRecordHList.isEmpty())
        { sb.append(dm).append("tStoreRecordHList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TReceivePlanH clone() {
        return (TReceivePlanH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProcessTypeId() {
        checkSpecifiedProperty("processTypeId");
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeId(Long processTypeId) {
        registerModifiedProperty("processTypeId");
        _processTypeId = processTypeId;
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
     * [get] RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getReceivePlanDt() {
        checkSpecifiedProperty("receivePlanDt");
        return convertEmptyToNull(_receivePlanDt);
    }

    /**
     * [set] RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        registerModifiedProperty("receivePlanDt");
        _receivePlanDt = receivePlanDt;
    }

    /**
     * [get] PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} <br>
     * 予定顧客入荷指示No.
     * @return The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanClientReceiveNo() {
        checkSpecifiedProperty("planClientReceiveNo");
        return convertEmptyToNull(_planClientReceiveNo);
    }

    /**
     * [set] PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} <br>
     * 予定顧客入荷指示No.
     * @param planClientReceiveNo The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        registerModifiedProperty("planClientReceiveNo");
        _planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)} <br>
     * WMS入荷伝票No.
     * @return The value of the column 'RECEIVE_SLIP_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveSlipNo() {
        checkSpecifiedProperty("receiveSlipNo");
        return convertEmptyToNull(_receiveSlipNo);
    }

    /**
     * [set] RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)} <br>
     * WMS入荷伝票No.
     * @param receiveSlipNo The value of the column 'RECEIVE_SLIP_NO'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        registerModifiedProperty("receiveSlipNo");
        _receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 予定仕入先ID
     * @return The value of the column 'PLAN_SUPPLIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlanSupplierId() {
        checkSpecifiedProperty("planSupplierId");
        return _planSupplierId;
    }

    /**
     * [set] PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 予定仕入先ID
     * @param planSupplierId The value of the column 'PLAN_SUPPLIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanSupplierId(Long planSupplierId) {
        registerModifiedProperty("planSupplierId");
        _planSupplierId = planSupplierId;
    }

    /**
     * [get] PLAN_SUPPLIER_CD: {IX, VARCHAR(30)} <br>
     * 予定仕入先CD
     * @return The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanSupplierCd() {
        checkSpecifiedProperty("planSupplierCd");
        return convertEmptyToNull(_planSupplierCd);
    }

    /**
     * [set] PLAN_SUPPLIER_CD: {IX, VARCHAR(30)} <br>
     * 予定仕入先CD
     * @param planSupplierCd The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        registerModifiedProperty("planSupplierCd");
        _planSupplierCd = planSupplierCd;
    }

    /**
     * [get] PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 予定預託ID
     * @return The value of the column 'PLAN_DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPlanDepositId() {
        checkSpecifiedProperty("planDepositId");
        return _planDepositId;
    }

    /**
     * [set] PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 予定預託ID
     * @param planDepositId The value of the column 'PLAN_DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanDepositId(Long planDepositId) {
        registerModifiedProperty("planDepositId");
        _planDepositId = planDepositId;
    }

    /**
     * [get] PLAN_DEPOSIT_CD: {VARCHAR(30)} <br>
     * 予定預託CD
     * @return The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanDepositCd() {
        checkSpecifiedProperty("planDepositCd");
        return convertEmptyToNull(_planDepositCd);
    }

    /**
     * [set] PLAN_DEPOSIT_CD: {VARCHAR(30)} <br>
     * 予定預託CD
     * @param planDepositCd The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanDepositCd(String planDepositCd) {
        registerModifiedProperty("planDepositCd");
        _planDepositCd = planDepositCd;
    }

    /**
     * [get] RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @return The value of the column 'RECEIVE_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveStatus() {
        checkSpecifiedProperty("receiveStatus");
        return convertEmptyToNull(_receiveStatus);
    }

    /**
     * [set] RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param receiveStatus The value of the column 'RECEIVE_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveStatus(String receiveStatus) {
        registerModifiedProperty("receiveStatus");
        _receiveStatus = receiveStatus;
    }

    /**
     * [get] INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getInputType() {
        checkSpecifiedProperty("inputType");
        return convertEmptyToNull(_inputType);
    }

    /**
     * [set] INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setInputType(String inputType) {
        registerModifiedProperty("inputType");
        _inputType = inputType;
    }

    /**
     * [get] RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @return The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDeliveryStatus() {
        checkSpecifiedProperty("receiveDeliveryStatus");
        return convertEmptyToNull(_receiveDeliveryStatus);
    }

    /**
     * [set] RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param receiveDeliveryStatus The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDeliveryStatus(String receiveDeliveryStatus) {
        registerModifiedProperty("receiveDeliveryStatus");
        _receiveDeliveryStatus = receiveDeliveryStatus;
    }

    /**
     * [get] OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h} <br>
     * 元入荷予定ヘッダID
     * @return The value of the column 'OLD_RECEIVE_PLAN_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOldReceivePlanHId() {
        checkSpecifiedProperty("oldReceivePlanHId");
        return _oldReceivePlanHId;
    }

    /**
     * [set] OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h} <br>
     * 元入荷予定ヘッダID
     * @param oldReceivePlanHId The value of the column 'OLD_RECEIVE_PLAN_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOldReceivePlanHId(Long oldReceivePlanHId) {
        registerModifiedProperty("oldReceivePlanHId");
        _oldReceivePlanHId = oldReceivePlanHId;
    }

    /**
     * [get] ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @return The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterTransitFlg() {
        checkSpecifiedProperty("centerTransitFlg");
        return convertEmptyToNull(_centerTransitFlg);
    }

    /**
     * [set] CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param centerTransitFlg The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterTransitFlg(String centerTransitFlg) {
        registerModifiedProperty("centerTransitFlg");
        _centerTransitFlg = centerTransitFlg;
    }

    /**
     * [get] PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h} <br>
     * センタ間移動出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h} <br>
     * センタ間移動出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
    }

    /**
     * [get] SAP_RECEIVE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @return The value of the column 'SAP_RECEIVE_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapReceiveSlipNo() {
        checkSpecifiedProperty("sapReceiveSlipNo");
        return convertEmptyToNull(_sapReceiveSlipNo);
    }

    /**
     * [set] SAP_RECEIVE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @param sapReceiveSlipNo The value of the column 'SAP_RECEIVE_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapReceiveSlipNo(String sapReceiveSlipNo) {
        registerModifiedProperty("sapReceiveSlipNo");
        _sapReceiveSlipNo = sapReceiveSlipNo;
    }

    /**
     * [get] SLIP_TYPE_ID: {BIGINT(19)} <br>
     * 伝票種別ID
     * @return The value of the column 'SLIP_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlipTypeId() {
        checkSpecifiedProperty("slipTypeId");
        return _slipTypeId;
    }

    /**
     * [set] SLIP_TYPE_ID: {BIGINT(19)} <br>
     * 伝票種別ID
     * @param slipTypeId The value of the column 'SLIP_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipTypeId(Long slipTypeId) {
        registerModifiedProperty("slipTypeId");
        _slipTypeId = slipTypeId;
    }

    /**
     * [get] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別CD
     * @return The value of the column 'SLIP_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipTypeCd() {
        checkSpecifiedProperty("slipTypeCd");
        return convertEmptyToNull(_slipTypeCd);
    }

    /**
     * [set] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別CD
     * @param slipTypeCd The value of the column 'SLIP_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipTypeCd(String slipTypeCd) {
        registerModifiedProperty("slipTypeCd");
        _slipTypeCd = slipTypeCd;
    }

    /**
     * [get] PURCHASE_ORDER_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @return The value of the column 'PURCHASE_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPurchaseOrderNo() {
        checkSpecifiedProperty("purchaseOrderNo");
        return convertEmptyToNull(_purchaseOrderNo);
    }

    /**
     * [set] PURCHASE_ORDER_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @param purchaseOrderNo The value of the column 'PURCHASE_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        registerModifiedProperty("purchaseOrderNo");
        _purchaseOrderNo = purchaseOrderNo;
    }

    /**
     * [get] RECEIVE_REASON_CD: {VARCHAR(255)} <br>
     * 入荷発生事由CD
     * @return The value of the column 'RECEIVE_REASON_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveReasonCd() {
        checkSpecifiedProperty("receiveReasonCd");
        return convertEmptyToNull(_receiveReasonCd);
    }

    /**
     * [set] RECEIVE_REASON_CD: {VARCHAR(255)} <br>
     * 入荷発生事由CD
     * @param receiveReasonCd The value of the column 'RECEIVE_REASON_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveReasonCd(String receiveReasonCd) {
        registerModifiedProperty("receiveReasonCd");
        _receiveReasonCd = receiveReasonCd;
    }

    /**
     * [get] ORDER_DATE: {VARCHAR(8)} <br>
     * 発注日
     * @return The value of the column 'ORDER_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderDate() {
        checkSpecifiedProperty("orderDate");
        return convertEmptyToNull(_orderDate);
    }

    /**
     * [set] ORDER_DATE: {VARCHAR(8)} <br>
     * 発注日
     * @param orderDate The value of the column 'ORDER_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderDate(String orderDate) {
        registerModifiedProperty("orderDate");
        _orderDate = orderDate;
    }

    /**
     * [get] ORDER_TIME: {VARCHAR(6)} <br>
     * 発注時刻
     * @return The value of the column 'ORDER_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTime() {
        checkSpecifiedProperty("orderTime");
        return convertEmptyToNull(_orderTime);
    }

    /**
     * [set] ORDER_TIME: {VARCHAR(6)} <br>
     * 発注時刻
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTime(String orderTime) {
        registerModifiedProperty("orderTime");
        _orderTime = orderTime;
    }

    /**
     * [get] CONFIRMED_DELIVERY_DT: {VARCHAR(8)} <br>
     * 確定納期
     * @return The value of the column 'CONFIRMED_DELIVERY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getConfirmedDeliveryDt() {
        checkSpecifiedProperty("confirmedDeliveryDt");
        return convertEmptyToNull(_confirmedDeliveryDt);
    }

    /**
     * [set] CONFIRMED_DELIVERY_DT: {VARCHAR(8)} <br>
     * 確定納期
     * @param confirmedDeliveryDt The value of the column 'CONFIRMED_DELIVERY_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConfirmedDeliveryDt(String confirmedDeliveryDt) {
        registerModifiedProperty("confirmedDeliveryDt");
        _confirmedDeliveryDt = confirmedDeliveryDt;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlantCd() {
        checkSpecifiedProperty("plantCd");
        return convertEmptyToNull(_plantCd);
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlantCd(String plantCd) {
        registerModifiedProperty("plantCd");
        _plantCd = plantCd;
    }

    /**
     * [get] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorageSpaceCd() {
        checkSpecifiedProperty("storageSpaceCd");
        return convertEmptyToNull(_storageSpaceCd);
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        registerModifiedProperty("storageSpaceCd");
        _storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaCd() {
        checkSpecifiedProperty("tenhanshaCd");
        return convertEmptyToNull(_tenhanshaCd);
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        registerModifiedProperty("tenhanshaCd");
        _tenhanshaCd = tenhanshaCd;
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
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称1
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm1() {
        checkSpecifiedProperty("tenhanshaNm1");
        return convertEmptyToNull(_tenhanshaNm1);
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称1
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        registerModifiedProperty("tenhanshaNm1");
        _tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称2
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm2() {
        checkSpecifiedProperty("tenhanshaNm2");
        return convertEmptyToNull(_tenhanshaNm2);
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称2
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        registerModifiedProperty("tenhanshaNm2");
        _tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
     * @return The value of the column 'SAP_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUserCd() {
        checkSpecifiedProperty("sapUserCd");
        return convertEmptyToNull(_sapUserCd);
    }

    /**
     * [set] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
     * @param sapUserCd The value of the column 'SAP_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUserCd(String sapUserCd) {
        registerModifiedProperty("sapUserCd");
        _sapUserCd = sapUserCd;
    }

    /**
     * [get] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @return The value of the column 'SAP_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUserNm() {
        checkSpecifiedProperty("sapUserNm");
        return convertEmptyToNull(_sapUserNm);
    }

    /**
     * [set] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @param sapUserNm The value of the column 'SAP_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUserNm(String sapUserNm) {
        registerModifiedProperty("sapUserNm");
        _sapUserNm = sapUserNm;
    }

    /**
     * [get] CUSTOMER_ORDER_NO: {VARCHAR(100)} <br>
     * 得意先注文番号
     * @return The value of the column 'CUSTOMER_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerOrderNo() {
        checkSpecifiedProperty("customerOrderNo");
        return convertEmptyToNull(_customerOrderNo);
    }

    /**
     * [set] CUSTOMER_ORDER_NO: {VARCHAR(100)} <br>
     * 得意先注文番号
     * @param customerOrderNo The value of the column 'CUSTOMER_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerOrderNo(String customerOrderNo) {
        registerModifiedProperty("customerOrderNo");
        _customerOrderNo = customerOrderNo;
    }

    /**
     * [get] SAP_VENDER_CD: {VARCHAR(30)} <br>
     * SAP発注先CD
     * @return The value of the column 'SAP_VENDER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapVenderCd() {
        checkSpecifiedProperty("sapVenderCd");
        return convertEmptyToNull(_sapVenderCd);
    }

    /**
     * [set] SAP_VENDER_CD: {VARCHAR(30)} <br>
     * SAP発注先CD
     * @param sapVenderCd The value of the column 'SAP_VENDER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapVenderCd(String sapVenderCd) {
        registerModifiedProperty("sapVenderCd");
        _sapVenderCd = sapVenderCd;
    }

    /**
     * [get] SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * SAP仕入先CD
     * @return The value of the column 'SAP_SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapSupplierCd() {
        checkSpecifiedProperty("sapSupplierCd");
        return convertEmptyToNull(_sapSupplierCd);
    }

    /**
     * [set] SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * SAP仕入先CD
     * @param sapSupplierCd The value of the column 'SAP_SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapSupplierCd(String sapSupplierCd) {
        registerModifiedProperty("sapSupplierCd");
        _sapSupplierCd = sapSupplierCd;
    }

    /**
     * [get] TODAY_FLG: {CHAR(1)} <br>
     * 当日分フラグ
     * @return The value of the column 'TODAY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTodayFlg() {
        checkSpecifiedProperty("todayFlg");
        return convertEmptyToNull(_todayFlg);
    }

    /**
     * [set] TODAY_FLG: {CHAR(1)} <br>
     * 当日分フラグ
     * @param todayFlg The value of the column 'TODAY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTodayFlg(String todayFlg) {
        registerModifiedProperty("todayFlg");
        _todayFlg = todayFlg;
    }

    /**
     * [get] SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * 3社納品書番号1
     * @return The value of the column 'SANSHA_DELIVERY_SLIP_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSanshaDeliverySlipNo1() {
        checkSpecifiedProperty("sanshaDeliverySlipNo1");
        return convertEmptyToNull(_sanshaDeliverySlipNo1);
    }

    /**
     * [set] SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * 3社納品書番号1
     * @param sanshaDeliverySlipNo1 The value of the column 'SANSHA_DELIVERY_SLIP_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaDeliverySlipNo1(String sanshaDeliverySlipNo1) {
        registerModifiedProperty("sanshaDeliverySlipNo1");
        _sanshaDeliverySlipNo1 = sanshaDeliverySlipNo1;
    }

    /**
     * [get] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分CD
     * @return The value of the column 'DATA_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTypeCd() {
        checkSpecifiedProperty("dataTypeCd");
        return convertEmptyToNull(_dataTypeCd);
    }

    /**
     * [set] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分CD
     * @param dataTypeCd The value of the column 'DATA_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTypeCd(String dataTypeCd) {
        registerModifiedProperty("dataTypeCd");
        _dataTypeCd = dataTypeCd;
    }

    /**
     * [get] SANSHA_TYPE_CD: {VARCHAR(30)} <br>
     * 3社区分
     * @return The value of the column 'SANSHA_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSanshaTypeCd() {
        checkSpecifiedProperty("sanshaTypeCd");
        return convertEmptyToNull(_sanshaTypeCd);
    }

    /**
     * [set] SANSHA_TYPE_CD: {VARCHAR(30)} <br>
     * 3社区分
     * @param sanshaTypeCd The value of the column 'SANSHA_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaTypeCd(String sanshaTypeCd) {
        registerModifiedProperty("sanshaTypeCd");
        _sanshaTypeCd = sanshaTypeCd;
    }

    /**
     * [get] RECEIVE_REASON_NM: {VARCHAR(60)} <br>
     * 入荷発生事由名称
     * @return The value of the column 'RECEIVE_REASON_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveReasonNm() {
        checkSpecifiedProperty("receiveReasonNm");
        return convertEmptyToNull(_receiveReasonNm);
    }

    /**
     * [set] RECEIVE_REASON_NM: {VARCHAR(60)} <br>
     * 入荷発生事由名称
     * @param receiveReasonNm The value of the column 'RECEIVE_REASON_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveReasonNm(String receiveReasonNm) {
        registerModifiedProperty("receiveReasonNm");
        _receiveReasonNm = receiveReasonNm;
    }

    /**
     * [get] MOD_TYPE_CD: {VARCHAR(30)} <br>
     * 修正区分
     * @return The value of the column 'MOD_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getModTypeCd() {
        checkSpecifiedProperty("modTypeCd");
        return convertEmptyToNull(_modTypeCd);
    }

    /**
     * [set] MOD_TYPE_CD: {VARCHAR(30)} <br>
     * 修正区分
     * @param modTypeCd The value of the column 'MOD_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setModTypeCd(String modTypeCd) {
        registerModifiedProperty("modTypeCd");
        _modTypeCd = modTypeCd;
    }

    /**
     * [get] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @return The value of the column 'IF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfId() {
        checkSpecifiedProperty("ifId");
        return convertEmptyToNull(_ifId);
    }

    /**
     * [set] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @param ifId The value of the column 'IF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfId(String ifId) {
        registerModifiedProperty("ifId");
        _ifId = ifId;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr() {
        checkSpecifiedProperty("spareStr");
        return convertEmptyToNull(_spareStr);
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr(String spareStr) {
        registerModifiedProperty("spareStr");
        _spareStr = spareStr;
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
