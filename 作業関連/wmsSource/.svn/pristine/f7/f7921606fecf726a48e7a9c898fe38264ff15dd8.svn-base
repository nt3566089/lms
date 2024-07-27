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
 * The abstract condition-query of m_zone.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMZoneCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMZoneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_zone";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param zoneId The value of zoneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_GreaterThan(Long zoneId) {
        regZoneId(CK_GT, zoneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param zoneId The value of zoneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_LessThan(Long zoneId) {
        regZoneId(CK_LT, zoneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param zoneId The value of zoneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_GreaterEqual(Long zoneId) {
        regZoneId(CK_GE, zoneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param zoneId The value of zoneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneId_LessEqual(Long zoneId) {
        regZoneId(CK_LE, zoneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of zoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZoneId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZoneId(), "ZONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param zoneIdList The collection of zoneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneId_NotInScope(Collection<Long> zoneIdList) {
        doSetZoneId_NotInScope(zoneIdList);
    }

    protected void doSetZoneId_NotInScope(Collection<Long> zoneIdList) {
        regINS(CK_NINS, cTL(zoneIdList), xgetCValueZoneId(), "ZONE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ZONE_ID from m_location where ...)} <br>
     * m_location by ZONE_ID, named 'MLocationAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepZoneId_ExistsReferrer_MLocationList(cb.query());
        registerExistsReferrer(cb.query(), "ZONE_ID", "ZONE_ID", pp, "mLocationList");
    }
    public abstract String keepZoneId_ExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select EM_REPLENISH_ZONE_ID from m_param where ...)} <br>
     * m_param by EM_REPLENISH_ZONE_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMParamList</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MParamList for 'exists'. (NotNull)
     */
    public void existsMParamList(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepZoneId_ExistsReferrer_MParamList(cb.query());
        registerExistsReferrer(cb.query(), "ZONE_ID", "EM_REPLENISH_ZONE_ID", pp, "mParamList");
    }
    public abstract String keepZoneId_ExistsReferrer_MParamList(MParamCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ZONE_ID from t_inventory_inst where ...)} <br>
     * t_inventory_inst by ZONE_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryInstList</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryInstList for 'exists'. (NotNull)
     */
    public void existsTInventoryInstList(SubQuery<TInventoryInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepZoneId_ExistsReferrer_TInventoryInstList(cb.query());
        registerExistsReferrer(cb.query(), "ZONE_ID", "ZONE_ID", pp, "tInventoryInstList");
    }
    public abstract String keepZoneId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ZONE_ID from m_location where ...)} <br>
     * m_location by ZONE_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ZoneId_NotExistsReferrer_MLocationList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepZoneId_NotExistsReferrer_MLocationList(cb.query());
        registerNotExistsReferrer(cb.query(), "ZONE_ID", "ZONE_ID", pp, "mLocationList");
    }
    public abstract String keepZoneId_NotExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select EM_REPLENISH_ZONE_ID from m_param where ...)} <br>
     * m_param by EM_REPLENISH_ZONE_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMParamList</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ZoneId_NotExistsReferrer_MParamList for 'not exists'. (NotNull)
     */
    public void notExistsMParamList(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepZoneId_NotExistsReferrer_MParamList(cb.query());
        registerNotExistsReferrer(cb.query(), "ZONE_ID", "EM_REPLENISH_ZONE_ID", pp, "mParamList");
    }
    public abstract String keepZoneId_NotExistsReferrer_MParamList(MParamCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ZONE_ID from t_inventory_inst where ...)} <br>
     * t_inventory_inst by ZONE_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryInstList</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ZoneId_NotExistsReferrer_TInventoryInstList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryInstList(SubQuery<TInventoryInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepZoneId_NotExistsReferrer_TInventoryInstList(cb.query());
        registerNotExistsReferrer(cb.query(), "ZONE_ID", "ZONE_ID", pp, "tInventoryInstList");
    }
    public abstract String keepZoneId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq);

    public void xsderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepZoneId_SpecifyDerivedReferrer_MLocationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ZONE_ID", "ZONE_ID", pp, "mLocationList", al, op);
    }
    public abstract String keepZoneId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq);

    public void xsderiveMParamList(String fn, SubQuery<MParamCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepZoneId_SpecifyDerivedReferrer_MParamList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ZONE_ID", "EM_REPLENISH_ZONE_ID", pp, "mParamList", al, op);
    }
    public abstract String keepZoneId_SpecifyDerivedReferrer_MParamList(MParamCQ sq);

    public void xsderiveTInventoryInstList(String fn, SubQuery<TInventoryInstCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepZoneId_SpecifyDerivedReferrer_TInventoryInstList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ZONE_ID", "ZONE_ID", pp, "tInventoryInstList", al, op);
    }
    public abstract String keepZoneId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_location where ...)} <br>
     * m_location by ZONE_ID, named 'MLocationAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepZoneId_QueryDerivedReferrer_MLocationList(cb.query()); String prpp = keepZoneId_QueryDerivedReferrer_MLocationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ZONE_ID", "ZONE_ID", sqpp, "mLocationList", rd, vl, prpp, op);
    }
    public abstract String keepZoneId_QueryDerivedReferrer_MLocationList(MLocationCQ sq);
    public abstract String keepZoneId_QueryDerivedReferrer_MLocationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_param where ...)} <br>
     * m_param by EM_REPLENISH_ZONE_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMParamList()</span>.<span style="color: #CC4747">max</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     paramCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MParamCB> derivedMParamList() {
        return xcreateQDRFunctionMParamList();
    }
    protected HpQDRFunction<MParamCB> xcreateQDRFunctionMParamList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMParamList(fn, sq, rd, vl, op));
    }
    public void xqderiveMParamList(String fn, SubQuery<MParamCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepZoneId_QueryDerivedReferrer_MParamList(cb.query()); String prpp = keepZoneId_QueryDerivedReferrer_MParamListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ZONE_ID", "EM_REPLENISH_ZONE_ID", sqpp, "mParamList", rd, vl, prpp, op);
    }
    public abstract String keepZoneId_QueryDerivedReferrer_MParamList(MParamCQ sq);
    public abstract String keepZoneId_QueryDerivedReferrer_MParamListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_inst where ...)} <br>
     * t_inventory_inst by ZONE_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryInstList()</span>.<span style="color: #CC4747">max</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     instCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryInstCB> derivedTInventoryInstList() {
        return xcreateQDRFunctionTInventoryInstList();
    }
    protected HpQDRFunction<TInventoryInstCB> xcreateQDRFunctionTInventoryInstList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryInstList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryInstList(String fn, SubQuery<TInventoryInstCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepZoneId_QueryDerivedReferrer_TInventoryInstList(cb.query()); String prpp = keepZoneId_QueryDerivedReferrer_TInventoryInstListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ZONE_ID", "ZONE_ID", sqpp, "tInventoryInstList", rd, vl, prpp, op);
    }
    public abstract String keepZoneId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq);
    public abstract String keepZoneId_QueryDerivedReferrer_TInventoryInstListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setZoneId_IsNull() { regZoneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setZoneId_IsNotNull() { regZoneId(CK_ISNN, DOBJ); }

    protected void regZoneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneId(), "ZONE_ID"); }
    protected abstract ConditionValue xgetCValueZoneId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
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
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
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
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterThan(Long warehouseId) {
        regWarehouseId(CK_GT, warehouseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessThan(Long warehouseId) {
        regWarehouseId(CK_LT, warehouseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_GreaterEqual(Long warehouseId) {
        regWarehouseId(CK_GE, warehouseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
     * @param warehouseId The value of warehouseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseId_LessEqual(Long warehouseId) {
        regWarehouseId(CK_LE, warehouseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
     * @param minNumber The min number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of warehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWarehouseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWarehouseId(), "WAREHOUSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
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
     * WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse}
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

    protected void regWarehouseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseId(), "WAREHOUSE_ID"); }
    protected abstract ConditionValue xgetCValueWarehouseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCd The value of zoneCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_Equal(String zoneCd) {
        doSetZoneCd_Equal(fRES(zoneCd));
    }

    protected void doSetZoneCd_Equal(String zoneCd) {
        regZoneCd(CK_EQ, zoneCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCd The value of zoneCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_NotEqual(String zoneCd) {
        doSetZoneCd_NotEqual(fRES(zoneCd));
    }

    protected void doSetZoneCd_NotEqual(String zoneCd) {
        regZoneCd(CK_NES, zoneCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCd The value of zoneCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_GreaterThan(String zoneCd) {
        regZoneCd(CK_GT, fRES(zoneCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCd The value of zoneCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_LessThan(String zoneCd) {
        regZoneCd(CK_LT, fRES(zoneCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCd The value of zoneCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_GreaterEqual(String zoneCd) {
        regZoneCd(CK_GE, fRES(zoneCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCd The value of zoneCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_LessEqual(String zoneCd) {
        regZoneCd(CK_LE, fRES(zoneCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCdList The collection of zoneCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_InScope(Collection<String> zoneCdList) {
        doSetZoneCd_InScope(zoneCdList);
    }

    protected void doSetZoneCd_InScope(Collection<String> zoneCdList) {
        regINS(CK_INS, cTL(zoneCdList), xgetCValueZoneCd(), "ZONE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCdList The collection of zoneCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_NotInScope(Collection<String> zoneCdList) {
        doSetZoneCd_NotInScope(zoneCdList);
    }

    protected void doSetZoneCd_NotInScope(Collection<String> zoneCdList) {
        regINS(CK_NINS, cTL(zoneCdList), xgetCValueZoneCd(), "ZONE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setZoneCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zoneCd The value of zoneCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZoneCd_LikeSearch(String zoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zoneCd), xgetCValueZoneCd(), "ZONE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCd The value of zoneCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZoneCd_NotLikeSearch(String zoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zoneCd), xgetCValueZoneCd(), "ZONE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param zoneCd The value of zoneCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_PrefixSearch(String zoneCd) {
        setZoneCd_LikeSearch(zoneCd, xcLSOPPre());
    }

    protected void regZoneCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneCd(), "ZONE_CD"); }
    protected abstract ConditionValue xgetCValueZoneCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNm The value of zoneNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_Equal(String zoneNm) {
        doSetZoneNm_Equal(fRES(zoneNm));
    }

    protected void doSetZoneNm_Equal(String zoneNm) {
        regZoneNm(CK_EQ, zoneNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNm The value of zoneNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_NotEqual(String zoneNm) {
        doSetZoneNm_NotEqual(fRES(zoneNm));
    }

    protected void doSetZoneNm_NotEqual(String zoneNm) {
        regZoneNm(CK_NES, zoneNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNm The value of zoneNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_GreaterThan(String zoneNm) {
        regZoneNm(CK_GT, fRES(zoneNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNm The value of zoneNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_LessThan(String zoneNm) {
        regZoneNm(CK_LT, fRES(zoneNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNm The value of zoneNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_GreaterEqual(String zoneNm) {
        regZoneNm(CK_GE, fRES(zoneNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNm The value of zoneNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_LessEqual(String zoneNm) {
        regZoneNm(CK_LE, fRES(zoneNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNmList The collection of zoneNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_InScope(Collection<String> zoneNmList) {
        doSetZoneNm_InScope(zoneNmList);
    }

    protected void doSetZoneNm_InScope(Collection<String> zoneNmList) {
        regINS(CK_INS, cTL(zoneNmList), xgetCValueZoneNm(), "ZONE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNmList The collection of zoneNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_NotInScope(Collection<String> zoneNmList) {
        doSetZoneNm_NotInScope(zoneNmList);
    }

    protected void doSetZoneNm_NotInScope(Collection<String> zoneNmList) {
        regINS(CK_NINS, cTL(zoneNmList), xgetCValueZoneNm(), "ZONE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setZoneNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zoneNm The value of zoneNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZoneNm_LikeSearch(String zoneNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zoneNm), xgetCValueZoneNm(), "ZONE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNm The value of zoneNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZoneNm_NotLikeSearch(String zoneNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zoneNm), xgetCValueZoneNm(), "ZONE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     * @param zoneNm The value of zoneNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneNm_PrefixSearch(String zoneNm) {
        setZoneNm_LikeSearch(zoneNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     */
    public void setZoneNm_IsNull() { regZoneNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     */
    public void setZoneNm_IsNullOrEmpty() { regZoneNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONE_NM: {VARCHAR(60)}
     */
    public void setZoneNm_IsNotNull() { regZoneNm(CK_ISNN, DOBJ); }

    protected void regZoneNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneNm(), "ZONE_NM"); }
    protected abstract ConditionValue xgetCValueZoneNm();

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
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCd The value of floorCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_Equal(String floorCd) {
        doSetFloorCd_Equal(fRES(floorCd));
    }

    protected void doSetFloorCd_Equal(String floorCd) {
        regFloorCd(CK_EQ, floorCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCd The value of floorCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_NotEqual(String floorCd) {
        doSetFloorCd_NotEqual(fRES(floorCd));
    }

    protected void doSetFloorCd_NotEqual(String floorCd) {
        regFloorCd(CK_NES, floorCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCd The value of floorCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_GreaterThan(String floorCd) {
        regFloorCd(CK_GT, fRES(floorCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCd The value of floorCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_LessThan(String floorCd) {
        regFloorCd(CK_LT, fRES(floorCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCd The value of floorCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_GreaterEqual(String floorCd) {
        regFloorCd(CK_GE, fRES(floorCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCd The value of floorCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_LessEqual(String floorCd) {
        regFloorCd(CK_LE, fRES(floorCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCdList The collection of floorCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_InScope(Collection<String> floorCdList) {
        doSetFloorCd_InScope(floorCdList);
    }

    protected void doSetFloorCd_InScope(Collection<String> floorCdList) {
        regINS(CK_INS, cTL(floorCdList), xgetCValueFloorCd(), "FLOOR_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCdList The collection of floorCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_NotInScope(Collection<String> floorCdList) {
        doSetFloorCd_NotInScope(floorCdList);
    }

    protected void doSetFloorCd_NotInScope(Collection<String> floorCdList) {
        regINS(CK_NINS, cTL(floorCdList), xgetCValueFloorCd(), "FLOOR_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setFloorCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param floorCd The value of floorCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFloorCd_LikeSearch(String floorCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(floorCd), xgetCValueFloorCd(), "FLOOR_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCd The value of floorCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloorCd_NotLikeSearch(String floorCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floorCd), xgetCValueFloorCd(), "FLOOR_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     * @param floorCd The value of floorCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCd_PrefixSearch(String floorCd) {
        setFloorCd_LikeSearch(floorCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     */
    public void setFloorCd_IsNull() { regFloorCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     */
    public void setFloorCd_IsNullOrEmpty() { regFloorCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR_CD: {VARCHAR(30)}
     */
    public void setFloorCd_IsNotNull() { regFloorCd(CK_ISNN, DOBJ); }

    protected void regFloorCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloorCd(), "FLOOR_CD"); }
    protected abstract ConditionValue xgetCValueFloorCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_Equal(String storageSpaceCd) {
        doSetStorageSpaceCd_Equal(fRES(storageSpaceCd));
    }

    protected void doSetStorageSpaceCd_Equal(String storageSpaceCd) {
        regStorageSpaceCd(CK_EQ, storageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_NotEqual(String storageSpaceCd) {
        doSetStorageSpaceCd_NotEqual(fRES(storageSpaceCd));
    }

    protected void doSetStorageSpaceCd_NotEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_NES, storageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_GreaterThan(String storageSpaceCd) {
        regStorageSpaceCd(CK_GT, fRES(storageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_LessThan(String storageSpaceCd) {
        regStorageSpaceCd(CK_LT, fRES(storageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_GreaterEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_GE, fRES(storageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_LessEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_LE, fRES(storageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCdList The collection of storageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_InScope(Collection<String> storageSpaceCdList) {
        doSetStorageSpaceCd_InScope(storageSpaceCdList);
    }

    protected void doSetStorageSpaceCd_InScope(Collection<String> storageSpaceCdList) {
        regINS(CK_INS, cTL(storageSpaceCdList), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCdList The collection of storageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_NotInScope(Collection<String> storageSpaceCdList) {
        doSetStorageSpaceCd_NotInScope(storageSpaceCdList);
    }

    protected void doSetStorageSpaceCd_NotInScope(Collection<String> storageSpaceCdList) {
        regINS(CK_NINS, cTL(storageSpaceCdList), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storageSpaceCd The value of storageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorageSpaceCd_LikeSearch(String storageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storageSpaceCd), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorageSpaceCd_NotLikeSearch(String storageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storageSpaceCd), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_PrefixSearch(String storageSpaceCd) {
        setStorageSpaceCd_LikeSearch(storageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNull() { regStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNullOrEmpty() { regStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNotNull() { regStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueStorageSpaceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCd The value of replenishTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_Equal(String replenishTypeCd) {
        doSetReplenishTypeCd_Equal(fRES(replenishTypeCd));
    }

    protected void doSetReplenishTypeCd_Equal(String replenishTypeCd) {
        regReplenishTypeCd(CK_EQ, replenishTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCd The value of replenishTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_NotEqual(String replenishTypeCd) {
        doSetReplenishTypeCd_NotEqual(fRES(replenishTypeCd));
    }

    protected void doSetReplenishTypeCd_NotEqual(String replenishTypeCd) {
        regReplenishTypeCd(CK_NES, replenishTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCd The value of replenishTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_GreaterThan(String replenishTypeCd) {
        regReplenishTypeCd(CK_GT, fRES(replenishTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCd The value of replenishTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_LessThan(String replenishTypeCd) {
        regReplenishTypeCd(CK_LT, fRES(replenishTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCd The value of replenishTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_GreaterEqual(String replenishTypeCd) {
        regReplenishTypeCd(CK_GE, fRES(replenishTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCd The value of replenishTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_LessEqual(String replenishTypeCd) {
        regReplenishTypeCd(CK_LE, fRES(replenishTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCdList The collection of replenishTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_InScope(Collection<String> replenishTypeCdList) {
        doSetReplenishTypeCd_InScope(replenishTypeCdList);
    }

    protected void doSetReplenishTypeCd_InScope(Collection<String> replenishTypeCdList) {
        regINS(CK_INS, cTL(replenishTypeCdList), xgetCValueReplenishTypeCd(), "REPLENISH_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCdList The collection of replenishTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_NotInScope(Collection<String> replenishTypeCdList) {
        doSetReplenishTypeCd_NotInScope(replenishTypeCdList);
    }

    protected void doSetReplenishTypeCd_NotInScope(Collection<String> replenishTypeCdList) {
        regINS(CK_NINS, cTL(replenishTypeCdList), xgetCValueReplenishTypeCd(), "REPLENISH_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setReplenishTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param replenishTypeCd The value of replenishTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReplenishTypeCd_LikeSearch(String replenishTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(replenishTypeCd), xgetCValueReplenishTypeCd(), "REPLENISH_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCd The value of replenishTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReplenishTypeCd_NotLikeSearch(String replenishTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(replenishTypeCd), xgetCValueReplenishTypeCd(), "REPLENISH_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     * @param replenishTypeCd The value of replenishTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishTypeCd_PrefixSearch(String replenishTypeCd) {
        setReplenishTypeCd_LikeSearch(replenishTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     */
    public void setReplenishTypeCd_IsNull() { regReplenishTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     */
    public void setReplenishTypeCd_IsNullOrEmpty() { regReplenishTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_TYPE_CD: {VARCHAR(30)}
     */
    public void setReplenishTypeCd_IsNotNull() { regReplenishTypeCd(CK_ISNN, DOBJ); }

    protected void regReplenishTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishTypeCd(), "REPLENISH_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueReplenishTypeCd();

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
    public HpSLCFunction<MZoneCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MZoneCB.class);
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
    public HpSLCFunction<MZoneCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MZoneCB.class);
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
    public HpSLCFunction<MZoneCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MZoneCB.class);
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
    public HpSLCFunction<MZoneCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MZoneCB.class);
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
    public HpSLCFunction<MZoneCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MZoneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MZoneCB&gt;() {
     *     public void query(MZoneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MZoneCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MZoneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MZoneCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MZoneCQ sq);

    protected MZoneCB xcreateScalarConditionCB() {
        MZoneCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MZoneCB xcreateScalarConditionPartitionByCB() {
        MZoneCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MZoneCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MZoneCB cb = new MZoneCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ZONE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MZoneCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MZoneCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MZoneCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MZoneCB cb = new MZoneCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ZONE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MZoneCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MZoneCB cb = new MZoneCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MZoneCQ sq);

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
    protected MZoneCB newMyCB() {
        return new MZoneCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MZoneCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
