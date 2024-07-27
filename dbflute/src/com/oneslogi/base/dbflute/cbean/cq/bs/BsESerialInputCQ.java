package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of e_serial_input.
 * @author DBFlute(AutoGenerator)
 */
public class BsESerialInputCQ extends AbstractBsESerialInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ESerialInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsESerialInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from e_serial_input) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ESerialInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ESerialInputCIQ xcreateCIQ() {
        ESerialInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ESerialInputCIQ xnewCIQ() {
        return new ESerialInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join e_serial_input on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ESerialInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ESerialInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _serialInputId;
    public ConditionValue xdfgetSerialInputId()
    { if (_serialInputId == null) { _serialInputId = nCV(); }
      return _serialInputId; }
    protected ConditionValue xgetCValueSerialInputId() { return xdfgetSerialInputId(); }

    /**
     * Add order-by as ascend. <br>
     * SERIAL_INPUT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SerialInputId_Asc() { regOBA("SERIAL_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERIAL_INPUT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SerialInputId_Desc() { regOBD("SERIAL_INPUT_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, CHAR(1)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, CHAR(1)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _processType;
    public ConditionValue xdfgetProcessType()
    { if (_processType == null) { _processType = nCV(); }
      return _processType; }
    protected ConditionValue xgetCValueProcessType() { return xdfgetProcessType(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ProcessType_Asc() { regOBA("PROCESS_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ProcessType_Desc() { regOBD("PROCESS_TYPE"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _serialNo;
    public ConditionValue xdfgetSerialNo()
    { if (_serialNo == null) { _serialNo = nCV(); }
      return _serialNo; }
    protected ConditionValue xgetCValueSerialNo() { return xdfgetSerialNo(); }

    /**
     * Add order-by as ascend. <br>
     * SERIAL_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SerialNo_Asc() { regOBA("SERIAL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERIAL_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SerialNo_Desc() { regOBD("SERIAL_NO"); return this; }

    protected ConditionValue _supplierCd;
    public ConditionValue xdfgetSupplierCd()
    { if (_supplierCd == null) { _supplierCd = nCV(); }
      return _supplierCd; }
    protected ConditionValue xgetCValueSupplierCd() { return xdfgetSupplierCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SupplierCd_Asc() { regOBA("SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SupplierCd_Desc() { regOBD("SUPPLIER_CD"); return this; }

    protected ConditionValue _supplierNm;
    public ConditionValue xdfgetSupplierNm()
    { if (_supplierNm == null) { _supplierNm = nCV(); }
      return _supplierNm; }
    protected ConditionValue xgetCValueSupplierNm() { return xdfgetSupplierNm(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SupplierNm_Asc() { regOBA("SUPPLIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SupplierNm_Desc() { regOBD("SUPPLIER_NM"); return this; }

    protected ConditionValue _receiveSlipNo;
    public ConditionValue xdfgetReceiveSlipNo()
    { if (_receiveSlipNo == null) { _receiveSlipNo = nCV(); }
      return _receiveSlipNo; }
    protected ConditionValue xgetCValueReceiveSlipNo() { return xdfgetReceiveSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_SLIP_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ReceiveSlipNo_Asc() { regOBA("RECEIVE_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_SLIP_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ReceiveSlipNo_Desc() { regOBD("RECEIVE_SLIP_NO"); return this; }

    protected ConditionValue _supplyCustomerCd;
    public ConditionValue xdfgetSupplyCustomerCd()
    { if (_supplyCustomerCd == null) { _supplyCustomerCd = nCV(); }
      return _supplyCustomerCd; }
    protected ConditionValue xgetCValueSupplyCustomerCd() { return xdfgetSupplyCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SupplyCustomerCd_Asc() { regOBA("SUPPLY_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SupplyCustomerCd_Desc() { regOBD("SUPPLY_CUSTOMER_CD"); return this; }

    protected ConditionValue _supplyCustomerNm;
    public ConditionValue xdfgetSupplyCustomerNm()
    { if (_supplyCustomerNm == null) { _supplyCustomerNm = nCV(); }
      return _supplyCustomerNm; }
    protected ConditionValue xgetCValueSupplyCustomerNm() { return xdfgetSupplyCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SupplyCustomerNm_Asc() { regOBA("SUPPLY_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_SupplyCustomerNm_Desc() { regOBD("SUPPLY_CUSTOMER_NM"); return this; }

    protected ConditionValue _pickingWorkNo;
    public ConditionValue xdfgetPickingWorkNo()
    { if (_pickingWorkNo == null) { _pickingWorkNo = nCV(); }
      return _pickingWorkNo; }
    protected ConditionValue xgetCValuePickingWorkNo() { return xdfgetPickingWorkNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_WORK_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_PickingWorkNo_Asc() { regOBA("PICKING_WORK_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_WORK_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_PickingWorkNo_Desc() { regOBD("PICKING_WORK_NO"); return this; }

    protected ConditionValue _workDt;
    public ConditionValue xdfgetWorkDt()
    { if (_workDt == null) { _workDt = nCV(); }
      return _workDt; }
    protected ConditionValue xgetCValueWorkDt() { return xdfgetWorkDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_DT: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsESerialInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ESerialInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ESerialInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ESerialInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ESerialInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ESerialInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ESerialInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ESerialInputCQ> _myselfExistsMap;
    public Map<String, ESerialInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ESerialInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ESerialInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ESerialInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ESerialInputCB.class.getName(); }
    protected String xCQ() { return ESerialInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
