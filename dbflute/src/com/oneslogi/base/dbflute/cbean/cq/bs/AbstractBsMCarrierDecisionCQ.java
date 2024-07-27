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
 * The abstract condition-query of m_carrier_decision.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCarrierDecisionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCarrierDecisionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_carrier_decision";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierDecisionId The value of carrierDecisionId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierDecisionId_Equal(Long carrierDecisionId) {
        doSetCarrierDecisionId_Equal(carrierDecisionId);
    }

    protected void doSetCarrierDecisionId_Equal(Long carrierDecisionId) {
        regCarrierDecisionId(CK_EQ, carrierDecisionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierDecisionId The value of carrierDecisionId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierDecisionId_NotEqual(Long carrierDecisionId) {
        doSetCarrierDecisionId_NotEqual(carrierDecisionId);
    }

    protected void doSetCarrierDecisionId_NotEqual(Long carrierDecisionId) {
        regCarrierDecisionId(CK_NES, carrierDecisionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierDecisionId The value of carrierDecisionId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierDecisionId_GreaterThan(Long carrierDecisionId) {
        regCarrierDecisionId(CK_GT, carrierDecisionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierDecisionId The value of carrierDecisionId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierDecisionId_LessThan(Long carrierDecisionId) {
        regCarrierDecisionId(CK_LT, carrierDecisionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierDecisionId The value of carrierDecisionId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierDecisionId_GreaterEqual(Long carrierDecisionId) {
        regCarrierDecisionId(CK_GE, carrierDecisionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierDecisionId The value of carrierDecisionId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierDecisionId_LessEqual(Long carrierDecisionId) {
        regCarrierDecisionId(CK_LE, carrierDecisionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of carrierDecisionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierDecisionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierDecisionId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierDecisionId(), "CARRIER_DECISION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierDecisionIdList The collection of carrierDecisionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDecisionId_InScope(Collection<Long> carrierDecisionIdList) {
        doSetCarrierDecisionId_InScope(carrierDecisionIdList);
    }

    protected void doSetCarrierDecisionId_InScope(Collection<Long> carrierDecisionIdList) {
        regINS(CK_INS, cTL(carrierDecisionIdList), xgetCValueCarrierDecisionId(), "CARRIER_DECISION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param carrierDecisionIdList The collection of carrierDecisionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierDecisionId_NotInScope(Collection<Long> carrierDecisionIdList) {
        doSetCarrierDecisionId_NotInScope(carrierDecisionIdList);
    }

    protected void doSetCarrierDecisionId_NotInScope(Collection<Long> carrierDecisionIdList) {
        regINS(CK_NINS, cTL(carrierDecisionIdList), xgetCValueCarrierDecisionId(), "CARRIER_DECISION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCarrierDecisionId_IsNull() { regCarrierDecisionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCarrierDecisionId_IsNotNull() { regCarrierDecisionId(CK_ISNN, DOBJ); }

    protected void regCarrierDecisionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierDecisionId(), "CARRIER_DECISION_ID"); }
    protected abstract ConditionValue xgetCValueCarrierDecisionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCd The value of centerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_Equal(String centerCd) {
        doSetCenterCd_Equal(fRES(centerCd));
    }

    protected void doSetCenterCd_Equal(String centerCd) {
        regCenterCd(CK_EQ, centerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCd The value of centerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotEqual(String centerCd) {
        doSetCenterCd_NotEqual(fRES(centerCd));
    }

    protected void doSetCenterCd_NotEqual(String centerCd) {
        regCenterCd(CK_NES, centerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCdList The collection of centerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_InScope(Collection<String> centerCdList) {
        doSetCenterCd_InScope(centerCdList);
    }

    protected void doSetCenterCd_InScope(Collection<String> centerCdList) {
        regINS(CK_INS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCdList The collection of centerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotInScope(Collection<String> centerCdList) {
        doSetCenterCd_NotInScope(centerCdList);
    }

    protected void doSetCenterCd_NotInScope(Collection<String> centerCdList) {
        regINS(CK_NINS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerCd The value of centerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterCd_LikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     */
    public void setCenterCd_IsNull() { regCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     */
    public void setCenterCd_IsNullOrEmpty() { regCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {VARCHAR(30)}
     */
    public void setCenterCd_IsNotNull() { regCenterCd(CK_ISNN, DOBJ); }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCd The value of zipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_Equal(String zipCd) {
        doSetZipCd_Equal(fRES(zipCd));
    }

    protected void doSetZipCd_Equal(String zipCd) {
        regZipCd(CK_EQ, zipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCd The value of zipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotEqual(String zipCd) {
        doSetZipCd_NotEqual(fRES(zipCd));
    }

    protected void doSetZipCd_NotEqual(String zipCd) {
        regZipCd(CK_NES, zipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCd The value of zipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterThan(String zipCd) {
        regZipCd(CK_GT, fRES(zipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCd The value of zipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessThan(String zipCd) {
        regZipCd(CK_LT, fRES(zipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCd The value of zipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterEqual(String zipCd) {
        regZipCd(CK_GE, fRES(zipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCd The value of zipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessEqual(String zipCd) {
        regZipCd(CK_LE, fRES(zipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCdList The collection of zipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_InScope(Collection<String> zipCdList) {
        doSetZipCd_InScope(zipCdList);
    }

    protected void doSetZipCd_InScope(Collection<String> zipCdList) {
        regINS(CK_INS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCdList The collection of zipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotInScope(Collection<String> zipCdList) {
        doSetZipCd_NotInScope(zipCdList);
    }

    protected void doSetZipCd_NotInScope(Collection<String> zipCdList) {
        regINS(CK_NINS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zipCd The value of zipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZipCd_LikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCd The value of zipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZipCd_NotLikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @param zipCd The value of zipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_PrefixSearch(String zipCd) {
        setZipCd_LikeSearch(zipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     */
    public void setZipCd_IsNull() { regZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     */
    public void setZipCd_IsNullOrEmpty() { regZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     */
    public void setZipCd_IsNotNull() { regZipCd(CK_ISNN, DOBJ); }

    protected void regZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZipCd(), "ZIP_CD"); }
    protected abstract ConditionValue xgetCValueZipCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param salesOrgId The value of salesOrgId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_Equal(Long salesOrgId) {
        doSetSalesOrgId_Equal(salesOrgId);
    }

    protected void doSetSalesOrgId_Equal(Long salesOrgId) {
        regSalesOrgId(CK_EQ, salesOrgId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param salesOrgId The value of salesOrgId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_NotEqual(Long salesOrgId) {
        doSetSalesOrgId_NotEqual(salesOrgId);
    }

    protected void doSetSalesOrgId_NotEqual(Long salesOrgId) {
        regSalesOrgId(CK_NES, salesOrgId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param salesOrgId The value of salesOrgId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_GreaterThan(Long salesOrgId) {
        regSalesOrgId(CK_GT, salesOrgId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param salesOrgId The value of salesOrgId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_LessThan(Long salesOrgId) {
        regSalesOrgId(CK_LT, salesOrgId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param salesOrgId The value of salesOrgId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_GreaterEqual(Long salesOrgId) {
        regSalesOrgId(CK_GE, salesOrgId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param salesOrgId The value of salesOrgId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_LessEqual(Long salesOrgId) {
        regSalesOrgId(CK_LE, salesOrgId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param minNumber The min number of salesOrgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of salesOrgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSalesOrgId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesOrgId(), "SALES_ORG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param salesOrgIdList The collection of salesOrgId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgId_InScope(Collection<Long> salesOrgIdList) {
        doSetSalesOrgId_InScope(salesOrgIdList);
    }

    protected void doSetSalesOrgId_InScope(Collection<Long> salesOrgIdList) {
        regINS(CK_INS, cTL(salesOrgIdList), xgetCValueSalesOrgId(), "SALES_ORG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @param salesOrgIdList The collection of salesOrgId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgId_NotInScope(Collection<Long> salesOrgIdList) {
        doSetSalesOrgId_NotInScope(salesOrgIdList);
    }

    protected void doSetSalesOrgId_NotInScope(Collection<Long> salesOrgIdList) {
        regINS(CK_NINS, cTL(salesOrgIdList), xgetCValueSalesOrgId(), "SALES_ORG_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SALES_ORG_ID from m_sales_org where ...)} <br />
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * @param subCBLambda The callback for sub-query of MSalesOrg for 'in-scope'. (NotNull)
     */
    public void inScopeMSalesOrg(SubQuery<MSalesOrgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSalesOrgCB cb = new MSalesOrgCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSalesOrgId_InScopeRelation_MSalesOrg(cb.query());
        registerInScopeRelation(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mSalesOrg", false);
    }
    public abstract String keepSalesOrgId_InScopeRelation_MSalesOrg(MSalesOrgCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SALES_ORG_ID from m_sales_org where ...)} <br />
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * @param subCBLambda The callback for sub-query of MSalesOrg for 'not in-scope'. (NotNull)
     */
    public void notInScopeMSalesOrg(SubQuery<MSalesOrgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSalesOrgCB cb = new MSalesOrgCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSalesOrgId_NotInScopeRelation_MSalesOrg(cb.query());
        registerInScopeRelation(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mSalesOrg", true);
    }
    public abstract String keepSalesOrgId_NotInScopeRelation_MSalesOrg(MSalesOrgCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     */
    public void setSalesOrgId_IsNull() { regSalesOrgId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     */
    public void setSalesOrgId_IsNotNull() { regSalesOrgId(CK_ISNN, DOBJ); }

    protected void regSalesOrgId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgId(), "SALES_ORG_ID"); }
    protected abstract ConditionValue xgetCValueSalesOrgId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
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
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
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
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterThan(String salesOrgCd) {
        regSalesOrgCd(CK_GT, fRES(salesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessThan(String salesOrgCd) {
        regSalesOrgCd(CK_LT, fRES(salesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterEqual(String salesOrgCd) {
        regSalesOrgCd(CK_GE, fRES(salesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessEqual(String salesOrgCd) {
        regSalesOrgCd(CK_LE, fRES(salesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
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
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
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
     * SALES_ORG_CD: {IX+, VARCHAR(30)} <br>
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
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrgCd_NotLikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_PrefixSearch(String salesOrgCd) {
        setSalesOrgCd_LikeSearch(salesOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNull() { regSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNullOrEmpty() { regSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNotNull() { regSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgCd(), "SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrgCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param customerId The value of customerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_Equal(Long customerId) {
        doSetCustomerId_Equal(customerId);
    }

    protected void doSetCustomerId_Equal(Long customerId) {
        regCustomerId(CK_EQ, customerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param customerId The value of customerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_NotEqual(Long customerId) {
        doSetCustomerId_NotEqual(customerId);
    }

    protected void doSetCustomerId_NotEqual(Long customerId) {
        regCustomerId(CK_NES, customerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param customerId The value of customerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterThan(Long customerId) {
        regCustomerId(CK_GT, customerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param customerId The value of customerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessThan(Long customerId) {
        regCustomerId(CK_LT, customerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param customerId The value of customerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterEqual(Long customerId) {
        regCustomerId(CK_GE, customerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param customerId The value of customerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessEqual(Long customerId) {
        regCustomerId(CK_LE, customerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomerId(), "CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param customerIdList The collection of customerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_InScope(Collection<Long> customerIdList) {
        doSetCustomerId_InScope(customerIdList);
    }

    protected void doSetCustomerId_InScope(Collection<Long> customerIdList) {
        regINS(CK_INS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param customerIdList The collection of customerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_NotInScope(Collection<Long> customerIdList) {
        doSetCustomerId_NotInScope(customerIdList);
    }

    protected void doSetCustomerId_NotInScope(Collection<Long> customerIdList) {
        regINS(CK_NINS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCustomerId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCustomerId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setCustomerId_IsNull() { regCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setCustomerId_IsNotNull() { regCustomerId(CK_ISNN, DOBJ); }

    protected void regCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerId(), "CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueCustomerId();

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
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCd The value of directKohaiTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_Equal(String directKohaiTypeCd) {
        doSetDirectKohaiTypeCd_Equal(fRES(directKohaiTypeCd));
    }

    protected void doSetDirectKohaiTypeCd_Equal(String directKohaiTypeCd) {
        regDirectKohaiTypeCd(CK_EQ, directKohaiTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCd The value of directKohaiTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_NotEqual(String directKohaiTypeCd) {
        doSetDirectKohaiTypeCd_NotEqual(fRES(directKohaiTypeCd));
    }

    protected void doSetDirectKohaiTypeCd_NotEqual(String directKohaiTypeCd) {
        regDirectKohaiTypeCd(CK_NES, directKohaiTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCd The value of directKohaiTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_GreaterThan(String directKohaiTypeCd) {
        regDirectKohaiTypeCd(CK_GT, fRES(directKohaiTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCd The value of directKohaiTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_LessThan(String directKohaiTypeCd) {
        regDirectKohaiTypeCd(CK_LT, fRES(directKohaiTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCd The value of directKohaiTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_GreaterEqual(String directKohaiTypeCd) {
        regDirectKohaiTypeCd(CK_GE, fRES(directKohaiTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCd The value of directKohaiTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_LessEqual(String directKohaiTypeCd) {
        regDirectKohaiTypeCd(CK_LE, fRES(directKohaiTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCdList The collection of directKohaiTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_InScope(Collection<String> directKohaiTypeCdList) {
        doSetDirectKohaiTypeCd_InScope(directKohaiTypeCdList);
    }

    protected void doSetDirectKohaiTypeCd_InScope(Collection<String> directKohaiTypeCdList) {
        regINS(CK_INS, cTL(directKohaiTypeCdList), xgetCValueDirectKohaiTypeCd(), "DIRECT_KOHAI_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCdList The collection of directKohaiTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_NotInScope(Collection<String> directKohaiTypeCdList) {
        doSetDirectKohaiTypeCd_NotInScope(directKohaiTypeCdList);
    }

    protected void doSetDirectKohaiTypeCd_NotInScope(Collection<String> directKohaiTypeCdList) {
        regINS(CK_NINS, cTL(directKohaiTypeCdList), xgetCValueDirectKohaiTypeCd(), "DIRECT_KOHAI_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)} <br>
     * <pre>e.g. setDirectKohaiTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directKohaiTypeCd The value of directKohaiTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectKohaiTypeCd_LikeSearch(String directKohaiTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directKohaiTypeCd), xgetCValueDirectKohaiTypeCd(), "DIRECT_KOHAI_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCd The value of directKohaiTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectKohaiTypeCd_NotLikeSearch(String directKohaiTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directKohaiTypeCd), xgetCValueDirectKohaiTypeCd(), "DIRECT_KOHAI_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @param directKohaiTypeCd The value of directKohaiTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectKohaiTypeCd_PrefixSearch(String directKohaiTypeCd) {
        setDirectKohaiTypeCd_LikeSearch(directKohaiTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     */
    public void setDirectKohaiTypeCd_IsNull() { regDirectKohaiTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     */
    public void setDirectKohaiTypeCd_IsNullOrEmpty() { regDirectKohaiTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     */
    public void setDirectKohaiTypeCd_IsNotNull() { regDirectKohaiTypeCd(CK_ISNN, DOBJ); }

    protected void regDirectKohaiTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectKohaiTypeCd(), "DIRECT_KOHAI_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDirectKohaiTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefecture The value of prefecture as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_Equal(String prefecture) {
        doSetPrefecture_Equal(fRES(prefecture));
    }

    protected void doSetPrefecture_Equal(String prefecture) {
        regPrefecture(CK_EQ, prefecture);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefecture The value of prefecture as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_NotEqual(String prefecture) {
        doSetPrefecture_NotEqual(fRES(prefecture));
    }

    protected void doSetPrefecture_NotEqual(String prefecture) {
        regPrefecture(CK_NES, prefecture);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefecture The value of prefecture as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_GreaterThan(String prefecture) {
        regPrefecture(CK_GT, fRES(prefecture));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefecture The value of prefecture as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_LessThan(String prefecture) {
        regPrefecture(CK_LT, fRES(prefecture));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefecture The value of prefecture as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_GreaterEqual(String prefecture) {
        regPrefecture(CK_GE, fRES(prefecture));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefecture The value of prefecture as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_LessEqual(String prefecture) {
        regPrefecture(CK_LE, fRES(prefecture));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefectureList The collection of prefecture as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_InScope(Collection<String> prefectureList) {
        doSetPrefecture_InScope(prefectureList);
    }

    protected void doSetPrefecture_InScope(Collection<String> prefectureList) {
        regINS(CK_INS, cTL(prefectureList), xgetCValuePrefecture(), "PREFECTURE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefectureList The collection of prefecture as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_NotInScope(Collection<String> prefectureList) {
        doSetPrefecture_NotInScope(prefectureList);
    }

    protected void doSetPrefecture_NotInScope(Collection<String> prefectureList) {
        regINS(CK_NINS, cTL(prefectureList), xgetCValuePrefecture(), "PREFECTURE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PREFECTURE: {VARCHAR(60)} <br>
     * <pre>e.g. setPrefecture_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prefecture The value of prefecture as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrefecture_LikeSearch(String prefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prefecture), xgetCValuePrefecture(), "PREFECTURE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefecture The value of prefecture as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrefecture_NotLikeSearch(String prefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prefecture), xgetCValuePrefecture(), "PREFECTURE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @param prefecture The value of prefecture as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_PrefixSearch(String prefecture) {
        setPrefecture_LikeSearch(prefecture, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     */
    public void setPrefecture_IsNull() { regPrefecture(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     */
    public void setPrefecture_IsNullOrEmpty() { regPrefecture(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PREFECTURE: {VARCHAR(60)}
     */
    public void setPrefecture_IsNotNull() { regPrefecture(CK_ISNN, DOBJ); }

    protected void regPrefecture(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrefecture(), "PREFECTURE"); }
    protected abstract ConditionValue xgetCValuePrefecture();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
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
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
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
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId The value of carrierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterThan(Long carrierId) {
        regCarrierId(CK_GT, carrierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId The value of carrierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessThan(Long carrierId) {
        regCarrierId(CK_LT, carrierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId The value of carrierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterEqual(Long carrierId) {
        regCarrierId(CK_GE, carrierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId The value of carrierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessEqual(Long carrierId) {
        regCarrierId(CK_LE, carrierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @param minNumber The min number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierId(), "CARRIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
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
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierIdList The collection of carrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_NotInScope(Collection<Long> carrierIdList) {
        doSetCarrierId_NotInScope(carrierIdList);
    }

    protected void doSetCarrierId_NotInScope(Collection<Long> carrierIdList) {
        regINS(CK_NINS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_ID from m_carrier where ...)} <br />
     * m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'.
     * @param subCBLambda The callback for sub-query of MCarrierByCarrierId for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrierByCarrierId(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId_InScopeRelation_MCarrierByCarrierId(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrierByCarrierId", false);
    }
    public abstract String keepCarrierId_InScopeRelation_MCarrierByCarrierId(MCarrierCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_ID from m_carrier where ...)} <br />
     * m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'.
     * @param subCBLambda The callback for sub-query of MCarrierByCarrierId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrierByCarrierId(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId_NotInScopeRelation_MCarrierByCarrierId(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrierByCarrierId", true);
    }
    public abstract String keepCarrierId_NotInScopeRelation_MCarrierByCarrierId(MCarrierCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     */
    public void setCarrierId_IsNull() { regCarrierId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId1 The value of carrierId1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId1_Equal(Long carrierId1) {
        doSetCarrierId1_Equal(carrierId1);
    }

    protected void doSetCarrierId1_Equal(Long carrierId1) {
        regCarrierId1(CK_EQ, carrierId1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId1 The value of carrierId1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId1_NotEqual(Long carrierId1) {
        doSetCarrierId1_NotEqual(carrierId1);
    }

    protected void doSetCarrierId1_NotEqual(Long carrierId1) {
        regCarrierId1(CK_NES, carrierId1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId1 The value of carrierId1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId1_GreaterThan(Long carrierId1) {
        regCarrierId1(CK_GT, carrierId1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId1 The value of carrierId1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId1_LessThan(Long carrierId1) {
        regCarrierId1(CK_LT, carrierId1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId1 The value of carrierId1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId1_GreaterEqual(Long carrierId1) {
        regCarrierId1(CK_GE, carrierId1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId1 The value of carrierId1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId1_LessEqual(Long carrierId1) {
        regCarrierId1(CK_LE, carrierId1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param minNumber The min number of carrierId1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierId1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierId1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierId1(), "CARRIER_ID1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId1List The collection of carrierId1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId1_InScope(Collection<Long> carrierId1List) {
        doSetCarrierId1_InScope(carrierId1List);
    }

    protected void doSetCarrierId1_InScope(Collection<Long> carrierId1List) {
        regINS(CK_INS, cTL(carrierId1List), xgetCValueCarrierId1(), "CARRIER_ID1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId1List The collection of carrierId1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId1_NotInScope(Collection<Long> carrierId1List) {
        doSetCarrierId1_NotInScope(carrierId1List);
    }

    protected void doSetCarrierId1_NotInScope(Collection<Long> carrierId1List) {
        regINS(CK_NINS, cTL(carrierId1List), xgetCValueCarrierId1(), "CARRIER_ID1");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_ID1 from m_carrier where ...)} <br />
     * m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'.
     * @param subCBLambda The callback for sub-query of MCarrierByCarrierId1 for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrierByCarrierId1(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId1_InScopeRelation_MCarrierByCarrierId1(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID1", "CARRIER_ID", pp, "mCarrierByCarrierId1", false);
    }
    public abstract String keepCarrierId1_InScopeRelation_MCarrierByCarrierId1(MCarrierCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_ID1 from m_carrier where ...)} <br />
     * m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'.
     * @param subCBLambda The callback for sub-query of MCarrierByCarrierId1 for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrierByCarrierId1(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId1_NotInScopeRelation_MCarrierByCarrierId1(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID1", "CARRIER_ID", pp, "mCarrierByCarrierId1", true);
    }
    public abstract String keepCarrierId1_NotInScopeRelation_MCarrierByCarrierId1(MCarrierCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     */
    public void setCarrierId1_IsNull() { regCarrierId1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     */
    public void setCarrierId1_IsNotNull() { regCarrierId1(CK_ISNN, DOBJ); }

    protected void regCarrierId1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierId1(), "CARRIER_ID1"); }
    protected abstract ConditionValue xgetCValueCarrierId1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1 The value of carrierCd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_Equal(String carrierCd1) {
        doSetCarrierCd1_Equal(fRES(carrierCd1));
    }

    protected void doSetCarrierCd1_Equal(String carrierCd1) {
        regCarrierCd1(CK_EQ, carrierCd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1 The value of carrierCd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_NotEqual(String carrierCd1) {
        doSetCarrierCd1_NotEqual(fRES(carrierCd1));
    }

    protected void doSetCarrierCd1_NotEqual(String carrierCd1) {
        regCarrierCd1(CK_NES, carrierCd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1 The value of carrierCd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_GreaterThan(String carrierCd1) {
        regCarrierCd1(CK_GT, fRES(carrierCd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1 The value of carrierCd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_LessThan(String carrierCd1) {
        regCarrierCd1(CK_LT, fRES(carrierCd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1 The value of carrierCd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_GreaterEqual(String carrierCd1) {
        regCarrierCd1(CK_GE, fRES(carrierCd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1 The value of carrierCd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_LessEqual(String carrierCd1) {
        regCarrierCd1(CK_LE, fRES(carrierCd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1List The collection of carrierCd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_InScope(Collection<String> carrierCd1List) {
        doSetCarrierCd1_InScope(carrierCd1List);
    }

    protected void doSetCarrierCd1_InScope(Collection<String> carrierCd1List) {
        regINS(CK_INS, cTL(carrierCd1List), xgetCValueCarrierCd1(), "CARRIER_CD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1List The collection of carrierCd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_NotInScope(Collection<String> carrierCd1List) {
        doSetCarrierCd1_NotInScope(carrierCd1List);
    }

    protected void doSetCarrierCd1_NotInScope(Collection<String> carrierCd1List) {
        regINS(CK_NINS, cTL(carrierCd1List), xgetCValueCarrierCd1(), "CARRIER_CD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierCd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierCd1 The value of carrierCd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierCd1_LikeSearch(String carrierCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierCd1), xgetCValueCarrierCd1(), "CARRIER_CD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1 The value of carrierCd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd1_NotLikeSearch(String carrierCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd1), xgetCValueCarrierCd1(), "CARRIER_CD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @param carrierCd1 The value of carrierCd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd1_PrefixSearch(String carrierCd1) {
        setCarrierCd1_LikeSearch(carrierCd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     */
    public void setCarrierCd1_IsNull() { regCarrierCd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     */
    public void setCarrierCd1_IsNullOrEmpty() { regCarrierCd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     */
    public void setCarrierCd1_IsNotNull() { regCarrierCd1(CK_ISNN, DOBJ); }

    protected void regCarrierCd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd1(), "CARRIER_CD1"); }
    protected abstract ConditionValue xgetCValueCarrierCd1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId2 The value of carrierId2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId2_Equal(Long carrierId2) {
        doSetCarrierId2_Equal(carrierId2);
    }

    protected void doSetCarrierId2_Equal(Long carrierId2) {
        regCarrierId2(CK_EQ, carrierId2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId2 The value of carrierId2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId2_NotEqual(Long carrierId2) {
        doSetCarrierId2_NotEqual(carrierId2);
    }

    protected void doSetCarrierId2_NotEqual(Long carrierId2) {
        regCarrierId2(CK_NES, carrierId2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId2 The value of carrierId2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId2_GreaterThan(Long carrierId2) {
        regCarrierId2(CK_GT, carrierId2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId2 The value of carrierId2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId2_LessThan(Long carrierId2) {
        regCarrierId2(CK_LT, carrierId2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId2 The value of carrierId2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId2_GreaterEqual(Long carrierId2) {
        regCarrierId2(CK_GE, carrierId2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId2 The value of carrierId2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId2_LessEqual(Long carrierId2) {
        regCarrierId2(CK_LE, carrierId2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param minNumber The min number of carrierId2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierId2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierId2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierId2(), "CARRIER_ID2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId2List The collection of carrierId2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId2_InScope(Collection<Long> carrierId2List) {
        doSetCarrierId2_InScope(carrierId2List);
    }

    protected void doSetCarrierId2_InScope(Collection<Long> carrierId2List) {
        regINS(CK_INS, cTL(carrierId2List), xgetCValueCarrierId2(), "CARRIER_ID2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId2List The collection of carrierId2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId2_NotInScope(Collection<Long> carrierId2List) {
        doSetCarrierId2_NotInScope(carrierId2List);
    }

    protected void doSetCarrierId2_NotInScope(Collection<Long> carrierId2List) {
        regINS(CK_NINS, cTL(carrierId2List), xgetCValueCarrierId2(), "CARRIER_ID2");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_ID2 from m_carrier where ...)} <br />
     * m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'.
     * @param subCBLambda The callback for sub-query of MCarrierByCarrierId2 for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrierByCarrierId2(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId2_InScopeRelation_MCarrierByCarrierId2(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID2", "CARRIER_ID", pp, "mCarrierByCarrierId2", false);
    }
    public abstract String keepCarrierId2_InScopeRelation_MCarrierByCarrierId2(MCarrierCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_ID2 from m_carrier where ...)} <br />
     * m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'.
     * @param subCBLambda The callback for sub-query of MCarrierByCarrierId2 for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrierByCarrierId2(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId2_NotInScopeRelation_MCarrierByCarrierId2(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID2", "CARRIER_ID", pp, "mCarrierByCarrierId2", true);
    }
    public abstract String keepCarrierId2_NotInScopeRelation_MCarrierByCarrierId2(MCarrierCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     */
    public void setCarrierId2_IsNull() { regCarrierId2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     */
    public void setCarrierId2_IsNotNull() { regCarrierId2(CK_ISNN, DOBJ); }

    protected void regCarrierId2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierId2(), "CARRIER_ID2"); }
    protected abstract ConditionValue xgetCValueCarrierId2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2 The value of carrierCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_Equal(String carrierCd2) {
        doSetCarrierCd2_Equal(fRES(carrierCd2));
    }

    protected void doSetCarrierCd2_Equal(String carrierCd2) {
        regCarrierCd2(CK_EQ, carrierCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2 The value of carrierCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_NotEqual(String carrierCd2) {
        doSetCarrierCd2_NotEqual(fRES(carrierCd2));
    }

    protected void doSetCarrierCd2_NotEqual(String carrierCd2) {
        regCarrierCd2(CK_NES, carrierCd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2 The value of carrierCd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_GreaterThan(String carrierCd2) {
        regCarrierCd2(CK_GT, fRES(carrierCd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2 The value of carrierCd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_LessThan(String carrierCd2) {
        regCarrierCd2(CK_LT, fRES(carrierCd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2 The value of carrierCd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_GreaterEqual(String carrierCd2) {
        regCarrierCd2(CK_GE, fRES(carrierCd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2 The value of carrierCd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_LessEqual(String carrierCd2) {
        regCarrierCd2(CK_LE, fRES(carrierCd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2List The collection of carrierCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_InScope(Collection<String> carrierCd2List) {
        doSetCarrierCd2_InScope(carrierCd2List);
    }

    protected void doSetCarrierCd2_InScope(Collection<String> carrierCd2List) {
        regINS(CK_INS, cTL(carrierCd2List), xgetCValueCarrierCd2(), "CARRIER_CD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2List The collection of carrierCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_NotInScope(Collection<String> carrierCd2List) {
        doSetCarrierCd2_NotInScope(carrierCd2List);
    }

    protected void doSetCarrierCd2_NotInScope(Collection<String> carrierCd2List) {
        regINS(CK_NINS, cTL(carrierCd2List), xgetCValueCarrierCd2(), "CARRIER_CD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierCd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierCd2 The value of carrierCd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierCd2_LikeSearch(String carrierCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierCd2), xgetCValueCarrierCd2(), "CARRIER_CD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2 The value of carrierCd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd2_NotLikeSearch(String carrierCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd2), xgetCValueCarrierCd2(), "CARRIER_CD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @param carrierCd2 The value of carrierCd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd2_PrefixSearch(String carrierCd2) {
        setCarrierCd2_LikeSearch(carrierCd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     */
    public void setCarrierCd2_IsNull() { regCarrierCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     */
    public void setCarrierCd2_IsNullOrEmpty() { regCarrierCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     */
    public void setCarrierCd2_IsNotNull() { regCarrierCd2(CK_ISNN, DOBJ); }

    protected void regCarrierCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd2(), "CARRIER_CD2"); }
    protected abstract ConditionValue xgetCValueCarrierCd2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId3 The value of carrierId3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId3_Equal(Long carrierId3) {
        doSetCarrierId3_Equal(carrierId3);
    }

    protected void doSetCarrierId3_Equal(Long carrierId3) {
        regCarrierId3(CK_EQ, carrierId3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId3 The value of carrierId3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId3_NotEqual(Long carrierId3) {
        doSetCarrierId3_NotEqual(carrierId3);
    }

    protected void doSetCarrierId3_NotEqual(Long carrierId3) {
        regCarrierId3(CK_NES, carrierId3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId3 The value of carrierId3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId3_GreaterThan(Long carrierId3) {
        regCarrierId3(CK_GT, carrierId3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId3 The value of carrierId3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId3_LessThan(Long carrierId3) {
        regCarrierId3(CK_LT, carrierId3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId3 The value of carrierId3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId3_GreaterEqual(Long carrierId3) {
        regCarrierId3(CK_GE, carrierId3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId3 The value of carrierId3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId3_LessEqual(Long carrierId3) {
        regCarrierId3(CK_LE, carrierId3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param minNumber The min number of carrierId3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierId3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierId3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierId3(), "CARRIER_ID3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId3List The collection of carrierId3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId3_InScope(Collection<Long> carrierId3List) {
        doSetCarrierId3_InScope(carrierId3List);
    }

    protected void doSetCarrierId3_InScope(Collection<Long> carrierId3List) {
        regINS(CK_INS, cTL(carrierId3List), xgetCValueCarrierId3(), "CARRIER_ID3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @param carrierId3List The collection of carrierId3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId3_NotInScope(Collection<Long> carrierId3List) {
        doSetCarrierId3_NotInScope(carrierId3List);
    }

    protected void doSetCarrierId3_NotInScope(Collection<Long> carrierId3List) {
        regINS(CK_NINS, cTL(carrierId3List), xgetCValueCarrierId3(), "CARRIER_ID3");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_ID3 from m_carrier where ...)} <br />
     * m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'.
     * @param subCBLambda The callback for sub-query of MCarrierByCarrierId3 for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrierByCarrierId3(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId3_InScopeRelation_MCarrierByCarrierId3(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID3", "CARRIER_ID", pp, "mCarrierByCarrierId3", false);
    }
    public abstract String keepCarrierId3_InScopeRelation_MCarrierByCarrierId3(MCarrierCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_ID3 from m_carrier where ...)} <br />
     * m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'.
     * @param subCBLambda The callback for sub-query of MCarrierByCarrierId3 for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrierByCarrierId3(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId3_NotInScopeRelation_MCarrierByCarrierId3(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID3", "CARRIER_ID", pp, "mCarrierByCarrierId3", true);
    }
    public abstract String keepCarrierId3_NotInScopeRelation_MCarrierByCarrierId3(MCarrierCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     */
    public void setCarrierId3_IsNull() { regCarrierId3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     */
    public void setCarrierId3_IsNotNull() { regCarrierId3(CK_ISNN, DOBJ); }

    protected void regCarrierId3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierId3(), "CARRIER_ID3"); }
    protected abstract ConditionValue xgetCValueCarrierId3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3 The value of carrierCd3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_Equal(String carrierCd3) {
        doSetCarrierCd3_Equal(fRES(carrierCd3));
    }

    protected void doSetCarrierCd3_Equal(String carrierCd3) {
        regCarrierCd3(CK_EQ, carrierCd3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3 The value of carrierCd3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_NotEqual(String carrierCd3) {
        doSetCarrierCd3_NotEqual(fRES(carrierCd3));
    }

    protected void doSetCarrierCd3_NotEqual(String carrierCd3) {
        regCarrierCd3(CK_NES, carrierCd3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3 The value of carrierCd3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_GreaterThan(String carrierCd3) {
        regCarrierCd3(CK_GT, fRES(carrierCd3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3 The value of carrierCd3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_LessThan(String carrierCd3) {
        regCarrierCd3(CK_LT, fRES(carrierCd3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3 The value of carrierCd3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_GreaterEqual(String carrierCd3) {
        regCarrierCd3(CK_GE, fRES(carrierCd3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3 The value of carrierCd3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_LessEqual(String carrierCd3) {
        regCarrierCd3(CK_LE, fRES(carrierCd3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3List The collection of carrierCd3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_InScope(Collection<String> carrierCd3List) {
        doSetCarrierCd3_InScope(carrierCd3List);
    }

    protected void doSetCarrierCd3_InScope(Collection<String> carrierCd3List) {
        regINS(CK_INS, cTL(carrierCd3List), xgetCValueCarrierCd3(), "CARRIER_CD3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3List The collection of carrierCd3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_NotInScope(Collection<String> carrierCd3List) {
        doSetCarrierCd3_NotInScope(carrierCd3List);
    }

    protected void doSetCarrierCd3_NotInScope(Collection<String> carrierCd3List) {
        regINS(CK_NINS, cTL(carrierCd3List), xgetCValueCarrierCd3(), "CARRIER_CD3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierCd3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierCd3 The value of carrierCd3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierCd3_LikeSearch(String carrierCd3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierCd3), xgetCValueCarrierCd3(), "CARRIER_CD3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3 The value of carrierCd3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd3_NotLikeSearch(String carrierCd3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd3), xgetCValueCarrierCd3(), "CARRIER_CD3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @param carrierCd3 The value of carrierCd3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd3_PrefixSearch(String carrierCd3) {
        setCarrierCd3_LikeSearch(carrierCd3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     */
    public void setCarrierCd3_IsNull() { regCarrierCd3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     */
    public void setCarrierCd3_IsNullOrEmpty() { regCarrierCd3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     */
    public void setCarrierCd3_IsNotNull() { regCarrierCd3(CK_ISNN, DOBJ); }

    protected void regCarrierCd3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd3(), "CARRIER_CD3"); }
    protected abstract ConditionValue xgetCValueCarrierCd3();

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
    public HpSLCFunction<MCarrierDecisionCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCarrierDecisionCB.class);
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
    public HpSLCFunction<MCarrierDecisionCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCarrierDecisionCB.class);
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
    public HpSLCFunction<MCarrierDecisionCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCarrierDecisionCB.class);
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
    public HpSLCFunction<MCarrierDecisionCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCarrierDecisionCB.class);
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
    public HpSLCFunction<MCarrierDecisionCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCarrierDecisionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCarrierDecisionCB&gt;() {
     *     public void query(MCarrierDecisionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCarrierDecisionCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCarrierDecisionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCarrierDecisionCQ sq);

    protected MCarrierDecisionCB xcreateScalarConditionCB() {
        MCarrierDecisionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCarrierDecisionCB xcreateScalarConditionPartitionByCB() {
        MCarrierDecisionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCarrierDecisionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CARRIER_DECISION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCarrierDecisionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCarrierDecisionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCarrierDecisionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CARRIER_DECISION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCarrierDecisionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCarrierDecisionCQ sq);

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
    protected MCarrierDecisionCB newMyCB() {
        return new MCarrierDecisionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCarrierDecisionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
