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
 * The abstract condition-query of m_carrier.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCarrierCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCarrierCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_carrier";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierId The value of carrierId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_Equal(Long carrierId) {
        doSetCarrierId_Equal(carrierId);
    }

    protected void doSetCarrierId_Equal(Long carrierId) {
        regCarrierId(CK_EQ, carrierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierId The value of carrierId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_NotEqual(Long carrierId) {
        doSetCarrierId_NotEqual(carrierId);
    }

    protected void doSetCarrierId_NotEqual(Long carrierId) {
        regCarrierId(CK_NES, carrierId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierId The value of carrierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterThan(Long carrierId) {
        regCarrierId(CK_GT, carrierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierId The value of carrierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessThan(Long carrierId) {
        regCarrierId(CK_LT, carrierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierId The value of carrierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterEqual(Long carrierId) {
        regCarrierId(CK_GE, carrierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierId The value of carrierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessEqual(Long carrierId) {
        regCarrierId(CK_LE, carrierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierId(), "CARRIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierIdList The collection of carrierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_InScope(Collection<Long> carrierIdList) {
        doSetCarrierId_InScope(carrierIdList);
    }

    protected void doSetCarrierId_InScope(Collection<Long> carrierIdList) {
        regINS(CK_INS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierIdList The collection of carrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_NotInScope(Collection<Long> carrierIdList) {
        doSetCarrierId_NotInScope(carrierIdList);
    }

    protected void doSetCarrierId_NotInScope(Collection<Long> carrierIdList) {
        regINS(CK_NINS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_ID from m_base_sales_org where ...)} <br>
     * m_base_sales_org by CARRIER_ID, named 'MBaseSalesOrgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMBaseSalesOrgList</span>(orgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MBaseSalesOrgList for 'exists'. (NotNull)
     */
    public void existsMBaseSalesOrgList(SubQuery<MBaseSalesOrgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBaseSalesOrgCB cb = new MBaseSalesOrgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_ExistsReferrer_MBaseSalesOrgList(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mBaseSalesOrgList");
    }
    public abstract String keepCarrierId_ExistsReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_ID from m_carrier_box where ...)} <br>
     * m_carrier_box by CARRIER_ID, named 'MCarrierBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierBoxList</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierBoxList for 'exists'. (NotNull)
     */
    public void existsMCarrierBoxList(SubQuery<MCarrierBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_ExistsReferrer_MCarrierBoxList(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrierBoxList");
    }
    public abstract String keepCarrierId_ExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_ID2 from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID2, named 'MCarrierDecisionByCarrierId2AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierDecisionByCarrierId2List</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierDecisionByCarrierId2List for 'exists'. (NotNull)
     */
    public void existsMCarrierDecisionByCarrierId2List(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_ExistsReferrer_MCarrierDecisionByCarrierId2List(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID2", pp, "mCarrierDecisionByCarrierId2List");
    }
    public abstract String keepCarrierId_ExistsReferrer_MCarrierDecisionByCarrierId2List(MCarrierDecisionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_ID1 from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID1, named 'MCarrierDecisionByCarrierId1AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierDecisionByCarrierId1List</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierDecisionByCarrierId1List for 'exists'. (NotNull)
     */
    public void existsMCarrierDecisionByCarrierId1List(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_ExistsReferrer_MCarrierDecisionByCarrierId1List(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID1", pp, "mCarrierDecisionByCarrierId1List");
    }
    public abstract String keepCarrierId_ExistsReferrer_MCarrierDecisionByCarrierId1List(MCarrierDecisionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_ID3 from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID3, named 'MCarrierDecisionByCarrierId3AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierDecisionByCarrierId3List</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierDecisionByCarrierId3List for 'exists'. (NotNull)
     */
    public void existsMCarrierDecisionByCarrierId3List(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_ExistsReferrer_MCarrierDecisionByCarrierId3List(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID3", pp, "mCarrierDecisionByCarrierId3List");
    }
    public abstract String keepCarrierId_ExistsReferrer_MCarrierDecisionByCarrierId3List(MCarrierDecisionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_ID from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID, named 'MCarrierDecisionByCarrierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierDecisionByCarrierIdList</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierDecisionByCarrierIdList for 'exists'. (NotNull)
     */
    public void existsMCarrierDecisionByCarrierIdList(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_ExistsReferrer_MCarrierDecisionByCarrierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrierDecisionByCarrierIdList");
    }
    public abstract String keepCarrierId_ExistsReferrer_MCarrierDecisionByCarrierIdList(MCarrierDecisionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_ID from m_delivery_course where ...)} <br>
     * m_delivery_course by CARRIER_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MDeliveryCourseList for 'exists'. (NotNull)
     */
    public void existsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_ExistsReferrer_MDeliveryCourseList(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCarrierId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CARRIER_ID from m_koguchi_delivery where ...)} <br>
     * m_koguchi_delivery by CARRIER_ID, named 'MKoguchiDeliveryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMKoguchiDeliveryList</span>(deliveryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deliveryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MKoguchiDeliveryList for 'exists'. (NotNull)
     */
    public void existsMKoguchiDeliveryList(SubQuery<MKoguchiDeliveryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_ExistsReferrer_MKoguchiDeliveryList(cb.query());
        registerExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mKoguchiDeliveryList");
    }
    public abstract String keepCarrierId_ExistsReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_ID from m_base_sales_org where ...)} <br>
     * m_base_sales_org by CARRIER_ID, named 'MBaseSalesOrgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBaseSalesOrgList</span>(orgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierId_NotExistsReferrer_MBaseSalesOrgList for 'not exists'. (NotNull)
     */
    public void notExistsMBaseSalesOrgList(SubQuery<MBaseSalesOrgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBaseSalesOrgCB cb = new MBaseSalesOrgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_NotExistsReferrer_MBaseSalesOrgList(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mBaseSalesOrgList");
    }
    public abstract String keepCarrierId_NotExistsReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_ID from m_carrier_box where ...)} <br>
     * m_carrier_box by CARRIER_ID, named 'MCarrierBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierBoxList</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierId_NotExistsReferrer_MCarrierBoxList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierBoxList(SubQuery<MCarrierBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_NotExistsReferrer_MCarrierBoxList(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrierBoxList");
    }
    public abstract String keepCarrierId_NotExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_ID2 from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID2, named 'MCarrierDecisionByCarrierId2AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierDecisionByCarrierId2List</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId2List for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierDecisionByCarrierId2List(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId2List(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID2", pp, "mCarrierDecisionByCarrierId2List");
    }
    public abstract String keepCarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId2List(MCarrierDecisionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_ID1 from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID1, named 'MCarrierDecisionByCarrierId1AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierDecisionByCarrierId1List</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId1List for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierDecisionByCarrierId1List(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId1List(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID1", pp, "mCarrierDecisionByCarrierId1List");
    }
    public abstract String keepCarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId1List(MCarrierDecisionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_ID3 from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID3, named 'MCarrierDecisionByCarrierId3AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierDecisionByCarrierId3List</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId3List for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierDecisionByCarrierId3List(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId3List(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID3", pp, "mCarrierDecisionByCarrierId3List");
    }
    public abstract String keepCarrierId_NotExistsReferrer_MCarrierDecisionByCarrierId3List(MCarrierDecisionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_ID from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID, named 'MCarrierDecisionByCarrierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierDecisionByCarrierIdList</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierId_NotExistsReferrer_MCarrierDecisionByCarrierIdList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierDecisionByCarrierIdList(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_NotExistsReferrer_MCarrierDecisionByCarrierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrierDecisionByCarrierIdList");
    }
    public abstract String keepCarrierId_NotExistsReferrer_MCarrierDecisionByCarrierIdList(MCarrierDecisionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_ID from m_delivery_course where ...)} <br>
     * m_delivery_course by CARRIER_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDeliveryCourseList</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierId_NotExistsReferrer_MDeliveryCourseList for 'not exists'. (NotNull)
     */
    public void notExistsMDeliveryCourseList(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_NotExistsReferrer_MDeliveryCourseList(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mDeliveryCourseList");
    }
    public abstract String keepCarrierId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CARRIER_ID from m_koguchi_delivery where ...)} <br>
     * m_koguchi_delivery by CARRIER_ID, named 'MKoguchiDeliveryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMKoguchiDeliveryList</span>(deliveryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deliveryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CarrierId_NotExistsReferrer_MKoguchiDeliveryList for 'not exists'. (NotNull)
     */
    public void notExistsMKoguchiDeliveryList(SubQuery<MKoguchiDeliveryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCarrierId_NotExistsReferrer_MKoguchiDeliveryList(cb.query());
        registerNotExistsReferrer(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mKoguchiDeliveryList");
    }
    public abstract String keepCarrierId_NotExistsReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq);

    public void xsderiveMBaseSalesOrgList(String fn, SubQuery<MBaseSalesOrgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBaseSalesOrgCB cb = new MBaseSalesOrgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierId_SpecifyDerivedReferrer_MBaseSalesOrgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mBaseSalesOrgList", al, op);
    }
    public abstract String keepCarrierId_SpecifyDerivedReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq);

    public void xsderiveMCarrierBoxList(String fn, SubQuery<MCarrierBoxCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierId_SpecifyDerivedReferrer_MCarrierBoxList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrierBoxList", al, op);
    }
    public abstract String keepCarrierId_SpecifyDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq);

    public void xsderiveMCarrierDecisionByCarrierId2List(String fn, SubQuery<MCarrierDecisionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierId_SpecifyDerivedReferrer_MCarrierDecisionByCarrierId2List(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID2", pp, "mCarrierDecisionByCarrierId2List", al, op);
    }
    public abstract String keepCarrierId_SpecifyDerivedReferrer_MCarrierDecisionByCarrierId2List(MCarrierDecisionCQ sq);

    public void xsderiveMCarrierDecisionByCarrierId1List(String fn, SubQuery<MCarrierDecisionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierId_SpecifyDerivedReferrer_MCarrierDecisionByCarrierId1List(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID1", pp, "mCarrierDecisionByCarrierId1List", al, op);
    }
    public abstract String keepCarrierId_SpecifyDerivedReferrer_MCarrierDecisionByCarrierId1List(MCarrierDecisionCQ sq);

    public void xsderiveMCarrierDecisionByCarrierId3List(String fn, SubQuery<MCarrierDecisionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierId_SpecifyDerivedReferrer_MCarrierDecisionByCarrierId3List(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID3", pp, "mCarrierDecisionByCarrierId3List", al, op);
    }
    public abstract String keepCarrierId_SpecifyDerivedReferrer_MCarrierDecisionByCarrierId3List(MCarrierDecisionCQ sq);

    public void xsderiveMCarrierDecisionByCarrierIdList(String fn, SubQuery<MCarrierDecisionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierId_SpecifyDerivedReferrer_MCarrierDecisionByCarrierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrierDecisionByCarrierIdList", al, op);
    }
    public abstract String keepCarrierId_SpecifyDerivedReferrer_MCarrierDecisionByCarrierIdList(MCarrierDecisionCQ sq);

    public void xsderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierId_SpecifyDerivedReferrer_MDeliveryCourseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mDeliveryCourseList", al, op);
    }
    public abstract String keepCarrierId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);

    public void xsderiveMKoguchiDeliveryList(String fn, SubQuery<MKoguchiDeliveryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCarrierId_SpecifyDerivedReferrer_MKoguchiDeliveryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mKoguchiDeliveryList", al, op);
    }
    public abstract String keepCarrierId_SpecifyDerivedReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_base_sales_org where ...)} <br>
     * m_base_sales_org by CARRIER_ID, named 'MBaseSalesOrgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMBaseSalesOrgList()</span>.<span style="color: #CC4747">max</span>(orgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orgCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     orgCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MBaseSalesOrgCB> derivedMBaseSalesOrgList() {
        return xcreateQDRFunctionMBaseSalesOrgList();
    }
    protected HpQDRFunction<MBaseSalesOrgCB> xcreateQDRFunctionMBaseSalesOrgList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMBaseSalesOrgList(fn, sq, rd, vl, op));
    }
    public void xqderiveMBaseSalesOrgList(String fn, SubQuery<MBaseSalesOrgCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBaseSalesOrgCB cb = new MBaseSalesOrgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierId_QueryDerivedReferrer_MBaseSalesOrgList(cb.query()); String prpp = keepCarrierId_QueryDerivedReferrer_MBaseSalesOrgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", sqpp, "mBaseSalesOrgList", rd, vl, prpp, op);
    }
    public abstract String keepCarrierId_QueryDerivedReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq);
    public abstract String keepCarrierId_QueryDerivedReferrer_MBaseSalesOrgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_box where ...)} <br>
     * m_carrier_box by CARRIER_ID, named 'MCarrierBoxAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierBoxList()</span>.<span style="color: #CC4747">max</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     boxCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     boxCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierBoxCB> derivedMCarrierBoxList() {
        return xcreateQDRFunctionMCarrierBoxList();
    }
    protected HpQDRFunction<MCarrierBoxCB> xcreateQDRFunctionMCarrierBoxList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierBoxList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierBoxList(String fn, SubQuery<MCarrierBoxCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierBoxCB cb = new MCarrierBoxCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierId_QueryDerivedReferrer_MCarrierBoxList(cb.query()); String prpp = keepCarrierId_QueryDerivedReferrer_MCarrierBoxListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", sqpp, "mCarrierBoxList", rd, vl, prpp, op);
    }
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq);
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierBoxListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID2, named 'MCarrierDecisionByCarrierId2AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierDecisionByCarrierId2List()</span>.<span style="color: #CC4747">max</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     decisionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierDecisionCB> derivedMCarrierDecisionByCarrierId2List() {
        return xcreateQDRFunctionMCarrierDecisionByCarrierId2List();
    }
    protected HpQDRFunction<MCarrierDecisionCB> xcreateQDRFunctionMCarrierDecisionByCarrierId2List() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierDecisionByCarrierId2List(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierDecisionByCarrierId2List(String fn, SubQuery<MCarrierDecisionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId2List(cb.query()); String prpp = keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId2ListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID2", sqpp, "mCarrierDecisionByCarrierId2List", rd, vl, prpp, op);
    }
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId2List(MCarrierDecisionCQ sq);
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId2ListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID1, named 'MCarrierDecisionByCarrierId1AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierDecisionByCarrierId1List()</span>.<span style="color: #CC4747">max</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     decisionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierDecisionCB> derivedMCarrierDecisionByCarrierId1List() {
        return xcreateQDRFunctionMCarrierDecisionByCarrierId1List();
    }
    protected HpQDRFunction<MCarrierDecisionCB> xcreateQDRFunctionMCarrierDecisionByCarrierId1List() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierDecisionByCarrierId1List(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierDecisionByCarrierId1List(String fn, SubQuery<MCarrierDecisionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId1List(cb.query()); String prpp = keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId1ListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID1", sqpp, "mCarrierDecisionByCarrierId1List", rd, vl, prpp, op);
    }
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId1List(MCarrierDecisionCQ sq);
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId1ListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID3, named 'MCarrierDecisionByCarrierId3AsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierDecisionByCarrierId3List()</span>.<span style="color: #CC4747">max</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     decisionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierDecisionCB> derivedMCarrierDecisionByCarrierId3List() {
        return xcreateQDRFunctionMCarrierDecisionByCarrierId3List();
    }
    protected HpQDRFunction<MCarrierDecisionCB> xcreateQDRFunctionMCarrierDecisionByCarrierId3List() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierDecisionByCarrierId3List(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierDecisionByCarrierId3List(String fn, SubQuery<MCarrierDecisionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId3List(cb.query()); String prpp = keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId3ListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID3", sqpp, "mCarrierDecisionByCarrierId3List", rd, vl, prpp, op);
    }
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId3List(MCarrierDecisionCQ sq);
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierId3ListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CARRIER_ID, named 'MCarrierDecisionByCarrierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierDecisionByCarrierIdList()</span>.<span style="color: #CC4747">max</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     decisionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierDecisionCB> derivedMCarrierDecisionByCarrierIdList() {
        return xcreateQDRFunctionMCarrierDecisionByCarrierIdList();
    }
    protected HpQDRFunction<MCarrierDecisionCB> xcreateQDRFunctionMCarrierDecisionByCarrierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierDecisionByCarrierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierDecisionByCarrierIdList(String fn, SubQuery<MCarrierDecisionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierIdList(cb.query()); String prpp = keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", sqpp, "mCarrierDecisionByCarrierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierIdList(MCarrierDecisionCQ sq);
    public abstract String keepCarrierId_QueryDerivedReferrer_MCarrierDecisionByCarrierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_delivery_course where ...)} <br>
     * m_delivery_course by CARRIER_ID, named 'MDeliveryCourseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMDeliveryCourseList()</span>.<span style="color: #CC4747">max</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     courseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     courseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MDeliveryCourseCB> derivedMDeliveryCourseList() {
        return xcreateQDRFunctionMDeliveryCourseList();
    }
    protected HpQDRFunction<MDeliveryCourseCB> xcreateQDRFunctionMDeliveryCourseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMDeliveryCourseList(fn, sq, rd, vl, op));
    }
    public void xqderiveMDeliveryCourseList(String fn, SubQuery<MDeliveryCourseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierId_QueryDerivedReferrer_MDeliveryCourseList(cb.query()); String prpp = keepCarrierId_QueryDerivedReferrer_MDeliveryCourseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", sqpp, "mDeliveryCourseList", rd, vl, prpp, op);
    }
    public abstract String keepCarrierId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq);
    public abstract String keepCarrierId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_koguchi_delivery where ...)} <br>
     * m_koguchi_delivery by CARRIER_ID, named 'MKoguchiDeliveryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMKoguchiDeliveryList()</span>.<span style="color: #CC4747">max</span>(deliveryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deliveryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     deliveryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MKoguchiDeliveryCB> derivedMKoguchiDeliveryList() {
        return xcreateQDRFunctionMKoguchiDeliveryList();
    }
    protected HpQDRFunction<MKoguchiDeliveryCB> xcreateQDRFunctionMKoguchiDeliveryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMKoguchiDeliveryList(fn, sq, rd, vl, op));
    }
    public void xqderiveMKoguchiDeliveryList(String fn, SubQuery<MKoguchiDeliveryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCarrierId_QueryDerivedReferrer_MKoguchiDeliveryList(cb.query()); String prpp = keepCarrierId_QueryDerivedReferrer_MKoguchiDeliveryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CARRIER_ID", "CARRIER_ID", sqpp, "mKoguchiDeliveryList", rd, vl, prpp, op);
    }
    public abstract String keepCarrierId_QueryDerivedReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq);
    public abstract String keepCarrierId_QueryDerivedReferrer_MKoguchiDeliveryListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCarrierId_IsNull() { regCarrierId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCarrierId_IsNotNull() { regCarrierId(CK_ISNN, DOBJ); }

    protected void regCarrierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierId(), "CARRIER_ID"); }
    protected abstract ConditionValue xgetCValueCarrierId();

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
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param commonCarrierId The value of commonCarrierId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_Equal(Long commonCarrierId) {
        doSetCommonCarrierId_Equal(commonCarrierId);
    }

    protected void doSetCommonCarrierId_Equal(Long commonCarrierId) {
        regCommonCarrierId(CK_EQ, commonCarrierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param commonCarrierId The value of commonCarrierId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_NotEqual(Long commonCarrierId) {
        doSetCommonCarrierId_NotEqual(commonCarrierId);
    }

    protected void doSetCommonCarrierId_NotEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_NES, commonCarrierId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param commonCarrierId The value of commonCarrierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_GreaterThan(Long commonCarrierId) {
        regCommonCarrierId(CK_GT, commonCarrierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param commonCarrierId The value of commonCarrierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_LessThan(Long commonCarrierId) {
        regCommonCarrierId(CK_LT, commonCarrierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param commonCarrierId The value of commonCarrierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_GreaterEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_GE, commonCarrierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param commonCarrierId The value of commonCarrierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_LessEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_LE, commonCarrierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param minNumber The min number of commonCarrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of commonCarrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCommonCarrierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param commonCarrierIdList The collection of commonCarrierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonCarrierId_InScope(Collection<Long> commonCarrierIdList) {
        doSetCommonCarrierId_InScope(commonCarrierIdList);
    }

    protected void doSetCommonCarrierId_InScope(Collection<Long> commonCarrierIdList) {
        regINS(CK_INS, cTL(commonCarrierIdList), xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @param commonCarrierIdList The collection of commonCarrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonCarrierId_NotInScope(Collection<Long> commonCarrierIdList) {
        doSetCommonCarrierId_NotInScope(commonCarrierIdList);
    }

    protected void doSetCommonCarrierId_NotInScope(Collection<Long> commonCarrierIdList) {
        regINS(CK_NINS, cTL(commonCarrierIdList), xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select COMMON_CARRIER_ID from m_common_carrier where ...)} <br />
     * m_common_carrier by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @param subCBLambda The callback for sub-query of MCommonCarrier for 'in-scope'. (NotNull)
     */
    public void inScopeMCommonCarrier(SubQuery<MCommonCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCommonCarrierCB cb = new MCommonCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCommonCarrierId_InScopeRelation_MCommonCarrier(cb.query());
        registerInScopeRelation(cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCommonCarrier", false);
    }
    public abstract String keepCommonCarrierId_InScopeRelation_MCommonCarrier(MCommonCarrierCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select COMMON_CARRIER_ID from m_common_carrier where ...)} <br />
     * m_common_carrier by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @param subCBLambda The callback for sub-query of MCommonCarrier for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCommonCarrier(SubQuery<MCommonCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCommonCarrierCB cb = new MCommonCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCommonCarrierId_NotInScopeRelation_MCommonCarrier(cb.query());
        registerInScopeRelation(cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCommonCarrier", true);
    }
    public abstract String keepCommonCarrierId_NotInScopeRelation_MCommonCarrier(MCommonCarrierCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     */
    public void setCommonCarrierId_IsNull() { regCommonCarrierId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     */
    public void setCommonCarrierId_IsNotNull() { regCommonCarrierId(CK_ISNN, DOBJ); }

    protected void regCommonCarrierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID"); }
    protected abstract ConditionValue xgetCValueCommonCarrierId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
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
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
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
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     * @param carrierCd The value of carrierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterThan(String carrierCd) {
        regCarrierCd(CK_GT, fRES(carrierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     * @param carrierCd The value of carrierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessThan(String carrierCd) {
        regCarrierCd(CK_LT, fRES(carrierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     * @param carrierCd The value of carrierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterEqual(String carrierCd) {
        regCarrierCd(CK_GE, fRES(carrierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     * @param carrierCd The value of carrierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessEqual(String carrierCd) {
        regCarrierCd(CK_LE, fRES(carrierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
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
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
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
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)} <br>
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
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     * @param carrierCd The value of carrierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd_NotLikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     * @param carrierCd The value of carrierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_PrefixSearch(String carrierCd) {
        setCarrierCd_LikeSearch(carrierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     */
    public void setCarrierCd_IsNull() { regCarrierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     */
    public void setCarrierCd_IsNullOrEmpty() { regCarrierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     */
    public void setCarrierCd_IsNotNull() { regCarrierCd(CK_ISNN, DOBJ); }

    protected void regCarrierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd(), "CARRIER_CD"); }
    protected abstract ConditionValue xgetCValueCarrierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNm The value of carrierNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_Equal(String carrierNm) {
        doSetCarrierNm_Equal(fRES(carrierNm));
    }

    protected void doSetCarrierNm_Equal(String carrierNm) {
        regCarrierNm(CK_EQ, carrierNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNm The value of carrierNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_NotEqual(String carrierNm) {
        doSetCarrierNm_NotEqual(fRES(carrierNm));
    }

    protected void doSetCarrierNm_NotEqual(String carrierNm) {
        regCarrierNm(CK_NES, carrierNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNm The value of carrierNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterThan(String carrierNm) {
        regCarrierNm(CK_GT, fRES(carrierNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNm The value of carrierNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessThan(String carrierNm) {
        regCarrierNm(CK_LT, fRES(carrierNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNm The value of carrierNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterEqual(String carrierNm) {
        regCarrierNm(CK_GE, fRES(carrierNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNm The value of carrierNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessEqual(String carrierNm) {
        regCarrierNm(CK_LE, fRES(carrierNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNmList The collection of carrierNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_InScope(Collection<String> carrierNmList) {
        doSetCarrierNm_InScope(carrierNmList);
    }

    protected void doSetCarrierNm_InScope(Collection<String> carrierNmList) {
        regINS(CK_INS, cTL(carrierNmList), xgetCValueCarrierNm(), "CARRIER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNmList The collection of carrierNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_NotInScope(Collection<String> carrierNmList) {
        doSetCarrierNm_NotInScope(carrierNmList);
    }

    protected void doSetCarrierNm_NotInScope(Collection<String> carrierNmList) {
        regINS(CK_NINS, cTL(carrierNmList), xgetCValueCarrierNm(), "CARRIER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setCarrierNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierNm The value of carrierNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierNm_LikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNm The value of carrierNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierNm_NotLikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @param carrierNm The value of carrierNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_PrefixSearch(String carrierNm) {
        setCarrierNm_LikeSearch(carrierNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     */
    public void setCarrierNm_IsNull() { regCarrierNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     */
    public void setCarrierNm_IsNullOrEmpty() { regCarrierNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(60)}
     */
    public void setCarrierNm_IsNotNull() { regCarrierNm(CK_ISNN, DOBJ); }

    protected void regCarrierNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierNm(), "CARRIER_NM"); }
    protected abstract ConditionValue xgetCValueCarrierNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbr The value of carrierAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_Equal(String carrierAbbr) {
        doSetCarrierAbbr_Equal(fRES(carrierAbbr));
    }

    protected void doSetCarrierAbbr_Equal(String carrierAbbr) {
        regCarrierAbbr(CK_EQ, carrierAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbr The value of carrierAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_NotEqual(String carrierAbbr) {
        doSetCarrierAbbr_NotEqual(fRES(carrierAbbr));
    }

    protected void doSetCarrierAbbr_NotEqual(String carrierAbbr) {
        regCarrierAbbr(CK_NES, carrierAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbr The value of carrierAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_GreaterThan(String carrierAbbr) {
        regCarrierAbbr(CK_GT, fRES(carrierAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbr The value of carrierAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_LessThan(String carrierAbbr) {
        regCarrierAbbr(CK_LT, fRES(carrierAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbr The value of carrierAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_GreaterEqual(String carrierAbbr) {
        regCarrierAbbr(CK_GE, fRES(carrierAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbr The value of carrierAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_LessEqual(String carrierAbbr) {
        regCarrierAbbr(CK_LE, fRES(carrierAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbrList The collection of carrierAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_InScope(Collection<String> carrierAbbrList) {
        doSetCarrierAbbr_InScope(carrierAbbrList);
    }

    protected void doSetCarrierAbbr_InScope(Collection<String> carrierAbbrList) {
        regINS(CK_INS, cTL(carrierAbbrList), xgetCValueCarrierAbbr(), "CARRIER_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbrList The collection of carrierAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_NotInScope(Collection<String> carrierAbbrList) {
        doSetCarrierAbbr_NotInScope(carrierAbbrList);
    }

    protected void doSetCarrierAbbr_NotInScope(Collection<String> carrierAbbrList) {
        regINS(CK_NINS, cTL(carrierAbbrList), xgetCValueCarrierAbbr(), "CARRIER_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)} <br>
     * <pre>e.g. setCarrierAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierAbbr The value of carrierAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierAbbr_LikeSearch(String carrierAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierAbbr), xgetCValueCarrierAbbr(), "CARRIER_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbr The value of carrierAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierAbbr_NotLikeSearch(String carrierAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierAbbr), xgetCValueCarrierAbbr(), "CARRIER_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     * @param carrierAbbr The value of carrierAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_PrefixSearch(String carrierAbbr) {
        setCarrierAbbr_LikeSearch(carrierAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     */
    public void setCarrierAbbr_IsNull() { regCarrierAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     */
    public void setCarrierAbbr_IsNullOrEmpty() { regCarrierAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {VARCHAR(60)}
     */
    public void setCarrierAbbr_IsNotNull() { regCarrierAbbr(CK_ISNN, DOBJ); }

    protected void regCarrierAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierAbbr(), "CARRIER_ABBR"); }
    protected abstract ConditionValue xgetCValueCarrierAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_Equal(String largeItemHadlingFlg) {
        doSetLargeItemHadlingFlg_Equal(fRES(largeItemHadlingFlg));
    }

    protected void doSetLargeItemHadlingFlg_Equal(String largeItemHadlingFlg) {
        regLargeItemHadlingFlg(CK_EQ, largeItemHadlingFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_NotEqual(String largeItemHadlingFlg) {
        doSetLargeItemHadlingFlg_NotEqual(fRES(largeItemHadlingFlg));
    }

    protected void doSetLargeItemHadlingFlg_NotEqual(String largeItemHadlingFlg) {
        regLargeItemHadlingFlg(CK_NES, largeItemHadlingFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_GreaterThan(String largeItemHadlingFlg) {
        regLargeItemHadlingFlg(CK_GT, fRES(largeItemHadlingFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_LessThan(String largeItemHadlingFlg) {
        regLargeItemHadlingFlg(CK_LT, fRES(largeItemHadlingFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_GreaterEqual(String largeItemHadlingFlg) {
        regLargeItemHadlingFlg(CK_GE, fRES(largeItemHadlingFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_LessEqual(String largeItemHadlingFlg) {
        regLargeItemHadlingFlg(CK_LE, fRES(largeItemHadlingFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlgList The collection of largeItemHadlingFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_InScope(Collection<String> largeItemHadlingFlgList) {
        doSetLargeItemHadlingFlg_InScope(largeItemHadlingFlgList);
    }

    protected void doSetLargeItemHadlingFlg_InScope(Collection<String> largeItemHadlingFlgList) {
        regINS(CK_INS, cTL(largeItemHadlingFlgList), xgetCValueLargeItemHadlingFlg(), "LARGE_ITEM_HADLING_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlgList The collection of largeItemHadlingFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_NotInScope(Collection<String> largeItemHadlingFlgList) {
        doSetLargeItemHadlingFlg_NotInScope(largeItemHadlingFlgList);
    }

    protected void doSetLargeItemHadlingFlg_NotInScope(Collection<String> largeItemHadlingFlgList) {
        regINS(CK_NINS, cTL(largeItemHadlingFlgList), xgetCValueLargeItemHadlingFlg(), "LARGE_ITEM_HADLING_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setLargeItemHadlingFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLargeItemHadlingFlg_LikeSearch(String largeItemHadlingFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(largeItemHadlingFlg), xgetCValueLargeItemHadlingFlg(), "LARGE_ITEM_HADLING_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLargeItemHadlingFlg_NotLikeSearch(String largeItemHadlingFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(largeItemHadlingFlg), xgetCValueLargeItemHadlingFlg(), "LARGE_ITEM_HADLING_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param largeItemHadlingFlg The value of largeItemHadlingFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeItemHadlingFlg_PrefixSearch(String largeItemHadlingFlg) {
        setLargeItemHadlingFlg_LikeSearch(largeItemHadlingFlg, xcLSOPPre());
    }

    protected void regLargeItemHadlingFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLargeItemHadlingFlg(), "LARGE_ITEM_HADLING_FLG"); }
    protected abstract ConditionValue xgetCValueLargeItemHadlingFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_Equal(String heavyItemHadlingFlg) {
        doSetHeavyItemHadlingFlg_Equal(fRES(heavyItemHadlingFlg));
    }

    protected void doSetHeavyItemHadlingFlg_Equal(String heavyItemHadlingFlg) {
        regHeavyItemHadlingFlg(CK_EQ, heavyItemHadlingFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_NotEqual(String heavyItemHadlingFlg) {
        doSetHeavyItemHadlingFlg_NotEqual(fRES(heavyItemHadlingFlg));
    }

    protected void doSetHeavyItemHadlingFlg_NotEqual(String heavyItemHadlingFlg) {
        regHeavyItemHadlingFlg(CK_NES, heavyItemHadlingFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_GreaterThan(String heavyItemHadlingFlg) {
        regHeavyItemHadlingFlg(CK_GT, fRES(heavyItemHadlingFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_LessThan(String heavyItemHadlingFlg) {
        regHeavyItemHadlingFlg(CK_LT, fRES(heavyItemHadlingFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_GreaterEqual(String heavyItemHadlingFlg) {
        regHeavyItemHadlingFlg(CK_GE, fRES(heavyItemHadlingFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_LessEqual(String heavyItemHadlingFlg) {
        regHeavyItemHadlingFlg(CK_LE, fRES(heavyItemHadlingFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlgList The collection of heavyItemHadlingFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_InScope(Collection<String> heavyItemHadlingFlgList) {
        doSetHeavyItemHadlingFlg_InScope(heavyItemHadlingFlgList);
    }

    protected void doSetHeavyItemHadlingFlg_InScope(Collection<String> heavyItemHadlingFlgList) {
        regINS(CK_INS, cTL(heavyItemHadlingFlgList), xgetCValueHeavyItemHadlingFlg(), "HEAVY_ITEM_HADLING_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlgList The collection of heavyItemHadlingFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_NotInScope(Collection<String> heavyItemHadlingFlgList) {
        doSetHeavyItemHadlingFlg_NotInScope(heavyItemHadlingFlgList);
    }

    protected void doSetHeavyItemHadlingFlg_NotInScope(Collection<String> heavyItemHadlingFlgList) {
        regINS(CK_NINS, cTL(heavyItemHadlingFlgList), xgetCValueHeavyItemHadlingFlg(), "HEAVY_ITEM_HADLING_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setHeavyItemHadlingFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeavyItemHadlingFlg_LikeSearch(String heavyItemHadlingFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(heavyItemHadlingFlg), xgetCValueHeavyItemHadlingFlg(), "HEAVY_ITEM_HADLING_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeavyItemHadlingFlg_NotLikeSearch(String heavyItemHadlingFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(heavyItemHadlingFlg), xgetCValueHeavyItemHadlingFlg(), "HEAVY_ITEM_HADLING_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @param heavyItemHadlingFlg The value of heavyItemHadlingFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeavyItemHadlingFlg_PrefixSearch(String heavyItemHadlingFlg) {
        setHeavyItemHadlingFlg_LikeSearch(heavyItemHadlingFlg, xcLSOPPre());
    }

    protected void regHeavyItemHadlingFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeavyItemHadlingFlg(), "HEAVY_ITEM_HADLING_FLG"); }
    protected abstract ConditionValue xgetCValueHeavyItemHadlingFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlg The value of holidayCarrierFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_Equal(String holidayCarrierFlg) {
        doSetHolidayCarrierFlg_Equal(fRES(holidayCarrierFlg));
    }

    protected void doSetHolidayCarrierFlg_Equal(String holidayCarrierFlg) {
        regHolidayCarrierFlg(CK_EQ, holidayCarrierFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlg The value of holidayCarrierFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_NotEqual(String holidayCarrierFlg) {
        doSetHolidayCarrierFlg_NotEqual(fRES(holidayCarrierFlg));
    }

    protected void doSetHolidayCarrierFlg_NotEqual(String holidayCarrierFlg) {
        regHolidayCarrierFlg(CK_NES, holidayCarrierFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlg The value of holidayCarrierFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_GreaterThan(String holidayCarrierFlg) {
        regHolidayCarrierFlg(CK_GT, fRES(holidayCarrierFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlg The value of holidayCarrierFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_LessThan(String holidayCarrierFlg) {
        regHolidayCarrierFlg(CK_LT, fRES(holidayCarrierFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlg The value of holidayCarrierFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_GreaterEqual(String holidayCarrierFlg) {
        regHolidayCarrierFlg(CK_GE, fRES(holidayCarrierFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlg The value of holidayCarrierFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_LessEqual(String holidayCarrierFlg) {
        regHolidayCarrierFlg(CK_LE, fRES(holidayCarrierFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlgList The collection of holidayCarrierFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_InScope(Collection<String> holidayCarrierFlgList) {
        doSetHolidayCarrierFlg_InScope(holidayCarrierFlgList);
    }

    protected void doSetHolidayCarrierFlg_InScope(Collection<String> holidayCarrierFlgList) {
        regINS(CK_INS, cTL(holidayCarrierFlgList), xgetCValueHolidayCarrierFlg(), "HOLIDAY_CARRIER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlgList The collection of holidayCarrierFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_NotInScope(Collection<String> holidayCarrierFlgList) {
        doSetHolidayCarrierFlg_NotInScope(holidayCarrierFlgList);
    }

    protected void doSetHolidayCarrierFlg_NotInScope(Collection<String> holidayCarrierFlgList) {
        regINS(CK_NINS, cTL(holidayCarrierFlgList), xgetCValueHolidayCarrierFlg(), "HOLIDAY_CARRIER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setHolidayCarrierFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param holidayCarrierFlg The value of holidayCarrierFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHolidayCarrierFlg_LikeSearch(String holidayCarrierFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(holidayCarrierFlg), xgetCValueHolidayCarrierFlg(), "HOLIDAY_CARRIER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlg The value of holidayCarrierFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHolidayCarrierFlg_NotLikeSearch(String holidayCarrierFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(holidayCarrierFlg), xgetCValueHolidayCarrierFlg(), "HOLIDAY_CARRIER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayCarrierFlg The value of holidayCarrierFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayCarrierFlg_PrefixSearch(String holidayCarrierFlg) {
        setHolidayCarrierFlg_LikeSearch(holidayCarrierFlg, xcLSOPPre());
    }

    protected void regHolidayCarrierFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHolidayCarrierFlg(), "HOLIDAY_CARRIER_FLG"); }
    protected abstract ConditionValue xgetCValueHolidayCarrierFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlg The value of okinawaFlightFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_Equal(String okinawaFlightFlg) {
        doSetOkinawaFlightFlg_Equal(fRES(okinawaFlightFlg));
    }

    protected void doSetOkinawaFlightFlg_Equal(String okinawaFlightFlg) {
        regOkinawaFlightFlg(CK_EQ, okinawaFlightFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlg The value of okinawaFlightFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_NotEqual(String okinawaFlightFlg) {
        doSetOkinawaFlightFlg_NotEqual(fRES(okinawaFlightFlg));
    }

    protected void doSetOkinawaFlightFlg_NotEqual(String okinawaFlightFlg) {
        regOkinawaFlightFlg(CK_NES, okinawaFlightFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlg The value of okinawaFlightFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_GreaterThan(String okinawaFlightFlg) {
        regOkinawaFlightFlg(CK_GT, fRES(okinawaFlightFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlg The value of okinawaFlightFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_LessThan(String okinawaFlightFlg) {
        regOkinawaFlightFlg(CK_LT, fRES(okinawaFlightFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlg The value of okinawaFlightFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_GreaterEqual(String okinawaFlightFlg) {
        regOkinawaFlightFlg(CK_GE, fRES(okinawaFlightFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlg The value of okinawaFlightFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_LessEqual(String okinawaFlightFlg) {
        regOkinawaFlightFlg(CK_LE, fRES(okinawaFlightFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlgList The collection of okinawaFlightFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_InScope(Collection<String> okinawaFlightFlgList) {
        doSetOkinawaFlightFlg_InScope(okinawaFlightFlgList);
    }

    protected void doSetOkinawaFlightFlg_InScope(Collection<String> okinawaFlightFlgList) {
        regINS(CK_INS, cTL(okinawaFlightFlgList), xgetCValueOkinawaFlightFlg(), "OKINAWA_FLIGHT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlgList The collection of okinawaFlightFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_NotInScope(Collection<String> okinawaFlightFlgList) {
        doSetOkinawaFlightFlg_NotInScope(okinawaFlightFlgList);
    }

    protected void doSetOkinawaFlightFlg_NotInScope(Collection<String> okinawaFlightFlgList) {
        regINS(CK_NINS, cTL(okinawaFlightFlgList), xgetCValueOkinawaFlightFlg(), "OKINAWA_FLIGHT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setOkinawaFlightFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param okinawaFlightFlg The value of okinawaFlightFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOkinawaFlightFlg_LikeSearch(String okinawaFlightFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(okinawaFlightFlg), xgetCValueOkinawaFlightFlg(), "OKINAWA_FLIGHT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlg The value of okinawaFlightFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOkinawaFlightFlg_NotLikeSearch(String okinawaFlightFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(okinawaFlightFlg), xgetCValueOkinawaFlightFlg(), "OKINAWA_FLIGHT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param okinawaFlightFlg The value of okinawaFlightFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOkinawaFlightFlg_PrefixSearch(String okinawaFlightFlg) {
        setOkinawaFlightFlg_LikeSearch(okinawaFlightFlg, xcLSOPPre());
    }

    protected void regOkinawaFlightFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOkinawaFlightFlg(), "OKINAWA_FLIGHT_FLG"); }
    protected abstract ConditionValue xgetCValueOkinawaFlightFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_Equal(String baseDefaultCarrierFlg) {
        doSetBaseDefaultCarrierFlg_Equal(fRES(baseDefaultCarrierFlg));
    }

    protected void doSetBaseDefaultCarrierFlg_Equal(String baseDefaultCarrierFlg) {
        regBaseDefaultCarrierFlg(CK_EQ, baseDefaultCarrierFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_NotEqual(String baseDefaultCarrierFlg) {
        doSetBaseDefaultCarrierFlg_NotEqual(fRES(baseDefaultCarrierFlg));
    }

    protected void doSetBaseDefaultCarrierFlg_NotEqual(String baseDefaultCarrierFlg) {
        regBaseDefaultCarrierFlg(CK_NES, baseDefaultCarrierFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_GreaterThan(String baseDefaultCarrierFlg) {
        regBaseDefaultCarrierFlg(CK_GT, fRES(baseDefaultCarrierFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_LessThan(String baseDefaultCarrierFlg) {
        regBaseDefaultCarrierFlg(CK_LT, fRES(baseDefaultCarrierFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_GreaterEqual(String baseDefaultCarrierFlg) {
        regBaseDefaultCarrierFlg(CK_GE, fRES(baseDefaultCarrierFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_LessEqual(String baseDefaultCarrierFlg) {
        regBaseDefaultCarrierFlg(CK_LE, fRES(baseDefaultCarrierFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlgList The collection of baseDefaultCarrierFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_InScope(Collection<String> baseDefaultCarrierFlgList) {
        doSetBaseDefaultCarrierFlg_InScope(baseDefaultCarrierFlgList);
    }

    protected void doSetBaseDefaultCarrierFlg_InScope(Collection<String> baseDefaultCarrierFlgList) {
        regINS(CK_INS, cTL(baseDefaultCarrierFlgList), xgetCValueBaseDefaultCarrierFlg(), "BASE_DEFAULT_CARRIER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlgList The collection of baseDefaultCarrierFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_NotInScope(Collection<String> baseDefaultCarrierFlgList) {
        doSetBaseDefaultCarrierFlg_NotInScope(baseDefaultCarrierFlgList);
    }

    protected void doSetBaseDefaultCarrierFlg_NotInScope(Collection<String> baseDefaultCarrierFlgList) {
        regINS(CK_NINS, cTL(baseDefaultCarrierFlgList), xgetCValueBaseDefaultCarrierFlg(), "BASE_DEFAULT_CARRIER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setBaseDefaultCarrierFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseDefaultCarrierFlg_LikeSearch(String baseDefaultCarrierFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseDefaultCarrierFlg), xgetCValueBaseDefaultCarrierFlg(), "BASE_DEFAULT_CARRIER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseDefaultCarrierFlg_NotLikeSearch(String baseDefaultCarrierFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseDefaultCarrierFlg), xgetCValueBaseDefaultCarrierFlg(), "BASE_DEFAULT_CARRIER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @param baseDefaultCarrierFlg The value of baseDefaultCarrierFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseDefaultCarrierFlg_PrefixSearch(String baseDefaultCarrierFlg) {
        setBaseDefaultCarrierFlg_LikeSearch(baseDefaultCarrierFlg, xcLSOPPre());
    }

    protected void regBaseDefaultCarrierFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseDefaultCarrierFlg(), "BASE_DEFAULT_CARRIER_FLG"); }
    protected abstract ConditionValue xgetCValueBaseDefaultCarrierFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCd The value of insuranceCarrierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_Equal(String insuranceCarrierCd) {
        doSetInsuranceCarrierCd_Equal(fRES(insuranceCarrierCd));
    }

    protected void doSetInsuranceCarrierCd_Equal(String insuranceCarrierCd) {
        regInsuranceCarrierCd(CK_EQ, insuranceCarrierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCd The value of insuranceCarrierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_NotEqual(String insuranceCarrierCd) {
        doSetInsuranceCarrierCd_NotEqual(fRES(insuranceCarrierCd));
    }

    protected void doSetInsuranceCarrierCd_NotEqual(String insuranceCarrierCd) {
        regInsuranceCarrierCd(CK_NES, insuranceCarrierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCd The value of insuranceCarrierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_GreaterThan(String insuranceCarrierCd) {
        regInsuranceCarrierCd(CK_GT, fRES(insuranceCarrierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCd The value of insuranceCarrierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_LessThan(String insuranceCarrierCd) {
        regInsuranceCarrierCd(CK_LT, fRES(insuranceCarrierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCd The value of insuranceCarrierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_GreaterEqual(String insuranceCarrierCd) {
        regInsuranceCarrierCd(CK_GE, fRES(insuranceCarrierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCd The value of insuranceCarrierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_LessEqual(String insuranceCarrierCd) {
        regInsuranceCarrierCd(CK_LE, fRES(insuranceCarrierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCdList The collection of insuranceCarrierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_InScope(Collection<String> insuranceCarrierCdList) {
        doSetInsuranceCarrierCd_InScope(insuranceCarrierCdList);
    }

    protected void doSetInsuranceCarrierCd_InScope(Collection<String> insuranceCarrierCdList) {
        regINS(CK_INS, cTL(insuranceCarrierCdList), xgetCValueInsuranceCarrierCd(), "INSURANCE_CARRIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCdList The collection of insuranceCarrierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_NotInScope(Collection<String> insuranceCarrierCdList) {
        doSetInsuranceCarrierCd_NotInScope(insuranceCarrierCdList);
    }

    protected void doSetInsuranceCarrierCd_NotInScope(Collection<String> insuranceCarrierCdList) {
        regINS(CK_NINS, cTL(insuranceCarrierCdList), xgetCValueInsuranceCarrierCd(), "INSURANCE_CARRIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setInsuranceCarrierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param insuranceCarrierCd The value of insuranceCarrierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInsuranceCarrierCd_LikeSearch(String insuranceCarrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(insuranceCarrierCd), xgetCValueInsuranceCarrierCd(), "INSURANCE_CARRIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCd The value of insuranceCarrierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInsuranceCarrierCd_NotLikeSearch(String insuranceCarrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(insuranceCarrierCd), xgetCValueInsuranceCarrierCd(), "INSURANCE_CARRIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @param insuranceCarrierCd The value of insuranceCarrierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsuranceCarrierCd_PrefixSearch(String insuranceCarrierCd) {
        setInsuranceCarrierCd_LikeSearch(insuranceCarrierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     */
    public void setInsuranceCarrierCd_IsNull() { regInsuranceCarrierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     */
    public void setInsuranceCarrierCd_IsNullOrEmpty() { regInsuranceCarrierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     */
    public void setInsuranceCarrierCd_IsNotNull() { regInsuranceCarrierCd(CK_ISNN, DOBJ); }

    protected void regInsuranceCarrierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsuranceCarrierCd(), "INSURANCE_CARRIER_CD"); }
    protected abstract ConditionValue xgetCValueInsuranceCarrierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_Equal(String slipTypeCd) {
        doSetSlipTypeCd_Equal(fRES(slipTypeCd));
    }

    protected void doSetSlipTypeCd_Equal(String slipTypeCd) {
        regSlipTypeCd(CK_EQ, slipTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_NotEqual(String slipTypeCd) {
        doSetSlipTypeCd_NotEqual(fRES(slipTypeCd));
    }

    protected void doSetSlipTypeCd_NotEqual(String slipTypeCd) {
        regSlipTypeCd(CK_NES, slipTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_GreaterThan(String slipTypeCd) {
        regSlipTypeCd(CK_GT, fRES(slipTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_LessThan(String slipTypeCd) {
        regSlipTypeCd(CK_LT, fRES(slipTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_GreaterEqual(String slipTypeCd) {
        regSlipTypeCd(CK_GE, fRES(slipTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_LessEqual(String slipTypeCd) {
        regSlipTypeCd(CK_LE, fRES(slipTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCdList The collection of slipTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_InScope(Collection<String> slipTypeCdList) {
        doSetSlipTypeCd_InScope(slipTypeCdList);
    }

    protected void doSetSlipTypeCd_InScope(Collection<String> slipTypeCdList) {
        regINS(CK_INS, cTL(slipTypeCdList), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCdList The collection of slipTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_NotInScope(Collection<String> slipTypeCdList) {
        doSetSlipTypeCd_NotInScope(slipTypeCdList);
    }

    protected void doSetSlipTypeCd_NotInScope(Collection<String> slipTypeCdList) {
        regINS(CK_NINS, cTL(slipTypeCdList), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSlipTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipTypeCd The value of slipTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipTypeCd_LikeSearch(String slipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipTypeCd), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipTypeCd_NotLikeSearch(String slipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipTypeCd), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_PrefixSearch(String slipTypeCd) {
        setSlipTypeCd_LikeSearch(slipTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNull() { regSlipTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNullOrEmpty() { regSlipTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNotNull() { regSlipTypeCd(CK_ISNN, DOBJ); }

    protected void regSlipTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipTypeCd(), "SLIP_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSlipTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_Equal(String baseCd) {
        doSetBaseCd_Equal(fRES(baseCd));
    }

    protected void doSetBaseCd_Equal(String baseCd) {
        regBaseCd(CK_EQ, baseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_NotEqual(String baseCd) {
        doSetBaseCd_NotEqual(fRES(baseCd));
    }

    protected void doSetBaseCd_NotEqual(String baseCd) {
        regBaseCd(CK_NES, baseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_GreaterThan(String baseCd) {
        regBaseCd(CK_GT, fRES(baseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_LessThan(String baseCd) {
        regBaseCd(CK_LT, fRES(baseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_GreaterEqual(String baseCd) {
        regBaseCd(CK_GE, fRES(baseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_LessEqual(String baseCd) {
        regBaseCd(CK_LE, fRES(baseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCdList The collection of baseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_InScope(Collection<String> baseCdList) {
        doSetBaseCd_InScope(baseCdList);
    }

    protected void doSetBaseCd_InScope(Collection<String> baseCdList) {
        regINS(CK_INS, cTL(baseCdList), xgetCValueBaseCd(), "BASE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCdList The collection of baseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_NotInScope(Collection<String> baseCdList) {
        doSetBaseCd_NotInScope(baseCdList);
    }

    protected void doSetBaseCd_NotInScope(Collection<String> baseCdList) {
        regINS(CK_NINS, cTL(baseCdList), xgetCValueBaseCd(), "BASE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setBaseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseCd The value of baseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseCd_LikeSearch(String baseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseCd), xgetCValueBaseCd(), "BASE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseCd_NotLikeSearch(String baseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseCd), xgetCValueBaseCd(), "BASE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_PrefixSearch(String baseCd) {
        setBaseCd_LikeSearch(baseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNull() { regBaseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNullOrEmpty() { regBaseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNotNull() { regBaseCd(CK_ISNN, DOBJ); }

    protected void regBaseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseCd(), "BASE_CD"); }
    protected abstract ConditionValue xgetCValueBaseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlg The value of properFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_Equal(String properFlg) {
        doSetProperFlg_Equal(fRES(properFlg));
    }

    protected void doSetProperFlg_Equal(String properFlg) {
        regProperFlg(CK_EQ, properFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlg The value of properFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_NotEqual(String properFlg) {
        doSetProperFlg_NotEqual(fRES(properFlg));
    }

    protected void doSetProperFlg_NotEqual(String properFlg) {
        regProperFlg(CK_NES, properFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlg The value of properFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_GreaterThan(String properFlg) {
        regProperFlg(CK_GT, fRES(properFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlg The value of properFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_LessThan(String properFlg) {
        regProperFlg(CK_LT, fRES(properFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlg The value of properFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_GreaterEqual(String properFlg) {
        regProperFlg(CK_GE, fRES(properFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlg The value of properFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_LessEqual(String properFlg) {
        regProperFlg(CK_LE, fRES(properFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlgList The collection of properFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_InScope(Collection<String> properFlgList) {
        doSetProperFlg_InScope(properFlgList);
    }

    protected void doSetProperFlg_InScope(Collection<String> properFlgList) {
        regINS(CK_INS, cTL(properFlgList), xgetCValueProperFlg(), "PROPER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlgList The collection of properFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_NotInScope(Collection<String> properFlgList) {
        doSetProperFlg_NotInScope(properFlgList);
    }

    protected void doSetProperFlg_NotInScope(Collection<String> properFlgList) {
        regINS(CK_NINS, cTL(properFlgList), xgetCValueProperFlg(), "PROPER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPER_FLG: {CHAR(1)} <br>
     * <pre>e.g. setProperFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param properFlg The value of properFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProperFlg_LikeSearch(String properFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(properFlg), xgetCValueProperFlg(), "PROPER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlg The value of properFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProperFlg_NotLikeSearch(String properFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(properFlg), xgetCValueProperFlg(), "PROPER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     * @param properFlg The value of properFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProperFlg_PrefixSearch(String properFlg) {
        setProperFlg_LikeSearch(properFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     */
    public void setProperFlg_IsNull() { regProperFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     */
    public void setProperFlg_IsNullOrEmpty() { regProperFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROPER_FLG: {CHAR(1)}
     */
    public void setProperFlg_IsNotNull() { regProperFlg(CK_ISNN, DOBJ); }

    protected void regProperFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProperFlg(), "PROPER_FLG"); }
    protected abstract ConditionValue xgetCValueProperFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCd The value of laneCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_Equal(String laneCd) {
        doSetLaneCd_Equal(fRES(laneCd));
    }

    protected void doSetLaneCd_Equal(String laneCd) {
        regLaneCd(CK_EQ, laneCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCd The value of laneCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_NotEqual(String laneCd) {
        doSetLaneCd_NotEqual(fRES(laneCd));
    }

    protected void doSetLaneCd_NotEqual(String laneCd) {
        regLaneCd(CK_NES, laneCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCd The value of laneCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_GreaterThan(String laneCd) {
        regLaneCd(CK_GT, fRES(laneCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCd The value of laneCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_LessThan(String laneCd) {
        regLaneCd(CK_LT, fRES(laneCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCd The value of laneCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_GreaterEqual(String laneCd) {
        regLaneCd(CK_GE, fRES(laneCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCd The value of laneCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_LessEqual(String laneCd) {
        regLaneCd(CK_LE, fRES(laneCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCdList The collection of laneCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_InScope(Collection<String> laneCdList) {
        doSetLaneCd_InScope(laneCdList);
    }

    protected void doSetLaneCd_InScope(Collection<String> laneCdList) {
        regINS(CK_INS, cTL(laneCdList), xgetCValueLaneCd(), "LANE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCdList The collection of laneCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_NotInScope(Collection<String> laneCdList) {
        doSetLaneCd_NotInScope(laneCdList);
    }

    protected void doSetLaneCd_NotInScope(Collection<String> laneCdList) {
        regINS(CK_NINS, cTL(laneCdList), xgetCValueLaneCd(), "LANE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LANE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLaneCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param laneCd The value of laneCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLaneCd_LikeSearch(String laneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(laneCd), xgetCValueLaneCd(), "LANE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCd The value of laneCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLaneCd_NotLikeSearch(String laneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(laneCd), xgetCValueLaneCd(), "LANE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     * @param laneCd The value of laneCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLaneCd_PrefixSearch(String laneCd) {
        setLaneCd_LikeSearch(laneCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     */
    public void setLaneCd_IsNull() { regLaneCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     */
    public void setLaneCd_IsNullOrEmpty() { regLaneCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LANE_CD: {VARCHAR(30)}
     */
    public void setLaneCd_IsNotNull() { regLaneCd(CK_ISNN, DOBJ); }

    protected void regLaneCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLaneCd(), "LANE_CD"); }
    protected abstract ConditionValue xgetCValueLaneCd();

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
    public HpSLCFunction<MCarrierCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCarrierCB.class);
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
    public HpSLCFunction<MCarrierCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCarrierCB.class);
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
    public HpSLCFunction<MCarrierCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCarrierCB.class);
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
    public HpSLCFunction<MCarrierCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCarrierCB.class);
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
    public HpSLCFunction<MCarrierCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCarrierCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCarrierCB&gt;() {
     *     public void query(MCarrierCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCarrierCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCarrierCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCarrierCQ sq);

    protected MCarrierCB xcreateScalarConditionCB() {
        MCarrierCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCarrierCB xcreateScalarConditionPartitionByCB() {
        MCarrierCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCarrierCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CARRIER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCarrierCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCarrierCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCarrierCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CARRIER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCarrierCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCarrierCQ sq);

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
    protected MCarrierCB newMyCB() {
        return new MCarrierCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCarrierCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
