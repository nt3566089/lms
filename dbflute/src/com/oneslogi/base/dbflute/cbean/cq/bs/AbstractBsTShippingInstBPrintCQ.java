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
 * The abstract condition-query of t_shipping_inst_b_print.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTShippingInstBPrintCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTShippingInstBPrintCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_shipping_inst_b_print";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param shippingInstBPrintId The value of shippingInstBPrintId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBPrintId_Equal(Long shippingInstBPrintId) {
        doSetShippingInstBPrintId_Equal(shippingInstBPrintId);
    }

    protected void doSetShippingInstBPrintId_Equal(Long shippingInstBPrintId) {
        regShippingInstBPrintId(CK_EQ, shippingInstBPrintId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param shippingInstBPrintId The value of shippingInstBPrintId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBPrintId_NotEqual(Long shippingInstBPrintId) {
        doSetShippingInstBPrintId_NotEqual(shippingInstBPrintId);
    }

    protected void doSetShippingInstBPrintId_NotEqual(Long shippingInstBPrintId) {
        regShippingInstBPrintId(CK_NES, shippingInstBPrintId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param shippingInstBPrintId The value of shippingInstBPrintId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBPrintId_GreaterThan(Long shippingInstBPrintId) {
        regShippingInstBPrintId(CK_GT, shippingInstBPrintId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param shippingInstBPrintId The value of shippingInstBPrintId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBPrintId_LessThan(Long shippingInstBPrintId) {
        regShippingInstBPrintId(CK_LT, shippingInstBPrintId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param shippingInstBPrintId The value of shippingInstBPrintId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBPrintId_GreaterEqual(Long shippingInstBPrintId) {
        regShippingInstBPrintId(CK_GE, shippingInstBPrintId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param shippingInstBPrintId The value of shippingInstBPrintId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBPrintId_LessEqual(Long shippingInstBPrintId) {
        regShippingInstBPrintId(CK_LE, shippingInstBPrintId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingInstBPrintId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstBPrintId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstBPrintId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstBPrintId(), "SHIPPING_INST_B_PRINT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param shippingInstBPrintIdList The collection of shippingInstBPrintId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBPrintId_InScope(Collection<Long> shippingInstBPrintIdList) {
        doSetShippingInstBPrintId_InScope(shippingInstBPrintIdList);
    }

    protected void doSetShippingInstBPrintId_InScope(Collection<Long> shippingInstBPrintIdList) {
        regINS(CK_INS, cTL(shippingInstBPrintIdList), xgetCValueShippingInstBPrintId(), "SHIPPING_INST_B_PRINT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @param shippingInstBPrintIdList The collection of shippingInstBPrintId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBPrintId_NotInScope(Collection<Long> shippingInstBPrintIdList) {
        doSetShippingInstBPrintId_NotInScope(shippingInstBPrintIdList);
    }

    protected void doSetShippingInstBPrintId_NotInScope(Collection<Long> shippingInstBPrintIdList) {
        regINS(CK_NINS, cTL(shippingInstBPrintIdList), xgetCValueShippingInstBPrintId(), "SHIPPING_INST_B_PRINT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     */
    public void setShippingInstBPrintId_IsNull() { regShippingInstBPrintId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     */
    public void setShippingInstBPrintId_IsNotNull() { regShippingInstBPrintId(CK_ISNN, DOBJ); }

    protected void regShippingInstBPrintId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstBPrintId(), "SHIPPING_INST_B_PRINT_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstBPrintId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
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
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
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
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterThan(Long shippingInstBId) {
        regShippingInstBId(CK_GT, shippingInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessThan(Long shippingInstBId) {
        regShippingInstBId(CK_LT, shippingInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterEqual(Long shippingInstBId) {
        regShippingInstBId(CK_GE, shippingInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessEqual(Long shippingInstBId) {
        regShippingInstBId(CK_LE, shippingInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param minNumber The min number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
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
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBIdList The collection of shippingInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_NotInScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_NINS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_INST_B_ID from t_shipping_inst_b where ...)} <br />
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @param subCBLambda The callback for sub-query of TShippingInstB for 'in-scope'. (NotNull)
     */
    public void inScopeTShippingInstB(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstBId_InScopeRelation_TShippingInstB(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstB", false);
    }
    public abstract String keepShippingInstBId_InScopeRelation_TShippingInstB(TShippingInstBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_INST_B_ID from t_shipping_inst_b where ...)} <br />
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @param subCBLambda The callback for sub-query of TShippingInstB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTShippingInstB(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstBId_NotInScopeRelation_TShippingInstB(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstB", true);
    }
    public abstract String keepShippingInstBId_NotInScopeRelation_TShippingInstB(TShippingInstBCQ sq);

    protected void regShippingInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_Equal(String hinmokuCd) {
        doSetHinmokuCd_Equal(fRES(hinmokuCd));
    }

    protected void doSetHinmokuCd_Equal(String hinmokuCd) {
        regHinmokuCd(CK_EQ, hinmokuCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_NotEqual(String hinmokuCd) {
        doSetHinmokuCd_NotEqual(fRES(hinmokuCd));
    }

    protected void doSetHinmokuCd_NotEqual(String hinmokuCd) {
        regHinmokuCd(CK_NES, hinmokuCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_GreaterThan(String hinmokuCd) {
        regHinmokuCd(CK_GT, fRES(hinmokuCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_LessThan(String hinmokuCd) {
        regHinmokuCd(CK_LT, fRES(hinmokuCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_GreaterEqual(String hinmokuCd) {
        regHinmokuCd(CK_GE, fRES(hinmokuCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_LessEqual(String hinmokuCd) {
        regHinmokuCd(CK_LE, fRES(hinmokuCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCdList The collection of hinmokuCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_InScope(Collection<String> hinmokuCdList) {
        doSetHinmokuCd_InScope(hinmokuCdList);
    }

    protected void doSetHinmokuCd_InScope(Collection<String> hinmokuCdList) {
        regINS(CK_INS, cTL(hinmokuCdList), xgetCValueHinmokuCd(), "HINMOKU_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCdList The collection of hinmokuCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_NotInScope(Collection<String> hinmokuCdList) {
        doSetHinmokuCd_NotInScope(hinmokuCdList);
    }

    protected void doSetHinmokuCd_NotInScope(Collection<String> hinmokuCdList) {
        regINS(CK_NINS, cTL(hinmokuCdList), xgetCValueHinmokuCd(), "HINMOKU_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setHinmokuCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuCd The value of hinmokuCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuCd_LikeSearch(String hinmokuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuCd), xgetCValueHinmokuCd(), "HINMOKU_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuCd_NotLikeSearch(String hinmokuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuCd), xgetCValueHinmokuCd(), "HINMOKU_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @param hinmokuCd The value of hinmokuCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_PrefixSearch(String hinmokuCd) {
        setHinmokuCd_LikeSearch(hinmokuCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     */
    public void setHinmokuCd_IsNull() { regHinmokuCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     */
    public void setHinmokuCd_IsNullOrEmpty() { regHinmokuCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     */
    public void setHinmokuCd_IsNotNull() { regHinmokuCd(CK_ISNN, DOBJ); }

    protected void regHinmokuCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuCd(), "HINMOKU_CD"); }
    protected abstract ConditionValue xgetCValueHinmokuCd();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param salesOrderNum The value of salesOrderNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_Equal(java.math.BigDecimal salesOrderNum) {
        doSetSalesOrderNum_Equal(salesOrderNum);
    }

    protected void doSetSalesOrderNum_Equal(java.math.BigDecimal salesOrderNum) {
        regSalesOrderNum(CK_EQ, salesOrderNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param salesOrderNum The value of salesOrderNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_NotEqual(java.math.BigDecimal salesOrderNum) {
        doSetSalesOrderNum_NotEqual(salesOrderNum);
    }

    protected void doSetSalesOrderNum_NotEqual(java.math.BigDecimal salesOrderNum) {
        regSalesOrderNum(CK_NES, salesOrderNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param salesOrderNum The value of salesOrderNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_GreaterThan(java.math.BigDecimal salesOrderNum) {
        regSalesOrderNum(CK_GT, salesOrderNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param salesOrderNum The value of salesOrderNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_LessThan(java.math.BigDecimal salesOrderNum) {
        regSalesOrderNum(CK_LT, salesOrderNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param salesOrderNum The value of salesOrderNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_GreaterEqual(java.math.BigDecimal salesOrderNum) {
        regSalesOrderNum(CK_GE, salesOrderNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param salesOrderNum The value of salesOrderNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrderNum_LessEqual(java.math.BigDecimal salesOrderNum) {
        regSalesOrderNum(CK_LE, salesOrderNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of salesOrderNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of salesOrderNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSalesOrderNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesOrderNum(), "SALES_ORDER_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param salesOrderNumList The collection of salesOrderNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNum_InScope(Collection<java.math.BigDecimal> salesOrderNumList) {
        doSetSalesOrderNum_InScope(salesOrderNumList);
    }

    protected void doSetSalesOrderNum_InScope(Collection<java.math.BigDecimal> salesOrderNumList) {
        regINS(CK_INS, cTL(salesOrderNumList), xgetCValueSalesOrderNum(), "SALES_ORDER_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param salesOrderNumList The collection of salesOrderNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNum_NotInScope(Collection<java.math.BigDecimal> salesOrderNumList) {
        doSetSalesOrderNum_NotInScope(salesOrderNumList);
    }

    protected void doSetSalesOrderNum_NotInScope(Collection<java.math.BigDecimal> salesOrderNumList) {
        regINS(CK_NINS, cTL(salesOrderNumList), xgetCValueSalesOrderNum(), "SALES_ORDER_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setSalesOrderNum_IsNull() { regSalesOrderNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setSalesOrderNum_IsNotNull() { regSalesOrderNum(CK_ISNN, DOBJ); }

    protected void regSalesOrderNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderNum(), "SALES_ORDER_NUM"); }
    protected abstract ConditionValue xgetCValueSalesOrderNum();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param unitPrice The value of unitPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_Equal(Long unitPrice) {
        doSetUnitPrice_Equal(unitPrice);
    }

    protected void doSetUnitPrice_Equal(Long unitPrice) {
        regUnitPrice(CK_EQ, unitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param unitPrice The value of unitPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_NotEqual(Long unitPrice) {
        doSetUnitPrice_NotEqual(unitPrice);
    }

    protected void doSetUnitPrice_NotEqual(Long unitPrice) {
        regUnitPrice(CK_NES, unitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param unitPrice The value of unitPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterThan(Long unitPrice) {
        regUnitPrice(CK_GT, unitPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param unitPrice The value of unitPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_LessThan(Long unitPrice) {
        regUnitPrice(CK_LT, unitPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param unitPrice The value of unitPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterEqual(Long unitPrice) {
        regUnitPrice(CK_GE, unitPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param unitPrice The value of unitPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_LessEqual(Long unitPrice) {
        regUnitPrice(CK_LE, unitPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param minNumber The min number of unitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitPrice(), "UNIT_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param unitPriceList The collection of unitPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_InScope(Collection<Long> unitPriceList) {
        doSetUnitPrice_InScope(unitPriceList);
    }

    protected void doSetUnitPrice_InScope(Collection<Long> unitPriceList) {
        regINS(CK_INS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @param unitPriceList The collection of unitPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_NotInScope(Collection<Long> unitPriceList) {
        doSetUnitPrice_NotInScope(unitPriceList);
    }

    protected void doSetUnitPrice_NotInScope(Collection<Long> unitPriceList) {
        regINS(CK_NINS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     */
    public void setUnitPrice_IsNull() { regUnitPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {BIGINT(19)}
     */
    public void setUnitPrice_IsNotNull() { regUnitPrice(CK_ISNN, DOBJ); }

    protected void regUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitPrice(), "UNIT_PRICE"); }
    protected abstract ConditionValue xgetCValueUnitPrice();

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
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_Equal(String dealTypeCd) {
        doSetDealTypeCd_Equal(fRES(dealTypeCd));
    }

    protected void doSetDealTypeCd_Equal(String dealTypeCd) {
        regDealTypeCd(CK_EQ, dealTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_NotEqual(String dealTypeCd) {
        doSetDealTypeCd_NotEqual(fRES(dealTypeCd));
    }

    protected void doSetDealTypeCd_NotEqual(String dealTypeCd) {
        regDealTypeCd(CK_NES, dealTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_GreaterThan(String dealTypeCd) {
        regDealTypeCd(CK_GT, fRES(dealTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_LessThan(String dealTypeCd) {
        regDealTypeCd(CK_LT, fRES(dealTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_GreaterEqual(String dealTypeCd) {
        regDealTypeCd(CK_GE, fRES(dealTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_LessEqual(String dealTypeCd) {
        regDealTypeCd(CK_LE, fRES(dealTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCdList The collection of dealTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_InScope(Collection<String> dealTypeCdList) {
        doSetDealTypeCd_InScope(dealTypeCdList);
    }

    protected void doSetDealTypeCd_InScope(Collection<String> dealTypeCdList) {
        regINS(CK_INS, cTL(dealTypeCdList), xgetCValueDealTypeCd(), "DEAL_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCdList The collection of dealTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_NotInScope(Collection<String> dealTypeCdList) {
        doSetDealTypeCd_NotInScope(dealTypeCdList);
    }

    protected void doSetDealTypeCd_NotInScope(Collection<String> dealTypeCdList) {
        regINS(CK_NINS, cTL(dealTypeCdList), xgetCValueDealTypeCd(), "DEAL_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDealTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dealTypeCd The value of dealTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDealTypeCd_LikeSearch(String dealTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dealTypeCd), xgetCValueDealTypeCd(), "DEAL_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDealTypeCd_NotLikeSearch(String dealTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dealTypeCd), xgetCValueDealTypeCd(), "DEAL_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_PrefixSearch(String dealTypeCd) {
        setDealTypeCd_LikeSearch(dealTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setDealTypeCd_IsNull() { regDealTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setDealTypeCd_IsNullOrEmpty() { regDealTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setDealTypeCd_IsNotNull() { regDealTypeCd(CK_ISNN, DOBJ); }

    protected void regDealTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDealTypeCd(), "DEAL_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDealTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_Equal(String spareStr) {
        doSetSpareStr_Equal(fRES(spareStr));
    }

    protected void doSetSpareStr_Equal(String spareStr) {
        regSpareStr(CK_EQ, spareStr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotEqual(String spareStr) {
        doSetSpareStr_NotEqual(fRES(spareStr));
    }

    protected void doSetSpareStr_NotEqual(String spareStr) {
        regSpareStr(CK_NES, spareStr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterThan(String spareStr) {
        regSpareStr(CK_GT, fRES(spareStr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessThan(String spareStr) {
        regSpareStr(CK_LT, fRES(spareStr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterEqual(String spareStr) {
        regSpareStr(CK_GE, fRES(spareStr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessEqual(String spareStr) {
        regSpareStr(CK_LE, fRES(spareStr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStrList The collection of spareStr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_InScope(Collection<String> spareStrList) {
        doSetSpareStr_InScope(spareStrList);
    }

    protected void doSetSpareStr_InScope(Collection<String> spareStrList) {
        regINS(CK_INS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStrList The collection of spareStr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotInScope(Collection<String> spareStrList) {
        doSetSpareStr_NotInScope(spareStrList);
    }

    protected void doSetSpareStr_NotInScope(Collection<String> spareStrList) {
        regINS(CK_NINS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)} <br>
     * <pre>e.g. setSpareStr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr The value of spareStr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr_LikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr_NotLikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_PrefixSearch(String spareStr) {
        setSpareStr_LikeSearch(spareStr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNull() { regSpareStr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNullOrEmpty() { regSpareStr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNotNull() { regSpareStr(CK_ISNN, DOBJ); }

    protected void regSpareStr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr(), "SPARE_STR"); }
    protected abstract ConditionValue xgetCValueSpareStr();

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
    public HpSLCFunction<TShippingInstBPrintCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TShippingInstBPrintCB.class);
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
    public HpSLCFunction<TShippingInstBPrintCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TShippingInstBPrintCB.class);
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
    public HpSLCFunction<TShippingInstBPrintCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TShippingInstBPrintCB.class);
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
    public HpSLCFunction<TShippingInstBPrintCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TShippingInstBPrintCB.class);
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
    public HpSLCFunction<TShippingInstBPrintCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TShippingInstBPrintCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TShippingInstBPrintCB&gt;() {
     *     public void query(TShippingInstBPrintCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShippingInstBPrintCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TShippingInstBPrintCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBPrintCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TShippingInstBPrintCQ sq);

    protected TShippingInstBPrintCB xcreateScalarConditionCB() {
        TShippingInstBPrintCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TShippingInstBPrintCB xcreateScalarConditionPartitionByCB() {
        TShippingInstBPrintCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TShippingInstBPrintCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBPrintCB cb = new TShippingInstBPrintCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_B_PRINT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TShippingInstBPrintCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TShippingInstBPrintCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TShippingInstBPrintCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBPrintCB cb = new TShippingInstBPrintCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_B_PRINT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TShippingInstBPrintCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TShippingInstBPrintCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBPrintCB cb = new TShippingInstBPrintCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TShippingInstBPrintCQ sq);

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
    protected TShippingInstBPrintCB newMyCB() {
        return new TShippingInstBPrintCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TShippingInstBPrintCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
