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
 * The abstract condition-query of m_product.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_product";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from h_stock_book where ...)} <br>
     * h_stock_book by PRODUCT_ID, named 'HStockBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHStockBookList</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HStockBookList for 'exists'. (NotNull)
     */
    public void existsHStockBookList(SubQuery<HStockBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockBookCB cb = new HStockBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_HStockBookList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "hStockBookList");
    }
    public abstract String keepProductId_ExistsReferrer_HStockBookList(HStockBookCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from m_deposit_product where ...)} <br>
     * m_deposit_product by PRODUCT_ID, named 'MDepositProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMDepositProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MDepositProductList for 'exists'. (NotNull)
     */
    public void existsMDepositProductList(SubQuery<MDepositProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MDepositProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mDepositProductList");
    }
    public abstract String keepProductId_ExistsReferrer_MDepositProductList(MDepositProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLENISH_PRODUCT_ID from m_location where ...)} <br>
     * m_location by REPLENISH_PRODUCT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationList for 'exists'. (NotNull)
     */
    public void existsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MLocationList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationList");
    }
    public abstract String keepProductId_ExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLENISH_PRODUCT_ID from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MLocationReplenishProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationReplenishProductList");
    }
    public abstract String keepProductId_ExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from m_product_shape where ...)} <br>
     * m_product_shape by PRODUCT_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMProductShapeList</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MProductShapeList for 'exists'. (NotNull)
     */
    public void existsMProductShapeList(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MProductShapeList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductShapeList");
    }
    public abstract String keepProductId_ExistsReferrer_MProductShapeList(MProductShapeCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from m_set_parent where ...)} <br>
     * m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMSetParentAsOne</span>(parentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     parentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MSetParentAsOne for 'exists'. (NotNull)
     */
    public void existsMSetParentAsOne(SubQuery<MSetParentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSetParentCB cb = new MSetParentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MSetParentAsOne(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetParentAsOne");
    }
    public abstract String keepProductId_ExistsReferrer_MSetParentAsOne(MSetParentCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from m_set_structure where ...)} <br>
     * m_set_structure by PRODUCT_ID, named 'MSetStructureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMSetStructureList</span>(structureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     structureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MSetStructureList for 'exists'. (NotNull)
     */
    public void existsMSetStructureList(SubQuery<MSetStructureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSetStructureCB cb = new MSetStructureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_MSetStructureList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetStructureList");
    }
    public abstract String keepProductId_ExistsReferrer_MSetStructureList(MSetStructureCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TAllocInstBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepProductId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_alloc_lot where ...)} <br>
     * t_alloc_lot by PRODUCT_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocLotList for 'exists'. (NotNull)
     */
    public void existsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TAllocLotList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocLotList");
    }
    public abstract String keepProductId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by PRODUCT_ID, named 'TInventoryBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TInventoryBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tInventoryBList");
    }
    public abstract String keepProductId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_keeping_lot where ...)} <br>
     * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TKeepingLotList for 'exists'. (NotNull)
     */
    public void existsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TKeepingLotList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tKeepingLotList");
    }
    public abstract String keepProductId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_last_lot where ...)} <br>
     * t_last_lot by PRODUCT_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TLastLotList for 'exists'. (NotNull)
     */
    public void existsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TLastLotList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLastLotList");
    }
    public abstract String keepProductId_ExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_lot where ...)} <br>
     * t_lot by PRODUCT_ID, named 'TLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TLotList for 'exists'. (NotNull)
     */
    public void existsTLotList(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TLotList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLotList");
    }
    public abstract String keepProductId_ExistsReferrer_TLotList(TLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TMoveInstBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tMoveInstBList");
    }
    public abstract String keepProductId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_nizoroe_alarm_log where ...)} <br>
     * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTNizoroeAlarmLogList</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TNizoroeAlarmLogList for 'exists'. (NotNull)
     */
    public void existsTNizoroeAlarmLogList(SubQuery<TNizoroeAlarmLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TNizoroeAlarmLogCB cb = new TNizoroeAlarmLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TNizoroeAlarmLogList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tNizoroeAlarmLogList");
    }
    public abstract String keepProductId_ExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_operation_log where ...)} <br>
     * t_operation_log by PRODUCT_ID, named 'TOperationLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTOperationLogList</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TOperationLogList for 'exists'. (NotNull)
     */
    public void existsTOperationLogList(SubQuery<TOperationLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TOperationLogCB cb = new TOperationLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TOperationLogList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tOperationLogList");
    }
    public abstract String keepProductId_ExistsReferrer_TOperationLogList(TOperationLogCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TReceivePlanBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tReceivePlanBList");
    }
    public abstract String keepProductId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_serial_no where ...)} <br>
     * t_serial_no by PRODUCT_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TSerialNoList for 'exists'. (NotNull)
     */
    public void existsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TSerialNoList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tSerialNoList");
    }
    public abstract String keepProductId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TShippingInstBList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepProductId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_stock where ...)} <br>
     * t_stock by PRODUCT_ID, named 'TStockAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TStockList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockList");
    }
    public abstract String keepProductId_ExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from t_stock_book where ...)} <br>
     * t_stock_book by PRODUCT_ID, named 'TStockBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockBookList</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockBookList for 'exists'. (NotNull)
     */
    public void existsTStockBookList(SubQuery<TStockBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockBookCB cb = new TStockBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_TStockBookList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockBookList");
    }
    public abstract String keepProductId_ExistsReferrer_TStockBookList(TStockBookCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_ht_picking where ...)} <br>
     * w_ht_picking by PRODUCT_ID, named 'WHtPickingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtPickingList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtPickingList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtReceiveStoreList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_ht_shipping where ...)} <br>
     * w_ht_shipping by PRODUCT_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtShippingList for 'exists'. (NotNull)
     */
    public void existsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtShippingList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtShippingPickingList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WHtTotalPickingList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtTotalPickingList");
    }
    public abstract String keepProductId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_sgl_row_ship_insp_h where ...)} <br>
     * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WSglRowShipInspHList for 'exists'. (NotNull)
     */
    public void existsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WSglRowShipInspHList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepProductId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from w_shipping_interrupt where ...)} <br>
     * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WShippingInterruptList for 'exists'. (NotNull)
     */
    public void existsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_ExistsReferrer_WShippingInterruptList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepProductId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from h_stock_book where ...)} <br>
     * h_stock_book by PRODUCT_ID, named 'HStockBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHStockBookList</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_HStockBookList for 'not exists'. (NotNull)
     */
    public void notExistsHStockBookList(SubQuery<HStockBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HStockBookCB cb = new HStockBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_HStockBookList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "hStockBookList");
    }
    public abstract String keepProductId_NotExistsReferrer_HStockBookList(HStockBookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from m_deposit_product where ...)} <br>
     * m_deposit_product by PRODUCT_ID, named 'MDepositProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDepositProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MDepositProductList for 'not exists'. (NotNull)
     */
    public void notExistsMDepositProductList(SubQuery<MDepositProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MDepositProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mDepositProductList");
    }
    public abstract String keepProductId_NotExistsReferrer_MDepositProductList(MDepositProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLENISH_PRODUCT_ID from m_location where ...)} <br>
     * m_location by REPLENISH_PRODUCT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MLocationList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MLocationList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationList");
    }
    public abstract String keepProductId_NotExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLENISH_PRODUCT_ID from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationReplenishProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MLocationReplenishProductList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationReplenishProductList(SubQuery<MLocationReplenishProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MLocationReplenishProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationReplenishProductList");
    }
    public abstract String keepProductId_NotExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from m_product_shape where ...)} <br>
     * m_product_shape by PRODUCT_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMProductShapeList</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MProductShapeList for 'not exists'. (NotNull)
     */
    public void notExistsMProductShapeList(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MProductShapeList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductShapeList");
    }
    public abstract String keepProductId_NotExistsReferrer_MProductShapeList(MProductShapeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from m_set_parent where ...)} <br>
     * m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMSetParentAsOne</span>(parentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     parentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MSetParentAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMSetParentAsOne(SubQuery<MSetParentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSetParentCB cb = new MSetParentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MSetParentAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetParentAsOne");
    }
    public abstract String keepProductId_NotExistsReferrer_MSetParentAsOne(MSetParentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from m_set_structure where ...)} <br>
     * m_set_structure by PRODUCT_ID, named 'MSetStructureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMSetStructureList</span>(structureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     structureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_MSetStructureList for 'not exists'. (NotNull)
     */
    public void notExistsMSetStructureList(SubQuery<MSetStructureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSetStructureCB cb = new MSetStructureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_MSetStructureList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetStructureList");
    }
    public abstract String keepProductId_NotExistsReferrer_MSetStructureList(MSetStructureCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TAllocInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TAllocInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_alloc_lot where ...)} <br>
     * t_alloc_lot by PRODUCT_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TAllocLotList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TAllocLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocLotList");
    }
    public abstract String keepProductId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by PRODUCT_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TInventoryBList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TInventoryBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tInventoryBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_keeping_lot where ...)} <br>
     * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TKeepingLotList for 'not exists'. (NotNull)
     */
    public void notExistsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TKeepingLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tKeepingLotList");
    }
    public abstract String keepProductId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_last_lot where ...)} <br>
     * t_last_lot by PRODUCT_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TLastLotList for 'not exists'. (NotNull)
     */
    public void notExistsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TLastLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLastLotList");
    }
    public abstract String keepProductId_NotExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_lot where ...)} <br>
     * t_lot by PRODUCT_ID, named 'TLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TLotList for 'not exists'. (NotNull)
     */
    public void notExistsTLotList(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLotList");
    }
    public abstract String keepProductId_NotExistsReferrer_TLotList(TLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TMoveInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TMoveInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tMoveInstBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_nizoroe_alarm_log where ...)} <br>
     * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTNizoroeAlarmLogList</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TNizoroeAlarmLogList for 'not exists'. (NotNull)
     */
    public void notExistsTNizoroeAlarmLogList(SubQuery<TNizoroeAlarmLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TNizoroeAlarmLogCB cb = new TNizoroeAlarmLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TNizoroeAlarmLogList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tNizoroeAlarmLogList");
    }
    public abstract String keepProductId_NotExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_operation_log where ...)} <br>
     * t_operation_log by PRODUCT_ID, named 'TOperationLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTOperationLogList</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TOperationLogList for 'not exists'. (NotNull)
     */
    public void notExistsTOperationLogList(SubQuery<TOperationLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TOperationLogCB cb = new TOperationLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TOperationLogList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tOperationLogList");
    }
    public abstract String keepProductId_NotExistsReferrer_TOperationLogList(TOperationLogCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TReceivePlanBList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanBList(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TReceivePlanBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tReceivePlanBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_serial_no where ...)} <br>
     * t_serial_no by PRODUCT_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTSerialNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TSerialNoList for 'not exists'. (NotNull)
     */
    public void notExistsTSerialNoList(SubQuery<TSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TSerialNoList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tSerialNoList");
    }
    public abstract String keepProductId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TShippingInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TShippingInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepProductId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_stock where ...)} <br>
     * t_stock by PRODUCT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TStockList for 'not exists'. (NotNull)
     */
    public void notExistsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TStockList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockList");
    }
    public abstract String keepProductId_NotExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from t_stock_book where ...)} <br>
     * t_stock_book by PRODUCT_ID, named 'TStockBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockBookList</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_TStockBookList for 'not exists'. (NotNull)
     */
    public void notExistsTStockBookList(SubQuery<TStockBookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockBookCB cb = new TStockBookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_TStockBookList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockBookList");
    }
    public abstract String keepProductId_NotExistsReferrer_TStockBookList(TStockBookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_ht_picking where ...)} <br>
     * w_ht_picking by PRODUCT_ID, named 'WHtPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtPickingList(SubQuery<WHtPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtPickingList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveInspectionList</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspectionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtReceiveInspectionList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveInspectionList(SubQuery<WHtReceiveInspectionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtReceiveInspectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveInspectionList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtReceiveNoPlanInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveNoPlanInspList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveStoreList</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     storeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtReceiveStoreList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveStoreList(SubQuery<WHtReceiveStoreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtReceiveStoreList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveStoreList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_ht_shipping where ...)} <br>
     * w_ht_shipping by PRODUCT_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingList</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtShippingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingList(SubQuery<WHtShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtShippingList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtShippingPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtShippingPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtShippingPickingList(SubQuery<WHtShippingPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtShippingPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingPickingList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtTotalPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WHtTotalPickingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtTotalPickingList(SubQuery<WHtTotalPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WHtTotalPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtTotalPickingList");
    }
    public abstract String keepProductId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_sgl_row_ship_insp_h where ...)} <br>
     * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WSglRowShipInspHList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspHList(SubQuery<WSglRowShipInspHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WSglRowShipInspHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wSglRowShipInspHList");
    }
    public abstract String keepProductId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from w_shipping_interrupt where ...)} <br>
     * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWShippingInterruptList</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductId_NotExistsReferrer_WShippingInterruptList for 'not exists'. (NotNull)
     */
    public void notExistsWShippingInterruptList(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductId_NotExistsReferrer_WShippingInterruptList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wShippingInterruptList");
    }
    public abstract String keepProductId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    public void xsderiveHStockBookList(String fn, SubQuery<HStockBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockBookCB cb = new HStockBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_HStockBookList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "hStockBookList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_HStockBookList(HStockBookCQ sq);

    public void xsderiveMDepositProductList(String fn, SubQuery<MDepositProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MDepositProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mDepositProductList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MDepositProductList(MDepositProductCQ sq);

    public void xsderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MLocationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq);

    public void xsderiveMLocationReplenishProductList(String fn, SubQuery<MLocationReplenishProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MLocationReplenishProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", pp, "mLocationReplenishProductList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    public void xsderiveMProductShapeList(String fn, SubQuery<MProductShapeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MProductShapeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProductShapeList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MProductShapeList(MProductShapeCQ sq);

    public void xsderiveMSetStructureList(String fn, SubQuery<MSetStructureCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MSetStructureCB cb = new MSetStructureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_MSetStructureList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mSetStructureList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_MSetStructureList(MSetStructureCQ sq);

    public void xsderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TAllocInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocInstBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);

    public void xsderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TAllocLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tAllocLotList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq);

    public void xsderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TInventoryBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tInventoryBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq);

    public void xsderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TKeepingLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tKeepingLotList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);

    public void xsderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TLastLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLastLotList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq);

    public void xsderiveTLotList(String fn, SubQuery<TLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLotCB cb = new TLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tLotList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TLotList(TLotCQ sq);

    public void xsderiveTMoveInstBList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TMoveInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tMoveInstBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq);

    public void xsderiveTNizoroeAlarmLogList(String fn, SubQuery<TNizoroeAlarmLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TNizoroeAlarmLogCB cb = new TNizoroeAlarmLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TNizoroeAlarmLogList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tNizoroeAlarmLogList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq);

    public void xsderiveTOperationLogList(String fn, SubQuery<TOperationLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TOperationLogCB cb = new TOperationLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TOperationLogList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tOperationLogList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TOperationLogList(TOperationLogCQ sq);

    public void xsderiveTReceivePlanBList(String fn, SubQuery<TReceivePlanBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TReceivePlanBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tReceivePlanBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    public void xsderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TSerialNoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tSerialNoList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq);

    public void xsderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TShippingInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tShippingInstBList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);

    public void xsderiveTStockList(String fn, SubQuery<TStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TStockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TStockList(TStockCQ sq);

    public void xsderiveTStockBookList(String fn, SubQuery<TStockBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockBookCB cb = new TStockBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_TStockBookList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "tStockBookList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_TStockBookList(TStockBookCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtPickingList(String fn, SubQuery<WHtPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtPickingCB cb = new WHtPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtPickingList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq);

    public void xsderiveWHtReceiveInspectionList(String fn, SubQuery<WHtReceiveInspectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveInspectionCB cb = new WHtReceiveInspectionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveInspectionList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);

    public void xsderiveWHtReceiveNoPlanInspList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveNoPlanInspList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveStoreList(String fn, SubQuery<WHtReceiveStoreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveStoreCB cb = new WHtReceiveStoreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtReceiveStoreList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtReceiveStoreList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);

    public void xsderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtShippingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq);

    public void xsderiveWHtShippingPickingList(String fn, SubQuery<WHtShippingPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingPickingCB cb = new WHtShippingPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtShippingPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtShippingPickingList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);

    public void xsderiveWHtTotalPickingList(String fn, SubQuery<WHtTotalPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtTotalPickingCB cb = new WHtTotalPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WHtTotalPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wHtTotalPickingList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);

    public void xsderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WSglRowShipInspHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wSglRowShipInspHList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);

    public void xsderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductId_SpecifyDerivedReferrer_WShippingInterruptList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "wShippingInterruptList", al, op);
    }
    public abstract String keepProductId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from h_stock_book where ...)} <br>
     * h_stock_book by PRODUCT_ID, named 'HStockBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHStockBookList()</span>.<span style="color: #CC4747">max</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bookCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HStockBookCB> derivedHStockBookList() {
        return xcreateQDRFunctionHStockBookList();
    }
    protected HpQDRFunction<HStockBookCB> xcreateQDRFunctionHStockBookList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHStockBookList(fn, sq, rd, vl, op));
    }
    public void xqderiveHStockBookList(String fn, SubQuery<HStockBookCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HStockBookCB cb = new HStockBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_HStockBookList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_HStockBookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "hStockBookList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_HStockBookList(HStockBookCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_HStockBookListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_deposit_product where ...)} <br>
     * m_deposit_product by PRODUCT_ID, named 'MDepositProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMDepositProductList()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MDepositProductCB> derivedMDepositProductList() {
        return xcreateQDRFunctionMDepositProductList();
    }
    protected HpQDRFunction<MDepositProductCB> xcreateQDRFunctionMDepositProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMDepositProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveMDepositProductList(String fn, SubQuery<MDepositProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MDepositProductList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MDepositProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "mDepositProductList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MDepositProductList(MDepositProductCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MDepositProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_location where ...)} <br>
     * m_location by REPLENISH_PRODUCT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationList()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     locationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> derivedMLocationList() {
        return xcreateQDRFunctionMLocationList();
    }
    protected HpQDRFunction<MLocationCB> xcreateQDRFunctionMLocationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MLocationList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MLocationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", sqpp, "mLocationList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MLocationList(MLocationCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MLocationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MLocationReplenishProductList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MLocationReplenishProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "REPLENISH_PRODUCT_ID", sqpp, "mLocationReplenishProductList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MLocationReplenishProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_product_shape where ...)} <br>
     * m_product_shape by PRODUCT_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMProductShapeList()</span>.<span style="color: #CC4747">max</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     shapeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MProductShapeCB> derivedMProductShapeList() {
        return xcreateQDRFunctionMProductShapeList();
    }
    protected HpQDRFunction<MProductShapeCB> xcreateQDRFunctionMProductShapeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMProductShapeList(fn, sq, rd, vl, op));
    }
    public void xqderiveMProductShapeList(String fn, SubQuery<MProductShapeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MProductShapeList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MProductShapeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "mProductShapeList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MProductShapeList(MProductShapeCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MProductShapeListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_set_structure where ...)} <br>
     * m_set_structure by PRODUCT_ID, named 'MSetStructureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMSetStructureList()</span>.<span style="color: #CC4747">max</span>(structureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     structureCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     structureCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MSetStructureCB> derivedMSetStructureList() {
        return xcreateQDRFunctionMSetStructureList();
    }
    protected HpQDRFunction<MSetStructureCB> xcreateQDRFunctionMSetStructureList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMSetStructureList(fn, sq, rd, vl, op));
    }
    public void xqderiveMSetStructureList(String fn, SubQuery<MSetStructureCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MSetStructureCB cb = new MSetStructureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_MSetStructureList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_MSetStructureListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "mSetStructureList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_MSetStructureList(MSetStructureCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_MSetStructureListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TAllocInstBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TAllocInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tAllocInstBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_lot where ...)} <br>
     * t_alloc_lot by PRODUCT_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocLotCB> derivedTAllocLotList() {
        return xcreateQDRFunctionTAllocLotList();
    }
    protected HpQDRFunction<TAllocLotCB> xcreateQDRFunctionTAllocLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TAllocLotList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TAllocLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tAllocLotList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TAllocLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by PRODUCT_ID, named 'TInventoryBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TInventoryBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TInventoryBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tInventoryBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TInventoryBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_keeping_lot where ...)} <br>
     * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTKeepingLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TKeepingLotCB> derivedTKeepingLotList() {
        return xcreateQDRFunctionTKeepingLotList();
    }
    protected HpQDRFunction<TKeepingLotCB> xcreateQDRFunctionTKeepingLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTKeepingLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TKeepingLotList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TKeepingLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tKeepingLotList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TKeepingLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_last_lot where ...)} <br>
     * t_last_lot by PRODUCT_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTLastLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TLastLotCB> derivedTLastLotList() {
        return xcreateQDRFunctionTLastLotList();
    }
    protected HpQDRFunction<TLastLotCB> xcreateQDRFunctionTLastLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTLastLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TLastLotList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TLastLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tLastLotList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TLastLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_lot where ...)} <br>
     * t_lot by PRODUCT_ID, named 'TLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TLotCB> derivedTLotList() {
        return xcreateQDRFunctionTLotList();
    }
    protected HpQDRFunction<TLotCB> xcreateQDRFunctionTLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTLotList(String fn, SubQuery<TLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLotCB cb = new TLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TLotList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tLotList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TLotList(TLotCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_inst_b where ...)} <br>
     * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TMoveInstBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TMoveInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tMoveInstBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_nizoroe_alarm_log where ...)} <br>
     * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTNizoroeAlarmLogList()</span>.<span style="color: #CC4747">max</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     logCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TNizoroeAlarmLogCB> derivedTNizoroeAlarmLogList() {
        return xcreateQDRFunctionTNizoroeAlarmLogList();
    }
    protected HpQDRFunction<TNizoroeAlarmLogCB> xcreateQDRFunctionTNizoroeAlarmLogList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTNizoroeAlarmLogList(fn, sq, rd, vl, op));
    }
    public void xqderiveTNizoroeAlarmLogList(String fn, SubQuery<TNizoroeAlarmLogCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TNizoroeAlarmLogCB cb = new TNizoroeAlarmLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TNizoroeAlarmLogList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tNizoroeAlarmLogList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_operation_log where ...)} <br>
     * t_operation_log by PRODUCT_ID, named 'TOperationLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTOperationLogList()</span>.<span style="color: #CC4747">max</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     logCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TOperationLogCB> derivedTOperationLogList() {
        return xcreateQDRFunctionTOperationLogList();
    }
    protected HpQDRFunction<TOperationLogCB> xcreateQDRFunctionTOperationLogList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTOperationLogList(fn, sq, rd, vl, op));
    }
    public void xqderiveTOperationLogList(String fn, SubQuery<TOperationLogCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TOperationLogCB cb = new TOperationLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TOperationLogList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TOperationLogListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tOperationLogList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TOperationLogList(TOperationLogCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TOperationLogListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TReceivePlanBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TReceivePlanBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tReceivePlanBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TReceivePlanBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_serial_no where ...)} <br>
     * t_serial_no by PRODUCT_ID, named 'TSerialNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTSerialNoList()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     noCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TSerialNoCB> derivedTSerialNoList() {
        return xcreateQDRFunctionTSerialNoList();
    }
    protected HpQDRFunction<TSerialNoCB> xcreateQDRFunctionTSerialNoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTSerialNoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTSerialNoList(String fn, SubQuery<TSerialNoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TSerialNoCB cb = new TSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TSerialNoList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TSerialNoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tSerialNoList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TSerialNoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TShippingInstBList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TShippingInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tShippingInstBList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_stock where ...)} <br>
     * t_stock by PRODUCT_ID, named 'TStockAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TStockList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TStockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tStockList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TStockList(TStockCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TStockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_stock_book where ...)} <br>
     * t_stock_book by PRODUCT_ID, named 'TStockBookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockBookList()</span>.<span style="color: #CC4747">max</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bookCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockBookCB> derivedTStockBookList() {
        return xcreateQDRFunctionTStockBookList();
    }
    protected HpQDRFunction<TStockBookCB> xcreateQDRFunctionTStockBookList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockBookList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockBookList(String fn, SubQuery<TStockBookCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockBookCB cb = new TStockBookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_TStockBookList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_TStockBookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "tStockBookList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_TStockBookList(TStockBookCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_TStockBookListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_picking where ...)} <br>
     * w_ht_picking by PRODUCT_ID, named 'WHtPickingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtPickingList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtPickingList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_inspection where ...)} <br>
     * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtReceiveInspectionList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtReceiveInspectionList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtReceiveNoPlanInspList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_store where ...)} <br>
     * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtReceiveStoreList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtReceiveStoreList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_shipping where ...)} <br>
     * w_ht_shipping by PRODUCT_ID, named 'WHtShippingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtShippingList()</span>.<span style="color: #CC4747">max</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shippingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     shippingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtShippingCB> derivedWHtShippingList() {
        return xcreateQDRFunctionWHtShippingList();
    }
    protected HpQDRFunction<WHtShippingCB> xcreateQDRFunctionWHtShippingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtShippingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtShippingList(String fn, SubQuery<WHtShippingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtShippingCB cb = new WHtShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtShippingList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtShippingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtShippingList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtShippingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_shipping_picking where ...)} <br>
     * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtShippingPickingList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtShippingPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtShippingPickingList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_total_picking where ...)} <br>
     * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WHtTotalPickingList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WHtTotalPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wHtTotalPickingList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_sgl_row_ship_insp_h where ...)} <br>
     * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWSglRowShipInspHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WSglRowShipInspHCB> derivedWSglRowShipInspHList() {
        return xcreateQDRFunctionWSglRowShipInspHList();
    }
    protected HpQDRFunction<WSglRowShipInspHCB> xcreateQDRFunctionWSglRowShipInspHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWSglRowShipInspHList(fn, sq, rd, vl, op));
    }
    public void xqderiveWSglRowShipInspHList(String fn, SubQuery<WSglRowShipInspHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspHCB cb = new WSglRowShipInspHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WSglRowShipInspHList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wSglRowShipInspHList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_shipping_interrupt where ...)} <br>
     * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWShippingInterruptList()</span>.<span style="color: #CC4747">max</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     interruptCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     interruptCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WShippingInterruptCB> derivedWShippingInterruptList() {
        return xcreateQDRFunctionWShippingInterruptList();
    }
    protected HpQDRFunction<WShippingInterruptCB> xcreateQDRFunctionWShippingInterruptList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWShippingInterruptList(fn, sq, rd, vl, op));
    }
    public void xqderiveWShippingInterruptList(String fn, SubQuery<WShippingInterruptCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductId_QueryDerivedReferrer_WShippingInterruptList(cb.query()); String prpp = keepProductId_QueryDerivedReferrer_WShippingInterruptListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_ID", "PRODUCT_ID", sqpp, "wShippingInterruptList", rd, vl, prpp, op);
    }
    public abstract String keepProductId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq);
    public abstract String keepProductId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from m_client where ...)} <br />
     * m_client by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from m_client where ...)} <br />
     * m_client by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNm The value of productNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_Equal(String productNm) {
        doSetProductNm_Equal(fRES(productNm));
    }

    protected void doSetProductNm_Equal(String productNm) {
        regProductNm(CK_EQ, productNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNm The value of productNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotEqual(String productNm) {
        doSetProductNm_NotEqual(fRES(productNm));
    }

    protected void doSetProductNm_NotEqual(String productNm) {
        regProductNm(CK_NES, productNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNmList The collection of productNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_InScope(Collection<String> productNmList) {
        doSetProductNm_InScope(productNmList);
    }

    protected void doSetProductNm_InScope(Collection<String> productNmList) {
        regINS(CK_INS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNmList The collection of productNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotInScope(Collection<String> productNmList) {
        doSetProductNm_NotInScope(productNmList);
    }

    protected void doSetProductNm_NotInScope(Collection<String> productNmList) {
        regINS(CK_NINS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setProductNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNm The value of productNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNm_LikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbr The value of productAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_Equal(String productAbbr) {
        doSetProductAbbr_Equal(fRES(productAbbr));
    }

    protected void doSetProductAbbr_Equal(String productAbbr) {
        regProductAbbr(CK_EQ, productAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbr The value of productAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_NotEqual(String productAbbr) {
        doSetProductAbbr_NotEqual(fRES(productAbbr));
    }

    protected void doSetProductAbbr_NotEqual(String productAbbr) {
        regProductAbbr(CK_NES, productAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbr The value of productAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_GreaterThan(String productAbbr) {
        regProductAbbr(CK_GT, fRES(productAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbr The value of productAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_LessThan(String productAbbr) {
        regProductAbbr(CK_LT, fRES(productAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbr The value of productAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_GreaterEqual(String productAbbr) {
        regProductAbbr(CK_GE, fRES(productAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbr The value of productAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_LessEqual(String productAbbr) {
        regProductAbbr(CK_LE, fRES(productAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbrList The collection of productAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_InScope(Collection<String> productAbbrList) {
        doSetProductAbbr_InScope(productAbbrList);
    }

    protected void doSetProductAbbr_InScope(Collection<String> productAbbrList) {
        regINS(CK_INS, cTL(productAbbrList), xgetCValueProductAbbr(), "PRODUCT_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbrList The collection of productAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_NotInScope(Collection<String> productAbbrList) {
        doSetProductAbbr_NotInScope(productAbbrList);
    }

    protected void doSetProductAbbr_NotInScope(Collection<String> productAbbrList) {
        regINS(CK_NINS, cTL(productAbbrList), xgetCValueProductAbbr(), "PRODUCT_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)} <br>
     * <pre>e.g. setProductAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productAbbr The value of productAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductAbbr_LikeSearch(String productAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productAbbr), xgetCValueProductAbbr(), "PRODUCT_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbr The value of productAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductAbbr_NotLikeSearch(String productAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productAbbr), xgetCValueProductAbbr(), "PRODUCT_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @param productAbbr The value of productAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_PrefixSearch(String productAbbr) {
        setProductAbbr_LikeSearch(productAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     */
    public void setProductAbbr_IsNull() { regProductAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     */
    public void setProductAbbr_IsNullOrEmpty() { regProductAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     */
    public void setProductAbbr_IsNotNull() { regProductAbbr(CK_ISNN, DOBJ); }

    protected void regProductAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductAbbr(), "PRODUCT_ABBR"); }
    protected abstract ConditionValue xgetCValueProductAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCd The value of janCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_Equal(String janCd) {
        doSetJanCd_Equal(fRES(janCd));
    }

    protected void doSetJanCd_Equal(String janCd) {
        regJanCd(CK_EQ, janCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCd The value of janCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotEqual(String janCd) {
        doSetJanCd_NotEqual(fRES(janCd));
    }

    protected void doSetJanCd_NotEqual(String janCd) {
        regJanCd(CK_NES, janCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCd The value of janCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterThan(String janCd) {
        regJanCd(CK_GT, fRES(janCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCd The value of janCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessThan(String janCd) {
        regJanCd(CK_LT, fRES(janCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCd The value of janCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterEqual(String janCd) {
        regJanCd(CK_GE, fRES(janCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCd The value of janCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessEqual(String janCd) {
        regJanCd(CK_LE, fRES(janCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCdList The collection of janCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_InScope(Collection<String> janCdList) {
        doSetJanCd_InScope(janCdList);
    }

    protected void doSetJanCd_InScope(Collection<String> janCdList) {
        regINS(CK_INS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCdList The collection of janCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotInScope(Collection<String> janCdList) {
        doSetJanCd_NotInScope(janCdList);
    }

    protected void doSetJanCd_NotInScope(Collection<String> janCdList) {
        regINS(CK_NINS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param janCd The value of janCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJanCd_LikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCd The value of janCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJanCd_NotLikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @param janCd The value of janCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_PrefixSearch(String janCd) {
        setJanCd_LikeSearch(janCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     */
    public void setJanCd_IsNull() { regJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     */
    public void setJanCd_IsNullOrEmpty() { regJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     */
    public void setJanCd_IsNotNull() { regJanCd(CK_ISNN, DOBJ); }

    protected void regJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJanCd(), "JAN_CD"); }
    protected abstract ConditionValue xgetCValueJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlg The value of lotManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_Equal(String lotManagFlg) {
        doSetLotManagFlg_Equal(fRES(lotManagFlg));
    }

    /**
     * Equal(=). As LotManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagFlg_Equal_AsLotManagFlg(CDef.LotManagFlg cdef) {
        doSetLotManagFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotManagFlg_Equal_$1() {
        setLotManagFlg_Equal_AsLotManagFlg(CDef.LotManagFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotManagFlg_Equal_$0() {
        setLotManagFlg_Equal_AsLotManagFlg(CDef.LotManagFlg.$0);
    }

    protected void doSetLotManagFlg_Equal(String lotManagFlg) {
        regLotManagFlg(CK_EQ, lotManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlg The value of lotManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotEqual(String lotManagFlg) {
        doSetLotManagFlg_NotEqual(fRES(lotManagFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LotManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotEqual_AsLotManagFlg(CDef.LotManagFlg cdef) {
        doSetLotManagFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotManagFlg_NotEqual_$1() {
        setLotManagFlg_NotEqual_AsLotManagFlg(CDef.LotManagFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotManagFlg_NotEqual_$0() {
        setLotManagFlg_NotEqual_AsLotManagFlg(CDef.LotManagFlg.$0);
    }

    protected void doSetLotManagFlg_NotEqual(String lotManagFlg) {
        regLotManagFlg(CK_NES, lotManagFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlgList The collection of lotManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_InScope(Collection<String> lotManagFlgList) {
        doSetLotManagFlg_InScope(lotManagFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LotManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_InScope_AsLotManagFlg(Collection<CDef.LotManagFlg> cdefList) {
        doSetLotManagFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLotManagFlg_InScope(Collection<String> lotManagFlgList) {
        regINS(CK_INS, cTL(lotManagFlgList), xgetCValueLotManagFlg(), "LOT_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @param lotManagFlgList The collection of lotManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotInScope(Collection<String> lotManagFlgList) {
        doSetLotManagFlg_NotInScope(lotManagFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LotManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagFlg_NotInScope_AsLotManagFlg(Collection<CDef.LotManagFlg> cdefList) {
        doSetLotManagFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLotManagFlg_NotInScope(Collection<String> lotManagFlgList) {
        regINS(CK_NINS, cTL(lotManagFlgList), xgetCValueLotManagFlg(), "LOT_MANAG_FLG");
    }

    protected void regLotManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotManagFlg(), "LOT_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueLotManagFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlg The value of limitDtManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_Equal(String limitDtManagFlg) {
        doSetLimitDtManagFlg_Equal(fRES(limitDtManagFlg));
    }

    /**
     * Equal(=). As LimitDtManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_Equal_AsLimitDtManagFlg(CDef.LimitDtManagFlg cdef) {
        doSetLimitDtManagFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtManagFlg_Equal_$1() {
        setLimitDtManagFlg_Equal_AsLimitDtManagFlg(CDef.LimitDtManagFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtManagFlg_Equal_$0() {
        setLimitDtManagFlg_Equal_AsLimitDtManagFlg(CDef.LimitDtManagFlg.$0);
    }

    protected void doSetLimitDtManagFlg_Equal(String limitDtManagFlg) {
        regLimitDtManagFlg(CK_EQ, limitDtManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlg The value of limitDtManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotEqual(String limitDtManagFlg) {
        doSetLimitDtManagFlg_NotEqual(fRES(limitDtManagFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitDtManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotEqual_AsLimitDtManagFlg(CDef.LimitDtManagFlg cdef) {
        doSetLimitDtManagFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtManagFlg_NotEqual_$1() {
        setLimitDtManagFlg_NotEqual_AsLimitDtManagFlg(CDef.LimitDtManagFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtManagFlg_NotEqual_$0() {
        setLimitDtManagFlg_NotEqual_AsLimitDtManagFlg(CDef.LimitDtManagFlg.$0);
    }

    protected void doSetLimitDtManagFlg_NotEqual(String limitDtManagFlg) {
        regLimitDtManagFlg(CK_NES, limitDtManagFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlgList The collection of limitDtManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_InScope(Collection<String> limitDtManagFlgList) {
        doSetLimitDtManagFlg_InScope(limitDtManagFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitDtManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_InScope_AsLimitDtManagFlg(Collection<CDef.LimitDtManagFlg> cdefList) {
        doSetLimitDtManagFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtManagFlg_InScope(Collection<String> limitDtManagFlgList) {
        regINS(CK_INS, cTL(limitDtManagFlgList), xgetCValueLimitDtManagFlg(), "LIMIT_DT_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @param limitDtManagFlgList The collection of limitDtManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotInScope(Collection<String> limitDtManagFlgList) {
        doSetLimitDtManagFlg_NotInScope(limitDtManagFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitDtManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtManagFlg_NotInScope_AsLimitDtManagFlg(Collection<CDef.LimitDtManagFlg> cdefList) {
        doSetLimitDtManagFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtManagFlg_NotInScope(Collection<String> limitDtManagFlgList) {
        regINS(CK_NINS, cTL(limitDtManagFlgList), xgetCValueLimitDtManagFlg(), "LIMIT_DT_MANAG_FLG");
    }

    protected void regLimitDtManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtManagFlg(), "LIMIT_DT_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueLimitDtManagFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param receiveLimitNum The value of receiveLimitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_Equal(Long receiveLimitNum) {
        doSetReceiveLimitNum_Equal(receiveLimitNum);
    }

    protected void doSetReceiveLimitNum_Equal(Long receiveLimitNum) {
        regReceiveLimitNum(CK_EQ, receiveLimitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param receiveLimitNum The value of receiveLimitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_NotEqual(Long receiveLimitNum) {
        doSetReceiveLimitNum_NotEqual(receiveLimitNum);
    }

    protected void doSetReceiveLimitNum_NotEqual(Long receiveLimitNum) {
        regReceiveLimitNum(CK_NES, receiveLimitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param receiveLimitNum The value of receiveLimitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_GreaterThan(Long receiveLimitNum) {
        regReceiveLimitNum(CK_GT, receiveLimitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param receiveLimitNum The value of receiveLimitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_LessThan(Long receiveLimitNum) {
        regReceiveLimitNum(CK_LT, receiveLimitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param receiveLimitNum The value of receiveLimitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_GreaterEqual(Long receiveLimitNum) {
        regReceiveLimitNum(CK_GE, receiveLimitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param receiveLimitNum The value of receiveLimitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_LessEqual(Long receiveLimitNum) {
        regReceiveLimitNum(CK_LE, receiveLimitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param minNumber The min number of receiveLimitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveLimitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveLimitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveLimitNum(), "RECEIVE_LIMIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param receiveLimitNumList The collection of receiveLimitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_InScope(Collection<Long> receiveLimitNumList) {
        doSetReceiveLimitNum_InScope(receiveLimitNumList);
    }

    protected void doSetReceiveLimitNum_InScope(Collection<Long> receiveLimitNumList) {
        regINS(CK_INS, cTL(receiveLimitNumList), xgetCValueReceiveLimitNum(), "RECEIVE_LIMIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param receiveLimitNumList The collection of receiveLimitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLimitNum_NotInScope(Collection<Long> receiveLimitNumList) {
        doSetReceiveLimitNum_NotInScope(receiveLimitNumList);
    }

    protected void doSetReceiveLimitNum_NotInScope(Collection<Long> receiveLimitNumList) {
        regINS(CK_NINS, cTL(receiveLimitNumList), xgetCValueReceiveLimitNum(), "RECEIVE_LIMIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     */
    public void setReceiveLimitNum_IsNull() { regReceiveLimitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     */
    public void setReceiveLimitNum_IsNotNull() { regReceiveLimitNum(CK_ISNN, DOBJ); }

    protected void regReceiveLimitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveLimitNum(), "RECEIVE_LIMIT_NUM"); }
    protected abstract ConditionValue xgetCValueReceiveLimitNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param shippingLimitNum The value of shippingLimitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_Equal(Long shippingLimitNum) {
        doSetShippingLimitNum_Equal(shippingLimitNum);
    }

    protected void doSetShippingLimitNum_Equal(Long shippingLimitNum) {
        regShippingLimitNum(CK_EQ, shippingLimitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param shippingLimitNum The value of shippingLimitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_NotEqual(Long shippingLimitNum) {
        doSetShippingLimitNum_NotEqual(shippingLimitNum);
    }

    protected void doSetShippingLimitNum_NotEqual(Long shippingLimitNum) {
        regShippingLimitNum(CK_NES, shippingLimitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param shippingLimitNum The value of shippingLimitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_GreaterThan(Long shippingLimitNum) {
        regShippingLimitNum(CK_GT, shippingLimitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param shippingLimitNum The value of shippingLimitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_LessThan(Long shippingLimitNum) {
        regShippingLimitNum(CK_LT, shippingLimitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param shippingLimitNum The value of shippingLimitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_GreaterEqual(Long shippingLimitNum) {
        regShippingLimitNum(CK_GE, shippingLimitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param shippingLimitNum The value of shippingLimitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingLimitNum_LessEqual(Long shippingLimitNum) {
        regShippingLimitNum(CK_LE, shippingLimitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param minNumber The min number of shippingLimitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingLimitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingLimitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingLimitNum(), "SHIPPING_LIMIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param shippingLimitNumList The collection of shippingLimitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitNum_InScope(Collection<Long> shippingLimitNumList) {
        doSetShippingLimitNum_InScope(shippingLimitNumList);
    }

    protected void doSetShippingLimitNum_InScope(Collection<Long> shippingLimitNumList) {
        regINS(CK_INS, cTL(shippingLimitNumList), xgetCValueShippingLimitNum(), "SHIPPING_LIMIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @param shippingLimitNumList The collection of shippingLimitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingLimitNum_NotInScope(Collection<Long> shippingLimitNumList) {
        doSetShippingLimitNum_NotInScope(shippingLimitNumList);
    }

    protected void doSetShippingLimitNum_NotInScope(Collection<Long> shippingLimitNumList) {
        regINS(CK_NINS, cTL(shippingLimitNumList), xgetCValueShippingLimitNum(), "SHIPPING_LIMIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     */
    public void setShippingLimitNum_IsNull() { regShippingLimitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     */
    public void setShippingLimitNum_IsNotNull() { regShippingLimitNum(CK_ISNN, DOBJ); }

    protected void regShippingLimitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingLimitNum(), "SHIPPING_LIMIT_NUM"); }
    protected abstract ConditionValue xgetCValueShippingLimitNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeCls The value of mergeCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_Equal(String mergeCls) {
        doSetMergeCls_Equal(fRES(mergeCls));
    }

    /**
     * Equal(=). As MergeCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCls_Equal_AsMergeCls(CDef.MergeCls cdef) {
        doSetMergeCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: マージしない
     */
    public void setMergeCls_Equal_$00() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_Equal_$01() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 自動マージ
     */
    public void setMergeCls_Equal_$02() {
        setMergeCls_Equal_AsMergeCls(CDef.MergeCls.$02);
    }

    protected void doSetMergeCls_Equal(String mergeCls) {
        regMergeCls(CK_EQ, mergeCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeCls The value of mergeCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotEqual(String mergeCls) {
        doSetMergeCls_NotEqual(fRES(mergeCls));
    }

    /**
     * NotEqual(&lt;&gt;). As MergeCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls cdef) {
        doSetMergeCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: マージしない
     */
    public void setMergeCls_NotEqual_$00() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_NotEqual_$01() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 自動マージ
     */
    public void setMergeCls_NotEqual_$02() {
        setMergeCls_NotEqual_AsMergeCls(CDef.MergeCls.$02);
    }

    protected void doSetMergeCls_NotEqual(String mergeCls) {
        regMergeCls(CK_NES, mergeCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeClsList The collection of mergeCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_InScope(Collection<String> mergeClsList) {
        doSetMergeCls_InScope(mergeClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As MergeCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_InScope_AsMergeCls(Collection<CDef.MergeCls> cdefList) {
        doSetMergeCls_InScope(cTStrL(cdefList));
    }

    protected void doSetMergeCls_InScope(Collection<String> mergeClsList) {
        regINS(CK_INS, cTL(mergeClsList), xgetCValueMergeCls(), "MERGE_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @param mergeClsList The collection of mergeCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotInScope(Collection<String> mergeClsList) {
        doSetMergeCls_NotInScope(mergeClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MergeCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeCls_NotInScope_AsMergeCls(Collection<CDef.MergeCls> cdefList) {
        doSetMergeCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMergeCls_NotInScope(Collection<String> mergeClsList) {
        regINS(CK_NINS, cTL(mergeClsList), xgetCValueMergeCls(), "MERGE_CLS");
    }

    protected void regMergeCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeCls(), "MERGE_CLS"); }
    protected abstract ConditionValue xgetCValueMergeCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlg The value of lotReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_Equal(String lotReverseFlg) {
        doSetLotReverseFlg_Equal(fRES(lotReverseFlg));
    }

    /**
     * Equal(=). As LotReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg cdef) {
        doSetLotReverseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_Equal_$1() {
        setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_Equal_$0() {
        setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    protected void doSetLotReverseFlg_Equal(String lotReverseFlg) {
        regLotReverseFlg(CK_EQ, lotReverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlg The value of lotReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotEqual(String lotReverseFlg) {
        doSetLotReverseFlg_NotEqual(fRES(lotReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LotReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg cdef) {
        doSetLotReverseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_NotEqual_$1() {
        setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_NotEqual_$0() {
        setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    protected void doSetLotReverseFlg_NotEqual(String lotReverseFlg) {
        regLotReverseFlg(CK_NES, lotReverseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlgList The collection of lotReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_InScope(Collection<String> lotReverseFlgList) {
        doSetLotReverseFlg_InScope(lotReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LotReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_InScope_AsLotReverseFlg(Collection<CDef.LotReverseFlg> cdefList) {
        doSetLotReverseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLotReverseFlg_InScope(Collection<String> lotReverseFlgList) {
        regINS(CK_INS, cTL(lotReverseFlgList), xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlgList The collection of lotReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotInScope(Collection<String> lotReverseFlgList) {
        doSetLotReverseFlg_NotInScope(lotReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LotReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotInScope_AsLotReverseFlg(Collection<CDef.LotReverseFlg> cdefList) {
        doSetLotReverseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLotReverseFlg_NotInScope(Collection<String> lotReverseFlgList) {
        regINS(CK_NINS, cTL(lotReverseFlgList), xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNull() { regLotReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNullOrEmpty() { regLotReverseFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNotNull() { regLotReverseFlg(CK_ISNN, DOBJ); }

    protected void regLotReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLotReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_Equal(fRES(limitDtReverseFlg));
    }

    /**
     * Equal(=). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        doSetLimitDtReverseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_Equal_$1() {
        setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_Equal_$0() {
        setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    protected void doSetLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        regLimitDtReverseFlg(CK_EQ, limitDtReverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_NotEqual(fRES(limitDtReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        doSetLimitDtReverseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_NotEqual_$1() {
        setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_NotEqual_$0() {
        setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    protected void doSetLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        regLimitDtReverseFlg(CK_NES, limitDtReverseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_InScope(limitDtReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope_AsLimitDtReverseFlg(Collection<CDef.LimitDtReverseFlg> cdefList) {
        doSetLimitDtReverseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        regINS(CK_INS, cTL(limitDtReverseFlgList), xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_NotInScope(limitDtReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope_AsLimitDtReverseFlg(Collection<CDef.LimitDtReverseFlg> cdefList) {
        doSetLimitDtReverseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        regINS(CK_NINS, cTL(limitDtReverseFlgList), xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNull() { regLimitDtReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNullOrEmpty() { regLimitDtReverseFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNotNull() { regLimitDtReverseFlg(CK_ISNN, DOBJ); }

    protected void regLimitDtReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLimitDtReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlg The value of shippingStopFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_Equal(String shippingStopFlg) {
        doSetShippingStopFlg_Equal(fRES(shippingStopFlg));
    }

    /**
     * Equal(=). As ShippingStopFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        doSetShippingStopFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_Equal_$1() {
        setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_Equal_$0() {
        setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    protected void doSetShippingStopFlg_Equal(String shippingStopFlg) {
        regShippingStopFlg(CK_EQ, shippingStopFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlg The value of shippingStopFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotEqual(String shippingStopFlg) {
        doSetShippingStopFlg_NotEqual(fRES(shippingStopFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ShippingStopFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        doSetShippingStopFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_NotEqual_$1() {
        setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_NotEqual_$0() {
        setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    protected void doSetShippingStopFlg_NotEqual(String shippingStopFlg) {
        regShippingStopFlg(CK_NES, shippingStopFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlgList The collection of shippingStopFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_InScope(Collection<String> shippingStopFlgList) {
        doSetShippingStopFlg_InScope(shippingStopFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ShippingStopFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_InScope_AsShippingStopFlg(Collection<CDef.ShippingStopFlg> cdefList) {
        doSetShippingStopFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetShippingStopFlg_InScope(Collection<String> shippingStopFlgList) {
        regINS(CK_INS, cTL(shippingStopFlgList), xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlgList The collection of shippingStopFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotInScope(Collection<String> shippingStopFlgList) {
        doSetShippingStopFlg_NotInScope(shippingStopFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ShippingStopFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotInScope_AsShippingStopFlg(Collection<CDef.ShippingStopFlg> cdefList) {
        doSetShippingStopFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetShippingStopFlg_NotInScope(Collection<String> shippingStopFlgList) {
        regINS(CK_NINS, cTL(shippingStopFlgList), xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNull() { regShippingStopFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNullOrEmpty() { regShippingStopFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNotNull() { regShippingStopFlg(CK_ISNN, DOBJ); }

    protected void regShippingStopFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG"); }
    protected abstract ConditionValue xgetCValueShippingStopFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param fixedPoint The value of fixedPoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_Equal(java.math.BigDecimal fixedPoint) {
        doSetFixedPoint_Equal(fixedPoint);
    }

    protected void doSetFixedPoint_Equal(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_EQ, fixedPoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param fixedPoint The value of fixedPoint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_NotEqual(java.math.BigDecimal fixedPoint) {
        doSetFixedPoint_NotEqual(fixedPoint);
    }

    protected void doSetFixedPoint_NotEqual(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_NES, fixedPoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param fixedPoint The value of fixedPoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_GreaterThan(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_GT, fixedPoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param fixedPoint The value of fixedPoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_LessThan(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_LT, fixedPoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param fixedPoint The value of fixedPoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_GreaterEqual(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_GE, fixedPoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param fixedPoint The value of fixedPoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixedPoint_LessEqual(java.math.BigDecimal fixedPoint) {
        regFixedPoint(CK_LE, fixedPoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param minNumber The min number of fixedPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fixedPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFixedPoint_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFixedPoint(), "FIXED_POINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param fixedPointList The collection of fixedPoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedPoint_InScope(Collection<java.math.BigDecimal> fixedPointList) {
        doSetFixedPoint_InScope(fixedPointList);
    }

    protected void doSetFixedPoint_InScope(Collection<java.math.BigDecimal> fixedPointList) {
        regINS(CK_INS, cTL(fixedPointList), xgetCValueFixedPoint(), "FIXED_POINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @param fixedPointList The collection of fixedPoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFixedPoint_NotInScope(Collection<java.math.BigDecimal> fixedPointList) {
        doSetFixedPoint_NotInScope(fixedPointList);
    }

    protected void doSetFixedPoint_NotInScope(Collection<java.math.BigDecimal> fixedPointList) {
        regINS(CK_NINS, cTL(fixedPointList), xgetCValueFixedPoint(), "FIXED_POINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     */
    public void setFixedPoint_IsNull() { regFixedPoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     */
    public void setFixedPoint_IsNotNull() { regFixedPoint(CK_ISNN, DOBJ); }

    protected void regFixedPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFixedPoint(), "FIXED_POINT"); }
    protected abstract ConditionValue xgetCValueFixedPoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param shapeGrpId The value of shapeGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_Equal(Long shapeGrpId) {
        doSetShapeGrpId_Equal(shapeGrpId);
    }

    protected void doSetShapeGrpId_Equal(Long shapeGrpId) {
        regShapeGrpId(CK_EQ, shapeGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param shapeGrpId The value of shapeGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotEqual(Long shapeGrpId) {
        doSetShapeGrpId_NotEqual(shapeGrpId);
    }

    protected void doSetShapeGrpId_NotEqual(Long shapeGrpId) {
        regShapeGrpId(CK_NES, shapeGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param shapeGrpId The value of shapeGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterThan(Long shapeGrpId) {
        regShapeGrpId(CK_GT, shapeGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param shapeGrpId The value of shapeGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessThan(Long shapeGrpId) {
        regShapeGrpId(CK_LT, shapeGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param shapeGrpId The value of shapeGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterEqual(Long shapeGrpId) {
        regShapeGrpId(CK_GE, shapeGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param shapeGrpId The value of shapeGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessEqual(Long shapeGrpId) {
        regShapeGrpId(CK_LE, shapeGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param minNumber The min number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeGrpId(), "SHAPE_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param shapeGrpIdList The collection of shapeGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_InScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_InScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_InScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_INS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @param shapeGrpIdList The collection of shapeGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_NotInScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_NINS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_GRP_ID from m_shape_grp where ...)} <br />
     * m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param subCBLambda The callback for sub-query of MShapeGrp for 'in-scope'. (NotNull)
     */
    public void inScopeMShapeGrp(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpId_InScopeRelation_MShapeGrp(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrp", false);
    }
    public abstract String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_GRP_ID from m_shape_grp where ...)} <br />
     * m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param subCBLambda The callback for sub-query of MShapeGrp for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShapeGrp(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpId_NotInScopeRelation_MShapeGrp(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrp", true);
    }
    public abstract String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     */
    public void setShapeGrpId_IsNull() { regShapeGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     */
    public void setShapeGrpId_IsNotNull() { regShapeGrpId(CK_ISNN, DOBJ); }

    protected void regShapeGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpId(), "SHAPE_GRP_ID"); }
    protected abstract ConditionValue xgetCValueShapeGrpId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCode The value of nmfcCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_Equal(String nmfcCode) {
        doSetNmfcCode_Equal(fRES(nmfcCode));
    }

    protected void doSetNmfcCode_Equal(String nmfcCode) {
        regNmfcCode(CK_EQ, nmfcCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCode The value of nmfcCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_NotEqual(String nmfcCode) {
        doSetNmfcCode_NotEqual(fRES(nmfcCode));
    }

    protected void doSetNmfcCode_NotEqual(String nmfcCode) {
        regNmfcCode(CK_NES, nmfcCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCode The value of nmfcCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_GreaterThan(String nmfcCode) {
        regNmfcCode(CK_GT, fRES(nmfcCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCode The value of nmfcCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_LessThan(String nmfcCode) {
        regNmfcCode(CK_LT, fRES(nmfcCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCode The value of nmfcCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_GreaterEqual(String nmfcCode) {
        regNmfcCode(CK_GE, fRES(nmfcCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCode The value of nmfcCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_LessEqual(String nmfcCode) {
        regNmfcCode(CK_LE, fRES(nmfcCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCodeList The collection of nmfcCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_InScope(Collection<String> nmfcCodeList) {
        doSetNmfcCode_InScope(nmfcCodeList);
    }

    protected void doSetNmfcCode_InScope(Collection<String> nmfcCodeList) {
        regINS(CK_INS, cTL(nmfcCodeList), xgetCValueNmfcCode(), "NMFC_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCodeList The collection of nmfcCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_NotInScope(Collection<String> nmfcCodeList) {
        doSetNmfcCode_NotInScope(nmfcCodeList);
    }

    protected void doSetNmfcCode_NotInScope(Collection<String> nmfcCodeList) {
        regINS(CK_NINS, cTL(nmfcCodeList), xgetCValueNmfcCode(), "NMFC_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)} <br>
     * <pre>e.g. setNmfcCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nmfcCode The value of nmfcCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNmfcCode_LikeSearch(String nmfcCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nmfcCode), xgetCValueNmfcCode(), "NMFC_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCode The value of nmfcCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNmfcCode_NotLikeSearch(String nmfcCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nmfcCode), xgetCValueNmfcCode(), "NMFC_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @param nmfcCode The value of nmfcCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmfcCode_PrefixSearch(String nmfcCode) {
        setNmfcCode_LikeSearch(nmfcCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     */
    public void setNmfcCode_IsNull() { regNmfcCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     */
    public void setNmfcCode_IsNullOrEmpty() { regNmfcCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NMFC_CODE: {VARCHAR(30)}
     */
    public void setNmfcCode_IsNotNull() { regNmfcCode(CK_ISNN, DOBJ); }

    protected void regNmfcCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmfcCode(), "NMFC_CODE"); }
    protected abstract ConditionValue xgetCValueNmfcCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @param freightCls The value of freightCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_Equal(String freightCls) {
        doSetFreightCls_Equal(fRES(freightCls));
    }

    /**
     * Equal(=). As FreightCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setFreightCls_Equal_AsFreightCls(CDef.FreightCls cdef) {
        doSetFreightCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 50
     */
    public void setFreightCls_Equal_$01() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 55
     */
    public void setFreightCls_Equal_$02() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$02);
    }

    /**
     * Equal(=). As $03 (03). And OnlyOnceRegistered. <br>
     * $03: 60
     */
    public void setFreightCls_Equal_$03() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$03);
    }

    /**
     * Equal(=). As $04 (04). And OnlyOnceRegistered. <br>
     * $04: 65
     */
    public void setFreightCls_Equal_$04() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$04);
    }

    /**
     * Equal(=). As $05 (05). And OnlyOnceRegistered. <br>
     * $05: 70
     */
    public void setFreightCls_Equal_$05() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$05);
    }

    /**
     * Equal(=). As $06 (06). And OnlyOnceRegistered. <br>
     * $06: 77.5
     */
    public void setFreightCls_Equal_$06() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$06);
    }

    /**
     * Equal(=). As $07 (07). And OnlyOnceRegistered. <br>
     * $07: 85
     */
    public void setFreightCls_Equal_$07() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$07);
    }

    /**
     * Equal(=). As $08 (08). And OnlyOnceRegistered. <br>
     * $08: 92.5
     */
    public void setFreightCls_Equal_$08() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$08);
    }

    /**
     * Equal(=). As $09 (09). And OnlyOnceRegistered. <br>
     * $09: 100
     */
    public void setFreightCls_Equal_$09() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$09);
    }

    /**
     * Equal(=). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 110
     */
    public void setFreightCls_Equal_$10() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$10);
    }

    /**
     * Equal(=). As $11 (11). And OnlyOnceRegistered. <br>
     * $11: 125
     */
    public void setFreightCls_Equal_$11() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$11);
    }

    /**
     * Equal(=). As $12 (12). And OnlyOnceRegistered. <br>
     * $12: 150
     */
    public void setFreightCls_Equal_$12() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$12);
    }

    /**
     * Equal(=). As $13 (13). And OnlyOnceRegistered. <br>
     * $13: 175
     */
    public void setFreightCls_Equal_$13() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$13);
    }

    /**
     * Equal(=). As $14 (14). And OnlyOnceRegistered. <br>
     * $14: 200
     */
    public void setFreightCls_Equal_$14() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$14);
    }

    /**
     * Equal(=). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 250
     */
    public void setFreightCls_Equal_$15() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$15);
    }

    /**
     * Equal(=). As $16 (16). And OnlyOnceRegistered. <br>
     * $16: 300
     */
    public void setFreightCls_Equal_$16() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$16);
    }

    /**
     * Equal(=). As $17 (17). And OnlyOnceRegistered. <br>
     * $17: 400
     */
    public void setFreightCls_Equal_$17() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$17);
    }

    /**
     * Equal(=). As $18 (18). And OnlyOnceRegistered. <br>
     * $18: 500
     */
    public void setFreightCls_Equal_$18() {
        setFreightCls_Equal_AsFreightCls(CDef.FreightCls.$18);
    }

    protected void doSetFreightCls_Equal(String freightCls) {
        regFreightCls(CK_EQ, freightCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @param freightCls The value of freightCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_NotEqual(String freightCls) {
        doSetFreightCls_NotEqual(fRES(freightCls));
    }

    /**
     * NotEqual(&lt;&gt;). As FreightCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls cdef) {
        doSetFreightCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 50
     */
    public void setFreightCls_NotEqual_$01() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 55
     */
    public void setFreightCls_NotEqual_$02() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$02);
    }

    /**
     * NotEqual(&lt;&gt;). As $03 (03). And OnlyOnceRegistered. <br>
     * $03: 60
     */
    public void setFreightCls_NotEqual_$03() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$03);
    }

    /**
     * NotEqual(&lt;&gt;). As $04 (04). And OnlyOnceRegistered. <br>
     * $04: 65
     */
    public void setFreightCls_NotEqual_$04() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$04);
    }

    /**
     * NotEqual(&lt;&gt;). As $05 (05). And OnlyOnceRegistered. <br>
     * $05: 70
     */
    public void setFreightCls_NotEqual_$05() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$05);
    }

    /**
     * NotEqual(&lt;&gt;). As $06 (06). And OnlyOnceRegistered. <br>
     * $06: 77.5
     */
    public void setFreightCls_NotEqual_$06() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$06);
    }

    /**
     * NotEqual(&lt;&gt;). As $07 (07). And OnlyOnceRegistered. <br>
     * $07: 85
     */
    public void setFreightCls_NotEqual_$07() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$07);
    }

    /**
     * NotEqual(&lt;&gt;). As $08 (08). And OnlyOnceRegistered. <br>
     * $08: 92.5
     */
    public void setFreightCls_NotEqual_$08() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$08);
    }

    /**
     * NotEqual(&lt;&gt;). As $09 (09). And OnlyOnceRegistered. <br>
     * $09: 100
     */
    public void setFreightCls_NotEqual_$09() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$09);
    }

    /**
     * NotEqual(&lt;&gt;). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 110
     */
    public void setFreightCls_NotEqual_$10() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$10);
    }

    /**
     * NotEqual(&lt;&gt;). As $11 (11). And OnlyOnceRegistered. <br>
     * $11: 125
     */
    public void setFreightCls_NotEqual_$11() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$11);
    }

    /**
     * NotEqual(&lt;&gt;). As $12 (12). And OnlyOnceRegistered. <br>
     * $12: 150
     */
    public void setFreightCls_NotEqual_$12() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$12);
    }

    /**
     * NotEqual(&lt;&gt;). As $13 (13). And OnlyOnceRegistered. <br>
     * $13: 175
     */
    public void setFreightCls_NotEqual_$13() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$13);
    }

    /**
     * NotEqual(&lt;&gt;). As $14 (14). And OnlyOnceRegistered. <br>
     * $14: 200
     */
    public void setFreightCls_NotEqual_$14() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$14);
    }

    /**
     * NotEqual(&lt;&gt;). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 250
     */
    public void setFreightCls_NotEqual_$15() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$15);
    }

    /**
     * NotEqual(&lt;&gt;). As $16 (16). And OnlyOnceRegistered. <br>
     * $16: 300
     */
    public void setFreightCls_NotEqual_$16() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$16);
    }

    /**
     * NotEqual(&lt;&gt;). As $17 (17). And OnlyOnceRegistered. <br>
     * $17: 400
     */
    public void setFreightCls_NotEqual_$17() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$17);
    }

    /**
     * NotEqual(&lt;&gt;). As $18 (18). And OnlyOnceRegistered. <br>
     * $18: 500
     */
    public void setFreightCls_NotEqual_$18() {
        setFreightCls_NotEqual_AsFreightCls(CDef.FreightCls.$18);
    }

    protected void doSetFreightCls_NotEqual(String freightCls) {
        regFreightCls(CK_NES, freightCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @param freightClsList The collection of freightCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_InScope(Collection<String> freightClsList) {
        doSetFreightCls_InScope(freightClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As FreightCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_InScope_AsFreightCls(Collection<CDef.FreightCls> cdefList) {
        doSetFreightCls_InScope(cTStrL(cdefList));
    }

    protected void doSetFreightCls_InScope(Collection<String> freightClsList) {
        regINS(CK_INS, cTL(freightClsList), xgetCValueFreightCls(), "FREIGHT_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @param freightClsList The collection of freightCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_NotInScope(Collection<String> freightClsList) {
        doSetFreightCls_NotInScope(freightClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As FreightCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls} <br>
     * Freight Class
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightCls_NotInScope_AsFreightCls(Collection<CDef.FreightCls> cdefList) {
        doSetFreightCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetFreightCls_NotInScope(Collection<String> freightClsList) {
        regINS(CK_NINS, cTL(freightClsList), xgetCValueFreightCls(), "FREIGHT_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     */
    public void setFreightCls_IsNull() { regFreightCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     */
    public void setFreightCls_IsNullOrEmpty() { regFreightCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     */
    public void setFreightCls_IsNotNull() { regFreightCls(CK_ISNN, DOBJ); }

    protected void regFreightCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreightCls(), "FREIGHT_CLS"); }
    protected abstract ConditionValue xgetCValueFreightCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_Equal(String counntryOfOrigin) {
        doSetCounntryOfOrigin_Equal(fRES(counntryOfOrigin));
    }

    protected void doSetCounntryOfOrigin_Equal(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_EQ, counntryOfOrigin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_NotEqual(String counntryOfOrigin) {
        doSetCounntryOfOrigin_NotEqual(fRES(counntryOfOrigin));
    }

    protected void doSetCounntryOfOrigin_NotEqual(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_NES, counntryOfOrigin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_GreaterThan(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_GT, fRES(counntryOfOrigin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_LessThan(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_LT, fRES(counntryOfOrigin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_GreaterEqual(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_GE, fRES(counntryOfOrigin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_LessEqual(String counntryOfOrigin) {
        regCounntryOfOrigin(CK_LE, fRES(counntryOfOrigin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOriginList The collection of counntryOfOrigin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_InScope(Collection<String> counntryOfOriginList) {
        doSetCounntryOfOrigin_InScope(counntryOfOriginList);
    }

    protected void doSetCounntryOfOrigin_InScope(Collection<String> counntryOfOriginList) {
        regINS(CK_INS, cTL(counntryOfOriginList), xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOriginList The collection of counntryOfOrigin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_NotInScope(Collection<String> counntryOfOriginList) {
        doSetCounntryOfOrigin_NotInScope(counntryOfOriginList);
    }

    protected void doSetCounntryOfOrigin_NotInScope(Collection<String> counntryOfOriginList) {
        regINS(CK_NINS, cTL(counntryOfOriginList), xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)} <br>
     * <pre>e.g. setCounntryOfOrigin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param counntryOfOrigin The value of counntryOfOrigin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCounntryOfOrigin_LikeSearch(String counntryOfOrigin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(counntryOfOrigin), xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCounntryOfOrigin_NotLikeSearch(String counntryOfOrigin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(counntryOfOrigin), xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @param counntryOfOrigin The value of counntryOfOrigin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCounntryOfOrigin_PrefixSearch(String counntryOfOrigin) {
        setCounntryOfOrigin_LikeSearch(counntryOfOrigin, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     */
    public void setCounntryOfOrigin_IsNull() { regCounntryOfOrigin(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     */
    public void setCounntryOfOrigin_IsNullOrEmpty() { regCounntryOfOrigin(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     */
    public void setCounntryOfOrigin_IsNotNull() { regCounntryOfOrigin(CK_ISNN, DOBJ); }

    protected void regCounntryOfOrigin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCounntryOfOrigin(), "COUNNTRY_OF_ORIGIN"); }
    protected abstract ConditionValue xgetCValueCounntryOfOrigin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param unitVal The value of unitVal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_Equal(java.math.BigDecimal unitVal) {
        doSetUnitVal_Equal(unitVal);
    }

    protected void doSetUnitVal_Equal(java.math.BigDecimal unitVal) {
        regUnitVal(CK_EQ, unitVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param unitVal The value of unitVal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_NotEqual(java.math.BigDecimal unitVal) {
        doSetUnitVal_NotEqual(unitVal);
    }

    protected void doSetUnitVal_NotEqual(java.math.BigDecimal unitVal) {
        regUnitVal(CK_NES, unitVal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param unitVal The value of unitVal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_GreaterThan(java.math.BigDecimal unitVal) {
        regUnitVal(CK_GT, unitVal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param unitVal The value of unitVal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_LessThan(java.math.BigDecimal unitVal) {
        regUnitVal(CK_LT, unitVal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param unitVal The value of unitVal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_GreaterEqual(java.math.BigDecimal unitVal) {
        regUnitVal(CK_GE, unitVal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param unitVal The value of unitVal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitVal_LessEqual(java.math.BigDecimal unitVal) {
        regUnitVal(CK_LE, unitVal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param minNumber The min number of unitVal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitVal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitVal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitVal(), "UNIT_VAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param unitValList The collection of unitVal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitVal_InScope(Collection<java.math.BigDecimal> unitValList) {
        doSetUnitVal_InScope(unitValList);
    }

    protected void doSetUnitVal_InScope(Collection<java.math.BigDecimal> unitValList) {
        regINS(CK_INS, cTL(unitValList), xgetCValueUnitVal(), "UNIT_VAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @param unitValList The collection of unitVal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitVal_NotInScope(Collection<java.math.BigDecimal> unitValList) {
        doSetUnitVal_NotInScope(unitValList);
    }

    protected void doSetUnitVal_NotInScope(Collection<java.math.BigDecimal> unitValList) {
        regINS(CK_NINS, cTL(unitValList), xgetCValueUnitVal(), "UNIT_VAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     */
    public void setUnitVal_IsNull() { regUnitVal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     */
    public void setUnitVal_IsNotNull() { regUnitVal(CK_ISNN, DOBJ); }

    protected void regUnitVal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitVal(), "UNIT_VAL"); }
    protected abstract ConditionValue xgetCValueUnitVal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCd The value of htsCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_Equal(String htsCd) {
        doSetHtsCd_Equal(fRES(htsCd));
    }

    protected void doSetHtsCd_Equal(String htsCd) {
        regHtsCd(CK_EQ, htsCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCd The value of htsCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_NotEqual(String htsCd) {
        doSetHtsCd_NotEqual(fRES(htsCd));
    }

    protected void doSetHtsCd_NotEqual(String htsCd) {
        regHtsCd(CK_NES, htsCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCd The value of htsCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_GreaterThan(String htsCd) {
        regHtsCd(CK_GT, fRES(htsCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCd The value of htsCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_LessThan(String htsCd) {
        regHtsCd(CK_LT, fRES(htsCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCd The value of htsCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_GreaterEqual(String htsCd) {
        regHtsCd(CK_GE, fRES(htsCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCd The value of htsCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_LessEqual(String htsCd) {
        regHtsCd(CK_LE, fRES(htsCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCdList The collection of htsCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_InScope(Collection<String> htsCdList) {
        doSetHtsCd_InScope(htsCdList);
    }

    protected void doSetHtsCd_InScope(Collection<String> htsCdList) {
        regINS(CK_INS, cTL(htsCdList), xgetCValueHtsCd(), "HTS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCdList The collection of htsCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_NotInScope(Collection<String> htsCdList) {
        doSetHtsCd_NotInScope(htsCdList);
    }

    protected void doSetHtsCd_NotInScope(Collection<String> htsCdList) {
        regINS(CK_NINS, cTL(htsCdList), xgetCValueHtsCd(), "HTS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTS_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setHtsCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param htsCd The value of htsCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHtsCd_LikeSearch(String htsCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(htsCd), xgetCValueHtsCd(), "HTS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCd The value of htsCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHtsCd_NotLikeSearch(String htsCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(htsCd), xgetCValueHtsCd(), "HTS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     * @param htsCd The value of htsCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtsCd_PrefixSearch(String htsCd) {
        setHtsCd_LikeSearch(htsCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     */
    public void setHtsCd_IsNull() { regHtsCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     */
    public void setHtsCd_IsNullOrEmpty() { regHtsCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HTS_CD: {VARCHAR(30)}
     */
    public void setHtsCd_IsNotNull() { regHtsCd(CK_ISNN, DOBJ); }

    protected void regHtsCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtsCd(), "HTS_CD"); }
    protected abstract ConditionValue xgetCValueHtsCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryCls The value of productCategoryCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_Equal(String productCategoryCls) {
        doSetProductCategoryCls_Equal(fRES(productCategoryCls));
    }

    protected void doSetProductCategoryCls_Equal(String productCategoryCls) {
        regProductCategoryCls(CK_EQ, productCategoryCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryCls The value of productCategoryCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_NotEqual(String productCategoryCls) {
        doSetProductCategoryCls_NotEqual(fRES(productCategoryCls));
    }

    protected void doSetProductCategoryCls_NotEqual(String productCategoryCls) {
        regProductCategoryCls(CK_NES, productCategoryCls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryCls The value of productCategoryCls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_GreaterThan(String productCategoryCls) {
        regProductCategoryCls(CK_GT, fRES(productCategoryCls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryCls The value of productCategoryCls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_LessThan(String productCategoryCls) {
        regProductCategoryCls(CK_LT, fRES(productCategoryCls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryCls The value of productCategoryCls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_GreaterEqual(String productCategoryCls) {
        regProductCategoryCls(CK_GE, fRES(productCategoryCls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryCls The value of productCategoryCls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_LessEqual(String productCategoryCls) {
        regProductCategoryCls(CK_LE, fRES(productCategoryCls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryClsList The collection of productCategoryCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_InScope(Collection<String> productCategoryClsList) {
        doSetProductCategoryCls_InScope(productCategoryClsList);
    }

    protected void doSetProductCategoryCls_InScope(Collection<String> productCategoryClsList) {
        regINS(CK_INS, cTL(productCategoryClsList), xgetCValueProductCategoryCls(), "PRODUCT_CATEGORY_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryClsList The collection of productCategoryCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_NotInScope(Collection<String> productCategoryClsList) {
        doSetProductCategoryCls_NotInScope(productCategoryClsList);
    }

    protected void doSetProductCategoryCls_NotInScope(Collection<String> productCategoryClsList) {
        regINS(CK_NINS, cTL(productCategoryClsList), xgetCValueProductCategoryCls(), "PRODUCT_CATEGORY_CLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)} <br>
     * <pre>e.g. setProductCategoryCls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCategoryCls The value of productCategoryCls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCategoryCls_LikeSearch(String productCategoryCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCategoryCls), xgetCValueProductCategoryCls(), "PRODUCT_CATEGORY_CLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryCls The value of productCategoryCls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCategoryCls_NotLikeSearch(String productCategoryCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCategoryCls), xgetCValueProductCategoryCls(), "PRODUCT_CATEGORY_CLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @param productCategoryCls The value of productCategoryCls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCategoryCls_PrefixSearch(String productCategoryCls) {
        setProductCategoryCls_LikeSearch(productCategoryCls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     */
    public void setProductCategoryCls_IsNull() { regProductCategoryCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     */
    public void setProductCategoryCls_IsNullOrEmpty() { regProductCategoryCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     */
    public void setProductCategoryCls_IsNotNull() { regProductCategoryCls(CK_ISNN, DOBJ); }

    protected void regProductCategoryCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCategoryCls(), "PRODUCT_CATEGORY_CLS"); }
    protected abstract ConditionValue xgetCValueProductCategoryCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     * @param prodDtManagFlg The value of prodDtManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_Equal(String prodDtManagFlg) {
        doSetProdDtManagFlg_Equal(fRES(prodDtManagFlg));
    }

    /**
     * Equal(=). As ProdDtManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_Equal_AsProdDtManagFlg(CDef.ProdDtManagFlg cdef) {
        doSetProdDtManagFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setProdDtManagFlg_Equal_$0() {
        setProdDtManagFlg_Equal_AsProdDtManagFlg(CDef.ProdDtManagFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setProdDtManagFlg_Equal_$1() {
        setProdDtManagFlg_Equal_AsProdDtManagFlg(CDef.ProdDtManagFlg.$1);
    }

    protected void doSetProdDtManagFlg_Equal(String prodDtManagFlg) {
        regProdDtManagFlg(CK_EQ, prodDtManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     * @param prodDtManagFlg The value of prodDtManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_NotEqual(String prodDtManagFlg) {
        doSetProdDtManagFlg_NotEqual(fRES(prodDtManagFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ProdDtManagFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_NotEqual_AsProdDtManagFlg(CDef.ProdDtManagFlg cdef) {
        doSetProdDtManagFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setProdDtManagFlg_NotEqual_$0() {
        setProdDtManagFlg_NotEqual_AsProdDtManagFlg(CDef.ProdDtManagFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setProdDtManagFlg_NotEqual_$1() {
        setProdDtManagFlg_NotEqual_AsProdDtManagFlg(CDef.ProdDtManagFlg.$1);
    }

    protected void doSetProdDtManagFlg_NotEqual(String prodDtManagFlg) {
        regProdDtManagFlg(CK_NES, prodDtManagFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     * @param prodDtManagFlgList The collection of prodDtManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_InScope(Collection<String> prodDtManagFlgList) {
        doSetProdDtManagFlg_InScope(prodDtManagFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ProdDtManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_InScope_AsProdDtManagFlg(Collection<CDef.ProdDtManagFlg> cdefList) {
        doSetProdDtManagFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetProdDtManagFlg_InScope(Collection<String> prodDtManagFlgList) {
        regINS(CK_INS, cTL(prodDtManagFlgList), xgetCValueProdDtManagFlg(), "PROD_DT_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     * @param prodDtManagFlgList The collection of prodDtManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_NotInScope(Collection<String> prodDtManagFlgList) {
        doSetProdDtManagFlg_NotInScope(prodDtManagFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ProdDtManagFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg} <br>
     * 製造日管理フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtManagFlg_NotInScope_AsProdDtManagFlg(Collection<CDef.ProdDtManagFlg> cdefList) {
        doSetProdDtManagFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetProdDtManagFlg_NotInScope(Collection<String> prodDtManagFlgList) {
        regINS(CK_NINS, cTL(prodDtManagFlgList), xgetCValueProdDtManagFlg(), "PROD_DT_MANAG_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     */
    public void setProdDtManagFlg_IsNull() { regProdDtManagFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     */
    public void setProdDtManagFlg_IsNullOrEmpty() { regProdDtManagFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     */
    public void setProdDtManagFlg_IsNotNull() { regProdDtManagFlg(CK_ISNN, DOBJ); }

    protected void regProdDtManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDtManagFlg(), "PROD_DT_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueProdDtManagFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_Equal(Long prodDtLimitDaysRcv) {
        doSetProdDtLimitDaysRcv_Equal(prodDtLimitDaysRcv);
    }

    protected void doSetProdDtLimitDaysRcv_Equal(Long prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_EQ, prodDtLimitDaysRcv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_NotEqual(Long prodDtLimitDaysRcv) {
        doSetProdDtLimitDaysRcv_NotEqual(prodDtLimitDaysRcv);
    }

    protected void doSetProdDtLimitDaysRcv_NotEqual(Long prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_NES, prodDtLimitDaysRcv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_GreaterThan(Long prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_GT, prodDtLimitDaysRcv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_LessThan(Long prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_LT, prodDtLimitDaysRcv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_GreaterEqual(Long prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_GE, prodDtLimitDaysRcv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param prodDtLimitDaysRcv The value of prodDtLimitDaysRcv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_LessEqual(Long prodDtLimitDaysRcv) {
        regProdDtLimitDaysRcv(CK_LE, prodDtLimitDaysRcv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param minNumber The min number of prodDtLimitDaysRcv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prodDtLimitDaysRcv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProdDtLimitDaysRcv_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param prodDtLimitDaysRcvList The collection of prodDtLimitDaysRcv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_InScope(Collection<Long> prodDtLimitDaysRcvList) {
        doSetProdDtLimitDaysRcv_InScope(prodDtLimitDaysRcvList);
    }

    protected void doSetProdDtLimitDaysRcv_InScope(Collection<Long> prodDtLimitDaysRcvList) {
        regINS(CK_INS, cTL(prodDtLimitDaysRcvList), xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @param prodDtLimitDaysRcvList The collection of prodDtLimitDaysRcv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysRcv_NotInScope(Collection<Long> prodDtLimitDaysRcvList) {
        doSetProdDtLimitDaysRcv_NotInScope(prodDtLimitDaysRcvList);
    }

    protected void doSetProdDtLimitDaysRcv_NotInScope(Collection<Long> prodDtLimitDaysRcvList) {
        regINS(CK_NINS, cTL(prodDtLimitDaysRcvList), xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     */
    public void setProdDtLimitDaysRcv_IsNull() { regProdDtLimitDaysRcv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     */
    public void setProdDtLimitDaysRcv_IsNotNull() { regProdDtLimitDaysRcv(CK_ISNN, DOBJ); }

    protected void regProdDtLimitDaysRcv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDtLimitDaysRcv(), "PROD_DT_LIMIT_DAYS_RCV"); }
    protected abstract ConditionValue xgetCValueProdDtLimitDaysRcv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_Equal(Long prodDtLimitDaysShp) {
        doSetProdDtLimitDaysShp_Equal(prodDtLimitDaysShp);
    }

    protected void doSetProdDtLimitDaysShp_Equal(Long prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_EQ, prodDtLimitDaysShp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_NotEqual(Long prodDtLimitDaysShp) {
        doSetProdDtLimitDaysShp_NotEqual(prodDtLimitDaysShp);
    }

    protected void doSetProdDtLimitDaysShp_NotEqual(Long prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_NES, prodDtLimitDaysShp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_GreaterThan(Long prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_GT, prodDtLimitDaysShp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_LessThan(Long prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_LT, prodDtLimitDaysShp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_GreaterEqual(Long prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_GE, prodDtLimitDaysShp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param prodDtLimitDaysShp The value of prodDtLimitDaysShp as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_LessEqual(Long prodDtLimitDaysShp) {
        regProdDtLimitDaysShp(CK_LE, prodDtLimitDaysShp);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param minNumber The min number of prodDtLimitDaysShp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prodDtLimitDaysShp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProdDtLimitDaysShp_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param prodDtLimitDaysShpList The collection of prodDtLimitDaysShp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_InScope(Collection<Long> prodDtLimitDaysShpList) {
        doSetProdDtLimitDaysShp_InScope(prodDtLimitDaysShpList);
    }

    protected void doSetProdDtLimitDaysShp_InScope(Collection<Long> prodDtLimitDaysShpList) {
        regINS(CK_INS, cTL(prodDtLimitDaysShpList), xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @param prodDtLimitDaysShpList The collection of prodDtLimitDaysShp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtLimitDaysShp_NotInScope(Collection<Long> prodDtLimitDaysShpList) {
        doSetProdDtLimitDaysShp_NotInScope(prodDtLimitDaysShpList);
    }

    protected void doSetProdDtLimitDaysShp_NotInScope(Collection<Long> prodDtLimitDaysShpList) {
        regINS(CK_NINS, cTL(prodDtLimitDaysShpList), xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     */
    public void setProdDtLimitDaysShp_IsNull() { regProdDtLimitDaysShp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     */
    public void setProdDtLimitDaysShp_IsNotNull() { regProdDtLimitDaysShp(CK_ISNN, DOBJ); }

    protected void regProdDtLimitDaysShp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDtLimitDaysShp(), "PROD_DT_LIMIT_DAYS_SHP"); }
    protected abstract ConditionValue xgetCValueProdDtLimitDaysShp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_Equal(String serialManagFlg) {
        doSetSerialManagFlg_Equal(fRES(serialManagFlg));
    }

    protected void doSetSerialManagFlg_Equal(String serialManagFlg) {
        regSerialManagFlg(CK_EQ, serialManagFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_NotEqual(String serialManagFlg) {
        doSetSerialManagFlg_NotEqual(fRES(serialManagFlg));
    }

    protected void doSetSerialManagFlg_NotEqual(String serialManagFlg) {
        regSerialManagFlg(CK_NES, serialManagFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_GreaterThan(String serialManagFlg) {
        regSerialManagFlg(CK_GT, fRES(serialManagFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_LessThan(String serialManagFlg) {
        regSerialManagFlg(CK_LT, fRES(serialManagFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_GreaterEqual(String serialManagFlg) {
        regSerialManagFlg(CK_GE, fRES(serialManagFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_LessEqual(String serialManagFlg) {
        regSerialManagFlg(CK_LE, fRES(serialManagFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlgList The collection of serialManagFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_InScope(Collection<String> serialManagFlgList) {
        doSetSerialManagFlg_InScope(serialManagFlgList);
    }

    protected void doSetSerialManagFlg_InScope(Collection<String> serialManagFlgList) {
        regINS(CK_INS, cTL(serialManagFlgList), xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlgList The collection of serialManagFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_NotInScope(Collection<String> serialManagFlgList) {
        doSetSerialManagFlg_NotInScope(serialManagFlgList);
    }

    protected void doSetSerialManagFlg_NotInScope(Collection<String> serialManagFlgList) {
        regINS(CK_NINS, cTL(serialManagFlgList), xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)} <br>
     * <pre>e.g. setSerialManagFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serialManagFlg The value of serialManagFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSerialManagFlg_LikeSearch(String serialManagFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serialManagFlg), xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSerialManagFlg_NotLikeSearch(String serialManagFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serialManagFlg), xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @param serialManagFlg The value of serialManagFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialManagFlg_PrefixSearch(String serialManagFlg) {
        setSerialManagFlg_LikeSearch(serialManagFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     */
    public void setSerialManagFlg_IsNull() { regSerialManagFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     */
    public void setSerialManagFlg_IsNullOrEmpty() { regSerialManagFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     */
    public void setSerialManagFlg_IsNotNull() { regSerialManagFlg(CK_ISNN, DOBJ); }

    protected void regSerialManagFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSerialManagFlg(), "SERIAL_MANAG_FLG"); }
    protected abstract ConditionValue xgetCValueSerialManagFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     * @param ocrDateFormat The value of ocrDateFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_Equal(String ocrDateFormat) {
        doSetOcrDateFormat_Equal(fRES(ocrDateFormat));
    }

    /**
     * Equal(=). As OcrDateFormat. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOcrDateFormat_Equal_AsOcrDateFormat(CDef.OcrDateFormat cdef) {
        doSetOcrDateFormat_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: YYYY/MM/DD
     */
    public void setOcrDateFormat_Equal_$1() {
        setOcrDateFormat_Equal_AsOcrDateFormat(CDef.OcrDateFormat.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: YY.MM.DD
     */
    public void setOcrDateFormat_Equal_$2() {
        setOcrDateFormat_Equal_AsOcrDateFormat(CDef.OcrDateFormat.$2);
    }

    protected void doSetOcrDateFormat_Equal(String ocrDateFormat) {
        regOcrDateFormat(CK_EQ, ocrDateFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     * @param ocrDateFormat The value of ocrDateFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_NotEqual(String ocrDateFormat) {
        doSetOcrDateFormat_NotEqual(fRES(ocrDateFormat));
    }

    /**
     * NotEqual(&lt;&gt;). As OcrDateFormat. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOcrDateFormat_NotEqual_AsOcrDateFormat(CDef.OcrDateFormat cdef) {
        doSetOcrDateFormat_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: YYYY/MM/DD
     */
    public void setOcrDateFormat_NotEqual_$1() {
        setOcrDateFormat_NotEqual_AsOcrDateFormat(CDef.OcrDateFormat.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: YY.MM.DD
     */
    public void setOcrDateFormat_NotEqual_$2() {
        setOcrDateFormat_NotEqual_AsOcrDateFormat(CDef.OcrDateFormat.$2);
    }

    protected void doSetOcrDateFormat_NotEqual(String ocrDateFormat) {
        regOcrDateFormat(CK_NES, ocrDateFormat);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     * @param ocrDateFormatList The collection of ocrDateFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_InScope(Collection<String> ocrDateFormatList) {
        doSetOcrDateFormat_InScope(ocrDateFormatList);
    }

    /**
     * InScope {in ('a', 'b')}. As OcrDateFormat. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_InScope_AsOcrDateFormat(Collection<CDef.OcrDateFormat> cdefList) {
        doSetOcrDateFormat_InScope(cTStrL(cdefList));
    }

    protected void doSetOcrDateFormat_InScope(Collection<String> ocrDateFormatList) {
        regINS(CK_INS, cTL(ocrDateFormatList), xgetCValueOcrDateFormat(), "OCR_DATE_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     * @param ocrDateFormatList The collection of ocrDateFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_NotInScope(Collection<String> ocrDateFormatList) {
        doSetOcrDateFormat_NotInScope(ocrDateFormatList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As OcrDateFormat. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat} <br>
     * OCR日付形式
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOcrDateFormat_NotInScope_AsOcrDateFormat(Collection<CDef.OcrDateFormat> cdefList) {
        doSetOcrDateFormat_NotInScope(cTStrL(cdefList));
    }

    protected void doSetOcrDateFormat_NotInScope(Collection<String> ocrDateFormatList) {
        regINS(CK_NINS, cTL(ocrDateFormatList), xgetCValueOcrDateFormat(), "OCR_DATE_FORMAT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     */
    public void setOcrDateFormat_IsNull() { regOcrDateFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     */
    public void setOcrDateFormat_IsNullOrEmpty() { regOcrDateFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     */
    public void setOcrDateFormat_IsNotNull() { regOcrDateFormat(CK_ISNN, DOBJ); }

    protected void regOcrDateFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOcrDateFormat(), "OCR_DATE_FORMAT"); }
    protected abstract ConditionValue xgetCValueOcrDateFormat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     * @param insuranceFlg The value of insuranceFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceFlg_Equal(String insuranceFlg) {
        doSetInsuranceFlg_Equal(fRES(insuranceFlg));
    }

    /**
     * Equal(=). As InsuranceFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsuranceFlg_Equal_AsInsuranceFlg(CDef.InsuranceFlg cdef) {
        doSetInsuranceFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setInsuranceFlg_Equal_$0() {
        setInsuranceFlg_Equal_AsInsuranceFlg(CDef.InsuranceFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setInsuranceFlg_Equal_$1() {
        setInsuranceFlg_Equal_AsInsuranceFlg(CDef.InsuranceFlg.$1);
    }

    protected void doSetInsuranceFlg_Equal(String insuranceFlg) {
        regInsuranceFlg(CK_EQ, insuranceFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     * @param insuranceFlg The value of insuranceFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceFlg_NotEqual(String insuranceFlg) {
        doSetInsuranceFlg_NotEqual(fRES(insuranceFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InsuranceFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsuranceFlg_NotEqual_AsInsuranceFlg(CDef.InsuranceFlg cdef) {
        doSetInsuranceFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setInsuranceFlg_NotEqual_$0() {
        setInsuranceFlg_NotEqual_AsInsuranceFlg(CDef.InsuranceFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setInsuranceFlg_NotEqual_$1() {
        setInsuranceFlg_NotEqual_AsInsuranceFlg(CDef.InsuranceFlg.$1);
    }

    protected void doSetInsuranceFlg_NotEqual(String insuranceFlg) {
        regInsuranceFlg(CK_NES, insuranceFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     * @param insuranceFlgList The collection of insuranceFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceFlg_InScope(Collection<String> insuranceFlgList) {
        doSetInsuranceFlg_InScope(insuranceFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InsuranceFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceFlg_InScope_AsInsuranceFlg(Collection<CDef.InsuranceFlg> cdefList) {
        doSetInsuranceFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInsuranceFlg_InScope(Collection<String> insuranceFlgList) {
        regINS(CK_INS, cTL(insuranceFlgList), xgetCValueInsuranceFlg(), "INSURANCE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     * @param insuranceFlgList The collection of insuranceFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceFlg_NotInScope(Collection<String> insuranceFlgList) {
        doSetInsuranceFlg_NotInScope(insuranceFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InsuranceFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg} <br>
     * 保険品フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceFlg_NotInScope_AsInsuranceFlg(Collection<CDef.InsuranceFlg> cdefList) {
        doSetInsuranceFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInsuranceFlg_NotInScope(Collection<String> insuranceFlgList) {
        regINS(CK_NINS, cTL(insuranceFlgList), xgetCValueInsuranceFlg(), "INSURANCE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     */
    public void setInsuranceFlg_IsNull() { regInsuranceFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     */
    public void setInsuranceFlg_IsNullOrEmpty() { regInsuranceFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     */
    public void setInsuranceFlg_IsNotNull() { regInsuranceFlg(CK_ISNN, DOBJ); }

    protected void regInsuranceFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsuranceFlg(), "INSURANCE_FLG"); }
    protected abstract ConditionValue xgetCValueInsuranceFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     * @param noOkinawaFlightFlg The value of noOkinawaFlightFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoOkinawaFlightFlg_Equal(String noOkinawaFlightFlg) {
        doSetNoOkinawaFlightFlg_Equal(fRES(noOkinawaFlightFlg));
    }

    /**
     * Equal(=). As NoOkinawaFlightFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNoOkinawaFlightFlg_Equal_AsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg cdef) {
        doSetNoOkinawaFlightFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setNoOkinawaFlightFlg_Equal_$0() {
        setNoOkinawaFlightFlg_Equal_AsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setNoOkinawaFlightFlg_Equal_$1() {
        setNoOkinawaFlightFlg_Equal_AsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg.$1);
    }

    protected void doSetNoOkinawaFlightFlg_Equal(String noOkinawaFlightFlg) {
        regNoOkinawaFlightFlg(CK_EQ, noOkinawaFlightFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     * @param noOkinawaFlightFlg The value of noOkinawaFlightFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoOkinawaFlightFlg_NotEqual(String noOkinawaFlightFlg) {
        doSetNoOkinawaFlightFlg_NotEqual(fRES(noOkinawaFlightFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As NoOkinawaFlightFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNoOkinawaFlightFlg_NotEqual_AsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg cdef) {
        doSetNoOkinawaFlightFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setNoOkinawaFlightFlg_NotEqual_$0() {
        setNoOkinawaFlightFlg_NotEqual_AsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setNoOkinawaFlightFlg_NotEqual_$1() {
        setNoOkinawaFlightFlg_NotEqual_AsNoOkinawaFlightFlg(CDef.NoOkinawaFlightFlg.$1);
    }

    protected void doSetNoOkinawaFlightFlg_NotEqual(String noOkinawaFlightFlg) {
        regNoOkinawaFlightFlg(CK_NES, noOkinawaFlightFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     * @param noOkinawaFlightFlgList The collection of noOkinawaFlightFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoOkinawaFlightFlg_InScope(Collection<String> noOkinawaFlightFlgList) {
        doSetNoOkinawaFlightFlg_InScope(noOkinawaFlightFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As NoOkinawaFlightFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoOkinawaFlightFlg_InScope_AsNoOkinawaFlightFlg(Collection<CDef.NoOkinawaFlightFlg> cdefList) {
        doSetNoOkinawaFlightFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetNoOkinawaFlightFlg_InScope(Collection<String> noOkinawaFlightFlgList) {
        regINS(CK_INS, cTL(noOkinawaFlightFlgList), xgetCValueNoOkinawaFlightFlg(), "NO_OKINAWA_FLIGHT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     * @param noOkinawaFlightFlgList The collection of noOkinawaFlightFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoOkinawaFlightFlg_NotInScope(Collection<String> noOkinawaFlightFlgList) {
        doSetNoOkinawaFlightFlg_NotInScope(noOkinawaFlightFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As NoOkinawaFlightFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg} <br>
     * 沖縄航空便不可フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoOkinawaFlightFlg_NotInScope_AsNoOkinawaFlightFlg(Collection<CDef.NoOkinawaFlightFlg> cdefList) {
        doSetNoOkinawaFlightFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetNoOkinawaFlightFlg_NotInScope(Collection<String> noOkinawaFlightFlgList) {
        regINS(CK_NINS, cTL(noOkinawaFlightFlgList), xgetCValueNoOkinawaFlightFlg(), "NO_OKINAWA_FLIGHT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     */
    public void setNoOkinawaFlightFlg_IsNull() { regNoOkinawaFlightFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     */
    public void setNoOkinawaFlightFlg_IsNullOrEmpty() { regNoOkinawaFlightFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     */
    public void setNoOkinawaFlightFlg_IsNotNull() { regNoOkinawaFlightFlg(CK_ISNN, DOBJ); }

    protected void regNoOkinawaFlightFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoOkinawaFlightFlg(), "NO_OKINAWA_FLIGHT_FLG"); }
    protected abstract ConditionValue xgetCValueNoOkinawaFlightFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     * @param heavyItemFlg The value of heavyItemFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemFlg_Equal(String heavyItemFlg) {
        doSetHeavyItemFlg_Equal(fRES(heavyItemFlg));
    }

    /**
     * Equal(=). As HeavyItemFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setHeavyItemFlg_Equal_AsHeavyItemFlg(CDef.HeavyItemFlg cdef) {
        doSetHeavyItemFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setHeavyItemFlg_Equal_$0() {
        setHeavyItemFlg_Equal_AsHeavyItemFlg(CDef.HeavyItemFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setHeavyItemFlg_Equal_$1() {
        setHeavyItemFlg_Equal_AsHeavyItemFlg(CDef.HeavyItemFlg.$1);
    }

    protected void doSetHeavyItemFlg_Equal(String heavyItemFlg) {
        regHeavyItemFlg(CK_EQ, heavyItemFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     * @param heavyItemFlg The value of heavyItemFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemFlg_NotEqual(String heavyItemFlg) {
        doSetHeavyItemFlg_NotEqual(fRES(heavyItemFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As HeavyItemFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setHeavyItemFlg_NotEqual_AsHeavyItemFlg(CDef.HeavyItemFlg cdef) {
        doSetHeavyItemFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setHeavyItemFlg_NotEqual_$0() {
        setHeavyItemFlg_NotEqual_AsHeavyItemFlg(CDef.HeavyItemFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setHeavyItemFlg_NotEqual_$1() {
        setHeavyItemFlg_NotEqual_AsHeavyItemFlg(CDef.HeavyItemFlg.$1);
    }

    protected void doSetHeavyItemFlg_NotEqual(String heavyItemFlg) {
        regHeavyItemFlg(CK_NES, heavyItemFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     * @param heavyItemFlgList The collection of heavyItemFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemFlg_InScope(Collection<String> heavyItemFlgList) {
        doSetHeavyItemFlg_InScope(heavyItemFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As HeavyItemFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemFlg_InScope_AsHeavyItemFlg(Collection<CDef.HeavyItemFlg> cdefList) {
        doSetHeavyItemFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetHeavyItemFlg_InScope(Collection<String> heavyItemFlgList) {
        regINS(CK_INS, cTL(heavyItemFlgList), xgetCValueHeavyItemFlg(), "HEAVY_ITEM_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     * @param heavyItemFlgList The collection of heavyItemFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemFlg_NotInScope(Collection<String> heavyItemFlgList) {
        doSetHeavyItemFlg_NotInScope(heavyItemFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As HeavyItemFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg} <br>
     * 重量フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemFlg_NotInScope_AsHeavyItemFlg(Collection<CDef.HeavyItemFlg> cdefList) {
        doSetHeavyItemFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetHeavyItemFlg_NotInScope(Collection<String> heavyItemFlgList) {
        regINS(CK_NINS, cTL(heavyItemFlgList), xgetCValueHeavyItemFlg(), "HEAVY_ITEM_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     */
    public void setHeavyItemFlg_IsNull() { regHeavyItemFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     */
    public void setHeavyItemFlg_IsNullOrEmpty() { regHeavyItemFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     */
    public void setHeavyItemFlg_IsNotNull() { regHeavyItemFlg(CK_ISNN, DOBJ); }

    protected void regHeavyItemFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeavyItemFlg(), "HEAVY_ITEM_FLG"); }
    protected abstract ConditionValue xgetCValueHeavyItemFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     * @param largeItemFlg The value of largeItemFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemFlg_Equal(String largeItemFlg) {
        doSetLargeItemFlg_Equal(fRES(largeItemFlg));
    }

    /**
     * Equal(=). As LargeItemFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeItemFlg_Equal_AsLargeItemFlg(CDef.LargeItemFlg cdef) {
        doSetLargeItemFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setLargeItemFlg_Equal_$0() {
        setLargeItemFlg_Equal_AsLargeItemFlg(CDef.LargeItemFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setLargeItemFlg_Equal_$1() {
        setLargeItemFlg_Equal_AsLargeItemFlg(CDef.LargeItemFlg.$1);
    }

    protected void doSetLargeItemFlg_Equal(String largeItemFlg) {
        regLargeItemFlg(CK_EQ, largeItemFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     * @param largeItemFlg The value of largeItemFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemFlg_NotEqual(String largeItemFlg) {
        doSetLargeItemFlg_NotEqual(fRES(largeItemFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LargeItemFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeItemFlg_NotEqual_AsLargeItemFlg(CDef.LargeItemFlg cdef) {
        doSetLargeItemFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setLargeItemFlg_NotEqual_$0() {
        setLargeItemFlg_NotEqual_AsLargeItemFlg(CDef.LargeItemFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setLargeItemFlg_NotEqual_$1() {
        setLargeItemFlg_NotEqual_AsLargeItemFlg(CDef.LargeItemFlg.$1);
    }

    protected void doSetLargeItemFlg_NotEqual(String largeItemFlg) {
        regLargeItemFlg(CK_NES, largeItemFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     * @param largeItemFlgList The collection of largeItemFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemFlg_InScope(Collection<String> largeItemFlgList) {
        doSetLargeItemFlg_InScope(largeItemFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LargeItemFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemFlg_InScope_AsLargeItemFlg(Collection<CDef.LargeItemFlg> cdefList) {
        doSetLargeItemFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLargeItemFlg_InScope(Collection<String> largeItemFlgList) {
        regINS(CK_INS, cTL(largeItemFlgList), xgetCValueLargeItemFlg(), "LARGE_ITEM_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     * @param largeItemFlgList The collection of largeItemFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemFlg_NotInScope(Collection<String> largeItemFlgList) {
        doSetLargeItemFlg_NotInScope(largeItemFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LargeItemFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg} <br>
     * 大物フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemFlg_NotInScope_AsLargeItemFlg(Collection<CDef.LargeItemFlg> cdefList) {
        doSetLargeItemFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLargeItemFlg_NotInScope(Collection<String> largeItemFlgList) {
        regINS(CK_NINS, cTL(largeItemFlgList), xgetCValueLargeItemFlg(), "LARGE_ITEM_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     */
    public void setLargeItemFlg_IsNull() { regLargeItemFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     */
    public void setLargeItemFlg_IsNullOrEmpty() { regLargeItemFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     */
    public void setLargeItemFlg_IsNotNull() { regLargeItemFlg(CK_ISNN, DOBJ); }

    protected void regLargeItemFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLargeItemFlg(), "LARGE_ITEM_FLG"); }
    protected abstract ConditionValue xgetCValueLargeItemFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCd The value of hinmokuGroupCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_Equal(String hinmokuGroupCd) {
        doSetHinmokuGroupCd_Equal(fRES(hinmokuGroupCd));
    }

    protected void doSetHinmokuGroupCd_Equal(String hinmokuGroupCd) {
        regHinmokuGroupCd(CK_EQ, hinmokuGroupCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCd The value of hinmokuGroupCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_NotEqual(String hinmokuGroupCd) {
        doSetHinmokuGroupCd_NotEqual(fRES(hinmokuGroupCd));
    }

    protected void doSetHinmokuGroupCd_NotEqual(String hinmokuGroupCd) {
        regHinmokuGroupCd(CK_NES, hinmokuGroupCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCd The value of hinmokuGroupCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_GreaterThan(String hinmokuGroupCd) {
        regHinmokuGroupCd(CK_GT, fRES(hinmokuGroupCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCd The value of hinmokuGroupCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_LessThan(String hinmokuGroupCd) {
        regHinmokuGroupCd(CK_LT, fRES(hinmokuGroupCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCd The value of hinmokuGroupCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_GreaterEqual(String hinmokuGroupCd) {
        regHinmokuGroupCd(CK_GE, fRES(hinmokuGroupCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCd The value of hinmokuGroupCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_LessEqual(String hinmokuGroupCd) {
        regHinmokuGroupCd(CK_LE, fRES(hinmokuGroupCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCdList The collection of hinmokuGroupCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_InScope(Collection<String> hinmokuGroupCdList) {
        doSetHinmokuGroupCd_InScope(hinmokuGroupCdList);
    }

    protected void doSetHinmokuGroupCd_InScope(Collection<String> hinmokuGroupCdList) {
        regINS(CK_INS, cTL(hinmokuGroupCdList), xgetCValueHinmokuGroupCd(), "HINMOKU_GROUP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCdList The collection of hinmokuGroupCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_NotInScope(Collection<String> hinmokuGroupCdList) {
        doSetHinmokuGroupCd_NotInScope(hinmokuGroupCdList);
    }

    protected void doSetHinmokuGroupCd_NotInScope(Collection<String> hinmokuGroupCdList) {
        regINS(CK_NINS, cTL(hinmokuGroupCdList), xgetCValueHinmokuGroupCd(), "HINMOKU_GROUP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setHinmokuGroupCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuGroupCd The value of hinmokuGroupCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuGroupCd_LikeSearch(String hinmokuGroupCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuGroupCd), xgetCValueHinmokuGroupCd(), "HINMOKU_GROUP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCd The value of hinmokuGroupCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuGroupCd_NotLikeSearch(String hinmokuGroupCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuGroupCd), xgetCValueHinmokuGroupCd(), "HINMOKU_GROUP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @param hinmokuGroupCd The value of hinmokuGroupCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroupCd_PrefixSearch(String hinmokuGroupCd) {
        setHinmokuGroupCd_LikeSearch(hinmokuGroupCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     */
    public void setHinmokuGroupCd_IsNull() { regHinmokuGroupCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     */
    public void setHinmokuGroupCd_IsNullOrEmpty() { regHinmokuGroupCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     */
    public void setHinmokuGroupCd_IsNotNull() { regHinmokuGroupCd(CK_ISNN, DOBJ); }

    protected void regHinmokuGroupCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuGroupCd(), "HINMOKU_GROUP_CD"); }
    protected abstract ConditionValue xgetCValueHinmokuGroupCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_Equal(String caseTypeCd) {
        doSetCaseTypeCd_Equal(fRES(caseTypeCd));
    }

    protected void doSetCaseTypeCd_Equal(String caseTypeCd) {
        regCaseTypeCd(CK_EQ, caseTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_NotEqual(String caseTypeCd) {
        doSetCaseTypeCd_NotEqual(fRES(caseTypeCd));
    }

    protected void doSetCaseTypeCd_NotEqual(String caseTypeCd) {
        regCaseTypeCd(CK_NES, caseTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_GreaterThan(String caseTypeCd) {
        regCaseTypeCd(CK_GT, fRES(caseTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_LessThan(String caseTypeCd) {
        regCaseTypeCd(CK_LT, fRES(caseTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_GreaterEqual(String caseTypeCd) {
        regCaseTypeCd(CK_GE, fRES(caseTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_LessEqual(String caseTypeCd) {
        regCaseTypeCd(CK_LE, fRES(caseTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCdList The collection of caseTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_InScope(Collection<String> caseTypeCdList) {
        doSetCaseTypeCd_InScope(caseTypeCdList);
    }

    protected void doSetCaseTypeCd_InScope(Collection<String> caseTypeCdList) {
        regINS(CK_INS, cTL(caseTypeCdList), xgetCValueCaseTypeCd(), "CASE_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCdList The collection of caseTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_NotInScope(Collection<String> caseTypeCdList) {
        doSetCaseTypeCd_NotInScope(caseTypeCdList);
    }

    protected void doSetCaseTypeCd_NotInScope(Collection<String> caseTypeCdList) {
        regINS(CK_NINS, cTL(caseTypeCdList), xgetCValueCaseTypeCd(), "CASE_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCaseTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseTypeCd The value of caseTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseTypeCd_LikeSearch(String caseTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseTypeCd), xgetCValueCaseTypeCd(), "CASE_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseTypeCd_NotLikeSearch(String caseTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseTypeCd), xgetCValueCaseTypeCd(), "CASE_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @param caseTypeCd The value of caseTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseTypeCd_PrefixSearch(String caseTypeCd) {
        setCaseTypeCd_LikeSearch(caseTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCaseTypeCd_IsNull() { regCaseTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCaseTypeCd_IsNullOrEmpty() { regCaseTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCaseTypeCd_IsNotNull() { regCaseTypeCd(CK_ISNN, DOBJ); }

    protected void regCaseTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseTypeCd(), "CASE_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueCaseTypeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param evaluationUnitPrice The value of evaluationUnitPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEvaluationUnitPrice_Equal(java.math.BigDecimal evaluationUnitPrice) {
        doSetEvaluationUnitPrice_Equal(evaluationUnitPrice);
    }

    protected void doSetEvaluationUnitPrice_Equal(java.math.BigDecimal evaluationUnitPrice) {
        regEvaluationUnitPrice(CK_EQ, evaluationUnitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param evaluationUnitPrice The value of evaluationUnitPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEvaluationUnitPrice_NotEqual(java.math.BigDecimal evaluationUnitPrice) {
        doSetEvaluationUnitPrice_NotEqual(evaluationUnitPrice);
    }

    protected void doSetEvaluationUnitPrice_NotEqual(java.math.BigDecimal evaluationUnitPrice) {
        regEvaluationUnitPrice(CK_NES, evaluationUnitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param evaluationUnitPrice The value of evaluationUnitPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEvaluationUnitPrice_GreaterThan(java.math.BigDecimal evaluationUnitPrice) {
        regEvaluationUnitPrice(CK_GT, evaluationUnitPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param evaluationUnitPrice The value of evaluationUnitPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEvaluationUnitPrice_LessThan(java.math.BigDecimal evaluationUnitPrice) {
        regEvaluationUnitPrice(CK_LT, evaluationUnitPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param evaluationUnitPrice The value of evaluationUnitPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEvaluationUnitPrice_GreaterEqual(java.math.BigDecimal evaluationUnitPrice) {
        regEvaluationUnitPrice(CK_GE, evaluationUnitPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param evaluationUnitPrice The value of evaluationUnitPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEvaluationUnitPrice_LessEqual(java.math.BigDecimal evaluationUnitPrice) {
        regEvaluationUnitPrice(CK_LE, evaluationUnitPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param minNumber The min number of evaluationUnitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of evaluationUnitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEvaluationUnitPrice_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEvaluationUnitPrice(), "EVALUATION_UNIT_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param evaluationUnitPriceList The collection of evaluationUnitPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEvaluationUnitPrice_InScope(Collection<java.math.BigDecimal> evaluationUnitPriceList) {
        doSetEvaluationUnitPrice_InScope(evaluationUnitPriceList);
    }

    protected void doSetEvaluationUnitPrice_InScope(Collection<java.math.BigDecimal> evaluationUnitPriceList) {
        regINS(CK_INS, cTL(evaluationUnitPriceList), xgetCValueEvaluationUnitPrice(), "EVALUATION_UNIT_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @param evaluationUnitPriceList The collection of evaluationUnitPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEvaluationUnitPrice_NotInScope(Collection<java.math.BigDecimal> evaluationUnitPriceList) {
        doSetEvaluationUnitPrice_NotInScope(evaluationUnitPriceList);
    }

    protected void doSetEvaluationUnitPrice_NotInScope(Collection<java.math.BigDecimal> evaluationUnitPriceList) {
        regINS(CK_NINS, cTL(evaluationUnitPriceList), xgetCValueEvaluationUnitPrice(), "EVALUATION_UNIT_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     */
    public void setEvaluationUnitPrice_IsNull() { regEvaluationUnitPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     */
    public void setEvaluationUnitPrice_IsNotNull() { regEvaluationUnitPrice(CK_ISNN, DOBJ); }

    protected void regEvaluationUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEvaluationUnitPrice(), "EVALUATION_UNIT_PRICE"); }
    protected abstract ConditionValue xgetCValueEvaluationUnitPrice();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_Equal(String logiSpecialTypeCd) {
        doSetLogiSpecialTypeCd_Equal(fRES(logiSpecialTypeCd));
    }

    /**
     * Equal(=). As LogiSpecialTypeCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_Equal_AsLogiSpecialTypeCd(CDef.LogiSpecialTypeCd cdef) {
        doSetLogiSpecialTypeCd_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: JAN1点読み対象
     */
    public void setLogiSpecialTypeCd_Equal_$1() {
        setLogiSpecialTypeCd_Equal_AsLogiSpecialTypeCd(CDef.LogiSpecialTypeCd.$1);
    }

    protected void doSetLogiSpecialTypeCd_Equal(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_EQ, logiSpecialTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_NotEqual(String logiSpecialTypeCd) {
        doSetLogiSpecialTypeCd_NotEqual(fRES(logiSpecialTypeCd));
    }

    /**
     * NotEqual(&lt;&gt;). As LogiSpecialTypeCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_NotEqual_AsLogiSpecialTypeCd(CDef.LogiSpecialTypeCd cdef) {
        doSetLogiSpecialTypeCd_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: JAN1点読み対象
     */
    public void setLogiSpecialTypeCd_NotEqual_$1() {
        setLogiSpecialTypeCd_NotEqual_AsLogiSpecialTypeCd(CDef.LogiSpecialTypeCd.$1);
    }

    protected void doSetLogiSpecialTypeCd_NotEqual(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_NES, logiSpecialTypeCd);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     * @param logiSpecialTypeCdList The collection of logiSpecialTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_InScope(Collection<String> logiSpecialTypeCdList) {
        doSetLogiSpecialTypeCd_InScope(logiSpecialTypeCdList);
    }

    /**
     * InScope {in ('a', 'b')}. As LogiSpecialTypeCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_InScope_AsLogiSpecialTypeCd(Collection<CDef.LogiSpecialTypeCd> cdefList) {
        doSetLogiSpecialTypeCd_InScope(cTStrL(cdefList));
    }

    protected void doSetLogiSpecialTypeCd_InScope(Collection<String> logiSpecialTypeCdList) {
        regINS(CK_INS, cTL(logiSpecialTypeCdList), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     * @param logiSpecialTypeCdList The collection of logiSpecialTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_NotInScope(Collection<String> logiSpecialTypeCdList) {
        doSetLogiSpecialTypeCd_NotInScope(logiSpecialTypeCdList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LogiSpecialTypeCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd} <br>
     * 物流特殊区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_NotInScope_AsLogiSpecialTypeCd(Collection<CDef.LogiSpecialTypeCd> cdefList) {
        doSetLogiSpecialTypeCd_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLogiSpecialTypeCd_NotInScope(Collection<String> logiSpecialTypeCdList) {
        regINS(CK_NINS, cTL(logiSpecialTypeCdList), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     */
    public void setLogiSpecialTypeCd_IsNull() { regLogiSpecialTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     */
    public void setLogiSpecialTypeCd_IsNullOrEmpty() { regLogiSpecialTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     */
    public void setLogiSpecialTypeCd_IsNotNull() { regLogiSpecialTypeCd(CK_ISNN, DOBJ); }

    protected void regLogiSpecialTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLogiSpecialTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_Equal(String logiAttentionTypeCd) {
        doSetLogiAttentionTypeCd_Equal(fRES(logiAttentionTypeCd));
    }

    /**
     * Equal(=). As LogiAttentionTypeCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_Equal_AsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd cdef) {
        doSetLogiAttentionTypeCd_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setLogiAttentionTypeCd_Equal_$0() {
        setLogiAttentionTypeCd_Equal_AsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setLogiAttentionTypeCd_Equal_$1() {
        setLogiAttentionTypeCd_Equal_AsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd.$1);
    }

    protected void doSetLogiAttentionTypeCd_Equal(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_EQ, logiAttentionTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_NotEqual(String logiAttentionTypeCd) {
        doSetLogiAttentionTypeCd_NotEqual(fRES(logiAttentionTypeCd));
    }

    /**
     * NotEqual(&lt;&gt;). As LogiAttentionTypeCd. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_NotEqual_AsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd cdef) {
        doSetLogiAttentionTypeCd_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 使用しない
     */
    public void setLogiAttentionTypeCd_NotEqual_$0() {
        setLogiAttentionTypeCd_NotEqual_AsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用する
     */
    public void setLogiAttentionTypeCd_NotEqual_$1() {
        setLogiAttentionTypeCd_NotEqual_AsLogiAttentionTypeCd(CDef.LogiAttentionTypeCd.$1);
    }

    protected void doSetLogiAttentionTypeCd_NotEqual(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_NES, logiAttentionTypeCd);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     * @param logiAttentionTypeCdList The collection of logiAttentionTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_InScope(Collection<String> logiAttentionTypeCdList) {
        doSetLogiAttentionTypeCd_InScope(logiAttentionTypeCdList);
    }

    /**
     * InScope {in ('a', 'b')}. As LogiAttentionTypeCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_InScope_AsLogiAttentionTypeCd(Collection<CDef.LogiAttentionTypeCd> cdefList) {
        doSetLogiAttentionTypeCd_InScope(cTStrL(cdefList));
    }

    protected void doSetLogiAttentionTypeCd_InScope(Collection<String> logiAttentionTypeCdList) {
        regINS(CK_INS, cTL(logiAttentionTypeCdList), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     * @param logiAttentionTypeCdList The collection of logiAttentionTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_NotInScope(Collection<String> logiAttentionTypeCdList) {
        doSetLogiAttentionTypeCd_NotInScope(logiAttentionTypeCdList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LogiAttentionTypeCd. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd} <br>
     * 物流注意区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_NotInScope_AsLogiAttentionTypeCd(Collection<CDef.LogiAttentionTypeCd> cdefList) {
        doSetLogiAttentionTypeCd_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLogiAttentionTypeCd_NotInScope(Collection<String> logiAttentionTypeCdList) {
        regINS(CK_NINS, cTL(logiAttentionTypeCdList), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     */
    public void setLogiAttentionTypeCd_IsNull() { regLogiAttentionTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     */
    public void setLogiAttentionTypeCd_IsNullOrEmpty() { regLogiAttentionTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     */
    public void setLogiAttentionTypeCd_IsNotNull() { regLogiAttentionTypeCd(CK_ISNN, DOBJ); }

    protected void regLogiAttentionTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLogiAttentionTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_Equal(String unitNm) {
        doSetUnitNm_Equal(fRES(unitNm));
    }

    protected void doSetUnitNm_Equal(String unitNm) {
        regUnitNm(CK_EQ, unitNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_NotEqual(String unitNm) {
        doSetUnitNm_NotEqual(fRES(unitNm));
    }

    protected void doSetUnitNm_NotEqual(String unitNm) {
        regUnitNm(CK_NES, unitNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterThan(String unitNm) {
        regUnitNm(CK_GT, fRES(unitNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessThan(String unitNm) {
        regUnitNm(CK_LT, fRES(unitNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterEqual(String unitNm) {
        regUnitNm(CK_GE, fRES(unitNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessEqual(String unitNm) {
        regUnitNm(CK_LE, fRES(unitNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNmList The collection of unitNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_InScope(Collection<String> unitNmList) {
        doSetUnitNm_InScope(unitNmList);
    }

    protected void doSetUnitNm_InScope(Collection<String> unitNmList) {
        regINS(CK_INS, cTL(unitNmList), xgetCValueUnitNm(), "UNIT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNmList The collection of unitNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_NotInScope(Collection<String> unitNmList) {
        doSetUnitNm_NotInScope(unitNmList);
    }

    protected void doSetUnitNm_NotInScope(Collection<String> unitNmList) {
        regINS(CK_NINS, cTL(unitNmList), xgetCValueUnitNm(), "UNIT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)} <br>
     * <pre>e.g. setUnitNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unitNm The value of unitNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnitNm_LikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitNm_NotLikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_PrefixSearch(String unitNm) {
        setUnitNm_LikeSearch(unitNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNull() { regUnitNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNullOrEmpty() { regUnitNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNotNull() { regUnitNm(CK_ISNN, DOBJ); }

    protected void regUnitNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNm(), "UNIT_NM"); }
    protected abstract ConditionValue xgetCValueUnitNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_Equal(String oldJanCd) {
        doSetOldJanCd_Equal(fRES(oldJanCd));
    }

    protected void doSetOldJanCd_Equal(String oldJanCd) {
        regOldJanCd(CK_EQ, oldJanCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_NotEqual(String oldJanCd) {
        doSetOldJanCd_NotEqual(fRES(oldJanCd));
    }

    protected void doSetOldJanCd_NotEqual(String oldJanCd) {
        regOldJanCd(CK_NES, oldJanCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_GreaterThan(String oldJanCd) {
        regOldJanCd(CK_GT, fRES(oldJanCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_LessThan(String oldJanCd) {
        regOldJanCd(CK_LT, fRES(oldJanCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_GreaterEqual(String oldJanCd) {
        regOldJanCd(CK_GE, fRES(oldJanCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_LessEqual(String oldJanCd) {
        regOldJanCd(CK_LE, fRES(oldJanCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCdList The collection of oldJanCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_InScope(Collection<String> oldJanCdList) {
        doSetOldJanCd_InScope(oldJanCdList);
    }

    protected void doSetOldJanCd_InScope(Collection<String> oldJanCdList) {
        regINS(CK_INS, cTL(oldJanCdList), xgetCValueOldJanCd(), "OLD_JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCdList The collection of oldJanCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_NotInScope(Collection<String> oldJanCdList) {
        doSetOldJanCd_NotInScope(oldJanCdList);
    }

    protected void doSetOldJanCd_NotInScope(Collection<String> oldJanCdList) {
        regINS(CK_NINS, cTL(oldJanCdList), xgetCValueOldJanCd(), "OLD_JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setOldJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param oldJanCd The value of oldJanCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOldJanCd_LikeSearch(String oldJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(oldJanCd), xgetCValueOldJanCd(), "OLD_JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOldJanCd_NotLikeSearch(String oldJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(oldJanCd), xgetCValueOldJanCd(), "OLD_JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @param oldJanCd The value of oldJanCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldJanCd_PrefixSearch(String oldJanCd) {
        setOldJanCd_LikeSearch(oldJanCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     */
    public void setOldJanCd_IsNull() { regOldJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     */
    public void setOldJanCd_IsNullOrEmpty() { regOldJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     */
    public void setOldJanCd_IsNotNull() { regOldJanCd(CK_ISNN, DOBJ); }

    protected void regOldJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOldJanCd(), "OLD_JAN_CD"); }
    protected abstract ConditionValue xgetCValueOldJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCd The value of recomendLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_Equal(String recomendLocationCd) {
        doSetRecomendLocationCd_Equal(fRES(recomendLocationCd));
    }

    protected void doSetRecomendLocationCd_Equal(String recomendLocationCd) {
        regRecomendLocationCd(CK_EQ, recomendLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCd The value of recomendLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_NotEqual(String recomendLocationCd) {
        doSetRecomendLocationCd_NotEqual(fRES(recomendLocationCd));
    }

    protected void doSetRecomendLocationCd_NotEqual(String recomendLocationCd) {
        regRecomendLocationCd(CK_NES, recomendLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCd The value of recomendLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_GreaterThan(String recomendLocationCd) {
        regRecomendLocationCd(CK_GT, fRES(recomendLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCd The value of recomendLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_LessThan(String recomendLocationCd) {
        regRecomendLocationCd(CK_LT, fRES(recomendLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCd The value of recomendLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_GreaterEqual(String recomendLocationCd) {
        regRecomendLocationCd(CK_GE, fRES(recomendLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCd The value of recomendLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_LessEqual(String recomendLocationCd) {
        regRecomendLocationCd(CK_LE, fRES(recomendLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCdList The collection of recomendLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_InScope(Collection<String> recomendLocationCdList) {
        doSetRecomendLocationCd_InScope(recomendLocationCdList);
    }

    protected void doSetRecomendLocationCd_InScope(Collection<String> recomendLocationCdList) {
        regINS(CK_INS, cTL(recomendLocationCdList), xgetCValueRecomendLocationCd(), "RECOMEND_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCdList The collection of recomendLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_NotInScope(Collection<String> recomendLocationCdList) {
        doSetRecomendLocationCd_NotInScope(recomendLocationCdList);
    }

    protected void doSetRecomendLocationCd_NotInScope(Collection<String> recomendLocationCdList) {
        regINS(CK_NINS, cTL(recomendLocationCdList), xgetCValueRecomendLocationCd(), "RECOMEND_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setRecomendLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param recomendLocationCd The value of recomendLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRecomendLocationCd_LikeSearch(String recomendLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(recomendLocationCd), xgetCValueRecomendLocationCd(), "RECOMEND_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCd The value of recomendLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRecomendLocationCd_NotLikeSearch(String recomendLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(recomendLocationCd), xgetCValueRecomendLocationCd(), "RECOMEND_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recomendLocationCd The value of recomendLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationCd_PrefixSearch(String recomendLocationCd) {
        setRecomendLocationCd_LikeSearch(recomendLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     */
    public void setRecomendLocationCd_IsNull() { regRecomendLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     */
    public void setRecomendLocationCd_IsNullOrEmpty() { regRecomendLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     */
    public void setRecomendLocationCd_IsNotNull() { regRecomendLocationCd(CK_ISNN, DOBJ); }

    protected void regRecomendLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecomendLocationCd(), "RECOMEND_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueRecomendLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_Equal(String recomendLocationTypeCd) {
        doSetRecomendLocationTypeCd_Equal(fRES(recomendLocationTypeCd));
    }

    protected void doSetRecomendLocationTypeCd_Equal(String recomendLocationTypeCd) {
        regRecomendLocationTypeCd(CK_EQ, recomendLocationTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_NotEqual(String recomendLocationTypeCd) {
        doSetRecomendLocationTypeCd_NotEqual(fRES(recomendLocationTypeCd));
    }

    protected void doSetRecomendLocationTypeCd_NotEqual(String recomendLocationTypeCd) {
        regRecomendLocationTypeCd(CK_NES, recomendLocationTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_GreaterThan(String recomendLocationTypeCd) {
        regRecomendLocationTypeCd(CK_GT, fRES(recomendLocationTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_LessThan(String recomendLocationTypeCd) {
        regRecomendLocationTypeCd(CK_LT, fRES(recomendLocationTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_GreaterEqual(String recomendLocationTypeCd) {
        regRecomendLocationTypeCd(CK_GE, fRES(recomendLocationTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_LessEqual(String recomendLocationTypeCd) {
        regRecomendLocationTypeCd(CK_LE, fRES(recomendLocationTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCdList The collection of recomendLocationTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_InScope(Collection<String> recomendLocationTypeCdList) {
        doSetRecomendLocationTypeCd_InScope(recomendLocationTypeCdList);
    }

    protected void doSetRecomendLocationTypeCd_InScope(Collection<String> recomendLocationTypeCdList) {
        regINS(CK_INS, cTL(recomendLocationTypeCdList), xgetCValueRecomendLocationTypeCd(), "RECOMEND_LOCATION_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCdList The collection of recomendLocationTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_NotInScope(Collection<String> recomendLocationTypeCdList) {
        doSetRecomendLocationTypeCd_NotInScope(recomendLocationTypeCdList);
    }

    protected void doSetRecomendLocationTypeCd_NotInScope(Collection<String> recomendLocationTypeCdList) {
        regINS(CK_NINS, cTL(recomendLocationTypeCdList), xgetCValueRecomendLocationTypeCd(), "RECOMEND_LOCATION_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setRecomendLocationTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRecomendLocationTypeCd_LikeSearch(String recomendLocationTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(recomendLocationTypeCd), xgetCValueRecomendLocationTypeCd(), "RECOMEND_LOCATION_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRecomendLocationTypeCd_NotLikeSearch(String recomendLocationTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(recomendLocationTypeCd), xgetCValueRecomendLocationTypeCd(), "RECOMEND_LOCATION_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @param recomendLocationTypeCd The value of recomendLocationTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecomendLocationTypeCd_PrefixSearch(String recomendLocationTypeCd) {
        setRecomendLocationTypeCd_LikeSearch(recomendLocationTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     */
    public void setRecomendLocationTypeCd_IsNull() { regRecomendLocationTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     */
    public void setRecomendLocationTypeCd_IsNullOrEmpty() { regRecomendLocationTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     */
    public void setRecomendLocationTypeCd_IsNotNull() { regRecomendLocationTypeCd(CK_ISNN, DOBJ); }

    protected void regRecomendLocationTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecomendLocationTypeCd(), "RECOMEND_LOCATION_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueRecomendLocationTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCd The value of innerJanCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_Equal(String innerJanCd) {
        doSetInnerJanCd_Equal(fRES(innerJanCd));
    }

    protected void doSetInnerJanCd_Equal(String innerJanCd) {
        regInnerJanCd(CK_EQ, innerJanCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCd The value of innerJanCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_NotEqual(String innerJanCd) {
        doSetInnerJanCd_NotEqual(fRES(innerJanCd));
    }

    protected void doSetInnerJanCd_NotEqual(String innerJanCd) {
        regInnerJanCd(CK_NES, innerJanCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCd The value of innerJanCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_GreaterThan(String innerJanCd) {
        regInnerJanCd(CK_GT, fRES(innerJanCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCd The value of innerJanCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_LessThan(String innerJanCd) {
        regInnerJanCd(CK_LT, fRES(innerJanCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCd The value of innerJanCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_GreaterEqual(String innerJanCd) {
        regInnerJanCd(CK_GE, fRES(innerJanCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCd The value of innerJanCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_LessEqual(String innerJanCd) {
        regInnerJanCd(CK_LE, fRES(innerJanCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCdList The collection of innerJanCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_InScope(Collection<String> innerJanCdList) {
        doSetInnerJanCd_InScope(innerJanCdList);
    }

    protected void doSetInnerJanCd_InScope(Collection<String> innerJanCdList) {
        regINS(CK_INS, cTL(innerJanCdList), xgetCValueInnerJanCd(), "INNER_JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCdList The collection of innerJanCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_NotInScope(Collection<String> innerJanCdList) {
        doSetInnerJanCd_NotInScope(innerJanCdList);
    }

    protected void doSetInnerJanCd_NotInScope(Collection<String> innerJanCdList) {
        regINS(CK_NINS, cTL(innerJanCdList), xgetCValueInnerJanCd(), "INNER_JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setInnerJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param innerJanCd The value of innerJanCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInnerJanCd_LikeSearch(String innerJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(innerJanCd), xgetCValueInnerJanCd(), "INNER_JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCd The value of innerJanCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInnerJanCd_NotLikeSearch(String innerJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(innerJanCd), xgetCValueInnerJanCd(), "INNER_JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @param innerJanCd The value of innerJanCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInnerJanCd_PrefixSearch(String innerJanCd) {
        setInnerJanCd_LikeSearch(innerJanCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     */
    public void setInnerJanCd_IsNull() { regInnerJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     */
    public void setInnerJanCd_IsNullOrEmpty() { regInnerJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     */
    public void setInnerJanCd_IsNotNull() { regInnerJanCd(CK_ISNN, DOBJ); }

    protected void regInnerJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInnerJanCd(), "INNER_JAN_CD"); }
    protected abstract ConditionValue xgetCValueInnerJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDate The value of createDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_Equal(String createDate) {
        doSetCreateDate_Equal(fRES(createDate));
    }

    protected void doSetCreateDate_Equal(String createDate) {
        regCreateDate(CK_EQ, createDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDate The value of createDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_NotEqual(String createDate) {
        doSetCreateDate_NotEqual(fRES(createDate));
    }

    protected void doSetCreateDate_NotEqual(String createDate) {
        regCreateDate(CK_NES, createDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDate The value of createDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_GreaterThan(String createDate) {
        regCreateDate(CK_GT, fRES(createDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDate The value of createDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_LessThan(String createDate) {
        regCreateDate(CK_LT, fRES(createDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDate The value of createDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_GreaterEqual(String createDate) {
        regCreateDate(CK_GE, fRES(createDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDate The value of createDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_LessEqual(String createDate) {
        regCreateDate(CK_LE, fRES(createDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDateList The collection of createDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_InScope(Collection<String> createDateList) {
        doSetCreateDate_InScope(createDateList);
    }

    protected void doSetCreateDate_InScope(Collection<String> createDateList) {
        regINS(CK_INS, cTL(createDateList), xgetCValueCreateDate(), "CREATE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDateList The collection of createDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_NotInScope(Collection<String> createDateList) {
        doSetCreateDate_NotInScope(createDateList);
    }

    protected void doSetCreateDate_NotInScope(Collection<String> createDateList) {
        regINS(CK_NINS, cTL(createDateList), xgetCValueCreateDate(), "CREATE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)} <br>
     * <pre>e.g. setCreateDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createDate The value of createDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateDate_LikeSearch(String createDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createDate), xgetCValueCreateDate(), "CREATE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDate The value of createDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateDate_NotLikeSearch(String createDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createDate), xgetCValueCreateDate(), "CREATE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @param createDate The value of createDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDate_PrefixSearch(String createDate) {
        setCreateDate_LikeSearch(createDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     */
    public void setCreateDate_IsNull() { regCreateDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     */
    public void setCreateDate_IsNullOrEmpty() { regCreateDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATE_DATE: {VARCHAR(8)}
     */
    public void setCreateDate_IsNotNull() { regCreateDate(CK_ISNN, DOBJ); }

    protected void regCreateDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateDate(), "CREATE_DATE"); }
    protected abstract ConditionValue xgetCValueCreateDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTime The value of createTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_Equal(String createTime) {
        doSetCreateTime_Equal(fRES(createTime));
    }

    protected void doSetCreateTime_Equal(String createTime) {
        regCreateTime(CK_EQ, createTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTime The value of createTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_NotEqual(String createTime) {
        doSetCreateTime_NotEqual(fRES(createTime));
    }

    protected void doSetCreateTime_NotEqual(String createTime) {
        regCreateTime(CK_NES, createTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTime The value of createTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_GreaterThan(String createTime) {
        regCreateTime(CK_GT, fRES(createTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTime The value of createTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_LessThan(String createTime) {
        regCreateTime(CK_LT, fRES(createTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTime The value of createTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_GreaterEqual(String createTime) {
        regCreateTime(CK_GE, fRES(createTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTime The value of createTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_LessEqual(String createTime) {
        regCreateTime(CK_LE, fRES(createTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTimeList The collection of createTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_InScope(Collection<String> createTimeList) {
        doSetCreateTime_InScope(createTimeList);
    }

    protected void doSetCreateTime_InScope(Collection<String> createTimeList) {
        regINS(CK_INS, cTL(createTimeList), xgetCValueCreateTime(), "CREATE_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTimeList The collection of createTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_NotInScope(Collection<String> createTimeList) {
        doSetCreateTime_NotInScope(createTimeList);
    }

    protected void doSetCreateTime_NotInScope(Collection<String> createTimeList) {
        regINS(CK_NINS, cTL(createTimeList), xgetCValueCreateTime(), "CREATE_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)} <br>
     * <pre>e.g. setCreateTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createTime The value of createTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateTime_LikeSearch(String createTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createTime), xgetCValueCreateTime(), "CREATE_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTime The value of createTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateTime_NotLikeSearch(String createTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createTime), xgetCValueCreateTime(), "CREATE_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @param createTime The value of createTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateTime_PrefixSearch(String createTime) {
        setCreateTime_LikeSearch(createTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     */
    public void setCreateTime_IsNull() { regCreateTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     */
    public void setCreateTime_IsNullOrEmpty() { regCreateTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATE_TIME: {VARCHAR(6)}
     */
    public void setCreateTime_IsNotNull() { regCreateTime(CK_ISNN, DOBJ); }

    protected void regCreateTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateTime(), "CREATE_TIME"); }
    protected abstract ConditionValue xgetCValueCreateTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param floorRefStockNum The value of floorRefStockNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloorRefStockNum_Equal(java.math.BigDecimal floorRefStockNum) {
        doSetFloorRefStockNum_Equal(floorRefStockNum);
    }

    protected void doSetFloorRefStockNum_Equal(java.math.BigDecimal floorRefStockNum) {
        regFloorRefStockNum(CK_EQ, floorRefStockNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param floorRefStockNum The value of floorRefStockNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloorRefStockNum_NotEqual(java.math.BigDecimal floorRefStockNum) {
        doSetFloorRefStockNum_NotEqual(floorRefStockNum);
    }

    protected void doSetFloorRefStockNum_NotEqual(java.math.BigDecimal floorRefStockNum) {
        regFloorRefStockNum(CK_NES, floorRefStockNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param floorRefStockNum The value of floorRefStockNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloorRefStockNum_GreaterThan(java.math.BigDecimal floorRefStockNum) {
        regFloorRefStockNum(CK_GT, floorRefStockNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param floorRefStockNum The value of floorRefStockNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloorRefStockNum_LessThan(java.math.BigDecimal floorRefStockNum) {
        regFloorRefStockNum(CK_LT, floorRefStockNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param floorRefStockNum The value of floorRefStockNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloorRefStockNum_GreaterEqual(java.math.BigDecimal floorRefStockNum) {
        regFloorRefStockNum(CK_GE, floorRefStockNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param floorRefStockNum The value of floorRefStockNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFloorRefStockNum_LessEqual(java.math.BigDecimal floorRefStockNum) {
        regFloorRefStockNum(CK_LE, floorRefStockNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param minNumber The min number of floorRefStockNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of floorRefStockNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFloorRefStockNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFloorRefStockNum(), "FLOOR_REF_STOCK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param floorRefStockNumList The collection of floorRefStockNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorRefStockNum_InScope(Collection<java.math.BigDecimal> floorRefStockNumList) {
        doSetFloorRefStockNum_InScope(floorRefStockNumList);
    }

    protected void doSetFloorRefStockNum_InScope(Collection<java.math.BigDecimal> floorRefStockNumList) {
        regINS(CK_INS, cTL(floorRefStockNumList), xgetCValueFloorRefStockNum(), "FLOOR_REF_STOCK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @param floorRefStockNumList The collection of floorRefStockNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorRefStockNum_NotInScope(Collection<java.math.BigDecimal> floorRefStockNumList) {
        doSetFloorRefStockNum_NotInScope(floorRefStockNumList);
    }

    protected void doSetFloorRefStockNum_NotInScope(Collection<java.math.BigDecimal> floorRefStockNumList) {
        regINS(CK_NINS, cTL(floorRefStockNumList), xgetCValueFloorRefStockNum(), "FLOOR_REF_STOCK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     */
    public void setFloorRefStockNum_IsNull() { regFloorRefStockNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     */
    public void setFloorRefStockNum_IsNotNull() { regFloorRefStockNum(CK_ISNN, DOBJ); }

    protected void regFloorRefStockNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloorRefStockNum(), "FLOOR_REF_STOCK_NUM"); }
    protected abstract ConditionValue xgetCValueFloorRefStockNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_Equal(String wmSendFlg) {
        doSetWmSendFlg_Equal(fRES(wmSendFlg));
    }

    protected void doSetWmSendFlg_Equal(String wmSendFlg) {
        regWmSendFlg(CK_EQ, wmSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_NotEqual(String wmSendFlg) {
        doSetWmSendFlg_NotEqual(fRES(wmSendFlg));
    }

    protected void doSetWmSendFlg_NotEqual(String wmSendFlg) {
        regWmSendFlg(CK_NES, wmSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_GreaterThan(String wmSendFlg) {
        regWmSendFlg(CK_GT, fRES(wmSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_LessThan(String wmSendFlg) {
        regWmSendFlg(CK_LT, fRES(wmSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_GreaterEqual(String wmSendFlg) {
        regWmSendFlg(CK_GE, fRES(wmSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_LessEqual(String wmSendFlg) {
        regWmSendFlg(CK_LE, fRES(wmSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlgList The collection of wmSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_InScope(Collection<String> wmSendFlgList) {
        doSetWmSendFlg_InScope(wmSendFlgList);
    }

    protected void doSetWmSendFlg_InScope(Collection<String> wmSendFlgList) {
        regINS(CK_INS, cTL(wmSendFlgList), xgetCValueWmSendFlg(), "WM_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlgList The collection of wmSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_NotInScope(Collection<String> wmSendFlgList) {
        doSetWmSendFlg_NotInScope(wmSendFlgList);
    }

    protected void doSetWmSendFlg_NotInScope(Collection<String> wmSendFlgList) {
        regINS(CK_NINS, cTL(wmSendFlgList), xgetCValueWmSendFlg(), "WM_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setWmSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmSendFlg The value of wmSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmSendFlg_LikeSearch(String wmSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmSendFlg), xgetCValueWmSendFlg(), "WM_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmSendFlg_NotLikeSearch(String wmSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmSendFlg), xgetCValueWmSendFlg(), "WM_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_PrefixSearch(String wmSendFlg) {
        setWmSendFlg_LikeSearch(wmSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmSendFlg_IsNull() { regWmSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmSendFlg_IsNullOrEmpty() { regWmSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmSendFlg_IsNotNull() { regWmSendFlg(CK_ISNN, DOBJ); }

    protected void regWmSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmSendFlg(), "WM_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueWmSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_Equal(String lpSendFlg) {
        doSetLpSendFlg_Equal(fRES(lpSendFlg));
    }

    protected void doSetLpSendFlg_Equal(String lpSendFlg) {
        regLpSendFlg(CK_EQ, lpSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_NotEqual(String lpSendFlg) {
        doSetLpSendFlg_NotEqual(fRES(lpSendFlg));
    }

    protected void doSetLpSendFlg_NotEqual(String lpSendFlg) {
        regLpSendFlg(CK_NES, lpSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterThan(String lpSendFlg) {
        regLpSendFlg(CK_GT, fRES(lpSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessThan(String lpSendFlg) {
        regLpSendFlg(CK_LT, fRES(lpSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterEqual(String lpSendFlg) {
        regLpSendFlg(CK_GE, fRES(lpSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessEqual(String lpSendFlg) {
        regLpSendFlg(CK_LE, fRES(lpSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlgList The collection of lpSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_InScope(Collection<String> lpSendFlgList) {
        doSetLpSendFlg_InScope(lpSendFlgList);
    }

    protected void doSetLpSendFlg_InScope(Collection<String> lpSendFlgList) {
        regINS(CK_INS, cTL(lpSendFlgList), xgetCValueLpSendFlg(), "LP_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlgList The collection of lpSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_NotInScope(Collection<String> lpSendFlgList) {
        doSetLpSendFlg_NotInScope(lpSendFlgList);
    }

    protected void doSetLpSendFlg_NotInScope(Collection<String> lpSendFlgList) {
        regINS(CK_NINS, cTL(lpSendFlgList), xgetCValueLpSendFlg(), "LP_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setLpSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lpSendFlg The value of lpSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLpSendFlg_LikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLpSendFlg_NotLikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_PrefixSearch(String lpSendFlg) {
        setLpSendFlg_LikeSearch(lpSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNull() { regLpSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNullOrEmpty() { regLpSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNotNull() { regLpSendFlg(CK_ISNN, DOBJ); }

    protected void regLpSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLpSendFlg(), "LP_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueLpSendFlg();

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
    public HpSLCFunction<MProductCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MProductCB.class);
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
    public HpSLCFunction<MProductCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MProductCB.class);
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
    public HpSLCFunction<MProductCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MProductCB.class);
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
    public HpSLCFunction<MProductCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MProductCB.class);
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
    public HpSLCFunction<MProductCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MProductCB&gt;() {
     *     public void query(MProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MProductCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MProductCQ sq);

    protected MProductCB xcreateScalarConditionCB() {
        MProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MProductCB xcreateScalarConditionPartitionByCB() {
        MProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = new MProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = new MProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MProductCQ sq);

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
    protected MProductCB newMyCB() {
        return new MProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
