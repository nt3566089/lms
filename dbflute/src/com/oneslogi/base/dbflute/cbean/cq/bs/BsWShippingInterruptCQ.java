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
 * The base condition-query of w_shipping_interrupt.
 * @author DBFlute(AutoGenerator)
 */
public class BsWShippingInterruptCQ extends AbstractBsWShippingInterruptCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WShippingInterruptCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWShippingInterruptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from w_shipping_interrupt) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WShippingInterruptCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WShippingInterruptCIQ xcreateCIQ() {
        WShippingInterruptCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WShippingInterruptCIQ xnewCIQ() {
        return new WShippingInterruptCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join w_shipping_interrupt on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WShippingInterruptCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WShippingInterruptCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

    protected ConditionValue _allocInstHId;
    public ConditionValue xdfgetAllocInstHId()
    { if (_allocInstHId == null) { _allocInstHId = nCV(); }
      return _allocInstHId; }
    protected ConditionValue xgetCValueAllocInstHId() { return xdfgetAllocInstHId(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_AllocInstHId_Asc() { regOBA("ALLOC_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_AllocInstHId_Desc() { regOBD("ALLOC_INST_H_ID"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _userCd;
    public ConditionValue xdfgetUserCd()
    { if (_userCd == null) { _userCd = nCV(); }
      return _userCd; }
    protected ConditionValue xgetCValueUserCd() { return xdfgetUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * USER_CD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_UserCd_Asc() { regOBA("USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_CD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_UserCd_Desc() { regOBD("USER_CD"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, MProductCQ> getProductId_InScopeRelation_MProduct() { return xgetSQueMap("productId_InScopeRelation_MProduct"); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_InScopeRelation_MProduct", sq); }

    public Map<String, MProductCQ> getProductId_NotInScopeRelation_MProduct() { return xgetSQueMap("productId_NotInScopeRelation_MProduct"); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_MProduct", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _instNum;
    public ConditionValue xdfgetInstNum()
    { if (_instNum == null) { _instNum = nCV(); }
      return _instNum; }
    protected ConditionValue xgetCValueInstNum() { return xdfgetInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

    protected ConditionValue _spgQtyOns;
    public ConditionValue xdfgetSpgQtyOns()
    { if (_spgQtyOns == null) { _spgQtyOns = nCV(); }
      return _spgQtyOns; }
    protected ConditionValue xgetCValueSpgQtyOns() { return xdfgetSpgQtyOns(); }

    /**
     * Add order-by as ascend. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_SpgQtyOns_Asc() { regOBA("SPG_QTY_ONS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_SpgQtyOns_Desc() { regOBD("SPG_QTY_ONS"); return this; }

    protected ConditionValue _spgQtyRemain;
    public ConditionValue xdfgetSpgQtyRemain()
    { if (_spgQtyRemain == null) { _spgQtyRemain = nCV(); }
      return _spgQtyRemain; }
    protected ConditionValue xgetCValueSpgQtyRemain() { return xdfgetSpgQtyRemain(); }

    /**
     * Add order-by as ascend. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_SpgQtyRemain_Asc() { regOBA("SPG_QTY_REMAIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_SpgQtyRemain_Desc() { regOBD("SPG_QTY_REMAIN"); return this; }

    protected ConditionValue _pieceNo;
    public ConditionValue xdfgetPieceNo()
    { if (_pieceNo == null) { _pieceNo = nCV(); }
      return _pieceNo; }
    protected ConditionValue xgetCValuePieceNo() { return xdfgetPieceNo(); }

    /**
     * Add order-by as ascend. <br>
     * PIECE_NO: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_PieceNo_Asc() { regOBA("PIECE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIECE_NO: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_PieceNo_Desc() { regOBD("PIECE_NO"); return this; }

    protected ConditionValue _boxId;
    public ConditionValue xdfgetBoxId()
    { if (_boxId == null) { _boxId = nCV(); }
      return _boxId; }
    protected ConditionValue xgetCValueBoxId() { return xdfgetBoxId(); }

    public Map<String, MBoxCQ> getBoxId_InScopeRelation_MBox() { return xgetSQueMap("boxId_InScopeRelation_MBox"); }
    public String keepBoxId_InScopeRelation_MBox(MBoxCQ sq) { return xkeepSQue("boxId_InScopeRelation_MBox", sq); }

    public Map<String, MBoxCQ> getBoxId_NotInScopeRelation_MBox() { return xgetSQueMap("boxId_NotInScopeRelation_MBox"); }
    public String keepBoxId_NotInScopeRelation_MBox(MBoxCQ sq) { return xkeepSQue("boxId_NotInScopeRelation_MBox", sq); }

    /**
     * Add order-by as ascend. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_BoxId_Asc() { regOBA("BOX_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_BoxId_Desc() { regOBD("BOX_ID"); return this; }

    protected ConditionValue _pickingWorkNo;
    public ConditionValue xdfgetPickingWorkNo()
    { if (_pickingWorkNo == null) { _pickingWorkNo = nCV(); }
      return _pickingWorkNo; }
    protected ConditionValue xgetCValuePickingWorkNo() { return xdfgetPickingWorkNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_PickingWorkNo_Asc() { regOBA("PICKING_WORK_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_PickingWorkNo_Desc() { regOBD("PICKING_WORK_NO"); return this; }

    protected ConditionValue _nizoroeNo;
    public ConditionValue xdfgetNizoroeNo()
    { if (_nizoroeNo == null) { _nizoroeNo = nCV(); }
      return _nizoroeNo; }
    protected ConditionValue xgetCValueNizoroeNo() { return xdfgetNizoroeNo(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_NizoroeNo_Asc() { regOBA("NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_NizoroeNo_Desc() { regOBD("NIZOROE_NO"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_DaihyoNizoroeNo_Asc() { regOBA("DAIHYO_NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_DaihyoNizoroeNo_Desc() { regOBD("DAIHYO_NIZOROE_NO"); return this; }

    protected ConditionValue _nizoroeNo2;
    public ConditionValue xdfgetNizoroeNo2()
    { if (_nizoroeNo2 == null) { _nizoroeNo2 = nCV(); }
      return _nizoroeNo2; }
    protected ConditionValue xgetCValueNizoroeNo2() { return xdfgetNizoroeNo2(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_NizoroeNo2_Asc() { regOBA("NIZOROE_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_NizoroeNo2_Desc() { regOBD("NIZOROE_NO2"); return this; }

    protected ConditionValue _daihyoNizoroeNo2;
    public ConditionValue xdfgetDaihyoNizoroeNo2()
    { if (_daihyoNizoroeNo2 == null) { _daihyoNizoroeNo2 = nCV(); }
      return _daihyoNizoroeNo2; }
    protected ConditionValue xgetCValueDaihyoNizoroeNo2() { return xdfgetDaihyoNizoroeNo2(); }

    /**
     * Add order-by as ascend. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_DaihyoNizoroeNo2_Asc() { regOBA("DAIHYO_NIZOROE_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_DaihyoNizoroeNo2_Desc() { regOBD("DAIHYO_NIZOROE_NO2"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _prodDt;
    public ConditionValue xdfgetProdDt()
    { if (_prodDt == null) { _prodDt = nCV(); }
      return _prodDt; }
    protected ConditionValue xgetCValueProdDt() { return xdfgetProdDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_ProdDt_Asc() { regOBA("PROD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_ProdDt_Desc() { regOBD("PROD_DT"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWShippingInterruptCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWShippingInterruptCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWShippingInterruptCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWShippingInterruptCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WShippingInterruptCQ bq = (WShippingInterruptCQ)bqs;
        WShippingInterruptCQ uq = (WShippingInterruptCQ)uqs;
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMBox()) {
            uq.queryMBox().reflectRelationOnUnionQuery(bq.queryMBox(), uq.queryMBox());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProduct() {
        return xdfgetConditionQueryMProduct();
    }
    public MProductCQ xdfgetConditionQueryMProduct() {
        String prop = "mProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProduct()); xsetupOuterJoinMProduct(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProduct() {
        String nrp = xresolveNRP("w_shipping_interrupt", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

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
        String nrp = xresolveNRP("w_shipping_interrupt", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("w_shipping_interrupt", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_box by my BOX_ID, named 'MBox'.
     * @return The instance of condition-query. (NotNull)
     */
    public MBoxCQ queryMBox() {
        return xdfgetConditionQueryMBox();
    }
    public MBoxCQ xdfgetConditionQueryMBox() {
        String prop = "mBox";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMBox()); xsetupOuterJoinMBox(); }
        return xgetQueRlMap(prop);
    }
    protected MBoxCQ xcreateQueryMBox() {
        String nrp = xresolveNRP("w_shipping_interrupt", "mBox"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MBoxCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mBox", nrp);
    }
    protected void xsetupOuterJoinMBox() { xregOutJo("mBox"); }
    public boolean hasConditionQueryMBox() { return xhasQueRlMap("mBox"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WShippingInterruptCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WShippingInterruptCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WShippingInterruptCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WShippingInterruptCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WShippingInterruptCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WShippingInterruptCQ> _myselfExistsMap;
    public Map<String, WShippingInterruptCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WShippingInterruptCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WShippingInterruptCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WShippingInterruptCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WShippingInterruptCB.class.getName(); }
    protected String xCQ() { return WShippingInterruptCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}