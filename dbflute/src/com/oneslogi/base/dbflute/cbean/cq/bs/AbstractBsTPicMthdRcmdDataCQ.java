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
 * The abstract condition-query of t_pic_mthd_rcmd_data.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPicMthdRcmdDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPicMthdRcmdDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_pic_mthd_rcmd_data";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param picMthdRcmdDataId The value of picMthdRcmdDataId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdDataId_Equal(Long picMthdRcmdDataId) {
        doSetPicMthdRcmdDataId_Equal(picMthdRcmdDataId);
    }

    protected void doSetPicMthdRcmdDataId_Equal(Long picMthdRcmdDataId) {
        regPicMthdRcmdDataId(CK_EQ, picMthdRcmdDataId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param picMthdRcmdDataId The value of picMthdRcmdDataId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdDataId_NotEqual(Long picMthdRcmdDataId) {
        doSetPicMthdRcmdDataId_NotEqual(picMthdRcmdDataId);
    }

    protected void doSetPicMthdRcmdDataId_NotEqual(Long picMthdRcmdDataId) {
        regPicMthdRcmdDataId(CK_NES, picMthdRcmdDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param picMthdRcmdDataId The value of picMthdRcmdDataId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdDataId_GreaterThan(Long picMthdRcmdDataId) {
        regPicMthdRcmdDataId(CK_GT, picMthdRcmdDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param picMthdRcmdDataId The value of picMthdRcmdDataId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdDataId_LessThan(Long picMthdRcmdDataId) {
        regPicMthdRcmdDataId(CK_LT, picMthdRcmdDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param picMthdRcmdDataId The value of picMthdRcmdDataId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdDataId_GreaterEqual(Long picMthdRcmdDataId) {
        regPicMthdRcmdDataId(CK_GE, picMthdRcmdDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param picMthdRcmdDataId The value of picMthdRcmdDataId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdDataId_LessEqual(Long picMthdRcmdDataId) {
        regPicMthdRcmdDataId(CK_LE, picMthdRcmdDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of picMthdRcmdDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picMthdRcmdDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicMthdRcmdDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicMthdRcmdDataId(), "PIC_MTHD_RCMD_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param picMthdRcmdDataIdList The collection of picMthdRcmdDataId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdDataId_InScope(Collection<Long> picMthdRcmdDataIdList) {
        doSetPicMthdRcmdDataId_InScope(picMthdRcmdDataIdList);
    }

    protected void doSetPicMthdRcmdDataId_InScope(Collection<Long> picMthdRcmdDataIdList) {
        regINS(CK_INS, cTL(picMthdRcmdDataIdList), xgetCValuePicMthdRcmdDataId(), "PIC_MTHD_RCMD_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param picMthdRcmdDataIdList The collection of picMthdRcmdDataId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdDataId_NotInScope(Collection<Long> picMthdRcmdDataIdList) {
        doSetPicMthdRcmdDataId_NotInScope(picMthdRcmdDataIdList);
    }

    protected void doSetPicMthdRcmdDataId_NotInScope(Collection<Long> picMthdRcmdDataIdList) {
        regINS(CK_NINS, cTL(picMthdRcmdDataIdList), xgetCValuePicMthdRcmdDataId(), "PIC_MTHD_RCMD_DATA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPicMthdRcmdDataId_IsNull() { regPicMthdRcmdDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPicMthdRcmdDataId_IsNotNull() { regPicMthdRcmdDataId(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdDataId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdDataId(), "PIC_MTHD_RCMD_DATA_ID"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdDataId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterThan(Long pickingHId) {
        regPickingHId(CK_GT, pickingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessThan(Long pickingHId) {
        regPickingHId(CK_LT, pickingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterEqual(Long pickingHId) {
        regPickingHId(CK_GE, pickingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessEqual(Long pickingHId) {
        regPickingHId(CK_LE, pickingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param minNumber The min number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingHId(), "PICKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHIdList The collection of pickingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_NotInScope(pickingHIdList);
    }

    protected void doSetPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        regINS(CK_NINS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PICKING_H_ID from t_picking_h where ...)} <br />
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'in-scope'. (NotNull)
     */
    public void inScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_InScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", false);
    }
    public abstract String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PICKING_H_ID from t_picking_h where ...)} <br />
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_NotInScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", true);
    }
    public abstract String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq);

    protected void regPickingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingHId(), "PICKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePickingHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param picMthdRcmdId The value of picMthdRcmdId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_Equal(Long picMthdRcmdId) {
        doSetPicMthdRcmdId_Equal(picMthdRcmdId);
    }

    protected void doSetPicMthdRcmdId_Equal(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_EQ, picMthdRcmdId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param picMthdRcmdId The value of picMthdRcmdId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_NotEqual(Long picMthdRcmdId) {
        doSetPicMthdRcmdId_NotEqual(picMthdRcmdId);
    }

    protected void doSetPicMthdRcmdId_NotEqual(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_NES, picMthdRcmdId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param picMthdRcmdId The value of picMthdRcmdId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_GreaterThan(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_GT, picMthdRcmdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param picMthdRcmdId The value of picMthdRcmdId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_LessThan(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_LT, picMthdRcmdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param picMthdRcmdId The value of picMthdRcmdId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_GreaterEqual(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_GE, picMthdRcmdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param picMthdRcmdId The value of picMthdRcmdId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_LessEqual(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_LE, picMthdRcmdId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param minNumber The min number of picMthdRcmdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picMthdRcmdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicMthdRcmdId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param picMthdRcmdIdList The collection of picMthdRcmdId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_InScope(Collection<Long> picMthdRcmdIdList) {
        doSetPicMthdRcmdId_InScope(picMthdRcmdIdList);
    }

    protected void doSetPicMthdRcmdId_InScope(Collection<Long> picMthdRcmdIdList) {
        regINS(CK_INS, cTL(picMthdRcmdIdList), xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     * @param picMthdRcmdIdList The collection of picMthdRcmdId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_NotInScope(Collection<Long> picMthdRcmdIdList) {
        doSetPicMthdRcmdId_NotInScope(picMthdRcmdIdList);
    }

    protected void doSetPicMthdRcmdId_NotInScope(Collection<Long> picMthdRcmdIdList) {
        regINS(CK_NINS, cTL(picMthdRcmdIdList), xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PIC_MTHD_RCMD_ID from t_pic_mthd_rcmd where ...)} <br />
     * t_pic_mthd_rcmd by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @param subCBLambda The callback for sub-query of TPicMthdRcmd for 'in-scope'. (NotNull)
     */
    public void inScopeTPicMthdRcmd(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPicMthdRcmdId_InScopeRelation_TPicMthdRcmd(cb.query());
        registerInScopeRelation(cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmd", false);
    }
    public abstract String keepPicMthdRcmdId_InScopeRelation_TPicMthdRcmd(TPicMthdRcmdCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PIC_MTHD_RCMD_ID from t_pic_mthd_rcmd where ...)} <br />
     * t_pic_mthd_rcmd by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @param subCBLambda The callback for sub-query of TPicMthdRcmd for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPicMthdRcmd(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPicMthdRcmdId_NotInScopeRelation_TPicMthdRcmd(cb.query());
        registerInScopeRelation(cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmd", true);
    }
    public abstract String keepPicMthdRcmdId_NotInScopeRelation_TPicMthdRcmd(TPicMthdRcmdCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     */
    public void setPicMthdRcmdId_IsNull() { regPicMthdRcmdId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, BIGINT(19), FK to t_pic_mthd_rcmd}
     */
    public void setPicMthdRcmdId_IsNotNull() { regPicMthdRcmdId(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdId();

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
    public HpSLCFunction<TPicMthdRcmdDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPicMthdRcmdDataCB.class);
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
    public HpSLCFunction<TPicMthdRcmdDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPicMthdRcmdDataCB.class);
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
    public HpSLCFunction<TPicMthdRcmdDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPicMthdRcmdDataCB.class);
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
    public HpSLCFunction<TPicMthdRcmdDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPicMthdRcmdDataCB.class);
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
    public HpSLCFunction<TPicMthdRcmdDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPicMthdRcmdDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPicMthdRcmdDataCB&gt;() {
     *     public void query(TPicMthdRcmdDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPicMthdRcmdDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPicMthdRcmdDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPicMthdRcmdDataCQ sq);

    protected TPicMthdRcmdDataCB xcreateScalarConditionCB() {
        TPicMthdRcmdDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPicMthdRcmdDataCB xcreateScalarConditionPartitionByCB() {
        TPicMthdRcmdDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPicMthdRcmdDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PIC_MTHD_RCMD_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPicMthdRcmdDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPicMthdRcmdDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PIC_MTHD_RCMD_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPicMthdRcmdDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPicMthdRcmdDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPicMthdRcmdDataCQ sq);

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
    protected TPicMthdRcmdDataCB newMyCB() {
        return new TPicMthdRcmdDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPicMthdRcmdDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}