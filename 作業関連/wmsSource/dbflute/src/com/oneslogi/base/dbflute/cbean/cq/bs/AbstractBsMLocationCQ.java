package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of m_location.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMLocationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMLocationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "m_location";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from h_location_attribute where ...)} <br>
     * h_location_attribute by LOCATION_ID, named 'HLocationAttributeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHLocationAttributeList</span>(attributeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     attributeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HLocationAttributeList for 'exists'. (NotNull)
     */
    public void existsHLocationAttributeList(SubQuery<HLocationAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HLocationAttributeCB cb = new HLocationAttributeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_HLocationAttributeList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "hLocationAttributeList");
    }
    public abstract String keepLocationId_ExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by LOCATION_ID, named 'MLocationReplenishProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationReplenishProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationReplenishProductList for 'exists'. (NotNull)
     */
    public void existsMLocationReplenishProductList(SubQuery<MLocationReplenishProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_MLocationReplenishProductList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocationReplenishProductList");
    }
    public abstract String keepLocationId_ExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by LOCATION_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstBList for 'exists'. (NotNull)
     */
    public void existsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_TAllocInstBList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tAllocInstBList");
    }
    public abstract String keepLocationId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by LOCATION_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBList for 'exists'. (NotNull)
     */
    public void existsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_TInventoryBList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tInventoryBList");
    }
    public abstract String keepLocationId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by LOCATION_ID, named 'TMoveInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstBList for 'exists'. (NotNull)
     */
    public void existsTMoveInstBList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_TMoveInstBList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tMoveInstBList");
    }
    public abstract String keepLocationId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from t_move_record_b where ...)} <br>
     * t_move_record_b by LOCATION_ID, named 'TMoveRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveRecordBList for 'exists'. (NotNull)
     */
    public void existsTMoveRecordBList(SubQuery<TMoveRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_TMoveRecordBList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tMoveRecordBList");
    }
    public abstract String keepLocationId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PLAN_LOCATION_ID from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by PLAN_LOCATION_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanBList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanBList(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_TReceivePlanBList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "PLAN_LOCATION_ID", pp, "tReceivePlanBList");
    }
    public abstract String keepLocationId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by LOCATION_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstBList for 'exists'. (NotNull)
     */
    public void existsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_TShippingInstBList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tShippingInstBList");
    }
    public abstract String keepLocationId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from t_stock where ...)} <br>
     * t_stock by LOCATION_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockList for 'exists'. (NotNull)
     */
    public void existsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_TStockList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tStockList");
    }
    public abstract String keepLocationId_ExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STORE_LOCATION_ID from t_store_record_b where ...)} <br>
     * t_store_record_b by STORE_LOCATION_ID, named 'TStoreRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordBList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordBList(SubQuery<TStoreRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_TStoreRecordBList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "STORE_LOCATION_ID", pp, "tStoreRecordBList");
    }
    public abstract String keepLocationId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOC_ID from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by LOC_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtInventoryInputProdList for 'exists'. (NotNull)
     */
    public void existsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOC_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepLocationId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from w_ht_picking where ...)} <br>
     * w_ht_picking by LOCATION_ID, named 'WHtPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtPickingList for 'exists'. (NotNull)
     */
    public void existsWHtPickingList(SubQuery<WHtPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_WHtPickingList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtPickingList");
    }
    public abstract String keepLocationId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RCV_LOC_ID from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by RCV_LOC_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveInspectionList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "RCV_LOC_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepLocationId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RCV_LOC_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by RCV_LOC_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveNoPlanInspList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "RCV_LOC_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepLocationId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOC_ID from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by LOC_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveStoreList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_WHtReceiveStoreList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOC_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepLocationId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by LOCATION_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtShippingPickingList for 'exists'. (NotNull)
     */
    public void existsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_WHtShippingPickingList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepLocationId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOCATION_ID from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by LOCATION_ID, named 'WHtTotalPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtTotalPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtTotalPickingList for 'exists'. (NotNull)
     */
    public void existsWHtTotalPickingList(SubQuery<WHtTotalPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_ExistsReferrer_WHtTotalPickingList(cb.query());
        registerExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtTotalPickingList");
    }
    public abstract String keepLocationId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from h_location_attribute where ...)} <br>
     * h_location_attribute by LOCATION_ID, named 'HLocationAttributeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHLocationAttributeList</span>(attributeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     attributeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_HLocationAttributeList for 'not exists'. (NotNull)
     */
    public void notExistsHLocationAttributeList(SubQuery<HLocationAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HLocationAttributeCB cb = new HLocationAttributeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_HLocationAttributeList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "hLocationAttributeList");
    }
    public abstract String keepLocationId_NotExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by LOCATION_ID, named 'MLocationReplenishProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationReplenishProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_MLocationReplenishProductList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationReplenishProductList(SubQuery<MLocationReplenishProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_MLocationReplenishProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocationReplenishProductList");
    }
    public abstract String keepLocationId_NotExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by LOCATION_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_TAllocInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_TAllocInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tAllocInstBList");
    }
    public abstract String keepLocationId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by LOCATION_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_TInventoryBList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_TInventoryBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tInventoryBList");
    }
    public abstract String keepLocationId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by LOCATION_ID, named 'TMoveInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_TMoveInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_TMoveInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tMoveInstBList");
    }
    public abstract String keepLocationId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from t_move_record_b where ...)} <br>
     * t_move_record_b by LOCATION_ID, named 'TMoveRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_TMoveRecordBList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveRecordBList(SubQuery<TMoveRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_TMoveRecordBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tMoveRecordBList");
    }
    public abstract String keepLocationId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PLAN_LOCATION_ID from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by PLAN_LOCATION_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_TReceivePlanBList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanBList(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_TReceivePlanBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "PLAN_LOCATION_ID", pp, "tReceivePlanBList");
    }
    public abstract String keepLocationId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by LOCATION_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_TShippingInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_TShippingInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tShippingInstBList");
    }
    public abstract String keepLocationId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from t_stock where ...)} <br>
     * t_stock by LOCATION_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_TStockList for 'not exists'. (NotNull)
     */
    public void notExistsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_TStockList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tStockList");
    }
    public abstract String keepLocationId_NotExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STORE_LOCATION_ID from t_store_record_b where ...)} <br>
     * t_store_record_b by STORE_LOCATION_ID, named 'TStoreRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_TStoreRecordBList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordBList(SubQuery<TStoreRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_TStoreRecordBList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "STORE_LOCATION_ID", pp, "tStoreRecordBList");
    }
    public abstract String keepLocationId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOC_ID from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by LOC_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOC_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepLocationId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from w_ht_picking where ...)} <br>
     * w_ht_picking by LOCATION_ID, named 'WHtPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_WHtPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtPickingList(SubQuery<WHtPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_WHtPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtPickingList");
    }
    public abstract String keepLocationId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RCV_LOC_ID from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by RCV_LOC_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_WHtReceiveInspectionList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "RCV_LOC_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepLocationId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RCV_LOC_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by RCV_LOC_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_WHtReceiveNoPlanInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "RCV_LOC_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepLocationId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOC_ID from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by LOC_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_WHtReceiveStoreList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_WHtReceiveStoreList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOC_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepLocationId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by LOCATION_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_WHtShippingPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_WHtShippingPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepLocationId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOCATION_ID from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by LOCATION_ID, named 'WHtTotalPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtTotalPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LocationId_NotExistsReferrer_WHtTotalPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtTotalPickingList(SubQuery<WHtTotalPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLocationId_NotExistsReferrer_WHtTotalPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtTotalPickingList");
    }
    public abstract String keepLocationId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    public void xsderiveHLocationAttributeList(String fn, SubQuery<HLocationAttributeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HLocationAttributeCB cb = new HLocationAttributeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_HLocationAttributeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "hLocationAttributeList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq);

    public void xsderiveMLocationReplenishProductList(String fn, SubQuery<MLocationReplenishProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_MLocationReplenishProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocationReplenishProductList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    public void xsderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_TAllocInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tAllocInstBList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);

    public void xsderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_TInventoryBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tInventoryBList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq);

    public void xsderiveTMoveInstBList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_TMoveInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tMoveInstBList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq);

    public void xsderiveTMoveRecordBList(String fn, SubQuery<TMoveRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_TMoveRecordBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tMoveRecordBList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    public void xsderiveTReceivePlanBList(String fn, SubQuery<TReceivePlanBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_TReceivePlanBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "PLAN_LOCATION_ID", pp, "tReceivePlanBList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    public void xsderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_TShippingInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tShippingInstBList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);

    public void xsderiveTStockList(String fn, SubQuery<TStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_TStockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "tStockList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_TStockList(TStockCQ sq);

    public void xsderiveTStoreRecordBList(String fn, SubQuery<TStoreRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_TStoreRecordBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "STORE_LOCATION_ID", pp, "tStoreRecordBList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOC_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtPickingList(String fn, SubQuery<WHtPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_WHtPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtPickingList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq);

    public void xsderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_WHtReceiveInspectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "RCV_LOC_ID", pp, "wHtReceiveInspectionList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    public void xsderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "RCV_LOC_ID", pp, "wHtReceiveNoPlanInspList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_WHtReceiveStoreList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOC_ID", pp, "wHtReceiveStoreList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    public void xsderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_WHtShippingPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtShippingPickingList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    public void xsderiveWHtTotalPickingList(String fn, SubQuery<WHtTotalPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLocationId_SpecifyDerivedReferrer_WHtTotalPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "wHtTotalPickingList", al, op);
    }
    public abstract String keepLocationId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from h_location_attribute where ...)} <br>
     * h_location_attribute by LOCATION_ID, named 'HLocationAttributeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHLocationAttributeList()</span>.<span style="color: #CC4747">max</span>(attributeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     attributeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     attributeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HLocationAttributeCB> derivedHLocationAttributeList() {
        return xcreateQDRFunctionHLocationAttributeList();
    }
    protected HpQDRFunction<HLocationAttributeCB> xcreateQDRFunctionHLocationAttributeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHLocationAttributeList(fn, sq, rd, vl, op));
    }
    public void xqderiveHLocationAttributeList(String fn, SubQuery<HLocationAttributeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HLocationAttributeCB cb = new HLocationAttributeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_HLocationAttributeList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_HLocationAttributeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "hLocationAttributeList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_HLocationAttributeListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by LOCATION_ID, named 'MLocationReplenishProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationReplenishProductList()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationReplenishProductCB> derivedMLocationReplenishProductList() {
        return xcreateQDRFunctionMLocationReplenishProductList();
    }
    protected HpQDRFunction<MLocationReplenishProductCB> xcreateQDRFunctionMLocationReplenishProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationReplenishProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationReplenishProductList(String fn, SubQuery<MLocationReplenishProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_MLocationReplenishProductList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_MLocationReplenishProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "mLocationReplenishProductList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_MLocationReplenishProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by LOCATION_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstBCB> derivedTAllocInstBList() {
        return xcreateQDRFunctionTAllocInstBList();
    }
    protected HpQDRFunction<TAllocInstBCB> xcreateQDRFunctionTAllocInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_TAllocInstBList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_TAllocInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "tAllocInstBList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by LOCATION_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBList() {
        return xcreateQDRFunctionTInventoryBList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_TInventoryBList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_TInventoryBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "tInventoryBList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_TInventoryBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_inst_b where ...)} <br>
     * t_move_inst_b by LOCATION_ID, named 'TMoveInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBCB> derivedTMoveInstBList() {
        return xcreateQDRFunctionTMoveInstBList();
    }
    protected HpQDRFunction<TMoveInstBCB> xcreateQDRFunctionTMoveInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstBList(String fn, SubQuery<TMoveInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_TMoveInstBList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_TMoveInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "tMoveInstBList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_record_b where ...)} <br>
     * t_move_record_b by LOCATION_ID, named 'TMoveRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveRecordBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveRecordBCB> derivedTMoveRecordBList() {
        return xcreateQDRFunctionTMoveRecordBList();
    }
    protected HpQDRFunction<TMoveRecordBCB> xcreateQDRFunctionTMoveRecordBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveRecordBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveRecordBList(String fn, SubQuery<TMoveRecordBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_TMoveRecordBList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_TMoveRecordBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "tMoveRecordBList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_TMoveRecordBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by PLAN_LOCATION_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanBCB> derivedTReceivePlanBList() {
        return xcreateQDRFunctionTReceivePlanBList();
    }
    protected HpQDRFunction<TReceivePlanBCB> xcreateQDRFunctionTReceivePlanBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanBList(String fn, SubQuery<TReceivePlanBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_TReceivePlanBList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_TReceivePlanBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "PLAN_LOCATION_ID", sqpp, "tReceivePlanBList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_TReceivePlanBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by LOCATION_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstBCB> derivedTShippingInstBList() {
        return xcreateQDRFunctionTShippingInstBList();
    }
    protected HpQDRFunction<TShippingInstBCB> xcreateQDRFunctionTShippingInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_TShippingInstBList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_TShippingInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "tShippingInstBList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_stock where ...)} <br>
     * t_stock by LOCATION_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockList()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     stockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockCB> derivedTStockList() {
        return xcreateQDRFunctionTStockList();
    }
    protected HpQDRFunction<TStockCB> xcreateQDRFunctionTStockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockList(String fn, SubQuery<TStockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_TStockList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_TStockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "tStockList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_TStockList(TStockCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_TStockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_record_b where ...)} <br>
     * t_store_record_b by STORE_LOCATION_ID, named 'TStoreRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordBCB> derivedTStoreRecordBList() {
        return xcreateQDRFunctionTStoreRecordBList();
    }
    protected HpQDRFunction<TStoreRecordBCB> xcreateQDRFunctionTStoreRecordBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordBList(String fn, SubQuery<TStoreRecordBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_TStoreRecordBList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_TStoreRecordBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "STORE_LOCATION_ID", sqpp, "tStoreRecordBList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_TStoreRecordBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by LOC_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtInventoryInputProdList()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     prodCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtInventoryInputProdCB> derivedWHtInventoryInputProdList() {
        return xcreateQDRFunctionWHtInventoryInputProdList();
    }
    protected HpQDRFunction<WHtInventoryInputProdCB> xcreateQDRFunctionWHtInventoryInputProdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtInventoryInputProdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOC_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_picking where ...)} <br>
     * w_ht_picking by LOCATION_ID, named 'WHtPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtPickingCB> derivedWHtPickingList() {
        return xcreateQDRFunctionWHtPickingList();
    }
    protected HpQDRFunction<WHtPickingCB> xcreateQDRFunctionWHtPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtPickingList(String fn, SubQuery<WHtPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_WHtPickingList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_WHtPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "wHtPickingList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_WHtPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by RCV_LOC_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveInspectionList()</span>.<span style="color: #CC4747">max</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspectionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveInspectionCB> derivedWHtReceiveInspectionList() {
        return xcreateQDRFunctionWHtReceiveInspectionList();
    }
    protected HpQDRFunction<WHtReceiveInspectionCB> xcreateQDRFunctionWHtReceiveInspectionList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveInspectionList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_WHtReceiveInspectionList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "RCV_LOC_ID", sqpp, "wHtReceiveInspectionList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by RCV_LOC_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveNoPlanInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveNoPlanInspCB> derivedWHtReceiveNoPlanInspList() {
        return xcreateQDRFunctionWHtReceiveNoPlanInspList();
    }
    protected HpQDRFunction<WHtReceiveNoPlanInspCB> xcreateQDRFunctionWHtReceiveNoPlanInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveNoPlanInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "RCV_LOC_ID", sqpp, "wHtReceiveNoPlanInspList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by LOC_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveStoreList()</span>.<span style="color: #CC4747">max</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     storeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveStoreCB> derivedWHtReceiveStoreList() {
        return xcreateQDRFunctionWHtReceiveStoreList();
    }
    protected HpQDRFunction<WHtReceiveStoreCB> xcreateQDRFunctionWHtReceiveStoreList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveStoreList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_WHtReceiveStoreList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_WHtReceiveStoreListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOC_ID", sqpp, "wHtReceiveStoreList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by LOCATION_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtShippingPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtShippingPickingCB> derivedWHtShippingPickingList() {
        return xcreateQDRFunctionWHtShippingPickingList();
    }
    protected HpQDRFunction<WHtShippingPickingCB> xcreateQDRFunctionWHtShippingPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtShippingPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_WHtShippingPickingList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_WHtShippingPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "wHtShippingPickingList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by LOCATION_ID, named 'WHtTotalPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtTotalPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtTotalPickingCB> derivedWHtTotalPickingList() {
        return xcreateQDRFunctionWHtTotalPickingList();
    }
    protected HpQDRFunction<WHtTotalPickingCB> xcreateQDRFunctionWHtTotalPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtTotalPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtTotalPickingList(String fn, SubQuery<WHtTotalPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLocationId_QueryDerivedReferrer_WHtTotalPickingList(cb.query()); String prpp = keepLocationId_QueryDerivedReferrer_WHtTotalPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LOCATION_ID", "LOCATION_ID", sqpp, "wHtTotalPickingList", rd, vl, prpp, op);
    }
    public abstract String keepLocationId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);
    public abstract String keepLocationId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from m_center where ...)} <br />
     * m_center by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from m_center where ...)} <br />
     * m_center by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param zoneId The value of zoneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_Equal(Long zoneId) {
        doSetZoneId_Equal(zoneId);
    }

    protected void doSetZoneId_Equal(Long zoneId) {
        regZoneId(CK_EQ, zoneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param zoneId The value of zoneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_NotEqual(Long zoneId) {
        doSetZoneId_NotEqual(zoneId);
    }

    protected void doSetZoneId_NotEqual(Long zoneId) {
        regZoneId(CK_NES, zoneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param zoneId The value of zoneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_GreaterThan(Long zoneId) {
        regZoneId(CK_GT, zoneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param zoneId The value of zoneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_LessThan(Long zoneId) {
        regZoneId(CK_LT, zoneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param zoneId The value of zoneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_GreaterEqual(Long zoneId) {
        regZoneId(CK_GE, zoneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param zoneId The value of zoneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_LessEqual(Long zoneId) {
        regZoneId(CK_LE, zoneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param minNumber The min number of zoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZoneId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZoneId(), "ZONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param zoneIdList The collection of zoneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneId_InScope(Collection<Long> zoneIdList) {
        doSetZoneId_InScope(zoneIdList);
    }

    protected void doSetZoneId_InScope(Collection<Long> zoneIdList) {
        regINS(CK_INS, cTL(zoneIdList), xgetCValueZoneId(), "ZONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @param zoneIdList The collection of zoneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneId_NotInScope(Collection<Long> zoneIdList) {
        doSetZoneId_NotInScope(zoneIdList);
    }

    protected void doSetZoneId_NotInScope(Collection<Long> zoneIdList) {
        regINS(CK_NINS, cTL(zoneIdList), xgetCValueZoneId(), "ZONE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ZONE_ID from m_zone where ...)} <br />
     * m_zone by my ZONE_ID, named 'MZone'.
     * @param subCBLambda The callback for sub-query of MZone for 'in-scope'. (NotNull)
     */
    public void inScopeMZone(SubQuery<MZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZoneCB cb = new MZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepZoneId_InScopeRelation_MZone(cb.query());
        registerInScopeRelation(cb.query(), "ZONE_ID", "ZONE_ID", pp, "mZone", false);
    }
    public abstract String keepZoneId_InScopeRelation_MZone(MZoneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ZONE_ID from m_zone where ...)} <br />
     * m_zone by my ZONE_ID, named 'MZone'.
     * @param subCBLambda The callback for sub-query of MZone for 'not in-scope'. (NotNull)
     */
    public void notInScopeMZone(SubQuery<MZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZoneCB cb = new MZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepZoneId_NotInScopeRelation_MZone(cb.query());
        registerInScopeRelation(cb.query(), "ZONE_ID", "ZONE_ID", pp, "mZone", true);
    }
    public abstract String keepZoneId_NotInScopeRelation_MZone(MZoneCQ sq);

    protected void regZoneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneId(), "ZONE_ID"); }
    protected abstract ConditionValue xgetCValueZoneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNm The value of locationNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_Equal(String locationNm) {
        doSetLocationNm_Equal(fRES(locationNm));
    }

    protected void doSetLocationNm_Equal(String locationNm) {
        regLocationNm(CK_EQ, locationNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNm The value of locationNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_NotEqual(String locationNm) {
        doSetLocationNm_NotEqual(fRES(locationNm));
    }

    protected void doSetLocationNm_NotEqual(String locationNm) {
        regLocationNm(CK_NES, locationNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNm The value of locationNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_GreaterThan(String locationNm) {
        regLocationNm(CK_GT, fRES(locationNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNm The value of locationNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_LessThan(String locationNm) {
        regLocationNm(CK_LT, fRES(locationNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNm The value of locationNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_GreaterEqual(String locationNm) {
        regLocationNm(CK_GE, fRES(locationNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNm The value of locationNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_LessEqual(String locationNm) {
        regLocationNm(CK_LE, fRES(locationNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNmList The collection of locationNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_InScope(Collection<String> locationNmList) {
        doSetLocationNm_InScope(locationNmList);
    }

    protected void doSetLocationNm_InScope(Collection<String> locationNmList) {
        regINS(CK_INS, cTL(locationNmList), xgetCValueLocationNm(), "LOCATION_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNmList The collection of locationNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_NotInScope(Collection<String> locationNmList) {
        doSetLocationNm_NotInScope(locationNmList);
    }

    protected void doSetLocationNm_NotInScope(Collection<String> locationNmList) {
        regINS(CK_NINS, cTL(locationNmList), xgetCValueLocationNm(), "LOCATION_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setLocationNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationNm The value of locationNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationNm_LikeSearch(String locationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationNm), xgetCValueLocationNm(), "LOCATION_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNm The value of locationNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationNm_NotLikeSearch(String locationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationNm), xgetCValueLocationNm(), "LOCATION_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @param locationNm The value of locationNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_PrefixSearch(String locationNm) {
        setLocationNm_LikeSearch(locationNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     */
    public void setLocationNm_IsNull() { regLocationNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     */
    public void setLocationNm_IsNullOrEmpty() { regLocationNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {VARCHAR(60)}
     */
    public void setLocationNm_IsNotNull() { regLocationNm(CK_ISNN, DOBJ); }

    protected void regLocationNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationNm(), "LOCATION_NM"); }
    protected abstract ConditionValue xgetCValueLocationNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg}
     * @param pickingLocationFlg The value of pickingLocationFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_Equal(String pickingLocationFlg) {
        doSetPickingLocationFlg_Equal(fRES(pickingLocationFlg));
    }

    /**
     * Equal(=). As PickingLocationFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_Equal_AsPickingLocationFlg(CDef.PickingLocationFlg cdef) {
        doSetPickingLocationFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ピックロケーション
     */
    public void setPickingLocationFlg_Equal_$1() {
        setPickingLocationFlg_Equal_AsPickingLocationFlg(CDef.PickingLocationFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ピックロケーション以外
     */
    public void setPickingLocationFlg_Equal_$0() {
        setPickingLocationFlg_Equal_AsPickingLocationFlg(CDef.PickingLocationFlg.$0);
    }

    protected void doSetPickingLocationFlg_Equal(String pickingLocationFlg) {
        regPickingLocationFlg(CK_EQ, pickingLocationFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg}
     * @param pickingLocationFlg The value of pickingLocationFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_NotEqual(String pickingLocationFlg) {
        doSetPickingLocationFlg_NotEqual(fRES(pickingLocationFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PickingLocationFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_NotEqual_AsPickingLocationFlg(CDef.PickingLocationFlg cdef) {
        doSetPickingLocationFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ピックロケーション
     */
    public void setPickingLocationFlg_NotEqual_$1() {
        setPickingLocationFlg_NotEqual_AsPickingLocationFlg(CDef.PickingLocationFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: ピックロケーション以外
     */
    public void setPickingLocationFlg_NotEqual_$0() {
        setPickingLocationFlg_NotEqual_AsPickingLocationFlg(CDef.PickingLocationFlg.$0);
    }

    protected void doSetPickingLocationFlg_NotEqual(String pickingLocationFlg) {
        regPickingLocationFlg(CK_NES, pickingLocationFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg}
     * @param pickingLocationFlgList The collection of pickingLocationFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_InScope(Collection<String> pickingLocationFlgList) {
        doSetPickingLocationFlg_InScope(pickingLocationFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PickingLocationFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_InScope_AsPickingLocationFlg(Collection<CDef.PickingLocationFlg> cdefList) {
        doSetPickingLocationFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPickingLocationFlg_InScope(Collection<String> pickingLocationFlgList) {
        regINS(CK_INS, cTL(pickingLocationFlgList), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg}
     * @param pickingLocationFlgList The collection of pickingLocationFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_NotInScope(Collection<String> pickingLocationFlgList) {
        doSetPickingLocationFlg_NotInScope(pickingLocationFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PickingLocationFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg} <br>
     * ピックロケフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_NotInScope_AsPickingLocationFlg(Collection<CDef.PickingLocationFlg> cdefList) {
        doSetPickingLocationFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPickingLocationFlg_NotInScope(Collection<String> pickingLocationFlgList) {
        regINS(CK_NINS, cTL(pickingLocationFlgList), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG");
    }

    protected void regPickingLocationFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG"); }
    protected abstract ConditionValue xgetCValuePickingLocationFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param pickingOrder The value of pickingOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingOrder_Equal(Long pickingOrder) {
        doSetPickingOrder_Equal(pickingOrder);
    }

    protected void doSetPickingOrder_Equal(Long pickingOrder) {
        regPickingOrder(CK_EQ, pickingOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param pickingOrder The value of pickingOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingOrder_NotEqual(Long pickingOrder) {
        doSetPickingOrder_NotEqual(pickingOrder);
    }

    protected void doSetPickingOrder_NotEqual(Long pickingOrder) {
        regPickingOrder(CK_NES, pickingOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param pickingOrder The value of pickingOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingOrder_GreaterThan(Long pickingOrder) {
        regPickingOrder(CK_GT, pickingOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param pickingOrder The value of pickingOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingOrder_LessThan(Long pickingOrder) {
        regPickingOrder(CK_LT, pickingOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param pickingOrder The value of pickingOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingOrder_GreaterEqual(Long pickingOrder) {
        regPickingOrder(CK_GE, pickingOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param pickingOrder The value of pickingOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingOrder_LessEqual(Long pickingOrder) {
        regPickingOrder(CK_LE, pickingOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param minNumber The min number of pickingOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingOrder(), "PICKING_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param pickingOrderList The collection of pickingOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_InScope(Collection<Long> pickingOrderList) {
        doSetPickingOrder_InScope(pickingOrderList);
    }

    protected void doSetPickingOrder_InScope(Collection<Long> pickingOrderList) {
        regINS(CK_INS, cTL(pickingOrderList), xgetCValuePickingOrder(), "PICKING_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @param pickingOrderList The collection of pickingOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_NotInScope(Collection<Long> pickingOrderList) {
        doSetPickingOrder_NotInScope(pickingOrderList);
    }

    protected void doSetPickingOrder_NotInScope(Collection<Long> pickingOrderList) {
        regINS(CK_NINS, cTL(pickingOrderList), xgetCValuePickingOrder(), "PICKING_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     */
    public void setPickingOrder_IsNull() { regPickingOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_ORDER: {BIGINT(19)}
     */
    public void setPickingOrder_IsNotNull() { regPickingOrder(CK_ISNN, DOBJ); }

    protected void regPickingOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingOrder(), "PICKING_ORDER"); }
    protected abstract ConditionValue xgetCValuePickingOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     * @param locationType The value of locationType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_Equal(String locationType) {
        doSetLocationType_Equal(fRES(locationType));
    }

    /**
     * Equal(=). As LocationType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationType_Equal_AsLocationType(CDef.LocationType cdef) {
        doSetLocationType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 通常ロケーション
     */
    public void setLocationType_Equal_$00() {
        setLocationType_Equal_AsLocationType(CDef.LocationType.$00);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 入庫仮ロケーション
     */
    public void setLocationType_Equal_$01() {
        setLocationType_Equal_AsLocationType(CDef.LocationType.$01);
    }

    protected void doSetLocationType_Equal(String locationType) {
        regLocationType(CK_EQ, locationType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     * @param locationType The value of locationType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotEqual(String locationType) {
        doSetLocationType_NotEqual(fRES(locationType));
    }

    /**
     * NotEqual(&lt;&gt;). As LocationType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationType_NotEqual_AsLocationType(CDef.LocationType cdef) {
        doSetLocationType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 通常ロケーション
     */
    public void setLocationType_NotEqual_$00() {
        setLocationType_NotEqual_AsLocationType(CDef.LocationType.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 入庫仮ロケーション
     */
    public void setLocationType_NotEqual_$01() {
        setLocationType_NotEqual_AsLocationType(CDef.LocationType.$01);
    }

    protected void doSetLocationType_NotEqual(String locationType) {
        regLocationType(CK_NES, locationType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     * @param locationTypeList The collection of locationType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_InScope(Collection<String> locationTypeList) {
        doSetLocationType_InScope(locationTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As LocationType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_InScope_AsLocationType(Collection<CDef.LocationType> cdefList) {
        doSetLocationType_InScope(cTStrL(cdefList));
    }

    protected void doSetLocationType_InScope(Collection<String> locationTypeList) {
        regINS(CK_INS, cTL(locationTypeList), xgetCValueLocationType(), "LOCATION_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     * @param locationTypeList The collection of locationType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotInScope(Collection<String> locationTypeList) {
        doSetLocationType_NotInScope(locationTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LocationType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType} <br>
     * ロケーション種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotInScope_AsLocationType(Collection<CDef.LocationType> cdefList) {
        doSetLocationType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLocationType_NotInScope(Collection<String> locationTypeList) {
        regINS(CK_NINS, cTL(locationTypeList), xgetCValueLocationType(), "LOCATION_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     */
    public void setLocationType_IsNull() { regLocationType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     */
    public void setLocationType_IsNullOrEmpty() { regLocationType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     */
    public void setLocationType_IsNotNull() { regLocationType(CK_ISNN, DOBJ); }

    protected void regLocationType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationType(), "LOCATION_TYPE"); }
    protected abstract ConditionValue xgetCValueLocationType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_Equal(Long allocOrder) {
        doSetAllocOrder_Equal(allocOrder);
    }

    protected void doSetAllocOrder_Equal(Long allocOrder) {
        regAllocOrder(CK_EQ, allocOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_NotEqual(Long allocOrder) {
        doSetAllocOrder_NotEqual(allocOrder);
    }

    protected void doSetAllocOrder_NotEqual(Long allocOrder) {
        regAllocOrder(CK_NES, allocOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterThan(Long allocOrder) {
        regAllocOrder(CK_GT, allocOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_LessThan(Long allocOrder) {
        regAllocOrder(CK_LT, allocOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterEqual(Long allocOrder) {
        regAllocOrder(CK_GE, allocOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_LessEqual(Long allocOrder) {
        regAllocOrder(CK_LE, allocOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param minNumber The min number of allocOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocOrder(), "ALLOC_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrderList The collection of allocOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_InScope(Collection<Long> allocOrderList) {
        doSetAllocOrder_InScope(allocOrderList);
    }

    protected void doSetAllocOrder_InScope(Collection<Long> allocOrderList) {
        regINS(CK_INS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrderList The collection of allocOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_NotInScope(Collection<Long> allocOrderList) {
        doSetAllocOrder_NotInScope(allocOrderList);
    }

    protected void doSetAllocOrder_NotInScope(Collection<Long> allocOrderList) {
        regINS(CK_NINS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     */
    public void setAllocOrder_IsNull() { regAllocOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     */
    public void setAllocOrder_IsNotNull() { regAllocOrder(CK_ISNN, DOBJ); }

    protected void regAllocOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocOrder(), "ALLOC_ORDER"); }
    protected abstract ConditionValue xgetCValueAllocOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg}
     * @param allocNgFlg The value of allocNgFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_Equal(String allocNgFlg) {
        doSetAllocNgFlg_Equal(fRES(allocNgFlg));
    }

    /**
     * Equal(=). As AllcNgFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNgFlg_Equal_AsAllcNgFlg(CDef.AllcNgFlg cdef) {
        doSetAllocNgFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 引当可能
     */
    public void setAllocNgFlg_Equal_$0() {
        setAllocNgFlg_Equal_AsAllcNgFlg(CDef.AllcNgFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 引当禁止
     */
    public void setAllocNgFlg_Equal_$1() {
        setAllocNgFlg_Equal_AsAllcNgFlg(CDef.AllcNgFlg.$1);
    }

    protected void doSetAllocNgFlg_Equal(String allocNgFlg) {
        regAllocNgFlg(CK_EQ, allocNgFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg}
     * @param allocNgFlg The value of allocNgFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_NotEqual(String allocNgFlg) {
        doSetAllocNgFlg_NotEqual(fRES(allocNgFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As AllcNgFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNgFlg_NotEqual_AsAllcNgFlg(CDef.AllcNgFlg cdef) {
        doSetAllocNgFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 引当可能
     */
    public void setAllocNgFlg_NotEqual_$0() {
        setAllocNgFlg_NotEqual_AsAllcNgFlg(CDef.AllcNgFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 引当禁止
     */
    public void setAllocNgFlg_NotEqual_$1() {
        setAllocNgFlg_NotEqual_AsAllcNgFlg(CDef.AllcNgFlg.$1);
    }

    protected void doSetAllocNgFlg_NotEqual(String allocNgFlg) {
        regAllocNgFlg(CK_NES, allocNgFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg}
     * @param allocNgFlgList The collection of allocNgFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_InScope(Collection<String> allocNgFlgList) {
        doSetAllocNgFlg_InScope(allocNgFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As AllcNgFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_InScope_AsAllcNgFlg(Collection<CDef.AllcNgFlg> cdefList) {
        doSetAllocNgFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetAllocNgFlg_InScope(Collection<String> allocNgFlgList) {
        regINS(CK_INS, cTL(allocNgFlgList), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg}
     * @param allocNgFlgList The collection of allocNgFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_NotInScope(Collection<String> allocNgFlgList) {
        doSetAllocNgFlg_NotInScope(allocNgFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AllcNgFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg} <br>
     * 引当禁止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_NotInScope_AsAllcNgFlg(Collection<CDef.AllcNgFlg> cdefList) {
        doSetAllocNgFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAllocNgFlg_NotInScope(Collection<String> allocNgFlgList) {
        regINS(CK_NINS, cTL(allocNgFlgList), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG");
    }

    protected void regAllocNgFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNgFlg(), "ALLOC_NG_FLG"); }
    protected abstract ConditionValue xgetCValueAllocNgFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_Equal(Long replenishProductId) {
        doSetReplenishProductId_Equal(replenishProductId);
    }

    protected void doSetReplenishProductId_Equal(Long replenishProductId) {
        regReplenishProductId(CK_EQ, replenishProductId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_NotEqual(Long replenishProductId) {
        doSetReplenishProductId_NotEqual(replenishProductId);
    }

    protected void doSetReplenishProductId_NotEqual(Long replenishProductId) {
        regReplenishProductId(CK_NES, replenishProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_GreaterThan(Long replenishProductId) {
        regReplenishProductId(CK_GT, replenishProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_LessThan(Long replenishProductId) {
        regReplenishProductId(CK_LT, replenishProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_GreaterEqual(Long replenishProductId) {
        regReplenishProductId(CK_GE, replenishProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_LessEqual(Long replenishProductId) {
        regReplenishProductId(CK_LE, replenishProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param minNumber The min number of replenishProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishProductId(), "REPLENISH_PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param replenishProductIdList The collection of replenishProductId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductId_InScope(Collection<Long> replenishProductIdList) {
        doSetReplenishProductId_InScope(replenishProductIdList);
    }

    protected void doSetReplenishProductId_InScope(Collection<Long> replenishProductIdList) {
        regINS(CK_INS, cTL(replenishProductIdList), xgetCValueReplenishProductId(), "REPLENISH_PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param replenishProductIdList The collection of replenishProductId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductId_NotInScope(Collection<Long> replenishProductIdList) {
        doSetReplenishProductId_NotInScope(replenishProductIdList);
    }

    protected void doSetReplenishProductId_NotInScope(Collection<Long> replenishProductIdList) {
        regINS(CK_NINS, cTL(replenishProductIdList), xgetCValueReplenishProductId(), "REPLENISH_PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPLENISH_PRODUCT_ID from m_product where ...)} <br />
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepReplenishProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPLENISH_PRODUCT_ID from m_product where ...)} <br />
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepReplenishProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     */
    public void setReplenishProductId_IsNull() { regReplenishProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     */
    public void setReplenishProductId_IsNotNull() { regReplenishProductId(CK_ISNN, DOBJ); }

    protected void regReplenishProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishProductId(), "REPLENISH_PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueReplenishProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_Equal(Long replenishStockTypeId) {
        doSetReplenishStockTypeId_Equal(replenishStockTypeId);
    }

    protected void doSetReplenishStockTypeId_Equal(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_EQ, replenishStockTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_NotEqual(Long replenishStockTypeId) {
        doSetReplenishStockTypeId_NotEqual(replenishStockTypeId);
    }

    protected void doSetReplenishStockTypeId_NotEqual(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_NES, replenishStockTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_GreaterThan(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_GT, replenishStockTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_LessThan(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_LT, replenishStockTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_GreaterEqual(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_GE, replenishStockTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_LessEqual(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_LE, replenishStockTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param minNumber The min number of replenishStockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishStockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishStockTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishStockTypeId(), "REPLENISH_STOCK_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeIdList The collection of replenishStockTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_InScope(Collection<Long> replenishStockTypeIdList) {
        doSetReplenishStockTypeId_InScope(replenishStockTypeIdList);
    }

    protected void doSetReplenishStockTypeId_InScope(Collection<Long> replenishStockTypeIdList) {
        regINS(CK_INS, cTL(replenishStockTypeIdList), xgetCValueReplenishStockTypeId(), "REPLENISH_STOCK_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeIdList The collection of replenishStockTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_NotInScope(Collection<Long> replenishStockTypeIdList) {
        doSetReplenishStockTypeId_NotInScope(replenishStockTypeIdList);
    }

    protected void doSetReplenishStockTypeId_NotInScope(Collection<Long> replenishStockTypeIdList) {
        regINS(CK_NINS, cTL(replenishStockTypeIdList), xgetCValueReplenishStockTypeId(), "REPLENISH_STOCK_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPLENISH_STOCK_TYPE_ID from m_stock_type where ...)} <br />
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'in-scope'. (NotNull)
     */
    public void inScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishStockTypeId_InScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", false);
    }
    public abstract String keepReplenishStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPLENISH_STOCK_TYPE_ID from m_stock_type where ...)} <br />
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishStockTypeId_NotInScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", true);
    }
    public abstract String keepReplenishStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     */
    public void setReplenishStockTypeId_IsNull() { regReplenishStockTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     */
    public void setReplenishStockTypeId_IsNotNull() { regReplenishStockTypeId(CK_ISNN, DOBJ); }

    protected void regReplenishStockTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishStockTypeId(), "REPLENISH_STOCK_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueReplenishStockTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_Equal(Long replenishDepositId) {
        doSetReplenishDepositId_Equal(replenishDepositId);
    }

    protected void doSetReplenishDepositId_Equal(Long replenishDepositId) {
        regReplenishDepositId(CK_EQ, replenishDepositId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_NotEqual(Long replenishDepositId) {
        doSetReplenishDepositId_NotEqual(replenishDepositId);
    }

    protected void doSetReplenishDepositId_NotEqual(Long replenishDepositId) {
        regReplenishDepositId(CK_NES, replenishDepositId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_GreaterThan(Long replenishDepositId) {
        regReplenishDepositId(CK_GT, replenishDepositId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_LessThan(Long replenishDepositId) {
        regReplenishDepositId(CK_LT, replenishDepositId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_GreaterEqual(Long replenishDepositId) {
        regReplenishDepositId(CK_GE, replenishDepositId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_LessEqual(Long replenishDepositId) {
        regReplenishDepositId(CK_LE, replenishDepositId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of replenishDepositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishDepositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishDepositId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishDepositId(), "REPLENISH_DEPOSIT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositIdList The collection of replenishDepositId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositId_InScope(Collection<Long> replenishDepositIdList) {
        doSetReplenishDepositId_InScope(replenishDepositIdList);
    }

    protected void doSetReplenishDepositId_InScope(Collection<Long> replenishDepositIdList) {
        regINS(CK_INS, cTL(replenishDepositIdList), xgetCValueReplenishDepositId(), "REPLENISH_DEPOSIT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositIdList The collection of replenishDepositId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositId_NotInScope(Collection<Long> replenishDepositIdList) {
        doSetReplenishDepositId_NotInScope(replenishDepositIdList);
    }

    protected void doSetReplenishDepositId_NotInScope(Collection<Long> replenishDepositIdList) {
        regINS(CK_NINS, cTL(replenishDepositIdList), xgetCValueReplenishDepositId(), "REPLENISH_DEPOSIT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPLENISH_DEPOSIT_ID from m_customer where ...)} <br />
     * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishDepositId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepReplenishDepositId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPLENISH_DEPOSIT_ID from m_customer where ...)} <br />
     * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishDepositId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepReplenishDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setReplenishDepositId_IsNull() { regReplenishDepositId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setReplenishDepositId_IsNotNull() { regReplenishDepositId(CK_ISNN, DOBJ); }

    protected void regReplenishDepositId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishDepositId(), "REPLENISH_DEPOSIT_ID"); }
    protected abstract ConditionValue xgetCValueReplenishDepositId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param replenishPNum The value of replenishPNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_Equal(java.math.BigDecimal replenishPNum) {
        doSetReplenishPNum_Equal(replenishPNum);
    }

    protected void doSetReplenishPNum_Equal(java.math.BigDecimal replenishPNum) {
        regReplenishPNum(CK_EQ, replenishPNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param replenishPNum The value of replenishPNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_NotEqual(java.math.BigDecimal replenishPNum) {
        doSetReplenishPNum_NotEqual(replenishPNum);
    }

    protected void doSetReplenishPNum_NotEqual(java.math.BigDecimal replenishPNum) {
        regReplenishPNum(CK_NES, replenishPNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param replenishPNum The value of replenishPNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_GreaterThan(java.math.BigDecimal replenishPNum) {
        regReplenishPNum(CK_GT, replenishPNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param replenishPNum The value of replenishPNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_LessThan(java.math.BigDecimal replenishPNum) {
        regReplenishPNum(CK_LT, replenishPNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param replenishPNum The value of replenishPNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_GreaterEqual(java.math.BigDecimal replenishPNum) {
        regReplenishPNum(CK_GE, replenishPNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param replenishPNum The value of replenishPNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_LessEqual(java.math.BigDecimal replenishPNum) {
        regReplenishPNum(CK_LE, replenishPNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param minNumber The min number of replenishPNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishPNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishPNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishPNum(), "REPLENISH_P_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param replenishPNumList The collection of replenishPNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_InScope(Collection<java.math.BigDecimal> replenishPNumList) {
        doSetReplenishPNum_InScope(replenishPNumList);
    }

    protected void doSetReplenishPNum_InScope(Collection<java.math.BigDecimal> replenishPNumList) {
        regINS(CK_INS, cTL(replenishPNumList), xgetCValueReplenishPNum(), "REPLENISH_P_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @param replenishPNumList The collection of replenishPNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_NotInScope(Collection<java.math.BigDecimal> replenishPNumList) {
        doSetReplenishPNum_NotInScope(replenishPNumList);
    }

    protected void doSetReplenishPNum_NotInScope(Collection<java.math.BigDecimal> replenishPNumList) {
        regINS(CK_NINS, cTL(replenishPNumList), xgetCValueReplenishPNum(), "REPLENISH_P_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     */
    public void setReplenishPNum_IsNull() { regReplenishPNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     */
    public void setReplenishPNum_IsNotNull() { regReplenishPNum(CK_ISNN, DOBJ); }

    protected void regReplenishPNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishPNum(), "REPLENISH_P_NUM"); }
    protected abstract ConditionValue xgetCValueReplenishPNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_Equal(Long replenishPProductShapeId) {
        doSetReplenishPProductShapeId_Equal(replenishPProductShapeId);
    }

    protected void doSetReplenishPProductShapeId_Equal(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_EQ, replenishPProductShapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_NotEqual(Long replenishPProductShapeId) {
        doSetReplenishPProductShapeId_NotEqual(replenishPProductShapeId);
    }

    protected void doSetReplenishPProductShapeId_NotEqual(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_NES, replenishPProductShapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_GreaterThan(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_GT, replenishPProductShapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_LessThan(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_LT, replenishPProductShapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_GreaterEqual(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_GE, replenishPProductShapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_LessEqual(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_LE, replenishPProductShapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param minNumber The min number of replenishPProductShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishPProductShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishPProductShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishPProductShapeId(), "REPLENISH_P_PRODUCT_SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param replenishPProductShapeIdList The collection of replenishPProductShapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_InScope(Collection<Long> replenishPProductShapeIdList) {
        doSetReplenishPProductShapeId_InScope(replenishPProductShapeIdList);
    }

    protected void doSetReplenishPProductShapeId_InScope(Collection<Long> replenishPProductShapeIdList) {
        regINS(CK_INS, cTL(replenishPProductShapeIdList), xgetCValueReplenishPProductShapeId(), "REPLENISH_P_PRODUCT_SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param replenishPProductShapeIdList The collection of replenishPProductShapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_NotInScope(Collection<Long> replenishPProductShapeIdList) {
        doSetReplenishPProductShapeId_NotInScope(replenishPProductShapeIdList);
    }

    protected void doSetReplenishPProductShapeId_NotInScope(Collection<Long> replenishPProductShapeIdList) {
        regINS(CK_NINS, cTL(replenishPProductShapeIdList), xgetCValueReplenishPProductShapeId(), "REPLENISH_P_PRODUCT_SHAPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPLENISH_P_PRODUCT_SHAPE_ID from m_product_shape where ...)} <br />
     * m_product_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MProductShapeByReplenishPProductShapeId'.
     * @param subCBLambda The callback for sub-query of MProductShapeByReplenishPProductShapeId for 'in-scope'. (NotNull)
     */
    public void inScopeMProductShapeByReplenishPProductShapeId(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishPProductShapeId_InScopeRelation_MProductShapeByReplenishPProductShapeId(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_P_PRODUCT_SHAPE_ID", "PRODUCT_SHAPE_ID", pp, "mProductShapeByReplenishPProductShapeId", false);
    }
    public abstract String keepReplenishPProductShapeId_InScopeRelation_MProductShapeByReplenishPProductShapeId(MProductShapeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPLENISH_P_PRODUCT_SHAPE_ID from m_product_shape where ...)} <br />
     * m_product_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MProductShapeByReplenishPProductShapeId'.
     * @param subCBLambda The callback for sub-query of MProductShapeByReplenishPProductShapeId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProductShapeByReplenishPProductShapeId(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishPProductShapeId_NotInScopeRelation_MProductShapeByReplenishPProductShapeId(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_P_PRODUCT_SHAPE_ID", "PRODUCT_SHAPE_ID", pp, "mProductShapeByReplenishPProductShapeId", true);
    }
    public abstract String keepReplenishPProductShapeId_NotInScopeRelation_MProductShapeByReplenishPProductShapeId(MProductShapeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     */
    public void setReplenishPProductShapeId_IsNull() { regReplenishPProductShapeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     */
    public void setReplenishPProductShapeId_IsNotNull() { regReplenishPProductShapeId(CK_ISNN, DOBJ); }

    protected void regReplenishPProductShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishPProductShapeId(), "REPLENISH_P_PRODUCT_SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueReplenishPProductShapeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param maxStoreNum The value of maxStoreNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_Equal(java.math.BigDecimal maxStoreNum) {
        doSetMaxStoreNum_Equal(maxStoreNum);
    }

    protected void doSetMaxStoreNum_Equal(java.math.BigDecimal maxStoreNum) {
        regMaxStoreNum(CK_EQ, maxStoreNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param maxStoreNum The value of maxStoreNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_NotEqual(java.math.BigDecimal maxStoreNum) {
        doSetMaxStoreNum_NotEqual(maxStoreNum);
    }

    protected void doSetMaxStoreNum_NotEqual(java.math.BigDecimal maxStoreNum) {
        regMaxStoreNum(CK_NES, maxStoreNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param maxStoreNum The value of maxStoreNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_GreaterThan(java.math.BigDecimal maxStoreNum) {
        regMaxStoreNum(CK_GT, maxStoreNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param maxStoreNum The value of maxStoreNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_LessThan(java.math.BigDecimal maxStoreNum) {
        regMaxStoreNum(CK_LT, maxStoreNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param maxStoreNum The value of maxStoreNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_GreaterEqual(java.math.BigDecimal maxStoreNum) {
        regMaxStoreNum(CK_GE, maxStoreNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param maxStoreNum The value of maxStoreNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_LessEqual(java.math.BigDecimal maxStoreNum) {
        regMaxStoreNum(CK_LE, maxStoreNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param minNumber The min number of maxStoreNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxStoreNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxStoreNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxStoreNum(), "MAX_STORE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param maxStoreNumList The collection of maxStoreNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_InScope(Collection<java.math.BigDecimal> maxStoreNumList) {
        doSetMaxStoreNum_InScope(maxStoreNumList);
    }

    protected void doSetMaxStoreNum_InScope(Collection<java.math.BigDecimal> maxStoreNumList) {
        regINS(CK_INS, cTL(maxStoreNumList), xgetCValueMaxStoreNum(), "MAX_STORE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @param maxStoreNumList The collection of maxStoreNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_NotInScope(Collection<java.math.BigDecimal> maxStoreNumList) {
        doSetMaxStoreNum_NotInScope(maxStoreNumList);
    }

    protected void doSetMaxStoreNum_NotInScope(Collection<java.math.BigDecimal> maxStoreNumList) {
        regINS(CK_NINS, cTL(maxStoreNumList), xgetCValueMaxStoreNum(), "MAX_STORE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     */
    public void setMaxStoreNum_IsNull() { regMaxStoreNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     */
    public void setMaxStoreNum_IsNotNull() { regMaxStoreNum(CK_ISNN, DOBJ); }

    protected void regMaxStoreNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxStoreNum(), "MAX_STORE_NUM"); }
    protected abstract ConditionValue xgetCValueMaxStoreNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_Equal(Long maxStoreProductShapeId) {
        doSetMaxStoreProductShapeId_Equal(maxStoreProductShapeId);
    }

    protected void doSetMaxStoreProductShapeId_Equal(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_EQ, maxStoreProductShapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_NotEqual(Long maxStoreProductShapeId) {
        doSetMaxStoreProductShapeId_NotEqual(maxStoreProductShapeId);
    }

    protected void doSetMaxStoreProductShapeId_NotEqual(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_NES, maxStoreProductShapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_GreaterThan(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_GT, maxStoreProductShapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_LessThan(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_LT, maxStoreProductShapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_GreaterEqual(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_GE, maxStoreProductShapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_LessEqual(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_LE, maxStoreProductShapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param minNumber The min number of maxStoreProductShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxStoreProductShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxStoreProductShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxStoreProductShapeId(), "MAX_STORE_PRODUCT_SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeIdList The collection of maxStoreProductShapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_InScope(Collection<Long> maxStoreProductShapeIdList) {
        doSetMaxStoreProductShapeId_InScope(maxStoreProductShapeIdList);
    }

    protected void doSetMaxStoreProductShapeId_InScope(Collection<Long> maxStoreProductShapeIdList) {
        regINS(CK_INS, cTL(maxStoreProductShapeIdList), xgetCValueMaxStoreProductShapeId(), "MAX_STORE_PRODUCT_SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeIdList The collection of maxStoreProductShapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_NotInScope(Collection<Long> maxStoreProductShapeIdList) {
        doSetMaxStoreProductShapeId_NotInScope(maxStoreProductShapeIdList);
    }

    protected void doSetMaxStoreProductShapeId_NotInScope(Collection<Long> maxStoreProductShapeIdList) {
        regINS(CK_NINS, cTL(maxStoreProductShapeIdList), xgetCValueMaxStoreProductShapeId(), "MAX_STORE_PRODUCT_SHAPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MAX_STORE_PRODUCT_SHAPE_ID from m_product_shape where ...)} <br />
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShapeByMaxStoreProductShapeId'.
     * @param subCBLambda The callback for sub-query of MProductShapeByMaxStoreProductShapeId for 'in-scope'. (NotNull)
     */
    public void inScopeMProductShapeByMaxStoreProductShapeId(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMaxStoreProductShapeId_InScopeRelation_MProductShapeByMaxStoreProductShapeId(cb.query());
        registerInScopeRelation(cb.query(), "MAX_STORE_PRODUCT_SHAPE_ID", "PRODUCT_SHAPE_ID", pp, "mProductShapeByMaxStoreProductShapeId", false);
    }
    public abstract String keepMaxStoreProductShapeId_InScopeRelation_MProductShapeByMaxStoreProductShapeId(MProductShapeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MAX_STORE_PRODUCT_SHAPE_ID from m_product_shape where ...)} <br />
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShapeByMaxStoreProductShapeId'.
     * @param subCBLambda The callback for sub-query of MProductShapeByMaxStoreProductShapeId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProductShapeByMaxStoreProductShapeId(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMaxStoreProductShapeId_NotInScopeRelation_MProductShapeByMaxStoreProductShapeId(cb.query());
        registerInScopeRelation(cb.query(), "MAX_STORE_PRODUCT_SHAPE_ID", "PRODUCT_SHAPE_ID", pp, "mProductShapeByMaxStoreProductShapeId", true);
    }
    public abstract String keepMaxStoreProductShapeId_NotInScopeRelation_MProductShapeByMaxStoreProductShapeId(MProductShapeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     */
    public void setMaxStoreProductShapeId_IsNull() { regMaxStoreProductShapeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     */
    public void setMaxStoreProductShapeId_IsNotNull() { regMaxStoreProductShapeId(CK_ISNN, DOBJ); }

    protected void regMaxStoreProductShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxStoreProductShapeId(), "MAX_STORE_PRODUCT_SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueMaxStoreProductShapeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlg The value of externalWhFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_Equal(String externalWhFlg) {
        doSetExternalWhFlg_Equal(fRES(externalWhFlg));
    }

    protected void doSetExternalWhFlg_Equal(String externalWhFlg) {
        regExternalWhFlg(CK_EQ, externalWhFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlg The value of externalWhFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_NotEqual(String externalWhFlg) {
        doSetExternalWhFlg_NotEqual(fRES(externalWhFlg));
    }

    protected void doSetExternalWhFlg_NotEqual(String externalWhFlg) {
        regExternalWhFlg(CK_NES, externalWhFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlg The value of externalWhFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_GreaterThan(String externalWhFlg) {
        regExternalWhFlg(CK_GT, fRES(externalWhFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlg The value of externalWhFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_LessThan(String externalWhFlg) {
        regExternalWhFlg(CK_LT, fRES(externalWhFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlg The value of externalWhFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_GreaterEqual(String externalWhFlg) {
        regExternalWhFlg(CK_GE, fRES(externalWhFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlg The value of externalWhFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_LessEqual(String externalWhFlg) {
        regExternalWhFlg(CK_LE, fRES(externalWhFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlgList The collection of externalWhFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_InScope(Collection<String> externalWhFlgList) {
        doSetExternalWhFlg_InScope(externalWhFlgList);
    }

    protected void doSetExternalWhFlg_InScope(Collection<String> externalWhFlgList) {
        regINS(CK_INS, cTL(externalWhFlgList), xgetCValueExternalWhFlg(), "EXTERNAL_WH_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlgList The collection of externalWhFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_NotInScope(Collection<String> externalWhFlgList) {
        doSetExternalWhFlg_NotInScope(externalWhFlgList);
    }

    protected void doSetExternalWhFlg_NotInScope(Collection<String> externalWhFlgList) {
        regINS(CK_NINS, cTL(externalWhFlgList), xgetCValueExternalWhFlg(), "EXTERNAL_WH_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setExternalWhFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param externalWhFlg The value of externalWhFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExternalWhFlg_LikeSearch(String externalWhFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(externalWhFlg), xgetCValueExternalWhFlg(), "EXTERNAL_WH_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlg The value of externalWhFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExternalWhFlg_NotLikeSearch(String externalWhFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(externalWhFlg), xgetCValueExternalWhFlg(), "EXTERNAL_WH_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @param externalWhFlg The value of externalWhFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExternalWhFlg_PrefixSearch(String externalWhFlg) {
        setExternalWhFlg_LikeSearch(externalWhFlg, xcLSOPPre());
    }

    protected void regExternalWhFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExternalWhFlg(), "EXTERNAL_WH_FLG"); }
    protected abstract ConditionValue xgetCValueExternalWhFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttribute The value of locationAttribute as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_Equal(String locationAttribute) {
        doSetLocationAttribute_Equal(fRES(locationAttribute));
    }

    protected void doSetLocationAttribute_Equal(String locationAttribute) {
        regLocationAttribute(CK_EQ, locationAttribute);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttribute The value of locationAttribute as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_NotEqual(String locationAttribute) {
        doSetLocationAttribute_NotEqual(fRES(locationAttribute));
    }

    protected void doSetLocationAttribute_NotEqual(String locationAttribute) {
        regLocationAttribute(CK_NES, locationAttribute);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttribute The value of locationAttribute as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_GreaterThan(String locationAttribute) {
        regLocationAttribute(CK_GT, fRES(locationAttribute));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttribute The value of locationAttribute as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_LessThan(String locationAttribute) {
        regLocationAttribute(CK_LT, fRES(locationAttribute));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttribute The value of locationAttribute as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_GreaterEqual(String locationAttribute) {
        regLocationAttribute(CK_GE, fRES(locationAttribute));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttribute The value of locationAttribute as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_LessEqual(String locationAttribute) {
        regLocationAttribute(CK_LE, fRES(locationAttribute));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttributeList The collection of locationAttribute as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_InScope(Collection<String> locationAttributeList) {
        doSetLocationAttribute_InScope(locationAttributeList);
    }

    protected void doSetLocationAttribute_InScope(Collection<String> locationAttributeList) {
        regINS(CK_INS, cTL(locationAttributeList), xgetCValueLocationAttribute(), "LOCATION_ATTRIBUTE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttributeList The collection of locationAttribute as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_NotInScope(Collection<String> locationAttributeList) {
        doSetLocationAttribute_NotInScope(locationAttributeList);
    }

    protected void doSetLocationAttribute_NotInScope(Collection<String> locationAttributeList) {
        regINS(CK_NINS, cTL(locationAttributeList), xgetCValueLocationAttribute(), "LOCATION_ATTRIBUTE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)} <br>
     * <pre>e.g. setLocationAttribute_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationAttribute The value of locationAttribute as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationAttribute_LikeSearch(String locationAttribute, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationAttribute), xgetCValueLocationAttribute(), "LOCATION_ATTRIBUTE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttribute The value of locationAttribute as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationAttribute_NotLikeSearch(String locationAttribute, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationAttribute), xgetCValueLocationAttribute(), "LOCATION_ATTRIBUTE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @param locationAttribute The value of locationAttribute as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationAttribute_PrefixSearch(String locationAttribute) {
        setLocationAttribute_LikeSearch(locationAttribute, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     */
    public void setLocationAttribute_IsNull() { regLocationAttribute(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     */
    public void setLocationAttribute_IsNullOrEmpty() { regLocationAttribute(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     */
    public void setLocationAttribute_IsNotNull() { regLocationAttribute(CK_ISNN, DOBJ); }

    protected void regLocationAttribute(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationAttribute(), "LOCATION_ATTRIBUTE"); }
    protected abstract ConditionValue xgetCValueLocationAttribute();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsDelFlg(CDef.DelFlg cdef) {
        doSetDelFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未削除
     */
    public void setDelFlg_Equal_$0() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 削除済
     */
    public void setDelFlg_Equal_$1() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$1);
    }

    protected void doSetDelFlg_Equal(String delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param controlNo The value of controlNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_Equal(Long controlNo) {
        doSetControlNo_Equal(controlNo);
    }

    protected void doSetControlNo_Equal(Long controlNo) {
        regControlNo(CK_EQ, controlNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param controlNo The value of controlNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_NotEqual(Long controlNo) {
        doSetControlNo_NotEqual(controlNo);
    }

    protected void doSetControlNo_NotEqual(Long controlNo) {
        regControlNo(CK_NES, controlNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param minNumber The min number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setControlNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueControlNo(), "CONTROL_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     */
    public void setControlNo_IsNull() { regControlNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     */
    public void setControlNo_IsNotNull() { regControlNo(CK_ISNN, DOBJ); }

    protected void regControlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueControlNo(), "CONTROL_NO"); }
    protected abstract ConditionValue xgetCValueControlNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     * @param addDt The value of addDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_Equal(java.sql.Timestamp addDt) {
        regAddDt(CK_EQ,  addDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     * @param addDt The value of addDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_LessEqual(java.sql.Timestamp addDt) {
        regAddDt(CK_LE, addDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     */
    public void setAddDt_IsNull() { regAddDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     */
    public void setAddDt_IsNotNull() { regAddDt(CK_ISNN, DOBJ); }

    protected void regAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddDt(), "ADD_DT"); }
    protected abstract ConditionValue xgetCValueAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     * @param addUser The value of addUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddUser_Equal(String addUser) {
        doSetAddUser_Equal(fRES(addUser));
    }

    protected void doSetAddUser_Equal(String addUser) {
        regAddUser(CK_EQ, addUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNull() { regAddUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNullOrEmpty() { regAddUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNotNull() { regAddUser(CK_ISNN, DOBJ); }

    protected void regAddUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddUser(), "ADD_USER"); }
    protected abstract ConditionValue xgetCValueAddUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @param addProcess The value of addProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddProcess_Equal(String addProcess) {
        doSetAddProcess_Equal(fRES(addProcess));
    }

    protected void doSetAddProcess_Equal(String addProcess) {
        regAddProcess(CK_EQ, addProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNull() { regAddProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNullOrEmpty() { regAddProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNotNull() { regAddProcess(CK_ISNN, DOBJ); }

    protected void regAddProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddProcess(), "ADD_PROCESS"); }
    protected abstract ConditionValue xgetCValueAddProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     * @param updDt The value of updDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_Equal(java.sql.Timestamp updDt) {
        regUpdDt(CK_EQ,  updDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     * @param updDt The value of updDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_LessEqual(java.sql.Timestamp updDt) {
        regUpdDt(CK_LE, updDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     */
    public void setUpdDt_IsNull() { regUpdDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     */
    public void setUpdDt_IsNotNull() { regUpdDt(CK_ISNN, DOBJ); }

    protected void regUpdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdDt(), "UPD_DT"); }
    protected abstract ConditionValue xgetCValueUpdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     * @param updUser The value of updUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_Equal(String updUser) {
        doSetUpdUser_Equal(fRES(updUser));
    }

    protected void doSetUpdUser_Equal(String updUser) {
        regUpdUser(CK_EQ, updUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNull() { regUpdUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNullOrEmpty() { regUpdUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNotNull() { regUpdUser(CK_ISNN, DOBJ); }

    protected void regUpdUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUser(), "UPD_USER"); }
    protected abstract ConditionValue xgetCValueUpdUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @param updProcess The value of updProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdProcess_Equal(String updProcess) {
        doSetUpdProcess_Equal(fRES(updProcess));
    }

    protected void doSetUpdProcess_Equal(String updProcess) {
        regUpdProcess(CK_EQ, updProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNull() { regUpdProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNullOrEmpty() { regUpdProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNotNull() { regUpdProcess(CK_ISNN, DOBJ); }

    protected void regUpdProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdProcess(), "UPD_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdProcess();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MLocationCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MLocationCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MLocationCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MLocationCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MLocationCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MLocationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MLocationCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MLocationCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MLocationCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MLocationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MLocationCB&gt;() {
     *     public void query(MLocationCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MLocationCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MLocationCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MLocationCQ sq);

    protected MLocationCB xcreateScalarConditionCB() {
        MLocationCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MLocationCB xcreateScalarConditionPartitionByCB() {
        MLocationCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LOCATION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MLocationCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MLocationCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOCATION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MLocationCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MLocationCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br>
     * This function with Union is unsupported! <br>
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderOption option = new ManualOrderOption();
        option.acceptOrderValueList(orderValueList);
        withManualOrder(option);
    }

    @Override
    protected void filterFromToOption(String columnDbName, FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MLocationCB newMyCB() {
        return new MLocationCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MLocationCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
