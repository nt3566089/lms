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
 * The abstract condition-query of t_picking_h.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPickingHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPickingHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_picking_h";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingHId The value of pickingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_Equal(Long pickingHId) {
        doSetPickingHId_Equal(pickingHId);
    }

    protected void doSetPickingHId_Equal(Long pickingHId) {
        regPickingHId(CK_EQ, pickingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingHId The value of pickingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_NotEqual(Long pickingHId) {
        doSetPickingHId_NotEqual(pickingHId);
    }

    protected void doSetPickingHId_NotEqual(Long pickingHId) {
        regPickingHId(CK_NES, pickingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingHId The value of pickingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterThan(Long pickingHId) {
        regPickingHId(CK_GT, pickingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingHId The value of pickingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessThan(Long pickingHId) {
        regPickingHId(CK_LT, pickingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingHId The value of pickingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterEqual(Long pickingHId) {
        regPickingHId(CK_GE, pickingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingHId The value of pickingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessEqual(Long pickingHId) {
        regPickingHId(CK_LE, pickingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingHId(), "PICKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingHIdList The collection of pickingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_InScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_InScope(pickingHIdList);
    }

    protected void doSetPickingHId_InScope(Collection<Long> pickingHIdList) {
        regINS(CK_INS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingHIdList The collection of pickingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_NotInScope(pickingHIdList);
    }

    protected void doSetPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        regINS(CK_NINS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PICKING_H_ID from t_packing_h where ...)} <br>
     * t_packing_h by PICKING_H_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingHList for 'exists'. (NotNull)
     */
    public void existsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_ExistsReferrer_TPackingHList(cb.query());
        registerExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPackingHList");
    }
    public abstract String keepPickingHId_ExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PICKING_H_ID from t_pic_mthd_rcmd_data where ...)} <br>
     * t_pic_mthd_rcmd_data by PICKING_H_ID, named 'TPicMthdRcmdDataAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPicMthdRcmdDataList</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dataCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPicMthdRcmdDataList for 'exists'. (NotNull)
     */
    public void existsTPicMthdRcmdDataList(SubQuery<TPicMthdRcmdDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_ExistsReferrer_TPicMthdRcmdDataList(cb.query());
        registerExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPicMthdRcmdDataList");
    }
    public abstract String keepPickingHId_ExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PICKING_H_ID from t_picking_b where ...)} <br>
     * t_picking_b by PICKING_H_ID, named 'TPickingBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_ExistsReferrer_TPickingBList(cb.query());
        registerExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingBList");
    }
    public abstract String keepPickingHId_ExistsReferrer_TPickingBList(TPickingBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PICKING_H_ID from t_picking_r where ...)} <br>
     * t_picking_r by PICKING_H_ID, named 'TPickingRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRAsOne for 'exists'. (NotNull)
     */
    public void existsTPickingRAsOne(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_ExistsReferrer_TPickingRAsOne(cb.query());
        registerExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingRAsOne");
    }
    public abstract String keepPickingHId_ExistsReferrer_TPickingRAsOne(TPickingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PICKING_H_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PICKING_H_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_ExistsReferrer_TReceivePlanHList(cb.query());
        registerExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepPickingHId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PICKING_H_ID from w_sgl_row_ship_insp_b where ...)} <br>
     * w_sgl_row_ship_insp_b by PICKING_H_ID, named 'WSglRowShipInspBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_ExistsReferrer_WSglRowShipInspBList(cb.query());
        registerExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "wSglRowShipInspBList");
    }
    public abstract String keepPickingHId_ExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PICKING_H_ID from t_packing_h where ...)} <br>
     * t_packing_h by PICKING_H_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickingHId_NotExistsReferrer_TPackingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_NotExistsReferrer_TPackingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPackingHList");
    }
    public abstract String keepPickingHId_NotExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PICKING_H_ID from t_pic_mthd_rcmd_data where ...)} <br>
     * t_pic_mthd_rcmd_data by PICKING_H_ID, named 'TPicMthdRcmdDataAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPicMthdRcmdDataList</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dataCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickingHId_NotExistsReferrer_TPicMthdRcmdDataList for 'not exists'. (NotNull)
     */
    public void notExistsTPicMthdRcmdDataList(SubQuery<TPicMthdRcmdDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_NotExistsReferrer_TPicMthdRcmdDataList(cb.query());
        registerNotExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPicMthdRcmdDataList");
    }
    public abstract String keepPickingHId_NotExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PICKING_H_ID from t_picking_b where ...)} <br>
     * t_picking_b by PICKING_H_ID, named 'TPickingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickingHId_NotExistsReferrer_TPickingBList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingBList(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_NotExistsReferrer_TPickingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingBList");
    }
    public abstract String keepPickingHId_NotExistsReferrer_TPickingBList(TPickingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PICKING_H_ID from t_picking_r where ...)} <br>
     * t_picking_r by PICKING_H_ID, named 'TPickingRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickingHId_NotExistsReferrer_TPickingRAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRAsOne(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_NotExistsReferrer_TPickingRAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingRAsOne");
    }
    public abstract String keepPickingHId_NotExistsReferrer_TPickingRAsOne(TPickingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PICKING_H_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PICKING_H_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickingHId_NotExistsReferrer_TReceivePlanHList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_NotExistsReferrer_TReceivePlanHList(cb.query());
        registerNotExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tReceivePlanHList");
    }
    public abstract String keepPickingHId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PICKING_H_ID from w_sgl_row_ship_insp_b where ...)} <br>
     * w_sgl_row_ship_insp_b by PICKING_H_ID, named 'WSglRowShipInspBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWSglRowShipInspBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickingHId_NotExistsReferrer_WSglRowShipInspBList for 'not exists'. (NotNull)
     */
    public void notExistsWSglRowShipInspBList(SubQuery<WSglRowShipInspBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingHId_NotExistsReferrer_WSglRowShipInspBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "wSglRowShipInspBList");
    }
    public abstract String keepPickingHId_NotExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    public void xsderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPickingHId_SpecifyDerivedReferrer_TPackingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPackingHList", al, op);
    }
    public abstract String keepPickingHId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq);

    public void xsderiveTPicMthdRcmdDataList(String fn, SubQuery<TPicMthdRcmdDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPickingHId_SpecifyDerivedReferrer_TPicMthdRcmdDataList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPicMthdRcmdDataList", al, op);
    }
    public abstract String keepPickingHId_SpecifyDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq);

    public void xsderiveTPickingBList(String fn, SubQuery<TPickingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPickingHId_SpecifyDerivedReferrer_TPickingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingBList", al, op);
    }
    public abstract String keepPickingHId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq);

    public void xsderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPickingHId_SpecifyDerivedReferrer_TReceivePlanHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tReceivePlanHList", al, op);
    }
    public abstract String keepPickingHId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);

    public void xsderiveWSglRowShipInspBList(String fn, SubQuery<WSglRowShipInspBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WSglRowShipInspBCB cb = new WSglRowShipInspBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPickingHId_SpecifyDerivedReferrer_WSglRowShipInspBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "wSglRowShipInspBList", al, op);
    }
    public abstract String keepPickingHId_SpecifyDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_packing_h where ...)} <br>
     * t_packing_h by PICKING_H_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingHCB> derivedTPackingHList() {
        return xcreateQDRFunctionTPackingHList();
    }
    protected HpQDRFunction<TPackingHCB> xcreateQDRFunctionTPackingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPickingHId_QueryDerivedReferrer_TPackingHList(cb.query()); String prpp = keepPickingHId_QueryDerivedReferrer_TPackingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", sqpp, "tPackingHList", rd, vl, prpp, op);
    }
    public abstract String keepPickingHId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq);
    public abstract String keepPickingHId_QueryDerivedReferrer_TPackingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_pic_mthd_rcmd_data where ...)} <br>
     * t_pic_mthd_rcmd_data by PICKING_H_ID, named 'TPicMthdRcmdDataAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPicMthdRcmdDataList()</span>.<span style="color: #CC4747">max</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dataCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dataCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdDataCB> derivedTPicMthdRcmdDataList() {
        return xcreateQDRFunctionTPicMthdRcmdDataList();
    }
    protected HpQDRFunction<TPicMthdRcmdDataCB> xcreateQDRFunctionTPicMthdRcmdDataList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPicMthdRcmdDataList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPicMthdRcmdDataList(String fn, SubQuery<TPicMthdRcmdDataCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList(cb.query()); String prpp = keepPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", sqpp, "tPicMthdRcmdDataList", rd, vl, prpp, op);
    }
    public abstract String keepPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq);
    public abstract String keepPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_b where ...)} <br>
     * t_picking_b by PICKING_H_ID, named 'TPickingBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepPickingHId_QueryDerivedReferrer_TPickingBList(cb.query()); String prpp = keepPickingHId_QueryDerivedReferrer_TPickingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", sqpp, "tPickingBList", rd, vl, prpp, op);
    }
    public abstract String keepPickingHId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq);
    public abstract String keepPickingHId_QueryDerivedReferrer_TPickingBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PICKING_H_ID, named 'TReceivePlanHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHList() {
        return xcreateQDRFunctionTReceivePlanHList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPickingHId_QueryDerivedReferrer_TReceivePlanHList(cb.query()); String prpp = keepPickingHId_QueryDerivedReferrer_TReceivePlanHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", sqpp, "tReceivePlanHList", rd, vl, prpp, op);
    }
    public abstract String keepPickingHId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq);
    public abstract String keepPickingHId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_sgl_row_ship_insp_b where ...)} <br>
     * w_sgl_row_ship_insp_b by PICKING_H_ID, named 'WSglRowShipInspBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepPickingHId_QueryDerivedReferrer_WSglRowShipInspBList(cb.query()); String prpp = keepPickingHId_QueryDerivedReferrer_WSglRowShipInspBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PICKING_H_ID", "PICKING_H_ID", sqpp, "wSglRowShipInspBList", rd, vl, prpp, op);
    }
    public abstract String keepPickingHId_QueryDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq);
    public abstract String keepPickingHId_QueryDerivedReferrer_WSglRowShipInspBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPickingHId_IsNull() { regPickingHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPickingHId_IsNotNull() { regPickingHId(CK_ISNN, DOBJ); }

    protected void regPickingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingHId(), "PICKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePickingHId();

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
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus}
     * @param pickingStatus The value of pickingStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingStatus_Equal(String pickingStatus) {
        doSetPickingStatus_Equal(fRES(pickingStatus));
    }

    /**
     * Equal(=). As PickingStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus cdef) {
        doSetPickingStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 未出荷
     */
    public void setPickingStatus_Equal_$10() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$10);
    }

    /**
     * Equal(=). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 出庫指示中
     */
    public void setPickingStatus_Equal_$15() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$15);
    }

    /**
     * Equal(=). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: 出庫指示解除中
     */
    public void setPickingStatus_Equal_$20() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$20);
    }

    /**
     * Equal(=). As $25 (25). And OnlyOnceRegistered. <br>
     * $25: 出庫指示済
     */
    public void setPickingStatus_Equal_$25() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$25);
    }

    /**
     * Equal(=). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: ピッキング中
     */
    public void setPickingStatus_Equal_$30() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$30);
    }

    /**
     * Equal(=). As $35 (35). And OnlyOnceRegistered. <br>
     * $35: ピッキング済
     */
    public void setPickingStatus_Equal_$35() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$35);
    }

    /**
     * Equal(=). As $40 (40). And OnlyOnceRegistered. <br>
     * $40: 出荷検品中
     */
    public void setPickingStatus_Equal_$40() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$40);
    }

    /**
     * Equal(=). As $45 (45). And OnlyOnceRegistered. <br>
     * $45: 出荷検品中断
     */
    public void setPickingStatus_Equal_$45() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$45);
    }

    /**
     * Equal(=). As $50 (50). And OnlyOnceRegistered. <br>
     * $50: 出荷検品済
     */
    public void setPickingStatus_Equal_$50() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$50);
    }

    /**
     * Equal(=). As $55 (55). And OnlyOnceRegistered. <br>
     * $55: 出荷確定済
     */
    public void setPickingStatus_Equal_$55() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$55);
    }

    /**
     * Equal(=). As $90 (90). And OnlyOnceRegistered. <br>
     * $90: キャンセル
     */
    public void setPickingStatus_Equal_$90() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$90);
    }

    /**
     * Equal(=). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: エラー有
     */
    public void setPickingStatus_Equal_$99() {
        setPickingStatus_Equal_AsPickingStatus(CDef.PickingStatus.$99);
    }

    protected void doSetPickingStatus_Equal(String pickingStatus) {
        regPickingStatus(CK_EQ, pickingStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus}
     * @param pickingStatus The value of pickingStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingStatus_NotEqual(String pickingStatus) {
        doSetPickingStatus_NotEqual(fRES(pickingStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As PickingStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus cdef) {
        doSetPickingStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 未出荷
     */
    public void setPickingStatus_NotEqual_$10() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$10);
    }

    /**
     * NotEqual(&lt;&gt;). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 出庫指示中
     */
    public void setPickingStatus_NotEqual_$15() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$15);
    }

    /**
     * NotEqual(&lt;&gt;). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: 出庫指示解除中
     */
    public void setPickingStatus_NotEqual_$20() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$20);
    }

    /**
     * NotEqual(&lt;&gt;). As $25 (25). And OnlyOnceRegistered. <br>
     * $25: 出庫指示済
     */
    public void setPickingStatus_NotEqual_$25() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$25);
    }

    /**
     * NotEqual(&lt;&gt;). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: ピッキング中
     */
    public void setPickingStatus_NotEqual_$30() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$30);
    }

    /**
     * NotEqual(&lt;&gt;). As $35 (35). And OnlyOnceRegistered. <br>
     * $35: ピッキング済
     */
    public void setPickingStatus_NotEqual_$35() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$35);
    }

    /**
     * NotEqual(&lt;&gt;). As $40 (40). And OnlyOnceRegistered. <br>
     * $40: 出荷検品中
     */
    public void setPickingStatus_NotEqual_$40() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$40);
    }

    /**
     * NotEqual(&lt;&gt;). As $45 (45). And OnlyOnceRegistered. <br>
     * $45: 出荷検品中断
     */
    public void setPickingStatus_NotEqual_$45() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$45);
    }

    /**
     * NotEqual(&lt;&gt;). As $50 (50). And OnlyOnceRegistered. <br>
     * $50: 出荷検品済
     */
    public void setPickingStatus_NotEqual_$50() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$50);
    }

    /**
     * NotEqual(&lt;&gt;). As $55 (55). And OnlyOnceRegistered. <br>
     * $55: 出荷確定済
     */
    public void setPickingStatus_NotEqual_$55() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$55);
    }

    /**
     * NotEqual(&lt;&gt;). As $90 (90). And OnlyOnceRegistered. <br>
     * $90: キャンセル
     */
    public void setPickingStatus_NotEqual_$90() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$90);
    }

    /**
     * NotEqual(&lt;&gt;). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: エラー有
     */
    public void setPickingStatus_NotEqual_$99() {
        setPickingStatus_NotEqual_AsPickingStatus(CDef.PickingStatus.$99);
    }

    protected void doSetPickingStatus_NotEqual(String pickingStatus) {
        regPickingStatus(CK_NES, pickingStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus}
     * @param pickingStatusList The collection of pickingStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingStatus_InScope(Collection<String> pickingStatusList) {
        doSetPickingStatus_InScope(pickingStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As PickingStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingStatus_InScope_AsPickingStatus(Collection<CDef.PickingStatus> cdefList) {
        doSetPickingStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetPickingStatus_InScope(Collection<String> pickingStatusList) {
        regINS(CK_INS, cTL(pickingStatusList), xgetCValuePickingStatus(), "PICKING_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus}
     * @param pickingStatusList The collection of pickingStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingStatus_NotInScope(Collection<String> pickingStatusList) {
        doSetPickingStatus_NotInScope(pickingStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PickingStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus} <br>
     * 出庫ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingStatus_NotInScope_AsPickingStatus(Collection<CDef.PickingStatus> cdefList) {
        doSetPickingStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPickingStatus_NotInScope(Collection<String> pickingStatusList) {
        regINS(CK_NINS, cTL(pickingStatusList), xgetCValuePickingStatus(), "PICKING_STATUS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus}
     */
    public void setPickingStatus_IsNull() { regPickingStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus}
     */
    public void setPickingStatus_IsNullOrEmpty() { regPickingStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PickingStatus}
     */
    public void setPickingStatus_IsNotNull() { regPickingStatus(CK_ISNN, DOBJ); }

    protected void regPickingStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingStatus(), "PICKING_STATUS"); }
    protected abstract ConditionValue xgetCValuePickingStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNo The value of delivUnitNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_Equal(String delivUnitNo) {
        doSetDelivUnitNo_Equal(fRES(delivUnitNo));
    }

    protected void doSetDelivUnitNo_Equal(String delivUnitNo) {
        regDelivUnitNo(CK_EQ, delivUnitNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNo The value of delivUnitNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_NotEqual(String delivUnitNo) {
        doSetDelivUnitNo_NotEqual(fRES(delivUnitNo));
    }

    protected void doSetDelivUnitNo_NotEqual(String delivUnitNo) {
        regDelivUnitNo(CK_NES, delivUnitNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNo The value of delivUnitNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_GreaterThan(String delivUnitNo) {
        regDelivUnitNo(CK_GT, fRES(delivUnitNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNo The value of delivUnitNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_LessThan(String delivUnitNo) {
        regDelivUnitNo(CK_LT, fRES(delivUnitNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNo The value of delivUnitNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_GreaterEqual(String delivUnitNo) {
        regDelivUnitNo(CK_GE, fRES(delivUnitNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNo The value of delivUnitNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_LessEqual(String delivUnitNo) {
        regDelivUnitNo(CK_LE, fRES(delivUnitNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNoList The collection of delivUnitNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_InScope(Collection<String> delivUnitNoList) {
        doSetDelivUnitNo_InScope(delivUnitNoList);
    }

    protected void doSetDelivUnitNo_InScope(Collection<String> delivUnitNoList) {
        regINS(CK_INS, cTL(delivUnitNoList), xgetCValueDelivUnitNo(), "DELIV_UNIT_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNoList The collection of delivUnitNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_NotInScope(Collection<String> delivUnitNoList) {
        doSetDelivUnitNo_NotInScope(delivUnitNoList);
    }

    protected void doSetDelivUnitNo_NotInScope(Collection<String> delivUnitNoList) {
        regINS(CK_NINS, cTL(delivUnitNoList), xgetCValueDelivUnitNo(), "DELIV_UNIT_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivUnitNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivUnitNo The value of delivUnitNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivUnitNo_LikeSearch(String delivUnitNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivUnitNo), xgetCValueDelivUnitNo(), "DELIV_UNIT_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNo The value of delivUnitNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivUnitNo_NotLikeSearch(String delivUnitNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivUnitNo), xgetCValueDelivUnitNo(), "DELIV_UNIT_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     * @param delivUnitNo The value of delivUnitNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivUnitNo_PrefixSearch(String delivUnitNo) {
        setDelivUnitNo_LikeSearch(delivUnitNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     */
    public void setDelivUnitNo_IsNull() { regDelivUnitNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     */
    public void setDelivUnitNo_IsNullOrEmpty() { regDelivUnitNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_UNIT_NO: {VARCHAR(30)}
     */
    public void setDelivUnitNo_IsNotNull() { regDelivUnitNo(CK_ISNN, DOBJ); }

    protected void regDelivUnitNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivUnitNo(), "DELIV_UNIT_NO"); }
    protected abstract ConditionValue xgetCValueDelivUnitNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_Equal(String pickingWorkNo) {
        doSetPickingWorkNo_Equal(fRES(pickingWorkNo));
    }

    protected void doSetPickingWorkNo_Equal(String pickingWorkNo) {
        regPickingWorkNo(CK_EQ, pickingWorkNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_NotEqual(String pickingWorkNo) {
        doSetPickingWorkNo_NotEqual(fRES(pickingWorkNo));
    }

    protected void doSetPickingWorkNo_NotEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_NES, pickingWorkNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_GreaterThan(String pickingWorkNo) {
        regPickingWorkNo(CK_GT, fRES(pickingWorkNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_LessThan(String pickingWorkNo) {
        regPickingWorkNo(CK_LT, fRES(pickingWorkNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_GreaterEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_GE, fRES(pickingWorkNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_LessEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_LE, fRES(pickingWorkNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNoList The collection of pickingWorkNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_InScope(Collection<String> pickingWorkNoList) {
        doSetPickingWorkNo_InScope(pickingWorkNoList);
    }

    protected void doSetPickingWorkNo_InScope(Collection<String> pickingWorkNoList) {
        regINS(CK_INS, cTL(pickingWorkNoList), xgetCValuePickingWorkNo(), "PICKING_WORK_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNoList The collection of pickingWorkNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_NotInScope(Collection<String> pickingWorkNoList) {
        doSetPickingWorkNo_NotInScope(pickingWorkNoList);
    }

    protected void doSetPickingWorkNo_NotInScope(Collection<String> pickingWorkNoList) {
        regINS(CK_NINS, cTL(pickingWorkNoList), xgetCValuePickingWorkNo(), "PICKING_WORK_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setPickingWorkNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingWorkNo The value of pickingWorkNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingWorkNo_LikeSearch(String pickingWorkNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingWorkNo), xgetCValuePickingWorkNo(), "PICKING_WORK_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingWorkNo_NotLikeSearch(String pickingWorkNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingWorkNo), xgetCValuePickingWorkNo(), "PICKING_WORK_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_PrefixSearch(String pickingWorkNo) {
        setPickingWorkNo_LikeSearch(pickingWorkNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     */
    public void setPickingWorkNo_IsNull() { regPickingWorkNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     */
    public void setPickingWorkNo_IsNullOrEmpty() { regPickingWorkNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {IX, VARCHAR(30)}
     */
    public void setPickingWorkNo_IsNotNull() { regPickingWorkNo(CK_ISNN, DOBJ); }

    protected void regPickingWorkNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingWorkNo(), "PICKING_WORK_NO"); }
    protected abstract ConditionValue xgetCValuePickingWorkNo();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     * @param forceFixedFlg The value of forceFixedFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForceFixedFlg_Equal(String forceFixedFlg) {
        doSetForceFixedFlg_Equal(fRES(forceFixedFlg));
    }

    /**
     * Equal(=). As ForceFixedFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setForceFixedFlg_Equal_AsForceFixedFlg(CDef.ForceFixedFlg cdef) {
        doSetForceFixedFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常確定
     */
    public void setForceFixedFlg_Equal_$0() {
        setForceFixedFlg_Equal_AsForceFixedFlg(CDef.ForceFixedFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 強制確定
     */
    public void setForceFixedFlg_Equal_$1() {
        setForceFixedFlg_Equal_AsForceFixedFlg(CDef.ForceFixedFlg.$1);
    }

    protected void doSetForceFixedFlg_Equal(String forceFixedFlg) {
        regForceFixedFlg(CK_EQ, forceFixedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     * @param forceFixedFlg The value of forceFixedFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForceFixedFlg_NotEqual(String forceFixedFlg) {
        doSetForceFixedFlg_NotEqual(fRES(forceFixedFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ForceFixedFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setForceFixedFlg_NotEqual_AsForceFixedFlg(CDef.ForceFixedFlg cdef) {
        doSetForceFixedFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常確定
     */
    public void setForceFixedFlg_NotEqual_$0() {
        setForceFixedFlg_NotEqual_AsForceFixedFlg(CDef.ForceFixedFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 強制確定
     */
    public void setForceFixedFlg_NotEqual_$1() {
        setForceFixedFlg_NotEqual_AsForceFixedFlg(CDef.ForceFixedFlg.$1);
    }

    protected void doSetForceFixedFlg_NotEqual(String forceFixedFlg) {
        regForceFixedFlg(CK_NES, forceFixedFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     * @param forceFixedFlgList The collection of forceFixedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForceFixedFlg_InScope(Collection<String> forceFixedFlgList) {
        doSetForceFixedFlg_InScope(forceFixedFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ForceFixedFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForceFixedFlg_InScope_AsForceFixedFlg(Collection<CDef.ForceFixedFlg> cdefList) {
        doSetForceFixedFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetForceFixedFlg_InScope(Collection<String> forceFixedFlgList) {
        regINS(CK_INS, cTL(forceFixedFlgList), xgetCValueForceFixedFlg(), "FORCE_FIXED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     * @param forceFixedFlgList The collection of forceFixedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForceFixedFlg_NotInScope(Collection<String> forceFixedFlgList) {
        doSetForceFixedFlg_NotInScope(forceFixedFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ForceFixedFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg} <br>
     * 強制確定フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForceFixedFlg_NotInScope_AsForceFixedFlg(Collection<CDef.ForceFixedFlg> cdefList) {
        doSetForceFixedFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetForceFixedFlg_NotInScope(Collection<String> forceFixedFlgList) {
        regINS(CK_NINS, cTL(forceFixedFlgList), xgetCValueForceFixedFlg(), "FORCE_FIXED_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     */
    public void setForceFixedFlg_IsNull() { regForceFixedFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     */
    public void setForceFixedFlg_IsNullOrEmpty() { regForceFixedFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FORCE_FIXED_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ForceFixedFlg}
     */
    public void setForceFixedFlg_IsNotNull() { regForceFixedFlg(CK_ISNN, DOBJ); }

    protected void regForceFixedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForceFixedFlg(), "FORCE_FIXED_FLG"); }
    protected abstract ConditionValue xgetCValueForceFixedFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNo The value of pickingGroupNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_Equal(String pickingGroupNo) {
        doSetPickingGroupNo_Equal(fRES(pickingGroupNo));
    }

    protected void doSetPickingGroupNo_Equal(String pickingGroupNo) {
        regPickingGroupNo(CK_EQ, pickingGroupNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNo The value of pickingGroupNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_NotEqual(String pickingGroupNo) {
        doSetPickingGroupNo_NotEqual(fRES(pickingGroupNo));
    }

    protected void doSetPickingGroupNo_NotEqual(String pickingGroupNo) {
        regPickingGroupNo(CK_NES, pickingGroupNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNo The value of pickingGroupNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_GreaterThan(String pickingGroupNo) {
        regPickingGroupNo(CK_GT, fRES(pickingGroupNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNo The value of pickingGroupNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_LessThan(String pickingGroupNo) {
        regPickingGroupNo(CK_LT, fRES(pickingGroupNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNo The value of pickingGroupNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_GreaterEqual(String pickingGroupNo) {
        regPickingGroupNo(CK_GE, fRES(pickingGroupNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNo The value of pickingGroupNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_LessEqual(String pickingGroupNo) {
        regPickingGroupNo(CK_LE, fRES(pickingGroupNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNoList The collection of pickingGroupNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_InScope(Collection<String> pickingGroupNoList) {
        doSetPickingGroupNo_InScope(pickingGroupNoList);
    }

    protected void doSetPickingGroupNo_InScope(Collection<String> pickingGroupNoList) {
        regINS(CK_INS, cTL(pickingGroupNoList), xgetCValuePickingGroupNo(), "PICKING_GROUP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNoList The collection of pickingGroupNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_NotInScope(Collection<String> pickingGroupNoList) {
        doSetPickingGroupNo_NotInScope(pickingGroupNoList);
    }

    protected void doSetPickingGroupNo_NotInScope(Collection<String> pickingGroupNoList) {
        regINS(CK_NINS, cTL(pickingGroupNoList), xgetCValuePickingGroupNo(), "PICKING_GROUP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setPickingGroupNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingGroupNo The value of pickingGroupNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingGroupNo_LikeSearch(String pickingGroupNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingGroupNo), xgetCValuePickingGroupNo(), "PICKING_GROUP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNo The value of pickingGroupNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingGroupNo_NotLikeSearch(String pickingGroupNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingGroupNo), xgetCValuePickingGroupNo(), "PICKING_GROUP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     * @param pickingGroupNo The value of pickingGroupNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingGroupNo_PrefixSearch(String pickingGroupNo) {
        setPickingGroupNo_LikeSearch(pickingGroupNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     */
    public void setPickingGroupNo_IsNull() { regPickingGroupNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     */
    public void setPickingGroupNo_IsNullOrEmpty() { regPickingGroupNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_GROUP_NO: {VARCHAR(30)}
     */
    public void setPickingGroupNo_IsNotNull() { regPickingGroupNo(CK_ISNN, DOBJ); }

    protected void regPickingGroupNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingGroupNo(), "PICKING_GROUP_NO"); }
    protected abstract ConditionValue xgetCValuePickingGroupNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @param sglRowPicFlg The value of sglRowPicFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_Equal(String sglRowPicFlg) {
        doSetSglRowPicFlg_Equal(fRES(sglRowPicFlg));
    }

    /**
     * Equal(=). As SglRowPicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_Equal_AsSglRowPicFlg(CDef.SglRowPicFlg cdef) {
        doSetSglRowPicFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 単行ピック無
     */
    public void setSglRowPicFlg_Equal_$0() {
        setSglRowPicFlg_Equal_AsSglRowPicFlg(CDef.SglRowPicFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 単行ピック有
     */
    public void setSglRowPicFlg_Equal_$1() {
        setSglRowPicFlg_Equal_AsSglRowPicFlg(CDef.SglRowPicFlg.$1);
    }

    protected void doSetSglRowPicFlg_Equal(String sglRowPicFlg) {
        regSglRowPicFlg(CK_EQ, sglRowPicFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @param sglRowPicFlg The value of sglRowPicFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_NotEqual(String sglRowPicFlg) {
        doSetSglRowPicFlg_NotEqual(fRES(sglRowPicFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SglRowPicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_NotEqual_AsSglRowPicFlg(CDef.SglRowPicFlg cdef) {
        doSetSglRowPicFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 単行ピック無
     */
    public void setSglRowPicFlg_NotEqual_$0() {
        setSglRowPicFlg_NotEqual_AsSglRowPicFlg(CDef.SglRowPicFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 単行ピック有
     */
    public void setSglRowPicFlg_NotEqual_$1() {
        setSglRowPicFlg_NotEqual_AsSglRowPicFlg(CDef.SglRowPicFlg.$1);
    }

    protected void doSetSglRowPicFlg_NotEqual(String sglRowPicFlg) {
        regSglRowPicFlg(CK_NES, sglRowPicFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @param sglRowPicFlgList The collection of sglRowPicFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_InScope(Collection<String> sglRowPicFlgList) {
        doSetSglRowPicFlg_InScope(sglRowPicFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SglRowPicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_InScope_AsSglRowPicFlg(Collection<CDef.SglRowPicFlg> cdefList) {
        doSetSglRowPicFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSglRowPicFlg_InScope(Collection<String> sglRowPicFlgList) {
        regINS(CK_INS, cTL(sglRowPicFlgList), xgetCValueSglRowPicFlg(), "SGL_ROW_PIC_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @param sglRowPicFlgList The collection of sglRowPicFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_NotInScope(Collection<String> sglRowPicFlgList) {
        doSetSglRowPicFlg_NotInScope(sglRowPicFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SglRowPicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSglRowPicFlg_NotInScope_AsSglRowPicFlg(Collection<CDef.SglRowPicFlg> cdefList) {
        doSetSglRowPicFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSglRowPicFlg_NotInScope(Collection<String> sglRowPicFlgList) {
        regINS(CK_NINS, cTL(sglRowPicFlgList), xgetCValueSglRowPicFlg(), "SGL_ROW_PIC_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     */
    public void setSglRowPicFlg_IsNull() { regSglRowPicFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     */
    public void setSglRowPicFlg_IsNullOrEmpty() { regSglRowPicFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SGL_ROW_PIC_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=SglRowPicFlg}
     */
    public void setSglRowPicFlg_IsNotNull() { regSglRowPicFlg(CK_ISNN, DOBJ); }

    protected void regSglRowPicFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSglRowPicFlg(), "SGL_ROW_PIC_FLG"); }
    protected abstract ConditionValue xgetCValueSglRowPicFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDt The value of shippingFixedDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_Equal(String shippingFixedDt) {
        doSetShippingFixedDt_Equal(fRES(shippingFixedDt));
    }

    protected void doSetShippingFixedDt_Equal(String shippingFixedDt) {
        regShippingFixedDt(CK_EQ, shippingFixedDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDt The value of shippingFixedDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_NotEqual(String shippingFixedDt) {
        doSetShippingFixedDt_NotEqual(fRES(shippingFixedDt));
    }

    protected void doSetShippingFixedDt_NotEqual(String shippingFixedDt) {
        regShippingFixedDt(CK_NES, shippingFixedDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDt The value of shippingFixedDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_GreaterThan(String shippingFixedDt) {
        regShippingFixedDt(CK_GT, fRES(shippingFixedDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDt The value of shippingFixedDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_LessThan(String shippingFixedDt) {
        regShippingFixedDt(CK_LT, fRES(shippingFixedDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDt The value of shippingFixedDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_GreaterEqual(String shippingFixedDt) {
        regShippingFixedDt(CK_GE, fRES(shippingFixedDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDt The value of shippingFixedDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_LessEqual(String shippingFixedDt) {
        regShippingFixedDt(CK_LE, fRES(shippingFixedDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDtList The collection of shippingFixedDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_InScope(Collection<String> shippingFixedDtList) {
        doSetShippingFixedDt_InScope(shippingFixedDtList);
    }

    protected void doSetShippingFixedDt_InScope(Collection<String> shippingFixedDtList) {
        regINS(CK_INS, cTL(shippingFixedDtList), xgetCValueShippingFixedDt(), "SHIPPING_FIXED_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDtList The collection of shippingFixedDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_NotInScope(Collection<String> shippingFixedDtList) {
        doSetShippingFixedDt_NotInScope(shippingFixedDtList);
    }

    protected void doSetShippingFixedDt_NotInScope(Collection<String> shippingFixedDtList) {
        regINS(CK_NINS, cTL(shippingFixedDtList), xgetCValueShippingFixedDt(), "SHIPPING_FIXED_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setShippingFixedDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingFixedDt The value of shippingFixedDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingFixedDt_LikeSearch(String shippingFixedDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingFixedDt), xgetCValueShippingFixedDt(), "SHIPPING_FIXED_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDt The value of shippingFixedDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingFixedDt_NotLikeSearch(String shippingFixedDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingFixedDt), xgetCValueShippingFixedDt(), "SHIPPING_FIXED_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     * @param shippingFixedDt The value of shippingFixedDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFixedDt_PrefixSearch(String shippingFixedDt) {
        setShippingFixedDt_LikeSearch(shippingFixedDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     */
    public void setShippingFixedDt_IsNull() { regShippingFixedDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     */
    public void setShippingFixedDt_IsNullOrEmpty() { regShippingFixedDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_FIXED_DT: {VARCHAR(8)}
     */
    public void setShippingFixedDt_IsNotNull() { regShippingFixedDt(CK_ISNN, DOBJ); }

    protected void regShippingFixedDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingFixedDt(), "SHIPPING_FIXED_DT"); }
    protected abstract ConditionValue xgetCValueShippingFixedDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @param centerTransitFlg The value of centerTransitFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_Equal(String centerTransitFlg) {
        doSetCenterTransitFlg_Equal(fRES(centerTransitFlg));
    }

    /**
     * Equal(=). As CenterTransitFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_Equal_AsCenterTransitFlg(CDef.CenterTransitFlg cdef) {
        doSetCenterTransitFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setCenterTransitFlg_Equal_$0() {
        setCenterTransitFlg_Equal_AsCenterTransitFlg(CDef.CenterTransitFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: センタ間移動
     */
    public void setCenterTransitFlg_Equal_$1() {
        setCenterTransitFlg_Equal_AsCenterTransitFlg(CDef.CenterTransitFlg.$1);
    }

    protected void doSetCenterTransitFlg_Equal(String centerTransitFlg) {
        regCenterTransitFlg(CK_EQ, centerTransitFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @param centerTransitFlg The value of centerTransitFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_NotEqual(String centerTransitFlg) {
        doSetCenterTransitFlg_NotEqual(fRES(centerTransitFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterTransitFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_NotEqual_AsCenterTransitFlg(CDef.CenterTransitFlg cdef) {
        doSetCenterTransitFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setCenterTransitFlg_NotEqual_$0() {
        setCenterTransitFlg_NotEqual_AsCenterTransitFlg(CDef.CenterTransitFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: センタ間移動
     */
    public void setCenterTransitFlg_NotEqual_$1() {
        setCenterTransitFlg_NotEqual_AsCenterTransitFlg(CDef.CenterTransitFlg.$1);
    }

    protected void doSetCenterTransitFlg_NotEqual(String centerTransitFlg) {
        regCenterTransitFlg(CK_NES, centerTransitFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @param centerTransitFlgList The collection of centerTransitFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_InScope(Collection<String> centerTransitFlgList) {
        doSetCenterTransitFlg_InScope(centerTransitFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterTransitFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_InScope_AsCenterTransitFlg(Collection<CDef.CenterTransitFlg> cdefList) {
        doSetCenterTransitFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCenterTransitFlg_InScope(Collection<String> centerTransitFlgList) {
        regINS(CK_INS, cTL(centerTransitFlgList), xgetCValueCenterTransitFlg(), "CENTER_TRANSIT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @param centerTransitFlgList The collection of centerTransitFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_NotInScope(Collection<String> centerTransitFlgList) {
        doSetCenterTransitFlg_NotInScope(centerTransitFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterTransitFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_NotInScope_AsCenterTransitFlg(Collection<CDef.CenterTransitFlg> cdefList) {
        doSetCenterTransitFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCenterTransitFlg_NotInScope(Collection<String> centerTransitFlgList) {
        regINS(CK_NINS, cTL(centerTransitFlgList), xgetCValueCenterTransitFlg(), "CENTER_TRANSIT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     */
    public void setCenterTransitFlg_IsNull() { regCenterTransitFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     */
    public void setCenterTransitFlg_IsNullOrEmpty() { regCenterTransitFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     */
    public void setCenterTransitFlg_IsNotNull() { regCenterTransitFlg(CK_ISNN, DOBJ); }

    protected void regCenterTransitFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterTransitFlg(), "CENTER_TRANSIT_FLG"); }
    protected abstract ConditionValue xgetCValueCenterTransitFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     * @param packingCalCls The value of packingCalCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_Equal(String packingCalCls) {
        doSetPackingCalCls_Equal(fRES(packingCalCls));
    }

    /**
     * Equal(=). As PackingCalCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingCalCls_Equal_AsPackingCalCls(CDef.PackingCalCls cdef) {
        doSetPackingCalCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 梱包計算無
     */
    public void setPackingCalCls_Equal_$0() {
        setPackingCalCls_Equal_AsPackingCalCls(CDef.PackingCalCls.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 容積と重量による梱包計算
     */
    public void setPackingCalCls_Equal_$1() {
        setPackingCalCls_Equal_AsPackingCalCls(CDef.PackingCalCls.$1);
    }

    protected void doSetPackingCalCls_Equal(String packingCalCls) {
        regPackingCalCls(CK_EQ, packingCalCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     * @param packingCalCls The value of packingCalCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_NotEqual(String packingCalCls) {
        doSetPackingCalCls_NotEqual(fRES(packingCalCls));
    }

    /**
     * NotEqual(&lt;&gt;). As PackingCalCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingCalCls_NotEqual_AsPackingCalCls(CDef.PackingCalCls cdef) {
        doSetPackingCalCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 梱包計算無
     */
    public void setPackingCalCls_NotEqual_$0() {
        setPackingCalCls_NotEqual_AsPackingCalCls(CDef.PackingCalCls.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 容積と重量による梱包計算
     */
    public void setPackingCalCls_NotEqual_$1() {
        setPackingCalCls_NotEqual_AsPackingCalCls(CDef.PackingCalCls.$1);
    }

    protected void doSetPackingCalCls_NotEqual(String packingCalCls) {
        regPackingCalCls(CK_NES, packingCalCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     * @param packingCalClsList The collection of packingCalCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_InScope(Collection<String> packingCalClsList) {
        doSetPackingCalCls_InScope(packingCalClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As PackingCalCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_InScope_AsPackingCalCls(Collection<CDef.PackingCalCls> cdefList) {
        doSetPackingCalCls_InScope(cTStrL(cdefList));
    }

    protected void doSetPackingCalCls_InScope(Collection<String> packingCalClsList) {
        regINS(CK_INS, cTL(packingCalClsList), xgetCValuePackingCalCls(), "PACKING_CAL_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     * @param packingCalClsList The collection of packingCalCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_NotInScope(Collection<String> packingCalClsList) {
        doSetPackingCalCls_NotInScope(packingCalClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PackingCalCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingCalCls_NotInScope_AsPackingCalCls(Collection<CDef.PackingCalCls> cdefList) {
        doSetPackingCalCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPackingCalCls_NotInScope(Collection<String> packingCalClsList) {
        regINS(CK_NINS, cTL(packingCalClsList), xgetCValuePackingCalCls(), "PACKING_CAL_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     */
    public void setPackingCalCls_IsNull() { regPackingCalCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     */
    public void setPackingCalCls_IsNullOrEmpty() { regPackingCalCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_CAL_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=PackingCalCls}
     */
    public void setPackingCalCls_IsNotNull() { regPackingCalCls(CK_ISNN, DOBJ); }

    protected void regPackingCalCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingCalCls(), "PACKING_CAL_CLS"); }
    protected abstract ConditionValue xgetCValuePackingCalCls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNo The value of bolNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_Equal(String bolNo) {
        doSetBolNo_Equal(fRES(bolNo));
    }

    protected void doSetBolNo_Equal(String bolNo) {
        regBolNo(CK_EQ, bolNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNo The value of bolNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_NotEqual(String bolNo) {
        doSetBolNo_NotEqual(fRES(bolNo));
    }

    protected void doSetBolNo_NotEqual(String bolNo) {
        regBolNo(CK_NES, bolNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNo The value of bolNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_GreaterThan(String bolNo) {
        regBolNo(CK_GT, fRES(bolNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNo The value of bolNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_LessThan(String bolNo) {
        regBolNo(CK_LT, fRES(bolNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNo The value of bolNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_GreaterEqual(String bolNo) {
        regBolNo(CK_GE, fRES(bolNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNo The value of bolNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_LessEqual(String bolNo) {
        regBolNo(CK_LE, fRES(bolNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNoList The collection of bolNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_InScope(Collection<String> bolNoList) {
        doSetBolNo_InScope(bolNoList);
    }

    protected void doSetBolNo_InScope(Collection<String> bolNoList) {
        regINS(CK_INS, cTL(bolNoList), xgetCValueBolNo(), "BOL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNoList The collection of bolNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_NotInScope(Collection<String> bolNoList) {
        doSetBolNo_NotInScope(bolNoList);
    }

    protected void doSetBolNo_NotInScope(Collection<String> bolNoList) {
        regINS(CK_NINS, cTL(bolNoList), xgetCValueBolNo(), "BOL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setBolNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bolNo The value of bolNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBolNo_LikeSearch(String bolNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bolNo), xgetCValueBolNo(), "BOL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNo The value of bolNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBolNo_NotLikeSearch(String bolNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bolNo), xgetCValueBolNo(), "BOL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     * @param bolNo The value of bolNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolNo_PrefixSearch(String bolNo) {
        setBolNo_LikeSearch(bolNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     */
    public void setBolNo_IsNull() { regBolNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     */
    public void setBolNo_IsNullOrEmpty() { regBolNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOL_NO: {VARCHAR(30)}
     */
    public void setBolNo_IsNotNull() { regBolNo(CK_ISNN, DOBJ); }

    protected void regBolNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBolNo(), "BOL_NO"); }
    protected abstract ConditionValue xgetCValueBolNo();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_Equal(String pickForceCopleteFlg) {
        doSetPickForceCopleteFlg_Equal(fRES(pickForceCopleteFlg));
    }

    protected void doSetPickForceCopleteFlg_Equal(String pickForceCopleteFlg) {
        regPickForceCopleteFlg(CK_EQ, pickForceCopleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_NotEqual(String pickForceCopleteFlg) {
        doSetPickForceCopleteFlg_NotEqual(fRES(pickForceCopleteFlg));
    }

    protected void doSetPickForceCopleteFlg_NotEqual(String pickForceCopleteFlg) {
        regPickForceCopleteFlg(CK_NES, pickForceCopleteFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_GreaterThan(String pickForceCopleteFlg) {
        regPickForceCopleteFlg(CK_GT, fRES(pickForceCopleteFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_LessThan(String pickForceCopleteFlg) {
        regPickForceCopleteFlg(CK_LT, fRES(pickForceCopleteFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_GreaterEqual(String pickForceCopleteFlg) {
        regPickForceCopleteFlg(CK_GE, fRES(pickForceCopleteFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_LessEqual(String pickForceCopleteFlg) {
        regPickForceCopleteFlg(CK_LE, fRES(pickForceCopleteFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlgList The collection of pickForceCopleteFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_InScope(Collection<String> pickForceCopleteFlgList) {
        doSetPickForceCopleteFlg_InScope(pickForceCopleteFlgList);
    }

    protected void doSetPickForceCopleteFlg_InScope(Collection<String> pickForceCopleteFlgList) {
        regINS(CK_INS, cTL(pickForceCopleteFlgList), xgetCValuePickForceCopleteFlg(), "PICK_FORCE_COPLETE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlgList The collection of pickForceCopleteFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_NotInScope(Collection<String> pickForceCopleteFlgList) {
        doSetPickForceCopleteFlg_NotInScope(pickForceCopleteFlgList);
    }

    protected void doSetPickForceCopleteFlg_NotInScope(Collection<String> pickForceCopleteFlgList) {
        regINS(CK_NINS, cTL(pickForceCopleteFlgList), xgetCValuePickForceCopleteFlg(), "PICK_FORCE_COPLETE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setPickForceCopleteFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickForceCopleteFlg_LikeSearch(String pickForceCopleteFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickForceCopleteFlg), xgetCValuePickForceCopleteFlg(), "PICK_FORCE_COPLETE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickForceCopleteFlg_NotLikeSearch(String pickForceCopleteFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickForceCopleteFlg), xgetCValuePickForceCopleteFlg(), "PICK_FORCE_COPLETE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param pickForceCopleteFlg The value of pickForceCopleteFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickForceCopleteFlg_PrefixSearch(String pickForceCopleteFlg) {
        setPickForceCopleteFlg_LikeSearch(pickForceCopleteFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     */
    public void setPickForceCopleteFlg_IsNull() { regPickForceCopleteFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     */
    public void setPickForceCopleteFlg_IsNullOrEmpty() { regPickForceCopleteFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICK_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     */
    public void setPickForceCopleteFlg_IsNotNull() { regPickForceCopleteFlg(CK_ISNN, DOBJ); }

    protected void regPickForceCopleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickForceCopleteFlg(), "PICK_FORCE_COPLETE_FLG"); }
    protected abstract ConditionValue xgetCValuePickForceCopleteFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_Equal(String inspForceCopleteFlg) {
        doSetInspForceCopleteFlg_Equal(fRES(inspForceCopleteFlg));
    }

    protected void doSetInspForceCopleteFlg_Equal(String inspForceCopleteFlg) {
        regInspForceCopleteFlg(CK_EQ, inspForceCopleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_NotEqual(String inspForceCopleteFlg) {
        doSetInspForceCopleteFlg_NotEqual(fRES(inspForceCopleteFlg));
    }

    protected void doSetInspForceCopleteFlg_NotEqual(String inspForceCopleteFlg) {
        regInspForceCopleteFlg(CK_NES, inspForceCopleteFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_GreaterThan(String inspForceCopleteFlg) {
        regInspForceCopleteFlg(CK_GT, fRES(inspForceCopleteFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_LessThan(String inspForceCopleteFlg) {
        regInspForceCopleteFlg(CK_LT, fRES(inspForceCopleteFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_GreaterEqual(String inspForceCopleteFlg) {
        regInspForceCopleteFlg(CK_GE, fRES(inspForceCopleteFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_LessEqual(String inspForceCopleteFlg) {
        regInspForceCopleteFlg(CK_LE, fRES(inspForceCopleteFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlgList The collection of inspForceCopleteFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_InScope(Collection<String> inspForceCopleteFlgList) {
        doSetInspForceCopleteFlg_InScope(inspForceCopleteFlgList);
    }

    protected void doSetInspForceCopleteFlg_InScope(Collection<String> inspForceCopleteFlgList) {
        regINS(CK_INS, cTL(inspForceCopleteFlgList), xgetCValueInspForceCopleteFlg(), "INSP_FORCE_COPLETE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlgList The collection of inspForceCopleteFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_NotInScope(Collection<String> inspForceCopleteFlgList) {
        doSetInspForceCopleteFlg_NotInScope(inspForceCopleteFlgList);
    }

    protected void doSetInspForceCopleteFlg_NotInScope(Collection<String> inspForceCopleteFlgList) {
        regINS(CK_NINS, cTL(inspForceCopleteFlgList), xgetCValueInspForceCopleteFlg(), "INSP_FORCE_COPLETE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setInspForceCopleteFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInspForceCopleteFlg_LikeSearch(String inspForceCopleteFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inspForceCopleteFlg), xgetCValueInspForceCopleteFlg(), "INSP_FORCE_COPLETE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInspForceCopleteFlg_NotLikeSearch(String inspForceCopleteFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inspForceCopleteFlg), xgetCValueInspForceCopleteFlg(), "INSP_FORCE_COPLETE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     * @param inspForceCopleteFlg The value of inspForceCopleteFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspForceCopleteFlg_PrefixSearch(String inspForceCopleteFlg) {
        setInspForceCopleteFlg_LikeSearch(inspForceCopleteFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     */
    public void setInspForceCopleteFlg_IsNull() { regInspForceCopleteFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     */
    public void setInspForceCopleteFlg_IsNullOrEmpty() { regInspForceCopleteFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSP_FORCE_COPLETE_FLG: {CHAR(1), default=[0]}
     */
    public void setInspForceCopleteFlg_IsNotNull() { regInspForceCopleteFlg(CK_ISNN, DOBJ); }

    protected void regInspForceCopleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspForceCopleteFlg(), "INSP_FORCE_COPLETE_FLG"); }
    protected abstract ConditionValue xgetCValueInspForceCopleteFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatus The value of printStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_Equal(String printStatus) {
        doSetPrintStatus_Equal(fRES(printStatus));
    }

    protected void doSetPrintStatus_Equal(String printStatus) {
        regPrintStatus(CK_EQ, printStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatus The value of printStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_NotEqual(String printStatus) {
        doSetPrintStatus_NotEqual(fRES(printStatus));
    }

    protected void doSetPrintStatus_NotEqual(String printStatus) {
        regPrintStatus(CK_NES, printStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatus The value of printStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_GreaterThan(String printStatus) {
        regPrintStatus(CK_GT, fRES(printStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatus The value of printStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_LessThan(String printStatus) {
        regPrintStatus(CK_LT, fRES(printStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatus The value of printStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_GreaterEqual(String printStatus) {
        regPrintStatus(CK_GE, fRES(printStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatus The value of printStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_LessEqual(String printStatus) {
        regPrintStatus(CK_LE, fRES(printStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatusList The collection of printStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_InScope(Collection<String> printStatusList) {
        doSetPrintStatus_InScope(printStatusList);
    }

    protected void doSetPrintStatus_InScope(Collection<String> printStatusList) {
        regINS(CK_INS, cTL(printStatusList), xgetCValuePrintStatus(), "PRINT_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatusList The collection of printStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_NotInScope(Collection<String> printStatusList) {
        doSetPrintStatus_NotInScope(printStatusList);
    }

    protected void doSetPrintStatus_NotInScope(Collection<String> printStatusList) {
        regINS(CK_NINS, cTL(printStatusList), xgetCValuePrintStatus(), "PRINT_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)} <br>
     * <pre>e.g. setPrintStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printStatus The value of printStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintStatus_LikeSearch(String printStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printStatus), xgetCValuePrintStatus(), "PRINT_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatus The value of printStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintStatus_NotLikeSearch(String printStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printStatus), xgetCValuePrintStatus(), "PRINT_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     * @param printStatus The value of printStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintStatus_PrefixSearch(String printStatus) {
        setPrintStatus_LikeSearch(printStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     */
    public void setPrintStatus_IsNull() { regPrintStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     */
    public void setPrintStatus_IsNullOrEmpty() { regPrintStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINT_STATUS: {VARCHAR(30)}
     */
    public void setPrintStatus_IsNotNull() { regPrintStatus(CK_ISNN, DOBJ); }

    protected void regPrintStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintStatus(), "PRINT_STATUS"); }
    protected abstract ConditionValue xgetCValuePrintStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKey The value of workGroupKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_Equal(String workGroupKey) {
        doSetWorkGroupKey_Equal(fRES(workGroupKey));
    }

    protected void doSetWorkGroupKey_Equal(String workGroupKey) {
        regWorkGroupKey(CK_EQ, workGroupKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKey The value of workGroupKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_NotEqual(String workGroupKey) {
        doSetWorkGroupKey_NotEqual(fRES(workGroupKey));
    }

    protected void doSetWorkGroupKey_NotEqual(String workGroupKey) {
        regWorkGroupKey(CK_NES, workGroupKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKey The value of workGroupKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_GreaterThan(String workGroupKey) {
        regWorkGroupKey(CK_GT, fRES(workGroupKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKey The value of workGroupKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_LessThan(String workGroupKey) {
        regWorkGroupKey(CK_LT, fRES(workGroupKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKey The value of workGroupKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_GreaterEqual(String workGroupKey) {
        regWorkGroupKey(CK_GE, fRES(workGroupKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKey The value of workGroupKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_LessEqual(String workGroupKey) {
        regWorkGroupKey(CK_LE, fRES(workGroupKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKeyList The collection of workGroupKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_InScope(Collection<String> workGroupKeyList) {
        doSetWorkGroupKey_InScope(workGroupKeyList);
    }

    protected void doSetWorkGroupKey_InScope(Collection<String> workGroupKeyList) {
        regINS(CK_INS, cTL(workGroupKeyList), xgetCValueWorkGroupKey(), "WORK_GROUP_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKeyList The collection of workGroupKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_NotInScope(Collection<String> workGroupKeyList) {
        doSetWorkGroupKey_NotInScope(workGroupKeyList);
    }

    protected void doSetWorkGroupKey_NotInScope(Collection<String> workGroupKeyList) {
        regINS(CK_NINS, cTL(workGroupKeyList), xgetCValueWorkGroupKey(), "WORK_GROUP_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)} <br>
     * <pre>e.g. setWorkGroupKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workGroupKey The value of workGroupKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkGroupKey_LikeSearch(String workGroupKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workGroupKey), xgetCValueWorkGroupKey(), "WORK_GROUP_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKey The value of workGroupKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkGroupKey_NotLikeSearch(String workGroupKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workGroupKey), xgetCValueWorkGroupKey(), "WORK_GROUP_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @param workGroupKey The value of workGroupKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkGroupKey_PrefixSearch(String workGroupKey) {
        setWorkGroupKey_LikeSearch(workGroupKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     */
    public void setWorkGroupKey_IsNull() { regWorkGroupKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     */
    public void setWorkGroupKey_IsNullOrEmpty() { regWorkGroupKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     */
    public void setWorkGroupKey_IsNotNull() { regWorkGroupKey(CK_ISNN, DOBJ); }

    protected void regWorkGroupKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkGroupKey(), "WORK_GROUP_KEY"); }
    protected abstract ConditionValue xgetCValueWorkGroupKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_Equal(String nizoroePrintTypeCd) {
        doSetNizoroePrintTypeCd_Equal(fRES(nizoroePrintTypeCd));
    }

    protected void doSetNizoroePrintTypeCd_Equal(String nizoroePrintTypeCd) {
        regNizoroePrintTypeCd(CK_EQ, nizoroePrintTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_NotEqual(String nizoroePrintTypeCd) {
        doSetNizoroePrintTypeCd_NotEqual(fRES(nizoroePrintTypeCd));
    }

    protected void doSetNizoroePrintTypeCd_NotEqual(String nizoroePrintTypeCd) {
        regNizoroePrintTypeCd(CK_NES, nizoroePrintTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_GreaterThan(String nizoroePrintTypeCd) {
        regNizoroePrintTypeCd(CK_GT, fRES(nizoroePrintTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_LessThan(String nizoroePrintTypeCd) {
        regNizoroePrintTypeCd(CK_LT, fRES(nizoroePrintTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_GreaterEqual(String nizoroePrintTypeCd) {
        regNizoroePrintTypeCd(CK_GE, fRES(nizoroePrintTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_LessEqual(String nizoroePrintTypeCd) {
        regNizoroePrintTypeCd(CK_LE, fRES(nizoroePrintTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCdList The collection of nizoroePrintTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_InScope(Collection<String> nizoroePrintTypeCdList) {
        doSetNizoroePrintTypeCd_InScope(nizoroePrintTypeCdList);
    }

    protected void doSetNizoroePrintTypeCd_InScope(Collection<String> nizoroePrintTypeCdList) {
        regINS(CK_INS, cTL(nizoroePrintTypeCdList), xgetCValueNizoroePrintTypeCd(), "NIZOROE_PRINT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCdList The collection of nizoroePrintTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_NotInScope(Collection<String> nizoroePrintTypeCdList) {
        doSetNizoroePrintTypeCd_NotInScope(nizoroePrintTypeCdList);
    }

    protected void doSetNizoroePrintTypeCd_NotInScope(Collection<String> nizoroePrintTypeCdList) {
        regINS(CK_NINS, cTL(nizoroePrintTypeCdList), xgetCValueNizoroePrintTypeCd(), "NIZOROE_PRINT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroePrintTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroePrintTypeCd_LikeSearch(String nizoroePrintTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroePrintTypeCd), xgetCValueNizoroePrintTypeCd(), "NIZOROE_PRINT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroePrintTypeCd_NotLikeSearch(String nizoroePrintTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroePrintTypeCd), xgetCValueNizoroePrintTypeCd(), "NIZOROE_PRINT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param nizoroePrintTypeCd The value of nizoroePrintTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePrintTypeCd_PrefixSearch(String nizoroePrintTypeCd) {
        setNizoroePrintTypeCd_LikeSearch(nizoroePrintTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setNizoroePrintTypeCd_IsNull() { regNizoroePrintTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setNizoroePrintTypeCd_IsNullOrEmpty() { regNizoroePrintTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setNizoroePrintTypeCd_IsNotNull() { regNizoroePrintTypeCd(CK_ISNN, DOBJ); }

    protected void regNizoroePrintTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroePrintTypeCd(), "NIZOROE_PRINT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueNizoroePrintTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCd The value of delivPrintTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_Equal(String delivPrintTypeCd) {
        doSetDelivPrintTypeCd_Equal(fRES(delivPrintTypeCd));
    }

    protected void doSetDelivPrintTypeCd_Equal(String delivPrintTypeCd) {
        regDelivPrintTypeCd(CK_EQ, delivPrintTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCd The value of delivPrintTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_NotEqual(String delivPrintTypeCd) {
        doSetDelivPrintTypeCd_NotEqual(fRES(delivPrintTypeCd));
    }

    protected void doSetDelivPrintTypeCd_NotEqual(String delivPrintTypeCd) {
        regDelivPrintTypeCd(CK_NES, delivPrintTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCd The value of delivPrintTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_GreaterThan(String delivPrintTypeCd) {
        regDelivPrintTypeCd(CK_GT, fRES(delivPrintTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCd The value of delivPrintTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_LessThan(String delivPrintTypeCd) {
        regDelivPrintTypeCd(CK_LT, fRES(delivPrintTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCd The value of delivPrintTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_GreaterEqual(String delivPrintTypeCd) {
        regDelivPrintTypeCd(CK_GE, fRES(delivPrintTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCd The value of delivPrintTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_LessEqual(String delivPrintTypeCd) {
        regDelivPrintTypeCd(CK_LE, fRES(delivPrintTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCdList The collection of delivPrintTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_InScope(Collection<String> delivPrintTypeCdList) {
        doSetDelivPrintTypeCd_InScope(delivPrintTypeCdList);
    }

    protected void doSetDelivPrintTypeCd_InScope(Collection<String> delivPrintTypeCdList) {
        regINS(CK_INS, cTL(delivPrintTypeCdList), xgetCValueDelivPrintTypeCd(), "DELIV_PRINT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCdList The collection of delivPrintTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_NotInScope(Collection<String> delivPrintTypeCdList) {
        doSetDelivPrintTypeCd_NotInScope(delivPrintTypeCdList);
    }

    protected void doSetDelivPrintTypeCd_NotInScope(Collection<String> delivPrintTypeCdList) {
        regINS(CK_NINS, cTL(delivPrintTypeCdList), xgetCValueDelivPrintTypeCd(), "DELIV_PRINT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivPrintTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivPrintTypeCd The value of delivPrintTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivPrintTypeCd_LikeSearch(String delivPrintTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivPrintTypeCd), xgetCValueDelivPrintTypeCd(), "DELIV_PRINT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCd The value of delivPrintTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivPrintTypeCd_NotLikeSearch(String delivPrintTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivPrintTypeCd), xgetCValueDelivPrintTypeCd(), "DELIV_PRINT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param delivPrintTypeCd The value of delivPrintTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPrintTypeCd_PrefixSearch(String delivPrintTypeCd) {
        setDelivPrintTypeCd_LikeSearch(delivPrintTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setDelivPrintTypeCd_IsNull() { regDelivPrintTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setDelivPrintTypeCd_IsNullOrEmpty() { regDelivPrintTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setDelivPrintTypeCd_IsNotNull() { regDelivPrintTypeCd(CK_ISNN, DOBJ); }

    protected void regDelivPrintTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivPrintTypeCd(), "DELIV_PRINT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDelivPrintTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCd The value of tagPrintTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_Equal(String tagPrintTypeCd) {
        doSetTagPrintTypeCd_Equal(fRES(tagPrintTypeCd));
    }

    protected void doSetTagPrintTypeCd_Equal(String tagPrintTypeCd) {
        regTagPrintTypeCd(CK_EQ, tagPrintTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCd The value of tagPrintTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_NotEqual(String tagPrintTypeCd) {
        doSetTagPrintTypeCd_NotEqual(fRES(tagPrintTypeCd));
    }

    protected void doSetTagPrintTypeCd_NotEqual(String tagPrintTypeCd) {
        regTagPrintTypeCd(CK_NES, tagPrintTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCd The value of tagPrintTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_GreaterThan(String tagPrintTypeCd) {
        regTagPrintTypeCd(CK_GT, fRES(tagPrintTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCd The value of tagPrintTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_LessThan(String tagPrintTypeCd) {
        regTagPrintTypeCd(CK_LT, fRES(tagPrintTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCd The value of tagPrintTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_GreaterEqual(String tagPrintTypeCd) {
        regTagPrintTypeCd(CK_GE, fRES(tagPrintTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCd The value of tagPrintTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_LessEqual(String tagPrintTypeCd) {
        regTagPrintTypeCd(CK_LE, fRES(tagPrintTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCdList The collection of tagPrintTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_InScope(Collection<String> tagPrintTypeCdList) {
        doSetTagPrintTypeCd_InScope(tagPrintTypeCdList);
    }

    protected void doSetTagPrintTypeCd_InScope(Collection<String> tagPrintTypeCdList) {
        regINS(CK_INS, cTL(tagPrintTypeCdList), xgetCValueTagPrintTypeCd(), "TAG_PRINT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCdList The collection of tagPrintTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_NotInScope(Collection<String> tagPrintTypeCdList) {
        doSetTagPrintTypeCd_NotInScope(tagPrintTypeCdList);
    }

    protected void doSetTagPrintTypeCd_NotInScope(Collection<String> tagPrintTypeCdList) {
        regINS(CK_NINS, cTL(tagPrintTypeCdList), xgetCValueTagPrintTypeCd(), "TAG_PRINT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTagPrintTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagPrintTypeCd The value of tagPrintTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagPrintTypeCd_LikeSearch(String tagPrintTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagPrintTypeCd), xgetCValueTagPrintTypeCd(), "TAG_PRINT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCd The value of tagPrintTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagPrintTypeCd_NotLikeSearch(String tagPrintTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagPrintTypeCd), xgetCValueTagPrintTypeCd(), "TAG_PRINT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @param tagPrintTypeCd The value of tagPrintTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagPrintTypeCd_PrefixSearch(String tagPrintTypeCd) {
        setTagPrintTypeCd_LikeSearch(tagPrintTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setTagPrintTypeCd_IsNull() { regTagPrintTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setTagPrintTypeCd_IsNullOrEmpty() { regTagPrintTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_PRINT_TYPE_CD: {VARCHAR(30)}
     */
    public void setTagPrintTypeCd_IsNotNull() { regTagPrintTypeCd(CK_ISNN, DOBJ); }

    protected void regTagPrintTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagPrintTypeCd(), "TAG_PRINT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueTagPrintTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlg The value of integPrintFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_Equal(String integPrintFlg) {
        doSetIntegPrintFlg_Equal(fRES(integPrintFlg));
    }

    protected void doSetIntegPrintFlg_Equal(String integPrintFlg) {
        regIntegPrintFlg(CK_EQ, integPrintFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlg The value of integPrintFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_NotEqual(String integPrintFlg) {
        doSetIntegPrintFlg_NotEqual(fRES(integPrintFlg));
    }

    protected void doSetIntegPrintFlg_NotEqual(String integPrintFlg) {
        regIntegPrintFlg(CK_NES, integPrintFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlg The value of integPrintFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_GreaterThan(String integPrintFlg) {
        regIntegPrintFlg(CK_GT, fRES(integPrintFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlg The value of integPrintFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_LessThan(String integPrintFlg) {
        regIntegPrintFlg(CK_LT, fRES(integPrintFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlg The value of integPrintFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_GreaterEqual(String integPrintFlg) {
        regIntegPrintFlg(CK_GE, fRES(integPrintFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlg The value of integPrintFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_LessEqual(String integPrintFlg) {
        regIntegPrintFlg(CK_LE, fRES(integPrintFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlgList The collection of integPrintFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_InScope(Collection<String> integPrintFlgList) {
        doSetIntegPrintFlg_InScope(integPrintFlgList);
    }

    protected void doSetIntegPrintFlg_InScope(Collection<String> integPrintFlgList) {
        regINS(CK_INS, cTL(integPrintFlgList), xgetCValueIntegPrintFlg(), "INTEG_PRINT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlgList The collection of integPrintFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_NotInScope(Collection<String> integPrintFlgList) {
        doSetIntegPrintFlg_NotInScope(integPrintFlgList);
    }

    protected void doSetIntegPrintFlg_NotInScope(Collection<String> integPrintFlgList) {
        regINS(CK_NINS, cTL(integPrintFlgList), xgetCValueIntegPrintFlg(), "INTEG_PRINT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setIntegPrintFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param integPrintFlg The value of integPrintFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIntegPrintFlg_LikeSearch(String integPrintFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(integPrintFlg), xgetCValueIntegPrintFlg(), "INTEG_PRINT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlg The value of integPrintFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIntegPrintFlg_NotLikeSearch(String integPrintFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(integPrintFlg), xgetCValueIntegPrintFlg(), "INTEG_PRINT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     * @param integPrintFlg The value of integPrintFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegPrintFlg_PrefixSearch(String integPrintFlg) {
        setIntegPrintFlg_LikeSearch(integPrintFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     */
    public void setIntegPrintFlg_IsNull() { regIntegPrintFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     */
    public void setIntegPrintFlg_IsNullOrEmpty() { regIntegPrintFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INTEG_PRINT_FLG: {CHAR(1)}
     */
    public void setIntegPrintFlg_IsNotNull() { regIntegPrintFlg(CK_ISNN, DOBJ); }

    protected void regIntegPrintFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIntegPrintFlg(), "INTEG_PRINT_FLG"); }
    protected abstract ConditionValue xgetCValueIntegPrintFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlg The value of idManagPrintFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_Equal(String idManagPrintFlg) {
        doSetIdManagPrintFlg_Equal(fRES(idManagPrintFlg));
    }

    protected void doSetIdManagPrintFlg_Equal(String idManagPrintFlg) {
        regIdManagPrintFlg(CK_EQ, idManagPrintFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlg The value of idManagPrintFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_NotEqual(String idManagPrintFlg) {
        doSetIdManagPrintFlg_NotEqual(fRES(idManagPrintFlg));
    }

    protected void doSetIdManagPrintFlg_NotEqual(String idManagPrintFlg) {
        regIdManagPrintFlg(CK_NES, idManagPrintFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlg The value of idManagPrintFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_GreaterThan(String idManagPrintFlg) {
        regIdManagPrintFlg(CK_GT, fRES(idManagPrintFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlg The value of idManagPrintFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_LessThan(String idManagPrintFlg) {
        regIdManagPrintFlg(CK_LT, fRES(idManagPrintFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlg The value of idManagPrintFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_GreaterEqual(String idManagPrintFlg) {
        regIdManagPrintFlg(CK_GE, fRES(idManagPrintFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlg The value of idManagPrintFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_LessEqual(String idManagPrintFlg) {
        regIdManagPrintFlg(CK_LE, fRES(idManagPrintFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlgList The collection of idManagPrintFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_InScope(Collection<String> idManagPrintFlgList) {
        doSetIdManagPrintFlg_InScope(idManagPrintFlgList);
    }

    protected void doSetIdManagPrintFlg_InScope(Collection<String> idManagPrintFlgList) {
        regINS(CK_INS, cTL(idManagPrintFlgList), xgetCValueIdManagPrintFlg(), "ID_MANAG_PRINT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlgList The collection of idManagPrintFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_NotInScope(Collection<String> idManagPrintFlgList) {
        doSetIdManagPrintFlg_NotInScope(idManagPrintFlgList);
    }

    protected void doSetIdManagPrintFlg_NotInScope(Collection<String> idManagPrintFlgList) {
        regINS(CK_NINS, cTL(idManagPrintFlgList), xgetCValueIdManagPrintFlg(), "ID_MANAG_PRINT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setIdManagPrintFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param idManagPrintFlg The value of idManagPrintFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIdManagPrintFlg_LikeSearch(String idManagPrintFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(idManagPrintFlg), xgetCValueIdManagPrintFlg(), "ID_MANAG_PRINT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlg The value of idManagPrintFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIdManagPrintFlg_NotLikeSearch(String idManagPrintFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(idManagPrintFlg), xgetCValueIdManagPrintFlg(), "ID_MANAG_PRINT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     * @param idManagPrintFlg The value of idManagPrintFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdManagPrintFlg_PrefixSearch(String idManagPrintFlg) {
        setIdManagPrintFlg_LikeSearch(idManagPrintFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     */
    public void setIdManagPrintFlg_IsNull() { regIdManagPrintFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     */
    public void setIdManagPrintFlg_IsNullOrEmpty() { regIdManagPrintFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID_MANAG_PRINT_FLG: {CHAR(1)}
     */
    public void setIdManagPrintFlg_IsNotNull() { regIdManagPrintFlg(CK_ISNN, DOBJ); }

    protected void regIdManagPrintFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIdManagPrintFlg(), "ID_MANAG_PRINT_FLG"); }
    protected abstract ConditionValue xgetCValueIdManagPrintFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlg The value of scmPrintFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_Equal(String scmPrintFlg) {
        doSetScmPrintFlg_Equal(fRES(scmPrintFlg));
    }

    protected void doSetScmPrintFlg_Equal(String scmPrintFlg) {
        regScmPrintFlg(CK_EQ, scmPrintFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlg The value of scmPrintFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_NotEqual(String scmPrintFlg) {
        doSetScmPrintFlg_NotEqual(fRES(scmPrintFlg));
    }

    protected void doSetScmPrintFlg_NotEqual(String scmPrintFlg) {
        regScmPrintFlg(CK_NES, scmPrintFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlg The value of scmPrintFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_GreaterThan(String scmPrintFlg) {
        regScmPrintFlg(CK_GT, fRES(scmPrintFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlg The value of scmPrintFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_LessThan(String scmPrintFlg) {
        regScmPrintFlg(CK_LT, fRES(scmPrintFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlg The value of scmPrintFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_GreaterEqual(String scmPrintFlg) {
        regScmPrintFlg(CK_GE, fRES(scmPrintFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlg The value of scmPrintFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_LessEqual(String scmPrintFlg) {
        regScmPrintFlg(CK_LE, fRES(scmPrintFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlgList The collection of scmPrintFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_InScope(Collection<String> scmPrintFlgList) {
        doSetScmPrintFlg_InScope(scmPrintFlgList);
    }

    protected void doSetScmPrintFlg_InScope(Collection<String> scmPrintFlgList) {
        regINS(CK_INS, cTL(scmPrintFlgList), xgetCValueScmPrintFlg(), "SCM_PRINT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlgList The collection of scmPrintFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_NotInScope(Collection<String> scmPrintFlgList) {
        doSetScmPrintFlg_NotInScope(scmPrintFlgList);
    }

    protected void doSetScmPrintFlg_NotInScope(Collection<String> scmPrintFlgList) {
        regINS(CK_NINS, cTL(scmPrintFlgList), xgetCValueScmPrintFlg(), "SCM_PRINT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setScmPrintFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scmPrintFlg The value of scmPrintFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScmPrintFlg_LikeSearch(String scmPrintFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scmPrintFlg), xgetCValueScmPrintFlg(), "SCM_PRINT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlg The value of scmPrintFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScmPrintFlg_NotLikeSearch(String scmPrintFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scmPrintFlg), xgetCValueScmPrintFlg(), "SCM_PRINT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     * @param scmPrintFlg The value of scmPrintFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScmPrintFlg_PrefixSearch(String scmPrintFlg) {
        setScmPrintFlg_LikeSearch(scmPrintFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     */
    public void setScmPrintFlg_IsNull() { regScmPrintFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     */
    public void setScmPrintFlg_IsNullOrEmpty() { regScmPrintFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCM_PRINT_FLG: {CHAR(1)}
     */
    public void setScmPrintFlg_IsNotNull() { regScmPrintFlg(CK_ISNN, DOBJ); }

    protected void regScmPrintFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScmPrintFlg(), "SCM_PRINT_FLG"); }
    protected abstract ConditionValue xgetCValueScmPrintFlg();

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
    public HpSLCFunction<TPickingHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPickingHCB.class);
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
    public HpSLCFunction<TPickingHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPickingHCB.class);
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
    public HpSLCFunction<TPickingHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPickingHCB.class);
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
    public HpSLCFunction<TPickingHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPickingHCB.class);
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
    public HpSLCFunction<TPickingHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPickingHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPickingHCB&gt;() {
     *     public void query(TPickingHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPickingHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPickingHCQ sq);

    protected TPickingHCB xcreateScalarConditionCB() {
        TPickingHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPickingHCB xcreateScalarConditionPartitionByCB() {
        TPickingHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPickingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPickingHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPickingHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPickingHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPickingHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPickingHCQ sq);

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
    protected TPickingHCB newMyCB() {
        return new TPickingHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPickingHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
