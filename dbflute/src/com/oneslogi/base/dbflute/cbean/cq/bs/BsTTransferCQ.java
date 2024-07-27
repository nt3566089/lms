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
 * The base condition-query of t_transfer.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTransferCQ extends AbstractBsTTransferCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTransferCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTransferCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_transfer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTransferCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTransferCIQ xcreateCIQ() {
        TTransferCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTransferCIQ xnewCIQ() {
        return new TTransferCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_transfer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTransferCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTransferCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _transferId;
    public ConditionValue xdfgetTransferId()
    { if (_transferId == null) { _transferId = nCV(); }
      return _transferId; }
    protected ConditionValue xgetCValueTransferId() { return xdfgetTransferId(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_TransferId_Asc() { regOBA("TRANSFER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_TransferId_Desc() { regOBD("TRANSFER_ID"); return this; }

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
    public BsTTransferCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _stockTransferDt;
    public ConditionValue xdfgetStockTransferDt()
    { if (_stockTransferDt == null) { _stockTransferDt = nCV(); }
      return _stockTransferDt; }
    protected ConditionValue xgetCValueStockTransferDt() { return xdfgetStockTransferDt(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_StockTransferDt_Asc() { regOBA("STOCK_TRANSFER_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_StockTransferDt_Desc() { regOBD("STOCK_TRANSFER_DT"); return this; }

    protected ConditionValue _receivePlantCd;
    public ConditionValue xdfgetReceivePlantCd()
    { if (_receivePlantCd == null) { _receivePlantCd = nCV(); }
      return _receivePlantCd; }
    protected ConditionValue xgetCValueReceivePlantCd() { return xdfgetReceivePlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ReceivePlantCd_Asc() { regOBA("RECEIVE_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ReceivePlantCd_Desc() { regOBD("RECEIVE_PLANT_CD"); return this; }

    protected ConditionValue _receiveStorageSpaceCd;
    public ConditionValue xdfgetReceiveStorageSpaceCd()
    { if (_receiveStorageSpaceCd == null) { _receiveStorageSpaceCd = nCV(); }
      return _receiveStorageSpaceCd; }
    protected ConditionValue xgetCValueReceiveStorageSpaceCd() { return xdfgetReceiveStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ReceiveStorageSpaceCd_Asc() { regOBA("RECEIVE_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ReceiveStorageSpaceCd_Desc() { regOBD("RECEIVE_STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _shippingPlantCd;
    public ConditionValue xdfgetShippingPlantCd()
    { if (_shippingPlantCd == null) { _shippingPlantCd = nCV(); }
      return _shippingPlantCd; }
    protected ConditionValue xgetCValueShippingPlantCd() { return xdfgetShippingPlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

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
    public BsTTransferCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _transferTypeCd;
    public ConditionValue xdfgetTransferTypeCd()
    { if (_transferTypeCd == null) { _transferTypeCd = nCV(); }
      return _transferTypeCd; }
    protected ConditionValue xgetCValueTransferTypeCd() { return xdfgetTransferTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_TransferTypeCd_Asc() { regOBA("TRANSFER_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_TransferTypeCd_Desc() { regOBD("TRANSFER_TYPE_CD"); return this; }

    protected ConditionValue _num;
    public ConditionValue xdfgetNum()
    { if (_num == null) { _num = nCV(); }
      return _num; }
    protected ConditionValue xgetCValueNum() { return xdfgetNum(); }

    /**
     * Add order-by as ascend. <br>
     * NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_Num_Asc() { regOBA("NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_Num_Desc() { regOBD("NUM"); return this; }

    protected ConditionValue _hinmokuGroup;
    public ConditionValue xdfgetHinmokuGroup()
    { if (_hinmokuGroup == null) { _hinmokuGroup = nCV(); }
      return _hinmokuGroup; }
    protected ConditionValue xgetCValueHinmokuGroup() { return xdfgetHinmokuGroup(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_HinmokuGroup_Asc() { regOBA("HINMOKU_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_HinmokuGroup_Desc() { regOBD("HINMOKU_GROUP"); return this; }

    protected ConditionValue _janCd;
    public ConditionValue xdfgetJanCd()
    { if (_janCd == null) { _janCd = nCV(); }
      return _janCd; }
    protected ConditionValue xgetCValueJanCd() { return xdfgetJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _s4SendFlg;
    public ConditionValue xdfgetS4SendFlg()
    { if (_s4SendFlg == null) { _s4SendFlg = nCV(); }
      return _s4SendFlg; }
    protected ConditionValue xgetCValueS4SendFlg() { return xdfgetS4SendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_S4SendFlg_Asc() { regOBA("S4_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_S4SendFlg_Desc() { regOBD("S4_SEND_FLG"); return this; }

    protected ConditionValue _locationCd1;
    public ConditionValue xdfgetLocationCd1()
    { if (_locationCd1 == null) { _locationCd1 = nCV(); }
      return _locationCd1; }
    protected ConditionValue xgetCValueLocationCd1() { return xdfgetLocationCd1(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_LocationCd1_Asc() { regOBA("LOCATION_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_LocationCd1_Desc() { regOBD("LOCATION_CD1"); return this; }

    protected ConditionValue _locationCd2;
    public ConditionValue xdfgetLocationCd2()
    { if (_locationCd2 == null) { _locationCd2 = nCV(); }
      return _locationCd2; }
    protected ConditionValue xgetCValueLocationCd2() { return xdfgetLocationCd2(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_LocationCd2_Asc() { regOBA("LOCATION_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_LocationCd2_Desc() { regOBD("LOCATION_CD2"); return this; }

    protected ConditionValue _userCd;
    public ConditionValue xdfgetUserCd()
    { if (_userCd == null) { _userCd = nCV(); }
      return _userCd; }
    protected ConditionValue xgetCValueUserCd() { return xdfgetUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_UserCd_Asc() { regOBA("USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_UserCd_Desc() { regOBD("USER_CD"); return this; }

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
    public BsTTransferCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTransferCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTransferCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTransferCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTransferCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTransferCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTransferCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTransferCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTransferCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTTransferCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTransferCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTransferCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTransferCQ bq = (TTransferCQ)bqs;
        TTransferCQ uq = (TTransferCQ)uqs;
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
        String nrp = xresolveNRP("t_transfer", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TTransferCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTransferCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTransferCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTransferCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTransferCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTransferCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTransferCQ> _myselfExistsMap;
    public Map<String, TTransferCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTransferCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTransferCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTransferCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTransferCB.class.getName(); }
    protected String xCQ() { return TTransferCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
