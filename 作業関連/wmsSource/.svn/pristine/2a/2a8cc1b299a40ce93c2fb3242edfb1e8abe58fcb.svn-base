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
 * The abstract condition-query of t_shipping_inst_h.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTShippingInstHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTShippingInstHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_shipping_inst_h";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterThan(Long shippingInstHId) {
        regShippingInstHId(CK_GT, shippingInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessThan(Long shippingInstHId) {
        regShippingInstHId(CK_LT, shippingInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterEqual(Long shippingInstHId) {
        regShippingInstHId(CK_GE, shippingInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessEqual(Long shippingInstHId) {
        regShippingInstHId(CK_LE, shippingInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstHIdList The collection of shippingInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_NotInScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_NINS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_H_ID from t_ec_order_h where ...)} <br>
     * t_ec_order_h by SHIPPING_INST_H_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TEcOrderHList for 'exists'. (NotNull)
     */
    public void existsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_ExistsReferrer_TEcOrderHList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tEcOrderHList");
    }
    public abstract String keepShippingInstHId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_H_ID from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by SHIPPING_INST_H_ID, named 'TShippingInstBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_ExistsReferrer_TShippingInstBList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstBList");
    }
    public abstract String keepShippingInstHId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_H_ID from t_shipping_inst_h_print where ...)} <br>
     * t_shipping_inst_h_print by SHIPPING_INST_H_ID, named 'TShippingInstHPrintAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHPrintList</span>(printCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHPrintList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHPrintList(SubQuery<TShippingInstHPrintCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHPrintCB cb = new TShippingInstHPrintCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_ExistsReferrer_TShippingInstHPrintList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstHPrintList");
    }
    public abstract String keepShippingInstHId_ExistsReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_H_ID from t_ec_order_h where ...)} <br>
     * t_ec_order_h by SHIPPING_INST_H_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTEcOrderHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstHId_NotExistsReferrer_TEcOrderHList for 'not exists'. (NotNull)
     */
    public void notExistsTEcOrderHList(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_NotExistsReferrer_TEcOrderHList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tEcOrderHList");
    }
    public abstract String keepShippingInstHId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_H_ID from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by SHIPPING_INST_H_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstHId_NotExistsReferrer_TShippingInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_NotExistsReferrer_TShippingInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstBList");
    }
    public abstract String keepShippingInstHId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_H_ID from t_shipping_inst_h_print where ...)} <br>
     * t_shipping_inst_h_print by SHIPPING_INST_H_ID, named 'TShippingInstHPrintAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHPrintList</span>(printCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstHId_NotExistsReferrer_TShippingInstHPrintList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHPrintList(SubQuery<TShippingInstHPrintCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHPrintCB cb = new TShippingInstHPrintCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_NotExistsReferrer_TShippingInstHPrintList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstHPrintList");
    }
    public abstract String keepShippingInstHId_NotExistsReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq);

    public void xsderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingInstHId_SpecifyDerivedReferrer_TEcOrderHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tEcOrderHList", al, op);
    }
    public abstract String keepShippingInstHId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);

    public void xsderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstBList", al, op);
    }
    public abstract String keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);

    public void xsderiveTShippingInstHPrintList(String fn, SubQuery<TShippingInstHPrintCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHPrintCB cb = new TShippingInstHPrintCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstHPrintList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "tShippingInstHPrintList", al, op);
    }
    public abstract String keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_ec_order_h where ...)} <br>
     * t_ec_order_h by SHIPPING_INST_H_ID, named 'TEcOrderHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTEcOrderHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TEcOrderHCB> derivedTEcOrderHList() {
        return xcreateQDRFunctionTEcOrderHList();
    }
    protected HpQDRFunction<TEcOrderHCB> xcreateQDRFunctionTEcOrderHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTEcOrderHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTEcOrderHList(String fn, SubQuery<TEcOrderHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingInstHId_QueryDerivedReferrer_TEcOrderHList(cb.query()); String prpp = keepShippingInstHId_QueryDerivedReferrer_TEcOrderHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", sqpp, "tEcOrderHList", rd, vl, prpp, op);
    }
    public abstract String keepShippingInstHId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq);
    public abstract String keepShippingInstHId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by SHIPPING_INST_H_ID, named 'TShippingInstBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingInstHId_QueryDerivedReferrer_TShippingInstBList(cb.query()); String prpp = keepShippingInstHId_QueryDerivedReferrer_TShippingInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", sqpp, "tShippingInstBList", rd, vl, prpp, op);
    }
    public abstract String keepShippingInstHId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);
    public abstract String keepShippingInstHId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_h_print where ...)} <br>
     * t_shipping_inst_h_print by SHIPPING_INST_H_ID, named 'TShippingInstHPrintAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHPrintList()</span>.<span style="color: #CC4747">max</span>(printCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     printCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     printCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHPrintCB> derivedTShippingInstHPrintList() {
        return xcreateQDRFunctionTShippingInstHPrintList();
    }
    protected HpQDRFunction<TShippingInstHPrintCB> xcreateQDRFunctionTShippingInstHPrintList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHPrintList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHPrintList(String fn, SubQuery<TShippingInstHPrintCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHPrintCB cb = new TShippingInstHPrintCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList(cb.query()); String prpp = keepShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", sqpp, "tShippingInstHPrintList", rd, vl, prpp, op);
    }
    public abstract String keepShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq);
    public abstract String keepShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingInstHId_IsNull() { regShippingInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingInstHId_IsNotNull() { regShippingInstHId(CK_ISNN, DOBJ); }

    protected void regShippingInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
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
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
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
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
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
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
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
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_Equal(Long processTypeId) {
        doSetProcessTypeId_Equal(processTypeId);
    }

    protected void doSetProcessTypeId_Equal(Long processTypeId) {
        regProcessTypeId(CK_EQ, processTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotEqual(Long processTypeId) {
        doSetProcessTypeId_NotEqual(processTypeId);
    }

    protected void doSetProcessTypeId_NotEqual(Long processTypeId) {
        regProcessTypeId(CK_NES, processTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeIdList The collection of processTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_InScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        regINS(CK_INS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeIdList The collection of processTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_NotInScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        regINS(CK_NINS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PROCESS_TYPE_ID from m_process_type where ...)} <br />
     * m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'in-scope'. (NotNull)
     */
    public void inScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_InScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", false);
    }
    public abstract String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PROCESS_TYPE_ID from m_process_type where ...)} <br />
     * m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_NotInScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", true);
    }
    public abstract String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq);

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputType The value of inputType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_Equal(String inputType) {
        doSetInputType_Equal(fRES(inputType));
    }

    /**
     * Equal(=). As InputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInputType_Equal_AsInputType(CDef.InputType cdef) {
        doSetInputType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 画面入力
     */
    public void setInputType_Equal_$00() {
        setInputType_Equal_AsInputType(CDef.InputType.$00);
    }

    /**
     * Equal(=). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: アップロード
     */
    public void setInputType_Equal_$10() {
        setInputType_Equal_AsInputType(CDef.InputType.$10);
    }

    /**
     * Equal(=). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: EDI
     */
    public void setInputType_Equal_$20() {
        setInputType_Equal_AsInputType(CDef.InputType.$20);
    }

    /**
     * Equal(=). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: HT
     */
    public void setInputType_Equal_$30() {
        setInputType_Equal_AsInputType(CDef.InputType.$30);
    }

    protected void doSetInputType_Equal(String inputType) {
        regInputType(CK_EQ, inputType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputType The value of inputType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotEqual(String inputType) {
        doSetInputType_NotEqual(fRES(inputType));
    }

    /**
     * NotEqual(&lt;&gt;). As InputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInputType_NotEqual_AsInputType(CDef.InputType cdef) {
        doSetInputType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 画面入力
     */
    public void setInputType_NotEqual_$00() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: アップロード
     */
    public void setInputType_NotEqual_$10() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$10);
    }

    /**
     * NotEqual(&lt;&gt;). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: EDI
     */
    public void setInputType_NotEqual_$20() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$20);
    }

    /**
     * NotEqual(&lt;&gt;). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: HT
     */
    public void setInputType_NotEqual_$30() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$30);
    }

    protected void doSetInputType_NotEqual(String inputType) {
        regInputType(CK_NES, inputType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputTypeList The collection of inputType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_InScope(Collection<String> inputTypeList) {
        doSetInputType_InScope(inputTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As InputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_InScope_AsInputType(Collection<CDef.InputType> cdefList) {
        doSetInputType_InScope(cTStrL(cdefList));
    }

    protected void doSetInputType_InScope(Collection<String> inputTypeList) {
        regINS(CK_INS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputTypeList The collection of inputType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope(Collection<String> inputTypeList) {
        doSetInputType_NotInScope(inputTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope_AsInputType(Collection<CDef.InputType> cdefList) {
        doSetInputType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInputType_NotInScope(Collection<String> inputTypeList) {
        regINS(CK_NINS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNull() { regInputType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNullOrEmpty() { regInputType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNotNull() { regInputType(CK_ISNN, DOBJ); }

    protected void regInputType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInputType(), "INPUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInputType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_Equal(String shippingDt) {
        doSetShippingDt_Equal(fRES(shippingDt));
    }

    protected void doSetShippingDt_Equal(String shippingDt) {
        regShippingDt(CK_EQ, shippingDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_NotEqual(String shippingDt) {
        doSetShippingDt_NotEqual(fRES(shippingDt));
    }

    protected void doSetShippingDt_NotEqual(String shippingDt) {
        regShippingDt(CK_NES, shippingDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterThan(String shippingDt) {
        regShippingDt(CK_GT, fRES(shippingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessThan(String shippingDt) {
        regShippingDt(CK_LT, fRES(shippingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterEqual(String shippingDt) {
        regShippingDt(CK_GE, fRES(shippingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessEqual(String shippingDt) {
        regShippingDt(CK_LE, fRES(shippingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDtList The collection of shippingDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_InScope(Collection<String> shippingDtList) {
        doSetShippingDt_InScope(shippingDtList);
    }

    protected void doSetShippingDt_InScope(Collection<String> shippingDtList) {
        regINS(CK_INS, cTL(shippingDtList), xgetCValueShippingDt(), "SHIPPING_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDtList The collection of shippingDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_NotInScope(Collection<String> shippingDtList) {
        doSetShippingDt_NotInScope(shippingDtList);
    }

    protected void doSetShippingDt_NotInScope(Collection<String> shippingDtList) {
        regINS(CK_NINS, cTL(shippingDtList), xgetCValueShippingDt(), "SHIPPING_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)} <br>
     * <pre>e.g. setShippingDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingDt The value of shippingDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingDt_LikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingDt_NotLikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_PrefixSearch(String shippingDt) {
        setShippingDt_LikeSearch(shippingDt, xcLSOPPre());
    }

    protected void regShippingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingDt(), "SHIPPING_DT"); }
    protected abstract ConditionValue xgetCValueShippingDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_Equal(String workDt) {
        doSetWorkDt_Equal(fRES(workDt));
    }

    protected void doSetWorkDt_Equal(String workDt) {
        regWorkDt(CK_EQ, workDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotEqual(String workDt) {
        doSetWorkDt_NotEqual(fRES(workDt));
    }

    protected void doSetWorkDt_NotEqual(String workDt) {
        regWorkDt(CK_NES, workDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterThan(String workDt) {
        regWorkDt(CK_GT, fRES(workDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessThan(String workDt) {
        regWorkDt(CK_LT, fRES(workDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterEqual(String workDt) {
        regWorkDt(CK_GE, fRES(workDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessEqual(String workDt) {
        regWorkDt(CK_LE, fRES(workDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDtList The collection of workDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_InScope(Collection<String> workDtList) {
        doSetWorkDt_InScope(workDtList);
    }

    protected void doSetWorkDt_InScope(Collection<String> workDtList) {
        regINS(CK_INS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDtList The collection of workDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotInScope(Collection<String> workDtList) {
        doSetWorkDt_NotInScope(workDtList);
    }

    protected void doSetWorkDt_NotInScope(Collection<String> workDtList) {
        regINS(CK_NINS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)} <br>
     * <pre>e.g. setWorkDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workDt The value of workDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkDt_LikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkDt_NotLikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_PrefixSearch(String workDt) {
        setWorkDt_LikeSearch(workDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNull() { regWorkDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNullOrEmpty() { regWorkDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNotNull() { regWorkDt(CK_ISNN, DOBJ); }

    protected void regWorkDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDt(), "WORK_DT"); }
    protected abstract ConditionValue xgetCValueWorkDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_Equal(String delivPlanDt) {
        doSetDelivPlanDt_Equal(fRES(delivPlanDt));
    }

    protected void doSetDelivPlanDt_Equal(String delivPlanDt) {
        regDelivPlanDt(CK_EQ, delivPlanDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_NotEqual(String delivPlanDt) {
        doSetDelivPlanDt_NotEqual(fRES(delivPlanDt));
    }

    protected void doSetDelivPlanDt_NotEqual(String delivPlanDt) {
        regDelivPlanDt(CK_NES, delivPlanDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_GreaterThan(String delivPlanDt) {
        regDelivPlanDt(CK_GT, fRES(delivPlanDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_LessThan(String delivPlanDt) {
        regDelivPlanDt(CK_LT, fRES(delivPlanDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_GreaterEqual(String delivPlanDt) {
        regDelivPlanDt(CK_GE, fRES(delivPlanDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_LessEqual(String delivPlanDt) {
        regDelivPlanDt(CK_LE, fRES(delivPlanDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDtList The collection of delivPlanDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_InScope(Collection<String> delivPlanDtList) {
        doSetDelivPlanDt_InScope(delivPlanDtList);
    }

    protected void doSetDelivPlanDt_InScope(Collection<String> delivPlanDtList) {
        regINS(CK_INS, cTL(delivPlanDtList), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDtList The collection of delivPlanDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_NotInScope(Collection<String> delivPlanDtList) {
        doSetDelivPlanDt_NotInScope(delivPlanDtList);
    }

    protected void doSetDelivPlanDt_NotInScope(Collection<String> delivPlanDtList) {
        regINS(CK_NINS, cTL(delivPlanDtList), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setDelivPlanDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivPlanDt The value of delivPlanDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivPlanDt_LikeSearch(String delivPlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivPlanDt), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivPlanDt_NotLikeSearch(String delivPlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivPlanDt), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_PrefixSearch(String delivPlanDt) {
        setDelivPlanDt_LikeSearch(delivPlanDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNull() { regDelivPlanDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNullOrEmpty() { regDelivPlanDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNotNull() { regDelivPlanDt(CK_ISNN, DOBJ); }

    protected void regDelivPlanDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivPlanDt(), "DELIV_PLAN_DT"); }
    protected abstract ConditionValue xgetCValueDelivPlanDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_Equal(String delivDt) {
        doSetDelivDt_Equal(fRES(delivDt));
    }

    protected void doSetDelivDt_Equal(String delivDt) {
        regDelivDt(CK_EQ, delivDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotEqual(String delivDt) {
        doSetDelivDt_NotEqual(fRES(delivDt));
    }

    protected void doSetDelivDt_NotEqual(String delivDt) {
        regDelivDt(CK_NES, delivDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterThan(String delivDt) {
        regDelivDt(CK_GT, fRES(delivDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessThan(String delivDt) {
        regDelivDt(CK_LT, fRES(delivDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterEqual(String delivDt) {
        regDelivDt(CK_GE, fRES(delivDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessEqual(String delivDt) {
        regDelivDt(CK_LE, fRES(delivDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDtList The collection of delivDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_InScope(Collection<String> delivDtList) {
        doSetDelivDt_InScope(delivDtList);
    }

    protected void doSetDelivDt_InScope(Collection<String> delivDtList) {
        regINS(CK_INS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDtList The collection of delivDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotInScope(Collection<String> delivDtList) {
        doSetDelivDt_NotInScope(delivDtList);
    }

    protected void doSetDelivDt_NotInScope(Collection<String> delivDtList) {
        regINS(CK_NINS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setDelivDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivDt The value of delivDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivDt_LikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivDt_NotLikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_PrefixSearch(String delivDt) {
        setDelivDt_LikeSearch(delivDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNull() { regDelivDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNullOrEmpty() { regDelivDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNotNull() { regDelivDt(CK_ISNN, DOBJ); }

    protected void regDelivDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivDt(), "DELIV_DT"); }
    protected abstract ConditionValue xgetCValueDelivDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTz The value of delivTz as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_Equal(String delivTz) {
        doSetDelivTz_Equal(fRES(delivTz));
    }

    /**
     * Equal(=). As DelivTz. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTz_Equal_AsDelivTz(CDef.DelivTz cdef) {
        doSetDelivTz_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $A (A). And OnlyOnceRegistered. <br>
     * $A: 午前中
     */
    public void setDelivTz_Equal_$A() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * Equal(=). As $B (B). And OnlyOnceRegistered. <br>
     * $B: 12時～14時
     */
    public void setDelivTz_Equal_$B() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * Equal(=). As $C (C). And OnlyOnceRegistered. <br>
     * $C: 14時～16時
     */
    public void setDelivTz_Equal_$C() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * Equal(=). As $D (D). And OnlyOnceRegistered. <br>
     * $D: 16時～18時
     */
    public void setDelivTz_Equal_$D() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * Equal(=). As $E (E). And OnlyOnceRegistered. <br>
     * $E: 18時～20時
     */
    public void setDelivTz_Equal_$E() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * Equal(=). As $F (F). And OnlyOnceRegistered. <br>
     * $F: 18時～21時
     */
    public void setDelivTz_Equal_$F() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * Equal(=). As $G (G). And OnlyOnceRegistered. <br>
     * $G: 19時～21時
     */
    public void setDelivTz_Equal_$G() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * Equal(=). As $H (H). And OnlyOnceRegistered. <br>
     * $H: 20時～21時
     */
    public void setDelivTz_Equal_$H() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * Equal(=). As $I (I). And OnlyOnceRegistered. <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_Equal_$I() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * Equal(=). As $J (J). And OnlyOnceRegistered. <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_Equal_$J() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$J);
    }

    protected void doSetDelivTz_Equal(String delivTz) {
        regDelivTz(CK_EQ, delivTz);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTz The value of delivTz as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual(String delivTz) {
        doSetDelivTz_NotEqual(fRES(delivTz));
    }

    /**
     * NotEqual(&lt;&gt;). As DelivTz. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz cdef) {
        doSetDelivTz_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $A (A). And OnlyOnceRegistered. <br>
     * $A: 午前中
     */
    public void setDelivTz_NotEqual_$A() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * NotEqual(&lt;&gt;). As $B (B). And OnlyOnceRegistered. <br>
     * $B: 12時～14時
     */
    public void setDelivTz_NotEqual_$B() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * NotEqual(&lt;&gt;). As $C (C). And OnlyOnceRegistered. <br>
     * $C: 14時～16時
     */
    public void setDelivTz_NotEqual_$C() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * NotEqual(&lt;&gt;). As $D (D). And OnlyOnceRegistered. <br>
     * $D: 16時～18時
     */
    public void setDelivTz_NotEqual_$D() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * NotEqual(&lt;&gt;). As $E (E). And OnlyOnceRegistered. <br>
     * $E: 18時～20時
     */
    public void setDelivTz_NotEqual_$E() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * NotEqual(&lt;&gt;). As $F (F). And OnlyOnceRegistered. <br>
     * $F: 18時～21時
     */
    public void setDelivTz_NotEqual_$F() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * NotEqual(&lt;&gt;). As $G (G). And OnlyOnceRegistered. <br>
     * $G: 19時～21時
     */
    public void setDelivTz_NotEqual_$G() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * NotEqual(&lt;&gt;). As $H (H). And OnlyOnceRegistered. <br>
     * $H: 20時～21時
     */
    public void setDelivTz_NotEqual_$H() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * NotEqual(&lt;&gt;). As $I (I). And OnlyOnceRegistered. <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_NotEqual_$I() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * NotEqual(&lt;&gt;). As $J (J). And OnlyOnceRegistered. <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_NotEqual_$J() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$J);
    }

    protected void doSetDelivTz_NotEqual(String delivTz) {
        regDelivTz(CK_NES, delivTz);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTzList The collection of delivTz as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope(Collection<String> delivTzList) {
        doSetDelivTz_InScope(delivTzList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelivTz. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope_AsDelivTz(Collection<CDef.DelivTz> cdefList) {
        doSetDelivTz_InScope(cTStrL(cdefList));
    }

    protected void doSetDelivTz_InScope(Collection<String> delivTzList) {
        regINS(CK_INS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTzList The collection of delivTz as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope(Collection<String> delivTzList) {
        doSetDelivTz_NotInScope(delivTzList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DelivTz. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope_AsDelivTz(Collection<CDef.DelivTz> cdefList) {
        doSetDelivTz_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDelivTz_NotInScope(Collection<String> delivTzList) {
        regINS(CK_NINS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNull() { regDelivTz(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNullOrEmpty() { regDelivTz(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNotNull() { regDelivTz(CK_ISNN, DOBJ); }

    protected void regDelivTz(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTz(), "DELIV_TZ"); }
    protected abstract ConditionValue xgetCValueDelivTz();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_Equal(String clientShippingNo) {
        doSetClientShippingNo_Equal(fRES(clientShippingNo));
    }

    protected void doSetClientShippingNo_Equal(String clientShippingNo) {
        regClientShippingNo(CK_EQ, clientShippingNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_NotEqual(String clientShippingNo) {
        doSetClientShippingNo_NotEqual(fRES(clientShippingNo));
    }

    protected void doSetClientShippingNo_NotEqual(String clientShippingNo) {
        regClientShippingNo(CK_NES, clientShippingNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_GreaterThan(String clientShippingNo) {
        regClientShippingNo(CK_GT, fRES(clientShippingNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_LessThan(String clientShippingNo) {
        regClientShippingNo(CK_LT, fRES(clientShippingNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_GreaterEqual(String clientShippingNo) {
        regClientShippingNo(CK_GE, fRES(clientShippingNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_LessEqual(String clientShippingNo) {
        regClientShippingNo(CK_LE, fRES(clientShippingNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNoList The collection of clientShippingNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_InScope(Collection<String> clientShippingNoList) {
        doSetClientShippingNo_InScope(clientShippingNoList);
    }

    protected void doSetClientShippingNo_InScope(Collection<String> clientShippingNoList) {
        regINS(CK_INS, cTL(clientShippingNoList), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNoList The collection of clientShippingNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_NotInScope(Collection<String> clientShippingNoList) {
        doSetClientShippingNo_NotInScope(clientShippingNoList);
    }

    protected void doSetClientShippingNo_NotInScope(Collection<String> clientShippingNoList) {
        regINS(CK_NINS, cTL(clientShippingNoList), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setClientShippingNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientShippingNo The value of clientShippingNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientShippingNo_LikeSearch(String clientShippingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientShippingNo), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientShippingNo_NotLikeSearch(String clientShippingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientShippingNo), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_PrefixSearch(String clientShippingNo) {
        setClientShippingNo_LikeSearch(clientShippingNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     */
    public void setClientShippingNo_IsNull() { regClientShippingNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     */
    public void setClientShippingNo_IsNullOrEmpty() { regClientShippingNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     */
    public void setClientShippingNo_IsNotNull() { regClientShippingNo(CK_ISNN, DOBJ); }

    protected void regClientShippingNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO"); }
    protected abstract ConditionValue xgetCValueClientShippingNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_Equal(String shippingSlipNo) {
        doSetShippingSlipNo_Equal(fRES(shippingSlipNo));
    }

    protected void doSetShippingSlipNo_Equal(String shippingSlipNo) {
        regShippingSlipNo(CK_EQ, shippingSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_NotEqual(String shippingSlipNo) {
        doSetShippingSlipNo_NotEqual(fRES(shippingSlipNo));
    }

    protected void doSetShippingSlipNo_NotEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_NES, shippingSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterThan(String shippingSlipNo) {
        regShippingSlipNo(CK_GT, fRES(shippingSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessThan(String shippingSlipNo) {
        regShippingSlipNo(CK_LT, fRES(shippingSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_GE, fRES(shippingSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_LE, fRES(shippingSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNoList The collection of shippingSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_InScope(Collection<String> shippingSlipNoList) {
        doSetShippingSlipNo_InScope(shippingSlipNoList);
    }

    protected void doSetShippingSlipNo_InScope(Collection<String> shippingSlipNoList) {
        regINS(CK_INS, cTL(shippingSlipNoList), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNoList The collection of shippingSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_NotInScope(Collection<String> shippingSlipNoList) {
        doSetShippingSlipNo_NotInScope(shippingSlipNoList);
    }

    protected void doSetShippingSlipNo_NotInScope(Collection<String> shippingSlipNoList) {
        regINS(CK_NINS, cTL(shippingSlipNoList), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setShippingSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingSlipNo The value of shippingSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingSlipNo_LikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingSlipNo_NotLikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_PrefixSearch(String shippingSlipNo) {
        setShippingSlipNo_LikeSearch(shippingSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNull() { regShippingSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNullOrEmpty() { regShippingSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNotNull() { regShippingSlipNo(CK_ISNN, DOBJ); }

    protected void regShippingSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueShippingSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus}
     * @param shippingStatus The value of shippingStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_Equal(String shippingStatus) {
        doSetShippingStatus_Equal(fRES(shippingStatus));
    }

    /**
     * Equal(=). As ShippingStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus cdef) {
        doSetShippingStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 未出荷
     */
    public void setShippingStatus_Equal_$10() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$10);
    }

    /**
     * Equal(=). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 出庫指示中
     */
    public void setShippingStatus_Equal_$15() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$15);
    }

    /**
     * Equal(=). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: 出庫指示解除中
     */
    public void setShippingStatus_Equal_$20() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$20);
    }

    /**
     * Equal(=). As $25 (25). And OnlyOnceRegistered. <br>
     * $25: 出庫指示済
     */
    public void setShippingStatus_Equal_$25() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$25);
    }

    /**
     * Equal(=). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: ピッキング中
     */
    public void setShippingStatus_Equal_$30() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$30);
    }

    /**
     * Equal(=). As $35 (35). And OnlyOnceRegistered. <br>
     * $35: ピッキング済
     */
    public void setShippingStatus_Equal_$35() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$35);
    }

    /**
     * Equal(=). As $40 (40). And OnlyOnceRegistered. <br>
     * $40: 出荷検品中
     */
    public void setShippingStatus_Equal_$40() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$40);
    }

    /**
     * Equal(=). As $45 (45). And OnlyOnceRegistered. <br>
     * $45: 出荷検品中断
     */
    public void setShippingStatus_Equal_$45() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$45);
    }

    /**
     * Equal(=). As $50 (50). And OnlyOnceRegistered. <br>
     * $50: 出荷検品済
     */
    public void setShippingStatus_Equal_$50() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$50);
    }

    /**
     * Equal(=). As $55 (55). And OnlyOnceRegistered. <br>
     * $55: 出荷確定済
     */
    public void setShippingStatus_Equal_$55() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$55);
    }

    /**
     * Equal(=). As $90 (90). And OnlyOnceRegistered. <br>
     * $90: キャンセル
     */
    public void setShippingStatus_Equal_$90() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$90);
    }

    /**
     * Equal(=). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: エラー有
     */
    public void setShippingStatus_Equal_$99() {
        setShippingStatus_Equal_AsShippingStatus(CDef.ShippingStatus.$99);
    }

    protected void doSetShippingStatus_Equal(String shippingStatus) {
        regShippingStatus(CK_EQ, shippingStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus}
     * @param shippingStatus The value of shippingStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_NotEqual(String shippingStatus) {
        doSetShippingStatus_NotEqual(fRES(shippingStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As ShippingStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus cdef) {
        doSetShippingStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 未出荷
     */
    public void setShippingStatus_NotEqual_$10() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$10);
    }

    /**
     * NotEqual(&lt;&gt;). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 出庫指示中
     */
    public void setShippingStatus_NotEqual_$15() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$15);
    }

    /**
     * NotEqual(&lt;&gt;). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: 出庫指示解除中
     */
    public void setShippingStatus_NotEqual_$20() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$20);
    }

    /**
     * NotEqual(&lt;&gt;). As $25 (25). And OnlyOnceRegistered. <br>
     * $25: 出庫指示済
     */
    public void setShippingStatus_NotEqual_$25() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$25);
    }

    /**
     * NotEqual(&lt;&gt;). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: ピッキング中
     */
    public void setShippingStatus_NotEqual_$30() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$30);
    }

    /**
     * NotEqual(&lt;&gt;). As $35 (35). And OnlyOnceRegistered. <br>
     * $35: ピッキング済
     */
    public void setShippingStatus_NotEqual_$35() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$35);
    }

    /**
     * NotEqual(&lt;&gt;). As $40 (40). And OnlyOnceRegistered. <br>
     * $40: 出荷検品中
     */
    public void setShippingStatus_NotEqual_$40() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$40);
    }

    /**
     * NotEqual(&lt;&gt;). As $45 (45). And OnlyOnceRegistered. <br>
     * $45: 出荷検品中断
     */
    public void setShippingStatus_NotEqual_$45() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$45);
    }

    /**
     * NotEqual(&lt;&gt;). As $50 (50). And OnlyOnceRegistered. <br>
     * $50: 出荷検品済
     */
    public void setShippingStatus_NotEqual_$50() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$50);
    }

    /**
     * NotEqual(&lt;&gt;). As $55 (55). And OnlyOnceRegistered. <br>
     * $55: 出荷確定済
     */
    public void setShippingStatus_NotEqual_$55() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$55);
    }

    /**
     * NotEqual(&lt;&gt;). As $90 (90). And OnlyOnceRegistered. <br>
     * $90: キャンセル
     */
    public void setShippingStatus_NotEqual_$90() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$90);
    }

    /**
     * NotEqual(&lt;&gt;). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: エラー有
     */
    public void setShippingStatus_NotEqual_$99() {
        setShippingStatus_NotEqual_AsShippingStatus(CDef.ShippingStatus.$99);
    }

    protected void doSetShippingStatus_NotEqual(String shippingStatus) {
        regShippingStatus(CK_NES, shippingStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus}
     * @param shippingStatusList The collection of shippingStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_InScope(Collection<String> shippingStatusList) {
        doSetShippingStatus_InScope(shippingStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As ShippingStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_InScope_AsShippingStatus(Collection<CDef.ShippingStatus> cdefList) {
        doSetShippingStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetShippingStatus_InScope(Collection<String> shippingStatusList) {
        regINS(CK_INS, cTL(shippingStatusList), xgetCValueShippingStatus(), "SHIPPING_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus}
     * @param shippingStatusList The collection of shippingStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_NotInScope(Collection<String> shippingStatusList) {
        doSetShippingStatus_NotInScope(shippingStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ShippingStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_NotInScope_AsShippingStatus(Collection<CDef.ShippingStatus> cdefList) {
        doSetShippingStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetShippingStatus_NotInScope(Collection<String> shippingStatusList) {
        regINS(CK_NINS, cTL(shippingStatusList), xgetCValueShippingStatus(), "SHIPPING_STATUS");
    }

    protected void regShippingStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStatus(), "SHIPPING_STATUS"); }
    protected abstract ConditionValue xgetCValueShippingStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_Equal(Long supplyCustomerId) {
        doSetSupplyCustomerId_Equal(supplyCustomerId);
    }

    protected void doSetSupplyCustomerId_Equal(Long supplyCustomerId) {
        regSupplyCustomerId(CK_EQ, supplyCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_NotEqual(Long supplyCustomerId) {
        doSetSupplyCustomerId_NotEqual(supplyCustomerId);
    }

    protected void doSetSupplyCustomerId_NotEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_NES, supplyCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_GreaterThan(Long supplyCustomerId) {
        regSupplyCustomerId(CK_GT, supplyCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_LessThan(Long supplyCustomerId) {
        regSupplyCustomerId(CK_LT, supplyCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_GreaterEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_GE, supplyCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_LessEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_LE, supplyCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of supplyCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of supplyCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSupplyCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerIdList The collection of supplyCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_InScope(Collection<Long> supplyCustomerIdList) {
        doSetSupplyCustomerId_InScope(supplyCustomerIdList);
    }

    protected void doSetSupplyCustomerId_InScope(Collection<Long> supplyCustomerIdList) {
        regINS(CK_INS, cTL(supplyCustomerIdList), xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerIdList The collection of supplyCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_NotInScope(Collection<Long> supplyCustomerIdList) {
        doSetSupplyCustomerId_NotInScope(supplyCustomerIdList);
    }

    protected void doSetSupplyCustomerId_NotInScope(Collection<Long> supplyCustomerIdList) {
        regINS(CK_NINS, cTL(supplyCustomerIdList), xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SUPPLY_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @param subCBLambda The callback for sub-query of MCustomerBySupplyCustomerId for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerBySupplyCustomerId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(cb.query());
        registerInScopeRelation(cb.query(), "SUPPLY_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerBySupplyCustomerId", false);
    }
    public abstract String keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SUPPLY_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @param subCBLambda The callback for sub-query of MCustomerBySupplyCustomerId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerBySupplyCustomerId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(cb.query());
        registerInScopeRelation(cb.query(), "SUPPLY_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerBySupplyCustomerId", true);
    }
    public abstract String keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setSupplyCustomerId_IsNull() { regSupplyCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setSupplyCustomerId_IsNotNull() { regSupplyCustomerId(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_Equal(String supplyCustomerCd) {
        doSetSupplyCustomerCd_Equal(fRES(supplyCustomerCd));
    }

    protected void doSetSupplyCustomerCd_Equal(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_EQ, supplyCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_NotEqual(String supplyCustomerCd) {
        doSetSupplyCustomerCd_NotEqual(fRES(supplyCustomerCd));
    }

    protected void doSetSupplyCustomerCd_NotEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_NES, supplyCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_GreaterThan(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_GT, fRES(supplyCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_LessThan(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_LT, fRES(supplyCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_GreaterEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_GE, fRES(supplyCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_LessEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_LE, fRES(supplyCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCdList The collection of supplyCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_InScope(Collection<String> supplyCustomerCdList) {
        doSetSupplyCustomerCd_InScope(supplyCustomerCdList);
    }

    protected void doSetSupplyCustomerCd_InScope(Collection<String> supplyCustomerCdList) {
        regINS(CK_INS, cTL(supplyCustomerCdList), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCdList The collection of supplyCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_NotInScope(Collection<String> supplyCustomerCdList) {
        doSetSupplyCustomerCd_NotInScope(supplyCustomerCdList);
    }

    protected void doSetSupplyCustomerCd_NotInScope(Collection<String> supplyCustomerCdList) {
        regINS(CK_NINS, cTL(supplyCustomerCdList), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setSupplyCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplyCustomerCd The value of supplyCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplyCustomerCd_LikeSearch(String supplyCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplyCustomerCd), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplyCustomerCd_NotLikeSearch(String supplyCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplyCustomerCd), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_PrefixSearch(String supplyCustomerCd) {
        setSupplyCustomerCd_LikeSearch(supplyCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNull() { regSupplyCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNullOrEmpty() { regSupplyCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNotNull() { regSupplyCustomerCd(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_Equal(String supplyCustomerNm) {
        doSetSupplyCustomerNm_Equal(fRES(supplyCustomerNm));
    }

    protected void doSetSupplyCustomerNm_Equal(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_EQ, supplyCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_NotEqual(String supplyCustomerNm) {
        doSetSupplyCustomerNm_NotEqual(fRES(supplyCustomerNm));
    }

    protected void doSetSupplyCustomerNm_NotEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_NES, supplyCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_GreaterThan(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_GT, fRES(supplyCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_LessThan(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_LT, fRES(supplyCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_GreaterEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_GE, fRES(supplyCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_LessEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_LE, fRES(supplyCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNmList The collection of supplyCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_InScope(Collection<String> supplyCustomerNmList) {
        doSetSupplyCustomerNm_InScope(supplyCustomerNmList);
    }

    protected void doSetSupplyCustomerNm_InScope(Collection<String> supplyCustomerNmList) {
        regINS(CK_INS, cTL(supplyCustomerNmList), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNmList The collection of supplyCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_NotInScope(Collection<String> supplyCustomerNmList) {
        doSetSupplyCustomerNm_NotInScope(supplyCustomerNmList);
    }

    protected void doSetSupplyCustomerNm_NotInScope(Collection<String> supplyCustomerNmList) {
        regINS(CK_NINS, cTL(supplyCustomerNmList), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * <pre>e.g. setSupplyCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplyCustomerNm The value of supplyCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplyCustomerNm_LikeSearch(String supplyCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplyCustomerNm), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplyCustomerNm_NotLikeSearch(String supplyCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplyCustomerNm), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_PrefixSearch(String supplyCustomerNm) {
        setSupplyCustomerNm_LikeSearch(supplyCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNull() { regSupplyCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNullOrEmpty() { regSupplyCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNotNull() { regSupplyCustomerNm(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_Equal(Long delivCustomerId) {
        doSetDelivCustomerId_Equal(delivCustomerId);
    }

    protected void doSetDelivCustomerId_Equal(Long delivCustomerId) {
        regDelivCustomerId(CK_EQ, delivCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotEqual(Long delivCustomerId) {
        doSetDelivCustomerId_NotEqual(delivCustomerId);
    }

    protected void doSetDelivCustomerId_NotEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_NES, delivCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterThan(Long delivCustomerId) {
        regDelivCustomerId(CK_GT, delivCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessThan(Long delivCustomerId) {
        regDelivCustomerId(CK_LT, delivCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_GE, delivCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_LE, delivCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerIdList The collection of delivCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_InScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_INS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerIdList The collection of delivCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_NotInScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_NINS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIV_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @param subCBLambda The callback for sub-query of MCustomerByDelivCustomerId for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerByDelivCustomerId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerByDelivCustomerId", false);
    }
    public abstract String keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIV_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @param subCBLambda The callback for sub-query of MCustomerByDelivCustomerId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerByDelivCustomerId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerByDelivCustomerId", true);
    }
    public abstract String keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setDelivCustomerId_IsNull() { regDelivCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setDelivCustomerId_IsNotNull() { regDelivCustomerId(CK_ISNN, DOBJ); }

    protected void regDelivCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueDelivCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_Equal(String delivCustomerCd) {
        doSetDelivCustomerCd_Equal(fRES(delivCustomerCd));
    }

    protected void doSetDelivCustomerCd_Equal(String delivCustomerCd) {
        regDelivCustomerCd(CK_EQ, delivCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_NotEqual(String delivCustomerCd) {
        doSetDelivCustomerCd_NotEqual(fRES(delivCustomerCd));
    }

    protected void doSetDelivCustomerCd_NotEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_NES, delivCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_GreaterThan(String delivCustomerCd) {
        regDelivCustomerCd(CK_GT, fRES(delivCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_LessThan(String delivCustomerCd) {
        regDelivCustomerCd(CK_LT, fRES(delivCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_GreaterEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_GE, fRES(delivCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_LessEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_LE, fRES(delivCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCdList The collection of delivCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_InScope(Collection<String> delivCustomerCdList) {
        doSetDelivCustomerCd_InScope(delivCustomerCdList);
    }

    protected void doSetDelivCustomerCd_InScope(Collection<String> delivCustomerCdList) {
        regINS(CK_INS, cTL(delivCustomerCdList), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCdList The collection of delivCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_NotInScope(Collection<String> delivCustomerCdList) {
        doSetDelivCustomerCd_NotInScope(delivCustomerCdList);
    }

    protected void doSetDelivCustomerCd_NotInScope(Collection<String> delivCustomerCdList) {
        regINS(CK_NINS, cTL(delivCustomerCdList), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerCd The value of delivCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerCd_LikeSearch(String delivCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerCd), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerCd_NotLikeSearch(String delivCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerCd), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_PrefixSearch(String delivCustomerCd) {
        setDelivCustomerCd_LikeSearch(delivCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNull() { regDelivCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNullOrEmpty() { regDelivCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNotNull() { regDelivCustomerCd(CK_ISNN, DOBJ); }

    protected void regDelivCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueDelivCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCd The value of delivZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_Equal(String delivZipCd) {
        doSetDelivZipCd_Equal(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_Equal(String delivZipCd) {
        regDelivZipCd(CK_EQ, delivZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCd The value of delivZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotEqual(String delivZipCd) {
        doSetDelivZipCd_NotEqual(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_NotEqual(String delivZipCd) {
        regDelivZipCd(CK_NES, delivZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCd The value of delivZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterThan(String delivZipCd) {
        regDelivZipCd(CK_GT, fRES(delivZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCd The value of delivZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessThan(String delivZipCd) {
        regDelivZipCd(CK_LT, fRES(delivZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCd The value of delivZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterEqual(String delivZipCd) {
        regDelivZipCd(CK_GE, fRES(delivZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCd The value of delivZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessEqual(String delivZipCd) {
        regDelivZipCd(CK_LE, fRES(delivZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCdList The collection of delivZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_InScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_InScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_InScope(Collection<String> delivZipCdList) {
        regINS(CK_INS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCdList The collection of delivZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_NotInScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        regINS(CK_NINS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP} <br>
     * <pre>e.g. setDelivZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivZipCd The value of delivZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivZipCd_LikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCd The value of delivZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivZipCd_NotLikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @param delivZipCd The value of delivZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_PrefixSearch(String delivZipCd) {
        setDelivZipCd_LikeSearch(delivZipCd, xcLSOPPre());
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIV_ZIP_CD from m_zip where ...)} <br />
     * m_zip by my DELIV_ZIP_CD, named 'MZipForDeliv'.
     * @param subCBLambda The callback for sub-query of MZipForDeliv for 'in-scope'. (NotNull)
     */
    public void inScopeMZipForDeliv(SubQuery<MZipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZipCB cb = new MZipCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivZipCd_InScopeRelation_MZipForDeliv(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_ZIP_CD", "ZIP_CD", pp, "mZipForDeliv", false);
    }
    public abstract String keepDelivZipCd_InScopeRelation_MZipForDeliv(MZipCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIV_ZIP_CD from m_zip where ...)} <br />
     * m_zip by my DELIV_ZIP_CD, named 'MZipForDeliv'.
     * @param subCBLambda The callback for sub-query of MZipForDeliv for 'not in-scope'. (NotNull)
     */
    public void notInScopeMZipForDeliv(SubQuery<MZipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZipCB cb = new MZipCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivZipCd_NotInScopeRelation_MZipForDeliv(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_ZIP_CD", "ZIP_CD", pp, "mZipForDeliv", true);
    }
    public abstract String keepDelivZipCd_NotInScopeRelation_MZipForDeliv(MZipCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     */
    public void setDelivZipCd_IsNull() { regDelivZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     */
    public void setDelivZipCd_IsNullOrEmpty() { regDelivZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     */
    public void setDelivZipCd_IsNotNull() { regDelivZipCd(CK_ISNN, DOBJ); }

    protected void regDelivZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivZipCd(), "DELIV_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueDelivZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_Equal(String delivAddress1) {
        doSetDelivAddress1_Equal(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_Equal(String delivAddress1) {
        regDelivAddress1(CK_EQ, delivAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotEqual(String delivAddress1) {
        doSetDelivAddress1_NotEqual(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_NotEqual(String delivAddress1) {
        regDelivAddress1(CK_NES, delivAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterThan(String delivAddress1) {
        regDelivAddress1(CK_GT, fRES(delivAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessThan(String delivAddress1) {
        regDelivAddress1(CK_LT, fRES(delivAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterEqual(String delivAddress1) {
        regDelivAddress1(CK_GE, fRES(delivAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessEqual(String delivAddress1) {
        regDelivAddress1(CK_LE, fRES(delivAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1List The collection of delivAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_InScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_InScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_InScope(Collection<String> delivAddress1List) {
        regINS(CK_INS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1List The collection of delivAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_NotInScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        regINS(CK_NINS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress1 The value of delivAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress1_LikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress1_NotLikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_PrefixSearch(String delivAddress1) {
        setDelivAddress1_LikeSearch(delivAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNull() { regDelivAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNullOrEmpty() { regDelivAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNotNull() { regDelivAddress1(CK_ISNN, DOBJ); }

    protected void regDelivAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress1(), "DELIV_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDelivAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_Equal(String delivAddress2) {
        doSetDelivAddress2_Equal(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_Equal(String delivAddress2) {
        regDelivAddress2(CK_EQ, delivAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotEqual(String delivAddress2) {
        doSetDelivAddress2_NotEqual(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_NotEqual(String delivAddress2) {
        regDelivAddress2(CK_NES, delivAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterThan(String delivAddress2) {
        regDelivAddress2(CK_GT, fRES(delivAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessThan(String delivAddress2) {
        regDelivAddress2(CK_LT, fRES(delivAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterEqual(String delivAddress2) {
        regDelivAddress2(CK_GE, fRES(delivAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessEqual(String delivAddress2) {
        regDelivAddress2(CK_LE, fRES(delivAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2List The collection of delivAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_InScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_InScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_InScope(Collection<String> delivAddress2List) {
        regINS(CK_INS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2List The collection of delivAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_NotInScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        regINS(CK_NINS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress2 The value of delivAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress2_LikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress2_NotLikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_PrefixSearch(String delivAddress2) {
        setDelivAddress2_LikeSearch(delivAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNull() { regDelivAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNullOrEmpty() { regDelivAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNotNull() { regDelivAddress2(CK_ISNN, DOBJ); }

    protected void regDelivAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress2(), "DELIV_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueDelivAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_Equal(String delivAddress3) {
        doSetDelivAddress3_Equal(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_Equal(String delivAddress3) {
        regDelivAddress3(CK_EQ, delivAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotEqual(String delivAddress3) {
        doSetDelivAddress3_NotEqual(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_NotEqual(String delivAddress3) {
        regDelivAddress3(CK_NES, delivAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterThan(String delivAddress3) {
        regDelivAddress3(CK_GT, fRES(delivAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessThan(String delivAddress3) {
        regDelivAddress3(CK_LT, fRES(delivAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterEqual(String delivAddress3) {
        regDelivAddress3(CK_GE, fRES(delivAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessEqual(String delivAddress3) {
        regDelivAddress3(CK_LE, fRES(delivAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3List The collection of delivAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_InScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_InScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_InScope(Collection<String> delivAddress3List) {
        regINS(CK_INS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3List The collection of delivAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_NotInScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        regINS(CK_NINS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress3 The value of delivAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress3_LikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress3_NotLikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_PrefixSearch(String delivAddress3) {
        setDelivAddress3_LikeSearch(delivAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNull() { regDelivAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNullOrEmpty() { regDelivAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNotNull() { regDelivAddress3(CK_ISNN, DOBJ); }

    protected void regDelivAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress3(), "DELIV_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueDelivAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_Equal(String delivAddressSupply) {
        doSetDelivAddressSupply_Equal(fRES(delivAddressSupply));
    }

    protected void doSetDelivAddressSupply_Equal(String delivAddressSupply) {
        regDelivAddressSupply(CK_EQ, delivAddressSupply);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_NotEqual(String delivAddressSupply) {
        doSetDelivAddressSupply_NotEqual(fRES(delivAddressSupply));
    }

    protected void doSetDelivAddressSupply_NotEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_NES, delivAddressSupply);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_GreaterThan(String delivAddressSupply) {
        regDelivAddressSupply(CK_GT, fRES(delivAddressSupply));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_LessThan(String delivAddressSupply) {
        regDelivAddressSupply(CK_LT, fRES(delivAddressSupply));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_GreaterEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_GE, fRES(delivAddressSupply));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_LessEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_LE, fRES(delivAddressSupply));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupplyList The collection of delivAddressSupply as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_InScope(Collection<String> delivAddressSupplyList) {
        doSetDelivAddressSupply_InScope(delivAddressSupplyList);
    }

    protected void doSetDelivAddressSupply_InScope(Collection<String> delivAddressSupplyList) {
        regINS(CK_INS, cTL(delivAddressSupplyList), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupplyList The collection of delivAddressSupply as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_NotInScope(Collection<String> delivAddressSupplyList) {
        doSetDelivAddressSupply_NotInScope(delivAddressSupplyList);
    }

    protected void doSetDelivAddressSupply_NotInScope(Collection<String> delivAddressSupplyList) {
        regINS(CK_NINS, cTL(delivAddressSupplyList), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * <pre>e.g. setDelivAddressSupply_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddressSupply The value of delivAddressSupply as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddressSupply_LikeSearch(String delivAddressSupply, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddressSupply), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddressSupply_NotLikeSearch(String delivAddressSupply, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddressSupply), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_PrefixSearch(String delivAddressSupply) {
        setDelivAddressSupply_LikeSearch(delivAddressSupply, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNull() { regDelivAddressSupply(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNullOrEmpty() { regDelivAddressSupply(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNotNull() { regDelivAddressSupply(CK_ISNN, DOBJ); }

    protected void regDelivAddressSupply(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY"); }
    protected abstract ConditionValue xgetCValueDelivAddressSupply();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_Equal(String delivCustomerNm) {
        doSetDelivCustomerNm_Equal(fRES(delivCustomerNm));
    }

    protected void doSetDelivCustomerNm_Equal(String delivCustomerNm) {
        regDelivCustomerNm(CK_EQ, delivCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_NotEqual(String delivCustomerNm) {
        doSetDelivCustomerNm_NotEqual(fRES(delivCustomerNm));
    }

    protected void doSetDelivCustomerNm_NotEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_NES, delivCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_GreaterThan(String delivCustomerNm) {
        regDelivCustomerNm(CK_GT, fRES(delivCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_LessThan(String delivCustomerNm) {
        regDelivCustomerNm(CK_LT, fRES(delivCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_GreaterEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_GE, fRES(delivCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_LessEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_LE, fRES(delivCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNmList The collection of delivCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_InScope(Collection<String> delivCustomerNmList) {
        doSetDelivCustomerNm_InScope(delivCustomerNmList);
    }

    protected void doSetDelivCustomerNm_InScope(Collection<String> delivCustomerNmList) {
        regINS(CK_INS, cTL(delivCustomerNmList), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNmList The collection of delivCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_NotInScope(Collection<String> delivCustomerNmList) {
        doSetDelivCustomerNm_NotInScope(delivCustomerNmList);
    }

    protected void doSetDelivCustomerNm_NotInScope(Collection<String> delivCustomerNmList) {
        regINS(CK_NINS, cTL(delivCustomerNmList), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm The value of delivCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm_LikeSearch(String delivCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm_NotLikeSearch(String delivCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_PrefixSearch(String delivCustomerNm) {
        setDelivCustomerNm_LikeSearch(delivCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setDelivCustomerNm_IsNull() { regDelivCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setDelivCustomerNm_IsNullOrEmpty() { regDelivCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setDelivCustomerNm_IsNotNull() { regDelivCustomerNm(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_Equal(String delivCustomerNm1) {
        doSetDelivCustomerNm1_Equal(fRES(delivCustomerNm1));
    }

    protected void doSetDelivCustomerNm1_Equal(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_EQ, delivCustomerNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_NotEqual(String delivCustomerNm1) {
        doSetDelivCustomerNm1_NotEqual(fRES(delivCustomerNm1));
    }

    protected void doSetDelivCustomerNm1_NotEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_NES, delivCustomerNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_GreaterThan(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_GT, fRES(delivCustomerNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_LessThan(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_LT, fRES(delivCustomerNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_GreaterEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_GE, fRES(delivCustomerNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_LessEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_LE, fRES(delivCustomerNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1List The collection of delivCustomerNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_InScope(Collection<String> delivCustomerNm1List) {
        doSetDelivCustomerNm1_InScope(delivCustomerNm1List);
    }

    protected void doSetDelivCustomerNm1_InScope(Collection<String> delivCustomerNm1List) {
        regINS(CK_INS, cTL(delivCustomerNm1List), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1List The collection of delivCustomerNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_NotInScope(Collection<String> delivCustomerNm1List) {
        doSetDelivCustomerNm1_NotInScope(delivCustomerNm1List);
    }

    protected void doSetDelivCustomerNm1_NotInScope(Collection<String> delivCustomerNm1List) {
        regINS(CK_NINS, cTL(delivCustomerNm1List), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivCustomerNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm1 The value of delivCustomerNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm1_LikeSearch(String delivCustomerNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm1), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm1_NotLikeSearch(String delivCustomerNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm1), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_PrefixSearch(String delivCustomerNm1) {
        setDelivCustomerNm1_LikeSearch(delivCustomerNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     */
    public void setDelivCustomerNm1_IsNull() { regDelivCustomerNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     */
    public void setDelivCustomerNm1_IsNullOrEmpty() { regDelivCustomerNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     */
    public void setDelivCustomerNm1_IsNotNull() { regDelivCustomerNm1(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_Equal(String delivCustomerNm2) {
        doSetDelivCustomerNm2_Equal(fRES(delivCustomerNm2));
    }

    protected void doSetDelivCustomerNm2_Equal(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_EQ, delivCustomerNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_NotEqual(String delivCustomerNm2) {
        doSetDelivCustomerNm2_NotEqual(fRES(delivCustomerNm2));
    }

    protected void doSetDelivCustomerNm2_NotEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_NES, delivCustomerNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_GreaterThan(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_GT, fRES(delivCustomerNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_LessThan(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_LT, fRES(delivCustomerNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_GreaterEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_GE, fRES(delivCustomerNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_LessEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_LE, fRES(delivCustomerNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2List The collection of delivCustomerNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_InScope(Collection<String> delivCustomerNm2List) {
        doSetDelivCustomerNm2_InScope(delivCustomerNm2List);
    }

    protected void doSetDelivCustomerNm2_InScope(Collection<String> delivCustomerNm2List) {
        regINS(CK_INS, cTL(delivCustomerNm2List), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2List The collection of delivCustomerNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_NotInScope(Collection<String> delivCustomerNm2List) {
        doSetDelivCustomerNm2_NotInScope(delivCustomerNm2List);
    }

    protected void doSetDelivCustomerNm2_NotInScope(Collection<String> delivCustomerNm2List) {
        regINS(CK_NINS, cTL(delivCustomerNm2List), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivCustomerNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm2 The value of delivCustomerNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm2_LikeSearch(String delivCustomerNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm2), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm2_NotLikeSearch(String delivCustomerNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm2), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_PrefixSearch(String delivCustomerNm2) {
        setDelivCustomerNm2_LikeSearch(delivCustomerNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     */
    public void setDelivCustomerNm2_IsNull() { regDelivCustomerNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     */
    public void setDelivCustomerNm2_IsNullOrEmpty() { regDelivCustomerNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     */
    public void setDelivCustomerNm2_IsNotNull() { regDelivCustomerNm2(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_Equal(String delivTelNo) {
        doSetDelivTelNo_Equal(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_Equal(String delivTelNo) {
        regDelivTelNo(CK_EQ, delivTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotEqual(String delivTelNo) {
        doSetDelivTelNo_NotEqual(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_NotEqual(String delivTelNo) {
        regDelivTelNo(CK_NES, delivTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterThan(String delivTelNo) {
        regDelivTelNo(CK_GT, fRES(delivTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessThan(String delivTelNo) {
        regDelivTelNo(CK_LT, fRES(delivTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterEqual(String delivTelNo) {
        regDelivTelNo(CK_GE, fRES(delivTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessEqual(String delivTelNo) {
        regDelivTelNo(CK_LE, fRES(delivTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNoList The collection of delivTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_InScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_InScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_InScope(Collection<String> delivTelNoList) {
        regINS(CK_INS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNoList The collection of delivTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_NotInScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        regINS(CK_NINS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTelNo The value of delivTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTelNo_LikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTelNo_NotLikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_PrefixSearch(String delivTelNo) {
        setDelivTelNo_LikeSearch(delivTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNull() { regDelivTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNullOrEmpty() { regDelivTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNotNull() { regDelivTelNo(CK_ISNN, DOBJ); }

    protected void regDelivTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTelNo(), "DELIV_TEL_NO"); }
    protected abstract ConditionValue xgetCValueDelivTelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_Equal(Long deliveryCourseId) {
        doSetDeliveryCourseId_Equal(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_Equal(Long deliveryCourseId) {
        regDeliveryCourseId(CK_EQ, deliveryCourseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        doSetDeliveryCourseId_NotEqual(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_NES, deliveryCourseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GT, deliveryCourseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LT, deliveryCourseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GE, deliveryCourseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LE, deliveryCourseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param minNumber The min number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliveryCourseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseIdList The collection of deliveryCourseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_InScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_INS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseIdList The collection of deliveryCourseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_NotInScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_NINS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIVERY_COURSE_ID from m_delivery_course where ...)} <br />
     * m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param subCBLambda The callback for sub-query of MDeliveryCourse for 'in-scope'. (NotNull)
     */
    public void inScopeMDeliveryCourse(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(cb.query());
        registerInScopeRelation(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mDeliveryCourse", false);
    }
    public abstract String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIVERY_COURSE_ID from m_delivery_course where ...)} <br />
     * m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param subCBLambda The callback for sub-query of MDeliveryCourse for 'not in-scope'. (NotNull)
     */
    public void notInScopeMDeliveryCourse(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(cb.query());
        registerInScopeRelation(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mDeliveryCourse", true);
    }
    public abstract String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     */
    public void setDeliveryCourseId_IsNull() { regDeliveryCourseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     */
    public void setDeliveryCourseId_IsNotNull() { regDeliveryCourseId(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_Equal(String deliveryCourseCd) {
        doSetDeliveryCourseCd_Equal(fRES(deliveryCourseCd));
    }

    protected void doSetDeliveryCourseCd_Equal(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_EQ, deliveryCourseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_NotEqual(String deliveryCourseCd) {
        doSetDeliveryCourseCd_NotEqual(fRES(deliveryCourseCd));
    }

    protected void doSetDeliveryCourseCd_NotEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_NES, deliveryCourseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GT, fRES(deliveryCourseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LT, fRES(deliveryCourseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GE, fRES(deliveryCourseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LE, fRES(deliveryCourseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCdList The collection of deliveryCourseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_InScope(Collection<String> deliveryCourseCdList) {
        doSetDeliveryCourseCd_InScope(deliveryCourseCdList);
    }

    protected void doSetDeliveryCourseCd_InScope(Collection<String> deliveryCourseCdList) {
        regINS(CK_INS, cTL(deliveryCourseCdList), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCdList The collection of deliveryCourseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_NotInScope(Collection<String> deliveryCourseCdList) {
        doSetDeliveryCourseCd_NotInScope(deliveryCourseCdList);
    }

    protected void doSetDeliveryCourseCd_NotInScope(Collection<String> deliveryCourseCdList) {
        regINS(CK_NINS, cTL(deliveryCourseCdList), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setDeliveryCourseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryCourseCd The value of deliveryCourseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryCourseCd_LikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCourseCd_NotLikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_PrefixSearch(String deliveryCourseCd) {
        setDeliveryCourseCd_LikeSearch(deliveryCourseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     */
    public void setDeliveryCourseCd_IsNull() { regDeliveryCourseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     */
    public void setDeliveryCourseCd_IsNullOrEmpty() { regDeliveryCourseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     */
    public void setDeliveryCourseCd_IsNotNull() { regDeliveryCourseCd(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlg The value of emergencyFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_Equal(String emergencyFlg) {
        doSetEmergencyFlg_Equal(fRES(emergencyFlg));
    }

    /**
     * Equal(=). As EmergencyFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg cdef) {
        doSetEmergencyFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setEmergencyFlg_Equal_$0() {
        setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_Equal_$1() {
        setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

    protected void doSetEmergencyFlg_Equal(String emergencyFlg) {
        regEmergencyFlg(CK_EQ, emergencyFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlg The value of emergencyFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotEqual(String emergencyFlg) {
        doSetEmergencyFlg_NotEqual(fRES(emergencyFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As EmergencyFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg cdef) {
        doSetEmergencyFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setEmergencyFlg_NotEqual_$0() {
        setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_NotEqual_$1() {
        setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

    protected void doSetEmergencyFlg_NotEqual(String emergencyFlg) {
        regEmergencyFlg(CK_NES, emergencyFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlgList The collection of emergencyFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_InScope(Collection<String> emergencyFlgList) {
        doSetEmergencyFlg_InScope(emergencyFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As EmergencyFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_InScope_AsEmergencyFlg(Collection<CDef.EmergencyFlg> cdefList) {
        doSetEmergencyFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetEmergencyFlg_InScope(Collection<String> emergencyFlgList) {
        regINS(CK_INS, cTL(emergencyFlgList), xgetCValueEmergencyFlg(), "EMERGENCY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlgList The collection of emergencyFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotInScope(Collection<String> emergencyFlgList) {
        doSetEmergencyFlg_NotInScope(emergencyFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As EmergencyFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotInScope_AsEmergencyFlg(Collection<CDef.EmergencyFlg> cdefList) {
        doSetEmergencyFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetEmergencyFlg_NotInScope(Collection<String> emergencyFlgList) {
        regINS(CK_NINS, cTL(emergencyFlgList), xgetCValueEmergencyFlg(), "EMERGENCY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     */
    public void setEmergencyFlg_IsNull() { regEmergencyFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     */
    public void setEmergencyFlg_IsNullOrEmpty() { regEmergencyFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     */
    public void setEmergencyFlg_IsNotNull() { regEmergencyFlg(CK_ISNN, DOBJ); }

    protected void regEmergencyFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmergencyFlg(), "EMERGENCY_FLG"); }
    protected abstract ConditionValue xgetCValueEmergencyFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_Equal(String pickingWorkMessage) {
        doSetPickingWorkMessage_Equal(fRES(pickingWorkMessage));
    }

    protected void doSetPickingWorkMessage_Equal(String pickingWorkMessage) {
        regPickingWorkMessage(CK_EQ, pickingWorkMessage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_NotEqual(String pickingWorkMessage) {
        doSetPickingWorkMessage_NotEqual(fRES(pickingWorkMessage));
    }

    protected void doSetPickingWorkMessage_NotEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_NES, pickingWorkMessage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_GreaterThan(String pickingWorkMessage) {
        regPickingWorkMessage(CK_GT, fRES(pickingWorkMessage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_LessThan(String pickingWorkMessage) {
        regPickingWorkMessage(CK_LT, fRES(pickingWorkMessage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_GreaterEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_GE, fRES(pickingWorkMessage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_LessEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_LE, fRES(pickingWorkMessage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessageList The collection of pickingWorkMessage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_InScope(Collection<String> pickingWorkMessageList) {
        doSetPickingWorkMessage_InScope(pickingWorkMessageList);
    }

    protected void doSetPickingWorkMessage_InScope(Collection<String> pickingWorkMessageList) {
        regINS(CK_INS, cTL(pickingWorkMessageList), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessageList The collection of pickingWorkMessage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_NotInScope(Collection<String> pickingWorkMessageList) {
        doSetPickingWorkMessage_NotInScope(pickingWorkMessageList);
    }

    protected void doSetPickingWorkMessage_NotInScope(Collection<String> pickingWorkMessageList) {
        regINS(CK_NINS, cTL(pickingWorkMessageList), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * <pre>e.g. setPickingWorkMessage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingWorkMessage The value of pickingWorkMessage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingWorkMessage_LikeSearch(String pickingWorkMessage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingWorkMessage), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingWorkMessage_NotLikeSearch(String pickingWorkMessage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingWorkMessage), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_PrefixSearch(String pickingWorkMessage) {
        setPickingWorkMessage_LikeSearch(pickingWorkMessage, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     */
    public void setPickingWorkMessage_IsNull() { regPickingWorkMessage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     */
    public void setPickingWorkMessage_IsNullOrEmpty() { regPickingWorkMessage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     */
    public void setPickingWorkMessage_IsNotNull() { regPickingWorkMessage(CK_ISNN, DOBJ); }

    protected void regPickingWorkMessage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE"); }
    protected abstract ConditionValue xgetCValuePickingWorkMessage();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_Equal(String pickingBatchNo) {
        doSetPickingBatchNo_Equal(fRES(pickingBatchNo));
    }

    protected void doSetPickingBatchNo_Equal(String pickingBatchNo) {
        regPickingBatchNo(CK_EQ, pickingBatchNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_NotEqual(String pickingBatchNo) {
        doSetPickingBatchNo_NotEqual(fRES(pickingBatchNo));
    }

    protected void doSetPickingBatchNo_NotEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_NES, pickingBatchNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_GreaterThan(String pickingBatchNo) {
        regPickingBatchNo(CK_GT, fRES(pickingBatchNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_LessThan(String pickingBatchNo) {
        regPickingBatchNo(CK_LT, fRES(pickingBatchNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_GreaterEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_GE, fRES(pickingBatchNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_LessEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_LE, fRES(pickingBatchNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNoList The collection of pickingBatchNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_InScope(Collection<String> pickingBatchNoList) {
        doSetPickingBatchNo_InScope(pickingBatchNoList);
    }

    protected void doSetPickingBatchNo_InScope(Collection<String> pickingBatchNoList) {
        regINS(CK_INS, cTL(pickingBatchNoList), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNoList The collection of pickingBatchNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_NotInScope(Collection<String> pickingBatchNoList) {
        doSetPickingBatchNo_NotInScope(pickingBatchNoList);
    }

    protected void doSetPickingBatchNo_NotInScope(Collection<String> pickingBatchNoList) {
        regINS(CK_NINS, cTL(pickingBatchNoList), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setPickingBatchNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingBatchNo The value of pickingBatchNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingBatchNo_LikeSearch(String pickingBatchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingBatchNo), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingBatchNo_NotLikeSearch(String pickingBatchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingBatchNo), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_PrefixSearch(String pickingBatchNo) {
        setPickingBatchNo_LikeSearch(pickingBatchNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     */
    public void setPickingBatchNo_IsNull() { regPickingBatchNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     */
    public void setPickingBatchNo_IsNullOrEmpty() { regPickingBatchNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     */
    public void setPickingBatchNo_IsNotNull() { regPickingBatchNo(CK_ISNN, DOBJ); }

    protected void regPickingBatchNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingBatchNo(), "PICKING_BATCH_NO"); }
    protected abstract ConditionValue xgetCValuePickingBatchNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     * @param stockOutFlg The value of stockOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_Equal(String stockOutFlg) {
        doSetStockOutFlg_Equal(fRES(stockOutFlg));
    }

    /**
     * Equal(=). As StockOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutFlg_Equal_AsStockOutFlg(CDef.StockOutFlg cdef) {
        doSetStockOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 欠品無
     */
    public void setStockOutFlg_Equal_$0() {
        setStockOutFlg_Equal_AsStockOutFlg(CDef.StockOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 欠品有
     */
    public void setStockOutFlg_Equal_$1() {
        setStockOutFlg_Equal_AsStockOutFlg(CDef.StockOutFlg.$1);
    }

    protected void doSetStockOutFlg_Equal(String stockOutFlg) {
        regStockOutFlg(CK_EQ, stockOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     * @param stockOutFlg The value of stockOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_NotEqual(String stockOutFlg) {
        doSetStockOutFlg_NotEqual(fRES(stockOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StockOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStockOutFlg_NotEqual_AsStockOutFlg(CDef.StockOutFlg cdef) {
        doSetStockOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 欠品無
     */
    public void setStockOutFlg_NotEqual_$0() {
        setStockOutFlg_NotEqual_AsStockOutFlg(CDef.StockOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 欠品有
     */
    public void setStockOutFlg_NotEqual_$1() {
        setStockOutFlg_NotEqual_AsStockOutFlg(CDef.StockOutFlg.$1);
    }

    protected void doSetStockOutFlg_NotEqual(String stockOutFlg) {
        regStockOutFlg(CK_NES, stockOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     * @param stockOutFlgList The collection of stockOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_InScope(Collection<String> stockOutFlgList) {
        doSetStockOutFlg_InScope(stockOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StockOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_InScope_AsStockOutFlg(Collection<CDef.StockOutFlg> cdefList) {
        doSetStockOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStockOutFlg_InScope(Collection<String> stockOutFlgList) {
        regINS(CK_INS, cTL(stockOutFlgList), xgetCValueStockOutFlg(), "STOCK_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     * @param stockOutFlgList The collection of stockOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_NotInScope(Collection<String> stockOutFlgList) {
        doSetStockOutFlg_NotInScope(stockOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StockOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_NotInScope_AsStockOutFlg(Collection<CDef.StockOutFlg> cdefList) {
        doSetStockOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStockOutFlg_NotInScope(Collection<String> stockOutFlgList) {
        regINS(CK_NINS, cTL(stockOutFlgList), xgetCValueStockOutFlg(), "STOCK_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     */
    public void setStockOutFlg_IsNull() { regStockOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     */
    public void setStockOutFlg_IsNullOrEmpty() { regStockOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     */
    public void setStockOutFlg_IsNotNull() { regStockOutFlg(CK_ISNN, DOBJ); }

    protected void regStockOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockOutFlg(), "STOCK_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueStockOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param allocInstHId The value of allocInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_Equal(Long allocInstHId) {
        doSetAllocInstHId_Equal(allocInstHId);
    }

    protected void doSetAllocInstHId_Equal(Long allocInstHId) {
        regAllocInstHId(CK_EQ, allocInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param allocInstHId The value of allocInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotEqual(Long allocInstHId) {
        doSetAllocInstHId_NotEqual(allocInstHId);
    }

    protected void doSetAllocInstHId_NotEqual(Long allocInstHId) {
        regAllocInstHId(CK_NES, allocInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param allocInstHId The value of allocInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterThan(Long allocInstHId) {
        regAllocInstHId(CK_GT, allocInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param allocInstHId The value of allocInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessThan(Long allocInstHId) {
        regAllocInstHId(CK_LT, allocInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param allocInstHId The value of allocInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterEqual(Long allocInstHId) {
        regAllocInstHId(CK_GE, allocInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param allocInstHId The value of allocInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessEqual(Long allocInstHId) {
        regAllocInstHId(CK_LE, allocInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param minNumber The min number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param allocInstHIdList The collection of allocInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_InScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        regINS(CK_INS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @param allocInstHIdList The collection of allocInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_NotInScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        regINS(CK_NINS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ALLOC_INST_H_ID from t_alloc_inst_h where ...)} <br />
     * t_alloc_inst_h by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @param subCBLambda The callback for sub-query of TAllocInstH for 'in-scope'. (NotNull)
     */
    public void inScopeTAllocInstH(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstHId_InScopeRelation_TAllocInstH(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstH", false);
    }
    public abstract String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ALLOC_INST_H_ID from t_alloc_inst_h where ...)} <br />
     * t_alloc_inst_h by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @param subCBLambda The callback for sub-query of TAllocInstH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTAllocInstH(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstHId_NotInScopeRelation_TAllocInstH(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstH", true);
    }
    public abstract String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     */
    public void setAllocInstHId_IsNull() { regAllocInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     */
    public void setAllocInstHId_IsNotNull() { regAllocInstHId(CK_ISNN, DOBJ); }

    protected void regAllocInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_Equal(Long cod) {
        doSetCod_Equal(cod);
    }

    protected void doSetCod_Equal(Long cod) {
        regCod(CK_EQ, cod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_NotEqual(Long cod) {
        doSetCod_NotEqual(cod);
    }

    protected void doSetCod_NotEqual(Long cod) {
        regCod(CK_NES, cod);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_GreaterThan(Long cod) {
        regCod(CK_GT, cod);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_LessThan(Long cod) {
        regCod(CK_LT, cod);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_GreaterEqual(Long cod) {
        regCod(CK_GE, cod);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_LessEqual(Long cod) {
        regCod(CK_LE, cod);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param minNumber The min number of cod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCod_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCod(), "COD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD: {BIGINT(19)}
     * @param codList The collection of cod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCod_InScope(Collection<Long> codList) {
        doSetCod_InScope(codList);
    }

    protected void doSetCod_InScope(Collection<Long> codList) {
        regINS(CK_INS, cTL(codList), xgetCValueCod(), "COD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD: {BIGINT(19)}
     * @param codList The collection of cod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCod_NotInScope(Collection<Long> codList) {
        doSetCod_NotInScope(codList);
    }

    protected void doSetCod_NotInScope(Collection<Long> codList) {
        regINS(CK_NINS, cTL(codList), xgetCValueCod(), "COD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     */
    public void setCod_IsNull() { regCod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     */
    public void setCod_IsNotNull() { regCod(CK_ISNN, DOBJ); }

    protected void regCod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCod(), "COD"); }
    protected abstract ConditionValue xgetCValueCod();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_Equal(Long codTax) {
        doSetCodTax_Equal(codTax);
    }

    protected void doSetCodTax_Equal(Long codTax) {
        regCodTax(CK_EQ, codTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_NotEqual(Long codTax) {
        doSetCodTax_NotEqual(codTax);
    }

    protected void doSetCodTax_NotEqual(Long codTax) {
        regCodTax(CK_NES, codTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_GreaterThan(Long codTax) {
        regCodTax(CK_GT, codTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_LessThan(Long codTax) {
        regCodTax(CK_LT, codTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_GreaterEqual(Long codTax) {
        regCodTax(CK_GE, codTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_LessEqual(Long codTax) {
        regCodTax(CK_LE, codTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param minNumber The min number of codTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of codTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCodTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCodTax(), "COD_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTaxList The collection of codTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodTax_InScope(Collection<Long> codTaxList) {
        doSetCodTax_InScope(codTaxList);
    }

    protected void doSetCodTax_InScope(Collection<Long> codTaxList) {
        regINS(CK_INS, cTL(codTaxList), xgetCValueCodTax(), "COD_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTaxList The collection of codTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodTax_NotInScope(Collection<Long> codTaxList) {
        doSetCodTax_NotInScope(codTaxList);
    }

    protected void doSetCodTax_NotInScope(Collection<Long> codTaxList) {
        regINS(CK_NINS, cTL(codTaxList), xgetCValueCodTax(), "COD_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     */
    public void setCodTax_IsNull() { regCodTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     */
    public void setCodTax_IsNotNull() { regCodTax(CK_ISNN, DOBJ); }

    protected void regCodTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodTax(), "COD_TAX"); }
    protected abstract ConditionValue xgetCValueCodTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_Equal(java.math.BigDecimal totalPrice) {
        doSetTotalPrice_Equal(totalPrice);
    }

    protected void doSetTotalPrice_Equal(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_EQ, totalPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_NotEqual(java.math.BigDecimal totalPrice) {
        doSetTotalPrice_NotEqual(totalPrice);
    }

    protected void doSetTotalPrice_NotEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_NES, totalPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterThan(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_GT, totalPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_LessThan(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_LT, totalPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_GE, totalPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_LessEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_LE, totalPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param minNumber The min number of totalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalPrice_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalPrice(), "TOTAL_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPriceList The collection of totalPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_InScope(Collection<java.math.BigDecimal> totalPriceList) {
        doSetTotalPrice_InScope(totalPriceList);
    }

    protected void doSetTotalPrice_InScope(Collection<java.math.BigDecimal> totalPriceList) {
        regINS(CK_INS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPriceList The collection of totalPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_NotInScope(Collection<java.math.BigDecimal> totalPriceList) {
        doSetTotalPrice_NotInScope(totalPriceList);
    }

    protected void doSetTotalPrice_NotInScope(Collection<java.math.BigDecimal> totalPriceList) {
        regINS(CK_NINS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     */
    public void setTotalPrice_IsNull() { regTotalPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     */
    public void setTotalPrice_IsNotNull() { regTotalPrice(CK_ISNN, DOBJ); }

    protected void regTotalPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalPrice(), "TOTAL_PRICE"); }
    protected abstract ConditionValue xgetCValueTotalPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_Equal(java.math.BigDecimal totalTax) {
        doSetTotalTax_Equal(totalTax);
    }

    protected void doSetTotalTax_Equal(java.math.BigDecimal totalTax) {
        regTotalTax(CK_EQ, totalTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_NotEqual(java.math.BigDecimal totalTax) {
        doSetTotalTax_NotEqual(totalTax);
    }

    protected void doSetTotalTax_NotEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_NES, totalTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_GreaterThan(java.math.BigDecimal totalTax) {
        regTotalTax(CK_GT, totalTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_LessThan(java.math.BigDecimal totalTax) {
        regTotalTax(CK_LT, totalTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_GreaterEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_GE, totalTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_LessEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_LE, totalTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param minNumber The min number of totalTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalTax_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalTax(), "TOTAL_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTaxList The collection of totalTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalTax_InScope(Collection<java.math.BigDecimal> totalTaxList) {
        doSetTotalTax_InScope(totalTaxList);
    }

    protected void doSetTotalTax_InScope(Collection<java.math.BigDecimal> totalTaxList) {
        regINS(CK_INS, cTL(totalTaxList), xgetCValueTotalTax(), "TOTAL_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTaxList The collection of totalTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalTax_NotInScope(Collection<java.math.BigDecimal> totalTaxList) {
        doSetTotalTax_NotInScope(totalTaxList);
    }

    protected void doSetTotalTax_NotInScope(Collection<java.math.BigDecimal> totalTaxList) {
        regINS(CK_NINS, cTL(totalTaxList), xgetCValueTotalTax(), "TOTAL_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     */
    public void setTotalTax_IsNull() { regTotalTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     */
    public void setTotalTax_IsNotNull() { regTotalTax(CK_ISNN, DOBJ); }

    protected void regTotalTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalTax(), "TOTAL_TAX"); }
    protected abstract ConditionValue xgetCValueTotalTax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_Equal(String nizoroeNo) {
        doSetNizoroeNo_Equal(fRES(nizoroeNo));
    }

    protected void doSetNizoroeNo_Equal(String nizoroeNo) {
        regNizoroeNo(CK_EQ, nizoroeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_NotEqual(String nizoroeNo) {
        doSetNizoroeNo_NotEqual(fRES(nizoroeNo));
    }

    protected void doSetNizoroeNo_NotEqual(String nizoroeNo) {
        regNizoroeNo(CK_NES, nizoroeNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_GreaterThan(String nizoroeNo) {
        regNizoroeNo(CK_GT, fRES(nizoroeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_LessThan(String nizoroeNo) {
        regNizoroeNo(CK_LT, fRES(nizoroeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_GreaterEqual(String nizoroeNo) {
        regNizoroeNo(CK_GE, fRES(nizoroeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_LessEqual(String nizoroeNo) {
        regNizoroeNo(CK_LE, fRES(nizoroeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNoList The collection of nizoroeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_InScope(Collection<String> nizoroeNoList) {
        doSetNizoroeNo_InScope(nizoroeNoList);
    }

    protected void doSetNizoroeNo_InScope(Collection<String> nizoroeNoList) {
        regINS(CK_INS, cTL(nizoroeNoList), xgetCValueNizoroeNo(), "NIZOROE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNoList The collection of nizoroeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_NotInScope(Collection<String> nizoroeNoList) {
        doSetNizoroeNo_NotInScope(nizoroeNoList);
    }

    protected void doSetNizoroeNo_NotInScope(Collection<String> nizoroeNoList) {
        regINS(CK_NINS, cTL(nizoroeNoList), xgetCValueNizoroeNo(), "NIZOROE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeNo The value of nizoroeNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeNo_LikeSearch(String nizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeNo), xgetCValueNizoroeNo(), "NIZOROE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeNo_NotLikeSearch(String nizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeNo), xgetCValueNizoroeNo(), "NIZOROE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_PrefixSearch(String nizoroeNo) {
        setNizoroeNo_LikeSearch(nizoroeNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNull() { regNizoroeNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNullOrEmpty() { regNizoroeNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNotNull() { regNizoroeNo(CK_ISNN, DOBJ); }

    protected void regNizoroeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeNo(), "NIZOROE_NO"); }
    protected abstract ConditionValue xgetCValueNizoroeNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_Equal(String daihyoNizoroeNo) {
        doSetDaihyoNizoroeNo_Equal(fRES(daihyoNizoroeNo));
    }

    protected void doSetDaihyoNizoroeNo_Equal(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_EQ, daihyoNizoroeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_NotEqual(String daihyoNizoroeNo) {
        doSetDaihyoNizoroeNo_NotEqual(fRES(daihyoNizoroeNo));
    }

    protected void doSetDaihyoNizoroeNo_NotEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_NES, daihyoNizoroeNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_GreaterThan(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_GT, fRES(daihyoNizoroeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_LessThan(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_LT, fRES(daihyoNizoroeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_GreaterEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_GE, fRES(daihyoNizoroeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_LessEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_LE, fRES(daihyoNizoroeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNoList The collection of daihyoNizoroeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_InScope(Collection<String> daihyoNizoroeNoList) {
        doSetDaihyoNizoroeNo_InScope(daihyoNizoroeNoList);
    }

    protected void doSetDaihyoNizoroeNo_InScope(Collection<String> daihyoNizoroeNoList) {
        regINS(CK_INS, cTL(daihyoNizoroeNoList), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNoList The collection of daihyoNizoroeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_NotInScope(Collection<String> daihyoNizoroeNoList) {
        doSetDaihyoNizoroeNo_NotInScope(daihyoNizoroeNoList);
    }

    protected void doSetDaihyoNizoroeNo_NotInScope(Collection<String> daihyoNizoroeNoList) {
        regINS(CK_NINS, cTL(daihyoNizoroeNoList), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setDaihyoNizoroeNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo_LikeSearch(String daihyoNizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(daihyoNizoroeNo), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo_NotLikeSearch(String daihyoNizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(daihyoNizoroeNo), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_PrefixSearch(String daihyoNizoroeNo) {
        setDaihyoNizoroeNo_LikeSearch(daihyoNizoroeNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNull() { regDaihyoNizoroeNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNullOrEmpty() { regDaihyoNizoroeNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNotNull() { regDaihyoNizoroeNo(CK_ISNN, DOBJ); }

    protected void regDaihyoNizoroeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO"); }
    protected abstract ConditionValue xgetCValueDaihyoNizoroeNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_Equal(String nizoroeNo2) {
        doSetNizoroeNo2_Equal(fRES(nizoroeNo2));
    }

    protected void doSetNizoroeNo2_Equal(String nizoroeNo2) {
        regNizoroeNo2(CK_EQ, nizoroeNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_NotEqual(String nizoroeNo2) {
        doSetNizoroeNo2_NotEqual(fRES(nizoroeNo2));
    }

    protected void doSetNizoroeNo2_NotEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_NES, nizoroeNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_GreaterThan(String nizoroeNo2) {
        regNizoroeNo2(CK_GT, fRES(nizoroeNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_LessThan(String nizoroeNo2) {
        regNizoroeNo2(CK_LT, fRES(nizoroeNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_GreaterEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_GE, fRES(nizoroeNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_LessEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_LE, fRES(nizoroeNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2List The collection of nizoroeNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_InScope(Collection<String> nizoroeNo2List) {
        doSetNizoroeNo2_InScope(nizoroeNo2List);
    }

    protected void doSetNizoroeNo2_InScope(Collection<String> nizoroeNo2List) {
        regINS(CK_INS, cTL(nizoroeNo2List), xgetCValueNizoroeNo2(), "NIZOROE_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2List The collection of nizoroeNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_NotInScope(Collection<String> nizoroeNo2List) {
        doSetNizoroeNo2_NotInScope(nizoroeNo2List);
    }

    protected void doSetNizoroeNo2_NotInScope(Collection<String> nizoroeNo2List) {
        regINS(CK_NINS, cTL(nizoroeNo2List), xgetCValueNizoroeNo2(), "NIZOROE_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeNo2 The value of nizoroeNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeNo2_LikeSearch(String nizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeNo2), xgetCValueNizoroeNo2(), "NIZOROE_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeNo2_NotLikeSearch(String nizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeNo2), xgetCValueNizoroeNo2(), "NIZOROE_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_PrefixSearch(String nizoroeNo2) {
        setNizoroeNo2_LikeSearch(nizoroeNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNull() { regNizoroeNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNullOrEmpty() { regNizoroeNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNotNull() { regNizoroeNo2(CK_ISNN, DOBJ); }

    protected void regNizoroeNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeNo2(), "NIZOROE_NO2"); }
    protected abstract ConditionValue xgetCValueNizoroeNo2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_Equal(String daihyoNizoroeNo2) {
        doSetDaihyoNizoroeNo2_Equal(fRES(daihyoNizoroeNo2));
    }

    protected void doSetDaihyoNizoroeNo2_Equal(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_EQ, daihyoNizoroeNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_NotEqual(String daihyoNizoroeNo2) {
        doSetDaihyoNizoroeNo2_NotEqual(fRES(daihyoNizoroeNo2));
    }

    protected void doSetDaihyoNizoroeNo2_NotEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_NES, daihyoNizoroeNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_GreaterThan(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_GT, fRES(daihyoNizoroeNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_LessThan(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_LT, fRES(daihyoNizoroeNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_GreaterEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_GE, fRES(daihyoNizoroeNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_LessEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_LE, fRES(daihyoNizoroeNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2List The collection of daihyoNizoroeNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_InScope(Collection<String> daihyoNizoroeNo2List) {
        doSetDaihyoNizoroeNo2_InScope(daihyoNizoroeNo2List);
    }

    protected void doSetDaihyoNizoroeNo2_InScope(Collection<String> daihyoNizoroeNo2List) {
        regINS(CK_INS, cTL(daihyoNizoroeNo2List), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2List The collection of daihyoNizoroeNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_NotInScope(Collection<String> daihyoNizoroeNo2List) {
        doSetDaihyoNizoroeNo2_NotInScope(daihyoNizoroeNo2List);
    }

    protected void doSetDaihyoNizoroeNo2_NotInScope(Collection<String> daihyoNizoroeNo2List) {
        regINS(CK_NINS, cTL(daihyoNizoroeNo2List), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * <pre>e.g. setDaihyoNizoroeNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo2_LikeSearch(String daihyoNizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(daihyoNizoroeNo2), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo2_NotLikeSearch(String daihyoNizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(daihyoNizoroeNo2), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_PrefixSearch(String daihyoNizoroeNo2) {
        setDaihyoNizoroeNo2_LikeSearch(daihyoNizoroeNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNull() { regDaihyoNizoroeNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNullOrEmpty() { regDaihyoNizoroeNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNotNull() { regDaihyoNizoroeNo2(CK_ISNN, DOBJ); }

    protected void regDaihyoNizoroeNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2"); }
    protected abstract ConditionValue xgetCValueDaihyoNizoroeNo2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_Equal(Long shippingTypeId) {
        doSetShippingTypeId_Equal(shippingTypeId);
    }

    protected void doSetShippingTypeId_Equal(Long shippingTypeId) {
        regShippingTypeId(CK_EQ, shippingTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_NotEqual(Long shippingTypeId) {
        doSetShippingTypeId_NotEqual(shippingTypeId);
    }

    protected void doSetShippingTypeId_NotEqual(Long shippingTypeId) {
        regShippingTypeId(CK_NES, shippingTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_GreaterThan(Long shippingTypeId) {
        regShippingTypeId(CK_GT, shippingTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_LessThan(Long shippingTypeId) {
        regShippingTypeId(CK_LT, shippingTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_GreaterEqual(Long shippingTypeId) {
        regShippingTypeId(CK_GE, shippingTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_LessEqual(Long shippingTypeId) {
        regShippingTypeId(CK_LE, shippingTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param minNumber The min number of shippingTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingTypeId(), "SHIPPING_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeIdList The collection of shippingTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeId_InScope(Collection<Long> shippingTypeIdList) {
        doSetShippingTypeId_InScope(shippingTypeIdList);
    }

    protected void doSetShippingTypeId_InScope(Collection<Long> shippingTypeIdList) {
        regINS(CK_INS, cTL(shippingTypeIdList), xgetCValueShippingTypeId(), "SHIPPING_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeIdList The collection of shippingTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeId_NotInScope(Collection<Long> shippingTypeIdList) {
        doSetShippingTypeId_NotInScope(shippingTypeIdList);
    }

    protected void doSetShippingTypeId_NotInScope(Collection<Long> shippingTypeIdList) {
        regINS(CK_NINS, cTL(shippingTypeIdList), xgetCValueShippingTypeId(), "SHIPPING_TYPE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     */
    public void setShippingTypeId_IsNull() { regShippingTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     */
    public void setShippingTypeId_IsNotNull() { regShippingTypeId(CK_ISNN, DOBJ); }

    protected void regShippingTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingTypeId(), "SHIPPING_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueShippingTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_Equal(String shippingTypeCd) {
        doSetShippingTypeCd_Equal(fRES(shippingTypeCd));
    }

    protected void doSetShippingTypeCd_Equal(String shippingTypeCd) {
        regShippingTypeCd(CK_EQ, shippingTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_NotEqual(String shippingTypeCd) {
        doSetShippingTypeCd_NotEqual(fRES(shippingTypeCd));
    }

    protected void doSetShippingTypeCd_NotEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_NES, shippingTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_GreaterThan(String shippingTypeCd) {
        regShippingTypeCd(CK_GT, fRES(shippingTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_LessThan(String shippingTypeCd) {
        regShippingTypeCd(CK_LT, fRES(shippingTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_GreaterEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_GE, fRES(shippingTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_LessEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_LE, fRES(shippingTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCdList The collection of shippingTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_InScope(Collection<String> shippingTypeCdList) {
        doSetShippingTypeCd_InScope(shippingTypeCdList);
    }

    protected void doSetShippingTypeCd_InScope(Collection<String> shippingTypeCdList) {
        regINS(CK_INS, cTL(shippingTypeCdList), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCdList The collection of shippingTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_NotInScope(Collection<String> shippingTypeCdList) {
        doSetShippingTypeCd_NotInScope(shippingTypeCdList);
    }

    protected void doSetShippingTypeCd_NotInScope(Collection<String> shippingTypeCdList) {
        regINS(CK_NINS, cTL(shippingTypeCdList), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingTypeCd The value of shippingTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingTypeCd_LikeSearch(String shippingTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingTypeCd), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingTypeCd_NotLikeSearch(String shippingTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingTypeCd), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_PrefixSearch(String shippingTypeCd) {
        setShippingTypeCd_LikeSearch(shippingTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNull() { regShippingTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNullOrEmpty() { regShippingTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNotNull() { regShippingTypeCd(CK_ISNN, DOBJ); }

    protected void regShippingTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueShippingTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierId The value of carrierId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_Equal(String carrierId) {
        doSetCarrierId_Equal(fRES(carrierId));
    }

    protected void doSetCarrierId_Equal(String carrierId) {
        regCarrierId(CK_EQ, carrierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierId The value of carrierId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_NotEqual(String carrierId) {
        doSetCarrierId_NotEqual(fRES(carrierId));
    }

    protected void doSetCarrierId_NotEqual(String carrierId) {
        regCarrierId(CK_NES, carrierId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierId The value of carrierId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterThan(String carrierId) {
        regCarrierId(CK_GT, fRES(carrierId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierId The value of carrierId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_LessThan(String carrierId) {
        regCarrierId(CK_LT, fRES(carrierId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierId The value of carrierId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterEqual(String carrierId) {
        regCarrierId(CK_GE, fRES(carrierId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierId The value of carrierId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_LessEqual(String carrierId) {
        regCarrierId(CK_LE, fRES(carrierId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierIdList The collection of carrierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_InScope(Collection<String> carrierIdList) {
        doSetCarrierId_InScope(carrierIdList);
    }

    protected void doSetCarrierId_InScope(Collection<String> carrierIdList) {
        regINS(CK_INS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierIdList The collection of carrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_NotInScope(Collection<String> carrierIdList) {
        doSetCarrierId_NotInScope(carrierIdList);
    }

    protected void doSetCarrierId_NotInScope(Collection<String> carrierIdList) {
        regINS(CK_NINS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierId The value of carrierId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierId_LikeSearch(String carrierId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierId), xgetCValueCarrierId(), "CARRIER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierId The value of carrierId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierId_NotLikeSearch(String carrierId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierId), xgetCValueCarrierId(), "CARRIER_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @param carrierId The value of carrierId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_PrefixSearch(String carrierId) {
        setCarrierId_LikeSearch(carrierId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     */
    public void setCarrierId_IsNull() { regCarrierId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     */
    public void setCarrierId_IsNullOrEmpty() { regCarrierId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {VARCHAR(30)}
     */
    public void setCarrierId_IsNotNull() { regCarrierId(CK_ISNN, DOBJ); }

    protected void regCarrierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierId(), "CARRIER_ID"); }
    protected abstract ConditionValue xgetCValueCarrierId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_Equal(String carrierCd) {
        doSetCarrierCd_Equal(fRES(carrierCd));
    }

    protected void doSetCarrierCd_Equal(String carrierCd) {
        regCarrierCd(CK_EQ, carrierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_NotEqual(String carrierCd) {
        doSetCarrierCd_NotEqual(fRES(carrierCd));
    }

    protected void doSetCarrierCd_NotEqual(String carrierCd) {
        regCarrierCd(CK_NES, carrierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterThan(String carrierCd) {
        regCarrierCd(CK_GT, fRES(carrierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessThan(String carrierCd) {
        regCarrierCd(CK_LT, fRES(carrierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterEqual(String carrierCd) {
        regCarrierCd(CK_GE, fRES(carrierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessEqual(String carrierCd) {
        regCarrierCd(CK_LE, fRES(carrierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCdList The collection of carrierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_InScope(Collection<String> carrierCdList) {
        doSetCarrierCd_InScope(carrierCdList);
    }

    protected void doSetCarrierCd_InScope(Collection<String> carrierCdList) {
        regINS(CK_INS, cTL(carrierCdList), xgetCValueCarrierCd(), "CARRIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCdList The collection of carrierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_NotInScope(Collection<String> carrierCdList) {
        doSetCarrierCd_NotInScope(carrierCdList);
    }

    protected void doSetCarrierCd_NotInScope(Collection<String> carrierCdList) {
        regINS(CK_NINS, cTL(carrierCdList), xgetCValueCarrierCd(), "CARRIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierCd The value of carrierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierCd_LikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd_NotLikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_PrefixSearch(String carrierCd) {
        setCarrierCd_LikeSearch(carrierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     */
    public void setCarrierCd_IsNull() { regCarrierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     */
    public void setCarrierCd_IsNullOrEmpty() { regCarrierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     */
    public void setCarrierCd_IsNotNull() { regCarrierCd(CK_ISNN, DOBJ); }

    protected void regCarrierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd(), "CARRIER_CD"); }
    protected abstract ConditionValue xgetCValueCarrierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_Equal(String salesOrgCd) {
        doSetSalesOrgCd_Equal(fRES(salesOrgCd));
    }

    protected void doSetSalesOrgCd_Equal(String salesOrgCd) {
        regSalesOrgCd(CK_EQ, salesOrgCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_NotEqual(String salesOrgCd) {
        doSetSalesOrgCd_NotEqual(fRES(salesOrgCd));
    }

    protected void doSetSalesOrgCd_NotEqual(String salesOrgCd) {
        regSalesOrgCd(CK_NES, salesOrgCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterThan(String salesOrgCd) {
        regSalesOrgCd(CK_GT, fRES(salesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessThan(String salesOrgCd) {
        regSalesOrgCd(CK_LT, fRES(salesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterEqual(String salesOrgCd) {
        regSalesOrgCd(CK_GE, fRES(salesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessEqual(String salesOrgCd) {
        regSalesOrgCd(CK_LE, fRES(salesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCdList The collection of salesOrgCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_InScope(Collection<String> salesOrgCdList) {
        doSetSalesOrgCd_InScope(salesOrgCdList);
    }

    protected void doSetSalesOrgCd_InScope(Collection<String> salesOrgCdList) {
        regINS(CK_INS, cTL(salesOrgCdList), xgetCValueSalesOrgCd(), "SALES_ORG_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCdList The collection of salesOrgCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_NotInScope(Collection<String> salesOrgCdList) {
        doSetSalesOrgCd_NotInScope(salesOrgCdList);
    }

    protected void doSetSalesOrgCd_NotInScope(Collection<String> salesOrgCdList) {
        regINS(CK_NINS, cTL(salesOrgCdList), xgetCValueSalesOrgCd(), "SALES_ORG_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrgCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrgCd The value of salesOrgCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrgCd_LikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrgCd_NotLikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_PrefixSearch(String salesOrgCd) {
        setSalesOrgCd_LikeSearch(salesOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNull() { regSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNullOrEmpty() { regSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNotNull() { regSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgCd(), "SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrgCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_Equal(String salesOrderNo) {
        doSetSalesOrderNo_Equal(fRES(salesOrderNo));
    }

    protected void doSetSalesOrderNo_Equal(String salesOrderNo) {
        regSalesOrderNo(CK_EQ, salesOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_NotEqual(String salesOrderNo) {
        doSetSalesOrderNo_NotEqual(fRES(salesOrderNo));
    }

    protected void doSetSalesOrderNo_NotEqual(String salesOrderNo) {
        regSalesOrderNo(CK_NES, salesOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_GreaterThan(String salesOrderNo) {
        regSalesOrderNo(CK_GT, fRES(salesOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_LessThan(String salesOrderNo) {
        regSalesOrderNo(CK_LT, fRES(salesOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_GreaterEqual(String salesOrderNo) {
        regSalesOrderNo(CK_GE, fRES(salesOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_LessEqual(String salesOrderNo) {
        regSalesOrderNo(CK_LE, fRES(salesOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNoList The collection of salesOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_InScope(Collection<String> salesOrderNoList) {
        doSetSalesOrderNo_InScope(salesOrderNoList);
    }

    protected void doSetSalesOrderNo_InScope(Collection<String> salesOrderNoList) {
        regINS(CK_INS, cTL(salesOrderNoList), xgetCValueSalesOrderNo(), "SALES_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNoList The collection of salesOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_NotInScope(Collection<String> salesOrderNoList) {
        doSetSalesOrderNo_NotInScope(salesOrderNoList);
    }

    protected void doSetSalesOrderNo_NotInScope(Collection<String> salesOrderNoList) {
        regINS(CK_NINS, cTL(salesOrderNoList), xgetCValueSalesOrderNo(), "SALES_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrderNo The value of salesOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrderNo_LikeSearch(String salesOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrderNo), xgetCValueSalesOrderNo(), "SALES_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrderNo_NotLikeSearch(String salesOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrderNo), xgetCValueSalesOrderNo(), "SALES_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_PrefixSearch(String salesOrderNo) {
        setSalesOrderNo_LikeSearch(salesOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setSalesOrderNo_IsNull() { regSalesOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setSalesOrderNo_IsNullOrEmpty() { regSalesOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setSalesOrderNo_IsNotNull() { regSalesOrderNo(CK_ISNN, DOBJ); }

    protected void regSalesOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderNo(), "SALES_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueSalesOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_Equal(String salesOrderSlipTypeCd) {
        doSetSalesOrderSlipTypeCd_Equal(fRES(salesOrderSlipTypeCd));
    }

    protected void doSetSalesOrderSlipTypeCd_Equal(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_EQ, salesOrderSlipTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_NotEqual(String salesOrderSlipTypeCd) {
        doSetSalesOrderSlipTypeCd_NotEqual(fRES(salesOrderSlipTypeCd));
    }

    protected void doSetSalesOrderSlipTypeCd_NotEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_NES, salesOrderSlipTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_GreaterThan(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_GT, fRES(salesOrderSlipTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_LessThan(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_LT, fRES(salesOrderSlipTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_GreaterEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_GE, fRES(salesOrderSlipTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_LessEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_LE, fRES(salesOrderSlipTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCdList The collection of salesOrderSlipTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_InScope(Collection<String> salesOrderSlipTypeCdList) {
        doSetSalesOrderSlipTypeCd_InScope(salesOrderSlipTypeCdList);
    }

    protected void doSetSalesOrderSlipTypeCd_InScope(Collection<String> salesOrderSlipTypeCdList) {
        regINS(CK_INS, cTL(salesOrderSlipTypeCdList), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCdList The collection of salesOrderSlipTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_NotInScope(Collection<String> salesOrderSlipTypeCdList) {
        doSetSalesOrderSlipTypeCd_NotInScope(salesOrderSlipTypeCdList);
    }

    protected void doSetSalesOrderSlipTypeCd_NotInScope(Collection<String> salesOrderSlipTypeCdList) {
        regINS(CK_NINS, cTL(salesOrderSlipTypeCdList), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrderSlipTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrderSlipTypeCd_LikeSearch(String salesOrderSlipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrderSlipTypeCd), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrderSlipTypeCd_NotLikeSearch(String salesOrderSlipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrderSlipTypeCd), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_PrefixSearch(String salesOrderSlipTypeCd) {
        setSalesOrderSlipTypeCd_LikeSearch(salesOrderSlipTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNull() { regSalesOrderSlipTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNullOrEmpty() { regSalesOrderSlipTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNotNull() { regSalesOrderSlipTypeCd(CK_ISNN, DOBJ); }

    protected void regSalesOrderSlipTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrderSlipTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_Equal(String salesOrderSlipNo) {
        doSetSalesOrderSlipNo_Equal(fRES(salesOrderSlipNo));
    }

    protected void doSetSalesOrderSlipNo_Equal(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_EQ, salesOrderSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_NotEqual(String salesOrderSlipNo) {
        doSetSalesOrderSlipNo_NotEqual(fRES(salesOrderSlipNo));
    }

    protected void doSetSalesOrderSlipNo_NotEqual(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_NES, salesOrderSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_GreaterThan(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_GT, fRES(salesOrderSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_LessThan(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_LT, fRES(salesOrderSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_GreaterEqual(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_GE, fRES(salesOrderSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_LessEqual(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_LE, fRES(salesOrderSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNoList The collection of salesOrderSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_InScope(Collection<String> salesOrderSlipNoList) {
        doSetSalesOrderSlipNo_InScope(salesOrderSlipNoList);
    }

    protected void doSetSalesOrderSlipNo_InScope(Collection<String> salesOrderSlipNoList) {
        regINS(CK_INS, cTL(salesOrderSlipNoList), xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNoList The collection of salesOrderSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_NotInScope(Collection<String> salesOrderSlipNoList) {
        doSetSalesOrderSlipNo_NotInScope(salesOrderSlipNoList);
    }

    protected void doSetSalesOrderSlipNo_NotInScope(Collection<String> salesOrderSlipNoList) {
        regINS(CK_NINS, cTL(salesOrderSlipNoList), xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrderSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrderSlipNo The value of salesOrderSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrderSlipNo_LikeSearch(String salesOrderSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrderSlipNo), xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrderSlipNo_NotLikeSearch(String salesOrderSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrderSlipNo), xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_PrefixSearch(String salesOrderSlipNo) {
        setSalesOrderSlipNo_LikeSearch(salesOrderSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     */
    public void setSalesOrderSlipNo_IsNull() { regSalesOrderSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     */
    public void setSalesOrderSlipNo_IsNullOrEmpty() { regSalesOrderSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     */
    public void setSalesOrderSlipNo_IsNotNull() { regSalesOrderSlipNo(CK_ISNN, DOBJ); }

    protected void regSalesOrderSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueSalesOrderSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDt The value of orderDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_Equal(String orderDt) {
        doSetOrderDt_Equal(fRES(orderDt));
    }

    protected void doSetOrderDt_Equal(String orderDt) {
        regOrderDt(CK_EQ, orderDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDt The value of orderDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_NotEqual(String orderDt) {
        doSetOrderDt_NotEqual(fRES(orderDt));
    }

    protected void doSetOrderDt_NotEqual(String orderDt) {
        regOrderDt(CK_NES, orderDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDt The value of orderDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_GreaterThan(String orderDt) {
        regOrderDt(CK_GT, fRES(orderDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDt The value of orderDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_LessThan(String orderDt) {
        regOrderDt(CK_LT, fRES(orderDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDt The value of orderDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_GreaterEqual(String orderDt) {
        regOrderDt(CK_GE, fRES(orderDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDt The value of orderDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_LessEqual(String orderDt) {
        regOrderDt(CK_LE, fRES(orderDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDtList The collection of orderDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_InScope(Collection<String> orderDtList) {
        doSetOrderDt_InScope(orderDtList);
    }

    protected void doSetOrderDt_InScope(Collection<String> orderDtList) {
        regINS(CK_INS, cTL(orderDtList), xgetCValueOrderDt(), "ORDER_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDtList The collection of orderDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_NotInScope(Collection<String> orderDtList) {
        doSetOrderDt_NotInScope(orderDtList);
    }

    protected void doSetOrderDt_NotInScope(Collection<String> orderDtList) {
        regINS(CK_NINS, cTL(orderDtList), xgetCValueOrderDt(), "ORDER_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setOrderDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDt The value of orderDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDt_LikeSearch(String orderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDt), xgetCValueOrderDt(), "ORDER_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDt The value of orderDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDt_NotLikeSearch(String orderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDt), xgetCValueOrderDt(), "ORDER_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @param orderDt The value of orderDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_PrefixSearch(String orderDt) {
        setOrderDt_LikeSearch(orderDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     */
    public void setOrderDt_IsNull() { regOrderDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     */
    public void setOrderDt_IsNullOrEmpty() { regOrderDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(8)}
     */
    public void setOrderDt_IsNotNull() { regOrderDt(CK_ISNN, DOBJ); }

    protected void regOrderDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDt(), "ORDER_DT"); }
    protected abstract ConditionValue xgetCValueOrderDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_Equal(String kokyakuCd) {
        doSetKokyakuCd_Equal(fRES(kokyakuCd));
    }

    protected void doSetKokyakuCd_Equal(String kokyakuCd) {
        regKokyakuCd(CK_EQ, kokyakuCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_NotEqual(String kokyakuCd) {
        doSetKokyakuCd_NotEqual(fRES(kokyakuCd));
    }

    protected void doSetKokyakuCd_NotEqual(String kokyakuCd) {
        regKokyakuCd(CK_NES, kokyakuCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_GreaterThan(String kokyakuCd) {
        regKokyakuCd(CK_GT, fRES(kokyakuCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_LessThan(String kokyakuCd) {
        regKokyakuCd(CK_LT, fRES(kokyakuCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_GreaterEqual(String kokyakuCd) {
        regKokyakuCd(CK_GE, fRES(kokyakuCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_LessEqual(String kokyakuCd) {
        regKokyakuCd(CK_LE, fRES(kokyakuCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCdList The collection of kokyakuCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_InScope(Collection<String> kokyakuCdList) {
        doSetKokyakuCd_InScope(kokyakuCdList);
    }

    protected void doSetKokyakuCd_InScope(Collection<String> kokyakuCdList) {
        regINS(CK_INS, cTL(kokyakuCdList), xgetCValueKokyakuCd(), "KOKYAKU_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCdList The collection of kokyakuCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_NotInScope(Collection<String> kokyakuCdList) {
        doSetKokyakuCd_NotInScope(kokyakuCdList);
    }

    protected void doSetKokyakuCd_NotInScope(Collection<String> kokyakuCdList) {
        regINS(CK_NINS, cTL(kokyakuCdList), xgetCValueKokyakuCd(), "KOKYAKU_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setKokyakuCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kokyakuCd The value of kokyakuCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKokyakuCd_LikeSearch(String kokyakuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kokyakuCd), xgetCValueKokyakuCd(), "KOKYAKU_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKokyakuCd_NotLikeSearch(String kokyakuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kokyakuCd), xgetCValueKokyakuCd(), "KOKYAKU_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_PrefixSearch(String kokyakuCd) {
        setKokyakuCd_LikeSearch(kokyakuCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     */
    public void setKokyakuCd_IsNull() { regKokyakuCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     */
    public void setKokyakuCd_IsNullOrEmpty() { regKokyakuCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     */
    public void setKokyakuCd_IsNotNull() { regKokyakuCd(CK_ISNN, DOBJ); }

    protected void regKokyakuCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKokyakuCd(), "KOKYAKU_CD"); }
    protected abstract ConditionValue xgetCValueKokyakuCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_Equal(Long shippingFee) {
        doSetShippingFee_Equal(shippingFee);
    }

    protected void doSetShippingFee_Equal(Long shippingFee) {
        regShippingFee(CK_EQ, shippingFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_NotEqual(Long shippingFee) {
        doSetShippingFee_NotEqual(shippingFee);
    }

    protected void doSetShippingFee_NotEqual(Long shippingFee) {
        regShippingFee(CK_NES, shippingFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_GreaterThan(Long shippingFee) {
        regShippingFee(CK_GT, shippingFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_LessThan(Long shippingFee) {
        regShippingFee(CK_LT, shippingFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_GreaterEqual(Long shippingFee) {
        regShippingFee(CK_GE, shippingFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_LessEqual(Long shippingFee) {
        regShippingFee(CK_LE, shippingFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param minNumber The min number of shippingFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingFee_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingFee(), "SHIPPING_FEE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFeeList The collection of shippingFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_InScope(Collection<Long> shippingFeeList) {
        doSetShippingFee_InScope(shippingFeeList);
    }

    protected void doSetShippingFee_InScope(Collection<Long> shippingFeeList) {
        regINS(CK_INS, cTL(shippingFeeList), xgetCValueShippingFee(), "SHIPPING_FEE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFeeList The collection of shippingFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_NotInScope(Collection<Long> shippingFeeList) {
        doSetShippingFee_NotInScope(shippingFeeList);
    }

    protected void doSetShippingFee_NotInScope(Collection<Long> shippingFeeList) {
        regINS(CK_NINS, cTL(shippingFeeList), xgetCValueShippingFee(), "SHIPPING_FEE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     */
    public void setShippingFee_IsNull() { regShippingFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     */
    public void setShippingFee_IsNotNull() { regShippingFee(CK_ISNN, DOBJ); }

    protected void regShippingFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingFee(), "SHIPPING_FEE"); }
    protected abstract ConditionValue xgetCValueShippingFee();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param separateShippingFee The value of separateShippingFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_Equal(Long separateShippingFee) {
        doSetSeparateShippingFee_Equal(separateShippingFee);
    }

    protected void doSetSeparateShippingFee_Equal(Long separateShippingFee) {
        regSeparateShippingFee(CK_EQ, separateShippingFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param separateShippingFee The value of separateShippingFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_NotEqual(Long separateShippingFee) {
        doSetSeparateShippingFee_NotEqual(separateShippingFee);
    }

    protected void doSetSeparateShippingFee_NotEqual(Long separateShippingFee) {
        regSeparateShippingFee(CK_NES, separateShippingFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param separateShippingFee The value of separateShippingFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_GreaterThan(Long separateShippingFee) {
        regSeparateShippingFee(CK_GT, separateShippingFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param separateShippingFee The value of separateShippingFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_LessThan(Long separateShippingFee) {
        regSeparateShippingFee(CK_LT, separateShippingFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param separateShippingFee The value of separateShippingFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_GreaterEqual(Long separateShippingFee) {
        regSeparateShippingFee(CK_GE, separateShippingFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param separateShippingFee The value of separateShippingFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_LessEqual(Long separateShippingFee) {
        regSeparateShippingFee(CK_LE, separateShippingFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param minNumber The min number of separateShippingFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of separateShippingFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeparateShippingFee_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param separateShippingFeeList The collection of separateShippingFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_InScope(Collection<Long> separateShippingFeeList) {
        doSetSeparateShippingFee_InScope(separateShippingFeeList);
    }

    protected void doSetSeparateShippingFee_InScope(Collection<Long> separateShippingFeeList) {
        regINS(CK_INS, cTL(separateShippingFeeList), xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @param separateShippingFeeList The collection of separateShippingFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_NotInScope(Collection<Long> separateShippingFeeList) {
        doSetSeparateShippingFee_NotInScope(separateShippingFeeList);
    }

    protected void doSetSeparateShippingFee_NotInScope(Collection<Long> separateShippingFeeList) {
        regINS(CK_NINS, cTL(separateShippingFeeList), xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     */
    public void setSeparateShippingFee_IsNull() { regSeparateShippingFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     */
    public void setSeparateShippingFee_IsNotNull() { regSeparateShippingFee(CK_ISNN, DOBJ); }

    protected void regSeparateShippingFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE"); }
    protected abstract ConditionValue xgetCValueSeparateShippingFee();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param codFee The value of codFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodFee_Equal(Long codFee) {
        doSetCodFee_Equal(codFee);
    }

    protected void doSetCodFee_Equal(Long codFee) {
        regCodFee(CK_EQ, codFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param codFee The value of codFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodFee_NotEqual(Long codFee) {
        doSetCodFee_NotEqual(codFee);
    }

    protected void doSetCodFee_NotEqual(Long codFee) {
        regCodFee(CK_NES, codFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param codFee The value of codFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodFee_GreaterThan(Long codFee) {
        regCodFee(CK_GT, codFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param codFee The value of codFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodFee_LessThan(Long codFee) {
        regCodFee(CK_LT, codFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param codFee The value of codFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodFee_GreaterEqual(Long codFee) {
        regCodFee(CK_GE, codFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param codFee The value of codFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodFee_LessEqual(Long codFee) {
        regCodFee(CK_LE, codFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param minNumber The min number of codFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of codFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCodFee_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCodFee(), "COD_FEE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param codFeeList The collection of codFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_InScope(Collection<Long> codFeeList) {
        doSetCodFee_InScope(codFeeList);
    }

    protected void doSetCodFee_InScope(Collection<Long> codFeeList) {
        regINS(CK_INS, cTL(codFeeList), xgetCValueCodFee(), "COD_FEE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     * @param codFeeList The collection of codFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_NotInScope(Collection<Long> codFeeList) {
        doSetCodFee_NotInScope(codFeeList);
    }

    protected void doSetCodFee_NotInScope(Collection<Long> codFeeList) {
        regINS(CK_NINS, cTL(codFeeList), xgetCValueCodFee(), "COD_FEE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     */
    public void setCodFee_IsNull() { regCodFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_FEE: {BIGINT(19)}
     */
    public void setCodFee_IsNotNull() { regCodFee(CK_ISNN, DOBJ); }

    protected void regCodFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodFee(), "COD_FEE"); }
    protected abstract ConditionValue xgetCValueCodFee();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_Equal(String orderNoDeliveryNote) {
        doSetOrderNoDeliveryNote_Equal(fRES(orderNoDeliveryNote));
    }

    protected void doSetOrderNoDeliveryNote_Equal(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_EQ, orderNoDeliveryNote);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_NotEqual(String orderNoDeliveryNote) {
        doSetOrderNoDeliveryNote_NotEqual(fRES(orderNoDeliveryNote));
    }

    protected void doSetOrderNoDeliveryNote_NotEqual(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_NES, orderNoDeliveryNote);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_GreaterThan(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_GT, fRES(orderNoDeliveryNote));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_LessThan(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_LT, fRES(orderNoDeliveryNote));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_GreaterEqual(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_GE, fRES(orderNoDeliveryNote));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_LessEqual(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_LE, fRES(orderNoDeliveryNote));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNoteList The collection of orderNoDeliveryNote as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_InScope(Collection<String> orderNoDeliveryNoteList) {
        doSetOrderNoDeliveryNote_InScope(orderNoDeliveryNoteList);
    }

    protected void doSetOrderNoDeliveryNote_InScope(Collection<String> orderNoDeliveryNoteList) {
        regINS(CK_INS, cTL(orderNoDeliveryNoteList), xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNoteList The collection of orderNoDeliveryNote as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_NotInScope(Collection<String> orderNoDeliveryNoteList) {
        doSetOrderNoDeliveryNote_NotInScope(orderNoDeliveryNoteList);
    }

    protected void doSetOrderNoDeliveryNote_NotInScope(Collection<String> orderNoDeliveryNoteList) {
        regINS(CK_NINS, cTL(orderNoDeliveryNoteList), xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} <br>
     * <pre>e.g. setOrderNoDeliveryNote_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderNoDeliveryNote_LikeSearch(String orderNoDeliveryNote, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderNoDeliveryNote), xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderNoDeliveryNote_NotLikeSearch(String orderNoDeliveryNote, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderNoDeliveryNote), xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_PrefixSearch(String orderNoDeliveryNote) {
        setOrderNoDeliveryNote_LikeSearch(orderNoDeliveryNote, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     */
    public void setOrderNoDeliveryNote_IsNull() { regOrderNoDeliveryNote(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     */
    public void setOrderNoDeliveryNote_IsNullOrEmpty() { regOrderNoDeliveryNote(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     */
    public void setOrderNoDeliveryNote_IsNotNull() { regOrderNoDeliveryNote(CK_ISNN, DOBJ); }

    protected void regOrderNoDeliveryNote(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE"); }
    protected abstract ConditionValue xgetCValueOrderNoDeliveryNote();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param point The value of point as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPoint_Equal(Long point) {
        doSetPoint_Equal(point);
    }

    protected void doSetPoint_Equal(Long point) {
        regPoint(CK_EQ, point);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param point The value of point as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPoint_NotEqual(Long point) {
        doSetPoint_NotEqual(point);
    }

    protected void doSetPoint_NotEqual(Long point) {
        regPoint(CK_NES, point);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param point The value of point as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPoint_GreaterThan(Long point) {
        regPoint(CK_GT, point);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param point The value of point as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPoint_LessThan(Long point) {
        regPoint(CK_LT, point);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param point The value of point as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPoint_GreaterEqual(Long point) {
        regPoint(CK_GE, point);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param point The value of point as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPoint_LessEqual(Long point) {
        regPoint(CK_LE, point);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param minNumber The min number of point. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of point. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPoint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePoint(), "POINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param pointList The collection of point as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_InScope(Collection<Long> pointList) {
        doSetPoint_InScope(pointList);
    }

    protected void doSetPoint_InScope(Collection<Long> pointList) {
        regINS(CK_INS, cTL(pointList), xgetCValuePoint(), "POINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT: {BIGINT(19)}
     * @param pointList The collection of point as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_NotInScope(Collection<Long> pointList) {
        doSetPoint_NotInScope(pointList);
    }

    protected void doSetPoint_NotInScope(Collection<Long> pointList) {
        regINS(CK_NINS, cTL(pointList), xgetCValuePoint(), "POINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     */
    public void setPoint_IsNull() { regPoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT: {BIGINT(19)}
     */
    public void setPoint_IsNotNull() { regPoint(CK_ISNN, DOBJ); }

    protected void regPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePoint(), "POINT"); }
    protected abstract ConditionValue xgetCValuePoint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_Equal(String koguchiDeliveryFlg) {
        doSetKoguchiDeliveryFlg_Equal(fRES(koguchiDeliveryFlg));
    }

    protected void doSetKoguchiDeliveryFlg_Equal(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_EQ, koguchiDeliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_NotEqual(String koguchiDeliveryFlg) {
        doSetKoguchiDeliveryFlg_NotEqual(fRES(koguchiDeliveryFlg));
    }

    protected void doSetKoguchiDeliveryFlg_NotEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_NES, koguchiDeliveryFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_GreaterThan(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_GT, fRES(koguchiDeliveryFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_LessThan(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_LT, fRES(koguchiDeliveryFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_GreaterEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_GE, fRES(koguchiDeliveryFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_LessEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_LE, fRES(koguchiDeliveryFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlgList The collection of koguchiDeliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_InScope(Collection<String> koguchiDeliveryFlgList) {
        doSetKoguchiDeliveryFlg_InScope(koguchiDeliveryFlgList);
    }

    protected void doSetKoguchiDeliveryFlg_InScope(Collection<String> koguchiDeliveryFlgList) {
        regINS(CK_INS, cTL(koguchiDeliveryFlgList), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlgList The collection of koguchiDeliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_NotInScope(Collection<String> koguchiDeliveryFlgList) {
        doSetKoguchiDeliveryFlg_NotInScope(koguchiDeliveryFlgList);
    }

    protected void doSetKoguchiDeliveryFlg_NotInScope(Collection<String> koguchiDeliveryFlgList) {
        regINS(CK_NINS, cTL(koguchiDeliveryFlgList), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)} <br>
     * <pre>e.g. setKoguchiDeliveryFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKoguchiDeliveryFlg_LikeSearch(String koguchiDeliveryFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(koguchiDeliveryFlg), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKoguchiDeliveryFlg_NotLikeSearch(String koguchiDeliveryFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(koguchiDeliveryFlg), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_PrefixSearch(String koguchiDeliveryFlg) {
        setKoguchiDeliveryFlg_LikeSearch(koguchiDeliveryFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     */
    public void setKoguchiDeliveryFlg_IsNull() { regKoguchiDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     */
    public void setKoguchiDeliveryFlg_IsNullOrEmpty() { regKoguchiDeliveryFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     */
    public void setKoguchiDeliveryFlg_IsNotNull() { regKoguchiDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regKoguchiDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueKoguchiDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlg The value of recordSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_Equal(String recordSendFlg) {
        doSetRecordSendFlg_Equal(fRES(recordSendFlg));
    }

    protected void doSetRecordSendFlg_Equal(String recordSendFlg) {
        regRecordSendFlg(CK_EQ, recordSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlg The value of recordSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_NotEqual(String recordSendFlg) {
        doSetRecordSendFlg_NotEqual(fRES(recordSendFlg));
    }

    protected void doSetRecordSendFlg_NotEqual(String recordSendFlg) {
        regRecordSendFlg(CK_NES, recordSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlg The value of recordSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_GreaterThan(String recordSendFlg) {
        regRecordSendFlg(CK_GT, fRES(recordSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlg The value of recordSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_LessThan(String recordSendFlg) {
        regRecordSendFlg(CK_LT, fRES(recordSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlg The value of recordSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_GreaterEqual(String recordSendFlg) {
        regRecordSendFlg(CK_GE, fRES(recordSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlg The value of recordSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_LessEqual(String recordSendFlg) {
        regRecordSendFlg(CK_LE, fRES(recordSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlgList The collection of recordSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_InScope(Collection<String> recordSendFlgList) {
        doSetRecordSendFlg_InScope(recordSendFlgList);
    }

    protected void doSetRecordSendFlg_InScope(Collection<String> recordSendFlgList) {
        regINS(CK_INS, cTL(recordSendFlgList), xgetCValueRecordSendFlg(), "RECORD_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlgList The collection of recordSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_NotInScope(Collection<String> recordSendFlgList) {
        doSetRecordSendFlg_NotInScope(recordSendFlgList);
    }

    protected void doSetRecordSendFlg_NotInScope(Collection<String> recordSendFlgList) {
        regINS(CK_NINS, cTL(recordSendFlgList), xgetCValueRecordSendFlg(), "RECORD_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setRecordSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param recordSendFlg The value of recordSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRecordSendFlg_LikeSearch(String recordSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(recordSendFlg), xgetCValueRecordSendFlg(), "RECORD_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlg The value of recordSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRecordSendFlg_NotLikeSearch(String recordSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(recordSendFlg), xgetCValueRecordSendFlg(), "RECORD_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @param recordSendFlg The value of recordSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordSendFlg_PrefixSearch(String recordSendFlg) {
        setRecordSendFlg_LikeSearch(recordSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setRecordSendFlg_IsNull() { regRecordSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setRecordSendFlg_IsNullOrEmpty() { regRecordSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setRecordSendFlg_IsNotNull() { regRecordSendFlg(CK_ISNN, DOBJ); }

    protected void regRecordSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecordSendFlg(), "RECORD_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueRecordSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlg The value of carrierDataOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_Equal(String carrierDataOutFlg) {
        doSetCarrierDataOutFlg_Equal(fRES(carrierDataOutFlg));
    }

    protected void doSetCarrierDataOutFlg_Equal(String carrierDataOutFlg) {
        regCarrierDataOutFlg(CK_EQ, carrierDataOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlg The value of carrierDataOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_NotEqual(String carrierDataOutFlg) {
        doSetCarrierDataOutFlg_NotEqual(fRES(carrierDataOutFlg));
    }

    protected void doSetCarrierDataOutFlg_NotEqual(String carrierDataOutFlg) {
        regCarrierDataOutFlg(CK_NES, carrierDataOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlg The value of carrierDataOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_GreaterThan(String carrierDataOutFlg) {
        regCarrierDataOutFlg(CK_GT, fRES(carrierDataOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlg The value of carrierDataOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_LessThan(String carrierDataOutFlg) {
        regCarrierDataOutFlg(CK_LT, fRES(carrierDataOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlg The value of carrierDataOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_GreaterEqual(String carrierDataOutFlg) {
        regCarrierDataOutFlg(CK_GE, fRES(carrierDataOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlg The value of carrierDataOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_LessEqual(String carrierDataOutFlg) {
        regCarrierDataOutFlg(CK_LE, fRES(carrierDataOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlgList The collection of carrierDataOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_InScope(Collection<String> carrierDataOutFlgList) {
        doSetCarrierDataOutFlg_InScope(carrierDataOutFlgList);
    }

    protected void doSetCarrierDataOutFlg_InScope(Collection<String> carrierDataOutFlgList) {
        regINS(CK_INS, cTL(carrierDataOutFlgList), xgetCValueCarrierDataOutFlg(), "CARRIER_DATA_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlgList The collection of carrierDataOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_NotInScope(Collection<String> carrierDataOutFlgList) {
        doSetCarrierDataOutFlg_NotInScope(carrierDataOutFlgList);
    }

    protected void doSetCarrierDataOutFlg_NotInScope(Collection<String> carrierDataOutFlgList) {
        regINS(CK_NINS, cTL(carrierDataOutFlgList), xgetCValueCarrierDataOutFlg(), "CARRIER_DATA_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setCarrierDataOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierDataOutFlg The value of carrierDataOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierDataOutFlg_LikeSearch(String carrierDataOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierDataOutFlg), xgetCValueCarrierDataOutFlg(), "CARRIER_DATA_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlg The value of carrierDataOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierDataOutFlg_NotLikeSearch(String carrierDataOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierDataOutFlg), xgetCValueCarrierDataOutFlg(), "CARRIER_DATA_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @param carrierDataOutFlg The value of carrierDataOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDataOutFlg_PrefixSearch(String carrierDataOutFlg) {
        setCarrierDataOutFlg_LikeSearch(carrierDataOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     */
    public void setCarrierDataOutFlg_IsNull() { regCarrierDataOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     */
    public void setCarrierDataOutFlg_IsNullOrEmpty() { regCarrierDataOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     */
    public void setCarrierDataOutFlg_IsNotNull() { regCarrierDataOutFlg(CK_ISNN, DOBJ); }

    protected void regCarrierDataOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierDataOutFlg(), "CARRIER_DATA_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueCarrierDataOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_Equal(String kohaiContractorCd) {
        doSetKohaiContractorCd_Equal(fRES(kohaiContractorCd));
    }

    protected void doSetKohaiContractorCd_Equal(String kohaiContractorCd) {
        regKohaiContractorCd(CK_EQ, kohaiContractorCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_NotEqual(String kohaiContractorCd) {
        doSetKohaiContractorCd_NotEqual(fRES(kohaiContractorCd));
    }

    protected void doSetKohaiContractorCd_NotEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_NES, kohaiContractorCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_GreaterThan(String kohaiContractorCd) {
        regKohaiContractorCd(CK_GT, fRES(kohaiContractorCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_LessThan(String kohaiContractorCd) {
        regKohaiContractorCd(CK_LT, fRES(kohaiContractorCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_GreaterEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_GE, fRES(kohaiContractorCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_LessEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_LE, fRES(kohaiContractorCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCdList The collection of kohaiContractorCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_InScope(Collection<String> kohaiContractorCdList) {
        doSetKohaiContractorCd_InScope(kohaiContractorCdList);
    }

    protected void doSetKohaiContractorCd_InScope(Collection<String> kohaiContractorCdList) {
        regINS(CK_INS, cTL(kohaiContractorCdList), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCdList The collection of kohaiContractorCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_NotInScope(Collection<String> kohaiContractorCdList) {
        doSetKohaiContractorCd_NotInScope(kohaiContractorCdList);
    }

    protected void doSetKohaiContractorCd_NotInScope(Collection<String> kohaiContractorCdList) {
        regINS(CK_NINS, cTL(kohaiContractorCdList), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setKohaiContractorCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kohaiContractorCd The value of kohaiContractorCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKohaiContractorCd_LikeSearch(String kohaiContractorCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kohaiContractorCd), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKohaiContractorCd_NotLikeSearch(String kohaiContractorCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kohaiContractorCd), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_PrefixSearch(String kohaiContractorCd) {
        setKohaiContractorCd_LikeSearch(kohaiContractorCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNull() { regKohaiContractorCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNullOrEmpty() { regKohaiContractorCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNotNull() { regKohaiContractorCd(CK_ISNN, DOBJ); }

    protected void regKohaiContractorCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD"); }
    protected abstract ConditionValue xgetCValueKohaiContractorCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_Equal(String kohaiContractorNm) {
        doSetKohaiContractorNm_Equal(fRES(kohaiContractorNm));
    }

    protected void doSetKohaiContractorNm_Equal(String kohaiContractorNm) {
        regKohaiContractorNm(CK_EQ, kohaiContractorNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_NotEqual(String kohaiContractorNm) {
        doSetKohaiContractorNm_NotEqual(fRES(kohaiContractorNm));
    }

    protected void doSetKohaiContractorNm_NotEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_NES, kohaiContractorNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_GreaterThan(String kohaiContractorNm) {
        regKohaiContractorNm(CK_GT, fRES(kohaiContractorNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_LessThan(String kohaiContractorNm) {
        regKohaiContractorNm(CK_LT, fRES(kohaiContractorNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_GreaterEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_GE, fRES(kohaiContractorNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_LessEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_LE, fRES(kohaiContractorNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNmList The collection of kohaiContractorNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_InScope(Collection<String> kohaiContractorNmList) {
        doSetKohaiContractorNm_InScope(kohaiContractorNmList);
    }

    protected void doSetKohaiContractorNm_InScope(Collection<String> kohaiContractorNmList) {
        regINS(CK_INS, cTL(kohaiContractorNmList), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNmList The collection of kohaiContractorNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_NotInScope(Collection<String> kohaiContractorNmList) {
        doSetKohaiContractorNm_NotInScope(kohaiContractorNmList);
    }

    protected void doSetKohaiContractorNm_NotInScope(Collection<String> kohaiContractorNmList) {
        regINS(CK_NINS, cTL(kohaiContractorNmList), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setKohaiContractorNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kohaiContractorNm The value of kohaiContractorNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKohaiContractorNm_LikeSearch(String kohaiContractorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kohaiContractorNm), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKohaiContractorNm_NotLikeSearch(String kohaiContractorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kohaiContractorNm), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_PrefixSearch(String kohaiContractorNm) {
        setKohaiContractorNm_LikeSearch(kohaiContractorNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNull() { regKohaiContractorNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNullOrEmpty() { regKohaiContractorNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNotNull() { regKohaiContractorNm(CK_ISNN, DOBJ); }

    protected void regKohaiContractorNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM"); }
    protected abstract ConditionValue xgetCValueKohaiContractorNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_Equal(String shippingPlantCd) {
        doSetShippingPlantCd_Equal(fRES(shippingPlantCd));
    }

    protected void doSetShippingPlantCd_Equal(String shippingPlantCd) {
        regShippingPlantCd(CK_EQ, shippingPlantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_NotEqual(String shippingPlantCd) {
        doSetShippingPlantCd_NotEqual(fRES(shippingPlantCd));
    }

    protected void doSetShippingPlantCd_NotEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_NES, shippingPlantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_GreaterThan(String shippingPlantCd) {
        regShippingPlantCd(CK_GT, fRES(shippingPlantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_LessThan(String shippingPlantCd) {
        regShippingPlantCd(CK_LT, fRES(shippingPlantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_GreaterEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_GE, fRES(shippingPlantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_LessEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_LE, fRES(shippingPlantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCdList The collection of shippingPlantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_InScope(Collection<String> shippingPlantCdList) {
        doSetShippingPlantCd_InScope(shippingPlantCdList);
    }

    protected void doSetShippingPlantCd_InScope(Collection<String> shippingPlantCdList) {
        regINS(CK_INS, cTL(shippingPlantCdList), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCdList The collection of shippingPlantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_NotInScope(Collection<String> shippingPlantCdList) {
        doSetShippingPlantCd_NotInScope(shippingPlantCdList);
    }

    protected void doSetShippingPlantCd_NotInScope(Collection<String> shippingPlantCdList) {
        regINS(CK_NINS, cTL(shippingPlantCdList), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingPlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingPlantCd The value of shippingPlantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingPlantCd_LikeSearch(String shippingPlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingPlantCd), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingPlantCd_NotLikeSearch(String shippingPlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingPlantCd), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_PrefixSearch(String shippingPlantCd) {
        setShippingPlantCd_LikeSearch(shippingPlantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNull() { regShippingPlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNullOrEmpty() { regShippingPlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNotNull() { regShippingPlantCd(CK_ISNN, DOBJ); }

    protected void regShippingPlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD"); }
    protected abstract ConditionValue xgetCValueShippingPlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_Equal(String shippingStorageSpaceCd) {
        doSetShippingStorageSpaceCd_Equal(fRES(shippingStorageSpaceCd));
    }

    protected void doSetShippingStorageSpaceCd_Equal(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_EQ, shippingStorageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_NotEqual(String shippingStorageSpaceCd) {
        doSetShippingStorageSpaceCd_NotEqual(fRES(shippingStorageSpaceCd));
    }

    protected void doSetShippingStorageSpaceCd_NotEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_NES, shippingStorageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_GreaterThan(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_GT, fRES(shippingStorageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_LessThan(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_LT, fRES(shippingStorageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_GreaterEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_GE, fRES(shippingStorageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_LessEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_LE, fRES(shippingStorageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCdList The collection of shippingStorageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_InScope(Collection<String> shippingStorageSpaceCdList) {
        doSetShippingStorageSpaceCd_InScope(shippingStorageSpaceCdList);
    }

    protected void doSetShippingStorageSpaceCd_InScope(Collection<String> shippingStorageSpaceCdList) {
        regINS(CK_INS, cTL(shippingStorageSpaceCdList), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCdList The collection of shippingStorageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_NotInScope(Collection<String> shippingStorageSpaceCdList) {
        doSetShippingStorageSpaceCd_NotInScope(shippingStorageSpaceCdList);
    }

    protected void doSetShippingStorageSpaceCd_NotInScope(Collection<String> shippingStorageSpaceCdList) {
        regINS(CK_NINS, cTL(shippingStorageSpaceCdList), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingStorageSpaceCd_LikeSearch(String shippingStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingStorageSpaceCd), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingStorageSpaceCd_NotLikeSearch(String shippingStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingStorageSpaceCd), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_PrefixSearch(String shippingStorageSpaceCd) {
        setShippingStorageSpaceCd_LikeSearch(shippingStorageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNull() { regShippingStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNullOrEmpty() { regShippingStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNotNull() { regShippingStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regShippingStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueShippingStorageSpaceCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_Equal(Long nizoroeId) {
        doSetNizoroeId_Equal(nizoroeId);
    }

    protected void doSetNizoroeId_Equal(Long nizoroeId) {
        regNizoroeId(CK_EQ, nizoroeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_NotEqual(Long nizoroeId) {
        doSetNizoroeId_NotEqual(nizoroeId);
    }

    protected void doSetNizoroeId_NotEqual(Long nizoroeId) {
        regNizoroeId(CK_NES, nizoroeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_GreaterThan(Long nizoroeId) {
        regNizoroeId(CK_GT, nizoroeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_LessThan(Long nizoroeId) {
        regNizoroeId(CK_LT, nizoroeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_GreaterEqual(Long nizoroeId) {
        regNizoroeId(CK_GE, nizoroeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_LessEqual(Long nizoroeId) {
        regNizoroeId(CK_LE, nizoroeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param minNumber The min number of nizoroeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nizoroeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNizoroeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNizoroeId(), "NIZOROE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param nizoroeIdList The collection of nizoroeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeId_InScope(Collection<Long> nizoroeIdList) {
        doSetNizoroeId_InScope(nizoroeIdList);
    }

    protected void doSetNizoroeId_InScope(Collection<Long> nizoroeIdList) {
        regINS(CK_INS, cTL(nizoroeIdList), xgetCValueNizoroeId(), "NIZOROE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @param nizoroeIdList The collection of nizoroeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeId_NotInScope(Collection<Long> nizoroeIdList) {
        doSetNizoroeId_NotInScope(nizoroeIdList);
    }

    protected void doSetNizoroeId_NotInScope(Collection<Long> nizoroeIdList) {
        regINS(CK_NINS, cTL(nizoroeIdList), xgetCValueNizoroeId(), "NIZOROE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     */
    public void setNizoroeId_IsNull() { regNizoroeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_ID: {BIGINT(19)}
     */
    public void setNizoroeId_IsNotNull() { regNizoroeId(CK_ISNN, DOBJ); }

    protected void regNizoroeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeId(), "NIZOROE_ID"); }
    protected abstract ConditionValue xgetCValueNizoroeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_Equal(String nizoroeProcUnit) {
        doSetNizoroeProcUnit_Equal(fRES(nizoroeProcUnit));
    }

    protected void doSetNizoroeProcUnit_Equal(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_EQ, nizoroeProcUnit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_NotEqual(String nizoroeProcUnit) {
        doSetNizoroeProcUnit_NotEqual(fRES(nizoroeProcUnit));
    }

    protected void doSetNizoroeProcUnit_NotEqual(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_NES, nizoroeProcUnit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_GreaterThan(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_GT, fRES(nizoroeProcUnit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_LessThan(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_LT, fRES(nizoroeProcUnit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_GreaterEqual(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_GE, fRES(nizoroeProcUnit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_LessEqual(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_LE, fRES(nizoroeProcUnit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnitList The collection of nizoroeProcUnit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_InScope(Collection<String> nizoroeProcUnitList) {
        doSetNizoroeProcUnit_InScope(nizoroeProcUnitList);
    }

    protected void doSetNizoroeProcUnit_InScope(Collection<String> nizoroeProcUnitList) {
        regINS(CK_INS, cTL(nizoroeProcUnitList), xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnitList The collection of nizoroeProcUnit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_NotInScope(Collection<String> nizoroeProcUnitList) {
        doSetNizoroeProcUnit_NotInScope(nizoroeProcUnitList);
    }

    protected void doSetNizoroeProcUnit_NotInScope(Collection<String> nizoroeProcUnitList) {
        regINS(CK_NINS, cTL(nizoroeProcUnitList), xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeProcUnit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeProcUnit The value of nizoroeProcUnit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeProcUnit_LikeSearch(String nizoroeProcUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeProcUnit), xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeProcUnit_NotLikeSearch(String nizoroeProcUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeProcUnit), xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_PrefixSearch(String nizoroeProcUnit) {
        setNizoroeProcUnit_LikeSearch(nizoroeProcUnit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     */
    public void setNizoroeProcUnit_IsNull() { regNizoroeProcUnit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     */
    public void setNizoroeProcUnit_IsNullOrEmpty() { regNizoroeProcUnit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     */
    public void setNizoroeProcUnit_IsNotNull() { regNizoroeProcUnit(CK_ISNN, DOBJ); }

    protected void regNizoroeProcUnit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT"); }
    protected abstract ConditionValue xgetCValueNizoroeProcUnit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param accountId The value of accountId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_Equal(Long accountId) {
        doSetAccountId_Equal(accountId);
    }

    protected void doSetAccountId_Equal(Long accountId) {
        regAccountId(CK_EQ, accountId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param accountId The value of accountId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_NotEqual(Long accountId) {
        doSetAccountId_NotEqual(accountId);
    }

    protected void doSetAccountId_NotEqual(Long accountId) {
        regAccountId(CK_NES, accountId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param accountId The value of accountId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterThan(Long accountId) {
        regAccountId(CK_GT, accountId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param accountId The value of accountId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessThan(Long accountId) {
        regAccountId(CK_LT, accountId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param accountId The value of accountId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterEqual(Long accountId) {
        regAccountId(CK_GE, accountId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param accountId The value of accountId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessEqual(Long accountId) {
        regAccountId(CK_LE, accountId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param minNumber The min number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAccountId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountId(), "ACCOUNT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param accountIdList The collection of accountId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountId_InScope(Collection<Long> accountIdList) {
        doSetAccountId_InScope(accountIdList);
    }

    protected void doSetAccountId_InScope(Collection<Long> accountIdList) {
        regINS(CK_INS, cTL(accountIdList), xgetCValueAccountId(), "ACCOUNT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @param accountIdList The collection of accountId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountId_NotInScope(Collection<Long> accountIdList) {
        doSetAccountId_NotInScope(accountIdList);
    }

    protected void doSetAccountId_NotInScope(Collection<Long> accountIdList) {
        regINS(CK_NINS, cTL(accountIdList), xgetCValueAccountId(), "ACCOUNT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     */
    public void setAccountId_IsNull() { regAccountId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     */
    public void setAccountId_IsNotNull() { regAccountId(CK_ISNN, DOBJ); }

    protected void regAccountId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountId(), "ACCOUNT_ID"); }
    protected abstract ConditionValue xgetCValueAccountId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCd The value of accountCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_Equal(String accountCd) {
        doSetAccountCd_Equal(fRES(accountCd));
    }

    protected void doSetAccountCd_Equal(String accountCd) {
        regAccountCd(CK_EQ, accountCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCd The value of accountCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_NotEqual(String accountCd) {
        doSetAccountCd_NotEqual(fRES(accountCd));
    }

    protected void doSetAccountCd_NotEqual(String accountCd) {
        regAccountCd(CK_NES, accountCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCd The value of accountCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_GreaterThan(String accountCd) {
        regAccountCd(CK_GT, fRES(accountCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCd The value of accountCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_LessThan(String accountCd) {
        regAccountCd(CK_LT, fRES(accountCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCd The value of accountCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_GreaterEqual(String accountCd) {
        regAccountCd(CK_GE, fRES(accountCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCd The value of accountCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_LessEqual(String accountCd) {
        regAccountCd(CK_LE, fRES(accountCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCdList The collection of accountCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_InScope(Collection<String> accountCdList) {
        doSetAccountCd_InScope(accountCdList);
    }

    protected void doSetAccountCd_InScope(Collection<String> accountCdList) {
        regINS(CK_INS, cTL(accountCdList), xgetCValueAccountCd(), "ACCOUNT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCdList The collection of accountCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_NotInScope(Collection<String> accountCdList) {
        doSetAccountCd_NotInScope(accountCdList);
    }

    protected void doSetAccountCd_NotInScope(Collection<String> accountCdList) {
        regINS(CK_NINS, cTL(accountCdList), xgetCValueAccountCd(), "ACCOUNT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setAccountCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accountCd The value of accountCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAccountCd_LikeSearch(String accountCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accountCd), xgetCValueAccountCd(), "ACCOUNT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCd The value of accountCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAccountCd_NotLikeSearch(String accountCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accountCd), xgetCValueAccountCd(), "ACCOUNT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @param accountCd The value of accountCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountCd_PrefixSearch(String accountCd) {
        setAccountCd_LikeSearch(accountCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     */
    public void setAccountCd_IsNull() { regAccountCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     */
    public void setAccountCd_IsNullOrEmpty() { regAccountCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     */
    public void setAccountCd_IsNotNull() { regAccountCd(CK_ISNN, DOBJ); }

    protected void regAccountCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountCd(), "ACCOUNT_CD"); }
    protected abstract ConditionValue xgetCValueAccountCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_Equal(String shippingReasonCd) {
        doSetShippingReasonCd_Equal(fRES(shippingReasonCd));
    }

    protected void doSetShippingReasonCd_Equal(String shippingReasonCd) {
        regShippingReasonCd(CK_EQ, shippingReasonCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_NotEqual(String shippingReasonCd) {
        doSetShippingReasonCd_NotEqual(fRES(shippingReasonCd));
    }

    protected void doSetShippingReasonCd_NotEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_NES, shippingReasonCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_GreaterThan(String shippingReasonCd) {
        regShippingReasonCd(CK_GT, fRES(shippingReasonCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_LessThan(String shippingReasonCd) {
        regShippingReasonCd(CK_LT, fRES(shippingReasonCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_GreaterEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_GE, fRES(shippingReasonCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_LessEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_LE, fRES(shippingReasonCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCdList The collection of shippingReasonCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_InScope(Collection<String> shippingReasonCdList) {
        doSetShippingReasonCd_InScope(shippingReasonCdList);
    }

    protected void doSetShippingReasonCd_InScope(Collection<String> shippingReasonCdList) {
        regINS(CK_INS, cTL(shippingReasonCdList), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCdList The collection of shippingReasonCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_NotInScope(Collection<String> shippingReasonCdList) {
        doSetShippingReasonCd_NotInScope(shippingReasonCdList);
    }

    protected void doSetShippingReasonCd_NotInScope(Collection<String> shippingReasonCdList) {
        regINS(CK_NINS, cTL(shippingReasonCdList), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingReasonCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingReasonCd The value of shippingReasonCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingReasonCd_LikeSearch(String shippingReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingReasonCd), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingReasonCd_NotLikeSearch(String shippingReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingReasonCd), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_PrefixSearch(String shippingReasonCd) {
        setShippingReasonCd_LikeSearch(shippingReasonCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNull() { regShippingReasonCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNullOrEmpty() { regShippingReasonCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNotNull() { regShippingReasonCd(CK_ISNN, DOBJ); }

    protected void regShippingReasonCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD"); }
    protected abstract ConditionValue xgetCValueShippingReasonCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlg The value of transferFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_Equal(String transferFlg) {
        doSetTransferFlg_Equal(fRES(transferFlg));
    }

    protected void doSetTransferFlg_Equal(String transferFlg) {
        regTransferFlg(CK_EQ, transferFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlg The value of transferFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_NotEqual(String transferFlg) {
        doSetTransferFlg_NotEqual(fRES(transferFlg));
    }

    protected void doSetTransferFlg_NotEqual(String transferFlg) {
        regTransferFlg(CK_NES, transferFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlg The value of transferFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_GreaterThan(String transferFlg) {
        regTransferFlg(CK_GT, fRES(transferFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlg The value of transferFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_LessThan(String transferFlg) {
        regTransferFlg(CK_LT, fRES(transferFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlg The value of transferFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_GreaterEqual(String transferFlg) {
        regTransferFlg(CK_GE, fRES(transferFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlg The value of transferFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_LessEqual(String transferFlg) {
        regTransferFlg(CK_LE, fRES(transferFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlgList The collection of transferFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_InScope(Collection<String> transferFlgList) {
        doSetTransferFlg_InScope(transferFlgList);
    }

    protected void doSetTransferFlg_InScope(Collection<String> transferFlgList) {
        regINS(CK_INS, cTL(transferFlgList), xgetCValueTransferFlg(), "TRANSFER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlgList The collection of transferFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_NotInScope(Collection<String> transferFlgList) {
        doSetTransferFlg_NotInScope(transferFlgList);
    }

    protected void doSetTransferFlg_NotInScope(Collection<String> transferFlgList) {
        regINS(CK_NINS, cTL(transferFlgList), xgetCValueTransferFlg(), "TRANSFER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)} <br>
     * <pre>e.g. setTransferFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transferFlg The value of transferFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransferFlg_LikeSearch(String transferFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transferFlg), xgetCValueTransferFlg(), "TRANSFER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlg The value of transferFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransferFlg_NotLikeSearch(String transferFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transferFlg), xgetCValueTransferFlg(), "TRANSFER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @param transferFlg The value of transferFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferFlg_PrefixSearch(String transferFlg) {
        setTransferFlg_LikeSearch(transferFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     */
    public void setTransferFlg_IsNull() { regTransferFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     */
    public void setTransferFlg_IsNullOrEmpty() { regTransferFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSFER_FLG: {CHAR(1)}
     */
    public void setTransferFlg_IsNotNull() { regTransferFlg(CK_ISNN, DOBJ); }

    protected void regTransferFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransferFlg(), "TRANSFER_FLG"); }
    protected abstract ConditionValue xgetCValueTransferFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_Equal(String tenhanshaSalesOrderNo) {
        doSetTenhanshaSalesOrderNo_Equal(fRES(tenhanshaSalesOrderNo));
    }

    protected void doSetTenhanshaSalesOrderNo_Equal(String tenhanshaSalesOrderNo) {
        regTenhanshaSalesOrderNo(CK_EQ, tenhanshaSalesOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_NotEqual(String tenhanshaSalesOrderNo) {
        doSetTenhanshaSalesOrderNo_NotEqual(fRES(tenhanshaSalesOrderNo));
    }

    protected void doSetTenhanshaSalesOrderNo_NotEqual(String tenhanshaSalesOrderNo) {
        regTenhanshaSalesOrderNo(CK_NES, tenhanshaSalesOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_GreaterThan(String tenhanshaSalesOrderNo) {
        regTenhanshaSalesOrderNo(CK_GT, fRES(tenhanshaSalesOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_LessThan(String tenhanshaSalesOrderNo) {
        regTenhanshaSalesOrderNo(CK_LT, fRES(tenhanshaSalesOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_GreaterEqual(String tenhanshaSalesOrderNo) {
        regTenhanshaSalesOrderNo(CK_GE, fRES(tenhanshaSalesOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_LessEqual(String tenhanshaSalesOrderNo) {
        regTenhanshaSalesOrderNo(CK_LE, fRES(tenhanshaSalesOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNoList The collection of tenhanshaSalesOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_InScope(Collection<String> tenhanshaSalesOrderNoList) {
        doSetTenhanshaSalesOrderNo_InScope(tenhanshaSalesOrderNoList);
    }

    protected void doSetTenhanshaSalesOrderNo_InScope(Collection<String> tenhanshaSalesOrderNoList) {
        regINS(CK_INS, cTL(tenhanshaSalesOrderNoList), xgetCValueTenhanshaSalesOrderNo(), "TENHANSHA_SALES_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNoList The collection of tenhanshaSalesOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_NotInScope(Collection<String> tenhanshaSalesOrderNoList) {
        doSetTenhanshaSalesOrderNo_NotInScope(tenhanshaSalesOrderNoList);
    }

    protected void doSetTenhanshaSalesOrderNo_NotInScope(Collection<String> tenhanshaSalesOrderNoList) {
        regINS(CK_NINS, cTL(tenhanshaSalesOrderNoList), xgetCValueTenhanshaSalesOrderNo(), "TENHANSHA_SALES_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaSalesOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaSalesOrderNo_LikeSearch(String tenhanshaSalesOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaSalesOrderNo), xgetCValueTenhanshaSalesOrderNo(), "TENHANSHA_SALES_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaSalesOrderNo_NotLikeSearch(String tenhanshaSalesOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaSalesOrderNo), xgetCValueTenhanshaSalesOrderNo(), "TENHANSHA_SALES_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaSalesOrderNo The value of tenhanshaSalesOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaSalesOrderNo_PrefixSearch(String tenhanshaSalesOrderNo) {
        setTenhanshaSalesOrderNo_LikeSearch(tenhanshaSalesOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaSalesOrderNo_IsNull() { regTenhanshaSalesOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaSalesOrderNo_IsNullOrEmpty() { regTenhanshaSalesOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaSalesOrderNo_IsNotNull() { regTenhanshaSalesOrderNo(CK_ISNN, DOBJ); }

    protected void regTenhanshaSalesOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaSalesOrderNo(), "TENHANSHA_SALES_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueTenhanshaSalesOrderNo();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param salesOrderNum The value of salesOrderNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_Equal(Long salesOrderNum) {
        doSetSalesOrderNum_Equal(salesOrderNum);
    }

    protected void doSetSalesOrderNum_Equal(Long salesOrderNum) {
        regSalesOrderNum(CK_EQ, salesOrderNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param salesOrderNum The value of salesOrderNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_NotEqual(Long salesOrderNum) {
        doSetSalesOrderNum_NotEqual(salesOrderNum);
    }

    protected void doSetSalesOrderNum_NotEqual(Long salesOrderNum) {
        regSalesOrderNum(CK_NES, salesOrderNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param salesOrderNum The value of salesOrderNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_GreaterThan(Long salesOrderNum) {
        regSalesOrderNum(CK_GT, salesOrderNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param salesOrderNum The value of salesOrderNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_LessThan(Long salesOrderNum) {
        regSalesOrderNum(CK_LT, salesOrderNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param salesOrderNum The value of salesOrderNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_GreaterEqual(Long salesOrderNum) {
        regSalesOrderNum(CK_GE, salesOrderNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param salesOrderNum The value of salesOrderNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_LessEqual(Long salesOrderNum) {
        regSalesOrderNum(CK_LE, salesOrderNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param minNumber The min number of salesOrderNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of salesOrderNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSalesOrderNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesOrderNum(), "SALES_ORDER_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param salesOrderNumList The collection of salesOrderNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNum_InScope(Collection<Long> salesOrderNumList) {
        doSetSalesOrderNum_InScope(salesOrderNumList);
    }

    protected void doSetSalesOrderNum_InScope(Collection<Long> salesOrderNumList) {
        regINS(CK_INS, cTL(salesOrderNumList), xgetCValueSalesOrderNum(), "SALES_ORDER_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @param salesOrderNumList The collection of salesOrderNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNum_NotInScope(Collection<Long> salesOrderNumList) {
        doSetSalesOrderNum_NotInScope(salesOrderNumList);
    }

    protected void doSetSalesOrderNum_NotInScope(Collection<Long> salesOrderNumList) {
        regINS(CK_NINS, cTL(salesOrderNumList), xgetCValueSalesOrderNum(), "SALES_ORDER_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     */
    public void setSalesOrderNum_IsNull() { regSalesOrderNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     */
    public void setSalesOrderNum_IsNotNull() { regSalesOrderNum(CK_ISNN, DOBJ); }

    protected void regSalesOrderNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderNum(), "SALES_ORDER_NUM"); }
    protected abstract ConditionValue xgetCValueSalesOrderNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_Equal(String directDeliveryTypeCd) {
        doSetDirectDeliveryTypeCd_Equal(fRES(directDeliveryTypeCd));
    }

    protected void doSetDirectDeliveryTypeCd_Equal(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_EQ, directDeliveryTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_NotEqual(String directDeliveryTypeCd) {
        doSetDirectDeliveryTypeCd_NotEqual(fRES(directDeliveryTypeCd));
    }

    protected void doSetDirectDeliveryTypeCd_NotEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_NES, directDeliveryTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_GreaterThan(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_GT, fRES(directDeliveryTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_LessThan(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_LT, fRES(directDeliveryTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_GreaterEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_GE, fRES(directDeliveryTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_LessEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_LE, fRES(directDeliveryTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCdList The collection of directDeliveryTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_InScope(Collection<String> directDeliveryTypeCdList) {
        doSetDirectDeliveryTypeCd_InScope(directDeliveryTypeCdList);
    }

    protected void doSetDirectDeliveryTypeCd_InScope(Collection<String> directDeliveryTypeCdList) {
        regINS(CK_INS, cTL(directDeliveryTypeCdList), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCdList The collection of directDeliveryTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_NotInScope(Collection<String> directDeliveryTypeCdList) {
        doSetDirectDeliveryTypeCd_NotInScope(directDeliveryTypeCdList);
    }

    protected void doSetDirectDeliveryTypeCd_NotInScope(Collection<String> directDeliveryTypeCdList) {
        regINS(CK_NINS, cTL(directDeliveryTypeCdList), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDirectDeliveryTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectDeliveryTypeCd_LikeSearch(String directDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directDeliveryTypeCd), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectDeliveryTypeCd_NotLikeSearch(String directDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directDeliveryTypeCd), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_PrefixSearch(String directDeliveryTypeCd) {
        setDirectDeliveryTypeCd_LikeSearch(directDeliveryTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNull() { regDirectDeliveryTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNullOrEmpty() { regDirectDeliveryTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNotNull() { regDirectDeliveryTypeCd(CK_ISNN, DOBJ); }

    protected void regDirectDeliveryTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDirectDeliveryTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_Equal(String splitDeliveryTypeCd) {
        doSetSplitDeliveryTypeCd_Equal(fRES(splitDeliveryTypeCd));
    }

    protected void doSetSplitDeliveryTypeCd_Equal(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_EQ, splitDeliveryTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_NotEqual(String splitDeliveryTypeCd) {
        doSetSplitDeliveryTypeCd_NotEqual(fRES(splitDeliveryTypeCd));
    }

    protected void doSetSplitDeliveryTypeCd_NotEqual(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_NES, splitDeliveryTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_GreaterThan(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_GT, fRES(splitDeliveryTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_LessThan(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_LT, fRES(splitDeliveryTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_GreaterEqual(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_GE, fRES(splitDeliveryTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_LessEqual(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_LE, fRES(splitDeliveryTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCdList The collection of splitDeliveryTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_InScope(Collection<String> splitDeliveryTypeCdList) {
        doSetSplitDeliveryTypeCd_InScope(splitDeliveryTypeCdList);
    }

    protected void doSetSplitDeliveryTypeCd_InScope(Collection<String> splitDeliveryTypeCdList) {
        regINS(CK_INS, cTL(splitDeliveryTypeCdList), xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCdList The collection of splitDeliveryTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_NotInScope(Collection<String> splitDeliveryTypeCdList) {
        doSetSplitDeliveryTypeCd_NotInScope(splitDeliveryTypeCdList);
    }

    protected void doSetSplitDeliveryTypeCd_NotInScope(Collection<String> splitDeliveryTypeCdList) {
        regINS(CK_NINS, cTL(splitDeliveryTypeCdList), xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSplitDeliveryTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSplitDeliveryTypeCd_LikeSearch(String splitDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(splitDeliveryTypeCd), xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSplitDeliveryTypeCd_NotLikeSearch(String splitDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(splitDeliveryTypeCd), xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_PrefixSearch(String splitDeliveryTypeCd) {
        setSplitDeliveryTypeCd_LikeSearch(splitDeliveryTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setSplitDeliveryTypeCd_IsNull() { regSplitDeliveryTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setSplitDeliveryTypeCd_IsNullOrEmpty() { regSplitDeliveryTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setSplitDeliveryTypeCd_IsNotNull() { regSplitDeliveryTypeCd(CK_ISNN, DOBJ); }

    protected void regSplitDeliveryTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSplitDeliveryTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_Equal(String carrierTypeCd) {
        doSetCarrierTypeCd_Equal(fRES(carrierTypeCd));
    }

    protected void doSetCarrierTypeCd_Equal(String carrierTypeCd) {
        regCarrierTypeCd(CK_EQ, carrierTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_NotEqual(String carrierTypeCd) {
        doSetCarrierTypeCd_NotEqual(fRES(carrierTypeCd));
    }

    protected void doSetCarrierTypeCd_NotEqual(String carrierTypeCd) {
        regCarrierTypeCd(CK_NES, carrierTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_GreaterThan(String carrierTypeCd) {
        regCarrierTypeCd(CK_GT, fRES(carrierTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_LessThan(String carrierTypeCd) {
        regCarrierTypeCd(CK_LT, fRES(carrierTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_GreaterEqual(String carrierTypeCd) {
        regCarrierTypeCd(CK_GE, fRES(carrierTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_LessEqual(String carrierTypeCd) {
        regCarrierTypeCd(CK_LE, fRES(carrierTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCdList The collection of carrierTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_InScope(Collection<String> carrierTypeCdList) {
        doSetCarrierTypeCd_InScope(carrierTypeCdList);
    }

    protected void doSetCarrierTypeCd_InScope(Collection<String> carrierTypeCdList) {
        regINS(CK_INS, cTL(carrierTypeCdList), xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCdList The collection of carrierTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_NotInScope(Collection<String> carrierTypeCdList) {
        doSetCarrierTypeCd_NotInScope(carrierTypeCdList);
    }

    protected void doSetCarrierTypeCd_NotInScope(Collection<String> carrierTypeCdList) {
        regINS(CK_NINS, cTL(carrierTypeCdList), xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierTypeCd The value of carrierTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierTypeCd_LikeSearch(String carrierTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierTypeCd), xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierTypeCd_NotLikeSearch(String carrierTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierTypeCd), xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_PrefixSearch(String carrierTypeCd) {
        setCarrierTypeCd_LikeSearch(carrierTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     */
    public void setCarrierTypeCd_IsNull() { regCarrierTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     */
    public void setCarrierTypeCd_IsNullOrEmpty() { regCarrierTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     */
    public void setCarrierTypeCd_IsNotNull() { regCarrierTypeCd(CK_ISNN, DOBJ); }

    protected void regCarrierTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueCarrierTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_Equal(String specifyDeliveryDt) {
        doSetSpecifyDeliveryDt_Equal(fRES(specifyDeliveryDt));
    }

    protected void doSetSpecifyDeliveryDt_Equal(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_EQ, specifyDeliveryDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_NotEqual(String specifyDeliveryDt) {
        doSetSpecifyDeliveryDt_NotEqual(fRES(specifyDeliveryDt));
    }

    protected void doSetSpecifyDeliveryDt_NotEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_NES, specifyDeliveryDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_GreaterThan(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_GT, fRES(specifyDeliveryDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_LessThan(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_LT, fRES(specifyDeliveryDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_GreaterEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_GE, fRES(specifyDeliveryDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_LessEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_LE, fRES(specifyDeliveryDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDtList The collection of specifyDeliveryDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_InScope(Collection<String> specifyDeliveryDtList) {
        doSetSpecifyDeliveryDt_InScope(specifyDeliveryDtList);
    }

    protected void doSetSpecifyDeliveryDt_InScope(Collection<String> specifyDeliveryDtList) {
        regINS(CK_INS, cTL(specifyDeliveryDtList), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDtList The collection of specifyDeliveryDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_NotInScope(Collection<String> specifyDeliveryDtList) {
        doSetSpecifyDeliveryDt_NotInScope(specifyDeliveryDtList);
    }

    protected void doSetSpecifyDeliveryDt_NotInScope(Collection<String> specifyDeliveryDtList) {
        regINS(CK_NINS, cTL(specifyDeliveryDtList), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setSpecifyDeliveryDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specifyDeliveryDt The value of specifyDeliveryDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecifyDeliveryDt_LikeSearch(String specifyDeliveryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specifyDeliveryDt), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecifyDeliveryDt_NotLikeSearch(String specifyDeliveryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specifyDeliveryDt), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_PrefixSearch(String specifyDeliveryDt) {
        setSpecifyDeliveryDt_LikeSearch(specifyDeliveryDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setSpecifyDeliveryDt_IsNull() { regSpecifyDeliveryDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setSpecifyDeliveryDt_IsNullOrEmpty() { regSpecifyDeliveryDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setSpecifyDeliveryDt_IsNotNull() { regSpecifyDeliveryDt(CK_ISNN, DOBJ); }

    protected void regSpecifyDeliveryDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT"); }
    protected abstract ConditionValue xgetCValueSpecifyDeliveryDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_Equal(String specifyDeliveryTime) {
        doSetSpecifyDeliveryTime_Equal(fRES(specifyDeliveryTime));
    }

    protected void doSetSpecifyDeliveryTime_Equal(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_EQ, specifyDeliveryTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_NotEqual(String specifyDeliveryTime) {
        doSetSpecifyDeliveryTime_NotEqual(fRES(specifyDeliveryTime));
    }

    protected void doSetSpecifyDeliveryTime_NotEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_NES, specifyDeliveryTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_GreaterThan(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_GT, fRES(specifyDeliveryTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_LessThan(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_LT, fRES(specifyDeliveryTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_GreaterEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_GE, fRES(specifyDeliveryTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_LessEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_LE, fRES(specifyDeliveryTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTimeList The collection of specifyDeliveryTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_InScope(Collection<String> specifyDeliveryTimeList) {
        doSetSpecifyDeliveryTime_InScope(specifyDeliveryTimeList);
    }

    protected void doSetSpecifyDeliveryTime_InScope(Collection<String> specifyDeliveryTimeList) {
        regINS(CK_INS, cTL(specifyDeliveryTimeList), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTimeList The collection of specifyDeliveryTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_NotInScope(Collection<String> specifyDeliveryTimeList) {
        doSetSpecifyDeliveryTime_NotInScope(specifyDeliveryTimeList);
    }

    protected void doSetSpecifyDeliveryTime_NotInScope(Collection<String> specifyDeliveryTimeList) {
        regINS(CK_NINS, cTL(specifyDeliveryTimeList), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * <pre>e.g. setSpecifyDeliveryTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specifyDeliveryTime The value of specifyDeliveryTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecifyDeliveryTime_LikeSearch(String specifyDeliveryTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specifyDeliveryTime), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecifyDeliveryTime_NotLikeSearch(String specifyDeliveryTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specifyDeliveryTime), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_PrefixSearch(String specifyDeliveryTime) {
        setSpecifyDeliveryTime_LikeSearch(specifyDeliveryTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNull() { regSpecifyDeliveryTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNullOrEmpty() { regSpecifyDeliveryTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNotNull() { regSpecifyDeliveryTime(CK_ISNN, DOBJ); }

    protected void regSpecifyDeliveryTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME"); }
    protected abstract ConditionValue xgetCValueSpecifyDeliveryTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_Equal(String tenhanshaCd) {
        doSetTenhanshaCd_Equal(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_Equal(String tenhanshaCd) {
        regTenhanshaCd(CK_EQ, tenhanshaCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotEqual(String tenhanshaCd) {
        doSetTenhanshaCd_NotEqual(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_NotEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_NES, tenhanshaCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterThan(String tenhanshaCd) {
        regTenhanshaCd(CK_GT, fRES(tenhanshaCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessThan(String tenhanshaCd) {
        regTenhanshaCd(CK_LT, fRES(tenhanshaCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_GE, fRES(tenhanshaCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_LE, fRES(tenhanshaCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_InScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        regINS(CK_INS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_NotInScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        regINS(CK_NINS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaCd The value of tenhanshaCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaCd_LikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaCd_NotLikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_PrefixSearch(String tenhanshaCd) {
        setTenhanshaCd_LikeSearch(tenhanshaCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNull() { regTenhanshaCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNullOrEmpty() { regTenhanshaCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNotNull() { regTenhanshaCd(CK_ISNN, DOBJ); }

    protected void regTenhanshaCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaCd(), "TENHANSHA_CD"); }
    protected abstract ConditionValue xgetCValueTenhanshaCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_Equal(String destinationNmKana) {
        doSetDestinationNmKana_Equal(fRES(destinationNmKana));
    }

    protected void doSetDestinationNmKana_Equal(String destinationNmKana) {
        regDestinationNmKana(CK_EQ, destinationNmKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_NotEqual(String destinationNmKana) {
        doSetDestinationNmKana_NotEqual(fRES(destinationNmKana));
    }

    protected void doSetDestinationNmKana_NotEqual(String destinationNmKana) {
        regDestinationNmKana(CK_NES, destinationNmKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_GreaterThan(String destinationNmKana) {
        regDestinationNmKana(CK_GT, fRES(destinationNmKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_LessThan(String destinationNmKana) {
        regDestinationNmKana(CK_LT, fRES(destinationNmKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_GreaterEqual(String destinationNmKana) {
        regDestinationNmKana(CK_GE, fRES(destinationNmKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_LessEqual(String destinationNmKana) {
        regDestinationNmKana(CK_LE, fRES(destinationNmKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKanaList The collection of destinationNmKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_InScope(Collection<String> destinationNmKanaList) {
        doSetDestinationNmKana_InScope(destinationNmKanaList);
    }

    protected void doSetDestinationNmKana_InScope(Collection<String> destinationNmKanaList) {
        regINS(CK_INS, cTL(destinationNmKanaList), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKanaList The collection of destinationNmKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_NotInScope(Collection<String> destinationNmKanaList) {
        doSetDestinationNmKana_NotInScope(destinationNmKanaList);
    }

    protected void doSetDestinationNmKana_NotInScope(Collection<String> destinationNmKanaList) {
        regINS(CK_NINS, cTL(destinationNmKanaList), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNmKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNmKana The value of destinationNmKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNmKana_LikeSearch(String destinationNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNmKana), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNmKana_NotLikeSearch(String destinationNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNmKana), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_PrefixSearch(String destinationNmKana) {
        setDestinationNmKana_LikeSearch(destinationNmKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNull() { regDestinationNmKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNullOrEmpty() { regDestinationNmKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNotNull() { regDestinationNmKana(CK_ISNN, DOBJ); }

    protected void regDestinationNmKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA"); }
    protected abstract ConditionValue xgetCValueDestinationNmKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_Equal(String destinationFax) {
        doSetDestinationFax_Equal(fRES(destinationFax));
    }

    protected void doSetDestinationFax_Equal(String destinationFax) {
        regDestinationFax(CK_EQ, destinationFax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_NotEqual(String destinationFax) {
        doSetDestinationFax_NotEqual(fRES(destinationFax));
    }

    protected void doSetDestinationFax_NotEqual(String destinationFax) {
        regDestinationFax(CK_NES, destinationFax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_GreaterThan(String destinationFax) {
        regDestinationFax(CK_GT, fRES(destinationFax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_LessThan(String destinationFax) {
        regDestinationFax(CK_LT, fRES(destinationFax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_GreaterEqual(String destinationFax) {
        regDestinationFax(CK_GE, fRES(destinationFax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_LessEqual(String destinationFax) {
        regDestinationFax(CK_LE, fRES(destinationFax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFaxList The collection of destinationFax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_InScope(Collection<String> destinationFaxList) {
        doSetDestinationFax_InScope(destinationFaxList);
    }

    protected void doSetDestinationFax_InScope(Collection<String> destinationFaxList) {
        regINS(CK_INS, cTL(destinationFaxList), xgetCValueDestinationFax(), "DESTINATION_FAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFaxList The collection of destinationFax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_NotInScope(Collection<String> destinationFaxList) {
        doSetDestinationFax_NotInScope(destinationFaxList);
    }

    protected void doSetDestinationFax_NotInScope(Collection<String> destinationFaxList) {
        regINS(CK_NINS, cTL(destinationFaxList), xgetCValueDestinationFax(), "DESTINATION_FAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationFax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationFax The value of destinationFax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationFax_LikeSearch(String destinationFax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationFax), xgetCValueDestinationFax(), "DESTINATION_FAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationFax_NotLikeSearch(String destinationFax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationFax), xgetCValueDestinationFax(), "DESTINATION_FAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_PrefixSearch(String destinationFax) {
        setDestinationFax_LikeSearch(destinationFax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNull() { regDestinationFax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNullOrEmpty() { regDestinationFax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNotNull() { regDestinationFax(CK_ISNN, DOBJ); }

    protected void regDestinationFax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationFax(), "DESTINATION_FAX"); }
    protected abstract ConditionValue xgetCValueDestinationFax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_Equal(String kanjiMessage1) {
        doSetKanjiMessage1_Equal(fRES(kanjiMessage1));
    }

    protected void doSetKanjiMessage1_Equal(String kanjiMessage1) {
        regKanjiMessage1(CK_EQ, kanjiMessage1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_NotEqual(String kanjiMessage1) {
        doSetKanjiMessage1_NotEqual(fRES(kanjiMessage1));
    }

    protected void doSetKanjiMessage1_NotEqual(String kanjiMessage1) {
        regKanjiMessage1(CK_NES, kanjiMessage1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_GreaterThan(String kanjiMessage1) {
        regKanjiMessage1(CK_GT, fRES(kanjiMessage1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_LessThan(String kanjiMessage1) {
        regKanjiMessage1(CK_LT, fRES(kanjiMessage1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_GreaterEqual(String kanjiMessage1) {
        regKanjiMessage1(CK_GE, fRES(kanjiMessage1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_LessEqual(String kanjiMessage1) {
        regKanjiMessage1(CK_LE, fRES(kanjiMessage1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1List The collection of kanjiMessage1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_InScope(Collection<String> kanjiMessage1List) {
        doSetKanjiMessage1_InScope(kanjiMessage1List);
    }

    protected void doSetKanjiMessage1_InScope(Collection<String> kanjiMessage1List) {
        regINS(CK_INS, cTL(kanjiMessage1List), xgetCValueKanjiMessage1(), "KANJI_MESSAGE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1List The collection of kanjiMessage1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_NotInScope(Collection<String> kanjiMessage1List) {
        doSetKanjiMessage1_NotInScope(kanjiMessage1List);
    }

    protected void doSetKanjiMessage1_NotInScope(Collection<String> kanjiMessage1List) {
        regINS(CK_NINS, cTL(kanjiMessage1List), xgetCValueKanjiMessage1(), "KANJI_MESSAGE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage1 The value of kanjiMessage1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage1_LikeSearch(String kanjiMessage1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage1), xgetCValueKanjiMessage1(), "KANJI_MESSAGE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage1_NotLikeSearch(String kanjiMessage1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage1), xgetCValueKanjiMessage1(), "KANJI_MESSAGE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_PrefixSearch(String kanjiMessage1) {
        setKanjiMessage1_LikeSearch(kanjiMessage1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanjiMessage1_IsNull() { regKanjiMessage1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanjiMessage1_IsNullOrEmpty() { regKanjiMessage1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanjiMessage1_IsNotNull() { regKanjiMessage1(CK_ISNN, DOBJ); }

    protected void regKanjiMessage1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage1(), "KANJI_MESSAGE1"); }
    protected abstract ConditionValue xgetCValueKanjiMessage1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_Equal(String kanjiMessage2) {
        doSetKanjiMessage2_Equal(fRES(kanjiMessage2));
    }

    protected void doSetKanjiMessage2_Equal(String kanjiMessage2) {
        regKanjiMessage2(CK_EQ, kanjiMessage2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_NotEqual(String kanjiMessage2) {
        doSetKanjiMessage2_NotEqual(fRES(kanjiMessage2));
    }

    protected void doSetKanjiMessage2_NotEqual(String kanjiMessage2) {
        regKanjiMessage2(CK_NES, kanjiMessage2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_GreaterThan(String kanjiMessage2) {
        regKanjiMessage2(CK_GT, fRES(kanjiMessage2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_LessThan(String kanjiMessage2) {
        regKanjiMessage2(CK_LT, fRES(kanjiMessage2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_GreaterEqual(String kanjiMessage2) {
        regKanjiMessage2(CK_GE, fRES(kanjiMessage2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_LessEqual(String kanjiMessage2) {
        regKanjiMessage2(CK_LE, fRES(kanjiMessage2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2List The collection of kanjiMessage2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_InScope(Collection<String> kanjiMessage2List) {
        doSetKanjiMessage2_InScope(kanjiMessage2List);
    }

    protected void doSetKanjiMessage2_InScope(Collection<String> kanjiMessage2List) {
        regINS(CK_INS, cTL(kanjiMessage2List), xgetCValueKanjiMessage2(), "KANJI_MESSAGE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2List The collection of kanjiMessage2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_NotInScope(Collection<String> kanjiMessage2List) {
        doSetKanjiMessage2_NotInScope(kanjiMessage2List);
    }

    protected void doSetKanjiMessage2_NotInScope(Collection<String> kanjiMessage2List) {
        regINS(CK_NINS, cTL(kanjiMessage2List), xgetCValueKanjiMessage2(), "KANJI_MESSAGE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage2 The value of kanjiMessage2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage2_LikeSearch(String kanjiMessage2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage2), xgetCValueKanjiMessage2(), "KANJI_MESSAGE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage2_NotLikeSearch(String kanjiMessage2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage2), xgetCValueKanjiMessage2(), "KANJI_MESSAGE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_PrefixSearch(String kanjiMessage2) {
        setKanjiMessage2_LikeSearch(kanjiMessage2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanjiMessage2_IsNull() { regKanjiMessage2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanjiMessage2_IsNullOrEmpty() { regKanjiMessage2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanjiMessage2_IsNotNull() { regKanjiMessage2(CK_ISNN, DOBJ); }

    protected void regKanjiMessage2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage2(), "KANJI_MESSAGE2"); }
    protected abstract ConditionValue xgetCValueKanjiMessage2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_Equal(String kanjiMessage3) {
        doSetKanjiMessage3_Equal(fRES(kanjiMessage3));
    }

    protected void doSetKanjiMessage3_Equal(String kanjiMessage3) {
        regKanjiMessage3(CK_EQ, kanjiMessage3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_NotEqual(String kanjiMessage3) {
        doSetKanjiMessage3_NotEqual(fRES(kanjiMessage3));
    }

    protected void doSetKanjiMessage3_NotEqual(String kanjiMessage3) {
        regKanjiMessage3(CK_NES, kanjiMessage3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_GreaterThan(String kanjiMessage3) {
        regKanjiMessage3(CK_GT, fRES(kanjiMessage3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_LessThan(String kanjiMessage3) {
        regKanjiMessage3(CK_LT, fRES(kanjiMessage3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_GreaterEqual(String kanjiMessage3) {
        regKanjiMessage3(CK_GE, fRES(kanjiMessage3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_LessEqual(String kanjiMessage3) {
        regKanjiMessage3(CK_LE, fRES(kanjiMessage3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3List The collection of kanjiMessage3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_InScope(Collection<String> kanjiMessage3List) {
        doSetKanjiMessage3_InScope(kanjiMessage3List);
    }

    protected void doSetKanjiMessage3_InScope(Collection<String> kanjiMessage3List) {
        regINS(CK_INS, cTL(kanjiMessage3List), xgetCValueKanjiMessage3(), "KANJI_MESSAGE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3List The collection of kanjiMessage3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_NotInScope(Collection<String> kanjiMessage3List) {
        doSetKanjiMessage3_NotInScope(kanjiMessage3List);
    }

    protected void doSetKanjiMessage3_NotInScope(Collection<String> kanjiMessage3List) {
        regINS(CK_NINS, cTL(kanjiMessage3List), xgetCValueKanjiMessage3(), "KANJI_MESSAGE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage3 The value of kanjiMessage3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage3_LikeSearch(String kanjiMessage3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage3), xgetCValueKanjiMessage3(), "KANJI_MESSAGE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage3_NotLikeSearch(String kanjiMessage3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage3), xgetCValueKanjiMessage3(), "KANJI_MESSAGE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_PrefixSearch(String kanjiMessage3) {
        setKanjiMessage3_LikeSearch(kanjiMessage3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanjiMessage3_IsNull() { regKanjiMessage3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanjiMessage3_IsNullOrEmpty() { regKanjiMessage3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanjiMessage3_IsNotNull() { regKanjiMessage3(CK_ISNN, DOBJ); }

    protected void regKanjiMessage3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage3(), "KANJI_MESSAGE3"); }
    protected abstract ConditionValue xgetCValueKanjiMessage3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_Equal(String kanjiMessage4) {
        doSetKanjiMessage4_Equal(fRES(kanjiMessage4));
    }

    protected void doSetKanjiMessage4_Equal(String kanjiMessage4) {
        regKanjiMessage4(CK_EQ, kanjiMessage4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_NotEqual(String kanjiMessage4) {
        doSetKanjiMessage4_NotEqual(fRES(kanjiMessage4));
    }

    protected void doSetKanjiMessage4_NotEqual(String kanjiMessage4) {
        regKanjiMessage4(CK_NES, kanjiMessage4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_GreaterThan(String kanjiMessage4) {
        regKanjiMessage4(CK_GT, fRES(kanjiMessage4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_LessThan(String kanjiMessage4) {
        regKanjiMessage4(CK_LT, fRES(kanjiMessage4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_GreaterEqual(String kanjiMessage4) {
        regKanjiMessage4(CK_GE, fRES(kanjiMessage4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_LessEqual(String kanjiMessage4) {
        regKanjiMessage4(CK_LE, fRES(kanjiMessage4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4List The collection of kanjiMessage4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_InScope(Collection<String> kanjiMessage4List) {
        doSetKanjiMessage4_InScope(kanjiMessage4List);
    }

    protected void doSetKanjiMessage4_InScope(Collection<String> kanjiMessage4List) {
        regINS(CK_INS, cTL(kanjiMessage4List), xgetCValueKanjiMessage4(), "KANJI_MESSAGE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4List The collection of kanjiMessage4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_NotInScope(Collection<String> kanjiMessage4List) {
        doSetKanjiMessage4_NotInScope(kanjiMessage4List);
    }

    protected void doSetKanjiMessage4_NotInScope(Collection<String> kanjiMessage4List) {
        regINS(CK_NINS, cTL(kanjiMessage4List), xgetCValueKanjiMessage4(), "KANJI_MESSAGE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage4 The value of kanjiMessage4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage4_LikeSearch(String kanjiMessage4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage4), xgetCValueKanjiMessage4(), "KANJI_MESSAGE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage4_NotLikeSearch(String kanjiMessage4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage4), xgetCValueKanjiMessage4(), "KANJI_MESSAGE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_PrefixSearch(String kanjiMessage4) {
        setKanjiMessage4_LikeSearch(kanjiMessage4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanjiMessage4_IsNull() { regKanjiMessage4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanjiMessage4_IsNullOrEmpty() { regKanjiMessage4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanjiMessage4_IsNotNull() { regKanjiMessage4(CK_ISNN, DOBJ); }

    protected void regKanjiMessage4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage4(), "KANJI_MESSAGE4"); }
    protected abstract ConditionValue xgetCValueKanjiMessage4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_Equal(String kanjiMessage5) {
        doSetKanjiMessage5_Equal(fRES(kanjiMessage5));
    }

    protected void doSetKanjiMessage5_Equal(String kanjiMessage5) {
        regKanjiMessage5(CK_EQ, kanjiMessage5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_NotEqual(String kanjiMessage5) {
        doSetKanjiMessage5_NotEqual(fRES(kanjiMessage5));
    }

    protected void doSetKanjiMessage5_NotEqual(String kanjiMessage5) {
        regKanjiMessage5(CK_NES, kanjiMessage5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_GreaterThan(String kanjiMessage5) {
        regKanjiMessage5(CK_GT, fRES(kanjiMessage5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_LessThan(String kanjiMessage5) {
        regKanjiMessage5(CK_LT, fRES(kanjiMessage5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_GreaterEqual(String kanjiMessage5) {
        regKanjiMessage5(CK_GE, fRES(kanjiMessage5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_LessEqual(String kanjiMessage5) {
        regKanjiMessage5(CK_LE, fRES(kanjiMessage5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5List The collection of kanjiMessage5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_InScope(Collection<String> kanjiMessage5List) {
        doSetKanjiMessage5_InScope(kanjiMessage5List);
    }

    protected void doSetKanjiMessage5_InScope(Collection<String> kanjiMessage5List) {
        regINS(CK_INS, cTL(kanjiMessage5List), xgetCValueKanjiMessage5(), "KANJI_MESSAGE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5List The collection of kanjiMessage5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_NotInScope(Collection<String> kanjiMessage5List) {
        doSetKanjiMessage5_NotInScope(kanjiMessage5List);
    }

    protected void doSetKanjiMessage5_NotInScope(Collection<String> kanjiMessage5List) {
        regINS(CK_NINS, cTL(kanjiMessage5List), xgetCValueKanjiMessage5(), "KANJI_MESSAGE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage5 The value of kanjiMessage5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage5_LikeSearch(String kanjiMessage5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage5), xgetCValueKanjiMessage5(), "KANJI_MESSAGE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage5_NotLikeSearch(String kanjiMessage5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage5), xgetCValueKanjiMessage5(), "KANJI_MESSAGE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_PrefixSearch(String kanjiMessage5) {
        setKanjiMessage5_LikeSearch(kanjiMessage5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanjiMessage5_IsNull() { regKanjiMessage5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanjiMessage5_IsNullOrEmpty() { regKanjiMessage5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanjiMessage5_IsNotNull() { regKanjiMessage5(CK_ISNN, DOBJ); }

    protected void regKanjiMessage5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage5(), "KANJI_MESSAGE5"); }
    protected abstract ConditionValue xgetCValueKanjiMessage5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_Equal(String kanjiMessage6) {
        doSetKanjiMessage6_Equal(fRES(kanjiMessage6));
    }

    protected void doSetKanjiMessage6_Equal(String kanjiMessage6) {
        regKanjiMessage6(CK_EQ, kanjiMessage6);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_NotEqual(String kanjiMessage6) {
        doSetKanjiMessage6_NotEqual(fRES(kanjiMessage6));
    }

    protected void doSetKanjiMessage6_NotEqual(String kanjiMessage6) {
        regKanjiMessage6(CK_NES, kanjiMessage6);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_GreaterThan(String kanjiMessage6) {
        regKanjiMessage6(CK_GT, fRES(kanjiMessage6));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_LessThan(String kanjiMessage6) {
        regKanjiMessage6(CK_LT, fRES(kanjiMessage6));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_GreaterEqual(String kanjiMessage6) {
        regKanjiMessage6(CK_GE, fRES(kanjiMessage6));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_LessEqual(String kanjiMessage6) {
        regKanjiMessage6(CK_LE, fRES(kanjiMessage6));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6List The collection of kanjiMessage6 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_InScope(Collection<String> kanjiMessage6List) {
        doSetKanjiMessage6_InScope(kanjiMessage6List);
    }

    protected void doSetKanjiMessage6_InScope(Collection<String> kanjiMessage6List) {
        regINS(CK_INS, cTL(kanjiMessage6List), xgetCValueKanjiMessage6(), "KANJI_MESSAGE6");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6List The collection of kanjiMessage6 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_NotInScope(Collection<String> kanjiMessage6List) {
        doSetKanjiMessage6_NotInScope(kanjiMessage6List);
    }

    protected void doSetKanjiMessage6_NotInScope(Collection<String> kanjiMessage6List) {
        regINS(CK_NINS, cTL(kanjiMessage6List), xgetCValueKanjiMessage6(), "KANJI_MESSAGE6");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage6_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage6 The value of kanjiMessage6 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage6_LikeSearch(String kanjiMessage6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage6), xgetCValueKanjiMessage6(), "KANJI_MESSAGE6", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage6_NotLikeSearch(String kanjiMessage6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage6), xgetCValueKanjiMessage6(), "KANJI_MESSAGE6", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_PrefixSearch(String kanjiMessage6) {
        setKanjiMessage6_LikeSearch(kanjiMessage6, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanjiMessage6_IsNull() { regKanjiMessage6(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanjiMessage6_IsNullOrEmpty() { regKanjiMessage6(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanjiMessage6_IsNotNull() { regKanjiMessage6(CK_ISNN, DOBJ); }

    protected void regKanjiMessage6(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage6(), "KANJI_MESSAGE6"); }
    protected abstract ConditionValue xgetCValueKanjiMessage6();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_Equal(String kanjiMessage7) {
        doSetKanjiMessage7_Equal(fRES(kanjiMessage7));
    }

    protected void doSetKanjiMessage7_Equal(String kanjiMessage7) {
        regKanjiMessage7(CK_EQ, kanjiMessage7);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_NotEqual(String kanjiMessage7) {
        doSetKanjiMessage7_NotEqual(fRES(kanjiMessage7));
    }

    protected void doSetKanjiMessage7_NotEqual(String kanjiMessage7) {
        regKanjiMessage7(CK_NES, kanjiMessage7);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_GreaterThan(String kanjiMessage7) {
        regKanjiMessage7(CK_GT, fRES(kanjiMessage7));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_LessThan(String kanjiMessage7) {
        regKanjiMessage7(CK_LT, fRES(kanjiMessage7));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_GreaterEqual(String kanjiMessage7) {
        regKanjiMessage7(CK_GE, fRES(kanjiMessage7));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_LessEqual(String kanjiMessage7) {
        regKanjiMessage7(CK_LE, fRES(kanjiMessage7));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7List The collection of kanjiMessage7 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_InScope(Collection<String> kanjiMessage7List) {
        doSetKanjiMessage7_InScope(kanjiMessage7List);
    }

    protected void doSetKanjiMessage7_InScope(Collection<String> kanjiMessage7List) {
        regINS(CK_INS, cTL(kanjiMessage7List), xgetCValueKanjiMessage7(), "KANJI_MESSAGE7");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7List The collection of kanjiMessage7 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_NotInScope(Collection<String> kanjiMessage7List) {
        doSetKanjiMessage7_NotInScope(kanjiMessage7List);
    }

    protected void doSetKanjiMessage7_NotInScope(Collection<String> kanjiMessage7List) {
        regINS(CK_NINS, cTL(kanjiMessage7List), xgetCValueKanjiMessage7(), "KANJI_MESSAGE7");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage7_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage7 The value of kanjiMessage7 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage7_LikeSearch(String kanjiMessage7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage7), xgetCValueKanjiMessage7(), "KANJI_MESSAGE7", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage7_NotLikeSearch(String kanjiMessage7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage7), xgetCValueKanjiMessage7(), "KANJI_MESSAGE7", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_PrefixSearch(String kanjiMessage7) {
        setKanjiMessage7_LikeSearch(kanjiMessage7, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanjiMessage7_IsNull() { regKanjiMessage7(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanjiMessage7_IsNullOrEmpty() { regKanjiMessage7(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanjiMessage7_IsNotNull() { regKanjiMessage7(CK_ISNN, DOBJ); }

    protected void regKanjiMessage7(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage7(), "KANJI_MESSAGE7"); }
    protected abstract ConditionValue xgetCValueKanjiMessage7();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_Equal(String kanjiMessage8) {
        doSetKanjiMessage8_Equal(fRES(kanjiMessage8));
    }

    protected void doSetKanjiMessage8_Equal(String kanjiMessage8) {
        regKanjiMessage8(CK_EQ, kanjiMessage8);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_NotEqual(String kanjiMessage8) {
        doSetKanjiMessage8_NotEqual(fRES(kanjiMessage8));
    }

    protected void doSetKanjiMessage8_NotEqual(String kanjiMessage8) {
        regKanjiMessage8(CK_NES, kanjiMessage8);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_GreaterThan(String kanjiMessage8) {
        regKanjiMessage8(CK_GT, fRES(kanjiMessage8));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_LessThan(String kanjiMessage8) {
        regKanjiMessage8(CK_LT, fRES(kanjiMessage8));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_GreaterEqual(String kanjiMessage8) {
        regKanjiMessage8(CK_GE, fRES(kanjiMessage8));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_LessEqual(String kanjiMessage8) {
        regKanjiMessage8(CK_LE, fRES(kanjiMessage8));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8List The collection of kanjiMessage8 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_InScope(Collection<String> kanjiMessage8List) {
        doSetKanjiMessage8_InScope(kanjiMessage8List);
    }

    protected void doSetKanjiMessage8_InScope(Collection<String> kanjiMessage8List) {
        regINS(CK_INS, cTL(kanjiMessage8List), xgetCValueKanjiMessage8(), "KANJI_MESSAGE8");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8List The collection of kanjiMessage8 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_NotInScope(Collection<String> kanjiMessage8List) {
        doSetKanjiMessage8_NotInScope(kanjiMessage8List);
    }

    protected void doSetKanjiMessage8_NotInScope(Collection<String> kanjiMessage8List) {
        regINS(CK_NINS, cTL(kanjiMessage8List), xgetCValueKanjiMessage8(), "KANJI_MESSAGE8");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage8_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage8 The value of kanjiMessage8 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage8_LikeSearch(String kanjiMessage8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage8), xgetCValueKanjiMessage8(), "KANJI_MESSAGE8", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage8_NotLikeSearch(String kanjiMessage8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage8), xgetCValueKanjiMessage8(), "KANJI_MESSAGE8", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_PrefixSearch(String kanjiMessage8) {
        setKanjiMessage8_LikeSearch(kanjiMessage8, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanjiMessage8_IsNull() { regKanjiMessage8(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanjiMessage8_IsNullOrEmpty() { regKanjiMessage8(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanjiMessage8_IsNotNull() { regKanjiMessage8(CK_ISNN, DOBJ); }

    protected void regKanjiMessage8(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage8(), "KANJI_MESSAGE8"); }
    protected abstract ConditionValue xgetCValueKanjiMessage8();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_Equal(String kanjiMessage9) {
        doSetKanjiMessage9_Equal(fRES(kanjiMessage9));
    }

    protected void doSetKanjiMessage9_Equal(String kanjiMessage9) {
        regKanjiMessage9(CK_EQ, kanjiMessage9);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_NotEqual(String kanjiMessage9) {
        doSetKanjiMessage9_NotEqual(fRES(kanjiMessage9));
    }

    protected void doSetKanjiMessage9_NotEqual(String kanjiMessage9) {
        regKanjiMessage9(CK_NES, kanjiMessage9);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_GreaterThan(String kanjiMessage9) {
        regKanjiMessage9(CK_GT, fRES(kanjiMessage9));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_LessThan(String kanjiMessage9) {
        regKanjiMessage9(CK_LT, fRES(kanjiMessage9));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_GreaterEqual(String kanjiMessage9) {
        regKanjiMessage9(CK_GE, fRES(kanjiMessage9));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_LessEqual(String kanjiMessage9) {
        regKanjiMessage9(CK_LE, fRES(kanjiMessage9));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9List The collection of kanjiMessage9 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_InScope(Collection<String> kanjiMessage9List) {
        doSetKanjiMessage9_InScope(kanjiMessage9List);
    }

    protected void doSetKanjiMessage9_InScope(Collection<String> kanjiMessage9List) {
        regINS(CK_INS, cTL(kanjiMessage9List), xgetCValueKanjiMessage9(), "KANJI_MESSAGE9");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9List The collection of kanjiMessage9 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_NotInScope(Collection<String> kanjiMessage9List) {
        doSetKanjiMessage9_NotInScope(kanjiMessage9List);
    }

    protected void doSetKanjiMessage9_NotInScope(Collection<String> kanjiMessage9List) {
        regINS(CK_NINS, cTL(kanjiMessage9List), xgetCValueKanjiMessage9(), "KANJI_MESSAGE9");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage9_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage9 The value of kanjiMessage9 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage9_LikeSearch(String kanjiMessage9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage9), xgetCValueKanjiMessage9(), "KANJI_MESSAGE9", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage9_NotLikeSearch(String kanjiMessage9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage9), xgetCValueKanjiMessage9(), "KANJI_MESSAGE9", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_PrefixSearch(String kanjiMessage9) {
        setKanjiMessage9_LikeSearch(kanjiMessage9, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanjiMessage9_IsNull() { regKanjiMessage9(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanjiMessage9_IsNullOrEmpty() { regKanjiMessage9(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanjiMessage9_IsNotNull() { regKanjiMessage9(CK_ISNN, DOBJ); }

    protected void regKanjiMessage9(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage9(), "KANJI_MESSAGE9"); }
    protected abstract ConditionValue xgetCValueKanjiMessage9();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_Equal(String kanjiMessage10) {
        doSetKanjiMessage10_Equal(fRES(kanjiMessage10));
    }

    protected void doSetKanjiMessage10_Equal(String kanjiMessage10) {
        regKanjiMessage10(CK_EQ, kanjiMessage10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_NotEqual(String kanjiMessage10) {
        doSetKanjiMessage10_NotEqual(fRES(kanjiMessage10));
    }

    protected void doSetKanjiMessage10_NotEqual(String kanjiMessage10) {
        regKanjiMessage10(CK_NES, kanjiMessage10);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_GreaterThan(String kanjiMessage10) {
        regKanjiMessage10(CK_GT, fRES(kanjiMessage10));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_LessThan(String kanjiMessage10) {
        regKanjiMessage10(CK_LT, fRES(kanjiMessage10));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_GreaterEqual(String kanjiMessage10) {
        regKanjiMessage10(CK_GE, fRES(kanjiMessage10));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_LessEqual(String kanjiMessage10) {
        regKanjiMessage10(CK_LE, fRES(kanjiMessage10));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10List The collection of kanjiMessage10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_InScope(Collection<String> kanjiMessage10List) {
        doSetKanjiMessage10_InScope(kanjiMessage10List);
    }

    protected void doSetKanjiMessage10_InScope(Collection<String> kanjiMessage10List) {
        regINS(CK_INS, cTL(kanjiMessage10List), xgetCValueKanjiMessage10(), "KANJI_MESSAGE10");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10List The collection of kanjiMessage10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_NotInScope(Collection<String> kanjiMessage10List) {
        doSetKanjiMessage10_NotInScope(kanjiMessage10List);
    }

    protected void doSetKanjiMessage10_NotInScope(Collection<String> kanjiMessage10List) {
        regINS(CK_NINS, cTL(kanjiMessage10List), xgetCValueKanjiMessage10(), "KANJI_MESSAGE10");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage10_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage10 The value of kanjiMessage10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage10_LikeSearch(String kanjiMessage10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage10), xgetCValueKanjiMessage10(), "KANJI_MESSAGE10", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage10_NotLikeSearch(String kanjiMessage10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage10), xgetCValueKanjiMessage10(), "KANJI_MESSAGE10", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_PrefixSearch(String kanjiMessage10) {
        setKanjiMessage10_LikeSearch(kanjiMessage10, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanjiMessage10_IsNull() { regKanjiMessage10(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanjiMessage10_IsNullOrEmpty() { regKanjiMessage10(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanjiMessage10_IsNotNull() { regKanjiMessage10(CK_ISNN, DOBJ); }

    protected void regKanjiMessage10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage10(), "KANJI_MESSAGE10"); }
    protected abstract ConditionValue xgetCValueKanjiMessage10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_Equal(String kanaMessage1) {
        doSetKanaMessage1_Equal(fRES(kanaMessage1));
    }

    protected void doSetKanaMessage1_Equal(String kanaMessage1) {
        regKanaMessage1(CK_EQ, kanaMessage1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_NotEqual(String kanaMessage1) {
        doSetKanaMessage1_NotEqual(fRES(kanaMessage1));
    }

    protected void doSetKanaMessage1_NotEqual(String kanaMessage1) {
        regKanaMessage1(CK_NES, kanaMessage1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_GreaterThan(String kanaMessage1) {
        regKanaMessage1(CK_GT, fRES(kanaMessage1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_LessThan(String kanaMessage1) {
        regKanaMessage1(CK_LT, fRES(kanaMessage1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_GreaterEqual(String kanaMessage1) {
        regKanaMessage1(CK_GE, fRES(kanaMessage1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_LessEqual(String kanaMessage1) {
        regKanaMessage1(CK_LE, fRES(kanaMessage1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1List The collection of kanaMessage1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_InScope(Collection<String> kanaMessage1List) {
        doSetKanaMessage1_InScope(kanaMessage1List);
    }

    protected void doSetKanaMessage1_InScope(Collection<String> kanaMessage1List) {
        regINS(CK_INS, cTL(kanaMessage1List), xgetCValueKanaMessage1(), "KANA_MESSAGE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1List The collection of kanaMessage1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_NotInScope(Collection<String> kanaMessage1List) {
        doSetKanaMessage1_NotInScope(kanaMessage1List);
    }

    protected void doSetKanaMessage1_NotInScope(Collection<String> kanaMessage1List) {
        regINS(CK_NINS, cTL(kanaMessage1List), xgetCValueKanaMessage1(), "KANA_MESSAGE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage1 The value of kanaMessage1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage1_LikeSearch(String kanaMessage1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage1), xgetCValueKanaMessage1(), "KANA_MESSAGE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage1_NotLikeSearch(String kanaMessage1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage1), xgetCValueKanaMessage1(), "KANA_MESSAGE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_PrefixSearch(String kanaMessage1) {
        setKanaMessage1_LikeSearch(kanaMessage1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanaMessage1_IsNull() { regKanaMessage1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanaMessage1_IsNullOrEmpty() { regKanaMessage1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanaMessage1_IsNotNull() { regKanaMessage1(CK_ISNN, DOBJ); }

    protected void regKanaMessage1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage1(), "KANA_MESSAGE1"); }
    protected abstract ConditionValue xgetCValueKanaMessage1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_Equal(String kanaMessage2) {
        doSetKanaMessage2_Equal(fRES(kanaMessage2));
    }

    protected void doSetKanaMessage2_Equal(String kanaMessage2) {
        regKanaMessage2(CK_EQ, kanaMessage2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_NotEqual(String kanaMessage2) {
        doSetKanaMessage2_NotEqual(fRES(kanaMessage2));
    }

    protected void doSetKanaMessage2_NotEqual(String kanaMessage2) {
        regKanaMessage2(CK_NES, kanaMessage2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_GreaterThan(String kanaMessage2) {
        regKanaMessage2(CK_GT, fRES(kanaMessage2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_LessThan(String kanaMessage2) {
        regKanaMessage2(CK_LT, fRES(kanaMessage2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_GreaterEqual(String kanaMessage2) {
        regKanaMessage2(CK_GE, fRES(kanaMessage2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_LessEqual(String kanaMessage2) {
        regKanaMessage2(CK_LE, fRES(kanaMessage2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2List The collection of kanaMessage2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_InScope(Collection<String> kanaMessage2List) {
        doSetKanaMessage2_InScope(kanaMessage2List);
    }

    protected void doSetKanaMessage2_InScope(Collection<String> kanaMessage2List) {
        regINS(CK_INS, cTL(kanaMessage2List), xgetCValueKanaMessage2(), "KANA_MESSAGE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2List The collection of kanaMessage2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_NotInScope(Collection<String> kanaMessage2List) {
        doSetKanaMessage2_NotInScope(kanaMessage2List);
    }

    protected void doSetKanaMessage2_NotInScope(Collection<String> kanaMessage2List) {
        regINS(CK_NINS, cTL(kanaMessage2List), xgetCValueKanaMessage2(), "KANA_MESSAGE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage2 The value of kanaMessage2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage2_LikeSearch(String kanaMessage2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage2), xgetCValueKanaMessage2(), "KANA_MESSAGE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage2_NotLikeSearch(String kanaMessage2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage2), xgetCValueKanaMessage2(), "KANA_MESSAGE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_PrefixSearch(String kanaMessage2) {
        setKanaMessage2_LikeSearch(kanaMessage2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanaMessage2_IsNull() { regKanaMessage2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanaMessage2_IsNullOrEmpty() { regKanaMessage2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanaMessage2_IsNotNull() { regKanaMessage2(CK_ISNN, DOBJ); }

    protected void regKanaMessage2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage2(), "KANA_MESSAGE2"); }
    protected abstract ConditionValue xgetCValueKanaMessage2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_Equal(String kanaMessage3) {
        doSetKanaMessage3_Equal(fRES(kanaMessage3));
    }

    protected void doSetKanaMessage3_Equal(String kanaMessage3) {
        regKanaMessage3(CK_EQ, kanaMessage3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_NotEqual(String kanaMessage3) {
        doSetKanaMessage3_NotEqual(fRES(kanaMessage3));
    }

    protected void doSetKanaMessage3_NotEqual(String kanaMessage3) {
        regKanaMessage3(CK_NES, kanaMessage3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_GreaterThan(String kanaMessage3) {
        regKanaMessage3(CK_GT, fRES(kanaMessage3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_LessThan(String kanaMessage3) {
        regKanaMessage3(CK_LT, fRES(kanaMessage3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_GreaterEqual(String kanaMessage3) {
        regKanaMessage3(CK_GE, fRES(kanaMessage3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_LessEqual(String kanaMessage3) {
        regKanaMessage3(CK_LE, fRES(kanaMessage3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3List The collection of kanaMessage3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_InScope(Collection<String> kanaMessage3List) {
        doSetKanaMessage3_InScope(kanaMessage3List);
    }

    protected void doSetKanaMessage3_InScope(Collection<String> kanaMessage3List) {
        regINS(CK_INS, cTL(kanaMessage3List), xgetCValueKanaMessage3(), "KANA_MESSAGE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3List The collection of kanaMessage3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_NotInScope(Collection<String> kanaMessage3List) {
        doSetKanaMessage3_NotInScope(kanaMessage3List);
    }

    protected void doSetKanaMessage3_NotInScope(Collection<String> kanaMessage3List) {
        regINS(CK_NINS, cTL(kanaMessage3List), xgetCValueKanaMessage3(), "KANA_MESSAGE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage3 The value of kanaMessage3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage3_LikeSearch(String kanaMessage3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage3), xgetCValueKanaMessage3(), "KANA_MESSAGE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage3_NotLikeSearch(String kanaMessage3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage3), xgetCValueKanaMessage3(), "KANA_MESSAGE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_PrefixSearch(String kanaMessage3) {
        setKanaMessage3_LikeSearch(kanaMessage3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanaMessage3_IsNull() { regKanaMessage3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanaMessage3_IsNullOrEmpty() { regKanaMessage3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanaMessage3_IsNotNull() { regKanaMessage3(CK_ISNN, DOBJ); }

    protected void regKanaMessage3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage3(), "KANA_MESSAGE3"); }
    protected abstract ConditionValue xgetCValueKanaMessage3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_Equal(String kanaMessage4) {
        doSetKanaMessage4_Equal(fRES(kanaMessage4));
    }

    protected void doSetKanaMessage4_Equal(String kanaMessage4) {
        regKanaMessage4(CK_EQ, kanaMessage4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_NotEqual(String kanaMessage4) {
        doSetKanaMessage4_NotEqual(fRES(kanaMessage4));
    }

    protected void doSetKanaMessage4_NotEqual(String kanaMessage4) {
        regKanaMessage4(CK_NES, kanaMessage4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_GreaterThan(String kanaMessage4) {
        regKanaMessage4(CK_GT, fRES(kanaMessage4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_LessThan(String kanaMessage4) {
        regKanaMessage4(CK_LT, fRES(kanaMessage4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_GreaterEqual(String kanaMessage4) {
        regKanaMessage4(CK_GE, fRES(kanaMessage4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_LessEqual(String kanaMessage4) {
        regKanaMessage4(CK_LE, fRES(kanaMessage4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4List The collection of kanaMessage4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_InScope(Collection<String> kanaMessage4List) {
        doSetKanaMessage4_InScope(kanaMessage4List);
    }

    protected void doSetKanaMessage4_InScope(Collection<String> kanaMessage4List) {
        regINS(CK_INS, cTL(kanaMessage4List), xgetCValueKanaMessage4(), "KANA_MESSAGE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4List The collection of kanaMessage4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_NotInScope(Collection<String> kanaMessage4List) {
        doSetKanaMessage4_NotInScope(kanaMessage4List);
    }

    protected void doSetKanaMessage4_NotInScope(Collection<String> kanaMessage4List) {
        regINS(CK_NINS, cTL(kanaMessage4List), xgetCValueKanaMessage4(), "KANA_MESSAGE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage4 The value of kanaMessage4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage4_LikeSearch(String kanaMessage4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage4), xgetCValueKanaMessage4(), "KANA_MESSAGE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage4_NotLikeSearch(String kanaMessage4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage4), xgetCValueKanaMessage4(), "KANA_MESSAGE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_PrefixSearch(String kanaMessage4) {
        setKanaMessage4_LikeSearch(kanaMessage4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanaMessage4_IsNull() { regKanaMessage4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanaMessage4_IsNullOrEmpty() { regKanaMessage4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanaMessage4_IsNotNull() { regKanaMessage4(CK_ISNN, DOBJ); }

    protected void regKanaMessage4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage4(), "KANA_MESSAGE4"); }
    protected abstract ConditionValue xgetCValueKanaMessage4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_Equal(String kanaMessage5) {
        doSetKanaMessage5_Equal(fRES(kanaMessage5));
    }

    protected void doSetKanaMessage5_Equal(String kanaMessage5) {
        regKanaMessage5(CK_EQ, kanaMessage5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_NotEqual(String kanaMessage5) {
        doSetKanaMessage5_NotEqual(fRES(kanaMessage5));
    }

    protected void doSetKanaMessage5_NotEqual(String kanaMessage5) {
        regKanaMessage5(CK_NES, kanaMessage5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_GreaterThan(String kanaMessage5) {
        regKanaMessage5(CK_GT, fRES(kanaMessage5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_LessThan(String kanaMessage5) {
        regKanaMessage5(CK_LT, fRES(kanaMessage5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_GreaterEqual(String kanaMessage5) {
        regKanaMessage5(CK_GE, fRES(kanaMessage5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_LessEqual(String kanaMessage5) {
        regKanaMessage5(CK_LE, fRES(kanaMessage5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5List The collection of kanaMessage5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_InScope(Collection<String> kanaMessage5List) {
        doSetKanaMessage5_InScope(kanaMessage5List);
    }

    protected void doSetKanaMessage5_InScope(Collection<String> kanaMessage5List) {
        regINS(CK_INS, cTL(kanaMessage5List), xgetCValueKanaMessage5(), "KANA_MESSAGE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5List The collection of kanaMessage5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_NotInScope(Collection<String> kanaMessage5List) {
        doSetKanaMessage5_NotInScope(kanaMessage5List);
    }

    protected void doSetKanaMessage5_NotInScope(Collection<String> kanaMessage5List) {
        regINS(CK_NINS, cTL(kanaMessage5List), xgetCValueKanaMessage5(), "KANA_MESSAGE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage5 The value of kanaMessage5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage5_LikeSearch(String kanaMessage5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage5), xgetCValueKanaMessage5(), "KANA_MESSAGE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage5_NotLikeSearch(String kanaMessage5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage5), xgetCValueKanaMessage5(), "KANA_MESSAGE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_PrefixSearch(String kanaMessage5) {
        setKanaMessage5_LikeSearch(kanaMessage5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanaMessage5_IsNull() { regKanaMessage5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanaMessage5_IsNullOrEmpty() { regKanaMessage5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanaMessage5_IsNotNull() { regKanaMessage5(CK_ISNN, DOBJ); }

    protected void regKanaMessage5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage5(), "KANA_MESSAGE5"); }
    protected abstract ConditionValue xgetCValueKanaMessage5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_Equal(String kanaMessage6) {
        doSetKanaMessage6_Equal(fRES(kanaMessage6));
    }

    protected void doSetKanaMessage6_Equal(String kanaMessage6) {
        regKanaMessage6(CK_EQ, kanaMessage6);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_NotEqual(String kanaMessage6) {
        doSetKanaMessage6_NotEqual(fRES(kanaMessage6));
    }

    protected void doSetKanaMessage6_NotEqual(String kanaMessage6) {
        regKanaMessage6(CK_NES, kanaMessage6);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_GreaterThan(String kanaMessage6) {
        regKanaMessage6(CK_GT, fRES(kanaMessage6));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_LessThan(String kanaMessage6) {
        regKanaMessage6(CK_LT, fRES(kanaMessage6));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_GreaterEqual(String kanaMessage6) {
        regKanaMessage6(CK_GE, fRES(kanaMessage6));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_LessEqual(String kanaMessage6) {
        regKanaMessage6(CK_LE, fRES(kanaMessage6));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6List The collection of kanaMessage6 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_InScope(Collection<String> kanaMessage6List) {
        doSetKanaMessage6_InScope(kanaMessage6List);
    }

    protected void doSetKanaMessage6_InScope(Collection<String> kanaMessage6List) {
        regINS(CK_INS, cTL(kanaMessage6List), xgetCValueKanaMessage6(), "KANA_MESSAGE6");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6List The collection of kanaMessage6 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_NotInScope(Collection<String> kanaMessage6List) {
        doSetKanaMessage6_NotInScope(kanaMessage6List);
    }

    protected void doSetKanaMessage6_NotInScope(Collection<String> kanaMessage6List) {
        regINS(CK_NINS, cTL(kanaMessage6List), xgetCValueKanaMessage6(), "KANA_MESSAGE6");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage6_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage6 The value of kanaMessage6 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage6_LikeSearch(String kanaMessage6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage6), xgetCValueKanaMessage6(), "KANA_MESSAGE6", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage6_NotLikeSearch(String kanaMessage6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage6), xgetCValueKanaMessage6(), "KANA_MESSAGE6", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_PrefixSearch(String kanaMessage6) {
        setKanaMessage6_LikeSearch(kanaMessage6, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanaMessage6_IsNull() { regKanaMessage6(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanaMessage6_IsNullOrEmpty() { regKanaMessage6(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanaMessage6_IsNotNull() { regKanaMessage6(CK_ISNN, DOBJ); }

    protected void regKanaMessage6(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage6(), "KANA_MESSAGE6"); }
    protected abstract ConditionValue xgetCValueKanaMessage6();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_Equal(String kanaMessage7) {
        doSetKanaMessage7_Equal(fRES(kanaMessage7));
    }

    protected void doSetKanaMessage7_Equal(String kanaMessage7) {
        regKanaMessage7(CK_EQ, kanaMessage7);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_NotEqual(String kanaMessage7) {
        doSetKanaMessage7_NotEqual(fRES(kanaMessage7));
    }

    protected void doSetKanaMessage7_NotEqual(String kanaMessage7) {
        regKanaMessage7(CK_NES, kanaMessage7);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_GreaterThan(String kanaMessage7) {
        regKanaMessage7(CK_GT, fRES(kanaMessage7));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_LessThan(String kanaMessage7) {
        regKanaMessage7(CK_LT, fRES(kanaMessage7));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_GreaterEqual(String kanaMessage7) {
        regKanaMessage7(CK_GE, fRES(kanaMessage7));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_LessEqual(String kanaMessage7) {
        regKanaMessage7(CK_LE, fRES(kanaMessage7));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7List The collection of kanaMessage7 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_InScope(Collection<String> kanaMessage7List) {
        doSetKanaMessage7_InScope(kanaMessage7List);
    }

    protected void doSetKanaMessage7_InScope(Collection<String> kanaMessage7List) {
        regINS(CK_INS, cTL(kanaMessage7List), xgetCValueKanaMessage7(), "KANA_MESSAGE7");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7List The collection of kanaMessage7 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_NotInScope(Collection<String> kanaMessage7List) {
        doSetKanaMessage7_NotInScope(kanaMessage7List);
    }

    protected void doSetKanaMessage7_NotInScope(Collection<String> kanaMessage7List) {
        regINS(CK_NINS, cTL(kanaMessage7List), xgetCValueKanaMessage7(), "KANA_MESSAGE7");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage7_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage7 The value of kanaMessage7 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage7_LikeSearch(String kanaMessage7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage7), xgetCValueKanaMessage7(), "KANA_MESSAGE7", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage7_NotLikeSearch(String kanaMessage7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage7), xgetCValueKanaMessage7(), "KANA_MESSAGE7", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_PrefixSearch(String kanaMessage7) {
        setKanaMessage7_LikeSearch(kanaMessage7, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanaMessage7_IsNull() { regKanaMessage7(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanaMessage7_IsNullOrEmpty() { regKanaMessage7(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanaMessage7_IsNotNull() { regKanaMessage7(CK_ISNN, DOBJ); }

    protected void regKanaMessage7(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage7(), "KANA_MESSAGE7"); }
    protected abstract ConditionValue xgetCValueKanaMessage7();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_Equal(String kanaMessage8) {
        doSetKanaMessage8_Equal(fRES(kanaMessage8));
    }

    protected void doSetKanaMessage8_Equal(String kanaMessage8) {
        regKanaMessage8(CK_EQ, kanaMessage8);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_NotEqual(String kanaMessage8) {
        doSetKanaMessage8_NotEqual(fRES(kanaMessage8));
    }

    protected void doSetKanaMessage8_NotEqual(String kanaMessage8) {
        regKanaMessage8(CK_NES, kanaMessage8);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_GreaterThan(String kanaMessage8) {
        regKanaMessage8(CK_GT, fRES(kanaMessage8));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_LessThan(String kanaMessage8) {
        regKanaMessage8(CK_LT, fRES(kanaMessage8));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_GreaterEqual(String kanaMessage8) {
        regKanaMessage8(CK_GE, fRES(kanaMessage8));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_LessEqual(String kanaMessage8) {
        regKanaMessage8(CK_LE, fRES(kanaMessage8));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8List The collection of kanaMessage8 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_InScope(Collection<String> kanaMessage8List) {
        doSetKanaMessage8_InScope(kanaMessage8List);
    }

    protected void doSetKanaMessage8_InScope(Collection<String> kanaMessage8List) {
        regINS(CK_INS, cTL(kanaMessage8List), xgetCValueKanaMessage8(), "KANA_MESSAGE8");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8List The collection of kanaMessage8 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_NotInScope(Collection<String> kanaMessage8List) {
        doSetKanaMessage8_NotInScope(kanaMessage8List);
    }

    protected void doSetKanaMessage8_NotInScope(Collection<String> kanaMessage8List) {
        regINS(CK_NINS, cTL(kanaMessage8List), xgetCValueKanaMessage8(), "KANA_MESSAGE8");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage8_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage8 The value of kanaMessage8 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage8_LikeSearch(String kanaMessage8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage8), xgetCValueKanaMessage8(), "KANA_MESSAGE8", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage8_NotLikeSearch(String kanaMessage8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage8), xgetCValueKanaMessage8(), "KANA_MESSAGE8", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_PrefixSearch(String kanaMessage8) {
        setKanaMessage8_LikeSearch(kanaMessage8, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanaMessage8_IsNull() { regKanaMessage8(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanaMessage8_IsNullOrEmpty() { regKanaMessage8(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanaMessage8_IsNotNull() { regKanaMessage8(CK_ISNN, DOBJ); }

    protected void regKanaMessage8(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage8(), "KANA_MESSAGE8"); }
    protected abstract ConditionValue xgetCValueKanaMessage8();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_Equal(String kanaMessage9) {
        doSetKanaMessage9_Equal(fRES(kanaMessage9));
    }

    protected void doSetKanaMessage9_Equal(String kanaMessage9) {
        regKanaMessage9(CK_EQ, kanaMessage9);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_NotEqual(String kanaMessage9) {
        doSetKanaMessage9_NotEqual(fRES(kanaMessage9));
    }

    protected void doSetKanaMessage9_NotEqual(String kanaMessage9) {
        regKanaMessage9(CK_NES, kanaMessage9);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_GreaterThan(String kanaMessage9) {
        regKanaMessage9(CK_GT, fRES(kanaMessage9));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_LessThan(String kanaMessage9) {
        regKanaMessage9(CK_LT, fRES(kanaMessage9));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_GreaterEqual(String kanaMessage9) {
        regKanaMessage9(CK_GE, fRES(kanaMessage9));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_LessEqual(String kanaMessage9) {
        regKanaMessage9(CK_LE, fRES(kanaMessage9));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9List The collection of kanaMessage9 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_InScope(Collection<String> kanaMessage9List) {
        doSetKanaMessage9_InScope(kanaMessage9List);
    }

    protected void doSetKanaMessage9_InScope(Collection<String> kanaMessage9List) {
        regINS(CK_INS, cTL(kanaMessage9List), xgetCValueKanaMessage9(), "KANA_MESSAGE9");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9List The collection of kanaMessage9 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_NotInScope(Collection<String> kanaMessage9List) {
        doSetKanaMessage9_NotInScope(kanaMessage9List);
    }

    protected void doSetKanaMessage9_NotInScope(Collection<String> kanaMessage9List) {
        regINS(CK_NINS, cTL(kanaMessage9List), xgetCValueKanaMessage9(), "KANA_MESSAGE9");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage9_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage9 The value of kanaMessage9 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage9_LikeSearch(String kanaMessage9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage9), xgetCValueKanaMessage9(), "KANA_MESSAGE9", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage9_NotLikeSearch(String kanaMessage9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage9), xgetCValueKanaMessage9(), "KANA_MESSAGE9", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_PrefixSearch(String kanaMessage9) {
        setKanaMessage9_LikeSearch(kanaMessage9, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanaMessage9_IsNull() { regKanaMessage9(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanaMessage9_IsNullOrEmpty() { regKanaMessage9(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanaMessage9_IsNotNull() { regKanaMessage9(CK_ISNN, DOBJ); }

    protected void regKanaMessage9(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage9(), "KANA_MESSAGE9"); }
    protected abstract ConditionValue xgetCValueKanaMessage9();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_Equal(String kanaMessage10) {
        doSetKanaMessage10_Equal(fRES(kanaMessage10));
    }

    protected void doSetKanaMessage10_Equal(String kanaMessage10) {
        regKanaMessage10(CK_EQ, kanaMessage10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_NotEqual(String kanaMessage10) {
        doSetKanaMessage10_NotEqual(fRES(kanaMessage10));
    }

    protected void doSetKanaMessage10_NotEqual(String kanaMessage10) {
        regKanaMessage10(CK_NES, kanaMessage10);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_GreaterThan(String kanaMessage10) {
        regKanaMessage10(CK_GT, fRES(kanaMessage10));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_LessThan(String kanaMessage10) {
        regKanaMessage10(CK_LT, fRES(kanaMessage10));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_GreaterEqual(String kanaMessage10) {
        regKanaMessage10(CK_GE, fRES(kanaMessage10));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_LessEqual(String kanaMessage10) {
        regKanaMessage10(CK_LE, fRES(kanaMessage10));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10List The collection of kanaMessage10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_InScope(Collection<String> kanaMessage10List) {
        doSetKanaMessage10_InScope(kanaMessage10List);
    }

    protected void doSetKanaMessage10_InScope(Collection<String> kanaMessage10List) {
        regINS(CK_INS, cTL(kanaMessage10List), xgetCValueKanaMessage10(), "KANA_MESSAGE10");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10List The collection of kanaMessage10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_NotInScope(Collection<String> kanaMessage10List) {
        doSetKanaMessage10_NotInScope(kanaMessage10List);
    }

    protected void doSetKanaMessage10_NotInScope(Collection<String> kanaMessage10List) {
        regINS(CK_NINS, cTL(kanaMessage10List), xgetCValueKanaMessage10(), "KANA_MESSAGE10");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage10_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage10 The value of kanaMessage10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage10_LikeSearch(String kanaMessage10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage10), xgetCValueKanaMessage10(), "KANA_MESSAGE10", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage10_NotLikeSearch(String kanaMessage10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage10), xgetCValueKanaMessage10(), "KANA_MESSAGE10", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_PrefixSearch(String kanaMessage10) {
        setKanaMessage10_LikeSearch(kanaMessage10, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanaMessage10_IsNull() { regKanaMessage10(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanaMessage10_IsNullOrEmpty() { regKanaMessage10(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanaMessage10_IsNotNull() { regKanaMessage10(CK_ISNN, DOBJ); }

    protected void regKanaMessage10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage10(), "KANA_MESSAGE10"); }
    protected abstract ConditionValue xgetCValueKanaMessage10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_Equal(String deliveryNoteSummary) {
        doSetDeliveryNoteSummary_Equal(fRES(deliveryNoteSummary));
    }

    protected void doSetDeliveryNoteSummary_Equal(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_EQ, deliveryNoteSummary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_NotEqual(String deliveryNoteSummary) {
        doSetDeliveryNoteSummary_NotEqual(fRES(deliveryNoteSummary));
    }

    protected void doSetDeliveryNoteSummary_NotEqual(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_NES, deliveryNoteSummary);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_GreaterThan(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_GT, fRES(deliveryNoteSummary));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_LessThan(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_LT, fRES(deliveryNoteSummary));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_GreaterEqual(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_GE, fRES(deliveryNoteSummary));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_LessEqual(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_LE, fRES(deliveryNoteSummary));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummaryList The collection of deliveryNoteSummary as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_InScope(Collection<String> deliveryNoteSummaryList) {
        doSetDeliveryNoteSummary_InScope(deliveryNoteSummaryList);
    }

    protected void doSetDeliveryNoteSummary_InScope(Collection<String> deliveryNoteSummaryList) {
        regINS(CK_INS, cTL(deliveryNoteSummaryList), xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummaryList The collection of deliveryNoteSummary as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_NotInScope(Collection<String> deliveryNoteSummaryList) {
        doSetDeliveryNoteSummary_NotInScope(deliveryNoteSummaryList);
    }

    protected void doSetDeliveryNoteSummary_NotInScope(Collection<String> deliveryNoteSummaryList) {
        regINS(CK_NINS, cTL(deliveryNoteSummaryList), xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)} <br>
     * <pre>e.g. setDeliveryNoteSummary_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryNoteSummary The value of deliveryNoteSummary as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryNoteSummary_LikeSearch(String deliveryNoteSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryNoteSummary), xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryNoteSummary_NotLikeSearch(String deliveryNoteSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryNoteSummary), xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_PrefixSearch(String deliveryNoteSummary) {
        setDeliveryNoteSummary_LikeSearch(deliveryNoteSummary, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     */
    public void setDeliveryNoteSummary_IsNull() { regDeliveryNoteSummary(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     */
    public void setDeliveryNoteSummary_IsNullOrEmpty() { regDeliveryNoteSummary(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     */
    public void setDeliveryNoteSummary_IsNotNull() { regDeliveryNoteSummary(CK_ISNN, DOBJ); }

    protected void regDeliveryNoteSummary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY"); }
    protected abstract ConditionValue xgetCValueDeliveryNoteSummary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_Equal(String invoiceSummary) {
        doSetInvoiceSummary_Equal(fRES(invoiceSummary));
    }

    protected void doSetInvoiceSummary_Equal(String invoiceSummary) {
        regInvoiceSummary(CK_EQ, invoiceSummary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_NotEqual(String invoiceSummary) {
        doSetInvoiceSummary_NotEqual(fRES(invoiceSummary));
    }

    protected void doSetInvoiceSummary_NotEqual(String invoiceSummary) {
        regInvoiceSummary(CK_NES, invoiceSummary);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_GreaterThan(String invoiceSummary) {
        regInvoiceSummary(CK_GT, fRES(invoiceSummary));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_LessThan(String invoiceSummary) {
        regInvoiceSummary(CK_LT, fRES(invoiceSummary));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_GreaterEqual(String invoiceSummary) {
        regInvoiceSummary(CK_GE, fRES(invoiceSummary));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_LessEqual(String invoiceSummary) {
        regInvoiceSummary(CK_LE, fRES(invoiceSummary));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummaryList The collection of invoiceSummary as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_InScope(Collection<String> invoiceSummaryList) {
        doSetInvoiceSummary_InScope(invoiceSummaryList);
    }

    protected void doSetInvoiceSummary_InScope(Collection<String> invoiceSummaryList) {
        regINS(CK_INS, cTL(invoiceSummaryList), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummaryList The collection of invoiceSummary as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_NotInScope(Collection<String> invoiceSummaryList) {
        doSetInvoiceSummary_NotInScope(invoiceSummaryList);
    }

    protected void doSetInvoiceSummary_NotInScope(Collection<String> invoiceSummaryList) {
        regINS(CK_NINS, cTL(invoiceSummaryList), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * <pre>e.g. setInvoiceSummary_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceSummary The value of invoiceSummary as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceSummary_LikeSearch(String invoiceSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceSummary), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceSummary_NotLikeSearch(String invoiceSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceSummary), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_PrefixSearch(String invoiceSummary) {
        setInvoiceSummary_LikeSearch(invoiceSummary, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     */
    public void setInvoiceSummary_IsNull() { regInvoiceSummary(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     */
    public void setInvoiceSummary_IsNullOrEmpty() { regInvoiceSummary(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     */
    public void setInvoiceSummary_IsNotNull() { regInvoiceSummary(CK_ISNN, DOBJ); }

    protected void regInvoiceSummary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceSummary(), "INVOICE_SUMMARY"); }
    protected abstract ConditionValue xgetCValueInvoiceSummary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_Equal(String ecOrderNo) {
        doSetEcOrderNo_Equal(fRES(ecOrderNo));
    }

    protected void doSetEcOrderNo_Equal(String ecOrderNo) {
        regEcOrderNo(CK_EQ, ecOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_NotEqual(String ecOrderNo) {
        doSetEcOrderNo_NotEqual(fRES(ecOrderNo));
    }

    protected void doSetEcOrderNo_NotEqual(String ecOrderNo) {
        regEcOrderNo(CK_NES, ecOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_GreaterThan(String ecOrderNo) {
        regEcOrderNo(CK_GT, fRES(ecOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_LessThan(String ecOrderNo) {
        regEcOrderNo(CK_LT, fRES(ecOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_GreaterEqual(String ecOrderNo) {
        regEcOrderNo(CK_GE, fRES(ecOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_LessEqual(String ecOrderNo) {
        regEcOrderNo(CK_LE, fRES(ecOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNoList The collection of ecOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_InScope(Collection<String> ecOrderNoList) {
        doSetEcOrderNo_InScope(ecOrderNoList);
    }

    protected void doSetEcOrderNo_InScope(Collection<String> ecOrderNoList) {
        regINS(CK_INS, cTL(ecOrderNoList), xgetCValueEcOrderNo(), "EC_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNoList The collection of ecOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_NotInScope(Collection<String> ecOrderNoList) {
        doSetEcOrderNo_NotInScope(ecOrderNoList);
    }

    protected void doSetEcOrderNo_NotInScope(Collection<String> ecOrderNoList) {
        regINS(CK_NINS, cTL(ecOrderNoList), xgetCValueEcOrderNo(), "EC_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setEcOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecOrderNo The value of ecOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcOrderNo_LikeSearch(String ecOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecOrderNo), xgetCValueEcOrderNo(), "EC_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcOrderNo_NotLikeSearch(String ecOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecOrderNo), xgetCValueEcOrderNo(), "EC_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_PrefixSearch(String ecOrderNo) {
        setEcOrderNo_LikeSearch(ecOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     */
    public void setEcOrderNo_IsNull() { regEcOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     */
    public void setEcOrderNo_IsNullOrEmpty() { regEcOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     */
    public void setEcOrderNo_IsNotNull() { regEcOrderNo(CK_ISNN, DOBJ); }

    protected void regEcOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderNo(), "EC_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueEcOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_Equal(String paymentTypeCd) {
        doSetPaymentTypeCd_Equal(fRES(paymentTypeCd));
    }

    protected void doSetPaymentTypeCd_Equal(String paymentTypeCd) {
        regPaymentTypeCd(CK_EQ, paymentTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_NotEqual(String paymentTypeCd) {
        doSetPaymentTypeCd_NotEqual(fRES(paymentTypeCd));
    }

    protected void doSetPaymentTypeCd_NotEqual(String paymentTypeCd) {
        regPaymentTypeCd(CK_NES, paymentTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_GreaterThan(String paymentTypeCd) {
        regPaymentTypeCd(CK_GT, fRES(paymentTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_LessThan(String paymentTypeCd) {
        regPaymentTypeCd(CK_LT, fRES(paymentTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_GreaterEqual(String paymentTypeCd) {
        regPaymentTypeCd(CK_GE, fRES(paymentTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_LessEqual(String paymentTypeCd) {
        regPaymentTypeCd(CK_LE, fRES(paymentTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCdList The collection of paymentTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_InScope(Collection<String> paymentTypeCdList) {
        doSetPaymentTypeCd_InScope(paymentTypeCdList);
    }

    protected void doSetPaymentTypeCd_InScope(Collection<String> paymentTypeCdList) {
        regINS(CK_INS, cTL(paymentTypeCdList), xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCdList The collection of paymentTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_NotInScope(Collection<String> paymentTypeCdList) {
        doSetPaymentTypeCd_NotInScope(paymentTypeCdList);
    }

    protected void doSetPaymentTypeCd_NotInScope(Collection<String> paymentTypeCdList) {
        regINS(CK_NINS, cTL(paymentTypeCdList), xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPaymentTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentTypeCd The value of paymentTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentTypeCd_LikeSearch(String paymentTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentTypeCd), xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentTypeCd_NotLikeSearch(String paymentTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentTypeCd), xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_PrefixSearch(String paymentTypeCd) {
        setPaymentTypeCd_LikeSearch(paymentTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     */
    public void setPaymentTypeCd_IsNull() { regPaymentTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     */
    public void setPaymentTypeCd_IsNullOrEmpty() { regPaymentTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     */
    public void setPaymentTypeCd_IsNotNull() { regPaymentTypeCd(CK_ISNN, DOBJ); }

    protected void regPaymentTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValuePaymentTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlg The value of priceHiddenFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_Equal(String priceHiddenFlg) {
        doSetPriceHiddenFlg_Equal(fRES(priceHiddenFlg));
    }

    protected void doSetPriceHiddenFlg_Equal(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_EQ, priceHiddenFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlg The value of priceHiddenFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_NotEqual(String priceHiddenFlg) {
        doSetPriceHiddenFlg_NotEqual(fRES(priceHiddenFlg));
    }

    protected void doSetPriceHiddenFlg_NotEqual(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_NES, priceHiddenFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlg The value of priceHiddenFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_GreaterThan(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_GT, fRES(priceHiddenFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlg The value of priceHiddenFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_LessThan(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_LT, fRES(priceHiddenFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlg The value of priceHiddenFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_GreaterEqual(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_GE, fRES(priceHiddenFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlg The value of priceHiddenFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_LessEqual(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_LE, fRES(priceHiddenFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlgList The collection of priceHiddenFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_InScope(Collection<String> priceHiddenFlgList) {
        doSetPriceHiddenFlg_InScope(priceHiddenFlgList);
    }

    protected void doSetPriceHiddenFlg_InScope(Collection<String> priceHiddenFlgList) {
        regINS(CK_INS, cTL(priceHiddenFlgList), xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlgList The collection of priceHiddenFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_NotInScope(Collection<String> priceHiddenFlgList) {
        doSetPriceHiddenFlg_NotInScope(priceHiddenFlgList);
    }

    protected void doSetPriceHiddenFlg_NotInScope(Collection<String> priceHiddenFlgList) {
        regINS(CK_NINS, cTL(priceHiddenFlgList), xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)} <br>
     * <pre>e.g. setPriceHiddenFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param priceHiddenFlg The value of priceHiddenFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriceHiddenFlg_LikeSearch(String priceHiddenFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priceHiddenFlg), xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlg The value of priceHiddenFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriceHiddenFlg_NotLikeSearch(String priceHiddenFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priceHiddenFlg), xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @param priceHiddenFlg The value of priceHiddenFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_PrefixSearch(String priceHiddenFlg) {
        setPriceHiddenFlg_LikeSearch(priceHiddenFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     */
    public void setPriceHiddenFlg_IsNull() { regPriceHiddenFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     */
    public void setPriceHiddenFlg_IsNullOrEmpty() { regPriceHiddenFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     */
    public void setPriceHiddenFlg_IsNotNull() { regPriceHiddenFlg(CK_ISNN, DOBJ); }

    protected void regPriceHiddenFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG"); }
    protected abstract ConditionValue xgetCValuePriceHiddenFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_Equal(String paymentHiddenFlg) {
        doSetPaymentHiddenFlg_Equal(fRES(paymentHiddenFlg));
    }

    protected void doSetPaymentHiddenFlg_Equal(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_EQ, paymentHiddenFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_NotEqual(String paymentHiddenFlg) {
        doSetPaymentHiddenFlg_NotEqual(fRES(paymentHiddenFlg));
    }

    protected void doSetPaymentHiddenFlg_NotEqual(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_NES, paymentHiddenFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_GreaterThan(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_GT, fRES(paymentHiddenFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_LessThan(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_LT, fRES(paymentHiddenFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_GreaterEqual(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_GE, fRES(paymentHiddenFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_LessEqual(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_LE, fRES(paymentHiddenFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlgList The collection of paymentHiddenFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_InScope(Collection<String> paymentHiddenFlgList) {
        doSetPaymentHiddenFlg_InScope(paymentHiddenFlgList);
    }

    protected void doSetPaymentHiddenFlg_InScope(Collection<String> paymentHiddenFlgList) {
        regINS(CK_INS, cTL(paymentHiddenFlgList), xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlgList The collection of paymentHiddenFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_NotInScope(Collection<String> paymentHiddenFlgList) {
        doSetPaymentHiddenFlg_NotInScope(paymentHiddenFlgList);
    }

    protected void doSetPaymentHiddenFlg_NotInScope(Collection<String> paymentHiddenFlgList) {
        regINS(CK_NINS, cTL(paymentHiddenFlgList), xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)} <br>
     * <pre>e.g. setPaymentHiddenFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentHiddenFlg The value of paymentHiddenFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentHiddenFlg_LikeSearch(String paymentHiddenFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentHiddenFlg), xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentHiddenFlg_NotLikeSearch(String paymentHiddenFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentHiddenFlg), xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_PrefixSearch(String paymentHiddenFlg) {
        setPaymentHiddenFlg_LikeSearch(paymentHiddenFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     */
    public void setPaymentHiddenFlg_IsNull() { regPaymentHiddenFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     */
    public void setPaymentHiddenFlg_IsNullOrEmpty() { regPaymentHiddenFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     */
    public void setPaymentHiddenFlg_IsNotNull() { regPaymentHiddenFlg(CK_ISNN, DOBJ); }

    protected void regPaymentHiddenFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG"); }
    protected abstract ConditionValue xgetCValuePaymentHiddenFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlg The value of directUpdFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_Equal(String directUpdFlg) {
        doSetDirectUpdFlg_Equal(fRES(directUpdFlg));
    }

    protected void doSetDirectUpdFlg_Equal(String directUpdFlg) {
        regDirectUpdFlg(CK_EQ, directUpdFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlg The value of directUpdFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_NotEqual(String directUpdFlg) {
        doSetDirectUpdFlg_NotEqual(fRES(directUpdFlg));
    }

    protected void doSetDirectUpdFlg_NotEqual(String directUpdFlg) {
        regDirectUpdFlg(CK_NES, directUpdFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlg The value of directUpdFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_GreaterThan(String directUpdFlg) {
        regDirectUpdFlg(CK_GT, fRES(directUpdFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlg The value of directUpdFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_LessThan(String directUpdFlg) {
        regDirectUpdFlg(CK_LT, fRES(directUpdFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlg The value of directUpdFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_GreaterEqual(String directUpdFlg) {
        regDirectUpdFlg(CK_GE, fRES(directUpdFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlg The value of directUpdFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_LessEqual(String directUpdFlg) {
        regDirectUpdFlg(CK_LE, fRES(directUpdFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlgList The collection of directUpdFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_InScope(Collection<String> directUpdFlgList) {
        doSetDirectUpdFlg_InScope(directUpdFlgList);
    }

    protected void doSetDirectUpdFlg_InScope(Collection<String> directUpdFlgList) {
        regINS(CK_INS, cTL(directUpdFlgList), xgetCValueDirectUpdFlg(), "DIRECT_UPD_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlgList The collection of directUpdFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_NotInScope(Collection<String> directUpdFlgList) {
        doSetDirectUpdFlg_NotInScope(directUpdFlgList);
    }

    protected void doSetDirectUpdFlg_NotInScope(Collection<String> directUpdFlgList) {
        regINS(CK_NINS, cTL(directUpdFlgList), xgetCValueDirectUpdFlg(), "DIRECT_UPD_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)} <br>
     * <pre>e.g. setDirectUpdFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directUpdFlg The value of directUpdFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectUpdFlg_LikeSearch(String directUpdFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directUpdFlg), xgetCValueDirectUpdFlg(), "DIRECT_UPD_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlg The value of directUpdFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectUpdFlg_NotLikeSearch(String directUpdFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directUpdFlg), xgetCValueDirectUpdFlg(), "DIRECT_UPD_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @param directUpdFlg The value of directUpdFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectUpdFlg_PrefixSearch(String directUpdFlg) {
        setDirectUpdFlg_LikeSearch(directUpdFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     */
    public void setDirectUpdFlg_IsNull() { regDirectUpdFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     */
    public void setDirectUpdFlg_IsNullOrEmpty() { regDirectUpdFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     */
    public void setDirectUpdFlg_IsNotNull() { regDirectUpdFlg(CK_ISNN, DOBJ); }

    protected void regDirectUpdFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectUpdFlg(), "DIRECT_UPD_FLG"); }
    protected abstract ConditionValue xgetCValueDirectUpdFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_Equal(String ifId) {
        doSetIfId_Equal(fRES(ifId));
    }

    protected void doSetIfId_Equal(String ifId) {
        regIfId(CK_EQ, ifId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_NotEqual(String ifId) {
        doSetIfId_NotEqual(fRES(ifId));
    }

    protected void doSetIfId_NotEqual(String ifId) {
        regIfId(CK_NES, ifId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_GreaterThan(String ifId) {
        regIfId(CK_GT, fRES(ifId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_LessThan(String ifId) {
        regIfId(CK_LT, fRES(ifId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_GreaterEqual(String ifId) {
        regIfId(CK_GE, fRES(ifId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_LessEqual(String ifId) {
        regIfId(CK_LE, fRES(ifId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifIdList The collection of ifId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_InScope(Collection<String> ifIdList) {
        doSetIfId_InScope(ifIdList);
    }

    protected void doSetIfId_InScope(Collection<String> ifIdList) {
        regINS(CK_INS, cTL(ifIdList), xgetCValueIfId(), "IF_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifIdList The collection of ifId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_NotInScope(Collection<String> ifIdList) {
        doSetIfId_NotInScope(ifIdList);
    }

    protected void doSetIfId_NotInScope(Collection<String> ifIdList) {
        regINS(CK_NINS, cTL(ifIdList), xgetCValueIfId(), "IF_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)} <br>
     * <pre>e.g. setIfId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifId The value of ifId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfId_LikeSearch(String ifId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifId), xgetCValueIfId(), "IF_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfId_NotLikeSearch(String ifId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifId), xgetCValueIfId(), "IF_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_PrefixSearch(String ifId) {
        setIfId_LikeSearch(ifId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNull() { regIfId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNullOrEmpty() { regIfId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNotNull() { regIfId(CK_ISNN, DOBJ); }

    protected void regIfId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfId(), "IF_ID"); }
    protected abstract ConditionValue xgetCValueIfId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_Equal(String customerCd) {
        doSetCustomerCd_Equal(fRES(customerCd));
    }

    protected void doSetCustomerCd_Equal(String customerCd) {
        regCustomerCd(CK_EQ, customerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotEqual(String customerCd) {
        doSetCustomerCd_NotEqual(fRES(customerCd));
    }

    protected void doSetCustomerCd_NotEqual(String customerCd) {
        regCustomerCd(CK_NES, customerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterThan(String customerCd) {
        regCustomerCd(CK_GT, fRES(customerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessThan(String customerCd) {
        regCustomerCd(CK_LT, fRES(customerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterEqual(String customerCd) {
        regCustomerCd(CK_GE, fRES(customerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessEqual(String customerCd) {
        regCustomerCd(CK_LE, fRES(customerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCdList The collection of customerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_InScope(Collection<String> customerCdList) {
        doSetCustomerCd_InScope(customerCdList);
    }

    protected void doSetCustomerCd_InScope(Collection<String> customerCdList) {
        regINS(CK_INS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCdList The collection of customerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotInScope(Collection<String> customerCdList) {
        doSetCustomerCd_NotInScope(customerCdList);
    }

    protected void doSetCustomerCd_NotInScope(Collection<String> customerCdList) {
        regINS(CK_NINS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerCd The value of customerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerCd_LikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerCd_NotLikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        setCustomerCd_LikeSearch(customerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setCustomerCd_IsNull() { regCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setCustomerCd_IsNullOrEmpty() { regCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setCustomerCd_IsNotNull() { regCustomerCd(CK_ISNN, DOBJ); }

    protected void regCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerCd(), "CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_Equal(String customerNm) {
        doSetCustomerNm_Equal(fRES(customerNm));
    }

    protected void doSetCustomerNm_Equal(String customerNm) {
        regCustomerNm(CK_EQ, customerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotEqual(String customerNm) {
        doSetCustomerNm_NotEqual(fRES(customerNm));
    }

    protected void doSetCustomerNm_NotEqual(String customerNm) {
        regCustomerNm(CK_NES, customerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterThan(String customerNm) {
        regCustomerNm(CK_GT, fRES(customerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessThan(String customerNm) {
        regCustomerNm(CK_LT, fRES(customerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterEqual(String customerNm) {
        regCustomerNm(CK_GE, fRES(customerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessEqual(String customerNm) {
        regCustomerNm(CK_LE, fRES(customerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNmList The collection of customerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_InScope(Collection<String> customerNmList) {
        doSetCustomerNm_InScope(customerNmList);
    }

    protected void doSetCustomerNm_InScope(Collection<String> customerNmList) {
        regINS(CK_INS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNmList The collection of customerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotInScope(Collection<String> customerNmList) {
        doSetCustomerNm_NotInScope(customerNmList);
    }

    protected void doSetCustomerNm_NotInScope(Collection<String> customerNmList) {
        regINS(CK_NINS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerNm The value of customerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerNm_LikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerNm_NotLikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_PrefixSearch(String customerNm) {
        setCustomerNm_LikeSearch(customerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     */
    public void setCustomerNm_IsNull() { regCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     */
    public void setCustomerNm_IsNullOrEmpty() { regCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     */
    public void setCustomerNm_IsNotNull() { regCustomerNm(CK_ISNN, DOBJ); }

    protected void regCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerNm(), "CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_Equal(String psam) {
        doSetPsam_Equal(fRES(psam));
    }

    protected void doSetPsam_Equal(String psam) {
        regPsam(CK_EQ, psam);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_NotEqual(String psam) {
        doSetPsam_NotEqual(fRES(psam));
    }

    protected void doSetPsam_NotEqual(String psam) {
        regPsam(CK_NES, psam);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_GreaterThan(String psam) {
        regPsam(CK_GT, fRES(psam));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_LessThan(String psam) {
        regPsam(CK_LT, fRES(psam));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_GreaterEqual(String psam) {
        regPsam(CK_GE, fRES(psam));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_LessEqual(String psam) {
        regPsam(CK_LE, fRES(psam));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psamList The collection of psam as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_InScope(Collection<String> psamList) {
        doSetPsam_InScope(psamList);
    }

    protected void doSetPsam_InScope(Collection<String> psamList) {
        regINS(CK_INS, cTL(psamList), xgetCValuePsam(), "PSAM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psamList The collection of psam as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_NotInScope(Collection<String> psamList) {
        doSetPsam_NotInScope(psamList);
    }

    protected void doSetPsam_NotInScope(Collection<String> psamList) {
        regINS(CK_NINS, cTL(psamList), xgetCValuePsam(), "PSAM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)} <br>
     * <pre>e.g. setPsam_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param psam The value of psam as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPsam_LikeSearch(String psam, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(psam), xgetCValuePsam(), "PSAM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPsam_NotLikeSearch(String psam, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(psam), xgetCValuePsam(), "PSAM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_PrefixSearch(String psam) {
        setPsam_LikeSearch(psam, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNull() { regPsam(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNullOrEmpty() { regPsam(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNotNull() { regPsam(CK_ISNN, DOBJ); }

    protected void regPsam(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePsam(), "PSAM"); }
    protected abstract ConditionValue xgetCValuePsam();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_Equal(String floorCompFlg) {
        doSetFloorCompFlg_Equal(fRES(floorCompFlg));
    }

    protected void doSetFloorCompFlg_Equal(String floorCompFlg) {
        regFloorCompFlg(CK_EQ, floorCompFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_NotEqual(String floorCompFlg) {
        doSetFloorCompFlg_NotEqual(fRES(floorCompFlg));
    }

    protected void doSetFloorCompFlg_NotEqual(String floorCompFlg) {
        regFloorCompFlg(CK_NES, floorCompFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_GreaterThan(String floorCompFlg) {
        regFloorCompFlg(CK_GT, fRES(floorCompFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_LessThan(String floorCompFlg) {
        regFloorCompFlg(CK_LT, fRES(floorCompFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_GreaterEqual(String floorCompFlg) {
        regFloorCompFlg(CK_GE, fRES(floorCompFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_LessEqual(String floorCompFlg) {
        regFloorCompFlg(CK_LE, fRES(floorCompFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlgList The collection of floorCompFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_InScope(Collection<String> floorCompFlgList) {
        doSetFloorCompFlg_InScope(floorCompFlgList);
    }

    protected void doSetFloorCompFlg_InScope(Collection<String> floorCompFlgList) {
        regINS(CK_INS, cTL(floorCompFlgList), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlgList The collection of floorCompFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_NotInScope(Collection<String> floorCompFlgList) {
        doSetFloorCompFlg_NotInScope(floorCompFlgList);
    }

    protected void doSetFloorCompFlg_NotInScope(Collection<String> floorCompFlgList) {
        regINS(CK_NINS, cTL(floorCompFlgList), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)} <br>
     * <pre>e.g. setFloorCompFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param floorCompFlg The value of floorCompFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFloorCompFlg_LikeSearch(String floorCompFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(floorCompFlg), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloorCompFlg_NotLikeSearch(String floorCompFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floorCompFlg), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_PrefixSearch(String floorCompFlg) {
        setFloorCompFlg_LikeSearch(floorCompFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNull() { regFloorCompFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNullOrEmpty() { regFloorCompFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNotNull() { regFloorCompFlg(CK_ISNN, DOBJ); }

    protected void regFloorCompFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG"); }
    protected abstract ConditionValue xgetCValueFloorCompFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryType The value of deliveryType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_Equal(String deliveryType) {
        doSetDeliveryType_Equal(fRES(deliveryType));
    }

    protected void doSetDeliveryType_Equal(String deliveryType) {
        regDeliveryType(CK_EQ, deliveryType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryType The value of deliveryType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_NotEqual(String deliveryType) {
        doSetDeliveryType_NotEqual(fRES(deliveryType));
    }

    protected void doSetDeliveryType_NotEqual(String deliveryType) {
        regDeliveryType(CK_NES, deliveryType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryType The value of deliveryType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_GreaterThan(String deliveryType) {
        regDeliveryType(CK_GT, fRES(deliveryType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryType The value of deliveryType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_LessThan(String deliveryType) {
        regDeliveryType(CK_LT, fRES(deliveryType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryType The value of deliveryType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_GreaterEqual(String deliveryType) {
        regDeliveryType(CK_GE, fRES(deliveryType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryType The value of deliveryType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_LessEqual(String deliveryType) {
        regDeliveryType(CK_LE, fRES(deliveryType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryTypeList The collection of deliveryType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_InScope(Collection<String> deliveryTypeList) {
        doSetDeliveryType_InScope(deliveryTypeList);
    }

    protected void doSetDeliveryType_InScope(Collection<String> deliveryTypeList) {
        regINS(CK_INS, cTL(deliveryTypeList), xgetCValueDeliveryType(), "DELIVERY_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryTypeList The collection of deliveryType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_NotInScope(Collection<String> deliveryTypeList) {
        doSetDeliveryType_NotInScope(deliveryTypeList);
    }

    protected void doSetDeliveryType_NotInScope(Collection<String> deliveryTypeList) {
        regINS(CK_NINS, cTL(deliveryTypeList), xgetCValueDeliveryType(), "DELIVERY_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)} <br>
     * <pre>e.g. setDeliveryType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryType The value of deliveryType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryType_LikeSearch(String deliveryType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryType), xgetCValueDeliveryType(), "DELIVERY_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryType The value of deliveryType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryType_NotLikeSearch(String deliveryType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryType), xgetCValueDeliveryType(), "DELIVERY_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @param deliveryType The value of deliveryType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryType_PrefixSearch(String deliveryType) {
        setDeliveryType_LikeSearch(deliveryType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     */
    public void setDeliveryType_IsNull() { regDeliveryType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     */
    public void setDeliveryType_IsNullOrEmpty() { regDeliveryType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     */
    public void setDeliveryType_IsNotNull() { regDeliveryType(CK_ISNN, DOBJ); }

    protected void regDeliveryType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryType(), "DELIVERY_TYPE"); }
    protected abstract ConditionValue xgetCValueDeliveryType();

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
    public HpSLCFunction<TShippingInstHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TShippingInstHCB.class);
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
    public HpSLCFunction<TShippingInstHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TShippingInstHCB.class);
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
    public HpSLCFunction<TShippingInstHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TShippingInstHCB.class);
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
    public HpSLCFunction<TShippingInstHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TShippingInstHCB.class);
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
    public HpSLCFunction<TShippingInstHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TShippingInstHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TShippingInstHCB&gt;() {
     *     public void query(TShippingInstHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShippingInstHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TShippingInstHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TShippingInstHCQ sq);

    protected TShippingInstHCB xcreateScalarConditionCB() {
        TShippingInstHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TShippingInstHCB xcreateScalarConditionPartitionByCB() {
        TShippingInstHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TShippingInstHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TShippingInstHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TShippingInstHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TShippingInstHCQ sq);

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
    protected TShippingInstHCB newMyCB() {
        return new TShippingInstHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TShippingInstHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
