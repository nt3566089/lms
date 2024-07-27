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
 * The base condition-query of t_bldl5110.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl5110CQ extends AbstractBsTBldl5110CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl5110CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl5110CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl5110) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl5110CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl5110CIQ xcreateCIQ() {
        TBldl5110CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl5110CIQ xnewCIQ() {
        return new TBldl5110CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl5110 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl5110CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl5110CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl5110Id;
    public ConditionValue xdfgetBldl5110Id()
    { if (_bldl5110Id == null) { _bldl5110Id = nCV(); }
      return _bldl5110Id; }
    protected ConditionValue xgetCValueBldl5110Id() { return xdfgetBldl5110Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_Bldl5110Id_Asc() { regOBA("BLDL5110_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_Bldl5110Id_Desc() { regOBD("BLDL5110_ID"); return this; }

    protected ConditionValue _yearmonth;
    public ConditionValue xdfgetYearmonth()
    { if (_yearmonth == null) { _yearmonth = nCV(); }
      return _yearmonth; }
    protected ConditionValue xgetCValueYearmonth() { return xdfgetYearmonth(); }

    /**
     * Add order-by as ascend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

    protected ConditionValue _baseNm;
    public ConditionValue xdfgetBaseNm()
    { if (_baseNm == null) { _baseNm = nCV(); }
      return _baseNm; }
    protected ConditionValue xgetCValueBaseNm() { return xdfgetBaseNm(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

    protected ConditionValue _month;
    public ConditionValue xdfgetMonth()
    { if (_month == null) { _month = nCV(); }
      return _month; }
    protected ConditionValue xgetCValueMonth() { return xdfgetMonth(); }

    /**
     * Add order-by as ascend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

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
    public BsTBldl5110CQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _carrierNm;
    public ConditionValue xdfgetCarrierNm()
    { if (_carrierNm == null) { _carrierNm = nCV(); }
      return _carrierNm; }
    protected ConditionValue xgetCValueCarrierNm() { return xdfgetCarrierNm(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_CarrierNm_Asc() { regOBA("CARRIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_CarrierNm_Desc() { regOBD("CARRIER_NM"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _fwStore;
    public ConditionValue xdfgetFwStore()
    { if (_fwStore == null) { _fwStore = nCV(); }
      return _fwStore; }
    protected ConditionValue xgetCValueFwStore() { return xdfgetFwStore(); }

    /**
     * Add order-by as ascend. <br>
     * FW_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_FwStore_Asc() { regOBA("FW_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_FwStore_Desc() { regOBD("FW_STORE"); return this; }

    protected ConditionValue _fwDirect;
    public ConditionValue xdfgetFwDirect()
    { if (_fwDirect == null) { _fwDirect = nCV(); }
      return _fwDirect; }
    protected ConditionValue xgetCValueFwDirect() { return xdfgetFwDirect(); }

    /**
     * Add order-by as ascend. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_FwDirect_Asc() { regOBA("FW_DIRECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_FwDirect_Desc() { regOBD("FW_DIRECT"); return this; }

    protected ConditionValue _unStore;
    public ConditionValue xdfgetUnStore()
    { if (_unStore == null) { _unStore = nCV(); }
      return _unStore; }
    protected ConditionValue xgetCValueUnStore() { return xdfgetUnStore(); }

    /**
     * Add order-by as ascend. <br>
     * UN_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_UnStore_Asc() { regOBA("UN_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_UnStore_Desc() { regOBD("UN_STORE"); return this; }

    protected ConditionValue _unDirect;
    public ConditionValue xdfgetUnDirect()
    { if (_unDirect == null) { _unDirect = nCV(); }
      return _unDirect; }
    protected ConditionValue xgetCValueUnDirect() { return xdfgetUnDirect(); }

    /**
     * Add order-by as ascend. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_UnDirect_Asc() { regOBA("UN_DIRECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_UnDirect_Desc() { regOBD("UN_DIRECT"); return this; }

    protected ConditionValue _shStore;
    public ConditionValue xdfgetShStore()
    { if (_shStore == null) { _shStore = nCV(); }
      return _shStore; }
    protected ConditionValue xgetCValueShStore() { return xdfgetShStore(); }

    /**
     * Add order-by as ascend. <br>
     * SH_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_ShStore_Asc() { regOBA("SH_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_ShStore_Desc() { regOBD("SH_STORE"); return this; }

    protected ConditionValue _shDirect;
    public ConditionValue xdfgetShDirect()
    { if (_shDirect == null) { _shDirect = nCV(); }
      return _shDirect; }
    protected ConditionValue xgetCValueShDirect() { return xdfgetShDirect(); }

    /**
     * Add order-by as ascend. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_ShDirect_Asc() { regOBA("SH_DIRECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_ShDirect_Desc() { regOBD("SH_DIRECT"); return this; }

    protected ConditionValue _hmStore;
    public ConditionValue xdfgetHmStore()
    { if (_hmStore == null) { _hmStore = nCV(); }
      return _hmStore; }
    protected ConditionValue xgetCValueHmStore() { return xdfgetHmStore(); }

    /**
     * Add order-by as ascend. <br>
     * HM_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_HmStore_Asc() { regOBA("HM_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HM_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_HmStore_Desc() { regOBD("HM_STORE"); return this; }

    protected ConditionValue _hmDirect;
    public ConditionValue xdfgetHmDirect()
    { if (_hmDirect == null) { _hmDirect = nCV(); }
      return _hmDirect; }
    protected ConditionValue xgetCValueHmDirect() { return xdfgetHmDirect(); }

    /**
     * Add order-by as ascend. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_HmDirect_Asc() { regOBA("HM_DIRECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_HmDirect_Desc() { regOBD("HM_DIRECT"); return this; }

    protected ConditionValue _totalStore;
    public ConditionValue xdfgetTotalStore()
    { if (_totalStore == null) { _totalStore = nCV(); }
      return _totalStore; }
    protected ConditionValue xgetCValueTotalStore() { return xdfgetTotalStore(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_TotalStore_Asc() { regOBA("TOTAL_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_TotalStore_Desc() { regOBD("TOTAL_STORE"); return this; }

    protected ConditionValue _totalDirect;
    public ConditionValue xdfgetTotalDirect()
    { if (_totalDirect == null) { _totalDirect = nCV(); }
      return _totalDirect; }
    protected ConditionValue xgetCValueTotalDirect() { return xdfgetTotalDirect(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_TotalDirect_Asc() { regOBA("TOTAL_DIRECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_TotalDirect_Desc() { regOBD("TOTAL_DIRECT"); return this; }

    protected ConditionValue _koguchiInclude;
    public ConditionValue xdfgetKoguchiInclude()
    { if (_koguchiInclude == null) { _koguchiInclude = nCV(); }
      return _koguchiInclude; }
    protected ConditionValue xgetCValueKoguchiInclude() { return xdfgetKoguchiInclude(); }

    /**
     * Add order-by as ascend. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_KoguchiInclude_Asc() { regOBA("KOGUCHI_INCLUDE"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_KoguchiInclude_Desc() { regOBD("KOGUCHI_INCLUDE"); return this; }

    protected ConditionValue _koguchiConst;
    public ConditionValue xdfgetKoguchiConst()
    { if (_koguchiConst == null) { _koguchiConst = nCV(); }
      return _koguchiConst; }
    protected ConditionValue xgetCValueKoguchiConst() { return xdfgetKoguchiConst(); }

    /**
     * Add order-by as ascend. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_KoguchiConst_Asc() { regOBA("KOGUCHI_CONST"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_KoguchiConst_Desc() { regOBD("KOGUCHI_CONST"); return this; }

    protected ConditionValue _totalPackNum;
    public ConditionValue xdfgetTotalPackNum()
    { if (_totalPackNum == null) { _totalPackNum = nCV(); }
      return _totalPackNum; }
    protected ConditionValue xgetCValueTotalPackNum() { return xdfgetTotalPackNum(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_TotalPackNum_Asc() { regOBA("TOTAL_PACK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_TotalPackNum_Desc() { regOBD("TOTAL_PACK_NUM"); return this; }

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
    public BsTBldl5110CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl5110CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl5110CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl5110CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl5110CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl5110CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl5110CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl5110CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl5110CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5110CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl5110CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl5110CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl5110CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl5110CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl5110CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl5110CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl5110CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl5110CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl5110CQ> _myselfExistsMap;
    public Map<String, TBldl5110CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl5110CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl5110CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl5110CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl5110CB.class.getName(); }
    protected String xCQ() { return TBldl5110CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
