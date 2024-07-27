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
 * The base condition-query of t_inventory_inst.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryInstCQ extends AbstractBsTInventoryInstCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryInstCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryInstCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_inventory_inst) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInventoryInstCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInventoryInstCIQ xcreateCIQ() {
        TInventoryInstCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInventoryInstCIQ xnewCIQ() {
        return new TInventoryInstCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_inventory_inst on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInventoryInstCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInventoryInstCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryInstId;
    public ConditionValue xdfgetInventoryInstId()
    { if (_inventoryInstId == null) { _inventoryInstId = nCV(); }
      return _inventoryInstId; }
    protected ConditionValue xgetCValueInventoryInstId() { return xdfgetInventoryInstId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryInstId_Asc() { regOBA("INVENTORY_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryInstId_Desc() { regOBD("INVENTORY_INST_ID"); return this; }

    protected ConditionValue _inventoryHId;
    public ConditionValue xdfgetInventoryHId()
    { if (_inventoryHId == null) { _inventoryHId = nCV(); }
      return _inventoryHId; }
    protected ConditionValue xgetCValueInventoryHId() { return xdfgetInventoryHId(); }

    public Map<String, TInventoryHCQ> getInventoryHId_InScopeRelation_TInventoryH() { return xgetSQueMap("inventoryHId_InScopeRelation_TInventoryH"); }
    public String keepInventoryHId_InScopeRelation_TInventoryH(TInventoryHCQ sq) { return xkeepSQue("inventoryHId_InScopeRelation_TInventoryH", sq); }

    public Map<String, TInventoryHCQ> getInventoryHId_NotInScopeRelation_TInventoryH() { return xgetSQueMap("inventoryHId_NotInScopeRelation_TInventoryH"); }
    public String keepInventoryHId_NotInScopeRelation_TInventoryH(TInventoryHCQ sq) { return xkeepSQue("inventoryHId_NotInScopeRelation_TInventoryH", sq); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryHId_Asc() { regOBA("INVENTORY_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_InventoryHId_Desc() { regOBD("INVENTORY_H_ID"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    public Map<String, MCustomerCQ> getDepositId_InScopeRelation_MCustomer() { return xgetSQueMap("depositId_InScopeRelation_MCustomer"); }
    public String keepDepositId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("depositId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getDepositId_NotInScopeRelation_MCustomer() { return xgetSQueMap("depositId_NotInScopeRelation_MCustomer"); }
    public String keepDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("depositId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _stockTypeId;
    public ConditionValue xdfgetStockTypeId()
    { if (_stockTypeId == null) { _stockTypeId = nCV(); }
      return _stockTypeId; }
    protected ConditionValue xgetCValueStockTypeId() { return xdfgetStockTypeId(); }

    public Map<String, MStockTypeCQ> getStockTypeId_InScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_InScopeRelation_MStockType"); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_InScopeRelation_MStockType", sq); }

    public Map<String, MStockTypeCQ> getStockTypeId_NotInScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_NotInScopeRelation_MStockType"); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_NotInScopeRelation_MStockType", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _fromLocationCd;
    public ConditionValue xdfgetFromLocationCd()
    { if (_fromLocationCd == null) { _fromLocationCd = nCV(); }
      return _fromLocationCd; }
    protected ConditionValue xgetCValueFromLocationCd() { return xdfgetFromLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * FROM_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FromLocationCd_Asc() { regOBA("FROM_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROM_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FromLocationCd_Desc() { regOBD("FROM_LOCATION_CD"); return this; }

    protected ConditionValue _toLocationCd;
    public ConditionValue xdfgetToLocationCd()
    { if (_toLocationCd == null) { _toLocationCd = nCV(); }
      return _toLocationCd; }
    protected ConditionValue xgetCValueToLocationCd() { return xdfgetToLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * TO_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ToLocationCd_Asc() { regOBA("TO_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TO_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ToLocationCd_Desc() { regOBD("TO_LOCATION_CD"); return this; }

    protected ConditionValue _zoneId;
    public ConditionValue xdfgetZoneId()
    { if (_zoneId == null) { _zoneId = nCV(); }
      return _zoneId; }
    protected ConditionValue xgetCValueZoneId() { return xdfgetZoneId(); }

    public Map<String, MZoneCQ> getZoneId_InScopeRelation_MZone() { return xgetSQueMap("zoneId_InScopeRelation_MZone"); }
    public String keepZoneId_InScopeRelation_MZone(MZoneCQ sq) { return xkeepSQue("zoneId_InScopeRelation_MZone", sq); }

    public Map<String, MZoneCQ> getZoneId_NotInScopeRelation_MZone() { return xgetSQueMap("zoneId_NotInScopeRelation_MZone"); }
    public String keepZoneId_NotInScopeRelation_MZone(MZoneCQ sq) { return xkeepSQue("zoneId_NotInScopeRelation_MZone", sq); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_ID: {IX, BIGINT(19), FK to m_zone}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ZoneId_Asc() { regOBA("ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_ID: {IX, BIGINT(19), FK to m_zone}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ZoneId_Desc() { regOBD("ZONE_ID"); return this; }

    protected ConditionValue _fromStockInoutDt;
    public ConditionValue xdfgetFromStockInoutDt()
    { if (_fromStockInoutDt == null) { _fromStockInoutDt = nCV(); }
      return _fromStockInoutDt; }
    protected ConditionValue xgetCValueFromStockInoutDt() { return xdfgetFromStockInoutDt(); }

    /**
     * Add order-by as ascend. <br>
     * FROM_STOCK_INOUT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FromStockInoutDt_Asc() { regOBA("FROM_STOCK_INOUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROM_STOCK_INOUT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FromStockInoutDt_Desc() { regOBD("FROM_STOCK_INOUT_DT"); return this; }

    protected ConditionValue _toStockInoutDt;
    public ConditionValue xdfgetToStockInoutDt()
    { if (_toStockInoutDt == null) { _toStockInoutDt = nCV(); }
      return _toStockInoutDt; }
    protected ConditionValue xgetCValueToStockInoutDt() { return xdfgetToStockInoutDt(); }

    /**
     * Add order-by as ascend. <br>
     * TO_STOCK_INOUT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ToStockInoutDt_Asc() { regOBA("TO_STOCK_INOUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TO_STOCK_INOUT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ToStockInoutDt_Desc() { regOBD("TO_STOCK_INOUT_DT"); return this; }

    protected ConditionValue _stockExistOnlyFlg;
    public ConditionValue xdfgetStockExistOnlyFlg()
    { if (_stockExistOnlyFlg == null) { _stockExistOnlyFlg = nCV(); }
      return _stockExistOnlyFlg; }
    protected ConditionValue xgetCValueStockExistOnlyFlg() { return xdfgetStockExistOnlyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_StockExistOnlyFlg_Asc() { regOBA("STOCK_EXIST_ONLY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_StockExistOnlyFlg_Desc() { regOBD("STOCK_EXIST_ONLY_FLG"); return this; }

    protected ConditionValue _fiscalYear;
    public ConditionValue xdfgetFiscalYear()
    { if (_fiscalYear == null) { _fiscalYear = nCV(); }
      return _fiscalYear; }
    protected ConditionValue xgetCValueFiscalYear() { return xdfgetFiscalYear(); }

    /**
     * Add order-by as ascend. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FiscalYear_Asc() { regOBA("FISCAL_YEAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_FiscalYear_Desc() { regOBD("FISCAL_YEAR"); return this; }

    protected ConditionValue _lpSendFlg;
    public ConditionValue xdfgetLpSendFlg()
    { if (_lpSendFlg == null) { _lpSendFlg = nCV(); }
      return _lpSendFlg; }
    protected ConditionValue xgetCValueLpSendFlg() { return xdfgetLpSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_LpSendFlg_Asc() { regOBA("LP_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_LpSendFlg_Desc() { regOBD("LP_SEND_FLG"); return this; }

    protected ConditionValue _wmSendFlg;
    public ConditionValue xdfgetWmSendFlg()
    { if (_wmSendFlg == null) { _wmSendFlg = nCV(); }
      return _wmSendFlg; }
    protected ConditionValue xgetCValueWmSendFlg() { return xdfgetWmSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_WmSendFlg_Asc() { regOBA("WM_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_WmSendFlg_Desc() { regOBD("WM_SEND_FLG"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTInventoryInstCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryInstCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTInventoryInstCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTInventoryInstCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TInventoryInstCQ bq = (TInventoryInstCQ)bqs;
        TInventoryInstCQ uq = (TInventoryInstCQ)uqs;
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryMZone()) {
            uq.queryMZone().reflectRelationOnUnionQuery(bq.queryMZone(), uq.queryMZone());
        }
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryTInventoryH()) {
            uq.queryTInventoryH().reflectRelationOnUnionQuery(bq.queryTInventoryH(), uq.queryTInventoryH());
        }
        if (bq.hasConditionQueryBClassDtlByStockExistOnlyFlg()) {
            uq.queryBClassDtlByStockExistOnlyFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockExistOnlyFlg(), uq.queryBClassDtlByStockExistOnlyFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MStockTypeCQ queryMStockType() {
        return xdfgetConditionQueryMStockType();
    }
    public MStockTypeCQ xdfgetConditionQueryMStockType() {
        String prop = "mStockType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMStockType()); xsetupOuterJoinMStockType(); }
        return xgetQueRlMap(prop);
    }
    protected MStockTypeCQ xcreateQueryMStockType() {
        String nrp = xresolveNRP("t_inventory_inst", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_zone by my ZONE_ID, named 'MZone'.
     * @return The instance of condition-query. (NotNull)
     */
    public MZoneCQ queryMZone() {
        return xdfgetConditionQueryMZone();
    }
    public MZoneCQ xdfgetConditionQueryMZone() {
        String prop = "mZone";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMZone()); xsetupOuterJoinMZone(); }
        return xgetQueRlMap(prop);
    }
    protected MZoneCQ xcreateQueryMZone() {
        String nrp = xresolveNRP("t_inventory_inst", "mZone"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MZoneCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mZone", nrp);
    }
    protected void xsetupOuterJoinMZone() { xregOutJo("mZone"); }
    public boolean hasConditionQueryMZone() { return xhasQueRlMap("mZone"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my DEPOSIT_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("t_inventory_inst", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_inventory_h by my INVENTORY_H_ID, named 'TInventoryH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TInventoryHCQ queryTInventoryH() {
        return xdfgetConditionQueryTInventoryH();
    }
    public TInventoryHCQ xdfgetConditionQueryTInventoryH() {
        String prop = "tInventoryH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTInventoryH()); xsetupOuterJoinTInventoryH(); }
        return xgetQueRlMap(prop);
    }
    protected TInventoryHCQ xcreateQueryTInventoryH() {
        String nrp = xresolveNRP("t_inventory_inst", "tInventoryH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TInventoryHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tInventoryH", nrp);
    }
    protected void xsetupOuterJoinTInventoryH() { xregOutJo("tInventoryH"); }
    public boolean hasConditionQueryTInventoryH() { return xhasQueRlMap("tInventoryH"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockExistOnlyFlg() {
        return xdfgetConditionQueryBClassDtlByStockExistOnlyFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockExistOnlyFlg() {
        String prop = "bClassDtlByStockExistOnlyFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockExistOnlyFlg()); xsetupOuterJoinBClassDtlByStockExistOnlyFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockExistOnlyFlg() {
        String nrp = xresolveNRP("t_inventory_inst", "bClassDtlByStockExistOnlyFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockExistOnlyFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockExistOnlyFlg() { xregOutJo("bClassDtlByStockExistOnlyFlg"); }
    public boolean hasConditionQueryBClassDtlByStockExistOnlyFlg() { return xhasQueRlMap("bClassDtlByStockExistOnlyFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TInventoryInstCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInventoryInstCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInventoryInstCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInventoryInstCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInventoryInstCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInventoryInstCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInventoryInstCQ> _myselfExistsMap;
    public Map<String, TInventoryInstCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInventoryInstCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInventoryInstCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInventoryInstCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInventoryInstCB.class.getName(); }
    protected String xCQ() { return TInventoryInstCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
