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
 * The abstract condition-query of t_picking_r.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPickingRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPickingRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_picking_r";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterThan(Long pickingHId) {
        regPickingHId(CK_GT, pickingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessThan(Long pickingHId) {
        regPickingHId(CK_LT, pickingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterEqual(Long pickingHId) {
        regPickingHId(CK_GE, pickingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessEqual(Long pickingHId) {
        regPickingHId(CK_LE, pickingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     * @param minNumber The min number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingHId(), "PICKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     */
    public void setPickingHId_IsNull() { regPickingHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     */
    public void setPickingHId_IsNotNull() { regPickingHId(CK_ISNN, DOBJ); }

    protected void regPickingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingHId(), "PICKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePickingHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param oplOutFlg The value of oplOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_Equal(String oplOutFlg) {
        doSetOplOutFlg_Equal(fRES(oplOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetOplOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setOplOutFlg_Equal_$0() {
        setOplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setOplOutFlg_Equal_$1() {
        setOplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetOplOutFlg_Equal(String oplOutFlg) {
        regOplOutFlg(CK_EQ, oplOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param oplOutFlg The value of oplOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_NotEqual(String oplOutFlg) {
        doSetOplOutFlg_NotEqual(fRES(oplOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetOplOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setOplOutFlg_NotEqual_$0() {
        setOplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setOplOutFlg_NotEqual_$1() {
        setOplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetOplOutFlg_NotEqual(String oplOutFlg) {
        regOplOutFlg(CK_NES, oplOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param oplOutFlgList The collection of oplOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_InScope(Collection<String> oplOutFlgList) {
        doSetOplOutFlg_InScope(oplOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetOplOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetOplOutFlg_InScope(Collection<String> oplOutFlgList) {
        regINS(CK_INS, cTL(oplOutFlgList), xgetCValueOplOutFlg(), "OPL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param oplOutFlgList The collection of oplOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_NotInScope(Collection<String> oplOutFlgList) {
        doSetOplOutFlg_NotInScope(oplOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetOplOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetOplOutFlg_NotInScope(Collection<String> oplOutFlgList) {
        regINS(CK_NINS, cTL(oplOutFlgList), xgetCValueOplOutFlg(), "OPL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setOplOutFlg_IsNull() { regOplOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setOplOutFlg_IsNullOrEmpty() { regOplOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setOplOutFlg_IsNotNull() { regOplOutFlg(CK_ISNN, DOBJ); }

    protected void regOplOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOplOutFlg(), "OPL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueOplOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tplOutFlg The value of tplOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_Equal(String tplOutFlg) {
        doSetTplOutFlg_Equal(fRES(tplOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetTplOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setTplOutFlg_Equal_$0() {
        setTplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setTplOutFlg_Equal_$1() {
        setTplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetTplOutFlg_Equal(String tplOutFlg) {
        regTplOutFlg(CK_EQ, tplOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tplOutFlg The value of tplOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_NotEqual(String tplOutFlg) {
        doSetTplOutFlg_NotEqual(fRES(tplOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetTplOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setTplOutFlg_NotEqual_$0() {
        setTplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setTplOutFlg_NotEqual_$1() {
        setTplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetTplOutFlg_NotEqual(String tplOutFlg) {
        regTplOutFlg(CK_NES, tplOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tplOutFlgList The collection of tplOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_InScope(Collection<String> tplOutFlgList) {
        doSetTplOutFlg_InScope(tplOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetTplOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetTplOutFlg_InScope(Collection<String> tplOutFlgList) {
        regINS(CK_INS, cTL(tplOutFlgList), xgetCValueTplOutFlg(), "TPL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tplOutFlgList The collection of tplOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_NotInScope(Collection<String> tplOutFlgList) {
        doSetTplOutFlg_NotInScope(tplOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetTplOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTplOutFlg_NotInScope(Collection<String> tplOutFlgList) {
        regINS(CK_NINS, cTL(tplOutFlgList), xgetCValueTplOutFlg(), "TPL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTplOutFlg_IsNull() { regTplOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTplOutFlg_IsNullOrEmpty() { regTplOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTplOutFlg_IsNotNull() { regTplOutFlg(CK_ISNN, DOBJ); }

    protected void regTplOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTplOutFlg(), "TPL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueTplOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param mltOutFlg The value of mltOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_Equal(String mltOutFlg) {
        doSetMltOutFlg_Equal(fRES(mltOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMltOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetMltOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setMltOutFlg_Equal_$0() {
        setMltOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setMltOutFlg_Equal_$1() {
        setMltOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetMltOutFlg_Equal(String mltOutFlg) {
        regMltOutFlg(CK_EQ, mltOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param mltOutFlg The value of mltOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_NotEqual(String mltOutFlg) {
        doSetMltOutFlg_NotEqual(fRES(mltOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMltOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetMltOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setMltOutFlg_NotEqual_$0() {
        setMltOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setMltOutFlg_NotEqual_$1() {
        setMltOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetMltOutFlg_NotEqual(String mltOutFlg) {
        regMltOutFlg(CK_NES, mltOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param mltOutFlgList The collection of mltOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_InScope(Collection<String> mltOutFlgList) {
        doSetMltOutFlg_InScope(mltOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetMltOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetMltOutFlg_InScope(Collection<String> mltOutFlgList) {
        regINS(CK_INS, cTL(mltOutFlgList), xgetCValueMltOutFlg(), "MLT_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param mltOutFlgList The collection of mltOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_NotInScope(Collection<String> mltOutFlgList) {
        doSetMltOutFlg_NotInScope(mltOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetMltOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMltOutFlg_NotInScope(Collection<String> mltOutFlgList) {
        regINS(CK_NINS, cTL(mltOutFlgList), xgetCValueMltOutFlg(), "MLT_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setMltOutFlg_IsNull() { regMltOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setMltOutFlg_IsNullOrEmpty() { regMltOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setMltOutFlg_IsNotNull() { regMltOutFlg(CK_ISNN, DOBJ); }

    protected void regMltOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMltOutFlg(), "MLT_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueMltOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param splOutFlg The value of splOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_Equal(String splOutFlg) {
        doSetSplOutFlg_Equal(fRES(splOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSplOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSplOutFlg_Equal_$0() {
        setSplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSplOutFlg_Equal_$1() {
        setSplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSplOutFlg_Equal(String splOutFlg) {
        regSplOutFlg(CK_EQ, splOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param splOutFlg The value of splOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_NotEqual(String splOutFlg) {
        doSetSplOutFlg_NotEqual(fRES(splOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSplOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSplOutFlg_NotEqual_$0() {
        setSplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSplOutFlg_NotEqual_$1() {
        setSplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSplOutFlg_NotEqual(String splOutFlg) {
        regSplOutFlg(CK_NES, splOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param splOutFlgList The collection of splOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_InScope(Collection<String> splOutFlgList) {
        doSetSplOutFlg_InScope(splOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSplOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSplOutFlg_InScope(Collection<String> splOutFlgList) {
        regINS(CK_INS, cTL(splOutFlgList), xgetCValueSplOutFlg(), "SPL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param splOutFlgList The collection of splOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_NotInScope(Collection<String> splOutFlgList) {
        doSetSplOutFlg_NotInScope(splOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSplOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSplOutFlg_NotInScope(Collection<String> splOutFlgList) {
        regINS(CK_NINS, cTL(splOutFlgList), xgetCValueSplOutFlg(), "SPL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSplOutFlg_IsNull() { regSplOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSplOutFlg_IsNullOrEmpty() { regSplOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSplOutFlg_IsNotNull() { regSplOutFlg(CK_ISNN, DOBJ); }

    protected void regSplOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplOutFlg(), "SPL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueSplOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl1OutFlg The value of pl1OutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_Equal(String pl1OutFlg) {
        doSetPl1OutFlg_Equal(fRES(pl1OutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPl1OutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPl1OutFlg_Equal_$0() {
        setPl1OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPl1OutFlg_Equal_$1() {
        setPl1OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPl1OutFlg_Equal(String pl1OutFlg) {
        regPl1OutFlg(CK_EQ, pl1OutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl1OutFlg The value of pl1OutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_NotEqual(String pl1OutFlg) {
        doSetPl1OutFlg_NotEqual(fRES(pl1OutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPl1OutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPl1OutFlg_NotEqual_$0() {
        setPl1OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPl1OutFlg_NotEqual_$1() {
        setPl1OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPl1OutFlg_NotEqual(String pl1OutFlg) {
        regPl1OutFlg(CK_NES, pl1OutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl1OutFlgList The collection of pl1OutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_InScope(Collection<String> pl1OutFlgList) {
        doSetPl1OutFlg_InScope(pl1OutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPl1OutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPl1OutFlg_InScope(Collection<String> pl1OutFlgList) {
        regINS(CK_INS, cTL(pl1OutFlgList), xgetCValuePl1OutFlg(), "PL1_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl1OutFlgList The collection of pl1OutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_NotInScope(Collection<String> pl1OutFlgList) {
        doSetPl1OutFlg_NotInScope(pl1OutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPl1OutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPl1OutFlg_NotInScope(Collection<String> pl1OutFlgList) {
        regINS(CK_NINS, cTL(pl1OutFlgList), xgetCValuePl1OutFlg(), "PL1_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl1OutFlg_IsNull() { regPl1OutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl1OutFlg_IsNullOrEmpty() { regPl1OutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl1OutFlg_IsNotNull() { regPl1OutFlg(CK_ISNN, DOBJ); }

    protected void regPl1OutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl1OutFlg(), "PL1_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePl1OutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl1OutUserId The value of pl1OutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_Equal(Long pl1OutUserId) {
        doSetPl1OutUserId_Equal(pl1OutUserId);
    }

    protected void doSetPl1OutUserId_Equal(Long pl1OutUserId) {
        regPl1OutUserId(CK_EQ, pl1OutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl1OutUserId The value of pl1OutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_NotEqual(Long pl1OutUserId) {
        doSetPl1OutUserId_NotEqual(pl1OutUserId);
    }

    protected void doSetPl1OutUserId_NotEqual(Long pl1OutUserId) {
        regPl1OutUserId(CK_NES, pl1OutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl1OutUserId The value of pl1OutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_GreaterThan(Long pl1OutUserId) {
        regPl1OutUserId(CK_GT, pl1OutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl1OutUserId The value of pl1OutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_LessThan(Long pl1OutUserId) {
        regPl1OutUserId(CK_LT, pl1OutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl1OutUserId The value of pl1OutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_GreaterEqual(Long pl1OutUserId) {
        regPl1OutUserId(CK_GE, pl1OutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl1OutUserId The value of pl1OutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_LessEqual(Long pl1OutUserId) {
        regPl1OutUserId(CK_LE, pl1OutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of pl1OutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pl1OutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPl1OutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePl1OutUserId(), "PL1_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl1OutUserIdList The collection of pl1OutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutUserId_InScope(Collection<Long> pl1OutUserIdList) {
        doSetPl1OutUserId_InScope(pl1OutUserIdList);
    }

    protected void doSetPl1OutUserId_InScope(Collection<Long> pl1OutUserIdList) {
        regINS(CK_INS, cTL(pl1OutUserIdList), xgetCValuePl1OutUserId(), "PL1_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl1OutUserIdList The collection of pl1OutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutUserId_NotInScope(Collection<Long> pl1OutUserIdList) {
        doSetPl1OutUserId_NotInScope(pl1OutUserIdList);
    }

    protected void doSetPl1OutUserId_NotInScope(Collection<Long> pl1OutUserIdList) {
        regINS(CK_NINS, cTL(pl1OutUserIdList), xgetCValuePl1OutUserId(), "PL1_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PL1_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPl1OutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByPl1OutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPl1OutUserId_InScopeRelation_BUserByPl1OutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL1_OUT_USER_ID", "USER_ID", pp, "bUserByPl1OutUserId", false);
    }
    public abstract String keepPl1OutUserId_InScopeRelation_BUserByPl1OutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PL1_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPl1OutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByPl1OutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL1_OUT_USER_ID", "USER_ID", pp, "bUserByPl1OutUserId", true);
    }
    public abstract String keepPl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPl1OutUserId_IsNull() { regPl1OutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPl1OutUserId_IsNotNull() { regPl1OutUserId(CK_ISNN, DOBJ); }

    protected void regPl1OutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl1OutUserId(), "PL1_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValuePl1OutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * @param pl1OutDt The value of pl1OutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_Equal(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_EQ,  pl1OutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * @param pl1OutDt The value of pl1OutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_GreaterThan(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_GT,  pl1OutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * @param pl1OutDt The value of pl1OutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_LessThan(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_LT,  pl1OutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * @param pl1OutDt The value of pl1OutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_GreaterEqual(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_GE,  pl1OutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * @param pl1OutDt The value of pl1OutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_LessEqual(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_LE, pl1OutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setPl1OutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pl1OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pl1OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPl1OutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePl1OutDt(), "PL1_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pl1OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of pl1OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPl1OutDt_DateFromTo(Date fromDate, Date toDate) {
        setPl1OutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     */
    public void setPl1OutDt_IsNull() { regPl1OutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     */
    public void setPl1OutDt_IsNotNull() { regPl1OutDt(CK_ISNN, DOBJ); }

    protected void regPl1OutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl1OutDt(), "PL1_OUT_DT"); }
    protected abstract ConditionValue xgetCValuePl1OutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param plOutFlg The value of plOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_Equal(String plOutFlg) {
        doSetPlOutFlg_Equal(fRES(plOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPlOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPlOutFlg_Equal_$0() {
        setPlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPlOutFlg_Equal_$1() {
        setPlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPlOutFlg_Equal(String plOutFlg) {
        regPlOutFlg(CK_EQ, plOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param plOutFlg The value of plOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_NotEqual(String plOutFlg) {
        doSetPlOutFlg_NotEqual(fRES(plOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPlOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPlOutFlg_NotEqual_$0() {
        setPlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPlOutFlg_NotEqual_$1() {
        setPlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPlOutFlg_NotEqual(String plOutFlg) {
        regPlOutFlg(CK_NES, plOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param plOutFlgList The collection of plOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_InScope(Collection<String> plOutFlgList) {
        doSetPlOutFlg_InScope(plOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPlOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPlOutFlg_InScope(Collection<String> plOutFlgList) {
        regINS(CK_INS, cTL(plOutFlgList), xgetCValuePlOutFlg(), "PL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param plOutFlgList The collection of plOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_NotInScope(Collection<String> plOutFlgList) {
        doSetPlOutFlg_NotInScope(plOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPlOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPlOutFlg_NotInScope(Collection<String> plOutFlgList) {
        regINS(CK_NINS, cTL(plOutFlgList), xgetCValuePlOutFlg(), "PL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPlOutFlg_IsNull() { regPlOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPlOutFlg_IsNullOrEmpty() { regPlOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPlOutFlg_IsNotNull() { regPlOutFlg(CK_ISNN, DOBJ); }

    protected void regPlOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlOutFlg(), "PL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePlOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param plOutUserId The value of plOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutUserId_Equal(Long plOutUserId) {
        doSetPlOutUserId_Equal(plOutUserId);
    }

    protected void doSetPlOutUserId_Equal(Long plOutUserId) {
        regPlOutUserId(CK_EQ, plOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param plOutUserId The value of plOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutUserId_NotEqual(Long plOutUserId) {
        doSetPlOutUserId_NotEqual(plOutUserId);
    }

    protected void doSetPlOutUserId_NotEqual(Long plOutUserId) {
        regPlOutUserId(CK_NES, plOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param plOutUserId The value of plOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutUserId_GreaterThan(Long plOutUserId) {
        regPlOutUserId(CK_GT, plOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param plOutUserId The value of plOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutUserId_LessThan(Long plOutUserId) {
        regPlOutUserId(CK_LT, plOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param plOutUserId The value of plOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutUserId_GreaterEqual(Long plOutUserId) {
        regPlOutUserId(CK_GE, plOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param plOutUserId The value of plOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutUserId_LessEqual(Long plOutUserId) {
        regPlOutUserId(CK_LE, plOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of plOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of plOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlOutUserId(), "PL_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param plOutUserIdList The collection of plOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutUserId_InScope(Collection<Long> plOutUserIdList) {
        doSetPlOutUserId_InScope(plOutUserIdList);
    }

    protected void doSetPlOutUserId_InScope(Collection<Long> plOutUserIdList) {
        regINS(CK_INS, cTL(plOutUserIdList), xgetCValuePlOutUserId(), "PL_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param plOutUserIdList The collection of plOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutUserId_NotInScope(Collection<Long> plOutUserIdList) {
        doSetPlOutUserId_NotInScope(plOutUserIdList);
    }

    protected void doSetPlOutUserId_NotInScope(Collection<Long> plOutUserIdList) {
        regINS(CK_NINS, cTL(plOutUserIdList), xgetCValuePlOutUserId(), "PL_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PL_OUT_USER_ID, named 'BUserByPlOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPlOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByPlOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlOutUserId_InScopeRelation_BUserByPlOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL_OUT_USER_ID", "USER_ID", pp, "bUserByPlOutUserId", false);
    }
    public abstract String keepPlOutUserId_InScopeRelation_BUserByPlOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PL_OUT_USER_ID, named 'BUserByPlOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPlOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByPlOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlOutUserId_NotInScopeRelation_BUserByPlOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL_OUT_USER_ID", "USER_ID", pp, "bUserByPlOutUserId", true);
    }
    public abstract String keepPlOutUserId_NotInScopeRelation_BUserByPlOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPlOutUserId_IsNull() { regPlOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPlOutUserId_IsNotNull() { regPlOutUserId(CK_ISNN, DOBJ); }

    protected void regPlOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlOutUserId(), "PL_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValuePlOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * @param plOutDt The value of plOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutDt_Equal(java.sql.Timestamp plOutDt) {
        regPlOutDt(CK_EQ,  plOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * @param plOutDt The value of plOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutDt_GreaterThan(java.sql.Timestamp plOutDt) {
        regPlOutDt(CK_GT,  plOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * @param plOutDt The value of plOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutDt_LessThan(java.sql.Timestamp plOutDt) {
        regPlOutDt(CK_LT,  plOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * @param plOutDt The value of plOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutDt_GreaterEqual(java.sql.Timestamp plOutDt) {
        regPlOutDt(CK_GE,  plOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * @param plOutDt The value of plOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutDt_LessEqual(java.sql.Timestamp plOutDt) {
        regPlOutDt(CK_LE, plOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setPlOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of plOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of plOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPlOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePlOutDt(), "PL_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of plOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of plOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPlOutDt_DateFromTo(Date fromDate, Date toDate) {
        setPlOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     */
    public void setPlOutDt_IsNull() { regPlOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL_OUT_DT: {DATETIME(19)}
     */
    public void setPlOutDt_IsNotNull() { regPlOutDt(CK_ISNN, DOBJ); }

    protected void regPlOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlOutDt(), "PL_OUT_DT"); }
    protected abstract ConditionValue xgetCValuePlOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slOutFlg The value of slOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_Equal(String slOutFlg) {
        doSetSlOutFlg_Equal(fRES(slOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSlOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSlOutFlg_Equal_$0() {
        setSlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSlOutFlg_Equal_$1() {
        setSlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSlOutFlg_Equal(String slOutFlg) {
        regSlOutFlg(CK_EQ, slOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slOutFlg The value of slOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_NotEqual(String slOutFlg) {
        doSetSlOutFlg_NotEqual(fRES(slOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSlOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSlOutFlg_NotEqual_$0() {
        setSlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSlOutFlg_NotEqual_$1() {
        setSlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSlOutFlg_NotEqual(String slOutFlg) {
        regSlOutFlg(CK_NES, slOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slOutFlgList The collection of slOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_InScope(Collection<String> slOutFlgList) {
        doSetSlOutFlg_InScope(slOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSlOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSlOutFlg_InScope(Collection<String> slOutFlgList) {
        regINS(CK_INS, cTL(slOutFlgList), xgetCValueSlOutFlg(), "SL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slOutFlgList The collection of slOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_NotInScope(Collection<String> slOutFlgList) {
        doSetSlOutFlg_NotInScope(slOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSlOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSlOutFlg_NotInScope(Collection<String> slOutFlgList) {
        regINS(CK_NINS, cTL(slOutFlgList), xgetCValueSlOutFlg(), "SL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlOutFlg_IsNull() { regSlOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlOutFlg_IsNullOrEmpty() { regSlOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlOutFlg_IsNotNull() { regSlOutFlg(CK_ISNN, DOBJ); }

    protected void regSlOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlOutFlg(), "SL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueSlOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl2OutFlg The value of pl2OutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_Equal(String pl2OutFlg) {
        doSetPl2OutFlg_Equal(fRES(pl2OutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPl2OutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPl2OutFlg_Equal_$0() {
        setPl2OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPl2OutFlg_Equal_$1() {
        setPl2OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPl2OutFlg_Equal(String pl2OutFlg) {
        regPl2OutFlg(CK_EQ, pl2OutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl2OutFlg The value of pl2OutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_NotEqual(String pl2OutFlg) {
        doSetPl2OutFlg_NotEqual(fRES(pl2OutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPl2OutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPl2OutFlg_NotEqual_$0() {
        setPl2OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPl2OutFlg_NotEqual_$1() {
        setPl2OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPl2OutFlg_NotEqual(String pl2OutFlg) {
        regPl2OutFlg(CK_NES, pl2OutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl2OutFlgList The collection of pl2OutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_InScope(Collection<String> pl2OutFlgList) {
        doSetPl2OutFlg_InScope(pl2OutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPl2OutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPl2OutFlg_InScope(Collection<String> pl2OutFlgList) {
        regINS(CK_INS, cTL(pl2OutFlgList), xgetCValuePl2OutFlg(), "PL2_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl2OutFlgList The collection of pl2OutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_NotInScope(Collection<String> pl2OutFlgList) {
        doSetPl2OutFlg_NotInScope(pl2OutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPl2OutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPl2OutFlg_NotInScope(Collection<String> pl2OutFlgList) {
        regINS(CK_NINS, cTL(pl2OutFlgList), xgetCValuePl2OutFlg(), "PL2_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl2OutFlg_IsNull() { regPl2OutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl2OutFlg_IsNullOrEmpty() { regPl2OutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl2OutFlg_IsNotNull() { regPl2OutFlg(CK_ISNN, DOBJ); }

    protected void regPl2OutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl2OutFlg(), "PL2_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePl2OutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl2OutUserId The value of pl2OutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_Equal(Long pl2OutUserId) {
        doSetPl2OutUserId_Equal(pl2OutUserId);
    }

    protected void doSetPl2OutUserId_Equal(Long pl2OutUserId) {
        regPl2OutUserId(CK_EQ, pl2OutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl2OutUserId The value of pl2OutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_NotEqual(Long pl2OutUserId) {
        doSetPl2OutUserId_NotEqual(pl2OutUserId);
    }

    protected void doSetPl2OutUserId_NotEqual(Long pl2OutUserId) {
        regPl2OutUserId(CK_NES, pl2OutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl2OutUserId The value of pl2OutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_GreaterThan(Long pl2OutUserId) {
        regPl2OutUserId(CK_GT, pl2OutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl2OutUserId The value of pl2OutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_LessThan(Long pl2OutUserId) {
        regPl2OutUserId(CK_LT, pl2OutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl2OutUserId The value of pl2OutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_GreaterEqual(Long pl2OutUserId) {
        regPl2OutUserId(CK_GE, pl2OutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl2OutUserId The value of pl2OutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_LessEqual(Long pl2OutUserId) {
        regPl2OutUserId(CK_LE, pl2OutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of pl2OutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pl2OutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPl2OutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePl2OutUserId(), "PL2_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl2OutUserIdList The collection of pl2OutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutUserId_InScope(Collection<Long> pl2OutUserIdList) {
        doSetPl2OutUserId_InScope(pl2OutUserIdList);
    }

    protected void doSetPl2OutUserId_InScope(Collection<Long> pl2OutUserIdList) {
        regINS(CK_INS, cTL(pl2OutUserIdList), xgetCValuePl2OutUserId(), "PL2_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pl2OutUserIdList The collection of pl2OutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutUserId_NotInScope(Collection<Long> pl2OutUserIdList) {
        doSetPl2OutUserId_NotInScope(pl2OutUserIdList);
    }

    protected void doSetPl2OutUserId_NotInScope(Collection<Long> pl2OutUserIdList) {
        regINS(CK_NINS, cTL(pl2OutUserIdList), xgetCValuePl2OutUserId(), "PL2_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PL2_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPl2OutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByPl2OutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPl2OutUserId_InScopeRelation_BUserByPl2OutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL2_OUT_USER_ID", "USER_ID", pp, "bUserByPl2OutUserId", false);
    }
    public abstract String keepPl2OutUserId_InScopeRelation_BUserByPl2OutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PL2_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPl2OutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByPl2OutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL2_OUT_USER_ID", "USER_ID", pp, "bUserByPl2OutUserId", true);
    }
    public abstract String keepPl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPl2OutUserId_IsNull() { regPl2OutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPl2OutUserId_IsNotNull() { regPl2OutUserId(CK_ISNN, DOBJ); }

    protected void regPl2OutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl2OutUserId(), "PL2_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValuePl2OutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * @param pl2OutDt The value of pl2OutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_Equal(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_EQ,  pl2OutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * @param pl2OutDt The value of pl2OutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_GreaterThan(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_GT,  pl2OutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * @param pl2OutDt The value of pl2OutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_LessThan(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_LT,  pl2OutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * @param pl2OutDt The value of pl2OutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_GreaterEqual(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_GE,  pl2OutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * @param pl2OutDt The value of pl2OutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_LessEqual(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_LE, pl2OutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setPl2OutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pl2OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pl2OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPl2OutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePl2OutDt(), "PL2_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pl2OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of pl2OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPl2OutDt_DateFromTo(Date fromDate, Date toDate) {
        setPl2OutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     */
    public void setPl2OutDt_IsNull() { regPl2OutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     */
    public void setPl2OutDt_IsNotNull() { regPl2OutDt(CK_ISNN, DOBJ); }

    protected void regPl2OutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl2OutDt(), "PL2_OUT_DT"); }
    protected abstract ConditionValue xgetCValuePl2OutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param caseOutFlg The value of caseOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_Equal(String caseOutFlg) {
        doSetCaseOutFlg_Equal(fRES(caseOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetCaseOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setCaseOutFlg_Equal_$0() {
        setCaseOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setCaseOutFlg_Equal_$1() {
        setCaseOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetCaseOutFlg_Equal(String caseOutFlg) {
        regCaseOutFlg(CK_EQ, caseOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param caseOutFlg The value of caseOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_NotEqual(String caseOutFlg) {
        doSetCaseOutFlg_NotEqual(fRES(caseOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetCaseOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setCaseOutFlg_NotEqual_$0() {
        setCaseOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setCaseOutFlg_NotEqual_$1() {
        setCaseOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetCaseOutFlg_NotEqual(String caseOutFlg) {
        regCaseOutFlg(CK_NES, caseOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param caseOutFlgList The collection of caseOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_InScope(Collection<String> caseOutFlgList) {
        doSetCaseOutFlg_InScope(caseOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetCaseOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCaseOutFlg_InScope(Collection<String> caseOutFlgList) {
        regINS(CK_INS, cTL(caseOutFlgList), xgetCValueCaseOutFlg(), "CASE_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param caseOutFlgList The collection of caseOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_NotInScope(Collection<String> caseOutFlgList) {
        doSetCaseOutFlg_NotInScope(caseOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetCaseOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCaseOutFlg_NotInScope(Collection<String> caseOutFlgList) {
        regINS(CK_NINS, cTL(caseOutFlgList), xgetCValueCaseOutFlg(), "CASE_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setCaseOutFlg_IsNull() { regCaseOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setCaseOutFlg_IsNullOrEmpty() { regCaseOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setCaseOutFlg_IsNotNull() { regCaseOutFlg(CK_ISNN, DOBJ); }

    protected void regCaseOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseOutFlg(), "CASE_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueCaseOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param caseOutUserId The value of caseOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_Equal(Long caseOutUserId) {
        doSetCaseOutUserId_Equal(caseOutUserId);
    }

    protected void doSetCaseOutUserId_Equal(Long caseOutUserId) {
        regCaseOutUserId(CK_EQ, caseOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param caseOutUserId The value of caseOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_NotEqual(Long caseOutUserId) {
        doSetCaseOutUserId_NotEqual(caseOutUserId);
    }

    protected void doSetCaseOutUserId_NotEqual(Long caseOutUserId) {
        regCaseOutUserId(CK_NES, caseOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param caseOutUserId The value of caseOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_GreaterThan(Long caseOutUserId) {
        regCaseOutUserId(CK_GT, caseOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param caseOutUserId The value of caseOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_LessThan(Long caseOutUserId) {
        regCaseOutUserId(CK_LT, caseOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param caseOutUserId The value of caseOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_GreaterEqual(Long caseOutUserId) {
        regCaseOutUserId(CK_GE, caseOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param caseOutUserId The value of caseOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_LessEqual(Long caseOutUserId) {
        regCaseOutUserId(CK_LE, caseOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of caseOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseOutUserId(), "CASE_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param caseOutUserIdList The collection of caseOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutUserId_InScope(Collection<Long> caseOutUserIdList) {
        doSetCaseOutUserId_InScope(caseOutUserIdList);
    }

    protected void doSetCaseOutUserId_InScope(Collection<Long> caseOutUserIdList) {
        regINS(CK_INS, cTL(caseOutUserIdList), xgetCValueCaseOutUserId(), "CASE_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param caseOutUserIdList The collection of caseOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutUserId_NotInScope(Collection<Long> caseOutUserIdList) {
        doSetCaseOutUserId_NotInScope(caseOutUserIdList);
    }

    protected void doSetCaseOutUserId_NotInScope(Collection<Long> caseOutUserIdList) {
        regINS(CK_NINS, cTL(caseOutUserIdList), xgetCValueCaseOutUserId(), "CASE_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CASE_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByCaseOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByCaseOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCaseOutUserId_InScopeRelation_BUserByCaseOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "CASE_OUT_USER_ID", "USER_ID", pp, "bUserByCaseOutUserId", false);
    }
    public abstract String keepCaseOutUserId_InScopeRelation_BUserByCaseOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CASE_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByCaseOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByCaseOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCaseOutUserId_NotInScopeRelation_BUserByCaseOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "CASE_OUT_USER_ID", "USER_ID", pp, "bUserByCaseOutUserId", true);
    }
    public abstract String keepCaseOutUserId_NotInScopeRelation_BUserByCaseOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setCaseOutUserId_IsNull() { regCaseOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setCaseOutUserId_IsNotNull() { regCaseOutUserId(CK_ISNN, DOBJ); }

    protected void regCaseOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseOutUserId(), "CASE_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueCaseOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * @param caseOutDt The value of caseOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_Equal(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_EQ,  caseOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * @param caseOutDt The value of caseOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_GreaterThan(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_GT,  caseOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * @param caseOutDt The value of caseOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_LessThan(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_LT,  caseOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * @param caseOutDt The value of caseOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_GreaterEqual(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_GE,  caseOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * @param caseOutDt The value of caseOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_LessEqual(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_LE, caseOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setCaseOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of caseOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of caseOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCaseOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueCaseOutDt(), "CASE_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of caseOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of caseOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setCaseOutDt_DateFromTo(Date fromDate, Date toDate) {
        setCaseOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     */
    public void setCaseOutDt_IsNull() { regCaseOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     */
    public void setCaseOutDt_IsNotNull() { regCaseOutDt(CK_ISNN, DOBJ); }

    protected void regCaseOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseOutDt(), "CASE_OUT_DT"); }
    protected abstract ConditionValue xgetCValueCaseOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param packingOutFlg The value of packingOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_Equal(String packingOutFlg) {
        doSetPackingOutFlg_Equal(fRES(packingOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPackingOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPackingOutFlg_Equal_$0() {
        setPackingOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPackingOutFlg_Equal_$1() {
        setPackingOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPackingOutFlg_Equal(String packingOutFlg) {
        regPackingOutFlg(CK_EQ, packingOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param packingOutFlg The value of packingOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_NotEqual(String packingOutFlg) {
        doSetPackingOutFlg_NotEqual(fRES(packingOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPackingOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPackingOutFlg_NotEqual_$0() {
        setPackingOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPackingOutFlg_NotEqual_$1() {
        setPackingOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPackingOutFlg_NotEqual(String packingOutFlg) {
        regPackingOutFlg(CK_NES, packingOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param packingOutFlgList The collection of packingOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_InScope(Collection<String> packingOutFlgList) {
        doSetPackingOutFlg_InScope(packingOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPackingOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPackingOutFlg_InScope(Collection<String> packingOutFlgList) {
        regINS(CK_INS, cTL(packingOutFlgList), xgetCValuePackingOutFlg(), "PACKING_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param packingOutFlgList The collection of packingOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_NotInScope(Collection<String> packingOutFlgList) {
        doSetPackingOutFlg_NotInScope(packingOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPackingOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPackingOutFlg_NotInScope(Collection<String> packingOutFlgList) {
        regINS(CK_NINS, cTL(packingOutFlgList), xgetCValuePackingOutFlg(), "PACKING_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPackingOutFlg_IsNull() { regPackingOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPackingOutFlg_IsNullOrEmpty() { regPackingOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPackingOutFlg_IsNotNull() { regPackingOutFlg(CK_ISNN, DOBJ); }

    protected void regPackingOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingOutFlg(), "PACKING_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePackingOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param packingOutUserId The value of packingOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_Equal(Long packingOutUserId) {
        doSetPackingOutUserId_Equal(packingOutUserId);
    }

    protected void doSetPackingOutUserId_Equal(Long packingOutUserId) {
        regPackingOutUserId(CK_EQ, packingOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param packingOutUserId The value of packingOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_NotEqual(Long packingOutUserId) {
        doSetPackingOutUserId_NotEqual(packingOutUserId);
    }

    protected void doSetPackingOutUserId_NotEqual(Long packingOutUserId) {
        regPackingOutUserId(CK_NES, packingOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param packingOutUserId The value of packingOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_GreaterThan(Long packingOutUserId) {
        regPackingOutUserId(CK_GT, packingOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param packingOutUserId The value of packingOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_LessThan(Long packingOutUserId) {
        regPackingOutUserId(CK_LT, packingOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param packingOutUserId The value of packingOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_GreaterEqual(Long packingOutUserId) {
        regPackingOutUserId(CK_GE, packingOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param packingOutUserId The value of packingOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_LessEqual(Long packingOutUserId) {
        regPackingOutUserId(CK_LE, packingOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of packingOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingOutUserId(), "PACKING_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param packingOutUserIdList The collection of packingOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutUserId_InScope(Collection<Long> packingOutUserIdList) {
        doSetPackingOutUserId_InScope(packingOutUserIdList);
    }

    protected void doSetPackingOutUserId_InScope(Collection<Long> packingOutUserIdList) {
        regINS(CK_INS, cTL(packingOutUserIdList), xgetCValuePackingOutUserId(), "PACKING_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param packingOutUserIdList The collection of packingOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutUserId_NotInScope(Collection<Long> packingOutUserIdList) {
        doSetPackingOutUserId_NotInScope(packingOutUserIdList);
    }

    protected void doSetPackingOutUserId_NotInScope(Collection<Long> packingOutUserIdList) {
        regINS(CK_NINS, cTL(packingOutUserIdList), xgetCValuePackingOutUserId(), "PACKING_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PACKING_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPackingOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByPackingOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingOutUserId_InScopeRelation_BUserByPackingOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_OUT_USER_ID", "USER_ID", pp, "bUserByPackingOutUserId", false);
    }
    public abstract String keepPackingOutUserId_InScopeRelation_BUserByPackingOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PACKING_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPackingOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByPackingOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingOutUserId_NotInScopeRelation_BUserByPackingOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_OUT_USER_ID", "USER_ID", pp, "bUserByPackingOutUserId", true);
    }
    public abstract String keepPackingOutUserId_NotInScopeRelation_BUserByPackingOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPackingOutUserId_IsNull() { regPackingOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPackingOutUserId_IsNotNull() { regPackingOutUserId(CK_ISNN, DOBJ); }

    protected void regPackingOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingOutUserId(), "PACKING_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValuePackingOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * @param packingOutDt The value of packingOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_Equal(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_EQ,  packingOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * @param packingOutDt The value of packingOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_GreaterThan(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_GT,  packingOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * @param packingOutDt The value of packingOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_LessThan(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_LT,  packingOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * @param packingOutDt The value of packingOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_GreaterEqual(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_GE,  packingOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * @param packingOutDt The value of packingOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_LessEqual(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_LE, packingOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setPackingOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of packingOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of packingOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPackingOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePackingOutDt(), "PACKING_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of packingOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of packingOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPackingOutDt_DateFromTo(Date fromDate, Date toDate) {
        setPackingOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     */
    public void setPackingOutDt_IsNull() { regPackingOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     */
    public void setPackingOutDt_IsNotNull() { regPackingOutDt(CK_ISNN, DOBJ); }

    protected void regPackingOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingOutDt(), "PACKING_OUT_DT"); }
    protected abstract ConditionValue xgetCValuePackingOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slipOutFlg The value of slipOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_Equal(String slipOutFlg) {
        doSetSlipOutFlg_Equal(fRES(slipOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSlipOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSlipOutFlg_Equal_$0() {
        setSlipOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSlipOutFlg_Equal_$1() {
        setSlipOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSlipOutFlg_Equal(String slipOutFlg) {
        regSlipOutFlg(CK_EQ, slipOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slipOutFlg The value of slipOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_NotEqual(String slipOutFlg) {
        doSetSlipOutFlg_NotEqual(fRES(slipOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSlipOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSlipOutFlg_NotEqual_$0() {
        setSlipOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSlipOutFlg_NotEqual_$1() {
        setSlipOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSlipOutFlg_NotEqual(String slipOutFlg) {
        regSlipOutFlg(CK_NES, slipOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slipOutFlgList The collection of slipOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_InScope(Collection<String> slipOutFlgList) {
        doSetSlipOutFlg_InScope(slipOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSlipOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSlipOutFlg_InScope(Collection<String> slipOutFlgList) {
        regINS(CK_INS, cTL(slipOutFlgList), xgetCValueSlipOutFlg(), "SLIP_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slipOutFlgList The collection of slipOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_NotInScope(Collection<String> slipOutFlgList) {
        doSetSlipOutFlg_NotInScope(slipOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSlipOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSlipOutFlg_NotInScope(Collection<String> slipOutFlgList) {
        regINS(CK_NINS, cTL(slipOutFlgList), xgetCValueSlipOutFlg(), "SLIP_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlipOutFlg_IsNull() { regSlipOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlipOutFlg_IsNullOrEmpty() { regSlipOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlipOutFlg_IsNotNull() { regSlipOutFlg(CK_ISNN, DOBJ); }

    protected void regSlipOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipOutFlg(), "SLIP_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueSlipOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param slipOutUserId The value of slipOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_Equal(Long slipOutUserId) {
        doSetSlipOutUserId_Equal(slipOutUserId);
    }

    protected void doSetSlipOutUserId_Equal(Long slipOutUserId) {
        regSlipOutUserId(CK_EQ, slipOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param slipOutUserId The value of slipOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_NotEqual(Long slipOutUserId) {
        doSetSlipOutUserId_NotEqual(slipOutUserId);
    }

    protected void doSetSlipOutUserId_NotEqual(Long slipOutUserId) {
        regSlipOutUserId(CK_NES, slipOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param slipOutUserId The value of slipOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_GreaterThan(Long slipOutUserId) {
        regSlipOutUserId(CK_GT, slipOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param slipOutUserId The value of slipOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_LessThan(Long slipOutUserId) {
        regSlipOutUserId(CK_LT, slipOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param slipOutUserId The value of slipOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_GreaterEqual(Long slipOutUserId) {
        regSlipOutUserId(CK_GE, slipOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param slipOutUserId The value of slipOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_LessEqual(Long slipOutUserId) {
        regSlipOutUserId(CK_LE, slipOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of slipOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slipOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlipOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlipOutUserId(), "SLIP_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param slipOutUserIdList The collection of slipOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutUserId_InScope(Collection<Long> slipOutUserIdList) {
        doSetSlipOutUserId_InScope(slipOutUserIdList);
    }

    protected void doSetSlipOutUserId_InScope(Collection<Long> slipOutUserIdList) {
        regINS(CK_INS, cTL(slipOutUserIdList), xgetCValueSlipOutUserId(), "SLIP_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param slipOutUserIdList The collection of slipOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutUserId_NotInScope(Collection<Long> slipOutUserIdList) {
        doSetSlipOutUserId_NotInScope(slipOutUserIdList);
    }

    protected void doSetSlipOutUserId_NotInScope(Collection<Long> slipOutUserIdList) {
        regINS(CK_NINS, cTL(slipOutUserIdList), xgetCValueSlipOutUserId(), "SLIP_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SLIP_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserBySlipOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserBySlipOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSlipOutUserId_InScopeRelation_BUserBySlipOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "SLIP_OUT_USER_ID", "USER_ID", pp, "bUserBySlipOutUserId", false);
    }
    public abstract String keepSlipOutUserId_InScopeRelation_BUserBySlipOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SLIP_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserBySlipOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserBySlipOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSlipOutUserId_NotInScopeRelation_BUserBySlipOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "SLIP_OUT_USER_ID", "USER_ID", pp, "bUserBySlipOutUserId", true);
    }
    public abstract String keepSlipOutUserId_NotInScopeRelation_BUserBySlipOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setSlipOutUserId_IsNull() { regSlipOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setSlipOutUserId_IsNotNull() { regSlipOutUserId(CK_ISNN, DOBJ); }

    protected void regSlipOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipOutUserId(), "SLIP_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueSlipOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * @param slipOutDt The value of slipOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_Equal(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_EQ,  slipOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * @param slipOutDt The value of slipOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_GreaterThan(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_GT,  slipOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * @param slipOutDt The value of slipOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_LessThan(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_LT,  slipOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * @param slipOutDt The value of slipOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_GreaterEqual(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_GE,  slipOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * @param slipOutDt The value of slipOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_LessEqual(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_LE, slipOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setSlipOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of slipOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of slipOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setSlipOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueSlipOutDt(), "SLIP_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of slipOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of slipOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setSlipOutDt_DateFromTo(Date fromDate, Date toDate) {
        setSlipOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     */
    public void setSlipOutDt_IsNull() { regSlipOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     */
    public void setSlipOutDt_IsNotNull() { regSlipOutDt(CK_ISNN, DOBJ); }

    protected void regSlipOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipOutDt(), "SLIP_OUT_DT"); }
    protected abstract ConditionValue xgetCValueSlipOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlg The value of invoiceCreateFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_Equal(String invoiceCreateFlg) {
        doSetInvoiceCreateFlg_Equal(fRES(invoiceCreateFlg));
    }

    /**
     * Equal(=). As InvoiceCreateFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg cdef) {
        doSetInvoiceCreateFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未出力
     */
    public void setInvoiceCreateFlg_Equal_$0() {
        setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力済
     */
    public void setInvoiceCreateFlg_Equal_$1() {
        setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$1);
    }

    protected void doSetInvoiceCreateFlg_Equal(String invoiceCreateFlg) {
        regInvoiceCreateFlg(CK_EQ, invoiceCreateFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlg The value of invoiceCreateFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotEqual(String invoiceCreateFlg) {
        doSetInvoiceCreateFlg_NotEqual(fRES(invoiceCreateFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InvoiceCreateFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg cdef) {
        doSetInvoiceCreateFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未出力
     */
    public void setInvoiceCreateFlg_NotEqual_$0() {
        setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力済
     */
    public void setInvoiceCreateFlg_NotEqual_$1() {
        setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$1);
    }

    protected void doSetInvoiceCreateFlg_NotEqual(String invoiceCreateFlg) {
        regInvoiceCreateFlg(CK_NES, invoiceCreateFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlgList The collection of invoiceCreateFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_InScope(Collection<String> invoiceCreateFlgList) {
        doSetInvoiceCreateFlg_InScope(invoiceCreateFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InvoiceCreateFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_InScope_AsInvoiceCreateFlg(Collection<CDef.InvoiceCreateFlg> cdefList) {
        doSetInvoiceCreateFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInvoiceCreateFlg_InScope(Collection<String> invoiceCreateFlgList) {
        regINS(CK_INS, cTL(invoiceCreateFlgList), xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlgList The collection of invoiceCreateFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotInScope(Collection<String> invoiceCreateFlgList) {
        doSetInvoiceCreateFlg_NotInScope(invoiceCreateFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InvoiceCreateFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotInScope_AsInvoiceCreateFlg(Collection<CDef.InvoiceCreateFlg> cdefList) {
        doSetInvoiceCreateFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInvoiceCreateFlg_NotInScope(Collection<String> invoiceCreateFlgList) {
        regINS(CK_NINS, cTL(invoiceCreateFlgList), xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     */
    public void setInvoiceCreateFlg_IsNull() { regInvoiceCreateFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     */
    public void setInvoiceCreateFlg_IsNullOrEmpty() { regInvoiceCreateFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     */
    public void setInvoiceCreateFlg_IsNotNull() { regInvoiceCreateFlg(CK_ISNN, DOBJ); }

    protected void regInvoiceCreateFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG"); }
    protected abstract ConditionValue xgetCValueInvoiceCreateFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * @param invoiceCreateDt The value of invoiceCreateDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_Equal(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_EQ,  invoiceCreateDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * @param invoiceCreateDt The value of invoiceCreateDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_GreaterThan(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_GT,  invoiceCreateDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * @param invoiceCreateDt The value of invoiceCreateDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_LessThan(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_LT,  invoiceCreateDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * @param invoiceCreateDt The value of invoiceCreateDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_GreaterEqual(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_GE,  invoiceCreateDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * @param invoiceCreateDt The value of invoiceCreateDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_LessEqual(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_LE, invoiceCreateDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * <pre>e.g. setInvoiceCreateDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInvoiceCreateDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInvoiceCreateDt(), "INVOICE_CREATE_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInvoiceCreateDt_DateFromTo(Date fromDate, Date toDate) {
        setInvoiceCreateDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     */
    public void setInvoiceCreateDt_IsNull() { regInvoiceCreateDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     */
    public void setInvoiceCreateDt_IsNotNull() { regInvoiceCreateDt(CK_ISNN, DOBJ); }

    protected void regInvoiceCreateDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceCreateDt(), "INVOICE_CREATE_DT"); }
    protected abstract ConditionValue xgetCValueInvoiceCreateDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_Equal(Long invoiceIssueNum) {
        doSetInvoiceIssueNum_Equal(invoiceIssueNum);
    }

    protected void doSetInvoiceIssueNum_Equal(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_EQ, invoiceIssueNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_NotEqual(Long invoiceIssueNum) {
        doSetInvoiceIssueNum_NotEqual(invoiceIssueNum);
    }

    protected void doSetInvoiceIssueNum_NotEqual(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_NES, invoiceIssueNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_GreaterThan(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_GT, invoiceIssueNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_LessThan(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_LT, invoiceIssueNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_GreaterEqual(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_GE, invoiceIssueNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_LessEqual(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_LE, invoiceIssueNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param minNumber The min number of invoiceIssueNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of invoiceIssueNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvoiceIssueNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvoiceIssueNum(), "INVOICE_ISSUE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param invoiceIssueNumList The collection of invoiceIssueNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_InScope(Collection<Long> invoiceIssueNumList) {
        doSetInvoiceIssueNum_InScope(invoiceIssueNumList);
    }

    protected void doSetInvoiceIssueNum_InScope(Collection<Long> invoiceIssueNumList) {
        regINS(CK_INS, cTL(invoiceIssueNumList), xgetCValueInvoiceIssueNum(), "INVOICE_ISSUE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @param invoiceIssueNumList The collection of invoiceIssueNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_NotInScope(Collection<Long> invoiceIssueNumList) {
        doSetInvoiceIssueNum_NotInScope(invoiceIssueNumList);
    }

    protected void doSetInvoiceIssueNum_NotInScope(Collection<Long> invoiceIssueNumList) {
        regINS(CK_NINS, cTL(invoiceIssueNumList), xgetCValueInvoiceIssueNum(), "INVOICE_ISSUE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     */
    public void setInvoiceIssueNum_IsNull() { regInvoiceIssueNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     */
    public void setInvoiceIssueNum_IsNotNull() { regInvoiceIssueNum(CK_ISNN, DOBJ); }

    protected void regInvoiceIssueNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceIssueNum(), "INVOICE_ISSUE_NUM"); }
    protected abstract ConditionValue xgetCValueInvoiceIssueNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param shippingRecordOutFlg The value of shippingRecordOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_Equal(String shippingRecordOutFlg) {
        doSetShippingRecordOutFlg_Equal(fRES(shippingRecordOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetShippingRecordOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setShippingRecordOutFlg_Equal_$0() {
        setShippingRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setShippingRecordOutFlg_Equal_$1() {
        setShippingRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetShippingRecordOutFlg_Equal(String shippingRecordOutFlg) {
        regShippingRecordOutFlg(CK_EQ, shippingRecordOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param shippingRecordOutFlg The value of shippingRecordOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_NotEqual(String shippingRecordOutFlg) {
        doSetShippingRecordOutFlg_NotEqual(fRES(shippingRecordOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetShippingRecordOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setShippingRecordOutFlg_NotEqual_$0() {
        setShippingRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setShippingRecordOutFlg_NotEqual_$1() {
        setShippingRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetShippingRecordOutFlg_NotEqual(String shippingRecordOutFlg) {
        regShippingRecordOutFlg(CK_NES, shippingRecordOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param shippingRecordOutFlgList The collection of shippingRecordOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_InScope(Collection<String> shippingRecordOutFlgList) {
        doSetShippingRecordOutFlg_InScope(shippingRecordOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetShippingRecordOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetShippingRecordOutFlg_InScope(Collection<String> shippingRecordOutFlgList) {
        regINS(CK_INS, cTL(shippingRecordOutFlgList), xgetCValueShippingRecordOutFlg(), "SHIPPING_RECORD_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param shippingRecordOutFlgList The collection of shippingRecordOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_NotInScope(Collection<String> shippingRecordOutFlgList) {
        doSetShippingRecordOutFlg_NotInScope(shippingRecordOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetShippingRecordOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetShippingRecordOutFlg_NotInScope(Collection<String> shippingRecordOutFlgList) {
        regINS(CK_NINS, cTL(shippingRecordOutFlgList), xgetCValueShippingRecordOutFlg(), "SHIPPING_RECORD_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setShippingRecordOutFlg_IsNull() { regShippingRecordOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setShippingRecordOutFlg_IsNullOrEmpty() { regShippingRecordOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setShippingRecordOutFlg_IsNotNull() { regShippingRecordOutFlg(CK_ISNN, DOBJ); }

    protected void regShippingRecordOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordOutFlg(), "SHIPPING_RECORD_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueShippingRecordOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_Equal(Long shippingRecordOutUserId) {
        doSetShippingRecordOutUserId_Equal(shippingRecordOutUserId);
    }

    protected void doSetShippingRecordOutUserId_Equal(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_EQ, shippingRecordOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_NotEqual(Long shippingRecordOutUserId) {
        doSetShippingRecordOutUserId_NotEqual(shippingRecordOutUserId);
    }

    protected void doSetShippingRecordOutUserId_NotEqual(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_NES, shippingRecordOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_GreaterThan(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_GT, shippingRecordOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_LessThan(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_LT, shippingRecordOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_GreaterEqual(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_GE, shippingRecordOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_LessEqual(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_LE, shippingRecordOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of shippingRecordOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingRecordOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingRecordOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingRecordOutUserId(), "SHIPPING_RECORD_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param shippingRecordOutUserIdList The collection of shippingRecordOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_InScope(Collection<Long> shippingRecordOutUserIdList) {
        doSetShippingRecordOutUserId_InScope(shippingRecordOutUserIdList);
    }

    protected void doSetShippingRecordOutUserId_InScope(Collection<Long> shippingRecordOutUserIdList) {
        regINS(CK_INS, cTL(shippingRecordOutUserIdList), xgetCValueShippingRecordOutUserId(), "SHIPPING_RECORD_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param shippingRecordOutUserIdList The collection of shippingRecordOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_NotInScope(Collection<Long> shippingRecordOutUserIdList) {
        doSetShippingRecordOutUserId_NotInScope(shippingRecordOutUserIdList);
    }

    protected void doSetShippingRecordOutUserId_NotInScope(Collection<Long> shippingRecordOutUserIdList) {
        regINS(CK_NINS, cTL(shippingRecordOutUserIdList), xgetCValueShippingRecordOutUserId(), "SHIPPING_RECORD_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_RECORD_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByShippingRecordOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByShippingRecordOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_RECORD_OUT_USER_ID", "USER_ID", pp, "bUserByShippingRecordOutUserId", false);
    }
    public abstract String keepShippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_RECORD_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByShippingRecordOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByShippingRecordOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_RECORD_OUT_USER_ID", "USER_ID", pp, "bUserByShippingRecordOutUserId", true);
    }
    public abstract String keepShippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setShippingRecordOutUserId_IsNull() { regShippingRecordOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setShippingRecordOutUserId_IsNotNull() { regShippingRecordOutUserId(CK_ISNN, DOBJ); }

    protected void regShippingRecordOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordOutUserId(), "SHIPPING_RECORD_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueShippingRecordOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_Equal(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_EQ,  shippingRecordOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_GreaterThan(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_GT,  shippingRecordOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_LessThan(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_LT,  shippingRecordOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_GreaterEqual(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_GE,  shippingRecordOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_LessEqual(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_LE, shippingRecordOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setShippingRecordOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of shippingRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of shippingRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setShippingRecordOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueShippingRecordOutDt(), "SHIPPING_RECORD_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of shippingRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of shippingRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setShippingRecordOutDt_DateFromTo(Date fromDate, Date toDate) {
        setShippingRecordOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     */
    public void setShippingRecordOutDt_IsNull() { regShippingRecordOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     */
    public void setShippingRecordOutDt_IsNotNull() { regShippingRecordOutDt(CK_ISNN, DOBJ); }

    protected void regShippingRecordOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordOutDt(), "SHIPPING_RECORD_OUT_DT"); }
    protected abstract ConditionValue xgetCValueShippingRecordOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @param bolOutFlg The value of bolOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_Equal(String bolOutFlg) {
        doSetBolOutFlg_Equal(fRES(bolOutFlg));
    }

    /**
     * Equal(=). As BolOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutFlg_Equal_AsBolOutFlg(CDef.BolOutFlg cdef) {
        doSetBolOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setBolOutFlg_Equal_$0() {
        setBolOutFlg_Equal_AsBolOutFlg(CDef.BolOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setBolOutFlg_Equal_$1() {
        setBolOutFlg_Equal_AsBolOutFlg(CDef.BolOutFlg.$1);
    }

    protected void doSetBolOutFlg_Equal(String bolOutFlg) {
        regBolOutFlg(CK_EQ, bolOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @param bolOutFlg The value of bolOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_NotEqual(String bolOutFlg) {
        doSetBolOutFlg_NotEqual(fRES(bolOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As BolOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutFlg_NotEqual_AsBolOutFlg(CDef.BolOutFlg cdef) {
        doSetBolOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setBolOutFlg_NotEqual_$0() {
        setBolOutFlg_NotEqual_AsBolOutFlg(CDef.BolOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setBolOutFlg_NotEqual_$1() {
        setBolOutFlg_NotEqual_AsBolOutFlg(CDef.BolOutFlg.$1);
    }

    protected void doSetBolOutFlg_NotEqual(String bolOutFlg) {
        regBolOutFlg(CK_NES, bolOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @param bolOutFlgList The collection of bolOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_InScope(Collection<String> bolOutFlgList) {
        doSetBolOutFlg_InScope(bolOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As BolOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_InScope_AsBolOutFlg(Collection<CDef.BolOutFlg> cdefList) {
        doSetBolOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetBolOutFlg_InScope(Collection<String> bolOutFlgList) {
        regINS(CK_INS, cTL(bolOutFlgList), xgetCValueBolOutFlg(), "BOL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @param bolOutFlgList The collection of bolOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_NotInScope(Collection<String> bolOutFlgList) {
        doSetBolOutFlg_NotInScope(bolOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As BolOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_NotInScope_AsBolOutFlg(Collection<CDef.BolOutFlg> cdefList) {
        doSetBolOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetBolOutFlg_NotInScope(Collection<String> bolOutFlgList) {
        regINS(CK_NINS, cTL(bolOutFlgList), xgetCValueBolOutFlg(), "BOL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     */
    public void setBolOutFlg_IsNull() { regBolOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     */
    public void setBolOutFlg_IsNullOrEmpty() { regBolOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     */
    public void setBolOutFlg_IsNotNull() { regBolOutFlg(CK_ISNN, DOBJ); }

    protected void regBolOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBolOutFlg(), "BOL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueBolOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param bolOutUserId The value of bolOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_Equal(Long bolOutUserId) {
        doSetBolOutUserId_Equal(bolOutUserId);
    }

    protected void doSetBolOutUserId_Equal(Long bolOutUserId) {
        regBolOutUserId(CK_EQ, bolOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param bolOutUserId The value of bolOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_NotEqual(Long bolOutUserId) {
        doSetBolOutUserId_NotEqual(bolOutUserId);
    }

    protected void doSetBolOutUserId_NotEqual(Long bolOutUserId) {
        regBolOutUserId(CK_NES, bolOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param bolOutUserId The value of bolOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_GreaterThan(Long bolOutUserId) {
        regBolOutUserId(CK_GT, bolOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param bolOutUserId The value of bolOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_LessThan(Long bolOutUserId) {
        regBolOutUserId(CK_LT, bolOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param bolOutUserId The value of bolOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_GreaterEqual(Long bolOutUserId) {
        regBolOutUserId(CK_GE, bolOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param bolOutUserId The value of bolOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_LessEqual(Long bolOutUserId) {
        regBolOutUserId(CK_LE, bolOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of bolOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bolOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBolOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBolOutUserId(), "BOL_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param bolOutUserIdList The collection of bolOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutUserId_InScope(Collection<Long> bolOutUserIdList) {
        doSetBolOutUserId_InScope(bolOutUserIdList);
    }

    protected void doSetBolOutUserId_InScope(Collection<Long> bolOutUserIdList) {
        regINS(CK_INS, cTL(bolOutUserIdList), xgetCValueBolOutUserId(), "BOL_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param bolOutUserIdList The collection of bolOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutUserId_NotInScope(Collection<Long> bolOutUserIdList) {
        doSetBolOutUserId_NotInScope(bolOutUserIdList);
    }

    protected void doSetBolOutUserId_NotInScope(Collection<Long> bolOutUserIdList) {
        regINS(CK_NINS, cTL(bolOutUserIdList), xgetCValueBolOutUserId(), "BOL_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BOL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my BOL_OUT_USER_ID, named 'BUserByBolOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByBolOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByBolOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBolOutUserId_InScopeRelation_BUserByBolOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "BOL_OUT_USER_ID", "USER_ID", pp, "bUserByBolOutUserId", false);
    }
    public abstract String keepBolOutUserId_InScopeRelation_BUserByBolOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BOL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my BOL_OUT_USER_ID, named 'BUserByBolOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByBolOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByBolOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBolOutUserId_NotInScopeRelation_BUserByBolOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "BOL_OUT_USER_ID", "USER_ID", pp, "bUserByBolOutUserId", true);
    }
    public abstract String keepBolOutUserId_NotInScopeRelation_BUserByBolOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setBolOutUserId_IsNull() { regBolOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setBolOutUserId_IsNotNull() { regBolOutUserId(CK_ISNN, DOBJ); }

    protected void regBolOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBolOutUserId(), "BOL_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueBolOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * @param bolOutDt The value of bolOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_Equal(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_EQ,  bolOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * @param bolOutDt The value of bolOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_GreaterThan(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_GT,  bolOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * @param bolOutDt The value of bolOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_LessThan(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_LT,  bolOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * @param bolOutDt The value of bolOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_GreaterEqual(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_GE,  bolOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * @param bolOutDt The value of bolOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_LessEqual(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_LE, bolOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setBolOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of bolOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of bolOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBolOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueBolOutDt(), "BOL_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of bolOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of bolOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setBolOutDt_DateFromTo(Date fromDate, Date toDate) {
        setBolOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     */
    public void setBolOutDt_IsNull() { regBolOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     */
    public void setBolOutDt_IsNotNull() { regBolOutDt(CK_ISNN, DOBJ); }

    protected void regBolOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBolOutDt(), "BOL_OUT_DT"); }
    protected abstract ConditionValue xgetCValueBolOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlg The value of tagOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_Equal(String tagOutFlg) {
        doSetTagOutFlg_Equal(fRES(tagOutFlg));
    }

    protected void doSetTagOutFlg_Equal(String tagOutFlg) {
        regTagOutFlg(CK_EQ, tagOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlg The value of tagOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_NotEqual(String tagOutFlg) {
        doSetTagOutFlg_NotEqual(fRES(tagOutFlg));
    }

    protected void doSetTagOutFlg_NotEqual(String tagOutFlg) {
        regTagOutFlg(CK_NES, tagOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlg The value of tagOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_GreaterThan(String tagOutFlg) {
        regTagOutFlg(CK_GT, fRES(tagOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlg The value of tagOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_LessThan(String tagOutFlg) {
        regTagOutFlg(CK_LT, fRES(tagOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlg The value of tagOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_GreaterEqual(String tagOutFlg) {
        regTagOutFlg(CK_GE, fRES(tagOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlg The value of tagOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_LessEqual(String tagOutFlg) {
        regTagOutFlg(CK_LE, fRES(tagOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlgList The collection of tagOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_InScope(Collection<String> tagOutFlgList) {
        doSetTagOutFlg_InScope(tagOutFlgList);
    }

    protected void doSetTagOutFlg_InScope(Collection<String> tagOutFlgList) {
        regINS(CK_INS, cTL(tagOutFlgList), xgetCValueTagOutFlg(), "TAG_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlgList The collection of tagOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_NotInScope(Collection<String> tagOutFlgList) {
        doSetTagOutFlg_NotInScope(tagOutFlgList);
    }

    protected void doSetTagOutFlg_NotInScope(Collection<String> tagOutFlgList) {
        regINS(CK_NINS, cTL(tagOutFlgList), xgetCValueTagOutFlg(), "TAG_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setTagOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagOutFlg The value of tagOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagOutFlg_LikeSearch(String tagOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagOutFlg), xgetCValueTagOutFlg(), "TAG_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlg The value of tagOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagOutFlg_NotLikeSearch(String tagOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagOutFlg), xgetCValueTagOutFlg(), "TAG_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @param tagOutFlg The value of tagOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutFlg_PrefixSearch(String tagOutFlg) {
        setTagOutFlg_LikeSearch(tagOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     */
    public void setTagOutFlg_IsNull() { regTagOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     */
    public void setTagOutFlg_IsNullOrEmpty() { regTagOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     */
    public void setTagOutFlg_IsNotNull() { regTagOutFlg(CK_ISNN, DOBJ); }

    protected void regTagOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagOutFlg(), "TAG_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueTagOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param tagOutUserId The value of tagOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_Equal(Long tagOutUserId) {
        doSetTagOutUserId_Equal(tagOutUserId);
    }

    protected void doSetTagOutUserId_Equal(Long tagOutUserId) {
        regTagOutUserId(CK_EQ, tagOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param tagOutUserId The value of tagOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_NotEqual(Long tagOutUserId) {
        doSetTagOutUserId_NotEqual(tagOutUserId);
    }

    protected void doSetTagOutUserId_NotEqual(Long tagOutUserId) {
        regTagOutUserId(CK_NES, tagOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param tagOutUserId The value of tagOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_GreaterThan(Long tagOutUserId) {
        regTagOutUserId(CK_GT, tagOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param tagOutUserId The value of tagOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_LessThan(Long tagOutUserId) {
        regTagOutUserId(CK_LT, tagOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param tagOutUserId The value of tagOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_GreaterEqual(Long tagOutUserId) {
        regTagOutUserId(CK_GE, tagOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param tagOutUserId The value of tagOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutUserId_LessEqual(Long tagOutUserId) {
        regTagOutUserId(CK_LE, tagOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of tagOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tagOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTagOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTagOutUserId(), "TAG_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param tagOutUserIdList The collection of tagOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutUserId_InScope(Collection<Long> tagOutUserIdList) {
        doSetTagOutUserId_InScope(tagOutUserIdList);
    }

    protected void doSetTagOutUserId_InScope(Collection<Long> tagOutUserIdList) {
        regINS(CK_INS, cTL(tagOutUserIdList), xgetCValueTagOutUserId(), "TAG_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param tagOutUserIdList The collection of tagOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagOutUserId_NotInScope(Collection<Long> tagOutUserIdList) {
        doSetTagOutUserId_NotInScope(tagOutUserIdList);
    }

    protected void doSetTagOutUserId_NotInScope(Collection<Long> tagOutUserIdList) {
        regINS(CK_NINS, cTL(tagOutUserIdList), xgetCValueTagOutUserId(), "TAG_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TAG_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByTagOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByTagOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "TAG_OUT_USER_ID", "USER_ID", pp, "bUserByTagOutUserId", false);
    }
    public abstract String keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TAG_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByTagOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByTagOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "TAG_OUT_USER_ID", "USER_ID", pp, "bUserByTagOutUserId", true);
    }
    public abstract String keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setTagOutUserId_IsNull() { regTagOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setTagOutUserId_IsNotNull() { regTagOutUserId(CK_ISNN, DOBJ); }

    protected void regTagOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagOutUserId(), "TAG_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueTagOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * @param tagOutDt The value of tagOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_Equal(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_EQ,  tagOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * @param tagOutDt The value of tagOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_GreaterThan(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_GT,  tagOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * @param tagOutDt The value of tagOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_LessThan(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_LT,  tagOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * @param tagOutDt The value of tagOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_GreaterEqual(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_GE,  tagOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * @param tagOutDt The value of tagOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTagOutDt_LessEqual(java.sql.Timestamp tagOutDt) {
        regTagOutDt(CK_LE, tagOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setTagOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of tagOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of tagOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTagOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueTagOutDt(), "TAG_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of tagOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of tagOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTagOutDt_DateFromTo(Date fromDate, Date toDate) {
        setTagOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     */
    public void setTagOutDt_IsNull() { regTagOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     */
    public void setTagOutDt_IsNotNull() { regTagOutDt(CK_ISNN, DOBJ); }

    protected void regTagOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagOutDt(), "TAG_OUT_DT"); }
    protected abstract ConditionValue xgetCValueTagOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlg The value of delivOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_Equal(String delivOutFlg) {
        doSetDelivOutFlg_Equal(fRES(delivOutFlg));
    }

    protected void doSetDelivOutFlg_Equal(String delivOutFlg) {
        regDelivOutFlg(CK_EQ, delivOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlg The value of delivOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_NotEqual(String delivOutFlg) {
        doSetDelivOutFlg_NotEqual(fRES(delivOutFlg));
    }

    protected void doSetDelivOutFlg_NotEqual(String delivOutFlg) {
        regDelivOutFlg(CK_NES, delivOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlg The value of delivOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_GreaterThan(String delivOutFlg) {
        regDelivOutFlg(CK_GT, fRES(delivOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlg The value of delivOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_LessThan(String delivOutFlg) {
        regDelivOutFlg(CK_LT, fRES(delivOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlg The value of delivOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_GreaterEqual(String delivOutFlg) {
        regDelivOutFlg(CK_GE, fRES(delivOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlg The value of delivOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_LessEqual(String delivOutFlg) {
        regDelivOutFlg(CK_LE, fRES(delivOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlgList The collection of delivOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_InScope(Collection<String> delivOutFlgList) {
        doSetDelivOutFlg_InScope(delivOutFlgList);
    }

    protected void doSetDelivOutFlg_InScope(Collection<String> delivOutFlgList) {
        regINS(CK_INS, cTL(delivOutFlgList), xgetCValueDelivOutFlg(), "DELIV_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlgList The collection of delivOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_NotInScope(Collection<String> delivOutFlgList) {
        doSetDelivOutFlg_NotInScope(delivOutFlgList);
    }

    protected void doSetDelivOutFlg_NotInScope(Collection<String> delivOutFlgList) {
        regINS(CK_NINS, cTL(delivOutFlgList), xgetCValueDelivOutFlg(), "DELIV_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setDelivOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivOutFlg The value of delivOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivOutFlg_LikeSearch(String delivOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivOutFlg), xgetCValueDelivOutFlg(), "DELIV_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlg The value of delivOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivOutFlg_NotLikeSearch(String delivOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivOutFlg), xgetCValueDelivOutFlg(), "DELIV_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @param delivOutFlg The value of delivOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutFlg_PrefixSearch(String delivOutFlg) {
        setDelivOutFlg_LikeSearch(delivOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     */
    public void setDelivOutFlg_IsNull() { regDelivOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     */
    public void setDelivOutFlg_IsNullOrEmpty() { regDelivOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     */
    public void setDelivOutFlg_IsNotNull() { regDelivOutFlg(CK_ISNN, DOBJ); }

    protected void regDelivOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivOutFlg(), "DELIV_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueDelivOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param delivOutUserId The value of delivOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutUserId_Equal(Long delivOutUserId) {
        doSetDelivOutUserId_Equal(delivOutUserId);
    }

    protected void doSetDelivOutUserId_Equal(Long delivOutUserId) {
        regDelivOutUserId(CK_EQ, delivOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param delivOutUserId The value of delivOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutUserId_NotEqual(Long delivOutUserId) {
        doSetDelivOutUserId_NotEqual(delivOutUserId);
    }

    protected void doSetDelivOutUserId_NotEqual(Long delivOutUserId) {
        regDelivOutUserId(CK_NES, delivOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param delivOutUserId The value of delivOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutUserId_GreaterThan(Long delivOutUserId) {
        regDelivOutUserId(CK_GT, delivOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param delivOutUserId The value of delivOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutUserId_LessThan(Long delivOutUserId) {
        regDelivOutUserId(CK_LT, delivOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param delivOutUserId The value of delivOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutUserId_GreaterEqual(Long delivOutUserId) {
        regDelivOutUserId(CK_GE, delivOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param delivOutUserId The value of delivOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutUserId_LessEqual(Long delivOutUserId) {
        regDelivOutUserId(CK_LE, delivOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of delivOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivOutUserId(), "DELIV_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param delivOutUserIdList The collection of delivOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutUserId_InScope(Collection<Long> delivOutUserIdList) {
        doSetDelivOutUserId_InScope(delivOutUserIdList);
    }

    protected void doSetDelivOutUserId_InScope(Collection<Long> delivOutUserIdList) {
        regINS(CK_INS, cTL(delivOutUserIdList), xgetCValueDelivOutUserId(), "DELIV_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param delivOutUserIdList The collection of delivOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivOutUserId_NotInScope(Collection<Long> delivOutUserIdList) {
        doSetDelivOutUserId_NotInScope(delivOutUserIdList);
    }

    protected void doSetDelivOutUserId_NotInScope(Collection<Long> delivOutUserIdList) {
        regINS(CK_NINS, cTL(delivOutUserIdList), xgetCValueDelivOutUserId(), "DELIV_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIV_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my DELIV_OUT_USER_ID, named 'BUserByDelivOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByDelivOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByDelivOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivOutUserId_InScopeRelation_BUserByDelivOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_OUT_USER_ID", "USER_ID", pp, "bUserByDelivOutUserId", false);
    }
    public abstract String keepDelivOutUserId_InScopeRelation_BUserByDelivOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIV_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my DELIV_OUT_USER_ID, named 'BUserByDelivOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByDelivOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByDelivOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivOutUserId_NotInScopeRelation_BUserByDelivOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_OUT_USER_ID", "USER_ID", pp, "bUserByDelivOutUserId", true);
    }
    public abstract String keepDelivOutUserId_NotInScopeRelation_BUserByDelivOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setDelivOutUserId_IsNull() { regDelivOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setDelivOutUserId_IsNotNull() { regDelivOutUserId(CK_ISNN, DOBJ); }

    protected void regDelivOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivOutUserId(), "DELIV_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueDelivOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * @param delivOutDt The value of delivOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutDt_Equal(java.sql.Timestamp delivOutDt) {
        regDelivOutDt(CK_EQ,  delivOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * @param delivOutDt The value of delivOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutDt_GreaterThan(java.sql.Timestamp delivOutDt) {
        regDelivOutDt(CK_GT,  delivOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * @param delivOutDt The value of delivOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutDt_LessThan(java.sql.Timestamp delivOutDt) {
        regDelivOutDt(CK_LT,  delivOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * @param delivOutDt The value of delivOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutDt_GreaterEqual(java.sql.Timestamp delivOutDt) {
        regDelivOutDt(CK_GE,  delivOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * @param delivOutDt The value of delivOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivOutDt_LessEqual(java.sql.Timestamp delivOutDt) {
        regDelivOutDt(CK_LE, delivOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setDelivOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of delivOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of delivOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDelivOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueDelivOutDt(), "DELIV_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of delivOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of delivOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setDelivOutDt_DateFromTo(Date fromDate, Date toDate) {
        setDelivOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     */
    public void setDelivOutDt_IsNull() { regDelivOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     */
    public void setDelivOutDt_IsNotNull() { regDelivOutDt(CK_ISNN, DOBJ); }

    protected void regDelivOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivOutDt(), "DELIV_OUT_DT"); }
    protected abstract ConditionValue xgetCValueDelivOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlg The value of pllOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_Equal(String pllOutFlg) {
        doSetPllOutFlg_Equal(fRES(pllOutFlg));
    }

    protected void doSetPllOutFlg_Equal(String pllOutFlg) {
        regPllOutFlg(CK_EQ, pllOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlg The value of pllOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_NotEqual(String pllOutFlg) {
        doSetPllOutFlg_NotEqual(fRES(pllOutFlg));
    }

    protected void doSetPllOutFlg_NotEqual(String pllOutFlg) {
        regPllOutFlg(CK_NES, pllOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlg The value of pllOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_GreaterThan(String pllOutFlg) {
        regPllOutFlg(CK_GT, fRES(pllOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlg The value of pllOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_LessThan(String pllOutFlg) {
        regPllOutFlg(CK_LT, fRES(pllOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlg The value of pllOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_GreaterEqual(String pllOutFlg) {
        regPllOutFlg(CK_GE, fRES(pllOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlg The value of pllOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_LessEqual(String pllOutFlg) {
        regPllOutFlg(CK_LE, fRES(pllOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlgList The collection of pllOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_InScope(Collection<String> pllOutFlgList) {
        doSetPllOutFlg_InScope(pllOutFlgList);
    }

    protected void doSetPllOutFlg_InScope(Collection<String> pllOutFlgList) {
        regINS(CK_INS, cTL(pllOutFlgList), xgetCValuePllOutFlg(), "PLL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlgList The collection of pllOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_NotInScope(Collection<String> pllOutFlgList) {
        doSetPllOutFlg_NotInScope(pllOutFlgList);
    }

    protected void doSetPllOutFlg_NotInScope(Collection<String> pllOutFlgList) {
        regINS(CK_NINS, cTL(pllOutFlgList), xgetCValuePllOutFlg(), "PLL_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setPllOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pllOutFlg The value of pllOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPllOutFlg_LikeSearch(String pllOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pllOutFlg), xgetCValuePllOutFlg(), "PLL_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlg The value of pllOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPllOutFlg_NotLikeSearch(String pllOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pllOutFlg), xgetCValuePllOutFlg(), "PLL_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @param pllOutFlg The value of pllOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutFlg_PrefixSearch(String pllOutFlg) {
        setPllOutFlg_LikeSearch(pllOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     */
    public void setPllOutFlg_IsNull() { regPllOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     */
    public void setPllOutFlg_IsNullOrEmpty() { regPllOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     */
    public void setPllOutFlg_IsNotNull() { regPllOutFlg(CK_ISNN, DOBJ); }

    protected void regPllOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePllOutFlg(), "PLL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePllOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pllOutUserId The value of pllOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutUserId_Equal(Long pllOutUserId) {
        doSetPllOutUserId_Equal(pllOutUserId);
    }

    protected void doSetPllOutUserId_Equal(Long pllOutUserId) {
        regPllOutUserId(CK_EQ, pllOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pllOutUserId The value of pllOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutUserId_NotEqual(Long pllOutUserId) {
        doSetPllOutUserId_NotEqual(pllOutUserId);
    }

    protected void doSetPllOutUserId_NotEqual(Long pllOutUserId) {
        regPllOutUserId(CK_NES, pllOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pllOutUserId The value of pllOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutUserId_GreaterThan(Long pllOutUserId) {
        regPllOutUserId(CK_GT, pllOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pllOutUserId The value of pllOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutUserId_LessThan(Long pllOutUserId) {
        regPllOutUserId(CK_LT, pllOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pllOutUserId The value of pllOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutUserId_GreaterEqual(Long pllOutUserId) {
        regPllOutUserId(CK_GE, pllOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pllOutUserId The value of pllOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutUserId_LessEqual(Long pllOutUserId) {
        regPllOutUserId(CK_LE, pllOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of pllOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pllOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPllOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePllOutUserId(), "PLL_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pllOutUserIdList The collection of pllOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutUserId_InScope(Collection<Long> pllOutUserIdList) {
        doSetPllOutUserId_InScope(pllOutUserIdList);
    }

    protected void doSetPllOutUserId_InScope(Collection<Long> pllOutUserIdList) {
        regINS(CK_INS, cTL(pllOutUserIdList), xgetCValuePllOutUserId(), "PLL_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param pllOutUserIdList The collection of pllOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPllOutUserId_NotInScope(Collection<Long> pllOutUserIdList) {
        doSetPllOutUserId_NotInScope(pllOutUserIdList);
    }

    protected void doSetPllOutUserId_NotInScope(Collection<Long> pllOutUserIdList) {
        regINS(CK_NINS, cTL(pllOutUserIdList), xgetCValuePllOutUserId(), "PLL_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PLL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PLL_OUT_USER_ID, named 'BUserByPllOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPllOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByPllOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPllOutUserId_InScopeRelation_BUserByPllOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PLL_OUT_USER_ID", "USER_ID", pp, "bUserByPllOutUserId", false);
    }
    public abstract String keepPllOutUserId_InScopeRelation_BUserByPllOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PLL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my PLL_OUT_USER_ID, named 'BUserByPllOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPllOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByPllOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPllOutUserId_NotInScopeRelation_BUserByPllOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PLL_OUT_USER_ID", "USER_ID", pp, "bUserByPllOutUserId", true);
    }
    public abstract String keepPllOutUserId_NotInScopeRelation_BUserByPllOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPllOutUserId_IsNull() { regPllOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setPllOutUserId_IsNotNull() { regPllOutUserId(CK_ISNN, DOBJ); }

    protected void regPllOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePllOutUserId(), "PLL_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValuePllOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * @param pllOutDt The value of pllOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutDt_Equal(java.sql.Timestamp pllOutDt) {
        regPllOutDt(CK_EQ,  pllOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * @param pllOutDt The value of pllOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutDt_GreaterThan(java.sql.Timestamp pllOutDt) {
        regPllOutDt(CK_GT,  pllOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * @param pllOutDt The value of pllOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutDt_LessThan(java.sql.Timestamp pllOutDt) {
        regPllOutDt(CK_LT,  pllOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * @param pllOutDt The value of pllOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutDt_GreaterEqual(java.sql.Timestamp pllOutDt) {
        regPllOutDt(CK_GE,  pllOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * @param pllOutDt The value of pllOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPllOutDt_LessEqual(java.sql.Timestamp pllOutDt) {
        regPllOutDt(CK_LE, pllOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setPllOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pllOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pllOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPllOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePllOutDt(), "PLL_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pllOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of pllOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPllOutDt_DateFromTo(Date fromDate, Date toDate) {
        setPllOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     */
    public void setPllOutDt_IsNull() { regPllOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     */
    public void setPllOutDt_IsNotNull() { regPllOutDt(CK_ISNN, DOBJ); }

    protected void regPllOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePllOutDt(), "PLL_OUT_DT"); }
    protected abstract ConditionValue xgetCValuePllOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlg The value of nizoroeOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_Equal(String nizoroeOutFlg) {
        doSetNizoroeOutFlg_Equal(fRES(nizoroeOutFlg));
    }

    protected void doSetNizoroeOutFlg_Equal(String nizoroeOutFlg) {
        regNizoroeOutFlg(CK_EQ, nizoroeOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlg The value of nizoroeOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_NotEqual(String nizoroeOutFlg) {
        doSetNizoroeOutFlg_NotEqual(fRES(nizoroeOutFlg));
    }

    protected void doSetNizoroeOutFlg_NotEqual(String nizoroeOutFlg) {
        regNizoroeOutFlg(CK_NES, nizoroeOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlg The value of nizoroeOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_GreaterThan(String nizoroeOutFlg) {
        regNizoroeOutFlg(CK_GT, fRES(nizoroeOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlg The value of nizoroeOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_LessThan(String nizoroeOutFlg) {
        regNizoroeOutFlg(CK_LT, fRES(nizoroeOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlg The value of nizoroeOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_GreaterEqual(String nizoroeOutFlg) {
        regNizoroeOutFlg(CK_GE, fRES(nizoroeOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlg The value of nizoroeOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_LessEqual(String nizoroeOutFlg) {
        regNizoroeOutFlg(CK_LE, fRES(nizoroeOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlgList The collection of nizoroeOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_InScope(Collection<String> nizoroeOutFlgList) {
        doSetNizoroeOutFlg_InScope(nizoroeOutFlgList);
    }

    protected void doSetNizoroeOutFlg_InScope(Collection<String> nizoroeOutFlgList) {
        regINS(CK_INS, cTL(nizoroeOutFlgList), xgetCValueNizoroeOutFlg(), "NIZOROE_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlgList The collection of nizoroeOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_NotInScope(Collection<String> nizoroeOutFlgList) {
        doSetNizoroeOutFlg_NotInScope(nizoroeOutFlgList);
    }

    protected void doSetNizoroeOutFlg_NotInScope(Collection<String> nizoroeOutFlgList) {
        regINS(CK_NINS, cTL(nizoroeOutFlgList), xgetCValueNizoroeOutFlg(), "NIZOROE_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setNizoroeOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeOutFlg The value of nizoroeOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeOutFlg_LikeSearch(String nizoroeOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeOutFlg), xgetCValueNizoroeOutFlg(), "NIZOROE_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlg The value of nizoroeOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeOutFlg_NotLikeSearch(String nizoroeOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeOutFlg), xgetCValueNizoroeOutFlg(), "NIZOROE_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @param nizoroeOutFlg The value of nizoroeOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutFlg_PrefixSearch(String nizoroeOutFlg) {
        setNizoroeOutFlg_LikeSearch(nizoroeOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     */
    public void setNizoroeOutFlg_IsNull() { regNizoroeOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     */
    public void setNizoroeOutFlg_IsNullOrEmpty() { regNizoroeOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     */
    public void setNizoroeOutFlg_IsNotNull() { regNizoroeOutFlg(CK_ISNN, DOBJ); }

    protected void regNizoroeOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeOutFlg(), "NIZOROE_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueNizoroeOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param nizoroeOutUserId The value of nizoroeOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutUserId_Equal(Long nizoroeOutUserId) {
        doSetNizoroeOutUserId_Equal(nizoroeOutUserId);
    }

    protected void doSetNizoroeOutUserId_Equal(Long nizoroeOutUserId) {
        regNizoroeOutUserId(CK_EQ, nizoroeOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param nizoroeOutUserId The value of nizoroeOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutUserId_NotEqual(Long nizoroeOutUserId) {
        doSetNizoroeOutUserId_NotEqual(nizoroeOutUserId);
    }

    protected void doSetNizoroeOutUserId_NotEqual(Long nizoroeOutUserId) {
        regNizoroeOutUserId(CK_NES, nizoroeOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param nizoroeOutUserId The value of nizoroeOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutUserId_GreaterThan(Long nizoroeOutUserId) {
        regNizoroeOutUserId(CK_GT, nizoroeOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param nizoroeOutUserId The value of nizoroeOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutUserId_LessThan(Long nizoroeOutUserId) {
        regNizoroeOutUserId(CK_LT, nizoroeOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param nizoroeOutUserId The value of nizoroeOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutUserId_GreaterEqual(Long nizoroeOutUserId) {
        regNizoroeOutUserId(CK_GE, nizoroeOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param nizoroeOutUserId The value of nizoroeOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutUserId_LessEqual(Long nizoroeOutUserId) {
        regNizoroeOutUserId(CK_LE, nizoroeOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of nizoroeOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nizoroeOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNizoroeOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNizoroeOutUserId(), "NIZOROE_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param nizoroeOutUserIdList The collection of nizoroeOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutUserId_InScope(Collection<Long> nizoroeOutUserIdList) {
        doSetNizoroeOutUserId_InScope(nizoroeOutUserIdList);
    }

    protected void doSetNizoroeOutUserId_InScope(Collection<Long> nizoroeOutUserIdList) {
        regINS(CK_INS, cTL(nizoroeOutUserIdList), xgetCValueNizoroeOutUserId(), "NIZOROE_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param nizoroeOutUserIdList The collection of nizoroeOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeOutUserId_NotInScope(Collection<Long> nizoroeOutUserIdList) {
        doSetNizoroeOutUserId_NotInScope(nizoroeOutUserIdList);
    }

    protected void doSetNizoroeOutUserId_NotInScope(Collection<Long> nizoroeOutUserIdList) {
        regINS(CK_NINS, cTL(nizoroeOutUserIdList), xgetCValueNizoroeOutUserId(), "NIZOROE_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NIZOROE_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my NIZOROE_OUT_USER_ID, named 'BUserByNizoroeOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByNizoroeOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByNizoroeOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepNizoroeOutUserId_InScopeRelation_BUserByNizoroeOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "NIZOROE_OUT_USER_ID", "USER_ID", pp, "bUserByNizoroeOutUserId", false);
    }
    public abstract String keepNizoroeOutUserId_InScopeRelation_BUserByNizoroeOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NIZOROE_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my NIZOROE_OUT_USER_ID, named 'BUserByNizoroeOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByNizoroeOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByNizoroeOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepNizoroeOutUserId_NotInScopeRelation_BUserByNizoroeOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "NIZOROE_OUT_USER_ID", "USER_ID", pp, "bUserByNizoroeOutUserId", true);
    }
    public abstract String keepNizoroeOutUserId_NotInScopeRelation_BUserByNizoroeOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setNizoroeOutUserId_IsNull() { regNizoroeOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setNizoroeOutUserId_IsNotNull() { regNizoroeOutUserId(CK_ISNN, DOBJ); }

    protected void regNizoroeOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeOutUserId(), "NIZOROE_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueNizoroeOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * @param nizoroeOutDt The value of nizoroeOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutDt_Equal(java.sql.Timestamp nizoroeOutDt) {
        regNizoroeOutDt(CK_EQ,  nizoroeOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * @param nizoroeOutDt The value of nizoroeOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutDt_GreaterThan(java.sql.Timestamp nizoroeOutDt) {
        regNizoroeOutDt(CK_GT,  nizoroeOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * @param nizoroeOutDt The value of nizoroeOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutDt_LessThan(java.sql.Timestamp nizoroeOutDt) {
        regNizoroeOutDt(CK_LT,  nizoroeOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * @param nizoroeOutDt The value of nizoroeOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutDt_GreaterEqual(java.sql.Timestamp nizoroeOutDt) {
        regNizoroeOutDt(CK_GE,  nizoroeOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * @param nizoroeOutDt The value of nizoroeOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeOutDt_LessEqual(java.sql.Timestamp nizoroeOutDt) {
        regNizoroeOutDt(CK_LE, nizoroeOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setNizoroeOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nizoroeOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nizoroeOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setNizoroeOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueNizoroeOutDt(), "NIZOROE_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of nizoroeOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of nizoroeOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setNizoroeOutDt_DateFromTo(Date fromDate, Date toDate) {
        setNizoroeOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     */
    public void setNizoroeOutDt_IsNull() { regNizoroeOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     */
    public void setNizoroeOutDt_IsNotNull() { regNizoroeOutDt(CK_ISNN, DOBJ); }

    protected void regNizoroeOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeOutDt(), "NIZOROE_OUT_DT"); }
    protected abstract ConditionValue xgetCValueNizoroeOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_Equal(String indvSupplyOutFlg) {
        doSetIndvSupplyOutFlg_Equal(fRES(indvSupplyOutFlg));
    }

    protected void doSetIndvSupplyOutFlg_Equal(String indvSupplyOutFlg) {
        regIndvSupplyOutFlg(CK_EQ, indvSupplyOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_NotEqual(String indvSupplyOutFlg) {
        doSetIndvSupplyOutFlg_NotEqual(fRES(indvSupplyOutFlg));
    }

    protected void doSetIndvSupplyOutFlg_NotEqual(String indvSupplyOutFlg) {
        regIndvSupplyOutFlg(CK_NES, indvSupplyOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_GreaterThan(String indvSupplyOutFlg) {
        regIndvSupplyOutFlg(CK_GT, fRES(indvSupplyOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_LessThan(String indvSupplyOutFlg) {
        regIndvSupplyOutFlg(CK_LT, fRES(indvSupplyOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_GreaterEqual(String indvSupplyOutFlg) {
        regIndvSupplyOutFlg(CK_GE, fRES(indvSupplyOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_LessEqual(String indvSupplyOutFlg) {
        regIndvSupplyOutFlg(CK_LE, fRES(indvSupplyOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlgList The collection of indvSupplyOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_InScope(Collection<String> indvSupplyOutFlgList) {
        doSetIndvSupplyOutFlg_InScope(indvSupplyOutFlgList);
    }

    protected void doSetIndvSupplyOutFlg_InScope(Collection<String> indvSupplyOutFlgList) {
        regINS(CK_INS, cTL(indvSupplyOutFlgList), xgetCValueIndvSupplyOutFlg(), "INDV_SUPPLY_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlgList The collection of indvSupplyOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_NotInScope(Collection<String> indvSupplyOutFlgList) {
        doSetIndvSupplyOutFlg_NotInScope(indvSupplyOutFlgList);
    }

    protected void doSetIndvSupplyOutFlg_NotInScope(Collection<String> indvSupplyOutFlgList) {
        regINS(CK_NINS, cTL(indvSupplyOutFlgList), xgetCValueIndvSupplyOutFlg(), "INDV_SUPPLY_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setIndvSupplyOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIndvSupplyOutFlg_LikeSearch(String indvSupplyOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(indvSupplyOutFlg), xgetCValueIndvSupplyOutFlg(), "INDV_SUPPLY_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIndvSupplyOutFlg_NotLikeSearch(String indvSupplyOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(indvSupplyOutFlg), xgetCValueIndvSupplyOutFlg(), "INDV_SUPPLY_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @param indvSupplyOutFlg The value of indvSupplyOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutFlg_PrefixSearch(String indvSupplyOutFlg) {
        setIndvSupplyOutFlg_LikeSearch(indvSupplyOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     */
    public void setIndvSupplyOutFlg_IsNull() { regIndvSupplyOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     */
    public void setIndvSupplyOutFlg_IsNullOrEmpty() { regIndvSupplyOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     */
    public void setIndvSupplyOutFlg_IsNotNull() { regIndvSupplyOutFlg(CK_ISNN, DOBJ); }

    protected void regIndvSupplyOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndvSupplyOutFlg(), "INDV_SUPPLY_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueIndvSupplyOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvSupplyOutUserId The value of indvSupplyOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutUserId_Equal(Long indvSupplyOutUserId) {
        doSetIndvSupplyOutUserId_Equal(indvSupplyOutUserId);
    }

    protected void doSetIndvSupplyOutUserId_Equal(Long indvSupplyOutUserId) {
        regIndvSupplyOutUserId(CK_EQ, indvSupplyOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvSupplyOutUserId The value of indvSupplyOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutUserId_NotEqual(Long indvSupplyOutUserId) {
        doSetIndvSupplyOutUserId_NotEqual(indvSupplyOutUserId);
    }

    protected void doSetIndvSupplyOutUserId_NotEqual(Long indvSupplyOutUserId) {
        regIndvSupplyOutUserId(CK_NES, indvSupplyOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvSupplyOutUserId The value of indvSupplyOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutUserId_GreaterThan(Long indvSupplyOutUserId) {
        regIndvSupplyOutUserId(CK_GT, indvSupplyOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvSupplyOutUserId The value of indvSupplyOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutUserId_LessThan(Long indvSupplyOutUserId) {
        regIndvSupplyOutUserId(CK_LT, indvSupplyOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvSupplyOutUserId The value of indvSupplyOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutUserId_GreaterEqual(Long indvSupplyOutUserId) {
        regIndvSupplyOutUserId(CK_GE, indvSupplyOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvSupplyOutUserId The value of indvSupplyOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutUserId_LessEqual(Long indvSupplyOutUserId) {
        regIndvSupplyOutUserId(CK_LE, indvSupplyOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of indvSupplyOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indvSupplyOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIndvSupplyOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIndvSupplyOutUserId(), "INDV_SUPPLY_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvSupplyOutUserIdList The collection of indvSupplyOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutUserId_InScope(Collection<Long> indvSupplyOutUserIdList) {
        doSetIndvSupplyOutUserId_InScope(indvSupplyOutUserIdList);
    }

    protected void doSetIndvSupplyOutUserId_InScope(Collection<Long> indvSupplyOutUserIdList) {
        regINS(CK_INS, cTL(indvSupplyOutUserIdList), xgetCValueIndvSupplyOutUserId(), "INDV_SUPPLY_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvSupplyOutUserIdList The collection of indvSupplyOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvSupplyOutUserId_NotInScope(Collection<Long> indvSupplyOutUserIdList) {
        doSetIndvSupplyOutUserId_NotInScope(indvSupplyOutUserIdList);
    }

    protected void doSetIndvSupplyOutUserId_NotInScope(Collection<Long> indvSupplyOutUserIdList) {
        regINS(CK_NINS, cTL(indvSupplyOutUserIdList), xgetCValueIndvSupplyOutUserId(), "INDV_SUPPLY_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INDV_SUPPLY_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INDV_SUPPLY_OUT_USER_ID, named 'BUserByIndvSupplyOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByIndvSupplyOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByIndvSupplyOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepIndvSupplyOutUserId_InScopeRelation_BUserByIndvSupplyOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INDV_SUPPLY_OUT_USER_ID", "USER_ID", pp, "bUserByIndvSupplyOutUserId", false);
    }
    public abstract String keepIndvSupplyOutUserId_InScopeRelation_BUserByIndvSupplyOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INDV_SUPPLY_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INDV_SUPPLY_OUT_USER_ID, named 'BUserByIndvSupplyOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByIndvSupplyOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByIndvSupplyOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepIndvSupplyOutUserId_NotInScopeRelation_BUserByIndvSupplyOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INDV_SUPPLY_OUT_USER_ID", "USER_ID", pp, "bUserByIndvSupplyOutUserId", true);
    }
    public abstract String keepIndvSupplyOutUserId_NotInScopeRelation_BUserByIndvSupplyOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setIndvSupplyOutUserId_IsNull() { regIndvSupplyOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setIndvSupplyOutUserId_IsNotNull() { regIndvSupplyOutUserId(CK_ISNN, DOBJ); }

    protected void regIndvSupplyOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndvSupplyOutUserId(), "INDV_SUPPLY_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueIndvSupplyOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * @param indvSupplyOutDt The value of indvSupplyOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutDt_Equal(java.sql.Timestamp indvSupplyOutDt) {
        regIndvSupplyOutDt(CK_EQ,  indvSupplyOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * @param indvSupplyOutDt The value of indvSupplyOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutDt_GreaterThan(java.sql.Timestamp indvSupplyOutDt) {
        regIndvSupplyOutDt(CK_GT,  indvSupplyOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * @param indvSupplyOutDt The value of indvSupplyOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutDt_LessThan(java.sql.Timestamp indvSupplyOutDt) {
        regIndvSupplyOutDt(CK_LT,  indvSupplyOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * @param indvSupplyOutDt The value of indvSupplyOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutDt_GreaterEqual(java.sql.Timestamp indvSupplyOutDt) {
        regIndvSupplyOutDt(CK_GE,  indvSupplyOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * @param indvSupplyOutDt The value of indvSupplyOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvSupplyOutDt_LessEqual(java.sql.Timestamp indvSupplyOutDt) {
        regIndvSupplyOutDt(CK_LE, indvSupplyOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setIndvSupplyOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indvSupplyOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indvSupplyOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setIndvSupplyOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueIndvSupplyOutDt(), "INDV_SUPPLY_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of indvSupplyOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of indvSupplyOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setIndvSupplyOutDt_DateFromTo(Date fromDate, Date toDate) {
        setIndvSupplyOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     */
    public void setIndvSupplyOutDt_IsNull() { regIndvSupplyOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     */
    public void setIndvSupplyOutDt_IsNotNull() { regIndvSupplyOutDt(CK_ISNN, DOBJ); }

    protected void regIndvSupplyOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndvSupplyOutDt(), "INDV_SUPPLY_OUT_DT"); }
    protected abstract ConditionValue xgetCValueIndvSupplyOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlg The value of indvLabelOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_Equal(String indvLabelOutFlg) {
        doSetIndvLabelOutFlg_Equal(fRES(indvLabelOutFlg));
    }

    protected void doSetIndvLabelOutFlg_Equal(String indvLabelOutFlg) {
        regIndvLabelOutFlg(CK_EQ, indvLabelOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlg The value of indvLabelOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_NotEqual(String indvLabelOutFlg) {
        doSetIndvLabelOutFlg_NotEqual(fRES(indvLabelOutFlg));
    }

    protected void doSetIndvLabelOutFlg_NotEqual(String indvLabelOutFlg) {
        regIndvLabelOutFlg(CK_NES, indvLabelOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlg The value of indvLabelOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_GreaterThan(String indvLabelOutFlg) {
        regIndvLabelOutFlg(CK_GT, fRES(indvLabelOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlg The value of indvLabelOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_LessThan(String indvLabelOutFlg) {
        regIndvLabelOutFlg(CK_LT, fRES(indvLabelOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlg The value of indvLabelOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_GreaterEqual(String indvLabelOutFlg) {
        regIndvLabelOutFlg(CK_GE, fRES(indvLabelOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlg The value of indvLabelOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_LessEqual(String indvLabelOutFlg) {
        regIndvLabelOutFlg(CK_LE, fRES(indvLabelOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlgList The collection of indvLabelOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_InScope(Collection<String> indvLabelOutFlgList) {
        doSetIndvLabelOutFlg_InScope(indvLabelOutFlgList);
    }

    protected void doSetIndvLabelOutFlg_InScope(Collection<String> indvLabelOutFlgList) {
        regINS(CK_INS, cTL(indvLabelOutFlgList), xgetCValueIndvLabelOutFlg(), "INDV_LABEL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlgList The collection of indvLabelOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_NotInScope(Collection<String> indvLabelOutFlgList) {
        doSetIndvLabelOutFlg_NotInScope(indvLabelOutFlgList);
    }

    protected void doSetIndvLabelOutFlg_NotInScope(Collection<String> indvLabelOutFlgList) {
        regINS(CK_NINS, cTL(indvLabelOutFlgList), xgetCValueIndvLabelOutFlg(), "INDV_LABEL_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setIndvLabelOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param indvLabelOutFlg The value of indvLabelOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIndvLabelOutFlg_LikeSearch(String indvLabelOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(indvLabelOutFlg), xgetCValueIndvLabelOutFlg(), "INDV_LABEL_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlg The value of indvLabelOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIndvLabelOutFlg_NotLikeSearch(String indvLabelOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(indvLabelOutFlg), xgetCValueIndvLabelOutFlg(), "INDV_LABEL_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @param indvLabelOutFlg The value of indvLabelOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutFlg_PrefixSearch(String indvLabelOutFlg) {
        setIndvLabelOutFlg_LikeSearch(indvLabelOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     */
    public void setIndvLabelOutFlg_IsNull() { regIndvLabelOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     */
    public void setIndvLabelOutFlg_IsNullOrEmpty() { regIndvLabelOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     */
    public void setIndvLabelOutFlg_IsNotNull() { regIndvLabelOutFlg(CK_ISNN, DOBJ); }

    protected void regIndvLabelOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndvLabelOutFlg(), "INDV_LABEL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueIndvLabelOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvLabelOutUserId The value of indvLabelOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutUserId_Equal(Long indvLabelOutUserId) {
        doSetIndvLabelOutUserId_Equal(indvLabelOutUserId);
    }

    protected void doSetIndvLabelOutUserId_Equal(Long indvLabelOutUserId) {
        regIndvLabelOutUserId(CK_EQ, indvLabelOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvLabelOutUserId The value of indvLabelOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutUserId_NotEqual(Long indvLabelOutUserId) {
        doSetIndvLabelOutUserId_NotEqual(indvLabelOutUserId);
    }

    protected void doSetIndvLabelOutUserId_NotEqual(Long indvLabelOutUserId) {
        regIndvLabelOutUserId(CK_NES, indvLabelOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvLabelOutUserId The value of indvLabelOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutUserId_GreaterThan(Long indvLabelOutUserId) {
        regIndvLabelOutUserId(CK_GT, indvLabelOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvLabelOutUserId The value of indvLabelOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutUserId_LessThan(Long indvLabelOutUserId) {
        regIndvLabelOutUserId(CK_LT, indvLabelOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvLabelOutUserId The value of indvLabelOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutUserId_GreaterEqual(Long indvLabelOutUserId) {
        regIndvLabelOutUserId(CK_GE, indvLabelOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvLabelOutUserId The value of indvLabelOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutUserId_LessEqual(Long indvLabelOutUserId) {
        regIndvLabelOutUserId(CK_LE, indvLabelOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of indvLabelOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of indvLabelOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIndvLabelOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIndvLabelOutUserId(), "INDV_LABEL_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvLabelOutUserIdList The collection of indvLabelOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutUserId_InScope(Collection<Long> indvLabelOutUserIdList) {
        doSetIndvLabelOutUserId_InScope(indvLabelOutUserIdList);
    }

    protected void doSetIndvLabelOutUserId_InScope(Collection<Long> indvLabelOutUserIdList) {
        regINS(CK_INS, cTL(indvLabelOutUserIdList), xgetCValueIndvLabelOutUserId(), "INDV_LABEL_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param indvLabelOutUserIdList The collection of indvLabelOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelOutUserId_NotInScope(Collection<Long> indvLabelOutUserIdList) {
        doSetIndvLabelOutUserId_NotInScope(indvLabelOutUserIdList);
    }

    protected void doSetIndvLabelOutUserId_NotInScope(Collection<Long> indvLabelOutUserIdList) {
        regINS(CK_NINS, cTL(indvLabelOutUserIdList), xgetCValueIndvLabelOutUserId(), "INDV_LABEL_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INDV_LABEL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INDV_LABEL_OUT_USER_ID, named 'BUserByIndvLabelOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByIndvLabelOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByIndvLabelOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepIndvLabelOutUserId_InScopeRelation_BUserByIndvLabelOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INDV_LABEL_OUT_USER_ID", "USER_ID", pp, "bUserByIndvLabelOutUserId", false);
    }
    public abstract String keepIndvLabelOutUserId_InScopeRelation_BUserByIndvLabelOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INDV_LABEL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INDV_LABEL_OUT_USER_ID, named 'BUserByIndvLabelOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByIndvLabelOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByIndvLabelOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepIndvLabelOutUserId_NotInScopeRelation_BUserByIndvLabelOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INDV_LABEL_OUT_USER_ID", "USER_ID", pp, "bUserByIndvLabelOutUserId", true);
    }
    public abstract String keepIndvLabelOutUserId_NotInScopeRelation_BUserByIndvLabelOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setIndvLabelOutUserId_IsNull() { regIndvLabelOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setIndvLabelOutUserId_IsNotNull() { regIndvLabelOutUserId(CK_ISNN, DOBJ); }

    protected void regIndvLabelOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndvLabelOutUserId(), "INDV_LABEL_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueIndvLabelOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * @param indvLabelOutDt The value of indvLabelOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutDt_Equal(java.sql.Timestamp indvLabelOutDt) {
        regIndvLabelOutDt(CK_EQ,  indvLabelOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * @param indvLabelOutDt The value of indvLabelOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutDt_GreaterThan(java.sql.Timestamp indvLabelOutDt) {
        regIndvLabelOutDt(CK_GT,  indvLabelOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * @param indvLabelOutDt The value of indvLabelOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutDt_LessThan(java.sql.Timestamp indvLabelOutDt) {
        regIndvLabelOutDt(CK_LT,  indvLabelOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * @param indvLabelOutDt The value of indvLabelOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutDt_GreaterEqual(java.sql.Timestamp indvLabelOutDt) {
        regIndvLabelOutDt(CK_GE,  indvLabelOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * @param indvLabelOutDt The value of indvLabelOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIndvLabelOutDt_LessEqual(java.sql.Timestamp indvLabelOutDt) {
        regIndvLabelOutDt(CK_LE, indvLabelOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setIndvLabelOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indvLabelOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of indvLabelOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setIndvLabelOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueIndvLabelOutDt(), "INDV_LABEL_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of indvLabelOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of indvLabelOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setIndvLabelOutDt_DateFromTo(Date fromDate, Date toDate) {
        setIndvLabelOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     */
    public void setIndvLabelOutDt_IsNull() { regIndvLabelOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     */
    public void setIndvLabelOutDt_IsNotNull() { regIndvLabelOutDt(CK_ISNN, DOBJ); }

    protected void regIndvLabelOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndvLabelOutDt(), "INDV_LABEL_OUT_DT"); }
    protected abstract ConditionValue xgetCValueIndvLabelOutDt();

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
    public HpSLCFunction<TPickingRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPickingRCB.class);
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
    public HpSLCFunction<TPickingRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPickingRCB.class);
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
    public HpSLCFunction<TPickingRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPickingRCB.class);
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
    public HpSLCFunction<TPickingRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPickingRCB.class);
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
    public HpSLCFunction<TPickingRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPickingRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPickingRCB&gt;() {
     *     public void query(TPickingRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPickingRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPickingRCQ sq);

    protected TPickingRCB xcreateScalarConditionCB() {
        TPickingRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPickingRCB xcreateScalarConditionPartitionByCB() {
        TPickingRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPickingRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPickingRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPickingRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPickingRCQ sq);

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
    protected TPickingRCB newMyCB() {
        return new TPickingRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPickingRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
