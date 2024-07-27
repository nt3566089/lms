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
 * The base condition-query of t_bldl5050.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl5050CQ extends AbstractBsTBldl5050CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl5050CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl5050CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl5050) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl5050CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl5050CIQ xcreateCIQ() {
        TBldl5050CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl5050CIQ xnewCIQ() {
        return new TBldl5050CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl5050 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl5050CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl5050CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl5050Id;
    public ConditionValue xdfgetBldl5050Id()
    { if (_bldl5050Id == null) { _bldl5050Id = nCV(); }
      return _bldl5050Id; }
    protected ConditionValue xgetCValueBldl5050Id() { return xdfgetBldl5050Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_Bldl5050Id_Asc() { regOBA("BLDL5050_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_Bldl5050Id_Desc() { regOBD("BLDL5050_ID"); return this; }

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
    public BsTBldl5050CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl5050CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

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
    public BsTBldl5050CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

    protected ConditionValue _rowNo;
    public ConditionValue xdfgetRowNo()
    { if (_rowNo == null) { _rowNo = nCV(); }
      return _rowNo; }
    protected ConditionValue xgetCValueRowNo() { return xdfgetRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

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
    public BsTBldl5050CQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _fwItemCnt;
    public ConditionValue xdfgetFwItemCnt()
    { if (_fwItemCnt == null) { _fwItemCnt = nCV(); }
      return _fwItemCnt; }
    protected ConditionValue xgetCValueFwItemCnt() { return xdfgetFwItemCnt(); }

    /**
     * Add order-by as ascend. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_FwItemCnt_Asc() { regOBA("FW_ITEM_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_FwItemCnt_Desc() { regOBD("FW_ITEM_CNT"); return this; }

    protected ConditionValue _fwPickNum;
    public ConditionValue xdfgetFwPickNum()
    { if (_fwPickNum == null) { _fwPickNum = nCV(); }
      return _fwPickNum; }
    protected ConditionValue xgetCValueFwPickNum() { return xdfgetFwPickNum(); }

    /**
     * Add order-by as ascend. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_FwPickNum_Asc() { regOBA("FW_PICK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_FwPickNum_Desc() { regOBD("FW_PICK_NUM"); return this; }

    protected ConditionValue _fwRate;
    public ConditionValue xdfgetFwRate()
    { if (_fwRate == null) { _fwRate = nCV(); }
      return _fwRate; }
    protected ConditionValue xgetCValueFwRate() { return xdfgetFwRate(); }

    /**
     * Add order-by as ascend. <br>
     * FW_RATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_FwRate_Asc() { regOBA("FW_RATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_RATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_FwRate_Desc() { regOBD("FW_RATE"); return this; }

    protected ConditionValue _unItemCnt;
    public ConditionValue xdfgetUnItemCnt()
    { if (_unItemCnt == null) { _unItemCnt = nCV(); }
      return _unItemCnt; }
    protected ConditionValue xgetCValueUnItemCnt() { return xdfgetUnItemCnt(); }

    /**
     * Add order-by as ascend. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UnItemCnt_Asc() { regOBA("UN_ITEM_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UnItemCnt_Desc() { regOBD("UN_ITEM_CNT"); return this; }

    protected ConditionValue _unPickNum;
    public ConditionValue xdfgetUnPickNum()
    { if (_unPickNum == null) { _unPickNum = nCV(); }
      return _unPickNum; }
    protected ConditionValue xgetCValueUnPickNum() { return xdfgetUnPickNum(); }

    /**
     * Add order-by as ascend. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UnPickNum_Asc() { regOBA("UN_PICK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UnPickNum_Desc() { regOBD("UN_PICK_NUM"); return this; }

    protected ConditionValue _unRate;
    public ConditionValue xdfgetUnRate()
    { if (_unRate == null) { _unRate = nCV(); }
      return _unRate; }
    protected ConditionValue xgetCValueUnRate() { return xdfgetUnRate(); }

    /**
     * Add order-by as ascend. <br>
     * UN_RATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UnRate_Asc() { regOBA("UN_RATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_RATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UnRate_Desc() { regOBD("UN_RATE"); return this; }

    protected ConditionValue _shItemCnt;
    public ConditionValue xdfgetShItemCnt()
    { if (_shItemCnt == null) { _shItemCnt = nCV(); }
      return _shItemCnt; }
    protected ConditionValue xgetCValueShItemCnt() { return xdfgetShItemCnt(); }

    /**
     * Add order-by as ascend. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_ShItemCnt_Asc() { regOBA("SH_ITEM_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_ShItemCnt_Desc() { regOBD("SH_ITEM_CNT"); return this; }

    protected ConditionValue _shPickNum;
    public ConditionValue xdfgetShPickNum()
    { if (_shPickNum == null) { _shPickNum = nCV(); }
      return _shPickNum; }
    protected ConditionValue xgetCValueShPickNum() { return xdfgetShPickNum(); }

    /**
     * Add order-by as ascend. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_ShPickNum_Asc() { regOBA("SH_PICK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_ShPickNum_Desc() { regOBD("SH_PICK_NUM"); return this; }

    protected ConditionValue _shRate;
    public ConditionValue xdfgetShRate()
    { if (_shRate == null) { _shRate = nCV(); }
      return _shRate; }
    protected ConditionValue xgetCValueShRate() { return xdfgetShRate(); }

    /**
     * Add order-by as ascend. <br>
     * SH_RATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_ShRate_Asc() { regOBA("SH_RATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_RATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_ShRate_Desc() { regOBD("SH_RATE"); return this; }

    protected ConditionValue _hmItemCnt;
    public ConditionValue xdfgetHmItemCnt()
    { if (_hmItemCnt == null) { _hmItemCnt = nCV(); }
      return _hmItemCnt; }
    protected ConditionValue xgetCValueHmItemCnt() { return xdfgetHmItemCnt(); }

    /**
     * Add order-by as ascend. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_HmItemCnt_Asc() { regOBA("HM_ITEM_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_HmItemCnt_Desc() { regOBD("HM_ITEM_CNT"); return this; }

    protected ConditionValue _hmPickNum;
    public ConditionValue xdfgetHmPickNum()
    { if (_hmPickNum == null) { _hmPickNum = nCV(); }
      return _hmPickNum; }
    protected ConditionValue xgetCValueHmPickNum() { return xdfgetHmPickNum(); }

    /**
     * Add order-by as ascend. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_HmPickNum_Asc() { regOBA("HM_PICK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_HmPickNum_Desc() { regOBD("HM_PICK_NUM"); return this; }

    protected ConditionValue _hmRate;
    public ConditionValue xdfgetHmRate()
    { if (_hmRate == null) { _hmRate = nCV(); }
      return _hmRate; }
    protected ConditionValue xgetCValueHmRate() { return xdfgetHmRate(); }

    /**
     * Add order-by as ascend. <br>
     * HM_RATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_HmRate_Asc() { regOBA("HM_RATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * HM_RATE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_HmRate_Desc() { regOBD("HM_RATE"); return this; }

    protected ConditionValue _totalItemCnt;
    public ConditionValue xdfgetTotalItemCnt()
    { if (_totalItemCnt == null) { _totalItemCnt = nCV(); }
      return _totalItemCnt; }
    protected ConditionValue xgetCValueTotalItemCnt() { return xdfgetTotalItemCnt(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_TotalItemCnt_Asc() { regOBA("TOTAL_ITEM_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_TotalItemCnt_Desc() { regOBD("TOTAL_ITEM_CNT"); return this; }

    protected ConditionValue _totalPickNum;
    public ConditionValue xdfgetTotalPickNum()
    { if (_totalPickNum == null) { _totalPickNum = nCV(); }
      return _totalPickNum; }
    protected ConditionValue xgetCValueTotalPickNum() { return xdfgetTotalPickNum(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_TotalPickNum_Asc() { regOBA("TOTAL_PICK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_TotalPickNum_Desc() { regOBD("TOTAL_PICK_NUM"); return this; }

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
    public BsTBldl5050CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl5050CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl5050CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl5050CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl5050CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl5050CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl5050CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl5050CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl5050CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5050CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl5050CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl5050CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl5050CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl5050CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl5050CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl5050CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl5050CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl5050CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl5050CQ> _myselfExistsMap;
    public Map<String, TBldl5050CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl5050CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl5050CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl5050CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl5050CB.class.getName(); }
    protected String xCQ() { return TBldl5050CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
