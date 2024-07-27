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
 * The abstract condition-query of t_shipping_inst_data_transfer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTShippingInstDataTransferCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTShippingInstDataTransferCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_shipping_inst_data_transfer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstDataTransferId The value of shippingInstDataTransferId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataTransferId_Equal(Long shippingInstDataTransferId) {
        doSetShippingInstDataTransferId_Equal(shippingInstDataTransferId);
    }

    protected void doSetShippingInstDataTransferId_Equal(Long shippingInstDataTransferId) {
        regShippingInstDataTransferId(CK_EQ, shippingInstDataTransferId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstDataTransferId The value of shippingInstDataTransferId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataTransferId_NotEqual(Long shippingInstDataTransferId) {
        doSetShippingInstDataTransferId_NotEqual(shippingInstDataTransferId);
    }

    protected void doSetShippingInstDataTransferId_NotEqual(Long shippingInstDataTransferId) {
        regShippingInstDataTransferId(CK_NES, shippingInstDataTransferId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstDataTransferId The value of shippingInstDataTransferId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataTransferId_GreaterThan(Long shippingInstDataTransferId) {
        regShippingInstDataTransferId(CK_GT, shippingInstDataTransferId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstDataTransferId The value of shippingInstDataTransferId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataTransferId_LessThan(Long shippingInstDataTransferId) {
        regShippingInstDataTransferId(CK_LT, shippingInstDataTransferId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstDataTransferId The value of shippingInstDataTransferId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataTransferId_GreaterEqual(Long shippingInstDataTransferId) {
        regShippingInstDataTransferId(CK_GE, shippingInstDataTransferId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstDataTransferId The value of shippingInstDataTransferId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstDataTransferId_LessEqual(Long shippingInstDataTransferId) {
        regShippingInstDataTransferId(CK_LE, shippingInstDataTransferId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingInstDataTransferId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstDataTransferId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstDataTransferId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstDataTransferId(), "SHIPPING_INST_DATA_TRANSFER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstDataTransferIdList The collection of shippingInstDataTransferId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstDataTransferId_InScope(Collection<Long> shippingInstDataTransferIdList) {
        doSetShippingInstDataTransferId_InScope(shippingInstDataTransferIdList);
    }

    protected void doSetShippingInstDataTransferId_InScope(Collection<Long> shippingInstDataTransferIdList) {
        regINS(CK_INS, cTL(shippingInstDataTransferIdList), xgetCValueShippingInstDataTransferId(), "SHIPPING_INST_DATA_TRANSFER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstDataTransferIdList The collection of shippingInstDataTransferId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstDataTransferId_NotInScope(Collection<Long> shippingInstDataTransferIdList) {
        doSetShippingInstDataTransferId_NotInScope(shippingInstDataTransferIdList);
    }

    protected void doSetShippingInstDataTransferId_NotInScope(Collection<Long> shippingInstDataTransferIdList) {
        regINS(CK_NINS, cTL(shippingInstDataTransferIdList), xgetCValueShippingInstDataTransferId(), "SHIPPING_INST_DATA_TRANSFER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingInstDataTransferId_IsNull() { regShippingInstDataTransferId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingInstDataTransferId_IsNotNull() { regShippingInstDataTransferId(CK_ISNN, DOBJ); }

    protected void regShippingInstDataTransferId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstDataTransferId(), "SHIPPING_INST_DATA_TRANSFER_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstDataTransferId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
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
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
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
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterThan(Long shippingInstBId) {
        regShippingInstBId(CK_GT, shippingInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessThan(Long shippingInstBId) {
        regShippingInstBId(CK_LT, shippingInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterEqual(Long shippingInstBId) {
        regShippingInstBId(CK_GE, shippingInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessEqual(Long shippingInstBId) {
        regShippingInstBId(CK_LE, shippingInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @param minNumber The min number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
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
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     */
    public void setShippingInstBId_IsNull() { regShippingInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     */
    public void setShippingInstBId_IsNotNull() { regShippingInstBId(CK_ISNN, DOBJ); }

    protected void regShippingInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_Equal(String dataTransferOnlyStr01) {
        doSetDataTransferOnlyStr01_Equal(fRES(dataTransferOnlyStr01));
    }

    protected void doSetDataTransferOnlyStr01_Equal(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_EQ, dataTransferOnlyStr01);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_NotEqual(String dataTransferOnlyStr01) {
        doSetDataTransferOnlyStr01_NotEqual(fRES(dataTransferOnlyStr01));
    }

    protected void doSetDataTransferOnlyStr01_NotEqual(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_NES, dataTransferOnlyStr01);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_GreaterThan(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_GT, fRES(dataTransferOnlyStr01));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_LessThan(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_LT, fRES(dataTransferOnlyStr01));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_GreaterEqual(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_GE, fRES(dataTransferOnlyStr01));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_LessEqual(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_LE, fRES(dataTransferOnlyStr01));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01List The collection of dataTransferOnlyStr01 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_InScope(Collection<String> dataTransferOnlyStr01List) {
        doSetDataTransferOnlyStr01_InScope(dataTransferOnlyStr01List);
    }

    protected void doSetDataTransferOnlyStr01_InScope(Collection<String> dataTransferOnlyStr01List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr01List), xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01List The collection of dataTransferOnlyStr01 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_NotInScope(Collection<String> dataTransferOnlyStr01List) {
        doSetDataTransferOnlyStr01_NotInScope(dataTransferOnlyStr01List);
    }

    protected void doSetDataTransferOnlyStr01_NotInScope(Collection<String> dataTransferOnlyStr01List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr01List), xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr01_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr01_LikeSearch(String dataTransferOnlyStr01, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr01), xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr01_NotLikeSearch(String dataTransferOnlyStr01, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr01), xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_PrefixSearch(String dataTransferOnlyStr01) {
        setDataTransferOnlyStr01_LikeSearch(dataTransferOnlyStr01, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr01_IsNull() { regDataTransferOnlyStr01(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr01_IsNullOrEmpty() { regDataTransferOnlyStr01(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr01_IsNotNull() { regDataTransferOnlyStr01(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr01(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr01();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_Equal(String dataTransferOnlyStr02) {
        doSetDataTransferOnlyStr02_Equal(fRES(dataTransferOnlyStr02));
    }

    protected void doSetDataTransferOnlyStr02_Equal(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_EQ, dataTransferOnlyStr02);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_NotEqual(String dataTransferOnlyStr02) {
        doSetDataTransferOnlyStr02_NotEqual(fRES(dataTransferOnlyStr02));
    }

    protected void doSetDataTransferOnlyStr02_NotEqual(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_NES, dataTransferOnlyStr02);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_GreaterThan(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_GT, fRES(dataTransferOnlyStr02));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_LessThan(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_LT, fRES(dataTransferOnlyStr02));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_GreaterEqual(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_GE, fRES(dataTransferOnlyStr02));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_LessEqual(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_LE, fRES(dataTransferOnlyStr02));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02List The collection of dataTransferOnlyStr02 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_InScope(Collection<String> dataTransferOnlyStr02List) {
        doSetDataTransferOnlyStr02_InScope(dataTransferOnlyStr02List);
    }

    protected void doSetDataTransferOnlyStr02_InScope(Collection<String> dataTransferOnlyStr02List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr02List), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02List The collection of dataTransferOnlyStr02 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_NotInScope(Collection<String> dataTransferOnlyStr02List) {
        doSetDataTransferOnlyStr02_NotInScope(dataTransferOnlyStr02List);
    }

    protected void doSetDataTransferOnlyStr02_NotInScope(Collection<String> dataTransferOnlyStr02List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr02List), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)} <br>
     * <pre>e.g. setDataTransferOnlyStr02_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr02_LikeSearch(String dataTransferOnlyStr02, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr02), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr02_NotLikeSearch(String dataTransferOnlyStr02, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr02), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_PrefixSearch(String dataTransferOnlyStr02) {
        setDataTransferOnlyStr02_LikeSearch(dataTransferOnlyStr02, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr02_IsNull() { regDataTransferOnlyStr02(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr02_IsNullOrEmpty() { regDataTransferOnlyStr02(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr02_IsNotNull() { regDataTransferOnlyStr02(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr02(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr02();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_Equal(String dataTransferOnlyStr03) {
        doSetDataTransferOnlyStr03_Equal(fRES(dataTransferOnlyStr03));
    }

    protected void doSetDataTransferOnlyStr03_Equal(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_EQ, dataTransferOnlyStr03);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_NotEqual(String dataTransferOnlyStr03) {
        doSetDataTransferOnlyStr03_NotEqual(fRES(dataTransferOnlyStr03));
    }

    protected void doSetDataTransferOnlyStr03_NotEqual(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_NES, dataTransferOnlyStr03);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_GreaterThan(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_GT, fRES(dataTransferOnlyStr03));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_LessThan(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_LT, fRES(dataTransferOnlyStr03));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_GreaterEqual(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_GE, fRES(dataTransferOnlyStr03));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_LessEqual(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_LE, fRES(dataTransferOnlyStr03));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03List The collection of dataTransferOnlyStr03 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_InScope(Collection<String> dataTransferOnlyStr03List) {
        doSetDataTransferOnlyStr03_InScope(dataTransferOnlyStr03List);
    }

    protected void doSetDataTransferOnlyStr03_InScope(Collection<String> dataTransferOnlyStr03List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr03List), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03List The collection of dataTransferOnlyStr03 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_NotInScope(Collection<String> dataTransferOnlyStr03List) {
        doSetDataTransferOnlyStr03_NotInScope(dataTransferOnlyStr03List);
    }

    protected void doSetDataTransferOnlyStr03_NotInScope(Collection<String> dataTransferOnlyStr03List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr03List), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr03_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr03_LikeSearch(String dataTransferOnlyStr03, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr03), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr03_NotLikeSearch(String dataTransferOnlyStr03, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr03), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_PrefixSearch(String dataTransferOnlyStr03) {
        setDataTransferOnlyStr03_LikeSearch(dataTransferOnlyStr03, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr03_IsNull() { regDataTransferOnlyStr03(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr03_IsNullOrEmpty() { regDataTransferOnlyStr03(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr03_IsNotNull() { regDataTransferOnlyStr03(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr03(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr03();

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
    public HpSLCFunction<TShippingInstDataTransferCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TShippingInstDataTransferCB.class);
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
    public HpSLCFunction<TShippingInstDataTransferCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TShippingInstDataTransferCB.class);
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
    public HpSLCFunction<TShippingInstDataTransferCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TShippingInstDataTransferCB.class);
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
    public HpSLCFunction<TShippingInstDataTransferCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TShippingInstDataTransferCB.class);
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
    public HpSLCFunction<TShippingInstDataTransferCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TShippingInstDataTransferCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TShippingInstDataTransferCB&gt;() {
     *     public void query(TShippingInstDataTransferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShippingInstDataTransferCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TShippingInstDataTransferCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstDataTransferCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TShippingInstDataTransferCQ sq);

    protected TShippingInstDataTransferCB xcreateScalarConditionCB() {
        TShippingInstDataTransferCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TShippingInstDataTransferCB xcreateScalarConditionPartitionByCB() {
        TShippingInstDataTransferCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected TShippingInstDataTransferCB newMyCB() {
        return new TShippingInstDataTransferCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TShippingInstDataTransferCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
