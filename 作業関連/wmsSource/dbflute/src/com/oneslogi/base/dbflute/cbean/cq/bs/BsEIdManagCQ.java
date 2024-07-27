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
 * The base condition-query of e_id_manag.
 * @author DBFlute(AutoGenerator)
 */
public class BsEIdManagCQ extends AbstractBsEIdManagCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EIdManagCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEIdManagCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from e_id_manag) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EIdManagCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EIdManagCIQ xcreateCIQ() {
        EIdManagCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EIdManagCIQ xnewCIQ() {
        return new EIdManagCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join e_id_manag on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EIdManagCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EIdManagCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _idManagId;
    public ConditionValue xdfgetIdManagId()
    { if (_idManagId == null) { _idManagId = nCV(); }
      return _idManagId; }
    protected ConditionValue xgetCValueIdManagId() { return xdfgetIdManagId(); }

    /**
     * Add order-by as ascend. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_IdManagId_Asc() { regOBA("ID_MANAG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID_MANAG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_IdManagId_Desc() { regOBD("ID_MANAG_ID"); return this; }

    protected ConditionValue _sendFlg;
    public ConditionValue xdfgetSendFlg()
    { if (_sendFlg == null) { _sendFlg = nCV(); }
      return _sendFlg; }
    protected ConditionValue xgetCValueSendFlg() { return xdfgetSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SendFlg_Asc() { regOBA("SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SendFlg_Desc() { regOBD("SEND_FLG"); return this; }

    protected ConditionValue _idManagNo;
    public ConditionValue xdfgetIdManagNo()
    { if (_idManagNo == null) { _idManagNo = nCV(); }
      return _idManagNo; }
    protected ConditionValue xgetCValueIdManagNo() { return xdfgetIdManagNo(); }

    /**
     * Add order-by as ascend. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_IdManagNo_Asc() { regOBA("ID_MANAG_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID_MANAG_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_IdManagNo_Desc() { regOBD("ID_MANAG_NO"); return this; }

    protected ConditionValue _tenhanshaCd;
    public ConditionValue xdfgetTenhanshaCd()
    { if (_tenhanshaCd == null) { _tenhanshaCd = nCV(); }
      return _tenhanshaCd; }
    protected ConditionValue xgetCValueTenhanshaCd() { return xdfgetTenhanshaCd(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

    protected ConditionValue _salesOrgCd;
    public ConditionValue xdfgetSalesOrgCd()
    { if (_salesOrgCd == null) { _salesOrgCd = nCV(); }
      return _salesOrgCd; }
    protected ConditionValue xgetCValueSalesOrgCd() { return xdfgetSalesOrgCd(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

    protected ConditionValue _customerCd;
    public ConditionValue xdfgetCustomerCd()
    { if (_customerCd == null) { _customerCd = nCV(); }
      return _customerCd; }
    protected ConditionValue xgetCValueCustomerCd() { return xdfgetCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _hinmokuCd;
    public ConditionValue xdfgetHinmokuCd()
    { if (_hinmokuCd == null) { _hinmokuCd = nCV(); }
      return _hinmokuCd; }
    protected ConditionValue xgetCValueHinmokuCd() { return xdfgetHinmokuCd(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

    protected ConditionValue _hinmokuText;
    public ConditionValue xdfgetHinmokuText()
    { if (_hinmokuText == null) { _hinmokuText = nCV(); }
      return _hinmokuText; }
    protected ConditionValue xgetCValueHinmokuText() { return xdfgetHinmokuText(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_HinmokuText_Asc() { regOBA("HINMOKU_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_HinmokuText_Desc() { regOBD("HINMOKU_TEXT"); return this; }

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
    public BsEIdManagCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _unitNm;
    public ConditionValue xdfgetUnitNm()
    { if (_unitNm == null) { _unitNm = nCV(); }
      return _unitNm; }
    protected ConditionValue xgetCValueUnitNm() { return xdfgetUnitNm(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _sharedProductTypeCd;
    public ConditionValue xdfgetSharedProductTypeCd()
    { if (_sharedProductTypeCd == null) { _sharedProductTypeCd = nCV(); }
      return _sharedProductTypeCd; }
    protected ConditionValue xgetCValueSharedProductTypeCd() { return xdfgetSharedProductTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SharedProductTypeCd_Asc() { regOBA("SHARED_PRODUCT_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SharedProductTypeCd_Desc() { regOBD("SHARED_PRODUCT_TYPE_CD"); return this; }

    protected ConditionValue _customerOrderNo;
    public ConditionValue xdfgetCustomerOrderNo()
    { if (_customerOrderNo == null) { _customerOrderNo = nCV(); }
      return _customerOrderNo; }
    protected ConditionValue xgetCValueCustomerOrderNo() { return xdfgetCustomerOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_CustomerOrderNo_Asc() { regOBA("CUSTOMER_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_CustomerOrderNo_Desc() { regOBD("CUSTOMER_ORDER_NO"); return this; }

    protected ConditionValue _delivCd;
    public ConditionValue xdfgetDelivCd()
    { if (_delivCd == null) { _delivCd = nCV(); }
      return _delivCd; }
    protected ConditionValue xgetCValueDelivCd() { return xdfgetDelivCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DelivCd_Asc() { regOBA("DELIV_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DelivCd_Desc() { regOBD("DELIV_CD"); return this; }

    protected ConditionValue _destinationZipCd;
    public ConditionValue xdfgetDestinationZipCd()
    { if (_destinationZipCd == null) { _destinationZipCd = nCV(); }
      return _destinationZipCd; }
    protected ConditionValue xgetCValueDestinationZipCd() { return xdfgetDestinationZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationZipCd_Asc() { regOBA("DESTINATION_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationZipCd_Desc() { regOBD("DESTINATION_ZIP_CD"); return this; }

    protected ConditionValue _destinationAddress1;
    public ConditionValue xdfgetDestinationAddress1()
    { if (_destinationAddress1 == null) { _destinationAddress1 = nCV(); }
      return _destinationAddress1; }
    protected ConditionValue xgetCValueDestinationAddress1() { return xdfgetDestinationAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationAddress1_Asc() { regOBA("DESTINATION_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationAddress1_Desc() { regOBD("DESTINATION_ADDRESS1"); return this; }

    protected ConditionValue _destinationAddress2;
    public ConditionValue xdfgetDestinationAddress2()
    { if (_destinationAddress2 == null) { _destinationAddress2 = nCV(); }
      return _destinationAddress2; }
    protected ConditionValue xgetCValueDestinationAddress2() { return xdfgetDestinationAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationAddress2_Asc() { regOBA("DESTINATION_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationAddress2_Desc() { regOBD("DESTINATION_ADDRESS2"); return this; }

    protected ConditionValue _destinationNm1;
    public ConditionValue xdfgetDestinationNm1()
    { if (_destinationNm1 == null) { _destinationNm1 = nCV(); }
      return _destinationNm1; }
    protected ConditionValue xgetCValueDestinationNm1() { return xdfgetDestinationNm1(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationNm1_Asc() { regOBA("DESTINATION_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationNm1_Desc() { regOBD("DESTINATION_NM1"); return this; }

    protected ConditionValue _destinationNm2;
    public ConditionValue xdfgetDestinationNm2()
    { if (_destinationNm2 == null) { _destinationNm2 = nCV(); }
      return _destinationNm2; }
    protected ConditionValue xgetCValueDestinationNm2() { return xdfgetDestinationNm2(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationNm2_Asc() { regOBA("DESTINATION_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationNm2_Desc() { regOBD("DESTINATION_NM2"); return this; }

    protected ConditionValue _destinationTel;
    public ConditionValue xdfgetDestinationTel()
    { if (_destinationTel == null) { _destinationTel = nCV(); }
      return _destinationTel; }
    protected ConditionValue xgetCValueDestinationTel() { return xdfgetDestinationTel(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationTel_Asc() { regOBA("DESTINATION_TEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DestinationTel_Desc() { regOBD("DESTINATION_TEL"); return this; }

    protected ConditionValue _empIdCd;
    public ConditionValue xdfgetEmpIdCd()
    { if (_empIdCd == null) { _empIdCd = nCV(); }
      return _empIdCd; }
    protected ConditionValue xgetCValueEmpIdCd() { return xdfgetEmpIdCd(); }

    /**
     * Add order-by as ascend. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_EmpIdCd_Asc() { regOBA("EMP_ID_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_EmpIdCd_Desc() { regOBD("EMP_ID_CD"); return this; }

    protected ConditionValue _empNm;
    public ConditionValue xdfgetEmpNm()
    { if (_empNm == null) { _empNm = nCV(); }
      return _empNm; }
    protected ConditionValue xgetCValueEmpNm() { return xdfgetEmpNm(); }

    /**
     * Add order-by as ascend. <br>
     * EMP_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_EmpNm_Asc() { regOBA("EMP_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMP_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_EmpNm_Desc() { regOBD("EMP_NM"); return this; }

    protected ConditionValue _storeDt;
    public ConditionValue xdfgetStoreDt()
    { if (_storeDt == null) { _storeDt = nCV(); }
      return _storeDt; }
    protected ConditionValue xgetCValueStoreDt() { return xdfgetStoreDt(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

    protected ConditionValue _inventoryDt;
    public ConditionValue xdfgetInventoryDt()
    { if (_inventoryDt == null) { _inventoryDt = nCV(); }
      return _inventoryDt; }
    protected ConditionValue xgetCValueInventoryDt() { return xdfgetInventoryDt(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_InventoryDt_Asc() { regOBA("INVENTORY_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_InventoryDt_Desc() { regOBD("INVENTORY_DT"); return this; }

    protected ConditionValue _pickingDt;
    public ConditionValue xdfgetPickingDt()
    { if (_pickingDt == null) { _pickingDt = nCV(); }
      return _pickingDt; }
    protected ConditionValue xgetCValuePickingDt() { return xdfgetPickingDt(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_PickingDt_Asc() { regOBA("PICKING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_PickingDt_Desc() { regOBD("PICKING_DT"); return this; }

    protected ConditionValue _productReturnDt;
    public ConditionValue xdfgetProductReturnDt()
    { if (_productReturnDt == null) { _productReturnDt = nCV(); }
      return _productReturnDt; }
    protected ConditionValue xgetCValueProductReturnDt() { return xdfgetProductReturnDt(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_ProductReturnDt_Asc() { regOBA("PRODUCT_RETURN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_ProductReturnDt_Desc() { regOBD("PRODUCT_RETURN_DT"); return this; }

    protected ConditionValue _wasteReturnDt;
    public ConditionValue xdfgetWasteReturnDt()
    { if (_wasteReturnDt == null) { _wasteReturnDt = nCV(); }
      return _wasteReturnDt; }
    protected ConditionValue xgetCValueWasteReturnDt() { return xdfgetWasteReturnDt(); }

    /**
     * Add order-by as ascend. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WasteReturnDt_Asc() { regOBA("WASTE_RETURN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WASTE_RETURN_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WasteReturnDt_Desc() { regOBD("WASTE_RETURN_DT"); return this; }

    protected ConditionValue _idManagAbolitionTypeCd;
    public ConditionValue xdfgetIdManagAbolitionTypeCd()
    { if (_idManagAbolitionTypeCd == null) { _idManagAbolitionTypeCd = nCV(); }
      return _idManagAbolitionTypeCd; }
    protected ConditionValue xgetCValueIdManagAbolitionTypeCd() { return xdfgetIdManagAbolitionTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_IdManagAbolitionTypeCd_Asc() { regOBA("ID_MANAG_ABOLITION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_IdManagAbolitionTypeCd_Desc() { regOBD("ID_MANAG_ABOLITION_TYPE_CD"); return this; }

    protected ConditionValue _spareTypeCd;
    public ConditionValue xdfgetSpareTypeCd()
    { if (_spareTypeCd == null) { _spareTypeCd = nCV(); }
      return _spareTypeCd; }
    protected ConditionValue xgetCValueSpareTypeCd() { return xdfgetSpareTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SpareTypeCd_Asc() { regOBA("SPARE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SpareTypeCd_Desc() { regOBD("SPARE_TYPE_CD"); return this; }

    protected ConditionValue _dataExtFlgPicking;
    public ConditionValue xdfgetDataExtFlgPicking()
    { if (_dataExtFlgPicking == null) { _dataExtFlgPicking = nCV(); }
      return _dataExtFlgPicking; }
    protected ConditionValue xgetCValueDataExtFlgPicking() { return xdfgetDataExtFlgPicking(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataExtFlgPicking_Asc() { regOBA("DATA_EXT_FLG_PICKING"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataExtFlgPicking_Desc() { regOBD("DATA_EXT_FLG_PICKING"); return this; }

    protected ConditionValue _dataAddDtPicking;
    public ConditionValue xdfgetDataAddDtPicking()
    { if (_dataAddDtPicking == null) { _dataAddDtPicking = nCV(); }
      return _dataAddDtPicking; }
    protected ConditionValue xgetCValueDataAddDtPicking() { return xdfgetDataAddDtPicking(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataAddDtPicking_Asc() { regOBA("DATA_ADD_DT_PICKING"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataAddDtPicking_Desc() { regOBD("DATA_ADD_DT_PICKING"); return this; }

    protected ConditionValue _dataExtFlgReturn;
    public ConditionValue xdfgetDataExtFlgReturn()
    { if (_dataExtFlgReturn == null) { _dataExtFlgReturn = nCV(); }
      return _dataExtFlgReturn; }
    protected ConditionValue xgetCValueDataExtFlgReturn() { return xdfgetDataExtFlgReturn(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataExtFlgReturn_Asc() { regOBA("DATA_EXT_FLG_RETURN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataExtFlgReturn_Desc() { regOBD("DATA_EXT_FLG_RETURN"); return this; }

    protected ConditionValue _dataAddDtReturn;
    public ConditionValue xdfgetDataAddDtReturn()
    { if (_dataAddDtReturn == null) { _dataAddDtReturn = nCV(); }
      return _dataAddDtReturn; }
    protected ConditionValue xgetCValueDataAddDtReturn() { return xdfgetDataAddDtReturn(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataAddDtReturn_Asc() { regOBA("DATA_ADD_DT_RETURN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataAddDtReturn_Desc() { regOBD("DATA_ADD_DT_RETURN"); return this; }

    protected ConditionValue _dataExtFlgWaste;
    public ConditionValue xdfgetDataExtFlgWaste()
    { if (_dataExtFlgWaste == null) { _dataExtFlgWaste = nCV(); }
      return _dataExtFlgWaste; }
    protected ConditionValue xgetCValueDataExtFlgWaste() { return xdfgetDataExtFlgWaste(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataExtFlgWaste_Asc() { regOBA("DATA_EXT_FLG_WASTE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataExtFlgWaste_Desc() { regOBD("DATA_EXT_FLG_WASTE"); return this; }

    protected ConditionValue _dataAddDtWaste;
    public ConditionValue xdfgetDataAddDtWaste()
    { if (_dataAddDtWaste == null) { _dataAddDtWaste = nCV(); }
      return _dataAddDtWaste; }
    protected ConditionValue xgetCValueDataAddDtWaste() { return xdfgetDataAddDtWaste(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataAddDtWaste_Asc() { regOBA("DATA_ADD_DT_WASTE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DataAddDtWaste_Desc() { regOBD("DATA_ADD_DT_WASTE"); return this; }

    protected ConditionValue _spareStr;
    public ConditionValue xdfgetSpareStr()
    { if (_spareStr == null) { _spareStr = nCV(); }
      return _spareStr; }
    protected ConditionValue xgetCValueSpareStr() { return xdfgetSpareStr(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

    protected ConditionValue _wmsAddYyyy;
    public ConditionValue xdfgetWmsAddYyyy()
    { if (_wmsAddYyyy == null) { _wmsAddYyyy = nCV(); }
      return _wmsAddYyyy; }
    protected ConditionValue xgetCValueWmsAddYyyy() { return xdfgetWmsAddYyyy(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddYyyy_Asc() { regOBA("WMS_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddYyyy_Desc() { regOBD("WMS_ADD_YYYY"); return this; }

    protected ConditionValue _wmsAddMm;
    public ConditionValue xdfgetWmsAddMm()
    { if (_wmsAddMm == null) { _wmsAddMm = nCV(); }
      return _wmsAddMm; }
    protected ConditionValue xgetCValueWmsAddMm() { return xdfgetWmsAddMm(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddMm_Asc() { regOBA("WMS_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddMm_Desc() { regOBD("WMS_ADD_MM"); return this; }

    protected ConditionValue _wmsAddDd;
    public ConditionValue xdfgetWmsAddDd()
    { if (_wmsAddDd == null) { _wmsAddDd = nCV(); }
      return _wmsAddDd; }
    protected ConditionValue xgetCValueWmsAddDd() { return xdfgetWmsAddDd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddDd_Asc() { regOBA("WMS_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddDd_Desc() { regOBD("WMS_ADD_DD"); return this; }

    protected ConditionValue _wmsAddHh;
    public ConditionValue xdfgetWmsAddHh()
    { if (_wmsAddHh == null) { _wmsAddHh = nCV(); }
      return _wmsAddHh; }
    protected ConditionValue xgetCValueWmsAddHh() { return xdfgetWmsAddHh(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddHh_Asc() { regOBA("WMS_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddHh_Desc() { regOBD("WMS_ADD_HH"); return this; }

    protected ConditionValue _wmsAddMi;
    public ConditionValue xdfgetWmsAddMi()
    { if (_wmsAddMi == null) { _wmsAddMi = nCV(); }
      return _wmsAddMi; }
    protected ConditionValue xgetCValueWmsAddMi() { return xdfgetWmsAddMi(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddMi_Asc() { regOBA("WMS_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddMi_Desc() { regOBD("WMS_ADD_MI"); return this; }

    protected ConditionValue _wmsAddSs;
    public ConditionValue xdfgetWmsAddSs()
    { if (_wmsAddSs == null) { _wmsAddSs = nCV(); }
      return _wmsAddSs; }
    protected ConditionValue xgetCValueWmsAddSs() { return xdfgetWmsAddSs(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddSs_Asc() { regOBA("WMS_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddSs_Desc() { regOBD("WMS_ADD_SS"); return this; }

    protected ConditionValue _wmsAddUserCd;
    public ConditionValue xdfgetWmsAddUserCd()
    { if (_wmsAddUserCd == null) { _wmsAddUserCd = nCV(); }
      return _wmsAddUserCd; }
    protected ConditionValue xgetCValueWmsAddUserCd() { return xdfgetWmsAddUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddUserCd_Asc() { regOBA("WMS_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsAddUserCd_Desc() { regOBD("WMS_ADD_USER_CD"); return this; }

    protected ConditionValue _wmsUpdYyyy;
    public ConditionValue xdfgetWmsUpdYyyy()
    { if (_wmsUpdYyyy == null) { _wmsUpdYyyy = nCV(); }
      return _wmsUpdYyyy; }
    protected ConditionValue xgetCValueWmsUpdYyyy() { return xdfgetWmsUpdYyyy(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdYyyy_Asc() { regOBA("WMS_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdYyyy_Desc() { regOBD("WMS_UPD_YYYY"); return this; }

    protected ConditionValue _wmsUpdMm;
    public ConditionValue xdfgetWmsUpdMm()
    { if (_wmsUpdMm == null) { _wmsUpdMm = nCV(); }
      return _wmsUpdMm; }
    protected ConditionValue xgetCValueWmsUpdMm() { return xdfgetWmsUpdMm(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdMm_Asc() { regOBA("WMS_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdMm_Desc() { regOBD("WMS_UPD_MM"); return this; }

    protected ConditionValue _wmsUpdDd;
    public ConditionValue xdfgetWmsUpdDd()
    { if (_wmsUpdDd == null) { _wmsUpdDd = nCV(); }
      return _wmsUpdDd; }
    protected ConditionValue xgetCValueWmsUpdDd() { return xdfgetWmsUpdDd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdDd_Asc() { regOBA("WMS_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdDd_Desc() { regOBD("WMS_UPD_DD"); return this; }

    protected ConditionValue _wmsUpdHh;
    public ConditionValue xdfgetWmsUpdHh()
    { if (_wmsUpdHh == null) { _wmsUpdHh = nCV(); }
      return _wmsUpdHh; }
    protected ConditionValue xgetCValueWmsUpdHh() { return xdfgetWmsUpdHh(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdHh_Asc() { regOBA("WMS_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdHh_Desc() { regOBD("WMS_UPD_HH"); return this; }

    protected ConditionValue _wmsUpdMi;
    public ConditionValue xdfgetWmsUpdMi()
    { if (_wmsUpdMi == null) { _wmsUpdMi = nCV(); }
      return _wmsUpdMi; }
    protected ConditionValue xgetCValueWmsUpdMi() { return xdfgetWmsUpdMi(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdMi_Asc() { regOBA("WMS_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdMi_Desc() { regOBD("WMS_UPD_MI"); return this; }

    protected ConditionValue _wmsUpdSs;
    public ConditionValue xdfgetWmsUpdSs()
    { if (_wmsUpdSs == null) { _wmsUpdSs = nCV(); }
      return _wmsUpdSs; }
    protected ConditionValue xgetCValueWmsUpdSs() { return xdfgetWmsUpdSs(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdSs_Asc() { regOBA("WMS_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdSs_Desc() { regOBD("WMS_UPD_SS"); return this; }

    protected ConditionValue _wmsUpdUserCd;
    public ConditionValue xdfgetWmsUpdUserCd()
    { if (_wmsUpdUserCd == null) { _wmsUpdUserCd = nCV(); }
      return _wmsUpdUserCd; }
    protected ConditionValue xgetCValueWmsUpdUserCd() { return xdfgetWmsUpdUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdUserCd_Asc() { regOBA("WMS_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_WmsUpdUserCd_Desc() { regOBD("WMS_UPD_USER_CD"); return this; }

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
    public BsEIdManagCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEIdManagCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEIdManagCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEIdManagCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEIdManagCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEIdManagCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEIdManagCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEIdManagCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEIdManagCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEIdManagCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEIdManagCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEIdManagCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EIdManagCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EIdManagCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EIdManagCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EIdManagCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EIdManagCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EIdManagCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EIdManagCQ> _myselfExistsMap;
    public Map<String, EIdManagCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EIdManagCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EIdManagCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EIdManagCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EIdManagCB.class.getName(); }
    protected String xCQ() { return EIdManagCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
