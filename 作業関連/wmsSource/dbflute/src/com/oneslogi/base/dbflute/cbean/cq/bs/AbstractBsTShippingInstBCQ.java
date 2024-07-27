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
 * The abstract condition-query of t_shipping_inst_b.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTShippingInstBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTShippingInstBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_shipping_inst_b";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstBId The value of shippingInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_Equal(Long shippingInstBId) {
        doSetShippingInstBId_Equal(shippingInstBId);
    }

    protected void doSetShippingInstBId_Equal(Long shippingInstBId) {
        regShippingInstBId(CK_EQ, shippingInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstBId The value of shippingInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotEqual(Long shippingInstBId) {
        doSetShippingInstBId_NotEqual(shippingInstBId);
    }

    protected void doSetShippingInstBId_NotEqual(Long shippingInstBId) {
        regShippingInstBId(CK_NES, shippingInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstBId The value of shippingInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterThan(Long shippingInstBId) {
        regShippingInstBId(CK_GT, shippingInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstBId The value of shippingInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessThan(Long shippingInstBId) {
        regShippingInstBId(CK_LT, shippingInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstBId The value of shippingInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterEqual(Long shippingInstBId) {
        regShippingInstBId(CK_GE, shippingInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstBId The value of shippingInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessEqual(Long shippingInstBId) {
        regShippingInstBId(CK_LE, shippingInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstBIdList The collection of shippingInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_InScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_InScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_InScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_INS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstBIdList The collection of shippingInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_NotInScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_NINS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_B_ID from t_picking_b where ...)} <br>
     * t_picking_b by SHIPPING_INST_B_ID, named 'TPickingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingBList for 'exists'. (NotNull)
     */
    public void existsTPickingBList(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstBId_ExistsReferrer_TPickingBList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tPickingBList");
    }
    public abstract String keepShippingInstBId_ExistsReferrer_TPickingBList(TPickingBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_B_ID from t_shipping_inst_b_print where ...)} <br>
     * t_shipping_inst_b_print by SHIPPING_INST_B_ID, named 'TShippingInstBPrintAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstBPrintList</span>(printCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstBPrintList for 'exists'. (NotNull)
     */
    public void existsTShippingInstBPrintList(SubQuery<TShippingInstBPrintCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBPrintCB cb = new TShippingInstBPrintCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstBId_ExistsReferrer_TShippingInstBPrintList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstBPrintList");
    }
    public abstract String keepShippingInstBId_ExistsReferrer_TShippingInstBPrintList(TShippingInstBPrintCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_B_ID from t_shipping_inst_data_transfer where ...)} <br>
     * t_shipping_inst_data_transfer by SHIPPING_INST_B_ID, named 'TShippingInstDataTransferAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstDataTransferList</span>(transferCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     transferCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstDataTransferList for 'exists'. (NotNull)
     */
    public void existsTShippingInstDataTransferList(SubQuery<TShippingInstDataTransferCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstDataTransferCB cb = new TShippingInstDataTransferCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstBId_ExistsReferrer_TShippingInstDataTransferList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstDataTransferList");
    }
    public abstract String keepShippingInstBId_ExistsReferrer_TShippingInstDataTransferList(TShippingInstDataTransferCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_B_ID from t_shipping_inst_spare where ...)} <br>
     * t_shipping_inst_spare by SHIPPING_INST_B_ID, named 'TShippingInstSpareAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstSpareAsOne</span>(spareCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     spareCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstSpareAsOne for 'exists'. (NotNull)
     */
    public void existsTShippingInstSpareAsOne(SubQuery<TShippingInstSpareCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstSpareCB cb = new TShippingInstSpareCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstBId_ExistsReferrer_TShippingInstSpareAsOne(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstSpareAsOne");
    }
    public abstract String keepShippingInstBId_ExistsReferrer_TShippingInstSpareAsOne(TShippingInstSpareCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_B_ID from t_picking_b where ...)} <br>
     * t_picking_b by SHIPPING_INST_B_ID, named 'TPickingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstBId_NotExistsReferrer_TPickingBList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingBList(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstBId_NotExistsReferrer_TPickingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tPickingBList");
    }
    public abstract String keepShippingInstBId_NotExistsReferrer_TPickingBList(TPickingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_B_ID from t_shipping_inst_b_print where ...)} <br>
     * t_shipping_inst_b_print by SHIPPING_INST_B_ID, named 'TShippingInstBPrintAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBPrintList</span>(printCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstBId_NotExistsReferrer_TShippingInstBPrintList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBPrintList(SubQuery<TShippingInstBPrintCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBPrintCB cb = new TShippingInstBPrintCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstBId_NotExistsReferrer_TShippingInstBPrintList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstBPrintList");
    }
    public abstract String keepShippingInstBId_NotExistsReferrer_TShippingInstBPrintList(TShippingInstBPrintCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_B_ID from t_shipping_inst_data_transfer where ...)} <br>
     * t_shipping_inst_data_transfer by SHIPPING_INST_B_ID, named 'TShippingInstDataTransferAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstDataTransferList</span>(transferCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     transferCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstBId_NotExistsReferrer_TShippingInstDataTransferList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstDataTransferList(SubQuery<TShippingInstDataTransferCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstDataTransferCB cb = new TShippingInstDataTransferCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstBId_NotExistsReferrer_TShippingInstDataTransferList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstDataTransferList");
    }
    public abstract String keepShippingInstBId_NotExistsReferrer_TShippingInstDataTransferList(TShippingInstDataTransferCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_B_ID from t_shipping_inst_spare where ...)} <br>
     * t_shipping_inst_spare by SHIPPING_INST_B_ID, named 'TShippingInstSpareAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstSpareAsOne</span>(spareCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     spareCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstBId_NotExistsReferrer_TShippingInstSpareAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstSpareAsOne(SubQuery<TShippingInstSpareCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstSpareCB cb = new TShippingInstSpareCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstBId_NotExistsReferrer_TShippingInstSpareAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstSpareAsOne");
    }
    public abstract String keepShippingInstBId_NotExistsReferrer_TShippingInstSpareAsOne(TShippingInstSpareCQ sq);

    public void xsderiveTPickingBList(String fn, SubQuery<TPickingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingInstBId_SpecifyDerivedReferrer_TPickingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tPickingBList", al, op);
    }
    public abstract String keepShippingInstBId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq);

    public void xsderiveTShippingInstBPrintList(String fn, SubQuery<TShippingInstBPrintCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBPrintCB cb = new TShippingInstBPrintCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingInstBId_SpecifyDerivedReferrer_TShippingInstBPrintList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstBPrintList", al, op);
    }
    public abstract String keepShippingInstBId_SpecifyDerivedReferrer_TShippingInstBPrintList(TShippingInstBPrintCQ sq);

    public void xsderiveTShippingInstDataTransferList(String fn, SubQuery<TShippingInstDataTransferCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstDataTransferCB cb = new TShippingInstDataTransferCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingInstBId_SpecifyDerivedReferrer_TShippingInstDataTransferList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstDataTransferList", al, op);
    }
    public abstract String keepShippingInstBId_SpecifyDerivedReferrer_TShippingInstDataTransferList(TShippingInstDataTransferCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_b where ...)} <br>
     * t_picking_b by SHIPPING_INST_B_ID, named 'TPickingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingBCB> derivedTPickingBList() {
        return xcreateQDRFunctionTPickingBList();
    }
    protected HpQDRFunction<TPickingBCB> xcreateQDRFunctionTPickingBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingBList(String fn, SubQuery<TPickingBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingInstBId_QueryDerivedReferrer_TPickingBList(cb.query()); String prpp = keepShippingInstBId_QueryDerivedReferrer_TPickingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", sqpp, "tPickingBList", rd, vl, prpp, op);
    }
    public abstract String keepShippingInstBId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq);
    public abstract String keepShippingInstBId_QueryDerivedReferrer_TPickingBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_b_print where ...)} <br>
     * t_shipping_inst_b_print by SHIPPING_INST_B_ID, named 'TShippingInstBPrintAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstBPrintList()</span>.<span style="color: #CC4747">max</span>(printCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     printCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstBPrintCB> derivedTShippingInstBPrintList() {
        return xcreateQDRFunctionTShippingInstBPrintList();
    }
    protected HpQDRFunction<TShippingInstBPrintCB> xcreateQDRFunctionTShippingInstBPrintList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstBPrintList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstBPrintList(String fn, SubQuery<TShippingInstBPrintCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBPrintCB cb = new TShippingInstBPrintCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingInstBId_QueryDerivedReferrer_TShippingInstBPrintList(cb.query()); String prpp = keepShippingInstBId_QueryDerivedReferrer_TShippingInstBPrintListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", sqpp, "tShippingInstBPrintList", rd, vl, prpp, op);
    }
    public abstract String keepShippingInstBId_QueryDerivedReferrer_TShippingInstBPrintList(TShippingInstBPrintCQ sq);
    public abstract String keepShippingInstBId_QueryDerivedReferrer_TShippingInstBPrintListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_data_transfer where ...)} <br>
     * t_shipping_inst_data_transfer by SHIPPING_INST_B_ID, named 'TShippingInstDataTransferAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstDataTransferList()</span>.<span style="color: #CC4747">max</span>(transferCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     transferCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     transferCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstDataTransferCB> derivedTShippingInstDataTransferList() {
        return xcreateQDRFunctionTShippingInstDataTransferList();
    }
    protected HpQDRFunction<TShippingInstDataTransferCB> xcreateQDRFunctionTShippingInstDataTransferList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstDataTransferList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstDataTransferList(String fn, SubQuery<TShippingInstDataTransferCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstDataTransferCB cb = new TShippingInstDataTransferCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferList(cb.query()); String prpp = keepShippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", sqpp, "tShippingInstDataTransferList", rd, vl, prpp, op);
    }
    public abstract String keepShippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferList(TShippingInstDataTransferCQ sq);
    public abstract String keepShippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingInstBId_IsNull() { regShippingInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingInstBId_IsNotNull() { regShippingInstBId(CK_ISNN, DOBJ); }

    protected void regShippingInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param shippingInstHId The value of shippingInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_Equal(Long shippingInstHId) {
        doSetShippingInstHId_Equal(shippingInstHId);
    }

    protected void doSetShippingInstHId_Equal(Long shippingInstHId) {
        regShippingInstHId(CK_EQ, shippingInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param shippingInstHId The value of shippingInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotEqual(Long shippingInstHId) {
        doSetShippingInstHId_NotEqual(shippingInstHId);
    }

    protected void doSetShippingInstHId_NotEqual(Long shippingInstHId) {
        regShippingInstHId(CK_NES, shippingInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param shippingInstHId The value of shippingInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterThan(Long shippingInstHId) {
        regShippingInstHId(CK_GT, shippingInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param shippingInstHId The value of shippingInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessThan(Long shippingInstHId) {
        regShippingInstHId(CK_LT, shippingInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param shippingInstHId The value of shippingInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterEqual(Long shippingInstHId) {
        regShippingInstHId(CK_GE, shippingInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param shippingInstHId The value of shippingInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessEqual(Long shippingInstHId) {
        regShippingInstHId(CK_LE, shippingInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param minNumber The min number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param shippingInstHIdList The collection of shippingInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_InScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_INS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @param shippingInstHIdList The collection of shippingInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_NotInScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_NINS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_INST_H_ID from t_shipping_inst_h where ...)} <br />
     * t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @param subCBLambda The callback for sub-query of TShippingInstH for 'in-scope'. (NotNull)
     */
    public void inScopeTShippingInstH(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstHId_InScopeRelation_TShippingInstH(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstH", false);
    }
    public abstract String keepShippingInstHId_InScopeRelation_TShippingInstH(TShippingInstHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_INST_H_ID from t_shipping_inst_h where ...)} <br />
     * t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @param subCBLambda The callback for sub-query of TShippingInstH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTShippingInstH(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstHId_NotInScopeRelation_TShippingInstH(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstH", true);
    }
    public abstract String keepShippingInstHId_NotInScopeRelation_TShippingInstH(TShippingInstHCQ sq);

    protected void regShippingInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_Equal(Long lineNo) {
        doSetLineNo_Equal(lineNo);
    }

    protected void doSetLineNo_Equal(Long lineNo) {
        regLineNo(CK_EQ, lineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_NotEqual(Long lineNo) {
        doSetLineNo_NotEqual(lineNo);
    }

    protected void doSetLineNo_NotEqual(Long lineNo) {
        regLineNo(CK_NES, lineNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterThan(Long lineNo) {
        regLineNo(CK_GT, lineNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessThan(Long lineNo) {
        regLineNo(CK_LT, lineNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterEqual(Long lineNo) {
        regLineNo(CK_GE, lineNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessEqual(Long lineNo) {
        regLineNo(CK_LE, lineNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLineNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLineNo(), "LINE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNoList The collection of lineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_InScope(Collection<Long> lineNoList) {
        doSetLineNo_InScope(lineNoList);
    }

    protected void doSetLineNo_InScope(Collection<Long> lineNoList) {
        regINS(CK_INS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNoList The collection of lineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_NotInScope(Collection<Long> lineNoList) {
        doSetLineNo_NotInScope(lineNoList);
    }

    protected void doSetLineNo_NotInScope(Collection<Long> lineNoList) {
        regINS(CK_NINS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    protected void regLineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineNo(), "LINE_NO"); }
    protected abstract ConditionValue xgetCValueLineNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_Equal(Long warehouseId) {
        doSetWarehouseId_Equal(warehouseId);
    }

    protected void doSetWarehouseId_Equal(Long warehouseId) {
        regWarehouseId(CK_EQ, warehouseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_NotEqual(Long warehouseId) {
        doSetWarehouseId_NotEqual(warehouseId);
    }

    protected void doSetWarehouseId_NotEqual(Long warehouseId) {
        regWarehouseId(CK_NES, warehouseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterThan(Long warehouseId) {
        regWarehouseId(CK_GT, warehouseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessThan(Long warehouseId) {
        regWarehouseId(CK_LT, warehouseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterEqual(Long warehouseId) {
        regWarehouseId(CK_GE, warehouseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessEqual(Long warehouseId) {
        regWarehouseId(CK_LE, warehouseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param minNumber The min number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWarehouseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWarehouseId(), "WAREHOUSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param warehouseIdList The collection of warehouseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseId_InScope(Collection<Long> warehouseIdList) {
        doSetWarehouseId_InScope(warehouseIdList);
    }

    protected void doSetWarehouseId_InScope(Collection<Long> warehouseIdList) {
        regINS(CK_INS, cTL(warehouseIdList), xgetCValueWarehouseId(), "WAREHOUSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param warehouseIdList The collection of warehouseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseId_NotInScope(Collection<Long> warehouseIdList) {
        doSetWarehouseId_NotInScope(warehouseIdList);
    }

    protected void doSetWarehouseId_NotInScope(Collection<Long> warehouseIdList) {
        regINS(CK_NINS, cTL(warehouseIdList), xgetCValueWarehouseId(), "WAREHOUSE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WAREHOUSE_ID from m_warehouse where ...)} <br />
     * m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param subCBLambda The callback for sub-query of MWarehouse for 'in-scope'. (NotNull)
     */
    public void inScopeMWarehouse(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepWarehouseId_InScopeRelation_MWarehouse(cb.query());
        registerInScopeRelation(cb.query(), "WAREHOUSE_ID", "WAREHOUSE_ID", pp, "mWarehouse", false);
    }
    public abstract String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WAREHOUSE_ID from m_warehouse where ...)} <br />
     * m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param subCBLambda The callback for sub-query of MWarehouse for 'not in-scope'. (NotNull)
     */
    public void notInScopeMWarehouse(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepWarehouseId_NotInScopeRelation_MWarehouse(cb.query());
        registerInScopeRelation(cb.query(), "WAREHOUSE_ID", "WAREHOUSE_ID", pp, "mWarehouse", true);
    }
    public abstract String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     */
    public void setWarehouseId_IsNull() { regWarehouseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     */
    public void setWarehouseId_IsNotNull() { regWarehouseId(CK_ISNN, DOBJ); }

    protected void regWarehouseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseId(), "WAREHOUSE_ID"); }
    protected abstract ConditionValue xgetCValueWarehouseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCd The value of warehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_Equal(String warehouseCd) {
        doSetWarehouseCd_Equal(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_Equal(String warehouseCd) {
        regWarehouseCd(CK_EQ, warehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCd The value of warehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotEqual(String warehouseCd) {
        doSetWarehouseCd_NotEqual(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_NotEqual(String warehouseCd) {
        regWarehouseCd(CK_NES, warehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(String warehouseCd) {
        regWarehouseCd(CK_GT, fRES(warehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(String warehouseCd) {
        regWarehouseCd(CK_LT, fRES(warehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(String warehouseCd) {
        regWarehouseCd(CK_GE, fRES(warehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(String warehouseCd) {
        regWarehouseCd(CK_LE, fRES(warehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCdList The collection of warehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_InScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_InScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_InScope(Collection<String> warehouseCdList) {
        regINS(CK_INS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCdList The collection of warehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_NotInScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        regINS(CK_NINS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseCd The value of warehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseCd_LikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCd The value of warehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseCd_NotLikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @param warehouseCd The value of warehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_PrefixSearch(String warehouseCd) {
        setWarehouseCd_LikeSearch(warehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     */
    public void setWarehouseCd_IsNull() { regWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     */
    public void setWarehouseCd_IsNullOrEmpty() { regWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     */
    public void setWarehouseCd_IsNotNull() { regWarehouseCd(CK_ISNN, DOBJ); }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
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
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
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
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
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
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from m_product where ...)} <br />
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from m_product where ...)} <br />
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
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
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
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
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
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
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
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
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)} <br>
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
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_Equal(Long stockTypeId) {
        doSetStockTypeId_Equal(stockTypeId);
    }

    protected void doSetStockTypeId_Equal(Long stockTypeId) {
        regStockTypeId(CK_EQ, stockTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_NotEqual(Long stockTypeId) {
        doSetStockTypeId_NotEqual(stockTypeId);
    }

    protected void doSetStockTypeId_NotEqual(Long stockTypeId) {
        regStockTypeId(CK_NES, stockTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterThan(Long stockTypeId) {
        regStockTypeId(CK_GT, stockTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessThan(Long stockTypeId) {
        regStockTypeId(CK_LT, stockTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterEqual(Long stockTypeId) {
        regStockTypeId(CK_GE, stockTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessEqual(Long stockTypeId) {
        regStockTypeId(CK_LE, stockTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param minNumber The min number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockTypeId(), "STOCK_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeIdList The collection of stockTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_InScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        regINS(CK_INS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeIdList The collection of stockTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_NotInScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        regINS(CK_NINS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_TYPE_ID from m_stock_type where ...)} <br />
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'in-scope'. (NotNull)
     */
    public void inScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_InScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", false);
    }
    public abstract String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_TYPE_ID from m_stock_type where ...)} <br />
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_NotInScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", true);
    }
    public abstract String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     */
    public void setStockTypeId_IsNull() { regStockTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     */
    public void setStockTypeId_IsNotNull() { regStockTypeId(CK_ISNN, DOBJ); }

    protected void regStockTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeId(), "STOCK_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueStockTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCd The value of stockTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_Equal(String stockTypeCd) {
        doSetStockTypeCd_Equal(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_Equal(String stockTypeCd) {
        regStockTypeCd(CK_EQ, stockTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCd The value of stockTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotEqual(String stockTypeCd) {
        doSetStockTypeCd_NotEqual(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_NotEqual(String stockTypeCd) {
        regStockTypeCd(CK_NES, stockTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCd The value of stockTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterThan(String stockTypeCd) {
        regStockTypeCd(CK_GT, fRES(stockTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCd The value of stockTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessThan(String stockTypeCd) {
        regStockTypeCd(CK_LT, fRES(stockTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCd The value of stockTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterEqual(String stockTypeCd) {
        regStockTypeCd(CK_GE, fRES(stockTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCd The value of stockTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessEqual(String stockTypeCd) {
        regStockTypeCd(CK_LE, fRES(stockTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCdList The collection of stockTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_InScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        regINS(CK_INS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCdList The collection of stockTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_NotInScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        regINS(CK_NINS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setStockTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockTypeCd The value of stockTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockTypeCd_LikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCd The value of stockTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockTypeCd_NotLikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @param stockTypeCd The value of stockTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_PrefixSearch(String stockTypeCd) {
        setStockTypeCd_LikeSearch(stockTypeCd, xcLSOPPre());
    }

    protected void regStockTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeCd(), "STOCK_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueStockTypeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
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
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
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
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
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
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOCATION_ID from m_location where ...)} <br />
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'in-scope'. (NotNull)
     */
    public void inScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocationId_InScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocation", false);
    }
    public abstract String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOCATION_ID from m_location where ...)} <br />
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'not in-scope'. (NotNull)
     */
    public void notInScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocationId_NotInScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocation", true);
    }
    public abstract String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
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
     * LOCATION_CD: {VARCHAR(30)}
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
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
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
     * LOCATION_CD: {VARCHAR(30)}
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
     * LOCATION_CD: {VARCHAR(30)} <br>
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
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     */
    public void setLocationCd_IsNull() { regLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     */
    public void setLocationCd_IsNullOrEmpty() { regLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     */
    public void setLocationCd_IsNotNull() { regLocationCd(CK_ISNN, DOBJ); }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param depositId The value of depositId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_Equal(Long depositId) {
        doSetDepositId_Equal(depositId);
    }

    protected void doSetDepositId_Equal(Long depositId) {
        regDepositId(CK_EQ, depositId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param depositId The value of depositId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_NotEqual(Long depositId) {
        doSetDepositId_NotEqual(depositId);
    }

    protected void doSetDepositId_NotEqual(Long depositId) {
        regDepositId(CK_NES, depositId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param depositId The value of depositId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_GreaterThan(Long depositId) {
        regDepositId(CK_GT, depositId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param depositId The value of depositId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_LessThan(Long depositId) {
        regDepositId(CK_LT, depositId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param depositId The value of depositId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_GreaterEqual(Long depositId) {
        regDepositId(CK_GE, depositId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param depositId The value of depositId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositId_LessEqual(Long depositId) {
        regDepositId(CK_LE, depositId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of depositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of depositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDepositId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDepositId(), "DEPOSIT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param depositIdList The collection of depositId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositId_InScope(Collection<Long> depositIdList) {
        doSetDepositId_InScope(depositIdList);
    }

    protected void doSetDepositId_InScope(Collection<Long> depositIdList) {
        regINS(CK_INS, cTL(depositIdList), xgetCValueDepositId(), "DEPOSIT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param depositIdList The collection of depositId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositId_NotInScope(Collection<Long> depositIdList) {
        doSetDepositId_NotInScope(depositIdList);
    }

    protected void doSetDepositId_NotInScope(Collection<Long> depositIdList) {
        regINS(CK_NINS, cTL(depositIdList), xgetCValueDepositId(), "DEPOSIT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DEPOSIT_ID from m_customer where ...)} <br />
     * m_customer by my DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDepositId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepDepositId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DEPOSIT_ID from m_customer where ...)} <br />
     * m_customer by my DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDepositId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setDepositId_IsNull() { regDepositId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setDepositId_IsNotNull() { regDepositId(CK_ISNN, DOBJ); }

    protected void regDepositId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositId(), "DEPOSIT_ID"); }
    protected abstract ConditionValue xgetCValueDepositId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCd The value of depositCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_Equal(String depositCd) {
        doSetDepositCd_Equal(fRES(depositCd));
    }

    protected void doSetDepositCd_Equal(String depositCd) {
        regDepositCd(CK_EQ, depositCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCd The value of depositCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_NotEqual(String depositCd) {
        doSetDepositCd_NotEqual(fRES(depositCd));
    }

    protected void doSetDepositCd_NotEqual(String depositCd) {
        regDepositCd(CK_NES, depositCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCd The value of depositCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_GreaterThan(String depositCd) {
        regDepositCd(CK_GT, fRES(depositCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCd The value of depositCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_LessThan(String depositCd) {
        regDepositCd(CK_LT, fRES(depositCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCd The value of depositCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_GreaterEqual(String depositCd) {
        regDepositCd(CK_GE, fRES(depositCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCd The value of depositCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_LessEqual(String depositCd) {
        regDepositCd(CK_LE, fRES(depositCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCdList The collection of depositCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_InScope(Collection<String> depositCdList) {
        doSetDepositCd_InScope(depositCdList);
    }

    protected void doSetDepositCd_InScope(Collection<String> depositCdList) {
        regINS(CK_INS, cTL(depositCdList), xgetCValueDepositCd(), "DEPOSIT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCdList The collection of depositCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_NotInScope(Collection<String> depositCdList) {
        doSetDepositCd_NotInScope(depositCdList);
    }

    protected void doSetDepositCd_NotInScope(Collection<String> depositCdList) {
        regINS(CK_NINS, cTL(depositCdList), xgetCValueDepositCd(), "DEPOSIT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDepositCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param depositCd The value of depositCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDepositCd_LikeSearch(String depositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(depositCd), xgetCValueDepositCd(), "DEPOSIT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCd The value of depositCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDepositCd_NotLikeSearch(String depositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(depositCd), xgetCValueDepositCd(), "DEPOSIT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @param depositCd The value of depositCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositCd_PrefixSearch(String depositCd) {
        setDepositCd_LikeSearch(depositCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     */
    public void setDepositCd_IsNull() { regDepositCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     */
    public void setDepositCd_IsNullOrEmpty() { regDepositCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     */
    public void setDepositCd_IsNotNull() { regDepositCd(CK_ISNN, DOBJ); }

    protected void regDepositCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositCd(), "DEPOSIT_CD"); }
    protected abstract ConditionValue xgetCValueDepositCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOT_ID from t_lot where ...)} <br />
     * t_lot by my LOT_ID, named 'TLot'.
     * @param subCBLambda The callback for sub-query of TLot for 'in-scope'. (NotNull)
     */
    public void inScopeTLot(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLotId_InScopeRelation_TLot(cb.query());
        registerInScopeRelation(cb.query(), "LOT_ID", "LOT_ID", pp, "tLot", false);
    }
    public abstract String keepLotId_InScopeRelation_TLot(TLotCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOT_ID from t_lot where ...)} <br />
     * t_lot by my LOT_ID, named 'TLot'.
     * @param subCBLambda The callback for sub-query of TLot for 'not in-scope'. (NotNull)
     */
    public void notInScopeTLot(SubQuery<TLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLotCB cb = new TLotCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLotId_NotInScopeRelation_TLot(cb.query());
        registerInScopeRelation(cb.query(), "LOT_ID", "LOT_ID", pp, "tLot", true);
    }
    public abstract String keepLotId_NotInScopeRelation_TLot(TLotCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_Equal(String lot) {
        doSetLot_Equal(fRES(lot));
    }

    protected void doSetLot_Equal(String lot) {
        regLot(CK_EQ, lot);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotEqual(String lot) {
        doSetLot_NotEqual(fRES(lot));
    }

    protected void doSetLot_NotEqual(String lot) {
        regLot(CK_NES, lot);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterThan(String lot) {
        regLot(CK_GT, fRES(lot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessThan(String lot) {
        regLot(CK_LT, fRES(lot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterEqual(String lot) {
        regLot(CK_GE, fRES(lot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessEqual(String lot) {
        regLot(CK_LE, fRES(lot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lotList The collection of lot as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_InScope(Collection<String> lotList) {
        doSetLot_InScope(lotList);
    }

    protected void doSetLot_InScope(Collection<String> lotList) {
        regINS(CK_INS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lotList The collection of lot as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotInScope(Collection<String> lotList) {
        doSetLot_NotInScope(lotList);
    }

    protected void doSetLot_NotInScope(Collection<String> lotList) {
        regINS(CK_NINS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)} <br>
     * <pre>e.g. setLot_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot The value of lot as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot_LikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot_NotLikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_PrefixSearch(String lot) {
        setLot_LikeSearch(lot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNull() { regLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNullOrEmpty() { regLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNotNull() { regLot(CK_ISNN, DOBJ); }

    protected void regLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot(), "LOT"); }
    protected abstract ConditionValue xgetCValueLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_Equal(String limitDt) {
        doSetLimitDt_Equal(fRES(limitDt));
    }

    protected void doSetLimitDt_Equal(String limitDt) {
        regLimitDt(CK_EQ, limitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotEqual(String limitDt) {
        doSetLimitDt_NotEqual(fRES(limitDt));
    }

    protected void doSetLimitDt_NotEqual(String limitDt) {
        regLimitDt(CK_NES, limitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterThan(String limitDt) {
        regLimitDt(CK_GT, fRES(limitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessThan(String limitDt) {
        regLimitDt(CK_LT, fRES(limitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterEqual(String limitDt) {
        regLimitDt(CK_GE, fRES(limitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessEqual(String limitDt) {
        regLimitDt(CK_LE, fRES(limitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDtList The collection of limitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_InScope(Collection<String> limitDtList) {
        doSetLimitDt_InScope(limitDtList);
    }

    protected void doSetLimitDt_InScope(Collection<String> limitDtList) {
        regINS(CK_INS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDtList The collection of limitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotInScope(Collection<String> limitDtList) {
        doSetLimitDt_NotInScope(limitDtList);
    }

    protected void doSetLimitDt_NotInScope(Collection<String> limitDtList) {
        regINS(CK_NINS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDt The value of limitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDt_LikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDt_NotLikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_PrefixSearch(String limitDt) {
        setLimitDt_LikeSearch(limitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNull() { regLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNullOrEmpty() { regLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNotNull() { regLimitDt(CK_ISNN, DOBJ); }

    protected void regLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDt(), "LIMIT_DT"); }
    protected abstract ConditionValue xgetCValueLimitDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_Equal(Long storeNoId) {
        doSetStoreNoId_Equal(storeNoId);
    }

    protected void doSetStoreNoId_Equal(Long storeNoId) {
        regStoreNoId(CK_EQ, storeNoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_NotEqual(Long storeNoId) {
        doSetStoreNoId_NotEqual(storeNoId);
    }

    protected void doSetStoreNoId_NotEqual(Long storeNoId) {
        regStoreNoId(CK_NES, storeNoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_GreaterThan(Long storeNoId) {
        regStoreNoId(CK_GT, storeNoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_LessThan(Long storeNoId) {
        regStoreNoId(CK_LT, storeNoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_GreaterEqual(Long storeNoId) {
        regStoreNoId(CK_GE, storeNoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_LessEqual(Long storeNoId) {
        regStoreNoId(CK_LE, storeNoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param minNumber The min number of storeNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNoId(), "STORE_NO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param storeNoIdList The collection of storeNoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoId_InScope(Collection<Long> storeNoIdList) {
        doSetStoreNoId_InScope(storeNoIdList);
    }

    protected void doSetStoreNoId_InScope(Collection<Long> storeNoIdList) {
        regINS(CK_INS, cTL(storeNoIdList), xgetCValueStoreNoId(), "STORE_NO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @param storeNoIdList The collection of storeNoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoId_NotInScope(Collection<Long> storeNoIdList) {
        doSetStoreNoId_NotInScope(storeNoIdList);
    }

    protected void doSetStoreNoId_NotInScope(Collection<Long> storeNoIdList) {
        regINS(CK_NINS, cTL(storeNoIdList), xgetCValueStoreNoId(), "STORE_NO_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STORE_NO_ID from t_store_no where ...)} <br />
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @param subCBLambda The callback for sub-query of TStoreNo for 'in-scope'. (NotNull)
     */
    public void inScopeTStoreNo(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreNoId_InScopeRelation_TStoreNo(cb.query());
        registerInScopeRelation(cb.query(), "STORE_NO_ID", "STORE_NO_ID", pp, "tStoreNo", false);
    }
    public abstract String keepStoreNoId_InScopeRelation_TStoreNo(TStoreNoCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STORE_NO_ID from t_store_no where ...)} <br />
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @param subCBLambda The callback for sub-query of TStoreNo for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStoreNo(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreNoId_NotInScopeRelation_TStoreNo(cb.query());
        registerInScopeRelation(cb.query(), "STORE_NO_ID", "STORE_NO_ID", pp, "tStoreNo", true);
    }
    public abstract String keepStoreNoId_NotInScopeRelation_TStoreNo(TStoreNoCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     */
    public void setStoreNoId_IsNull() { regStoreNoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     */
    public void setStoreNoId_IsNotNull() { regStoreNoId(CK_ISNN, DOBJ); }

    protected void regStoreNoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNoId(), "STORE_NO_ID"); }
    protected abstract ConditionValue xgetCValueStoreNoId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNo The value of storeLabelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_Equal(String storeLabelNo) {
        doSetStoreLabelNo_Equal(fRES(storeLabelNo));
    }

    protected void doSetStoreLabelNo_Equal(String storeLabelNo) {
        regStoreLabelNo(CK_EQ, storeLabelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNo The value of storeLabelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_NotEqual(String storeLabelNo) {
        doSetStoreLabelNo_NotEqual(fRES(storeLabelNo));
    }

    protected void doSetStoreLabelNo_NotEqual(String storeLabelNo) {
        regStoreLabelNo(CK_NES, storeLabelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNo The value of storeLabelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_GreaterThan(String storeLabelNo) {
        regStoreLabelNo(CK_GT, fRES(storeLabelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNo The value of storeLabelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_LessThan(String storeLabelNo) {
        regStoreLabelNo(CK_LT, fRES(storeLabelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNo The value of storeLabelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_GreaterEqual(String storeLabelNo) {
        regStoreLabelNo(CK_GE, fRES(storeLabelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNo The value of storeLabelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_LessEqual(String storeLabelNo) {
        regStoreLabelNo(CK_LE, fRES(storeLabelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNoList The collection of storeLabelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_InScope(Collection<String> storeLabelNoList) {
        doSetStoreLabelNo_InScope(storeLabelNoList);
    }

    protected void doSetStoreLabelNo_InScope(Collection<String> storeLabelNoList) {
        regINS(CK_INS, cTL(storeLabelNoList), xgetCValueStoreLabelNo(), "STORE_LABEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNoList The collection of storeLabelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_NotInScope(Collection<String> storeLabelNoList) {
        doSetStoreLabelNo_NotInScope(storeLabelNoList);
    }

    protected void doSetStoreLabelNo_NotInScope(Collection<String> storeLabelNoList) {
        regINS(CK_NINS, cTL(storeLabelNoList), xgetCValueStoreLabelNo(), "STORE_LABEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setStoreLabelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeLabelNo The value of storeLabelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreLabelNo_LikeSearch(String storeLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeLabelNo), xgetCValueStoreLabelNo(), "STORE_LABEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNo The value of storeLabelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreLabelNo_NotLikeSearch(String storeLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeLabelNo), xgetCValueStoreLabelNo(), "STORE_LABEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @param storeLabelNo The value of storeLabelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLabelNo_PrefixSearch(String storeLabelNo) {
        setStoreLabelNo_LikeSearch(storeLabelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     */
    public void setStoreLabelNo_IsNull() { regStoreLabelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     */
    public void setStoreLabelNo_IsNullOrEmpty() { regStoreLabelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     */
    public void setStoreLabelNo_IsNotNull() { regStoreLabelNo(CK_ISNN, DOBJ); }

    protected void regStoreLabelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreLabelNo(), "STORE_LABEL_NO"); }
    protected abstract ConditionValue xgetCValueStoreLabelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_Equal(Long shapeId) {
        doSetShapeId_Equal(shapeId);
    }

    protected void doSetShapeId_Equal(Long shapeId) {
        regShapeId(CK_EQ, shapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_NotEqual(Long shapeId) {
        doSetShapeId_NotEqual(shapeId);
    }

    protected void doSetShapeId_NotEqual(Long shapeId) {
        regShapeId(CK_NES, shapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_GreaterThan(Long shapeId) {
        regShapeId(CK_GT, shapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_LessThan(Long shapeId) {
        regShapeId(CK_LT, shapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_GreaterEqual(Long shapeId) {
        regShapeId(CK_GE, shapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_LessEqual(Long shapeId) {
        regShapeId(CK_LE, shapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param minNumber The min number of shapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeId(), "SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeIdList The collection of shapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeId_InScope(Collection<Long> shapeIdList) {
        doSetShapeId_InScope(shapeIdList);
    }

    protected void doSetShapeId_InScope(Collection<Long> shapeIdList) {
        regINS(CK_INS, cTL(shapeIdList), xgetCValueShapeId(), "SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeIdList The collection of shapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeId_NotInScope(Collection<Long> shapeIdList) {
        doSetShapeId_NotInScope(shapeIdList);
    }

    protected void doSetShapeId_NotInScope(Collection<Long> shapeIdList) {
        regINS(CK_NINS, cTL(shapeIdList), xgetCValueShapeId(), "SHAPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_ID from m_shape where ...)} <br />
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'in-scope'. (NotNull)
     */
    public void inScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeId_InScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_ID", "SHAPE_ID", pp, "mShape", false);
    }
    public abstract String keepShapeId_InScopeRelation_MShape(MShapeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_ID from m_shape where ...)} <br />
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeId_NotInScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_ID", "SHAPE_ID", pp, "mShape", true);
    }
    public abstract String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     */
    public void setShapeId_IsNull() { regShapeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     */
    public void setShapeId_IsNotNull() { regShapeId(CK_ISNN, DOBJ); }

    protected void regShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeId(), "SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueShapeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCd The value of shapeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_Equal(String shapeCd) {
        doSetShapeCd_Equal(fRES(shapeCd));
    }

    protected void doSetShapeCd_Equal(String shapeCd) {
        regShapeCd(CK_EQ, shapeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCd The value of shapeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_NotEqual(String shapeCd) {
        doSetShapeCd_NotEqual(fRES(shapeCd));
    }

    protected void doSetShapeCd_NotEqual(String shapeCd) {
        regShapeCd(CK_NES, shapeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCd The value of shapeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_GreaterThan(String shapeCd) {
        regShapeCd(CK_GT, fRES(shapeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCd The value of shapeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_LessThan(String shapeCd) {
        regShapeCd(CK_LT, fRES(shapeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCd The value of shapeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_GreaterEqual(String shapeCd) {
        regShapeCd(CK_GE, fRES(shapeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCd The value of shapeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_LessEqual(String shapeCd) {
        regShapeCd(CK_LE, fRES(shapeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCdList The collection of shapeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_InScope(Collection<String> shapeCdList) {
        doSetShapeCd_InScope(shapeCdList);
    }

    protected void doSetShapeCd_InScope(Collection<String> shapeCdList) {
        regINS(CK_INS, cTL(shapeCdList), xgetCValueShapeCd(), "SHAPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCdList The collection of shapeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_NotInScope(Collection<String> shapeCdList) {
        doSetShapeCd_NotInScope(shapeCdList);
    }

    protected void doSetShapeCd_NotInScope(Collection<String> shapeCdList) {
        regINS(CK_NINS, cTL(shapeCdList), xgetCValueShapeCd(), "SHAPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShapeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shapeCd The value of shapeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShapeCd_LikeSearch(String shapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shapeCd), xgetCValueShapeCd(), "SHAPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCd The value of shapeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShapeCd_NotLikeSearch(String shapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shapeCd), xgetCValueShapeCd(), "SHAPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @param shapeCd The value of shapeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeCd_PrefixSearch(String shapeCd) {
        setShapeCd_LikeSearch(shapeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     */
    public void setShapeCd_IsNull() { regShapeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     */
    public void setShapeCd_IsNullOrEmpty() { regShapeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_CD: {VARCHAR(30)}
     */
    public void setShapeCd_IsNotNull() { regShapeCd(CK_ISNN, DOBJ); }

    protected void regShapeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeCd(), "SHAPE_CD"); }
    protected abstract ConditionValue xgetCValueShapeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param unitNum The value of unitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_Equal(Long unitNum) {
        doSetUnitNum_Equal(unitNum);
    }

    protected void doSetUnitNum_Equal(Long unitNum) {
        regUnitNum(CK_EQ, unitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param unitNum The value of unitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_NotEqual(Long unitNum) {
        doSetUnitNum_NotEqual(unitNum);
    }

    protected void doSetUnitNum_NotEqual(Long unitNum) {
        regUnitNum(CK_NES, unitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param unitNum The value of unitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterThan(Long unitNum) {
        regUnitNum(CK_GT, unitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param unitNum The value of unitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_LessThan(Long unitNum) {
        regUnitNum(CK_LT, unitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param unitNum The value of unitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterEqual(Long unitNum) {
        regUnitNum(CK_GE, unitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param unitNum The value of unitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_LessEqual(Long unitNum) {
        regUnitNum(CK_LE, unitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param minNumber The min number of unitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitNum(), "UNIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param unitNumList The collection of unitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_InScope(Collection<Long> unitNumList) {
        doSetUnitNum_InScope(unitNumList);
    }

    protected void doSetUnitNum_InScope(Collection<Long> unitNumList) {
        regINS(CK_INS, cTL(unitNumList), xgetCValueUnitNum(), "UNIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @param unitNumList The collection of unitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_NotInScope(Collection<Long> unitNumList) {
        doSetUnitNum_NotInScope(unitNumList);
    }

    protected void doSetUnitNum_NotInScope(Collection<Long> unitNumList) {
        regINS(CK_NINS, cTL(unitNumList), xgetCValueUnitNum(), "UNIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     */
    public void setUnitNum_IsNull() { regUnitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {BIGINT(19)}
     */
    public void setUnitNum_IsNotNull() { regUnitNum(CK_ISNN, DOBJ); }

    protected void regUnitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNum(), "UNIT_NUM"); }
    protected abstract ConditionValue xgetCValueUnitNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param instNum The value of instNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_Equal(java.math.BigDecimal instNum) {
        doSetInstNum_Equal(instNum);
    }

    protected void doSetInstNum_Equal(java.math.BigDecimal instNum) {
        regInstNum(CK_EQ, instNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param instNum The value of instNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_NotEqual(java.math.BigDecimal instNum) {
        doSetInstNum_NotEqual(instNum);
    }

    protected void doSetInstNum_NotEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_NES, instNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param instNum The value of instNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterThan(java.math.BigDecimal instNum) {
        regInstNum(CK_GT, instNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param instNum The value of instNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessThan(java.math.BigDecimal instNum) {
        regInstNum(CK_LT, instNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param instNum The value of instNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_GE, instNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param instNum The value of instNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_LE, instNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstNum(), "INST_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param instNumList The collection of instNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_InScope(instNumList);
    }

    protected void doSetInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_INS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param instNumList The collection of instNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_NotInScope(instNumList);
    }

    protected void doSetInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_NINS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    protected void regInstNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstNum(), "INST_NUM"); }
    protected abstract ConditionValue xgetCValueInstNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    /**
     * Equal(=). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg cdef) {
        doSetErrorFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: エラー無
     */
    public void setErrorFlg_Equal_$0() {
        setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: エラー有
     */
    public void setErrorFlg_Equal_$1() {
        setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg.$1);
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg cdef) {
        doSetErrorFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: エラー無
     */
    public void setErrorFlg_NotEqual_$0() {
        setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: エラー有
     */
    public void setErrorFlg_NotEqual_$1() {
        setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg.$1);
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNull() { regErrorFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNullOrEmpty() { regErrorFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNotNull() { regErrorFlg(CK_ISNN, DOBJ); }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_Equal(Long allocInstBId) {
        doSetAllocInstBId_Equal(allocInstBId);
    }

    protected void doSetAllocInstBId_Equal(Long allocInstBId) {
        regAllocInstBId(CK_EQ, allocInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_NotEqual(Long allocInstBId) {
        doSetAllocInstBId_NotEqual(allocInstBId);
    }

    protected void doSetAllocInstBId_NotEqual(Long allocInstBId) {
        regAllocInstBId(CK_NES, allocInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_GreaterThan(Long allocInstBId) {
        regAllocInstBId(CK_GT, allocInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_LessThan(Long allocInstBId) {
        regAllocInstBId(CK_LT, allocInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_GreaterEqual(Long allocInstBId) {
        regAllocInstBId(CK_GE, allocInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_LessEqual(Long allocInstBId) {
        regAllocInstBId(CK_LE, allocInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param minNumber The min number of allocInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstBId(), "ALLOC_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBIdList The collection of allocInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstBId_InScope(Collection<Long> allocInstBIdList) {
        doSetAllocInstBId_InScope(allocInstBIdList);
    }

    protected void doSetAllocInstBId_InScope(Collection<Long> allocInstBIdList) {
        regINS(CK_INS, cTL(allocInstBIdList), xgetCValueAllocInstBId(), "ALLOC_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBIdList The collection of allocInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstBId_NotInScope(Collection<Long> allocInstBIdList) {
        doSetAllocInstBId_NotInScope(allocInstBIdList);
    }

    protected void doSetAllocInstBId_NotInScope(Collection<Long> allocInstBIdList) {
        regINS(CK_NINS, cTL(allocInstBIdList), xgetCValueAllocInstBId(), "ALLOC_INST_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ALLOC_INST_B_ID from t_alloc_inst_b where ...)} <br />
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param subCBLambda The callback for sub-query of TAllocInstB for 'in-scope'. (NotNull)
     */
    public void inScopeTAllocInstB(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstBId_InScopeRelation_TAllocInstB(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tAllocInstB", false);
    }
    public abstract String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ALLOC_INST_B_ID from t_alloc_inst_b where ...)} <br />
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param subCBLambda The callback for sub-query of TAllocInstB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTAllocInstB(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstBId_NotInScopeRelation_TAllocInstB(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tAllocInstB", true);
    }
    public abstract String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     */
    public void setAllocInstBId_IsNull() { regAllocInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     */
    public void setAllocInstBId_IsNotNull() { regAllocInstBId(CK_ISNN, DOBJ); }

    protected void regAllocInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstBId(), "ALLOC_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param allocNum The value of allocNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_Equal(java.math.BigDecimal allocNum) {
        doSetAllocNum_Equal(allocNum);
    }

    protected void doSetAllocNum_Equal(java.math.BigDecimal allocNum) {
        regAllocNum(CK_EQ, allocNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param allocNum The value of allocNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_NotEqual(java.math.BigDecimal allocNum) {
        doSetAllocNum_NotEqual(allocNum);
    }

    protected void doSetAllocNum_NotEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_NES, allocNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param allocNum The value of allocNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_GreaterThan(java.math.BigDecimal allocNum) {
        regAllocNum(CK_GT, allocNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param allocNum The value of allocNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_LessThan(java.math.BigDecimal allocNum) {
        regAllocNum(CK_LT, allocNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param allocNum The value of allocNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_GreaterEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_GE, allocNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param allocNum The value of allocNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocNum_LessEqual(java.math.BigDecimal allocNum) {
        regAllocNum(CK_LE, allocNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of allocNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocNum(), "ALLOC_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param allocNumList The collection of allocNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum_InScope(Collection<java.math.BigDecimal> allocNumList) {
        doSetAllocNum_InScope(allocNumList);
    }

    protected void doSetAllocNum_InScope(Collection<java.math.BigDecimal> allocNumList) {
        regINS(CK_INS, cTL(allocNumList), xgetCValueAllocNum(), "ALLOC_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param allocNumList The collection of allocNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNum_NotInScope(Collection<java.math.BigDecimal> allocNumList) {
        doSetAllocNum_NotInScope(allocNumList);
    }

    protected void doSetAllocNum_NotInScope(Collection<java.math.BigDecimal> allocNumList) {
        regINS(CK_NINS, cTL(allocNumList), xgetCValueAllocNum(), "ALLOC_NUM");
    }

    protected void regAllocNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNum(), "ALLOC_NUM"); }
    protected abstract ConditionValue xgetCValueAllocNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param stockOutNum The value of stockOutNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutNum_Equal(java.math.BigDecimal stockOutNum) {
        doSetStockOutNum_Equal(stockOutNum);
    }

    protected void doSetStockOutNum_Equal(java.math.BigDecimal stockOutNum) {
        regStockOutNum(CK_EQ, stockOutNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param stockOutNum The value of stockOutNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutNum_NotEqual(java.math.BigDecimal stockOutNum) {
        doSetStockOutNum_NotEqual(stockOutNum);
    }

    protected void doSetStockOutNum_NotEqual(java.math.BigDecimal stockOutNum) {
        regStockOutNum(CK_NES, stockOutNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param stockOutNum The value of stockOutNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutNum_GreaterThan(java.math.BigDecimal stockOutNum) {
        regStockOutNum(CK_GT, stockOutNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param stockOutNum The value of stockOutNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutNum_LessThan(java.math.BigDecimal stockOutNum) {
        regStockOutNum(CK_LT, stockOutNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param stockOutNum The value of stockOutNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutNum_GreaterEqual(java.math.BigDecimal stockOutNum) {
        regStockOutNum(CK_GE, stockOutNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param stockOutNum The value of stockOutNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutNum_LessEqual(java.math.BigDecimal stockOutNum) {
        regStockOutNum(CK_LE, stockOutNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param minNumber The min number of stockOutNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockOutNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockOutNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockOutNum(), "STOCK_OUT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param stockOutNumList The collection of stockOutNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutNum_InScope(Collection<java.math.BigDecimal> stockOutNumList) {
        doSetStockOutNum_InScope(stockOutNumList);
    }

    protected void doSetStockOutNum_InScope(Collection<java.math.BigDecimal> stockOutNumList) {
        regINS(CK_INS, cTL(stockOutNumList), xgetCValueStockOutNum(), "STOCK_OUT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @param stockOutNumList The collection of stockOutNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutNum_NotInScope(Collection<java.math.BigDecimal> stockOutNumList) {
        doSetStockOutNum_NotInScope(stockOutNumList);
    }

    protected void doSetStockOutNum_NotInScope(Collection<java.math.BigDecimal> stockOutNumList) {
        regINS(CK_NINS, cTL(stockOutNumList), xgetCValueStockOutNum(), "STOCK_OUT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     */
    public void setStockOutNum_IsNull() { regStockOutNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     */
    public void setStockOutNum_IsNotNull() { regStockOutNum(CK_ISNN, DOBJ); }

    protected void regStockOutNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockOutNum(), "STOCK_OUT_NUM"); }
    protected abstract ConditionValue xgetCValueStockOutNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param unitPrice The value of unitPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_Equal(java.math.BigDecimal unitPrice) {
        doSetUnitPrice_Equal(unitPrice);
    }

    protected void doSetUnitPrice_Equal(java.math.BigDecimal unitPrice) {
        regUnitPrice(CK_EQ, unitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param unitPrice The value of unitPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_NotEqual(java.math.BigDecimal unitPrice) {
        doSetUnitPrice_NotEqual(unitPrice);
    }

    protected void doSetUnitPrice_NotEqual(java.math.BigDecimal unitPrice) {
        regUnitPrice(CK_NES, unitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param unitPrice The value of unitPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterThan(java.math.BigDecimal unitPrice) {
        regUnitPrice(CK_GT, unitPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param unitPrice The value of unitPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_LessThan(java.math.BigDecimal unitPrice) {
        regUnitPrice(CK_LT, unitPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param unitPrice The value of unitPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterEqual(java.math.BigDecimal unitPrice) {
        regUnitPrice(CK_GE, unitPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param unitPrice The value of unitPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_LessEqual(java.math.BigDecimal unitPrice) {
        regUnitPrice(CK_LE, unitPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param minNumber The min number of unitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitPrice_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitPrice(), "UNIT_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param unitPriceList The collection of unitPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_InScope(Collection<java.math.BigDecimal> unitPriceList) {
        doSetUnitPrice_InScope(unitPriceList);
    }

    protected void doSetUnitPrice_InScope(Collection<java.math.BigDecimal> unitPriceList) {
        regINS(CK_INS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @param unitPriceList The collection of unitPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_NotInScope(Collection<java.math.BigDecimal> unitPriceList) {
        doSetUnitPrice_NotInScope(unitPriceList);
    }

    protected void doSetUnitPrice_NotInScope(Collection<java.math.BigDecimal> unitPriceList) {
        regINS(CK_NINS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     */
    public void setUnitPrice_IsNull() { regUnitPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     */
    public void setUnitPrice_IsNotNull() { regUnitPrice(CK_ISNN, DOBJ); }

    protected void regUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitPrice(), "UNIT_PRICE"); }
    protected abstract ConditionValue xgetCValueUnitPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param price The value of price as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice_Equal(java.math.BigDecimal price) {
        doSetPrice_Equal(price);
    }

    protected void doSetPrice_Equal(java.math.BigDecimal price) {
        regPrice(CK_EQ, price);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param price The value of price as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice_NotEqual(java.math.BigDecimal price) {
        doSetPrice_NotEqual(price);
    }

    protected void doSetPrice_NotEqual(java.math.BigDecimal price) {
        regPrice(CK_NES, price);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param price The value of price as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice_GreaterThan(java.math.BigDecimal price) {
        regPrice(CK_GT, price);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param price The value of price as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice_LessThan(java.math.BigDecimal price) {
        regPrice(CK_LT, price);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param price The value of price as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice_GreaterEqual(java.math.BigDecimal price) {
        regPrice(CK_GE, price);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param price The value of price as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrice_LessEqual(java.math.BigDecimal price) {
        regPrice(CK_LE, price);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param minNumber The min number of price. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of price. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrice_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrice(), "PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param priceList The collection of price as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrice_InScope(Collection<java.math.BigDecimal> priceList) {
        doSetPrice_InScope(priceList);
    }

    protected void doSetPrice_InScope(Collection<java.math.BigDecimal> priceList) {
        regINS(CK_INS, cTL(priceList), xgetCValuePrice(), "PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @param priceList The collection of price as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrice_NotInScope(Collection<java.math.BigDecimal> priceList) {
        doSetPrice_NotInScope(priceList);
    }

    protected void doSetPrice_NotInScope(Collection<java.math.BigDecimal> priceList) {
        regINS(CK_NINS, cTL(priceList), xgetCValuePrice(), "PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     */
    public void setPrice_IsNull() { regPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRICE: {DECIMAL(14, 4)}
     */
    public void setPrice_IsNotNull() { regPrice(CK_ISNN, DOBJ); }

    protected void regPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrice(), "PRICE"); }
    protected abstract ConditionValue xgetCValuePrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param tax The value of tax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_Equal(java.math.BigDecimal tax) {
        doSetTax_Equal(tax);
    }

    protected void doSetTax_Equal(java.math.BigDecimal tax) {
        regTax(CK_EQ, tax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param tax The value of tax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_NotEqual(java.math.BigDecimal tax) {
        doSetTax_NotEqual(tax);
    }

    protected void doSetTax_NotEqual(java.math.BigDecimal tax) {
        regTax(CK_NES, tax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param tax The value of tax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_GreaterThan(java.math.BigDecimal tax) {
        regTax(CK_GT, tax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param tax The value of tax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_LessThan(java.math.BigDecimal tax) {
        regTax(CK_LT, tax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param tax The value of tax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_GreaterEqual(java.math.BigDecimal tax) {
        regTax(CK_GE, tax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param tax The value of tax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_LessEqual(java.math.BigDecimal tax) {
        regTax(CK_LE, tax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param minNumber The min number of tax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTax_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTax(), "TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param taxList The collection of tax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_InScope(Collection<java.math.BigDecimal> taxList) {
        doSetTax_InScope(taxList);
    }

    protected void doSetTax_InScope(Collection<java.math.BigDecimal> taxList) {
        regINS(CK_INS, cTL(taxList), xgetCValueTax(), "TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     * @param taxList The collection of tax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_NotInScope(Collection<java.math.BigDecimal> taxList) {
        doSetTax_NotInScope(taxList);
    }

    protected void doSetTax_NotInScope(Collection<java.math.BigDecimal> taxList) {
        regINS(CK_NINS, cTL(taxList), xgetCValueTax(), "TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     */
    public void setTax_IsNull() { regTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAX: {DECIMAL(14, 4)}
     */
    public void setTax_IsNotNull() { regTax(CK_ISNN, DOBJ); }

    protected void regTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTax(), "TAX"); }
    protected abstract ConditionValue xgetCValueTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param casePieceTypeId The value of casePieceTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePieceTypeId_Equal(Long casePieceTypeId) {
        doSetCasePieceTypeId_Equal(casePieceTypeId);
    }

    protected void doSetCasePieceTypeId_Equal(Long casePieceTypeId) {
        regCasePieceTypeId(CK_EQ, casePieceTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param casePieceTypeId The value of casePieceTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePieceTypeId_NotEqual(Long casePieceTypeId) {
        doSetCasePieceTypeId_NotEqual(casePieceTypeId);
    }

    protected void doSetCasePieceTypeId_NotEqual(Long casePieceTypeId) {
        regCasePieceTypeId(CK_NES, casePieceTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param casePieceTypeId The value of casePieceTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePieceTypeId_GreaterThan(Long casePieceTypeId) {
        regCasePieceTypeId(CK_GT, casePieceTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param casePieceTypeId The value of casePieceTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePieceTypeId_LessThan(Long casePieceTypeId) {
        regCasePieceTypeId(CK_LT, casePieceTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param casePieceTypeId The value of casePieceTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePieceTypeId_GreaterEqual(Long casePieceTypeId) {
        regCasePieceTypeId(CK_GE, casePieceTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param casePieceTypeId The value of casePieceTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePieceTypeId_LessEqual(Long casePieceTypeId) {
        regCasePieceTypeId(CK_LE, casePieceTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param minNumber The min number of casePieceTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of casePieceTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCasePieceTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCasePieceTypeId(), "CASE_PIECE_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param casePieceTypeIdList The collection of casePieceTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeId_InScope(Collection<Long> casePieceTypeIdList) {
        doSetCasePieceTypeId_InScope(casePieceTypeIdList);
    }

    protected void doSetCasePieceTypeId_InScope(Collection<Long> casePieceTypeIdList) {
        regINS(CK_INS, cTL(casePieceTypeIdList), xgetCValueCasePieceTypeId(), "CASE_PIECE_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @param casePieceTypeIdList The collection of casePieceTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeId_NotInScope(Collection<Long> casePieceTypeIdList) {
        doSetCasePieceTypeId_NotInScope(casePieceTypeIdList);
    }

    protected void doSetCasePieceTypeId_NotInScope(Collection<Long> casePieceTypeIdList) {
        regINS(CK_NINS, cTL(casePieceTypeIdList), xgetCValueCasePieceTypeId(), "CASE_PIECE_TYPE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     */
    public void setCasePieceTypeId_IsNull() { regCasePieceTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     */
    public void setCasePieceTypeId_IsNotNull() { regCasePieceTypeId(CK_ISNN, DOBJ); }

    protected void regCasePieceTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasePieceTypeId(), "CASE_PIECE_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueCasePieceTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCd The value of casePieceTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_Equal(String casePieceTypeCd) {
        doSetCasePieceTypeCd_Equal(fRES(casePieceTypeCd));
    }

    protected void doSetCasePieceTypeCd_Equal(String casePieceTypeCd) {
        regCasePieceTypeCd(CK_EQ, casePieceTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCd The value of casePieceTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_NotEqual(String casePieceTypeCd) {
        doSetCasePieceTypeCd_NotEqual(fRES(casePieceTypeCd));
    }

    protected void doSetCasePieceTypeCd_NotEqual(String casePieceTypeCd) {
        regCasePieceTypeCd(CK_NES, casePieceTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCd The value of casePieceTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_GreaterThan(String casePieceTypeCd) {
        regCasePieceTypeCd(CK_GT, fRES(casePieceTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCd The value of casePieceTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_LessThan(String casePieceTypeCd) {
        regCasePieceTypeCd(CK_LT, fRES(casePieceTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCd The value of casePieceTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_GreaterEqual(String casePieceTypeCd) {
        regCasePieceTypeCd(CK_GE, fRES(casePieceTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCd The value of casePieceTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_LessEqual(String casePieceTypeCd) {
        regCasePieceTypeCd(CK_LE, fRES(casePieceTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCdList The collection of casePieceTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_InScope(Collection<String> casePieceTypeCdList) {
        doSetCasePieceTypeCd_InScope(casePieceTypeCdList);
    }

    protected void doSetCasePieceTypeCd_InScope(Collection<String> casePieceTypeCdList) {
        regINS(CK_INS, cTL(casePieceTypeCdList), xgetCValueCasePieceTypeCd(), "CASE_PIECE_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCdList The collection of casePieceTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_NotInScope(Collection<String> casePieceTypeCdList) {
        doSetCasePieceTypeCd_NotInScope(casePieceTypeCdList);
    }

    protected void doSetCasePieceTypeCd_NotInScope(Collection<String> casePieceTypeCdList) {
        regINS(CK_NINS, cTL(casePieceTypeCdList), xgetCValueCasePieceTypeCd(), "CASE_PIECE_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCasePieceTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casePieceTypeCd The value of casePieceTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasePieceTypeCd_LikeSearch(String casePieceTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casePieceTypeCd), xgetCValueCasePieceTypeCd(), "CASE_PIECE_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCd The value of casePieceTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasePieceTypeCd_NotLikeSearch(String casePieceTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casePieceTypeCd), xgetCValueCasePieceTypeCd(), "CASE_PIECE_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @param casePieceTypeCd The value of casePieceTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePieceTypeCd_PrefixSearch(String casePieceTypeCd) {
        setCasePieceTypeCd_LikeSearch(casePieceTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCasePieceTypeCd_IsNull() { regCasePieceTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCasePieceTypeCd_IsNullOrEmpty() { regCasePieceTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     */
    public void setCasePieceTypeCd_IsNotNull() { regCasePieceTypeCd(CK_ISNN, DOBJ); }

    protected void regCasePieceTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasePieceTypeCd(), "CASE_PIECE_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueCasePieceTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_Equal(String prodDt) {
        doSetProdDt_Equal(fRES(prodDt));
    }

    protected void doSetProdDt_Equal(String prodDt) {
        regProdDt(CK_EQ, prodDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_NotEqual(String prodDt) {
        doSetProdDt_NotEqual(fRES(prodDt));
    }

    protected void doSetProdDt_NotEqual(String prodDt) {
        regProdDt(CK_NES, prodDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_GreaterThan(String prodDt) {
        regProdDt(CK_GT, fRES(prodDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_LessThan(String prodDt) {
        regProdDt(CK_LT, fRES(prodDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_GreaterEqual(String prodDt) {
        regProdDt(CK_GE, fRES(prodDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_LessEqual(String prodDt) {
        regProdDt(CK_LE, fRES(prodDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDtList The collection of prodDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_InScope(Collection<String> prodDtList) {
        doSetProdDt_InScope(prodDtList);
    }

    protected void doSetProdDt_InScope(Collection<String> prodDtList) {
        regINS(CK_INS, cTL(prodDtList), xgetCValueProdDt(), "PROD_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDtList The collection of prodDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_NotInScope(Collection<String> prodDtList) {
        doSetProdDt_NotInScope(prodDtList);
    }

    protected void doSetProdDt_NotInScope(Collection<String> prodDtList) {
        regINS(CK_NINS, cTL(prodDtList), xgetCValueProdDt(), "PROD_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setProdDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDt The value of prodDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDt_LikeSearch(String prodDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDt), xgetCValueProdDt(), "PROD_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDt_NotLikeSearch(String prodDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDt), xgetCValueProdDt(), "PROD_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_PrefixSearch(String prodDt) {
        setProdDt_LikeSearch(prodDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNull() { regProdDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNullOrEmpty() { regProdDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNotNull() { regProdDt(CK_ISNN, DOBJ); }

    protected void regProdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDt(), "PROD_DT"); }
    protected abstract ConditionValue xgetCValueProdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
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
     * JAN_CD: {VARCHAR(30)}
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
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterThan(String janCd) {
        regJanCd(CK_GT, fRES(janCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessThan(String janCd) {
        regJanCd(CK_LT, fRES(janCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterEqual(String janCd) {
        regJanCd(CK_GE, fRES(janCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessEqual(String janCd) {
        regJanCd(CK_LE, fRES(janCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
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
     * JAN_CD: {VARCHAR(30)}
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
     * JAN_CD: {VARCHAR(30)} <br>
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
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJanCd_NotLikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_PrefixSearch(String janCd) {
        setJanCd_LikeSearch(janCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNull() { regJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNullOrEmpty() { regJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNotNull() { regJanCd(CK_ISNN, DOBJ); }

    protected void regJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJanCd(), "JAN_CD"); }
    protected abstract ConditionValue xgetCValueJanCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param taxRate The value of taxRate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxRate_Equal(java.math.BigDecimal taxRate) {
        doSetTaxRate_Equal(taxRate);
    }

    protected void doSetTaxRate_Equal(java.math.BigDecimal taxRate) {
        regTaxRate(CK_EQ, taxRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param taxRate The value of taxRate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxRate_NotEqual(java.math.BigDecimal taxRate) {
        doSetTaxRate_NotEqual(taxRate);
    }

    protected void doSetTaxRate_NotEqual(java.math.BigDecimal taxRate) {
        regTaxRate(CK_NES, taxRate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param taxRate The value of taxRate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxRate_GreaterThan(java.math.BigDecimal taxRate) {
        regTaxRate(CK_GT, taxRate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param taxRate The value of taxRate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxRate_LessThan(java.math.BigDecimal taxRate) {
        regTaxRate(CK_LT, taxRate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param taxRate The value of taxRate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxRate_GreaterEqual(java.math.BigDecimal taxRate) {
        regTaxRate(CK_GE, taxRate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param taxRate The value of taxRate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxRate_LessEqual(java.math.BigDecimal taxRate) {
        regTaxRate(CK_LE, taxRate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param minNumber The min number of taxRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of taxRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTaxRate_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaxRate(), "TAX_RATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param taxRateList The collection of taxRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxRate_InScope(Collection<java.math.BigDecimal> taxRateList) {
        doSetTaxRate_InScope(taxRateList);
    }

    protected void doSetTaxRate_InScope(Collection<java.math.BigDecimal> taxRateList) {
        regINS(CK_INS, cTL(taxRateList), xgetCValueTaxRate(), "TAX_RATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @param taxRateList The collection of taxRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxRate_NotInScope(Collection<java.math.BigDecimal> taxRateList) {
        doSetTaxRate_NotInScope(taxRateList);
    }

    protected void doSetTaxRate_NotInScope(Collection<java.math.BigDecimal> taxRateList) {
        regINS(CK_NINS, cTL(taxRateList), xgetCValueTaxRate(), "TAX_RATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     */
    public void setTaxRate_IsNull() { regTaxRate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     */
    public void setTaxRate_IsNotNull() { regTaxRate(CK_ISNN, DOBJ); }

    protected void regTaxRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxRate(), "TAX_RATE"); }
    protected abstract ConditionValue xgetCValueTaxRate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlg The value of logiWeightFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_Equal(String logiWeightFlg) {
        doSetLogiWeightFlg_Equal(fRES(logiWeightFlg));
    }

    protected void doSetLogiWeightFlg_Equal(String logiWeightFlg) {
        regLogiWeightFlg(CK_EQ, logiWeightFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlg The value of logiWeightFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_NotEqual(String logiWeightFlg) {
        doSetLogiWeightFlg_NotEqual(fRES(logiWeightFlg));
    }

    protected void doSetLogiWeightFlg_NotEqual(String logiWeightFlg) {
        regLogiWeightFlg(CK_NES, logiWeightFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlg The value of logiWeightFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_GreaterThan(String logiWeightFlg) {
        regLogiWeightFlg(CK_GT, fRES(logiWeightFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlg The value of logiWeightFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_LessThan(String logiWeightFlg) {
        regLogiWeightFlg(CK_LT, fRES(logiWeightFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlg The value of logiWeightFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_GreaterEqual(String logiWeightFlg) {
        regLogiWeightFlg(CK_GE, fRES(logiWeightFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlg The value of logiWeightFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_LessEqual(String logiWeightFlg) {
        regLogiWeightFlg(CK_LE, fRES(logiWeightFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlgList The collection of logiWeightFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_InScope(Collection<String> logiWeightFlgList) {
        doSetLogiWeightFlg_InScope(logiWeightFlgList);
    }

    protected void doSetLogiWeightFlg_InScope(Collection<String> logiWeightFlgList) {
        regINS(CK_INS, cTL(logiWeightFlgList), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlgList The collection of logiWeightFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_NotInScope(Collection<String> logiWeightFlgList) {
        doSetLogiWeightFlg_NotInScope(logiWeightFlgList);
    }

    protected void doSetLogiWeightFlg_NotInScope(Collection<String> logiWeightFlgList) {
        regINS(CK_NINS, cTL(logiWeightFlgList), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setLogiWeightFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logiWeightFlg The value of logiWeightFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogiWeightFlg_LikeSearch(String logiWeightFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logiWeightFlg), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlg The value of logiWeightFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogiWeightFlg_NotLikeSearch(String logiWeightFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logiWeightFlg), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @param logiWeightFlg The value of logiWeightFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_PrefixSearch(String logiWeightFlg) {
        setLogiWeightFlg_LikeSearch(logiWeightFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     */
    public void setLogiWeightFlg_IsNull() { regLogiWeightFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     */
    public void setLogiWeightFlg_IsNullOrEmpty() { regLogiWeightFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     */
    public void setLogiWeightFlg_IsNotNull() { regLogiWeightFlg(CK_ISNN, DOBJ); }

    protected void regLogiWeightFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG"); }
    protected abstract ConditionValue xgetCValueLogiWeightFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_Equal(String logiAttentionTypeCd) {
        doSetLogiAttentionTypeCd_Equal(fRES(logiAttentionTypeCd));
    }

    protected void doSetLogiAttentionTypeCd_Equal(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_EQ, logiAttentionTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_NotEqual(String logiAttentionTypeCd) {
        doSetLogiAttentionTypeCd_NotEqual(fRES(logiAttentionTypeCd));
    }

    protected void doSetLogiAttentionTypeCd_NotEqual(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_NES, logiAttentionTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_GreaterThan(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_GT, fRES(logiAttentionTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_LessThan(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_LT, fRES(logiAttentionTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_GreaterEqual(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_GE, fRES(logiAttentionTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_LessEqual(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_LE, fRES(logiAttentionTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCdList The collection of logiAttentionTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_InScope(Collection<String> logiAttentionTypeCdList) {
        doSetLogiAttentionTypeCd_InScope(logiAttentionTypeCdList);
    }

    protected void doSetLogiAttentionTypeCd_InScope(Collection<String> logiAttentionTypeCdList) {
        regINS(CK_INS, cTL(logiAttentionTypeCdList), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCdList The collection of logiAttentionTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_NotInScope(Collection<String> logiAttentionTypeCdList) {
        doSetLogiAttentionTypeCd_NotInScope(logiAttentionTypeCdList);
    }

    protected void doSetLogiAttentionTypeCd_NotInScope(Collection<String> logiAttentionTypeCdList) {
        regINS(CK_NINS, cTL(logiAttentionTypeCdList), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLogiAttentionTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogiAttentionTypeCd_LikeSearch(String logiAttentionTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logiAttentionTypeCd), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogiAttentionTypeCd_NotLikeSearch(String logiAttentionTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logiAttentionTypeCd), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_PrefixSearch(String logiAttentionTypeCd) {
        setLogiAttentionTypeCd_LikeSearch(logiAttentionTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiAttentionTypeCd_IsNull() { regLogiAttentionTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiAttentionTypeCd_IsNullOrEmpty() { regLogiAttentionTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiAttentionTypeCd_IsNotNull() { regLogiAttentionTypeCd(CK_ISNN, DOBJ); }

    protected void regLogiAttentionTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLogiAttentionTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_Equal(String logiSpecialTypeCd) {
        doSetLogiSpecialTypeCd_Equal(fRES(logiSpecialTypeCd));
    }

    protected void doSetLogiSpecialTypeCd_Equal(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_EQ, logiSpecialTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_NotEqual(String logiSpecialTypeCd) {
        doSetLogiSpecialTypeCd_NotEqual(fRES(logiSpecialTypeCd));
    }

    protected void doSetLogiSpecialTypeCd_NotEqual(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_NES, logiSpecialTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_GreaterThan(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_GT, fRES(logiSpecialTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_LessThan(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_LT, fRES(logiSpecialTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_GreaterEqual(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_GE, fRES(logiSpecialTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_LessEqual(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_LE, fRES(logiSpecialTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCdList The collection of logiSpecialTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_InScope(Collection<String> logiSpecialTypeCdList) {
        doSetLogiSpecialTypeCd_InScope(logiSpecialTypeCdList);
    }

    protected void doSetLogiSpecialTypeCd_InScope(Collection<String> logiSpecialTypeCdList) {
        regINS(CK_INS, cTL(logiSpecialTypeCdList), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCdList The collection of logiSpecialTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_NotInScope(Collection<String> logiSpecialTypeCdList) {
        doSetLogiSpecialTypeCd_NotInScope(logiSpecialTypeCdList);
    }

    protected void doSetLogiSpecialTypeCd_NotInScope(Collection<String> logiSpecialTypeCdList) {
        regINS(CK_NINS, cTL(logiSpecialTypeCdList), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLogiSpecialTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogiSpecialTypeCd_LikeSearch(String logiSpecialTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logiSpecialTypeCd), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogiSpecialTypeCd_NotLikeSearch(String logiSpecialTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logiSpecialTypeCd), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_PrefixSearch(String logiSpecialTypeCd) {
        setLogiSpecialTypeCd_LikeSearch(logiSpecialTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiSpecialTypeCd_IsNull() { regLogiSpecialTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiSpecialTypeCd_IsNullOrEmpty() { regLogiSpecialTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiSpecialTypeCd_IsNotNull() { regLogiSpecialTypeCd(CK_ISNN, DOBJ); }

    protected void regLogiSpecialTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLogiSpecialTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_Equal(String hinmokuText) {
        doSetHinmokuText_Equal(fRES(hinmokuText));
    }

    protected void doSetHinmokuText_Equal(String hinmokuText) {
        regHinmokuText(CK_EQ, hinmokuText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_NotEqual(String hinmokuText) {
        doSetHinmokuText_NotEqual(fRES(hinmokuText));
    }

    protected void doSetHinmokuText_NotEqual(String hinmokuText) {
        regHinmokuText(CK_NES, hinmokuText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterThan(String hinmokuText) {
        regHinmokuText(CK_GT, fRES(hinmokuText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessThan(String hinmokuText) {
        regHinmokuText(CK_LT, fRES(hinmokuText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterEqual(String hinmokuText) {
        regHinmokuText(CK_GE, fRES(hinmokuText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessEqual(String hinmokuText) {
        regHinmokuText(CK_LE, fRES(hinmokuText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuTextList The collection of hinmokuText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_InScope(Collection<String> hinmokuTextList) {
        doSetHinmokuText_InScope(hinmokuTextList);
    }

    protected void doSetHinmokuText_InScope(Collection<String> hinmokuTextList) {
        regINS(CK_INS, cTL(hinmokuTextList), xgetCValueHinmokuText(), "HINMOKU_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuTextList The collection of hinmokuText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_NotInScope(Collection<String> hinmokuTextList) {
        doSetHinmokuText_NotInScope(hinmokuTextList);
    }

    protected void doSetHinmokuText_NotInScope(Collection<String> hinmokuTextList) {
        regINS(CK_NINS, cTL(hinmokuTextList), xgetCValueHinmokuText(), "HINMOKU_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)} <br>
     * <pre>e.g. setHinmokuText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuText The value of hinmokuText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuText_LikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuText_NotLikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_PrefixSearch(String hinmokuText) {
        setHinmokuText_LikeSearch(hinmokuText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNull() { regHinmokuText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNullOrEmpty() { regHinmokuText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNotNull() { regHinmokuText(CK_ISNN, DOBJ); }

    protected void regHinmokuText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuText(), "HINMOKU_TEXT"); }
    protected abstract ConditionValue xgetCValueHinmokuText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
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
     * UNIT_NM: {VARCHAR(60)}
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
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterThan(String unitNm) {
        regUnitNm(CK_GT, fRES(unitNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessThan(String unitNm) {
        regUnitNm(CK_LT, fRES(unitNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterEqual(String unitNm) {
        regUnitNm(CK_GE, fRES(unitNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessEqual(String unitNm) {
        regUnitNm(CK_LE, fRES(unitNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
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
     * UNIT_NM: {VARCHAR(60)}
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
     * UNIT_NM: {VARCHAR(60)} <br>
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
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitNm_NotLikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_PrefixSearch(String unitNm) {
        setUnitNm_LikeSearch(unitNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNull() { regUnitNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNullOrEmpty() { regUnitNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNotNull() { regUnitNm(CK_ISNN, DOBJ); }

    protected void regUnitNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNm(), "UNIT_NM"); }
    protected abstract ConditionValue xgetCValueUnitNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNm The value of ecUnitNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_Equal(String ecUnitNm) {
        doSetEcUnitNm_Equal(fRES(ecUnitNm));
    }

    protected void doSetEcUnitNm_Equal(String ecUnitNm) {
        regEcUnitNm(CK_EQ, ecUnitNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNm The value of ecUnitNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_NotEqual(String ecUnitNm) {
        doSetEcUnitNm_NotEqual(fRES(ecUnitNm));
    }

    protected void doSetEcUnitNm_NotEqual(String ecUnitNm) {
        regEcUnitNm(CK_NES, ecUnitNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNm The value of ecUnitNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_GreaterThan(String ecUnitNm) {
        regEcUnitNm(CK_GT, fRES(ecUnitNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNm The value of ecUnitNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_LessThan(String ecUnitNm) {
        regEcUnitNm(CK_LT, fRES(ecUnitNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNm The value of ecUnitNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_GreaterEqual(String ecUnitNm) {
        regEcUnitNm(CK_GE, fRES(ecUnitNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNm The value of ecUnitNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_LessEqual(String ecUnitNm) {
        regEcUnitNm(CK_LE, fRES(ecUnitNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNmList The collection of ecUnitNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_InScope(Collection<String> ecUnitNmList) {
        doSetEcUnitNm_InScope(ecUnitNmList);
    }

    protected void doSetEcUnitNm_InScope(Collection<String> ecUnitNmList) {
        regINS(CK_INS, cTL(ecUnitNmList), xgetCValueEcUnitNm(), "EC_UNIT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNmList The collection of ecUnitNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_NotInScope(Collection<String> ecUnitNmList) {
        doSetEcUnitNm_NotInScope(ecUnitNmList);
    }

    protected void doSetEcUnitNm_NotInScope(Collection<String> ecUnitNmList) {
        regINS(CK_NINS, cTL(ecUnitNmList), xgetCValueEcUnitNm(), "EC_UNIT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setEcUnitNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecUnitNm The value of ecUnitNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcUnitNm_LikeSearch(String ecUnitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecUnitNm), xgetCValueEcUnitNm(), "EC_UNIT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNm The value of ecUnitNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcUnitNm_NotLikeSearch(String ecUnitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecUnitNm), xgetCValueEcUnitNm(), "EC_UNIT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @param ecUnitNm The value of ecUnitNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_PrefixSearch(String ecUnitNm) {
        setEcUnitNm_LikeSearch(ecUnitNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     */
    public void setEcUnitNm_IsNull() { regEcUnitNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     */
    public void setEcUnitNm_IsNullOrEmpty() { regEcUnitNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     */
    public void setEcUnitNm_IsNotNull() { regEcUnitNm(CK_ISNN, DOBJ); }

    protected void regEcUnitNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcUnitNm(), "EC_UNIT_NM"); }
    protected abstract ConditionValue xgetCValueEcUnitNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_Equal(String sampleTypeCd) {
        doSetSampleTypeCd_Equal(fRES(sampleTypeCd));
    }

    protected void doSetSampleTypeCd_Equal(String sampleTypeCd) {
        regSampleTypeCd(CK_EQ, sampleTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_NotEqual(String sampleTypeCd) {
        doSetSampleTypeCd_NotEqual(fRES(sampleTypeCd));
    }

    protected void doSetSampleTypeCd_NotEqual(String sampleTypeCd) {
        regSampleTypeCd(CK_NES, sampleTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_GreaterThan(String sampleTypeCd) {
        regSampleTypeCd(CK_GT, fRES(sampleTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_LessThan(String sampleTypeCd) {
        regSampleTypeCd(CK_LT, fRES(sampleTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_GreaterEqual(String sampleTypeCd) {
        regSampleTypeCd(CK_GE, fRES(sampleTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_LessEqual(String sampleTypeCd) {
        regSampleTypeCd(CK_LE, fRES(sampleTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCdList The collection of sampleTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_InScope(Collection<String> sampleTypeCdList) {
        doSetSampleTypeCd_InScope(sampleTypeCdList);
    }

    protected void doSetSampleTypeCd_InScope(Collection<String> sampleTypeCdList) {
        regINS(CK_INS, cTL(sampleTypeCdList), xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCdList The collection of sampleTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_NotInScope(Collection<String> sampleTypeCdList) {
        doSetSampleTypeCd_NotInScope(sampleTypeCdList);
    }

    protected void doSetSampleTypeCd_NotInScope(Collection<String> sampleTypeCdList) {
        regINS(CK_NINS, cTL(sampleTypeCdList), xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSampleTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sampleTypeCd The value of sampleTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSampleTypeCd_LikeSearch(String sampleTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sampleTypeCd), xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSampleTypeCd_NotLikeSearch(String sampleTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sampleTypeCd), xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_PrefixSearch(String sampleTypeCd) {
        setSampleTypeCd_LikeSearch(sampleTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSampleTypeCd_IsNull() { regSampleTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSampleTypeCd_IsNullOrEmpty() { regSampleTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSampleTypeCd_IsNotNull() { regSampleTypeCd(CK_ISNN, DOBJ); }

    protected void regSampleTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSampleTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_Equal(String ecOrderBranchNo) {
        doSetEcOrderBranchNo_Equal(fRES(ecOrderBranchNo));
    }

    protected void doSetEcOrderBranchNo_Equal(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_EQ, ecOrderBranchNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_NotEqual(String ecOrderBranchNo) {
        doSetEcOrderBranchNo_NotEqual(fRES(ecOrderBranchNo));
    }

    protected void doSetEcOrderBranchNo_NotEqual(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_NES, ecOrderBranchNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_GreaterThan(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_GT, fRES(ecOrderBranchNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_LessThan(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_LT, fRES(ecOrderBranchNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_GreaterEqual(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_GE, fRES(ecOrderBranchNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_LessEqual(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_LE, fRES(ecOrderBranchNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNoList The collection of ecOrderBranchNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_InScope(Collection<String> ecOrderBranchNoList) {
        doSetEcOrderBranchNo_InScope(ecOrderBranchNoList);
    }

    protected void doSetEcOrderBranchNo_InScope(Collection<String> ecOrderBranchNoList) {
        regINS(CK_INS, cTL(ecOrderBranchNoList), xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNoList The collection of ecOrderBranchNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_NotInScope(Collection<String> ecOrderBranchNoList) {
        doSetEcOrderBranchNo_NotInScope(ecOrderBranchNoList);
    }

    protected void doSetEcOrderBranchNo_NotInScope(Collection<String> ecOrderBranchNoList) {
        regINS(CK_NINS, cTL(ecOrderBranchNoList), xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setEcOrderBranchNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecOrderBranchNo The value of ecOrderBranchNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcOrderBranchNo_LikeSearch(String ecOrderBranchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecOrderBranchNo), xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcOrderBranchNo_NotLikeSearch(String ecOrderBranchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecOrderBranchNo), xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_PrefixSearch(String ecOrderBranchNo) {
        setEcOrderBranchNo_LikeSearch(ecOrderBranchNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     */
    public void setEcOrderBranchNo_IsNull() { regEcOrderBranchNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     */
    public void setEcOrderBranchNo_IsNullOrEmpty() { regEcOrderBranchNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     */
    public void setEcOrderBranchNo_IsNotNull() { regEcOrderBranchNo(CK_ISNN, DOBJ); }

    protected void regEcOrderBranchNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO"); }
    protected abstract ConditionValue xgetCValueEcOrderBranchNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_Equal(String ecProductNmKanji) {
        doSetEcProductNmKanji_Equal(fRES(ecProductNmKanji));
    }

    protected void doSetEcProductNmKanji_Equal(String ecProductNmKanji) {
        regEcProductNmKanji(CK_EQ, ecProductNmKanji);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_NotEqual(String ecProductNmKanji) {
        doSetEcProductNmKanji_NotEqual(fRES(ecProductNmKanji));
    }

    protected void doSetEcProductNmKanji_NotEqual(String ecProductNmKanji) {
        regEcProductNmKanji(CK_NES, ecProductNmKanji);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_GreaterThan(String ecProductNmKanji) {
        regEcProductNmKanji(CK_GT, fRES(ecProductNmKanji));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_LessThan(String ecProductNmKanji) {
        regEcProductNmKanji(CK_LT, fRES(ecProductNmKanji));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_GreaterEqual(String ecProductNmKanji) {
        regEcProductNmKanji(CK_GE, fRES(ecProductNmKanji));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_LessEqual(String ecProductNmKanji) {
        regEcProductNmKanji(CK_LE, fRES(ecProductNmKanji));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanjiList The collection of ecProductNmKanji as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_InScope(Collection<String> ecProductNmKanjiList) {
        doSetEcProductNmKanji_InScope(ecProductNmKanjiList);
    }

    protected void doSetEcProductNmKanji_InScope(Collection<String> ecProductNmKanjiList) {
        regINS(CK_INS, cTL(ecProductNmKanjiList), xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanjiList The collection of ecProductNmKanji as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_NotInScope(Collection<String> ecProductNmKanjiList) {
        doSetEcProductNmKanji_NotInScope(ecProductNmKanjiList);
    }

    protected void doSetEcProductNmKanji_NotInScope(Collection<String> ecProductNmKanjiList) {
        regINS(CK_NINS, cTL(ecProductNmKanjiList), xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * <pre>e.g. setEcProductNmKanji_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecProductNmKanji The value of ecProductNmKanji as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcProductNmKanji_LikeSearch(String ecProductNmKanji, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecProductNmKanji), xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcProductNmKanji_NotLikeSearch(String ecProductNmKanji, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecProductNmKanji), xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_PrefixSearch(String ecProductNmKanji) {
        setEcProductNmKanji_LikeSearch(ecProductNmKanji, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setEcProductNmKanji_IsNull() { regEcProductNmKanji(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setEcProductNmKanji_IsNullOrEmpty() { regEcProductNmKanji(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setEcProductNmKanji_IsNotNull() { regEcProductNmKanji(CK_ISNN, DOBJ); }

    protected void regEcProductNmKanji(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI"); }
    protected abstract ConditionValue xgetCValueEcProductNmKanji();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_Equal(String storePlantCd) {
        doSetStorePlantCd_Equal(fRES(storePlantCd));
    }

    protected void doSetStorePlantCd_Equal(String storePlantCd) {
        regStorePlantCd(CK_EQ, storePlantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_NotEqual(String storePlantCd) {
        doSetStorePlantCd_NotEqual(fRES(storePlantCd));
    }

    protected void doSetStorePlantCd_NotEqual(String storePlantCd) {
        regStorePlantCd(CK_NES, storePlantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_GreaterThan(String storePlantCd) {
        regStorePlantCd(CK_GT, fRES(storePlantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_LessThan(String storePlantCd) {
        regStorePlantCd(CK_LT, fRES(storePlantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_GreaterEqual(String storePlantCd) {
        regStorePlantCd(CK_GE, fRES(storePlantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_LessEqual(String storePlantCd) {
        regStorePlantCd(CK_LE, fRES(storePlantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCdList The collection of storePlantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_InScope(Collection<String> storePlantCdList) {
        doSetStorePlantCd_InScope(storePlantCdList);
    }

    protected void doSetStorePlantCd_InScope(Collection<String> storePlantCdList) {
        regINS(CK_INS, cTL(storePlantCdList), xgetCValueStorePlantCd(), "STORE_PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCdList The collection of storePlantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_NotInScope(Collection<String> storePlantCdList) {
        doSetStorePlantCd_NotInScope(storePlantCdList);
    }

    protected void doSetStorePlantCd_NotInScope(Collection<String> storePlantCdList) {
        regINS(CK_NINS, cTL(storePlantCdList), xgetCValueStorePlantCd(), "STORE_PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStorePlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storePlantCd The value of storePlantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorePlantCd_LikeSearch(String storePlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storePlantCd), xgetCValueStorePlantCd(), "STORE_PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorePlantCd_NotLikeSearch(String storePlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storePlantCd), xgetCValueStorePlantCd(), "STORE_PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_PrefixSearch(String storePlantCd) {
        setStorePlantCd_LikeSearch(storePlantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     */
    public void setStorePlantCd_IsNull() { regStorePlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     */
    public void setStorePlantCd_IsNullOrEmpty() { regStorePlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     */
    public void setStorePlantCd_IsNotNull() { regStorePlantCd(CK_ISNN, DOBJ); }

    protected void regStorePlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorePlantCd(), "STORE_PLANT_CD"); }
    protected abstract ConditionValue xgetCValueStorePlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_Equal(String storeStorageSpaceCd) {
        doSetStoreStorageSpaceCd_Equal(fRES(storeStorageSpaceCd));
    }

    protected void doSetStoreStorageSpaceCd_Equal(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_EQ, storeStorageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_NotEqual(String storeStorageSpaceCd) {
        doSetStoreStorageSpaceCd_NotEqual(fRES(storeStorageSpaceCd));
    }

    protected void doSetStoreStorageSpaceCd_NotEqual(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_NES, storeStorageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_GreaterThan(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_GT, fRES(storeStorageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_LessThan(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_LT, fRES(storeStorageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_GreaterEqual(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_GE, fRES(storeStorageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_LessEqual(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_LE, fRES(storeStorageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCdList The collection of storeStorageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_InScope(Collection<String> storeStorageSpaceCdList) {
        doSetStoreStorageSpaceCd_InScope(storeStorageSpaceCdList);
    }

    protected void doSetStoreStorageSpaceCd_InScope(Collection<String> storeStorageSpaceCdList) {
        regINS(CK_INS, cTL(storeStorageSpaceCdList), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCdList The collection of storeStorageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_NotInScope(Collection<String> storeStorageSpaceCdList) {
        doSetStoreStorageSpaceCd_NotInScope(storeStorageSpaceCdList);
    }

    protected void doSetStoreStorageSpaceCd_NotInScope(Collection<String> storeStorageSpaceCdList) {
        regINS(CK_NINS, cTL(storeStorageSpaceCdList), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStoreStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreStorageSpaceCd_LikeSearch(String storeStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeStorageSpaceCd), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreStorageSpaceCd_NotLikeSearch(String storeStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeStorageSpaceCd), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_PrefixSearch(String storeStorageSpaceCd) {
        setStoreStorageSpaceCd_LikeSearch(storeStorageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStoreStorageSpaceCd_IsNull() { regStoreStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStoreStorageSpaceCd_IsNullOrEmpty() { regStoreStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStoreStorageSpaceCd_IsNotNull() { regStoreStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regStoreStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueStoreStorageSpaceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_Equal(String lotManagTypeCd) {
        doSetLotManagTypeCd_Equal(fRES(lotManagTypeCd));
    }

    protected void doSetLotManagTypeCd_Equal(String lotManagTypeCd) {
        regLotManagTypeCd(CK_EQ, lotManagTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_NotEqual(String lotManagTypeCd) {
        doSetLotManagTypeCd_NotEqual(fRES(lotManagTypeCd));
    }

    protected void doSetLotManagTypeCd_NotEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_NES, lotManagTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_GreaterThan(String lotManagTypeCd) {
        regLotManagTypeCd(CK_GT, fRES(lotManagTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_LessThan(String lotManagTypeCd) {
        regLotManagTypeCd(CK_LT, fRES(lotManagTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_GreaterEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_GE, fRES(lotManagTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_LessEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_LE, fRES(lotManagTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCdList The collection of lotManagTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_InScope(Collection<String> lotManagTypeCdList) {
        doSetLotManagTypeCd_InScope(lotManagTypeCdList);
    }

    protected void doSetLotManagTypeCd_InScope(Collection<String> lotManagTypeCdList) {
        regINS(CK_INS, cTL(lotManagTypeCdList), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCdList The collection of lotManagTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_NotInScope(Collection<String> lotManagTypeCdList) {
        doSetLotManagTypeCd_NotInScope(lotManagTypeCdList);
    }

    protected void doSetLotManagTypeCd_NotInScope(Collection<String> lotManagTypeCdList) {
        regINS(CK_NINS, cTL(lotManagTypeCdList), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLotManagTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotManagTypeCd The value of lotManagTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotManagTypeCd_LikeSearch(String lotManagTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotManagTypeCd), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotManagTypeCd_NotLikeSearch(String lotManagTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotManagTypeCd), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_PrefixSearch(String lotManagTypeCd) {
        setLotManagTypeCd_LikeSearch(lotManagTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNull() { regLotManagTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNullOrEmpty() { regLotManagTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNotNull() { regLotManagTypeCd(CK_ISNN, DOBJ); }

    protected void regLotManagTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLotManagTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_Equal(String delivCd) {
        doSetDelivCd_Equal(fRES(delivCd));
    }

    protected void doSetDelivCd_Equal(String delivCd) {
        regDelivCd(CK_EQ, delivCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_NotEqual(String delivCd) {
        doSetDelivCd_NotEqual(fRES(delivCd));
    }

    protected void doSetDelivCd_NotEqual(String delivCd) {
        regDelivCd(CK_NES, delivCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_GreaterThan(String delivCd) {
        regDelivCd(CK_GT, fRES(delivCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_LessThan(String delivCd) {
        regDelivCd(CK_LT, fRES(delivCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_GreaterEqual(String delivCd) {
        regDelivCd(CK_GE, fRES(delivCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_LessEqual(String delivCd) {
        regDelivCd(CK_LE, fRES(delivCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCdList The collection of delivCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_InScope(Collection<String> delivCdList) {
        doSetDelivCd_InScope(delivCdList);
    }

    protected void doSetDelivCd_InScope(Collection<String> delivCdList) {
        regINS(CK_INS, cTL(delivCdList), xgetCValueDelivCd(), "DELIV_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCdList The collection of delivCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_NotInScope(Collection<String> delivCdList) {
        doSetDelivCd_NotInScope(delivCdList);
    }

    protected void doSetDelivCd_NotInScope(Collection<String> delivCdList) {
        regINS(CK_NINS, cTL(delivCdList), xgetCValueDelivCd(), "DELIV_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCd The value of delivCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCd_LikeSearch(String delivCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCd), xgetCValueDelivCd(), "DELIV_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCd_NotLikeSearch(String delivCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCd), xgetCValueDelivCd(), "DELIV_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_PrefixSearch(String delivCd) {
        setDelivCd_LikeSearch(delivCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNull() { regDelivCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNullOrEmpty() { regDelivCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNotNull() { regDelivCd(CK_ISNN, DOBJ); }

    protected void regDelivCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCd(), "DELIV_CD"); }
    protected abstract ConditionValue xgetCValueDelivCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCd The value of transactionTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_Equal(String transactionTypeCd) {
        doSetTransactionTypeCd_Equal(fRES(transactionTypeCd));
    }

    protected void doSetTransactionTypeCd_Equal(String transactionTypeCd) {
        regTransactionTypeCd(CK_EQ, transactionTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCd The value of transactionTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_NotEqual(String transactionTypeCd) {
        doSetTransactionTypeCd_NotEqual(fRES(transactionTypeCd));
    }

    protected void doSetTransactionTypeCd_NotEqual(String transactionTypeCd) {
        regTransactionTypeCd(CK_NES, transactionTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCd The value of transactionTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_GreaterThan(String transactionTypeCd) {
        regTransactionTypeCd(CK_GT, fRES(transactionTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCd The value of transactionTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_LessThan(String transactionTypeCd) {
        regTransactionTypeCd(CK_LT, fRES(transactionTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCd The value of transactionTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_GreaterEqual(String transactionTypeCd) {
        regTransactionTypeCd(CK_GE, fRES(transactionTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCd The value of transactionTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_LessEqual(String transactionTypeCd) {
        regTransactionTypeCd(CK_LE, fRES(transactionTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCdList The collection of transactionTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_InScope(Collection<String> transactionTypeCdList) {
        doSetTransactionTypeCd_InScope(transactionTypeCdList);
    }

    protected void doSetTransactionTypeCd_InScope(Collection<String> transactionTypeCdList) {
        regINS(CK_INS, cTL(transactionTypeCdList), xgetCValueTransactionTypeCd(), "TRANSACTION_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCdList The collection of transactionTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_NotInScope(Collection<String> transactionTypeCdList) {
        doSetTransactionTypeCd_NotInScope(transactionTypeCdList);
    }

    protected void doSetTransactionTypeCd_NotInScope(Collection<String> transactionTypeCdList) {
        regINS(CK_NINS, cTL(transactionTypeCdList), xgetCValueTransactionTypeCd(), "TRANSACTION_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTransactionTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transactionTypeCd The value of transactionTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransactionTypeCd_LikeSearch(String transactionTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transactionTypeCd), xgetCValueTransactionTypeCd(), "TRANSACTION_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCd The value of transactionTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransactionTypeCd_NotLikeSearch(String transactionTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transactionTypeCd), xgetCValueTransactionTypeCd(), "TRANSACTION_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @param transactionTypeCd The value of transactionTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransactionTypeCd_PrefixSearch(String transactionTypeCd) {
        setTransactionTypeCd_LikeSearch(transactionTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setTransactionTypeCd_IsNull() { regTransactionTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setTransactionTypeCd_IsNullOrEmpty() { regTransactionTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setTransactionTypeCd_IsNotNull() { regTransactionTypeCd(CK_ISNN, DOBJ); }

    protected void regTransactionTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransactionTypeCd(), "TRANSACTION_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueTransactionTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
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
     * WM_SEND_FLG: {CHAR(1)}
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
     * WM_SEND_FLG: {CHAR(1)}
     * @param wmSendFlg The value of wmSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_GreaterThan(String wmSendFlg) {
        regWmSendFlg(CK_GT, fRES(wmSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
     * @param wmSendFlg The value of wmSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_LessThan(String wmSendFlg) {
        regWmSendFlg(CK_LT, fRES(wmSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
     * @param wmSendFlg The value of wmSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_GreaterEqual(String wmSendFlg) {
        regWmSendFlg(CK_GE, fRES(wmSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
     * @param wmSendFlg The value of wmSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_LessEqual(String wmSendFlg) {
        regWmSendFlg(CK_LE, fRES(wmSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
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
     * WM_SEND_FLG: {CHAR(1)}
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
     * WM_SEND_FLG: {CHAR(1)} <br>
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
     * WM_SEND_FLG: {CHAR(1)}
     * @param wmSendFlg The value of wmSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmSendFlg_NotLikeSearch(String wmSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmSendFlg), xgetCValueWmSendFlg(), "WM_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
     * @param wmSendFlg The value of wmSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_PrefixSearch(String wmSendFlg) {
        setWmSendFlg_LikeSearch(wmSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
     */
    public void setWmSendFlg_IsNull() { regWmSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
     */
    public void setWmSendFlg_IsNullOrEmpty() { regWmSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1)}
     */
    public void setWmSendFlg_IsNotNull() { regWmSendFlg(CK_ISNN, DOBJ); }

    protected void regWmSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmSendFlg(), "WM_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueWmSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
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
     * LP_SEND_FLG: {CHAR(1)}
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
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterThan(String lpSendFlg) {
        regLpSendFlg(CK_GT, fRES(lpSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessThan(String lpSendFlg) {
        regLpSendFlg(CK_LT, fRES(lpSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterEqual(String lpSendFlg) {
        regLpSendFlg(CK_GE, fRES(lpSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessEqual(String lpSendFlg) {
        regLpSendFlg(CK_LE, fRES(lpSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
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
     * LP_SEND_FLG: {CHAR(1)}
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
     * LP_SEND_FLG: {CHAR(1)} <br>
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
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLpSendFlg_NotLikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @param lpSendFlg The value of lpSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_PrefixSearch(String lpSendFlg) {
        setLpSendFlg_LikeSearch(lpSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     */
    public void setLpSendFlg_IsNull() { regLpSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     */
    public void setLpSendFlg_IsNullOrEmpty() { regLpSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1)}
     */
    public void setLpSendFlg_IsNotNull() { regLpSendFlg(CK_ISNN, DOBJ); }

    protected void regLpSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLpSendFlg(), "LP_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueLpSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlg The value of cmSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_Equal(String cmSendFlg) {
        doSetCmSendFlg_Equal(fRES(cmSendFlg));
    }

    protected void doSetCmSendFlg_Equal(String cmSendFlg) {
        regCmSendFlg(CK_EQ, cmSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlg The value of cmSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_NotEqual(String cmSendFlg) {
        doSetCmSendFlg_NotEqual(fRES(cmSendFlg));
    }

    protected void doSetCmSendFlg_NotEqual(String cmSendFlg) {
        regCmSendFlg(CK_NES, cmSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlg The value of cmSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_GreaterThan(String cmSendFlg) {
        regCmSendFlg(CK_GT, fRES(cmSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlg The value of cmSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_LessThan(String cmSendFlg) {
        regCmSendFlg(CK_LT, fRES(cmSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlg The value of cmSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_GreaterEqual(String cmSendFlg) {
        regCmSendFlg(CK_GE, fRES(cmSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlg The value of cmSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_LessEqual(String cmSendFlg) {
        regCmSendFlg(CK_LE, fRES(cmSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlgList The collection of cmSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_InScope(Collection<String> cmSendFlgList) {
        doSetCmSendFlg_InScope(cmSendFlgList);
    }

    protected void doSetCmSendFlg_InScope(Collection<String> cmSendFlgList) {
        regINS(CK_INS, cTL(cmSendFlgList), xgetCValueCmSendFlg(), "CM_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlgList The collection of cmSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_NotInScope(Collection<String> cmSendFlgList) {
        doSetCmSendFlg_NotInScope(cmSendFlgList);
    }

    protected void doSetCmSendFlg_NotInScope(Collection<String> cmSendFlgList) {
        regINS(CK_NINS, cTL(cmSendFlgList), xgetCValueCmSendFlg(), "CM_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)} <br>
     * <pre>e.g. setCmSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cmSendFlg The value of cmSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCmSendFlg_LikeSearch(String cmSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cmSendFlg), xgetCValueCmSendFlg(), "CM_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlg The value of cmSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCmSendFlg_NotLikeSearch(String cmSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cmSendFlg), xgetCValueCmSendFlg(), "CM_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @param cmSendFlg The value of cmSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlg_PrefixSearch(String cmSendFlg) {
        setCmSendFlg_LikeSearch(cmSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     */
    public void setCmSendFlg_IsNull() { regCmSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     */
    public void setCmSendFlg_IsNullOrEmpty() { regCmSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG: {CHAR(1)}
     */
    public void setCmSendFlg_IsNotNull() { regCmSendFlg(CK_ISNN, DOBJ); }

    protected void regCmSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmSendFlg(), "CM_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueCmSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_Equal(String empIdCd) {
        doSetEmpIdCd_Equal(fRES(empIdCd));
    }

    protected void doSetEmpIdCd_Equal(String empIdCd) {
        regEmpIdCd(CK_EQ, empIdCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_NotEqual(String empIdCd) {
        doSetEmpIdCd_NotEqual(fRES(empIdCd));
    }

    protected void doSetEmpIdCd_NotEqual(String empIdCd) {
        regEmpIdCd(CK_NES, empIdCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_GreaterThan(String empIdCd) {
        regEmpIdCd(CK_GT, fRES(empIdCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_LessThan(String empIdCd) {
        regEmpIdCd(CK_LT, fRES(empIdCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_GreaterEqual(String empIdCd) {
        regEmpIdCd(CK_GE, fRES(empIdCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_LessEqual(String empIdCd) {
        regEmpIdCd(CK_LE, fRES(empIdCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCdList The collection of empIdCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_InScope(Collection<String> empIdCdList) {
        doSetEmpIdCd_InScope(empIdCdList);
    }

    protected void doSetEmpIdCd_InScope(Collection<String> empIdCdList) {
        regINS(CK_INS, cTL(empIdCdList), xgetCValueEmpIdCd(), "EMP_ID_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCdList The collection of empIdCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_NotInScope(Collection<String> empIdCdList) {
        doSetEmpIdCd_NotInScope(empIdCdList);
    }

    protected void doSetEmpIdCd_NotInScope(Collection<String> empIdCdList) {
        regINS(CK_NINS, cTL(empIdCdList), xgetCValueEmpIdCd(), "EMP_ID_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setEmpIdCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param empIdCd The value of empIdCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmpIdCd_LikeSearch(String empIdCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(empIdCd), xgetCValueEmpIdCd(), "EMP_ID_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmpIdCd_NotLikeSearch(String empIdCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(empIdCd), xgetCValueEmpIdCd(), "EMP_ID_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_PrefixSearch(String empIdCd) {
        setEmpIdCd_LikeSearch(empIdCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNull() { regEmpIdCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNullOrEmpty() { regEmpIdCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNotNull() { regEmpIdCd(CK_ISNN, DOBJ); }

    protected void regEmpIdCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmpIdCd(), "EMP_ID_CD"); }
    protected abstract ConditionValue xgetCValueEmpIdCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_Equal(String empNm) {
        doSetEmpNm_Equal(fRES(empNm));
    }

    protected void doSetEmpNm_Equal(String empNm) {
        regEmpNm(CK_EQ, empNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_NotEqual(String empNm) {
        doSetEmpNm_NotEqual(fRES(empNm));
    }

    protected void doSetEmpNm_NotEqual(String empNm) {
        regEmpNm(CK_NES, empNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_GreaterThan(String empNm) {
        regEmpNm(CK_GT, fRES(empNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_LessThan(String empNm) {
        regEmpNm(CK_LT, fRES(empNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_GreaterEqual(String empNm) {
        regEmpNm(CK_GE, fRES(empNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_LessEqual(String empNm) {
        regEmpNm(CK_LE, fRES(empNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNmList The collection of empNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_InScope(Collection<String> empNmList) {
        doSetEmpNm_InScope(empNmList);
    }

    protected void doSetEmpNm_InScope(Collection<String> empNmList) {
        regINS(CK_INS, cTL(empNmList), xgetCValueEmpNm(), "EMP_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNmList The collection of empNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_NotInScope(Collection<String> empNmList) {
        doSetEmpNm_NotInScope(empNmList);
    }

    protected void doSetEmpNm_NotInScope(Collection<String> empNmList) {
        regINS(CK_NINS, cTL(empNmList), xgetCValueEmpNm(), "EMP_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setEmpNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param empNm The value of empNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmpNm_LikeSearch(String empNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(empNm), xgetCValueEmpNm(), "EMP_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmpNm_NotLikeSearch(String empNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(empNm), xgetCValueEmpNm(), "EMP_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_PrefixSearch(String empNm) {
        setEmpNm_LikeSearch(empNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNull() { regEmpNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNullOrEmpty() { regEmpNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNotNull() { regEmpNm(CK_ISNN, DOBJ); }

    protected void regEmpNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmpNm(), "EMP_NM"); }
    protected abstract ConditionValue xgetCValueEmpNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCd The value of us3fTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_Equal(String us3fTypeCd) {
        doSetUs3fTypeCd_Equal(fRES(us3fTypeCd));
    }

    protected void doSetUs3fTypeCd_Equal(String us3fTypeCd) {
        regUs3fTypeCd(CK_EQ, us3fTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCd The value of us3fTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_NotEqual(String us3fTypeCd) {
        doSetUs3fTypeCd_NotEqual(fRES(us3fTypeCd));
    }

    protected void doSetUs3fTypeCd_NotEqual(String us3fTypeCd) {
        regUs3fTypeCd(CK_NES, us3fTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCd The value of us3fTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_GreaterThan(String us3fTypeCd) {
        regUs3fTypeCd(CK_GT, fRES(us3fTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCd The value of us3fTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_LessThan(String us3fTypeCd) {
        regUs3fTypeCd(CK_LT, fRES(us3fTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCd The value of us3fTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_GreaterEqual(String us3fTypeCd) {
        regUs3fTypeCd(CK_GE, fRES(us3fTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCd The value of us3fTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_LessEqual(String us3fTypeCd) {
        regUs3fTypeCd(CK_LE, fRES(us3fTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCdList The collection of us3fTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_InScope(Collection<String> us3fTypeCdList) {
        doSetUs3fTypeCd_InScope(us3fTypeCdList);
    }

    protected void doSetUs3fTypeCd_InScope(Collection<String> us3fTypeCdList) {
        regINS(CK_INS, cTL(us3fTypeCdList), xgetCValueUs3fTypeCd(), "US3F_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCdList The collection of us3fTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_NotInScope(Collection<String> us3fTypeCdList) {
        doSetUs3fTypeCd_NotInScope(us3fTypeCdList);
    }

    protected void doSetUs3fTypeCd_NotInScope(Collection<String> us3fTypeCdList) {
        regINS(CK_NINS, cTL(us3fTypeCdList), xgetCValueUs3fTypeCd(), "US3F_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setUs3fTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param us3fTypeCd The value of us3fTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUs3fTypeCd_LikeSearch(String us3fTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(us3fTypeCd), xgetCValueUs3fTypeCd(), "US3F_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCd The value of us3fTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUs3fTypeCd_NotLikeSearch(String us3fTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(us3fTypeCd), xgetCValueUs3fTypeCd(), "US3F_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @param us3fTypeCd The value of us3fTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUs3fTypeCd_PrefixSearch(String us3fTypeCd) {
        setUs3fTypeCd_LikeSearch(us3fTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     */
    public void setUs3fTypeCd_IsNull() { regUs3fTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     */
    public void setUs3fTypeCd_IsNullOrEmpty() { regUs3fTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     */
    public void setUs3fTypeCd_IsNotNull() { regUs3fTypeCd(CK_ISNN, DOBJ); }

    protected void regUs3fTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUs3fTypeCd(), "US3F_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueUs3fTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_Equal(String hinmokuGroup) {
        doSetHinmokuGroup_Equal(fRES(hinmokuGroup));
    }

    protected void doSetHinmokuGroup_Equal(String hinmokuGroup) {
        regHinmokuGroup(CK_EQ, hinmokuGroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_NotEqual(String hinmokuGroup) {
        doSetHinmokuGroup_NotEqual(fRES(hinmokuGroup));
    }

    protected void doSetHinmokuGroup_NotEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_NES, hinmokuGroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_GreaterThan(String hinmokuGroup) {
        regHinmokuGroup(CK_GT, fRES(hinmokuGroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_LessThan(String hinmokuGroup) {
        regHinmokuGroup(CK_LT, fRES(hinmokuGroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_GreaterEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_GE, fRES(hinmokuGroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_LessEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_LE, fRES(hinmokuGroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroupList The collection of hinmokuGroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_InScope(Collection<String> hinmokuGroupList) {
        doSetHinmokuGroup_InScope(hinmokuGroupList);
    }

    protected void doSetHinmokuGroup_InScope(Collection<String> hinmokuGroupList) {
        regINS(CK_INS, cTL(hinmokuGroupList), xgetCValueHinmokuGroup(), "HINMOKU_GROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroupList The collection of hinmokuGroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_NotInScope(Collection<String> hinmokuGroupList) {
        doSetHinmokuGroup_NotInScope(hinmokuGroupList);
    }

    protected void doSetHinmokuGroup_NotInScope(Collection<String> hinmokuGroupList) {
        regINS(CK_NINS, cTL(hinmokuGroupList), xgetCValueHinmokuGroup(), "HINMOKU_GROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)} <br>
     * <pre>e.g. setHinmokuGroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuGroup The value of hinmokuGroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuGroup_LikeSearch(String hinmokuGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuGroup), xgetCValueHinmokuGroup(), "HINMOKU_GROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuGroup_NotLikeSearch(String hinmokuGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuGroup), xgetCValueHinmokuGroup(), "HINMOKU_GROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_PrefixSearch(String hinmokuGroup) {
        setHinmokuGroup_LikeSearch(hinmokuGroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNull() { regHinmokuGroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNullOrEmpty() { regHinmokuGroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNotNull() { regHinmokuGroup(CK_ISNN, DOBJ); }

    protected void regHinmokuGroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuGroup(), "HINMOKU_GROUP"); }
    protected abstract ConditionValue xgetCValueHinmokuGroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
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
    public HpSLCFunction<TShippingInstBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TShippingInstBCB.class);
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
    public HpSLCFunction<TShippingInstBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TShippingInstBCB.class);
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
    public HpSLCFunction<TShippingInstBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TShippingInstBCB.class);
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
    public HpSLCFunction<TShippingInstBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TShippingInstBCB.class);
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
    public HpSLCFunction<TShippingInstBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TShippingInstBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TShippingInstBCB&gt;() {
     *     public void query(TShippingInstBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShippingInstBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TShippingInstBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TShippingInstBCQ sq);

    protected TShippingInstBCB xcreateScalarConditionCB() {
        TShippingInstBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TShippingInstBCB xcreateScalarConditionPartitionByCB() {
        TShippingInstBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TShippingInstBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TShippingInstBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TShippingInstBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TShippingInstBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TShippingInstBCQ sq);

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
    protected TShippingInstBCB newMyCB() {
        return new TShippingInstBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TShippingInstBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
