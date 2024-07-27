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
 * The base condition-query of t_shipping_record_h.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingRecordHCQ extends AbstractBsTShippingRecordHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingRecordHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingRecordHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shipping_record_h) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingRecordHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingRecordHCIQ xcreateCIQ() {
        TShippingRecordHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingRecordHCIQ xnewCIQ() {
        return new TShippingRecordHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shipping_record_h on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingRecordHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingRecordHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingRecordHId;
    public ConditionValue xdfgetShippingRecordHId()
    { if (_shippingRecordHId == null) { _shippingRecordHId = nCV(); }
      return _shippingRecordHId; }
    protected ConditionValue xgetCValueShippingRecordHId() { return xdfgetShippingRecordHId(); }

    public Map<String, TShippingRecordBCQ> xdfgetShippingRecordHId_ExistsReferrer_TShippingRecordBList() { return xgetSQueMap("shippingRecordHId_ExistsReferrer_TShippingRecordBList"); }
    public String keepShippingRecordHId_ExistsReferrer_TShippingRecordBList(TShippingRecordBCQ sq) { return xkeepSQue("shippingRecordHId_ExistsReferrer_TShippingRecordBList", sq); }

    public Map<String, TShippingRecordBCQ> xdfgetShippingRecordHId_NotExistsReferrer_TShippingRecordBList() { return xgetSQueMap("shippingRecordHId_NotExistsReferrer_TShippingRecordBList"); }
    public String keepShippingRecordHId_NotExistsReferrer_TShippingRecordBList(TShippingRecordBCQ sq) { return xkeepSQue("shippingRecordHId_NotExistsReferrer_TShippingRecordBList", sq); }

    public Map<String, TShippingRecordBCQ> xdfgetShippingRecordHId_SpecifyDerivedReferrer_TShippingRecordBList() { return xgetSQueMap("shippingRecordHId_SpecifyDerivedReferrer_TShippingRecordBList"); }
    public String keepShippingRecordHId_SpecifyDerivedReferrer_TShippingRecordBList(TShippingRecordBCQ sq) { return xkeepSQue("shippingRecordHId_SpecifyDerivedReferrer_TShippingRecordBList", sq); }

    public Map<String, TShippingRecordBCQ> xdfgetShippingRecordHId_QueryDerivedReferrer_TShippingRecordBList() { return xgetSQueMap("shippingRecordHId_QueryDerivedReferrer_TShippingRecordBList"); }
    public String keepShippingRecordHId_QueryDerivedReferrer_TShippingRecordBList(TShippingRecordBCQ sq) { return xkeepSQue("shippingRecordHId_QueryDerivedReferrer_TShippingRecordBList", sq); }
    public Map<String, Object> xdfgetShippingRecordHId_QueryDerivedReferrer_TShippingRecordBListParameter() { return xgetSQuePmMap("shippingRecordHId_QueryDerivedReferrer_TShippingRecordBList"); }
    public String keepShippingRecordHId_QueryDerivedReferrer_TShippingRecordBListParameter(Object pm) { return xkeepSQuePm("shippingRecordHId_QueryDerivedReferrer_TShippingRecordBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ShippingRecordHId_Asc() { regOBA("SHIPPING_RECORD_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ShippingRecordHId_Desc() { regOBD("SHIPPING_RECORD_H_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _shippingSlipNo;
    public ConditionValue xdfgetShippingSlipNo()
    { if (_shippingSlipNo == null) { _shippingSlipNo = nCV(); }
      return _shippingSlipNo; }
    protected ConditionValue xgetCValueShippingSlipNo() { return xdfgetShippingSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

    protected ConditionValue _salesOrderNo;
    public ConditionValue xdfgetSalesOrderNo()
    { if (_salesOrderNo == null) { _salesOrderNo = nCV(); }
      return _salesOrderNo; }
    protected ConditionValue xgetCValueSalesOrderNo() { return xdfgetSalesOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_SalesOrderNo_Asc() { regOBA("SALES_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_SalesOrderNo_Desc() { regOBD("SALES_ORDER_NO"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _shippingStorageSpaceCd;
    public ConditionValue xdfgetShippingStorageSpaceCd()
    { if (_shippingStorageSpaceCd == null) { _shippingStorageSpaceCd = nCV(); }
      return _shippingStorageSpaceCd; }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return xdfgetShippingStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _nizoroeNo;
    public ConditionValue xdfgetNizoroeNo()
    { if (_nizoroeNo == null) { _nizoroeNo = nCV(); }
      return _nizoroeNo; }
    protected ConditionValue xgetCValueNizoroeNo() { return xdfgetNizoroeNo(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_NizoroeNo_Asc() { regOBA("NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_NizoroeNo_Desc() { regOBD("NIZOROE_NO"); return this; }

    protected ConditionValue _daihyoNizoroeNo;
    public ConditionValue xdfgetDaihyoNizoroeNo()
    { if (_daihyoNizoroeNo == null) { _daihyoNizoroeNo = nCV(); }
      return _daihyoNizoroeNo; }
    protected ConditionValue xgetCValueDaihyoNizoroeNo() { return xdfgetDaihyoNizoroeNo(); }

    /**
     * Add order-by as ascend. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_DaihyoNizoroeNo_Asc() { regOBA("DAIHYO_NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_DaihyoNizoroeNo_Desc() { regOBD("DAIHYO_NIZOROE_NO"); return this; }

    protected ConditionValue _carrierSlipNo;
    public ConditionValue xdfgetCarrierSlipNo()
    { if (_carrierSlipNo == null) { _carrierSlipNo = nCV(); }
      return _carrierSlipNo; }
    protected ConditionValue xgetCValueCarrierSlipNo() { return xdfgetCarrierSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_CarrierSlipNo_Asc() { regOBA("CARRIER_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_CarrierSlipNo_Desc() { regOBD("CARRIER_SLIP_NO"); return this; }

    protected ConditionValue _carrierCd;
    public ConditionValue xdfgetCarrierCd()
    { if (_carrierCd == null) { _carrierCd = nCV(); }
      return _carrierCd; }
    protected ConditionValue xgetCValueCarrierCd() { return xdfgetCarrierCd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _carrierRnm;
    public ConditionValue xdfgetCarrierRnm()
    { if (_carrierRnm == null) { _carrierRnm = nCV(); }
      return _carrierRnm; }
    protected ConditionValue xgetCValueCarrierRnm() { return xdfgetCarrierRnm(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_CarrierRnm_Asc() { regOBA("CARRIER_RNM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_CarrierRnm_Desc() { regOBD("CARRIER_RNM"); return this; }

    protected ConditionValue _salesNo2;
    public ConditionValue xdfgetSalesNo2()
    { if (_salesNo2 == null) { _salesNo2 = nCV(); }
      return _salesNo2; }
    protected ConditionValue xgetCValueSalesNo2() { return xdfgetSalesNo2(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_SalesNo2_Asc() { regOBA("SALES_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_SalesNo2_Desc() { regOBD("SALES_NO2"); return this; }

    protected ConditionValue _deliverySlipNo;
    public ConditionValue xdfgetDeliverySlipNo()
    { if (_deliverySlipNo == null) { _deliverySlipNo = nCV(); }
      return _deliverySlipNo; }
    protected ConditionValue xgetCValueDeliverySlipNo() { return xdfgetDeliverySlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_DeliverySlipNo_Asc() { regOBA("DELIVERY_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_DeliverySlipNo_Desc() { regOBD("DELIVERY_SLIP_NO"); return this; }

    protected ConditionValue _dStr;
    public ConditionValue xdfgetDStr()
    { if (_dStr == null) { _dStr = nCV(); }
      return _dStr; }
    protected ConditionValue xgetCValueDStr() { return xdfgetDStr(); }

    /**
     * Add order-by as ascend. <br>
     * D_STR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_DStr_Asc() { regOBA("D_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * D_STR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_DStr_Desc() { regOBD("D_STR"); return this; }

    protected ConditionValue _iStr;
    public ConditionValue xdfgetIStr()
    { if (_iStr == null) { _iStr = nCV(); }
      return _iStr; }
    protected ConditionValue xgetCValueIStr() { return xdfgetIStr(); }

    /**
     * Add order-by as ascend. <br>
     * I_STR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_IStr_Asc() { regOBA("I_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * I_STR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_IStr_Desc() { regOBD("I_STR"); return this; }

    protected ConditionValue _s4SendFlg;
    public ConditionValue xdfgetS4SendFlg()
    { if (_s4SendFlg == null) { _s4SendFlg = nCV(); }
      return _s4SendFlg; }
    protected ConditionValue xgetCValueS4SendFlg() { return xdfgetS4SendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * S4_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_S4SendFlg_Asc() { regOBA("S4_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * S4_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_S4SendFlg_Desc() { regOBD("S4_SEND_FLG"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingRecordHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingRecordHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingRecordHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingRecordHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShippingRecordHCQ bq = (TShippingRecordHCQ)bqs;
        TShippingRecordHCQ uq = (TShippingRecordHCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("t_shipping_record_h", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingRecordHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingRecordHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShippingRecordHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShippingRecordHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShippingRecordHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShippingRecordHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShippingRecordHCQ> _myselfExistsMap;
    public Map<String, TShippingRecordHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShippingRecordHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShippingRecordHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShippingRecordHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingRecordHCB.class.getName(); }
    protected String xCQ() { return TShippingRecordHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
