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
 * The abstract condition-query of b_user.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "b_user";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from b_user_auth where ...)} <br>
     * b_user_auth by USER_ID, named 'BUserAuthAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBUserAuthAsOne</span>(authCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BUserAuthAsOne for 'exists'. (NotNull)
     */
    public void existsBUserAuthAsOne(SubQuery<BUserAuthCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserAuthCB cb = new BUserAuthCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_BUserAuthAsOne(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "bUserAuthAsOne");
    }
    public abstract String keepUserId_ExistsReferrer_BUserAuthAsOne(BUserAuthCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from m_user_center where ...)} <br>
     * m_user_center by USER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserCenterList for 'exists'. (NotNull)
     */
    public void existsMUserCenterList(SubQuery<MUserCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_MUserCenterList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "mUserCenterList");
    }
    public abstract String keepUserId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from m_user_client where ...)} <br>
     * m_user_client by USER_ID, named 'MUserClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserClientList for 'exists'. (NotNull)
     */
    public void existsMUserClientList(SubQuery<MUserClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserClientCB cb = new MUserClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_MUserClientList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "mUserClientList");
    }
    public abstract String keepUserId_ExistsReferrer_MUserClientList(MUserClientCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from m_user_deposit where ...)} <br>
     * m_user_deposit by USER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserDepositList</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserDepositList for 'exists'. (NotNull)
     */
    public void existsMUserDepositList(SubQuery<MUserDepositCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_MUserDepositList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "mUserDepositList");
    }
    public abstract String keepUserId_ExistsReferrer_MUserDepositList(MUserDepositCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from m_user_login where ...)} <br>
     * m_user_login by USER_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserLoginAsOne</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserLoginAsOne for 'exists'. (NotNull)
     */
    public void existsMUserLoginAsOne(SubQuery<MUserLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_MUserLoginAsOne(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "mUserLoginAsOne");
    }
    public abstract String keepUserId_ExistsReferrer_MUserLoginAsOne(MUserLoginCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STATEMENT_OUT_USER_ID from t_ec_order_r where ...)} <br>
     * t_ec_order_r by STATEMENT_OUT_USER_ID, named 'TEcOrderRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTEcOrderRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TEcOrderRList for 'exists'. (NotNull)
     */
    public void existsTEcOrderRList(SubQuery<TEcOrderRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TEcOrderRList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "STATEMENT_OUT_USER_ID", pp, "tEcOrderRList");
    }
    public abstract String keepUserId_ExistsReferrer_TEcOrderRList(TEcOrderRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_UPD_USER_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_UPD_USER_ID, named 'TInventoryBByInventoryUpdUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBByInventoryUpdUserIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBByInventoryUpdUserIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryBByInventoryUpdUserIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TInventoryBByInventoryUpdUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INVENTORY_UPD_USER_ID", pp, "tInventoryBByInventoryUpdUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_USER_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_USER_ID, named 'TInventoryBByInventoryUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBByInventoryUserIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBByInventoryUserIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryBByInventoryUserIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TInventoryBByInventoryUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INVENTORY_USER_ID", pp, "tInventoryBByInventoryUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_RECORD_LOC_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_RECORD_LOC_OUT_USER_ID, named 'TInventoryRByInventoryRecordLocOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryRByInventoryRecordLocOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryRByInventoryRecordLocOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryRByInventoryRecordLocOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INVENTORY_RECORD_LOC_OUT_USER_ID", pp, "tInventoryRByInventoryRecordLocOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STOCK_DIFF_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by STOCK_DIFF_OUT_USER_ID, named 'TInventoryRByStockDiffOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryRByStockDiffOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryRByStockDiffOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryRByStockDiffOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TInventoryRByStockDiffOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "STOCK_DIFF_OUT_USER_ID", pp, "tInventoryRByStockDiffOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TWL_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by TWL_OUT_USER_ID, named 'TInventoryRByTwlOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryRByTwlOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryRByTwlOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryRByTwlOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TInventoryRByTwlOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "TWL_OUT_USER_ID", pp, "tInventoryRByTwlOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_RECORD_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_RECORD_OUT_USER_ID, named 'TInventoryRByInventoryRecordOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryRByInventoryRecordOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryRByInventoryRecordOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryRByInventoryRecordOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TInventoryRByInventoryRecordOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INVENTORY_RECORD_OUT_USER_ID", pp, "tInventoryRByInventoryRecordOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_DIFF_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_DIFF_OUT_USER_ID, named 'TInventoryRByInventoryDiffOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryRByInventoryDiffOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryRByInventoryDiffOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryRByInventoryDiffOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TInventoryRByInventoryDiffOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INVENTORY_DIFF_OUT_USER_ID", pp, "tInventoryRByInventoryDiffOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INST_OUT_USER_ID from t_move_inst_r where ...)} <br>
     * t_move_inst_r by INST_OUT_USER_ID, named 'TMoveInstRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstRList for 'exists'. (NotNull)
     */
    public void existsTMoveInstRList(SubQuery<TMoveInstRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstRCB cb = new TMoveInstRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TMoveInstRList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INST_OUT_USER_ID", pp, "tMoveInstRList");
    }
    public abstract String keepUserId_ExistsReferrer_TMoveInstRList(TMoveInstRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from t_move_record_b where ...)} <br>
     * t_move_record_b by USER_ID, named 'TMoveRecordBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TMoveRecordBList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "tMoveRecordBList");
    }
    public abstract String keepUserId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select OUT_USER_ID from t_nizoroe_alarm_log where ...)} <br>
     * t_nizoroe_alarm_log by OUT_USER_ID, named 'TNizoroeAlarmLogAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TNizoroeAlarmLogList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "OUT_USER_ID", pp, "tNizoroeAlarmLogList");
    }
    public abstract String keepUserId_ExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STW_OUT_USER_ID from t_packing_r where ...)} <br>
     * t_packing_r by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingRByStwOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingRByStwOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPackingRByStwOutUserIdList(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPackingRByStwOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "STW_OUT_USER_ID", pp, "tPackingRByStwOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INSPECTION_OUT_USER_ID from t_packing_r where ...)} <br>
     * t_packing_r by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingRByInspectionOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingRByInspectionOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPackingRByInspectionOutUserIdList(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPackingRByInspectionOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INSPECTION_OUT_USER_ID", pp, "tPackingRByInspectionOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TAG_OUT_USER_ID from t_packing_r where ...)} <br>
     * t_packing_r by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingRByTagOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingRByTagOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPackingRByTagOutUserIdList(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPackingRByTagOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "TAG_OUT_USER_ID", pp, "tPackingRByTagOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CASE_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByCaseOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByCaseOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByCaseOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByCaseOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "CASE_OUT_USER_ID", pp, "tPickingRByCaseOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BOL_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by BOL_OUT_USER_ID, named 'TPickingRByBolOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByBolOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByBolOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByBolOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByBolOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "BOL_OUT_USER_ID", pp, "tPickingRByBolOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PL1_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByPl1OutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByPl1OutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByPl1OutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByPl1OutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "PL1_OUT_USER_ID", pp, "tPickingRByPl1OutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TAG_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by TAG_OUT_USER_ID, named 'TPickingRByTagOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByTagOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByTagOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByTagOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByTagOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "TAG_OUT_USER_ID", pp, "tPickingRByTagOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_RECORD_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByShippingRecordOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByShippingRecordOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByShippingRecordOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByShippingRecordOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "SHIPPING_RECORD_OUT_USER_ID", pp, "tPickingRByShippingRecordOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIV_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by DELIV_OUT_USER_ID, named 'TPickingRByDelivOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByDelivOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByDelivOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByDelivOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByDelivOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "DELIV_OUT_USER_ID", pp, "tPickingRByDelivOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INDV_SUPPLY_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by INDV_SUPPLY_OUT_USER_ID, named 'TPickingRByIndvSupplyOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByIndvSupplyOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByIndvSupplyOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByIndvSupplyOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByIndvSupplyOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INDV_SUPPLY_OUT_USER_ID", pp, "tPickingRByIndvSupplyOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PACKING_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByPackingOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByPackingOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByPackingOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByPackingOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "PACKING_OUT_USER_ID", pp, "tPickingRByPackingOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PL_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PL_OUT_USER_ID, named 'TPickingRByPlOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByPlOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByPlOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByPlOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByPlOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "PL_OUT_USER_ID", pp, "tPickingRByPlOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INDV_LABEL_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by INDV_LABEL_OUT_USER_ID, named 'TPickingRByIndvLabelOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByIndvLabelOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByIndvLabelOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByIndvLabelOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByIndvLabelOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "INDV_LABEL_OUT_USER_ID", pp, "tPickingRByIndvLabelOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PL2_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByPl2OutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByPl2OutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByPl2OutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByPl2OutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "PL2_OUT_USER_ID", pp, "tPickingRByPl2OutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SLIP_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRBySlipOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRBySlipOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRBySlipOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRBySlipOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "SLIP_OUT_USER_ID", pp, "tPickingRBySlipOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select NIZOROE_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by NIZOROE_OUT_USER_ID, named 'TPickingRByNizoroeOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByNizoroeOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByNizoroeOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByNizoroeOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByNizoroeOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "NIZOROE_OUT_USER_ID", pp, "tPickingRByNizoroeOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PLL_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PLL_OUT_USER_ID, named 'TPickingRByPllOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRByPllOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRByPllOutUserIdList for 'exists'. (NotNull)
     */
    public void existsTPickingRByPllOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TPickingRByPllOutUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "PLL_OUT_USER_ID", pp, "tPickingRByPllOutUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RCV_LBL_OUT_USER_ID from t_receive_label where ...)} <br>
     * t_receive_label by RCV_LBL_OUT_USER_ID, named 'TReceiveLabelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceiveLabelList</span>(labelCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     labelCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceiveLabelList for 'exists'. (NotNull)
     */
    public void existsTReceiveLabelList(SubQuery<TReceiveLabelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TReceiveLabelList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "RCV_LBL_OUT_USER_ID", pp, "tReceiveLabelList");
    }
    public abstract String keepUserId_ExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RPL_OUT_USER_ID from t_receive_plan_r where ...)} <br>
     * t_receive_plan_r by RPL_OUT_USER_ID, named 'TReceivePlanRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanRList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanRList(SubQuery<TReceivePlanRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TReceivePlanRList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "RPL_OUT_USER_ID", pp, "tReceivePlanRList");
    }
    public abstract String keepUserId_ExistsReferrer_TReceivePlanRList(TReceivePlanRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TWL_OUT_USER_ID from t_store_no_r where ...)} <br>
     * t_store_no_r by TWL_OUT_USER_ID, named 'TStoreNoRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreNoRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreNoRList for 'exists'. (NotNull)
     */
    public void existsTStoreNoRList(SubQuery<TStoreNoRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoRCB cb = new TStoreNoRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TStoreNoRList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "TWL_OUT_USER_ID", pp, "tStoreNoRList");
    }
    public abstract String keepUserId_ExistsReferrer_TStoreNoRList(TStoreNoRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RECEIVE_RECORD_OUT_USER_ID from t_store_record_r where ...)} <br>
     * t_store_record_r by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordRList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordRList(SubQuery<TStoreRecordRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordRCB cb = new TStoreRecordRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TStoreRecordRList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "RECEIVE_RECORD_OUT_USER_ID", pp, "tStoreRecordRList");
    }
    public abstract String keepUserId_ExistsReferrer_TStoreRecordRList(TStoreRecordRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from w_sgl_row_ship_insp_b where ...)} <br>
     * w_sgl_row_ship_insp_b by USER_ID, named 'WSglRowShipInspBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWSglRowShipInspBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WSglRowShipInspBList for 'exists'. (NotNull)
     */
    public void existsWSglRowShipInspBList(SubQuery<WSglRowShipInspBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_WSglRowShipInspBList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "wSglRowShipInspBList");
    }
    public abstract String keepUserId_ExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from b_user_auth where ...)} <br>
     * b_user_auth by USER_ID, named 'BUserAuthAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBUserAuthAsOne</span>(authCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_BUserAuthAsOne for 'not exists'. (NotNull)
     */
    public void notExistsBUserAuthAsOne(SubQuery<BUserAuthCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserAuthCB cb = new BUserAuthCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_BUserAuthAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "bUserAuthAsOne");
    }
    public abstract String keepUserId_NotExistsReferrer_BUserAuthAsOne(BUserAuthCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from m_user_center where ...)} <br>
     * m_user_center by USER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_MUserCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMUserCenterList(SubQuery<MUserCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_MUserCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "mUserCenterList");
    }
    public abstract String keepUserId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from m_user_client where ...)} <br>
     * m_user_client by USER_ID, named 'MUserClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_MUserClientList for 'not exists'. (NotNull)
     */
    public void notExistsMUserClientList(SubQuery<MUserClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserClientCB cb = new MUserClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_MUserClientList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "mUserClientList");
    }
    public abstract String keepUserId_NotExistsReferrer_MUserClientList(MUserClientCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from m_user_deposit where ...)} <br>
     * m_user_deposit by USER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserDepositList</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_MUserDepositList for 'not exists'. (NotNull)
     */
    public void notExistsMUserDepositList(SubQuery<MUserDepositCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_MUserDepositList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "mUserDepositList");
    }
    public abstract String keepUserId_NotExistsReferrer_MUserDepositList(MUserDepositCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from m_user_login where ...)} <br>
     * m_user_login by USER_ID, named 'MUserLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserLoginAsOne</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_MUserLoginAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMUserLoginAsOne(SubQuery<MUserLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserLoginCB cb = new MUserLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_MUserLoginAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "mUserLoginAsOne");
    }
    public abstract String keepUserId_NotExistsReferrer_MUserLoginAsOne(MUserLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STATEMENT_OUT_USER_ID from t_ec_order_r where ...)} <br>
     * t_ec_order_r by STATEMENT_OUT_USER_ID, named 'TEcOrderRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTEcOrderRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TEcOrderRList for 'not exists'. (NotNull)
     */
    public void notExistsTEcOrderRList(SubQuery<TEcOrderRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TEcOrderRList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "STATEMENT_OUT_USER_ID", pp, "tEcOrderRList");
    }
    public abstract String keepUserId_NotExistsReferrer_TEcOrderRList(TEcOrderRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_UPD_USER_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_UPD_USER_ID, named 'TInventoryBByInventoryUpdUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBByInventoryUpdUserIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TInventoryBByInventoryUpdUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBByInventoryUpdUserIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TInventoryBByInventoryUpdUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INVENTORY_UPD_USER_ID", pp, "tInventoryBByInventoryUpdUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_USER_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_USER_ID, named 'TInventoryBByInventoryUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBByInventoryUserIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TInventoryBByInventoryUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBByInventoryUserIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TInventoryBByInventoryUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INVENTORY_USER_ID", pp, "tInventoryBByInventoryUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_RECORD_LOC_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_RECORD_LOC_OUT_USER_ID, named 'TInventoryRByInventoryRecordLocOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryRByInventoryRecordLocOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryRByInventoryRecordLocOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INVENTORY_RECORD_LOC_OUT_USER_ID", pp, "tInventoryRByInventoryRecordLocOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STOCK_DIFF_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by STOCK_DIFF_OUT_USER_ID, named 'TInventoryRByStockDiffOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryRByStockDiffOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TInventoryRByStockDiffOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryRByStockDiffOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TInventoryRByStockDiffOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "STOCK_DIFF_OUT_USER_ID", pp, "tInventoryRByStockDiffOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TWL_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by TWL_OUT_USER_ID, named 'TInventoryRByTwlOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryRByTwlOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TInventoryRByTwlOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryRByTwlOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TInventoryRByTwlOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "TWL_OUT_USER_ID", pp, "tInventoryRByTwlOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_RECORD_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_RECORD_OUT_USER_ID, named 'TInventoryRByInventoryRecordOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryRByInventoryRecordOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TInventoryRByInventoryRecordOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryRByInventoryRecordOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TInventoryRByInventoryRecordOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INVENTORY_RECORD_OUT_USER_ID", pp, "tInventoryRByInventoryRecordOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_DIFF_OUT_USER_ID from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_DIFF_OUT_USER_ID, named 'TInventoryRByInventoryDiffOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryRByInventoryDiffOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TInventoryRByInventoryDiffOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryRByInventoryDiffOutUserIdList(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TInventoryRByInventoryDiffOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INVENTORY_DIFF_OUT_USER_ID", pp, "tInventoryRByInventoryDiffOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INST_OUT_USER_ID from t_move_inst_r where ...)} <br>
     * t_move_inst_r by INST_OUT_USER_ID, named 'TMoveInstRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TMoveInstRList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstRList(SubQuery<TMoveInstRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstRCB cb = new TMoveInstRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TMoveInstRList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INST_OUT_USER_ID", pp, "tMoveInstRList");
    }
    public abstract String keepUserId_NotExistsReferrer_TMoveInstRList(TMoveInstRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from t_move_record_b where ...)} <br>
     * t_move_record_b by USER_ID, named 'TMoveRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TMoveRecordBList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveRecordBList(SubQuery<TMoveRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TMoveRecordBList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "tMoveRecordBList");
    }
    public abstract String keepUserId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select OUT_USER_ID from t_nizoroe_alarm_log where ...)} <br>
     * t_nizoroe_alarm_log by OUT_USER_ID, named 'TNizoroeAlarmLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTNizoroeAlarmLogList</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TNizoroeAlarmLogList for 'not exists'. (NotNull)
     */
    public void notExistsTNizoroeAlarmLogList(SubQuery<TNizoroeAlarmLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TNizoroeAlarmLogCB cb = new TNizoroeAlarmLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TNizoroeAlarmLogList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "OUT_USER_ID", pp, "tNizoroeAlarmLogList");
    }
    public abstract String keepUserId_NotExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STW_OUT_USER_ID from t_packing_r where ...)} <br>
     * t_packing_r by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingRByStwOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPackingRByStwOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingRByStwOutUserIdList(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPackingRByStwOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "STW_OUT_USER_ID", pp, "tPackingRByStwOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INSPECTION_OUT_USER_ID from t_packing_r where ...)} <br>
     * t_packing_r by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingRByInspectionOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPackingRByInspectionOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingRByInspectionOutUserIdList(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPackingRByInspectionOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INSPECTION_OUT_USER_ID", pp, "tPackingRByInspectionOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TAG_OUT_USER_ID from t_packing_r where ...)} <br>
     * t_packing_r by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingRByTagOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPackingRByTagOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingRByTagOutUserIdList(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPackingRByTagOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "TAG_OUT_USER_ID", pp, "tPackingRByTagOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CASE_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByCaseOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByCaseOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByCaseOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByCaseOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "CASE_OUT_USER_ID", pp, "tPickingRByCaseOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BOL_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by BOL_OUT_USER_ID, named 'TPickingRByBolOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByBolOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByBolOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByBolOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByBolOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "BOL_OUT_USER_ID", pp, "tPickingRByBolOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PL1_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByPl1OutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByPl1OutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByPl1OutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByPl1OutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "PL1_OUT_USER_ID", pp, "tPickingRByPl1OutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TAG_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by TAG_OUT_USER_ID, named 'TPickingRByTagOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByTagOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByTagOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByTagOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByTagOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "TAG_OUT_USER_ID", pp, "tPickingRByTagOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_RECORD_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByShippingRecordOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByShippingRecordOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByShippingRecordOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByShippingRecordOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "SHIPPING_RECORD_OUT_USER_ID", pp, "tPickingRByShippingRecordOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIV_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by DELIV_OUT_USER_ID, named 'TPickingRByDelivOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByDelivOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByDelivOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByDelivOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByDelivOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "DELIV_OUT_USER_ID", pp, "tPickingRByDelivOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INDV_SUPPLY_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by INDV_SUPPLY_OUT_USER_ID, named 'TPickingRByIndvSupplyOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByIndvSupplyOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByIndvSupplyOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByIndvSupplyOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByIndvSupplyOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INDV_SUPPLY_OUT_USER_ID", pp, "tPickingRByIndvSupplyOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PACKING_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByPackingOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByPackingOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByPackingOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByPackingOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "PACKING_OUT_USER_ID", pp, "tPickingRByPackingOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PL_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PL_OUT_USER_ID, named 'TPickingRByPlOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByPlOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByPlOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByPlOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByPlOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "PL_OUT_USER_ID", pp, "tPickingRByPlOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INDV_LABEL_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by INDV_LABEL_OUT_USER_ID, named 'TPickingRByIndvLabelOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByIndvLabelOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByIndvLabelOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByIndvLabelOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByIndvLabelOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "INDV_LABEL_OUT_USER_ID", pp, "tPickingRByIndvLabelOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PL2_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByPl2OutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByPl2OutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByPl2OutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByPl2OutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "PL2_OUT_USER_ID", pp, "tPickingRByPl2OutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SLIP_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRBySlipOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRBySlipOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRBySlipOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRBySlipOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "SLIP_OUT_USER_ID", pp, "tPickingRBySlipOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select NIZOROE_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by NIZOROE_OUT_USER_ID, named 'TPickingRByNizoroeOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByNizoroeOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByNizoroeOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByNizoroeOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByNizoroeOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "NIZOROE_OUT_USER_ID", pp, "tPickingRByNizoroeOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PLL_OUT_USER_ID from t_picking_r where ...)} <br>
     * t_picking_r by PLL_OUT_USER_ID, named 'TPickingRByPllOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRByPllOutUserIdList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TPickingRByPllOutUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRByPllOutUserIdList(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TPickingRByPllOutUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "PLL_OUT_USER_ID", pp, "tPickingRByPllOutUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RCV_LBL_OUT_USER_ID from t_receive_label where ...)} <br>
     * t_receive_label by RCV_LBL_OUT_USER_ID, named 'TReceiveLabelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceiveLabelList</span>(labelCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     labelCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TReceiveLabelList for 'not exists'. (NotNull)
     */
    public void notExistsTReceiveLabelList(SubQuery<TReceiveLabelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TReceiveLabelList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "RCV_LBL_OUT_USER_ID", pp, "tReceiveLabelList");
    }
    public abstract String keepUserId_NotExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RPL_OUT_USER_ID from t_receive_plan_r where ...)} <br>
     * t_receive_plan_r by RPL_OUT_USER_ID, named 'TReceivePlanRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TReceivePlanRList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanRList(SubQuery<TReceivePlanRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TReceivePlanRList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "RPL_OUT_USER_ID", pp, "tReceivePlanRList");
    }
    public abstract String keepUserId_NotExistsReferrer_TReceivePlanRList(TReceivePlanRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TWL_OUT_USER_ID from t_store_no_r where ...)} <br>
     * t_store_no_r by TWL_OUT_USER_ID, named 'TStoreNoRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreNoRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TStoreNoRList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreNoRList(SubQuery<TStoreNoRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoRCB cb = new TStoreNoRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TStoreNoRList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "TWL_OUT_USER_ID", pp, "tStoreNoRList");
    }
    public abstract String keepUserId_NotExistsReferrer_TStoreNoRList(TStoreNoRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RECEIVE_RECORD_OUT_USER_ID from t_store_record_r where ...)} <br>
     * t_store_record_r by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordRList</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TStoreRecordRList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordRList(SubQuery<TStoreRecordRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordRCB cb = new TStoreRecordRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TStoreRecordRList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "RECEIVE_RECORD_OUT_USER_ID", pp, "tStoreRecordRList");
    }
    public abstract String keepUserId_NotExistsReferrer_TStoreRecordRList(TStoreRecordRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from w_sgl_row_ship_insp_b where ...)} <br>
     * w_sgl_row_ship_insp_b by USER_ID, named 'WSglRowShipInspBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_WSglRowShipInspBList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspBList(SubQuery<WSglRowShipInspBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_WSglRowShipInspBList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "wSglRowShipInspBList");
    }
    public abstract String keepUserId_NotExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    public void xsderiveMUserCenterList(String fn, SubQuery<MUserCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_MUserCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "mUserCenterList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq);

    public void xsderiveMUserClientList(String fn, SubQuery<MUserClientCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserClientCB cb = new MUserClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_MUserClientList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "mUserClientList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_MUserClientList(MUserClientCQ sq);

    public void xsderiveMUserDepositList(String fn, SubQuery<MUserDepositCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_MUserDepositList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "mUserDepositList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_MUserDepositList(MUserDepositCQ sq);

    public void xsderiveTEcOrderRList(String fn, SubQuery<TEcOrderRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TEcOrderRList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "STATEMENT_OUT_USER_ID", pp, "tEcOrderRList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TEcOrderRList(TEcOrderRCQ sq);

    public void xsderiveTInventoryBByInventoryUpdUserIdList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUpdUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_UPD_USER_ID", pp, "tInventoryBByInventoryUpdUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq);

    public void xsderiveTInventoryBByInventoryUserIdList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_USER_ID", pp, "tInventoryBByInventoryUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq);

    public void xsderiveTInventoryRByInventoryRecordLocOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_RECORD_LOC_OUT_USER_ID", pp, "tInventoryRByInventoryRecordLocOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq);

    public void xsderiveTInventoryRByStockDiffOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TInventoryRByStockDiffOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "STOCK_DIFF_OUT_USER_ID", pp, "tInventoryRByStockDiffOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq);

    public void xsderiveTInventoryRByTwlOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TInventoryRByTwlOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "TWL_OUT_USER_ID", pp, "tInventoryRByTwlOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq);

    public void xsderiveTInventoryRByInventoryRecordOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_RECORD_OUT_USER_ID", pp, "tInventoryRByInventoryRecordOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq);

    public void xsderiveTInventoryRByInventoryDiffOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_DIFF_OUT_USER_ID", pp, "tInventoryRByInventoryDiffOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq);

    public void xsderiveTMoveInstRList(String fn, SubQuery<TMoveInstRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstRCB cb = new TMoveInstRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TMoveInstRList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INST_OUT_USER_ID", pp, "tMoveInstRList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TMoveInstRList(TMoveInstRCQ sq);

    public void xsderiveTMoveRecordBList(String fn, SubQuery<TMoveRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TMoveRecordBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "tMoveRecordBList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq);

    public void xsderiveTNizoroeAlarmLogList(String fn, SubQuery<TNizoroeAlarmLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TNizoroeAlarmLogCB cb = new TNizoroeAlarmLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TNizoroeAlarmLogList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "OUT_USER_ID", pp, "tNizoroeAlarmLogList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq);

    public void xsderiveTPackingRByStwOutUserIdList(String fn, SubQuery<TPackingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPackingRByStwOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "STW_OUT_USER_ID", pp, "tPackingRByStwOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq);

    public void xsderiveTPackingRByInspectionOutUserIdList(String fn, SubQuery<TPackingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPackingRByInspectionOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INSPECTION_OUT_USER_ID", pp, "tPackingRByInspectionOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq);

    public void xsderiveTPackingRByTagOutUserIdList(String fn, SubQuery<TPackingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPackingRByTagOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "TAG_OUT_USER_ID", pp, "tPackingRByTagOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq);

    public void xsderiveTPickingRByCaseOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByCaseOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "CASE_OUT_USER_ID", pp, "tPickingRByCaseOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByBolOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByBolOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "BOL_OUT_USER_ID", pp, "tPickingRByBolOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByPl1OutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByPl1OutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "PL1_OUT_USER_ID", pp, "tPickingRByPl1OutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByTagOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByTagOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "TAG_OUT_USER_ID", pp, "tPickingRByTagOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByShippingRecordOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByShippingRecordOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "SHIPPING_RECORD_OUT_USER_ID", pp, "tPickingRByShippingRecordOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByDelivOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByDelivOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "DELIV_OUT_USER_ID", pp, "tPickingRByDelivOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByIndvSupplyOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByIndvSupplyOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INDV_SUPPLY_OUT_USER_ID", pp, "tPickingRByIndvSupplyOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByPackingOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByPackingOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "PACKING_OUT_USER_ID", pp, "tPickingRByPackingOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByPlOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByPlOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "PL_OUT_USER_ID", pp, "tPickingRByPlOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByIndvLabelOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByIndvLabelOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "INDV_LABEL_OUT_USER_ID", pp, "tPickingRByIndvLabelOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByPl2OutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByPl2OutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "PL2_OUT_USER_ID", pp, "tPickingRByPl2OutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRBySlipOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRBySlipOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "SLIP_OUT_USER_ID", pp, "tPickingRBySlipOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByNizoroeOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByNizoroeOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "NIZOROE_OUT_USER_ID", pp, "tPickingRByNizoroeOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq);

    public void xsderiveTPickingRByPllOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TPickingRByPllOutUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "PLL_OUT_USER_ID", pp, "tPickingRByPllOutUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq);

    public void xsderiveTReceiveLabelList(String fn, SubQuery<TReceiveLabelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TReceiveLabelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "RCV_LBL_OUT_USER_ID", pp, "tReceiveLabelList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq);

    public void xsderiveTReceivePlanRList(String fn, SubQuery<TReceivePlanRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TReceivePlanRList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "RPL_OUT_USER_ID", pp, "tReceivePlanRList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TReceivePlanRList(TReceivePlanRCQ sq);

    public void xsderiveTStoreNoRList(String fn, SubQuery<TStoreNoRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoRCB cb = new TStoreNoRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TStoreNoRList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "TWL_OUT_USER_ID", pp, "tStoreNoRList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TStoreNoRList(TStoreNoRCQ sq);

    public void xsderiveTStoreRecordRList(String fn, SubQuery<TStoreRecordRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordRCB cb = new TStoreRecordRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TStoreRecordRList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "RECEIVE_RECORD_OUT_USER_ID", pp, "tStoreRecordRList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TStoreRecordRList(TStoreRecordRCQ sq);

    public void xsderiveWSglRowShipInspBList(String fn, SubQuery<WSglRowShipInspBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_WSglRowShipInspBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "wSglRowShipInspBList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_user_center where ...)} <br>
     * m_user_center by USER_ID, named 'MUserCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserCenterCB> derivedMUserCenterList() {
        return xcreateQDRFunctionMUserCenterList();
    }
    protected HpQDRFunction<MUserCenterCB> xcreateQDRFunctionMUserCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserCenterList(String fn, SubQuery<MUserCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserCenterCB cb = new MUserCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_MUserCenterList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_MUserCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "mUserCenterList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_MUserCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_user_client where ...)} <br>
     * m_user_client by USER_ID, named 'MUserClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserClientList()</span>.<span style="color: #CC4747">max</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     clientCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserClientCB> derivedMUserClientList() {
        return xcreateQDRFunctionMUserClientList();
    }
    protected HpQDRFunction<MUserClientCB> xcreateQDRFunctionMUserClientList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserClientList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserClientList(String fn, SubQuery<MUserClientCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserClientCB cb = new MUserClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_MUserClientList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_MUserClientListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "mUserClientList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_MUserClientList(MUserClientCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_MUserClientListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_user_deposit where ...)} <br>
     * m_user_deposit by USER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserDepositList()</span>.<span style="color: #CC4747">max</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     depositCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserDepositCB> derivedMUserDepositList() {
        return xcreateQDRFunctionMUserDepositList();
    }
    protected HpQDRFunction<MUserDepositCB> xcreateQDRFunctionMUserDepositList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserDepositList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserDepositList(String fn, SubQuery<MUserDepositCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_MUserDepositList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_MUserDepositListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "mUserDepositList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_MUserDepositList(MUserDepositCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_MUserDepositListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_ec_order_r where ...)} <br>
     * t_ec_order_r by STATEMENT_OUT_USER_ID, named 'TEcOrderRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTEcOrderRList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TEcOrderRCB> derivedTEcOrderRList() {
        return xcreateQDRFunctionTEcOrderRList();
    }
    protected HpQDRFunction<TEcOrderRCB> xcreateQDRFunctionTEcOrderRList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTEcOrderRList(fn, sq, rd, vl, op));
    }
    public void xqderiveTEcOrderRList(String fn, SubQuery<TEcOrderRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderRCB cb = new TEcOrderRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TEcOrderRList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TEcOrderRListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "STATEMENT_OUT_USER_ID", sqpp, "tEcOrderRList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TEcOrderRList(TEcOrderRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TEcOrderRListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_UPD_USER_ID, named 'TInventoryBByInventoryUpdUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBByInventoryUpdUserIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBByInventoryUpdUserIdList() {
        return xcreateQDRFunctionTInventoryBByInventoryUpdUserIdList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBByInventoryUpdUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBByInventoryUpdUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBByInventoryUpdUserIdList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_UPD_USER_ID", sqpp, "tInventoryBByInventoryUpdUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_USER_ID, named 'TInventoryBByInventoryUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBByInventoryUserIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBByInventoryUserIdList() {
        return xcreateQDRFunctionTInventoryBByInventoryUserIdList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBByInventoryUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBByInventoryUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBByInventoryUserIdList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_USER_ID", sqpp, "tInventoryBByInventoryUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_RECORD_LOC_OUT_USER_ID, named 'TInventoryRByInventoryRecordLocOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryRByInventoryRecordLocOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryRCB> derivedTInventoryRByInventoryRecordLocOutUserIdList() {
        return xcreateQDRFunctionTInventoryRByInventoryRecordLocOutUserIdList();
    }
    protected HpQDRFunction<TInventoryRCB> xcreateQDRFunctionTInventoryRByInventoryRecordLocOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryRByInventoryRecordLocOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryRByInventoryRecordLocOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_RECORD_LOC_OUT_USER_ID", sqpp, "tInventoryRByInventoryRecordLocOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_r where ...)} <br>
     * t_inventory_r by STOCK_DIFF_OUT_USER_ID, named 'TInventoryRByStockDiffOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryRByStockDiffOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryRCB> derivedTInventoryRByStockDiffOutUserIdList() {
        return xcreateQDRFunctionTInventoryRByStockDiffOutUserIdList();
    }
    protected HpQDRFunction<TInventoryRCB> xcreateQDRFunctionTInventoryRByStockDiffOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryRByStockDiffOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryRByStockDiffOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "STOCK_DIFF_OUT_USER_ID", sqpp, "tInventoryRByStockDiffOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_r where ...)} <br>
     * t_inventory_r by TWL_OUT_USER_ID, named 'TInventoryRByTwlOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryRByTwlOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryRCB> derivedTInventoryRByTwlOutUserIdList() {
        return xcreateQDRFunctionTInventoryRByTwlOutUserIdList();
    }
    protected HpQDRFunction<TInventoryRCB> xcreateQDRFunctionTInventoryRByTwlOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryRByTwlOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryRByTwlOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "TWL_OUT_USER_ID", sqpp, "tInventoryRByTwlOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_RECORD_OUT_USER_ID, named 'TInventoryRByInventoryRecordOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryRByInventoryRecordOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryRCB> derivedTInventoryRByInventoryRecordOutUserIdList() {
        return xcreateQDRFunctionTInventoryRByInventoryRecordOutUserIdList();
    }
    protected HpQDRFunction<TInventoryRCB> xcreateQDRFunctionTInventoryRByInventoryRecordOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryRByInventoryRecordOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryRByInventoryRecordOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_RECORD_OUT_USER_ID", sqpp, "tInventoryRByInventoryRecordOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_r where ...)} <br>
     * t_inventory_r by INVENTORY_DIFF_OUT_USER_ID, named 'TInventoryRByInventoryDiffOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryRByInventoryDiffOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryRCB> derivedTInventoryRByInventoryDiffOutUserIdList() {
        return xcreateQDRFunctionTInventoryRByInventoryDiffOutUserIdList();
    }
    protected HpQDRFunction<TInventoryRCB> xcreateQDRFunctionTInventoryRByInventoryDiffOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryRByInventoryDiffOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryRByInventoryDiffOutUserIdList(String fn, SubQuery<TInventoryRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INVENTORY_DIFF_OUT_USER_ID", sqpp, "tInventoryRByInventoryDiffOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_inst_r where ...)} <br>
     * t_move_inst_r by INST_OUT_USER_ID, named 'TMoveInstRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstRList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstRCB> derivedTMoveInstRList() {
        return xcreateQDRFunctionTMoveInstRList();
    }
    protected HpQDRFunction<TMoveInstRCB> xcreateQDRFunctionTMoveInstRList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstRList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstRList(String fn, SubQuery<TMoveInstRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstRCB cb = new TMoveInstRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TMoveInstRList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TMoveInstRListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INST_OUT_USER_ID", sqpp, "tMoveInstRList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TMoveInstRList(TMoveInstRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TMoveInstRListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_record_b where ...)} <br>
     * t_move_record_b by USER_ID, named 'TMoveRecordBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TMoveRecordBList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TMoveRecordBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "tMoveRecordBList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TMoveRecordBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_nizoroe_alarm_log where ...)} <br>
     * t_nizoroe_alarm_log by OUT_USER_ID, named 'TNizoroeAlarmLogAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TNizoroeAlarmLogList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "OUT_USER_ID", sqpp, "tNizoroeAlarmLogList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_packing_r where ...)} <br>
     * t_packing_r by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingRByStwOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingRCB> derivedTPackingRByStwOutUserIdList() {
        return xcreateQDRFunctionTPackingRByStwOutUserIdList();
    }
    protected HpQDRFunction<TPackingRCB> xcreateQDRFunctionTPackingRByStwOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingRByStwOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingRByStwOutUserIdList(String fn, SubQuery<TPackingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "STW_OUT_USER_ID", sqpp, "tPackingRByStwOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_packing_r where ...)} <br>
     * t_packing_r by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingRByInspectionOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingRCB> derivedTPackingRByInspectionOutUserIdList() {
        return xcreateQDRFunctionTPackingRByInspectionOutUserIdList();
    }
    protected HpQDRFunction<TPackingRCB> xcreateQDRFunctionTPackingRByInspectionOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingRByInspectionOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingRByInspectionOutUserIdList(String fn, SubQuery<TPackingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INSPECTION_OUT_USER_ID", sqpp, "tPackingRByInspectionOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_packing_r where ...)} <br>
     * t_packing_r by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingRByTagOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingRCB> derivedTPackingRByTagOutUserIdList() {
        return xcreateQDRFunctionTPackingRByTagOutUserIdList();
    }
    protected HpQDRFunction<TPackingRCB> xcreateQDRFunctionTPackingRByTagOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingRByTagOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingRByTagOutUserIdList(String fn, SubQuery<TPackingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "TAG_OUT_USER_ID", sqpp, "tPackingRByTagOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByCaseOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByCaseOutUserIdList() {
        return xcreateQDRFunctionTPickingRByCaseOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByCaseOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByCaseOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByCaseOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "CASE_OUT_USER_ID", sqpp, "tPickingRByCaseOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by BOL_OUT_USER_ID, named 'TPickingRByBolOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByBolOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByBolOutUserIdList() {
        return xcreateQDRFunctionTPickingRByBolOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByBolOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByBolOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByBolOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "BOL_OUT_USER_ID", sqpp, "tPickingRByBolOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByPl1OutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByPl1OutUserIdList() {
        return xcreateQDRFunctionTPickingRByPl1OutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByPl1OutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByPl1OutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByPl1OutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "PL1_OUT_USER_ID", sqpp, "tPickingRByPl1OutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by TAG_OUT_USER_ID, named 'TPickingRByTagOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByTagOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByTagOutUserIdList() {
        return xcreateQDRFunctionTPickingRByTagOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByTagOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByTagOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByTagOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "TAG_OUT_USER_ID", sqpp, "tPickingRByTagOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByShippingRecordOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByShippingRecordOutUserIdList() {
        return xcreateQDRFunctionTPickingRByShippingRecordOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByShippingRecordOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByShippingRecordOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByShippingRecordOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "SHIPPING_RECORD_OUT_USER_ID", sqpp, "tPickingRByShippingRecordOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by DELIV_OUT_USER_ID, named 'TPickingRByDelivOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByDelivOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByDelivOutUserIdList() {
        return xcreateQDRFunctionTPickingRByDelivOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByDelivOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByDelivOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByDelivOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "DELIV_OUT_USER_ID", sqpp, "tPickingRByDelivOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by INDV_SUPPLY_OUT_USER_ID, named 'TPickingRByIndvSupplyOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByIndvSupplyOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByIndvSupplyOutUserIdList() {
        return xcreateQDRFunctionTPickingRByIndvSupplyOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByIndvSupplyOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByIndvSupplyOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByIndvSupplyOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INDV_SUPPLY_OUT_USER_ID", sqpp, "tPickingRByIndvSupplyOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByPackingOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByPackingOutUserIdList() {
        return xcreateQDRFunctionTPickingRByPackingOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByPackingOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByPackingOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByPackingOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "PACKING_OUT_USER_ID", sqpp, "tPickingRByPackingOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by PL_OUT_USER_ID, named 'TPickingRByPlOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByPlOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByPlOutUserIdList() {
        return xcreateQDRFunctionTPickingRByPlOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByPlOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByPlOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByPlOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "PL_OUT_USER_ID", sqpp, "tPickingRByPlOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by INDV_LABEL_OUT_USER_ID, named 'TPickingRByIndvLabelOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByIndvLabelOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByIndvLabelOutUserIdList() {
        return xcreateQDRFunctionTPickingRByIndvLabelOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByIndvLabelOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByIndvLabelOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByIndvLabelOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "INDV_LABEL_OUT_USER_ID", sqpp, "tPickingRByIndvLabelOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByPl2OutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByPl2OutUserIdList() {
        return xcreateQDRFunctionTPickingRByPl2OutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByPl2OutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByPl2OutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByPl2OutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "PL2_OUT_USER_ID", sqpp, "tPickingRByPl2OutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRBySlipOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRBySlipOutUserIdList() {
        return xcreateQDRFunctionTPickingRBySlipOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRBySlipOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRBySlipOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRBySlipOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "SLIP_OUT_USER_ID", sqpp, "tPickingRBySlipOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by NIZOROE_OUT_USER_ID, named 'TPickingRByNizoroeOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByNizoroeOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByNizoroeOutUserIdList() {
        return xcreateQDRFunctionTPickingRByNizoroeOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByNizoroeOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByNizoroeOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByNizoroeOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "NIZOROE_OUT_USER_ID", sqpp, "tPickingRByNizoroeOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_r where ...)} <br>
     * t_picking_r by PLL_OUT_USER_ID, named 'TPickingRByPllOutUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRByPllOutUserIdList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> derivedTPickingRByPllOutUserIdList() {
        return xcreateQDRFunctionTPickingRByPllOutUserIdList();
    }
    protected HpQDRFunction<TPickingRCB> xcreateQDRFunctionTPickingRByPllOutUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRByPllOutUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRByPllOutUserIdList(String fn, SubQuery<TPickingRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "PLL_OUT_USER_ID", sqpp, "tPickingRByPllOutUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_label where ...)} <br>
     * t_receive_label by RCV_LBL_OUT_USER_ID, named 'TReceiveLabelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceiveLabelList()</span>.<span style="color: #CC4747">max</span>(labelCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     labelCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     labelCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceiveLabelCB> derivedTReceiveLabelList() {
        return xcreateQDRFunctionTReceiveLabelList();
    }
    protected HpQDRFunction<TReceiveLabelCB> xcreateQDRFunctionTReceiveLabelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceiveLabelList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceiveLabelList(String fn, SubQuery<TReceiveLabelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TReceiveLabelList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TReceiveLabelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "RCV_LBL_OUT_USER_ID", sqpp, "tReceiveLabelList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TReceiveLabelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_r where ...)} <br>
     * t_receive_plan_r by RPL_OUT_USER_ID, named 'TReceivePlanRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanRList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanRCB> derivedTReceivePlanRList() {
        return xcreateQDRFunctionTReceivePlanRList();
    }
    protected HpQDRFunction<TReceivePlanRCB> xcreateQDRFunctionTReceivePlanRList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanRList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanRList(String fn, SubQuery<TReceivePlanRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TReceivePlanRList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TReceivePlanRListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "RPL_OUT_USER_ID", sqpp, "tReceivePlanRList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TReceivePlanRList(TReceivePlanRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TReceivePlanRListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_no_r where ...)} <br>
     * t_store_no_r by TWL_OUT_USER_ID, named 'TStoreNoRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreNoRList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreNoRCB> derivedTStoreNoRList() {
        return xcreateQDRFunctionTStoreNoRList();
    }
    protected HpQDRFunction<TStoreNoRCB> xcreateQDRFunctionTStoreNoRList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreNoRList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreNoRList(String fn, SubQuery<TStoreNoRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoRCB cb = new TStoreNoRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TStoreNoRList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TStoreNoRListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "TWL_OUT_USER_ID", sqpp, "tStoreNoRList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TStoreNoRList(TStoreNoRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TStoreNoRListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_record_r where ...)} <br>
     * t_store_record_r by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordRList()</span>.<span style="color: #CC4747">max</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     rCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordRCB> derivedTStoreRecordRList() {
        return xcreateQDRFunctionTStoreRecordRList();
    }
    protected HpQDRFunction<TStoreRecordRCB> xcreateQDRFunctionTStoreRecordRList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordRList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordRList(String fn, SubQuery<TStoreRecordRCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordRCB cb = new TStoreRecordRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TStoreRecordRList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TStoreRecordRListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "RECEIVE_RECORD_OUT_USER_ID", sqpp, "tStoreRecordRList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TStoreRecordRList(TStoreRecordRCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TStoreRecordRListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_sgl_row_ship_insp_b where ...)} <br>
     * w_sgl_row_ship_insp_b by USER_ID, named 'WSglRowShipInspBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWSglRowShipInspBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WSglRowShipInspBCB> derivedWSglRowShipInspBList() {
        return xcreateQDRFunctionWSglRowShipInspBList();
    }
    protected HpQDRFunction<WSglRowShipInspBCB> xcreateQDRFunctionWSglRowShipInspBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWSglRowShipInspBList(fn, sq, rd, vl, op));
    }
    public void xqderiveWSglRowShipInspBList(String fn, SubQuery<WSglRowShipInspBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_WSglRowShipInspBList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_WSglRowShipInspBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "wSglRowShipInspBList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_WSglRowShipInspBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_Equal(String userCd) {
        doSetUserCd_Equal(fRES(userCd));
    }

    protected void doSetUserCd_Equal(String userCd) {
        regUserCd(CK_EQ, userCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotEqual(String userCd) {
        doSetUserCd_NotEqual(fRES(userCd));
    }

    protected void doSetUserCd_NotEqual(String userCd) {
        regUserCd(CK_NES, userCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterThan(String userCd) {
        regUserCd(CK_GT, fRES(userCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessThan(String userCd) {
        regUserCd(CK_LT, fRES(userCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterEqual(String userCd) {
        regUserCd(CK_GE, fRES(userCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessEqual(String userCd) {
        regUserCd(CK_LE, fRES(userCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCdList The collection of userCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_InScope(Collection<String> userCdList) {
        doSetUserCd_InScope(userCdList);
    }

    protected void doSetUserCd_InScope(Collection<String> userCdList) {
        regINS(CK_INS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCdList The collection of userCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotInScope(Collection<String> userCdList) {
        doSetUserCd_NotInScope(userCdList);
    }

    protected void doSetUserCd_NotInScope(Collection<String> userCdList) {
        regINS(CK_NINS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userCd The value of userCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserCd_LikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserCd_NotLikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_PrefixSearch(String userCd) {
        setUserCd_LikeSearch(userCd, xcLSOPPre());
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select UPD_USER from t_packing_h where ...)} <br>
     * t_packing_h by UPD_USER, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingHByUpdUserList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingHByUpdUserList for 'exists'. (NotNull)
     */
    public void existsTPackingHByUpdUserList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserCd_ExistsReferrer_TPackingHByUpdUserList(cb.query());
        registerExistsReferrer(cb.query(), "USER_CD", "UPD_USER", pp, "tPackingHByUpdUserList");
    }
    public abstract String keepUserCd_ExistsReferrer_TPackingHByUpdUserList(TPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select UPD_USER from t_packing_h where ...)} <br>
     * t_packing_h by UPD_USER, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingHByUpdUserList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserCd_NotExistsReferrer_TPackingHByUpdUserList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingHByUpdUserList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserCd_NotExistsReferrer_TPackingHByUpdUserList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_CD", "UPD_USER", pp, "tPackingHByUpdUserList");
    }
    public abstract String keepUserCd_NotExistsReferrer_TPackingHByUpdUserList(TPackingHCQ sq);

    public void xsderiveTPackingHByUpdUserList(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserCd_SpecifyDerivedReferrer_TPackingHByUpdUserList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_CD", "UPD_USER", pp, "tPackingHByUpdUserList", al, op);
    }
    public abstract String keepUserCd_SpecifyDerivedReferrer_TPackingHByUpdUserList(TPackingHCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_packing_h where ...)} <br>
     * t_packing_h by UPD_USER, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingHByUpdUserList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingHCB> derivedTPackingHByUpdUserList() {
        return xcreateQDRFunctionTPackingHByUpdUserList();
    }
    protected HpQDRFunction<TPackingHCB> xcreateQDRFunctionTPackingHByUpdUserList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingHByUpdUserList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingHByUpdUserList(String fn, SubQuery<TPackingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserCd_QueryDerivedReferrer_TPackingHByUpdUserList(cb.query()); String prpp = keepUserCd_QueryDerivedReferrer_TPackingHByUpdUserListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_CD", "UPD_USER", sqpp, "tPackingHByUpdUserList", rd, vl, prpp, op);
    }
    public abstract String keepUserCd_QueryDerivedReferrer_TPackingHByUpdUserList(TPackingHCQ sq);
    public abstract String keepUserCd_QueryDerivedReferrer_TPackingHByUpdUserListParameter(Object vl);

    protected void regUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserCd(), "USER_CD"); }
    protected abstract ConditionValue xgetCValueUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNm The value of userNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_Equal(String userNm) {
        doSetUserNm_Equal(fRES(userNm));
    }

    protected void doSetUserNm_Equal(String userNm) {
        regUserNm(CK_EQ, userNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNm The value of userNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_NotEqual(String userNm) {
        doSetUserNm_NotEqual(fRES(userNm));
    }

    protected void doSetUserNm_NotEqual(String userNm) {
        regUserNm(CK_NES, userNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNm The value of userNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_GreaterThan(String userNm) {
        regUserNm(CK_GT, fRES(userNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNm The value of userNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_LessThan(String userNm) {
        regUserNm(CK_LT, fRES(userNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNm The value of userNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_GreaterEqual(String userNm) {
        regUserNm(CK_GE, fRES(userNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNm The value of userNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_LessEqual(String userNm) {
        regUserNm(CK_LE, fRES(userNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNmList The collection of userNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_InScope(Collection<String> userNmList) {
        doSetUserNm_InScope(userNmList);
    }

    protected void doSetUserNm_InScope(Collection<String> userNmList) {
        regINS(CK_INS, cTL(userNmList), xgetCValueUserNm(), "USER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNmList The collection of userNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_NotInScope(Collection<String> userNmList) {
        doSetUserNm_NotInScope(userNmList);
    }

    protected void doSetUserNm_NotInScope(Collection<String> userNmList) {
        regINS(CK_NINS, cTL(userNmList), xgetCValueUserNm(), "USER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)} <br>
     * <pre>e.g. setUserNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userNm The value of userNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserNm_LikeSearch(String userNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userNm), xgetCValueUserNm(), "USER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNm The value of userNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserNm_NotLikeSearch(String userNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userNm), xgetCValueUserNm(), "USER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @param userNm The value of userNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNm_PrefixSearch(String userNm) {
        setUserNm_LikeSearch(userNm, xcLSOPPre());
    }

    protected void regUserNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserNm(), "USER_NM"); }
    protected abstract ConditionValue xgetCValueUserNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_Equal(Long cultureId) {
        doSetCultureId_Equal(cultureId);
    }

    protected void doSetCultureId_Equal(Long cultureId) {
        regCultureId(CK_EQ, cultureId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_NotEqual(Long cultureId) {
        doSetCultureId_NotEqual(cultureId);
    }

    protected void doSetCultureId_NotEqual(Long cultureId) {
        regCultureId(CK_NES, cultureId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterThan(Long cultureId) {
        regCultureId(CK_GT, cultureId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessThan(Long cultureId) {
        regCultureId(CK_LT, cultureId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterEqual(Long cultureId) {
        regCultureId(CK_GE, cultureId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param cultureId The value of cultureId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessEqual(Long cultureId) {
        regCultureId(CK_LE, cultureId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param minNumber The min number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCultureId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCultureId(), "CULTURE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param cultureIdList The collection of cultureId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_InScope(Collection<Long> cultureIdList) {
        doSetCultureId_InScope(cultureIdList);
    }

    protected void doSetCultureId_InScope(Collection<Long> cultureIdList) {
        regINS(CK_INS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @param cultureIdList The collection of cultureId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_NotInScope(Collection<Long> cultureIdList) {
        doSetCultureId_NotInScope(cultureIdList);
    }

    protected void doSetCultureId_NotInScope(Collection<Long> cultureIdList) {
        regINS(CK_NINS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CULTURE_ID from b_culture where ...)} <br />
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'in-scope'. (NotNull)
     */
    public void inScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_InScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", false);
    }
    public abstract String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CULTURE_ID from b_culture where ...)} <br />
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'not in-scope'. (NotNull)
     */
    public void notInScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_NotInScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", true);
    }
    public abstract String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq);

    protected void regCultureId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureId(), "CULTURE_ID"); }
    protected abstract ConditionValue xgetCValueCultureId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param roleGrpId The value of roleGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_Equal(Long roleGrpId) {
        doSetRoleGrpId_Equal(roleGrpId);
    }

    protected void doSetRoleGrpId_Equal(Long roleGrpId) {
        regRoleGrpId(CK_EQ, roleGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param roleGrpId The value of roleGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_NotEqual(Long roleGrpId) {
        doSetRoleGrpId_NotEqual(roleGrpId);
    }

    protected void doSetRoleGrpId_NotEqual(Long roleGrpId) {
        regRoleGrpId(CK_NES, roleGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param roleGrpId The value of roleGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_GreaterThan(Long roleGrpId) {
        regRoleGrpId(CK_GT, roleGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param roleGrpId The value of roleGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_LessThan(Long roleGrpId) {
        regRoleGrpId(CK_LT, roleGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param roleGrpId The value of roleGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_GreaterEqual(Long roleGrpId) {
        regRoleGrpId(CK_GE, roleGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param roleGrpId The value of roleGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_LessEqual(Long roleGrpId) {
        regRoleGrpId(CK_LE, roleGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param minNumber The min number of roleGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of roleGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRoleGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRoleGrpId(), "ROLE_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param roleGrpIdList The collection of roleGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpId_InScope(Collection<Long> roleGrpIdList) {
        doSetRoleGrpId_InScope(roleGrpIdList);
    }

    protected void doSetRoleGrpId_InScope(Collection<Long> roleGrpIdList) {
        regINS(CK_INS, cTL(roleGrpIdList), xgetCValueRoleGrpId(), "ROLE_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @param roleGrpIdList The collection of roleGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpId_NotInScope(Collection<Long> roleGrpIdList) {
        doSetRoleGrpId_NotInScope(roleGrpIdList);
    }

    protected void doSetRoleGrpId_NotInScope(Collection<Long> roleGrpIdList) {
        regINS(CK_NINS, cTL(roleGrpIdList), xgetCValueRoleGrpId(), "ROLE_GRP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ROLE_GRP_ID from b_role_grp where ...)} <br />
     * b_role_grp by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @param subCBLambda The callback for sub-query of BRoleGrp for 'in-scope'. (NotNull)
     */
    public void inScopeBRoleGrp(SubQuery<BRoleGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpCB cb = new BRoleGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRoleGrpId_InScopeRelation_BRoleGrp(cb.query());
        registerInScopeRelation(cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bRoleGrp", false);
    }
    public abstract String keepRoleGrpId_InScopeRelation_BRoleGrp(BRoleGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ROLE_GRP_ID from b_role_grp where ...)} <br />
     * b_role_grp by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @param subCBLambda The callback for sub-query of BRoleGrp for 'not in-scope'. (NotNull)
     */
    public void notInScopeBRoleGrp(SubQuery<BRoleGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpCB cb = new BRoleGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRoleGrpId_NotInScopeRelation_BRoleGrp(cb.query());
        registerInScopeRelation(cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bRoleGrp", true);
    }
    public abstract String keepRoleGrpId_NotInScopeRelation_BRoleGrp(BRoleGrpCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     */
    public void setRoleGrpId_IsNull() { regRoleGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     */
    public void setRoleGrpId_IsNotNull() { regRoleGrpId(CK_ISNN, DOBJ); }

    protected void regRoleGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleGrpId(), "ROLE_GRP_ID"); }
    protected abstract ConditionValue xgetCValueRoleGrpId();

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
    public HpSLCFunction<BUserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BUserCB.class);
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
    public HpSLCFunction<BUserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BUserCB.class);
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
    public HpSLCFunction<BUserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BUserCB.class);
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
    public HpSLCFunction<BUserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BUserCB.class);
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
    public HpSLCFunction<BUserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BUserCB&gt;() {
     *     public void query(BUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BUserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BUserCQ sq);

    protected BUserCB xcreateScalarConditionCB() {
        BUserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BUserCB xcreateScalarConditionPartitionByCB() {
        BUserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserCB cb = new BUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BUserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BUserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserCB cb = new BUserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BUserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BUserCQ sq);

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
    protected BUserCB newMyCB() {
        return new BUserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
